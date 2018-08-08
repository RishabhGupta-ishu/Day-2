class Emp
{
int salary;
	Emp()
	{
	salary=20000;
	}
void show()
{
System.out.println(salary);
}
public static void main(String... a)
{
Emp e=new Emp();
e.show();
Emp e1=new Emp();
e1.show();
}
}