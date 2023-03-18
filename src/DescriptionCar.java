public class DescriptionCar {
    private int madeOfYear;
    private String model;
    private int price;
    private Color color;

    public DescriptionCar(int madeOfYear, String model, int price, Color color) {
        this.madeOfYear = madeOfYear;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getMadeOfYear() {
        return madeOfYear;
    }

    public void setMadeOfYear(int madeOfYear) {
        this.madeOfYear = madeOfYear;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "DescriptionCar{" +
                "madeOfYear=" + madeOfYear +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color=" + color +
                '}';
    }
}
