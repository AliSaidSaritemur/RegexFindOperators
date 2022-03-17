package pdpProjem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
	DosyaOkuma dK=new DosyaOkuma("dist/Lexical.java");
	
	
	Sayac sayac =new Sayac();
	System.out.println("Sayisal Operator Sayisi: "+sayac.sayisalOperatorSayaci(dK.yeniBrOlusturma()));
	

	System.out.println("Iliskisel Operator Sayisi: "+sayac.iliskiselOperatorSayaci(dK.yeniBrOlusturma()));

	System.out.println("Mantiksal Operator Sayisi: "+sayac.MantiksalOperatorSayaci(dK.yeniBrOlusturma()));
	
		System.out.println("Tekli Operator Sayisi: "+sayac.IkiliOperatorSayaci(dK.yeniBrOlusturma()));

			System.out.println("Tekli Operator Sayisi: "+sayac.TekliOperatorSayaci(dK.yeniBrOlusturma()));
		
	
}
}
