package ObjectsAndClassesExercise.Articles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();

        String[] dataArray = data.split(",\\s+");
        String title = dataArray[0];
        String content = dataArray[1];
        String author = dataArray[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            String[] commandArray = command.split(": ");
            switch (commandArray[0]) {
                case "Edit":
                    String newContent = commandArray[1];
                    article.edit(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = commandArray[1];
                    article.changeAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = commandArray[1];
                    article.rename(newTitle);
                    break;
            }
        }

        System.out.println(article);

        sc.close();
    }

}
