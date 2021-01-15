package data_types_and_variables.exercise;

import java.util.Scanner;

public class Poke_Mon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pokePower = scan.nextInt();
		int pokeTarget = scan.nextInt();
		int exhaustionFactor = scan.nextInt();
		scan.close();
		int count = 0;
		int poketPowerValue = pokePower;
		
		while (poketPowerValue >= pokeTarget) {
			poketPowerValue -= pokeTarget;
			count++;
			if ((pokePower == (poketPowerValue * 2)) && (poketPowerValue > exhaustionFactor) && (exhaustionFactor != 0)) {
				poketPowerValue /= exhaustionFactor;
			}

		}
		
		System.out.printf("%d\n%d\n", poketPowerValue, count);
		
	}

}
