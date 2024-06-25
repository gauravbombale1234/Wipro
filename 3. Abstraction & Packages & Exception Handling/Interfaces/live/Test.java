package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        // Creating an instance of Veena and calling play() method
        Veena veena = new Veena();
        veena.play();
        
        // Creating an instance of Saxophone and calling play() method
        Saxophone saxophone = new Saxophone();
        saxophone.play();
        
        // Placing the instances in a variable of type Playable and then calling play()
        Playable playable;

        playable = veena;
        playable.play();

        playable = saxophone;
        playable.play();
    }
}
