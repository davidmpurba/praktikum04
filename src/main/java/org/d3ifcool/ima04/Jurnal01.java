package org.d3ifcool.ima04;

public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner in = new Scanner(System.in);
		int bilangan;
		
		
		bilangan = in.nextInt();
		
		if(bilangan%6 == 0)
			System.out.println("kelipatan enam");
		else
			System.out.println("bukan kelipatan enam");
	}
}
