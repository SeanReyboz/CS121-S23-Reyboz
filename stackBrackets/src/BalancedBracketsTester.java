public class BalancedBracketsTester
{
    public static void main(String[] args) {
        BalancedBrackets balancedBrackets = new BalancedBrackets();
        BalancedAllBrackets balancedAllBrackets = new BalancedAllBrackets();
        String test;


        System.out.println("Simple balanced brackets checker: \n---------------------------------");
        test = "()";
        System.out.printf("'%s' is %s\n", test, balancedBrackets.checkBalance(test));

        test = "()(";
        System.out.printf("'%s' is %s\n", test, balancedBrackets.checkBalance(test));

        test = "((()())";
        System.out.printf("'%s' is %s\n", test, balancedBrackets.checkBalance(test));


        System.out.println("\nAll balanced brackets checker: \n------------------------------");
        test = "({[]{}})";
        System.out.printf("'%s' is %s\n", test, balancedAllBrackets.checkBalance(test));

        test = "[({[]{}}{)]";
        System.out.printf("'%s' is %s\n", test, balancedAllBrackets.checkBalance(test));
    }
}
