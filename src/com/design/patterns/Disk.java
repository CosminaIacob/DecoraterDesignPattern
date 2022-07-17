package com.design.patterns;


public class Disk extends ComponentDecorator {

  Computer computer;


  public Disk (Computer c) {

    this.computer = c;
  }


  @Override
  public String description () {

    return computer.description() + " and a disk";
  }
}
