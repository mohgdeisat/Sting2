//COMPILE ERROR: This file tests wrong message type
// To test, run IdP and SP first
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/compile/no/Test2.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.generaltest.Test2  
package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test2{
       participant A;	
       private final noalias protocol pDisoveryService {
         participants: A, B
 	 .A: begin
	 .A->B: <Double>
      }


	public void run(int singleSession) throws Exception {
		
		final noalias SJService c = SJService.create(pDisoveryService, "localhost", 1000);
		c.participantName("A");
		c.addParticipant("B", "localhost", 7100);		
		final noalias SJSocketGroup s;
		try (s) 
		{			
			s = c.request();
			Integer i = new Integer(5);
			s.send(i, "B"); //Error: wrong message type
		}
		finally{}
	}
	

	public static void main(String[] args) throws Exception{
		
		Test2 a = new Test2();
		
		a.run(1);
	}
	
	String repeat(String str, int n) {
	       String str2 =  new String();
	       for(int i = 0; i<n; ++i) {
	       	       str2+= str;
	       }
	       return str2;
	}
}