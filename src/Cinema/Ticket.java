package Cinema;

import java.util.Scanner;

public class Ticket {

    public void buyTicket(String[][] seats, int row,int col){
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        System.out.println("Enter a row number: ");
        int rowNumber = scanner.nextInt();
        System.out.println("Enter a seat number in that row: ");
        int seatNumber = scanner.nextInt();
        while(loop){
            if(rowNumber > row || seatNumber > col){
                System.out.println("Wrong input!");
                System.out.println("Enter a row number: ");
                rowNumber = scanner.nextInt();
                System.out.println("Enter a seat number in that row: ");
                seatNumber = scanner.nextInt();
            }else if(seats[rowNumber][seatNumber].equals("B")){
                System.out.println("That ticket has already been purchased!");
                System.out.println("Enter a row number: ");
                rowNumber = scanner.nextInt();
                System.out.println("Enter a seat number in that row: ");
                seatNumber = scanner.nextInt();
            }else{
                loop = false;
            }
        }
        int price;
        int totalSeats = row * col;
        int front = row / 2;

        if(totalSeats <= 60){
            price = 10;
        }else if(front >= rowNumber){
            price = 10;
        }else{
            price = 8;
        }
        System.out.println("Ticket price: $" + price);
        System.out.println();
        seats[rowNumber][seatNumber] = "B";
    }
}
