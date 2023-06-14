package principal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;



public class Principal {

	public static void main(String[] args) {
		 try {
			 	XWPFDocument documento = new XWPFDocument();
				 FileOutputStream fileOutputStream = new FileOutputStream(new File("arquivo.docx"));
				 XWPFParagraph paragrafo = documento.createParagraph();
				 XWPFRun criar = paragrafo.createRun();
				 criar.setText("Lorem ipsum dolor sit amet consectetur adipisicing elit. Corporis optio atque veniam velit.");
							
					documento.write(fileOutputStream);
					System.out.println("Documento criado com Sucesso!");
					documento.close();
					fileOutputStream.close();
				} catch (IOException e) {
					System.err.println("Erro: "+e.getMessage());
				}
			}
}
