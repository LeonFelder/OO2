package ar.edu.info.oo2.filtros;

import java.awt.image.BufferedImage;
import java.awt.Color;
import java.util.Random;

public class Monochrome extends AbstractFilter {
  public BufferedImage filter(BufferedImage image) {
    Random rand = new Random();
    /*int rShift = rand.nextInt(256);
    int bShift = rand.nextInt(256);
    int gShift = rand.nextInt(265);
*/
/*     for (int x = 0; x < image.getWidth(); x++) {
      for (int y = 0; y < image.getHeight(); y++) {
        Color color = new Color(image.getRGB(x, y));
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
        image.setRGB(x, y, ((red+green+blue)/3));
        //        image.setRGB(x, y, (new Color((red+green+blue)/3).getRGB()));
      }
    }*/

    for (int x = 0; x < image.getWidth(); x++) {
      for (int y = 0; y < image.getHeight(); y++) {
        int pixel = image.getRGB(x, y);

        int alpha = (pixel >> 24) & 0xff;
        int red = (pixel >> 16) & 0xff;
        int green = (pixel >> 8) & 0xff;
        int blue = pixel & 0xff;

        int avg = (red + green + blue) / 3;
 
        // replace RGB value with avg
        pixel = (alpha << 24) | (avg << 16) | (avg << 8) | avg;
        image.setRGB(x, y, pixel);
      }
    }
    return image;
  }

  public int shiftValue(int original, int shiftMagnitude) {
    return (original + shiftMagnitude) % 256;
  }
}
