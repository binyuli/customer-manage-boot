/*
Navicat MySQL Data Transfer

Source Server         : mysqlDB57
Source Server Version : 50712
Source Host           : localhost:3309
Source Database       : manage

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2017-05-22 13:30:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for appointment
-- ----------------------------
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment` (
  `id` varchar(36) NOT NULL,
  `code` varchar(36) NOT NULL,
  `market_activity_id` varchar(36) NOT NULL,
  `market_activity_code` varchar(100) NOT NULL,
  `market_activity_start` datetime DEFAULT NULL,
  `market_activity_end` datetime DEFAULT NULL,
  `customer_id` varchar(36) NOT NULL,
  `customer_name` varchar(100) NOT NULL,
  `customer_mobile` varchar(20) NOT NULL,
  `customer_email` varchar(30) DEFAULT NULL,
  `appointment_date` datetime DEFAULT NULL,
  `vehicle_model_id` varchar(36) DEFAULT NULL,
  `vehicle_model_code` varchar(100) DEFAULT NULL,
  `vehicle_model_name` varchar(100) DEFAULT NULL,
  `dealer_id` varchar(36) DEFAULT NULL,
  `dealer_code` varchar(50) DEFAULT NULL,
  `dealer_name` varchar(100) DEFAULT NULL,
  `sale_consultant_id` varchar(36) DEFAULT NULL,
  `sale_consultant_name` varchar(50) DEFAULT NULL,
  `sale_consultant_mobile` varchar(20) DEFAULT NULL,
  `info_source` int(11) DEFAULT NULL COMMENT '字典项 CustomerSourceType 客户来源\r\n            0	AIM\r\n            1	互联网\r\n            2	报纸\r\n            3	广播\r\n            4	户外广告\r\n            5	电视\r\n            6	销售顾问邀约\r\n            ',
  `gift_id` varchar(36) DEFAULT NULL,
  `gift_code` varchar(50) DEFAULT NULL,
  `gift_name` varchar(100) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '字典项 AppointmentStatus	预约登记单状态\r\n            \r\n            0	新建\r\n            1	过期\r\n            2	完成试驾\r\n            \r\n            ',
  `create_time` datetime DEFAULT NULL,
  `channel` varchar(100) DEFAULT NULL,
  `cookie` varchar(100) DEFAULT NULL,
  `customer_gender` int(11) DEFAULT NULL COMMENT '字典项 0 男  1 女',
  `customer_status` int(11) DEFAULT NULL COMMENT '客户倾向\r\n    0: 未回访;\r\n    1: 确定到店;\r\n    2: 确定不到店;\r\n    3: 不确定是否到店',
  `customer_comment` text COMMENT '客户备注信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of appointment
-- ----------------------------
INSERT INTO `appointment` VALUES ('2f4e70d2-a909-4e9c-bd5a-2b06b8c9ef9c', 'q2VS2nmOS4', 'd0c86ad8-d67a-489a-8a73-bd25af127aad', 'MK-WH', '2017-04-11 00:00:00', '2017-06-22 00:00:00', '6d4184f1-3140-4758-92cd-5e1bab1bc7ab', '张一山', '15601020304', 'zhangsan@163.com', '2017-05-18 01:14:33', '749bef25-362e-41e6-ae9d-4060ca5e969c', 'enjoy', '2016款 380TSI 舒享型(夏朗)', '1baf88c0-7404-11e6-8da9-005056af50a8', 'JXS0006', '武汉体育中心店', '47846187-86b5-4bc4-8947-ac646f5bebee', '李四', '15600000000', '0', 'acff7ca3-bab4-11e6-8da9-005056af50a8', 'airFresher', '购物卡', '0', '2017-04-19 11:02:57', 'tele', 'b9c70e62-3475-4ad5-a28b-d113f95f0fce', '0', '1', 'test update again');

-- ----------------------------
-- Table structure for appointment_login_manage
-- ----------------------------
DROP TABLE IF EXISTS `appointment_login_manage`;
CREATE TABLE `appointment_login_manage` (
  `mobile` varchar(20) NOT NULL COMMENT '这里尝试把手机号作为该表的主键,方便快速查询',
  `token` varchar(32) DEFAULT NULL COMMENT '由手机号Md5加密得到',
  `status` int(11) DEFAULT NULL COMMENT 'BaseDataStatus	基础数据状态\r\n            0	有效\r\n            1	作废',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='预约管理页面账户管理';

-- ----------------------------
-- Records of appointment_login_manage
-- ----------------------------
INSERT INTO `appointment_login_manage` VALUES ('13501020304', '8be93814179bcd3d42658e8b9954679d', '0', '2017-01-05 17:00:49');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` varchar(36) NOT NULL,
  `code` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL COMMENT 'Sex	性别\r\n            0	男\r\n            1	女\r\n            ',
  `mobile` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `id_card` varchar(20) DEFAULT NULL,
  `drive_age` int(11) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `is_married` int(11) DEFAULT NULL COMMENT 'IsTrue	是否\r\n            0	是/True\r\n            1	否/False\r\n            ',
  `profession` int(11) DEFAULT NULL,
  `driving_license` varchar(200) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT 'BaseDataStatus	基础数据状态	\r\n            0	有效\r\n            		\r\n            1	作废\r\n            ',
  `create_time` datetime DEFAULT NULL,
  `dmc_id` varchar(36) DEFAULT NULL,
  `cookie` varchar(100) DEFAULT NULL,
  `wechat_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('6d4184f1-3140-4758-92cd-5e1bab1bc7ab', null, '张一山', '0', '15600000000', 'zhangsan@163.com', null, null, null, null, null, null, 'D:\\configure\\apache-tomcat-7.0.54\\wtpwebapps\\15618962870/8b9fb703-681b-41d4-b413-1e6ae68fb654.jpg', '0', '2017-04-19 11:02:57', null, 'b9c70e62-3475-4ad5-a28b-d113f95f0fce', 'zhangsan2017');

-- ----------------------------
-- Table structure for market_activity
-- ----------------------------
DROP TABLE IF EXISTS `market_activity`;
CREATE TABLE `market_activity` (
  `id` varchar(36) NOT NULL,
  `code` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `manufacturer_id` varchar(36) NOT NULL,
  `manufacturer_name` varchar(100) NOT NULL,
  `brand_id` varchar(36) NOT NULL,
  `brand_code` varchar(100) DEFAULT NULL,
  `brand_name` varchar(100) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT 'BaseDataStatus	基础数据状态\r\n            \r\n            0	有效\r\n            1	作废\r\n            ',
  `create_time` datetime DEFAULT NULL,
  `activity_address` varchar(100) DEFAULT NULL,
  `activity_time` varchar(100) DEFAULT NULL,
  `activity_contact_phone` varchar(20) DEFAULT NULL,
  `province_id` varchar(36) DEFAULT NULL,
  `province_name` varchar(100) DEFAULT NULL,
  `city_id` varchar(36) DEFAULT NULL,
  `city_name` varchar(100) DEFAULT NULL,
  `district_id` varchar(36) DEFAULT NULL,
  `district_name` varchar(100) DEFAULT NULL,
  `appointment_time` int(11) DEFAULT NULL,
  `limit_time` int(11) DEFAULT NULL,
  `detail_activity_address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market_activity
-- ----------------------------
INSERT INTO `market_activity` VALUES ('d0c86ad8-d67a-489a-8a73-bd25af127aad', 'MK-WH', '武汉促销活动一', '2017-04-11', '2017-06-22', '48f79bd5-b519-11e6-8da9-005056af50a8', '畅想中国', 'fd719c37-2d42-4783-b07b-ebb29898d334', 'VK', '畅想', '0', '2016-11-28 15:20:07', '武汉体育中心', '2017-01-07至2017-01-08 10:00-13:30', '4008192696-2318', '1a2a23a1-6450-11e6-8da9-005056af50a8', '湖北省', '1a2ad8e3-6450-11e6-8da9-005056af50a8', '武汉市', '1a3115be-6450-11e6-8da9-005056af50a8', '汉阳区', '26', '1000', '武汉市汉阳区汉阳经济技术开发区');
SET FOREIGN_KEY_CHECKS=1;
