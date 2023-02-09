package pruebaValidacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String datoQueDeberiaSerSoloString;
        System.out.println("Pinche usuario pendejo, mete SOLO LETRAS: ");
        datoQueDeberiaSerSoloString = sc.nextLine();

        if(datoQueDeberiaSerSoloString.matches("[a-zA-Z]*?\\d*[a-zA-Z]*?")){
            System.out.println("Que no te dije quie solo letras pendejo!!!!");
        }

    }
}
