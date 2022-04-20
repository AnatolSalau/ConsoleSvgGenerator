package createDeleteWriteFiles;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToSvg {
    private String pathTofile;
    private String text;

    public WriteToSvg(String pathTofile, String text) {
        this.pathTofile = pathTofile;
        this.text = text;
    }

    public void fileWrite(boolean AppendOrReWrite) {
        try (FileWriter writer = new FileWriter(this.pathTofile, AppendOrReWrite)) {
            // запись всей строки
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
