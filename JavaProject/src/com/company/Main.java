package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("--------------------------------------------");
        PlantCare obj1 = new PlantCare(4);

        for(int i =0 ; i<obj1.getFruitPlants().size(); i++){
            FruitPlant fruits = (FruitPlant)obj1.getFruitPlants().get(i);
            System.out.println(fruits.getName());
        }
        System.out.println("--------------------------------------------");
        for(int i =0 ; i<obj1.getFruitPlants().size(); i++){
            FruitPlant fruits = (FruitPlant)obj1.getFruitPlants().get(i);
            fruits.needWater();
            System.out.println(fruits.getName()+" - Do you need water?: "+fruits.isWater());
        }
        System.out.println("--------------------------------------------");
        for(int i =0 ; i<obj1.getFruitPlants().size(); i++){
            FruitPlant fruits = (FruitPlant)obj1.getFruitPlants().get(i);
            if(fruits.isWater()==true){
                fruits.setWater(false);
                System.out.println("Take water: "+fruits.getName());
            }
            System.out.println(fruits.getName()+" - Do you need water?: "+fruits.isWater());
        }
        System.out.println("--------------------------------------------");
        System.out.println(obj1.getSeason());
        if(obj1.getSeason().equals("autumn")){
            for(int i =0 ; i<obj1.getFruitPlants().size(); i++){
                FruitPlant fruits = (FruitPlant)obj1.getFruitPlants().get(i);
                    System.out.println(fruits.getName()+": "+fruits.canPrune(obj1.getSeason()));
            }
        }else if(obj1.getSeason().equals("summer")){
            for(int i =0 ; i<obj1.getFruitPlants().size(); i++){
                FruitPlant fruits = (FruitPlant)obj1.getFruitPlants().get(i);
                fruits.canBeHarvested(obj1.getSeason());
                System.out.println(fruits.getName()+" :"+fruits.getHarvested());

            }
        }
        System.out.println("--------------------------------------------");
        obj1.getFoodPlants();
        for(int i =0 ; i<obj1.getFoodPlants().size(); i++){
            System.out.println(obj1.getFoodPlants().get(i).getName());
        }
        if(obj1.getSeason().equals("summer")){
            for(int i =0 ; i<obj1.getFoodPlants().size(); i++){
                FoodPlant foods = (FoodPlant) obj1.getFoodPlants().get(i);
                foods.canBeHarvested(obj1.getSeason());
                System.out.println(foods.getName()+" :"+foods.getHarvested());
            }
        }
        System.out.println("--------------------------------------------");
        for(int i =0 ; i<obj1.getFoodPlants().size(); i++){
            FoodPlant foods = (FoodPlant) obj1.getFoodPlants().get(i);
            if(foods.isWater()==true){
                foods.setWater(false);
                System.out.println("Take water: "+foods.getName());
            }
            System.out.println(foods.getName()+" - Do you need water?: "+foods.isWater());
        }
// Ornamnetal
        System.out.println("--------------------------------------------");
        obj1.getOrnamentalPlants();
        for(int i =0 ; i<obj1.getOrnamentalPlants().size(); i++){
            System.out.println(obj1.getOrnamentalPlants().get(i).getName());
        }
        System.out.println("--------------------------------------------");
        for(int i =0 ; i<obj1.getOrnamentalPlants().size(); i++){
            OrnamentalPlant ornamentalPlant = (OrnamentalPlant) obj1.getOrnamentalPlants().get(i);
            ornamentalPlant.needWater();
            System.out.println(ornamentalPlant.getName()+" - Do you need water?: "+ornamentalPlant.isWater());
        }
        System.out.println("--------------------------------------------");
        for(int i =0 ; i<obj1.getOrnamentalPlants().size(); i++){
            OrnamentalPlant ornamentalPlant = (OrnamentalPlant) obj1.getOrnamentalPlants().get(i);
            if(ornamentalPlant.isWater()==true){
                ornamentalPlant.setWater(false);
                System.out.println("Take water: "+ornamentalPlant.getName());
            }
            System.out.println(ornamentalPlant.getName()+" - Do you need water?: "+ornamentalPlant.isWater());
        }
    }
}
