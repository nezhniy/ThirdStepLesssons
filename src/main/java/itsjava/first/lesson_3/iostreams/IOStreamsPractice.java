package itsjava.first.lesson_3.iostreams;

import itsjava.first.lesson_1.linkedlist.MyLinkedList;

import java.io.*;
import java.util.LinkedList;

public class IOStreamsPractice {
    public static void main(String[] args) {
//        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input = console.readLine();
//            System.out.println("Ur input = " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                console.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //try with resources

//        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in))){
//            String input = console.readLine();
//            System.out.println("Ur input = " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        File file = new File("src/main/resources/file.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.println("Строка1");
            printWriter.println("Строка2");
            printWriter.println("Строка3");
        } catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println("reader.readLine() = " + input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //HW
        LinkedList<String> list13 = new LinkedList<>();
        LinkedList<String> list46 = new LinkedList<>();

        File file1 = new File("src/main/resources/file1.txt");

        try (PrintWriter printWriter = new PrintWriter(file1)) {
            printWriter.println("Строка4");
            printWriter.println("Строка5");
            printWriter.println("Строка6");
        } catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String input;
            while ((input = reader.readLine()) != null) {
                list13.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("list13 = " + list13);

        try (BufferedReader reader = new BufferedReader(new FileReader(file1))){
            String input;
            while ((input = reader.readLine()) != null) {
                list46.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("list46 = " + list46);


        try (PrintWriter printWriter = new PrintWriter(file1)) {
            for (String str: list13) {
                printWriter.write(str + "\n");
            }
        } catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (String str: list46) {
                printWriter.write(str + "\n");
            }
        } catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        }
    }
}
