package edu.escuelaing.arsw.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class WebSiteController 
{
    public static void main( String[] args )
    {
        SpringApplication.run(WebSiteController.class, args);
    }

    @RequestMapping(value = "/status", method = RequestMethod.GET, produces = "application/json")
    public String status() {
        return "{\"status\":\"Greetings from Spring Boot. "
        + java.time.LocalDate.now() + ", "
        + java.time.LocalTime.now()
        + ". " + "The server is Runnig!\"}";
    }

    @PostMapping("/hello_2")
    public String hello_2(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
   }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
   }

   static int getPort() {
    if (System.getenv("PORT") != null) {
        return Integer.parseInt(System.getenv("PORT"));
    }
    return 4567;

}

}
