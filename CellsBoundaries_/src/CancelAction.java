import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CancelAction implements ActionListener{
	
	private CellsBoundaries_ cB;
	
	public CancelAction(CellsBoundaries_ cB) {
		this.cB = cB;
	}

	public void actionPerformed(ActionEvent e) {
		cB.hideMainWindow();
	}

}
