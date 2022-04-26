import calculateCoordinat.CalculateBlack;
import calculateCoordinat.CalculateWhiteRectangular;
import fileClasses.*;

import java.io.File;


public class Main {
    public static void main(String[] args) {
//        Путь к файлу
        String fullFilePath = "out" + File.separator +"SVG.svg";

//        Координаты и длины черного прямоуголника
        double blackWidth = 5.4;
        double blackHeight = 15;
        double startBlackX = 102.7;
        double startBlackY = 115;

//        Координаты и длины белого прямоугольника
        double whiteWidth = 1.05;
        double whiteHeight = 2.3;
        double gapHorisontal = 0.38;
        double gapVertical =  12.59;

//        Создаем Начало файла
//        Записываем в него текст по умолчанию
        TextTopFile_0 textTopFile0 = new TextTopFile_0();
        textTopFile0.addStringToList_fullText(textTopFile0.getDefaultText());

//        Создаем черный прямоугольник
        TextBlackRectangularFile_1 textBlackRectangularFile1 =
                new TextBlackRectangularFile_1();
//        Считаем координаты для черного прямоуголника
        CalculateBlack calculateBlack = new CalculateBlack(5.4, 15,102.7 ,115);
//        Записываем посчитанные координа из объекта в черный прямоуголник
        textBlackRectangularFile1.writeFullText(calculateBlack.getBlackX(), calculateBlack.getBlackY(),
                calculateBlack.getBlackWidth(), calculateBlack.getBlackHeight());

//      Создаем белый прямоугольник
        TextWhiteSlotFile_2 textWhiteSlotFile2 = new TextWhiteSlotFile_2();
//        Считаем координаты для белого прямоуголника
        CalculateWhiteRectangular calculateWhiteRectangular = new CalculateWhiteRectangular(blackWidth,
                blackHeight,startBlackX,startBlackY,gapHorisontal,gapVertical,whiteHeight,whiteWidth);
//        Записываем посчитанные координа из объекта в белый прямоугольник
        textWhiteSlotFile2.reWriteFullText(calculateWhiteRectangular.getWhiteX(), calculateWhiteRectangular.getWhiteY(),1.05,2.3,100.751,102.039,0.525,102.378,
                103.665,0.525);

        TextWhiteSlotFile_2 textWhiteSlotFile21 = new TextWhiteSlotFile_2();
        textWhiteSlotFile21.reWriteFullText(102.38, 102.41,1.05,2.3,102.751,102.039,0.525,104.378,
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



        calculateWhiteRectangular.printToString();

        }
    }

