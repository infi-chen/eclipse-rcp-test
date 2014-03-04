package viewtest.Handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.PlatformUI;

import viewtest.ExtensionsView;

public class ShowExtensions extends AbstractHandler {
	public static final String ID = "viewtest.Handler.ShowExtensions";
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		ExtensionsView view = (ExtensionsView) PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.findView(ExtensionsView.ID);
		Tree tree = view.getExtensionsTree();
		IExtensionPoint[] extensionPoints = Platform.getExtensionRegistry()
				.getExtensionPoints();
		for (IExtensionPoint iExtensionPoint : extensionPoints) {
			TreeItem extensionTreeItem = new TreeItem(tree, SWT.BORDER);
			extensionTreeItem.setText(iExtensionPoint.getLabel());
			extensionTreeItem.setExpanded(true);

			for (IExtension extension : iExtensionPoint.getExtensions()) {
				TreeItem extensionItem = new TreeItem(extensionTreeItem,
						SWT.BORDER);
				
				extensionItem.setText(extension.toString());
			}

		}

		return null;
	}

}
