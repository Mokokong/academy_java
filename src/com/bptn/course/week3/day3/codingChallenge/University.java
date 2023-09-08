package com.bptn.course.week3.day3.codingChallenge;

import java.util.*;
import java.util.stream.Collectors;

class University {

    // property - get inspired by the UML diagram
	
	public ArrayList<Student> students;
	
	public University() {
		
		students = new ArrayList<Student>();
	}

    public void addStudent(Student s) {
        // add a student to the "university" arraylist
    	
    	students.add(s);
    }

    public Student getStudent(long studentId) {
      // get the first student in the university that has the studentId. (ideally, this would be unique, so you can stop searching after finding the fist match)
   
		for (int i = 0; i < students.size(); i++) {

			if (students.get(i).getStudentId() == studentId) {

				return students.get(i);

			}

		}
		return null;
    
    
    }

	public List<Student> searchStudent(String userNamePrefix) {

		// return all students that have usernames beginning with the prefix
		List<Student> foundStudents = new ArrayList<>();

		for (Student s : students) {

			if (s.getUserName().startsWith(userNamePrefix)) {

				foundStudents.add(s);

			}

		}

		return foundStudents;
	}

	public boolean deleteStudent(long studentId) {
		// return if a successful deletion happened

		Iterator<Student> it = students.iterator();
		while (it.hasNext()) {

			long current = it.next().getStudentId();
			if (current == studentId) {

				it.remove();
				return true;

			}
		}
		// not found
		return false;
	}

}
