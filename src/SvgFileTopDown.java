public enum SvgTopDown {
    TOP("""
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
            """),
    DOWN("""
            	  </g>
            </svg>
                        
            """);
    private String text;

    SvgTopDown(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
