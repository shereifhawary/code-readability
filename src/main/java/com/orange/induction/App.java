package com.orange.induction;

/**
 * Hello world!
 * [1 Comments BAD]
 */

import java.util.Arrays;

/**
 * [1 Comments GOOD]
 *
 * @Auther: Shereif hawary
 * @since: v1.5
 * app class the main brain of the project, all the dependence are covered by maven dependence and all the logic related
 * to this class can be found in RSD document version 1.5
 */
public class App {
    /**
     * [1 Comments BAD]
     * this is the main function
     *
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
     * this function don't check on nulls, better check out side of the function as it's a void function
     *
     * @param message
     */
    public void printWelcomeMessageToUsers(String message) {
        System.out.println(message);
    }


    public StringBuilder build() {
        int buildmode = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("========================").append("!!");
        for (int i = 0; i < 10; i++) {
            sb.append("adding step ").append(i).append("!!");
        }

        if (sb.capacity() < 20) {
            System.err.print("OPPS !!");
            return null;
        }

        if (sb.length() > 30) {
            buildmode = 2;
        } else {
            buildmode = 3;
        }

        sb.append("========================").append(buildmode).append("!!");
        return sb;
    }

    public StringBuilder compile(StringBuilder sb1) {

        StringBuilder sb = new StringBuilder(sb1);
        //sb.append(buildmode);
        String qwe = sb.toString();

        sb.delete(0, sb.length());
        sb.append(qwe.replace("=", "-"));

        sb.append("compiled");
        //sb.append("!!");
        return sb;
    }

    // [2 long Method]
    public boolean buildAndCompileAndSortEntitiesWithOrderByStatus() {

        StringBuilder sb = this.build();
        if (sb == null) {
            return false;
        }
        printStarts();

        sb = this.compile(sb);
        if (sb == null) {
            return false;
        }

        printStarts();

        sb = this.sortAndOrderBy(sb);
        if (sb == null) {
            return false;
        }
        printStarts();

        System.out.println(sb);

        return true;

    }

    private void printStarts() {
        for(int i = 0 ; i < 9 ; i++) {
            System.out.print("*");
        }
        System.out.println("*");
    }

    private StringBuilder sortAndOrderBy(StringBuilder sb1) {
        StringBuilder sb = new StringBuilder(sb1);
        String[] qwe2 = sb.toString().split("\\!\\!");
        sb.delete(0, sb.length());
        Arrays.sort(qwe2);
        if (qwe2.length == 0) {
            System.err.print("oops can't sort and order by");
            return null;
        }

        for (int i = 0; i < qwe2.length; i++) {
            sb.append(qwe2[i]).append("\n");
        }
        return sb;
    }


}

/**
 * [1 Comments]
 * There's a fine line between comments that illuminate and comments that obscure.
 * Are the comments necessary? Do they explain "why" and not "what"?
 * Can you refactor the code so the comments aren't required?
 * And remember, you're writing comments for people, not machines.
 *
 *
 * [2 Long Method]
 * All other things being equal,
 * a shorter method is easier to read,
 * easier to understand,
 * and easier to troubleshoot.
 * Refactor long methods into smaller methods if you can.
 *
 * [3 Long Parameter List]
 * The more parameters a method has,
 * the more complex it is.
 * Limit the number of parameters you need in a given method,
 * or use an object to combine the parameters.
 *
 * [4 Duplicated code]
 * Duplicated code is the bane of software development.
 * Stamp out duplication whenever possible.
 * You should always be on the lookout for more subtle cases of near-duplication, too.
 * Don't Repeat Yourself!
 *
 * [5 Conditional Complexity]
 * Watch out for large conditional logic blocks,
 * particularly blocks that tend to grow larger or change significantly over time.
 * Consider alternative object-oriented approaches such as decorator,
 * strategy, or state.
 *
 * [6 Combinitorial Explosion]
 * You have lots of code that does almost the same thing..
 * but with tiny variations in data or behavior.
 * This can be difficult to refactor-- perhaps using generics or an interpreter or paramters?
 * List class for example
 *
 * [7 Large Class] (cohesiveness)
 * Large classes, like long methods, are difficult to read, understand, and troubleshoot.
 * Does the class contain too many responsibilities?
 * Can the large class be restructured or broken into smaller classes?
 *
 * [8 Type Embedded in Name]
 * Avoid placing types in method names; it's not only redundant,
 * but it forces you to change the name if the type changes.
 *
 * [9 Uncommunicative Name]
 * Read the method name, do you understand what it does
 * if no please rename the function name
 *
 * Does the name of the method succinctly describe what that method does?
 * Could you read the method's name to another developer and have them explain to you what it does?
 * If not, rename it or rewrite it.
 *
 *
 */