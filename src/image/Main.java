package image;

import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // JPGファイルをPNG形式に変換
        BufferedImage image = ImageIO.read(new File("minato.jpg"));
        try (FileOutputStream fos = new FileOutputStream(
                "minato.jpg")) {
            ImageIO.write(image, "png", fos);
        }
    }
}
