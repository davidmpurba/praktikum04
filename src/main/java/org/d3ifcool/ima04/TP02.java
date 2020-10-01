package org.d3ifcool.ima04;

public class TP02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		if (n <= 12){
			int telur = 800;
			int harga = telur * n;
			int diskon = 0;
			int total = harga - diskon;
			System.out.println("Telur " + n + " * " + telur + " = " + harga);
			System.out.println("Diskon 0% = " + diskon);
			System.out.println("Total dibayar = " + total);
			
		} else if (n >= 12 && n <= 23) {
			int telur = 800;
			int harga = telur * n;
			int diskon = harga * 10/100;
			int total = harga - diskon;
			System.out.println("Telur " + n + " * " + telur + " = " + harga);
			System.out.println("Diskon 10% = " + diskon);
			System.out.println("Total dibayar = " + total);
			
		} else {
			int telur = 800;
			int harga = telur * n;
			int diskon = harga * 15/100;
			int total = harga - diskon;
			System.out.println("Telur " + n + " * " + telur + " = " + harga);
			System.out.println("Diskon 15% = " + diskon);
			System.out.println("Total dibayar = " + total);
	  }
	}
}
