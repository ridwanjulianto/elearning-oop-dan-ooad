import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
public class barang 
{
	public String nama_barang ;
	public String kode_barang ;
	public String jenis_barang ;

public void inputbarang ()
{
	  int ubah;
      Scanner input = new Scanner (System.in);
      do{
      	System.out.println("=====DAFTAR INPUT BARANG=====");
      	System.out.println("1. Sembako    :");
        System.out.println("2. Pakaian    :");
        System.out.println("3. Bangunan   :");
        System.out.print("Pilihan anda  :");
        ubah = input.nextInt();

      
if (ubah==1){
                Sembako sem = new Sembako();
	 			sem.cekb();
	 			
	 		 ubah = input.nextInt();
}else if (ubah==2) {
      	  	  	
pakaian pak = new pakaian ();
pak.fashion();
ubah = input.nextInt();
      	  	  	}
else if (ubah==3){
Bangunan bangun = new Bangunan();
bangun.ban();
ubah = input.nextInt();
}
      	  	  	} while (ubah==0);
    }
	} 
	    