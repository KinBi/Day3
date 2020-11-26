package com.monkeybusiness.training.task.entity;

import java.util.Arrays;

public class RailwayStation {
  private Train[] trains;

  public RailwayStation() {
  }

  public RailwayStation(Train[] trains) {
    this.trains = trains;
  }

  public Train[] getTrains() {
    return trains.clone();
  }

  public void setTrains(Train[] trains) {
    this.trains = trains;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    RailwayStation that = (RailwayStation) o;

    // Probably incorrect - comparing Object[] arrays with Arrays.equals
    return Arrays.equals(trains, that.trains);
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(trains);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("RailwayStation{");
    sb.append("trains=").append(Arrays.toString(trains));
    sb.append('}');
    return sb.toString();
  }
}
