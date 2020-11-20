package com.monkeybusiness.training.task.report;

import com.monkeybusiness.training.task.entity.Destination;
import com.monkeybusiness.training.task.entity.Train;

import java.time.LocalTime;
import java.util.Arrays;

public class TrainReport {
  public void printTrainsThatArrivesAt(Train[] trains, Destination destination) {
    System.out.println("Trains " + Arrays.toString(trains) + " arrives at " + destination);
  }

  public void printTrainsThatArrivesAtAndDepartAfter(Train[] trains, Destination destination, LocalTime time) {
    printTrainsThatArrivesAt(trains, destination);
    System.out.println("After " + time);
  }
}
