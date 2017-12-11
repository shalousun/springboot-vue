/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50542
Source Host           : 127.0.0.1:3306
Source Database       : project_boot

Target Server Type    : MYSQL
Target Server Version : 50542
File Encoding         : 65001

Date: 2017-12-11 20:02:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `staff_id` int(11) DEFAULT NULL COMMENT '职工id：',
  `real_name` varchar(50) NOT NULL COMMENT '真实姓名',
  `org_id` int(11) NOT NULL COMMENT '所属机构id',
  `department_code` int(11) unsigned NOT NULL COMMENT '部门编号',
  `name` varchar(30) NOT NULL COMMENT '用户名(登录名)',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `problem` varchar(255) DEFAULT NULL COMMENT '密码找回问题',
  `answer` varchar(255) DEFAULT NULL COMMENT '密码找回问题的答案',
  `insert_operator` varchar(30) NOT NULL COMMENT '新增人',
  `insert_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '新增时间',
  `last_modify_operator` varchar(30) NOT NULL COMMENT '最后更新者',
  `last_modify_datetime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '最后变更时间',
  `del_flag` smallint(6) NOT NULL DEFAULT '0' COMMENT '删除标识：0:正常数据，1:逻辑删除数据',
  `memo` varchar(255) DEFAULT NULL COMMENT '备注',
  `post` varchar(10) DEFAULT NULL COMMENT '??λ: 1-?쵼???? 2-???ż???3-?û???',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
