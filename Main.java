public class Main {
    public static void main(String[] args) {

        String arrString[][] = new String[][]{{"5", "5", "4", "0"}, {"23", "8", "9", "1"},
                {"5", "89", "5", "4"}, {"3", "7", "h", "6"}};
        try {
            Arr(arrString);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Arr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int a = 0;
        
       for (int i = 0; i < 4; i++) {

            if (arr.length != 4 || arr[i].length != 4) {
                throw new MyArraySizeException("Неправильный размер массива: ожидается массив 4х4");
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                String s = arr[i][j];

                try {
                    a = Integer.parseInt(s);

                } catch (NumberFormatException e) {
                    System.out.println("Неверный числовой формат в ячейке массива: [" + i + "][" + j + "]");

                }
                sum = sum + a;
            }

        }

        System.out.println("Сумма эллементов массива равна: " + sum);

    }
}
