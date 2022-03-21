public class ParkingGarageExceptionHandler {
    String message;

    public ParkingGarageExceptionHandler(String errorMessage){
        message = errorMessage;
    }

    public String getMessage(){
        return message;
    }
}
