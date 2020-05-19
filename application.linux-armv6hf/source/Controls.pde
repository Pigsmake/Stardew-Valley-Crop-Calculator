void Controlmode() {
  if (cropAmountcontrol) {
    String cAc1 = "Select an area to choose that amount of crops";
    String cAc2 = "(Numbers are on the left)";
    String cAcs1 = "Spring crop amount";
    String cAcs2 = "Summer crop amount";
    String cAcs3 = "Fall crop amount";
    String cAcsw1 = "Press SHIFT to choose the Summer crop amount";
    String cAcsw2 = "Press ALT to choose the Fall crop amount";
    String cAcsw3 = "Press CONTROL to choose the Spring crop amount";
    String cAc3 = "Press any key (other than 'c') to switch back";
    if (Spring) {
      textSize(40);
      text(cAcs1, 150, 40);
      textSize(20);
      text(cAc1, 0, 90);
      text(cAc2, 0, 120);
      text(cAcsw1, 0, 150);
      text(cAc3, 0, 180);
    }
    if (Summer) {
      textSize(40);
      text(cAcs2, 150, 40);
      textSize(20);
      text(cAc1, 0, 90);
      text(cAc2, 0, 120);
      text(cAcsw2, 0, 150);
      text(cAcsw3, 0, 180);
      text(cAc3, 0, 210);
    }
    if (Fall) {
      textSize(40);
      text(cAcs3, 150, 40);
      textSize(20);
      text(cAc1, 0, 90);
      text(cAc2, 0, 120);
      text(cAcsw1, 0, 150);
      text(cAc3, 0, 180);
    }
    if (keyPressed) {
      if (key == 'C' || key == 'c') {
      } else {
        if (Spring) {
          cropAmountcontrol = false;
          background(0);
          cropAmountspring = true;
          Spring = false;
        }
        if (Summer) {
          cropAmountcontrol = false;
          background(0);
          cropAmountsummer = true;
          Summer = false;
        }
        if (Fall) {
          cropAmountcontrol = false;
          background(0);
          cropAmountfall = true;
          Fall = false;
        }
      }
    }
  }
  if(cropSelectcontrols) {
    String cSc1 = "Choose the crop that your going to grow.";
    String cSc2 = "You'll automatically be sent to the next page once you choose a crop";
    String cSc3 = "Press 'b' to go back to the amount selectors";
    String cSct1 = "Crop Selector";
    String cSc4 = "Press any key (other than 'c') to switch back";
    textSize(40);
    text(cSct1, 200, 40);
    textSize(20);
    text(cSc1, 0, 70);
    text(cSc2, 0, 110);
    text(cSc3, 0, 150);
    text(cSc4, 0, 180);
    if(keyPressed) {
      if(key == 'c' || key == 'C') {
        
      }else{
       cropSelectcontrols = false;
       cropSelect = true;
       background(0);
      }
    }
  }
  if(cropCalendarcontrols) {
    String cCalect = "Basic Crop Calendar";
    String cCalecd = "No speed-grow, no direct sell. Thats the next Update";
    String cCalec1 = "Press 'n' to go to the Claculator";
    String cCalec2 = "Press 'b' to go back and reselect a crop";
    String cCalec3 = "Press 'shift' to see the second/irigated season of crops";
    String cCalec4 = "Press 'ctrl (Control)' to see the first/unirigated season of crops";
    String cCalec5 = "Press any key (other than 'c') to switch back";
    textSize(40);
    text(cCalect, 150, 40);
    textSize(20);
    text(cCalecd, 0, 80);
    text(cCalec1, 0, 120);
    text(cCalec2, 0, 160);
    text(cCalec3, 0, 200);
    text(cCalec4, 0, 240);
    text(cCalec5, 0, 280);
    if(keyPressed) {
      if(key == 'c' || key == 'C') {
        
      }else{
       cropCalendarcontrols = false;
       cropCalendarN = true;
       background(0);
      }
    }
  }
  if(cropCalculatorcontrols) {
    String cCalcct = "Basic Crop Calculator";
    String cCalccd = "No Speed-grow, no direct sell, no crop quality. Next update";
    String cCalcc1 = "Calculator, the amount and crop sets the cost and profit";
    String cCalcc2 = "Gross = income before expenses";
    String cCalcc3 = "Expenses = cost of seeds";
    String cCalcc4 = "Net = Gross - Expenses";
    String cCalcc5 = "Press 'x' to go back to the Calculator";
    String cCalcc6 = "Press 'z' to go back and reselect crops";
    String cCalcc7 = "Press any key (other than 'c') to switch back";
    textSize(40);
    text(cCalcct, 150, 40);
    textSize(20);
    text(cCalccd, 0, 80);
    text(cCalcc1, 0, 120);
    text(cCalcc2, 0, 160);
    text(cCalcc3, 0, 200);
    text(cCalcc4, 0, 240);
    text(cCalcc5, 0, 280);
    text(cCalcc6, 0, 320);
    text(cCalcc7, 0, 360);
    if(keyPressed) {
      if(key == 'c' || key == 'C') {
        
      }else{
       cropCalculatorcontrols = false;
       cropCalculator = true;
       background(0);
      }
    }
  }
}
