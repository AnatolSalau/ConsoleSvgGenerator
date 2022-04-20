package fileClasses;

import java.util.Objects;

public class File1_TopFile {
    private String text;

    public File1_TopFile() {
        this.text = """
                <?xml version="1.0" encoding="UTF-8"?>
                <!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
                <!-- Creator: CorelDRAW 2020 (64-Bit) -->
                <svg xmlns="http://www.w3.org/2000/svg" xml:space="preserve" width="320mm" height="280mm" version="1.1" style="shape-rendering:geometricPrecision; text-rendering:geometricPrecision; image-rendering:optimizeQuality; fill-rule:evenodd; clip-rule:evenodd"
                viewBox="0 0 320 280"
                 xmlns:xlink="http://www.w3.org/1999/xlink"
                 xmlns:xodm="http://www.corel.com/coreldraw/odm/2003">
                 <defs>
                	  <style type="text/css">
                	   <![CDATA[
                		.str1 {stroke:black;stroke-width:0;stroke-miterlimit:22.9256}
                		.str0 {stroke:black;stroke-width:0;stroke-miterlimit:22.9256}
                		.fil1 {fill:white}
                		.fil0 {fill:black}
                	   ]]>
                	  </style>
                 </defs>
                	   <g id="RectBlack">
                		 <g id="Layer_x0020_1_0">
                		  <metadata id="CorelCorpID_1Corel-Layer"/>
                """;
    }
    public File1_TopFile(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File1_TopFile that = (File1_TopFile) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
