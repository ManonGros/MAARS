import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Allow to select current image as the image to process
 */
public class CurrentImageAction implements ActionListener{
	
	private CellsBoundaries_ cB;
	
	public CurrentImageAction (CellsBoundaries_ cB) {
		this.cB = cB;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		cB.getAlreadryOpenedImage();
		cB.resetFileNameField();
		cB.setFileNameField(cB.getImageToAnalyze().getTitle());
	}
}
