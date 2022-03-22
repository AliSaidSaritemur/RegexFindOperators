/**
*
* @Ali Said Saritemur ali.saritemur@ogr.sakarya.edu.tr
* @17.03.2022
* <p>
* Operator ve operand bilgisinin tutuldugu sinif
* </p>
*/
package pdpProjem;

import java.io.IOException;

public class Operator {

	private String dosyaKonumu;

	private int ikiliOpsayisi;
	private int tekliOpsayisi;
	private int sayisalOpsayisi;
	private int iliskiselOpSayisi;
	private int mantiksalOpSayisi;
	private int toplamOperandSayisi;
	
	public int getIkiliOpsayisi() {
		return ikiliOpsayisi;
	}

	public void setIkiliOpsayisi(int ikiliOpsayisi) {
		this.ikiliOpsayisi = ikiliOpsayisi;
	}

	public int getTekliOpsayisi() {
		return tekliOpsayisi;
	}

	public void setTekliOpsayisi(int tekliOpsayisi) {
		this.tekliOpsayisi = tekliOpsayisi;
	}

	public int getSayisalOpsayisi() {
		return sayisalOpsayisi;
	}

	public void setSayisalOpsayisi(int sayisalOpsayisi) {
		this.sayisalOpsayisi = sayisalOpsayisi;
	}

	public int getIliskiselOpSayisi() {
		return iliskiselOpSayisi;
	}

	public void setIliskiselOpSayisi(int iliskiselOpSayisi) {
		this.iliskiselOpSayisi = iliskiselOpSayisi;
	}

	public int getMantiksalOpSayisi() {
		return mantiksalOpSayisi;
	}

	public void setMantiksalOpSayisi(int mantiksalOpSayisi) {
		this.mantiksalOpSayisi = mantiksalOpSayisi;
	}

	public int getToplamOperandSayisi() {
		return toplamOperandSayisi;
	}

	public void setToplamOperandSayisi(int toplamOperandSayisi) {
		this.toplamOperandSayisi = toplamOperandSayisi;
	}

	public Operator(String dosyaKonumu) throws IOException {
		super();
		this.dosyaKonumu = dosyaKonumu;
		DosyaOkuma dK = new DosyaOkuma(dosyaKonumu);
		Sayac sayac = new Sayac();

		tekliOpsayisi = sayac.TekliOperatorSayaci(dK.yeniBrOlusturma());
		ikiliOpsayisi = sayac.IkiliOperatorSayaci(dK.yeniBrOlusturma());
		sayisalOpsayisi = sayac.sayisalOperatorSayaci(dK.yeniBrOlusturma());
		iliskiselOpSayisi = sayac.iliskiselOperatorSayaci(dK.yeniBrOlusturma());
		mantiksalOpSayisi = sayac.MantiksalOperatorSayaci(dK.yeniBrOlusturma());
		toplamOperandSayisi=(sayisalOpsayisi+iliskiselOpSayisi+mantiksalOpSayisi)*2-tekliOpsayisi;
		
	}

}
