import java.util.Arrays;

// nama class harus sesuai nama file yang dibuat
public class ArrayArrayListVector {

    // method main akan di panggil saat run
    public static void main(String[] args) {
        // array ialah sekumpulan tipe data primitve yang sejenis

        System.out.println("<<<< Array >>>>");
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
    }
}
