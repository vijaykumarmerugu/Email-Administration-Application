import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity=500;
    private int passwordLenghth = 8;
    private String alternativeEmail;
    private String companySuffix = "company.com";
    String Email;

    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        //System.out.println("Email Created:"+firstName+" "+lastName);
        this.department = setDepartment();
        //System.out.println("Department:"+this.department);
        this.password = randomPassword(passwordLenghth);
        System.out.println("Temporary Password:"+this.password);

        Email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        //System.out.println("Your Email:"+Email);

    }

    private String setDepartment(){
        System.out.println("New Worker: "+ firstName+"\nEnter the Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Codes:");
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();

        if(depChoice == 1)
        { return "Sales"; }
        else if (depChoice == 2)
        { return "Development"; }
        else if (depChoice == 3) {
            return "Accounting"; }
        else {
            return "None";
        }
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailBoxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public void setAlternativeEmail(String altEmail){
        this.alternativeEmail = altEmail;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternativeEmail(){
        return alternativeEmail;
    }

    public String getPassword(){
        return password;
    }

    public String showInfo(){
        return "Display Name:"+firstName+" "+lastName+
                "\nCompany Email:"+Email+
                "\nMailBox Capacity:"+mailboxCapacity+" MB";

    }

}
