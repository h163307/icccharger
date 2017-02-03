package iccarger;

public class MainShopCharger
{
	static public void main(String[] args)
	{
		System.out.printf("hello\n");
		ShopCharger sc = new ShopCharger();
		StudentCard scard[] = new StudentCard[2];
		scard[0] = new StudentCard(163301, "太郎");
		scard[1] = new StudentCard(163302, "次郎");

		sc.add_money(1000);

		sc.insertCard(scard[0]);
		sc.add_money(1000);
		sc.out_card();

		sc.insertCard(scard[0]);
		sc.add_money(1000);
		sc.out_card();

		sc.printChargeLog();

		sc.insertCard(scard[0]);
		sc.add_money(1000);
		sc.add_money(1000);
		sc.add_money(1000);
		sc.add_money(1000);
		sc.add_money(1000);
		sc.out_card();

		sc.printChargeLog();
	}
}
