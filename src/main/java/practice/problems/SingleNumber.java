package practice.problems;

public class SingleNumber {

    public static void main(String[] args) {
        int[] ints = {4, 3, 3, 2, 2};
        singleNumber(ints);
    }

    /***
     * Binary XOR Operator (^) copies the bit if it is set in one operand but not both.
     *
     * 7   = 111
     * 3   = 011
     * 7^3 = 100
     *
     * 7^3 = 4
     */
    public static int singleNumber(int[] nums) {

        int a = 0;
        for (int i : nums) {

            System.out.println("a = " + a + " , i = " + i);
            System.out.println("bin a = " + Integer.toBinaryString(a) +
                    "\nbin i = " + Integer.toBinaryString(i) );
            a ^= i;
            System.out.println("Result a = " + a + " , i = " + i);
            System.out.println("---------------------------------");
        }
        return a;

    }
}
