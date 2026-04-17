package task4;

public class ArraySumCalculator {
    
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Ожидается 4 строки, получено " + array.length);
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("В строке " + i + " ожидается 4 элемента");
            }
        }
        
        int sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не число в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        
        return sum;
    }
}
