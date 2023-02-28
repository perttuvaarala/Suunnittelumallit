import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DiceGame extends Game{

	private int rounds;
	private Random r;
	private HashMap<Integer, Integer> scores;
	
	@Override
	void initializeGame() {
		scores = new HashMap<>();
		r = new Random();
		rounds = 0;
		
	}

	@Override
	void makePlay(int player) {
		int score = r.nextInt(6) + 1;
		if(scores.containsKey(player)) {
			scores.put(player, scores.get(player) + score);
		} else {
			scores.put(player, score);
		}
		rounds++;
		
	}

	@Override
	boolean endOfGame() {
		if (rounds >= 5) {
			return true;
		}
		return false;
	}

	@Override
	void printWinner() {
		int winner = scores.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
		System.out.println("Winner is player number: " + winner + " score: " + scores.get(winner));
		
	}

}
