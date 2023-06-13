package kr.icehs.iscience;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int numerator = scanner.nextInt(); //input mismatch
            int denominator = scanner.nextInt(); //input mismatch
            System.out.println(numerator/denominator); // arithmetic error
        }catch (InputMismatchException err){
            System.out.println("input data must be integer!");
            System.out.println(err.getMessage());
        }catch (ArithmeticException err){
            System.out.println("The denominator cannot be zero!");
            System.out.println(err.getMessage());
        }catch (Exception other){
            System.out.println("Error Occured!");
            System.out.println(other.getMessage());
        }finally {
            System.out.println("Exit!");
        }
        System.out.println("Program terminated");
    }
}
