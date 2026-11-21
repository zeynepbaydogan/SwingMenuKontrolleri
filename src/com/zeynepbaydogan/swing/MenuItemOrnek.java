package com.zeynepbaydogan.swing;

import javax.swing.*;
public class MenuItemOrnek {
	public static void main(String[] args) {
		// Menülerin gösterileceği ana pencere.
		JFrame pencere=new JFrame("Menü Seçeneği");
		JMenuBar cubuk=new JMenuBar();
		JMenu dosya= new JMenu("Dosya");
		// JMenuItem tıklanabilen "Kaydet" komutudur.
		JMenuItem kaydet= new JMenuItem("Kaydet");
		// Kullanıcı "Kaydet" e basınca bu kod çalışır.
		kaydet.addActionListener(e->{
			JOptionPane.showMessageDialog(pencere,"Kaydedildi");
		});
		// Öğeyi menüye, menüyü çubuğa yerleştirir.
		dosya.add(kaydet);
		cubuk.add(dosya);
		pencere.setJMenuBar(cubuk);
		// Pencereyi göster.
		pencere.setSize(420,260);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}
}
