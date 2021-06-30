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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
    public String toString()
    {
        return "name:"+name+"\n"+"id:"+id+"\n"+"duration:"+duration+"hrs"+"\n"+"No of Seats Available:"+seats+"\n"+"\n";
                       
    }
 
}
class SortById implements Comparator<BusSort> {
   
	@Override
	public int compare(BusSort o1, BusSort o2) {
		
		return o1.id - o2.id;
	}
}
  
class SortByName implements Comparator<BusSort> {

	@Override
	public int compare(BusSort o1, BusSort o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
   
}
class SortByDuration implements Comparator<BusSort> {

	@Override
	public int compare(BusSort o1, BusSort o2) {
		// TODO Auto-generated method stub
		return o1.duration - o2.duration;
	}
   
}
class SortBySeats implements Comparator<BusSort> {

	@Override
	public int compare(BusSort o1, BusSort o2) {
		
		return o1.seats - o2.seats;
	}
   
}
class Bus
{
    public static void main(String[] args)
    {	
    
    	 String name;
         int id=0;
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

		
		
		
        boolean status=true;
      while(status)
        {
		System.out.println("Enter 1 for Id Sorting ,2 for Name sorting, 3 for duration,4 for seats, for 5 to exist");
     
		int value=sc.nextInt();
		switch(value)
				{
				case 1:
			       
			        
			        System.out.println("\nSorted by Id");
			        Collections.sort(bus, new SortById());
			        Iterator<BusSort> iterator1 = bus.iterator();
			        
			        while (iterator1.hasNext()) {
			            System.out.print(iterator1.next() + " ");			  
			        	System.out.println();
			        }
			        
			    
			break;
				case 2:
			       
			        
			        System.out.println("\nSorted by Name");
			        bus.iterator();
			        Collections.sort(bus, new SortByName());
			        Iterator<BusSort> iterator2 = bus.iterator();
			        while (iterator2.hasNext())
			        {
			            System.out.print(iterator2.next() + " ");			  
			        	System.out.println();
			        }
					break;
				case 3:
			       
			        System.out.println("\nSorted by Duration");
			        bus.iterator();
			        Collections.sort(bus, new SortByDuration());
			        
			        Iterator<BusSort> iterator3 = bus.iterator();
			        while (iterator3.hasNext()) {
			            System.out.print(iterator3.next() + " ");			  
			        	System.out.println();
			        }
					
					break;
				case 4:
			       
			        
			        System.out.println("\nSorted by Seats");
			        bus.iterator();
			        Collections.sort(bus, new SortBySeats());
			        Iterator<BusSort> iterator4 = bus.iterator();
			        while (iterator4.hasNext())
			        {
			            System.out.print(iterator4.next() + " ");			  
			        	System.out.println();
			        }
					break;
				case 5:
					System.out.println("End of sorting................");
					status=false;
					break;
					
				}
		
        }

    }
}

