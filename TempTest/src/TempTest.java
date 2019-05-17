import java.util.HashMap;
import java.util.Map;

public class TempTest extends SumClass{

	public static void main(String[] args) {
//		String str = "rennaB_egaPgnidnaLGT=epytecruos?srotaidalgedoc/moc.gighcet.www//:sptth \n .9102 GIGHCET ta tuo ti elttab & noititepmoc fo tirips eht ni gnirB\n .slevel txen eht rof pu elkcub , egnellahc eht dekcolnu evah uoy taht woN";
//        StringBuilder sb = new StringBuilder();
//        for(int i = str.length() - 1; i >=0; i--)
//        {
//        	System.out.println(i);
//            sb.append(str.charAt(i));
//        }
//        System.out.println("string is:");
//        System.out.println(sb.toString());
		
		Map<String, String> ma = new HashMap<String, String>();
		ma.put("ashish", "abcd");
		ma.put("sandeep", "aslkdfj");
		
		System.out.println(ma.get("sandeep"));
		
		int a = 1;
		int b = 2;
		System.out.println(sum(a, b));
		
		SumClass abc = new SumClass();
		System.out.println(abc.sum(a, b));
		
	}
	
	
	public static int minus(int x, int y) {
		int minus = x - y;
		return minus;
	}
}
