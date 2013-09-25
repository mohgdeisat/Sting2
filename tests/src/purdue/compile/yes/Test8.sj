//This file tests inbranch inside inbranch
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/compile/yes/Test8.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.generaltest.Test8  
package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test8{
       participant A;	
       private final noalias protocol pDisoveryService {
         participants: A, B
 	 .A: begin
	 .B: {OP1: B: {OP3: A->B: <Integer>,
	       OP4: A->B: <Double>
	     },
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
		      s.inbranch("B") {
		        case OP3: {
			  s.send(i, "B");
			}
			case OP4: {
			  s.send(d, "B");
			}
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
		
		Test8 a = new Test8();
		
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