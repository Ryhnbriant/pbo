package Tugas;

public class Lingkaran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float jari = 10;
		double keliling, luas; 
		double phi = 3.14; 
		
		System.out.println("Menghitung Luas Lingkaran ");
		//luas lingkaran = phi/3,14 * r^2 
		// KELILING LNGKARAN = 2.phi.r
		
		luas = phi * jari*jari;
		keliling = 2 * 3.14 * jari ;
		
		System.out.println("Luas Lingkaran = " + luas + " cm");
		
		System.out.println("Keliling Lingkaran = " + keliling + " cm");
		
	}
}
