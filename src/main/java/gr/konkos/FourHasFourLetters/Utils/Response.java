package gr.konkos.FourHasFourLetters.Utils;

public class Response {
    private String word;
    private Long number;

    public Response(String word, Long number) {
        this.word = word;
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Response{" +
                "word='" + word + '\'' +
                ", number=" + number +
                '}';
    }
}
