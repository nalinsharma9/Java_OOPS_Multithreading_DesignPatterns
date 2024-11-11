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


import java.io.*;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        File file = new File("OOPS/FileHandling/note.txt");

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


//        //try-with-resource syntax which automatically closes resource in the try block
//        try (FileReader reader = new FileReader(file.getAbsolutePath())) {
//            System.out.print("Enter some letters: ");
//            int letters = reader.read();
//            while (reader.ready()) {
//                System.out.println((char) letters);
//                letters = reader.read();
//            }
//            System.out.println();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }

        /*  BufferedReader is used to read from a character-input stream
            InputStreamReader converts byte Stream to character Stream
            Keyboard(Byte Stream) -> Character Stream -> BufferedReader is reading from character stream
            BufferedStream is more efficient than InputStreamReader that is why it is used for fast input/output in online competitive programs
        */
//        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
//            System.out.print("Enter some letters: ");
//            System.out.println("You typed: " + br.readLine());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try(BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));){
//            while(br.ready()){
//                System.out.println(br.readLine());
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        //Output
        OutputStream os = System.out;
//        os.write(😃); range is exceeded
        System.out.println();

        try(OutputStreamWriter osw = new OutputStreamWriter(System.out);){
            osw.write("Hello World");
            //ASCII values are converted to string
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr = "HelloWorld".toCharArray();
            osw.write(arr);
//            osw.write(😃);
        }catch(IOException E){
            System.out.println(E.getMessage());
        }
    }
}
