package calculateCoordinat;

public  class CalculateBlack {
    private double blackX,
                   blackY,
                   blackWidth,
                   blackHeight;
    public CalculateBlack() {
        this.blackX = -1;
        this.blackY = -1;
        this.blackWidth = -1;
        this.blackHeight = -1;
    }
    public CalculateBlack(double blackWidth, double blackHeight) {
        this.blackX = -1;
        this.blackY = -1;
        this.blackWidth = blackWidth;
        this.blackHeight = blackHeight;
    }

    public void calculateBlackX(double BlackX) {

        this.blackX = BlackX - blackWidth/2;
    }

    public void calculateBlackY(double BlackY) {

        this.blackY = BlackY - blackHeight;
    }



    public double getBlackX() {
        return blackX;
    }

    public double getBlackY() {
        return blackY;
    }

    public double getBlackWidth() {
        return blackWidth;
    }

    public double getBlackHeight() {
        return blackHeight;
    }

    public void setBlackWidth(double blackWidth) {
        this.blackWidth = blackWidth;
    }

    public void setBlackHeight(double blackHeight) {
        this.blackHeight = blackHeight;
    }
}
