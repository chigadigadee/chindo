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
        int randomNum = plane.rand(3);
        
        
        if(randomNum == 1){
        
        
                        int fromX = this.x;
                        int fromY = this.y;
                        int toX = fromX;
                        int toY = fromY;
                        
                    
                    
                Plane.Direction d = plane.randomDirection();
            
                        switch(d){
                            case NORTH:
                                toY = toY - 1;
                                plane.move(fromX, fromY, toX, toY);
                                break;
                            
                            case EAST:
                                toX = toX + 1;
                                plane.move(fromX, fromY, toX, toY);
                                break;
                            
                            case SOUTH:
                                toY = toY + 1;
                                plane.move(fromX, fromY, toX, toY); 
                                break;
                            
                            case WEST:
                                toX = toX - 1;
                                plane.move(fromX, fromY, toX, toY);
                                break;
                        }
                    
                    
                    
                    
                    
                    
                    }



                }


    }
}