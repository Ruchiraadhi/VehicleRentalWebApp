package com.vehicle.rental.vehiclerentalwebapp;

public class VehicleNode {
    Vehicle vehicle;
    VehicleNode next;

    public VehicleNode(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.next = null;
    }
}