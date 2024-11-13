package Cinema;

public class Initialize {
    public void initRoom(String[][] seats, int row, int col){
        seats[0][0] =" ";

        for (int i = 1; i <= col; i++) {
            String value = Integer.toString(i);
            seats[0][i] = value;
        }

        for(int i = 1; i <= row; i++) {
            String value = Integer.toString(i);
            seats[i][0] = value;
        }

        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= col; j++) {
                seats[i][j] = "S";
            }
        }
    }
}
