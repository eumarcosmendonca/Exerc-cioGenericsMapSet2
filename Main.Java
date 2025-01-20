package Program;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Integer> set = new HashSet<>();

		System.out.print("How many students for course A? ");
		Integer quantityA = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < quantityA; i++) {
			Integer id = sc.nextInt();
			sc.nextLine();
			set.add(id);
		}

		System.out.print("How many students for course B? ");
		Integer quantityB = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < quantityB; i++) {
			Integer id = sc.nextInt();
			sc.nextLine();
			set.add(id);
		}

		System.out.print("How many students for course C? ");
		Integer quantityC = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < quantityC; i++) {
			Integer id = sc.nextInt();
			sc.nextLine();
			set.add(id);
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();

	}

}
