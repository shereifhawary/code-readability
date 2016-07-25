package com.orange.induction;

/**
 * Hello world!
 * [1 Comments BAD]
 */

import java.util.Arrays;

/**
 * [1 Comments GOOD]
 * @Auther: Shereif hawary
 * @since: v1.5
 * app class the main brain of the project, all the dependence are covered by maven dependence and all the logic related
 * to this class can be found in RSD document version 1.5
 */
public class App2 {
    /**
     * [1 Comments BAD]
     * this is the main function
     * @param args
     */

    //[1 Comments GOOD]
    //DO we need a documentation for Main function
    public static void main(String[] args) {
        App app = new App();
        app.printWelcomeMessageToUsers("Hello World!");
        app.buildAndCompileAndSortEntitiesWithOrderByStatus();
    }

    /**
     * [1 comments] Print welcome message to the user
     * @param message
     */
    public void printWelcomeMessageToUsers(String message) {
        System.out.println(message);
    }





    // [2 long Method]
    public boolean buildAndCompileAndSortEntitiesWithOrderByStatus() {
        int buildmode = 1;
        int BUILD_SUCCESS = 2;
        StringBuilder sb = new StringBuilder();
        sb.append("========================").append("!!");
        for (int i = 0 ; i < 10 ; i++) {
            sb.append("adding step ").append(i).append("!!");
        }

        if(sb.capacity() < 20) {
            System.err.print("OPPS !!");
            return false;
        }

        if(sb.length() > 30) {
            buildmode = BUILD_SUCCESS;
        } else {
            buildmode = 3;
        }

        sb.append("========================").append("!!");
        //sb.append(buildmode);

        String qwe = sb.toString();
        if(buildmode == 2) {
            sb.delete(0,sb.length());
            sb.append(qwe.replace("=", "-"));
        }
        sb.append("compiled");
        //sb.append("!!");


        String[] qwe2 = sb.toString().split("\\!\\!");
        sb.delete(0,sb.length());
        Arrays.sort(qwe2);
        if(qwe2.length == 0) {
            System.err.print("oops can't sort and order by");
            return false;
        }

        for(int i = 0 ; i < qwe2.length ; i++) {
            sb.append(qwe2[i]).append("\n");
        }

        System.out.println(sb);
        return true;

    }
}
