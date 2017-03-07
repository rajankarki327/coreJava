package interviewQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisiorFind {
	int traingularNum=0;
	int naturalNum=1;
	public static void main(String[] args) {
		DivisiorFind obj = new DivisiorFind();
		obj.traingularValue();
	}
	
	public void traingularValue(){
		traingularNum+=naturalNum;
		divisiorNum(traingularNum);
	}
	
	public void divisiorNum(int tn){
		ArrayList<Integer> arr1 = new ArrayList();
		for(int i=1;i<tn/2;i++){
			if(tn%i==0){
				arr1.add(i);
			}
		}
		if(arr1.size()+1<50){
			naturalNum++;
			traingularValue();
		}
		else{
			System.out.println("triangular value "+tn);
		}
	}

}
