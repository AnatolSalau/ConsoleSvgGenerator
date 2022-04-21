package fileClasses;

import createDeleteWriteFiles.CreateDeleteSvgFIle;
import createDeleteWriteFiles.WriteToSvg;

public class FullText extends Text{
    private final Text[] allEnteredBlockText;


    public FullText(Text... textBlock) {
        this.allEnteredBlockText = textBlock;
        for (Text object: textBlock) {
            for (String str:object.getFullText()) {
                this.fullText.add(str);
            }
        }

    }
    public void rewriteFullTextToDefaulFromObjects () {
        fullText.removeAll(fullText);
        for (Text object: allEnteredBlockText) {
            this.fullText.add(object.getDefaultText());
        }
    }

    public void writeListToFile(String fullFilePath) {
//Проверяем есть ли файл, если есть удаляем старый файл
        CreateDeleteSvgFIle createDeleteSvgFIle = new CreateDeleteSvgFIle(fullFilePath);
        if (createDeleteSvgFIle.checkFileYesNo() == true) {
            createDeleteSvgFIle.deleteFile();
        }
        else {
            createDeleteSvgFIle.createFile();
            //Начинаем запись в файл
            WriteToSvg writeToSvg = new WriteToSvg(fullFilePath,this.fullText.toString());
            writeToSvg.fileWrite(true);

        }
    }
}
