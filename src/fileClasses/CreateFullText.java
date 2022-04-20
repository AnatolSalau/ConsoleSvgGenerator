package fileClasses;

import java.util.ArrayList;

public class CreateFullText {
    private ArrayList <String> fullText;

    public CreateFullText() {
         fullText = new ArrayList<>();
    }

    public CreateFullText(int capacityArrayList) {
        fullText = new ArrayList<>(capacityArrayList);
    }

    public void addStringToArrayList(String text) {
        this.fullText.add(text);
    }
    public void addTextFromObject (PartsOfSVG file) {
        this.fullText.add(file.getDefaultText());
    }


    public ArrayList<String> getFullText() {
        return fullText;
    }
}
