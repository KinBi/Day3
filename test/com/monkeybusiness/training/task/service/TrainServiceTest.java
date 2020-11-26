package com.monkeybusiness.training.task.service;

import com.monkeybusiness.training.task.entity.Destination;
import com.monkeybusiness.training.task.entity.RailwayStation;
import com.monkeybusiness.training.task.entity.Train;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.LocalTime;

import static org.testng.Assert.*;

public class TrainServiceTest {
  TrainService service;
  Destination destination;
  int trainNumber;
  LocalTime localTime;
  int seatCount;

  @BeforeClass
  public void setUp() {
    service = new TrainService();
    destination = Destination.LA;
    trainNumber = 3;
    localTime = LocalTime.now();
    seatCount = 45;
  }

  @Test
  public void findTrainsThatArrivesAtTest() {
    Train train1 = new Train(destination, trainNumber, localTime, seatCount);
    Train[] expected = {train1, train1};

    RailwayStation station = new RailwayStation(expected);

    Train[] actual = service.findTrainsThatArrivesAt(station, destination);
    assertEquals(actual, expected);
  }

  @Test
  public void findTrainsThatArrivesAtAndDepartAfterTest() {
    Train train1 = new Train(destination, trainNumber, localTime, seatCount);
    Train[] expected = {train1, train1};

    RailwayStation station = new RailwayStation(expected);

    Train[] actual = service.findTrainsThatArrivesAtAndDepartAfter(station, destination, localTime.minusSeconds(1));
    assertEquals(actual, expected);
  }
}