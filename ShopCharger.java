package iccarger;

public class ShopCharger
{
	private StudentCard nowInsertedCard;

	public ShopCharger()
	{
		nowInsertedCard = null;
	}

	public void insertCard(StudentCard insertCard)
	{
		if(nowInsertedCard == null)
		{
			nowInsertedCard= insertCard;
		}
		else
		{
			System.out.printf("すでにカードが入っています。。\n");
		}
	}

	public void out_card()
	{
		nowInsertedCard = null;
	}

	public void add_money(int money)
	{
		if(nowInsertedCard!=null)
		{
			System.out.printf("学籍番号%dの%s %d円チャージ\n",
					nowInsertedCard.getStudentID(),nowInsertedCard.getName(),money);
			//入金処理
			nowInsertedCard.setBalance(nowInsertedCard.getBalance() + money);
			//履歴作成
			new ChargeLog(nowInsertedCard.getStudentID(),money,nowInsertedCard.getBalance());
			//確認
			System.out.printf("学籍番号%d 残高%d\n",
					nowInsertedCard.getStudentID(),nowInsertedCard.getBalance());

		}
		else
		{
			System.out.printf("カードが入っていません\n");
		}
	}

	public void printChargeLog()
	{
		System.out.printf("履歴を表示します\n");
		for(int i = 0;i < 5;i++)
		{
			int d = ChargeLog.chargeLogList.size() -1-i;
			if(d < 0)
			{
				break;
			}
			ChargeLog cg = ChargeLog.chargeLogList.get(d);
			cg.printLog();
		}
	}
}
