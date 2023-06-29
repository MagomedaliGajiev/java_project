package Seminar6.HomeWork6;

public class Notebook {
    private int ram;
    private String manufacturer;
    private String os;
    private String color;
    private String cpu;
    private int hdd;

    @Override
    public String toString() {
        String res = String.format("Notebook %s (%s, %dGB RAM, %dGB HDD, %s, %s)", this.manufacturer, this.cpu, this.ram, this.hdd, this.os, this.color);
        return res;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Notebook(String manf, String cpu, String color) {
        this.manufacturer = manf;
        this.cpu = cpu;
        this.color = color;
        
    }
}
