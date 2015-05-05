
select t.acceptNo '受理编号',
t.idNo '身份证号',
t.number '编号',
t.name '姓名',
case t.sex when 1 THEN '男' when 2 then '女' END AS '性别',
case t.office when '1' then '业务一科' when '2' then '业务二科' when '3' then '业务三科' 
when '4' then '直属科' END AS '科室',
t.company '单位',
t.borntime '出生年月',
t.jointime '参加工作时间',
case t.type when 1 then '正常退休' when 2 then '因病退休' when 3 then '特殊工种退休' 
when 4 then '因病退职' when 5 then '破产提前退休' when 6 then '转制退休' end as '退休类型',
w.accepttime as '受理时间',
case when t.type = '2' or t.type = '3' or t.type = '4' or t.type = '5'  then t.approvetime
else '' end as '特殊工种、病退等审批时间'
from t_person t  
left outer join t_person_temp w on t.acceptNo = w.acceptNo 
where t.ifuse = '1' and w.ifuse = '1'
order by t.acceptNo;