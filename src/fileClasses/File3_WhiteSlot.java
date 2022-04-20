package fileClasses;

import java.util.Objects;

public class File3_WhiteSlot {
    private String text;

    public File3_WhiteSlot() {
        this.text = """
                <!--RectWhite1 Start -->
                 						<rect class="fil1 str1" transform="matrix
                 						(0.707106 -0.707106 0.707106 0.707106\s
                 						100.38
                 						102.41
                 						)
                 						" width="
                 						1.05
                 						" height="
                 						2.3
                 						"/>
                 						<circle class="fil1" cx="
                 						100.751
                 						" cy="
                 						102.039
                 						" r="
                 						0.525
                 						"/>
                 						<circle class="fil1" cx="
                 						102.378
                 						" cy="
                 						103.665
                 						" r="
                 						0.525
                 						"/>
                 						<!--RectWhite1 End -->
                """;
    }
    public File3_WhiteSlot(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File3_WhiteSlot that = (File3_WhiteSlot) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
