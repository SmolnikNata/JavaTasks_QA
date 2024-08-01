package recursiveDeleteFolder07_06_24;

import java.io.File;
import java.util.Scanner;

public class DeleteFolderWithRecursive {
    //1 уровень сложности: Написать приложение, которое будет удалять папку из файловой системы вместе со всеми вложениями (другие папки, файлы).
    //Путь к удаляемой папке нужно вводить с клавиатуры
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к папке для удаления: ");
        String folderPath = scanner.nextLine();

        // метод для удаления папки
        deleteFolder(new File(folderPath));

        System.out.println("Папка успешно удалена.");
    }

    public static void deleteFolder(File folder) {
        if (folder.isDirectory()) {

            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    deleteFolder(file);
                }
            }
        }

        folder.delete();
    }
}



