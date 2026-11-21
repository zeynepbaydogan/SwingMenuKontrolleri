package com.zeynepbaydogan.swing;
import javax.swing.*;
public class CheckBoxMenuOrnek {
	public static void main(String[] args) {
		// Pencere ve ekranda değişecek bilgi yazısı.
		JFrame pencere=new JFrame("İşaretli Menü");
		JLabel bilgi=new JLabel("Durum: Açık");
		pencere.add(bilgi);
		// Üst Menü: Görünüm
		JMenu gorunum=new JMenu("Görünüm");
		// true: seçenek başlangıçta işaretli olacak. 
		JCheckBoxMenuItem secim= new JCheckBoxMenuItem("Durumu Göster",true);
		// İşaret değiştiğinde etiketi güncelle.
		secim.addItemListener(e-> {
			if(secim.isSelected()) {
				bilgi.setText("Durum: Açık");
				} else {
					bilgi.setText("Durum: Kapalı");
				}
		});
		// Menüleri ana pencereye bağla.
		gorunum.add(secim);
		JMenuBar cubuk=new JMenuBar();
		cubuk.add(gorunum);
		pencere.setJMenuBar(cubuk);
		// Pencereyi görünür yap.
		pencere.setSize(430,260);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}
}
