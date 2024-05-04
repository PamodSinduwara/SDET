package com.sdet.assignments.six.question_5;

import java.util.*;

public class SoccerHashMap {
    public static void main(String[] args) {

        Map<String, List<Integer>> goalsByPlayer = new HashMap<>();

        goalsByPlayer.put("Sinduwara", Arrays.asList(2, 3, 5, 4, 2));
        goalsByPlayer.put("Chamath", Arrays.asList(4, 2, 3, 4, 3));
        goalsByPlayer.put("Rajintha", Arrays.asList(2, 2, 1, 1, 2));

        String maxGoalsPlayer = "";
        int maxGoals = Integer.MIN_VALUE;
        for (Map.Entry<String, List<Integer>> entry : goalsByPlayer.entrySet()) {
            int playerMaxGoals = Collections.max(entry.getValue());
            if (playerMaxGoals > maxGoals) {
                maxGoals = playerMaxGoals;
                maxGoalsPlayer = entry.getKey();
            }
        }
        System.out.println("Player who hit the maximum number of goals during a match: " + maxGoalsPlayer);

        String overallMaxGoalsPlayer = "";
        int overallMaxGoals = Integer.MIN_VALUE;
        for (Map.Entry<String, List<Integer>> entry : goalsByPlayer.entrySet()) {
            int playerOverallGoals = entry.getValue().stream().mapToInt(Integer::intValue).sum();
            if (playerOverallGoals > overallMaxGoals) {
                overallMaxGoals = playerOverallGoals;
                overallMaxGoalsPlayer = entry.getKey();
            }
        }
        System.out.println("Player who hit the maximum number of goals during the season: " + overallMaxGoalsPlayer);
    }
}
