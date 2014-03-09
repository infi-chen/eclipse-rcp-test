package viewtest;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;

public class Spirit {
	private Image img = null;
	private String text;
	private Point location;
	Rectangle rect;
	private Canvas canvas;
	public static int FONTHEIGHT = 9;
	public static int FONTWIDTH = 7;

	public Spirit(Canvas canvas, String text, int x, int y) {
		this.text = text;
		location = new Point(x, y);
		this.canvas = canvas;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Point centerPoint() {
		return location;
	}

	public void paint(GC gc) {
		if (location != null) {
			rect = new Rectangle(location.x - 50, location.y - 20, 100, 40);
			gc.drawText(text, location.x - text.length() * FONTWIDTH / 2,
					location.y - FONTHEIGHT);
			gc.drawRectangle(rect);

		} else {
			System.err.println("location is null");
		}

	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

}
