package ss06_Inheritance.thuchanh.SystemOfGeometric;

public class Shape {
    private String color ="green";
    private boolean fillded=true;

    public Shape(){

    }

    public Shape(String color, boolean fillded) {
        this.color = color;
        this.fillded = fillded;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFillded() {
        return fillded;
    }

    public void setFillded(boolean fillded) {
        this.fillded = fillded;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFillded() ? "filled" : "not filled");
    }
}
