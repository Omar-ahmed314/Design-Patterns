package com.designPatterns.BehavioralPatterns.Memento;

public class Client {
    public static void main(String[] args) {
        // some code related to the memento pattern will be written here
        // main code

        // create a file util
        FileWriterUtil file = new FileWriterUtil("names.txt");

        // create file taker util
        FileCareTaker fileCareTaker = new FileCareTaker();

        // write something to the file
        file.write("Omar");

        System.out.println("Testing file.........");
        System.out.println("File content: " + file);

        // save the file
        fileCareTaker.saveFile(file);

        // change the content of the file
        file.write("Mohamed");

        // print the content of the file
        System.out.println("Testing file.........");
        System.out.println("File content: " + file);

        // undoing the file content
        System.out.println("Undoing the file content........");
        fileCareTaker.undoFile(file);
        System.out.println("File content: " + file);
    }
}
