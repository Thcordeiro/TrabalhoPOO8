package questao8;

import java.util.Scanner;

public class atividade8 {
	public static void main(String[] args) {
		int n,k
		Scanner scanf=new Scanner(System.in);
		final int li=2;
		final int co=5;
		double M[][]=new double [li][co];
		for(n=0;<li;++) {
			for(k=0;<co;k++) {
			System.out.println("Informe o numero:");
			M[n][k]=scanf.nextDouble();	
			
			}
		}
			 for(int l=0;l<li;l++) {
				for(int k=0;k<co;k++) {
					System.out.print("Matriz["+l+"]["+k+"]= "+M[l][k]+"\n");
				
			
			}
		}
	}


}
