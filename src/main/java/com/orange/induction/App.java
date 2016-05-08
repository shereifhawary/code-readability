package com.orange.induction;

/**
 * Hello world!
 * [1 Comments BAD]
 */

/**
 * [1 Comments GOOD]
 * @Auther: Shereif hawary
 * @since: v1.5
 * app class the main brain of the project, all the dependence are covered by maven dependence and all the logic related
 * to this class can be found in RSD document version 1.5
 */
public class App {
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
    }

    /**
     * [1 comments] Print welcome message to the user
     * @param message
     */
    public void printWelcomeMessageToUsers(String message) {
        System.out.println(message);
    }
}

/**
 * [1 Comments]	There's a fine line between comments that illuminate and comments that obscure.
 *              Are the comments necessary? Do they explain "why" and not "what"?
 *              Can you refactor the code so the comments aren't required?
 *              And remember, you're writing comments for people, not machines.
 *
 */