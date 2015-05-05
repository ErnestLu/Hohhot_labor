set character_set_results=gbk;

set character_set_client=gbk;

drop database db_labor_2013;

create database db_labor_2013;

use db_labor_2013;

create table t_person (
	serialNo varchar(13) NOT NULL PRIMARY KEY,/*流水号*/
  	number varchar(10) NOT NULL ,/*编号*/
  	acceptNo varchar(16) not null,/*受理编号*/
  	name varchar(20) NOT NULL,/*姓名*/
  	company varchar(60) NOT NULL,/*公司*/
  	office integer NOT NULL,/*科室*/
  	sex integer NOT NULL,/*性别*/
  	borntime varchar(10) NOT NULL,/*出生年月*/
  	jointime varchar(10) NOT NULL,/*参加工作时间*/
  	identity integer NOT NULL,/*身份*/
  	type integer NOT NULL,/*类型*/
  	approvetime  varchar(10) NOT NULL,/*审批时间*/
	nation varchar(2) not null,/*民族*/
	etirenum varchar(10),/*病退号*/
  	addtime varchar(16),/*添加时间*/
  	modtime varchar(16),/*修改时间*/
  	remark varchar(50),/*备注*/
	ifuse varchar(1)/*是否在用 1-在用 0-不用*/
);


create table index_num (
	one int DEFAULT 1,
	two int DEFAULT 1,
	three int default 1,
	zhi int default 1,
	number int default 1
);

insert into index_num (one, two, three, zhi, number) values(0, 0, 0, 0, 0);



create table sequence(
	Normal int DEFAULT 0,		/*正常*/
	disease int DEFAULT 0,		/*病退*/
	special int default 0,		/*特殊工种*/
	collapse int default 0,		/*破产*/
	retirement int default 0,	/*退职*/
	number int default 0		/*总数*/
);

insert into SEQUENCE (NORMAL, DISEASE, SPECIAL, NUMBER,collapse,retirement) values(0, 0, 0, 0,0,0);


/*科室代码表*/
create table dm_office (
	id integer,
	name varchar(10)
);
insert into dm_office values (1,'业务一科');
insert into dm_office values (2,'业务二科');
insert into dm_office values (3,'业务三科');
insert into dm_office values (4,'直属科');


/*性别代码表*/
create table dm_sex (
	id integer,
	name varchar(10)
);
insert into DM_SEX values (1,'男');
insert into DM_SEX values (2,'女');


/*身份代码表*/
create table dm_identity (
	id integer ,
	name varchar(10)
);
insert into DM_IDENTITY values ( 1, '工人');
insert into DM_IDENTITY values ( 2, '干部');


/*类型代码表*/
create table dm_type (
	id integer,
	name varchar(10)
);
insert into DM_TYPE values (1,'正常');
insert into DM_TYPE values (2,'因病');
insert into DM_TYPE values (3,'特殊工种');
insert into DM_TYPE values (4,'退职');


show databases;