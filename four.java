import java.util.*;
public class perRATIObreadth {

	public static void main(String[] args) {
		    int l,b1,b2;
		    float bbb,length,breadth;
			Scanner s=new Scanner(System.in);
	        System.out.println("Enter perimeter ratio");
	        int pr=s.nextInt();
	        System.out.println("Enter breadth ratio");
	        int br=s.nextInt();
	        System.out.println("Enter area");
	        int area=s.nextInt();
	        l=2*br;
	        b1=2*br;
	        b2=pr;
	        breadth=(b2-b1);
	        bbb=breadth/l;
	        length=(int) Math.sqrt(bbb*area);
	        System.out.println(length);
	        s.close();

	}

}
