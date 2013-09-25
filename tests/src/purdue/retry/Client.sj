// To test, run IdP and SP first
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/retry/Client.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.retry_test.Client  
package purdue.retry_test;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Client{
       participant client;	
       private final noalias protocol pDisoveryService {
         participants: client, server
 	 .client: begin
	 .ptry {
	   client -> server: <String>
	 }
	 pcatch(Exception) {
	   client -> server: <String>
	   //client: retry;
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
		  String str = "hi";
		  ptry {
		    s.send(str, "server");
		  }
		  catch(Exception ex) {
		    s.send(str, "server");
		  }
		}
		finally{}
	}
	

	public static void main(String[] args) throws Exception{
		
		Client a = new Client();
		
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