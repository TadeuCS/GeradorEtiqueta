/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class ImagemConfig {

    public ImageIcon getImagemByCaminho(String caminho) {
        ImageIcon imagem = new ImageIcon(caminho);
        if (imagem != null) {
            return imagem;
        } else {
            System.err.println("Não foi possível encontrar o arquivo: " + caminho);
            return null;
        }
    }

    public void carregaImagem(JLabel foto, String caminho, int largura) {
        try {
            foto.setIcon(new ImageIcon(alteraTamanhoImagem(getImagemByCaminho(caminho.replace("\\", "/")).getImage(), largura)));
            foto.revalidate();
            foto.repaint();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a imagem!"+e);
        }
    }

    public Image alteraTamanhoImagem(Image img, int largura) {
        //Calcula a proporção para descobrir a nova altura  
        double proportion = largura / (double) img.getWidth(null);
        int newHeight = (int) (img.getHeight(null) * proportion);

        //Cria a imagem de destino          
        BufferedImage newImage = new BufferedImage(largura, newHeight, BufferedImage.TYPE_INT_ARGB);

        //Desenha sobre ela usando filtro Bilinear (o java não possui trinilear ou anisotrópica).  
        Graphics2D g2d = newImage.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.drawImage(img, 0, 0, largura, newHeight, null);
        g2d.dispose();

        return newImage;
    }

    public void upaImagemByDiretorio(String caminhoOrigem, String caminhoDestino, String nome) {
        FileInputStream origem;
        FileOutputStream destino;

        FileChannel fcOrigem;
        FileChannel fcDestino;

        try {
            origem = new FileInputStream(caminhoOrigem);//arquivo que você quer copiar  
            destino = new FileOutputStream(caminhoDestino + File.separator + nome + ".png");

            fcOrigem = origem.getChannel();
            fcDestino = destino.getChannel();
            fcOrigem.transferTo(0, fcOrigem.size(), fcDestino);//copiando o arquivo e salvando no diretório que você escolheu  
            origem.close();
            destino.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao upar a imagem!"+e);
        }
    }
}
