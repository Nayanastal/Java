
package MODULE_1;

import java.util.Scanner;

public class ComplexNumber {
	
		double real,img;
		ComplexNumber(double r,double i){
			real= r; img=i;}
		public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2) {
			ComplexNumber temp=new ComplexNumber(0,0);
			temp.real=c1.real+c2.real;
			temp.img=c1.img+c2.img;
			return temp;}
		
		
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the real part of c1:");
		double r1=s.nextDouble();
		System.out.print("Enter the imaginary part of c1:");
		double i1=s.nextDouble();
		System.out.print("Enter the real part of c2:");
		double r2=s.nextDouble();
		System.out.print("Enter the imaginary part of c2:");
		double i2=s.nextDouble();
		ComplexNumber c1=new ComplexNumber(r1,i1);
		ComplexNumber c2=new ComplexNumber(r2,i2);
		ComplexNumber temp=sum(c1,c2);
		System.out.printf("sum is:"+temp.real+"+"+temp.img+"i");
		

	}

}
