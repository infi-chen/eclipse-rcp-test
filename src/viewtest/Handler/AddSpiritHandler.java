package viewtest.Handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.ui.PlatformUI;

import viewtest.CanvasView;
import viewtest.Spirit;

public class AddSpiritHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		CanvasView view = (CanvasView) PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage()
				.findView(CanvasView.ID);
		Canvas canvas = view.getCanvas();
		Spirit spirit = new Spirit(canvas, "gogogogo", 100, 200);
		view.AddSpirit(spirit);
		canvas.redraw();
		return null;
	}

}
