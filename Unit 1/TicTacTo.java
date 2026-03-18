//imports the scanner
import java.util.Scanner;
public class TiTaTo {
    
	//scanner input reader
    static Scanner inputReader = new Scanner(System.in);
    public static void main(String[] args) {
    	
    	//Creates a 3x3 2D array that represents the tic tac to board
        String[][] board = new String[3][3];
        
        //Traverses the array to fill board with empty spots
        //Goes through rows
        for (int r = 0; r < 3; r++) 
        {
        	//Goes through columns
            for (int c = 0; c < 3; c++) 
            {
            	//the empty spots
                board[r][c] = " ";
            }
        }
        
        //0 = Player 1 (X), 1 = Player 2 (O)
        //Keeps track of turns
        int turn = 0;
        
        //Game dialogue
        System.out.println("Welcome to Tic Tac To");
        System.out.println("Rows and columns are numbers 0, 1, 2");
        
        //Loops until winner or tie
        while (true) 
        {
        	//Prints out tic tac to board
            printBoard(board);
            
            //Figure out whose turn it is
            String currentPlayer = getCurrentPlayer(turn);
            
            //Get row input
            System.out.print("Row 0 or 1 or 2: ");
            int row = inputReader.nextInt();
            
            //Get column input
            System.out.print("Column 0 or 1 or 2: ");
            int col = inputReader.nextInt();
            
            //Check if spot is taken
            if (!(board[row][col] == " ")) 
            {
                System.out.println("That spot is already taken.");
                //Starts loop over to prevent checking for win
                continue;
            }
            
            //Place the tile
            board[row][col] = currentPlayer;
            
            //Check for a win
            if (checkWin(board, currentPlayer)) 
            {
            	//prints game board
                printBoard(board);
                //Announces winner
                System.out.println("Player " + (turn + 1) + " (" + currentPlayer + ") wins! Congratulations!");
                //Ends the loop
                break;
            }
            
            // Check for a tie
            if (checkTie(board)) 
            {
            	//prints game board
                printBoard(board);
                //Announces tie
                System.out.println("It's a tie");
                //Ends the loop
                break;
            }
            
            // Switch turns b/w 1 and 0 for first and second player
            turn = switchTurn(turn);
        }
        //Closes scanner
        inputReader.close();
    }
    
    /**
     * Sets X for the first player's turns and returns O for the next player
     * @param turn
     * @return
     */
    public static String getCurrentPlayer(int turn) 
    {
        if (turn == 0) 
        {
            return "X";
        } 
        else 
        {
            return "O";
        }
    }
    /**
     * Adds 1 to switch the turns of first and second player. Returns 0 for first player again afterwards etc. back and forth
     * @param turn
     * @return
     */
    public static int switchTurn(int turn) 
    {
        if (turn == 0) 
        {
            return 1;
        } 
        else 
        {
            return 0;
        }
    }

    /**
     * prints the board of the tic tac to artistically great... why did this take so long
     * @param board
     */
    public static void printBoard(String[][] board) 
    {
    	//Returns
        System.out.println();
        //Loops through each row and prints a space
        for (int r = 0; r < 3; r++) 
        {
            System.out.print(" ");
            //Loops through each column
            for (int c = 0; c < 3; c++) 
            {
            	//Prints out if X or O exists there 
                System.out.print(board[r][c]);
                //Prints Vertical line of 2 columns in middle board of 3 rows
                if (c < 2) System.out.print(" | ");
            }
            //Returns
            System.out.println();
            //Prints out the horizontal thing at the middle two rows
            if (r < 2) System.out.println("---|---|---");
        }
        //Returns
        System.out.println();
    }
    
    
    /**
     * checks for if win exists and who won
     * @param board
     * @param player
     * @return
     */
    public static boolean checkWin(String[][] board, String player) 
    {
        // Check all 3 rows... was tempted to write out each possibility without the for loop
        for (int r = 0; r < 3; r++) 
        {
            if (board[r][0] == player && board[r][1] == player && board[r][2] == player) 
            {
                return true;
            }
        }
        
        // Check all 3 columns... same for the columns
        for (int c = 0; c < 3; c++) 
        {
            if (board[0][c] == player && board[1][c] == player && board[2][c] == player) 
            {
                return true;
            }
        }
        
        // Check both diagonals
        //if those three spots on the board all equal the same symbol of X or O (stored as player)
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) 
        {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) 
        {
            return true;
        }
        
        return false;
    }
    
    /**
     * Check if game tied
     */
    public static boolean checkTie(String[][] board) 
    {
    	//loops through the rows
        for (int r = 0; r < 3; r++) 
        {
        	//loops through the columns
            for (int c = 0; c < 3; c++) 
            {
            	//if empty spot is there then not tie yet
                if (board[r][c] == " ") 
                {
                    return false;
                }
            }
        }
        //returns true when all spots are filled and check win doesn't occur
        return true;
    }
}
