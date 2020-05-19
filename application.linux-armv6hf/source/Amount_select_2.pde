void Amountselect2mode()  {
  
  if(cropAmountsummer == true)  {
        stroke(255);
    for (int i = 66; i < 580; i += 66) {
      line(0, i, 700, i);
    }
    for (int i = 63; i < 680; i += 63) {
      line(i, 0, i, 600);
    }
    //text
    fill(255);
    textSize(20);
    text("1-10", 0, 40);
    text("11-20", 0, 106);
    text("21-30", 0, 172);
    text("31-40", 0, 238);
    text("41-50", 0, 304);
    text("51-60", 0, 370);
    text("61-70", 0, 436);
    text("71-80", 0, 502);
    text("81-90", 0, 568);
    //functions
    fill(0);
    noStroke();
    
    if (mousePressed) {
      //first column
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(95, 32, 10, 10);
        cropAmountsetsummer = 1;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 100, 10, 10);
        cropAmountsetsummer = 11;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 168, 10, 10);
        cropAmountsetsummer = 21;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 236, 10, 10);
        cropAmountsetsummer = 31;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 304, 10, 10);
        cropAmountsetsummer = 41;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 362, 10, 10);
        cropAmountsetsummer = 51;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 430, 10, 10);
        cropAmountsetsummer = 61;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 498, 10, 10);
        cropAmountsetsummer = 71;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 566, 10, 10);
        cropAmountsetsummer = 81;
      }
      //second column
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(158, 32, 10, 10);
        cropAmountsetsummer = 2;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 100, 10, 10);
        cropAmountsetsummer = 12;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 168, 10, 10);
        cropAmountsetsummer = 22;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 236, 10, 10);
        cropAmountsetsummer = 32;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 304, 10, 10);
        cropAmountsetsummer = 42;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 362, 10, 10);
        cropAmountsetsummer = 52;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 430, 10, 10);
        cropAmountsetsummer = 62;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 498, 10, 10);
        cropAmountsetsummer = 72;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 566, 10, 10);
        cropAmountsetsummer = 82;
      }
      //third column
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(221, 32, 10, 10);
        cropAmountsetsummer = 3;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 100, 10, 10);
        cropAmountsetsummer = 13;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 168, 10, 10);
        cropAmountsetsummer = 23;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 236, 10, 10);
        cropAmountsetsummer = 33;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 304, 10, 10);
        cropAmountsetsummer = 43;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 362, 10, 10);
        cropAmountsetsummer = 53;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 430, 10, 10);
        cropAmountsetsummer = 63;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 498, 10, 10);
        cropAmountsetsummer = 73;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 566, 10, 10);
        cropAmountsetsummer = 83;
      }
      //fourth column
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(284, 32, 10, 10);
        cropAmountsetsummer = 4;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 100, 10, 10);
        cropAmountsetsummer = 14;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 168, 10, 10);
        cropAmountsetsummer = 24;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 236, 10, 10);
        cropAmountsetsummer = 34;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 304, 10, 10);
        cropAmountsetsummer = 44;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 362, 10, 10);
        cropAmountsetsummer = 54;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 430, 10, 10);
        cropAmountsetsummer = 64;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 498, 10, 10);
        cropAmountsetsummer = 74;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 566, 10, 10);
        cropAmountsetsummer = 84;
      }
      //fith column
       if (mouseX >= 315 && mouseX <= 378 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(347, 32, 10, 10);
        cropAmountsetsummer = 5;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 100, 10, 10);
        cropAmountsetsummer = 15;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 168, 10, 10);
        cropAmountsetsummer = 25;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 236, 10, 10);
        cropAmountsetsummer = 35;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 304, 10, 10);
        cropAmountsetsummer = 45;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 362, 10, 10);
        cropAmountsetsummer = 55;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 430, 10, 10);
        cropAmountsetsummer = 65;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 498, 10, 10);
        cropAmountsetsummer = 75;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 566, 10, 10);
        cropAmountsetsummer = 85;
      }
      //sixth column
        if (mouseX >= 378 && mouseX <= 441 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(410, 32, 10, 10);
        cropAmountsetsummer = 6;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 100, 10, 10);
        cropAmountsetsummer = 16;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 168, 10, 10);
        cropAmountsetsummer = 26;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 236, 10, 10);
        cropAmountsetsummer = 36;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 304, 10, 10);
        cropAmountsetsummer = 46;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 362, 10, 10);
        cropAmountsetsummer = 56;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 430, 10, 10);
        cropAmountsetsummer = 66;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 498, 10, 10);
        cropAmountsetsummer = 76;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 566, 10, 10);
        cropAmountsetsummer = 86;
      }
      //seventh column
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(473, 32, 10, 10);
        cropAmountsetsummer = 7;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 100, 10, 10);
        cropAmountsetsummer = 17;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 168, 10, 10);
        cropAmountsetsummer = 27;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 236, 10, 10);
        cropAmountsetsummer = 37;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 304, 10, 10);
        cropAmountsetsummer = 47;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 362, 10, 10);
        cropAmountsetsummer = 57;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 430, 10, 10);
        cropAmountsetsummer = 67;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 498, 10, 10);
        cropAmountsetsummer = 77;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 566, 10, 10);
        cropAmountsetsummer = 87;
      }
      //eighth column
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(536, 32, 10, 10);
        cropAmountsetsummer = 8;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 100, 10, 10);
        cropAmountsetsummer = 18;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 168, 10, 10);
        cropAmountsetsummer = 28;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 236, 10, 10);
        cropAmountsetsummer = 38;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 304, 10, 10);
        cropAmountsetsummer = 48;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 362, 10, 10);
        cropAmountsetsummer = 58;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 430, 10, 10);
        cropAmountsetsummer = 68;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 498, 10, 10);
        cropAmountsetsummer = 78;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 566, 10, 10);
        cropAmountsetsummer = 88;
      }
      //ninth column
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(599, 32, 10, 10);
        cropAmountsetsummer = 9;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 100, 10, 10);
        cropAmountsetsummer = 19;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 168, 10, 10);
        cropAmountsetsummer = 29;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 236, 10, 10);
        cropAmountsetsummer = 39;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 304, 10, 10);
        cropAmountsetsummer = 49;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 362, 10, 10);
        cropAmountsetsummer = 59;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 430, 10, 10);
        cropAmountsetsummer = 69;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 498, 10, 10);
        cropAmountsetsummer = 79;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 566, 10, 10);
        cropAmountsetsummer = 89;
      }
      //tenth column
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(662, 32, 10, 10);
        cropAmountsetsummer = 10;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 100, 10, 10);
        cropAmountsetsummer = 20;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 168, 10, 10);
        cropAmountsetsummer = 30;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 236, 10, 10);
        cropAmountsetsummer = 40;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 304, 10, 10);
        cropAmountsetsummer = 50;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 362, 10, 10);
        cropAmountsetsummer = 60;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 430, 10, 10);
        cropAmountsetsummer = 70;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 498, 10, 10);
        cropAmountsetsummer = 80;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 566, 10, 10);
        cropAmountsetsummer = 90;
      }
    }
        fill(255);
    if(cropAmountsetsummer == 1) {
      ellipse(95, 32, 10, 10);
    }
    if(cropAmountsetsummer == 2) {
      ellipse(158, 32, 10, 10);
    }
    if(cropAmountsetsummer == 3) {
      ellipse(221, 32, 10, 10);
    }
    if(cropAmountsetsummer == 4) {
      ellipse(284, 32, 10, 10);
    }
    if(cropAmountsetsummer == 5) {
      ellipse(347, 32, 10, 10);
    }
    if(cropAmountsetsummer == 6) {
      ellipse(410, 32, 10, 10);
    }
    if(cropAmountsetsummer == 7) {
      ellipse(473, 32, 10, 10);
    }
    if(cropAmountsetsummer == 8) {
      ellipse(536, 32, 10, 10);
    }
    if(cropAmountsetsummer == 9) {
      ellipse(599, 32, 10, 10);
    }
    if(cropAmountsetsummer == 10) {
      ellipse(662, 32, 10, 10);
    }
    if(cropAmountsetsummer == 11) {
      ellipse(95, 100, 10, 10);
    }
    if(cropAmountsetsummer == 12) {
      ellipse(158, 100, 10, 10);
    }
    if(cropAmountsetsummer == 13) {
      ellipse(221, 100, 10, 10);
    }
    if(cropAmountsetsummer == 14) {
      ellipse(284, 100, 10, 10);
    }
    if(cropAmountsetsummer == 15) {
      ellipse(347, 100, 10, 10);
    }
    if(cropAmountsetsummer == 16) {
      ellipse(410, 100, 10, 10);
    }
    if(cropAmountsetsummer == 17) {
      ellipse(473, 100, 10, 10);
    }
    if(cropAmountsetsummer == 18) {
      ellipse(536, 100, 10, 10);
    }
    if(cropAmountsetsummer == 19) {
      ellipse(599, 100, 10, 10);
    }
    if(cropAmountsetsummer == 20) {
      ellipse(662, 100, 10, 10);
    }
    if(cropAmountsetsummer == 21) {
      ellipse(95, 168, 10, 10);
    }
    if(cropAmountsetsummer == 22) {
      ellipse(158, 168, 10, 10);
    }
    if(cropAmountsetsummer == 23) {
      ellipse(221, 168, 10, 10);
    }
    if(cropAmountsetsummer == 24) {
      ellipse(284, 168, 10, 10);
    }
    if(cropAmountsetsummer == 25) {
      ellipse(347, 168, 10, 10);
    }
    if(cropAmountsetsummer == 26) {
      ellipse(410, 168, 10, 10);
    }
    if(cropAmountsetsummer == 27) {
      ellipse(473, 168, 10, 10);
    }
    if(cropAmountsetsummer == 28) {
      ellipse(536, 168, 10, 10);
    }
    if(cropAmountsetsummer == 29) {
      ellipse(599, 168, 10, 10);
    }
    if(cropAmountsetsummer == 30) {
      ellipse(662, 168, 10, 10);
    }
    if(cropAmountsetsummer == 31) {
      ellipse(95, 236, 10, 10);
    }
    if(cropAmountsetsummer == 32) {
      ellipse(158, 236, 10, 10);
    }
    if(cropAmountsetsummer == 33) {
      ellipse(221, 236, 10, 10);
    }
    if(cropAmountsetsummer == 34) {
      ellipse(284, 236, 10, 10);
    }
    if(cropAmountsetsummer == 35) {
      ellipse(347, 236, 10, 10);
    }
    if(cropAmountsetsummer == 36) {
      ellipse(410, 236, 10, 10);
    }
    if(cropAmountsetsummer == 37) {
      ellipse(473, 236, 10, 10);
    }
    if(cropAmountsetsummer == 38) {
      ellipse(536, 236, 10, 10);
    }
    if(cropAmountsetsummer == 39) {
      ellipse(599, 236, 10, 10);
    }
    if(cropAmountsetsummer == 40) {
      ellipse(662, 236, 10, 10);
    }
    if(cropAmountsetsummer == 41) {
      ellipse(95, 304, 10, 10);
    }
    if(cropAmountsetsummer == 42) {
      ellipse(158, 304, 10, 10);
    }
    if(cropAmountsetsummer == 43) {
      ellipse(221, 304, 10, 10);
    }
    if(cropAmountsetsummer == 44) {
      ellipse(284, 304, 10, 10);
    }
    if(cropAmountsetsummer == 45) {
      ellipse(347, 304, 10, 10);
    }
    if(cropAmountsetsummer == 46) {
      ellipse(410, 304, 10, 10);
    }
    if(cropAmountsetsummer == 47) {
      ellipse(473, 304, 10, 10);
    }
    if(cropAmountsetsummer == 48) {
      ellipse(536, 304, 10, 10);
    }
    if(cropAmountsetsummer == 49) {
      ellipse(599, 304, 10, 10);
    }
    if(cropAmountsetsummer == 50) {
      ellipse(662, 304, 10, 10);
    }
    if(cropAmountsetsummer == 51) {
      ellipse(95, 362, 10, 10);
    }
    if(cropAmountsetsummer == 52) {
      ellipse(158, 362, 10, 10);
    }
    if(cropAmountsetsummer == 53) {
      ellipse(221, 362, 10, 10);
    }
    if(cropAmountsetsummer == 54) {
      ellipse(284, 362, 10, 10);
    }
    if(cropAmountsetsummer == 55) {
      ellipse(347, 362, 10, 10);
    }
    if(cropAmountsetsummer == 56) {
      ellipse(410, 362, 10, 10);
    }
    if(cropAmountsetsummer == 57) {
      ellipse(473, 362, 10, 10);
    }
    if(cropAmountsetsummer == 58) {
      ellipse(536, 362, 10, 10);
    }
    if(cropAmountsetsummer == 59) {
      ellipse(599, 362, 10, 10);
    }
    if(cropAmountsetsummer == 60) {
      ellipse(662, 362, 10, 10);
    }
    if(cropAmountsetsummer == 61) {
      ellipse(95, 430, 10, 10);
    }
    if(cropAmountsetsummer == 62) {
      ellipse(158, 430, 10, 10);
    }
    if(cropAmountsetsummer == 63) {
      ellipse(221, 430, 10, 10);
    }
    if(cropAmountsetsummer == 64) {
      ellipse(284, 430, 10, 10);
    }
    if(cropAmountsetsummer == 65) {
      ellipse(347, 430, 10, 10);
    }
    if(cropAmountsetsummer == 66) {
      ellipse(410, 430, 10, 10);
    }
    if(cropAmountsetsummer == 67) {
      ellipse(473, 430, 10, 10);
    }
    if(cropAmountsetsummer == 68) {
      ellipse(536, 430, 10, 10);
    }
    if(cropAmountsetsummer == 69) {
      ellipse(599, 430, 10, 10);
    }
    if(cropAmountsetsummer == 70) {
      ellipse(662, 430, 10, 10);
    }
    if(cropAmountsetsummer == 71) {
      ellipse(95, 498, 10, 10);
    }
    if(cropAmountsetsummer == 72) {
      ellipse(158, 498, 10, 10);
    }
    if(cropAmountsetsummer == 73) {
      ellipse(221, 498, 10, 10);
    }
    if(cropAmountsetsummer == 74) {
      ellipse(284, 498, 10, 10);
    }
    if(cropAmountsetsummer == 75) {
      ellipse(347, 498, 10, 10);
    }
    if(cropAmountsetsummer == 76) {
      ellipse(410, 498, 10, 10);
    }
    if(cropAmountsetsummer == 77) {
      ellipse(473, 498, 10, 10);
    }
    if(cropAmountsetsummer == 78) {
      ellipse(536, 498, 10, 10);
    }
    if(cropAmountsetsummer == 79) {
      ellipse(599, 498, 10, 10);
    }
    if(cropAmountsetsummer == 80) {
      ellipse(662, 498, 10, 10);
    }
    if(cropAmountsetsummer == 81) {
      ellipse(95, 566, 10, 10);
    }
    if(cropAmountsetsummer == 82) {
      ellipse(158, 566, 10, 10);
    }
    if(cropAmountsetsummer == 83) {
      ellipse(221, 566, 10, 10);
    }
    if(cropAmountsetsummer == 84) {
      ellipse(284, 566, 10, 10);
    }
    if(cropAmountsetsummer == 85) {
      ellipse(347, 566, 10, 10);
    }
    if(cropAmountsetsummer == 86) {
      ellipse(410, 566, 10, 10);
    }
    if(cropAmountsetsummer == 87) {
      ellipse(473, 566, 10, 10);
    }
    if(cropAmountsetsummer == 88) {
      ellipse(536, 566, 10, 10);
    }
    if(cropAmountsetsummer == 89) {
      ellipse(599, 566, 10, 10);
    }
    if(cropAmountsetsummer == 90) {
      ellipse(662, 566, 10, 10);
    }
    if(keyPressed)  {
      if(key == 'n' || key == 'N')  {
        cropAmountsummer = false;
        rect(0, 0, 700, 600);
     cropSelect = true;
      }
      if(key == 'c' || key == 'C') {
       cropAmountcontrol = true; 
        background(0);
        cropAmountsummer = false;
        Summer = true;
      }
      if(key == CODED) {
       if(keyCode == ALT) {
         cropAmountfall = true;
         cropAmountsummer = false;
         fill(0);
         rect(0, 0, 700, 600);
       }
       if(keyCode == CONTROL) {
          cropAmountspring = true;
          cropAmountsummer = false;
          fill(0);
          rect(0, 0, 700, 600);
         }
      }
    }
  }
}
