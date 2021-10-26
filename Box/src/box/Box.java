package box;

public class Box {
    private int width;
    private int deep;
    private int height;

    public Box(){} // Empty constructor

    public Box(int width, int deep, int height){
        this.width = width;
        this.deep = deep;
        this.height = height;
    }


    public int getVolume(){
        return this.width * this.deep * this.height;
    }

}
