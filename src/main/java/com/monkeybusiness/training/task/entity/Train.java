package com.monkeybusiness.training.task.entity;

import java.time.LocalTime;

public class Train {
  private String destination;
  private int trainNumber;
  private LocalTime departureTime;
  private int seatsCount;

  public Train() {
    
  }

  public Train(String destination, int trainNumber, LocalTime departureTime, int seatsCount) {
    this.destination = destination;
    this.trainNumber = trainNumber;
    this.departureTime = departureTime;
    this.seatsCount = seatsCount;
  }

  public String getdestination() {
    return destination;
  }

  public void setdestination(String destination) {
    this.destination = destination;
  }

  public int getTrainNumer() {
    return trainNumber;
  }

  public void setTrainNumer(int trainNumber) {
    this.trainNumber = trainNumber;
  }

  public LocalTime getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(LocalTime departureTime) {
    this.departureTime = departureTime;
  }

  public int getSeatsCount() {
    return seatsCount;
  }

  public void setSeatsCount(int seatsCount) {
    this.seatsCount = seatsCount;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Train{");
    sb.append("destination='").append(destination).append('\'');
    sb.append(", trainNumber=").append(trainNumber);
    sb.append(", departureTime=").append(departureTime);
    sb.append(", seatsCount=").append(seatsCount);
    sb.append('}');
    return sb.toString();
  }
}
