package com.monkeybusiness.training.task.entity;

import java.time.LocalTime;

public class Train {
  private Destination destination;
  private int trainNumber;
  private LocalTime departureTime;
  private int seatsCount;

  public Train() {
  }

  public Train(Destination destination, int trainNumber, LocalTime departureTime, int seatsCount) {
    this.destination = destination;
    this.trainNumber = trainNumber;
    this.departureTime = departureTime;
    this.seatsCount = seatsCount;
  }

  public Destination getDestination() {
    return destination;
  }

  public void setDestination(Destination destination) {
    this.destination = destination;
  }

  public int getTrainNumber() {
    return trainNumber;
  }

  public void setTrainNumber(int trainNumber) {
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Train train = (Train) o;

    if (trainNumber != train.trainNumber) return false;
    if (seatsCount != train.seatsCount) return false;
    if (destination != train.destination) return false;
    return departureTime != null ? departureTime.equals(train.departureTime) : train.departureTime == null;
  }

  @Override
  public int hashCode() {
    int result = destination != null ? destination.hashCode() : 0;
    result = 31 * result + trainNumber;
    result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
    result = 31 * result + seatsCount;
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Train{");
    sb.append("destination=").append(destination);
    sb.append(", trainNumber=").append(trainNumber);
    sb.append(", departureTime=").append(departureTime);
    sb.append(", seatsCount=").append(seatsCount);
    sb.append('}');
    return sb.toString();
  }
}
