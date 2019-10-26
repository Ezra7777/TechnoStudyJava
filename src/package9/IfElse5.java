package package9;

import java.util.Scanner;

public class IfElse5<number> {

    // byte -127 < -> 128
    // write a program check what number data type it is?
    // 23 => byte
    //12312=> short
    //3147483647 => long
    //123%@@34234=>Unknown dataType
    // use scanner and if-else statements
    //TODO
    //Hint: byte < short<int< long
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Write a number please :");
        long number = scan.nextLong();

        if (number >= -128 && number <= 127) {
            System.out.println(("DataType is byte"));
        } else if (number >= -32768 && number <= 32768) {
            System.out.println("Data type is short");
        } else if (number >= Integer.MIN_VALUE && number <= Long.MAX_VALUE) {
        System.out.println("DataType is int");
        }else if(number >= -922337203685889L && number <= Long.MAX_VALUE) {
        }

        }





    }




