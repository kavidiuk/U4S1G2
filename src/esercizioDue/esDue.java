package esercizioDue;

import java.util.Scanner;

public class esDue {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = 2;
        switch (x){
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("Il valore è compreso tra 0 e 3");
                break;
            default:
                System.out.println("Errore");
        }
    }
}
