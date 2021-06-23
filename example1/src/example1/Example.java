package example1;
interface Task{
	public void activity();
	}
abstract class Alphabet{
	protected int no;
	protected String name;
	
	Alphabet(){}
	Alphabet(int no,String name)
	{
		this.no=no;
		this.name=name;
	}
	public void sno()
	{
		System.out.println("no of alphabet:"+no);
	}
	public void type()
	{
		System.out.println("name of alphabet :"+name);
	}
	public abstract void m();
	public abstract void n();
}
class A extends Alphabet implements Task
{
	A()
	{
	 super(1,"A");	
	}
	
	@Override
	public void activity() {
		System.out.println("class A");
		
	}

	@Override
	public void m() {
		System.out.println("");
		
		
	}

	@Override
	public void n() {
		
		
	}
	
}
class B extends Alphabet implements Task
{
	B()
	{
		super(2,"B");
	}
	@Override
	public void activity() {
		// TODO Auto-generated method stub
		System.out.println("class B");
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void n() {
		// TODO Auto-generated method stub
		
	}
	
}
class C extends Alphabet implements Task
{
	C(){
		super(3,"c");
		
	}
	@Override
	public void activity() {
		// TODO Auto-generated method stub
		System.out.println("class C");
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void n() {
		// TODO Auto-generated method stub
		
	}
	
}
class D extends Alphabet implements Task
{
	D()
	{
		super(4,"D");
	}
	@Override
	public void activity() {
		// TODO Auto-generated method stub
		System.out.println("class D");
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void n() {
		// TODO Auto-generated method stub
		
	}
	
}
class Process{
	public static void process(Task t)
	{
		t.activity();
	}
}

 class ClassProcess {
	public static void process(Alphabet a)
	{	
		a.sno();
		a.type();
		a.m();
		a.n();
	}
}
public class Example{
	public static void main(String[] args)
	{
		Process.process(new A());
		Process.process(new B());
		Process.process(new C());
		Process.process(new D());
		ClassProcess.process(new A());
		ClassProcess.process(new B());
		ClassProcess.process(new C());
		ClassProcess.process(new D());
	}

}
