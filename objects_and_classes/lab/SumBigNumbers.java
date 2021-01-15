package objects_and_classes.lab;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger first = new BigInteger(scan.nextLine());
		BigInteger secon = new BigInteger(scan.nextLine());
		scan.close();
		BigInteger sum = first.add(secon);
		System.out.println(sum);

	}

}
