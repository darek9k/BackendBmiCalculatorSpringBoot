package darek9k.bmicalculator;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TextRequest(String text) {

    public TextRequest(@JsonProperty("text") String text) {
        this.text = text;
    }
}
