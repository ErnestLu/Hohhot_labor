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

public class dadan {
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

		

		
		
	
		
		
		
		
		remark = "3";
//		remark = "2";
//		remark = "1";
//		remark = "4";
//		,"2013-"
//		,"2013-12-30"
//		,"2013-01-30"
//		,"2013-04-30"
//		ȫ	444
		
//		
//		list.add(new Person("                ",3,1,"1953-","197",1,1,1,"����","ԭ"));
//		
//		list.add(new Person("                ",3,2,"1963-","198",1,1,1,"����","ԭ"));
//		
//		
//		list.add(new Person("                ",3,1,"195","197",1,3,1,"����","ԭ","2013-11-30"));
//		list.add(new Person("                ",3,2,"196","198",1,3,1,"����","ԭ","2013-11-30"));
		
		

		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
	
		


		
				

		

		

		

		
		



		

		
		
		
		

		

		

		
		

		

	

		


		

		
		
		

		

		

		
		
		


			
		

		
		
		
		
		
		remark = "3";
//		remark = "2";
//		remark = "1";
//		,"2013-01-30"
//		,"2013-04-30"
//		ȫ	444
//		list.add(new Person("                ",3,1,"1953-06","197",1,1,1,"����","ԭ"));
//		list.add(new Person("                ",3,1,"1953-05","197",1,1,1,"����","ԭ"));
//		list.add(new Person("                ",3,1,"1953-04","197",1,1,1,"����","ԭ"));
//		list.add(new Person("                ",3,1,"1953-03","197",1,1,1,"����","ԭ"));
//		list.add(new Person("                ",3,1,"1953-02","197",1,1,1,"����","ԭ"));
//		list.add(new Person("                ",3,1,"1953-01","197",1,1,1,"����","ԭ"));


//		list.add(new Person("                ",3,2,"1963-06","198",1,1,1,"����","ԭ"));
//		list.add(new Person("                ",3,2,"1963-05","198",1,1,1,"����","ԭ"));
//		list.add(new Person("                ",3,2,"1963-04","198",1,1,1,"����","ԭ"));
//		list.add(new Person("                ",3,2,"1963-03","198",1,1,1,"����","ԭ"));
//		list.add(new Person("                ",3,2,"1963-02","198",1,1,1,"����","ԭ"));
//		list.add(new Person("                ",3,2,"1963-01","198",1,1,1,"����","ԭ"));
		

		
//		list.add(new Person("                ",3,1,"1953-12","196",1,1,1,"����","ԭ","2013-12-30"));
//		list.add(new Person("                ",3,1,"1953-11","196",1,1,1,"����","ԭ","2013-11-30"));
//		list.add(new Person("                ",3,1,"1953-10","196",1,1,1,"����","ԭ","2013-10-30"));
//		list.add(new Person("                ",3,1,"1953-09","196",1,1,1,"����","ԭ","2013-09-30"));
//		list.add(new Person("                ",3,1,"1953-08","196",1,1,1,"����","ԭ","2013-08-30"));
//		list.add(new Person("                ",3,1,"1953-07","196",1,1,1,"����","ԭ","2013-07-30"));
//		list.add(new Person("                ",3,1,"1953-06","196",1,1,1,"����","ԭ","2013-06-30"));
//		list.add(new Person("                ",3,1,"1953-05","196",1,1,1,"����","ԭ","2013-05-30"));
//		list.add(new Person("                ",3,1,"1953-04","196",1,1,1,"����","ԭ","2013-04-30"));
//		list.add(new Person("                ",3,1,"1953-03","196",1,1,1,"����","ԭ","2013-03-30"));
//		list.add(new Person("                ",3,1,"1953-02","196",1,1,1,"����","ԭ","2013-02-28"));
//		list.add(new Person("                ",3,1,"1953-01","196",1,1,1,"����","ԭ","2013-01-30"));


//		list.add(new Person("                ",3,2,"1963-12","197",1,1,1,"����","ԭ","2013-12-30"));
//		list.add(new Person("                ",3,2,"1963-11","197",1,1,1,"����","ԭ","2013-11-30"));
//		list.add(new Person("                ",3,2,"1963-10","197",1,1,1,"����","ԭ","2013-10-30"));
//		list.add(new Person("                ",3,2,"1963-09","197",1,1,1,"����","ԭ","2013-09-30"));
//		list.add(new Person("                ",3,2,"1963-08","197",1,1,1,"����","ԭ","2013-08-30"));
//		list.add(new Person("                ",3,2,"1963-07","197",1,1,1,"����","ԭ","2013-07-30"));
//		list.add(new Person("                ",3,2,"1963-06","197",1,1,1,"����","ԭ","2013-06-30"));
//		list.add(new Person("                ",3,2,"1963-05","197",1,1,1,"����","ԭ","2013-05-30"));
//		list.add(new Person("                ",3,2,"1963-04","197",1,1,1,"����","ԭ","2013-04-30"));
//		list.add(new Person("                ",3,2,"1963-03","197",1,1,1,"����","ԭ","2013-03-30"));
//		list.add(new Person("                ",3,2,"1963-02","197",1,1,1,"����","ԭ","2013-02-28"));
//		list.add(new Person("                ",3,2,"1963-01","197",1,1,1,"����","ԭ","2013-01-30"));


//		list.add(new Person("                ",3,1,"195","197",1,3,1,"����","ԭ","2012-12-30"));
//		list.add(new Person("                ",3,2,"196","198",1,3,1,"����","ԭ","2012-12-30"));
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////
		
//		ȫ	3
//		list.add(new Person("                ",3,1,"1952-12","196",1,1,1,"","ԭ","2012-12-30"));
//		list.add(new Person("                ",3,1,"1952-11","196",1,1,1,"","ԭ","2012-11-30"));
		
		
//		list.add(new Person("                ",3,1,"1952-05","196",1,1,1,"","ԭ","2012-05-30"));
//		list.add(new Person("                ",3,1,"1952-04","196",1,1,1,"","ԭ","2012-04-30"));
//		list.add(new Person("                ",3,1,"1952-03","196",1,1,1,"","ԭ","2012-03-30"));
//		list.add(new Person("                ",3,1,"1952-02","196",1,1,1,"","ԭ","2012-02-28"));
//		list.add(new Person("                ",3,1,"1952-01","196",1,1,1,"","ԭ","2012-01-30"));

//		list.add(new Person("                ",3,2,"1962-05","197",1,1,1,"","ԭ","2012-05-30"));
//		list.add(new Person("                ",3,2,"1962-04","197",1,1,1,"","ԭ","2012-04-30"));
//		list.add(new Person("                ",3,2,"1962-03","197",1,1,1,"","ԭ","2012-03-30"));
//		list.add(new Person("                ",3,2,"1962-02","197",1,1,1,"","ԭ","2012-02-28"));
//		list.add(new Person("                ",3,2,"1962-01","197",1,1,1,"","ԭ","2012-01-30"));

//		list.add(new Person("                ",3,1,"195","197",1,3,1,"","ԭ","2010-12-30"));
//		list.add(new Person("                ",3,2,"196","198",1,3,1,"","ԭ","2010-12-30"));
	
///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
//		list.add(new Person("                ",1,1,"195","197",1,3,1,"����","����","2012-08-30"));
//		list.add(new Person("                ",1,2,"196","198",1,3,1,"����","����","2012-08-30"));
		
		
//		ȫ		1
//		list.add(new Person("                ",1,1,"1952-01","196",1,1,1,"����","����","2012-01-30"));
//		list.add(new Person("                ",1,1,"1952-02","196",1,1,1,"����","����","2012-02-28"));
//		list.add(new Person("                ",1,1,"1952-03","196",1,1,1,"����","����","2012-03-30"));
//		list.add(new Person("                ",1,1,"1952-04","196",1,1,1,"����","����","2012-04-30"));
//		list.add(new Person("                ",1,1,"1952-05","196",1,1,1,"����","����","2012-05-30"));
//		list.add(new Person("                ",1,1,"1952-06","196",1,1,1,"����","����","2012-06-30"));
//		list.add(new Person("                ",1,1,"1952-07","196",1,1,1,"����","����","2012-07-30"));
//		list.add(new Person("                ",1,1,"1952-08","196",1,1,1,"����","����","2012-08-30"));
//		list.add(new Person("                ",1,1,"1952-09","196",1,1,1,"����","����","2012-09-30"));
//		list.add(new Person("                ",1,1,"1952-10","196",1,1,1,"����","����","2012-10-30"));
//		list.add(new Person("                ",1,1,"1952-11","196",1,1,1,"����","����","2012-11-30"));
//		list.add(new Person("                ",1,1,"1952-12","196",1,1,1,"����","����","2012-12-30"));
		
		
//		list.add(new Person("                ",1,2,"1962-01","197",1,1,1,"����","����","2012-01-30"));
//		list.add(new Person("                ",1,2,"1962-02","197",1,1,1,"����","����","2012-02-28"));
//		list.add(new Person("                ",1,2,"1962-03","197",1,1,1,"����","����","2012-03-30"));
//		list.add(new Person("                ",1,2,"1962-04","197",1,1,1,"����","����","2012-04-30"));
//		list.add(new Person("                ",1,2,"1962-05","197",1,1,1,"����","����","2012-05-30"));
//		list.add(new Person("                ",1,2,"1962-06","197",1,1,1,"����","����","2012-06-30"));
//		list.add(new Person("                ",1,2,"1962-07","197",1,1,1,"����","����","2012-07-30"));
//		list.add(new Person("                ",1,2,"1962-08","197",1,1,1,"����","����","2012-08-30"));
//		list.add(new Person("                ",1,2,"1962-09","197",1,1,1,"����","����","2012-09-30"));
//		list.add(new Person("                ",1,2,"1962-10","197",1,1,1,"����","����","2012-10-30"));
//		list.add(new Person("                ",1,2,"1962-11","197",1,1,1,"����","����","2012-11-30"));
//		list.add(new Person("                ",1,2,"1962-12","197",1,1,1,"����","����","2012-12-30"));

		
//		list.add(new Person("                ",1,1,"195","197",1,3,1,"","ԭ","2013-06-30"));
//		list.add(new Person("                ",1,2,"196","198",1,3,1,"","ԭ","2013-06-30"));
		
//		list.add(new Person("                ",1,1,"1953-06","197",1,1,1,"����","����"));
//		list.add(new Person("                ",1,1,"1953-05","197",1,1,1,"����","����"));
//		list.add(new Person("                ",1,1,"1953-04","197",1,1,1,"����","����"));
//		list.add(new Person("                ",1,1,"1953-03","197",1,1,1,"����","����"));
//		list.add(new Person("                ",1,1,"1953-02","197",1,1,1,"����","����"));
//		list.add(new Person("                ",1,1,"1953-01","197",1,1,1,"����","����"));


//		list.add(new Person("                ",1,2,"1963-07","198",1,1,1,"����","����"));
//		list.add(new Person("                ",1,2,"1963-06","198",1,1,1,"����","����"));
//		list.add(new Person("                ",1,2,"1963-05","198",1,1,1,"����","����"));
//		list.add(new Person("                ",1,2,"1963-04","198",1,1,1,"����","����"));
//		list.add(new Person("                ",1,2,"1963-03","198",1,1,1,"����","����"));
//		list.add(new Person("                ",1,2,"1963-02","198",1,1,1,"����","����"));
//		list.add(new Person("                ",1,2,"1963-01","198",1,1,1,"����","����"));
		
		
//555		
		
//		,"2013-01-30"
//		remark = "1";
//		remark = "2";
		
		
		
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
////		shen.setTime(df1.parse("2009-11-30"));//����ʱ��
//		
//		if(person.getShenfen() == 2) {
//		
////			person.setBingNum(111);//���˺�
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