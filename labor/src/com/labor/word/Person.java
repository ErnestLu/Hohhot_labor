package com.labor.word;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.labor.util.Db_Util;

public class Person {

	private SimpleDateFormat dfYM = new SimpleDateFormat("yyyy-MM");
	private SimpleDateFormat dfMD = new SimpleDateFormat("-MM-dd");
	private SimpleDateFormat dfYMD = new SimpleDateFormat("yyyy-MM-dd");

	public static int myId;

	/**
	 * 1.��ˮ��
	 */
	private String serialNo;
	
	
	/**
	 * 2.�������
	 */
	private String acceptNo;
	
	/**
	 * 3.����֤��
	 */
	private String idNo;

	/**
	 * 4.���
	 */
	private String number;

	/**
	 * 5.����
	 */
	private String name;

	/**
	 * 6.��˾
	 */
	private String company;

	/**
	 * 7.����
	 */
	private int office;

	/**
	 * 8.�Ա�
	 */
	private int sex;

	/**
	 * 9.��������
	 */
	private Calendar born = Calendar.getInstance();

	/**
	 * 10.�μӹ���ʱ��
	 */
	private Calendar join = Calendar.getInstance();

	/**
	 * 11.����
	 */
	private int identity;

	/**
	 * 12.����
	 */
	private int type;

	/**
	 * 13.����ʱ��
	 */
	private Calendar approveTime;

	/**
	 * 14.����
	 */
	private int nation;

	/**
	 * 15.���˱��
	 */
	private String bingNum;
	
	
	/**
	 * 18.�绰
	 */
	private String phonenumber;
	
	

	/**
	 * 19.��ע
	 */
	private String remark = "";

	/**
	 * �˼���ʼʱ��
	 */
	private Calendar cutbegin = Calendar.getInstance();

	/**
	 * �˼�����ʱ��
	 */
	private Calendar cutend = Calendar.getInstance();

	/**
	 * ������Ϣ1
	 */
	// private String extra1 = "    2009��12����ִ�й���";
	private String extra1 = "";

	/**
	 * ������Ϣ2
	 */
	private String extra2 = "    ������д";

	/**
	 * 1.��ˮ��
	 */
	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	/**
	 * 2.�������
	 */
	public String getAcceptNo() {
		return acceptNo;
	}
	
	public void setAcceptNo(String id) {
		this.acceptNo = id.trim();
	}
	
	
	/**
	 * 3.����֤��
	 */
	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}


	/**
	 * 4.���
	 */
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	

	/**
	 * 5.����
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.trim();
	}

	/**
	 * 6.��˾
	 */
	public String getCompany() {
		return company;
	}

	public void setCompany(String comp) {
		this.company = comp.trim();
	}

	/**
	 * 7.���� 1-ҵ��һ�ƣ�2-ҵ����ƣ�3-ҵ�����ƣ�4-ֱ��
	 */
	public int getOffice() {
		return office;
	}

	public void setOffice(int kesh) {
		this.office = kesh;
	}

	
	
	/**
	 * 8.�Ա� 1-�У�2-Ů
	 */
	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * 9.��������
	 */
	public Calendar getBorn() {
		return born;
	}

	public void setBorn(Calendar born) {
		this.born = born;
	}

	/**
	 * 10.�μӹ���ʱ��
	 */
	public Calendar getJoin() {
		return join;
	}

	public void setJoin(Calendar join) {
		this.join = join;
	}

	/**
	 * 11.���� 1-���ˣ�2-�ɲ�
	 */
	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}
	


	/**
	 * 12.���� 1-������2-���ˣ�3-���⹤��
	 *        4-��ְ��5-�Ʋ�
	 */
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	

	/**
	 * 13.����ʱ��
	 */
	public Calendar getApproveTime() {
		return approveTime;
	}

	public void setApproveTime(Calendar approveTime) {
		this.approveTime = approveTime;
	}


	/**
	 * 14.����
	 */
	public int getNation() {
		return nation;
	}

	public void setNation(int nation) {
		this.nation = nation;
	}

	/**
	 * 15.���˱��
	 */
	public String getBingNum() {
		return bingNum;
	}

	public void setBingNum(String bingNum) {
		this.bingNum = bingNum;
	}

	
	/**
	 * 18.�绰
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * 19.��ע
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public String getExtra1() {
		return extra1;
	}

	public void setExtra1(String extra1) {
		this.extra1 = extra1;
	}

	public String getExtra2() {
		return extra2;
	}

	public void setExtra2(String extra2) {
		this.extra2 = extra2;
	}

	public Calendar getCutbegin() {
		return cutbegin;
	}

	public void setCutbegin(Calendar cutbegin) {
		this.cutbegin = cutbegin;
	}

	public Calendar getCutend() {
		return cutend;
	}

	public void setCutend(Calendar cutend) {
		this.cutend = cutend;
	}
	
	public Person() {
		
	}
	
	
//	/**
//	 * 
//	 * @param id
//	 * @param name
//	 * @param born
//	 * @param join
//	 * @param com
//	 * @throws ParseException
//	 */
//	public Person(String id, String name, String born, String join, Company com)
//			throws ParseException {
//		setAcceptNo(id);
//		setName(name);
//		setOffice(com.getKesh());
//		setCompany(com.getComp());
//
//		setIdentity(com.getType());
//		setType(com.getShenfen());
//		setSex(com.getSex());
//
//		setExtra2(com.getExtra2());
//
//		Calendar bron1 = Calendar.getInstance();
//		Calendar join1 = Calendar.getInstance();
//
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
//
//		bron1.setTime(df.parse(born));// ��������
//		join1.setTime(df.parse(join));// �μӹ���ʱ��
//
//		setBorn(bron1);
//		setJoin(join1);
//		// this.bingNum = bingNum;
//
//		setApproveTime(com.getShen());
//
//	}

//	public Person(String id, String name, String born, String join,
//			String shen, Company com) throws ParseException {
//		setAcceptNo(id);
//		setName(name);
//		setOffice(com.getKesh());
//		setCompany(com.getComp());
//
//		setIdentity(com.getType());
//		setType(com.getShenfen());
//		setSex(com.getSex());
//
//		Calendar bron1 = Calendar.getInstance();
//		Calendar join1 = Calendar.getInstance();
//		Calendar shen1 = Calendar.getInstance();
//
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
//		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
//
//		bron1.setTime(df.parse(born));// ��������
//		join1.setTime(df.parse(join));// �μӹ���ʱ��
//
//		if (!("".equals(shen) || shen == null)) {
//			shen1.setTime(df1.parse(shen));// ����ʱ��
//		}
//
//		setBorn(bron1);
//		setJoin(join1);
//		setApproveTime(shen1);
//		// this.bingNum = bingNum;
//
//	}



	/**
	 * ���� û����ʱ��  1
	 * @param idNo
	 * @param born
	 * @param join
	 * @param identity
	 * @param type
	 * @param nation
	 * @param name
	 * @param comp
	 * @param kesh
	 * @param sex
	 * @throws ParseException 
	 */
	public Person(String idNo, String born, String join, int identity,
			int type, int nation, String name, String comp, int kesh, int sex) throws ParseException {

		Db_Util db = Db_Util.getInstance();

		db.getPersonTempById(idNo, this);
		
		
		Calendar shen2 = Calendar.getInstance();
		shen2.setTime(this.getApproveTime().getTime());
		
		
		setIdentity(identity);
		setType(type);
		setNation(nation);

		Calendar bron1 = Calendar.getInstance();
		Calendar join1 = Calendar.getInstance();
		Calendar shen1 = Calendar.getInstance();


		bron1.setTime(dfYM.parse(born));// ��������
		join1.setTime(dfYM.parse(join));// �μӹ���ʱ��


		setBorn(bron1);
		setJoin(join1);

		
		if (!"".equals(name)) {
			setName(name);
		}
		
		if (!"".equals(comp)) {
			setCompany(comp);
		}
		
		if (kesh != 0) {
			setOffice(kesh);
		}
		
		if (sex != 0) {
			setSex(sex);
		}
		
		
		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
		setApproveTime(shen1);
		
		
		if (this.getType() ==1 && this.getCompany().matches("����")) {
			setApproveTime(shen2);
		}
		
	}
	
	
	/**
	 * ���� ������ʱ�� 1
	 * @param idNo
	 * @param born
	 * @param join
	 * @param identity
	 * @param type
	 * @param nation
	 * @param name
	 * @param comp
	 * @param kesh
	 * @param sex
	 * @throws ParseException 
	 */
	public Person(String idNo, String born, String join, int identity,
			int type, int nation, String name, String comp, int kesh, int sex, String shen) throws ParseException {

		Db_Util db = Db_Util.getInstance();

		db.getPersonTempById(idNo, this);
		
		
		
		setIdentity(identity);
		setType(type);
		setNation(nation);

		Calendar bron1 = Calendar.getInstance();
		Calendar join1 = Calendar.getInstance();
		Calendar shen1 = Calendar.getInstance();


		bron1.setTime(dfYM.parse(born));// ��������
		join1.setTime(dfYM.parse(join));// �μӹ���ʱ��


		setBorn(bron1);
		setJoin(join1);

//		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
//		setApproveTime(shen1);
		
		if (!"".equals(name)) {
			setName(name);
		}
		
		if (!"".equals(comp)) {
			setCompany(comp);
		}
		
		if (kesh != 0) {
			setOffice(kesh);
		}
		
		if (sex != 0) {
			setSex(sex);
		}
		
		
//		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
//		setApproveTime(shen1);
		
		
		if (!("".equals(shen) || shen == null)) {
			shen1.setTime(dfYMD.parse(shen));// ����ʱ��
		}


		setBorn(bron1);
		setJoin(join1);
		setApproveTime(shen1);
	}
	
	
	/**
	 * �Ӻ˼�  û�� ����ʱ�� 1
	 * @param idNo
	 * @param born
	 * @param join
	 * @param identity
	 * @param type
	 * @param nation
	 * @param name
	 * @param comp
	 * @param kesh
	 * @param sex
	 * @throws ParseException 
	 */
	public Person(String idNo, String born, String join, int identity,
			int type, int nation, String cutbej, String cunen,String name, String comp, int kesh, int sex) throws ParseException {

		
		
		
		Db_Util db = Db_Util.getInstance();

		db.getPersonTempById(idNo, this);
		
		
		
		setIdentity(identity);
		setType(type);
		setNation(nation);

		Calendar bron1 = Calendar.getInstance();
		Calendar join1 = Calendar.getInstance();
		Calendar shen1 = Calendar.getInstance();


		bron1.setTime(dfYM.parse(born));// ��������
		join1.setTime(dfYM.parse(join));// �μӹ���ʱ��


		setBorn(bron1);
		setJoin(join1);

		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
		setApproveTime(shen1);
		
		if (!"".equals(name)) {
			setName(name);
		}
		
		if (!"".equals(comp)) {
			setCompany(comp);
		}
		
		if (kesh != 0) {
			setOffice(kesh);
		}
		
		if (sex != 0) {
			setSex(sex);
		}
		
		
		Calendar cutbejin = Calendar.getInstance();
		Calendar cutend = Calendar.getInstance();
		
		cutbejin.setTime(dfYM.parse(cutbej));// �˼���ʼʱ��
		cutend.setTime(dfYM.parse(cunen)); // �˼�����ʱ��
		
		setCutbegin(cutbejin);
		setCutend(cutend);
		
				
//		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
//		setApproveTime(shen1);
		
		
	}
	
	
	
	/**
	 * �Ӻ˼�  �� ����ʱ�� 1
	 * @param idNo
	 * @param born
	 * @param join
	 * @param identity
	 * @param type
	 * @param nation
	 * @param name
	 * @param comp
	 * @param kesh
	 * @param sex
	 * @throws ParseException 
	 */
	public Person(String idNo, String born, String join, int identity,
			int type, int nation, String cutbej, String cunen,String name, String comp, int kesh, int sex, String shen) throws ParseException {

		
		
		
		Db_Util db = Db_Util.getInstance();

		db.getPersonTempById(idNo, this);
		
		
		
		setIdentity(identity);
		setType(type);
		setNation(nation);

		Calendar bron1 = Calendar.getInstance();
		Calendar join1 = Calendar.getInstance();
		Calendar shen1 = Calendar.getInstance();


		bron1.setTime(dfYM.parse(born));// ��������
		join1.setTime(dfYM.parse(join));// �μӹ���ʱ��


		setBorn(bron1);
		setJoin(join1);

		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
		setApproveTime(shen1);
		
		if (!"".equals(name)) {
			setName(name);
		}
		
		if (!"".equals(comp)) {
			setCompany(comp);
		}
		
		if (kesh != 0) {
			setOffice(kesh);
		}
		
		if (sex != 0) {
			setSex(sex);
		}
		
		
		Calendar cutbejin = Calendar.getInstance();
		Calendar cutend = Calendar.getInstance();
		
		cutbejin.setTime(dfYM.parse(cutbej));// �˼���ʼʱ��
		cutend.setTime(dfYM.parse(cunen)); // �˼�����ʱ��
		
		setCutbegin(cutbejin);
		setCutend(cutend);
		
				
//		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
//		setApproveTime(shen1);
		
		
		if (!("".equals(shen) || shen == null)) {
			shen1.setTime(dfYMD.parse(shen));// ����ʱ��
		}
		
	}
	
	
	/**
	 * �Ӳ��� �� ����ʱ�� 1
	 * @param idNo
	 * @param born
	 * @param join
	 * @param identity
	 * @param type
	 * @param nation
	 * @param name
	 * @param comp
	 * @param kesh
	 * @param sex
	 * @throws ParseException 
	 */
	public Person(String idNo, String born, String join, int identity,
			int type, String BingNum, int nation, String name, String comp, int kesh, int sex, String shen) throws ParseException {

		Db_Util db = Db_Util.getInstance();

		db.getPersonTempById(idNo, this);
		
		
		
		setIdentity(identity);
		setType(type);
		setNation(nation);
		
		setBingNum(BingNum);

		Calendar bron1 = Calendar.getInstance();
		Calendar join1 = Calendar.getInstance();
		Calendar shen1 = Calendar.getInstance();


		bron1.setTime(dfYM.parse(born));// ��������
		join1.setTime(dfYM.parse(join));// �μӹ���ʱ��


		setBorn(bron1);
		setJoin(join1);

		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
		setApproveTime(shen1);
		
		if (!"".equals(name)) {
			setName(name);
		}
		
		if (!"".equals(comp)) {
			setCompany(comp);
		}
		
		if (kesh != 0) {
			setOffice(kesh);
		}
		
		if (sex != 0) {
			setSex(sex);
		}
		
		
		
		
		
		if (!("".equals(shen) || shen == null)) {
			shen1.setTime(dfYMD.parse(shen));// ����ʱ��
		}
//		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
		setApproveTime(shen1);
	}
	
	
	
	
	/**
	 * �Ӳ��� �Ӻ˼� �� ����ʱ�� 1
	 * @param idNo
	 * @param born
	 * @param join
	 * @param identity
	 * @param type
	 * @param nation
	 * @param name
	 * @param comp
	 * @param kesh
	 * @param sex
	 * @throws ParseException 
	 */
	public Person(String idNo, String born, String join, int identity,
			int type, String BingNum, int nation, String cutbej,
			String cunen, String name, String comp, int kesh, int sex, String shen) throws ParseException {

		Db_Util db = Db_Util.getInstance();

		db.getPersonTempById(idNo, this);
		
		
		
		setIdentity(identity);
		setType(type);
		setNation(nation);
		
		setBingNum(BingNum);

		Calendar bron1 = Calendar.getInstance();
		Calendar join1 = Calendar.getInstance();
		Calendar shen1 = Calendar.getInstance();


		bron1.setTime(dfYM.parse(born));// ��������
		join1.setTime(dfYM.parse(join));// �μӹ���ʱ��


		setBorn(bron1);
		setJoin(join1);

		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
		setApproveTime(shen1);
		
		if (!"".equals(name)) {
			setName(name);
		}
		
		if (!"".equals(comp)) {
			setCompany(comp);
		}
		
		if (kesh != 0) {
			setOffice(kesh);
		}
		
		if (sex != 0) {
			setSex(sex);
		}
		
		Calendar cutbejin = Calendar.getInstance();
		Calendar cutend = Calendar.getInstance();
		
		cutbejin.setTime(dfYM.parse(cutbej));// �˼���ʼʱ��
		cutend.setTime(dfYM.parse(cunen)); // �˼�����ʱ��
		
		setCutbegin(cutbejin);
		setCutend(cutend);
		
		if (!("".equals(shen) || shen == null)) {
			shen1.setTime(dfYMD.parse(shen));// ����ʱ��
		}
//		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
		setApproveTime(shen1);
	}


//	/**
//	 * ����
//	 * 
//	 * @param acceptNo
//	 *            �������
//	 * @param kesh
//	 *            ����
//	 * @param sex
//	 *            �Ա�
//	 * @param born
//	 *            ��������
//	 * @param join
//	 *            �μӹ���ʱ��
//	 * @param identity
//	 *            ����
//	 * @param type
//	 *            ����
//	 * @param name
//	 *            ����
//	 * @param comp
//	 *            ��˾
//	 * @param shen
//	 *            ����ʱ��
//	 * @throws ParseException
//	 */
//	public Person(String acceptNo, int kesh, int sex, String born, String join,
//			int identity, int type, int nation, String name, String comp,
//			String shen) throws ParseException {
//		setAcceptNo(acceptNo);
//		setName(name);
//		setOffice(kesh);
//		setCompany(comp);
//		setIdentity(identity);
//		setType(type);
//		setSex(sex);
//		setNation(nation);
//
//		Calendar bron1 = Calendar.getInstance();
//		Calendar join1 = Calendar.getInstance();
//		Calendar shen1 = Calendar.getInstance();
//
//		bron1.setTime(dfYM.parse(born));// ��������
//		join1.setTime(dfYM.parse(join));// �μӹ���ʱ��
//
//		if (!("".equals(shen) || shen == null)) {
//			shen1.setTime(dfYMD.parse(shen));// ����ʱ��
//		}
//
//		setBorn(bron1);
//		setJoin(join1);
//		setApproveTime(shen1);
//	}
//
//	
//	/**
//	 * ���� û�� ����ʱ��
//	 * 
//	 * @param acceptNo
//	 *            �������
//	 * @param kesh
//	 *            ����
//	 * @param sex
//	 *            �Ա�
//	 * @param born
//	 *            ��������
//	 * @param join
//	 *            �μӹ���ʱ��
//	 * @param identity
//	 *            ����
//	 * @param type
//	 *            ����
//	 * @param name
//	 *            ����
//	 * @param comp
//	 *            ��˾
//	 * @param shen
//	 *            ����ʱ��
//	 * @throws ParseException
//	 */
//	public Person(String acceptNo, int kesh, int sex, String born, String join,
//			int identity, int type, int nation, String name, String comp) throws ParseException {
//		setAcceptNo(acceptNo);
//		setName(name);
//		setOffice(kesh);
//		setCompany(comp);
//		setIdentity(identity);
//		setType(type);
//		setSex(sex);
//		setNation(nation);
//
//		Calendar bron1 = Calendar.getInstance();
//		Calendar join1 = Calendar.getInstance();
//		Calendar shen1 = Calendar.getInstance();
//
//
//		bron1.setTime(dfYM.parse(born));// ��������
//		join1.setTime(dfYM.parse(join));// �μӹ���ʱ��
//
////		if (!("".equals(shen) || shen == null)) {
////			shen1.setTime(df1.parse(shen));// ����ʱ��
////		}
//
//
//		setBorn(bron1);
//		setJoin(join1);
////		System.out.println(Util.getRetireYear(this) + dfMD.format(bron1.getTime()));
//
//		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
//		setApproveTime(shen1);
//	}
	
	

//	/**
//	 * �Ӻ˼�
//	 * 
//	 * @param id
//	 *            �������
//	 * @param kesh
//	 *            ����
//	 * @param sex
//	 *            �Ա�
//	 * @param born
//	 *            ��������
//	 * @param join
//	 *            �μӹ���ʱ��
//	 * @param type
//	 *            ����
//	 * @param shenfen
//	 *            ����
//	 * @param name
//	 *            ����
//	 * @param comp
//	 *            ��˾
//	 * @param shen
//	 *            ����ʱ��
//	 * @throws ParseException
//	 */
//	public Person(String id, int kesh, int sex, String born, String join,
//			int type, int shenfen, int nation, String cutbej, String cunen,
//			String name, String comp, String shen) throws ParseException {
//		setAcceptNo(id);
//		setName(name);
//		setOffice(kesh);
//		setCompany(comp);
//		setIdentity(type);
//		setType(shenfen);
//		setSex(sex);
//		setNation(nation);
//
//		Calendar bron1 = Calendar.getInstance();
//		Calendar join1 = Calendar.getInstance();
//		Calendar shen1 = Calendar.getInstance();
//
//		Calendar cutbejin = Calendar.getInstance();
//		Calendar cutend = Calendar.getInstance();
//
//		bron1.setTime(dfYM.parse(born));// ��������
//		join1.setTime(dfYM.parse(join));// �μӹ���ʱ��
//
//		cutbejin.setTime(dfYM.parse(cutbej));// �˼���ʼʱ��
//		cutend.setTime(dfYM.parse(cunen)); // �˼�����ʱ��
//
//		if (!("".equals(shen) || shen == null)) {
//			shen1.setTime(dfYMD.parse(shen));// ����ʱ��
//		}
//
//		setBorn(bron1);
//		setJoin(join1);
//		setApproveTime(shen1);
//
//		setCutbegin(cutbejin);
//		setCutend(cutend);
//	}
	
	
	
	
//	/**
//	 * �Ӻ˼�  û������ʱ��
//	 * 
//	 * @param id
//	 *            �������
//	 * @param kesh
//	 *            ����
//	 * @param sex
//	 *            �Ա�
//	 * @param born
//	 *            ��������
//	 * @param join
//	 *            �μӹ���ʱ��
//	 * @param type
//	 *            ����
//	 * @param shenfen
//	 *            ����
//	 * @param name
//	 *            ����
//	 * @param comp
//	 *            ��˾
//	 * @param shen
//	 *            ����ʱ��
//	 * @throws ParseException
//	 */
//	public Person(String id, int kesh, int sex, String born, String join,
//			int type, int shenfen, int nation, String cutbej, String cunen,
//			String name, String comp) throws ParseException {
//		setAcceptNo(id);
//		setName(name);
//		setOffice(kesh);
//		setCompany(comp);
//		setIdentity(type);
//		setType(shenfen);
//		setSex(sex);
//		setNation(nation);
//
//		Calendar bron1 = Calendar.getInstance();
//		Calendar join1 = Calendar.getInstance();
//		Calendar shen1 = Calendar.getInstance();
//
//		Calendar cutbejin = Calendar.getInstance();
//		Calendar cutend = Calendar.getInstance();
//
//		bron1.setTime(dfYM.parse(born));// ��������
//		join1.setTime(dfYM.parse(join));// �μӹ���ʱ��
//
//		cutbejin.setTime(dfYM.parse(cutbej));// �˼���ʼʱ��
//		cutend.setTime(dfYM.parse(cunen)); // �˼�����ʱ��
//
////		if (!("".equals(shen) || shen == null)) {
////			shen1.setTime(df1.parse(shen));// ����ʱ��
////		}
//
//		setBorn(bron1);
//		setJoin(join1);
//		
//		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
//		setApproveTime(shen1);
//
//		setCutbegin(cutbejin);
//		setCutend(cutend);
//	}
	
	

//	/**
//	 * �Ӳ���
//	 * 
//	 * @param id
//	 *            �������
//	 * @param kesh
//	 *            ����
//	 * @param sex
//	 *            �Ա�
//	 * @param born
//	 *            ��������
//	 * @param join
//	 *            �μӹ���ʱ��
//	 * @param type
//	 *            ����
//	 * @param shenfen
//	 *            ����
//	 * @param name
//	 *            ����
//	 * @param comp
//	 *            ��˾
//	 * @param shen
//	 *            ����ʱ��
//	 * @throws ParseException
//	 */
//	public Person(String id, int kesh, int sex, String born, String join,
//			int type, int shenfen, String BingNum, int nation, String name,
//			String comp, String shen) throws ParseException {
//		setAcceptNo(id);
//		setName(name);
//		setOffice(kesh);
//		setCompany(comp);
//		setIdentity(type);
//		setType(shenfen);
//		setSex(sex);
//		setNation(nation);
//
//		setBingNum(BingNum);
//
//		Calendar bron1 = Calendar.getInstance();
//		Calendar join1 = Calendar.getInstance();
//		Calendar shen1 = Calendar.getInstance();
//
//
//		bron1.setTime(dfYM.parse(born));// ��������
//		join1.setTime(dfYM.parse(join));// �μӹ���ʱ��
//
//		if (!("".equals(shen) || shen == null)) {
//			shen1.setTime(dfYMD.parse(shen));// ����ʱ��
//		}
//
//		setBorn(bron1);
//		setJoin(join1);
//		setApproveTime(shen1);
//	}
	
	
	
	
//	/**
//	 * �Ӳ��� �Ӻ˼�
//	 * 
//	 * @param id
//	 *            �������
//	 * @param kesh
//	 *            ����
//	 * @param sex
//	 *            �Ա�
//	 * @param born
//	 *            ��������
//	 * @param join
//	 *            �μӹ���ʱ��
//	 * @param type
//	 *            ����
//	 * @param shenfen
//	 *            ����
//	 * @param name
//	 *            ����
//	 * @param comp
//	 *            ��˾
//	 * @param shen
//	 *            ����ʱ��
//	 * @throws ParseException
//	 */
//	public Person(String id, int kesh, int sex, String born, String join,
//			int type, int shenfen, String BingNum, int nation, String cutbej,
//			String cunen, String name, String comp, String shen)
//			throws ParseException {
//		setAcceptNo(id);
//		setName(name);
//		setOffice(kesh);
//		setCompany(comp);
//		setIdentity(type);
//		setType(shenfen);
//		setSex(sex);
//		setNation(nation);
//
//		setBingNum(BingNum);
//
//		Calendar bron1 = Calendar.getInstance();
//		Calendar join1 = Calendar.getInstance();
//		Calendar shen1 = Calendar.getInstance();
//
//		bron1.setTime(dfYM.parse(born));// ��������
//		join1.setTime(dfYM.parse(join));// �μӹ���ʱ��
//		
//		
//		Calendar cutbejin = Calendar.getInstance();
//		Calendar cutend = Calendar.getInstance();
//
//		cutbejin.setTime(dfYM.parse(cutbej));// �˼���ʼʱ��
//		cutend.setTime(dfYM.parse(cunen)); // �˼�����ʱ��
//
//
//		if (!("".equals(shen) || shen == null)) {
//			shen1.setTime(dfYMD.parse(shen));// ����ʱ��
//		}
//
//		setBorn(bron1);
//		setJoin(join1);
//		setApproveTime(shen1);
//		
//		
//		setCutbegin(cutbejin);
//		setCutend(cutend);
//	}
	
	
	
	
//	/**
//	 * �Ӳ���  û������ʱ��
//	 * 
//	 * @param id
//	 *            �������
//	 * @param kesh
//	 *            ����
//	 * @param sex
//	 *            �Ա�
//	 * @param born
//	 *            ��������
//	 * @param join
//	 *            �μӹ���ʱ��
//	 * @param type
//	 *            ����
//	 * @param shenfen
//	 *            ����
//	 * @param name
//	 *            ����
//	 * @param comp
//	 *            ��˾
//	 * @param shen
//	 *            ����ʱ��
//	 * @throws ParseException
//	 */
//	public Person(String id, int kesh, int sex, String born, String join,
//			int type, int shenfen, String BingNum, int nation, String name,
//			String comp) throws ParseException {
//		setAcceptNo(id);
//		setName(name);
//		setOffice(kesh);
//		setCompany(comp);
//		setIdentity(type);
//		setType(shenfen);
//		setSex(sex);
//		setNation(nation);
//
//		setBingNum(BingNum);
//
//		Calendar bron1 = Calendar.getInstance();
//		Calendar join1 = Calendar.getInstance();
//		Calendar shen1 = Calendar.getInstance();
//
////		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
////		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
//
//		bron1.setTime(dfYM.parse(born));// ��������
//		join1.setTime(dfYM.parse(join));// �μӹ���ʱ��
//
////		if (!("".equals(shen) || shen == null)) {
////			shen1.setTime(df1.parse(shen));// ����ʱ��
////		}
//
//		setBorn(bron1);
//		setJoin(join1);
//		
//		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
//		setApproveTime(shen1);
//	}
	
	

//	/**
//	 * @param id
//	 *            �������
//	 * @param kesh
//	 *            ����
//	 * @param sex
//	 *            �Ա�
//	 * @param born
//	 *            ��������
//	 * @param join
//	 *            �μӹ���ʱ��
//	 * @param type
//	 *            ����
//	 * @param shenfen
//	 *            ����
//	 * @param name
//	 *            ����
//	 * @param comp
//	 *            ��˾
//	 * @param shen
//	 *            ����ʱ��
//	 * @throws ParseException
//	 */
//	public Person(String id, int kesh, int sex, String born, String join,
//			int type, int shenfen, String name, String comp, String shen)
//			throws ParseException {
//		setAcceptNo(id);
//		setName(name);
//		setOffice(kesh);
//		setCompany(comp);
//		setIdentity(type);
//		setType(shenfen);
//		setSex(sex);
//
//		Calendar bron1 = Calendar.getInstance();
//		Calendar join1 = Calendar.getInstance();
//		Calendar shen1 = Calendar.getInstance();
//
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");
//		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
//
//		bron1.setTime(df.parse(born));// ��������
//		join1.setTime(df.parse(join));// �μӹ���ʱ��
//
//		if (!("".equals(shen) || shen == null)) {
//			shen1.setTime(df1.parse(shen));// ����ʱ��
//		}
//
//		setBorn(bron1);
//		setJoin(join1);
//		setApproveTime(shen1);
//	}

	
	
	@Override
	public String toString() {
		
		
		SimpleDateFormat dfYMD = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dfYM = new SimpleDateFormat("yyyy-MM");
		
		System.out.println("");
		System.out.println("��ˮ�ţ�" + getSerialNo());
		
		System.out.println("������ţ�" + getAcceptNo());
		
		System.out.println("����֤�ţ�" + getIdNo());
		
		System.out.println("������" + getName());
		
		
		
		System.out.println("��λ���ƣ�" + getCompany());
		
		System.out.println("���ң�" + getOffice());
		
		System.out.println("�Ա�" + getSex());
		
//		System.out.println("����ʱ�䣺" + dfYMD.format(get().getTime()));
		
		System.out.println("�绰��" + getPhonenumber());
		
		
		String born = dfYM.format(getBorn());
		
		String join = dfYM.format(getJoin());
		
		System.out.println("�������£�" + born);
		
		System.out.println("�μӹ���ʱ�䣺" + join);
		
		
		return "";
	}
	
}