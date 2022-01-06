package filereadwrite;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("data.txt");) {
            int input = fr.read();
            while (input != -1) {
                System.out.println((char)input);
                input = fr.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try(FileWriter fw = new FileWriter("data.txt");) {
            fw.write('そ');
            fw.write('れ');
            fw.write('で');
            fw.write('は');
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
