import java.util.*;
class management
{
    Scanner sc = new Scanner(System.in);
    public static Vector<course> courseObjects;
    public static Vector<student> studentObjects;
    public static Vector<Doctor> DoctorObjects;
    public static void main(String[] args) {
	    System.out.println("Doctor informations");
	    Doctor doc = new Doctor();
	   // Scanner sc = new Scan
	   course math = new course();
	   math.addDoctor(doc);
	   student[] arr = new student[4];
	   math.addStudents(arr);
	   math.print();
    }
}
