//COMPILE ERROR: This file tests extra branch label
// To test, run IdP and SP first
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/compile/no/Test6.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.generaltest.Test6  
package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test6{
       participant A;	
       private final noalias protocol pDisoveryService {
         participants: A, B
 	 .A: begin
	 .B: {OP1: A->B: <Integer>,
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
		      s.send(i, "B");
		    }
		    case OP2: {
		      s.send(d, "B");
		    }
		    case OP3: {
		    }
		  }
		}
		finally{}
	}
	

	public static void main(String[] args) throws Exception{
		
		Test6 a = new Test6();
		
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