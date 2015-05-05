connect 'jdbc:derby://localhost:1527/db_labor;create=true;user=lufengming;password=yang1111';


connect 'jdbc:derby://localhost:1527/db_labor';



connect 'jdbc:derby://localhost:1527/db_labor;user=lufengming;password=yang1111';



drop table t_person;

create table t_person (
	num varchar(16) NOT NULL PRIMARY KEY,/*编号*/
  	id varchar(20) NOT NULL ,/*流水号*/
  	acceptNum varchar(16) not null unique,/*受理编号*/
  	name varchar(20) NOT NULL,/*姓名*/
  	company varchar(60) NOT NULL,/*公司*/
  	office integer NOT NULL,/*科室*/
  	sex integer NOT NULL,/*性别*/
  	borntime varchar(10) NOT NULL,/*出生年月*/
  	jointime varchar(10) NOT NULL,/*参加工作时间*/
  	identitys integer NOT NULL,/*身份*/
  	types integer NOT NULL,/*类型*/
  	servicetime  varchar(10) NOT NULL,/*受理时间*/
  	etirenum varchar(10),/*病退号*/
  	remark varchar(50)/*备注*/

);

alter table t_person add column addtime varchar(10);

alter table t_person add column modtime varchar(10);




select * from t_person where types = 3 ;

select * from T_PERSON;




/* insert into t_person  values (1,'周华健'); */

drop table sequence;

create table sequence(
	Normal int DEFAULT 1,
	disease int DEFAULT 1,
	special int default 1,
	number int default 1
);

alter table sequence add column collapse int;

alter table sequence add column retirement int;

/*ALTER TABLE customer ADD COLUMN fax c(20) NULL*/

insert into "LUFENGMING"."SEQUENCE" ("NORMAL", "DISEASE", "SPECIAL", "NUMBER") values(0, 0, 0, 0);



drop table index_num;

create table index_num (
	one int DEFAULT 1,
	two int DEFAULT 1,
	three int default 1,
	zhi int default 1,
	number int default 1
);

insert into index_num (one, two, three, zhi, number) values(0, 0, 0, 0, 0);



select * from T_PERSON t where t.ACCEPTNUM = '1210250158860023';

delete from T_PERSON where acceptNum = '1212120158860018';




drop table dm_office;

/*科室代码表*/
create table dm_office (
	id integer,
	name varchar(10)
);
insert into dm_office values (1,'业务一科');
insert into dm_office values (2,'业务二科');
insert into dm_office values (3,'业务三科');
insert into dm_office values (4,'直属科');



drop table dm_sex;

/*性别代码表*/
create table dm_sex (
	id integer,
	name varchar(10)
);
insert into DM_SEX values (1,'男');
insert into DM_SEX values (2,'女');


drop table dm_identity;

/*身份代码表*/
create table dm_identity (
	id integer ,
	name varchar(10)
);
insert into DM_IDENTITY values ( 1, '工人');
insert into DM_IDENTITY values ( 2, '干部');



drop table dm_type;
/*类型代码表*/
create table dm_type (
	id integer,
	name varchar(10)
);
insert into DM_TYPE values (1,'正常');
insert into DM_TYPE values (2,'因病');
insert into DM_TYPE values (3,'特殊工种');
insert into DM_TYPE values (4,'退职');




select * from t_person t where t.types = 4;






select count(*) from T_PERSON ;

select count(1) from T_PERSON where sex =1 ;

select count(1) from T_PERSON t where t.TYPES = 5;


delete from T_PERSON where acceptNum = '1206110158860090';

select * from T_PERSON t where t.NAME = '梁秀萍';

select * from T_PERSON t where t.ACCEPTNUM = '1108310158860007';

select * from T_PERSON t  order by t.ACCEPTNUM desc;

select * from T_PERSON t where t.TYPES = 4;


delete from T_PERSON  t where t.ADDTIME = '2011-11-10';

select * from T_PERSON t where t.ADDTIME = '2011-11-10' ;

select number from sequence;

select count(*) from T_PERSON ;

select count(1) from T_PERSON t where t.types = 5;


select count(1) from T_PERSON t where servicetime between ('2010-01-01') and ('2010-08-31') and t.types = 1;


select count(1) from T_PERSON t where servicetime between ('2010-01-01') and ('2010-10-31') and t.office = 3;

select count(1) from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') ;


select count(1) 全部 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') 
union
select count(1) 正常 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') and t.types = 1
union
select count(1) 病退 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') and t.types = 2
union
select count(1) 特殊工种 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') and t.types = 3
union
select count(1) 退职 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') and t.types = 4
union
select count(1) 破产 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') and t.types = 5;




select count(1) 全部     from T_PERSON t where addtime between ('2012-01-01') and ('2012-12-31') ;

select count(1) 正常     from T_PERSON t where addtime between ('2012-01-01') and ('2012-12-31') and t.types = 1;

select count(1) 病退     from T_PERSON t where addtime between ('2012-01-01') and ('2012-12-31') and t.types = 2;

select count(1) 特殊工种 from T_PERSON t where addtime between ('2012-01-01') and ('2012-12-31') and t.types = 3;

select count(1) 退职     from T_PERSON t where addtime between ('2012-01-01') and ('2012-12-31') and t.types = 4;

select count(1) 破产     from T_PERSON t where addtime between ('2012-01-01') and ('2012-12-31') and t.types = 5;




select count(1) from T_PERSON t where addtime between ('2012-01-01') and ('2012-10-31') and t.office = 1;

select count(1) from T_PERSON t where addtime between ('2012-01-01') and ('2012-10-31') and t.office = 2;

select count(1) from T_PERSON t where addtime between ('2012-01-01') and ('2012-10-31') and t.office = 3;

select count(1) from T_PERSON t where addtime between ('2012-01-01') and ('2012-10-31') and t.office = 4;


select count(1) 个体  	 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') and t.OFFICE = 3;

select count(1) 个体  	 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') and t.OFFICE = 4;



select count(1) 破产 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') and t.types = 5
union
select count(1) 退职 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') and t.types = 4
union
select count(1) 特殊工种 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') and t.types = 3
union
select count(1) 病退 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') and t.types = 2
union
select count(1) 正常 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') and t.types = 1
union
select count(1) 全部 from T_PERSON t where addtime between ('2011-01-01') and ('2011-12-31') ;



select count(1) from T_PERSON t where t.OFFICE = 4;



select * from T_PERSON t where t.ACCEPTNUM = '1206120158860147';

delete from T_PERSON where acceptNo = '1309090158860012';


select * from t_person where acceptNo = '1309090158860012';





select * from t_person t where  t.num =  '201260000000000' ;






select * from T_PERSON t where  t.types = 5;

select * from T_PERSON where servicetime between ('2009-12-01') and ('2009-12-31');



select count(0) from T_PERSON;


select count(0) from T_PERSON t where t.OFFICE in (3,4);


select * from T_PERSON t where t.id = 'Z01289';

delete from T_PERSON t where t.id = 'Z01289';


select * from dm_office;
select p.name,o.name from T_PERSON p left join DM_OFFICE o on p.OFFICE = o.ID;


select * from DM_SEX;
select p.name,s.name from T_PERSON p left join DM_SEX s on p.SEX = s.ID;



select * from DM_TYPE;

