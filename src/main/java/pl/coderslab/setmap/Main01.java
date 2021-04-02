package pl.coderslab.setmap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main01 {

    public static void main(String[] args) {

        Set<String> texts = new HashSet<>();
        int counter = 0;

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("wprowadź linię");
            String text = scan.nextLine();
            if(text.trim().toLowerCase().equals("exit")){
                break;
            }
            texts.add(text);
            counter++;

        }

        System.out.println("Podanych napisów: " +counter);

    }
}
