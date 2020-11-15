package com.monkeybusiness.training.task.service;

import com.monkeybusiness.training.task.entity.Train;
import org.testng.annotations.Test;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class TrainServiceTest {

  @Test
  public void FindTrainsThatArrivesAtTest() {
    String destination = "LA";
    int trainNumber = 3;
    LocalTime localTime = LocalTime.now();
    int seatCount = 45;
    Train train1 = new Train(destination, trainNumber, localTime, seatCount);
    Train[] trains = {train1, train1};
    List<Train> expected = Arrays.asList(trains);
    TrainService service = new TrainService();
    List<Train> actual = service.findTrainsThatArrivesAt(expected, destination);
    assertEquals(actual, expected);
  }

  @Test
  public void FindTrainsThatArrivesAtAndDepartAfterTest() {
    String destination = "LA";
    int trainNumber = 3;
    LocalTime localTime = LocalTime.now();
    int seatCount = 45;
    Train train1 = new Train(destination, trainNumber, localTime, seatCount);
    Train[] trains = {train1, train1};
    List<Train> expected = Arrays.asList(trains);
    TrainService service = new TrainService();
    List<Train> actual = service.findTrainsThatArrivesAtAndDepartAfter(expected, destination, localTime.minusSeconds(1));
    assertEquals(actual, expected);
  }
}