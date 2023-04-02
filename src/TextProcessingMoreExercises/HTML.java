package TextProcessingMoreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HTML {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String titleOfAnArticle = sc.nextLine();
        String contentOfTheArticle = sc.nextLine();
        String commentAboutTheArticle = sc.nextLine();

        List<String> comments = new ArrayList<>();

        while (!commentAboutTheArticle.equals("end of comments")) {
            comments.add(commentAboutTheArticle);
            commentAboutTheArticle = sc.nextLine();
        }

        System.out.println("<h1>");
        System.out.println("    " + titleOfAnArticle);
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.println("    " + contentOfTheArticle);
        System.out.println("</article>");
        int n = comments.size();
        for (int i = 0; i < n; i++) {
            System.out.println("<div>");
            System.out.println("    " + comments.get(i));
            System.out.println("</div>");
        }

        sc.close();
    }

}
