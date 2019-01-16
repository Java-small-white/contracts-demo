
DROP TABLE IF EXISTS company_accounts;
CREATE TABLE `company_accounts` (
	`account_id`  bigint(20) NOT NULL COMMENT '帐户ID',
	`company_id`  varchar(20) NOT NULL COMMENT '公司编号',
	`account_type`  varchar(10) NOT NULL COMMENT '帐户类别(PRIVATE: 私账, PUBLIC: 公账)',
	`bank_name`  varchar(100) NOT NULL DEFAULT '' COMMENT '银行名称',
	`bank_account`  varchar(50) NOT NULL DEFAULT '' COMMENT '银行帐号',
	`cmb_open_id`  varchar(50) NOT NULL DEFAULT '' COMMENT '招行申请的open_id',
	`cmb_open_key`  varchar(100) NOT NULL DEFAULT '' COMMENT '招行申请的open_key',
  `cmb_shop_pass`  varchar(20) NOT NULL DEFAULT ''COMMENT '招行申请的管理密码，退款操作时必需',
	`disabled`  bit(1) NOT NULL DEFAULT '0' COMMENT '禁用状态(0：不禁用，1：禁用)',
	`default_status` bit(1) NOT NULL DEFAULT '0' COMMENT '是否为默认账户(0：不是，1：是)',
	`created_at`  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
	`created_by`  varchar(20) NOT NULL DEFAULT '' COMMENT '创建人',
	`updated_at`  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
	`updated_by`  varchar(20) NOT NULL DEFAULT '' COMMENT '修改人',
	CONSTRAINT `pk_company_accounts_id` PRIMARY KEY (`account_id`),
	UNIQUE INDEX `uk_company_accounts_type` (`company_id`, `account_type`) USING BTREE
)ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS account_types;
CREATE TABLE `account_types` (
	`type_id`  varchar(10) NOT NULL COMMENT '类别编号',
	`type_name`  varchar(20) NOT NULL COMMENT '类别名称',
	`created_by`  varchar(20) NOT NULL DEFAULT '' COMMENT '创建人',
	`created_at`  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
    `updated_by`  varchar(20) NOT NULL DEFAULT '' COMMENT '修改人',
    `updated_at`  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
	CONSTRAINT `pk_account_types_id` PRIMARY KEY (`type_id`)
) /*COMMENT '帐户类别表'*/---  不能描述表
ENGINE=InnoDB DEFAULT CHARSET=utf8; /*COLLATE=utf8_general_ci;*/--mysql 特有排序规则

-- 字段\0 -> 0
-- ALTER TABLE `payment_orders`