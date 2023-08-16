package org.example;

import java.util.List;

public class ElectricVehicleBuilder {

    private String evModel;
    private List<String> engineType;
    private String powerSource;
    private String batteryType;
    private String batteryRange;
    private String batteryCharge;
    private String evPrice;



    public ElectricVehicleBuilder setEvModel(String evModel){
        this.evModel = evModel;
        return this;
    }

    public ElectricVehicleBuilder setEngineType(List<String> engineType){
        this.engineType = engineType;
        return this;
    }

    public ElectricVehicleBuilder setPowerSource(String powerSource){
        this.powerSource = powerSource;
        return this;
    }

    public ElectricVehicleBuilder setBatteryType(String batteryType){
        this.batteryType = batteryType;
        return this;
    }

    public ElectricVehicleBuilder setBatteryRange(String batteryRange){
        this.batteryRange = batteryRange;
        return this;
    }

    public ElectricVehicleBuilder setBatteryCharge(String batteryCharge){
        this.batteryCharge = batteryCharge;
        return this;
    }

    public ElectricVehicleBuilder setEvPrice(String evPrice){
        this.evPrice = evPrice;
        return this;
    }

    public ElectricVehicle createElectricVehicle(){
        return new ElectricVehicle(evModel,engineType,powerSource,batteryType,batteryRange,
                batteryCharge,evPrice);
    }

}
