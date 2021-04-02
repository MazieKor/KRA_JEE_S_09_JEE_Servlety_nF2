package pl.coderslab.setmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int points = 0;

        Map <String, String> quizData = getMap();
        for(Map.Entry<String,String> entry : quizData.entrySet()) {
            String question = entry.getKey();
            String answer = entry.getValue();

            System.out.println("Opposite to " +question+" is: ");
            String userAnswer = scan.nextLine().trim().toLowerCase();
            if(userAnswer.equals(answer)) {
                points++;
            }
        }
    }

    public static Map<String, String> getMap() {
        Map<String, String> oppositeValues = new HashMap<>();
        oppositeValues.put("ciepło", "zimno");
        oppositeValues.put("ciemny", "jasny");
        oppositeValues.put("ostry", "tępy");
        oppositeValues.put("ciepło", "zimno");
        oppositeValues.put("ciepło", "zimno");
        return oppositeValues;
    }

}
