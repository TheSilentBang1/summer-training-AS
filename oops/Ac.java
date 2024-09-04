package summerTrainingAS.oops;
public class Ac {
    
    //states
    boolean start;
    int fanSpeed;
    int temp;
    String swing;



    //behaviour
    void switchMode(){
        if(start == true){
            start = false;
        }
        else{
            start = true;
        }

    }
    void increaseTemp(){
        if(temp==30){
            return;
        }
        temp++;
    }
    void decreaseTemp(){
        if(temp == 18){
            return;
        }
        temp--;
    }


}
