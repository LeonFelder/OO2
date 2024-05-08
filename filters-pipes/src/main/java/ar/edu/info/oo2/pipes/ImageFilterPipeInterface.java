package ar.edu.info.oo2.pipes;

import java.awt.image.BufferedImage;
import ar.edu.info.oo2.filtros.*;

public interface ImageFilterPipeInterface {
    
    public BufferedImage filter(BufferedImage image);
    public void addFilter(ImageFilter next);
    public void setNextPipe(ImageFilterPipe newPipe);
    public void addPipeFrom(ImageFilterPipe newPipe, ImageFilterPipe aPipe);
    
}
