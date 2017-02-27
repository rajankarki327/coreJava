package logicalQuestions;

public class DecimalToBinary {

	public static void main(String[] args) {
		int decimal=8;
		String binary=String.valueOf(decimal%2);
		System.out.println();
		while(decimal>2){
			 decimal=decimal/2;
			 binary=binary+String.valueOf(decimal%2);
		}
		int i=binary.length()-1;
		String nw="1";
		while(i>=0){
		    nw=nw+String.valueOf(binary.charAt(i));
		    i--;
		}
//		System.out.println(binary.charAt(2));
		System.out.println(nw);
	}
}
