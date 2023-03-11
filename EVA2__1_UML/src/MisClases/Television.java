package MisClases;

/**
 * @author Diego
 */
public class Television {
    private int canal;
    private int volumen;
    private boolean power;
    
    public void setCanal(int channel){
        canal = channel;
    }
    public int getCanal(){
        return canal;
    }
    public void setVolumen(int volume){
        volumen = volume;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setPower(boolean onOff){
        power = onOff;
    }
    public boolean getPower(){
        return power;
    }
}
