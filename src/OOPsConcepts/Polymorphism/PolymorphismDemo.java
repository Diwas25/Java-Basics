package OOPsConcepts.Polymorphism;

class Machine{
    public void getMachineSound() {
        System.out.println("Machine make sounds while running");
    }
}
class MixerGrinder extends Machine{
    public void getMachineSound() {
        System.out.println("MixerGrinder : Ghunnnn...");
    }
}
class ACGenertor extends Machine{
    public void getMachineSound() {
        System.out.println("ACGenertor : Dug Dugg Duggggg....");
    }
}

class Computer extends Machine{
    public void getMachineSound() {
        System.out.println("Computer : no sound");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Machine mach = new Machine();
        mach.getMachineSound();

        Machine mg = new MixerGrinder();
        mg.getMachineSound();

        Machine acg = new ACGenertor();
        acg.getMachineSound();

        Machine com = new Computer();
        com.getMachineSound();
    }
}
