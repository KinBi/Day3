package com.monkeybusiness.training.task.main;

import com.monkeybusiness.training.task.creator.TrainCreator;
import com.monkeybusiness.training.task.entity.Train;
import com.monkeybusiness.training.task.report.TrainReport;
import com.monkeybusiness.training.task.service.TrainService;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class Runner {
  public static void main(String[] args) {
    int trainsCount = 10;
    List<Train> trains = new LinkedList<>();

    TrainCreator creator = new TrainCreator();
    creator.fillRandomized(trains, trainsCount);

    TrainService trainService = new TrainService();
    String destination = "LA";
    List<Train> trainList1 = trainService.findTrainsThatArrivesAt(trains, destination);

    TrainReport report = new TrainReport();
    report.printTrainsThatArrivesAt(trainList1, destination);

    LocalTime time = LocalTime.now();
    List<Train> trainList2 = trainService.findTrainsThatArrivesAtAndDepartAfter(trains, destination, time);

    report.printTrainsThatArrivesAtAndDepartAfter(trainList2, destination, time);
  }
}
