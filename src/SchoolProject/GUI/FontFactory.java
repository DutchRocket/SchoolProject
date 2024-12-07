package SchoolProject.GUI;

import java.awt.*;

public class FontFactory {
    public static Font create(int fontSize) {
        return new Font("TimesRoman", Font.PLAIN, fontSize);
    }

    public static Font createBold(int fontSize) {
        return new Font("TimesRoman", Font.BOLD, fontSize);
    }
}
