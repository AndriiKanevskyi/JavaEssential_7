package JavaEssential_7_3;

public class NoCorrectShopRequestException extends Exception{
    String message = "Немає такого магазину";

    public String getMessage(){
        return this.message;
    }
}
