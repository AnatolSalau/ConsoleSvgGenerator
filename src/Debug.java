import calculateCoordinat.CalculateBlack;

public class Debug {
    public static void main(String[] args) {
        CalculateBlack calculateBlack = new CalculateBlack();
        calculateBlack.setBlackHeight(10.5);
        calculateBlack.setBlackWidth(15.5);
        calculateBlack.calculateBlackX(110);
        calculateBlack.calculateBlackY(110);
        System.out.println("X "+ calculateBlack.getBlackX());
        System.out.println("Y "+ calculateBlack.getBlackY());
    }
}
