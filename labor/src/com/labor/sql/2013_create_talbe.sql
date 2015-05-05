set character_set_results=gbk;

set character_set_client=gbk;

drop database db_labor_2013;

create database db_labor_2013;

use db_labor_2013;

create table t_person (
	serialNo varchar(13) NOT NULL PRIMARY KEY,/*��ˮ��*/
  	number varchar(10) NOT NULL ,/*���*/
  	acceptNo varchar(16) not null,/*������*/
  	name varchar(20) NOT NULL,/*����*/
  	company varchar(60) NOT NULL,/*��˾*/
  	office integer NOT NULL,/*����*/
  	sex integer NOT NULL,/*�Ա�*/
  	borntime varchar(10) NOT NULL,/*��������*/
  	jointime varchar(10) NOT NULL,/*�μӹ���ʱ��*/
  	identity integer NOT NULL,/*���*/
  	type integer NOT NULL,/*����*/
  	approvetime  varchar(10) NOT NULL,/*����ʱ��*/
	nation varchar(2) not null,/*����*/
	etirenum varchar(10),/*���˺�*/
  	addtime varchar(16),/*���ʱ��*/
  	modtime varchar(16),/*�޸�ʱ��*/
  	remark varchar(50),/*��ע*/
	ifuse varchar(1)/*�Ƿ����� 1-���� 0-����*/
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
	Normal int DEFAULT 0,		/*����*/
	disease int DEFAULT 0,		/*����*/
	special int default 0,		/*���⹤��*/
	collapse int default 0,		/*�Ʋ�*/
	retirement int default 0,	/*��ְ*/
	number int default 0		/*����*/
);

insert into SEQUENCE (NORMAL, DISEASE, SPECIAL, NUMBER,collapse,retirement) values(0, 0, 0, 0,0,0);


/*���Ҵ����*/
create table dm_office (
	id integer,
	name varchar(10)
);
insert into dm_office values (1,'ҵ��һ��');
insert into dm_office values (2,'ҵ�����');
insert into dm_office values (3,'ҵ������');
insert into dm_office values (4,'ֱ����');


/*�Ա�����*/
create table dm_sex (
	id integer,
	name varchar(10)
);
insert into DM_SEX values (1,'��');
insert into DM_SEX values (2,'Ů');


/*��ݴ����*/
create table dm_identity (
	id integer ,
	name varchar(10)
);
insert into DM_IDENTITY values ( 1, '����');
insert into DM_IDENTITY values ( 2, '�ɲ�');


/*���ʹ����*/
create table dm_type (
	id integer,
	name varchar(10)
);
insert into DM_TYPE values (1,'����');
insert into DM_TYPE values (2,'��');
insert into DM_TYPE values (3,'���⹤��');
insert into DM_TYPE values (4,'��ְ');


show databases;