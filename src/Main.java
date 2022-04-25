import fileClasses.*;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        String fullFilePath = "out" + File.separator +"SVG.svg";

        TextTopFile_0 textTopFile0 = new TextTopFile_0();
        textTopFile0.addStringToList_fullText(textTopFile0.getDefaultText());

/*        TextBlackRectangularFile_1 textBlackRectangularFile1 =
                new TextBlackRectangularFile_1( 100, 99 ,5.4 ,15 );*/
//        textBlackRectangularFile1.addStringToList_fullText(textBlackRectangularFile1.getDefaultText());
        TextBlackRectangularFile_1 textBlackRectangularFile1 =
                new TextBlackRectangularFile_1();
        textBlackRectangularFile1.writeFullText( 100, 99 ,5.4 ,15 );

        TextWhiteSlotFile_2 textWhiteSlotFile2 = new TextWhiteSlotFile_2();
        textWhiteSlotFile2.writeFullText(100.38, 102.41,1.05,2.3,100.751,102.039,0.525,102.378,
                103.665,0.525);

        TextWhiteSlotFile_2 textWhiteSlotFile21 = new TextWhiteSlotFile_2();
        textWhiteSlotFile21.writeFullText(102.38, 102.41,1.05,2.3,102.751,102.039,0.525,104.378,
                103.665,0.525);

        TextEndFile_3 textEndFile3 = new TextEndFile_3();
        textEndFile3.addStringToList_fullText(textEndFile3.getDefaultText());

/*        FullText fullText = new FullText(textTopFile0,textBlackRectangularFile1,
                                         textWhiteSlotFile2,textEndFile3);*/


        FullText fullText = new FullText();
        fullText.addTextBlockTolistOfBlocks(textTopFile0);
        fullText.addTextBlockTolistOfBlocks(textBlackRectangularFile1);
        fullText.addTextBlockTolistOfBlocks(textWhiteSlotFile2);
        fullText.addTextBlockTolistOfBlocks(textWhiteSlotFile21);
        fullText.addTextBlockTolistOfBlocks(textEndFile3);

/*        fullText.rewriteFullTextToDefaulFromObjects();
        fullText.writeToFile_fullText(fullFilePath);*/

       fullText.writeToFile_allEnteredBlockText(fullFilePath);

        }
    }

