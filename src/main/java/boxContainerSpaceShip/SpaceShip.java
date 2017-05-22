package boxContainerSpaceShip;

import java.util.ArrayList;
import java.util.List;

public class SpaceShip {
    private List<Container> content = new ArrayList<>(11);

    public SpaceShip() {
    }

    public void putContainer(Container container){
        content.add(container);
    }
    public int getSize(){
        return content.size();
    }
    public void clearSpaceShip(){
        content.clear();
    }
}
