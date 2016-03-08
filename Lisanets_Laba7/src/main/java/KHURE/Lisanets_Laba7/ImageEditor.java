package KHURE.Lisanets_Laba7;

import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import KHURE.Lisanets_Laba7.action.LoadAction;
import KHURE.Lisanets_Laba7.action.SaveAction;
import KHURE.Lisanets_Laba7.listener.ImageEditorMouseListener;
import KHURE.Lisanets_Laba7.listener.ImageEditorMouseMotionListener;

public class ImageEditor {

	private int xPad;
	private int yPad;

	private boolean pressed = false;

	private MyFrame myFrame;
	private MyPanel myPanel;
	private BufferedImage image;
	private String fileName;

	public ImageEditor() {
		init();
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setxPad(int xPad) {
		this.xPad = xPad;
	}

	public void setyPad(int yPad) {
		this.yPad = yPad;
	}

	public int getxPad() {
		return xPad;
	}

	public int getyPad() {
		return yPad;
	}

	public MyFrame getMyFrame() {
		return myFrame;
	}

	public MyPanel getMyPanel() {
		return myPanel;
	}

	public BufferedImage getImage() {
		return image;
	}

	public String getFileName() {
		return fileName;
	}

	public boolean isPressed() {
		return pressed;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}

	private void init() {
		myFrame = new MyFrame("Графический редактор");
		myFrame.setSize(400, 400);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myPanel = new MyPanel(this);
		myPanel.setBounds(25, 20, 350, 350);
		myPanel.setBackground(Color.WHITE);
		myPanel.setOpaque(true);
		myFrame.add(myPanel);

		JMenuBar jMenuBar = new JMenuBar();
		myFrame.setJMenuBar(jMenuBar);
		jMenuBar.setBounds(0, 0, 350, 30);
		JMenu fileMenu = new JMenu("Файл");
		jMenuBar.add(fileMenu);

		Action loadAction = new LoadAction(this);
		JMenuItem loadMenu = new JMenuItem(loadAction);
		fileMenu.add(loadMenu);

		Action saveAction = new SaveAction(this);
		JMenuItem saveMenu = new JMenuItem(saveAction);
		fileMenu.add(saveMenu);

		myPanel.addMouseMotionListener(new ImageEditorMouseMotionListener(this));
		myPanel.addMouseListener(new ImageEditorMouseListener(this));

		myFrame.setLayout(null);
		myFrame.setVisible(true);
	}

}
