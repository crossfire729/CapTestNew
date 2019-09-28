public class Addition implements Operation{
	public String method(double a, double b){
		System.out.println("Addition invoked");
		return Double.toString(a+b);
	}
}