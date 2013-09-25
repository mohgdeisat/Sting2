//COMPILE ERROR: This file tests worng inwhile loop guard
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/compile/no/Test12.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.generaltest.Test12  
package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test12{
       participant A;	
       private final noalias protocol pDisoveryService {
         participants: A, B
 	 .A: begin
	 .B: [
	   A->B: <String>
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
		  Double d = new Double(7.0);
		  s.inwhile("C") {
		    s.send("hi", "B");		    
		  }
		}
		finally{}
	}
	

	public static void main(String[] args) throws Exception{
		
		Test12 a = new Test12();
		a.run(1);
	}	
}