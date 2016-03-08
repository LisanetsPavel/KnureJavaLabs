package KHURE.Lisanets_Laba7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class MyPanel extends JPanel {

	private ImageEditor imageEditor;

	public MyPanel(ImageEditor imageEditor) {
		super();
		this.imageEditor = imageEditor;
	}

	public void paintComponent(Graphics graphics) {
		if (imageEditor.getImage() == null) {
			imageEditor.setImage(new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB));
			Graphics2D d2 = (Graphics2D) imageEditor.getImage().createGraphics();
			d2.setColor(Color.white);
			d2.fillRect(0, 0, this.getWidth(), this.getHeight());
		}
		super.paintComponent(graphics);
		graphics.drawImage(imageEditor.getImage(), 0, 0, this);
	}
}
