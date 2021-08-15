class Task6 {

    public static void task6() {
        // #6: Write a Java Program to print the first 10 numbers of Fibonacci series.

        int number1=0,number2=1,number3;

        System.out.print(number1+" "+number2);

        for(int i=2;i<10;++i)
        {
            number3=number1+number2;
            System.out.print(" "+number3);
            number1=number2;
            number2=number3;
        }

        System.out.println("");

    }

}