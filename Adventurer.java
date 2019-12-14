public class Adventurer extends Piece {
    // Add necessary fields
    private String name;
    private int x;
    private int y;
    private int HP;
    private int damage;
    private Plane plane;
    private Adventurer adventurer;
    private Type a;

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

    public void act(Plane plane) {
        // The direction the user has selected.
        Plane.Direction direction = plane.getDirection();

       

        //Piece a = plane.getPieceAt(x, y);
        
        //Adventurer adventurer = plane[x][y];
        //int fromX = x;
        //int fromY = y;
        //int toX = x;
        //int toY = y;
        
        // TODO: stub
        /*if(direction == Plane.Direction.NORTH){
                toX = x - 1;
                if(plane.move(fromX, fromY, toX, toY)){
                    //plane[fromX][fromY] = null;
                    
                    Adventurer a = new Adventurer(name, toX, toY);
                    plane.placePiece(Piece.Type.ADVENTURER, toX, toY);
                    //plane.toString();
                }
            }
               
            
            if(direction == Plane.Direction.EAST){
                toY = y + 1;
                if(plane.move(fromX, fromY, toX, toY)){
                    //plane[fromX][fromY] = null;
                    
                    Adventurer a = new Adventurer(name, toX, toY);
                    plane.placePiece(Piece.Type.ADVENTURER, toX, toY);
                    //plane.toString();
                }
            }
            
            if(direction == Plane.Direction.SOUTH){
                toX = x + 1;
                if(plane.move(fromX, fromY, toX, toY)){
                    //plane[fromX][fromY] = null;
                  
                    Adventurer a = new Adventurer(name, toX, toY);
                    plane.placePiece(Piece.Type.ADVENTURER, toX, toY);
                    //plane.toString();
                }
            }
            
            if(direction == Plane.Direction.WEST){
                toY = y - 1;
                if(plane.move(fromX, fromY, toX, toY)){
                    //plane[fromX][fromY] = null;
                    
                    Adventurer a = new Adventurer(name, toX, toY);
                    plane.placePiece(Piece.Type.ADVENTURER, toX, toY);
                    //plane.toString();
                }
            }
        }*/

    }
}