public abstract class Piece {
    public static enum Type { LOG, ADVENTURER, SNEAKY_SNEK, SLOTH };

    // TODO: Fill in the missing fields
    private Type type;
    private int x;
    private int y;
    private boolean tired;
    private boolean acted;
    private Plane plane;

    public Piece(Type type, int x, int  y, boolean tired) {
        // TODO: stub
        this.type = type;
        setX(x);
        setY(y);
        setTired(tired);

    }

    public void setActed(boolean acted) {
        // TODO: stub
        this.acted = acted;
    }

    public boolean hasActed() {
        // TODO: stub

        return acted; // this is so it will still compile
    }

    public Type getType() {
        // TODO: stub
        return type; // this is so it will still compile
    }

    public int getX() {
        // TODO: stub
        return x; // this is so it will still compile
    }

    public int getY() {
        // TODO: stub
        return y; // this is so it will still compile
    }

    public boolean isTired() {
        // TODO: stub
        return tired; // this is so it will still compile
    }

    public void setTired(boolean tired) {
        // TODO: stub
        this.tired = tired;
    }

    public void setX(int x) {
        // TODO: stub
        this.x = x;
    }

    public void setY(int y) {
        // TODO: stub
        this.y = y;
    }

    public abstract void act(Plane plane);
}