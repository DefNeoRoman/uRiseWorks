package boxContainerSpaceShip;

import java.util.ArrayList;
import java.util.List;

public class Container {
    public Container() {
    }

    private List<Box> content = new ArrayList<>(34);
   public void putBox(Box box){
        content.add(box);
   }
   public int getSize(){
       return content.size();
   }
   public void clearContent(){
       content.clear();
   }
}
