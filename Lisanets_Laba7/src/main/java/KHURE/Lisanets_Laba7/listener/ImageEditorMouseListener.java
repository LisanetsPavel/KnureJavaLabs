package KHURE.Lisanets_Laba7.listener;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import KHURE.Lisanets_Laba7.ImageEditor;

public class ImageEditorMouseListener extends MouseAdapter {

	private ImageEditor imageEditor;

	public ImageEditorMouseListener(ImageEditor imageEditor) {
		this.imageEditor = imageEditor;
	}

	@Override
	public void mouseClicked(MouseEvent event) {

		Graphics graphics = imageEditor.getImage().getGraphics();
		Graphics2D graphics2d = (Graphics2D) graphics;

		graphics2d.drawLine(imageEditor.getxPad(), imageEditor.getyPad(), imageEditor.getxPad() + 1,
				imageEditor.getyPad() + 1);

		imageEditor.setxPad(event.getX());
		imageEditor.setyPad(event.getY());

		imageEditor.setPressed(true);
		imageEditor.getMyPanel().repaint();
	}

	@Override
	public void mousePressed(MouseEvent event) {

		imageEditor.setxPad(event.getX());
		imageEditor.setyPad(event.getY());
		imageEditor.setPressed(true);

	}

	@Override
	public void mouseReleased(MouseEvent event) {

		imageEditor.setPressed(true);
		imageEditor.getMyPanel().repaint();
	}

}
