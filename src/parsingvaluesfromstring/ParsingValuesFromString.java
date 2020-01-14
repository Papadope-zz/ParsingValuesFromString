package parsingvaluesfromstring;

import java.util.Scanner;

public class ParsingValuesFromString {

    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsString= " +numberAsString);
        
        double number = Double.parseDouble(numberAsString);
        System.out.println("number= " + number);
        
        numberAsString += 1;
        number += 1;
        
        System.out.println("numberAsString= " + numberAsString);
        System.out.println("number= " + number);
        System.out.println(canPack(1, 0, 6));
    }
    
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if (goal / 5 <= bigCount){
            return (goal % 5 <= smallCount);
        }else{
            return goal - 5 * bigCount <= smallCount;
        }
    }
    
    
}
