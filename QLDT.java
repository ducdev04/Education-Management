import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Lớp cơ sở Person
abstract class Person {
    // Thuộc tính của lớp Person
    protected String id;
    protected String name;
    protected String phoneNumber;
    protected String email;
    protected String gender;
    protected String address;

    // Constructor để khởi tạo đối tượng Person với dữ liệu ban đầu
    Person(String id, String name, String phoneNumber, String email, String gender, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.address = address;
    }

    // Phương thức trừu tượng hiển thị thông tin
    public abstract void displayInfo();

    // Getter và Setter cho các thuộc tính
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

// Lớp Student kế thừa từ lớp Person
class Student extends Person {
    // Thuộc tính riêng của lớp Student
    private String major;
    private int year;
    private double gpa;
    private List<Enrollment> enrollments;

    // Constructor để khởi tạo đối tượng Student với dữ liệu ban đầu
    public Student(String id, String name, String phoneNumber, String email, String gender, String address, String major, int year, double gpa, List<Enrollment> enrollments) {
        super(id, name, phoneNumber, email, gender, address);
        this.major = major;
        this.year = year;
        this.gpa = gpa;
        this.enrollments = enrollments;
    }

    // Triển khai phương thức hiển thị thông tin cho Student
    @Override
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("Gender: " + getGender());
        System.out.println("Address: " + getAddress());
        System.out.println("Major: " + major);
        System.out.println("Year: " + year);
        System.out.println("GPA: " + gpa);
    }

    // Phương thức tính điểm trung bình cho Student
    public double calculateAverageGrade() {
        if (enrollments.isEmpty()) {
            return 0.0;
        }
        double totalGrade = 0.0;
        for (int i = 0; i < enrollments.size(); i++) {
            totalGrade += enrollments.get(i).getGrade();
        }
        return totalGrade / enrollments.size();
    }

    // Getter và Setter cho các thuộc tính riêng
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }
}

// Lớp Faculty kế thừa từ lớp Person
class Faculty extends Person {
    // Thuộc tính riêng của lớp Faculty
    private String title;
    private String office;
    private String department;
    private List<Course> coursesTaught;

    // Constructor để khởi tạo đối tượng Faculty với dữ liệu ban đầu
    public Faculty(String id, String name, String phoneNumber, String email, String gender, String address, String title, String office, String department, List<Course> coursesTaught) {
        super(id, name, phoneNumber, email, gender, address);
        this.title = title;
        this.office = office;
        this.department = department;
        this.coursesTaught = coursesTaught;
    }

    // Triển khai phương thức hiển thị thông tin cho Faculty
    @Override
    public void displayInfo() {
        System.out.println("Faculty Information:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("Gender: " + getGender());
        System.out.println("Address: " + getAddress());
        System.out.println("Title: " + title);
        System.out.println("Office: " + office);
        System.out.println("Department: " + department);
    }

    // Getter và Setter cho các thuộc tính riêng
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(List<Course> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}

// Lớp Course
class Course {
    // Thuộc tính của lớp Course
    private String courseId;
    private String courseName;
    private int creditHours;
    private Faculty instructor;

    // Constructor để khởi tạo đối tượng Course với dữ liệu ban đầu
    public Course(String courseId, String courseName, int creditHours, Faculty instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.instructor = instructor;
    }

    // Getter và Setter cho các thuộc tính
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public Faculty getInstructor() {
        return instructor;
    }

    public void setInstructor(Faculty instructor) {
        this.instructor = instructor;
    }
}

// Lớp Enrollment
class Enrollment {
    // Thuộc tính của lớp Enrollment
    private Student student;
    private Course course;
    private String enrollmentStatus;
    private double grade;

    // Constructor để khởi tạo đối tượng Enrollment với dữ liệu ban đầu
    public Enrollment(Student student, Course course, String enrollmentStatus, double grade) {
        this.student = student;
        this.course = course;
        this.enrollmentStatus = enrollmentStatus;
        this.grade = grade;
    }

    // Getter và Setter cho các thuộc tính
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getEnrollmentStatus() {
        return enrollmentStatus;
    }

    public void setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

class UniversityManagementSystem {
    // Lưu trữ danh sách sinh viên
    private List<Student> students;

    // Lưu trữ danh sách giảng viên
    private List<Faculty> faculties;

    // Lưu trữ danh sách các khóa học
    private List<Course> courses;

    // Quản lý đăng ký của sinh viên
    private Map<Student, List<Enrollment>> studentEnrollments;

    // Constructor
    public UniversityManagementSystem() {
        students = new ArrayList<>();
        faculties = new ArrayList<>();
        courses = new ArrayList<>();
        studentEnrollments = new HashMap<>();
    }

    // Thêm sinh viên vào danh sách sinh viên
    public void addStudent(Student student) {
        students.add(student);
    }

    // Thêm giảng viên vào danh sách giảng viên
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Thêm khóa học vào danh sách khóa học
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Đăng ký sinh viên vào một khóa học
    public void enrollStudent(Student student, Course course, String enrollmentStatus, double grade) {
        Enrollment enrollment = new Enrollment(student, course, enrollmentStatus, grade);
        List<Enrollment> studentEnrollmentList = studentEnrollments.getOrDefault(student, new ArrayList<>());
        studentEnrollmentList.add(enrollment);
        studentEnrollments.put(student, studentEnrollmentList);
        student.getEnrollments().add(enrollment);
    }

    // Xem đăng ký của một sinh viên
    public List<Enrollment> getStudentEnrollments(Student student) {
        return studentEnrollments.getOrDefault(student, new ArrayList<>());
    }

    // Các phương thức khác để quản lý dữ liệu trong hệ thống đại học
}

public class QLDT {
    public static void main(String[] args) {
        try {
            // Khởi tạo hệ thống quản lý đại học
            UniversityManagementSystem universitySystem = new UniversityManagementSystem();

            // Thêm sinh viên
            Student student1 = new Student("1", "Alice", "123456789", "alice@example.com", "Female", "123 Main St", "Computer Science", 2, 3.5, new ArrayList<>());
            Student student2 = new Student("2", "Bob", "987654321", "bob@example.com", "Male", "456 Oak St", "Electrical Engineering", 1, 3.8, new ArrayList<>());
            Student student3 = new Student("3", "Carol", "555555555", "carol@example.com", "Female", "789 Pine St", "Mathematics", 3, 3.9, new ArrayList<>());

            universitySystem.addStudent(student1);
            universitySystem.addStudent(student2);
            universitySystem.addStudent(student3);

            // Thêm giảng viên
            Faculty faculty1 = new Faculty("101", "Dr. Bob", "987654321", "bob@example.com", "Male", "456 Elm St", "Professor", "A101", "Computer Science", new ArrayList<>());
            Faculty faculty2 = new Faculty("102", "Dr. Alice", "123123123", "alice.prof@example.com", "Female", "789 Maple St", "Associate Professor", "B202", "Mathematics", new ArrayList<>());
            Faculty faculty3 = new Faculty("103", "Dr. Charlie", "321321321", "charlie@example.com", "Male", "101 Walnut St", "Assistant Professor", "C303", "Physics", new ArrayList<>());

            universitySystem.addFaculty(faculty1);
            universitySystem.addFaculty(faculty2);
            universitySystem.addFaculty(faculty3);

            // Thêm khóa học
            Course course1 = new Course("CSC101", "Introduction to Computer Science", 3, faculty1);
            Course course2 = new Course("MAT201", "Advanced Calculus", 4, faculty2);
            Course course3 = new Course("PHY301", "Quantum Mechanics", 3, faculty3);

            universitySystem.addCourse(course1);
            universitySystem.addCourse(course2);
            universitySystem.addCourse(course3);

            // Đăng ký sinh viên vào khóa học
            universitySystem.enrollStudent(student1, course1, "Enrolled", 85);
            universitySystem.enrollStudent(student2, course2, "Enrolled", 90);
            universitySystem.enrollStudent(student3, course3, "Enrolled", 95);
            universitySystem.enrollStudent(student1, course2, "Enrolled", 88);

            // Hiển thị điểm trung bình của sinh viên
            System.out.println("Average Grade for " + student1.getName() + ": " + student1.calculateAverageGrade());
            System.out.println("Average Grade for " + student2.getName() + ": " + student2.calculateAverageGrade());
            System.out.println("Average Grade for " + student3.getName() + ": " + student3.calculateAverageGrade());

        } catch (Exception e) {
            e.printStackTrace();
            // Xử lý ngoại lệ ở đây nếu cần
        }
    }
}

