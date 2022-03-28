/**
*
* @Ali Said Saritemur ali.saritemur@ogr.sakarya.edu.tr
* @17.03.2022
* <p>
* Ana sinif
* </p>
*/
package pdpProjem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		try {
		Lexical operator =new Lexical(args[0]);		

		System.out.println("Operator Bilgisi: ");
		System.out.println("	Tekli Operator Sayisi: " + operator.getTekliOpsayisi());
		
		System.out.println("	Ikili Operator Sayisi: " + operator.getIkiliOpsayisi());

		System.out.println("	Sayisal Operator Sayisi: " + operator.getSayisalOpsayisi());

		System.out.println("	Iliskisel Operator Sayisi: " + operator.getIliskiselOpSayisi());

		System.out.println("	Mantiksal Operator Sayisi: " + operator.getMantiksalOpSayisi());

		System.out.println("Operand Bilgisi: ");
		System.out.println("	Toplam Operand Sayisi: " + operator.getToplamOperandSayisi());
		}
		
		catch(Exception e){
				System.out.println("Verilerin cekilecegi dosyayi girmediniz");
		}
	}
}
