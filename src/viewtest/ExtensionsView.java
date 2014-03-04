package viewtest;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.SWT;

public class ExtensionsView extends ViewPart {
	public ExtensionsView() {
	}
	Tree tree;
	public static final String ID="ViewTest.ExtensionsView";
	@Override
	public void createPartControl(Composite parent) {

		tree = new Tree(parent, SWT.BORDER);
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	public Tree getExtensionsTree() {
		return tree;
	}

}
