package darek9k.bmicalculator.circle;

public record CircleResponse(Double field, Double perimeter){
    public static CircleResponse from(CircleData circleData){
        return new CircleResponse(circleData.field(), circleData.perimeter());
    }
}
