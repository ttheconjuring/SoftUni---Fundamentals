package MiddleExamPreparation;

import java.util.Scanner;

public class ManOWar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pShip = sc.nextLine().split(">");
        int n = pShip.length;
        int[] pirateShip = new int[n];
        for (int i = 0; i < n; i++) {
            pirateShip[i] = Integer.parseInt(pShip[i]);
        }
        String[] wShip = sc.nextLine().split(">");
        int m = wShip.length;
        int[] warShip = new int[m];
        for (int i = 0; i < m; i++) {
            warShip[i] = Integer.parseInt(wShip[i]);
        }

        int maxHealth = Integer.parseInt(sc.nextLine());

        String command = sc.nextLine();

        while (!command.equals("Retire")) {
            String[] commandArray = command.split("\\s+");
            switch (commandArray[0]) {
                case "Fire":
                    int fireIndex = Integer.parseInt(commandArray[1]);
                    if (fireIndex >= 0 && fireIndex < m) {
                        int fireDamage = Integer.parseInt(commandArray[2]);
                        warShip[fireIndex] -= fireDamage;
                        if (warShip[fireIndex] <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(commandArray[1]);
                    int endIndex = Integer.parseInt(commandArray[2]);
                    int defendDamage = Integer.parseInt(commandArray[3]);
                    if (startIndex >= 0 && startIndex < n) {
                        if (endIndex >= 0 && endIndex < n) {
                            for (int i = startIndex; i <= endIndex; i++) {
                                pirateShip[i] -= defendDamage;
                                if (pirateShip[i] <= 0) {
                                    System.out.println("You lost! The pirate ship has sunken.");
                                    return;
                                }
                            }
                        }
                    }
                    break;
                case "Repair":
                    int repairIndex = Integer.parseInt(commandArray[1]);
                    if (repairIndex >= 0 && repairIndex < n) {
                        int health = Integer.parseInt(commandArray[2]);
                        pirateShip[repairIndex] += health;
                        if (pirateShip[repairIndex] > maxHealth) {
                            pirateShip[repairIndex] = maxHealth;
                        }
                    }
                    break;
                case "Status":
                    double minHealth = maxHealth * 0.2;
                    int counter = 0;
                    for (int i = 0; i < n; i++) {
                        if (pirateShip[i] < minHealth) {
                            counter++;
                        }
                    }
                    System.out.println(counter + " sections need repair.");
                    break;
            }
            command = sc.nextLine();
        }

        int pirateShipSum = 0;
        for (int i = 0; i < n; i++) {
            pirateShipSum += pirateShip[i];
        }

        int warShipSum = 0;
        for (int i = 0; i < m; i++) {
            warShipSum += warShip[i];
        }

        System.out.println("Pirate ship status: " + pirateShipSum);
        System.out.println("Warship status: " + warShipSum);

        sc.close();
    }

}
