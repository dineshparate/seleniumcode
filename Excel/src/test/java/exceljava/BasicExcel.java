package exceljava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BasicExcel {
	public static void main(String[] args) throws IOException {
		ArrayList<String> data = new ArrayList<String>();
		data = BasicExcel.getTestCaseData();
		System.out.println(data);
	}

	public static ArrayList<String> getTestCaseData() throws IOException {
		String path = "D:\\Selenium Notes\\Code\\spreadsheet.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		int sheets = book.getNumberOfSheets();
		ArrayList<String> a = new ArrayList<String>();
		// XSSFSheet sheet=book.getSheetAt(0);

		int coloumn = 0;
		for (int i = 0; i < sheets; i++) {
			if (book.getSheetName(i).equalsIgnoreCase("sheet1")) {
				XSSFSheet book1 = book.getSheetAt(i);
				Iterator<Row> rows = book1.iterator();
				Row firstrow = rows.next();
				System.out.println(i);
				Iterator<Cell> ce = firstrow.cellIterator();
				int k = 0;

				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCasee")) {
						coloumn = k;
					}
					k++;
				}
				System.out.println(coloumn);

				while (rows.hasNext()) {
					double s1=0;
					Row row = rows.next();
					if (row.getCell(coloumn).getStringCellValue().equalsIgnoreCase("Purchase")) {
						Iterator<Cell> cell = row.cellIterator();
						while (cell.hasNext()) {
							// System.out.println(cell.next().getStringCellValue());
							Cell c = cell.next();
							if (c.getCellType() == CellType.BLANK)
							{
								a.add(c.getStringCellValue());
							}
							else
							{
							// s1 = c.getNumericCellValue();
							 //String s2=String.valueOf(s1);
								//a.add(s2);
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}
					}

				}
			}
		}
		return a;
	}

}
