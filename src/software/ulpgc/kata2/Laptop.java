package software.ulpgc.kata2;

public class Laptop {
    private String manufacturer;
    private String model;
    private String name;
    private String category;
    private String screenSize;
    private String screen;
    private String cpu;
    private String ram;
    private String gpu;
    private String os;
    private String osVersion;
    private String weight;
    private String price;

    public Laptop(String manufacturer, String model, String name, String category, String screenSize, String screen, String cpu, String ram, String gpu, String os, String osVersion, String weight, String price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.name = name;
        this.category = category;
        this.screenSize = screenSize;
        this.screen = screen;
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
        this.os = os;
        this.osVersion = osVersion;
        this.weight = weight;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getScreen() {
        return screen;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }

    public String getOs() {
        return os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getWeight() {
        return weight;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", screen='" + screen + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", gpu='" + gpu + '\'' +
                ", os='" + os + '\'' +
                ", osVersion='" + osVersion + '\'' +
                ", weight='" + weight + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
