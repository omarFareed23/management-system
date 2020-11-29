import java.util.*;
class Doctor
{
    Scanner sc = new Scanner(System.in);
    private String name , username , password;
    Vector<course> courses;
    Doctor(){
        System.out.println("what is your name?");
        this.name = sc.nextLine();
        System.out.println("Enter your user name ");
        this.username = sc.nextLine();
        String s = "";
        System.out.println("Enter your password");
        s = sc.nextLine();
        while(s.length() < 8)
        {
            System.out.println("Your password must include at least 8 characters");
            s = sc.nextLine();
        }
        this.password = s;
        System.out.println("you have been added , congratulations!");
    }
    public String getName(){return this.name;}
    public String getUserName(){return this.username;}
    public String getPassword(){return this.password;}
    public void addNewCourse()
    {
        course temp = new course(this);
        this.courses.add(temp);
    }
    void print()
    {
	    System.out.println("Doctor Name : " + this.name);
	    System.out.println("Your Courses : ");
	    int i = 1;
	    for(var val : courses)
	    {
		    System.out.println( i + "- " + val.getName());
	    }
    }
}