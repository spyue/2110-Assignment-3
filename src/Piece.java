package src;

public class Piece {
    private int[] values = new int[4];
    private int name;

    public Piece(int name, int top, int right, int bottom, int left) {
        this.name = name;
        this.values = new int[] {top, right, bottom, left};
    }

    //get methods
    public int getName() {return name;}
    public int getTop() {return values[0];}
    public int getRight() {return values[1];}
    public int getBottom() {return values[2];}
    public int getLeft() {return values[3];}

    //compare methods to clean up Tetravex class
    public boolean compareTop(Piece x) {
        if (x.getName() == 119160) {return true;}
        return values[0] == x.getBottom();
    }
    public boolean compareRight(Piece x) {
        if (x.getName() == 119160) {return true;}
        return values[1] == x.getLeft();
    }
    public boolean compareBottom(Piece x) {
        if (x.getName() == 119160) {return true;}
        return values[2] == x.getTop();
    }
    public boolean compareLeft(Piece x) {
        if (x.getName() == 119160) {return true;}
        return values[3] == x.getRight();
    }


    //print method for testing
    public String printBox() {
        return "\t" + values[0] + "\n" + values[3] + "\t \t" + values[1] + "\n \t" + values[2];
    }

    public String toString() {
        return name + "\t" + values[0] + "\t" + values[1] + "\t" + values[2] + "\t" + values[3];
    }
}
