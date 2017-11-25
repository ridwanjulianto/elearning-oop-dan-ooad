import java.util.Scanner;
public class laporan {
	public String no_lap;
	public String tgl_lap ;
	public String jenis_lap;
	public void  cetak (){
    Scanner input = new Scanner (System.in);
  System.out.println("------------- LAPORAN ------------:");
      
  System.out.println ("20 k ");
    
	System.out.println ("23 November 2007");
	  
	System.out.println ("Keuangan ");
	System.out.println("----------------------------------- :");
	}
	public void ubah_lap () {
    int ubah;
      Scanner input = new Scanner (System.in);
      do{
      	System.out.println("pilih 1 untuk mengubah :");
        System.out.println("pilih 2 untuk menghapus :");
        System.out.print("pilihan anda :");
      
        ubah = input.nextInt();

      
if (ubah==1){
                  System.out.println("------------------------------ :");
      
      	  	  		System.out.println("30 k");
                  System.out.println("30 November 2017");
                  System.out.println("keuangan");
                  System.out.println("------------------------------ :");
}else if (ubah==2) {
      	  	  	System.out.print("menghapus laporan ");

      	  	  	}

      	  	  	} 
                while (ubah==3);
    }
	} 