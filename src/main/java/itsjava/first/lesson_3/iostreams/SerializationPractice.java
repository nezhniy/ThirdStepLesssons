package itsjava.first.lesson_3.iostreams;

import itsjava.first.lesson_2.maps.Man;

import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) {
//        Man man = new Man("Vitaliy");
//
//        try(ObjectOutputStream outputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/man.out"))) {
//            outputStream.writeObject(man);
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//        try(ObjectInputStream inputStreamStream = new ObjectInputStream(
//                new FileInputStream("src/main/resources/man.out"))) {
//            Object obj = inputStreamStream.readObject();
//            Man man = (Man) obj;
//            System.out.println(man);
//        } catch(IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        User user = new User("User", "1234");
//
//        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/user.out"))) {
//            objectOutputStream.writeObject(user);
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
        try(ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("src/main/resources/user.out"))) {
            Object obj = objectInputStream.readObject();
            User user = (User) obj;
            System.out.println("user = " + user);
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
