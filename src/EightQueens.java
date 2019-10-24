public class EightQueens {
    public static void main(String[] args) {

        int numberOfQueens = 8;

        // Using array data structure
        // Each array cell represents one row.
        // Each number that you see inside the dells is a number from zero to seven,
        // representing the Eight columns
        // [2,5,3,1,7,4,6,0] = an example solution variation

        // N Queen problem we need NxN chess board,
        // Therefore we need N-size array
        int[] board =  new int[numberOfQueens];

        // initialize array
        for (int i = 0; i< board.length; i++){
            board[i] = -1;
        }

        // place the first queen to get started
        int currentRow = 0;
        board[currentRow] = 0;
        currentRow++; // board[0] = 0
        int currentColumn = 0; // columns represents queen location
        long solutions = 0;
        while(currentRow >= 0){ // currentRow = 1
            if(isValid(currentRow, currentColumn, board)){
                board[]
            }

        }




    }

    // Validation function
    public static boolean isValid(int currentRow, int currentColumn, int[] board){

        if(currentColumn >= board.length){
            return false;
        }

        // this loop runs upto entire board
        // since we do not have a complete board yet
        for(int i = 0; i < currentRow; i++){
            //Check if currentColumn appears in any other currentRow
            // if this same value os found in our array,
            // reject the solution, return false -- No two queens can be in the same column or row.
            if(board[i] == currentColumn){
                return false;
            }

            // check both diagonals
            if(Math.abs(currentRow - i) == Math.abs(currentColumn - board[i])){
                return false;
            }

            return true;

        }

    }
}
