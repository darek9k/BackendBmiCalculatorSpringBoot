package darek9k.bmicalculator.circle;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CircleRequest(double radius) {
    public CircleRequest(@JsonProperty("radius") double radius) {
        this.radius = radius;
    }
}
