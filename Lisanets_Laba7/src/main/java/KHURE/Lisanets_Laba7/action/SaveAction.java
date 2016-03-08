package KHURE.Lisanets_Laba7.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import KHURE.Lisanets_Laba7.ImageEditor;
import KHURE.Lisanets_Laba7.filter.TextFileFilter;

public class SaveAction extends AbstractAction {

	private ImageEditor imageEditor;

	public SaveAction(ImageEditor imageEditor) {
		super("Сохранить");
		this.imageEditor = imageEditor;
	}

	public void actionPerformed(ActionEvent actionEvent) {

		try {

			JFileChooser jFileChooser = new JFileChooser();
			TextFileFilter pngFilter = new TextFileFilter(".png");
			TextFileFilter jpgFilter = new TextFileFilter(".jpg");

			if (imageEditor.getFileName() == null) {

				jFileChooser.addChoosableFileFilter(pngFilter);
				jFileChooser.addChoosableFileFilter(jpgFilter);
				int result = jFileChooser.showSaveDialog(null);
				if (result == jFileChooser.APPROVE_OPTION) {
					imageEditor.setFileName(jFileChooser.getSelectedFile().getAbsolutePath());
				}

			}

			if (jFileChooser.getFileFilter() == pngFilter) {
				ImageIO.write(imageEditor.getImage(), "png", new File(imageEditor.getFileName() + ".png"));
			} else {
				ImageIO.write(imageEditor.getImage(), "jpeg", new File(imageEditor.getFileName() + ".jpg"));
			}

		} catch (IOException e) {
			JOptionPane.showMessageDialog(imageEditor.getMyFrame(), "Ошибка ввода-вывода");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(imageEditor.getMyFrame(), "Неизвестная ошибка");
		}

	}
}
