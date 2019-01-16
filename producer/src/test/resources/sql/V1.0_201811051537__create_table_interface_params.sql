DROP TABLE IF EXISTS cmb_interface_params;
CREATE TABLE `cmb_interface_params` (
  `env_id`VARCHAR(5) NOT NULL COMMENT '运行环境(PROD:线上，TEST:测试，DEV:开发，LOCAL:本地)',
  `pay_url` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '支付地址',
  `order_list_path` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '获取订单列表接口',
  `order_view_path` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '查询订单明细接口',
  `pay_list_path` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '支付方式列表接口',
  `pay_order_path` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '下订单接口',
  `pay_status_path` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '查询付款状态接口',
  `pay_cancel_path` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '订单取消接口（针对未支付的订单）',
  `pay_refund_path` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '订单退款接口',
  `bill_path` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '对账接口',
  `default_shop_pass` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '默认主管密码',
  `notify_url` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '回调地址',
  `created_at`  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
  `updated_at`  datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改日期',
  `created_by`  varchar(20) NOT NULL DEFAULT '' COMMENT '创建人',
  `updated_by`  varchar(20) NOT NULL DEFAULT '' COMMENT '修改人',
  CONSTRAINT `pk_interface_params_env_id` PRIMARY KEY (`env_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
