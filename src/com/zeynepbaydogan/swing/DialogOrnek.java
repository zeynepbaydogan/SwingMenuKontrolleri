package com.zeynepbaydogan.swing;
import javax.swing.*;
public class DialogOrnek {
	public static void main(String[] args) {
		
		// JFrame ana uygulama penceresidir.
		JFrame pencere= new JFrame("Ana Pencere");
		JButton ac = new JButton("Bilgi Penceresi Aç");
		// Düğmeye basıldığında ikinci bir pencere açılacak.
		ac.addActionListener(e->{
			// JDialog: Ana pencereye bağlı küçük pencere.
			// true: Diyalog kapanmadan ana pencere kullanılmaz.
			JDialog diyalog = new JDialog(pencere,"Bilgi",true);
			// Diyaloğun içine bilgi metni yerleştirir.
			JLabel yazi = new JLabel(" Bu bir JDialog örneğidir.");
			diyalog.add(yazi);
			// Diyaloğu ayarla ve göster.
			diyalog.setSize(310,160);
			// Kapatınca diyaloğu bellekten de sil (her tıklamada yenisi açılıyor).
			diyalog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			diyalog.setLocationRelativeTo(pencere);
			diyalog.setVisible(true);
		});
		
		// Ana pencereye düğmeyi ekle.
		pencere.add(ac);
		pencere.setSize(440,260);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setVisible(true);
	}
}
