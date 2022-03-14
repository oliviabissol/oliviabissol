
/**
 * Write a description of class BattleShipClient here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BattleShipClient
{
    private static Scanner scan = new Scanner(System.in);
    private static BattleshipBoards bs = new BattleshipBoards();
    private static int col = 1;
    private static int row = 1;
    private static char direct;
    private static boolean keepPlaying = true;
    public static void main() {
        Scanner scan = new Scanner(System.in);
        bs.startGame();
        bs.setUserShips();
        bs.setOppShips();
        bs.drawBoard();
        bs.drawOppBoard();
        if(keepPlaying = true){
                bs.drawBoard();
                bs.drawOppBoard();
                fireAtOpp();
                bs.randomHit();
                keepGoing(checkWinner());
        }
    }

    public static void colRow(){
        print("Enter Column");
        col = scan.nextInt();
        print("Enter Row");
        row = scan.nextInt();
    }

    public static void keepGoing(boolean checkWinner){
        if(checkWinner == false){
            keepPlaying = false;
        }
    }

    public static boolean checkWinner(){
        boolean userLost = bs.checkUserBoard();
        boolean userWon = bs.checkCompBoard();
        if(userLost != false || userWon != false){
            return true;
        }
        return false;
    }

    public static void fireAtOpp(){
        print("Fire at Opponent");
        colRow();
        bs.fire(row, col);
    }

    public static void print(String words){
        System.out.println(words);
    }
}