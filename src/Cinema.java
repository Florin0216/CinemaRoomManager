import java.util.Scanner;

public class Cinema {

    public static void printSeats(String[][] seats,int row,int col) {
        System.out.println("Cinema:");
        seats[0][0] =" ";

        for (int i = 1; i <= col; i++) {
            String value = Integer.toString(i);
            seats[0][i] = value;
        }
        for(int i = 1; i <= row; i++) {
            String value = Integer.toString(i);
            seats[i][0] = value;
        }
        for(int i = 0; i <= row; i++) {
            for(int j = 0; j <= col; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void cinemaMenu(String[][] seats,int row,int col) {
        while(true) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    printSeats(seats,row,col);
                    break;
                case 2:
                    buyTicket(seats,row, col);
                    break;
                case 3:
                    statistics(seats,row,col);
                    break;
                default:
                    return;
            }
        }
    }

    public static void buyTicket(String[][] seats, int row,int col){
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

    public static void statistics(String[][] seats,int row,int col){
        int numberOfPurchasedTickets = 0;
        double percentage = 0;
        int currentIncome = 0;
        int totalIncome = 0;
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                if(seats[i][j].equals("B")) {
                    numberOfPurchasedTickets++;
                    percentage = (numberOfPurchasedTickets / (double)(row * col)) * 100;
                    if(row * col <= 60) {
                        currentIncome += 10;
                    }else if((row / 2) >= i ){
                        currentIncome += 10;
                    }else {
                        currentIncome += 8;
                    }
                }
            }
        }
        if(row * col <= 60){
            totalIncome = row * col * 10;
        }else {
            totalIncome += ((row / 2) * 10 * col) +((row-(row / 2)) * 8 * col) ;
        }


        System.out.println("Number of purchased tickets: " + numberOfPurchasedTickets);
        System.out.printf("Percentage: %.2f%%",percentage);
        System.out.println();
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);
        System.out.println();
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int rows = input.nextInt();
        System.out.println("Enter the number of seats in each row: : ");
        int seats = input.nextInt();

        String[][] seatsArray = new String[rows + 1][seats + 1];
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= seats; j++) {
                seatsArray[i][j] = "S";
            }
        }
        cinemaMenu(seatsArray,rows,seats);

    }
}