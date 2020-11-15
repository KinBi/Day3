package com.monkeybusiness.training.task.creator;

import com.monkeybusiness.training.task.entity.Train;
import com.monkeybusiness.training.task.enums.Destination;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;

public class TrainCreator {
  public static int MAX_TRAIN_NUM = 5;
  public static int MIN_SEATS_COUNT = 20;
  public static int MAX_ADDITIONAL_SEATS_COUNT = 23;
  public static int SECONDS_IN_DAY = 86400;

  public void fillRandomized (List<Train> trains, int count) {
    Random random = new Random();
    Destination[] destinations = Destination.values();

    for (int i = 0; i < count; i++) {
      String destination = destinations[random.nextInt(destinations.length)].toString();
      int trainNumber = random.nextInt(MAX_TRAIN_NUM) + 1;
      LocalTime departureTime = LocalTime.ofSecondOfDay(random.nextInt(SECONDS_IN_DAY));
      int seatsCount = random.nextInt(MAX_ADDITIONAL_SEATS_COUNT) + MIN_SEATS_COUNT;

      Train train = new Train(destination, trainNumber, departureTime, seatsCount);
      trains.add(train);
    }

  }
}
