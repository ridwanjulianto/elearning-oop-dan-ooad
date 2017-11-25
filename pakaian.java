
import java.util.Scanner;
public class pakaian extends laporanbarang {
	public String id_barang;
	public String kualitas ;
	public String ukuran;
public void fash (){
	  	 	Scanner input = new Scanner (System.in);
            System.out.println("=======================================");
	    	System.out.print("id_barang  :");
	        id_barang = input.nextLine();
	    	System.out.print("kualitas   :");
	        kualitas= input.nextLine();
	    	System.out.print("ukuran     :");
	        ukuran= input.nextLine();
	      
	        
}
public static void fashion (){
pakaian pk = new pakaian ();
pk.lapbarang();
pk.fash();
pk.laphargabarang();

}
}