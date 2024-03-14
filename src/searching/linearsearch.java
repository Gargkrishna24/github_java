package searching;

import java.util.Arrays;

public class linearsearch {

    static class Student {
        int rollNumber;
        String name;

        public Student(int rollNumber, String name) {
            this.rollNumber = rollNumber;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + '}';
        }
    }

    static class Searcher {
        public static void main(String[] args) {
            Student student = new Student(2, "krishna garg");
            Student student1 = new Student(6, "nikhil gupta");
            Student student2 = new Student(8, "mukund bansal");
            Student student3 =  new Student(9, "ayushi bansal");
            Student student4 = new Student(5,"rahul");
            Student[] studentArray = new Student[]{student1,student2,student3,student4,};
            System.out.println("Arrays.toString(student2) = " + Arrays.toString(studentArray)); //Arrays.toString(student2).soutv
            Searcher searcher = new Searcher();
            int search = searcher.linearSearcher(studentArray, student1);
            System.out.println("search = " + search);
        }

        public int linearSearcher(Student[] students, Student key) {
            for (int index = 0; index < students.length; index++) {
                if (students[index].equals(key)) {
                    return index;
                }
            }
            return -1;
        }
    }

}

