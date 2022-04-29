import calculateCoordinat.CalculateBlack;
import calculateCoordinat.CalculateWhiteRectangular;
import calculateCoordinat.CoordinatesGapsSizes;
import fileClasses.*;

import java.io.File;


public class Main {
    public static void main(String[] args) {
//        Путь к файлу
        String fullFilePath = "out" + File.separator +"SVG.svg";

//        Координаты и длины черного прямоуголника
        double blackWidth = CoordinatesGapsSizes.BLACK_WIDTH.getValue();
        double blackHeight = CoordinatesGapsSizes.BLACK_HEIGHT.getValue();
        double startBlackX = CoordinatesGapsSizes.BLACK_START_X.getValue();
        double startBlackY = CoordinatesGapsSizes.BLACK_START_Y.getValue();

//        Длины  и отступы нижнего белого прямоугольника
        double whiteWidth = CoordinatesGapsSizes.WHITE_WIDTH.getValue();
        double whiteHeight = CoordinatesGapsSizes.WHITE_HEIGHT.getValue();
        double gapHorisontal = CoordinatesGapsSizes.GAP_HORISONTAL.getValue();
        double gapVertical =  CoordinatesGapsSizes.GAP_VERTICAL.getValue();

//        Зазор между белыми прямоуголниками
        double gapBetweenWhiteRectangular = CoordinatesGapsSizes.GAP_BETWEEN_WHITE_RECTANGULAR.getValue();


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

//      Создаем белый прямоугольник #1
        TextWhiteSlotFile_2 whiteRectangular_1 = new TextWhiteSlotFile_2();
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
        //       Выводим в консоль координаты  прямоугольника #1
        calculateWhiteRectangular.printToString();
//        Записываем посчитанные координа из объекта в белый прямоугольник #1
        whiteRectangular_1.reWriteFullText(
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

//        Создаем второй белый прямоуголник #2
        TextWhiteSlotFile_2 whiteRectangular_2 = new TextWhiteSlotFile_2();
//        Считаем для прямоуголника №2 координаты с добавленным отступом
        calculateWhiteRectangular.reCalculateWhiteRectangular(
                blackWidth,
                blackHeight,
                startBlackX,
                startBlackY,
                gapHorisontal,
                gapVertical + gapBetweenWhiteRectangular,
                whiteHeight,
                whiteWidth
        );
        //       Выводим в консоль координаты  прямоугольника №2
        calculateWhiteRectangular.printToString();

        //        Записываем посчитанные координа из объекта в белый прямоугольник #2
        whiteRectangular_2.reWriteFullText(
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

        //        Создаем третий белый прямоуголник #3
        TextWhiteSlotFile_2 whiteRecnangular_3 = new TextWhiteSlotFile_2();
//        Считаем для прямоуголника №3 координаты с добавленным отступом
        calculateWhiteRectangular.reCalculateWhiteRectangular(
                blackWidth,
                blackHeight,
                startBlackX,
                startBlackY,
                gapHorisontal + blackWidth/2 - gapHorisontal,
                gapVertical + gapBetweenWhiteRectangular,
                whiteHeight,
                whiteWidth
        );
        //       Выводим в консоль координаты  прямоугольника №3
        calculateWhiteRectangular.printToString();

        //        Записываем посчитанные координа из объекта в белый прямоугольник
        whiteRecnangular_3.reWriteFullText(
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
//        Добавляем в него  белый прямоуголник #1
        fullText.addTextBlockTolistOfBlocks(whiteRectangular_1);
//        Добавляем в него второй белый прямоуголник #2
        fullText.addTextBlockTolistOfBlocks(whiteRectangular_2);
        //        Добавляем в него второй белый прямоуголник #3
        fullText.addTextBlockTolistOfBlocks(whiteRecnangular_3);
//        Добавляем в него конец файла
        fullText.addTextBlockTolistOfBlocks(textEndFile3);

//        Записываем в файл текст со всех добавленных блоков текста
       fullText.writeToFile_allEnteredBlockText(fullFilePath);

        }
    }

