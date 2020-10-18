package ru.mirea.Byrin.pr1;
import java.lang.*;

public class Ball {
    private String sport;
    private String material;
    private double diameter;

    public Ball(String sport, String material, double diameter) {
        this.sport = sport;
        this.material = material;
        this.diameter = diameter;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "sport='" + sport + '\'' +
                ", material='" + material + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
