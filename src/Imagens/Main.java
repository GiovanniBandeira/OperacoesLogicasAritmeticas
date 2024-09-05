package Imagens;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String img1 = "src\\Imagens\\img_.png";
        String img2 = "src\\Imagens\\img_1.png";
        BufferedImage imagem1 = ImageIO.read(new File(img1));
        BufferedImage imagem2 = ImageIO.read(new File(img2));

        int w = imagem1.getWidth();
        int h = imagem1.getHeight();

        BufferedImage imagem = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);

        for(int lin = 0; lin < w; lin++){
            for(int col = 0; col < h; col++){
                int rgb = imagem1.getRGB(lin, col);
                Color color = new Color(rgb);

                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                int cal = (red + green + blue) / 3;

                imagem1.setRGB(lin, col, new Color(cal, cal, cal).getRGB());

            }
        }
        for(int lin = 0; lin < w; lin++){
            for(int col = 0; col < h; col++){
                int rgb = imagem2.getRGB(lin, col);
                Color color = new Color(rgb);

                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                int cal = (red + green + blue) / 3;

                imagem2.setRGB(lin, col, new Color(cal, cal, cal).getRGB());

            }
        }


        for(int lin = 0; lin < w; lin++){
            for(int col = 0; col < h; col++){
                imagem.setRGB(lin, col, imagem1.getRGB(lin, col) + imagem2.getRGB(lin, col) );
            }
        }
        ImageIO.write(imagem1, "png", new File("src\\Imagens\\img1Cinza.png"));
        ImageIO.write(imagem2, "png", new File("src\\Imagens\\img2Cinza.png"));
        ImageIO.write(imagem, "png", new File("src\\Imagens\\imgNova.png"));
    }
}
