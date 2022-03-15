package pdpProjem;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sayac  {
	
	
	
	public Integer sayisalOperatorSayaci (BufferedReader bReader) throws IOException {
		Pattern pattern;
		Matcher matcher;
		String line;
		 pattern =Pattern.compile("(([\\!\\+\\-\\/\\\\%\\&\\^]\\=|(?<![=<>])\\=(?![=<>])|\\+[\\+\\=]|\\+|\\-[\\-\\=]|\\-|\\|\\/|\\%|(?<!\\&)\\&(?!\\&)|(?<!\\|)\\|(?!\\|)|\\^))");
		
		 int sayac=0;
		 while((line =bReader.readLine()) != null) {
			 matcher =pattern.matcher(line); 
			while(matcher.find()){
			sayac++;	
		
			}
			}
			
		
		return sayac;
	}
	
	
	public Integer iliskiselOperatorSayaci (BufferedReader bReader) throws IOException {
		Pattern pattern;
		Matcher matcher;

		String line;
		 pattern =Pattern.compile("(\\<\\=?|\\>\\=?|==|!=)");
		
		 int sayac=0;
		 while((line =bReader.readLine()) != null) {
			 matcher =pattern.matcher(line); 
			while(matcher.find()){
			sayac++;	
		
			}
			}
			
		
		return sayac;
	}
	
	
	public Integer MantiksalOperatorSayaci (BufferedReader bReader) throws IOException {
		Pattern pattern;
		Matcher matcher;
	
		String line;
		 pattern =Pattern.compile("(\\&\\&|\\\\\\\\|(?<!\\!)\\!(?!\\!))");
		
		 int sayac=0;
		 while((line =bReader.readLine()) != null) {
			 matcher =pattern.matcher(line); 
			while(matcher.find()){
			sayac++;	
		
			}
			}
			
		
		return sayac;
	}
	
}
