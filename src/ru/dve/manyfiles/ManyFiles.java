package ru.dve.manyfiles;
import java.io.*;
import java.util.*;

/**
 * Created by g15oit18 on 28.04.2017.
 */
public class ManyFiles {
    public static void main(String[] args) throws IOException{
        Random random = new Random();
        File file = new File ("intdata.dat");
        BufferedWriter numbers = new BufferedWriter(new FileWriter(file));
        for (int i=0;i<200; i++){
            numbers.write(String.valueOf(random.nextInt(999999)));
            numbers.write("\r\n");
        }
        numbers.close();

    }

}
