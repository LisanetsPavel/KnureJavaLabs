package KHURE.Lisanets_Laba7.listener;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import KHURE.Lisanets_Laba7.ImageEditor;

public class ImageEditorMouseMotionListener extends MouseMotionAdapter {

	private ImageEditor imageEditor;

	public ImageEditorMouseMotionListener(ImageEditor imageEditor) {
		this.imageEditor = imageEditor;
	}

	@Override
	public void mouseDragged(MouseEvent event) {
		if (imageEditor.isPressed()) {

			Graphics graphics = imageEditor.getImage().getGraphics();
			Graphics2D graphics2d = (Graphics2D) graphics;
			graphics2d.setColor(Color.BLACK);

			graphics2d.drawLine(imageEditor.getxPad(), imageEditor.getyPad(), event.getX(), event.getY());
			imageEditor.setxPad(event.getX());
			imageEditor.setyPad(event.getY());

		}
		imageEditor.getMyPanel().repaint();
	}

}
