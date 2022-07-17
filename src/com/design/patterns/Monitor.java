package com.design.patterns;


public class Monitor extends ComponentDecorator {

  Computer computer;


  public Monitor (Computer c) {

    this.computer = c;
  }


  @Override
  public String description () {

    return computer.description() + " and a monitor";
  }
}
