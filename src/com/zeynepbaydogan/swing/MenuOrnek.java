package com.zeynepbaydogan.swing;

import javax.swing.*;
public class MenuOrnek {
	public static void main(String[] args) {
		// Önce ana menüyü ve pencere çubuğunu oluştur.
		JFrame pencere= new JFrame("Açılır Menü");
		JMenuBar cubuk= new JMenuBar();
		// JMenu tıklanınca açılan dosya başlığıdır.
		JMenu dosya= new JMenu("Dosya");
		// Menü içinde bir komut oluştur.
		JMenuItem yeni=new JMenuItem("Yeni");
		dosya.add(yeni);
		// JMenu başka bir JMenu içerirse alt menü oluştur.
		JMenu disaAktar= new JMenu("Dışa Aktar");
		disaAktar.add(new JMenuItem("PDF"));
		dosya.add(disaAktar);
		// Önce menüyü çubuğa sonra çubuğu pencereye ekle.
		cubuk.add(dosya);
		pencere.setJMenuBar(cubuk);
		// Pencereyi göster.
		pencere.setSize(420,260);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}
}

