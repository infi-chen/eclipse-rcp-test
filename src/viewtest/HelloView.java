package viewtest;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
import org.eclipse.ui.part.ViewPart;

public class HelloView extends ViewPart {
	private List list;
	public static final String ID = "ViewTest.HelloView";

	public HelloView() {

	}

	@Override
	public void createPartControl(Composite parent) {

		list = new List(parent, SWT.BORDER);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	public List getBundlesList() {
		return list;
	}
}
