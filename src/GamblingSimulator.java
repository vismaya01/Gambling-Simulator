
public class GamblingSimulator {
	public final int STAKE = 100;
	public final int BET_AMOUNT = 1;
	
	public void winOrLoss() {
		if((Math.floor(Math.random()*10) % 2) == BET_AMOUNT) {
			System.out.println("Win");
		}
		else {
			System.out.println("Loss");
		}
	}
	public static void main(String[] args) {
		GamblingSimulator gambler = new GamblingSimulator();
		gambler.winOrLoss();
	}
}
