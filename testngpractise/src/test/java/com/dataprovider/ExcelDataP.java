package com.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataP {

	@DataProvider(name="ex")
	public String[][] excelpdp() throws Exception {
		File f=new File("C:\\JAVA_PRACTISE\\Git_Practise\\testngpractise\\Resources\\SampleData.xlsx");
		FileInputStream fis=new FileInputStream(f);//raw datta
		XSSFWorkbook work=new XSSFWorkbook(fis);//raw datta copy to workbook
		XSSFSheet sh=work.getSheet("sheet1");
		int rows=sh.getPhysicalNumberOfRows();
		int colu=sh.getRow(0).getLastCellNum();
		
		
		
		String[][] data=new String[rows][colu];//array for dattapovider
		for(int i=1; i<rows;i++) {
		
			for(int j=0; j<colu;j++) {
				DataFormatter df= new DataFormatter();
				System.out.println(df.formatCellValue(sh.getRow(i).getCell(j)));
				data[i][j]=df.formatCellValue(sh.getRow(i).getCell(j));
			}
		System.out.println();
		
		}
		work.close();
		fis.close();
		return data;
		
		
		
		
		
		
		
		
		

	}

}
