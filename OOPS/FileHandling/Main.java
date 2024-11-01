package OOPS.FileHandling;

/*
Steams are sequence of either byte data or unicode character data.

Streams are of two type:
1.ByteStream  -> InputStream,OutputStream (Used for reading and writing byte data)
2.CharacterStream -> Reader,Writer (Used for reading and writing character data)

InputStream(Abstract extended by) -> FileInputStream,ByteArrayInputStream,etc
OutputStream(Abstract extended by) -> FileOutputStream,ByteArrayOutputStream,etc
Reader(Abstract extended by) -> FileReader,CharArrayReader,etc
Writer(Abstract extended by) -> FileWriter,CharArrayWriter,etc

 /* AutoClosable interface holds  resources such as file , etc until it is closed.
 So any class implementing AutoClosable interface must override close() method.
 */


import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
          //try-with-resource syntax which automatically closes resource in the try block
//        try(InputStreamReader reader = new InputStreamReader(System.in)){
//            System.out.print("Enter some letters: ");
//            int letters = reader.read();
//            while(reader.ready()){
//                System.out.println((char) letters);
//                letters = reader.read();
//            }
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        //try-with-resource syntax which automatically closes resource in the try block
        try (FileReader reader = new FileReader("path.txt")) {
            System.out.print("Enter some letters: ");
            int letters = reader.read();
            while (reader.ready()) {
                System.out.println((char) letters);
                letters = reader.read();
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
