package com.designPatterns.StructuralPatterns.CompositePattern;

public class CompositeClient {
    public static void main(String[] args) {
        // composite pattern client code
        // main code

        // math department professors
        FacultyMember prof1 = new Professor("Mohamed Ezz", 1, "Associative");
        FacultyMember prof2 = new Professor("Samir othman", 2, "Full");

        // computer science department professors
        FacultyMember prof3 = new Professor("Ahmed shawki", 3, "Associative");
        FacultyMember prof4 = new Professor("Alaa Mohab", 4, "Adjunct");
        FacultyMember prof5 = new Professor("Abd elrahman mohamed", 5, "Full");

        // math department chair
        Supervisor mathDepChair = new Supervisor("Micheal", 6, "Math");
        mathDepChair.addMember(prof1);
        mathDepChair.addMember(prof2);

        // CS department chair
        Supervisor CSDepChair = new Supervisor("Mohamed", 7, "Computer Science");
        CSDepChair.addMember(prof3);
        CSDepChair.addMember(prof4);
        CSDepChair.addMember(prof5);

        // math and cs departments dean
        Supervisor dean = new Supervisor("Said", 8, "Head master");
        dean.addMember(mathDepChair);
        dean.addMember(CSDepChair);

        // print their details
        dean.getDetails();

    }
}
