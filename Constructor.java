public class Constructor {
	String Brand;
	String Colour;
	int Price;
	Constructor()//Object creation, State initialization
	{
		Brand="Duke";
		Colour="White+Orange";
		Price= 280000;
		System.out.println(Brand+" "+Colour+" "+Price);
	}
	Constructor(String B,String C,int P){
		this.Brand=B;
		this.Colour=C;
		this.Price=P;
		System.out.println(this.Brand+" "+this.Colour+" "+this.Price);
	}
	public static void main(String[] args)
	{
		Constructor c1=new Constructor();
		c1.Brand="RF";
		c1.Colour="Black";
		c1.Price=250000;
		System.out.println(c1.Brand+" "+c1.Colour+" "+c1.Price);
		Constructor c2=new Constructor("R15","Blue",180000);
	}
}
