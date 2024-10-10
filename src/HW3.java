//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HW3 {
    public static void main(String[] args) {
        float[] numbers = new float[15];
        numbers[0] = 1.5f;
        numbers[1] = 3.6f;
        numbers[2] = -2.4f;
        numbers[3] = 8.1f;
        numbers[4] = -2.2f;
        numbers[5] = 2.9f;
        numbers[6] = 9.1f;
        numbers[7] = -3.1f;
        numbers[8] = 0.3f;
        numbers[9] = -11.2f;
        numbers[10] = -13.5f;
        numbers[11] = 11.5f;
        numbers[12] = -12.5f;
        numbers[13] = 12.9f;
        numbers[14] = -15.9f;
        System.out.println("Массив чисел");
        System.out.print("(");
        for (float number : numbers) {
            System.out.print(number + " ");
        }
        System.out.print(")");
        boolean firstNegativeFound = false;
        float sum = 0.0f;
        int count = 0;
        for (float number : numbers) {
            if (!firstNegativeFound) {
                if (number < 0) {
                    firstNegativeFound = true;
                } else {
                    if (number > 0) {
                        sum += number;
                        count++;
                    }
                }
            }
        }
                    if (count > 0) {
                        float average = sum / count;
                        System.out.println(" Среднее арифметическое число" + average);
                    }
                }
            }
