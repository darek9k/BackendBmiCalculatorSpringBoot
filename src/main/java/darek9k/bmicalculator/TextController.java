package darek9k.bmicalculator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/bmi/text")
public class TextController {
    //Homework. Create a service at /api/text/uppercase
    // that will take one parameter called 'word'.
    // The service is to convert the word passed in the word parameter to uppercase letters
    // and return the result in the body response and the ok-200 code.

    @GetMapping("/uppercase")
    public ResponseEntity<String> uppercase(@RequestParam(value = "word", required = false) String param) {
        return ResponseEntity.ok(param.toUpperCase());
    }
    @PostMapping("/uppercase")
    public ResponseEntity<String> uppercase(@RequestBody TextRequest text) {
        return ResponseEntity.ok(text.text().toUpperCase());
    }

    @GetMapping("/uppercase2")
    public String uppercaseWithResponseEntity(@RequestParam String word) {
        return word.toUpperCase();
    }
}
