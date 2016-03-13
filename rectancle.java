
class rectancleset{
	double width,height;
	int x,y;
	
	rectancleset(){
		
	}
	
	rectancleset(int _height,int _width,int _x,int _y){
		this.width= _width;
		this.height=_height;
		this.x=_x;
		this.y= _y;
	}
	
	double getWidth(){
		return this.width;
	}
	
	double getHeight(){
	    return this.height;
	}
	int getX(){
		return this.x;
	}
	int getY(){
		return this.y;
	}
	
	public String toString(){
		return "java.Rectangle[x="+this.x+",y="+this.y+",width="+this.width+",height="+this.height+"]";
	}
	
}



public class rectancle {
	public static void main(String[] args) {
		
	rectancleset r1= new rectancleset(18,57,15,25);
	rectancleset r2=new rectancleset(47,60,0,12);
	
	System.out.print(r1);
    System.out.println("\nArea="+String.format("%.1f",( r1.width*r1.height)));
	System.out.println("Perimeter="+String.format("%.1f",(r1.height*2)+(r1.width*2)));
	System.out.print(r2);
    System.out.println("\nArea="+String.format("%.1f",( r2.width*r2.height)));
	System.out.println("Perimeter="+String.format("%.1f",(r2.height*2)+(r2.width*2)));
	
   }
}
