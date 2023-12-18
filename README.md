
# BMI Calculator

This repository contains a BMI (Body Mass Index) calculator application built using Java and Spring Boot.

## Description

The BMI calculator application provides endpoints to calculate BMI and classify the result based on the calculated BMI value.

## Technologies

- Java
- Spring Boot

## Installation

To install the BMI calculator application, simply clone the repository and import it into your preferred Java IDE.

## Usage

The BMI calculator provides the following endpoints:

### Endpoints

- `GET /api/bmi/calculate?w=80&h=180` - Calculate BMI using query parameters
- `POST /api/bmi/calculate` - Calculate BMI using POST request and request body
- `GET /api/bmi/calculate2` - Alternative endpoint to calculate BMI using query parameters

### Usage Examples

#### Calculate BMI using query parameters

```http
GET /api/bmi/calculate?w=80&h=180
```

#### Calculate BMI using POST request

```http
POST /api/bmi/calculate
Content-Type: application/json
{
    "weight": 80,
    "height": 180
}
```

-------------------------------

# BackendBmiCalculatorSpringBoot
First project using springboot

BMI calculator backend. Project built in springboot (initializr ->start.spring.io). 

Adding dependencies in Maven.
```
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
```    
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
