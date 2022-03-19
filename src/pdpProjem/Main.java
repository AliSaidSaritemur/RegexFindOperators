/**
*
* @Ali Said Saritemur ali.saritemur@agr.sakarya.edu.tr
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
		
		Lexical lexical =new Lexical("komut.java");		
		
		System.out.println("Operator Bilgisi: ");
		System.out.println("	Ikili Operator Sayisi: " + lexical.getIkiliOpsayisi());
		
		System.out.println("	Tekli Operator Sayisi: " + lexical.getTekliOpsayisi());

		System.out.println("	Sayisal Operator Sayisi: " + lexical.getSayisalOpsayisi());

		System.out.println("	Iliskisel Operator Sayisi: " + lexical.getIliskiselOpSayisi());

		System.out.println("	Mantiksal Operator Sayisi: " + lexical.getMantiksalOpSayisi());

		System.out.println("Operand Bilgisi: ");
		System.out.println("	Toplam Operand Sayisi: " + lexical.getToplamOperandSayisi());
		
	}
}
