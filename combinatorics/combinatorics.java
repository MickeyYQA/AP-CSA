public class Combinatorics {

    public static int factorial(int n) {
        if(n==1) return 1;
        else return n*factorial(n-1);
    }


    public static void numCombinations(int n, int r) {
        if(r>n) System.out.prinln("0");
        else System.out.prinln(factorial(n)/(factorial(r)*factorial(n-r)));
    }

}