package darek9k.bmicalculator.circle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/circle")
public class CircleController {

    private final CircleService circleService;

    public CircleController(CircleService circleService) {
        this.circleService = circleService;
    }

    //    GET /api/circle
//    It takes one parameter:
//    r - radius
//
//    Return:
//    field = pi * r * r
//            perimeter = 2*pi*r
    @GetMapping
    public ResponseEntity<CircleResponse> circle(@RequestParam("r") Double radius) {
        CircleResponse response = circleService.calculate(radius);

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<CircleResponse> circle(@RequestBody CircleRequest request) {

        return ResponseEntity.ok(circleService.calculate(request.radius()));
    }
}
