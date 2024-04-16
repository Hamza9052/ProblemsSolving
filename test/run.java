package test;

import java.util.Scanner;

public class run {

   
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

       WinDraw player = new WinDraw();
        String L = sc.nextLine();
        player.player2 = L;

        String k = sc.nextLine();
        player.player2 = k;
        for(int i = 0; i < 4; i++) {
        
        if (
            player.choice[i].equals(player.player2.toLowerCase()) &&
            player.choice[i].equals(player.player2.toLowerCase())
            ) {
                System.out.println("Drawn!");
            
        }}

        if (
            player.choice[1].equals(player.player1.toLowerCase()) &&
            player.choice[0].equals(player.player2.toLowerCase()) ||
            player.choice[0].equals(player.player1.toLowerCase()) &&
            player.choice[2].equals(player.player2.toLowerCase()) ||
            player.choice[2].equals(player.player1.toLowerCase()) &&
            player.choice[1].equals(player.player2.toLowerCase())
            ) {
            System.out.println("Player 1 Won!");
            }

            if (
                player.choice[1].equals(player.player2.toLowerCase()) &&
                player.choice[0].equals(player.player1.toLowerCase()) ||
                player.choice[0].equals(player.player2.toLowerCase()) &&
                player.choice[2].equals(player.player1.toLowerCase()) ||
                player.choice[2].equals(player.player2.toLowerCase()) &&
                player.choice[1].equals(player.player1.toLowerCase())
                ) {
                System.out.println("Player 2 Won!");
                }


    }
}
