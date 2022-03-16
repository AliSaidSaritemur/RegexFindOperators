package pdpProjem;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sayac  {
	
	boolean yorumDurum=false;
	
	public Integer sayisalOperatorSayaci (BufferedReader bReader) throws IOException {
		
		Pattern pattern =Pattern.compile("(([\\!\\+\\-\\/\\%\\&\\^]\\=|(?<![=<>])\\=(?![=<>])|\\+[\\+\\=]|\\+|\\-[\\-\\=]|\\-|\\||(?<!\\/)\\/(?!\\/)|\\%|(?<!\\&)\\&(?!\\&)|(?<!\\|)\\|(?!\\|)|\\^))");
	
		Matcher matcher;
		
		String line;
	
		 int sayac=0;
		 while((line =bReader.readLine()) != null) {
			 matcher =pattern.matcher(line); 			
			if(Denetim(line))
					continue;		 
			 while(matcher.find()){
				
			sayac++;	
		
			}
			}
					
		return sayac;
	}
	
	
	public Integer iliskiselOperatorSayaci (BufferedReader bReader) throws IOException {
		Pattern pattern=Pattern.compile("(\\<\\=?|\\>\\=?|==|!=)");
		Matcher matcher;

		String line;
		
		 int sayac=0;
		 while((line =bReader.readLine()) != null) {
			 matcher =pattern.matcher(line); 
			if(Denetim(line)) 					
					continue;
			while(matcher.find()){
								
			sayac++;	
		
			}
			}
			
		return sayac;
	}
	
	
	public Integer MantiksalOperatorSayaci (BufferedReader bReader) throws IOException {
		
		Pattern pattern=Pattern.compile("(\\&\\&|\\\\\\\\|\\!(?!\\=))");
		Matcher matcher;
	
		String line;
		
		 int sayac=0;
		 while((line =bReader.readLine()) != null) {
			 matcher =pattern.matcher(line); 
			if(Denetim(line))
					continue;
			while(matcher.find()){				
			sayac++;	
		
			}
			}
			
		
		return sayac;
	}
	
	private Boolean Denetim(String line) {
		boolean sonuc =false;
		
	Pattern pattern3 =Pattern.compile("(\\/\\*)");
	Matcher matcher3= pattern3.matcher(line); 
	if(matcher3.find()) {
		
	
		yorumDurum =true;
		
	
	}
	
	Pattern patternn =Pattern.compile("(\\*\\/)");
		Matcher matcherr= patternn.matcher(line); 
		if(matcherr.find()) {
	
			yorumDurum =false;
			sonuc = true;
		}
	
	Pattern pattern2 =Pattern.compile("(\\/\\/)");
	Matcher matcher2= pattern2.matcher(line); 
	  if(matcher2.find()) {
	sonuc = true;}
	  
	    
	if(yorumDurum) {

		sonuc = true;
	}
	
	  
	  
	return sonuc;
}

	
}




