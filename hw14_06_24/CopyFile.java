package hw14_06_24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
    // 1 уровень сложности: 1. Написать приложение, которое будет копировать
    // информацию из файла в другой файл.
    //Путь к существующему файлу и имя нового файла нужно вводить с клавиатуры.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Путь к существующему файлу: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Имя нового файла: ");
        String destinationPath = scanner.nextLine();

        try {
            copyFile(sourcePath, destinationPath);
            System.out.println("Файл успешно скопирован.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void copyFile(String sourcePath, String destinationPath) throws IOException {
        FileInputStream fis = new FileInputStream(sourcePath);
        FileOutputStream fos = new FileOutputStream(destinationPath);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }

        fis.close();
        fos.close();
    }
}

