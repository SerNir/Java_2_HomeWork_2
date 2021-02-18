public class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    public MyArraySizeException(String message) {
        super(message);
    }
    public String getMessage(){
        return "Неправильный размер массива: ожидается массив 4х4";
    }
}
