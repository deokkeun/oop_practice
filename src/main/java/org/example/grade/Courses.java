package org.example.grade;

import java.util.List;

public class Courses {
    // 일급 컬렉션
    // 리스트 형태로 된 course 정보만 인스턴스 변수로 가지는 클래스
    // 이 정보를 가지고 처리할 수 있는 책임들이 해당 일급 컬렉션 밑으로 모두 이동

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
//        double multipliedCreditAndCourseGrade = 0;
//        for (Course course : courses) {
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }
//        return multipliedCreditAndCourseGrade;
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
