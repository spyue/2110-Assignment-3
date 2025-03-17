package src;
import java.io.BufferedReader;
import java.io.IOException;

public class Tetravex {
    private Piece[] unplacedPieces;
    private Piece[][] solvedPuzzle;

    private int height;
    private int width;


    public Tetravex() {}

    public Boolean loadPuzzle(BufferedReader reader) throws IOException {
        //getting height width and initializing arrays
        String firstLine = reader.readLine();
        String[] hw = firstLine.split(" ");
        this.height = Integer.parseInt(hw[0]);
        this.width = Integer.parseInt(hw[1]);
        this.unplacedPieces = new Piece[height*width];

        //initialize the solved board with x values
        Piece xxx = new Piece("xxx".hashCode(), 0, 0, 0, 0);
        this.solvedPuzzle = new Piece[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                solvedPuzzle[i][j] = xxx;
            }
        }

        //initializing unplacedPieces
        for (int i = 0; i < height*width; i++) {
            String currentLine = reader.readLine();
            String[] values = currentLine.split(" ");

            unplacedPieces[i] = new Piece(
                    Integer.parseInt(values[0]),
                    Integer.parseInt(values[1]),
                    Integer.parseInt(values[2]),
                    Integer.parseInt(values[3]),
                    Integer.parseInt(values[4])
                    );
        }
        return unplacedPieces.length > 0;
    }

    public boolean placePiece(int name, int xPos, int yPos) {
        Piece currentPiece = null;
        boolean validPlacement;
        // retrieve piece
        for (Piece piece : unplacedPieces) {
            if (piece.getName() == name) {
                currentPiece = piece;
            }
        }
        //make sure piece was successfully retrieved
        if (currentPiece == null) {
            return false;
        }
        if (xPos > 0 && yPos = )

        if (xPos > 0 && yPos > 0) {
           validPlacement = currentPiece.compareTop(solvedPuzzle[xPos][yPos+1]);
           validPlacement = currentPiece.compareBottom(solvedPuzzle[xPos][yPos-1]);
           validPlacement = currentPiece.compareRight(solvedPuzzle[xPos+1][yPos]);
           validPlacement = currentPiece.compareLeft(solvedPuzzle[xPos-1][yPos]);
        }

    }

    public void testPrint() {
        for (Piece piece : unplacedPieces) {
            System.out.print(piece.getName() + " ");
        }
        System.out.println();
        for (Piece piece : unplacedPieces) {
            System.out.println(piece.printBox());
        }
    }

    public String print() {
        int s = 119160;

        StringBuilder currLine = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (solvedPuzzle[i][j].getName() == 119160) {
                    currLine.append("xxx\t");
                } else {
                    currLine.append(solvedPuzzle[i][j].getName()).append("\t");
                }
            }
            currLine.append("\n");
        }
        currLine.append("--------------------").append("\n");
        for (Piece piece : unplacedPieces) {
            currLine.append(piece).append("\n");
        }
        return currLine.toString();
    }
}
