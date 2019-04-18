package by.yandex.sidvlada.lesson2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Car {

    public void Clutch() {

        System.out.println("Enter please 0 or 1");
        Scanner scanner = new Scanner(System.in);

        int clutch = scanner.nextInt();

        if (clutch == 0) {
            System.out.println("Please, press the clutch "); //
        } else {
            System.out.println("You can driver ");
        }
    }

    public void GearBox() {

        System.out.println("Enter please your speed");
        Scanner scanner = new Scanner(System.in);

        int speed = scanner.nextInt();
        int transmission;

        if (speed < 20) {
            transmission = 1;
            System.out.println("Transmission is " + transmission);
        } else if (speed >= 20 || speed < 50) {
            transmission = 2;
            System.out.println("Transmission is " + transmission);
        } else if (speed >= 50 || speed < 100) {
            transmission = 3;
            System.out.println("Transmission is " + transmission);
        } else {
            transmission = 4;
            System.out.println("Transmission is " + transmission);
        }
    }
        public void Gas() {

            System.out.println("Enter gas ");
            Scanner scanner = new Scanner(System.in);

            int gas = scanner.nextInt();

            if (gas==0) {
               System.out.println("Add the gas please.");
            } else if (gas <= 2) {
               System.out.println("Warning. Gas count: " + gas + " You need to refuel.");
            } else {
               System.out.println("Lets go!");
            }
        }

    }



