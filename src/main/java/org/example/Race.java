package org.example;

public class Race {
    String leader = ""; //наш лидер гонки
    int distanceCovered = 0; //дистанция
    public void checkLeader(String nameCar, int speed) {
        int distance = 24 * speed;
        if (distance > distanceCovered) {
            leader = nameCar;
            distanceCovered = distance;
        }
    }
    public String getLeader() {
        return leader;
    }

    public int getDistanceCovered() {
        return distanceCovered;
    }
}
