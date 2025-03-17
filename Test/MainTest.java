package Test;

import src.Tetravex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Tetravex game = new Tetravex();

        game.loadPuzzle(reader);

//        game.testPrint();

        System.out.print(game.print());
    }
}
