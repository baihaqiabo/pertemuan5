public class CalculatorMain2  {
	
	public void perkalian (int x, int y) {
		int z;
		z = x*y;
		System.out.println("Hasil:" + z);
	}

	public static void main(String args[]) {
		int a = 20, b=10;
		CalculatorMain2 cal = new CalculatorMain2();
		Calculator cal2 = new Calculator();
		cal2.pertambahan(a,b);
		cal2.pengurangan(a,b);
		cal.perkalian(a,b);
	}
}