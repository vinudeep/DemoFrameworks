package helpers;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@SuppressWarnings("unused")
public class DataHelper {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static HashMap<String,String> storeValues = new HashMap();


	public static List<HashMap<String,String>> data()
	{


		List<HashMap<String,String>> mydata = new ArrayList<>();
		try
		{

			FileInputStream fs = new FileInputStream(System.getProperty("C://Users//vmalalu1//workspace//eCommO2StdFramework1//src//test//java//resources//testData//TestData-seleniumframework.xlsx"));
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet("TestData");
			Row HeaderRow = sheet.getRow(0);

			for(int i=1;i<sheet.getPhysicalNumberOfRows();i++)
			{
				Row currentRow = sheet.getRow(i);
				HashMap<String,String> currentHash = new HashMap<String,String>();
				for(int j=0;j<currentRow.getPhysicalNumberOfCells();j++)
				{
					Cell currentCell = currentRow.getCell(j);

					switch (currentCell.getCellType())
					{
					case Cell.CELL_TYPE_STRING:
						System.out.print(currentCell.getStringCellValue() + "\t");

						currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
						break;
					}

				}
				mydata.add(currentHash);
			}

			fs.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return mydata;

	}

}
