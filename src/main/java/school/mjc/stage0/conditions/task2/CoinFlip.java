package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {

        if (from1UpTo1000 > 499) {
            System.out.println("Tail");
        }
        else {
            System.out.println("Eagle");
        }

    }
}
//2. Coin flip.
//        Implement the program which will consume 1 number in method arguments and
//        if the number is less than 500 print "Eagle" otherwise "Tail" (range of numbers is [1-1000], no checks for that required):
