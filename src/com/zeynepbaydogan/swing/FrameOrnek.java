package com.zeynepbaydogan.swing;
import javax.swing.*;
public class FrameOrnek {
	public static void main(String[] args) {
		// JFrame uygulamanın ana penceresini oluşturur.
		JFrame pencere = new JFrame("İlk Swing Pencerem");
		// JLabel: Pencerenin içinde sabit yazı gösterir.
		JLabel mesaj = new JLabel("Merhaba Swing");
		// Yazıyı ana pencerenin içine yerleştir.
		pencere.add(mesaj);
		// setSize(genişlik,yükseklik): Pencere boyutu.
		pencere.setSize(440,270);
		// Kapatma düğmesine basınca uygulamayı sonlandır.
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}
}
