package shaoedemo;



abstract class Shape{ 
	  protected String name;
	  protected int noOfSides;
	  
	  Shape(){}
	  Shape(String name,int noOfSides)
	  {
		  this.name=name;
		  this.noOfSides=noOfSides;
	  }
	  
	  public void display(){
	    System.out.println("Name:"+name);
		System.out.println("NoOfSides:"+noOfSides);
	  }
	  abstract public void area(); 
	  abstract public void perimeter();

	}

	class Rectangle extends Shape{
		private int length;
		private int breadth;
		
		Rectangle(){}
		Rectangle(int length,int breadth){
			super("Rectangle",4);
			this.length=length;
			this.breadth=breadth;
		}
		
		public void display(){
			super.display();
			System.out.println("length:"+length);
			System.out.println("Breadth:"+breadth);
		}
		
		public void area(){
			System.out.println("Area::"+length*breadth);
		}
		
		public void perimeter(){
			System.out.println("Perimeter::"+2*(length+breadth));
		}
	}

	class Square extends Shape{
		private int side;
		
		Square(){}
		Square(int side)
		{
			super("Square",4);
			this.side=side;
		}
		public void display(){
			super.display();
			System.out.println("Side:"+side);
			
		}
		
		public void area(){
			System.out.println("Area::"+side*side);
		}
		
		public void perimeter(){
			System.out.println("Perimeter::"+4*side);
		}
	}



	class Traingle extends Shape{
		private int base;
		private int height;
		
		Traingle(){};
		Traingle(int base,int height)
		{
			super("Traingle",3);
			this.base=base;
			this.height=height;
		}
		public void display(){
			super.display();
			System.out.println("base:"+base);
			System.out.println("height:"+height);
			
		}
		
		public void area(){
			System.out.println("area::"+base*height*0.5);
		}
		
		public void perimeter(){
			System.out.println("Perimeter Cannot be process no side info");
		}
	}
	
	class Circle extends Shape{
		private int radius;
		
		Circle(){};
		Circle(int radius)
		{
			super("Circle",0);
			this.radius=radius;
		}
		public void display(){
			super.display();
			System.out.println("Radius:"+radius);
			
		}
		
		public void area(){
			System.out.println("Area::"+3.14*radius*radius);
		}
		
		public void perimeter(){
			System.out.println("Perimeter::"+2*3.14*radius);
		}
	}
	class ShapeDemo{
		public static void process(Shape s)
		{
			s.display();
			s.area();
			s.perimeter();
		}
		
		public static void main(String n[])
		{
			
			process(new Rectangle(2,3));
			process(new Circle(2));
			process(new Square(2));
			process(new Rectangle(2,3));
			
			
		}
	}


