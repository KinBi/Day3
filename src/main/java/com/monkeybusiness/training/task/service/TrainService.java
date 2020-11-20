package com.monkeybusiness.training.task.service;

import com.monkeybusiness.training.task.entity.Destination;
import com.monkeybusiness.training.task.entity.RailwayStation;
import com.monkeybusiness.training.task.entity.Train;

import java.time.LocalTime;
import java.util.Arrays;

public class TrainService {
  public Train[] findTrainsThatArrivesAt(RailwayStation railvayStation, Destination destination) {
    Train[] trainList = findTrainsThatArrivesAtAndDepartAfter(railvayStation, destination, LocalTime.MIN);

    return trainList;
  }

  public Train[] findTrainsThatArrivesAtAndDepartAfter(RailwayStation railvayStation, Destination destination, LocalTime time) {
    Train[] trains = railvayStation.getTrains();
    Train[] trainList = new Train[trains.length];

    int count = 0;
    for (int i = 0; i < trains.length; i++) {
      if (trains[i].getDestination() == destination && trains[i].getDepartureTime().compareTo(time) > 0) {
        trainList[count] = trains[i];
        count++;
      }
    }
    Train[] result = Arrays.copyOf(trainList, count);
    return result;
  }
}
