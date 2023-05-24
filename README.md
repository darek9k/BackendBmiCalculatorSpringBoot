# BackendBmiCalculatorSpringBoot
First project using springboot

BMI calculator backend. Project built in springboot (initializr ->start.spring.io). 

Adding dependencies in Maven.
    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
    
Exposing REST services.
  >@RestController
  >@RequestMapping("*path*")
  
Passing parameters via body as JSON. 

>  @RequestBody

Passing parameters in the address as queryparams. 

>  @RequestParam("*paramName*")

Sending response as JSON by ResponseEntity or as an object. 

>  example : return ResponseEntity.ok(response);

Marking statuses in ResponseEntity. 

Injection. Listing of services and components. @Service / @Component. 
Marking the bean with @Service and the controller in the class by adding the injected class field and using the constructor.
You can also use the @Autowired annotation on a field or setter.
```
   private final ServiceClassName serviceClassName;
       public ControllerClassName(serviceClassName serviceClassName) {
           this.serviceClassName = serviceClassName;
       }
```
Thanks to which springboot manages instances of these beans.

We decompose into smaller responsibilities in classes.
For classes to do little, for our code to be readable. 
Also so that another programmer can inject these classes and call them. 

We avoid static methods. 
This then makes testing difficult. 
We want SpringBoot to manage the beans.
