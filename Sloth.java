import java.util.Random;

public class Sloth extends Piece{
    private int x;
    private int y;
    private int sloth = 10;
    private Sloth s;
    private Plane plane;

    public Sloth(int x, int y){
        super(Type.SLOTH, x, y, true);
    }

    public void setSloth(int sloth){
        this.sloth = sloth;
    }

    public int getSloth(){
        return sloth;
    }




    public void act(Plane plane){
        

        //plane.rand(3)  returns an integer between 0 and 2
        /*int randomNum = plane.rand(3);
        
        if(randomNum == 1){
        
            
           
            for(int i = 0; i < plane.width; i++){
                for(int j = 0; j < plane.height; j++){
                    Piece p = plane[i][j];

                    if(p.getType().equals(Type.SLOTH)){
                        plane.fromX = i;
                        plane.fromY = j;
                        plane.toX = i;
                        plane.toY = j;
                        plane[i][j] = null;
                    
                    
                        Plane.Direction d = plane.randomDirection();
            
                        switch(Plane.Direction.d){
                            case NORTH:
                                if(plane.move(fromX, fromY, toX -= 1, toY)){
                                    this.x = Type.SLOTH.setX(toX -= 1);
                                    this.y = Type.SLOTH.setY(toY);
                                    plane.placePiece(Type.SLOTH, this.x, this.y);
                                }
                                break;
                            
                            case EAST:
                                if(plane.move(fromX, fromY, toX, toY += 1)){
                                    this.x = Type.SLOTH.setX(toX);
                                    this.y = Type.SLOTH.setY(toY += 1);
                                    plane.placePiece(Type.SLOTH, this.x, this.y);
                                }
                                break;
                            
                            case SOUTH:
                                if(plane.move(fromX, fromY, toX += 1, toY)){ 
                                    this.x = Type.SLOTH.setX(toX += 1);
                                    this.y = Type.SLOTH.setY(toY);
                                    plane.placePiece(Type.SLOTH, this.x, this.y);
                                    
                                }
                                break;
                            
                            case WEST:
                                
                                if (plane.move(fromX, fromY, toX, toY -= 1)){
                                    
                                    this.x = Type.SLOTH.setX(toX);
                                    this.y = Type.SLOTH.setY(toY -= 1);
                                    plane.placePiece(Type.SLOTH, this.x, this.y);
                                }
                                break;
                        }
                    
                    
                    
                    
                    
                    
                    }



                }
            }

        }*/


    }
}