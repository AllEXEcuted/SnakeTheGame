package FieldObjects;
import Utils.Point;

public interface FieldObject {
	
	public void setLocation(int x, int y);
	public Point getLocation();
	public boolean isCollisionCapable();
	public boolean deadInConflict();
}
