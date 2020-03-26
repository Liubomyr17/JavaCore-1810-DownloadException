package com.company;

/*
1810 DownloadException
1 Read file names from the console.
2 If the file is less than 1000 bytes, then:
2.1 Close the streams of work with files.
2.2 Throw a DownloadException.

Requirements:
1. The program should read the file names from the console.
2. To read from files, use the FileInputStream stream.
3. The program should work until the entered file is less than 1000 bytes.
4. The program should end with a DownloadException exception.
5. Stream FileInputStream should be closed.
 */

import com.sun.deploy.net.DownloadException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;




public class Solution {
    public static void main(String[] args) throws DownloadException, IOException  {
        final int MAGIC_SIZE = 1000;
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filename = reader.readLine();
            FileInputStream f = new FileInputStream(filename);
            int size = f.available();
            f.close();
            reader.close();
            if (size < MAGIC_SIZE)
                throw new DownloadException();
        }
    }
    public static class DownloadException extends Exception {}
}
