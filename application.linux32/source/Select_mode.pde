void Selectmode() {
  if (cropSelect == true) {
    stroke(255);
    for (int i = 33; i < 594; i += 33) {
      line(0, i, 700, i);
    }
    line(350, 0, 350, height);
    //crops
    fill(255);
    textSize(32);
    text("Amaranth", 20, 33);
    text("Artichoke", 370, 33);
    text("Beet", 20, 66);
    text("Blueberry", 370, 66);
    text("Blue Jazz", 20, 99);
    text("Bok Choy", 370, 99);
    text("Cauliflower", 20, 132);
    text("Coffee Bean", 370, 132);
    text("Corn", 20, 165);
    text("Cranberries", 370, 165);
    text("Eggplant", 20, 198);
    text("Fairy Rose", 370, 198);
    text("Garlic", 20, 231);
    text("Green Bean", 370, 231);
    text("Grape", 20, 264);
    text("Hops", 370, 264);
    text("Hot Pepper", 20, 297);
    text("Kale", 370, 297);
    text("Melon", 20, 330);
    text("Parsnip", 370, 330);
    text("Poppy", 20, 363);
    text("Potato", 370, 363);
    text("Pumpkin", 20, 396);
    text("Radish", 370, 396);
    text("Red Cabbage", 20, 429);
    text("Rhubarb", 370, 429);
    text("Starfruit", 20, 462);
    text("Strawberry", 370, 462);
    text("Summer Spangle", 20, 495);
    text("Sunflower", 370, 495);
    text("Tomato", 20, 528);
    text("Tulip", 370, 528);
    text("Unmilled Rice", 20, 561);
    text("Wheat", 370, 561);
    text("Yam", 20, 594);
    if (mousePressed) {
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 0 && mouseY <= 33) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 1;
        cropPrice = 150;
        cropCost = 70;
        cropHarvest = 3;
        cropSeeding = 3;
        Spring = false;
        Summer = false;
        Fall = true;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 0 && mouseY <= 33) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 2;
        cropPrice = 160;
        cropCost = 30;
        cropHarvest = 3;
        cropSeeding = 3;
        Spring = false;
        Summer = false;
        Fall = true;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 33 && mouseY <= 66) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 3;
        cropPrice = 100;
        cropCost = 20;
        cropHarvest = 4;
        cropSeeding = 4;
        Spring = false;
        Summer = false;
        Fall = true;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 33 && mouseY <= 66) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 4;
        cropPrice = 50;
        cropCost = 80;
        cropHarvest = 4;
        cropSeeding = 1;
        Spring = false;
        Summer = true;
        Fall = false;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 66 && mouseY <= 99) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 5;
        cropPrice = 50;
        cropCost = 30;
        cropHarvest = 3;
        cropSeeding = 3;
        Spring = true;
        Summer = false;
        Fall = false;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 66 && mouseY <= 99) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 6;
        cropPrice = 80;
        cropCost = 50;
        cropHarvest = 5;
        cropSeeding = 5;
        Spring = false;
        Summer = false;
        Fall = true;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 99 && mouseY <= 132) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 7;
        cropPrice = 175;
        cropCost = 80;
        cropHarvest = 2;
        cropSeeding = 2;
        Spring = true;
        Summer = false;
        Fall = false;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 99 && mouseY <= 132) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 8;
        cropPrice = 15;
        cropCost = 2500;
        cropHarvest = 9;
        cropSeeding = 1;
        Spring = true;
        Summer = true;
        Fall = false;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 132 && mouseY <= 165) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 9;
        cropPrice = 50;
        cropCost = 150;
        cropHarvest = 4;
        cropSeeding = 1;
        Spring = false;
        Summer = true;
        Fall = true;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 132 && mouseY <= 165) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 10;
        cropPrice = 75;
        cropCost = 240;
        cropHarvest = 5;
        cropSeeding = 1;
        Spring = false;
        Summer = false;
        Fall = true;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 165 && mouseY <= 198) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 11;
        cropPrice = 60;
        cropCost = 20;
        cropHarvest = 4;
        cropSeeding = 1;
        Spring = false;
        Summer = false;
        Fall = true;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 165 && mouseY <= 198) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 12;
        cropPrice = 60;
        cropCost = 20;
        cropHarvest = 2;
        cropSeeding = 2;
        Spring = false;
        Summer = false;
        Fall = true;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 198 && mouseY <= 231) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 13;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 198 && mouseY <= 231) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 14;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 231 && mouseY <= 264) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 15;
        cropPrice = 80;
        cropCost = 60;
        cropHarvest = 6;
        cropSeeding = 1;
        Spring = false;
        Summer = false;
        Fall = true;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 231 && mouseY <= 264) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 16;
        cropPrice = 25;
        cropCost = 60;
        cropHarvest = 17;
        cropSeeding = 1;
        Spring = false;
        Summer = true;
        Fall = false;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 264 && mouseY <= 297) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 17;
        cropPrice = 40;
        cropCost = 40;
        cropHarvest = 8;
        cropSeeding = 1;
        Spring = false;
        Summer = true;
        Fall = false;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 264 && mouseY <= 297) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 18;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 297 && mouseY <= 330) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 19;
        cropPrice = 250;
        cropCost = 80;
        cropHarvest = 2;
        cropSeeding = 2;
        Spring = false;
        Summer = true;
        Fall = false;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 297 && mouseY <= 330) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 20;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 330 && mouseY <= 396) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 21;
        cropPrice = 140;
        cropCost = 100;
        cropHarvest = 3;
        cropSeeding = 3;
        Spring = false;
        Summer = true;
        Fall = false;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 330 && mouseY <= 396) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 22;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 363 && mouseY <= 396) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 23;
        cropPrice = 320;
        cropCost = 100;
        cropHarvest = 2;
        cropSeeding = 2;
        Spring = false;
        Summer = false;
        Fall = true;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 363 && mouseY <= 396) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 24;
        cropPrice = 90;
        cropCost = 40;
        cropHarvest = 4;
        cropSeeding = 4;
        Spring = false;
        Summer = true;
        Fall = false;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 396 && mouseY <= 429) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 25;
        cropPrice = 260;
        cropCost = 100;
        cropHarvest = 2;
        cropSeeding = 2;
        Spring = false;
        Summer = true;
        Fall = false;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 396 && mouseY <= 429) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 26;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 429 && mouseY <= 462) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 27;
        cropPrice = 750;
        cropCost = 400;
        cropHarvest = 2;
        cropSeeding = 2;
        Spring = false;
        Summer = true;
        Fall = false;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 429 && mouseY <= 462) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 28;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 462 && mouseY <= 495) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 29;
        cropPrice = 90;
        cropCost = 50;
        cropHarvest = 3;
        cropSeeding = 3;
        Spring = false;
        Summer = true;
        Fall = false;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 462 && mouseY <= 495) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 30;
        cropPrice = 80;
        cropCost = 200;
        cropHarvest = 0;
        cropSeeding = 0;
        Spring = false;
        Summer = true;
        Fall = true;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 495 && mouseY <= 528) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 31;
        cropPrice = 60;
        cropCost = 50;
        cropHarvest = 5;
        cropSeeding = 1;
        Spring = false;
        Summer = true;
        Fall = false;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 495 && mouseY <= 528) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 32;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 528 && mouseY <= 561) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 33;
      }
      if (mouseX >= 350 && mouseX <= 700 && mouseY >= 528 && mouseY <= 561) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 34;
        cropPrice = 25;
        cropCost = 10;
        cropHarvest = 0;
        cropSeeding = 0;
        Spring = false;
        Summer = true;
        Fall = true;
      }
      if (mouseX >= 0 && mouseX <= 350 && mouseY >= 561 && mouseY <= 600) {
        fill(0);
        rect(0, 0, 700, 600);
        cropSelect = false;
        cropCalendarN = true;
        cropType = 35;
      }
    }
    if(keyPressed) {
      if(key == 'b' || key == 'B') {
        cropSelect = false;
        cropAmountspring = true;
        fill(0);
        rect(0, 0, 700, 600);
      }
      if(key == 'c' || key == 'C') {
        cropSelect = false;
        cropSelectcontrols = true;
        background(0);
      }
    }
  }
}
