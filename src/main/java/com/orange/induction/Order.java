package com.orange.induction;

/**
 * Created by tdph5945 on 2016-06-05.
 */
public class Order {
    //==>
    String telephoneNumber1;


    private String telephoneNumber;

    private boolean writingEnabled, active, deleted, allowed;

    private static final String ADMIN_PREFIX = "admin_";





    public boolean IsActive() {
        return active;
    }


    public void loopBreaker() {
        outer: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j && i == 5) {
                    continue outer;
                }

            }
            ////ssssssssss
        }
    }

    public boolean isShereif(String name) {
//        if (name == null) {
//            return false;
//        }
//        if (name.equals("shereif")) {
//            return true;
//        }
//        return false;


        return "shereif".equals(name);
    }

    ////////////////////////////////////////////////


    //which is the right one
    private static final int ITEM_0 = 5;
    private final static int ITEM_1 = 5;
    final private static int ITEM_2 = 5;
    final static private int ITEM_3 = 5;


    ////////////////////////////////////////////////

    private static int VAR_1 = 1;

    private int var2;

    //Static initializer
    static {

    }

    //Static method declarations
    public static void function() {
        System.out.println(1);
    }


    //Instance initializer
    {
        System.out.println("====================");
        System.out.println("       print        ");

        System.out.println("====================");
        System.out.println("====================");
    }


    //Instance constructor declarations
    public Order() {

        this.var2 = 0;
        this.active = false;
    }

    public Order(int var2) {

        System.out.println("====================");
        System.out.println("       print        ");

        System.out.println("====================");
        System.out.println("====================");

        this.var2 = var2;
    }


    //Instance method declarations
    public int getVar2() {
        return var2;
    }


    /*

    Static variable field declarations
    Instance variable field declarations

    Static initializer
    Static member nested class declarations
    Static method declarations

    Instance initializer
    Instance constructor declarations
    Instance member nested class (inner class) declarations
    Instance method declarations

     */

}
