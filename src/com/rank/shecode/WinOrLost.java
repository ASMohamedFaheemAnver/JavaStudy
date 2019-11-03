package com.rank.shecode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class WinOrLost {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int requiredRun = 50;
        int wicketLeft = 4;

        String runReg = "\\b[0-6]\\b";
        String wideReg = "\\b(wd)\\b";
        String noBallReg = "\\b(nb)\\b";
        String lbBallReg = "\\b(lb)\\b";
        String wicketReg = "\\b(w)\\b";

        Pattern runPattern = Pattern.compile(runReg);
        Pattern widePattern = Pattern.compile(wideReg);
        Pattern noBallPattern = Pattern.compile(noBallReg);
        Pattern lbBallRegPattern = Pattern.compile(lbBallReg);
        Pattern wicketRegPattern = Pattern.compile(wicketReg);

        int totalRun = 0;
        for (int i = 0; i<5; i++){
            String string = scanner.nextLine();
            for (String node : string.split(" ")){
                if (runPattern.matcher(node).find()){
                    totalRun += Integer.parseInt(node);
                    if (totalRun>=requiredRun){
                        System.out.println("Win");
                        break;
                    }
                }else if (widePattern.matcher(node).find()){
                    totalRun += 1;
                    if (totalRun>=requiredRun){
                        System.out.println("Win");
                        break;
                    }
                }else if (noBallPattern.matcher(node).find()){
                    node = node.replaceAll("nb", "");
                    if (node.isEmpty()){
                        totalRun += 1;
                    }else {
                        totalRun += Integer.parseInt(node);
                    }
                    if (totalRun>=requiredRun){
                        System.out.println("Win");
                        break;
                    }
                }else if (lbBallRegPattern.matcher(node).find()){
                    node = node.replaceAll("lb", "");
                    totalRun += Integer.parseInt(node);

                    if (totalRun>=requiredRun){
                        System.out.println("Win");
                        break;
                    }
                }else if (wicketRegPattern.matcher(node).find()){
                    wicketLeft--;
                    if (wicketLeft==0){
                        System.out.println("Lost");
                        break;
                    }
                }
            }
            if (totalRun>=requiredRun || wicketLeft==0){
                break;
            }
        }

        if ((totalRun<requiredRun)&&(wicketLeft!=0)){
            System.out.println("Lost");
        }
    }
}
