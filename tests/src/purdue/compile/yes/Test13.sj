//This file tests inwhile after outbranch
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/compile/yes/Test13.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.generaltest.Test13  
package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test13{
       participant Client;	
       private final noalias protocol pDisoveryService {
         participants: Client, SP, IdP
	 .Client: begin
 	 .Client: {LAB1:,
	 LAB2: 
	 }

	 /*.SP: {LAB1:,
	 LAB2: 
	 }*/
	 .SP: [
	   SP->IdP: <Double>
	 ]*
      }


	public void run(int singleSession) throws Exception {
		
		final noalias SJService c = SJService.create(pDisoveryService, "localhost", 1000);
		c.participantName("Client");
		c.addParticipant("IdP", "mc05.cs.purdue.edu", 7100);		
		c.addParticipant("SP", "sslab05.cs.purdue.edu", 7101);
		long startTime = System.nanoTime();
		final noalias SJSocketGroup s;
		System.out.println("This test tests all possible protocol combinations that should be accepted by the compiler");
		System.out.println("The tests should not cause any compilation errors or exceptions");
		try (s) 
		{			
			s = c.request();
			String str = "hi";
			
			if(str.equals("hi")) {
			  s.outbranch(LAB1) {
			  }
			}
			else {
			  s.outbranch(LAB2) {
			  }
			}

			/*s.inbranch("SP") {
			  case LAB1: {
			  }
			  case LAB2: {
			  }
			}*/
			s.inwhile("SP") {
			}

		}
		finally{}
	}
	

	public static void main(String[] args) throws Exception{
		
		Test13 a = new Test13();
		
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