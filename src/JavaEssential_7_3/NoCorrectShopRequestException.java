package JavaEssential_7_3;

public class NoCorrectShopRequestException extends Exception{
    private String message;
    public NoCorrectShopRequestException(String s) {
        this.message = s;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
