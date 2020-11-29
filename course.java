import java.util.*;
class course
{
    Scanner sc = new Scanner(System.in);
    private String name , code;
    private Doctor Doc;
    private Vector<String> TAs;
    private Vector<student> students;
    private int studentNums;
    private int TANums;
    course(Doctor d)
    {
	TANums = 0;
	studentNums = 0;
        System.out.println("Please Enter the course name");
        this.name = sc.nextLine();
        System.out.println("Please Enter the course code");
        this.code = sc.nextLine();
        this.Doc = d;
    }
    course()
    {
	    TANums = 0;
	    studentNums = 0;
	    System.out.println("What is the course name?");
	    this.name = sc.nextLine();
	    System.out.println("what is the course code?");
	    this.code = sc.nextLine();
	    this.Doc = null;
    }
    public boolean addDoctor(Doctor d)
    {
	    if(this.Doc == null)
	    {
		    System.out.println(d.getName() + "is now the Doctor of the course" + this.name);
		    this.Doc = d;
		    return true;
	    }
	    else
	    {
		    System.out.println("The course already has a doctor \nChange the doctor  (y or n)");
		    char x;
		    x = sc.nextLine().charAt(0);
		    if(x == 'y' || x == 'Y')
		    {
			   this.changeDoctor(d);
			   return true;
		    }
		    else
		    {
			    return false;
		    }
	    }
    }
    public void changeDoctor(Doctor d){this.Doc = d;}
    public boolean addTA(String s)
    {
	    if(s == "")
	    {
		    System.out.println("TA's name cannot be empty");
		    return false;
	    }
	    else
	    {
		    this.TAs.add(s);
		    this.TANums += 1;
		    return true;
	    }
    }
    public void addStudents(student arr[])
    {
	    for(var val : arr)
	    {
		    this.studentNums += 1;
		    this.students.add(val);
	    }
    } 
    public void setCode(String s) {
	    this.code = s;
    }
    public void detName(String s){this.name = s;}
    public String getName() {return this.name;}
    public String getCode() {return this.code;}
    public void print()
    {
	    System.out.println("the course name : " + this.name);
	    System.out.println("the course Doctor : " + this.Doc);
	    System.out.println("the course TAs : ");
	    int i = 1;
	    for (var val : TAs)
	    {
		    System.out.println( i + "- "+ val);
	    }
	    i = 1;
	    System.out.println("the course students : ");
	    for (var val : students){System.out.println( i + "- " + val); }
}
}