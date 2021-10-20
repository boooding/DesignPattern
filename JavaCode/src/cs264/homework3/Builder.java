package cs264.homework3;

import java.util.LinkedList;
//The common interface

interface Builder
{
    void startUpOperations();
    void buildBody();
    void addCPU();
    void addRam();
    void addDisplay();
    void addKeyboard();
    void endOperations();
    /*The following method is used to retrieve the object that is
   constructed.*/
    Product getComputer();
}


//Lenovo class

// Product class

// Director class
