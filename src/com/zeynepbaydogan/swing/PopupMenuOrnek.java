package com.zeynepbaydogan.swing;
import javax.swing.*;
public class PopupMenuOrnek {
	public static void main(String[] args) {
		// Metin yazabileceğimiz ana ekranı oluştur.
		JFrame pencere= new JFrame("Sağ Tık Menüsü");
		JTextArea alan= new JTextArea("Bu alana sağ tıkla");
		// JPopupMenu, sağ tıkla açılacak menüdür.
		JPopupMenu sagTikMenusu= new JPopupMenu();
		JMenuItem temizle= new JMenuItem("Temizle");
		// Temizle seçildiğinde metin alanını boşalt.
		temizle.addActionListener(e->{
			alan.setText("");
		});
		// Komutu menüye ekle ve menüyü alana bağla.
		sagTikMenusu.add(temizle);
		alan.setComponentPopupMenu(sagTikMenusu);
		// JScrollPane: Uzun metinde kaydırma alanı sağlar.
		pencere.add(new JScrollPane(alan));
		// Pencereyi göster.
		pencere.setSize(430,260);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}
}
