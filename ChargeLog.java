package iccarger;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class ChargeLog
{
	private static final SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static ArrayList<ChargeLog> chargeLogList = new ArrayList<ChargeLog>();

	public int logID;
	public int studentID;
	public Calendar date;
	public int money;
	public int balance;

	ChargeLog(int studentID,int money,int balance)
	{
		logID = chargeLogList.size();
		this.studentID = studentID;
		date = Calendar.getInstance();
		this.money = money;
		this.balance = balance;

		ChargeLog.chargeLogList.add(this);
	}

	public void printLog()
	{
		System.out.printf("%d 日付:%s 学籍番号:%d %d円チャージ 残高:%d円\n",
				logID,dateformat.format(date.getTime()),studentID,money,balance);
	}
}
