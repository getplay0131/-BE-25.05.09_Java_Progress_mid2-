package Exam_241212_객체지향_학원관리프로그램.domain.main;

import Exam_241212_객체지향_학원관리프로그램.domain.*;
import Exam_241212_객체지향_학원관리프로그램.domain.manager.Academy;

public class Student {
// field area
    private String studentId;
    private String studentName;
    private int studentAge;
    private String  studentPhoneNumber;
    private Course [] currentCourseList;
    private int totalPrice;
    private static int studentIdCounter; // 수강생 아이디 자동 생성을 위한 카운터
//     =================
    
//    constructor area
public Student(String studentId, String studentName, int studentAge, String studentPhoneNumber, int totalPrice){
    this(studentId,
            studentName,
            studentAge,
            studentPhoneNumber,
            new Course[5],
            totalPrice);
}

    public Student(String studentId, String studentName, int studentAge, String studentPhoneNumber,
                   Course[] currentCourseList, int totalPrice){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentPhoneNumber = studentPhoneNumber;
        this.currentCourseList = currentCourseList;
        this.totalPrice = totalPrice;
    }
//    ================
    
    
//    method area
//    getter 메서드 사용하기
    public String getStudentId(){
        return this.studentId;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public int getStudentAge(){
        return this.studentAge;
    }

    public String getStudentPhoneNumber(){
        return this.studentPhoneNumber;
    }

    public Course [] getCurrentCourseList(){
        return currentCourseList;
    }
// =================24.12.17 단순한 총 가격 가져오는 메서드 생성
    public int getTotalPrice(){
    return this.totalPrice;
    }

//setter 메서드

    public static String setStudentId() {
        String studentId = "Student" + studentIdCounter;
        studentIdCounter++;
        return studentId;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public void setStudentAge(int studentAge){
    this.studentAge = studentAge;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber){
    this.studentPhoneNumber = studentPhoneNumber;
    }

// ================= 24.12.17
public boolean addCourse(Course course){
//값 검증
    if (course == null) {
        System.out.println("입력 값을 확인해 주세요!");
        return false;
    }

    for (int i = 0; i < getCurrentCourseList().length; i++) {
        if (currentCourseList[i] == null) {
            currentCourseList[i] = course;
            //            수강료 업데이트
            totalPrice += course.getCoursePrice();
            return true;
        }
    }
    return false;
}
// ================= 24.12.17
public boolean removeCourse(Course course){
    if (course == null) {
        return false;
    }

    for (int i = 0; i < currentCourseList.length; i++) {
//        널 체크 해야함
        if (currentCourseList[i] != null && currentCourseList[i].getCourseId().equals(course.getCourseId())) {
            totalPrice -= course.getCoursePrice();
            currentCourseList[i] = null;
        }
    for (int j = i; j < currentCourseList.length - 1; j++) {
        currentCourseList[j] = currentCourseList[j+1];
    }
    currentCourseList[currentCourseList.length-1] = null;
    return true;
    }
    return false;
}



// =================24.12.17 메소드명 수정

    public int calculateTotalPrice(){
    int totalCoursePrice = 0;
    for (Course current : currentCourseList) {
            if (current != null) {
                // 누적되는 문제 발생
    totalCoursePrice += current.getCoursePrice();
            }
        }
        return totalCoursePrice;
    }
//    ==============================

//    학생 정보 출력
//    학생의 이름을 입력 받고 해당 학생의 이름을 가진 정보를 출력한다.
public void printStudentInfo(){
    boolean hasAnyCourse = false;
    System.out.println("===== 학생 정보 =====");
    System.out.println("학생 ID : " + getStudentId());
    System.out.println("학생 이름 : " + getStudentName());
    System.out.println("학생 나이 : " + getStudentAge());
    System.out.println("학생 연락처 : " + getStudentPhoneNumber());
    System.out.println("----- 수강 정보 -----");
    for (Course course : currentCourseList) {
    if (course != null) {
        System.out.println("현재 수강중인 강좌 : " + getCurrentCourseList());
        hasAnyCourse = true;
    }
    }
        if (!hasAnyCourse) {
            System.out.println("현재 수강중인 강좌가 없습니다.");
        }
    System.out.println("----------");
    System.out.println("총 수강료 : " + getTotalPrice() + "원");
    System.out.println("=====================");
}

//    ==============
}