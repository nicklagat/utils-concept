package org.example;

import java.util.List;
import java.util.Map;

public class ElectricVehicle {


    private String evModel;
    private List<String> engineType;
    private String powerSource;
    private String batteryType;
    private String batteryRange;
    private String batteryCharge;
    private String evPrice;


    public ElectricVehicle(){};

    public ElectricVehicle(String evModel, List<String> engineType, String powerSource, String batteryType, String batteryRange, String batteryCharge, String evPrice) {
        this.evModel = evModel;
        this.engineType = engineType;
        this.powerSource = powerSource;
        this.batteryType = batteryType;
        this.batteryRange = batteryRange;
        this.batteryCharge = batteryCharge;
        this.evPrice = evPrice;
    }


    public String getEvModel() {
        return evModel;
    }

    public void setEvModel(String evModel) {
        this.evModel = evModel;
    }

    public List<String> getEngineType() {
        return engineType;
    }

    public void setEngineType(List<String> engineType) {
        this.engineType = engineType;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    public String getBatteryRange() {
        return batteryRange;
    }

    public void setBatteryRange(String batteryRange) {
        this.batteryRange = batteryRange;
    }

    public String getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(String batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public String getEvPrice() {
        return evPrice;
    }

    public void setEvPrice() {
        this.evPrice = evPrice;
    }


    @Override
    public String toString() {
        return "ElectricVehicle{" +
                "evModel='" + evModel + '\'' +
                ", engineType=" + engineType +
                ", powerSource='" + powerSource + '\'' +
                ", batteryType='" + batteryType + '\'' +
                ", batteryRange='" + batteryRange + '\'' +
                ", batteryCharge='" + batteryCharge + '\'' +
                ", evPrice=" + evPrice +
                '}';
    }
}
