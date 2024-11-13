package Cinema;

import java.util.Scanner;

public class Menu {

    public void cinemaMenu(String[][] seats,int row,int col) {
        Room room = new Room();
        Ticket ticket = new Ticket();
        Stats stats = new Stats();
        while(true) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    room.printSeats(seats,row,col);
                    break;
                case 2:
                    ticket.buyTicket(seats,row, col);
                    break;
                case 3:
                    stats.statistics(seats,row,col);
                    break;
                default:
                    return;
            }
        }
    }
}
