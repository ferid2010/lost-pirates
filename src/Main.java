import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("LOST PIRATES\n\n\n" +



                "please entre your name");

        String isim = scanner.next();


        System.out.println("so basically let me explain the game: you know the game called \"dark pirates\"?\n" +
                "if you do this game is about having dialoges with the important people who died in the game\n" +
                "also PLEASE dont try to bug the game if there are 3 choices choose 1-3 not like 4 or something\n\n\n" +



                "you found yourself in a random place you dont know where you are you see some pathes where are you going?\n" +
                "1-next to the ahead dragon\n" +
                "2-to a hole to your right\n" +
                "3-at the top of the mountain behind\n" +
                "4-the destroyed robot to your left");

        int cevap = scanner.nextInt();

        if(cevap == 1) {

            System.out.println("you go near the dragon wanna talk to it\n" +
                    "1-yes\n" +
                    "2-no");

            int cevapA = scanner.nextInt();

            int cevapA1 = 0;

            if (cevapA == 1) {

                System.out.println("you approached the dragon and it told you that it is uncomfortable bc something he ate wanna check his stomach for him?\n" +
                        "1-yes\n" +
                        "2-no");

                cevapA1 = scanner.nextInt();

            } else if (cevapA == 2) {

                System.out.println("the dragon saw you and approached you,it told you that it is uncomfortable bc something he ate wanna check his stomach for him?\n" +
                        "1-yes\n" +
                        "2-no");

                cevapA1 = scanner.nextInt();

            }if (cevapA1 == 1){

                System.out.println("you went into the dragons mouth wait it is him, the mythical chocolate dealer!\n" +
                        "he was the most hidden and the best chocolate dealer! but he sadly died. he loved players and always had goo chocolates\n" +
                        "he told you that this is the dragon he was in at the 5th world, the dragon world...\n\n" +


                        "THE END(if you want to play again run the code again)");

            } else if (cevapA1 == 2) {

                System.out.println("the dragon got mad he, just wanted a little favor he ate you!wait it is him, the mythical chocolate dealer!\n" +
                        "he was the most hidden and the best chocolate dealer! but he sadly died. he loved players and always had goo chocolates\n" +
                        "he told you that this is the dragon he was in at the 5th world, the dragon world.\n\n" +


                        "THE END(if you want to play again run the code again)");

            }

        }
        else if (cevap == 2) {

            System.out.println("you go near the hole there is a strange creature down talk to HIM?\n" +
                    "1-yes\n" +
                    "2-no");

            int cevapB = scanner.nextInt();

            int cevapB1 = 0;

            if (cevapB == 1){

                System.out.println("the creature is looking at you he looks like trying to scan you will you ask who he is?\n" +
                        "1-yes\n" +
                        "2-no");

                cevapB1 = scanner.nextInt();

            } else if (cevapB == 2) {

                System.out.println("somewhy the creature came up it is looking at you he looks like he is trying to scan you, will you ask him who he is?\n" +
                        "1-yes\n" +
                        "2-no");

            }if (cevapB1 == 1){

                System.out.println("you asked the creature who he is. wait it is jeb!\n" +
                        "he was the character you see the most in dark pirates 2. he was evil like for a time but he agreed with you later on.\n" +
                        "he was one of the strongest characters he had 2 forms and in both forms he could beat an avarage player with ez...\n\n" +


                        "THE END(if you want to play again run the code again)");

            }else if(cevapB1 == 2){

                System.out.println("you tried to recognize the creature.wait it is jeb!\n" +
                        "he was the character you see the most in dark pirates 2. he was evil like for a time but he agreed with you later on.\n" +
                        "he was one of the strongest characters he had 2 forms and in both forms he could beat an avarage player with ez...\n\n" +


                        "THE END(if you want to play again run the code again)");

            }

        }
        else if (cevap == 3) {

            System.out.println("you climb the mountain you found a watch it is supposed to be able to scan anything, you see a strange being wanna scann it?\n" +
                    "1-yes\n" +
                    "2-no");

            int cevapC = scanner.nextInt();

            if (cevapC == 1){

                System.out.println("you took the watch and scanned the creature, wait it is dark pirates!\n" +
                        "dark pirates is a creature wich created the dark pirates island and protected it.\n" +
                        "it was the strongest mob but it lost some power and has its own language wich nobody knows yet...\n\n" +


                        "THE END(if you want to play again run the code again)");

            } else if (cevapC == 2) {

                System.out.println("you look at the crature, wait it is dark pirates!\n" +
                        "dark pirates is a creature wich created the dark pirates island and protected it.\n" +
                        "it was the strongest mob but it lost some power and has its own language wich nobody knows yet...\n\n" +


                        "THE END(if you want to play again run the code again)");

            }

        }
        else if (cevap == 4) {

            System.out.println("you go towards the robot it has a big hole in the middle will you go there?\n" +
                    "1-yes\n" +
                    "2-no");

            int cevapD = scanner.nextInt();

            int cevapD1 = 0;

            if (cevapD == 1){

                System.out.println("you go towards the robot, in the middle there is a man trying to destroy the robot even more will you talk to him?\n" +
                        "1-yes\n" +
                        "2-no");

                cevapD1 = scanner.nextInt();

            } else if (cevapD == 2) {

                System.out.println("a man just jumped out the robot, he is looking at you, will you talk to him?\n" +
                        "1-yes\n" +
                        "2-no");

                cevapD1 = scanner.nextInt();

            }if (cevapD1 == 1){

                System.out.println("you asked the man who he is, wait he is the guardian!\n" +
                        "he was the strongest person in dark pirates 2 but didnt really listen to anybody\n" +
                        "he sadly died in dark pirates 3 but when you got his swords he still would hold your swordas as a soul for you\n\n" +


                        "THE END(if you want to play again run the code again)");

            }if (cevapD1 == 2){

                System.out.println("you looked at the man, wait he is the guardian!\n" +
                        "he was the strongest person in dark pirates 2 but didnt really listen to anybody\n" +
                        "he sadly died in dark pirates 3 but when you got his swords he still would hold your swordas as a soul for you\n\n" +


                        "THE END(if you want to play again run the code again)");

            }

        }

    }
}