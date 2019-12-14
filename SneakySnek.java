public class SneakySnek extends Piece{
    private int x;
    private int y;
    private int sneks = 10;

    public SneakySnek(int x, int y, boolean tired){
        super(Type.SNEAKY_SNEK, x, y, tired);
    }

    public void setSneks(int sneks){
        this.sneks = sneks;
    }

    public void act(Plane plane){

    }
}