package utils;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameManagerTest {
    GameManager gameManager = new GameManager();

    @Test
    public void checkOverlap(){
        List<Integer> list = gameManager.generateTarget();
        assertTrue(list.get(0)!=list.get(1) && list.get(1)!=list.get(2) && list.get(0)!=list.get(2));
        /*for(int i : list){
            System.out.println("element: "+i);
        }*/
    }

}