ALTER TABLE `payment_orders`
  ADD COLUMN `is_checked` bit(1) NOT NULL COMMENT '是否已经对账' AFTER `bank_parameters`;
  
ALTER TABLE `payment_orders`
  ADD COLUMN `check_result` varchar(250) DEFAULT NULL COMMENT '对账结果' AFTER `is_checked`;
  
ALTER TABLE `payment_orders` ADD INDEX idx_payment_orders_checked(order_time, is_checked);

