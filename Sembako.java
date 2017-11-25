import java.util.Scanner;
public class Sembako extends laporanbarang {
	public String id_barang;
	public String jenissembako ;
	public String masaberlaku;
public void cekbarang (){
	  	Scanner input = new Scanner (System.in);
	  	System.out.println("====================================");
	    	System.out.print("id_barang       :");
	    	id_barang=input.nextLine();
	    	System.out.print ("jenis sembako  :");
	    	jenissembako=input.nextLine();
	    	System.out.print("masa berlaku    :");
	    	masaberlaku=input.nextLine();
	    	 }
public static void cekb (){
Sembako pk = new Sembako ();
pk.lapbarang();
pk.cekbarang();
pk.laphargabarang();
}
}