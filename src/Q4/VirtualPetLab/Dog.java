package Q4.VirtualPetLab;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomDogImg());
    }

    @Override
    public void feed() {
        if (this.getHunger() > 0) {
            setHunger(0);
        }
        if (this.getEnergy() < 100) {
            setEnergy(MAX_ENERGY);
        }
        if (this.getHappiness() < 100) {
            setHappiness(MAX_HAPPINESS);
        }
    }

    @Override
    public void play() {
        if (this.getHappiness() < 100) {
            setHappiness(MAX_HAPPINESS);
        }
        if (this.getEnergy() > 0) {
            setEnergy(0);
        }
        if (this.getHunger() > 0) {
            setHunger(0);
        }
    }

    @Override
    public void sleep() {
        if (this.getEnergy() < 100) setEnergy(100);
        setHunger(50);
        setHappiness(50);
    }
}
