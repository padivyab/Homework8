package homework8;

public class SharedDigit {

    public static void hasSharedDigit(int fNumber, int sNumber) {

        if (fNumber >= 10 && fNumber <= 99 && sNumber >= 10 && sNumber <= 99) {
            if ((fNumber / 10) == (sNumber / 10) || (fNumber / 10) == (sNumber % 10) || (fNumber % 10) == (sNumber / 10) || (fNumber % 10) == (sNumber % 10)) {
                boolean s = true;
                System.out.println(s);
            }
        } else {
            boolean s = false;
            System.out.println(s);
        }
    }
    public static void main(String[] args) {

       hasSharedDigit(12, 23);
       hasSharedDigit(9, 99);
       hasSharedDigit(15, 55);
       hasSharedDigit(20, 25);


    }


}