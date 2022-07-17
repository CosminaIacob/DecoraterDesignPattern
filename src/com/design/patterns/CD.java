package com.design.patterns;


public class CD extends ComponentDecorator {

  Computer computer;


  public CD (Computer c) {

    this.computer = c;
  }


  @Override
  public String description () {

    return computer.description() + " and a CD";
  }
}
