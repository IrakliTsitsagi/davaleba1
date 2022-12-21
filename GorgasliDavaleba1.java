public class GorgasliDavaleba1 {
    public static void main(String[] args) {
       calculate(10000, 20, 1);
    }



    public static void  calculate(int a, int b, int c) {
        int D = ((b * b) - (4 * a * c));
        if (D > 0) {
            System.out.println("aqvs 2 amonaxsni");
        } else if (D == 0) {
            System.out.println("aqvs 1 amonaxsni");
        } else {
            System.out.println("ar aqvs amonaxsni");
        }

    }
}
