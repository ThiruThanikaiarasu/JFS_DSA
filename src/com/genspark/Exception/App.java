package com.genspark.Exception;

public class App {
    private String appName;
    private String developerName;
    private double appSize;
    private String category;
    private double price;

    public App(String appName, String developerName, double appSize, String category, double price) {
        this.appName = appName;
        this.developerName = developerName;
        this.appSize = appSize;
        this.category = category;
        this.price = price;
    }

    public String getAppName() {
        return appName;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public double getAppSize() {
        return appSize;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}
