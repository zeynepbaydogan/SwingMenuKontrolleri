package com.zeynepbaydogan.swing;

import javax.swing.*;

public class MenuBarOrnek {
	public static void main(String[] args) {
		
		// JFrame: Bütün menüleri taşıyan ana pencere 
		JFrame pencere=new JFrame("Menü Çubuğu");
		
		// JMenuBar: Pencerenin üst kısmındaki boş şerit 
		JMenuBar cubuk=new JMenuBar();
		
		// JMenu: Şeritte görünecek dosya başlığı
		JMenu dosya= new JMenu("Dosya");
		
		// Dosya menüsünü şerite ekle
		cubuk.add(dosya);
		
		// Hazırladığımız şeriti pencereye yerleştir.
		pencere.setJMenuBar(cubuk);
		
		// Pencerenin boyutunu ve kapanış davranışını ayarla.
		pencere.setSize(420,260);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Pencereyi ekranda göster.
		pencere.setVisible(true);
	}
}
