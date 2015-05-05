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
	 * 1.流水号
	 */
	private String serialNo;
	
	
	/**
	 * 2.受理编号
	 */
	private String acceptNo;
	
	/**
	 * 3.身份证号
	 */
	private String idNo;

	/**
	 * 4.编号
	 */
	private String number;

	/**
	 * 5.姓名
	 */
	private String name;

	/**
	 * 6.公司
	 */
	private String company;

	/**
	 * 7.科室
	 */
	private int office;

	/**
	 * 8.性别
	 */
	private int sex;

	/**
	 * 9.出生年月
	 */
	private Calendar born = Calendar.getInstance();

	/**
	 * 10.参加工作时间
	 */
	private Calendar join = Calendar.getInstance();

	/**
	 * 11.身份
	 */
	private int identity;

	/**
	 * 12.类型
	 */
	private int type;

	/**
	 * 13.审批时间
	 */
	private Calendar approveTime;

	/**
	 * 14.民族
	 */
	private int nation;

	/**
	 * 15.病退编号
	 */
	private String bingNum;
	
	
	/**
	 * 18.电话
	 */
	private String phonenumber;
	
	

	/**
	 * 19.备注
	 */
	private String remark = "";

	/**
	 * 核减开始时间
	 */
	private Calendar cutbegin = Calendar.getInstance();

	/**
	 * 核减结束时间
	 */
	private Calendar cutend = Calendar.getInstance();

	/**
	 * 额外信息1
	 */
	// private String extra1 = "    2009年12月起执行工资";
	private String extra1 = "";

	/**
	 * 额外信息2
	 */
	private String extra2 = "    申请已写";

	/**
	 * 1.流水号
	 */
	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	/**
	 * 2.受理编号
	 */
	public String getAcceptNo() {
		return acceptNo;
	}
	
	public void setAcceptNo(String id) {
		this.acceptNo = id.trim();
	}
	
	
	/**
	 * 3.身份证号
	 */
	public String getIdNo() {
		return idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}


	/**
	 * 4.编号
	 */
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	

	/**
	 * 5.姓名
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.trim();
	}

	/**
	 * 6.公司
	 */
	public String getCompany() {
		return company;
	}

	public void setCompany(String comp) {
		this.company = comp.trim();
	}

	/**
	 * 7.科室 1-业务一科，2-业务二科，3-业务三科，4-直属
	 */
	public int getOffice() {
		return office;
	}

	public void setOffice(int kesh) {
		this.office = kesh;
	}

	
	
	/**
	 * 8.性别 1-男，2-女
	 */
	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	/**
	 * 9.出生年月
	 */
	public Calendar getBorn() {
		return born;
	}

	public void setBorn(Calendar born) {
		this.born = born;
	}

	/**
	 * 10.参加工作时间
	 */
	public Calendar getJoin() {
		return join;
	}

	public void setJoin(Calendar join) {
		this.join = join;
	}

	/**
	 * 11.身份 1-工人，2-干部
	 */
	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}
	


	/**
	 * 12.类型 1-正常，2-病退，3-特殊工种
	 *        4-退职，5-破产
	 */
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	

	/**
	 * 13.审批时间
	 */
	public Calendar getApproveTime() {
		return approveTime;
	}

	public void setApproveTime(Calendar approveTime) {
		this.approveTime = approveTime;
	}


	/**
	 * 14.民族
	 */
	public int getNation() {
		return nation;
	}

	public void setNation(int nation) {
		this.nation = nation;
	}

	/**
	 * 15.病退编号
	 */
	public String getBingNum() {
		return bingNum;
	}

	public void setBingNum(String bingNum) {
		this.bingNum = bingNum;
	}

	
	/**
	 * 18.电话
	 */
	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	/**
	 * 19.备注
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
//		bron1.setTime(df.parse(born));// 出生年月
//		join1.setTime(df.parse(join));// 参加工作时间
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
//		bron1.setTime(df.parse(born));// 出生年月
//		join1.setTime(df.parse(join));// 参加工作时间
//
//		if (!("".equals(shen) || shen == null)) {
//			shen1.setTime(df1.parse(shen));// 受理时间
//		}
//
//		setBorn(bron1);
//		setJoin(join1);
//		setApproveTime(shen1);
//		// this.bingNum = bingNum;
//
//	}



	/**
	 * 正常 没审批时间  1
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


		bron1.setTime(dfYM.parse(born));// 出生年月
		join1.setTime(dfYM.parse(join));// 参加工作时间


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
		
		
		if (this.getType() ==1 && this.getCompany().matches("个体")) {
			setApproveTime(shen2);
		}
		
	}
	
	
	/**
	 * 正常 有审批时间 1
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


		bron1.setTime(dfYM.parse(born));// 出生年月
		join1.setTime(dfYM.parse(join));// 参加工作时间


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
			shen1.setTime(dfYMD.parse(shen));// 受理时间
		}


		setBorn(bron1);
		setJoin(join1);
		setApproveTime(shen1);
	}
	
	
	/**
	 * 加核减  没有 审批时间 1
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


		bron1.setTime(dfYM.parse(born));// 出生年月
		join1.setTime(dfYM.parse(join));// 参加工作时间


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
		
		cutbejin.setTime(dfYM.parse(cutbej));// 核减开始时间
		cutend.setTime(dfYM.parse(cunen)); // 核减结束时间
		
		setCutbegin(cutbejin);
		setCutend(cutend);
		
				
//		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
//		setApproveTime(shen1);
		
		
	}
	
	
	
	/**
	 * 加核减  有 审批时间 1
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


		bron1.setTime(dfYM.parse(born));// 出生年月
		join1.setTime(dfYM.parse(join));// 参加工作时间


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
		
		cutbejin.setTime(dfYM.parse(cutbej));// 核减开始时间
		cutend.setTime(dfYM.parse(cunen)); // 核减结束时间
		
		setCutbegin(cutbejin);
		setCutend(cutend);
		
				
//		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
//		setApproveTime(shen1);
		
		
		if (!("".equals(shen) || shen == null)) {
			shen1.setTime(dfYMD.parse(shen));// 受理时间
		}
		
	}
	
	
	/**
	 * 加病退 有 审批时间 1
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


		bron1.setTime(dfYM.parse(born));// 出生年月
		join1.setTime(dfYM.parse(join));// 参加工作时间


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
			shen1.setTime(dfYMD.parse(shen));// 受理时间
		}
//		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
		setApproveTime(shen1);
	}
	
	
	
	
	/**
	 * 加病退 加核减 有 审批时间 1
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


		bron1.setTime(dfYM.parse(born));// 出生年月
		join1.setTime(dfYM.parse(join));// 参加工作时间


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
		
		cutbejin.setTime(dfYM.parse(cutbej));// 核减开始时间
		cutend.setTime(dfYM.parse(cunen)); // 核减结束时间
		
		setCutbegin(cutbejin);
		setCutend(cutend);
		
		if (!("".equals(shen) || shen == null)) {
			shen1.setTime(dfYMD.parse(shen));// 受理时间
		}
//		shen1.setTime(dfYMD.parse(Util.getRetireYear(this) + dfMD.format(bron1.getTime())));
		setApproveTime(shen1);
	}


//	/**
//	 * 正常
//	 * 
//	 * @param acceptNo
//	 *            受理编号
//	 * @param kesh
//	 *            科室
//	 * @param sex
//	 *            性别
//	 * @param born
//	 *            出生年月
//	 * @param join
//	 *            参加工作时间
//	 * @param identity
//	 *            身份
//	 * @param type
//	 *            类型
//	 * @param name
//	 *            姓名
//	 * @param comp
//	 *            公司
//	 * @param shen
//	 *            审批时间
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
//		bron1.setTime(dfYM.parse(born));// 出生年月
//		join1.setTime(dfYM.parse(join));// 参加工作时间
//
//		if (!("".equals(shen) || shen == null)) {
//			shen1.setTime(dfYMD.parse(shen));// 受理时间
//		}
//
//		setBorn(bron1);
//		setJoin(join1);
//		setApproveTime(shen1);
//	}
//
//	
//	/**
//	 * 正常 没有 审批时间
//	 * 
//	 * @param acceptNo
//	 *            受理编号
//	 * @param kesh
//	 *            科室
//	 * @param sex
//	 *            性别
//	 * @param born
//	 *            出生年月
//	 * @param join
//	 *            参加工作时间
//	 * @param identity
//	 *            身份
//	 * @param type
//	 *            类型
//	 * @param name
//	 *            姓名
//	 * @param comp
//	 *            公司
//	 * @param shen
//	 *            审批时间
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
//		bron1.setTime(dfYM.parse(born));// 出生年月
//		join1.setTime(dfYM.parse(join));// 参加工作时间
//
////		if (!("".equals(shen) || shen == null)) {
////			shen1.setTime(df1.parse(shen));// 受理时间
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
//	 * 加核减
//	 * 
//	 * @param id
//	 *            受理编号
//	 * @param kesh
//	 *            科室
//	 * @param sex
//	 *            性别
//	 * @param born
//	 *            出生年月
//	 * @param join
//	 *            参加工作时间
//	 * @param type
//	 *            身份
//	 * @param shenfen
//	 *            类型
//	 * @param name
//	 *            姓名
//	 * @param comp
//	 *            公司
//	 * @param shen
//	 *            审批时间
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
//		bron1.setTime(dfYM.parse(born));// 出生年月
//		join1.setTime(dfYM.parse(join));// 参加工作时间
//
//		cutbejin.setTime(dfYM.parse(cutbej));// 核减开始时间
//		cutend.setTime(dfYM.parse(cunen)); // 核减结束时间
//
//		if (!("".equals(shen) || shen == null)) {
//			shen1.setTime(dfYMD.parse(shen));// 受理时间
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
//	 * 加核减  没有审批时间
//	 * 
//	 * @param id
//	 *            受理编号
//	 * @param kesh
//	 *            科室
//	 * @param sex
//	 *            性别
//	 * @param born
//	 *            出生年月
//	 * @param join
//	 *            参加工作时间
//	 * @param type
//	 *            身份
//	 * @param shenfen
//	 *            类型
//	 * @param name
//	 *            姓名
//	 * @param comp
//	 *            公司
//	 * @param shen
//	 *            审批时间
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
//		bron1.setTime(dfYM.parse(born));// 出生年月
//		join1.setTime(dfYM.parse(join));// 参加工作时间
//
//		cutbejin.setTime(dfYM.parse(cutbej));// 核减开始时间
//		cutend.setTime(dfYM.parse(cunen)); // 核减结束时间
//
////		if (!("".equals(shen) || shen == null)) {
////			shen1.setTime(df1.parse(shen));// 受理时间
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
//	 * 加病退
//	 * 
//	 * @param id
//	 *            受理编号
//	 * @param kesh
//	 *            科室
//	 * @param sex
//	 *            性别
//	 * @param born
//	 *            出生年月
//	 * @param join
//	 *            参加工作时间
//	 * @param type
//	 *            身份
//	 * @param shenfen
//	 *            类型
//	 * @param name
//	 *            姓名
//	 * @param comp
//	 *            公司
//	 * @param shen
//	 *            审批时间
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
//		bron1.setTime(dfYM.parse(born));// 出生年月
//		join1.setTime(dfYM.parse(join));// 参加工作时间
//
//		if (!("".equals(shen) || shen == null)) {
//			shen1.setTime(dfYMD.parse(shen));// 受理时间
//		}
//
//		setBorn(bron1);
//		setJoin(join1);
//		setApproveTime(shen1);
//	}
	
	
	
	
//	/**
//	 * 加病退 加核减
//	 * 
//	 * @param id
//	 *            受理编号
//	 * @param kesh
//	 *            科室
//	 * @param sex
//	 *            性别
//	 * @param born
//	 *            出生年月
//	 * @param join
//	 *            参加工作时间
//	 * @param type
//	 *            身份
//	 * @param shenfen
//	 *            类型
//	 * @param name
//	 *            姓名
//	 * @param comp
//	 *            公司
//	 * @param shen
//	 *            审批时间
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
//		bron1.setTime(dfYM.parse(born));// 出生年月
//		join1.setTime(dfYM.parse(join));// 参加工作时间
//		
//		
//		Calendar cutbejin = Calendar.getInstance();
//		Calendar cutend = Calendar.getInstance();
//
//		cutbejin.setTime(dfYM.parse(cutbej));// 核减开始时间
//		cutend.setTime(dfYM.parse(cunen)); // 核减结束时间
//
//
//		if (!("".equals(shen) || shen == null)) {
//			shen1.setTime(dfYMD.parse(shen));// 受理时间
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
//	 * 加病退  没有审批时间
//	 * 
//	 * @param id
//	 *            受理编号
//	 * @param kesh
//	 *            科室
//	 * @param sex
//	 *            性别
//	 * @param born
//	 *            出生年月
//	 * @param join
//	 *            参加工作时间
//	 * @param type
//	 *            身份
//	 * @param shenfen
//	 *            类型
//	 * @param name
//	 *            姓名
//	 * @param comp
//	 *            公司
//	 * @param shen
//	 *            审批时间
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
//		bron1.setTime(dfYM.parse(born));// 出生年月
//		join1.setTime(dfYM.parse(join));// 参加工作时间
//
////		if (!("".equals(shen) || shen == null)) {
////			shen1.setTime(df1.parse(shen));// 受理时间
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
//	 *            受理编号
//	 * @param kesh
//	 *            科室
//	 * @param sex
//	 *            性别
//	 * @param born
//	 *            出生年月
//	 * @param join
//	 *            参加工作时间
//	 * @param type
//	 *            身份
//	 * @param shenfen
//	 *            类型
//	 * @param name
//	 *            姓名
//	 * @param comp
//	 *            公司
//	 * @param shen
//	 *            审批时间
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
//		bron1.setTime(df.parse(born));// 出生年月
//		join1.setTime(df.parse(join));// 参加工作时间
//
//		if (!("".equals(shen) || shen == null)) {
//			shen1.setTime(df1.parse(shen));// 受理时间
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
		System.out.println("流水号：" + getSerialNo());
		
		System.out.println("受理编号：" + getAcceptNo());
		
		System.out.println("身份证号：" + getIdNo());
		
		System.out.println("姓名：" + getName());
		
		
		
		System.out.println("单位名称：" + getCompany());
		
		System.out.println("科室：" + getOffice());
		
		System.out.println("性别：" + getSex());
		
//		System.out.println("审批时间：" + dfYMD.format(get().getTime()));
		
		System.out.println("电话：" + getPhonenumber());
		
		
		String born = dfYM.format(getBorn());
		
		String join = dfYM.format(getJoin());
		
		System.out.println("出生年月：" + born);
		
		System.out.println("参加工作时间：" + join);
		
		
		return "";
	}
	
}
