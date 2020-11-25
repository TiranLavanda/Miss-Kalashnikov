package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int n = scanner.nextInt();

        int tickets =0;
        double percentage = 0;
        int currentIncome = 0;
        int totalIncome = row*n;


        if (totalIncome<60) {
            totalIncome = totalIncome*10;
        } else {int a = totalIncome - (4*n);
            int b = (4*n)*10;
            totalIncome = a*8 + b;}


        n++;
        row++;


        String array[][] = new String[row][n];

        boolean exit = false;
        print();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    array[i][j] = j + "";
                }
                if (j == 0) {
                    array[i][j] = i + "";
                } else if (i != 0 && j != 0) {
                    array[i][j] = "S";
                }
                if (i == 0 && j == 0) {
                    array[i][j] = " ";
                }
            }
        }
        while (!exit) {
            String menu = scanner.next();

            switch (menu) {
                case "1":
                    Method(row, n, array);
                    System.out.println();
                    print();
                    break;
                case "2":
                    System.out.println("Enter a row number:");
                    int rowm = scanner.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    int mesto = scanner.nextInt();
                    tickets++;

                    int price = 0;
                    int kino = row * n;
                    if (kino <= 60) {
                        price = 10;
                    } else if (kino > 60) {
                        if ((rowm > (row - 1) / 2 && (row - 1) % 2 == 0) || (rowm > (row - 1) / 2 && (row - 1) % 2 != 0)) {
                            price = 8;
                        }
                        if ((rowm <= (row - 1) / 2 && (row - 1) % 2 == 0) || (rowm <= (row - 1) / 2 && (row - 1) % 2 != 0) || rowm == 4)
                            price = 10;
                    }



                    currentIncome += price;
                    percentage = ((double) tickets/(double)((row-1)*(n-1)))*100.0;

                    while (true)  {

                        if ((rowm>=row||mesto>=n) || (rowm<0||mesto<0)) {
                            System.out.println( "Wrong input!\n");
                            System.out.println("Enter a row number:");
                            rowm = scanner.nextInt();
                            System.out.println("Enter a seat number in that row:");
                            mesto = scanner.nextInt();
                        }

                        else if (array[rowm][mesto].equals("B")) {
                            System.out.println("That ticket has already been purchased!\n");
                            System.out.println("Enter a row number:");
                            rowm = scanner.nextInt();
                            System.out.println("Enter a seat number in that row:");
                            mesto = scanner.nextInt();}
                        else {
                            array[rowm][mesto] = "B";
                            System.out.println();
                            System.out.println("Ticket price: $" + price);
                            print();
                            break;}}
                    break;
                case "3":
                    String perTage = String.format("Percentage: %.2f",percentage);

                    System.out.println("Number of purchased tickets: " + tickets + "\n" +
                            perTage +"%\n"+
                            "Current income: $" + currentIncome + "\n" +
                            "Total income: $" + totalIncome + "\n");
                    print();
                    break;
                case "0": exit=true;
                    break;
            }
        }
    }
    public static void Method ( int row, int n, String[][] array){
        System.out.println("Cinema:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void print () {
        System.out.println("1. Show the seats\n" +
                "2. Buy a ticket\n" +
                "3. Statistics\n" +
                "0. Exit\n");}

}