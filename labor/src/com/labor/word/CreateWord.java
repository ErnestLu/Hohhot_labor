package com.labor.word;

import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.rtf.RtfWriter2;
import com.lowagie.text.rtf.style.RtfFont;

public class CreateWord {

	public enum sex {
		man, woman
	}

	/**
	 * 黑体正常二号
	 */
	static RtfFont fHei22 = new RtfFont("黑 体", 22, Font.NORMAL, Color.BLACK);

	/**
	 * 填充
	 */
	static RtfFont fTian1 = new RtfFont("黑 体", 1, Font.NORMAL, Color.BLACK);

	/**
	 * 填充
	 */
	static RtfFont fTian2 = new RtfFont("黑 体", 7, Font.NORMAL, Color.BLACK);

	/**
	 * 填充
	 */
	static RtfFont fTian3 = new RtfFont("仿 宋 _GB2312", 10, Font.NORMAL,
			Color.BLACK);

	/**
	 * 仿宋
	 */
	static RtfFont fFang = new RtfFont("仿 宋 _GB2312", 16, Font.NORMAL,
			Color.BLACK);

	/**
	 * 仿宋小四
	 */
	static RtfFont fFang12 = new RtfFont("仿 宋 _GB2312", 12, Font.NORMAL,
			Color.BLACK);

	/**
	 * Times New Roman
	 */
	static RtfFont fTimes = new RtfFont("Times New Roman", 16, Font.NORMAL,
			Color.BLACK);

	/**
	 * 下划线
	 */
	static RtfFont fUnderLine = new RtfFont("仿 宋 _GB2312", 16, Font.UNDERLINE,
			Color.BLACK);

	/**
	 * 下划线数字
	 */
	static RtfFont fUnderLineNum = new RtfFont("Times New Roman", 16,
			Font.UNDERLINE, Color.BLACK);

	/**
	 * @param file
	 * @param person
	 * @throws DocumentException
	 * @throws IOException
	 */
	public void createDocContext(String file, Person person)
			throws DocumentException, IOException {

		// 设置纸张大小
		Document document = new Document(PageSize.A4, 2540, 2540, 3180, 3180);

		// 建立一个书写器(Writer)与document对象关联，通过书写器(Writer)可以将文档写入到磁盘中
		RtfWriter2.getInstance(document, new FileOutputStream(file));

		document.open();

		// 标题
		Paragraph title = new Paragraph("退休（退职）人员审批单");
		// 设置标题格式对齐方式
		title.setAlignment(Element.ALIGN_CENTER);
		title.setFont(fHei22);
		title.setSpacingBefore(2);
		title.setSpacingAfter(2);
		document.add(title);

		Paragraph tianchang1 = new Paragraph(" ", fHei22);
		tianchang1.setAlignment(Element.ALIGN_CENTER);
		tianchang1.setSpacingBefore(4);
		tianchang1.setSpacingAfter(4);
		document.add(tianchang1);

		// document.add(new Paragraph(" ", fTian2));

		Phrase bianhao = new Phrase("编号", fFang);
		document.add(bianhao);

		Phrase bianhao1 = new Phrase(": " + person.getAcceptNo() + "—"+person.getNumber()+"       ", fTimes);
//		Phrase bianhao1 = new Phrase(": " + (person.myId++) + "                  ", fTimes);
		document.add(bianhao1);

		Phrase bianhao2 = new Phrase(Util.getKeshi(person.getOffice()), fUnderLine);
		document.add(bianhao2);

		// 填充
		Paragraph tianchang2 = new Paragraph(" ", fTian1);

		tianchang2.setSpacingBefore(1);
		tianchang2.setSpacingAfter(21);
		document.add(tianchang2);

		Phrase tian1 = new Phrase(" \n", fTian3);
		document.add(tian1);

		// 正文
		Phrase Context01 = new Phrase();

		List<Phrase> list = new ArrayList<Phrase>();
		list.add(new Phrase("    经审查，", fFang));
		list.add(new Phrase("  " + person.getCompany() + "  ", fUnderLine));
		list.add(new Phrase("单位，", fFang));
		list.add(new Phrase("  " + person.getName() + "  ", fUnderLine));
		list.add(new Phrase("同志，性别", fFang));
		list.add(new Phrase(Util.getSex(person.getSex()), fUnderLine));
		list.add(new Phrase("，档案记载", fFang));
		list.add(new Phrase("  " + person.getBorn().get(Calendar.YEAR) + "  ", fUnderLineNum));
		list.add(new Phrase("年", fFang));
		list.add(new Phrase("  " + (person.getBorn().get(Calendar.MONTH) + 1) + "  ", fUnderLineNum));
		list.add(new Phrase("月出生，", fFang));
		list.add(new Phrase(Util.getType(person.getIdentity()), fUnderLineNum));
		list.add(new Phrase("身份。该同志于", fFang));
		list.add(new Phrase("  " + person.getJoin().get(Calendar.YEAR) + "  ", fUnderLineNum));
		list.add(new Phrase("年", fFang));
		list.add(new Phrase("  " + (person.getJoin().get(Calendar.MONTH) + 1) + "  ", fUnderLineNum));
		list.add(new Phrase("月参加工作，缴费年限为", fFang));
		list.add(new Phrase("  " + Util.getYear(person) + "  ",fUnderLineNum));
		list.add(new Phrase("年", fFang));
		int temp = Util.getMonth(person);
		list.add(new Phrase("  " + (temp == 0 ? "" : "" + temp) + "  ", fUnderLineNum));
		list.add(new Phrase("月。根据《国务院关于工人退休退职的暂行办法》（国发", fFang));
		list.add(new Phrase("[1978]104", fTimes));
		list.add(new Phrase("号），属", fFang));
		list.add(new Phrase(Util.getShenfen(person.getType()), fUnderLine));
		list.add(new Phrase("退休", fFang));
		if (person.getType() == 2) {
			list.add(new Phrase("（呼劳鉴字（", fFang));
			list.add(new Phrase("2011", fTimes));
			list.add(new Phrase("）第", fFang));
			list.add(new Phrase("0", fTimes));
			list.add(new Phrase(person.getBingNum() + "", fTimes));
			list.add(new Phrase("号）", fFang));
		}
		list.add(new Phrase("。现准予退休。", fFang));

		Context01.addAll(list);

		Paragraph Context = new Paragraph(Context01);

		Context.setLeading(31);
		Context.setExtraParagraphSpace(20);
		// Context.setSpacingBefore(20);
		// Context.setSpacingAfter(20);
		document.add(Context);

		Paragraph tianchang31 = new Paragraph("    ", fFang);

		tianchang31.setSpacingBefore(5);
		// tianchang31.setSpacingAfter(10);
		document.add(tianchang31);

		Paragraph tianchang32 = new Paragraph("", fFang);

		// tianchang32.setSpacingBefore(10);
		tianchang32.setSpacingAfter(10);
		document.add(tianchang32);

		Paragraph tianchang3 = new Paragraph("", fFang);

		tianchang3.setSpacingBefore(10);
		tianchang3.setSpacingAfter(10);
		document.add(tianchang3);

		// 审核人签字: 盖 章：

		Paragraph Con3 = new Paragraph("审核人签字:                        盖   章：", fFang);

		Con3.setSpacingBefore(20);
		Con3.setSpacingAfter(20);
		document.add(Con3);

		Calendar c3 = person.getApproveTime();

		List<Phrase> list1 = new ArrayList<Phrase>();
		list1.add(new Phrase("                              ", fFang));
		list1.add(new Phrase("" + (c3.get(Calendar.YEAR)), fTimes));
		list1.add(new Phrase(" 年 ", fFang));
		list1.add(new Phrase("" + (c3.get(Calendar.MONTH) + 1), fTimes));
		list1.add(new Phrase(" 月 ", fFang));
		list1.add(new Phrase("" + (c3.get(Calendar.DAY_OF_MONTH)), fTimes));
		list1.add(new Phrase(" 日 ", fFang));

		Phrase p1 = new Phrase();
		p1.addAll(list1);

		Paragraph Con4 = new Paragraph(p1);

		Con4.setSpacingBefore(2);
		Con4.setSpacingAfter(2);
		document.add(Con4);

		Paragraph Con5 = new Paragraph("");

		Con5.setSpacingBefore(40);
		Con5.setSpacingAfter(40);
		document.add(Con5);

		String contextString = "注: 本审批单一式四份，劳动保障局养老保险科、劳动保障局审批办、本人（档案）、社会保险经办机构各留存一份。";
		Paragraph Con6 = new Paragraph(contextString, fFang12);

		Con6.setSpacingBefore(2);
		Con6.setSpacingAfter(2);
		document.add(Con6);
		
		Paragraph tianchang4 = new Paragraph("\n", fFang);
		document.add(tianchang4);

		document.close();
	}

}
