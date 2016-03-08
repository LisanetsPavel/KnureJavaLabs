package KHURE.Lisanets_Laba7.action;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import KHURE.Lisanets_Laba7.ImageEditor;
import KHURE.Lisanets_Laba7.filter.TextFileFilter;

public class LoadAction extends AbstractAction {

	private ImageEditor imageEditor;

	public LoadAction(ImageEditor imageEditor) {
		super("Загрузить");
		this.imageEditor = imageEditor;
	}

	public void actionPerformed(ActionEvent actionEvent) {

		JFileChooser jFileChooser = new JFileChooser();
		int result = jFileChooser.showOpenDialog(null);

		if (result == jFileChooser.APPROVE_OPTION) {
			try {
				imageEditor.setFileName(jFileChooser.getSelectedFile().getAbsolutePath());
				File file = new File(imageEditor.getFileName());
				jFileChooser.addChoosableFileFilter(new TextFileFilter(".png"));
				jFileChooser.addChoosableFileFilter(new TextFileFilter(".jpg"));
				imageEditor.setImage(ImageIO.read(file));
				imageEditor.getMyFrame().setSize(imageEditor.getImage().getWidth() + 40,
						imageEditor.getImage().getWidth() + 80);
				imageEditor.getMyPanel().setSize(imageEditor.getImage().getWidth(), imageEditor.getImage().getWidth());
				imageEditor.getMyPanel().repaint();

			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(imageEditor.getMyFrame(), "Такого файла не существует");
			} catch (IOException e) {
				JOptionPane.showMessageDialog(imageEditor.getMyFrame(), "Ошибка ввода-вывода");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(imageEditor.getMyFrame(), "Неизвестная ошибка");
			}

		}

	}

}
