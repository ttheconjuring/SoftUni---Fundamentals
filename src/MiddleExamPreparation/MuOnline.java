package MiddleExamPreparation;

import java.util.Scanner;

public class MuOnline {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialHealth = 100;
        int initialBitcoins = 0;

        String dungeon = sc.nextLine();
        String[] room = dungeon.split("\\|");
        int n = room.length;

        int i = 1;
        while (i != n + 1) {
            String[] insideTheRoomArray = room[i - 1].split("\\s+");
            if (insideTheRoomArray[0].equals("potion")) {
                int heal = Integer.parseInt(insideTheRoomArray[1]);
                int healed = 0;
                if (initialHealth + heal <= 100) {
                    healed = heal;
                } else {
                    healed = 100 - initialHealth;
                }
                initialHealth += heal;
                if (initialHealth > 100) {
                    initialHealth = 100;
                }
                System.out.println("You healed for " + healed + " hp.");
                System.out.println("Current health: " + initialHealth + " hp.");
            } else if (insideTheRoomArray[0].equals("chest")) {
                int bitcoins = Integer.parseInt(insideTheRoomArray[1]);
                initialBitcoins += bitcoins;
                System.out.println("You found " + bitcoins + " bitcoins.");
            } else {
                String enemy = insideTheRoomArray[0];
                int damage = Integer.parseInt(insideTheRoomArray[1]);
                initialHealth -= damage;
                if (initialHealth > 0) {
                    System.out.println("You slayed " + enemy + ".");
                } else {
                    System.out.println("You died! Killed by " + enemy + ".");
                    System.out.println("Best room: " + i);
                    return;
                }
            }
            i++;
        }

        System.out.println("You've made it!");
        System.out.println("Bitcoins: " + initialBitcoins);
        System.out.println("Health: " + initialHealth);

        sc.close();
    }

}
