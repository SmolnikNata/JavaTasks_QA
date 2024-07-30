package hw14_06_24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class DirectoryCopy {
    public static void main(String[] args) {
        //2*. Написать приложение, которое будет копировать содержимое одной папки
        // в другую со всеми вложениями (другие папки, файлы).
        //Путь к существующей папке и имя новой папки нужно вводить с клавиатуры.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Путь к существующей папке: ");
        String sourceDir = scanner.nextLine();

        System.out.print("Путь к новой папке: ");
        String destinationDir = scanner.nextLine();

        try {
            copyDirectory(Paths.get(sourceDir), Paths.get(destinationDir));
            System.out.println("Папка  скопирована.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void copyDirectory(Path source, Path destination) throws IOException {
        Files.walk(source).forEach(path -> {
            try {
                Path targetPath = destination.resolve(source.relativize(path));
                if (Files.isDirectory(path)) {
                    Files.createDirectories(targetPath);
                } else {
                    Files.copy(path, targetPath, StandardCopyOption.REPLACE_EXISTING);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}

