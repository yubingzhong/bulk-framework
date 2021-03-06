/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2012/4/11 11:30:12                           */
/*==============================================================*/

drop table if exists t_user;

create table t_user
(
   id                   	int not null auto_increment,
   update_time          	timestamp not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   create_time          	datetime not null,
   username             	varchar(50) not null,
   password             	varchar(100) not null,
   feature_json             varchar(255) not null default '{}' comment '扩展字段,要求:json结构',
   flag_bit             	bigint not null default 0 comment '扩展字段',
   status               	tinyint not null default 0 comment '-1=表示记录已删除',
   primary key (id)
) engine=InnoDB default charset=utf8;

