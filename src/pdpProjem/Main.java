package pdpProjem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{

		File file =new File("dist/Lexical.java");
		
		if(! file.exists()) {
			
			file.createNewFile();
		}
		
		FileReader freader =new FileReader(file);	
	BufferedReader bReader = new BufferedReader(freader);
	
	Sayac sayac =new Sayac();
	System.out.println("Sayisal Operator Sayisi: "+sayac.sayisalOperatorSayaci(bReader));
	
	freader =new FileReader(file);
	bReader = new BufferedReader(freader);
	
	System.out.println("Iliskisel Operator Sayisi: "+sayac.iliskiselOperatorSayaci(bReader));
	 freader =new FileReader(file);
		bReader = new BufferedReader(freader);
	System.out.println("Mantiksal Operator Sayisi: "+sayac.MantiksalOperatorSayaci(bReader));
}
}
