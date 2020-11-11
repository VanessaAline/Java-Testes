import java.io.File;
import java.io.IOException;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class LerImagem {

	public static void main(String[] args) {
		File imageFile = new File("C:/Imagem/phrase.jpg");

		// tess4j.setDatapath("/usr/share/tesseract-ocr/4.00/tessdata");

		try {
			System.out.println("OI");
			Tesseract tess4j = new Tesseract();
			// tess4j.setLanguage("por");
			// String result = tess4j.doOCR(imageFile);
			// System.out.println(result);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}