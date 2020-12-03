
public class GamblingSimulator {
	//UC1
	public static  final int STAKE = 100;
	public static final int BET_AMOUNT = 1;	
	public static int fiftyPercentageLoss = (STAKE / 100) * 50;
	public static int fiftyPercentageWin =STAKE + (STAKE / 100) * 50;
	//UC2
	public static boolean winOrLoss() {
		if((Math.floor(Math.random()*10) % 2) == BET_AMOUNT) {
			return true;
		}
		else {
			return false;
		}
	}
	//UC3
	public static int resignDay() {
		int cash = STAKE;
		while(cash < fiftyPercentageWin && cash > fiftyPercentageLoss) {
			if(winOrLoss()) {
				cash = cash + 1;
			}
			else {
				cash = cash -1;
			}
		}
		return cash;
	}
	//UC4
	public static void toatalAmount() {
		int day = 1;
		int money = 0;
		while(day <= 20) {
			if(resignDay() == fiftyPercentageWin ){
				money = fiftyPercentageWin - STAKE;
				System.out.println("amount win on day "+day+" is "+money);
			}
			else {
				money = STAKE - fiftyPercentageLoss;
				System.out.println("amount loss on day "+day+" is "+money);
			}
			day = day + 1;
		}
	}
	public static void main(String[] args) {
		toatalAmount();
	}
}
