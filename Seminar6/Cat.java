package Seminar6;

public class Cat {
    String name;
    int age;
    boolean isVaccinated = false;
    boolean sex;

    public void getVaccine() {
        if (!this.isVaccinated) {
            System.out.printf("%s не привит, его нужно привить!\n", this.name);
            this.isVaccinated = true;
        } else {
            System.out.printf("%s уже привит\n", this.name);
        }
    }
}
