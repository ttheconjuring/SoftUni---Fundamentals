package RegularExpressionsMoreExercises;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] ticket = input.split(",");
        int n = ticket.length;
        for (int i = 0; i < n; i++) {
            ticket[i] = ticket[i].trim();
        }

        String winningTicketsRegex = "[^@#$^]*[@#$^]{6,10}[^@#$^]*[^@#$^]*[@#$^]{6,10}[^@#$^]*";
        // String winningTicketsRegex = "(?=.{20}$)(?:[^@#$^]*[@#$^]{6,10}[^@#$^]*){2}";
        Pattern winningTicketsPattern = Pattern.compile(winningTicketsRegex);

        for (int i = 0; i < n; i++) {
            if (ticket[i].length() == 20) {
                StringBuilder ticketStatus = new StringBuilder();
                Matcher winningTicketsMatcher = winningTicketsPattern.matcher(ticket[i]);
                if (winningTicketsMatcher.find()) {
                    String winningTicket = winningTicketsMatcher.group();
                    char luckySymbol = getLuckySymbolOf(winningTicket);
                    int count = (winningTicket.length() - winningTicket.replace(String.valueOf(luckySymbol), "").length()) / 2;
                    ticketStatus.append("ticket \"").append(winningTicket).append("\" - ").append(count).append(luckySymbol);
                    if (count == 10) {
                        ticketStatus.append(" Jackpot!");
                    }
                } else {
                    ticketStatus.append("ticket \"").append(ticket[i]).append("\" - no match");
                }
                System.out.println(ticketStatus);
            } else {
                System.out.println("invalid ticket");
            }
        }
        sc.close();
    }

    private static char getLuckySymbolOf(String winningTicket) {
        Map<Character, Integer> characterOccurrenceMap = new HashMap<>();
        int n = winningTicket.length();
        for (int i = 0; i < n; i++) {
            characterOccurrenceMap.putIfAbsent(winningTicket.charAt(i), 0);
            characterOccurrenceMap.put(winningTicket.charAt(i), characterOccurrenceMap.get(winningTicket.charAt(i)) + 1);
        }
        return Collections.max(characterOccurrenceMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

}



