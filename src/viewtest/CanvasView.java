package viewtest;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridLayout;

import viewtest.Handler.AddSpiritHandler;

public class CanvasView extends ViewPart {
	public static final String ID = "ViewTest.CanvasView";
	Canvas canvas;

	private List<Spirit> sps = new ArrayList<Spirit>();

	public CanvasView() {
		// TODO Auto-generated constructor stub

	}

	public void AddSpirit(Spirit sp) {
		sps.add(sp);
	}

	@Override
	public void createPartControl(Composite parent) {

		canvas = new Canvas(parent, SWT.NO_REDRAW_RESIZE);
		canvas.setLayout(new GridLayout(1, false));

		canvas.addPaintListener(new PaintListener() {
			public void paintControl(PaintEvent e) {
				for (Spirit  sp : sps) {
					sp.paint(e.gc);
				}
			}
		});
		// TODO Auto-generated method stub

	}

	public Canvas getCanvas() {
		return canvas;
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
