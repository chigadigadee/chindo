public class Adventurer extends Piece {
    // Add necessary fields
    private String name;
    private int x;
    private int y;
    private int HP;
    private int damage;
    private Plane plane;
    private Adventurer a;
    //private Adventurer adventurer;
    //private Type a;

    public Adventurer(String name, int x, int y) {
        super(Type.ADVENTURER, x, y, false);
        // default hitpoints should be 10.
        HP = 10;
        this.name = name;
    }

    public String getName() {
        // TODO: stub

        return this.name;
    }

    public int getHP() {
        // TODO: stub

        return this.HP;
    }


    public void takeDamage(int damage) {
        // TODO: stub
        // subtract damage from HP
    }

    public void move(int fromX, int fromY, int toX, int toY){
            Piece p = plane.getPieceAt(fromX, fromY);
            if (p != null) {
                    plane[fromX][fromY] = null;
                    plane[toX][toY] = p;
    }

    public void act(Plane plane) {
        // The direction the user has selected.
        Plane.Direction direction = plane.getDirection();

       

       
        //for(int i = 0; i < plane.getWidth(); i++){
            //for(int j = 0; j < plane.getHeight(); j++){
                //Piece p = plane.getPieceAt(i, j);

        
                   
                    /*int fromX = Adventurer.getX();
                    int fromY = Adventurer.getY();
                    int toX = fromX;
                    int toY = fromY;

                    switch(direction){
                        case NORTH:
                            toY = toY - 1;
                            plane.move(fromX, fromY, toX, toY);
                            
                            }
                            break;
                        
                        case EAST:
                            toX = toX + 1;
                            plane.move(fromX, fromY, toX, toY)){
                                Adventurer a = new Adventurer(name, toX, toY)
                                plane.placePiece(Type.ADVENTURER, toX, toY);
                        
                            }
                            break;
                        
                        case SOUTH:
                            toY = toY + 1;
                            if(plane.move(fromX, fromY, toX, toY)){ 
                                Adventurer a = new Adventurer(name, toX, toY)
                                plane.placePiece(Type.ADVENTURER, x, y);
                                
                            }
                            break;
                        
                        case WEST:
                            toX = toX - 1;
                            
                            if (plane.move(fromX, fromY, toX, toY)){
                                Adventurer a = new Adventurer(name, toX, toY)
                                plane.placePiece(Type.ADVENTURER, x, y);
                                
                            }
                            break;
                    }*/
                
                
                
                
                
                
                



            
    

    }

    
}