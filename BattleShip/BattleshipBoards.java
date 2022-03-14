
/**
 * Write a description of class BattleshipBoards here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BattleshipBoards
{
    private char[][] theBoard;
    private char[][] theBoardTwo;
    private char[][] theBoardThree;

    private Ships ships = new Ships();
    private int crusierNumOpp = 4;
    private int destoryerNumOpp = 4;
    private int battleShipNumOpp = 5;
    private int crusierNumUser = 4;
    private int destoryerNumUser = 4;
    private int battleShipNumUser = 5;
    

    private char pattern = '-';
    private char patternTwo = '-';
    private char hit = 'H';
    private char miss = 'M';
    private char battleshipShip = 'B';
    private char crusier = 'C';
    private char destoryer = 'D';

    private int battleshipNum = 0;
    private int crusierNum = 0;
    private int destoryerNum = 0;
    private int rows = 10;
    private int cols = 10;
    public BattleshipBoards(){
        theBoard = new char[rows][cols];
        theBoardTwo = new char[rows][cols];
        theBoardThree = new char[rows][cols];
    }

    public void startGame(){
        for(int r = 0; r < theBoard.length; r++) {
            for(int c = 0; c < theBoard[0].length; c++) {
                theBoard[r][c]= pattern;
            }
        }
        for(int r = 0; r < theBoardTwo.length; r++) {
            for(int c = 0; c < theBoardTwo[0].length; c++) {
                theBoardTwo[r][c]= patternTwo;
            }
        }
        for(int r = 0; r < theBoardThree.length; r++) {
            for(int c = 0; c < theBoardThree[0].length; c++) {
                theBoardThree[r][c]= patternTwo;
            }
        }
    }

    public void drawBoard() {
        println("\f");
        println("Your Board");
        for(int r = 1; r < theBoard.length; r++) {
            for(int c = 1; c < theBoard[0].length; c++) {
                print(theBoard[r][c] + " ");
            }
            println("");
        }
        println("");
        println("Opponent's Board");
        for(int r = 1; r < theBoardTwo.length; r++) {
            for(int c = 1; c < theBoardTwo[0].length; c++) {
                print(theBoardTwo[r][c] + " ");
            }
            println("");
        }
        println("");
    }

    public void drawOppBoard() {
        println("Actual Opponent's Board");
        for(int r = 1; r < theBoardThree.length; r++) {
            for(int c = 1; c < theBoardThree[0].length; c++) {
                print(theBoardThree[r][c] + " ");
            }
            println("");
        }
    }

    public void setCruise(char[][] theBoard){
        ships.setCrusier(theBoard);
    }

    public void setDestoryer(char[][] theBoard){
        ships.setDestoryer(theBoard);
    }

    public void setBattleShip(char[][] theBoard){
        ships.setBShip(theBoard);
    }

    public void setUserShips(){
        setCruise(theBoard);
        setDestoryer(theBoard);
        setBattleShip(theBoard);
    }

    public void setOppShips(){
        setCruise(theBoardThree);
        setDestoryer(theBoardThree);
        setBattleShip(theBoardThree);
    }

    public void randomHit(){
        int randRow = (int)(Math.random()*10);
        int randCol = (int)(Math.random()*10);
        if (theBoard[randRow][randCol] == 'C' || theBoard[randRow][randCol] == 'D' || theBoard[randRow][randCol] == 'B'){
            theBoard[randRow][randCol] = 'X';
        }
        else if(theBoard[randRow][randCol] == 'D'){
            
        }
        else if(theBoard[randRow][randCol] == 'B'){
            
        }
        else{
            theBoard[randRow][randCol] = 'O';
        }
        drawBoard();
    }

    public void fire(int row, int col){
        if (theBoardThree[row][col] == 'C'){
            theBoardTwo[row][col] = 'X';
            crusierNumOpp--;
        }
        else if(theBoardThree[row][col] == 'D'){
            theBoardTwo[row][col] = 'X';
            destoryerNumOpp--;
        }
        else if(theBoardThree[row][col] == 'B'){
            theBoardTwo[row][col] = 'X';
            battleShipNumOpp--;
        }
        else{
            theBoardTwo[row][col] = 'O';
        }
    }
    
    public boolean checkUserBoard(){
        boolean winner = ships.checkIfWinner(theBoard);
        return winner;
    }
    
    public boolean checkCompBoard(){
        boolean winner = ships.checkIfWinner(theBoardThree);
        return winner;
    }

    public static void println(String words){
        System.out.println(words);
    }

    public static void print(String words){
        System.out.print(words);
    }
}
