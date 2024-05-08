package ar.edu.info.oo2.filtros;

import java.awt.image.BufferedImage;

public abstract class AbstractFilter implements ImageFilter{
  abstract public BufferedImage filter(BufferedImage image);
}
