/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refresher;

/**
 *
 * @author zenga
 */
public class Comparator {
    public int compare(Player a, Player b){
        if (a.score == b.score){
            return a.name.compareTo(b.name);
        }else {
            return b.score - a.score;
        }
    }
    
       public static void main(String[] args){
        Player[] player = new Player[2];
        player[0].score = 9;
        player[0].name = "James";
        player[1].name = "Dickson";
        player[1].score = 33;
        
        System.out.println(player.toString());
        
       }
}

class Player {
    String name;
    int score;
}
