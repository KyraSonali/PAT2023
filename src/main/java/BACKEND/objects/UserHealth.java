/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND.objects;

import java.time.LocalDate;

/**
 *
 * @author Kyra Balliram
 */
public class UserHealth {

    private int idPhysicalHealth;
    private int idUser;

    private int hydrationLevel;
    private int sleepAmount;
    private String physicalActivities;
    private double weight;
    private LocalDate dateEntered;

    public UserHealth(int inPhysicalHealthID, int inUserID, int inHydrationLevel, int inSleepAmount, String inPhysicalActivities, double inWeight, LocalDate inDateEntered) {

        idPhysicalHealth = inPhysicalHealthID;
        idUser = inUserID;
        hydrationLevel = inHydrationLevel;
        sleepAmount = inSleepAmount;
        physicalActivities = inPhysicalActivities;
        weight = inWeight;
        dateEntered=inDateEntered;

    }

    public int getIdPhysicalHealth() {
        return idPhysicalHealth;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getHydrationLevel() {
        return hydrationLevel;
    }

    public int getSleepAmount() {
        return sleepAmount;
    }

    public String getPhysicalActivities() {
        return physicalActivities;
    }

    public double getWeight() {
        return weight;
    }

}
