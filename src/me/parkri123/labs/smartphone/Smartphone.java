package me.parkri123.labs.smartphone;

public class Smartphone {
    private String provider;
    private int storagecapacity;
    private String brand;
    private boolean wirelesscharging;

    public Smartphone(){
        provider = "none";
        storagecapacity = 0;
        brand = "none";
        wirelesscharging = false;

    }
    public Smartphone(String provider, int storagecapacity, String brand, boolean wirelesscharging){
        this.provider = provider;
        this.storagecapacity = storagecapacity;
        this.brand = brand;
        this.wirelesscharging = wirelesscharging;

    }
    public String getProvider(){
    return provider;
    }
    public int getStoragecapacity(){
        return storagecapacity;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isWirelesscharging() {
        return wirelesscharging;
    }
}
