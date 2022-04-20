package fileClasses;

import java.util.ArrayList;
import java.util.Objects;

public class PartsOfSVG {
    private String defaultText;
    private ArrayList <String> textCurrentInstance;

    public PartsOfSVG() {
        this.defaultText = null;
        this.textCurrentInstance = new ArrayList<>(10);
    }
    public PartsOfSVG(String defaultText, int capacity) {
        this.defaultText = defaultText;
        this.textCurrentInstance = new ArrayList<>(capacity);
    }
    public PartsOfSVG(String defaultText) {
        this.defaultText = defaultText;
        this.textCurrentInstance = new ArrayList<>(10);
    }

    public ArrayList <String> getTextCurrentInstance() {
        return this.textCurrentInstance;
    }

    public void addToTextCurrentInstanceFromObject(PartsOfSVG partsOfSVG) {
        ArrayList <String> currentArrayText = partsOfSVG.getTextCurrentInstance();
        for (String value:currentArrayText) {
            this.textCurrentInstance.add(value);
        }
    }

    public void consolePrinttextCurrentInstance() {
        for (String val: this.textCurrentInstance) {
            System.out.printf(val);
        }
    }


    public String getDefaultText() {
        return defaultText;
    }

    public void setDefaultText(String defaultText) {
        this.defaultText = defaultText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartsOfSVG that = (PartsOfSVG) o;
        return Objects.equals(defaultText, that.defaultText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultText);
    }
}
