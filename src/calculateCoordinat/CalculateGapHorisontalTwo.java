package calculateCoordinat;

public class CalculateGapHorisontalTwo {

    private double gapHorisontalTwo_X;
    private double gapHorisontalTwo_Y;

    public CalculateGapHorisontalTwo() {
        gapHorisontalTwo_X = 0;
        gapHorisontalTwo_Y = 0;
    }

    public void calculateGapHorisontalTwo_X() {

    }

    public void calculateGapHorisontalTwo_Y() {

    }
    private double calculateAnchorTopX (double blackWidth, double startBlackX) {
        return startBlackX - (blackWidth/2);
    }

    private double calculateAnchorTopY (double blackHeight, double startBlackY) {
        return startBlackY - blackHeight;
    }

}
