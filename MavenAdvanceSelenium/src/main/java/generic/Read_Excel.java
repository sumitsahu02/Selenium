package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Excel implements FrameworkConstants {

	public static Object[][] fetchExcel() throws Throwable
	{
		FileInputStream fis=new FileInputStream(Excel_path);
		Workbook w=WorkbookFactory.create(fis);
		Sheet s = w.getSheet(Sheet_number);
		int row = s.getPhysicalNumberOfRows();
		int column = s.getRow(0).getPhysicalNumberOfCells();
		System.out.println(row);
		System.out.println(column);
		Object[][] d=new Object[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				d[i][j]=s.getRow(i).getCell(j).toString();
			}
		}
		return d;
		
	}
}
