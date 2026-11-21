package com.zeynepbaydogan.swing;
import javax.swing.*;
public class RadioMenuOrnek {
	public static void main(String[] args) {
		// Pencere ve seçimi gösterecek etiket.
		JFrame pencere=new JFrame ("Tek Seçim");
		JLabel bilgi=new JLabel("Tema: Açık");
		pencere.add(bilgi);
		// İki farklı menü seçeneği oluştur.
		JMenu tema= new JMenu("Tema");
		JRadioButtonMenuItem acik= new JRadioButtonMenuItem("Açık", true);
		JRadioButtonMenuItem koyu= new JRadioButtonMenuItem("Koyu");
		// ButtonGroup: Yalnızca bir seçenek seçili kalsın.
		ButtonGroup grup=new ButtonGroup();
		grup.add(acik);
		grup.add(koyu);
		// Tıklanan seçeneğe göre bilgi yazısını değiştir.
		acik.addActionListener(e->bilgi.setText("Tema: Açık"));
		koyu.addActionListener(e->bilgi.setText("Tema: Koyu"));
		// Her iki seçeneği aynı menüde göster.
		tema.add(acik);
		tema.add(koyu);
		JMenuBar cubuk= new JMenuBar();
		cubuk.add(tema);
		pencere.setJMenuBar(cubuk);
		// Pencereyi göster.
		pencere.setSize(430,260);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}
}
