package chess;

public class Figure {
	public String name;
	public int posx; // 0-7
	public int posy; // 0-7
	public boolean team; // white = true, black = false
	
	Figure(String name, int posx, int posy, boolean team) {
		this.name = name;
		this.posx = posx;
		this.posy = posy;
		this.team = team;
	}
}
