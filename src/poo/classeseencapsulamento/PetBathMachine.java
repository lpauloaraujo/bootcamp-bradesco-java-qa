package poo.classeseencapsulamento;

public class PetBathMachine {
    private String currentPet;
    private double amountOfWater;
    private double amountOfShampoo;
    private boolean isClean = true;

    public void cleanMachine () {
        if ((verifyWaterLevel(3) && verifyShampooLevel(2))) {
            this.amountOfWater -= 3;
            this.amountOfShampoo -= 2;
            this.isClean = true;
        }
    }

    public void removePet () {
        String prompt = String.format("%s was removed from the machine.", this.currentPet);
        this.currentPet = null;
        System.out.println(prompt);
    }

    public void bathePet(String pet) {
        if (this.currentPet != null) {
            System.out.printf("The machine is already occupied by %s.\n", this.currentPet);
            return;
        } else this.currentPet = pet;
        if (this.isClean) {
            if (verifyWaterLevel(10) & verifyShampooLevel(2)) {
                this.amountOfWater -= 10;
                this.amountOfShampoo -= 2;
                this.isClean = false;
                System.out.printf("%s is clean! You can now remove it and don't forget cleaning the machine.\n",
                        this.currentPet);
            }
        } else System.out.printf("You must clean the bath machine before bathing %s.\n", pet);
    }

    public void verifyPet() {
        if (this.currentPet == null) System.out.println("The machine is empty");
        else System.out.printf("%s is in the machine.\n", this.currentPet);
    }

    public void fillWithWater(double quantity) {
        if (quantity < 0) return;
        if (quantity > 2) {
            System.out.println("The machine only supports a maximum of 2 liters of water per refill.");
            return;
        }
        if (this.amountOfWater + quantity > 30) this.amountOfWater = 30;
        else this.amountOfWater += quantity;
    }

    public void fillWithShampoo(double quantity) {
        if (quantity < 0) return;
        if (quantity > 2) {
            System.out.println("The machine only supports a maximum of 2 liters of shampoo per refill.");
            return;
        }
        if (this.amountOfShampoo + quantity > 10) this.amountOfShampoo = 10;
        else this.amountOfShampoo += quantity;
    }

    public boolean verifyWaterLevel(double quantity) {
        if (this.amountOfWater < quantity) {
            System.out.println("The water level is under the necessary.");
            return false;
        } else return true;
    }

    public boolean verifyShampooLevel(double quantity) {
        if (this.amountOfShampoo < quantity) {
            System.out.println("The shampoo level is under the necessary.");
            return false;
        } else return true;
    }

    @Override
    public String toString() {
        return "PetBathMachine{" +
                "currentPet='" + currentPet + '\'' +
                ", amountOfWater=" + amountOfWater +
                ", amountOfShampoo=" + amountOfShampoo +
                ", isClean=" + isClean +
                '}';
    }
}
