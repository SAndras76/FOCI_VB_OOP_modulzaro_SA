package hu.progmatic;

import java.io.*;
import java.util.*;

public class Foci_VB {

    public static void main(String[] args) {
        try {

            List<MatchesAll> matchesAlls = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader("matches_all.csv"))) {
                String csvSor;

                reader.readLine();

                while ((csvSor = reader.readLine()) != null) {
                    MatchesAll matchesAll = new MatchesAll(csvSor);
                    matchesAlls.add(matchesAll);
                }}
            System.out.println("1. feladat:\n");
            System.out.println("Number of matches: " + matchesAlls.size());

            System.out.println("2. feladat\n");
            System.out.println("Kérem a VB évszámát: ");
            Scanner scanner = new Scanner(System.in);
            String yearCup = scanner.nextLine();
            int maxDif = Integer.MIN_VALUE;

            for (MatchesAll GoalsDif : matchesAlls) {
                int sum = 0;
                if (GoalsDif.getYear().equals(yearCup)) {
                    sum = Math.abs(GoalsDif.getGoals_a()- GoalsDif.getGoals_b());
                    if (sum > maxDif) {
                        maxDif = sum;
                    }
                }
            }

            System.out.println("A legnagyobb gólkülönbség az adott VB-n:  " +maxDif);


            try (PrintWriter writer = new PrintWriter("selected.csv")) {
                writer.println("stage;date;team_a;team_b;goals_a;goals_b;penalties_a;penalties_b");
                for (MatchesAll matchesAll : matchesAlls) {
                    if (matchesAll.getYear().equals(yearCup)){
                        writer.write( matchesAll.getStage() + ";" +
                                matchesAll.getDate() + ";" + matchesAll.getTeam_a() + ";"
                        + matchesAll.getTeam_b() + ";" +matchesAll.getGoals_a() + ";" + matchesAll.getGoals_b() +
                                "," + matchesAll.getPenalties_a() + ";" +matchesAll.getPenalties_b() +"\n");
                    }
                }
            }
            System.out.println("4. feladat: \n");
            int winCounter =0;

            for (MatchesAll wins : matchesAlls) {
                if (wins.getYear().equals(yearCup)){
                    if (wins.getGoals_a() > wins.getGoals_b()) {

                        winCounter++;
                    }


                }
            }
            System.out.println(" A " + yearCup +". évben a fogadó "+ winCounter + " alkalommal nyert");
            } catch (
                    IOException e) {
                e.printStackTrace();
            }
         catch (Exception e) {
        e.printStackTrace();

    }}}