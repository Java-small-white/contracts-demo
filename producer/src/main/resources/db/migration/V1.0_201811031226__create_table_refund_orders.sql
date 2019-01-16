
DROP TABLE IF EXISTS refund_orders;
CREATE TABLE `refund_orders` (
    `refund_id`  bigint(20) NOT NULL COMMENT '退款单号',
	`order_id`  bigint(20) NOT NULL COMMENT '支付单号',
    `refund_amount`  decimal(16,4) NOT NULL DEFAULT 0.0 COMMENT '退款金额',
    `refund_cause`  varchar(200) NOT NULL DEFAULT '' COMMENT '退款理由',
    `refund_status`  varchar(10) NOT NULL DEFAULT 'NONE' COMMENT '退款状态(NONE: 未退款, REFUNDING: 退款中, SUCCEED: 退款成功, FAILED: 退款失败)',
    `refund_user_id`  varchar(20) NOT NULL DEFAULT '' COMMENT '退款人编号',
    `refund_user_name`  varchar(20) NOT NULL DEFAULT '' COMMENT '退款人姓名',
    `refund_time`  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '退款时间',
	`refund_complete_time`  datetime NULL DEFAULT NULL COMMENT '退款完成时间',
	`bank_refund_no`  varchar(32) NULL DEFAULT NULL COMMENT '银行退款交易号',
	`bank_status_code`  int(11) NULL DEFAULT NULL COMMENT '银行状态码',
	`bank_status_msg`  varchar(200) NULL DEFAULT NULL COMMENT '银行状态描述',
	`created_at`  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
	`updated_at`  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
	`created_by`  varchar(20) NOT NULL DEFAULT '' COMMENT '创建人',
	`updated_by`  varchar(20) NOT NULL DEFAULT '' COMMENT '修改人',
	CONSTRAINT `pk_refund_orders_refund_id` PRIMARY KEY (`refund_id`),
    INDEX `ix_refund_orders_order_id` (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
