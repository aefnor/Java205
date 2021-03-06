import java.awt.Color;
import java.awt.Graphics;

public class Line {
	int x1;
	int y1;
	int x2;
	int y2;
	Color color;
	
	public Line(int x1, int y1, int x2, int y2, Color pcolor){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.color = pcolor;
		
	}
	
	public void draw(Graphics page){
		page.setColor(color);
		page.drawLine(x1, y1, x2, y2);
	}
	
}
