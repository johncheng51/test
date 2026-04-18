package com.jm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.beans.factory.annotation.Value;
/*********import*******/
@SpringBootApplication
public class Application implements CommandLineRunner {
/*********block*******/
    @Value("${server.port}")
    private int port;  

	public static void main(String[] args) {
	    SpringApplicationBuilder builder=
	        new SpringApplicationBuilder(Application.class);
	    builder.banner((x,y,pr)->{
	    pr.println("============================================================");  
	    pr.println("=                                                          ="); 
	    pr.println("=                Dummy Micro Service                         =");
	    pr.println("=                                                          =");  
	    pr.println("============================================================");                 
	                   });
	    builder.run(args);
	}

    @Override
    public void run(String[] args) throws Exception {
         /*********run*******/
         log("============================================================");  
         log("=                                                          =");
         log("=     End of  Main Service                                 ="); 
         log("=     swagger: http://localhost:"+port+"/swagger-ui.html       =");
         log("=          H2: http://localhost:"+port+"/h2-console            =");
         log("=                                                          =");  
         log("=                                                          =");  
         log("============================================================"); 
       
    }
    
    private void log(String message){
        System.out.println(message);
    }
}