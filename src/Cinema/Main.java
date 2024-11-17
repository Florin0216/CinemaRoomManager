package Cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int rows = input.nextInt();
        System.out.println("Enter the number of seats in each row: : ");
        int seats = input.nextInt();

        Menu menu = new Menu();

        String[][] seatsArray = new String[rows + 1][seats + 1];
        menu.cinemaMenu(seatsArray,rows,seats);
    }
}