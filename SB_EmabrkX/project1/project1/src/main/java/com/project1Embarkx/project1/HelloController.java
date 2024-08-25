package com.project1Embarkx.project1;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController
{
    //Handles GET requests to "/hello" URL
    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World";
    }

    //-----------------------------------------
    // Handles POST requests to "/hello" URL with a request body
    @PostMapping("/hello")
    public String helloPost(@RequestBody String name)
    {
        return "Hello " + name + " Good Morning!";
        //@RequestBody String name
        //we have to give the name as input to this method.
        //Here we will the name in the request body.
        //So while calling this url--> give the name from postman.
        //we can not execute the post request from the browser.
        //we will use the postman for this and pass the name while hitting the url for the post request.
    }
    //----post request part 2 ----------------------------------------------------------
    // Handles POST requests to "/hello1" URL using a request parameter
    //Using Request Parameter: ==>We can send the name as a form data or query parameter.
    @PostMapping("/hello1")
    public String helloPost1(@RequestParam String name)
    {
        return "Hello " + name + " Good Morning!";
        //@RequestParam String name:
        //Purpose: @RequestParam is used to bind a query parameter from the URL to a method parameter.
        //Data Source: The data comes from the query string of the URL.
        //http://localhost:8080/hello1?name=vikassingh
    }
    //-------------------------------------------
    // Handles POST requests to "/hello2/{name}" URL using a path variable
    //@PathVariable String name:
    //Purpose: @PathVariable is used to bind a URI template variable (path variable) from the URL to a method parameter.
    //Data Source: The data comes directly from a part of the URL path.
    @PostMapping("/hello2/{name}")
    public String helloPost2(@PathVariable String name)
    {
        return "Hello " + name + " Good Morning!";
        // @PathVariable String name:
        // The name is part of the URL path itself.
        // Example: http://localhost:8080/hello2/vikassingh
        // The "name" is taken from the path in the URL.
    }
}
//-------------------------------------------------------------------------------------------
//@RestController ==> It means this class is controller and this can handle the http request.
//@RestController ⇒  @Controller +  @ResponseBody

//@GetMapping("/hello") ==> If @GetMapping is defined on some method then it means that this method will call for the given url.
//http://localhost:8080/hello ==> when we will hit this url, this method will be called and it will return the response.
//====================================================================
//@RequestBody String name ==> the name must be sent in the body of the request.
//@RequestParam String name ==> the name must be sent as a query parameter in the URL.
//@PathVariable String name ==> the name must be part of the URL path.
