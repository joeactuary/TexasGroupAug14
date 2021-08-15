public class Task2 {

    public static void task2() {

        /*Create a 2D array of integer type where you will store odd and even numbers.
         * Develop a program which will identify/print the even numbers only.
         *
         */int [][] numbers= {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},

        };

        int[] even = new int[10];
        int[] odd = new int[10];

        int evenNumbers = 0;
        int oddNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j] % 2 != 0) {
                    odd[i] = numbers[i][j];
                    oddNumbers = odd[i];
                }
            }
        }
        //System.out.println();
        System.out.println("Even numbers from the given array are:");
        for (int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j] % 2 == 0) {
                    even[i] = numbers[i][j];
                    evenNumbers = even[i];
                    System.out.print(evenNumbers + " ");
                }

            }

        }
        System.out.println("");
    }
}
