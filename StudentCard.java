package iccarger;

import java.util.ArrayList;

public class StudentCard
{
	private static ArrayList<StudentCard> studentCardList = new ArrayList<StudentCard>();
	private int studentID;//学籍番号
	private String name;//名前
	private int balance;//残高

	public StudentCard(int studentNum,String name)
	{
		this.studentID = studentNum;
		this.name = name;
		this.balance = 0;

		StudentCard.studentCardList.add(this);
	}

	public int getStudentID()
	{
		return studentID;
	}

	public String getName()
	{
		return name;
	}

	public int getBalance()
	{
		return balance;
	}

	public void setBalance(int money)
	{
		this.balance = money;
	}
}
