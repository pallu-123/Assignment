package methods;

public class overMethod {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

overMethod ob=new overMethod();
       ob.area(10,12);
       ob.area(5);  
   }
}
