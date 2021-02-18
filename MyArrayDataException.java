public class MyArrayDataException extends NumberFormatException{

    public MyArrayDataException() {
    }

    public MyArrayDataException(String s) {
        super(s);
    }

    public String getMessage(){
        return "Неверный числовой формат в ячейке массива";
    }

    }

