/**
 * It checks whether the cell is having neighbours either
 * two or three then it will be alive
 */
/**
 * @author L.Sri Rama Karthikeya
 *
 */
public class CellAlive {
    private boolean state = false;
    private boolean nextState = false;
    public boolean getState(){
       return state;
    }
    public void changeState() {
        state = !state;
    }
    public boolean getNextState(){
        return nextState;
    }
    public void nextState(int i) {
        if(i == 2 || i == 3){
            nextState = true;
        }
    }
}

