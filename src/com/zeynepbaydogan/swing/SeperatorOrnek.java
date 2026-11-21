package com.zeynepbaydogan.swing;
import javax.swing.*;
public class SeperatorOrnek {
	public static void main(String[] args) {
		
		// Pencere menü çubuğu ve dosya menüsünü oluşturur.
		JFrame pencere = new JFrame("Ayırıcı Çizgi");
		JMenuBar cubuk = new JMenuBar();
		JMenu dosya = new JMenu("Dosya");
		
		// Birbirine yakın iki komutu ekle.
		dosya.add(new JMenuItem("Yeni"));
		dosya.add(new JMenuItem("Aç"));
		
		// Ayırıcı çizgi: Tıklanmaz sadece bölümleri ayırır.
		dosya.add(new JSeparator());
		
		// Çizginin altında ayrı bir komut gösterir.
		dosya.add(new JMenuItem("Çıkış"));
		
		// Menüyü pencereye yerleştirir.
		cubuk.add(dosya);
		pencere.setJMenuBar(cubuk);
		
		// Pencereyi göster.
		pencere.setSize(420,260);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}
}
