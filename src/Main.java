import fileClasses.*;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        String fullFilePath = "out" + File.separator +"SVG.svg";
        TextTopFile_0 textTopFile0 = new TextTopFile_0();
        TextBlackRectangularFile_1 textBlackRectangularFile1 = new TextBlackRectangularFile_1();
        TextWhiteSlotFile_2 textWhiteSlotFile2 = new TextWhiteSlotFile_2();
        TextEndFile_3 textEndFile3 = new TextEndFile_3();
        FullText fullText = new FullText(textTopFile0,textBlackRectangularFile1,textWhiteSlotFile2,textEndFile3);
        fullText.rewriteFullTextToDefaulFromObjects();
        fullText.writeListToFile(fullFilePath);
        }
    }

