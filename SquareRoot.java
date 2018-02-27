/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squareroot;

public class SquareRoot {

	public static void main(String[] args) {
		double a = 1;
		double b = -4;
		double c = 4;
        double D;
        double x1,x2;
        D = (b*b)-(4*a*c);
        
        if((a==0 && b==0)||(a==0 && b==0 && c==0)){
            System.out.println("x1=");
            System.out.println("x2=");
            }
            else
                if(a==0 && c==0){
                x1=0.0;
                x2=0.0;
                System.out.println("x1="+x1);
                System.out.println("x2="+x2);
                }
                else 
                    if(D>=0){
            x1 = (-b+(Math.sqrt(D)))/(2*a);
            x2 = ((-b)-(Math.sqrt(D)))/(2*a);
            if(!(x1==x2)){
                System.out.println("x1= "+x1);
                System.out.println("x2= "+x2);
                }
            else 
                if(x1==x2){
                    System.out.println("x1= "+x1);
                    System.out.println("x2= "+x2);
                    }
        }
        else
            if(D<0){
                System.out.println("x1= ");
                System.out.println("x2= ");
                }
        
      
	}
}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
