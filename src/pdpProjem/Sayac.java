/**
*
* @Ali Said Saritemur ali.saritemur@agr.sakarya.edu.tr
* @17.03.2022
* <p>
* Operator sayma islemlerinin gercekelstigi sinif
* </p>
*/
package pdpProjem;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sayac {

	boolean yorumDurum = false;

	public Integer sayisalOperatorSayaci(BufferedReader bReader) throws IOException {

		Pattern pattern = Pattern.compile(
				"(([\\|\\+\\-\\/\\%\\&\\^]\\=|(?<![!=<>])\\=(?!=)|\\+[\\+\\=]|\\+|\\-[\\-\\=]|\\-|\\||(?<!\\/)\\/(?!\\/)|\\%|(?<!\\&)\\&(?!\\&)|(?<!\\|)\\|(?!\\|)|\\^"
						+ "|(\\*\\=?|\\/\\=?)))");

		Matcher matcher;
		String line;

		int sayac = 0;
		while ((line = bReader.readLine()) != null) {
			line = yorumSatiriniTemizleme(line);
			matcher = pattern.matcher(line);
			while (matcher.find()) {

				sayac++;

			}
		}

		return sayac;
	}

	public Integer iliskiselOperatorSayaci(BufferedReader bReader) throws IOException {
		Pattern pattern = Pattern.compile("(\\<\\=?|\\>\\=?|==|!=)");
		Matcher matcher;

		String line;

		int sayac = 0;
		while ((line = bReader.readLine()) != null) {
			line = yorumSatiriniTemizleme(line);
			matcher = pattern.matcher(line);
			while (matcher.find()) {

				sayac++;

			}
		}

		return sayac;
	}

	public Integer MantiksalOperatorSayaci(BufferedReader bReader) throws IOException {

		Pattern pattern = Pattern.compile("(\\&\\&|\\\\\\\\|\\!(?!\\=))");
		Matcher matcher;

		String line;

		int sayac = 0;
		while ((line = bReader.readLine()) != null) {
			line = yorumSatiriniTemizleme(line);
			matcher = pattern.matcher(line);
			while (matcher.find()) {
				sayac++;
			}
		}

		return sayac;
	}

	public Integer IkiliOperatorSayaci(BufferedReader bReader) throws IOException {

		Pattern pattern = Pattern.compile(
				"(?<!\\+)\\+(?![\\+\\=])|(?<!\\-)\\-(?![\\-\\=])|\\*(?![\\*\\=])|\\/(?![\\/\\=])|(?<![\\=\\+\\!\\-])\\=(?![\\+\\=])");
		Matcher matcher;

		String line;

		int sayac = 0;
		while ((line = bReader.readLine()) != null) {
			line = yorumSatiriniTemizleme(line);
			matcher = pattern.matcher(line);
			while (matcher.find()) {
				sayac++;
			}
		}
		return sayac;
	}

	public Integer TekliOperatorSayaci(BufferedReader bReader) throws IOException {

		Pattern pattern = Pattern.compile("\\+[\\+]|\\-[\\-]");
		Matcher matcher;

		String line;

		int sayac = 0;
		while ((line = bReader.readLine()) != null) {
			line = yorumSatiriniTemizleme(line);
			matcher = pattern.matcher(line);
			while (matcher.find()) {
				sayac++;
			}
		}
		return sayac;
	}

	
	private String yorumSatiriniTemizleme(String line) {
		boolean sonuc = false;
		String line1 = line;
		Pattern pattern3 = Pattern.compile("(\\/\\*)");
		Matcher matcher3 = pattern3.matcher(line1);
		if (matcher3.find()) {

			String newLine = " ";
			char onceki = ' ';
			for (char value : line1.toCharArray()) {

				if (value == '*' && onceki == '/') {
					break;
				}

				newLine += onceki;
				onceki = value;
			}

			yorumDurum = true;
			line1 = newLine;

		}

		Pattern patternn = Pattern.compile("(\\*\\/)");
		Matcher matcherr = patternn.matcher(line1);
		if (matcherr.find()) {

			boolean yorumSatiriDevami = false;
			String newLine = " ";
			char onceki = ' ';
			for (char value : line1.toCharArray()) {

				if (yorumSatiriDevami) {

					newLine += value;
				}

				if (value == '/' && onceki == '*') {
					yorumSatiriDevami = true;
				}

				onceki = value;
			}

			line1 = newLine;

			yorumDurum = false;

		}

		Pattern pattern2 = Pattern.compile("(\\/\\/)");
		Matcher matcher2 = pattern2.matcher(line1);
		if (matcher2.find() && !yorumDurum) {

			String newLine = " ";
			char onceki = ' ';
			for (char value : line1.toCharArray()) {

				if (value == '/' && onceki == '/') {
					break;
				}

				newLine += onceki;
				onceki = value;
			}

			line1 = newLine;

		}

		if (yorumDurum) {
			line1 = " ";
		}

		return line1;
	}

}
