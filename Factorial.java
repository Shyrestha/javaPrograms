class FactorialProgram {

    
    long factorial(int num) {
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;   
    }

    public static void main(String[] args) {

        int number = 5;   

        FactorialProgram obj = new FactorialProgram();
        long result = obj.factorial(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }
}
