package com.bptn.course.week3.day3.codingChallenge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        // Start by looking in the University and Student classes. Implement the methods. 

        // Create a bunch of student objects 
            // (Make sure one student has the following studentId: 123)
            // (Make sure one other student has the following username: testUsername1)
//    	Date tomDOB = new SimpleDateFormat("yyyy-MM-dd").parse("1992-08-19");
    	
//    	Student stud1 = new Student(123,
//                "Tom123",
//                "Wedne$d@y",
//                "Tom",
//                "Welling",
//                "tomwelling@gmail.com",
//                "647-451-6789",
//                "23 Belver Dr",
//                "Male",
//                new SimpleDateFormat("yyyy-MM-dd").parse("1992-08-19"),
//                new SimpleDateFormat("yyyy-MM-dd").parse("2024-09-05"),
//                900541234,
//                "Liberal Arts");

    	
//    	Student stud2 = new Student(124,
//                "testUsername1",
//                "P@nD@$",
//                "Melanie",
//                "Wittle",
//                "melwit@gmail.com",
//                "647-431-8925",
//                "45 Drummond St",
//                "Female",
//                new SimpleDateFormat("yyyy-MM-dd").parse("1992-06-24"),
//                new SimpleDateFormat("yyyy-MM-dd").parse("2024-09-05"),
//                900941999,
//                "Engineering");
    	
//    	
//    	Student stud3 = new Student(342,
//                "LoveMeTender",
//                "Dippin4Nuggets",
//                "Bradley",
//                "Fiddle",
//                "fiddlemebrad@gmail.com",
//                "289-416-0225",
//                "1234 Easling St",
//                "Male",
//                new SimpleDateFormat("yyyy-MM-dd").parse("1990-03-01"),
//                new SimpleDateFormat("yyyy-MM-dd").parse("2024-09-05"),
//                900953729,
//                "Accounting");
    	
//    	Student stud4 = new Student(785,
//                "OldMcDonny",
//                "F@rmLyfe4ever",
//                "Dawna",
//                "Brown",
//                "brown.donald@gmail.com",
//                "289-418-2751",
//                "56 Cowell Av",
//                "Female",
//                new SimpleDateFormat("yyyy-MM-dd").parse("1989-01-31"),
//                new SimpleDateFormat("yyyy-MM-dd").parse("2024-09-05"),
//                900741000,
//                "Agriculture");
    	
        // Create instance of university called "university" and populate it with the students.
    	University university = new University();
    	
    	university.addStudent(new Student(123,
						                "Tom123",
						                "Wedne$d@y",
						                "Tom",
						                "Welling",
						                "tomwelling@gmail.com",
						                "647-451-6789",
						                "23 Belver Dr",
						                "Male",
						                new SimpleDateFormat("yyyy-MM-dd").parse("1992-08-19"),
						                new SimpleDateFormat("yyyy-MM-dd").parse("2024-09-05"),
						                900541234,
						                "Liberal Arts"));
    	
    	
    	university.addStudent(new Student(124,
						                "testUsername1",
						                "P@nD@$",
						                "Melanie",
						                "Wittle",
						                "melwit@gmail.com",
						                "647-431-8925",
						                "45 Drummond St",
						                "Female",
						                new SimpleDateFormat("yyyy-MM-dd").parse("1992-06-24"),
						                new SimpleDateFormat("yyyy-MM-dd").parse("2024-09-05"),
						                900941999,
						                "Engineering"));
    	
    	
    	university.addStudent(new Student(342,
						                "LoveMeTender",
						                "Dippin4Nuggets",
						                "Bradley",
						                "Fiddle",
						                "fiddlemebrad@gmail.com",
						                "289-416-0225",
						                "1234 Easling St",
						                "Male",
						                new SimpleDateFormat("yyyy-MM-dd").parse("1990-03-01"),
						                new SimpleDateFormat("yyyy-MM-dd").parse("2024-09-05"),
						                900953729,
						                "Accounting"));
    	
    	university.addStudent(new Student(785,
						                "OldMcDonny",
						                "F@rmLyfe4ever",
						                "Dawna",
						                "Brown",
						                "brown.donald@gmail.com",
						                "289-418-2751",
						                "56 Cowell Av",
						                "Female",
						                new SimpleDateFormat("yyyy-MM-dd").parse("1989-01-31"),
						                new SimpleDateFormat("yyyy-MM-dd").parse("2024-09-05"),
						                900741000,
						                "Agriculture"));
        System.out.println("\nUniversity ------ \n" + university.students);
        System.out.println("\nGetting student------\n" + university.getStudent(123));
        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
        System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

        System.out.println("\nUniversity ------ \n" + university.students);

    }
}
