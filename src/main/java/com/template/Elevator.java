package com.template;

public class Elevator {
    int m_capacity;
    int m_currentFloor;
    int m_maxFloor;
    int m_minFloor;
    int m_countP;

    public Elevator(int _minFloor, int _maxFloor, int _capacity)
    {
        this.m_capacity = _capacity;
        this.m_currentFloor = _minFloor;
        this.m_maxFloor = _maxFloor;
        this.m_minFloor = _minFloor;
    }

    public void moveToFloor(int i) {
        if (m_currentFloor + i >= m_maxFloor) return;
        m_currentFloor = m_currentFloor + i;
    }

    public int getCurrentFloor() {
        return m_currentFloor;
    }

    public void addPassenger() {
        if (m_countP >= m_capacity) return;
        m_countP++;
    }

    public int getPassengerCount() {
        return m_countP;
    }

    public void removePassenger() {
        if (m_countP <= 0) return;
        m_countP--;
    }


    // Implement this class by observing the tests in this repo. From those you will be able
    // to pick what the constructors params are, what the methods are and what they should do.


}
