package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(MathUtils.callEndpoint());
        System.out.println(MathUtils.sum(70, 90));
        System.out.println(MathUtils.printName("Jon Uni"));


        Logger logger = LogManager.getLogger(Main.class);

        logger.info("We are creating an electric vehicle object and converting it to Json string: ");


        ElectricVehicle jaguarEv = new ElectricVehicleBuilder()
                .setEvModel(EVModelsEngineUtils.MODEL)
                .setEngineType(EVModelsEngineUtils.getEModels(EVModelsEngineUtils.MODEL))
                .setPowerSource("Battery")
                .setBatteryType("Lithium-ion")
                .setBatteryRange("358 miles")
                .setBatteryCharge("Supercharger")
                .setEvPrice(EVModelsEngineUtils.EV_PRICES.get(EVModelsEngineUtils.MODEL))
                .createElectricVehicle();

        System.out.println(JsonUtils.asJson(jaguarEv));


        ElectricVehicle bmwEv = new ElectricVehicleBuilder()
                .setEvModel(EVModelsEngineUtils.MODEL = "BMW i3")
                .setEngineType(EVModelsEngineUtils.getEModels(EVModelsEngineUtils.MODEL = "BMW i3"))
                .setPowerSource("Battery")
                .setBatteryType("Lithium-ion")
                .setBatteryRange("153 miles")
                .setBatteryCharge("CCS")
                .setEvPrice(EVModelsEngineUtils.EV_PRICES.get(EVModelsEngineUtils.MODEL = "BMW i3"))
                .createElectricVehicle();

        System.out.println(JsonUtils.asJson(bmwEv));


    }
}