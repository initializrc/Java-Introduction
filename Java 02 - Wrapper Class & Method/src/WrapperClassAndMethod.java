// class name must same with file.java

public class WrapperClassAndMethod {

    // method that will be called when run
    public static void main(String[] args) {
        // wrapper class menggunakan reference data type
        System.out.println("<Wrapper Class>");
        Integer numberInteger = 5;
        Float numberFloat = (float) 10;
        Character alphabet = 'A';
        Boolean bool = true;

        System.out.println(numberInteger);
        System.out.println(numberFloat);
        System.out.println(alphabet);
        System.out.println(bool + "\n");

        // wrapper class is object type data
        // bool is obect, object can be set as null
        System.out.println("<Boolean>");
        bool = null;
        System.out.println(bool + "\n");


        // method
        System.out.println("<Integer>");
        numberInteger = Integer.valueOf("170");
        System.out.println(numberInteger);

        numberInteger = new Integer("200");
        System.out.println(numberInteger);

        System.out.println(numberInteger.MIN_VALUE);
        System.out.println(numberInteger.MAX_VALUE);

        System.out.println("\n<Float>");
        System.out.println(numberFloat.MIN_VALUE);
        System.out.println(numberFloat.MAX_VALUE);

        // String
        System.out.println("\n<String>");
        String word1 = "Course_Net";
        String word2 = new String("Indonesia");

        System.out.println(word1 + " " + word2);

        System.out.println("\n3 Way Validation Word");
        // 1 way
        if (word1 == word2){
            System.out.println("word1 same as word2");
        } else {
            System.out.println("word1 not same with word2");
        }

        // 2 way
        if (word1.equals(word2) == true){
            System.out.println("word1 same as word2");
        } else {
            System.out.println("word1 not same with word2");
        }

        // 3 way
        if (word1.compareTo(word2) == 0){
            System.out.println("word1 same as word2");
        } else {
            System.out.println("word1 not same with word2");
        }
    }
}
