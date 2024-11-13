package Cinema;

public class Stats {

    public void statistics(String[][] seats,int row,int col){
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
}
