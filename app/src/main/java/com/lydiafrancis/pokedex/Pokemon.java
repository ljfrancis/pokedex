package com.lydiafrancis.pokedex;


import android.text.TextUtils;

public class Pokemon {

    static String[] types = new String[] {"Grass"};
    public final static Pokemon[] pokemon = {
            new Pokemon(1,"Bulbasaur", "bulbasaur","Bulbasaur can be seen napping in bright sunlight. " +
                    "There is a seed on its back. By soaking up the sun’s rays, the seed grows progressively larger.",
                    6.9, 0.7, 45, 45, 49, 40, 65,
                    65, types),
            new Pokemon(2,"Ivysaur", "ivysaur","When the bud on its back starts " +
                    "swelling, a sweet aroma wafts to indicate the flowers coming bloom.",
                    13.0, 1.0, 60, 60, 62, 63, 80,
                    80, types),
            new Pokemon(3,"Venusaur", "venusaur","After a rainy day, the " +
                    "flower on its back smells stronger. The scent attracts other Pokémon.",
                    100.0,2.0, 80, 80, 82, 83, 100,
                    100, types),


    };


    private String name;
    private String image;
    private String description;
    private Integer id;
    private Double weight;
    private Double height;
    private Double catchRate;
    private Integer HP;
    private Integer speed;
    private Integer attack;
    private Integer defense;
    private Integer specialAttack;
    private Integer specialDefense;



    public Pokemon(Integer id, String name, String image, String description, Double weight, Double height,
                   Integer HP, Integer speed, Integer attack, Integer defense,
                   Integer specialAttack, Integer specialDefense, String[] types) {
        this.name = name;
        this.id = id;
        this.image = image;
        this.description = description;
        this.weight = weight;
        this.height = height;
        this.HP = HP;
        this.speed = speed;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getTypes() {
        return TextUtils.join(" ", types);
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getHeight() {
        return height;
    }

    public Integer getHP() {
        return HP;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getSpecialAttack() {
        return specialAttack;
    }

    public Integer getSpecialDefense() {
        return specialDefense;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public void setSpecialAttack(Integer specialAttack) {
        this.specialAttack = specialAttack;
    }

    public void setSpecialDefense(Integer specialDefense) {
        this.specialDefense = specialDefense;
    }


    @Override
    public String toString() {
        return "'name='" + name;
    }

}