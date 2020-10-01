package org.d3ifcool.ima04;

public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner in = new Scanner(System.in);
		double hasil;
		double penghasilan_bersih;
		double pajak;
		double jumlah_pajak;
		
		
	    hasil= in.nextInt();
		
		if(hasil <= 50000000){
			pajak = 5;
			jumlah_pajak = 0.05 * hasil;
			penghasilan_bersih = hasil - jumlah_pajak;
		}
		else if(hasil > 5000000 && hasil <= 250000000){
			pajak = 15;
			jumlah_pajak = 0.15 * hasil;
			penghasilan_bersih = hasil - jumlah_pajak;
		}
		else if(hasil > 250000000 && hasil <= 500000000){
			pajak = 25;
			jumlah_pajak = 0.25 * hasil;
			penghasilan_bersih = hasil - jumlah_pajak;
		}
		else{
			pajak = 30;
			jumlah_pajak = 0.30 * hasil;
			penghasilan_bersih = hasil - jumlah_pajak;
		}
		
		int penghasilan2 = (int)hasil;
		int jumlah_pajak2 = (int)jumlah_pajak;
		int penghasilan_bersih2 = (int)penghasilan_bersih;
		int pajak2 = (int)pajak;
		
		System.out.println("Penghasilan Kotor = "+penghasilan2+" juta rupiah");
		System.out.println("Pajak "+(pajak2)+"% = Rp." + jumlah_pajak2);
		System.out.println("Penghasilan bersih = Rp." + penghasilan_bersih2);
	}
}
