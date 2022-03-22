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

public class Main {

	public static void main(String[] args) throws IOException {
		
		Operator operator =new Operator("Lexical.java");		
		
		System.out.println("Operator Bilgisi: ");
		System.out.println("	Tekli Operator Sayisi: " + operator.getTekliOpsayisi());
		
		System.out.println("	Ikili Operator Sayisi: " + operator.getIkiliOpsayisi());

		System.out.println("	Sayisal Operator Sayisi: " + operator.getSayisalOpsayisi());

		System.out.println("	Iliskisel Operator Sayisi: " + operator.getIliskiselOpSayisi());

		System.out.println("	Mantiksal Operator Sayisi: " + operator.getMantiksalOpSayisi());

		System.out.println("Operand Bilgisi: ");
		System.out.println("	Toplam Operand Sayisi: " + operator.getToplamOperandSayisi());
		
	}
}
