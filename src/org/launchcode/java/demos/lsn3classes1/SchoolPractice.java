package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student student = new Student();
        student.setName("Ruth");
        student.setStudentId(515);
        student.setNumberOfCredits(1);
        student.setGpa(4.0);
    }

    public class Course {
        private String topic;
        private String teacher;
        private ArrayList<Student> enrolledStudents;

        public Course(String topic, String teacher) {
            this.topic = topic;
            this.teacher = teacher;
            this.enrolledStudents = new ArrayList<>();
        }
        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public String getTeacher() {
            return teacher;
        }

        public void setTeacher(String teacher) {
            this.teacher = teacher;
        }

        public ArrayList<Student> getEnrolledStudents() {
            return enrolledStudents;
        }

        public void addStudent(Student student) {
            enrolledStudents.add(student);
        }
    }

    public class Teacher {

        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.subject = subject;
            this.yearsTeaching = yearsTeaching;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public int getYearsTeaching() {
            return yearsTeaching;
        }

        public void setYearsTeaching(int yearsTeaching) {
            this.yearsTeaching = yearsTeaching;
        }
    }

}

