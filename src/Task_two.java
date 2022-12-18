import java.util.Scanner;

public class Task_two {
    // Heinrich Borisow (lgbor)

//First level: Задание №1.
//Перевести число 333 из шестнадцатиричной в десятичную
// Делаем со сканером

        public static void main(String[] args) {

            //    Разложить число 200345 на разряды в десятичной системе
            //    Im Process

            // Перевести число из шестнадцатиричн в десятичн ( 16->10)
            Scanner scan = new Scanner(System.in);
            System.out.println ("Смертные, введите 16-тиричное число");
            String chislo = scan.nextLine();
            int decChislo = Integer.parseInt (chislo, 16);
            System.out.println ("Вот вам это число в десятичой системе  "  + decChislo );

            //Перевести число из двоичной в десятичнуюб контроль 2...10,  11100111... 231
            Scanner sc = new Scanner(System.in);
            System.out.println ("Смертные, введите 2 - ичнное число");
            String dwChislo = sc.nextLine();
            int decChislo1 = Integer.parseInt (dwChislo, 2);
            System.out.println ("Вот вам это число в десятичой системе  "  + decChislo1 );

            //Перевод десятичного числа в 2-, 8-, 16-тиричную чистему
            String str;
            int ii;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите любое целочисленное число, 0 для выхода");
            str = scanner.nextLine();
            ii = Integer.parseInt(str); //переводим число из консоли из Стринг в интегер
            System.out.println("Число " + ii + " в двоичной форме: " +
                    Integer.toBinaryString(ii));
            System.out.println("Число " + ii + " в восьмеричной форме: " +
                    Integer.toOctalString(ii));
            System.out.println("Число " + ii + " в шестнадцатеричной форме: " +
                    Integer.toHexString(ii));

        }

    }


