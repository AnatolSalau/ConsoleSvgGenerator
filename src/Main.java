import createDeleteWriteFiles.CreateDeleteSvgFIle;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String fullFilePath = "out" + File.separator +"SVG.svg";

        //Проверяем есть ли файл, если есть удаляем старый файл
        CreateDeleteSvgFIle createDeleteSvgFIle = new CreateDeleteSvgFIle(fullFilePath);
        if (createDeleteSvgFIle.checkFileYesNo() == true) {
            createDeleteSvgFIle.deleteFile();
        }
        else {
            createDeleteSvgFIle.createFile();
            //Начинаем запись в файл
/*            createDeleteWriteFiles.WriteToSvg writeToSvg = new createDeleteWriteFiles.WriteToSvg(fullFilePath,arrayfullText.toString());
            writeToSvg.fileWrite(true);*/
        }


    }
}
