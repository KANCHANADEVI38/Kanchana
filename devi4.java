package sample;
import java.awt.*; 

import javax.swing.*; 
  
public class devi4 {
	public class colorBlend extends JApplet
	
	
		 
		 
		/** 
		 * Class ColorBlend - Draws a color blend using 
		 * two colors that the user selected. 
		 *  
		 * @author Me 
		 * @version February 8, 2011 
		 */
		 
		
		 
		{ 
		    Color left, right; 
		     
		     /** 
		     * Called by the browser or applet viewer to inform this JApplet that it 
		     * has been loaded into the system. It is always called before the first  
		     * time that the start method is called. 
		     */
		    public void init() 
		    { 
		        // Allow the user to select two colors. 
		          
		        left  = JColorChooser.showDialog(colorBlend.this, "Pick the first color",  Color.WHITE); 
		        right = JColorChooser.showDialog(colorBlend.this, "Pick the second color", Color.BLACK); 
		    } 
		  
		  
		    public void paint(Graphics g) 
		    { 
		         // Clear the background to a nice neutral color.  (Color.GRAY) 
		        g.setColor(Color.GRAY);
		        g.fillRect(0,0, this.getWidth(), this.getHeight());
		                
		            g.setColor (left); 
		           // g.fillRect (0, 0, 100, 100); 
		              
		            g.setColor (right); 
		            //g.fillRect (100, 0, 100, 100);
		 
		            //values for left color
		            float Lr = left.getRed();
		            int Lg = left.getGreen();
		            int Lb = left.getBlue();
		 
		            //values for right color
		            int Rr = right.getRed();
		            int Rg = right.getGreen();
		            int Rb = right.getBlue();
		             
		             
		            int count = 0;  // Left = ((steps-1)-count) / (count -1)   Right = 1/(steps -1)  Left * % + right * %
		            int steps =20;
		            float leftP;
		            float rightP;
		            int x = 0, y =0;
		        //this loop does the computations to fill each rectangle appropriately with the gradient colors
		        while(count<=20)                                 
		        {
		                //these two lines were a "hint" from the TA.. I don't know how accurate or anything they are
		            leftP = ((steps - 1) - count); 
		            rightP = 1/(steps - 1);
		 
		            g.setColor(right);          
		            g.drawRect(x, y, 20, 100);
		            g.fillRect(x, y, 20, 100);
		             
		            g.setColor(Color.BLACK);    //rectangle overlays
		            g.drawRect(x, y, 20, 100);
		             
		            x+=20;
		    
		            count ++;
		             
		        } 
		    }
		}

	}


