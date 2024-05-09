import  java.util.*;
public class Main {
    private static int ROW = 10;
    private static int COL =10;
    private static String [][] board = new String[ROW][COL];
    public static void main(String[] args) {
boolean done = false;
boolean gameOver = false;
boolean finishmove = false;
boolean hit;
//game loop
        do {
            clearBoard();
            do {
//place ships
                placeShip(1);
                placeShip(2);
                placeShip(3);
                placeShip(4);
//display board
                display();
                do {
                    //get hit or miss player move
                    hit = playerMove();
                    System.out.println(hit);
                    display();

                }while(!finishmove);

            }while(!done);

        }while(!gameOver);

        }










    private static void clearBoard(){

        for(int row=0;row < ROW; row++){
            for(int col =0; col < COL; col++){
                board[row][col]= "-";

            }
        }

    }
    public static void placeShip(int ship){
        Random rnd = new Random();
        int vertOrHorz = rnd.nextInt(2);
        int validCounter =0;
        int row=0;
        int col=0;
//placing ships
        if(vertOrHorz ==0){
            do{
                validCounter=0;
                row = rnd.nextInt(10 - ship);
                col = rnd.nextInt(10 - ship +1);
                System.out.println("vertically placing boat "+ship+" in position"+row+" "+col);
                for(int i =0;i<=ship;i++){
                    if(board[row+i][col].equals("-")){
                        validCounter++;

                    }
                }
            }while(validCounter!=(ship+1));
            for (int i =0;i<=ship;i++){
                board[row+i][col]="ship";
            }
        }
        else{

            do{
                validCounter =0;
                row = rnd.nextInt(10 - ship + 1);
                col = rnd.nextInt(10 - ship);
                System.out.println("horizontally placing "+ship+" in position: "+row+" "+col);
                for(int i =0; i<= ship; i++){
                    if(board[row][col+i].equals("-")){
                        validCounter ++;
                    }
                }
            }while(validCounter!=ship+1);
            for(int i =0; i<=ship;i++){
                board[row][col+i]="ship";
            }


        }
    }

    private static void display(){
        //unicode
        String boat ="\u26F5";
        String hit ="\uD83D\uDD25";
        String miss = "\uD83D\uDEAB";

        String wave = "\uD83C\uDF0A";
        System.out.print("      ");
        System.out.print("\uFF21"+" "); //A

        System.out.print("\uFF22"+" "); //B

        System.out.print("\uFF23"+" "); //C

        System.out.print("\uFF24"+" "); //D

        System.out.print("\uFF25"+" "); //E

        System.out.print("\uFF26"+" "); //F

        System.out.print("\uFF27"+" "); //G

        System.out.print("\uFF28"+" "); //H

        System.out.print("\uFF29"+" "); //I

        System.out.print("\uFF2A"); //J
        System.out.println();
        for(int row=0; row<ROW;row++){
            System.out.print("|");
            //filling in the board
            if(row== 9){
                System.out.print(row+1+"  ");

            }
            else{
                System.out.print(row+1+"   ");
            }
            System.out.print("|");

            for(int col=0;col<COL;col++){


                if (board[row][col].equals("hit")){
                    System.out.print(hit + " ");
                }
                else if (board[row][col].equals("miss")){
                    System.out.print(miss + " ");


                }
                else {
                    System.out.print(wave + " ");
                }


            }


            System.out.println();
        }

    }
    private static boolean playerMove(){
        //get player move and hit or miss
    boolean isHit;
    int row;
    String AlphaCol = "";
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("whats your move?");
            row = safeinput.getIntRange(in, "row: ", 1, 10);
            row--;
            System.out.println("whats your col move");
            AlphaCol = safeinput.getRegExString(in, "col: ", "[aAbBcCdDeEfFgGhHiIjJ]");
            AlphaCol = AlphaCol.toUpperCase();
            int col = 0;
            switch (AlphaCol) {
                case "A":
                    col = 0;
                    break;
                case "B":
                    col = 1;
                    break;
                case "C":
                    col = 2;
                    break;
                case "D":
                    col = 3;
                    break;
                case "E":
                    col = 4;
                    break;
                case "F":
                    col = 5;
                    break;
                case "G":
                    col = 6;
                    break;
                case "H":
                    col = 7;
                    break;
                case "I":
                    col = 8;
                    break;
                case "J":
                    col = 9;
                    break;

            }
            if (board[row][col].equals("-")) {
                board[row][col] = "miss";
                System.out.println("that was a miss");
                isHit = false;
                return isHit;
            } else if (board[row][col].equals("ship")) {
                board[row][col] = "hit";
                System.out.println("that was a hit");
                isHit = true;
                return isHit;
            } else {
                System.out.println("you've already occupied that area of ocean");
            }

        }while(true);
    }

}
