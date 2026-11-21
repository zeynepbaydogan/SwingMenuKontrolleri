package com.zeynepbaydogan.swing;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class KisayolMenuOrnek {
	public static void main(String[] args) {
		// Pencere ve yapılan işlemi gösterecek bilgi yazısı.
		JFrame pencere = new JFrame("Kısayol Tuşları");
		JLabel bilgi = new JLabel(" Bir komut seç ya da kısayol tuşuna bas.");
		pencere.add(bilgi);

		// Dosya menüsü. setMnemonic: Alt + D ile menü açılır.
		JMenu dosya = new JMenu("Dosya");
		dosya.setMnemonic(KeyEvent.VK_D);

		// setAccelerator: Menüyü açmadan Ctrl + N ile çalışır.
		JMenuItem yeni = new JMenuItem("Yeni");
		yeni.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		yeni.addActionListener(e -> bilgi.setText(" Yeni dosya oluşturuldu."));

		// Ctrl + S ile kaydet.
		JMenuItem kaydet = new JMenuItem("Kaydet");
		kaydet.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		kaydet.addActionListener(e -> bilgi.setText(" Dosya kaydedildi."));

		// Ctrl + Q ile programı kapat.
		JMenuItem cikis = new JMenuItem("Çıkış");
		cikis.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
		cikis.addActionListener(e -> System.exit(0));

		// Komutları menüye ekle; Çıkış'ı ayırıcı çizgiyle ayır.
		dosya.add(yeni);
		dosya.add(kaydet);
		dosya.addSeparator();
		dosya.add(cikis);

		// Menüyü çubuğa, çubuğu pencereye yerleştir.
		JMenuBar cubuk = new JMenuBar();
		cubuk.add(dosya);
		pencere.setJMenuBar(cubuk);

		// Pencereyi göster.
		pencere.setSize(430, 260);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}
}