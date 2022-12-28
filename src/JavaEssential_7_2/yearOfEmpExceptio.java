package JavaEssential_7_2;

public class yearOfEmpExceptio extends Exception{
    String message = "Введено неправильний формат року!";


    @Override
    public String getMessage() {
        return this.message;
    }
}
