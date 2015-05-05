set character_set_results=gbk;

set character_set_client=gbk;

drop database db_labor;

create database db_labor;

use db_labor;

create table t_person (
    serialNo varchar(15) not null primary key comment '��ˮ��',/*0*/
    number varchar(10) not null comment '���',/*1*/
    name varchar(20) not null comment '����',/*2*/
    sex integer not null comment '�Ա� 1-�� 2-Ů',/*3*/
    nation varchar(2) not null comment '����',/*4*/
    idNo varchar(18) comment '���֤��',/*5*/
    identity integer not null comment '��� 1-���� 2-�ɲ�',/*6*/
    borntime varchar(10) not null comment '������������',/*7*/
    jointime varchar(10) not null comment '�μӹ���ʱ��',/*8*/
    type integer not null comment '����',/*9*/
    approvetime varchar(10) not null comment '����ʱ��',/*10*/
    office integer not null comment '����',/*11*/
    acceptNo varchar(20) comment '������',/*12*/
    acceptTime varchar(10) not null comment '����ʱ��',/*13*/
	phonenumber varchar(15) comment '�绰',/*14*/
    remark varchar(50) comment '��ע',/*15*/
    approveperson varchar(2) not null comment '������Ա',/*16*/
    etirenum varchar(10) comment '���˺�',/*17*/
    company varchar(60) not null comment '��˾',/*18*/
    addtime varchar(16) comment '���ʱ��',/*19*/
    modtime varchar(16) comment '�޸�ʱ��',/*20*/
    ifuse varchar(1) comment '�Ƿ����� 1-���� 0-����',/*21*/
    ifcalculate varchar(1) comment '�Ƿ���� 1-���� 0-û��'/*22*/
);


/* ����ֶ��ж��Ƿ������⹤�� */
create table t_person_temp (
	serialNo varchar(13) NOT NULL PRIMARY KEY,/*��ˮ��*/
  	acceptNo varchar(16) ,/*������*/
  	idNo varchar(18),/*���֤��*/
  	name varchar(20) ,/*����*/
  	company varchar(60) ,/*��˾*/
  	office integer ,/*����*/
  	sex integer ,/*�Ա�*/
  	accepttime varchar(16),/*����ʱ��*/
  	phonenumber varchar(15),/*�绰*/
  	addtime varchar(16),/*���ʱ��*/
  	ifuse varchar(1),/*�Ƿ����� 1-���� 0-����*/
  	ifprint varchar(1)/*�Ƿ��ӡ 1-�Ѵ�ӡ 0-δ��ӡ*/
);



create table index_num (
	one int DEFAULT 1,
	two int DEFAULT 1,
	three int default 1,
	zhi int default 1,
	number int default 1,
	shoulinum int default 1
);

insert into index_num (one, two, three, zhi, number, shoulinum) values(0, 0, 0, 0, 0, 0);



create table sequence(
	Normal int DEFAULT 0,		/*����*/
	disease int DEFAULT 0,		/*����*/
	special int default 0,		/*���⹤��*/
	collapse int default 0,		/*�Ʋ�*/
	retirement int default 0,	/*��ְ*/
	zhuanzhi int default 0,		/*ת����ҵ*/
	number int default 0		/*����*/
);

insert into SEQUENCE (NORMAL, DISEASE, SPECIAL, zhuanzhi, collapse, retirement, NUMBER) values(0, 0, 0, 0, 0, 0, 0);


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