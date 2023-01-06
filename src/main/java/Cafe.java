public class Cafe {
    private String name, addres;
    private int drink;

    public Cafe(String name, String addres, int drink) {
        this.name = name;
        this.addres = addres;
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                ", drink=" + drink +
                '}'+"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getDrink() {
        return drink;
    }

    public void setDrink(int drink) {
        this.drink = drink;
    }
}
