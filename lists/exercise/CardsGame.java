package lists.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> firstPlayerCards = new ArrayList<Integer>();
		List<Integer> secondPlayerCards = new ArrayList<Integer>();
		firstPlayerCards = getCards(scan);
		secondPlayerCards = getCards(scan);
		game(firstPlayerCards, secondPlayerCards);

	}

	private static void game(List<Integer> firstPlayerCards, List<Integer> secondPlayerCards) {
		String winer = "";
		int sum = 0;
		while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
			if (firstPlayerCards.get(0) > secondPlayerCards.get(0)) {
				firstPlayerCards.add(firstPlayerCards.get(0));
				firstPlayerCards.add(secondPlayerCards.get(0));
			}else if (firstPlayerCards.get(0) < secondPlayerCards.get(0)) {
				secondPlayerCards.add(secondPlayerCards.get(0));
				secondPlayerCards.add(firstPlayerCards.get(0));
			}
			firstPlayerCards.remove(0);
			secondPlayerCards.remove(0);
			
		}
		if (secondPlayerCards.isEmpty()) {
			winer = "First";
			for (int i = 0; i < firstPlayerCards.size(); i++) {
				sum += firstPlayerCards.get(i);
			}
		}else {
			winer = "Second";
			for (int i = 0; i < secondPlayerCards.size(); i++) {
				sum += secondPlayerCards.get(i);
			}
		}
		
		System.out.printf("%s player wins! Sum: %d", winer, sum);
		
	}

	private static List<Integer> getCards(Scanner scan) {
		String[] input = scan.nextLine().split(" ");
		List<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			output.add(Integer.parseInt(input[i]));
		}
		return output;
	}

}
