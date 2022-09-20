package stepOne;

public class One {
    // 1 code
    public static void startHello01() {
        System.out.println("Hello world!");
    }

    public static void startHello02() {
        System.out.print("\t I love pizza \n");
        System.out.println("\"It's relly good!\"");
        System.out.println("\\It's relly good!");
    }

    public static void startHello03() {
        //Comment
        /*
        * he
        * hello
        */
    }

    // Date type
    public static void startHello04() {

        boolean a04 = true; // true or false
        byte b04 = 127;  // -128 to 127
        short c04 = 32767; // -32768 to 32767
        int d04 = 200_000_000; // -200 million to 200 million
        long f04 = 2_000_000_000; //

        float g04 = 3.14151f; // 6-7 digits
        double h04 = 3.14558574558; // 15 digits

        char j04 = 'a'; // 1 word
        String k04 = "hello world!"; // more words
        System.out.println(" boolean: "+a04+"\n byte: "+b04+"\n short: "+c04+"\n int: "
                +d04+ "\n long: "+f04+"\n float: "+g04+"\n double: "+h04+"\n char: "
                +j04+ "\n String: "+k04);
    }


    // int + text print
    public static void startHello05() {

        String x05 = "Water X";
        String y05 = "Color Y";
        String temp;

        temp = x05;
        x05 = y05;
        y05 = temp;

        System.out.println("X: "+x05);
        System.out.println("Y: "+y05);

    }


}
