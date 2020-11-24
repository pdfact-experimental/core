package pdfact;

import pdfact.model.Document;
import pdfact.model.Page;
import pdfact.parser.PdfParser;

/**
 * Hello world!
 */
public class PdfActParserMain {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
      System.out.println("Running pdfact ...");
      Document doc = new PdfParser().parse();
      System.out.println("Parsed document id: " + doc.id);

      Page page = new Page();
      page.pageNum = 12;
      System.out.println("Parsed page number: " + page.pageNum);
    }
}
