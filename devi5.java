package sample;
import java.awt.image.BufferedImage;
public class devi5 {


		 private BufferedImage image;
		    private int[][]rgbValue;       

		    public void setRgbValue(BufferedImage image){
		        int width = image.getWidth();
		        int height = image.getHeight();

		        rgbValue = new int[width*height][3];
		        int counter = 0;
		        for(int i=0 ; i<width ; i++){
		            for(int j=0 ; j<height ; j++){
		                int color = image.getRGB(i, j);
		                int red = (color & 0x00ff0000) >> 16;
		                int green = (color & 0x0000ff00) >> 8;
		                int blue = (color & 0x000000ff);
		                rgbValue[counter][0] = red;
		                rgbValue[counter][1] = green;
		                rgbValue[counter][2] = blue;
		                counter++;           
		            }        
		        }
		    }
	}


