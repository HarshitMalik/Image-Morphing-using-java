package imgMorphing;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class main {

	public static void main(String[] args) {
		  File orgimg1 = new File("Andrew.jpg");
		  File orgimg2 = new File("emma.jpg");
	       
		  BufferedImage img1 = null,img2 = null;
	       try {
			img1= ImageIO.read(orgimg1);
			img2= ImageIO.read(orgimg2);
			
			BufferedImage imgmorph1 = new BufferedImage(img1.getWidth(),img1.getHeight(),BufferedImage.TYPE_INT_RGB);
			BufferedImage imgmorph2 = new BufferedImage(img1.getWidth(),img1.getHeight(),BufferedImage.TYPE_INT_RGB);
			BufferedImage imgmorph3 = new BufferedImage(img1.getWidth(),img1.getHeight(),BufferedImage.TYPE_INT_RGB);
			BufferedImage imgmorph4 = new BufferedImage(img1.getWidth(),img1.getHeight(),BufferedImage.TYPE_INT_RGB);
			BufferedImage imgmorph5 = new BufferedImage(img1.getWidth(),img1.getHeight(),BufferedImage.TYPE_INT_RGB);
			BufferedImage imgmorph6 = new BufferedImage(img1.getWidth(),img1.getHeight(),BufferedImage.TYPE_INT_RGB);
			
			for(int i=0;i<img1.getHeight();i++)
			{
				for(int j=0;j<img1.getWidth();j++)
				{
					Color c1= new Color(img1.getRGB(j, i));
					Color c2= new Color(img2.getRGB(j, i));
					
					int r1=c1.getRed();
					int g1=c1.getGreen();
					int b1=c1.getBlue();
					int a1=c1.getAlpha();
					
					int r2=c2.getRed();
					int g2=c2.getGreen();
					int b2=c2.getBlue();
					int a2=c2.getAlpha();
					
					int dr,dg,db,da;
					dr=(r2-r1)/7;
					dg=(g2-g1)/7;
					db=(b2-b1)/7;
					da=(a2-a1)/7;
					
					Color C1= new Color(r1+dr,g1+dg,b1+db,a1+da);
					Color C2= new Color(r1+2*dr,g1+2*dg,b1+2*db,a1+2*da);
					Color C3= new Color(r1+3*dr,g1+3*dg,b1+3*db,a1+3*da);
					Color C4= new Color(r1+4*dr,g1+4*dg,b1+4*db,a1+4*da);
					Color C5= new Color(r1+5*dr,g1+5*dg,b1+5*db,a1+5*da);
					Color C6= new Color(r1+6*dr,g1+7*dg,b1+6*db,a1+6*da);
					
					
					
					imgmorph1.setRGB(j, i, C1.getRGB());
					imgmorph2.setRGB(j, i, C2.getRGB());
					imgmorph3.setRGB(j, i, C3.getRGB());
					imgmorph4.setRGB(j, i, C4.getRGB());
					imgmorph5.setRGB(j, i, C5.getRGB());
					imgmorph6.setRGB(j, i, C6.getRGB());
				}
			}
		ImageIO.write(imgmorph1, "jpg", new File("B:\\JAVA\\Images\\imgMorph1.jpg"));
		ImageIO.write(imgmorph2, "jpg", new File("B:\\JAVA\\Images\\imgMorph2.jpg"));
		ImageIO.write(imgmorph3, "jpg", new File("B:\\JAVA\\Images\\imgMorph3.jpg"));
		ImageIO.write(imgmorph4, "jpg", new File("B:\\JAVA\\Images\\imgMorph4.jpg"));
		ImageIO.write(imgmorph5, "jpg", new File("B:\\JAVA\\Images\\imgMorph5.jpg"));
		ImageIO.write(imgmorph6, "jpg", new File("B:\\JAVA\\Images\\imgMorph6.jpg"));
	       } catch (IOException e) {
		
			e.printStackTrace();
		}
		}

	}
