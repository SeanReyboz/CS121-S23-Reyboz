package applicationOfKnowledge;

public class RepeatedNumberTester
{
    public static void main(String[] args) {
        RepeatedNumber repeatedNumber = new RepeatedNumber();

        int[] test1 = { 1, 2, 3, 4, 4, 5 };
        int[] test2 = { 7, 3, 1, 7, 5, 8 };
        int[] test3 = { 1, 2, 3, 4, 5, 6 };

        System.out.println(repeatedNumber.find(test1)); // expected output: 4
        System.out.println(repeatedNumber.find(test2)); // expected output: 7
        System.out.println(repeatedNumber.find(test3)); // expected output: -1
    }
}
