import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
class main {
	public static void main(String[] args) throws IOException{ 
	try  { 
		Scanner pilmenu = new Scanner (System.in);
		Scanner opt =new Scanner (System.in);
		String opsi ="";
		do{
			System.out.println("");
			System.out.println("DAFTAR MENU");
			System.out.println("1. LAPOTAN   :");
			System.out.println("2. BARANG    :");

			System.out.print("Pilihan anda   :");

			int menu = pilmenu.nextInt();
			switch (menu){
				case 1 :
				laporan lap = new laporan ();
	 			lap.cetak();
	 			lap.ubah_lap();  
	 			break ;
	 			case 2 : 
	 			barang bar = new barang ();
	 			bar.inputbarang ();
	 			break;
	 		default :
	 		System.out.println("");
	 		System.out.println("maaf menu tidak ada dalam pilihan !");
	 		}
	 		System.out.println("kembali ke menu utama");
	 		System.out.println("tekan Y untuk Ya dan tekan N untuk Tidak");
	 		opsi = opt.nextLine();
	 	}
	 	
	 	while (opsi.equals("y") || opsi.equals("y"));
	 }
	 catch (InputMismatchException IME) {
	 	System.out.println("maaf salah input !");
} 	
}
}