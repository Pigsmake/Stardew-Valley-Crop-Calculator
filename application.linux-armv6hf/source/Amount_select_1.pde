void Amountselect1mode () {
  //build
  if (cropAmountspring == true) {
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
        cropAmountsetspring = 1;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 100, 10, 10);
        cropAmountsetspring = 11;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 168, 10, 10);
        cropAmountsetspring = 21;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 236, 10, 10);
        cropAmountsetspring = 31;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 304, 10, 10);
        cropAmountsetspring = 41;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 362, 10, 10);
        cropAmountsetspring = 51;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 430, 10, 10);
        cropAmountsetspring = 61;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 498, 10, 10);
        cropAmountsetspring = 71;
      }
      if (mouseX >= 63 && mouseX <= 126 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(95, 566, 10, 10);
        cropAmountsetspring = 81;
      }
      //second column
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(158, 32, 10, 10);
        cropAmountsetspring = 2;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 100, 10, 10);
        cropAmountsetspring = 12;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 168, 10, 10);
        cropAmountsetspring = 22;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 236, 10, 10);
        cropAmountsetspring = 32;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 304, 10, 10);
        cropAmountsetspring = 42;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 362, 10, 10);
        cropAmountsetspring = 52;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 430, 10, 10);
        cropAmountsetspring = 62;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 498, 10, 10);
        cropAmountsetspring = 72;
      }
      if (mouseX >= 126 && mouseX <= 189 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(158, 566, 10, 10);
        cropAmountsetspring = 82;
      }
      //third column
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(221, 32, 10, 10);
        cropAmountsetspring = 3;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 100, 10, 10);
        cropAmountsetspring = 13;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 168, 10, 10);
        cropAmountsetspring = 23;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 236, 10, 10);
        cropAmountsetspring = 33;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 304, 10, 10);
        cropAmountsetspring = 43;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 362, 10, 10);
        cropAmountsetspring = 53;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 430, 10, 10);
        cropAmountsetspring = 63;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 498, 10, 10);
        cropAmountsetspring = 73;
      }
      if (mouseX >= 189 && mouseX <= 252 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(221, 566, 10, 10);
        cropAmountsetspring = 83;
      }
      //fourth column
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(284, 32, 10, 10);
        cropAmountsetspring = 4;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 100, 10, 10);
        cropAmountsetspring = 14;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 168, 10, 10);
        cropAmountsetspring = 24;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 236, 10, 10);
        cropAmountsetspring = 34;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 304, 10, 10);
        cropAmountsetspring = 44;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 362, 10, 10);
        cropAmountsetspring = 54;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 430, 10, 10);
        cropAmountsetspring = 64;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 498, 10, 10);
        cropAmountsetspring = 74;
      }
      if (mouseX >= 252 && mouseX <= 315 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(284, 566, 10, 10);
        cropAmountsetspring = 84;
      }
      //fith column
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(347, 32, 10, 10);
        cropAmountsetspring = 5;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 100, 10, 10);
        cropAmountsetspring = 15;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 168, 10, 10);
        cropAmountsetspring = 25;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 236, 10, 10);
        cropAmountsetspring = 35;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 304, 10, 10);
        cropAmountsetspring = 45;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 362, 10, 10);
        cropAmountsetspring = 55;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 430, 10, 10);
        cropAmountsetspring = 65;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 498, 10, 10);
        cropAmountsetspring = 75;
      }
      if (mouseX >= 315 && mouseX <= 378 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(347, 566, 10, 10);
        cropAmountsetspring = 85;
      }
      //sixth column
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(410, 32, 10, 10);
        cropAmountsetspring = 6;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 100, 10, 10);
        cropAmountsetspring = 16;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 168, 10, 10);
        cropAmountsetspring = 26;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 236, 10, 10);
        cropAmountsetspring = 36;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 304, 10, 10);
        cropAmountsetspring = 46;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 362, 10, 10);
        cropAmountsetspring = 56;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 430, 10, 10);
        cropAmountsetspring = 66;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 498, 10, 10);
        cropAmountsetspring = 76;
      }
      if (mouseX >= 378 && mouseX <= 441 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(410, 566, 10, 10);
        cropAmountsetspring = 86;
      }
      //seventh column
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(473, 32, 10, 10);
        cropAmountsetspring = 7;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 100, 10, 10);
        cropAmountsetspring = 17;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 168, 10, 10);
        cropAmountsetspring = 27;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 236, 10, 10);
        cropAmountsetspring = 37;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 304, 10, 10);
        cropAmountsetspring = 47;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 362, 10, 10);
        cropAmountsetspring = 57;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 430, 10, 10);
        cropAmountsetspring = 67;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 498, 10, 10);
        cropAmountsetspring = 77;
      }
      if (mouseX >= 441 && mouseX <= 504 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(473, 566, 10, 10);
        cropAmountsetspring = 87;
      }
      //eighth column
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(536, 32, 10, 10);
        cropAmountsetspring = 8;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 100, 10, 10);
        cropAmountsetspring = 18;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 168, 10, 10);
        cropAmountsetspring = 28;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 236, 10, 10);
        cropAmountsetspring = 38;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 304, 10, 10);
        cropAmountsetspring = 48;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 362, 10, 10);
        cropAmountsetspring = 58;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 430, 10, 10);
        cropAmountsetspring = 68;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 498, 10, 10);
        cropAmountsetspring = 78;
      }
      if (mouseX >= 504 && mouseX <= 567 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(536, 566, 10, 10);
        cropAmountsetspring = 88;
      }
      //ninth column
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(599, 32, 10, 10);
        cropAmountsetspring = 9;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 100, 10, 10);
        cropAmountsetspring = 19;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 168, 10, 10);
        cropAmountsetspring = 29;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 236, 10, 10);
        cropAmountsetspring = 39;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 304, 10, 10);
        cropAmountsetspring = 49;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 362, 10, 10);
        cropAmountsetspring = 59;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 430, 10, 10);
        cropAmountsetspring = 69;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 498, 10, 10);
        cropAmountsetspring = 79;
      }
      if (mouseX >= 567 && mouseX <= 630 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(599, 566, 10, 10);
        cropAmountsetspring = 89;
      }
      //tenth column
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 0 && mouseY <= 66) {
        rect(64, 0, 700, 600);
        fill(255);
        ellipse(662, 32, 10, 10);
        cropAmountsetspring = 10;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 66 && mouseY <= 132) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 100, 10, 10);
        cropAmountsetspring = 20;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 132 && mouseY <= 198) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 168, 10, 10);
        cropAmountsetspring = 30;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 198 && mouseY <= 264) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 236, 10, 10);
        cropAmountsetspring = 40;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 264 && mouseY <= 330) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 304, 10, 10);
        cropAmountsetspring = 50;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 330 && mouseY <= 396) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 362, 10, 10);
        cropAmountsetspring = 60;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 396 && mouseY <= 462) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 430, 10, 10);
        cropAmountsetspring = 70;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 462 && mouseY <= 528) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 498, 10, 10);
        cropAmountsetspring = 80;
      }
      if (mouseX >= 630 && mouseX <= 700 && mouseY >= 528 && mouseY <= 600) {
        rect(63, 0, 700, 600);
        fill(255);
        ellipse(662, 566, 10, 10);
        cropAmountsetspring = 90;
      }
    }
    fill(255);
    if (cropAmountsetspring == 1) {
      ellipse(95, 32, 10, 10);
    }
    if (cropAmountsetspring == 2) {
      ellipse(158, 32, 10, 10);
    }
    if (cropAmountsetspring == 3) {
      ellipse(221, 32, 10, 10);
    }
    if (cropAmountsetspring == 4) {
      ellipse(284, 32, 10, 10);
    }
    if (cropAmountsetspring == 5) {
      ellipse(347, 32, 10, 10);
    }
    if (cropAmountsetspring == 6) {
      ellipse(410, 32, 10, 10);
    }
    if (cropAmountsetspring == 7) {
      ellipse(473, 32, 10, 10);
    }
    if (cropAmountsetspring == 8) {
      ellipse(536, 32, 10, 10);
    }
    if (cropAmountsetspring == 9) {
      ellipse(599, 32, 10, 10);
    }
    if (cropAmountsetspring == 10) {
      ellipse(662, 32, 10, 10);
    }
    if (cropAmountsetspring == 11) {
      ellipse(95, 100, 10, 10);
    }
    if (cropAmountsetspring == 12) {
      ellipse(158, 100, 10, 10);
    }
    if (cropAmountsetspring == 13) {
      ellipse(221, 100, 10, 10);
    }
    if (cropAmountsetspring == 14) {
      ellipse(284, 100, 10, 10);
    }
    if (cropAmountsetspring == 15) {
      ellipse(347, 100, 10, 10);
    }
    if (cropAmountsetspring == 16) {
      ellipse(410, 100, 10, 10);
    }
    if (cropAmountsetspring == 17) {
      ellipse(473, 100, 10, 10);
    }
    if (cropAmountsetspring == 18) {
      ellipse(536, 100, 10, 10);
    }
    if (cropAmountsetspring == 19) {
      ellipse(599, 100, 10, 10);
    }
    if (cropAmountsetspring == 20) {
      ellipse(662, 100, 10, 10);
    }
    if (cropAmountsetspring == 21) {
      ellipse(95, 168, 10, 10);
    }
    if (cropAmountsetspring == 22) {
      ellipse(158, 168, 10, 10);
    }
    if (cropAmountsetspring == 23) {
      ellipse(221, 168, 10, 10);
    }
    if (cropAmountsetspring == 24) {
      ellipse(284, 168, 10, 10);
    }
    if (cropAmountsetspring == 25) {
      ellipse(347, 168, 10, 10);
    }
    if (cropAmountsetspring == 26) {
      ellipse(410, 168, 10, 10);
    }
    if (cropAmountsetspring == 27) {
      ellipse(473, 168, 10, 10);
    }
    if (cropAmountsetspring == 28) {
      ellipse(536, 168, 10, 10);
    }
    if (cropAmountsetspring == 29) {
      ellipse(599, 168, 10, 10);
    }
    if (cropAmountsetspring == 30) {
      ellipse(662, 168, 10, 10);
    }
    if (cropAmountsetspring == 31) {
      ellipse(95, 236, 10, 10);
    }
    if (cropAmountsetspring == 32) {
      ellipse(158, 236, 10, 10);
    }
    if (cropAmountsetspring == 33) {
      ellipse(221, 236, 10, 10);
    }
    if (cropAmountsetspring == 34) {
      ellipse(284, 236, 10, 10);
    }
    if (cropAmountsetspring == 35) {
      ellipse(347, 236, 10, 10);
    }
    if (cropAmountsetspring == 36) {
      ellipse(410, 236, 10, 10);
    }
    if (cropAmountsetspring == 37) {
      ellipse(473, 236, 10, 10);
    }
    if (cropAmountsetspring == 38) {
      ellipse(536, 236, 10, 10);
    }
    if (cropAmountsetspring == 39) {
      ellipse(599, 236, 10, 10);
    }
    if (cropAmountsetspring == 40) {
      ellipse(662, 236, 10, 10);
    }
    if (cropAmountsetspring == 41) {
      ellipse(95, 304, 10, 10);
    }
    if (cropAmountsetspring == 42) {
      ellipse(158, 304, 10, 10);
    }
    if (cropAmountsetspring == 43) {
      ellipse(221, 304, 10, 10);
    }
    if (cropAmountsetspring == 44) {
      ellipse(284, 304, 10, 10);
    }
    if (cropAmountsetspring == 45) {
      ellipse(347, 304, 10, 10);
    }
    if (cropAmountsetspring == 46) {
      ellipse(410, 304, 10, 10);
    }
    if (cropAmountsetspring == 47) {
      ellipse(473, 304, 10, 10);
    }
    if (cropAmountsetspring == 48) {
      ellipse(536, 304, 10, 10);
    }
    if (cropAmountsetspring == 49) {
      ellipse(599, 304, 10, 10);
    }
    if (cropAmountsetspring == 50) {
      ellipse(662, 304, 10, 10);
    }
    if (cropAmountsetspring == 51) {
      ellipse(95, 362, 10, 10);
    }
    if (cropAmountsetspring == 52) {
      ellipse(158, 362, 10, 10);
    }
    if (cropAmountsetspring == 53) {
      ellipse(221, 362, 10, 10);
    }
    if (cropAmountsetspring == 54) {
      ellipse(284, 362, 10, 10);
    }
    if (cropAmountsetspring == 55) {
      ellipse(347, 362, 10, 10);
    }
    if (cropAmountsetspring == 56) {
      ellipse(410, 362, 10, 10);
    }
    if (cropAmountsetspring == 57) {
      ellipse(473, 362, 10, 10);
    }
    if (cropAmountsetspring == 58) {
      ellipse(536, 362, 10, 10);
    }
    if (cropAmountsetspring == 59) {
      ellipse(599, 362, 10, 10);
    }
    if (cropAmountsetspring == 60) {
      ellipse(662, 362, 10, 10);
    }
    if (cropAmountsetspring == 61) {
      ellipse(95, 430, 10, 10);
    }
    if (cropAmountsetspring == 62) {
      ellipse(158, 430, 10, 10);
    }
    if (cropAmountsetspring == 63) {
      ellipse(221, 430, 10, 10);
    }
    if (cropAmountsetspring == 64) {
      ellipse(284, 430, 10, 10);
    }
    if (cropAmountsetspring == 65) {
      ellipse(347, 430, 10, 10);
    }
    if (cropAmountsetspring == 66) {
      ellipse(410, 430, 10, 10);
    }
    if (cropAmountsetspring == 67) {
      ellipse(473, 430, 10, 10);
    }
    if (cropAmountsetspring == 68) {
      ellipse(536, 430, 10, 10);
    }
    if (cropAmountsetspring == 69) {
      ellipse(599, 430, 10, 10);
    }
    if (cropAmountsetspring == 70) {
      ellipse(662, 430, 10, 10);
    }
    if (cropAmountsetspring == 71) {
      ellipse(95, 498, 10, 10);
    }
    if (cropAmountsetspring == 72) {
      ellipse(158, 498, 10, 10);
    }
    if (cropAmountsetspring == 73) {
      ellipse(221, 498, 10, 10);
    }
    if (cropAmountsetspring == 74) {
      ellipse(284, 498, 10, 10);
    }
    if (cropAmountsetspring == 75) {
      ellipse(347, 498, 10, 10);
    }
    if (cropAmountsetspring == 76) {
      ellipse(410, 498, 10, 10);
    }
    if (cropAmountsetspring == 77) {
      ellipse(473, 498, 10, 10);
    }
    if (cropAmountsetspring == 78) {
      ellipse(536, 498, 10, 10);
    }
    if (cropAmountsetspring == 79) {
      ellipse(599, 498, 10, 10);
    }
    if (cropAmountsetspring == 80) {
      ellipse(662, 498, 10, 10);
    }
    if (cropAmountsetspring == 81) {
      ellipse(95, 566, 10, 10);
    }
    if (cropAmountsetspring == 82) {
      ellipse(158, 566, 10, 10);
    }
    if (cropAmountsetspring == 83) {
      ellipse(221, 566, 10, 10);
    }
    if (cropAmountsetspring == 84) {
      ellipse(284, 566, 10, 10);
    }
    if (cropAmountsetspring == 85) {
      ellipse(347, 566, 10, 10);
    }
    if (cropAmountsetspring == 86) {
      ellipse(410, 566, 10, 10);
    }
    if (cropAmountsetspring == 87) {
      ellipse(473, 566, 10, 10);
    }
    if (cropAmountsetspring == 88) {
      ellipse(536, 566, 10, 10);
    }
    if (cropAmountsetspring == 89) {
      ellipse(599, 566, 10, 10);
    }
    if (cropAmountsetspring == 90) {
      ellipse(662, 566, 10, 10);
    }
    if (keyPressed) {
      if (key == 'n' || key == 'N') {
        cropAmountspring = false;
        background(0);
        cropSelect = true;
      }
      if(key == 'c' || key == 'C') {
       cropAmountcontrol = true; 
        background(0);
        cropAmountspring = false;
        Spring = true;
      }
      if (key == CODED) {
        if (keyCode == SHIFT) {
          cropAmountsummer = true;
          cropAmountspring = false;
          fill(0);
          rect(0, 0, 700, 600);
        }
      }
    }
  }
}
