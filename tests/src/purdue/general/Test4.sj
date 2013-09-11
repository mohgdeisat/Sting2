// To test, run IdP and SP first
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/general/Test4.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.generaltest.Test4  
package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test4{
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
		  s.inbranch("C") {
		    case OP1: {
		      s.send(i, "B");
		    }
		    case OP2: {
		      s.send(d, "B");
		    }
		  }
		}
		finally{}
	}
	

	public static void main(String[] args) throws Exception{
		
		Test4 a = new Test4();
		
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