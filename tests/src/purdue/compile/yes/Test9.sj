//This file tests inwhile inside inwhile
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/compile/yes/Test9.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.generaltest.Test9  
package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test9{
       participant A;	
       private final noalias protocol pDisoveryService {
         participants: A, B
 	 .A: begin
	 .B: [
	       B: [
	         B->A: <Integer>
	       ]*
	       .A->B: <Integer>
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
		  s.inwhile("B") {
		    s.inwhile("B") {
		      i = (Integer) s.receive("B");
		    }
		    s.send(i, "B");
		  }
		}
		finally{}
	}
	
	public static void main(String[] args) throws Exception{
		Test9 a = new Test9();
		a.run(1);
	}
}