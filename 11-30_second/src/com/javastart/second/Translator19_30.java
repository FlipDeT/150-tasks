package com.javastart.second;

public class Translator19_30 {

    public int trans2to8 (int number){
        return translate2to8(number);
    }

    public int translate10to2(int x) {
        int z = 2;
        int result = 0;
        int y;
        int result2 = 0;

        while (z>1) {
            z= x / 2;
            y= x % 2;
            x = z;
            if (y == 0) {
                y = 2;
            }
            result = 10*result + y;
        }
        result = 10*result + 1;
        while (result>0){
            if (result % 10 == 2){
                result2 = 10*result2;
            } else result2 = 10*result2 + 1;
            result = result /10;
        }
        return result2;
    }

    public String  translate10to16(int number10){
        char numbers16[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String number16 = "";
        int remind;

        while (number10 > 0){
            remind = number10%16;
            number16 = numbers16[remind] + number16;
            number10 = number10 / 16;
        }
        return number16;
    }

    public int translate10to8(int number10){
        int full = 8;
        int result = 0;
        int half;
        int number8 = 0;
        while (full>7) {
            full= number10 / 8;
            half= number10 % 8;
            number10 = full;
            if (half == 0) {
                half = 9;
            }
            result = 10*result + half;
        }
        result = 10*result + full;
        while (result>0){
            if (result % 10 == 9){
                number8 = 10*number8;
            } else number8 = 10*number8 + result % 10;
            result = result /10;
        }
        return number8;
    }

    public int translate2to10 (int number2) {
        int number10 = 0;
        int k = 0;
        while (number2 > 0){
            number10 = number10 + number2 % 10 * (int)Math.pow(2,k);
            k = k + 1;
            number2 = number2 / 10;
        }
        return number10;
    }

    public String translate2to16 (int number2){
        String number16 = "";
        char nums16[] ={'0','1','2','3','4','5','5','7','8','9','A','B','C','D','E','F'};
        while (number2 > 0){
            number16 = nums16[translate2to10(number2%10000)] + number16;
            number2 = number2 / 10000;
        }
        return number16;
    }

    private int translate2to8 (int number2) {
        int number8 = 0, k = 0;
        while (number2 > 0){
            number8 = number8 + (int) Math.pow(10,k) * translate2to10(number2%1000);
            number2 = number2 / 1000;
            k = k + 1;
        }
        return number8;
    }

    public int translate8to10 (int number8) {
        int number10 = 0;
        int k = 0;
        while (number8 > 0) {
            number10 = number10 + number8 % 10 * (int)Math.pow(8,k);
            k = k+1;
            number8 = number8 / 10;
        }
        return number10;
    }

    public int translate8to2 (int number8) {
        return translate10to2(translate8to10(number8));
    }

    public String translate8to16 (int number8) {
        return translate10to16(translate8to10(number8));
    }

    public long translate16to10 (String number16) {
        long number10 = 0;
        int l = number16.length();
        int k = 0;
        char nums16[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (l > 0) {
            for (int i = 0; i < 16; i++) {
                if (nums16[i] == number16.charAt(l-1)){
                    number10 = number10 + i * (long) Math.pow(16,k);
                    k = k+1;
                    break;
                }
            }
            number16 = number16.substring(0,l-1);
            l = l - 1;
        }
        return number10;
    }

    public long translate16to2 (String number16) {
        return translate10to2((int) translate16to10(number16));
    }

    public long translate16to8 (String number16) {
        return translate10to8((int)translate16to10(number16));
    }
}
