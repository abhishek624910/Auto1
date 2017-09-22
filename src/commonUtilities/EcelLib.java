package commonUtilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EcelLib {
	public String getStringData(String shell,int r,int c) throws Exception{
		FileInputStream fis=new FileInputStream(Constants.filepath);
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(shell).getRow(r).getCell(c).getStringCellValue();
		return data;
	}
	public double getNumericData(String shell,int r,int c) throws Exception{
		FileInputStream fis=new FileInputStream(Constants.filepath);
		Workbook wb=WorkbookFactory.create(fis);
		double data=wb.getSheet(shell).getRow(r).getCell(c).getNumericCellValue();
		return data;
	}
	public void setData(String shell,int r,int c,String data) throws Exception{
		FileInputStream fis=new FileInputStream(Constants.filepath);
		Workbook wb=WorkbookFactory.create(fis);
		if(wb.getSheet(shell).getRow(r).equals(null)){
			wb.getSheet(shell).createRow(r);
		}else if(wb.getSheet(shell).getRow(r).getCell(c).equals(null)){
			wb.getSheet(shell).getRow(r).createCell(c);
		}else{
			wb.getSheet(shell).getRow(r).createCell(c).setCellValue("data");
		}
		FileOutputStream fos=new FileOutputStream(Constants.filepath);
		wb.write(fos);
		wb.close();
	}
}
