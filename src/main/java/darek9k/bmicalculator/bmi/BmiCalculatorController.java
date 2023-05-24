package darek9k.bmicalculator.bmi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bmi")
public class BmiCalculatorController {

    private final BmiCalculatorService bmiCalculatorService;

    public BmiCalculatorController(BmiCalculatorService bmiCalculatorService) {
        this.bmiCalculatorService = bmiCalculatorService;
    }

    //BMI = weight in kg / height in m / height in m
    //if BMI > 25 OVERWEIGHT
    //if BMI >= 20 < 25 then OK
    //if BMI <20 you are UNDERWEIGHT
    //Return BMI and classification
    //GET /api/bmi/calculate?w=80&h=180
    //It takes two parameters
    //w - weight
    //h - height
    @GetMapping("/calculate")
    public ResponseEntity<BmiCalculateResponse> calculateBMI(@RequestParam("w") Integer weight,
                                                             @RequestParam("h") Integer heightInCm) {
        System.out.println("calculateBMI");
        BmiCalculateResponse response = bmiCalculatorService.calculate(weight, heightInCm);

        return ResponseEntity.ok(response);
    }

    @PostMapping("/calculate")
    public ResponseEntity<BmiCalculateResponse> calculateBMIAsPost(@RequestBody BmiCalculateRequest request) {
        System.out.println("calculateBMI");
        BmiCalculateResponse response = bmiCalculatorService.calculate(
                request.weight(),
                request.height());

        return ResponseEntity.ok(response);
    }

    @GetMapping("/calculate2")
    public BmiCalculateResponse calculateBMI2(@RequestParam("w") Integer weight,
                                              @RequestParam("h") Integer heightInCm) {
        System.out.println("calculateBMI");

        return bmiCalculatorService.calculate(weight, heightInCm);
    }

    @GetMapping
    public void test1() {
        System.out.println("test1");
    }

    @GetMapping("/test2")
    public String test2(String str) {
        System.out.println("test2" + str);
        return "String z metody test2";
    }

    @GetMapping("/test3")
    public ResponseEntity<Void> test3() {
        System.out.println("test3");
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/test4")
    public ResponseEntity<String> test4(@RequestHeader("User-Agent") String header1, @RequestParam("q") String q) {
        System.out.println("test4");
        System.out.println("header1" + header1);
        System.out.println("q" + q);
        return ResponseEntity.accepted().body(q);
    }
//Homework. Create a service at /api/text/uppercase
// that will take one parameter called 'word'.
// The service is to convert the word passed in the word parameter to uppercase letters
// and return the result in the body response and the ok-200 code.
}
