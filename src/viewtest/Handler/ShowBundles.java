package viewtest.Handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.List;
import org.eclipse.ui.PlatformUI;

import viewtest.Activator;
import viewtest.HelloView;

public class ShowBundles extends AbstractHandler {

	public static final String ID = "viewtest.Handler.ShowBundles";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		HelloView view = (HelloView) PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.findView(HelloView.ID);
		List bundlesList = view.getBundlesList();
		bundlesList.add("xiaomi");
		// System.out.println(bundlesList);
		for (String bundle : Activator.getBundles()) {
			System.err.println(bundle);
			bundlesList.add(bundle);

		}

		return null;
	}

}
