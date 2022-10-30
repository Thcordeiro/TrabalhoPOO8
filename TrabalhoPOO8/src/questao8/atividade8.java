package questao8;

import java.util.Scanner;

public class atividade8 {
	public static void main(String[] args) {
		int i,a;
		Scanner scanf=new Scanner(System.in);
		final int li=2;
		final int co=5;
		double M[][]=new double [li][co];
		for(i=0;i<li;i++) {
			for(a=0;a<co;a++) {
			System.out.println("Informe o numero:");
			M[i][a]=scanf.nextDouble();	
			
			}
		}
			 for(int l=0;l<li;l++) {
				for(int k=0;k<co;k++) {
					System.out.print("Matriz["+l+"]["+k+"]= "+M[l][k]+"\n");
				
			
			}
		}
	}


}
