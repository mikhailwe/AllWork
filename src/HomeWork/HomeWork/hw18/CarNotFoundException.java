package HomeWork.HomeWork.hw18;

public class CarNotFoundException extends RuntimeException {
    private String text;

    public CarNotFoundException(String text) {
        super(text);
    }
}
