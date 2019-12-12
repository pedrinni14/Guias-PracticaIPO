package presentacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Guias {

	public static void main(String[] args) {
		  String fichero = "src/presentacion/Guias.txt";
		  try {
		      FileReader fr = new FileReader(fichero);
		      BufferedReader br = new BufferedReader(fr);
		      int m =0 ; 
		      String[][]guias = new String[m][4];
		      String linea;
		      while((linea = br.readLine()) != null) {
		    	  m++;
		    	 String[] tokens= linea.split(",");
		    	 guias[m][0]=tokens[0];
		    	 guias[m][1]=tokens[1];
		    	 guias[m][2]=tokens[2];
		    	 guias[m][3]=tokens[3];
		       }
		 
		      fr.close();
		    }
		    
		    catch(Exception e) {
		      System.out.println("Excepcion leyendo fichero "+ fichero + ": " + e);
		     }
		    }
		  
	}
	        

	


