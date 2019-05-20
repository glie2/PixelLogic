package com.example.lib;

public class Cell {

    private boolean status;
    private boolean beenClicked;

    public Cell(boolean setStatus, boolean setBeenClicked) {
        status = setStatus;
        beenClicked = setBeenClicked;
    }

    public void setCell(boolean setStatus, boolean setBeenClicked) {
        status = setStatus;
        beenClicked = setBeenClicked;
    }

    public boolean getStatus() {
        return status;
    }

    public boolean getBeenClicked() {
        return beenClicked;
    }

}
