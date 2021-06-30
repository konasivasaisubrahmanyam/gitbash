package student;
//with variables as name, id, duration, seats.
import java.util.*;

class BusSort
{
    String name;
     int id;
     int duration;
     int seats;
 
   
   

	public BusSort(String name, int id, int duration, int seats) {
		super();
		this.name = name;
		this.id = id;
		this.duration = duration;
		this.seats = seats;
	}

	@Override
    public String toString()
    {
        return "name:"+name+"\n"+"id:"+id+"\n"+"duration"+duration+"hrs"+"\n"+"No of Seats Available:"+seats+"\n"+"\n";
                       
    }
 
    public String getName() {
        return name;
    }
    public int getDuration() {
        return duration;
    }
 
   
}
 
class Bus
{
    public static void main(String[] args)
    {	
    
    	 String name;
         int id=1;
         int duration;
         int seats=30;
         int n;
         
    	
        List<BusSort> bus = new ArrayList<BusSort>();
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of bookings you want to made ");
		n=sc.nextInt();
		while(n>0)
		{
		System.out.println("Enter the your name ");
		name=sc.next();
		id++;
		System.out.println("Enter the duration time  ");
		duration=sc.nextInt();
		
		--seats;
		
		bus.add(new BusSort(name,id,duration,seats));
		 --n;
		
		}
 
        Collections.sort(bus, new Comparator<BusSort>() {
            @Override
            public int compare(BusSort b1, BusSort b2) {
                return b1.getDuration() - b2.getDuration();
            }
        });
 
        Iterator iterator = bus.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
  
        System.out.println();
    }
}
