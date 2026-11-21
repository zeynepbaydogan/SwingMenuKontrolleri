package com.zeynepbaydogan.swing;
import javax.swing.*;
import java.awt.Color;
public class ColorChooserOrnek {
	public static void main(String[] args) {
		// Panel düğmeyi ve arka plan rengini taşır.
		JFrame pencere = new JFrame("Renk Seçici");
		JPanel panel = new JPanel();
		JButton dugme = new JButton("Renk Seç");
		// Düğmeye basınca hazır renk seçim ekranını aç.
		dugme.addActionListener(e ->{
			Color renk = JColorChooser.showDialog(pencere, "Bir renk seç", Color.BLUE);
			// İptale basılırsa renk null olur.
			if(renk!=null) {
				panel.setBackground(renk);
			}
		});
		// Düğmeyi panele, paneli pencereye ekle.
		panel.add(dugme);
		pencere.add(panel);
		// Pencereyi göster
		pencere.setSize(440,270);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}
}
