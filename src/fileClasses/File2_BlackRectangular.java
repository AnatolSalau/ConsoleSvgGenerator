package fileClasses;

import java.util.Objects;

public class File2_BlackRectangular {
    private String text;

    public File2_BlackRectangular() {
        this.text = """
                <!-- x="104" y="17" координаты верхнего левого угла черного основания -->
                	  <!---RectBlack Start------->
                	  <rect class="fil0 str0" x="
                	  100
                	  " y="
                	  99
                	  " width="
                	  5.4
                	  " height="
                	  15
                	  "/>
                	  <!---RectBlack End------->\s
                			<!---RectWhite Start------->\s
                		  <g id="Rect_inclined_red_x0020__x2014__x0020_03.svg">
                			   <g id="RectWhite">	
                			   <!-- угл поворота: cos, -sin, sin, cos, x левый верхний угол, y левый верхний угол\s
                					ширина, длина-->
                """;
    }
    public File2_BlackRectangular(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File2_BlackRectangular that = (File2_BlackRectangular) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
