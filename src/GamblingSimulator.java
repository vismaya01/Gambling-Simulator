
public class GamblingSimulator {
	//UC1
	public static  final int STAKE = 100;
	public static final int BET_AMOUNT = 1;	
	//UC2
	public static void winOrLoss() {
		if((Math.floor(Math.random()*10) % 2) == BET_AMOUNT) {
			System.out.println("Win");
		}
		else {
			System.out.println("Loss");
		}
	}
	//UC3
	public static void resignDay() {
		int cash = STAKE;
		while(cash < 150 && cash > 50) {
			if((Math.floor(Math.random()*10) % 2) == BET_AMOUNT) {
				cash = cash + 1;
			}
			else {
				cash = cash -1;
			}
		}
		System.out.println(cash);
	}
	public static void main(String[] args) {
		winOrLoss();
		resignDay();
	}
}
