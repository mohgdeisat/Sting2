//This file tests inwhile after inbranch
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/compile/yes/Test7.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.generaltest.Test7  
package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test7{
       participant A;	
       private final noalias protocol pDisoveryService {
         participants: A, B
 	 .A: begin
	 .B: {
	    OP1: A->B: <Integer>,
	    OP2: A->B: <Double>
	 }
	 .B: [
	       A->B: <Integer>
	 ]*
	 .A->B: <String>
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
		  s.inbranch("B") {
		    case OP1: {
		      s.send(i, "B");
		    }
		    case OP2: {
		      s.send(new Double(5.0), "B");
		    }
		  }
		  s.inwhile("B") {
		    s.send(i, "B");
		  }
		  s.send("hi", "B");
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