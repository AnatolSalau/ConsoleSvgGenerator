import createDeleteWriteFiles.CreateDeleteSvgFIle;
import createDeleteWriteFiles.WriteToSvg;
import fileClasses.DefaultText;
import fileClasses.PartsOfSVG;
import fileClasses.Parts_0;


import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Path to SVG file that will create
        String fullFilePath = "out" + File.separator +"SVG.svg";
//      Create objects for all levels SVG
        PartsOfSVG part_0= new PartsOfSVG(DefaultText.TOP_FILE_0.getText());

        PartsOfSVG part_1= new PartsOfSVG(DefaultText.BLACK_RECTANGULAR_1.getText());
        PartsOfSVG part_2= new PartsOfSVG(DefaultText.WHITE_SLOT_2.getText());
        PartsOfSVG part_3= new PartsOfSVG(DefaultText.END_FILE_3.getText());

        //Проверяем есть ли файл, если есть удаляем старый файл
        CreateDeleteSvgFIle createDeleteSvgFIle = new CreateDeleteSvgFIle(fullFilePath);
        if (createDeleteSvgFIle.checkFileYesNo() == true) {
            createDeleteSvgFIle.deleteFile();
        }
        else {
            createDeleteSvgFIle.createFile();
            WriteToSvg writeToSvg = new WriteToSvg();
            writeToSvg.fileWrite(true,fullFilePath,part_0.getDefaultText());
            writeToSvg.fileWrite(true,fullFilePath,part_1.getDefaultText());
            writeToSvg.fileWrite(true,fullFilePath,part_2.getDefaultText());
            writeToSvg.fileWrite(true,fullFilePath,part_3.getDefaultText());

            Parts_0 part_01 = new Parts_0();
            for (:
                 ) {
                
            }
        }

    }
}
