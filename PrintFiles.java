package com.Assem.Lap4;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class PrintFiles {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayQueue<String> filesToPrint = new ArrayQueue<>(3);
        System.out.println("input file names to print");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            filesToPrint.enqueue(in.next());

        }
        System.out.println("print files in queue");
        while (!filesToPrint.isEmpty()){
            Scanner fileScan = new Scanner(new File(filesToPrint.dequeue()));
            while (fileScan.hasNextLine()){
                System.out.println(fileScan.nextLine());
            }
        }

    }
}
