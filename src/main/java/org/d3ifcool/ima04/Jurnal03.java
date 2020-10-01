package org.d3ifcool.ima04;

public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
				Scanner in = new Scanner(System.in);
		String name1 = "Dira";
		String name2 = "Radi";
		String name3 = "Idar";
		int nilai = 100;
		int nilaiDira;
		int nilaiRadi;
		int nilaiIdar;
		
		
		nilaiDira = in.nextInt();
		nilaiRadi = in.nextInt();
		nilaiIdar = in.nextInt();
		
		String nilaiTertinggi;
		String nilaiPertengahan;
		String nilaiTerendah;
		
		if((nilaiDira > nilaiRadi) && (nilaiRadi > nilaiIdar)){
			nilaiTertinggi = name1;
			nilaiPertengahan = name2;
			nilaiTerendah = name3;
		}
		else if((nilaiRadi > nilaiDira) && (nilaiDira > nilaiIdar)){
			nilaiTertinggi = name2;
			nilaiPertengahan = name1;
			nilaiTerendah = name3;
		}
		else if((nilaiIdar > nilaiDira) && (nilaiDira > nilaiRadi)){
			nilaiTertinggi = name3;
			nilaiPertengahan = name1;
			nilaiTerendah = name2; 
		}
		else if((nilaiIdar > nilaiRadi) && (nilaiRadi > nilaiDira)){
			nilaiTertinggi = name3;
			nilaiPertengahan = name2;
			nilaiTerendah = name1;
		}
		else if((nilaiRadi > nilaiIdar) && (nilaiIdar > nilaiDira)){
			nilaiTertinggi = name2;
			nilaiPertengahan = name3;
			nilaiTerendah = name1;
		}
		else{
			nilaiTertinggi = name1;
			nilaiPertengahan = name3;
			nilaiTerendah = name2;
		}
		System.out.println(nilaiTerendah + "," + nilaiPertengahan  + "," + nilaiTertinggi);
	}
}
