package uRiseLessons.boxContainerSpaceShip;

public class Container {
    private int maxBoxes;
    private Box[] boxes;
    public Container(int count) {

        this.maxBoxes = count;
        this.boxes = new Box[maxBoxes];
    }

    public Container() {
        this(20+ (int)(Math.random()*30));
    }

    public void putBox(Box box){

   }
   public int getSize(){
      return 1;
   }
   public void clearContent(){

   }
}
