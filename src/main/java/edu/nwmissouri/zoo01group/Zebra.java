/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 * This class gives information about zebra
 * @author Sujith Reddy Naidu
 */
public class Zebra extends TerrestrialAnimal {

    private String name;
    private double weight;
    private double distance;

    /**
     * This is a constructor
     * @param name
     */
    public Zebra(String name) {
        super(name);
    }

    /**
     * This method returns the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the weight
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * This method sets the weight
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * This method returns the distance
     * @return
     */
    public double getDistance() {
        return distance;
    }

    /**
     * This method sets the distance
     * @param distance
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * This method returns the gender
     * @return gender
     */
    public AnimalGender getGender() {
        return gender;
    }

    /**
     * This method sets the gender
     * @param gender
     */
    public void setGender(AnimalGender gender) {
        this.gender = gender;
    }

    /**
     * This method returns returns the height
     * @return 20
     */
    public double getHeight_inches() {
        return 20;
    }

}
