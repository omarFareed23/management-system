import java.util.*;
class student
{
    Scanner sc = new Scanner(System.in);
    private int id;
    private String name , username , password;
    private Vector<course> courses;
    student(){
        System.out.println("what is your name?");
        while(!sc.hasNext("[a-zA-z]+")){
            System.out.println("your name must include only English characters");
        }
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
        System.out.println("please Enter your id");
        this.id = sc.nextInt();
        System.out.println("you have been added , congratulations!");
    }
    public void setName(String s){this.name = s;}
    public void setUserName(String s){this.username = s;}
    public void setID(int x){this.id= x;}
    public void setPassword(String s){this.password = s;}
    public String getName(){return this.name;}
    public String getUserName(){return this.username;}
    public String getPassword(){return this.password;}
    public int getID(){return this.id;}
    public void addNewCourse(course c){
        for(var val : courses)
	{
		if(val == c) return;
	}
	courses.add(c);
    }
}