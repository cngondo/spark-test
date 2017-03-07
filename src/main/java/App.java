/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import static spark.Spark.*;

public class App {
   
    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
    	//simple hello world from spark
        get("/hello", (req, res) -> "Hello from heroku!!");

        get("/", (req, res) -> "Welcome to Heroku in spark");
        
        ProcessBuilder process = new ProcessBuilder();
        Integer port;

        if (process.environment().get("PORT") != null) {
	         port = Integer.parseInt(process.environment().get("PORT"));
	     } else {
	         port = 4567;
	     }

	    setPort(port);
    }
}
