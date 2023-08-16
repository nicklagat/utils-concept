package org.example;

import java.util.*;

public class EVModelsEngineUtils {

    private EVModelsEngineUtils(){}


    public static String MODEL = "Jaguar I-PACE";
    public static final Map<String, List<String>> EV_MODEL_ENGINE_MAP;


    static {
        EV_MODEL_ENGINE_MAP = new HashMap<>();
        EV_MODEL_ENGINE_MAP.put("Tesla Model 3", Arrays.asList("Permanent Magnet Synchronous", "Another Engine Type for Tesla"));
        EV_MODEL_ENGINE_MAP.put("Nissan Leaf", List.of("EM57 Electric Motor"));
        EV_MODEL_ENGINE_MAP.put("Chevrolet Bolt EV", List.of("Permanent Magnet Drive Motor"));
        EV_MODEL_ENGINE_MAP.put("BMW i3", List.of("Hybrid Synchronous Motor"));
        EV_MODEL_ENGINE_MAP.put("Audi e-tron", List.of("Asynchronous Electric Motor"));
        EV_MODEL_ENGINE_MAP.put("Jaguar I-PACE", List.of("Permanent Magnet Electric Motor"));
        EV_MODEL_ENGINE_MAP.put("Hyundai Kona Electric", List.of("Permanent Magnet Synchronous Motor"));
        EV_MODEL_ENGINE_MAP.put("Porsche Taycan", List.of("Permanent Magnet Synchronous Motor"));

    }


    public static final Map<String,String> EV_PRICES;

    static {
        EV_PRICES = new HashMap<>();
        EV_PRICES.put("Porsche Taycan","$79,900");
        EV_PRICES.put("Tesla Model 3","$39,990");
        EV_PRICES.put("Nissan Leaf","$31,670");
        EV_PRICES.put("Chevrolet Bolt EV","$31,995");
        EV_PRICES.put("BMW i3","$44,450");
        EV_PRICES.put("Audi e-tron","$65,900");
        EV_PRICES.put("Jaguar I-PACE","$69,850");
        EV_PRICES.put("Hyundai Kona Electric","$37,390");
    }


    public static List<String> getEModels(String evModel){

        List<String> engineTypesForModel = EVModelsEngineUtils.EV_MODEL_ENGINE_MAP.getOrDefault(evModel, Collections.emptyList());

        return engineTypesForModel;
    }


}
