//This file tests inwhile inside inbranch
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/compile/yes/Test10.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.generaltest.Test10  
package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test10{
       participant A;	
       private final noalias protocol pDisoveryService {
         participants: A, B
 	 .A: begin
	 .B: {OP1: 
	       B: [
	         A->B: <Integer>
	       ]* ,

	      OP2: A->B: <Double>
	 }
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
		  Double d = new Double(10);
		  s.inbranch("B") {
		    case OP1: {
		      s.inwhile("B") {
			s.send(i, "B");
		      }
		    }
		    case OP2: {
		      s.send(d, "B");
		    }
		  }
		}
		finally{}
	}
	public static void main(String[] args) throws Exception{	
		Test10 a = new Test10();
		a.run(1);
	}
}