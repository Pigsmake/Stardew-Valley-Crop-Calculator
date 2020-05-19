void Amountselect3mode()  {
  
  if(cropAmountfall == true)  {
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
        cropAmountsetfall = 1;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 100, 10, 10);
        cropAmountsetfall = 11;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 168, 10, 10);
        cropAmountsetfall = 21;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 236, 10, 10);
        cropAmountsetfall = 31;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 304, 10, 10);
        cropAmountsetfall = 41;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 362, 10, 10);
        cropAmountsetfall = 51;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 430, 10, 10);
        cropAmountsetfall = 61;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 498, 10, 10);
        cropAmountsetfall = 71;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 566, 10, 10);
        cropAmountsetfall = 81;
      }
      //second column
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(158, 32, 10, 10);
        cropAmountsetfall = 2;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 100, 10, 10);
        cropAmountsetfall = 12;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 168, 10, 10);
        cropAmountsetfall = 22;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 236, 10, 10);
        cropAmountsetfall = 32;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 304, 10, 10);
        cropAmountsetfall = 42;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 362, 10, 10);
        cropAmountsetfall = 52;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 430, 10, 10);
        cropAmountsetfall = 62;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 498, 10, 10);
        cropAmountsetfall = 72;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 566, 10, 10);
        cropAmountsetfall = 82;
      }
      //third column
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(221, 32, 10, 10);
        cropAmountsetfall = 3;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 100, 10, 10);
        cropAmountsetfall = 13;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 168, 10, 10);
        cropAmountsetfall = 23;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 236, 10, 10);
        cropAmountsetfall = 33;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 304, 10, 10);
        cropAmountsetfall = 43;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 362, 10, 10);
        cropAmountsetfall = 53;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 430, 10, 10);
        cropAmountsetfall = 63;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 498, 10, 10);
        cropAmountsetfall = 73;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 566, 10, 10);
        cropAmountsetfall = 83;
      }
      //fourth column
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(284, 32, 10, 10);
        cropAmountsetfall = 4;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 100, 10, 10);
        cropAmountsetfall = 14;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 168, 10, 10);
        cropAmountsetfall = 24;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 236, 10, 10);
        cropAmountsetfall = 34;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 304, 10, 10);
        cropAmountsetfall = 44;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 362, 10, 10);
        cropAmountsetfall = 54;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 430, 10, 10);
        cropAmountsetfall = 64;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 498, 10, 10);
        cropAmountsetfall = 74;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 566, 10, 10);
        cropAmountsetfall = 84;
      }
      //fith column
       if (mouseX >= 315 && mouseX <= 378 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(347, 32, 10, 10);
        cropAmountsetfall = 5;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 100, 10, 10);
        cropAmountsetfall = 15;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 168, 10, 10);
        cropAmountsetfall = 25;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 236, 10, 10);
        cropAmountsetfall = 35;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 304, 10, 10);
        cropAmountsetfall = 45;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 362, 10, 10);
        cropAmountsetfall = 55;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 430, 10, 10);
        cropAmountsetfall = 65;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 498, 10, 10);
        cropAmountsetfall = 75;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 566, 10, 10);
        cropAmountsetfall = 85;
      }
      //sixth column
        if (mouseX >= 378 && mouseX <= 441 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(410, 32, 10, 10);
        cropAmountsetfall = 6;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 100, 10, 10);
        cropAmountsetfall = 16;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 168, 10, 10);
        cropAmountsetfall = 26;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 236, 10, 10);
        cropAmountsetfall = 36;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 304, 10, 10);
        cropAmountsetfall = 46;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 362, 10, 10);
        cropAmountsetfall = 56;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 430, 10, 10);
        cropAmountsetfall = 66;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 498, 10, 10);
        cropAmountsetfall = 76;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 566, 10, 10);
        cropAmountsetfall = 86;
      }
      //seventh column
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(473, 32, 10, 10);
        cropAmountsetfall = 7;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 100, 10, 10);
        cropAmountsetfall = 17;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 168, 10, 10);
        cropAmountsetfall = 27;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 236, 10, 10);
        cropAmountsetfall = 37;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 304, 10, 10);
        cropAmountsetfall = 47;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 362, 10, 10);
        cropAmountsetfall = 57;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 430, 10, 10);
        cropAmountsetfall = 67;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 498, 10, 10);
        cropAmountsetfall = 77;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 566, 10, 10);
        cropAmountsetfall = 87;
      }
      //eighth column
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(536, 32, 10, 10);
        cropAmountsetfall = 8;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 100, 10, 10);
        cropAmountsetfall = 18;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 168, 10, 10);
        cropAmountsetfall = 28;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 236, 10, 10);
        cropAmountsetfall = 38;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 304, 10, 10);
        cropAmountsetfall = 48;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 362, 10, 10);
        cropAmountsetfall = 58;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 430, 10, 10);
        cropAmountsetfall = 68;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 498, 10, 10);
        cropAmountsetfall = 78;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 566, 10, 10);
        cropAmountsetfall = 88;
      }
      //ninth column
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(599, 32, 10, 10);
        cropAmountsetfall = 9;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 100, 10, 10);
        cropAmountsetfall = 19;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 168, 10, 10);
        cropAmountsetfall = 29;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 236, 10, 10);
        cropAmountsetfall = 39;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 304, 10, 10);
        cropAmountsetfall = 49;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 362, 10, 10);
        cropAmountsetfall = 59;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 430, 10, 10);
        cropAmountsetfall = 69;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 498, 10, 10);
        cropAmountsetfall = 79;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 566, 10, 10);
        cropAmountsetfall = 89;
      }
      //tenth column
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(662, 32, 10, 10);
        cropAmountsetfall = 10;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 100, 10, 10);
        cropAmountsetfall = 20;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 168, 10, 10);
        cropAmountsetfall = 30;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 236, 10, 10);
        cropAmountsetfall = 40;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 304, 10, 10);
        cropAmountsetfall = 50;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 362, 10, 10);
        cropAmountsetfall = 60;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 430, 10, 10);
        cropAmountsetfall = 70;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 498, 10, 10);
        cropAmountsetfall = 80;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 566, 10, 10);
        cropAmountsetfall = 90;
      }
    }
        fill(255);
    if(cropAmountsetfall == 1) {
      ellipse(95, 32, 10, 10);
    }
    if(cropAmountsetfall == 2) {
      ellipse(158, 32, 10, 10);
    }
    if(cropAmountsetfall == 3) {
      ellipse(221, 32, 10, 10);
    }
    if(cropAmountsetfall == 4) {
      ellipse(284, 32, 10, 10);
    }
    if(cropAmountsetfall == 5) {
      ellipse(347, 32, 10, 10);
    }
    if(cropAmountsetfall == 6) {
      ellipse(410, 32, 10, 10);
    }
    if(cropAmountsetfall == 7) {
      ellipse(473, 32, 10, 10);
    }
    if(cropAmountsetfall == 8) {
      ellipse(536, 32, 10, 10);
    }
    if(cropAmountsetfall == 9) {
      ellipse(599, 32, 10, 10);
    }
    if(cropAmountsetfall == 10) {
      ellipse(662, 32, 10, 10);
    }
    if(cropAmountsetfall == 11) {
      ellipse(95, 100, 10, 10);
    }
    if(cropAmountsetfall == 12) {
      ellipse(158, 100, 10, 10);
    }
    if(cropAmountsetfall == 13) {
      ellipse(221, 100, 10, 10);
    }
    if(cropAmountsetfall == 14) {
      ellipse(284, 100, 10, 10);
    }
    if(cropAmountsetfall == 15) {
      ellipse(347, 100, 10, 10);
    }
    if(cropAmountsetfall == 16) {
      ellipse(410, 100, 10, 10);
    }
    if(cropAmountsetfall == 17) {
      ellipse(473, 100, 10, 10);
    }
    if(cropAmountsetfall == 18) {
      ellipse(536, 100, 10, 10);
    }
    if(cropAmountsetfall == 19) {
      ellipse(599, 100, 10, 10);
    }
    if(cropAmountsetfall == 20) {
      ellipse(662, 100, 10, 10);
    }
    if(cropAmountsetfall == 21) {
      ellipse(95, 168, 10, 10);
    }
    if(cropAmountsetfall == 22) {
      ellipse(158, 168, 10, 10);
    }
    if(cropAmountsetfall == 23) {
      ellipse(221, 168, 10, 10);
    }
    if(cropAmountsetfall == 24) {
      ellipse(284, 168, 10, 10);
    }
    if(cropAmountsetfall == 25) {
      ellipse(347, 168, 10, 10);
    }
    if(cropAmountsetfall == 26) {
      ellipse(410, 168, 10, 10);
    }
    if(cropAmountsetfall == 27) {
      ellipse(473, 168, 10, 10);
    }
    if(cropAmountsetfall == 28) {
      ellipse(536, 168, 10, 10);
    }
    if(cropAmountsetfall == 29) {
      ellipse(599, 168, 10, 10);
    }
    if(cropAmountsetfall == 30) {
      ellipse(662, 168, 10, 10);
    }
    if(cropAmountsetfall == 31) {
      ellipse(95, 236, 10, 10);
    }
    if(cropAmountsetfall == 32) {
      ellipse(158, 236, 10, 10);
    }
    if(cropAmountsetfall == 33) {
      ellipse(221, 236, 10, 10);
    }
    if(cropAmountsetfall == 34) {
      ellipse(284, 236, 10, 10);
    }
    if(cropAmountsetfall == 35) {
      ellipse(347, 236, 10, 10);
    }
    if(cropAmountsetfall == 36) {
      ellipse(410, 236, 10, 10);
    }
    if(cropAmountsetfall == 37) {
      ellipse(473, 236, 10, 10);
    }
    if(cropAmountsetfall == 38) {
      ellipse(536, 236, 10, 10);
    }
    if(cropAmountsetfall == 39) {
      ellipse(599, 236, 10, 10);
    }
    if(cropAmountsetfall == 40) {
      ellipse(662, 236, 10, 10);
    }
    if(cropAmountsetfall == 41) {
      ellipse(95, 304, 10, 10);
    }
    if(cropAmountsetfall == 42) {
      ellipse(158, 304, 10, 10);
    }
    if(cropAmountsetfall == 43) {
      ellipse(221, 304, 10, 10);
    }
    if(cropAmountsetfall == 44) {
      ellipse(284, 304, 10, 10);
    }
    if(cropAmountsetfall == 45) {
      ellipse(347, 304, 10, 10);
    }
    if(cropAmountsetfall == 46) {
      ellipse(410, 304, 10, 10);
    }
    if(cropAmountsetfall == 47) {
      ellipse(473, 304, 10, 10);
    }
    if(cropAmountsetfall == 48) {
      ellipse(536, 304, 10, 10);
    }
    if(cropAmountsetfall == 49) {
      ellipse(599, 304, 10, 10);
    }
    if(cropAmountsetfall == 50) {
      ellipse(662, 304, 10, 10);
    }
    if(cropAmountsetfall == 51) {
      ellipse(95, 362, 10, 10);
    }
    if(cropAmountsetfall == 52) {
      ellipse(158, 362, 10, 10);
    }
    if(cropAmountsetfall == 53) {
      ellipse(221, 362, 10, 10);
    }
    if(cropAmountsetfall == 54) {
      ellipse(284, 362, 10, 10);
    }
    if(cropAmountsetfall == 55) {
      ellipse(347, 362, 10, 10);
    }
    if(cropAmountsetfall == 56) {
      ellipse(410, 362, 10, 10);
    }
    if(cropAmountsetfall == 57) {
      ellipse(473, 362, 10, 10);
    }
    if(cropAmountsetfall == 58) {
      ellipse(536, 362, 10, 10);
    }
    if(cropAmountsetfall == 59) {
      ellipse(599, 362, 10, 10);
    }
    if(cropAmountsetfall == 60) {
      ellipse(662, 362, 10, 10);
    }
    if(cropAmountsetfall == 61) {
      ellipse(95, 430, 10, 10);
    }
    if(cropAmountsetfall == 62) {
      ellipse(158, 430, 10, 10);
    }
    if(cropAmountsetfall == 63) {
      ellipse(221, 430, 10, 10);
    }
    if(cropAmountsetfall == 64) {
      ellipse(284, 430, 10, 10);
    }
    if(cropAmountsetfall == 65) {
      ellipse(347, 430, 10, 10);
    }
    if(cropAmountsetfall == 66) {
      ellipse(410, 430, 10, 10);
    }
    if(cropAmountsetfall == 67) {
      ellipse(473, 430, 10, 10);
    }
    if(cropAmountsetfall == 68) {
      ellipse(536, 430, 10, 10);
    }
    if(cropAmountsetfall == 69) {
      ellipse(599, 430, 10, 10);
    }
    if(cropAmountsetfall == 70) {
      ellipse(662, 430, 10, 10);
    }
    if(cropAmountsetfall == 71) {
      ellipse(95, 498, 10, 10);
    }
    if(cropAmountsetfall == 72) {
      ellipse(158, 498, 10, 10);
    }
    if(cropAmountsetfall == 73) {
      ellipse(221, 498, 10, 10);
    }
    if(cropAmountsetfall == 74) {
      ellipse(284, 498, 10, 10);
    }
    if(cropAmountsetfall == 75) {
      ellipse(347, 498, 10, 10);
    }
    if(cropAmountsetfall == 76) {
      ellipse(410, 498, 10, 10);
    }
    if(cropAmountsetfall == 77) {
      ellipse(473, 498, 10, 10);
    }
    if(cropAmountsetfall == 78) {
      ellipse(536, 498, 10, 10);
    }
    if(cropAmountsetfall == 79) {
      ellipse(599, 498, 10, 10);
    }
    if(cropAmountsetfall == 80) {
      ellipse(662, 498, 10, 10);
    }
    if(cropAmountsetfall == 81) {
      ellipse(95, 566, 10, 10);
    }
    if(cropAmountsetfall == 82) {
      ellipse(158, 566, 10, 10);
    }
    if(cropAmountsetfall == 83) {
      ellipse(221, 566, 10, 10);
    }
    if(cropAmountsetfall == 84) {
      ellipse(284, 566, 10, 10);
    }
    if(cropAmountsetfall == 85) {
      ellipse(347, 566, 10, 10);
    }
    if(cropAmountsetfall == 86) {
      ellipse(410, 566, 10, 10);
    }
    if(cropAmountsetfall == 87) {
      ellipse(473, 566, 10, 10);
    }
    if(cropAmountsetfall == 88) {
      ellipse(536, 566, 10, 10);
    }
    if(cropAmountsetfall == 89) {
      ellipse(599, 566, 10, 10);
    }
    if(cropAmountsetfall == 90) {
      ellipse(662, 566, 10, 10);
    }
    if(keyPressed)  {
      if(key == 'n' || key == 'N')  {
        cropAmountfall = false;
        rect(0, 0, 700, 600);
     cropSelect = true;
      }
      if(key == 'c' || key == 'C') {
       cropAmountcontrol = true; 
        background(0);
        cropAmountfall = false;
        Fall = true;
      }
      if(key == CODED) {
       if(keyCode == SHIFT) {
         cropAmountsummer = true;
         cropAmountfall = false;
         fill(0);
         rect(0, 0, 700, 600);
       }
      }
       if(key == 's' || key == 'S') {
         cropAmountsetfall = cropAmountsetspring;
       }
    }
  }
}
