package lec.week3.ex;

public class TV {
    int channel;
    int volumeLevel;
    boolean on;
    public  TV(){
        this.channel= 100;
        this.volumeLevel =5;
        this.on = false;
    }
    public void turnOn(){
        this.on = true;
    }
    public void turnOff(){
        this.on = false;
    }
    public void setChaneel(int newChannel){
        if (newChannel>=1 && newChannel<=120) {
            this.channel = newChannel;
            
        }
    }
    public void setVolume(int newVolume){
        if (newVolume>=1 && newVolume<=7) {
            
            this.volumeLevel = newVolume;
            
        }
    }
    public void channelUp(){
        if (channel < 120)
            this.channel++;
    }
    public void channelDown(){
        if (channel > 1)
            this.channel--;
    }
    public void volumeUp(){
        if (volumeLevel < 8) {
            this.volumeLevel++;
        }
    }
    
    public void volumeDown(){
        this.volumeLevel--;
    }

    public void printAll(){
        System.out.println("on: " + on);
        System.out.println("Chaneel: " + channel);
        System.out.println("volumel: " + volumeLevel);
        
    }
}
