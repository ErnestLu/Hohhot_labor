package com.labor.word;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.labor.util.Db_Util;

public class CreateList {

	
	public static void main(String[] args) {
		
		Db_Util db = Db_Util.getInstance();

		SimpleDateFormat dfYM = new SimpleDateFormat("yyyy-MM");
		SimpleDateFormat dfYMD = new SimpleDateFormat("yyyy-MM-dd");
		
		
		List<Person_Temp> list = db.getPersonTempList();
		
		Iterator<Person_Temp> it = list.iterator();
		
		//list.add(new Person("                ","19","19",1,1,1,"","",0,0));
		
		String str = "";
		
		Person_Temp person = new Person_Temp();
		
		
		while (it.hasNext() == true) {

			person = it.next();

			if (person.getIfprint().equals("0") && person.getIfuse().equals("1")) {

				str = "list.add(new Person(\"";

//				str += person.getIdNo() + "\",\"";
//
//				str += person.getIdNo().substring(6, 10) + "-"
//						+ person.getIdNo().substring(10, 12);
//
//				str += "\",\"19\",1,1,1,\"";
				
				
				str += person.getIdNo() + "\",\"19\",\"19\",1," + person.getIfSpecial() +",1,\"";

				
				str += person.getName() + "\",\"";

				if ("".equals(person.getCompany())) {
					str += person.getCompany() + "ԭ\",";
				} else {
					str += person.getCompany() + "\",";
				}
				

				if (person.getOffice() == 0) {
					str += "3" + ",";
				} else {
					str += String.valueOf(person.getOffice()) + ",";
				}
				
				str += String.valueOf(person.getSex());
				
				Calendar cal = Calendar.getInstance();  
//				calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE)); 
				
				if ("3".equals(person.getIfSpecial())) {
					str += ",\"" + dfYM.format(cal.getTime()) + "-30\"";
				}

				str += "));";
				
				System.out.println(str + "\n");

			}

		}
		
		
	}
	
	
	
}
