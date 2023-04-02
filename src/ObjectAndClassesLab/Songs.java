package ObjectAndClassesLab;

import java.util.Scanner;

public class Songs {

    static class Song {

        private String typeList;

        public String getTypeList() {
            return this.typeList;
        }

        private String name;

        public String getName() {
            return this.name;
        }

        private String time;

        public String getTime() {
            return this.time;
        }

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Song[] song = new Song[n];

        for (int i = 0; i < n; i++) {
            String[] songArray = sc.nextLine().split("_");
            song[i] = new Song(songArray[0], songArray[1], songArray[2]);
        }

        String type = sc.nextLine();
        if (type.equals("all")) {
            for (int i = 0; i < n; i++) {
                System.out.println(song[i].getName());
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (song[i].getTypeList().equals(type)) {
                    System.out.println(song[i].getName());
                }
            }
        }

        sc.close();
    }

}
