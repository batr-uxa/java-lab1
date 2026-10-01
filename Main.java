import java.util.Scanner;

class lab1 {
    public double fraction (double x) {
        return x - (int) x;
    }
    public int sumLastNums (int x) {
        x = Math.abs(x);
        return x % 10 + x / 10 % 10;
    }
    public int charToNum (char x) {
        if ((int) x >=48 && (int) x <= 57) return (int) x - 48;
        return 10;
    }
    public boolean isPositive (int x) {
        return x > 0;
    }
    public boolean is2Digits (int x) {
        x = Math.abs(x);
        return x > 9 && x < 100;
    }
    public int abs (int x) {
        if (x < 0) return x * -1;
        return x;
    }
    public double safeDiv (int x, int y) {
        if (y == 0) return 0;
        return x / y;
    }
    public boolean is35 (int x) {
        if (x % 15 == 0) return false;
        if (x % 3 == 0 || x % 5 == 0) return true;
        return false;
    }
    public String makeDecision (int x, int y) {
        if (x == y) return x + "==" + y;
        if (x > y) return x + ">" + y;
        return x + "<" + y;
    }
    public int max3 (int x, int y, int z) {
        if (y > x) x = y;
        if (z > x) x = z;
        return x;
    }
    public String listNums (int x) {
        if (x < 0 ) return "Число должно быть больше 0";
        String s = "";
        for (int i = 0; i <= x; i++) {
            s = s + i + " ";
        }
        return s;
    }
    public String reverseListNums (int x) {
        if (x < 0 ) return "Число должно быть больше 0";
        String s = "";
        for (int i = x; i >= 0; i--) {
            s = s + i + " ";
        }
        return s;
    }
    public String chet (int x) {
        if (x < 0 ) return "Число должно быть больше 0";
        String s = "";
        for (int i = 0; i <= x; i += 2) {
            s = s + i + " ";
        }
        return s;
    }
    public int pow (int x, int y) {
        int p = 1;
        for (int i = 0; i < y; i++) {
            p *= x;
        }
        return p;
    }
    public int numLen (long x) {
        int len = 0;
        while (Math.abs(x) > 0) {
            x /= 10;
            len +=1;
        }
        return len;
    }
    public int findFirst (int[] arr, int x) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public int findLast (int[] arr, int x) {
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    public int maxAbs (int[] arr) {
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(m) < Math.abs(arr[i])) m = arr[i];
        }
        return m;
    }
    public int[]add (int[] arr, int x, int pos) {
        int[] add = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (pos == i) {
                add[j] = x;
                j += 1;
            }
            if (i < arr.length) {
                add[j] = arr[i];
                j += 1;
            }

        }
        return add;
    }
    public int[] add2 (int[] arr, int[] ins, int pos) {
        int[] add2 = new int[arr.length + ins.length];
        int p = 0;
        for (int i = 0; i <= arr.length; i++) {
            if (pos == i) {
                for (int j = 0; j < ins.length; j++) {
                    add2[p] = ins[j];
                    p += 1;
                }
            }
            if (i < arr.length) {
                add2[p] = arr[i];
                p += 1;
            }
        }
        return add2;
    }
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = 10;
        int ex = 10;
        while (z != -1) {
            System.out.println("Введиете номер:\n 1. Методы\n 2. Условия\n 3. Циклы\n 4. Массивы\n Чтобы выйти введите -1: ");
            z = scanner.nextInt();
            if (z == 1) {
                while (ex != 0) {
                    System.out.println("Введите номер задачи 1-5\n Чтобы вернуться введите 0: ");
                    ex = scanner.nextInt();
                    if (ex == 1) {
                        System.out.println("Введите вещественное число черезе запятую: ");
                        double num1 = scanner.nextDouble();
                        System.out.println(fraction(num1));
                    }
                    if (ex == 2) {
                        System.out.println("Введите целое число, не менее двух цифр: ");
                        int num2 = scanner.nextInt();
                        if (Math.abs(num2) < 10) System.out.println("Число не подходит");
                        else System.out.println(sumLastNums(num2));
                    }
                    if (ex == 3) {
                        System.out.println("Введите 1 символ от 0 до 10: ");
                        char num3 = scanner.next().charAt(0);
                        int charn = charToNum(num3);
                        if (charn > 9) System.out.println("Символ не подходит");
                        else System.out.println(charn);
                    }
                    if (ex == 4) {
                        System.out.println("Введите число");
                        int num4 = scanner.nextInt();
                        System.out.println(isPositive(num4));
                    }
                    if (ex == 5) {
                        System.out.println("Введите число");
                        int num5 = scanner.nextInt();
                        System.out.println(is2Digits(num5));
                    }
                }
                ex = 10;
            }
            if (z == 2) {
                while (ex != 0) {
                    System.out.println("Введите номер задачи 1-5\n Чтобы вернуться введите 0: ");
                    ex = scanner.nextInt();
                    if (ex == 1) {
                        System.out.println("Введите число: ");
                        int num2_1 = scanner.nextInt();
                        System.out.println(abs(num2_1));
                    }
                    if (ex == 2) {
                        System.out.println("Введите x y: ");
                        int x_2 = scanner.nextInt();
                        int y_2 = scanner.nextInt();
                        System.out.println("x / y = " + safeDiv(x_2, y_2));
                    }
                    if (ex == 3) {
                        System.out.println("Введите x: ");
                        int num2_3 = scanner.nextInt();
                        System.out.println(is35(num2_3));
                    }
                    if (ex == 4) {
                        System.out.println("Введите x y: ");
                        int x_4 = scanner.nextInt();
                        int y_4 = scanner.nextInt();
                        System.out.println(makeDecision(x_4, y_4));
                    }
                    if (ex == 5) {
                        System.out.println("Введите x y z: ");
                        int x_5 = scanner.nextInt();
                        int y_5 = scanner.nextInt();
                        int z_5 = scanner.nextInt();
                        System.out.println(max3(x_5, y_5, z_5));
                    }
                }
                ex = 10;
            }
            if (z == 3) {
                while (ex != 0) {
                    System.out.println("Введите номер задачи 1-5\n Чтобы вернуться введите 0: ");
                    ex = scanner.nextInt();
                    if (ex == 1) {
                        System.out.println("Введите x: ");
                        int num4 = scanner.nextInt();
                        System.out.println(listNums(num4));
                    }
                    if (ex == 2) {
                        System.out.println("Введите x: ");
                        int num4_2 = scanner.nextInt();
                        System.out.println(reverseListNums(num4_2));
                    }
                    if (ex == 3) {
                        System.out.println("Введите x: ");
                        int num4_3 = scanner.nextInt();
                        System.out.println(chet(num4_3));
                    }
                    if (ex == 4) {
                        System.out.println("Введите x y: ");
                        int x4 = scanner.nextInt();
                        int y4 = scanner.nextInt();
                        if (y4 < 0) System.out.println("Степень не может быть отрицательной");
                        else System.out.println(pow(x4, y4));
                    }
                    if (ex == 5) {
                        System.out.println("Введите x: ");
                        long num4_5 = scanner.nextLong();
                        System.out.println(numLen(num4_5));
                    }
                }
                ex = 10;
            }
            if (z == 4) {
                while (ex != 0) {
                    System.out.println("Введите номер задачи 1-5\n Чтобы вернуться введите 0: ");
                    ex = scanner.nextInt();
                    if (ex == 1) {
                        System.out.println("Введите x");
                        int x51 = scanner.nextInt();
                        System.out.println("Введите кол-во чисел массива");
                        int n51 = scanner.nextInt();
                        while (n51 < 1) {
                            System.out.println("кол-во чисел в массиве не может быть меньше 1");
                            n51 = scanner.nextInt();
                        }
                        System.out.println("Введите числа");
                        int[] arr = new int[n51];
                        for (int i = 0; i < n51; i++) {
                            int m51 = scanner.nextInt();
                            arr[i] = m51;
                        }
                        System.out.println(findFirst(arr, x51));
                    }
                    if (ex == 2) {
                        System.out.println("Введите x");
                        int x52 = scanner.nextInt();
                        System.out.println("Введите кол-во чисел массива");
                        int n52 = scanner.nextInt();
                        while (n52 < 1) {
                            System.out.println("кол-во чисел в массиве не может быть меньше 1");
                            n52 = scanner.nextInt();
                        }
                        System.out.println("Введите числа");
                        int[] arr2 = new int[n52];
                        for (int i = 0; i < n52; i++) {
                            int m52 = scanner.nextInt();
                            arr2[i] = m52;
                        }
                        System.out.println(findLast(arr2, x52));
                    }
                    if (ex == 3) {
                        System.out.println("Введите кол-во чисел массива");
                        int n53 = scanner.nextInt();
                        while (n53 < 1) {
                            System.out.println("кол-во чисел в массиве не может быть меньше 1");
                            n53 = scanner.nextInt();
                        }
                        System.out.println("Введите числа");
                        int[] arr3 = new int[n53];
                        for (int i = 0; i < n53; i++) {
                            int m52 = scanner.nextInt();
                            arr3[i] = m52;
                        }
                        System.out.println(maxAbs(arr3));
                    }
                    if (ex == 4) {
                        System.out.println("Введите x");
                        int x54 = scanner.nextInt();
                        System.out.println("Введите кол-во чисел массива");
                        int n54 = scanner.nextInt();
                        while (n54 < 1) {
                            System.out.println("кол-во чисел в массиве не может быть меньше 1");
                            n54 = scanner.nextInt();
                        }
                        System.out.println("Введите числа");
                        int[] arr4 = new int[n54];
                        for (int i = 0; i < n54; i++) {
                            int m54 = scanner.nextInt();
                            arr4[i] = m54;
                        }
                        System.out.println("Введите pos");
                        int pos = scanner.nextInt();
                        while (!(0 <= pos && pos <= n54)) {
                            System.out.println("pos принимает значение от 0 до указанного кол-ва чисел массива");
                            pos = scanner.nextInt();
                        }
                        int[] ad = add(arr4, x54, pos);
                        String s4 = "";
                        for (int i = 0; i < ad.length; i++) {
                            s4 = s4 + ad[i] + " ";
                        }
                        System.out.println(s4);
                    }
                    if (ex == 5) {
                        System.out.println("Введите кол-во чисел массива1");
                        int n55 = scanner.nextInt();
                        while (n55 < 1) {
                            System.out.println("кол-во чисел в массиве не может быть меньше 1");
                            n55 = scanner.nextInt();
                        }
                        System.out.println("Введите числа");
                        int[] arr5 = new int[n55];
                        for (int i = 0; i < n55; i++) {
                            int m55 = scanner.nextInt();
                            arr5[i] = m55;
                        }
                        System.out.println("Введите pos");
                        int pos2 = scanner.nextInt();
                        while (!(0 <= pos2 && pos2 <= n55)) {
                            System.out.println("pos принимает значение от 0 до указанного кол-ва чисел массива");
                            pos2 = scanner.nextInt();
                        }
                        System.out.println("Введите кол-во чисел массива2");
                        int n56 = scanner.nextInt();
                        while (n56 < 1) {
                            System.out.println("кол-во чисел в массиве не может быть меньше 1");
                            n56 = scanner.nextInt();
                        }
                        System.out.println("Введите числа");
                        int[] ins = new int[n56];
                        for (int i = 0; i < n56; i++) {
                            int m56 = scanner.nextInt();
                            ins[i] = m56;
                        }
                        int[] ad2 = add2(arr5, ins, pos2);
                        String s5 = "";
                        for (int i = 0; i < ad2.length; i++) {
                            s5 = s5 + ad2[i] + " ";
                        }
                        System.out.println(s5);
                    }
                }
                ex = 10;
            }
        }
    }
}