package com.boco.demo;

import com.boco.demo.filter.RewriteFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

/**
 * Created by ApplicationPower.
 * @author yu on 2017-11-22 19:47:23.
 */
@SpringBootApplication
@MapperScan("com.boco.demo.dao")
public class SpringBootMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootMainApplication.class, args);
    }

    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return (container -> {
                ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/errors/401.html");
                ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/errors/404.html");
                ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/errors/500.html");
                container.addErrorPages(error401Page, error404Page, error500Page);
        });
    }
    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new RewriteFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter(RewriteFilter.REWRITE_TO,"/index.html");
        registration.addInitParameter(RewriteFilter.REWRITE_PATTERNS, "/ui/*");
        registration.setName("testFilter");
        registration.setOrder(1);
        return registration;
    }
}
