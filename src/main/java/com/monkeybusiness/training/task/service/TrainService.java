package com.monkeybusiness.training.task.service;

import com.monkeybusiness.training.task.entity.Train;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class TrainService {
  public List<Train> findTrainsThatArrivesAt(List<Train> trains, String destination) {
    List<Train> trainList = findTrainsThatArrivesAtAndDepartAfter(trains, destination, LocalTime.MIN);

    return trainList;
  }

  public List<Train> findTrainsThatArrivesAtAndDepartAfter(List<Train> trains, String destination, LocalTime time) {
    List<Train> trainList = new LinkedList<>();

    for (Train train : trains) {
      if (train.getdestination().equals(destination) && train.getDepartureTime().compareTo(time) > 0) {
        trainList.add(train);
      }
    }

    return trainList;
  }
}
