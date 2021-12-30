CREATE
database if NOT EXISTS `torrent` default character set utf8mb4;


DROP TABLE IF EXISTS `com_info`;
CREATE TABLE `com_info`
(
    `id`                 bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `com_uni_code`       bigint(20) DEFAULT NULL COMMENT '公司统一编码',
    `com_chi_name`       varchar(200) DEFAULT NULL COMMENT '公司名称',
    `com_chi_short_name` varchar(50)  DEFAULT NULL COMMENT '公司简称',
    `com_eng_name`       varchar(200) DEFAULT NULL COMMENT '公司英文名称',
    `com_reg_address`    varchar(240) DEFAULT NULL COMMENT '公司注册地址',
    `com_main_business`  mediumtext COMMENT '公司经营范围',
    `com_reg_code`       varchar(60)  DEFAULT NULL COMMENT '工商登记号_营业执照注册号',
    `com_staff_sum`      int(11) DEFAULT NULL COMMENT '员工总数',
    `com_reg_agency`     varchar(200) DEFAULT NULL COMMENT '注册机关',
    `com_web`            varchar(60)  DEFAULT NULL COMMENT '公司网址',
    `com_tel`            varchar(60)  DEFAULT NULL COMMENT '公司电话',
    `com_pro`            text COMMENT '公司简介',
    `com_pic_link`       varchar(500) DEFAULT NULL COMMENT '学校图片oss链接',
    `com_pic_key`        varchar(200) DEFAULT NULL COMMENT '学校图片key值',
    `approval_status`    tinyint(4) DEFAULT NULL COMMENT '审核状态(1:通过,2:待审核,3:不通过)',
    `deleted`            tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除:0表示没有删除,1表示删除',
    `com_type`           int(11) DEFAULT NULL COMMENT '公司类型',
    `com_size`           int(11) DEFAULT NULL COMMENT '公司规模',
    `create_by`          bigint(20) DEFAULT NULL COMMENT '创建人',
    `create_time`        datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`          bigint(20) DEFAULT NULL COMMENT '修改人',
    `update_time`        datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`),
    KEY                  `idx_com_uni_code_status_intl` (`com_uni_code`,`approval_status`,`deleted`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公司信息';

DROP TABLE IF EXISTS `college_info`;
CREATE TABLE `college_info`
(
    `id`                     bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `college_uni_code`       bigint(20) NOT NULL COMMENT '学校编码',
    `college_chi_name`       varchar(100) DEFAULT NULL COMMENT '学校名称',
    `college_chi_short_name` varchar(50)  DEFAULT NULL COMMENT '学校简称',
    `college_eng_name`       varchar(200) DEFAULT NULL COMMENT '学校英文名称',
    `college_est_date`       varchar(10)  DEFAULT NULL COMMENT '学校成立日期',
    `college_tel`            varchar(17)  DEFAULT NULL COMMENT '用户手机号',
    `college_address`        varchar(240) DEFAULT NULL COMMENT '学校地址',
    `college_features`       varchar(200) DEFAULT NULL COMMENT '学校特色',
    `college_web`            varchar(60)  DEFAULT NULL COMMENT '学校网址',
    `college_pic_link`       varchar(500) DEFAULT NULL COMMENT '学校图片oss链接',
    `college_pic_key`        varchar(200) DEFAULT NULL COMMENT '学校图片key值',
    `approval_status`        tinyint(4) DEFAULT NULL COMMENT '审核状态(1:通过,2:待审核,3:不通过)',
    `deleted`                tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除:0表示没有删除,1表示删除',
    `create_by`              bigint(20) DEFAULT NULL COMMENT '创建人',
    `create_time`            datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`              bigint(20) DEFAULT NULL COMMENT '修改人',
    `update_time`            datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`),
    KEY                      `idx_college_uni_code_status_intl` (`college_uni_code`,`approval_status`,`deleted`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生信息表';

DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info`
(
    `id`                  bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `stu_uni_code`        bigint(20) NOT NULL COMMENT '学号',
    `stu_name`            varchar(20)  DEFAULT NULL COMMENT '学生姓名',
    `stu_sex`             varchar(20)  DEFAULT NULL COMMENT '学生性别',
    `stu_nation`          varchar(20)  DEFAULT NULL COMMENT '民族',
    `stu_birth_date`      date         DEFAULT NULL COMMENT '出生日期',
    `stu_origin_place`    varchar(150) DEFAULT NULL COMMENT '籍贯',
    `stu_polity`          varchar(50)  DEFAULT NULL COMMENT '政治面貌',
    `college_uni_code`    bigint(20) DEFAULT NULL COMMENT '学校编码',
    `college_chi_name`    varchar(100) DEFAULT NULL COMMENT '学校名称',
    `stu_academy`         varchar(100) DEFAULT NULL COMMENT '所在院系',
    `stu_major`           varchar(50)  DEFAULT NULL COMMENT '专业',
    `stu_grade`           tinyint(4) DEFAULT NULL COMMENT '所在年级',
    `stu_training_level`  varchar(20)  DEFAULT NULL COMMENT '培养层次',
    `stu_type`            varchar(20)  DEFAULT NULL COMMENT '学生类型',
    `stu_graduation_date` date         DEFAULT NULL COMMENT '预计毕业时间',
    `stu_tel`             varchar(17)  DEFAULT NULL COMMENT '联系方式',
    `stu_email`           varchar(100) DEFAULT NULL COMMENT '联系邮箱',
    `stu_work_unit`       varchar(50)  DEFAULT NULL COMMENT '工作单位',
    `stu_work_address`    varchar(200) DEFAULT NULL COMMENT '单位地址',
    `stu_work_tel`        varchar(17)  DEFAULT NULL COMMENT '单位电话',
    `stu_home_address`    varchar(200) DEFAULT NULL COMMENT '家庭住址',
    `stu_home_tel`        varchar(17)  DEFAULT NULL COMMENT '家庭电话',
    `approval_status`     tinyint(4) DEFAULT NULL COMMENT '审核状态(1:通过,2:待审核,3:不通过)',
    `deleted`             tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除:0表示没有删除,1表示删除',
    `create_by`           bigint(20) DEFAULT NULL COMMENT '创建人',
    `create_time`         datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`           bigint(20) DEFAULT NULL COMMENT '修改人',
    `update_time`         datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`),
    KEY                   `idx_stu_uni_code_status_intl` (`stu_uni_code`,`approval_status`,`deleted`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生信息表';

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`              bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `user_tel`        varchar(17) DEFAULT NULL COMMENT '用户手机号',
    `user_uni_code`   bigint(20) NOT NULL COMMENT '用户编码(学校编码,公司编码,学号)',
    `user_pwd`        varchar(50) DEFAULT NULL COMMENT '用户密码',
    `role_id`         bigint(20) unsigned NOT NULL COMMENT '角色Id',
    `approval_status` tinyint(4) DEFAULT NULL COMMENT '审核状态(1:通过,2:待审核,3:不通过)',
    `deleted`         tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除:0表示没有删除,1表示删除',
    `create_by`       bigint(20) DEFAULT NULL COMMENT '创建人',
    `create_time`     datetime    DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`       bigint(20) DEFAULT NULL COMMENT '修改人',
    `update_time`     datetime    DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`),
    KEY               `idx_user_tel__uni_code_status` (`user_tel`,`user_uni_code`,`approval_status`,`deleted`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`
(
    `id`                  bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主建',
    `role_name`           varchar(32) NOT NULL COMMENT '角色名称 ',
    `role_desc`           varchar(64) DEFAULT NULL COMMENT '角色描述',
    `create_by`           bigint(20) DEFAULT NULL COMMENT '创建人',
    `create_time`         datetime    DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`           bigint(20) DEFAULT NULL COMMENT '修改人',
    `update_time`         datetime    DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    `last_update_account` varchar(32) DEFAULT NULL COMMENT '最后更新人的账号',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_role_name` (`role_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';



DROP TABLE IF EXISTS `user_action_record`;
CREATE TABLE `user_action_record`
(
    `id`               bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `user_id`          bigint(20) NOT NULL DEFAULT '0' COMMENT '用户id',
    `user_tel`         bigint(20) DEFAULT NULL COMMENT '用户手机号',
    `name`             varchar(30)          DEFAULT NULL COMMENT '名称',
    `user_agent`       varchar(300)         DEFAULT NULL COMMENT '用户代理OS',
    `device_type`      tinyint(4) NOT NULL COMMENT '设备类型(1 PC 2 移动版)',
    `user_action_code` varchar(20) NOT NULL COMMENT '埋点唯一编码',
    `click_date`       date        NOT NULL COMMENT '点击日期',
    `click_count`      bigint(20) NOT NULL COMMENT '点击次数',
    `create_time`      datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `create_by`        bigint(20) DEFAULT NULL COMMENT '创建人',
    `update_time`      datetime             DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `update_by`        bigint(20) DEFAULT NULL COMMENT '更新人',
    PRIMARY KEY (`id`),
    KEY                `idx_date_code` (`click_date`,`user_action_code`),
    KEY                `idx_uid_code_date_data_identifier` (`user_id`,`user_action_code`,`click_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户行为记录表';

DROP TABLE IF EXISTS `user_action_record_detail`;
CREATE TABLE `user_action_record_detail`
(
    `id`                   int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `user_action_id`       bigint(20) unsigned NOT NULL COMMENT '用户行为表id',
    `data_identifier_type` smallint(5) NOT NULL COMMENT '点击数据唯一标识字段业务类型 参考DataIdentifierTypeEnum',
    `data_identifier`      varchar(128) NOT NULL COMMENT '具体点击的数据的唯一标识',
    `click_count`          smallint(5) NOT NULL COMMENT '点击次数',
    `create_time`          datetime     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`          datetime              DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户行为记录[具体某个行为]表';

DROP TABLE IF EXISTS `action_name_mapping`;
CREATE TABLE `action_name_mapping`
(
    `id`              bigint(20) NOT NULL AUTO_INCREMENT,
    `action_code`     bigint(20) NOT NULL COMMENT '埋点唯一code',
    `action_name`     varchar(200) NOT NULL COMMENT '埋点名称',
    `action_location` varchar(200) NOT NULL COMMENT '埋点位置',
    `device_type`     tinyint(4) NOT NULL COMMENT '设备类型',
    `create_by`       bigint(20) DEFAULT NULL COMMENT '创建人',
    `create_time`     datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`       bigint(20) DEFAULT NULL COMMENT '更新人',
    `update_time`     datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    KEY               `uk_action_code` (`action_code`,`device_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='埋点名称编码映射表';

DROP TABLE IF EXISTS `record_mark_type_system`;
CREATE TABLE `record_mark_type_system`
(
    `id`          bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键Id',
    `data_type`   int(11) DEFAULT NULL COMMENT '字段类型',
    `data_name`   varchar(30)  DEFAULT NULL COMMENT '字段名称',
    `data_field`  varchar(30)  DEFAULT NULL COMMENT '字段标识',
    `data_desc`   varchar(100) DEFAULT NULL COMMENT '字段描述',
    `create_time` datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='埋点数据绑定业务字段类型描述';



DROP TABLE IF EXISTS `position`;
CREATE TABLE `position`
(
    `id`                  bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `com_uni_code`        bigint(20) NOT NULL COMMENT '公司编码',
    `job_name`            varchar(50)    DEFAULT NULL COMMENT '岗位描述',
    `job_work_place`      varchar(20)    DEFAULT NULL COMMENT '工作单位',
    `job_type`            tinyint(4) DEFAULT NULL COMMENT '工作性质',
    `job_address`         int(11) DEFAULT NULL COMMENT '岗位地点',
    `education_level`     tinyint(4) DEFAULT NULL COMMENT '学历(1:博士;2:硕士;3:学士;4:专科;5:高中及以下)',
    `job_work_begin_year` int(11) DEFAULT NULL COMMENT '岗位要求年限',
    `job_work_end_year`   int(11) DEFAULT NULL COMMENT '岗位要求年限',
    `job_number`          int(11) DEFAULT NULL COMMENT '岗位数量',
    `job_min_salary`      decimal(12, 4) DEFAULT NULL COMMENT '岗位最小薪水',
    `job_max_salary`      decimal(12, 4) DEFAULT NULL COMMENT '岗位最大薪水',
    `skill_uni_code`      varchar(500)   DEFAULT NULL COMMENT '技能编码(以逗号隔开)',
    `job_duty`            varchar(3000)  DEFAULT NULL COMMENT '岗位职责',
    `job_required`        varchar(3000)  DEFAULT NULL COMMENT '岗位要求',
    `job_welfare`         varchar(200)   DEFAULT NULL COMMENT '岗位福利',
    `approval_status`     tinyint(4) DEFAULT NULL COMMENT '审核状态(1:通过,2:待审核,3:不通过)',
    `deleted`             tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除:0表示没有删除,1表示删除',
    `com_type`            int(11) DEFAULT NULL COMMENT '公司类型',
    `com_size`            int(11) DEFAULT NULL COMMENT '公司规模',
    `create_by`           bigint(20) DEFAULT NULL COMMENT '创建人',
    `create_time`         datetime       DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`           bigint(20) DEFAULT NULL COMMENT '修改人',
    `update_time`         datetime       DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`),
    KEY                   `idx_com_uni_code` (`com_uni_code`) USING BTREE,
    KEY                   `idx_job_type_job_address_education_level_com_type_com_size` (`job_type`,`job_address`,`education_level`,`com_type`,`com_size`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='岗位表';

DROP TABLE IF EXISTS `contract`;
CREATE TABLE `contract`
(
    `id`                 bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `stu_uni_code`       bigint(20) NOT NULL COMMENT '学号',
    `stu_name`           varchar(20)  DEFAULT NULL COMMENT '学生姓名',
    `com_chi_short_name` varchar(50)  DEFAULT NULL COMMENT '公司简称',
    `job_id`             bigint(20) NOT NULL COMMENT '岗位id',
    `job_name`           varchar(50)  DEFAULT NULL COMMENT '岗位描述',
    `contract_date`      date         DEFAULT NULL COMMENT '签约时间',
    `contract_status`    tinyint(4) DEFAULT NULL COMMENT '签约状态(1:待签约,2:已签约,3:已拒绝)',
    `contract_pic_link`  varchar(500) DEFAULT NULL COMMENT '合同图片oss链接',
    `contract_pic_key`   varchar(200) DEFAULT NULL COMMENT '合同图片key值',
    `create_by`          bigint(20) DEFAULT NULL COMMENT '创建人',
    `create_time`        datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`          bigint(20) DEFAULT NULL COMMENT '修改人',
    `update_time`        datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`),
    KEY                  `idx_stu_uni_code_contract_status` (`stu_uni_code`,`contract_status`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='签约表';


DROP TABLE IF EXISTS `deliver`;
CREATE TABLE `deliver`
(
    `id`                 bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `stu_uni_code`       bigint(20) NOT NULL COMMENT '学号',
    `job_id`             bigint(20) NOT NULL COMMENT '岗位id',
    `job_name`           varchar(50) DEFAULT NULL COMMENT '岗位描述',
    `com_uni_code`       bigint(20) NOT NULL COMMENT '公司编码',
    `com_chi_short_name` varchar(50) DEFAULT NULL COMMENT '公司简称',
    `deliver_date`       date        DEFAULT NULL COMMENT '投递时间',
    `deliver_status`     tinyint(4) DEFAULT NULL COMMENT '投递进度(1:已收藏,2:已投递,3:待面试,4:已面试,5:已录取,6:未录取,7:被拒绝)',
    `create_by`          bigint(20) DEFAULT NULL COMMENT '创建人',
    `create_time`        datetime    DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`          bigint(20) DEFAULT NULL COMMENT '修改人',
    `update_time`        datetime    DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`),
    KEY                  `idx_stu_uni_code_deliver_status` (`stu_uni_code`,`deliver_status`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='投递进度表';

DROP TABLE IF EXISTS `position_skill`;
CREATE TABLE `position_skill`
(
    `id`                bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `skill_uni_code`    bigint(20) NOT NULL COMMENT '技能编码',
    `skill_info`        varchar(50) DEFAULT NULL COMMENT '技能描述',
    `industry_uni_code` bigint(20) DEFAULT NULL COMMENT '行业编码',
    `create_by`         bigint(20) DEFAULT NULL COMMENT '创建人',
    `create_time`       datetime    DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`         bigint(20) DEFAULT NULL COMMENT '修改人',
    `update_time`       datetime    DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`),
    KEY                 `idx_skill_uni_code` (`skill_uni_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='行业技能表';

DROP TABLE IF EXISTS `industry_info`;
CREATE TABLE `industry_info`
(
    `id`                     bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `industry_code`          int(8) unsigned DEFAULT '0' COMMENT '行业编码',
    `industry_name`          varchar(50) DEFAULT NULL COMMENT '行业名称',
    `industry_category_code` int(8) unsigned DEFAULT '0' COMMENT '行业分类编码',
    `industry_category_name` varchar(50) DEFAULT NULL COMMENT '行业名称',
    `industry_level`         tinyint(3) unsigned DEFAULT NULL COMMENT '行业级别: 1： 一级行业; 2: 二级行业',
    `deleted`                tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除：0： 未删除。 1： 已删除',
    `create_by`              bigint(11) unsigned DEFAULT NULL COMMENT '创建人',
    `create_time`            datetime    DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`              bigint(11) unsigned DEFAULT NULL COMMENT '更新人',
    `update_time`            datetime    DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE KEY `uk_industry_code` (`industry_code`) USING BTREE COMMENT '行业编码唯一索引'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='行业信息表';

DROP TABLE IF EXISTS `public_dict`;
CREATE TABLE `public_dict`
(
    `id`                    bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `parameter_system_code` int(11) DEFAULT NULL COMMENT '参数系编码',
    `parameter_system_name` varchar(32)  DEFAULT NULL COMMENT '参数系名称',
    `parameter_code`        int(11) DEFAULT NULL COMMENT '参数编码',
    `parameter_name`        varchar(32)  DEFAULT NULL COMMENT '参数名称',
    `parameter_desc`        varchar(255) DEFAULT NULL COMMENT '参数说明',
    `valid`                 tinyint(4) unsigned DEFAULT '1' COMMENT '是否有效(0：无效 1：有效)',
    `create_time`           datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`           datetime     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uK_parameter_code` (`parameter_system_code`,`parameter_code`,`valid`),
    KEY                     `idx_parameter_system_code_valid` (`parameter_system_code`,`valid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='字典表';

DROP TABLE IF EXISTS `job_expect`;
CREATE TABLE `job_expect`
(
    `id`                bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `stu_uni_code`      bigint(20) NOT NULL COMMENT '学号',
    `job_name`          varchar(50)    DEFAULT NULL COMMENT '岗位描述',
    `industry_code`     int(8) unsigned DEFAULT '0' COMMENT '行业编码',
    `industry_name`     varchar(30)    DEFAULT NULL COMMENT '行业名称',
    `job_type`          tinyint(4) DEFAULT NULL COMMENT '工作性质',
    `job_address`       varchar(50)    DEFAULT NULL COMMENT '期望岗位地点',
    `job_min_salary`    decimal(12, 4) DEFAULT NULL COMMENT '岗位期望最小薪水',
    `job_max_salary`    decimal(12, 4) DEFAULT NULL COMMENT '岗位期望最大薪水',
    `job_search_status` tinyint(4) DEFAULT NULL COMMENT '求职状态(1:在校-找工作中,2:离校-找工作中,3:在校-看看机会,4:在校-暂不找工作)',
    `deleted`           tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除:0表示没有删除,1表示删除',
    `create_by`         bigint(20) DEFAULT NULL COMMENT '创建人',
    `create_time`       datetime       DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`         bigint(20) DEFAULT NULL COMMENT '修改人',
    `update_time`       datetime       DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`),
    KEY                 `idx_stu_uni_code` (`stu_uni_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='求职意向表';

DROP TABLE IF EXISTS `education_history`;
CREATE TABLE `education_history`
(
    `id`                    bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `stu_uni_code`          bigint(20) NOT NULL COMMENT '学号',
    `college_uni_code`      bigint(20) DEFAULT NULL COMMENT '学校编码',
    `college_chi_name`      varchar(100) DEFAULT NULL COMMENT '学校名称',
    `education_level`       tinyint(4) DEFAULT NULL COMMENT '学历',
    `education_field`       varchar(30)  DEFAULT NULL COMMENT '所学专业',
    `academic_certificates` tinyint(4) unsigned DEFAULT NULL COMMENT '学历证书',
    `education_begin_time`  DATE         DEFAULT NULL COMMENT '工作开始时间',
    `education_end_time`    DATE         DEFAULT NULL COMMENT '工作结束时间',
    `deleted`               tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除：0： 未删除。 1： 已删除',
    `create_by`             bigint(11) unsigned DEFAULT NULL COMMENT '创建人',
    `create_time`           datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`             bigint(11) unsigned DEFAULT NULL COMMENT '更新人',
    `update_time`           datetime     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    KEY                     `uk_stu_uni_code` (`stu_uni_code`) USING BTREE COMMENT '学号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='教育经历';

DROP TABLE IF EXISTS `work_history`;
CREATE TABLE `work_history`
(
    `id`                  bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `stu_uni_code`        bigint(20) NOT NULL COMMENT '学号',
    `com_uni_code`        bigint(20) DEFAULT NULL COMMENT '公司编码',
    `com_chi_name`        varchar(200) DEFAULT NULL COMMENT '公司名称',
    `com_chi_short_name`  varchar(50)  DEFAULT NULL COMMENT '公司简称',
    `industry_code`       int(8) unsigned DEFAULT '0' COMMENT '行业编码',
    `industry_name`       varchar(50)  DEFAULT NULL COMMENT '行业名称',
    `monthly_salary`      int(8) unsigned DEFAULT NULL COMMENT '月薪',
    `job_work_begin_time` DATE         DEFAULT NULL COMMENT '工作开始时间',
    `job_work_end_time`   DATE         DEFAULT NULL COMMENT '工作结束时间',
    `job_detail`          varchar(200) DEFAULT NULL COMMENT '职位描述',
    `deleted`             tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除：0： 未删除。 1： 已删除',
    `create_by`           bigint(11) unsigned DEFAULT NULL COMMENT '创建人',
    `create_time`         datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`           bigint(11) unsigned DEFAULT NULL COMMENT '更新人',
    `update_time`         datetime     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    KEY                   `uk_stu_uni_code` (`stu_uni_code`) USING BTREE COMMENT '学号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工作|实习经历';

DROP TABLE IF EXISTS `project_history`;
CREATE TABLE `project_history`
(
    `id`                 bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `stu_uni_code`       bigint(20) NOT NULL COMMENT '学号',
    `com_uni_code`       bigint(20) DEFAULT NULL COMMENT '公司编码',
    `com_chi_name`       varchar(50)  DEFAULT NULL COMMENT '公司名称',
    `com_chi_short_name` varchar(30)  DEFAULT NULL COMMENT '公司简称',
    `project_name`       varchar(50)  DEFAULT NULL COMMENT '项目名称',
    `project_begin_time` DATE         DEFAULT NULL COMMENT '项目开始时间',
    `project_end_time`   DATE         DEFAULT NULL COMMENT '项目结束时间',
    `project_detail`     varchar(200) DEFAULT NULL COMMENT '职位描述',
    `deleted`            tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除：0： 未删除。 1： 已删除',
    `create_by`          bigint(11) unsigned DEFAULT NULL COMMENT '创建人',
    `create_time`        datetime     DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`          bigint(11) unsigned DEFAULT NULL COMMENT '更新人',
    `update_time`        datetime     DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    KEY                  `key_stu_uni_code` (`stu_uni_code`) USING BTREE COMMENT '学号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='项目经历';

DROP TABLE IF EXISTS `language_skills`;
CREATE TABLE `language_skills`
(
    `id`                  bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `stu_uni_code`        bigint(20) NOT NULL COMMENT '学号',
    `language_type`       varchar(30) DEFAULT NULL COMMENT '语种',
    `Listen_speak_skills` varchar(30) DEFAULT NULL COMMENT '听说能力',
    `Read_write_skills`   varchar(30) DEFAULT NULL COMMENT '读写能力',
    `deleted`             tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除：0： 未删除。 1： 已删除',
    `create_by`           bigint(11) unsigned DEFAULT NULL COMMENT '创建人',
    `create_time`         datetime    DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`           bigint(11) unsigned DEFAULT NULL COMMENT '更新人',
    `update_time`         datetime    DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    KEY                   `key_stu_uni_code` (`stu_uni_code`) USING BTREE COMMENT '学号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='语言能力';

DROP TABLE IF EXISTS `professional_skills`;
CREATE TABLE `professional_skills`
(
    `id`            bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `stu_uni_code`  bigint(20) NOT NULL COMMENT '学号',
    `skill_name`    varchar(30) DEFAULT NULL COMMENT '技能名称',
    `use_time`      int(8) DEFAULT NULL COMMENT '使用时长',
    `mastery_level` tinyint(4) DEFAULT NULL COMMENT '掌握程度',
    `deleted`       tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除：0： 未删除。 1： 已删除',
    `create_by`     bigint(11) unsigned DEFAULT NULL COMMENT '创建人',
    `create_time`   datetime    DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`     bigint(11) unsigned DEFAULT NULL COMMENT '更新人',
    `update_time`   datetime    DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    KEY             `key_stu_uni_code` (`stu_uni_code`) USING BTREE COMMENT '学号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='专业技能';

DROP TABLE IF EXISTS `certificate`;
CREATE TABLE `certificate`
(
    `id`              bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `stu_uni_code`    bigint(20) NOT NULL COMMENT '学号',
    `certificate_ame` varchar(30) DEFAULT NULL COMMENT '证书名称',
    `get_time`        int(8) DEFAULT NULL COMMENT '获得时间',
    `deleted`         tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除：0： 未删除。 1： 已删除',
    `create_by`       bigint(11) unsigned DEFAULT NULL COMMENT '创建人',
    `create_time`     datetime    DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`       bigint(11) unsigned DEFAULT NULL COMMENT '更新人',
    `update_time`     datetime    DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    KEY               `key_stu_uni_code` (`stu_uni_code`) USING BTREE COMMENT '学号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='证书';

DROP TABLE IF EXISTS `student_officer`;
CREATE TABLE `student_officer`
(
    `id`               bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `stu_uni_code`     bigint(20) NOT NULL COMMENT '学号',
    `officer_name`     varchar(30) DEFAULT NULL COMMENT '干部名称',
    `serve_begin_time` DATE        DEFAULT NULL COMMENT '任职开始时间',
    `serve_end_time`   DATE        DEFAULT NULL COMMENT '任职结束时间',
    `deleted`          tinyint(4) unsigned DEFAULT '0' COMMENT '是否删除：0： 未删除。 1： 已删除',
    `create_by`        bigint(11) unsigned DEFAULT NULL COMMENT '创建人',
    `create_time`      datetime    DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_by`        bigint(11) unsigned DEFAULT NULL COMMENT '更新人',
    `update_time`      datetime    DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE,
    KEY                `key_stu_uni_code` (`stu_uni_code`) USING BTREE COMMENT '学号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生干部经历';
