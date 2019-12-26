package projectGFG;

public class Square1 {
	
	static class Point{
		
		int x, y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	};
	
	static int multSq(Point p, Point q) {
		
		return (p.x - q.x)* (p.x - q.x)+(p.y - q.y)* (p.y - q.y);
	}
	
	static boolean isSquare(Point p1, Point p2, Point p3, Point p4) {
		
		int d2 = multSq(p1, p2);
		int d3 =  multSq(p1, p3);
		int d4 = multSq(p1, p4);
		
		if(d2 == d3 && 2 * d2 == d4 && 2 * multSq(p2, p4)== multSq(p2, p3))
			return true;
		if(d3 == d4 && 2 * d3 == d2 && 2 * multSq(p3, p2)== multSq(p3, p4))
			return true;
		if(d2 == d4 && 2 * d2 == d3 && 2 * multSq(p2, p3)== multSq(p2, p4))
			
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		 Point p1 = new Point(20, 10), p2 = new Point( 10, 20 ), 
		p3 = new Point(20, 20 ), p4 = new Point( 10, 10 ); 
		 System.out.println(isSquare(p1, p2, p3, p4)==true ? "Yes" : "No"); 
	}

}
