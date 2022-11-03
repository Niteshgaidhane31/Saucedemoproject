package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Paramaterization {
public static String getExcelSheetData(int row, int cell,String SheetName) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("D:\\Testing\\SwagLab\\src\\main\\resources\\TestData.xlsx");
	String value= WorkbookFactory.create(file).getSheet("Credentials").getRow(row).getCell(cell).getStringCellValue();
	return value;
	
}
}
