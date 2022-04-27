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

//        Длины  и отступы нижнего белого прямоугольника
        double whiteWidth = 1.05;
        double whiteHeight = 2;
        double gapHorisontal = 0.38;
        double gapVertical =  3;

//        Зазор между белыми прямоуголниками

        double gapBetweenWhiteRectangular = 3;
        int quntityLineWhiteRectangular = 3;

//        Создаем Начало файла
//        Записываем в него текст по умолчанию
        TextTopFile_0 textTopFile0 = new TextTopFile_0();
        textTopFile0.addStringToList_fullText(textTopFile0.getDefaultText());

//        Создаем черный прямоугольник
        TextBlackRectangularFile_1 textBlackRectangularFile1 =
                new TextBlackRectangularFile_1();
//        Считаем координаты для черного прямоуголника
        CalculateBlack calculateBlack = new CalculateBlack(
                blackWidth,
                blackHeight,
                startBlackX ,
                startBlackY
        );
//        Записываем посчитанные координа из объекта в черный прямоуголник
        textBlackRectangularFile1.writeFullText(calculateBlack.getBlackX(), calculateBlack.getBlackY(),
                calculateBlack.getBlackWidth(), calculateBlack.getBlackHeight());

//      Создаем белый прямоугольник
        TextWhiteSlotFile_2 textWhiteSlotFile2 = new TextWhiteSlotFile_2();
//        Считаем координаты для белого прямоуголника
        CalculateWhiteRectangular calculateWhiteRectangular = new CalculateWhiteRectangular(
                blackWidth,
                blackHeight,
                startBlackX,
                startBlackY,
                gapHorisontal,
                gapVertical,
                whiteHeight,
                whiteWidth
        );
//        Записываем посчитанные координа из объекта в белый прямоугольник
        textWhiteSlotFile2.reWriteFullText(
                calculateWhiteRectangular.getWhiteX(),
                calculateWhiteRectangular.getWhiteY(),
                whiteWidth,
                whiteHeight,
                calculateWhiteRectangular.getCircleOneX(),
                calculateWhiteRectangular.getCircleOneY(),
                calculateWhiteRectangular.getCircleOneR(),
                calculateWhiteRectangular.getCircleTwoX(),
                calculateWhiteRectangular.getCircleTwoY(),
                calculateWhiteRectangular.getCircleTwoR()
        );

//        Создаем еще один белый прямоуголник
        TextWhiteSlotFile_2 textWhiteSlotFile2WithGap = new TextWhiteSlotFile_2();
//        Считаем для него координаты с добавленным отступом
        CalculateWhiteRectangular calculateWhiteRectangularWithGap = new CalculateWhiteRectangular(
                blackWidth,
                blackHeight,
                startBlackX,
                startBlackY,
                gapHorisontal,
                gapVertical + gapBetweenWhiteRectangular,
                whiteHeight,
                whiteWidth
        );
        //        Записываем посчитанные координа из объекта в белый прямоугольник
        textWhiteSlotFile2WithGap.reWriteFullText(
                calculateWhiteRectangularWithGap.getWhiteX(),
                calculateWhiteRectangularWithGap.getWhiteY(),
                whiteWidth,
                whiteHeight,
                calculateWhiteRectangularWithGap.getCircleOneX(),
                calculateWhiteRectangularWithGap.getCircleOneY(),
                calculateWhiteRectangularWithGap.getCircleOneR(),
                calculateWhiteRectangularWithGap.getCircleTwoX(),
                calculateWhiteRectangularWithGap.getCircleTwoY(),
                calculateWhiteRectangularWithGap.getCircleTwoR()
        );

//        Создаем Конец файла
//        Записываем в него текст по умолчанию
        TextEndFile_3 textEndFile3 = new TextEndFile_3();
        textEndFile3.addStringToList_fullText(textEndFile3.getDefaultText());

//        Создаем объект для всего текста
        FullText fullText = new FullText();
//        Добавляем в него верх файла
        fullText.addTextBlockTolistOfBlocks(textTopFile0);
//        Добавляем в него черный прямоуголник
        fullText.addTextBlockTolistOfBlocks(textBlackRectangularFile1);
//        Добавляем в него нижний белый прямоуголник
        fullText.addTextBlockTolistOfBlocks(textWhiteSlotFile2);
//        Добавляем в него второй белый прямоуголник
        fullText.addTextBlockTolistOfBlocks(textWhiteSlotFile2WithGap);
//        Добавляем в него конец файла
        fullText.addTextBlockTolistOfBlocks(textEndFile3);

//        Записываем в файл текст со всех добавленных блоков текста
       fullText.writeToFile_allEnteredBlockText(fullFilePath);

//       Выводим в консоль координаты нижнего прямоугольника
        calculateWhiteRectangular.printToString();

        }
    }

