package com.monkeybusiness.training.task.main;

import com.monkeybusiness.training.task.creator.TrainCreator;
import com.monkeybusiness.training.task.entity.Destination;
import com.monkeybusiness.training.task.entity.RailwayStation;
import com.monkeybusiness.training.task.entity.Train;
import com.monkeybusiness.training.task.report.TrainReport;
import com.monkeybusiness.training.task.service.TrainService;

import java.time.LocalTime;

public class Runner {
  public static void main(String[] args) {
    RailwayStation railvayStation = new RailwayStation();

    int trainsCount = 10;
    Train[] trains = new Train[trainsCount];

    TrainCreator creator = new TrainCreator();
    creator.fillRandomized(trains, trainsCount);
    railvayStation.setTrains(trains);

    TrainService trainService = new TrainService();
    Destination destination = Destination.LA;
    Train[] trainList1 = trainService.findTrainsThatArrivesAt(railvayStation, destination);

    TrainReport report = new TrainReport();
    report.printTrainsThatArrivesAt(trainList1, destination);

    LocalTime time = LocalTime.now();
    Train[] trainList2 = trainService.findTrainsThatArrivesAtAndDepartAfter(railvayStation, destination, time);

    report.printTrainsThatArrivesAtAndDepartAfter(trainList2, destination, time);
  }
}
