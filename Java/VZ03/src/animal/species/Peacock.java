package animal.species;

import animal.aves.Aves;
import animal.flyinganimal.FlyingAnimal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Peacock extends Aves implements FlyingAnimal{
    
    /**
     * Constructor of Peacock
     * @param domestic : true if this Peacock is tamed, false otherwise
     */
    public Peacock(boolean domestic){
        super(1.7);
        this.setDietType(Global.HERB);
        this.setWeight(8);
        this.setName("Peacock");
        this.setDomestic(domestic);
    }
    @Override
    public void fly(double speed, double altitude) {
        System.out.println(getName() + " is flying with speed " + speed + " m/s " + " and " + altitude + " m high");
    }

    @Override
    public void interact() {System.out.println("Ngik ngik");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Pc" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
