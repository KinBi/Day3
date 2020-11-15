package com.monkeybusiness.training.task.report;

import com.monkeybusiness.training.task.entity.Train;

import java.time.LocalTime;
import java.util.List;

public class TrainReport {
  public void printTrainsThatArrivesAt(List<Train> trains, String destination) {
    System.out.println("Trains " + trains.toString() + " arrives at " + destination);
  }

  public void printTrainsThatArrivesAtAndDepartAfter(List<Train> trains, String destination, LocalTime time) {
    printTrainsThatArrivesAt(trains, destination);
    System.out.println("After " + time);
  }
}
