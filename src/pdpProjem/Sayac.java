package pdpProjem;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sayac  {
	
	boolean yorumDurum=false;
	
	public Integer sayisalOperatorSayaci (BufferedReader bReader) throws IOException {
		Pattern pattern;
		
		Matcher matcher;
		
		String line;
		 pattern =Pattern.compile("(([\\!\\+\\-\\/\\\\%\\&\\^]\\=|(?<![=<>])\\=(?![=<>])|\\+[\\+\\=]|\\+|\\-[\\-\\=]|\\-|\\|\\/|\\%|(?<!\\&)\\&(?!\\&)|(?<!\\|)\\|(?!\\|)|\\^))");
	
		 int sayac=0;
		 while((line =bReader.readLine()) != null) {
			 matcher =pattern.matcher(line); 
			 
			
			while(matcher.find()){
				if(Denetim(line))
					break;
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
			while(matcher.find()){
				if(Denetim(line))
					break;
			sayac++;	
		
			}
			}
			
		
		return sayac;
	}
	
	
	public Integer MantiksalOperatorSayaci (BufferedReader bReader) throws IOException {
		
		Pattern pattern=Pattern.compile("(\\&\\&|\\\\\\\\|(?<!\\!)\\!(?!\\!))");
		Matcher matcher;
	
		String line;
		
		 int sayac=0;
		 while((line =bReader.readLine()) != null) {
			 matcher =pattern.matcher(line); 
			while(matcher.find()){
				if(Denetim(line))
					break;
			sayac++;	
		
			}
			}
			
		
		return sayac;
	}
	
	private Boolean Denetim(String line) {
		boolean sonuc =false;
		
		Pattern patternn =Pattern.compile("(\\*\\/)");
		Matcher matcherr= patternn.matcher(line); 
		if(matcherr.find() || yorumDurum) {
			yorumDurum =false;
		sonuc = true;
		
		}
		

	Pattern pattern =Pattern.compile("(\\/\\*)");
	Matcher matcher= pattern.matcher(line); 
	if(matcher.find() || yorumDurum) {
		yorumDurum =true;
	sonuc = true;
	
	}
	  
	
	
	Pattern pattern2 =Pattern.compile("(^\\/\\/)");
	Matcher matcher2= pattern2.matcher(line); 
	  if(matcher2.find()) {
		  System.out.println("mera");
	sonuc = true;}
	  
	return sonuc;
}

	
}




