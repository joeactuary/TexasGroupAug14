class Task5 {

    public static void task5() {
        // #5: Write a java program to check whether a given number is prime or not?

        int number=29;
        boolean isPrime=false;
        String situation=null;

        for(int i=2; i<=number/2; i++) {
            if(number%i==0) {isPrime=false; situation="not a prime number!"; break;}
            else {isPrime=false; situation="a prime number!";}
        }
        System.out.println("The given number is "+situation);



    }

}
