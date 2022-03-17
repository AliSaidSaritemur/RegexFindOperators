package pdpProjem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DosyaOkuma {

	public DosyaOkuma(String dosyaKonumu) {
		super();
		this.dosyaKonumu = dosyaKonumu;
	}
	
	private String dosyaKonumu;
	
	public BufferedReader yeniBrOlusturma() throws IOException {
		
File file =new File(dosyaKonumu);
		
		if(! file.exists()) {
			
			file.createNewFile();
		}
		
		FileReader freader =new FileReader(file);	
	BufferedReader bReader = new BufferedReader(freader);
	
	return bReader;
		
	}
	
	
}
