public class Calculator {
     public static void main(String[] args) {
            
        int num1 = 10;
        int num2 = 5;
        char operator = '+';

        int result = 0;
        
                
        if (operator == '+') {
             result = num1 + num2;
        } else if (operator == '-') {
             result = num1 - num2;
        } else if (operator == '*') {
             result = num1 * num2;
        } else if (operator == '/') {
             result = num1 / num2;
        }
          System.out.println("Result: " + result);
    }
}
        
