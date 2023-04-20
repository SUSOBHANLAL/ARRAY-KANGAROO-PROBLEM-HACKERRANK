package kangarooPROBLEM;
import java.util.*;
public class susobhan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        
        
        int flag = 0;
        int sum1 = x1;//assigning initial position  0
        int sum2 = x2; //    ||                     4
        
        
       
        	
        for(int i =0;i<10000;i++){
            sum1 = sum1+v1;
            sum2 = sum2+ v2;
            
            if(sum1==sum2) {
            	flag =1;
            	break;
            }
            else {
            	flag =0;
            }
         
        }
        
        
        
        if(flag ==1) {
        	System.out.println("yes");
        }
        
        else {
        	System.out.println("no");
        }
        
        
 
	}

}
