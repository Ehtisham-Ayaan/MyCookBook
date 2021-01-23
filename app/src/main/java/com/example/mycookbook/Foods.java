package com.example.mycookbook;

public class Foods {

    int id;
    byte[] foodImage;
    String name,category,ingredients,description;
    String quantity;


    public Foods(int id, byte[] foodImage, String name, String category, String ingredients, String quantity, String description) {
        this.id = id;
        this.foodImage = foodImage;
        this.name = name;
        this.category = category;
        this.ingredients = ingredients;
        this.description = description;
        this.quantity = quantity;
    }
    public Foods(byte[] foodImage, String name, String category, String ingredients, String quantity, String description) {

        this.foodImage = foodImage;
        this.name = name;
        this.category = category;
        this.ingredients = ingredients;
        this.description = description;
        this.quantity = quantity;
    }

    public Foods(int id , String name, byte[] pic) {

        this.id = id;
        this.foodImage = pic;
        this.name = name;

    }
    public Foods(String name, byte[] pic) {

        this.foodImage = pic;
        this.name = name;

    }

    public Foods(String name) {

        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(byte[] foodImage) {
        this.foodImage = foodImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

