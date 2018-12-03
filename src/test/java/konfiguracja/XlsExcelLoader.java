package konfiguracja;

import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class XlsExcelLoader {

    private String fileName ="";
    private Workbook workbook =null;

    public XlsExcelLoader(String fileName){
        this.fileName = fileName;
        File file = new File(fileName);
        try {
            workbook = Workbook.getWorkbook(file);
        } catch (IOException e){
            e.getMessage();
        } catch (BiffException e) {
            e.getMessage();
        }
        //workbook.close();

    }
    public String returnValue(int column, int row){
       return workbook.getSheet(0).getCell(column-1, row-1).getContents();
    }





}
