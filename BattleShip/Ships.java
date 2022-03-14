
/**
 * Write a description of class Ships here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ships
{
    private int crusier = 4;
    private int destoryer = 4;
    private int battleShip = 5;

    private char crusierChip = 'C';
    private char destoryerChip = 'D';
    private char bshipChip = 'B';

    public int[] randPosition(){
        int col = (int)(Math.random()*9);
        int row = (int)(Math.random()*9);
        int[] colRow = new int[2];
        colRow[0] = row;
        colRow[1] = col;
        return colRow;
    }

    public boolean setRight(char[][] theBoard, int[] randPosition, int ship){
        int row = randPosition[0];
        int col = randPosition[1];
        int freeSpot = 0;
        if(row >= (theBoard.length - ship)){
            return false;
        }
        if(freeSpot != ship){
            for(int i = 0; i <= ship; i++)
            {
                if(theBoard[row + i][col] == '-'){
                    freeSpot++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public boolean setLeft(char[][] theBoard, int[] randPosition, int ship){
        int row = randPosition[0];
        int col = randPosition[1];
        int freeSpot = 0;
        if(row <= (ship-1)){
            return false;
        }
        if(freeSpot != ship){
            for(int i = 0; i <= ship; i++)
            {
                if(theBoard[row - i][col] == '-'){
                    freeSpot++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public boolean setUp(char[][] theBoard, int[] randPosition, int ship){
        int row = randPosition[0];
        int col = randPosition[1];
        int freeSpot = 0;
        if(col >= (theBoard.length - ship)){
            return false;
        }
        if(freeSpot != ship){
            for(int i = 0; i <= ship; i++)
            {
                if(theBoard[row][col + i] == '-'){
                    freeSpot++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public boolean setDown(char[][] theBoard, int[] randPosition, int ship){
        int row = randPosition[0];
        int col = randPosition[1];
        int freeSpot = 0;
        if(col <= (ship-1)){
            return false;
        }
        if(freeSpot != ship){
            for(int i = 0; i <= ship; i++)
            {
                if(theBoard[row][col - i] == '-'){
                    freeSpot++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public void setCrusier(char[][] theBoard){
        int[] colRow = randPosition();
        int row = colRow[0];
        int col = colRow[1];
        boolean rightValid = setRight(theBoard, colRow, 4);
        boolean leftValid = setLeft(theBoard, colRow, 4);
        boolean upValid = setUp(theBoard, colRow, 4);
        boolean downValid = setDown(theBoard, colRow, 4);

        if(rightValid == true){
            theBoard[row][col] = 'C';
            theBoard[row+1][col] = 'C';
            theBoard[row+2][col] = 'C';
            theBoard[row+3][col] = 'C';
        }
        else if(leftValid == true){
            theBoard[row][col] = 'C';
            theBoard[row-1][col] = 'C';
            theBoard[row-2][col] = 'C';
            theBoard[row-3][col] = 'C';
        }
        else if(upValid == true){
            theBoard[row][col] = 'C';
            theBoard[row][col+1] = 'C';
            theBoard[row][col+2] = 'C';
            theBoard[row][col+3] = 'C';
        }
        else if(downValid == true){
            theBoard[row][col] = 'C';
            theBoard[row][col-1] = 'C';
            theBoard[row][col-2] = 'C';
            theBoard[row][col-3] = 'C'; 
        }
        else{
            System.out.println("IVALID");
        }
    }

    public void setDestoryer(char[][] theBoard){
        int[] colRow = randPosition();
        int row = colRow[0];
        int col = colRow[1];
        boolean rightValid = setRight(theBoard, colRow, 4);
        boolean leftValid = setLeft(theBoard, colRow, 4);
        boolean upValid = setUp(theBoard, colRow, 4);
        boolean downValid = setDown(theBoard, colRow, 4);

        if(rightValid == true){
            theBoard[row][col] = 'D';
            theBoard[row+1][col] = 'D';
            theBoard[row+2][col] = 'D';
            theBoard[row+3][col] = 'D';
        }
        else if(leftValid == true){
            theBoard[row][col] = 'D';
            theBoard[row-1][col] = 'D';
            theBoard[row-2][col] = 'D';
            theBoard[row-3][col] = 'D';
        }
        else if(upValid == true){
            theBoard[row][col] = 'D';
            theBoard[row][col+1] = 'D';
            theBoard[row][col+2] = 'D';
            theBoard[row][col+3] = 'D';
        }
        else if(downValid == true){
            theBoard[row][col] = 'D';
            theBoard[row][col-1] = 'D';
            theBoard[row][col-2] = 'D';
            theBoard[row][col-3] = 'D'; 
        }
        else{
            System.out.println("IVALID");
        }
    }

    public void setBShip(char[][] theBoard){
        int[] colRow = randPosition();
        int row = colRow[0];
        int col = colRow[1];
        boolean rightValid = setRight(theBoard, colRow, 5);
        boolean leftValid = setLeft(theBoard, colRow, 5);
        boolean upValid = setUp(theBoard, colRow, 5);
        boolean downValid = setDown(theBoard, colRow, 5);

        if(rightValid == true){
            theBoard[row][col] = 'B';
            theBoard[row+1][col] = 'B';
            theBoard[row+2][col] = 'B';
            theBoard[row+3][col] = 'B';
            theBoard[row+4][col] = 'B';
        }
        else if(leftValid == true){
            theBoard[row][col] = 'B';
            theBoard[row-1][col] = 'B';
            theBoard[row-2][col] = 'B';
            theBoard[row-3][col] = 'B';
            theBoard[row-4][col] = 'B';
        }
        else if(upValid == true){
            theBoard[row][col] = 'B';
            theBoard[row][col+1] = 'B';
            theBoard[row][col+2] = 'B';
            theBoard[row][col+3] = 'B';
            theBoard[row][col+4] = 'B';
        }
        else if(downValid == true){
            theBoard[row][col] = 'B';
            theBoard[row][col-1] = 'B';
            theBoard[row][col-2] = 'B';
            theBoard[row][col-3] = 'B'; 
            theBoard[row][col-4] = 'B'; 
        }
        else{
            System.out.println("IVALID");
        }
    }

    public boolean checkIfWinner(char[][] theBoard){
        boolean winner = false;
        int shipsSunk = 0;
        while(winner == false){
            for(int r = 0; r < theBoard.length; r++) {                
                for(int c = 0; c < theBoard.length; c++) {
                    if(theBoard[r][c] == 'X'){
                        shipsSunk++;
                    }
                    if(shipsSunk == 13){
                        winner = true;
                    }
                }
            }
        }
        return true;
    }
}