/*
Navicat MySQL Data Transfer

Source Server         : mysql5.5
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : zebraart

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2019-01-07 22:01:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `zebraart_course`
-- ----------------------------
DROP TABLE IF EXISTS `zebraart_course`;
CREATE TABLE `zebraart_course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(255) DEFAULT NULL,
  `number` int(11) DEFAULT NULL COMMENT '课时数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `zebraart_user`;
CREATE TABLE `zebraart_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `child_name` varchar(255) DEFAULT NULL,
  `parent_name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- DROP TABLE IF EXISTS company_accounts;
-- CREATE TABLE `company_accounts` (
-- 	`account_id`  bigint(20) NOT NULL COMMENT '帐户ID',
-- 	`company_id`  varchar(20) NOT NULL COMMENT '公司编号',
-- 	`account_type`  varchar(10) NOT NULL COMMENT '帐户类别(PRIVATE: 私账, PUBLIC: 公账)',
-- 	`bank_name`  varchar(100) NOT NULL DEFAULT '' COMMENT '银行名称',
-- 	`bank_account`  varchar(50) NOT NULL DEFAULT '' COMMENT '银行帐号',
-- 	`cmb_open_id`  varchar(50) NOT NULL DEFAULT '' COMMENT '招行申请的open_id',
-- 	`cmb_open_key`  varchar(100) NOT NULL DEFAULT '' COMMENT '招行申请的open_key',
--   `cmb_shop_pass`  varchar(20) NOT NULL DEFAULT ''COMMENT '招行申请的管理密码，退款操作时必需',
-- 	`disabled`  bit(1) NOT NULL DEFAULT '0' COMMENT '禁用状态(0：不禁用，1：禁用)',
-- 	`default_status` bit(1) NOT NULL DEFAULT '0' COMMENT '是否为默认账户(0：不是，1：是)',
-- 	`created_at`  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
-- 	`created_by`  varchar(20) NOT NULL DEFAULT '' COMMENT '创建人',
-- 	`updated_at`  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
-- 	`updated_by`  varchar(20) NOT NULL DEFAULT '' COMMENT '修改人',
-- 	CONSTRAINT `pk_company_accounts_id` PRIMARY KEY (`account_id`),
-- 	UNIQUE INDEX `uk_company_accounts_type` (`company_id`, `account_type`) USING BTREE
-- )ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zebraart_course
-- ----------------------------
INSERT INTO `zebraart_course` VALUES ('1', 'java', '18');
INSERT INTO `zebraart_course` VALUES ('2', 'c++', '9');

-- ----------------------------
-- Table structure for `zebraart_user`
-- ----------------------------


-- ----------------------------
-- Records of zebraart_user
-- ----------------------------
INSERT INTO `zebraart_user` VALUES ('1', '小白', '大白', '18880000');
INSERT INTO `zebraart_user` VALUES ('2', '小王', '老王', '999911113');
INSERT INTO `zebraart_user` VALUES ('3', 'aa', 'vv', '3331');
INSERT INTO `zebraart_user` VALUES ('4', 'csjh', 'k2`', '20991');
INSERT INTO `zebraart_user` VALUES ('5', 'c', 'kk', 'x');
INSERT INTO `zebraart_user` VALUES ('6', '81', 'xs', 'mm1');
INSERT INTO `zebraart_user` VALUES ('7', 'man', '1kd', 'l10p');
INSERT INTO `zebraart_user` VALUES ('8', 'csma1-', '-=a', 'ss');
INSERT INTO `zebraart_user` VALUES ('9', 'lsk91', 'dk0', '1;');
INSERT INTO `zebraart_user` VALUES ('10', 'test', 'test', '99');
INSERT INTO `zebraart_user` VALUES ('11', 'test12', 'tsdsa', 'mmlsc');

-- ----------------------------
-- Table structure for `zebraart_user_course`
-- ----------------------------
DROP TABLE IF EXISTS `zebraart_user_course`;
CREATE TABLE `zebraart_user_course` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `number` int(11) DEFAULT NULL COMMENT '剩余课时',
  `delete_flag` int(11) DEFAULT '1' COMMENT '标识，0表示删除,默认是1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zebraart_user_course
-- ----------------------------
INSERT INTO `zebraart_user_course` VALUES ('1', '1', '1', '5', '1');
INSERT INTO `zebraart_user_course` VALUES ('2', '1', '2', '9', '1');
