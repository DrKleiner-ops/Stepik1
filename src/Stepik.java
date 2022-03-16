import java.math.BigInteger;
import java.util.Scanner;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.swap;

public class Stepik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a1 = new int[4], a2 = new int[5];
        int positionA = 0, positionB = 0;
        for (int j = 0; j < 4; j++)
            a1[j] = in.nextInt();
        for (int j = 0; j < 4; j++)
            System.out.print(a1[j]);
        System.out.println();
        for (int j = 0; j < 5; j++)
            a2[j] = in.nextInt();
        for (int j = 0; j < 5; j++)
            System.out.print(a2[j]);
        System.out.println();
        int[] result = new int[a1.length + a2.length];


        while (positionA < a1.length || positionB < a2.length) {
            result[positionA + positionB] = (positionA < a1.length && (positionB == a2.length || a1[positionA] < a2[positionB]) ?
                    a1[positionA++] : a2[positionB++]);

        }
        for (int left = 0; left < result.length; left++) {
            // Вытаскиваем значение элемента
            int value = result[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < result[i]) {
                    result[i + 1] = result[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            result[i + 1] = value;
        }
            for (int j = 0; j < 9; j++)
                System.out.print(result[j]);
            System.out.println();
        }
    }


