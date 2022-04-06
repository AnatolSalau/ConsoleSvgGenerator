import java.io.File;

public class CreateSvgFIle {
    private String fullFilePath = "out" + File.separator +"SVG.svg";
    // Возьмите файл
    File newFileSVG = new File(fullFilePath);
    public void createFile() {
        try {
            //Создайте новый файл
            // Убедитесь, что он не существует
            if (newFileSVG.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
    public void deleteFile() {
        try {
            //Удалите новый файл
            if (newFileSVG.delete())
                System.out.println("File created");
            else
                System.out.println("File cant't deleted");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
