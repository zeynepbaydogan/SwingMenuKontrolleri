package com.zeynepbaydogan.swing;
import javax.swing.*;
public class FileChooserOrnek {
	public static void main(String[] args) {
		// Seçilen dosyanın adını gösterecek alanlar.
		JFrame pencere = new JFrame("Dosya Seçimi");
		JPanel panel = new JPanel();
		JButton dugme = new JButton("Dosya Seç");
		JLabel bilgi = new JLabel("Henüz dosya seçilmedi.");
		// Düğmeye basınca dosya seçim ekranı açılsın.
		dugme.addActionListener(e->{
			JFileChooser secici = new JFileChooser();
			int sonuc = secici.showOpenDialog(pencere);
			// Kullanıcı Aç düğmesine basmışsa dosya adını al.
			if(sonuc== JFileChooser.APPROVE_OPTION) {
				String ad = secici.getSelectedFile().getName();
				bilgi.setText("Seçilen: "+ad);
			}
		});
		// Bileşenleri aynı panelde yan yana göster.
		panel.add(dugme);
		panel.add(bilgi);
		pencere.add(panel);
		// Pencereyi göster.
		pencere.setSize(500,270);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}
}
