// class name must same with file.java

import java.util.Scanner;

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
        String word1 = "Negara";
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

        // length
        System.out.println("\nReturn String Length");
        System.out.println(word1.length());

        // charAt
        System.out.println("\nGet Particular Char Index");
        System.out.println(word1.charAt(2)); // u

        // concat
        System.out.println("\nConcatenate String");
        System.out.println(word1.concat(word2));

        // substring
        System.out.println("\nGet Particular Range Index");
        System.out.println(word1.substring(2, 5)); // menampilkan index array dari 2 sampai 5

        // toLowerCase
        System.out.println("\nConvert String To Lower Case");
        System.out.println(word1.toLowerCase());

        // toUpperCase
        System.out.println("\nConvert String To Upper Case");
        System.out.println(word1.toUpperCase());

        // trim
        System.out.println("\nDelete Right and Left Whitespace");
        word1 = "    Negara Indonesia    ";
        System.out.println(word1.trim()); // Negara Indonesia

        // replace
        System.out.println("\nReplacing Char With Other Char");
        String name = "Saitama";
        System.out.println(name.replace('a','o')); // Soitomo

        // replaceFirst
        System.out.println("\nReplacing First Found Character");
        name = "Saitama";
        System.out.println(name.replaceFirst("a","o")); // Soitama

        // split
        System.out.println("\nSplitting String As Particular Format");
        String splitString = "Negara#Kesatuan#Republik#Indonesia";
        String[] result = splitString.split("#");

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }

        System.out.println("\nRounded (Pembulatan)");
        // math method
        // ceil
        System.out.println("Upper Bound");
        System.out.println(Math.ceil(4.3)); //5 pembulatan ke atas

        // floor
        System.out.println("Lower Bound");
        System.out.println(Math.floor(4.7)); //4 pembulatan ke bawah

        // round
        System.out.println("Round According The Number");
        System.out.println(Math.round(4.7));

        // exception handling
        System.out.println("\nException Handling");
        Scanner scan =  new Scanner(System.in);

        int number;

        try {
            System.out.println("Input Number : ");
            number = scan.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error, input must be number");
        }

        System.out.println("\nFinish");
    }
}
