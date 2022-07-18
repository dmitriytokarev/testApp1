package com.test.demo.aop;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;

@Data
@Component
public class StringToPdf {
    Integer count = 1;
    public void converter(String s) {
        Document document = new Document();
        s = s.replaceAll("[\\[\\]]", "");
        String[] words =s.split(",");

        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream("HelloWorld-Table.pdf"));

            document.open();

            PdfPTable table = new PdfPTable(2); // 2 columns.

            PdfPCell cell1 = new PdfPCell(new Paragraph("Id"));
            PdfPCell cell2 = new PdfPCell(new Paragraph("String"));

            table.addCell(cell1);
            table.addCell(cell2);
            for (String word : words) {
                table.addCell(count.toString());
                table.addCell(word);
                count ++;
            }
            document.add(table);
            document.close();
        } catch(Exception e){
        }
    }
}
