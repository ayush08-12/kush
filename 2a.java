import java.io.*;
class Staff
{
private int StaffId;
private String Name;
private String Phone;
private long Salary;
public Staff(int staffId,String name,String phone,long salary)
{
StaffId = staffId;
Name = name;
Phone = phone;
Salary = salary;
}
public void Display()
{
System.out.print(StaffId+"\t"+Name+"\t"+Phone+"\t"+Salary);
}
}
class Teaching extends Staff
{
private String Domain;
private int Publications;
public Teaching(int staffId, String name, String phone, long salary, String domain,
int publications)
{
super(staffId, name, phone, salary);
Domain = domain;
Publications = publications;
}
public void Display()
{
super.Display();
System.out.print("\t"+Domain+"\t"+Publications+"\t\t-\t-");
}
}
class Technical extends Staff
{
private String Skills;
public Technical(int staffId, String name, String phone, long salary, String skills)
{
super(staffId, name, phone, salary);
Skills = skills;
}
public void Display()
{
super.Display();
System.out.print("\t-\t-\t"+Skills+"\t-");
}
}
class Contract extends Staff
{
private int Period;
public Contract(int staffId, String name, String phone, long salary, int period)
{
super(staffId, name, phone, salary);
this.Period = period;
}
public void Display()
{
super.Display();
System.out.print("\t-\t-\t-\t-\t"+Period);
}
}
public class Lab2A
{
public static void main(String[] args)
{
Staff staff[]=new Staff[3];
staff[0]=new Teaching(1,"Nagesh","271173",90000,"CSE",3); staff[1]=new Technical(2,"Tara","271172",2000,"Server Admin"); staff[2]=new Contract(3,"Rahul","271174",9000,3);
System.out.println("StaffID\tName\tPhone\tSalary\tDomain\tPublication\tSkills\t Period");
for(int i=0;i<3;i++)
{
staff[i].Display();
System.out.println();
}
}
}
