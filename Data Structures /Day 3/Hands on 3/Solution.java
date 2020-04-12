import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String args[]) throws IOException {
		 String s; int tcCount; int iCount=0;
		 Scanner in = new Scanner(System.in);
		 tcCount = Integer.parseInt(in.nextLine());
		 while( iCount < tcCount ) {
	            s = in.nextLine();
	            int flag = 1, i = 0, l = s.length();
	            Stack<Character> st = new Stack<Character>();
	            for( i = 0; i < l; i++ ){
	                char ch = s.charAt(i);
	                if( ch == '(' || ch == '[' || ch == '{' )
	                    st.push( ch );
	                else {
	                    if( st.empty() ){
	                        flag = 0; break;
	                    } else {
	                        char c = (char) st.pop();
	                        if( (c == '(' && ch != ')') || (c == '[' && ch != ']') || (c == '{' && ch != '}') ){
	                            flag = 0; break;
	                        }
	                    }
	                }
	            }
             if( flag == 1 && st.empty() ) { System.out.println("YES"); } 
             else  { System.out.println("NO"); }
             iCount++;
	        }
		 in.close();
	}
}