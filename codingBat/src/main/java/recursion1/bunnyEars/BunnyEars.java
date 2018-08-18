package recursion1.bunnyEars;

public class BunnyEars {

    public static int bunnyEars(int bunnies) {
        if(bunnies == 0) return 0;
        else return 2 + bunnyEars(bunnies-1);
    }
}
