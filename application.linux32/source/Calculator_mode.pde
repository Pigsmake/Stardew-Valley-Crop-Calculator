void Calculatormode() {
  if (cropCalculator == true) {
    //var
    int sg1 = cropAmountsetspring * cropPrice * cropHarvest;
    int se1 = cropAmountsetspring * cropCost * cropSeeding;
    int sn1 = sg1 - se1;
    int sg2 = cropAmountsetsummer * cropPrice * cropHarvest;
    int se2 = cropAmountsetsummer * cropCost * cropSeeding;
    int sn2 = sg2 - se2;
    int sg3 = cropAmountsetfall * cropPrice * cropHarvest;
    int se3 = cropAmountsetfall * cropCost * cropSeeding;
    int sn3 = sg3 - se3;
    fill(255);
    stroke(255);
    textSize(20);
    text("Spring gross", 0, 20);
    if (Spring == false) {
      text("N/A", 0, 40);
    } else if (Spring == true) {
      text(sg1, 0, 40);
      if (sg1 < 10) {
        text("g", 20, 40);
      } else if (sg1 < 100 && sg1 > 9) {
        text("g", 30, 40);
      } else if (sg1 < 1000) {
        text("g", 40, 40);
      } else if (sg1 < 10000 && sg1 > 999) {
        text("g", 50, 40);
      } else if (sg1 > 10000) {
        text("g", 65, 40);
      }
    }
    text("Spring expenses", 0, 120);
    if (Spring == false) {
      text("N/A", 0, 140);
    } else if (Spring == true) {
      text(se1, 0, 140);
      if (se1 < 10) {
        text("g", 20, 140);
      } else if (se1 < 100 && se1 > 9) {
        text("g", 30, 140);
      } else if (se1 < 1000) {
        text("g", 40, 140);
      } else if (se1 < 10000 && se1 > 999) {
        text("g", 50, 140);
      } else if (se1 > 10000) {
        text("g", 65, 140);
      }
    }
    text("Spring net", 0, 220);
    if (Spring == false) {
      text("N/A", 0, 240);
    } else if (Spring == true) {
      text(sn1, 0, 240);
      if (sn1 < 10) {
        text("g", 20, 240);
      } else if (sn1 < 100 && sn1 > 9) {
        text("g", 30, 240);
      } else if (sn1 < 1000) {
        text("g", 40, 240);
      } else if (sn1 < 10000 && sn1 > 999) {
        text("g", 50, 240);
      } else if (sn1 > 10000) {
        text("g", 65, 240);
      }
    }
    text("Summer gross", 250, 20);
    if (Summer == false) {
      text("N/A", 250, 40);
    } else if (Summer == true) {
      text(sg2, 250, 40);
      if (sg2 < 10) {
        text("g", 270, 40);
      } else if (sg2 < 100 && sg2 > 9) {
        text("g", 280, 40);
      } else if (sg2 < 1000) {
        text("g", 290, 40);
      } else if (sg2 < 10000 && sg2 > 999) {
        text("g", 300, 40);
      } else if (sg2 > 10000) {
        text("g", 315, 40);
      }
    }
    text("Summer expenses", 250, 120);
    if (Summer == false) {
      text("N/A", 250, 140);
    } else if (Summer == true) {
      text(se2, 250, 140);
      if (se2 < 10) {
        text("g", 270, 140);
      } else if (se2 < 100 && se2 > 9) {
        text("g", 280, 140);
      } else if (se2 < 1000) {
        text("g", 290, 140);
      } else if (se2 < 10000 && se2 > 999) {
        text("g", 300, 140);
      } else if (se2 > 10000) {
        text("g", 315, 140);
      }
    }
    text("Summer net", 250, 220);
    if (Summer == false) {
      text("N/A", 250, 240);
    } else if (Summer == true) {
      text(sn2, 250, 240);
      if (sn3 < 10) {
        text("g", 270, 240);
      } else if (sn3 < 100 && sn3 > 9) {
        text("g", 280, 240);
      } else if (sn3 < 1000) {
        text("g", 290, 240);
      } else if (sn3 < 10000 && sn3 > 999) {
        text("g", 300, 240);
      } else if (sn3 > 10000) {
        text("g", 315, 240);
      }
    }
    text("Fall gross", 500, 20);
    if (Fall == false) {
      text("N/A", 500, 40);
    } else if (Fall == true) {
      text(sg3, 500, 40);
      if (sg3 < 10) {
        text("g", 520, 40);
      } else if (sg3 < 100 && sg3 > 9) {
        text("g", 530, 40);
      } else if (sg3 < 1000) {
        text("g", 540, 40);
      } else if (sg3 < 10000 && sg3 > 999) {
        text("g", 550, 40);
      } else if (sg3 > 10000) {
        text("g", 565, 40);
      }
    }
    text("Fall expenses", 500, 120);
    if (Fall == false) {
      text("N/A", 500, 140);
    } else if (Fall == true) {
      text(se3, 500, 140);
      if (se3 < 10) {
        text("g", 520, 140);
      } else if (se3 < 100 && se3 > 9) {
        text("g", 530, 140);
      } else if (se3 < 1000) {
        text("g", 540, 140);
      } else if (se3 < 10000 && se3 > 999) {
        text("g", 550, 140);
      } else if (se3 > 10000) {
        text("g", 565, 140);
      }
    }
    text("Fall net", 500, 220);
    if (Fall == false) {
      text("N/A", 500, 240);
    } else if (Fall == true) {
      text(sn3, 500, 240);
      if (sn3 < 10) {
        text("g", 520, 240);
      } else if (sn3 < 100 && sn3 > 9) {
        text("g", 530, 240);
      } else if (sn3 < 1000) {
        text("g", 540, 240);
      } else if (sn3 < 10000 && sn3 > 999) {
        text("g", 550, 240);
      } else if (sn3 > 10000) {
        text("g", 565, 240);
      }
    }
    line(0, 300, 700, 300);
    if (keyPressed) {
      if (key == 'x' || key == 'X') {
        cropCalculator = false;
        cropCalendarN = true;
        fill(0);
        rect(0, 0, 700, 600);
      }
      if (key == 'z' || key == 'Z') {
        cropCalculator = false; 
        cropSelect = true;
        fill(0);
        rect(0, 0, 700, 600);
      }
      if (key == 'c' || key == 'C') {
        cropCalculator = false;
        cropCalculatorcontrols = true;
        background(0);
      }
    }
  }
}
