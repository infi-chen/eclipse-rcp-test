package viewtest;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {
	private static List<String> bundles = new LinkedList<String>();
	private static Activator plugin;

	public static List<String> getBundles() {
		return bundles;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		super.start(context);
		plugin = this;
		for (Bundle bundle : context.getBundles()) {
			bundles.add(bundle.getSymbolicName());
			System.err.println(bundle.getSymbolicName());
		}
	}

}
