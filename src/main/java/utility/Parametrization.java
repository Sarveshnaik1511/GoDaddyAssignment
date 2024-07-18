package utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String getData(String name, int row, int column) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("C:\\Software Testing Arise\\Assignments\\src\\test\\resources\\DataSheet.xlsx");
		return WorkbookFactory.create(file).getSheet(name).getRow(row).getCell(column).getStringCellValue();
	}

}
