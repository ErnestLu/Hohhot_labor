
select t.acceptNo '������',
t.idNo '���֤��',
t.number '���',
t.name '����',
case t.sex when 1 THEN '��' when 2 then 'Ů' END AS '�Ա�',
case t.office when '1' then 'ҵ��һ��' when '2' then 'ҵ�����' when '3' then 'ҵ������' 
when '4' then 'ֱ����' END AS '����',
t.company '��λ',
t.borntime '��������',
t.jointime '�μӹ���ʱ��',
case t.type when 1 then '��������' when 2 then '������' when 3 then '���⹤������' 
when 4 then '����ְ' when 5 then '�Ʋ���ǰ����' when 6 then 'ת������' end as '��������',
w.accepttime as '����ʱ��',
case when t.type = '2' or t.type = '3' or t.type = '4' or t.type = '5'  then t.approvetime
else '' end as '���⹤�֡����˵�����ʱ��'
from t_person t  
left outer join t_person_temp w on t.acceptNo = w.acceptNo 
where t.ifuse = '1' and w.ifuse = '1'
order by t.acceptNo;