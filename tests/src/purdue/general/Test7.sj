// To test, run IdP and SP first
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/general/Test7.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.generaltest.Test7  
package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test7{
       participant A;	
       private final noalias protocol pDisoveryService {
         participants: A, B
 	 .A: begin
	 .B: [
	       A->B: <Integer>
	     ]*
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
		  s.inwhile("C") {
		    s.send(i, "B");
		  }
		}
		finally{}
	}
	

	public static void main(String[] args) throws Exception{
		
		Test7 a = new Test7();
		
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