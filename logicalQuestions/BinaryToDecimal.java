package logicalQuestions;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int decimal=0;
		int binary=1111;
		int power=0;
		while(binary>0)
		{
			int r=binary%10;
			decimal = (int) (decimal+r*Math.pow(2, power));
			binary=binary/10;
			power++;
		}
		System.out.println(decimal);
	}

}
