import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

// nama class harus sesuai nama file yang dibuat
public class ArrayArrayListVector {

    // method main akan di panggil saat run
    public static void main(String[] args) {
        // array ialah sekumpulan tipe data primitve yang sejenis

        System.out.println("<<<< Array >>>>"); // bersifat statis
        System.out.println("\nArray integer");
        int [] arrayInteger = new int[10]; // deklarasi array
        arrayInteger[4] = 15; // assignment array
        System.out.println(arrayInteger[4]);

        for (int i = 0; i < arrayInteger.length; i++){
            arrayInteger[i] = i * 5;
        //  System.out.println(arrayInteger[i]); // bisa langsung diprint
        }

        // atau
        for (int i = 0; i < arrayInteger.length; i++){
            System.out.println(arrayInteger[i]);
        }

        // mengubah array menjadi string
        int [] nilaiArray = {1,3,5,6,8};
        System.out.println(Arrays.toString(nilaiArray));

        System.out.println("\nArray double");
        double [] arrayDouble = {5.7 , 7.3, 6.5};

        double total = 0;

        for (int i = 0; i < arrayDouble.length; i++){
            total += arrayDouble[i];
        }
        System.out.println(total);

        System.out.println("\nArray String");
        String [] arrayString = new String[5];
        arrayString[0] = "Negara";
        arrayString[1] = "Kesatuan";
        arrayString[2] = "Republik";
        arrayString[3] = "Indonesia";

        for (int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }

        // mengubah array menjadi string
        System.out.println(Arrays.toString(arrayString));

        System.out.println("\nDuplicate Array");
        int[] arraySource = {1,3,5,7};

        int[] arrayTarget1 = new int[4];
        int[] arrayTarget2 = new int[4];
        int[] arrayTarget3 = new int[4];

        // 1. dengan looping
        System.out.println("Duplicate with Looping");
        for (int i = 0; i < arraySource.length; i++){
            arrayTarget1[i] = arraySource[i];
        }
        // print array
        System.out.println("Array Target 1 : ");
        for (int i = 0; i < arrayTarget1.length; i++){
            System.out.println(arrayTarget1[i]);
        }

        // 2. dengan arraycopy
        System.out.println("Duplicate with Array Copy");
        System.arraycopy(arraySource, 0, arrayTarget2, 0, 4);
        // print
        System.out.println("Array Target 2 : ");
        for (int i = 0; i < arrayTarget2.length; i++){
            System.out.println(arrayTarget2[i]);
        }

        // 3. dengan clone
        System.out.println("Duplicate with Clone");
        arrayTarget3 = arraySource.clone();
        System.out.println("Array Target 3 : ");
        for (int i = 0; i < arrayTarget3.length; i++){
            System.out.println(arrayTarget3[i]);
        }

        System.out.println("\n<<< Array 2 Dimensi >>>");
        int[][] array2D = new int[3][3];

        int fillArray = 0;

        for (int i = 0; i < array2D.length; i++){
            for (int j = 0; j < array2D[i].length; j++){
                System.out.println(i + " " + j);
                array2D[i][j] = fillArray++;

                fillArray++;
            }
        }

        for (int i = 0; i < array2D.length; i++){
            for (int j = 0; j < array2D[i].length; j++){
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\n<<< ArrayList >>>"); // bersifat dinamis
        // penambahan jumlah size data sebanyak 50 % // asynchronize berhubungan dengan threading
        ArrayList<String> wordList = new ArrayList<String>();
        System.out.println(".add");// menambah data
        wordList.add("Algorithm& Programming");
        wordList.add("OOP");
        wordList.add("Calculus");
        for (int i = 0; i < wordList.size(); i++){
            System.out.println(wordList.get(i));
        }

        System.out.println("\n.set"); // mengubah data
        wordList.set(1,"Data Structure"); // parameter index, data
        for (int i = 0; i < wordList.size(); i++){
            System.out.println(wordList.get(i));
        }

        System.out.println("\n.remove"); // menghapus data
        wordList.remove(1); // parameter index
        for (int i = 0; i < wordList.size(); i++){
            System.out.println(wordList.get(i));
        }

        System.out.println("\n<<< Vector >>>" ); // synchronize berhubungan dengan threading
        // penambahan datanya sebanyak 2 kali jumlah size aslinya
        Vector<Integer> numberList = new Vector<>();
        System.out.println(".add");// menambah data
        numberList.add(89);
        numberList.add(45);
        numberList.add(27);
        for (int i = 0; i < numberList.size(); i++){
            System.out.println(numberList.get(i));
        }

        System.out.println("\n.set"); // mengubah data
        numberList.set(2, 77); // parameter index, data
        for (int i = 0; i < numberList.size(); i++){
            System.out.println(numberList.get(i));
        }

        System.out.println("\n.remove"); // menghapus data
        numberList.remove(1); // parameter index
        for (int i = 0; i < numberList.size(); i++){
            System.out.println(numberList.get(i));
        }

    }
}
