package at.campus02.pr1_hofer;

import java.util.Arrays;

public class ArrayDemo2D {
    public static void main(String[] args) {

        //declare and initialize in one line
        String [] favoriteFood = {"Chocolate","Carrots","Gras"};
        //declare and create array of type string with 5 elements
        //index running form 0 to 4 (length -1)
        String [] allergicFood = new String[5];

        //acces
        allergicFood[0] = "cabbage";
        allergicFood[1] = "ligusta";

        //how to iterate over an array
        for (int f=0; f < favoriteFood.length; f++){
            System.out.println(favoriteFood[f]);
        }

        //2 dim array
        //for every bunny we have a line with their favorit food
        //this is also possibl String foods[][] = ...;

        //with direct init - 2 rows and 3 columns
        String [][] food = {{"Chocolate","Carrots","Gras","Strawberries"},{"Bananas","Strawberries","Cranberries"}};
        //alternative: String [][] food = new String[2][3];
        //but we would have to initialize it

        //access with 2[][]
        food[0][2] = "Pineapple";
        System.out.println("Start 2d array example");
        //how do i iterate over it
        for (int row = 0;row < food.length; row++){
            for (int col = 0;col < food[row].length; ++col){
                System.out.println(food[row][col]);
            }
            System.out.println("---");
        }

        //Blackjack game - so the goal is to have the highest number
        //but not higher than 21
        //So write a method blackjackWinner who gets a 2 dim array as a parameter
        //every row stands for one game: [17, 21, 23, 14]
        //you should calculate for every gae who is the winner
        //return value: an array which counts hot often every player has won:
        //in the first game player 2 would have won _> this means the counter of the
        //returning array should be like that [0,1,0,0]
        //assume: every row has the same length and we do not know how many rows
        //if it is a draw -> nobody gets a point for winning

        int [][] blackjack = {{17,21,23,14},{18,19,20,20},{17,16,15,14}};
        System.out.println(Arrays.toString(blackjackWinner(blackjack)));
    }
    public static int[] blackjackWinner(int[][]blackjack){
        int [] winner = new int[blackjack.length];
        int temp = 0;
        for (int row = 0; row < blackjack.length; row++){
            for (int col = 0; col < blackjack[row].length; col ++){
                if (blackjack[row][col]> blackjack[row][col+1]){
                   temp = blackjack [row][col];
                   blackjack[row][col] = blackjack[row][col+1];
                   blackjack[row][col+1] = temp;
                   winner[row] +=1;
                }
                else {
                    winner[row] +=1;
                }
                if (blackjack[row][col]>21){
                    winner[row]=winner[row];
                }
            }
        }
        return winner;
    }
}
