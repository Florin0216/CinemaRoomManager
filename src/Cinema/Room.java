package Cinema;

public class Room {

    public void printSeats(String[][] seats,int row,int col) {
        Initialize initialize = new Initialize();
        initialize.initRoom(seats,row,col);
        System.out.println("Cinema:");
        for(int i = 0; i <= row; i++) {
            for(int j = 0; j <= col; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
