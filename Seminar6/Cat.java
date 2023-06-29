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

    public void petCat(int n){
        if (this.sex) {
            System.out.println("Fuck you bitch!");
        }
        else{
            for (int i = 0; i < n; i++) {
                System.out.println("meow");
            }
        }
    }

    public void killCat(){
        if (this.age > 0) {
            this.age = -1;
            System.out.println(this.name + " убит!");
        } else {
            System.out.println();
        }
    }
}
