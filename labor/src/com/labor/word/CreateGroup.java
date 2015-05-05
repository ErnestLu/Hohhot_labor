package com.labor.word;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.labor.util.Db_Util;
import com.labor.util.WordUtil;
import com.lowagie.text.DocumentException;

public class CreateGroup {
	public static void main(String[] args) throws ParseException, DocumentException  {
		
		Calendar bron = Calendar.getInstance();
		Calendar join = Calendar.getInstance();
		Calendar shen = Calendar.getInstance();

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		
		List<Person> list = new ArrayList<Person>();
		
		String remark = "";
		
		
		Company comp = new Company();
		
		
		
		
		
		comp.setComp("���˹�˾");//��˾
		
		comp.setKesh(1);//���� 1-ҵ��һ�ƣ�2-ҵ����ƣ�3-ҵ�����ƣ�4-ֱ��
		
		comp.setSex(2);//�Ա� 1-�У�2-Ů
		
		comp.setType(1);//��� 1-���ˣ�2-�ɲ�
		
		comp.setShenfen(1);//���� 1-������2-���ˣ�3-���⹤�֣�4-��ְ�� 5-�Ʋ�
		
		shen.setTime(df1.parse("2010-01-30"));//����ʱ��
		
		comp.setShen(shen);
		
		comp.setExtra2("    ������д");



		
		


//�е�




//�Ѵ�



		
		
		
//		,"2014-04-30"
//		,"2014-11-30"

		
		
		remark = "3";
//		remark = "2";
//		remark = "1";
//		remark = "4";
//		,"2013-12-30"
//		,"2013-01-30"
//		,"2014-09-30"
//		,"2014-01-30"
//		ȫ	4444
		
		
//		list.add(new Person("                ",3,1,"1953-","197",1,3,1,"����","ԭ"));
//		
//		list.add(new Person("                ",3,2,"1963-","198",1,1,1,"����","ԭ"));
//		
//		
//		list.add(new Person("                ",3,1,"195","197",1,3,1,"����","ԭ","2013-12-30"));
//		list.add(new Person("                ",3,2,"196","198",1,3,1,"����","ԭ","2013-12-30"));
//		

///////////////////////////////////////////////////////////////////////////////////////////////////////

		
//6666

//		,"2013-06-30"
//		,"2013-12-30"
//		,"2014-04-30"
//		,"2014-08-30"
//		,"2014-01-30"
//		remark = "1";
//		remark = "2";
//		remark = "4";
//		
//		list.add(new Person("                ",1,1,"195","197",1,3,1,"����","����","2013-12-30"));
//		list.add(new Person("                ",1,2,"196","198",1,3,1,"����","����","2013-12-30"));
//		
//		list.add(new Person("                ",1,1,"1953-12","197",1,1,1,"����","����"));
//		
//		list.add(new Person("                ",1,2,"1963-12","198",1,1,1,"����","����"));

		
		
		

		
		
		Iterator<Person> it = list.iterator();
		
		
		CreateGroupWord gWord = new CreateGroupWord(); 
		
		Db_Util db = Db_Util.getInstance();
		
		WordUtil wUtil = WordUtil.getInstance();
		wUtil.wordOpen();
		
		boolean isHaveWorng = false;
		
		while(it.hasNext() && isHaveWorng == false) {
			Person person = it.next();
			
			if(remark != ""){
				person.setRemark(remark);
			}
			
			if (Util.check(person)) {
				db.addOnePerson(person);
				gWord.createDocContext(wUtil, person,it.hasNext());
			} else {
				isHaveWorng = true;
			}
		}
		
		if (isHaveWorng == false) {
			db.commit();
		}
		
		wUtil.wordClose();
		db.shutdown();
		
//TODO дWord
		
	
//		Calendar bron = Calendar.getInstance();
//		Calendar join = Calendar.getInstance();
//		Calendar shen = Calendar.getInstance();
//
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
//		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
//
//		Person person = new Person();
//
//		
//		
//		person.setId("0912210158860024             ");//���
//		person.setName("������");//����
//
//		person.setComp("�ڻ�����");//��˾
//		
//		person.setKesh(1);//���� 1-ҵ��һ�ƣ�2-ҵ����ƣ�3-ҵ�����ƣ�4-ֱ��
//
//
//		person.setSex(1);//�Ա� 1-�У�2-Ů
//		
//		
//		bron.setTime(df.parse("1949-12"));//��������
//		join.setTime(df.parse("1969-10"));//�μӹ���ʱ��
//		
//		
//		person.setType(1);//��� 1-���ˣ�2-�ɲ�
//		
//		person.setShenfen(1);//���� 1-������2-���ˣ�3-���⹤�֣�4-��ְ�� 5-�Ʋ�
//
//		
//
//		shen.setTime(df1.parse("2009-11-30"));//����ʱ��
//		
//		if(person.getShenfen() == 2) {
//		
//			person.setBingNum(111);//���˺�
//			
//		}
//
//		
//		person.setBorn(bron);
//		person.setJoin(join);
//		
//		person.setShen(shen);
//		
//		
//		
//		Db_Util db = Db_Util.getInstance();
//		db.insertStatement(person);
//		db.shutdown();
//
//		
//		CreateWord word = new CreateWord();
//		String file = "d:/demo1.doc";
//		
//		if (Util.check(person)) {
//			try {
//				word.createDocContext(file, person);
//			} catch (DocumentException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		
		
	}
}