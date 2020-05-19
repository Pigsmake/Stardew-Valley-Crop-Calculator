import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SV_CCalendar extends PApplet {

public void setup() {
  
  background(0);
  Crop_icon_loading();
}
//Do Unmilled rice 
int cropHarvest = 0;
int cropType = 0;
int cropAmountsetspring = 0;
int cropAmountsetsummer = 0;
int cropAmountsetfall = 0;
int cropPrice = 0;
int cropCost = 0;
int cropSeeding;
boolean cropAmountcontrol = false;
boolean cropAmountspring = false;
boolean cropAmountsummer = false;
boolean cropAmountfall = false;
boolean cropCalculator = false;
boolean cropCalculatorcontrols = false;
boolean cropCalendarN = false;
boolean cropCalendarcontrols = false;
boolean cropCalendarNtype1 = true;
boolean cropCalendarNtype2 = false;
boolean cropCalendarD = false;
boolean cropCalendarDtype1 = true;
boolean cropCalendarDtype2 = false;
boolean cropCalendarNSG = false;
boolean cropCalendarNSGtype1 = true;
boolean cropCalendarNSGtype2 = false;
boolean cropCalendarDSG = false;
boolean cropCalendarDSGtype1 = true;
boolean cropCalendarDSGtype2 = false;
boolean cropCalendarNDSG = false;
boolean cropCalendarNDSGtype1 = true;
boolean cropCalendarNDSGtype2 = false;
boolean cropCalendarDDSG = false;
boolean cropCalendarDDSGtype1 = true;
boolean cropCalendarDDSGtype2 = false;
boolean cropCalendarNASG = false;
boolean cropCalendarNASGtype1 = true;
boolean cropCalendarNASGtype2 = false;
boolean cropCalendarDASG = false;
boolean cropCalendarDASGtype1 = true;
boolean cropCalendarDASGtype2 = false;
boolean cropCalendarNADSG = false;
boolean cropCalendarNADSGtype1 = true;
boolean cropCalendarNADSGtype2 = false;
boolean cropCalendarDADSG = false;
boolean cropCalendarDADSGtype1 = true;
boolean cropCalendarDADSGtype2 = false;
boolean cropSelect = false;
boolean cropSelectcontrols = false;
boolean Summer;
boolean Fall;
boolean Spring;
boolean startMenu = true;
public void draw()   {
 Selectmode();
 Menumode();
 Amountselect1mode();
 Amountselect2mode();
 Amountselect3mode();
 Calculatormode();
 CalendarmodeN();
 Controlmode();
}
public void Amountselect1mode () {
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
public void Amountselect2mode()  {
  
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
public void Amountselect3mode()  {
  
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
public void Calculatormode() {
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
/*void CalendarmodeDADSG() {
  if (cropCalendarDADSG == true) {
//Direct Agricultrulistl Delux Speed Growth
    //build
    stroke(255);
    for (int i = 100; i < 600; i += 100) {
      line(0, i, 700, i);
    }
    for (int i = 100; i < 700; i += 100) {
      line(i, 100, i, 600);
    }
    //text
    fill(255);
    textSize(32);
    text("Mon", 20, 200);
    text("Tue", 120, 200);
    text("Wed", 220, 200);
    text("Thu", 320, 200);
    text("Fri", 420, 200);
    text("Sat", 520, 200);
    text("Sun", 620, 200);
    if (cropCalendarDADSGtype1) {
      if (cropType == 1) {
        image(Am1, 0, 200, 100, 100);
        image(Am2, 100, 200, 100, 100);
        image(Am2, 200, 200, 100, 100);
        image(Am3, 300, 200, 100, 100);
        image(Am3, 400, 200, 100, 100);
        image(Am4, 500, 200, 100, 100);
        image(Am4, 600, 200, 100, 100);
        image(Am5, 0, 300, 100, 100);
        image(Am2, 100, 300, 100, 100);
        image(Am2, 200, 300, 100, 100);
        image(Am3, 300, 300, 100, 100);
        image(Am3, 400, 300, 100, 100);
        image(Am4, 500, 300, 100, 100);
        image(Am4, 600, 300, 100, 100);
        image(Am5, 0, 400, 100, 100);
        image(Am2, 100, 400, 100, 100);
        image(Am2, 200, 400, 100, 100);
        image(Am3, 300, 400, 100, 100);
        image(Am3, 400, 400, 100, 100);
        image(Am4, 500, 400, 100, 100);
        image(Am4, 600, 400, 100, 100);
        image(Am5, 0, 500, 100, 100);
        image(Am2, 100, 500, 100, 100);
        image(Am2, 200, 500, 100, 100);
        image(Am3, 300, 500, 100, 100);
        image(Am3, 400, 500, 100, 100);
        image(Am4, 500, 500, 100, 100);
        image(Am4, 600, 500, 100, 100);
      }
      if (cropType == 2) {
        image(Ar1, 0, 200, 100, 100);
        image(Ar1, 100, 200, 100, 100);
        image(Ar2, 200, 200, 100, 100);
        image(Ar2, 300, 200, 100, 100);
        image(Ar3, 400, 200, 100, 100);
        image(Ar4, 500, 200, 100, 100);
        image(Ar4, 600, 200, 100, 100);
        image(Ar5, 0, 300, 100, 100);
        image(Ar6, 100, 300, 100, 100);
        image(Ar1, 200, 300, 100, 100);
        image(Ar1, 300, 300, 100, 100);
        image(Ar2, 400, 300, 100, 100);
        image(Ar2, 500, 300, 100, 100);
        image(Ar3, 600, 300, 100, 100);
        image(Ar4, 0, 400, 100, 100);
        image(Ar4, 100, 400, 100, 100);
        image(Ar5, 200, 400, 100, 100);
        image(Ar6, 300, 400, 100, 100);
        image(Ar1, 400, 400, 100, 100);
        image(Ar1, 500, 400, 100, 100);
        image(Ar2, 600, 400, 100, 100);
        image(Ar2, 0, 500, 100, 100);
        image(Ar3, 100, 500, 100, 100);
        image(Ar4, 200, 500, 100, 100);
        image(Ar4, 300, 500, 100, 100);
        image(Ar5, 400, 500, 100, 100);
        image(Ar6, 500, 500, 100, 100);
        image(Ar1, 600, 500, 100, 100);
      }
      if (cropType == 3) {
        image(Be1, 0, 200, 100, 100);
        image(Be2, 100, 200, 100, 100);
        image(Be3, 200, 200, 100, 100);
        image(Be3, 300, 200, 100, 100);
        image(Be4, 400, 200, 100, 100);
        image(Be4, 500, 200, 100, 100);
        image(Be5, 600, 200, 100, 100);
        image(Be1, 0, 300, 100, 100);
        image(Be2, 100, 300, 100, 100);
        image(Be3, 200, 300, 100, 100);
        image(Be3, 300, 300, 100, 100);
        image(Be4, 400, 300, 100, 100);
        image(Be4, 500, 300, 100, 100);
        image(Be5, 600, 300, 100, 100);
        image(Be1, 0, 400, 100, 100);
        image(Be2, 100, 400, 100, 100);
        image(Be3, 200, 400, 100, 100);
        image(Be3, 300, 400, 100, 100);
        image(Be4, 400, 400, 100, 100);
        image(Be4, 500, 400, 100, 100);
        image(Be5, 600, 400, 100, 100);
        image(Be1, 0, 500, 100, 100);
        image(Be2, 100, 500, 100, 100);
        image(Be3, 200, 500, 100, 100);
        image(Be3, 300, 500, 100, 100);
        image(Be4, 400, 500, 100, 100);
        image(Be4, 500, 500, 100, 100);
        image(Be5, 600, 500, 100, 100);
      }
      if (cropType == 4) {
        image(Bl1, 0, 200, 100, 100);
        image(Bl2, 100, 200, 100, 100);
        image(Bl2, 200, 200, 100, 100);
        image(Bl2, 300, 200, 100, 100);
        image(Bl3, 400, 200, 100, 100);
        image(Bl3, 500, 200, 100, 100);
        image(Bl3, 600, 200, 100, 100);
        image(Bl4, 0, 300, 100, 100);
        image(Bl4, 100, 300, 100, 100);
        image(Bl4, 200, 300, 100, 100);
        image(Bl4, 300, 300, 100, 100);
        image(Bl5, 400, 300, 100, 100);
        image(Bl5, 500, 300, 100, 100);
        image(Bl6, 600, 300, 100, 100);
        image(Bl7, 0, 400, 100, 100);
        image(Bl7, 100, 400, 100, 100);
        image(Bl7, 200, 400, 100, 100);
        image(Bl6, 300, 400, 100, 100);
        image(Bl7, 400, 400, 100, 100);
        image(Bl7, 500, 400, 100, 100);
        image(Bl7, 600, 400, 100, 100);
        image(Bl6, 0, 500, 100, 100);
        image(Bl7, 100, 500, 100, 100);
        image(Bl7, 200, 500, 100, 100);
        image(Bl7, 300, 500, 100, 100);
        image(Bl6, 400, 500, 100, 100);
        image(Bl7, 500, 500, 100, 100);
        image(Bl7, 600, 500, 100, 100);
      }
      if (cropType == 5) {
        image(BJ1, 0, 200, 100, 100);
        image(BJ2, 100, 200, 100, 100);
        image(BJ2, 200, 200, 100, 100);
        image(BJ3, 300, 200, 100, 100);
        image(BJ3, 400, 200, 100, 100);
        image(BJ4, 500, 200, 100, 100);
        image(BJ4, 600, 200, 100, 100);
        image(BJ5, 0, 300, 100, 100);
        image(BJ1, 100, 300, 100, 100);
        image(BJ2, 200, 300, 100, 100);
        image(BJ2, 300, 300, 100, 100);
        image(BJ3, 400, 300, 100, 100);
        image(BJ3, 500, 300, 100, 100);
        image(BJ4, 600, 300, 100, 100);
        image(BJ4, 0, 400, 100, 100);
        image(BJ5, 100, 400, 100, 100);
        image(BJ1, 200, 400, 100, 100);
        image(BJ2, 300, 400, 100, 100);
        image(BJ2, 400, 400, 100, 100);
        image(BJ3, 500, 400, 100, 100);
        image(BJ3, 600, 400, 100, 100);
        image(BJ4, 0, 500, 100, 100);
        image(BJ4, 100, 500, 100, 100);
        image(BJ5, 200, 500, 100, 100);
        image(BJ1, 300, 500, 100, 100);
        image(BJ2, 400, 500, 100, 100);
        image(BJ2, 500, 500, 100, 100);
        image(BJ3, 600, 500, 100, 100);
      }
      if (cropType == 6) {
        image(BC1, 0, 200, 100, 100);
        image(BC2, 100, 200, 100, 100);
        image(BC3, 200, 200, 100, 100);
        image(BC4, 300, 200, 100, 100);
        image(BC5, 400, 200, 100, 100);
        image(BC1, 500, 200, 100, 100);
        image(BC2, 600, 200, 100, 100);
        image(BC3, 0, 300, 100, 100);
        image(BC4, 100, 300, 100, 100);
        image(BC5, 200, 300, 100, 100);
        image(BC1, 300, 300, 100, 100);
        image(BC2, 400, 300, 100, 100);
        image(BC3, 500, 300, 100, 100);
        image(BC4, 600, 300, 100, 100);
        image(BC5, 0, 400, 100, 100);
        image(BC1, 100, 400, 100, 100);
        image(BC2, 200, 400, 100, 100);
        image(BC3, 300, 400, 100, 100);
        image(BC4, 400, 400, 100, 100);
        image(BC5, 500, 400, 100, 100);
        image(BC1, 600, 400, 100, 100);
        image(BC2, 0, 500, 100, 100);
        image(BC3, 100, 500, 100, 100);
        image(BC4, 200, 500, 100, 100);
        image(BC5, 300, 500, 100, 100);
        image(BC1, 400, 500, 100, 100);
        image(BC2, 500, 500, 100, 100);
        image(BC3, 600, 500, 100, 100);
      }
      if (cropType == 7) {
        image(Ca1, 0, 200, 100, 100);
        image(Ca2, 100, 200, 100, 100);
        image(Ca2, 200, 200, 100, 100);
        image(Ca3, 300, 200, 100, 100);
        image(Ca3, 400, 200, 100, 100);
        image(Ca3, 500, 200, 100, 100);
        image(Ca3, 600, 200, 100, 100);
        image(Ca4, 0, 300, 100, 100);
        image(Ca4, 100, 300, 100, 100);
        image(Ca4, 200, 300, 100, 100);
        image(Ca4, 300, 300, 100, 100);
        image(Ca5, 400, 300, 100, 100);
        image(Ca6, 500, 300, 100, 100);
        image(Ca1, 600, 300, 100, 100);
        image(Ca2, 0, 400, 100, 100);
        image(Ca2, 100, 400, 100, 100);
        image(Ca3, 200, 400, 100, 100);
        image(Ca3, 300, 400, 100, 100);
        image(Ca3, 400, 400, 100, 100);
        image(Ca3, 500, 400, 100, 100);
        image(Ca4, 600, 400, 100, 100);
        image(Ca4, 0, 500, 100, 100);
        image(Ca4, 100, 500, 100, 100);
        image(Ca4, 200, 500, 100, 100);
        image(Ca5, 300, 500, 100, 100);
        image(Ca6, 400, 500, 100, 100);
        image(Ca1, 500, 500, 100, 100);
        image(Ca2, 600, 500, 100, 100);
      }
      if (cropType == 8) {
        image(CB1, 0, 200, 100, 100);
        image(CB2, 100, 200, 100, 100);
        image(CB2, 200, 200, 100, 100);
        image(CB3, 300, 200, 100, 100);
        image(CB3, 400, 200, 100, 100);
        image(CB4, 500, 200, 100, 100);
        image(CB4, 600, 200, 100, 100);
        image(CB4, 0, 300, 100, 100);
        image(CB5, 100, 300, 100, 100);
        image(CB5, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co1, 0, 200, 100, 100);
        image(Co1, 100, 200, 100, 100);
        image(Co2, 200, 200, 100, 100);
        image(Co2, 300, 200, 100, 100);
        image(Co2, 400, 200, 100, 100);
        image(Co3, 500, 200, 100, 100);
        image(Co3, 600, 200, 100, 100);
        image(Co3, 0, 300, 100, 100);
        image(Co4, 100, 300, 100, 100);
        image(Co4, 200, 300, 100, 100);
        image(Co4, 300, 300, 100, 100);
        image(Co5, 400, 300, 100, 100);
        image(Co5, 500, 300, 100, 100);
        image(Co5, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 10) {
        image(Cr1, 0, 200, 100, 100);
        image(Cr2, 100, 200, 100, 100);
        image(Cr2, 200, 200, 100, 100);
        image(Cr3, 300, 200, 100, 100);
        image(Cr4, 400, 200, 100, 100);
        image(Cr5, 500, 200, 100, 100);
        image(Cr5, 600, 200, 100, 100);
        image(Cr6, 0, 300, 100, 100);
        image(Cr7, 100, 300, 100, 100);
        image(Cr7, 200, 300, 100, 100);
        image(Cr7, 300, 300, 100, 100);
        image(Cr7, 400, 300, 100, 100);
        image(Cr6, 500, 300, 100, 100);
        image(Cr7, 600, 300, 100, 100);
        image(Cr7, 0, 400, 100, 100);
        image(Cr7, 100, 400, 100, 100);
        image(Cr7, 200, 400, 100, 100);
        image(Cr6, 300, 400, 100, 100);
        image(Cr7, 400, 400, 100, 100);
        image(Cr7, 500, 400, 100, 100);
        image(Cr7, 600, 400, 100, 100);
        image(Cr7, 0, 500, 100, 100);
        image(Cr6, 100, 500, 100, 100);
        image(Cr7, 200, 500, 100, 100);
        image(Cr7, 300, 500, 100, 100);
        image(Cr7, 400, 500, 100, 100);
        image(Cr7, 500, 500, 100, 100);
        image(Cr6, 600, 500, 100, 100);
      }
      if (cropType == 11) {
        image(E1, 0, 200, 100, 100);
        image(E2, 100, 200, 100, 100);
        image(E3, 200, 200, 100, 100);
        image(E4, 300, 200, 100, 100);
        image(E5, 400, 200, 100, 100);
        image(E6, 500, 200, 100, 100);
        image(E1, 600, 200, 100, 100);
        image(E2, 0, 300, 100, 100);
        image(E3, 100, 300, 100, 100);
        image(E4, 200, 300, 100, 100);
        image(E5, 300, 300, 100, 100);
        image(E6, 400, 300, 100, 100);
        image(E1, 500, 300, 100, 100);
        image(E2, 600, 300, 100, 100);
        image(E3, 0, 400, 100, 100);
        image(E4, 100, 400, 100, 100);
        image(E5, 200, 400, 100, 100);
        image(E6, 300, 400, 100, 100);
        image(E1, 400, 400, 100, 100);
        image(E2, 500, 400, 100, 100);
        image(E3, 600, 400, 100, 100);
        image(E4, 0, 500, 100, 100);
        image(E5, 100, 500, 100, 100);
        image(E6, 200, 500, 100, 100);
        image(E1, 300, 500, 100, 100);
        image(E2, 400, 500, 100, 100);
        image(E3, 500, 500, 100, 100);
        image(E4, 600, 500, 100, 100);
      }
      if (cropType == 12) {
        image(FR1, 0, 200, 100, 100);
        image(FR2, 100, 200, 100, 100);
        image(FR2, 200, 200, 100, 100);
        image(FR2, 300, 200, 100, 100);
        image(FR2, 400, 200, 100, 100);
        image(FR3, 500, 200, 100, 100);
        image(FR3, 600, 200, 100, 100);
        image(FR3, 0, 300, 100, 100);
        image(FR3, 100, 300, 100, 100);
        image(FR4, 200, 300, 100, 100);
        image(FR4, 300, 300, 100, 100);
        image(FR4, 400, 300, 100, 100);
        image(FR5, 500, 300, 100, 100);
        image(FR1, 600, 300, 100, 100);
        image(FR2, 0, 400, 100, 100);
        image(FR2, 100, 400, 100, 100);
        image(FR2, 200, 400, 100, 100);
        image(FR2, 300, 400, 100, 100);
        image(FR3, 400, 400, 100, 100);
        image(FR3, 500, 400, 100, 100);
        image(FR3, 600, 400, 100, 100);
        image(FR3, 0, 500, 100, 100);
        image(FR4, 100, 500, 100, 100);
        image(FR4, 200, 500, 100, 100);
        image(FR4, 300, 500, 100, 100);
        image(FR5, 400, 500, 100, 100);
        image(FR1, 500, 500, 100, 100);
        image(FR2, 600, 500, 100, 100);
      }
      if (cropType == 13) {
        image(Ga1, 0, 200, 100, 100);
        image(Ga2, 100, 200, 100, 100);
        image(Ga3, 200, 200, 100, 100);
        image(Ga4, 300, 200, 100, 100);
        image(Ga5, 400, 200, 100, 100);
        image(Ga1, 500, 200, 100, 100);
        image(Ga2, 600, 200, 100, 100);
        image(Ga3, 0, 300, 100, 100);
        image(Ga4, 100, 300, 100, 100);
        image(Ga5, 200, 300, 100, 100);
        image(Ga1, 300, 300, 100, 100);
        image(Ga2, 400, 300, 100, 100);
        image(Ga3, 500, 300, 100, 100);
        image(Ga4, 600, 300, 100, 100);
        image(Ga5, 0, 400, 100, 100);
        image(Ga1, 100, 400, 100, 100);
        image(Ga2, 200, 400, 100, 100);
        image(Ga3, 300, 400, 100, 100);
        image(Ga4, 400, 400, 100, 100);
        image(Ga5, 500, 400, 100, 100);
        image(Ga1, 600, 400, 100, 100);
        image(Ga2, 0, 500, 100, 100);
        image(Ga3, 100, 500, 100, 100);
        image(Ga4, 200, 500, 100, 100);
        image(Ga5, 300, 500, 100, 100);
        image(Ga1, 400, 500, 100, 100);
        image(Ga2, 500, 500, 100, 100);
        image(Ga3, 600, 500, 100, 100);
      }
      if (cropType == 14) {
        image(GB1, 0, 200, 100, 100);
        image(GB2, 100, 200, 100, 100);
        image(GB3, 200, 200, 100, 100);
        image(GB4, 300, 200, 100, 100);
        image(GB4, 400, 200, 100, 100);
        image(GB4, 500, 200, 100, 100);
        image(GB5, 600, 200, 100, 100);
        image(GB5, 0, 300, 100, 100);
        image(GB5, 100, 300, 100, 100);
        image(GB5, 200, 300, 100, 100);
        image(GB6, 300, 300, 100, 100);
        image(GB7, 400, 300, 100, 100);
        image(GB7, 500, 300, 100, 100);
        image(GB6, 600, 300, 100, 100);
        image(GB7, 0, 400, 100, 100);
        image(GB7, 100, 400, 100, 100);
        image(GB6, 200, 400, 100, 100);
        image(GB7, 300, 400, 100, 100);
        image(GB7, 400, 400, 100, 100);
        image(GB6, 500, 400, 100, 100);
        image(GB7, 600, 400, 100, 100);
        image(GB7, 0, 500, 100, 100);
        image(GB6, 100, 500, 100, 100);
        image(GB7, 200, 500, 100, 100);
        image(GB7, 300, 500, 100, 100);
        image(GB6, 400, 500, 100, 100);
        image(GB7, 500, 500, 100, 100);
        image(GB7, 600, 500, 100, 100);
      }
      if (cropType == 15) {
        image(Gr1, 0, 200, 100, 100);
        image(Gr2, 100, 200, 100, 100);
        image(Gr3, 200, 200, 100, 100);
        image(Gr3, 300, 200, 100, 100);
        image(Gr4, 400, 200, 100, 100);
        image(Gr4, 500, 200, 100, 100);
        image(Gr4, 600, 200, 100, 100);
        image(Gr5, 0, 300, 100, 100);
        image(Gr5, 100, 300, 100, 100);
        image(Gr5, 200, 300, 100, 100);
        image(Gr6, 300, 300, 100, 100);
        image(Gr7, 400, 300, 100, 100);
        image(Gr7, 500, 300, 100, 100);
        image(Gr6, 600, 300, 100, 100);
        image(Gr7, 0, 400, 100, 100);
        image(Gr7, 100, 400, 100, 100);
        image(Gr6, 200, 400, 100, 100);
        image(Gr7, 300, 400, 100, 100);
        image(Gr7, 400, 400, 100, 100);
        image(Gr6, 500, 400, 100, 100);
        image(Gr7, 600, 400, 100, 100);
        image(Gr7, 0, 500, 100, 100);
        image(Gr6, 100, 500, 100, 100);
        image(Gr7, 200, 500, 100, 100);
        image(Gr7, 300, 500, 100, 100);
        image(Gr6, 400, 500, 100, 100);
        image(Gr7, 500, 500, 100, 100);
        image(Gr7, 600, 500, 100, 100);
      }
      if (cropType == 16) {
        image(H1, 0, 200, 100, 100);
        image(H2, 100, 200, 100, 100);
        image(H3, 200, 200, 100, 100);
        image(H3, 300, 200, 100, 100);
        image(H4, 400, 200, 100, 100);
        image(H4, 500, 200, 100, 100);
        image(H4, 600, 200, 100, 100);
        image(H5, 0, 300, 100, 100);
        image(H5, 100, 300, 100, 100);
        image(H5, 200, 300, 100, 100);
        image(H5, 300, 300, 100, 100);
        image(H6, 400, 300, 100, 100);
        image(H6, 500, 300, 100, 100);
        image(H6, 600, 300, 100, 100);
        image(H6, 0, 400, 100, 100);
        image(H6, 100, 400, 100, 100);
        image(H6, 200, 400, 100, 100);
        image(H6, 300, 400, 100, 100);
        image(H6, 400, 400, 100, 100);
        image(H6, 500, 400, 100, 100);
        image(H6, 600, 400, 100, 100);
        image(H6, 0, 500, 100, 100);
        image(H6, 100, 500, 100, 100);
        image(H6, 200, 500, 100, 100);
        image(H6, 300, 500, 100, 100);
        image(H6, 400, 500, 100, 100);
        image(H6, 500, 500, 100, 100);
        image(H6, 600, 500, 100, 100);
      }
      if (cropType == 17) {
        image(HP1, 0, 200, 100, 100);
        image(HP2, 100, 200, 100, 100);
        image(HP3, 200, 200, 100, 100);
        image(HP4, 300, 200, 100, 100);
        image(HP5, 400, 200, 100, 100);
        image(HP6, 500, 200, 100, 100);
        image(HP7, 600, 200, 100, 100);
        image(HP7, 0, 300, 100, 100);
        image(HP6, 100, 300, 100, 100);
        image(HP7, 200, 300, 100, 100);
        image(HP7, 300, 300, 100, 100);
        image(HP6, 400, 300, 100, 100);
        image(HP7, 500, 300, 100, 100);
        image(HP7, 600, 300, 100, 100);
        image(HP6, 0, 400, 100, 100);
        image(HP7, 100, 400, 100, 100);
        image(HP7, 200, 400, 100, 100);
        image(HP6, 300, 400, 100, 100);
        image(HP7, 400, 400, 100, 100);
        image(HP7, 500, 400, 100, 100);
        image(HP6, 600, 400, 100, 100);
        image(HP7, 0, 500, 100, 100);
        image(HP7, 100, 500, 100, 100);
        image(HP6, 200, 500, 100, 100);
        image(HP7, 300, 500, 100, 100);
        image(HP7, 400, 500, 100, 100);
        image(HP6, 500, 500, 100, 100);
        image(HP7, 600, 500, 100, 100);
      }
      if (cropType == 18) {
        image(K1, 0, 200, 100, 100);
        image(K2, 100, 200, 100, 100);
        image(K2, 200, 200, 100, 100);
        image(K3, 300, 200, 100, 100);
        image(K3, 400, 200, 100, 100);
        image(K4, 500, 200, 100, 100);
        image(K5, 600, 200, 100, 100);
        image(K1, 0, 300, 100, 100);
        image(K2, 100, 300, 100, 100);
        image(K2, 200, 300, 100, 100);
        image(K3, 300, 300, 100, 100);
        image(K3, 400, 300, 100, 100);
        image(K4, 500, 300, 100, 100);
        image(K5, 600, 300, 100, 100);
        image(K1, 0, 400, 100, 100);
        image(K2, 100, 400, 100, 100);
        image(K2, 200, 400, 100, 100);
        image(K3, 300, 400, 100, 100);
        image(K3, 400, 400, 100, 100);
        image(K4, 500, 400, 100, 100);
        image(K5, 600, 400, 100, 100);
        image(K1, 0, 500, 100, 100);
        image(K2, 100, 500, 100, 100);
        image(K2, 200, 500, 100, 100);
        image(K3, 300, 500, 100, 100);
        image(K3, 400, 500, 100, 100);
        image(K4, 500, 500, 100, 100);
        image(K5, 600, 500, 100, 100);
      }
      if (cropType == 19) {
        image(M1, 0, 200, 100, 100);
        image(M2, 100, 200, 100, 100);
        image(M2, 200, 200, 100, 100);
        image(M3, 300, 200, 100, 100);
        image(M3, 400, 200, 100, 100);
        image(M3, 500, 200, 100, 100);
        image(M4, 600, 200, 100, 100);
        image(M4, 0, 300, 100, 100);
        image(M4, 100, 300, 100, 100);
        image(M5, 200, 300, 100, 100);
        image(M5, 300, 300, 100, 100);
        image(M5, 400, 300, 100, 100);
        image(M6, 500, 300, 100, 100);
        image(M1, 600, 300, 100, 100);
        image(M2, 0, 400, 100, 100);
        image(M2, 100, 400, 100, 100);
        image(M3, 200, 400, 100, 100);
        image(M3, 300, 400, 100, 100);
        image(M3, 400, 400, 100, 100);
        image(M4, 500, 400, 100, 100);
        image(M4, 600, 400, 100, 100);
        image(M4, 0, 500, 100, 100);
        image(M5, 100, 500, 100, 100);
        image(M5, 200, 500, 100, 100);
        image(M5, 300, 500, 100, 100);
        image(M6, 400, 500, 100, 100);
        image(M1, 500, 500, 100, 100);
        image(M2, 600, 500, 100, 100);
      }
      if (cropType == 20) {
        image(Par1, 0, 200, 100, 100);
        image(Par2, 100, 200, 100, 100);
        image(Par3, 200, 200, 100, 100);
        image(Par4, 300, 200, 100, 100);
        image(Par5, 400, 200, 100, 100);
        image(Par1, 500, 200, 100, 100);
        image(Par2, 600, 200, 100, 100);
        image(Par3, 0, 300, 100, 100);
        image(Par4, 100, 300, 100, 100);
        image(Par5, 200, 300, 100, 100);
        image(Par1, 300, 300, 100, 100);
        image(Par2, 400, 300, 100, 100);
        image(Par3, 500, 300, 100, 100);
        image(Par4, 600, 300, 100, 100);
        image(Par5, 0, 400, 100, 100);
        image(Par1, 100, 400, 100, 100);
        image(Par2, 200, 400, 100, 100);
        image(Par3, 300, 400, 100, 100);
        image(Par4, 400, 400, 100, 100);
        image(Par5, 500, 400, 100, 100);
        image(Par1, 600, 400, 100, 100);
        image(Par2, 0, 500, 100, 100);
        image(Par3, 100, 500, 100, 100);
        image(Par4, 200, 500, 100, 100);
        image(Par5, 300, 500, 100, 100);
        image(Par1, 400, 500, 100, 100);
        image(Par2, 500, 500, 100, 100);
        image(Par3, 600, 500, 100, 100);
      }
      if (cropType == 21) {
        image(Pop1, 0, 200, 100, 100);
        image(Pop2, 100, 200, 100, 100);
        image(Pop2, 200, 200, 100, 100);
        image(Pop3, 300, 200, 100, 100);
        image(Pop3, 400, 200, 100, 100);
        image(Pop4, 500, 200, 100, 100);
        image(Pop4, 600, 200, 100, 100);
        image(Pop5, 0, 300, 100, 100);
        image(Pop1, 100, 300, 100, 100);
        image(Pop2, 200, 300, 100, 100);
        image(Pop2, 300, 300, 100, 100);
        image(Pop3, 400, 300, 100, 100);
        image(Pop3, 500, 300, 100, 100);
        image(Pop4, 600, 300, 100, 100);
        image(Pop4, 0, 400, 100, 100);
        image(Pop5, 100, 400, 100, 100);
        image(Pop1, 200, 400, 100, 100);
        image(Pop2, 300, 400, 100, 100);
        image(Pop2, 400, 400, 100, 100);
        image(Pop3, 500, 400, 100, 100);
        image(Pop3, 600, 400, 100, 100);
        image(Pop4, 0, 500, 100, 100);
        image(Pop4, 100, 500, 100, 100);
        image(Pop5, 200, 500, 100, 100);
        image(Pop1, 300, 500, 100, 100);
        image(Pop2, 400, 500, 100, 100);
        image(Pop2, 500, 500, 100, 100);
        image(Pop3, 600, 500, 100, 100);
      }
      if (cropType == 22) {
        image(Pot1, 0, 200, 100, 100);
        image(Pot2, 100, 200, 100, 100);
        image(Pot3, 200, 200, 100, 100);
        image(Pot4, 300, 200, 100, 100);
        image(Pot4, 400, 200, 100, 100);
        image(Pot5, 500, 200, 100, 100);
        image(Pot6, 600, 200, 100, 100);
        image(Pot1, 0, 300, 100, 100);
        image(Pot2, 100, 300, 100, 100);
        image(Pot3, 200, 300, 100, 100);
        image(Pot4, 300, 300, 100, 100);
        image(Pot4, 400, 300, 100, 100);
        image(Pot5, 500, 300, 100, 100);
        image(Pot6, 600, 300, 100, 100);
        image(Pot1, 0, 400, 100, 100);
        image(Pot2, 100, 400, 100, 100);
        image(Pot3, 200, 400, 100, 100);
        image(Pot4, 300, 400, 100, 100);
        image(Pot4, 400, 400, 100, 100);
        image(Pot5, 500, 400, 100, 100);
        image(Pot6, 600, 400, 100, 100);
        image(Pot1, 0, 500, 100, 100);
        image(Pot2, 100, 500, 100, 100);
        image(Pot3, 200, 500, 100, 100);
        image(Pot4, 300, 500, 100, 100);
        image(Pot4, 400, 500, 100, 100);
        image(Pot5, 500, 500, 100, 100);
        image(Pot6, 600, 500, 100, 100);
      }
      if (cropType == 23) {
        image(Pum1, 0, 200, 100, 100);
        image(Pum2, 100, 200, 100, 100);
        image(Pum2, 200, 200, 100, 100);
        image(Pum3, 300, 200, 100, 100);
        image(Pum3, 400, 200, 100, 100);
        image(Pum3, 500, 200, 100, 100);
        image(Pum4, 600, 200, 100, 100);
        image(Pum4, 0, 300, 100, 100);
        image(Pum4, 100, 300, 100, 100);
        image(Pum4, 200, 300, 100, 100);
        image(Pum5, 300, 300, 100, 100);
        image(Pum5, 400, 300, 100, 100);
        image(Pum5, 500, 300, 100, 100);
        image(Pum6, 600, 300, 100, 100);
        image(Pum1, 0, 400, 100, 100);
        image(Pum2, 100, 400, 100, 100);
        image(Pum2, 200, 400, 100, 100);
        image(Pum3, 300, 400, 100, 100);
        image(Pum3, 400, 400, 100, 100);
        image(Pum3, 500, 400, 100, 100);
        image(Pum4, 600, 400, 100, 100);
        image(Pum4, 0, 500, 100, 100);
        image(Pum4, 100, 500, 100, 100);
        image(Pum4, 200, 500, 100, 100);
        image(Pum5, 300, 500, 100, 100);
        image(Pum5, 400, 500, 100, 100);
        image(Pum5, 500, 500, 100, 100);
        image(Pum6, 600, 500, 100, 100);
      }
      if (cropType == 24) {
        image(Ra1, 0, 200, 100, 100);
        image(Ra1, 100, 200, 100, 100);
        image(Ra2, 200, 200, 100, 100);
        image(Ra3, 300, 200, 100, 100);
        image(Ra3, 400, 200, 100, 100);
        image(Ra4, 500, 200, 100, 100);
        image(Ra5, 600, 200, 100, 100);
        image(Ra1, 0, 300, 100, 100);
        image(Ra1, 100, 300, 100, 100);
        image(Ra2, 200, 300, 100, 100);
        image(Ra3, 300, 300, 100, 100);
        image(Ra3, 400, 300, 100, 100);
        image(Ra4, 500, 300, 100, 100);
        image(Ra5, 600, 300, 100, 100);
        image(Ra1, 0, 400, 100, 100);
        image(Ra1, 100, 400, 100, 100);
        image(Ra2, 200, 400, 100, 100);
        image(Ra3, 300, 400, 100, 100);
        image(Ra3, 400, 400, 100, 100);
        image(Ra4, 500, 400, 100, 100);
        image(Ra5, 600, 400, 100, 100);
        image(Ra1, 0, 500, 100, 100);
        image(Ra1, 100, 500, 100, 100);
        image(Ra2, 200, 500, 100, 100);
        image(Ra3, 300, 500, 100, 100);
        image(Ra3, 400, 500, 100, 100);
        image(Ra4, 500, 500, 100, 100);
        image(Ra5, 600, 500, 100, 100);
      }
      if (cropType == 25) {
        image(RC1, 0, 200, 100, 100);
        image(RC1, 100, 200, 100, 100);
        image(RC2, 200, 200, 100, 100);
        image(RC3, 300, 200, 100, 100);
        image(RC3, 400, 200, 100, 100);
        image(RC4, 500, 200, 100, 100);
        image(RC4, 600, 200, 100, 100);
        image(RC5, 0, 300, 100, 100);
        image(RC5, 100, 300, 100, 100);
        image(RC6, 200, 300, 100, 100);
        image(RC1, 300, 300, 100, 100);
        image(RC1, 400, 300, 100, 100);
        image(RC2, 500, 300, 100, 100);
        image(RC3, 600, 300, 100, 100);
        image(RC3, 0, 400, 100, 100);
        image(RC4, 100, 400, 100, 100);
        image(RC4, 200, 400, 100, 100);
        image(RC5, 300, 400, 100, 100);
        image(RC5, 400, 400, 100, 100);
        image(RC6, 500, 400, 100, 100);
        image(RC1, 600, 400, 100, 100);
        image(RC1, 0, 500, 100, 100);
        image(RC2, 100, 500, 100, 100);
        image(RC3, 200, 500, 100, 100);
        image(RC3, 300, 500, 100, 100);
        image(RC4, 400, 500, 100, 100);
        image(RC4, 500, 500, 100, 100);
        image(RC5, 600, 500, 100, 100);
      }
      if (cropType == 26) {
        image(Rh1, 0, 200, 100, 100);
        image(Rh1, 100, 200, 100, 100);
        image(Rh2, 200, 200, 100, 100);
        image(Rh2, 300, 200, 100, 100);
        image(Rh3, 400, 200, 100, 100);
        image(Rh3, 500, 200, 100, 100);
        image(Rh4, 600, 200, 100, 100);
        image(Rh4, 0, 300, 100, 100);
        image(Rh4, 100, 300, 100, 100);
        image(Rh5, 200, 300, 100, 100);
        image(Rh5, 300, 300, 100, 100);
        image(Rh5, 400, 300, 100, 100);
        image(Rh5, 500, 300, 100, 100);
        image(Rh6, 600, 300, 100, 100);
        image(Rh1, 0, 400, 100, 100);
        image(Rh1, 100, 400, 100, 100);
        image(Rh2, 200, 400, 100, 100);
        image(Rh2, 300, 400, 100, 100);
        image(Rh3, 400, 400, 100, 100);
        image(Rh3, 500, 400, 100, 100);
        image(Rh4, 600, 400, 100, 100);
        image(Rh4, 0, 500, 100, 100);
        image(Rh4, 100, 500, 100, 100);
        image(Rh5, 200, 500, 100, 100);
        image(Rh5, 300, 500, 100, 100);
        image(Rh5, 400, 500, 100, 100);
        image(Rh5, 500, 500, 100, 100);
        image(Rh6, 600, 500, 100, 100);
      }
      if (cropType == 27) {
        image(Sta1, 0, 200, 100, 100);
        image(Sta1, 100, 200, 100, 100);
        image(Sta2, 200, 200, 100, 100);
        image(Sta2, 300, 200, 100, 100);
        image(Sta2, 400, 200, 100, 100);
        image(Sta3, 500, 200, 100, 100);
        image(Sta3, 600, 200, 100, 100);
        image(Sta4, 0, 300, 100, 100);
        image(Sta4, 100, 300, 100, 100);
        image(Sta4, 200, 300, 100, 100);
        image(Sta5, 300, 300, 100, 100);
        image(Sta5, 400, 300, 100, 100);
        image(Sta5, 500, 300, 100, 100);
        image(Sta6, 600, 300, 100, 100);
        image(Sta1, 0, 400, 100, 100);
        image(Sta1, 100, 400, 100, 100);
        image(Sta2, 200, 400, 100, 100);
        image(Sta2, 300, 400, 100, 100);
        image(Sta2, 400, 400, 100, 100);
        image(Sta3, 500, 400, 100, 100);
        image(Sta3, 600, 400, 100, 100);
        image(Sta4, 0, 500, 100, 100);
        image(Sta4, 100, 500, 100, 100);
        image(Sta4, 200, 500, 100, 100);
        image(Sta5, 300, 500, 100, 100);
        image(Sta5, 400, 500, 100, 100);
        image(Sta5, 500, 500, 100, 100);
        image(Sta6, 600, 500, 100, 100);
      }
      if (cropType == 28) {
        image(Str1, 0, 200, 100, 100);
        image(Str2, 100, 200, 100, 100);
        image(Str3, 200, 200, 100, 100);
        image(Str3, 300, 200, 100, 100);
        image(Str4, 400, 200, 100, 100);
        image(Str4, 500, 200, 100, 100);
        image(Str5, 600, 200, 100, 100);
        image(Str5, 0, 300, 100, 100);
        image(Str6, 100, 300, 100, 100);
        image(Str7, 200, 300, 100, 100);
        image(Str7, 300, 300, 100, 100);
        image(Str7, 400, 300, 100, 100);
        image(Str6, 500, 300, 100, 100);
        image(Str7, 600, 300, 100, 100);
        image(Str7, 0, 400, 100, 100);
        image(Str7, 100, 400, 100, 100);
        image(Str6, 200, 400, 100, 100);
        image(Str7, 300, 400, 100, 100);
        image(Str7, 400, 400, 100, 100);
        image(Str7, 500, 400, 100, 100);
        image(Str6, 600, 400, 100, 100);
        image(Str7, 0, 500, 100, 100);
        image(Str7, 100, 500, 100, 100);
        image(Str7, 200, 500, 100, 100);
        image(Str6, 300, 500, 100, 100);
        image(Str7, 400, 500, 100, 100);
        image(Str7, 500, 500, 100, 100);
        image(Str7, 600, 500, 100, 100);
      }
      if (cropType == 29) {
        image(SS1, 0, 200, 100, 100);
        image(SS2, 100, 200, 100, 100);
        image(SS2, 200, 200, 100, 100);
        image(SS3, 300, 200, 100, 100);
        image(SS3, 400, 200, 100, 100);
        image(SS3, 500, 200, 100, 100);
        image(SS4, 600, 200, 100, 100);
        image(SS4, 0, 300, 100, 100);
        image(SS5, 100, 300, 100, 100);
        image(SS1, 200, 300, 100, 100);
        image(SS2, 300, 300, 100, 100);
        image(SS2, 400, 300, 100, 100);
        image(SS3, 500, 300, 100, 100);
        image(SS3, 600, 300, 100, 100);
        image(SS3, 0, 400, 100, 100);
        image(SS4, 100, 400, 100, 100);
        image(SS4, 200, 400, 100, 100);
        image(SS5, 300, 400, 100, 100);
        image(SS1, 400, 400, 100, 100);
        image(SS2, 500, 400, 100, 100);
        image(SS2, 600, 400, 100, 100);
        image(SS3, 0, 500, 100, 100);
        image(SS3, 100, 500, 100, 100);
        image(SS3, 200, 500, 100, 100);
        image(SS4, 300, 500, 100, 100);
        image(SS4, 400, 500, 100, 100);
        image(SS5, 500, 500, 100, 100);
        image(SS1, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su1, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su2, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su3, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su4, 0, 300, 100, 100);
        image(Su5, 100, 300, 100, 100);
        image(Su1, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su2, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su3, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su4, 200, 400, 100, 100);
        image(Su5, 300, 400, 100, 100);
        image(Su1, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su2, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su3, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su4, 400, 500, 100, 100);
        image(Su5, 500, 500, 100, 100);
        image(Su1, 600, 500, 100, 100);
      }
      if (cropType == 31) {
        image(To1, 0, 200, 100, 100);
        image(To1, 100, 200, 100, 100);
        image(To2, 200, 200, 100, 100);
        image(To2, 300, 200, 100, 100);
        image(To3, 400, 200, 100, 100);
        image(To3, 500, 200, 100, 100);
        image(To4, 600, 200, 100, 100);
        image(To4, 0, 300, 100, 100);
        image(To5, 100, 300, 100, 100);
        image(To5, 200, 300, 100, 100);
        image(To5, 300, 300, 100, 100);
        image(To6, 400, 300, 100, 100);
        image(To7, 500, 300, 100, 100);
        image(To7, 600, 300, 100, 100);
        image(To7, 0, 400, 100, 100);
        image(To6, 100, 400, 100, 100);
        image(To7, 200, 400, 100, 100);
        image(To7, 300, 400, 100, 100);
        image(To7, 400, 400, 100, 100);
        image(To6, 500, 400, 100, 100);
        image(To7, 600, 400, 100, 100);
        image(To7, 0, 500, 100, 100);
        image(To7, 100, 500, 100, 100);
        image(To6, 200, 500, 100, 100);
        image(To7, 300, 500, 100, 100);
        image(To7, 400, 500, 100, 100);
        image(To7, 500, 500, 100, 100);
        image(To6, 600, 500, 100, 100);
      }
      if (cropType == 32) {
        image(Tu1, 0, 200, 100, 100);
        image(Tu2, 100, 200, 100, 100);
        image(Tu3, 200, 200, 100, 100);
        image(Tu3, 300, 200, 100, 100);
        image(Tu4, 400, 200, 100, 100);
        image(Tu4, 500, 200, 100, 100);
        image(Tu5, 600, 200, 100, 100);
        image(Tu1, 0, 300, 100, 100);
        image(Tu2, 100, 300, 100, 100);
        image(Tu3, 200, 300, 100, 100);
        image(Tu3, 300, 300, 100, 100);
        image(Tu4, 400, 300, 100, 100);
        image(Tu4, 500, 300, 100, 100);
        image(Tu5, 600, 300, 100, 100);
        image(Tu1, 0, 400, 100, 100);
        image(Tu2, 100, 400, 100, 100);
        image(Tu3, 200, 400, 100, 100);
        image(Tu3, 300, 400, 100, 100);
        image(Tu4, 400, 400, 100, 100);
        image(Tu4, 500, 400, 100, 100);
        image(Tu5, 600, 400, 100, 100);
        image(Tu1, 0, 500, 100, 100);
        image(Tu2, 100, 500, 100, 100);
        image(Tu3, 200, 500, 100, 100);
        image(Tu3, 300, 500, 100, 100);
        image(Tu4, 400, 500, 100, 100);
        image(Tu4, 500, 500, 100, 100);
        image(Tu5, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR2, 200, 200, 100, 100);
        image(UmR3, 300, 200, 100, 100);
        image(UmR3, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR4, 600, 200, 100, 100);
        image(UmR4, 0, 300, 100, 100);
        image(UmR5, 100, 300, 100, 100);
        image(UmR1, 200, 300, 100, 100);
        image(UmR2, 300, 300, 100, 100);
        image(UmR2, 400, 300, 100, 100);
        image(UmR3, 500, 300, 100, 100);
        image(UmR3, 600, 300, 100, 100);
        image(UmR4, 0, 400, 100, 100);
        image(UmR4, 100, 400, 100, 100);
        image(UmR4, 200, 400, 100, 100);
        image(UmR5, 300, 400, 100, 100);
        image(UmR1, 400, 400, 100, 100);
        image(UmR2, 500, 400, 100, 100);
        image(UmR2, 600, 400, 100, 100);
        image(UmR3, 0, 500, 100, 100);
        image(UmR3, 100, 500, 100, 100);
        image(UmR4, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR5, 500, 500, 100, 100);
        image(UmR1, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W1, 0, 200, 100, 100);
        image(W2, 100, 200, 100, 100);
        image(W3, 200, 200, 100, 100);
        image(W4, 300, 200, 100, 100);
        image(W5, 400, 200, 100, 100);
        image(W1, 500, 200, 100, 100);
        image(W2, 600, 200, 100, 100);
        image(W3, 0, 300, 100, 100);
        image(W4, 100, 300, 100, 100);
        image(W5, 200, 300, 100, 100);
        image(W1, 300, 300, 100, 100);
        image(W2, 400, 300, 100, 100);
        image(W3, 500, 300, 100, 100);
        image(W4, 600, 300, 100, 100);
        image(W5, 0, 400, 100, 100);
        image(W1, 100, 400, 100, 100);
        image(W2, 200, 400, 100, 100);
        image(W3, 300, 400, 100, 100);
        image(W4, 400, 400, 100, 100);
        image(W5, 500, 400, 100, 100);
        image(W1, 600, 400, 100, 100);
        image(W2, 0, 500, 100, 100);
        image(W3, 100, 500, 100, 100);
        image(W4, 200, 500, 100, 100);
        image(W5, 300, 500, 100, 100);
        image(W1, 400, 500, 100, 100);
        image(W2, 500, 500, 100, 100);
        image(W3, 600, 500, 100, 100);
      }
      if (cropType == 35) {
        image(Y1, 0, 200, 100, 100);
        image(Y2, 100, 200, 100, 100);
        image(Y2, 200, 200, 100, 100);
        image(Y2, 300, 200, 100, 100);
        image(Y3, 400, 200, 100, 100);
        image(Y3, 500, 200, 100, 100);
        image(Y3, 600, 200, 100, 100);
        image(Y4, 0, 300, 100, 100);
        image(Y4, 100, 300, 100, 100);
        image(Y4, 200, 300, 100, 100);
        image(Y5, 300, 300, 100, 100);
        image(Y1, 400, 300, 100, 100);
        image(Y2, 500, 300, 100, 100);
        image(Y2, 600, 300, 100, 100);
        image(Y2, 0, 400, 100, 100);
        image(Y3, 100, 400, 100, 100);
        image(Y3, 200, 400, 100, 100);
        image(Y3, 300, 400, 100, 100);
        image(Y4, 400, 400, 100, 100);
        image(Y4, 500, 400, 100, 100);
        image(Y4, 600, 400, 100, 100);
        image(Y5, 0, 500, 100, 100);
        image(Y1, 100, 500, 100, 100);
        image(Y2, 200, 500, 100, 100);
        image(Y2, 300, 500, 100, 100);
        image(Y2, 400, 500, 100, 100);
        image(Y3, 500, 500, 100, 100);
        image(Y3, 600, 500, 100, 100);
      }
    }
    if (cropCalendarDADSGtype2) {
      if (cropType == 8) {
        image(CB6, 0, 200, 100, 100);
        image(CB7, 100, 200, 100, 100);
        image(CB6, 200, 200, 100, 100);
        image(CB7, 300, 200, 100, 100);
        image(CB6, 400, 200, 100, 100);
        image(CB7, 500, 200, 100, 100);
        image(CB6, 600, 200, 100, 100);
        image(CB7, 0, 300, 100, 100);
        image(CB6, 100, 300, 100, 100);
        image(CB7, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co7, 0, 200, 100, 100);
        image(Co7, 100, 200, 100, 100);
        image(Co6, 200, 200, 100, 100);
        image(Co7, 300, 200, 100, 100);
        image(Co7, 400, 200, 100, 100);
        image(Co7, 500, 200, 100, 100);
        image(Co6, 600, 200, 100, 100);
        image(Co7, 0, 300, 100, 100);
        image(Co7, 100, 300, 100, 100);
        image(Co7, 200, 300, 100, 100);
        image(Co6, 300, 300, 100, 100);
        image(Co7, 400, 300, 100, 100);
        image(Co7, 500, 300, 100, 100);
        image(Co7, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su2, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su3, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su4, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su5, 0, 300, 100, 100);
        image(Su1, 100, 300, 100, 100);
        image(Su2, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su3, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su4, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su5, 200, 400, 100, 100);
        image(Su1, 300, 400, 100, 100);
        image(Su2, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su3, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su4, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su5, 400, 500, 100, 100);
        image(Su1, 500, 500, 100, 100);
        image(Su2, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR3, 200, 200, 100, 100);
        image(UmR4, 300, 200, 100, 100);
        image(UmR4, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR5, 600, 200, 100, 100);
        image(UmR1, 0, 300, 100, 100);
        image(UmR2, 100, 300, 100, 100);
        image(UmR3, 200, 300, 100, 100);
        image(UmR4, 300, 300, 100, 100);
        image(UmR4, 400, 300, 100, 100);
        image(UmR4, 500, 300, 100, 100);
        image(UmR5, 600, 300, 100, 100);
        image(UmR1, 0, 400, 100, 100);
        image(UmR2, 100, 400, 100, 100);
        image(UmR3, 200, 400, 100, 100);
        image(UmR4, 300, 400, 100, 100);
        image(UmR4, 400, 400, 100, 100);
        image(UmR4, 500, 400, 100, 100);
        image(UmR5, 600, 400, 100, 100);
        image(UmR1, 0, 500, 100, 100);
        image(UmR2, 100, 500, 100, 100);
        image(UmR3, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR4, 500, 500, 100, 100);
        image(UmR5, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W4, 0, 200, 100, 100);
        image(W5, 100, 200, 100, 100);
        image(W1, 200, 200, 100, 100);
        image(W2, 300, 200, 100, 100);
        image(W3, 400, 200, 100, 100);
        image(W4, 500, 200, 100, 100);
        image(W5, 600, 200, 100, 100);
        image(W1, 0, 300, 100, 100);
        image(W2, 100, 300, 100, 100);
        image(W3, 200, 300, 100, 100);
        image(W4, 300, 300, 100, 100);
        image(W5, 400, 300, 100, 100);
        image(W1, 500, 300, 100, 100);
        image(W2, 600, 300, 100, 100);
        image(W3, 0, 400, 100, 100);
        image(W4, 100, 400, 100, 100);
        image(W5, 200, 400, 100, 100);
        image(W1, 300, 400, 100, 100);
        image(W1, 400, 400, 100, 100);
        image(W2, 500, 400, 100, 100);
        image(W3, 600, 400, 100, 100);
        image(W4, 0, 500, 100, 100);
        image(W5, 100, 500, 100, 100);
        image(W1, 200, 500, 100, 100);
        image(W2, 300, 500, 100, 100);
        image(W3, 400, 500, 100, 100);
        image(W4, 500, 500, 100, 100);
        image(W5, 600, 500, 100, 100);
      }
    }
    if (cropType == 8 || cropType == 9 || cropType == 30 || cropType == 33 || cropType == 34) {
      if (keyPressed) {
        if (key == CODED) {
          if (keyCode == SHIFT) {
            cropCalendarDADSGtype2 = true;
            cropCalendarDADSGtype1 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
          if (keyCode == CONTROL) {
            cropCalendarDADSGtype1 = true;
            cropCalendarDADSGtype2 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
        }
      }
    }
    if (keyPressed) {
      if (key == 'V' || key == 'v') {
        cropSelect = true;
        cropCalendarDADSG = false;
        fill(0);
        rect(0, 0, 700, 600);
      }
      if (key == 'C' || key == 'c') {
        cropCalendarDADSG = false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalculator = true;
      }
      if(key == '1') {
        cropCalendarDADSG = false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalendarN = true;
      }
    }
  }
}*/
/*void CalendarmodeNADSG() {
  if (cropCalendarNADSG == true) {
//Normal Agricultrulist Delux Speed Growth
    //build
    stroke(255);
    for (int i = 100; i < 600; i += 100) {
      line(0, i, 700, i);
    }
    for (int i = 100; i < 700; i += 100) {
      line(i, 100, i, 600);
    }
    //text
    fill(255);
    textSize(32);
    text("Mon", 20, 200);
    text("Tue", 120, 200);
    text("Wed", 220, 200);
    text("Thu", 320, 200);
    text("Fri", 420, 200);
    text("Sat", 520, 200);
    text("Sun", 620, 200);
    if (cropCalendarNADSGtype1) {
      if (cropType == 1) {
        image(Am1, 0, 200, 100, 100);
        image(Am2, 100, 200, 100, 100);
        image(Am2, 200, 200, 100, 100);
        image(Am3, 300, 200, 100, 100);
        image(Am3, 400, 200, 100, 100);
        image(Am4, 500, 200, 100, 100);
        image(Am4, 600, 200, 100, 100);
        image(Am5, 0, 300, 100, 100);
        image(Am1, 100, 300, 100, 100);
        image(Am2, 200, 300, 100, 100);
        image(Am2, 300, 300, 100, 100);
        image(Am3, 400, 300, 100, 100);
        image(Am3, 500, 300, 100, 100);
        image(Am4, 600, 300, 100, 100);
        image(Am4, 0, 400, 100, 100);
        image(Am5, 100, 400, 100, 100);
        image(Am1, 200, 400, 100, 100);
        image(Am2, 300, 400, 100, 100);
        image(Am2, 400, 400, 100, 100);
        image(Am3, 500, 400, 100, 100);
        image(Am3, 600, 400, 100, 100);
        image(Am4, 0, 500, 100, 100);
        image(Am4, 100, 500, 100, 100);
        image(Am5, 200, 500, 100, 100);
        image(Am1, 300, 500, 100, 100);
        image(Am2, 400, 500, 100, 100);
        image(Am2, 500, 500, 100, 100);
        image(Am3, 600, 500, 100, 100);
      }
      if (cropType == 2) {
        image(Ar1, 0, 200, 100, 100);
        image(Ar1, 100, 200, 100, 100);
        image(Ar2, 200, 200, 100, 100);
        image(Ar2, 300, 200, 100, 100);
        image(Ar3, 400, 200, 100, 100);
        image(Ar4, 500, 200, 100, 100);
        image(Ar4, 600, 200, 100, 100);
        image(Ar5, 0, 300, 100, 100);
        image(Ar6, 100, 300, 100, 100);
        image(Ar1, 200, 300, 100, 100);
        image(Ar1, 300, 300, 100, 100);
        image(Ar2, 400, 300, 100, 100);
        image(Ar2, 500, 300, 100, 100);
        image(Ar3, 600, 300, 100, 100);
        image(Ar4, 0, 400, 100, 100);
        image(Ar4, 100, 400, 100, 100);
        image(Ar5, 200, 400, 100, 100);
        image(Ar6, 300, 400, 100, 100);
        image(Ar1, 400, 400, 100, 100);
        image(Ar1, 500, 400, 100, 100);
        image(Ar2, 600, 400, 100, 100);
        image(Ar2, 0, 500, 100, 100);
        image(Ar3, 100, 500, 100, 100);
        image(Ar4, 200, 500, 100, 100);
        image(Ar4, 300, 500, 100, 100);
        image(Ar5, 400, 500, 100, 100);
        image(Ar6, 500, 500, 100, 100);
        image(Ar1, 600, 500, 100, 100);
      }
      if (cropType == 3) {
        image(Be1, 0, 200, 100, 100);
        image(Be2, 100, 200, 100, 100);
        image(Be3, 200, 200, 100, 100);
        image(Be3, 300, 200, 100, 100);
        image(Be4, 400, 200, 100, 100);
        image(Be4, 500, 200, 100, 100);
        image(Be5, 600, 200, 100, 100);
        image(Be1, 0, 300, 100, 100);
        image(Be2, 100, 300, 100, 100);
        image(Be3, 200, 300, 100, 100);
        image(Be3, 300, 300, 100, 100);
        image(Be4, 400, 300, 100, 100);
        image(Be4, 500, 300, 100, 100);
        image(Be5, 600, 300, 100, 100);
        image(Be1, 0, 400, 100, 100);
        image(Be2, 100, 400, 100, 100);
        image(Be3, 200, 400, 100, 100);
        image(Be3, 300, 400, 100, 100);
        image(Be4, 400, 400, 100, 100);
        image(Be4, 500, 400, 100, 100);
        image(Be5, 600, 400, 100, 100);
        image(Be1, 0, 500, 100, 100);
        image(Be2, 100, 500, 100, 100);
        image(Be3, 200, 500, 100, 100);
        image(Be3, 300, 500, 100, 100);
        image(Be4, 400, 500, 100, 100);
        image(Be4, 500, 500, 100, 100);
        image(Be5, 600, 500, 100, 100);
      }
      if (cropType == 4) {
        image(Bl1, 0, 200, 100, 100);
        image(Bl2, 100, 200, 100, 100);
        image(Bl2, 200, 200, 100, 100);
        image(Bl2, 300, 200, 100, 100);
        image(Bl3, 400, 200, 100, 100);
        image(Bl3, 500, 200, 100, 100);
        image(Bl3, 600, 200, 100, 100);
        image(Bl4, 0, 300, 100, 100);
        image(Bl4, 100, 300, 100, 100);
        image(Bl4, 200, 300, 100, 100);
        image(Bl4, 300, 300, 100, 100);
        image(Bl5, 400, 300, 100, 100);
        image(Bl5, 500, 300, 100, 100);
        image(Bl6, 600, 300, 100, 100);
        image(Bl7, 0, 400, 100, 100);
        image(Bl7, 100, 400, 100, 100);
        image(Bl7, 200, 400, 100, 100);
        image(Bl6, 300, 400, 100, 100);
        image(Bl7, 400, 400, 100, 100);
        image(Bl7, 500, 400, 100, 100);
        image(Bl7, 600, 400, 100, 100);
        image(Bl6, 0, 500, 100, 100);
        image(Bl7, 100, 500, 100, 100);
        image(Bl7, 200, 500, 100, 100);
        image(Bl7, 300, 500, 100, 100);
        image(Bl6, 400, 500, 100, 100);
        image(Bl7, 500, 500, 100, 100);
        image(Bl7, 600, 500, 100, 100);
      }
      if (cropType == 5) {
        image(BJ1, 0, 200, 100, 100);
        image(BJ2, 100, 200, 100, 100);
        image(BJ2, 200, 200, 100, 100);
        image(BJ3, 300, 200, 100, 100);
        image(BJ3, 400, 200, 100, 100);
        image(BJ4, 500, 200, 100, 100);
        image(BJ4, 600, 200, 100, 100);
        image(BJ5, 0, 300, 100, 100);
        image(BJ1, 100, 300, 100, 100);
        image(BJ2, 200, 300, 100, 100);
        image(BJ2, 300, 300, 100, 100);
        image(BJ3, 400, 300, 100, 100);
        image(BJ3, 500, 300, 100, 100);
        image(BJ4, 600, 300, 100, 100);
        image(BJ4, 0, 400, 100, 100);
        image(BJ5, 100, 400, 100, 100);
        image(BJ1, 200, 400, 100, 100);
        image(BJ2, 300, 400, 100, 100);
        image(BJ2, 400, 400, 100, 100);
        image(BJ3, 500, 400, 100, 100);
        image(BJ3, 600, 400, 100, 100);
        image(BJ4, 0, 500, 100, 100);
        image(BJ4, 100, 500, 100, 100);
        image(BJ5, 200, 500, 100, 100);
        image(BJ1, 300, 500, 100, 100);
        image(BJ2, 400, 500, 100, 100);
        image(BJ2, 500, 500, 100, 100);
        image(BJ3, 600, 500, 100, 100);
      }
      if (cropType == 6) {
        image(BC1, 0, 200, 100, 100);
        image(BC2, 100, 200, 100, 100);
        image(BC3, 200, 200, 100, 100);
        image(BC4, 300, 200, 100, 100);
        image(BC5, 400, 200, 100, 100);
        image(BC1, 500, 200, 100, 100);
        image(BC2, 600, 200, 100, 100);
        image(BC3, 0, 300, 100, 100);
        image(BC4, 100, 300, 100, 100);
        image(BC5, 200, 300, 100, 100);
        image(BC1, 300, 300, 100, 100);
        image(BC2, 400, 300, 100, 100);
        image(BC3, 500, 300, 100, 100);
        image(BC4, 600, 300, 100, 100);
        image(BC5, 0, 400, 100, 100);
        image(BC1, 100, 400, 100, 100);
        image(BC2, 200, 400, 100, 100);
        image(BC3, 300, 400, 100, 100);
        image(BC4, 400, 400, 100, 100);
        image(BC5, 500, 400, 100, 100);
        image(BC1, 600, 400, 100, 100);
        image(BC2, 0, 500, 100, 100);
        image(BC3, 100, 500, 100, 100);
        image(BC4, 200, 500, 100, 100);
        image(BC5, 300, 500, 100, 100);
        image(BC1, 400, 500, 100, 100);
        image(BC2, 500, 500, 100, 100);
        image(BC3, 600, 500, 100, 100);
      }
      if (cropType == 7) {
        image(Ca1, 0, 200, 100, 100);
        image(Ca2, 100, 200, 100, 100);
        image(Ca2, 200, 200, 100, 100);
        image(Ca3, 300, 200, 100, 100);
        image(Ca3, 400, 200, 100, 100);
        image(Ca3, 500, 200, 100, 100);
        image(Ca3, 600, 200, 100, 100);
        image(Ca4, 0, 300, 100, 100);
        image(Ca4, 100, 300, 100, 100);
        image(Ca4, 200, 300, 100, 100);
        image(Ca4, 300, 300, 100, 100);
        image(Ca5, 400, 300, 100, 100);
        image(Ca6, 500, 300, 100, 100);
        image(Ca1, 600, 300, 100, 100);
        image(Ca2, 0, 400, 100, 100);
        image(Ca2, 100, 400, 100, 100);
        image(Ca3, 200, 400, 100, 100);
        image(Ca3, 300, 400, 100, 100);
        image(Ca3, 400, 400, 100, 100);
        image(Ca3, 500, 400, 100, 100);
        image(Ca4, 600, 400, 100, 100);
        image(Ca4, 0, 500, 100, 100);
        image(Ca4, 100, 500, 100, 100);
        image(Ca4, 200, 500, 100, 100);
        image(Ca5, 300, 500, 100, 100);
        image(Ca6, 400, 500, 100, 100);
        image(Ca1, 500, 500, 100, 100);
        image(Ca2, 600, 500, 100, 100);
      }
      if (cropType == 8) {
        image(CB1, 0, 200, 100, 100);
        image(CB2, 100, 200, 100, 100);
        image(CB2, 200, 200, 100, 100);
        image(CB3, 300, 200, 100, 100);
        image(CB3, 400, 200, 100, 100);
        image(CB4, 500, 200, 100, 100);
        image(CB4, 600, 200, 100, 100);
        image(CB4, 0, 300, 100, 100);
        image(CB5, 100, 300, 100, 100);
        image(CB5, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co1, 0, 200, 100, 100);
        image(Co1, 100, 200, 100, 100);
        image(Co2, 200, 200, 100, 100);
        image(Co2, 300, 200, 100, 100);
        image(Co2, 400, 200, 100, 100);
        image(Co3, 500, 200, 100, 100);
        image(Co3, 600, 200, 100, 100);
        image(Co3, 0, 300, 100, 100);
        image(Co4, 100, 300, 100, 100);
        image(Co4, 200, 300, 100, 100);
        image(Co4, 300, 300, 100, 100);
        image(Co5, 400, 300, 100, 100);
        image(Co5, 500, 300, 100, 100);
        image(Co5, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 10) {
        image(Cr1, 0, 200, 100, 100);
        image(Cr2, 100, 200, 100, 100);
        image(Cr2, 200, 200, 100, 100);
        image(Cr3, 300, 200, 100, 100);
        image(Cr4, 400, 200, 100, 100);
        image(Cr5, 500, 200, 100, 100);
        image(Cr5, 600, 200, 100, 100);
        image(Cr6, 0, 300, 100, 100);
        image(Cr7, 100, 300, 100, 100);
        image(Cr7, 200, 300, 100, 100);
        image(Cr7, 300, 300, 100, 100);
        image(Cr7, 400, 300, 100, 100);
        image(Cr6, 500, 300, 100, 100);
        image(Cr7, 600, 300, 100, 100);
        image(Cr7, 0, 400, 100, 100);
        image(Cr7, 100, 400, 100, 100);
        image(Cr7, 200, 400, 100, 100);
        image(Cr6, 300, 400, 100, 100);
        image(Cr7, 400, 400, 100, 100);
        image(Cr7, 500, 400, 100, 100);
        image(Cr7, 600, 400, 100, 100);
        image(Cr7, 0, 500, 100, 100);
        image(Cr6, 100, 500, 100, 100);
        image(Cr7, 200, 500, 100, 100);
        image(Cr7, 300, 500, 100, 100);
        image(Cr7, 400, 500, 100, 100);
        image(Cr7, 500, 500, 100, 100);
        image(Cr6, 600, 500, 100, 100);
      }
      if (cropType == 11) {
        image(E1, 0, 200, 100, 100);
        image(E2, 100, 200, 100, 100);
        image(E3, 200, 200, 100, 100);
        image(E4, 300, 200, 100, 100);
        image(E5, 400, 200, 100, 100);
        image(E6, 500, 200, 100, 100);
        image(E1, 600, 200, 100, 100);
        image(E2, 0, 300, 100, 100);
        image(E3, 100, 300, 100, 100);
        image(E4, 200, 300, 100, 100);
        image(E5, 300, 300, 100, 100);
        image(E6, 400, 300, 100, 100);
        image(E1, 500, 300, 100, 100);
        image(E2, 600, 300, 100, 100);
        image(E3, 0, 400, 100, 100);
        image(E4, 100, 400, 100, 100);
        image(E5, 200, 400, 100, 100);
        image(E6, 300, 400, 100, 100);
        image(E1, 400, 400, 100, 100);
        image(E2, 500, 400, 100, 100);
        image(E3, 600, 400, 100, 100);
        image(E4, 0, 500, 100, 100);
        image(E5, 100, 500, 100, 100);
        image(E6, 200, 500, 100, 100);
        image(E1, 300, 500, 100, 100);
        image(E2, 400, 500, 100, 100);
        image(E3, 500, 500, 100, 100);
        image(E4, 600, 500, 100, 100);
      }
      if (cropType == 12) {
        image(FR1, 0, 200, 100, 100);
        image(FR2, 100, 200, 100, 100);
        image(FR2, 200, 200, 100, 100);
        image(FR2, 300, 200, 100, 100);
        image(FR2, 400, 200, 100, 100);
        image(FR3, 500, 200, 100, 100);
        image(FR3, 600, 200, 100, 100);
        image(FR3, 0, 300, 100, 100);
        image(FR3, 100, 300, 100, 100);
        image(FR4, 200, 300, 100, 100);
        image(FR4, 300, 300, 100, 100);
        image(FR4, 400, 300, 100, 100);
        image(FR5, 500, 300, 100, 100);
        image(FR1, 600, 300, 100, 100);
        image(FR2, 0, 400, 100, 100);
        image(FR2, 100, 400, 100, 100);
        image(FR2, 200, 400, 100, 100);
        image(FR2, 300, 400, 100, 100);
        image(FR3, 400, 400, 100, 100);
        image(FR3, 500, 400, 100, 100);
        image(FR3, 600, 400, 100, 100);
        image(FR3, 0, 500, 100, 100);
        image(FR4, 100, 500, 100, 100);
        image(FR4, 200, 500, 100, 100);
        image(FR4, 300, 500, 100, 100);
        image(FR5, 400, 500, 100, 100);
        image(FR1, 500, 500, 100, 100);
        image(FR2, 600, 500, 100, 100);
      }
      if (cropType == 13) {
        image(Ga1, 0, 200, 100, 100);
        image(Ga2, 100, 200, 100, 100);
        image(Ga3, 200, 200, 100, 100);
        image(Ga4, 300, 200, 100, 100);
        image(Ga5, 400, 200, 100, 100);
        image(Ga1, 500, 200, 100, 100);
        image(Ga2, 600, 200, 100, 100);
        image(Ga3, 0, 300, 100, 100);
        image(Ga4, 100, 300, 100, 100);
        image(Ga5, 200, 300, 100, 100);
        image(Ga1, 300, 300, 100, 100);
        image(Ga2, 400, 300, 100, 100);
        image(Ga3, 500, 300, 100, 100);
        image(Ga4, 600, 300, 100, 100);
        image(Ga5, 0, 400, 100, 100);
        image(Ga1, 100, 400, 100, 100);
        image(Ga2, 200, 400, 100, 100);
        image(Ga3, 300, 400, 100, 100);
        image(Ga4, 400, 400, 100, 100);
        image(Ga5, 500, 400, 100, 100);
        image(Ga1, 600, 400, 100, 100);
        image(Ga2, 0, 500, 100, 100);
        image(Ga3, 100, 500, 100, 100);
        image(Ga4, 200, 500, 100, 100);
        image(Ga5, 300, 500, 100, 100);
        image(Ga1, 400, 500, 100, 100);
        image(Ga2, 500, 500, 100, 100);
        image(Ga3, 600, 500, 100, 100);
      }
      if (cropType == 14) {
        image(GB1, 0, 200, 100, 100);
        image(GB2, 100, 200, 100, 100);
        image(GB3, 200, 200, 100, 100);
        image(GB4, 300, 200, 100, 100);
        image(GB4, 400, 200, 100, 100);
        image(GB4, 500, 200, 100, 100);
        image(GB5, 600, 200, 100, 100);
        image(GB5, 0, 300, 100, 100);
        image(GB5, 100, 300, 100, 100);
        image(GB5, 200, 300, 100, 100);
        image(GB6, 300, 300, 100, 100);
        image(GB7, 400, 300, 100, 100);
        image(GB7, 500, 300, 100, 100);
        image(GB6, 600, 300, 100, 100);
        image(GB7, 0, 400, 100, 100);
        image(GB7, 100, 400, 100, 100);
        image(GB6, 200, 400, 100, 100);
        image(GB7, 300, 400, 100, 100);
        image(GB7, 400, 400, 100, 100);
        image(GB6, 500, 400, 100, 100);
        image(GB7, 600, 400, 100, 100);
        image(GB7, 0, 500, 100, 100);
        image(GB6, 100, 500, 100, 100);
        image(GB7, 200, 500, 100, 100);
        image(GB7, 300, 500, 100, 100);
        image(GB6, 400, 500, 100, 100);
        image(GB7, 500, 500, 100, 100);
        image(GB7, 600, 500, 100, 100);
      }
      if (cropType == 15) {
        image(Gr1, 0, 200, 100, 100);
        image(Gr2, 100, 200, 100, 100);
        image(Gr3, 200, 200, 100, 100);
        image(Gr3, 300, 200, 100, 100);
        image(Gr4, 400, 200, 100, 100);
        image(Gr4, 500, 200, 100, 100);
        image(Gr4, 600, 200, 100, 100);
        image(Gr5, 0, 300, 100, 100);
        image(Gr5, 100, 300, 100, 100);
        image(Gr5, 200, 300, 100, 100);
        image(Gr6, 300, 300, 100, 100);
        image(Gr7, 400, 300, 100, 100);
        image(Gr7, 500, 300, 100, 100);
        image(Gr6, 600, 300, 100, 100);
        image(Gr7, 0, 400, 100, 100);
        image(Gr7, 100, 400, 100, 100);
        image(Gr6, 200, 400, 100, 100);
        image(Gr7, 300, 400, 100, 100);
        image(Gr7, 400, 400, 100, 100);
        image(Gr6, 500, 400, 100, 100);
        image(Gr7, 600, 400, 100, 100);
        image(Gr7, 0, 500, 100, 100);
        image(Gr6, 100, 500, 100, 100);
        image(Gr7, 200, 500, 100, 100);
        image(Gr7, 300, 500, 100, 100);
        image(Gr6, 400, 500, 100, 100);
        image(Gr7, 500, 500, 100, 100);
        image(Gr7, 600, 500, 100, 100);
      }
      if (cropType == 16) {
        image(H1, 0, 200, 100, 100);
        image(H2, 100, 200, 100, 100);
        image(H3, 200, 200, 100, 100);
        image(H3, 300, 200, 100, 100);
        image(H4, 400, 200, 100, 100);
        image(H4, 500, 200, 100, 100);
        image(H4, 600, 200, 100, 100);
        image(H5, 0, 300, 100, 100);
        image(H5, 100, 300, 100, 100);
        image(H5, 200, 300, 100, 100);
        image(H5, 300, 300, 100, 100);
        image(H6, 400, 300, 100, 100);
        image(H6, 500, 300, 100, 100);
        image(H6, 600, 300, 100, 100);
        image(H6, 0, 400, 100, 100);
        image(H6, 100, 400, 100, 100);
        image(H6, 200, 400, 100, 100);
        image(H6, 300, 400, 100, 100);
        image(H6, 400, 400, 100, 100);
        image(H6, 500, 400, 100, 100);
        image(H6, 600, 400, 100, 100);
        image(H6, 0, 500, 100, 100);
        image(H6, 100, 500, 100, 100);
        image(H6, 200, 500, 100, 100);
        image(H6, 300, 500, 100, 100);
        image(H6, 400, 500, 100, 100);
        image(H6, 500, 500, 100, 100);
        image(H6, 600, 500, 100, 100);
      }
      if (cropType == 17) {
        image(HP1, 0, 200, 100, 100);
        image(HP2, 100, 200, 100, 100);
        image(HP3, 200, 200, 100, 100);
        image(HP4, 300, 200, 100, 100);
        image(HP5, 400, 200, 100, 100);
        image(HP6, 500, 200, 100, 100);
        image(HP7, 600, 200, 100, 100);
        image(HP7, 0, 300, 100, 100);
        image(HP6, 100, 300, 100, 100);
        image(HP7, 200, 300, 100, 100);
        image(HP7, 300, 300, 100, 100);
        image(HP6, 400, 300, 100, 100);
        image(HP7, 500, 300, 100, 100);
        image(HP7, 600, 300, 100, 100);
        image(HP6, 0, 400, 100, 100);
        image(HP7, 100, 400, 100, 100);
        image(HP7, 200, 400, 100, 100);
        image(HP6, 300, 400, 100, 100);
        image(HP7, 400, 400, 100, 100);
        image(HP7, 500, 400, 100, 100);
        image(HP6, 600, 400, 100, 100);
        image(HP7, 0, 500, 100, 100);
        image(HP7, 100, 500, 100, 100);
        image(HP6, 200, 500, 100, 100);
        image(HP7, 300, 500, 100, 100);
        image(HP7, 400, 500, 100, 100);
        image(HP6, 500, 500, 100, 100);
        image(HP7, 600, 500, 100, 100);
      }
      if (cropType == 18) {
        image(K1, 0, 200, 100, 100);
        image(K2, 100, 200, 100, 100);
        image(K2, 200, 200, 100, 100);
        image(K3, 300, 200, 100, 100);
        image(K3, 400, 200, 100, 100);
        image(K4, 500, 200, 100, 100);
        image(K5, 600, 200, 100, 100);
        image(K1, 0, 300, 100, 100);
        image(K2, 100, 300, 100, 100);
        image(K2, 200, 300, 100, 100);
        image(K3, 300, 300, 100, 100);
        image(K3, 400, 300, 100, 100);
        image(K4, 500, 300, 100, 100);
        image(K5, 600, 300, 100, 100);
        image(K1, 0, 400, 100, 100);
        image(K2, 100, 400, 100, 100);
        image(K2, 200, 400, 100, 100);
        image(K3, 300, 400, 100, 100);
        image(K3, 400, 400, 100, 100);
        image(K4, 500, 400, 100, 100);
        image(K5, 600, 400, 100, 100);
        image(K1, 0, 500, 100, 100);
        image(K2, 100, 500, 100, 100);
        image(K2, 200, 500, 100, 100);
        image(K3, 300, 500, 100, 100);
        image(K3, 400, 500, 100, 100);
        image(K4, 500, 500, 100, 100);
        image(K5, 600, 500, 100, 100);
      }
      if (cropType == 19) {
        image(M1, 0, 200, 100, 100);
        image(M2, 100, 200, 100, 100);
        image(M2, 200, 200, 100, 100);
        image(M3, 300, 200, 100, 100);
        image(M3, 400, 200, 100, 100);
        image(M3, 500, 200, 100, 100);
        image(M4, 600, 200, 100, 100);
        image(M4, 0, 300, 100, 100);
        image(M4, 100, 300, 100, 100);
        image(M5, 200, 300, 100, 100);
        image(M5, 300, 300, 100, 100);
        image(M5, 400, 300, 100, 100);
        image(M6, 500, 300, 100, 100);
        image(M1, 600, 300, 100, 100);
        image(M2, 0, 400, 100, 100);
        image(M2, 100, 400, 100, 100);
        image(M3, 200, 400, 100, 100);
        image(M3, 300, 400, 100, 100);
        image(M3, 400, 400, 100, 100);
        image(M4, 500, 400, 100, 100);
        image(M4, 600, 400, 100, 100);
        image(M4, 0, 500, 100, 100);
        image(M5, 100, 500, 100, 100);
        image(M5, 200, 500, 100, 100);
        image(M5, 300, 500, 100, 100);
        image(M6, 400, 500, 100, 100);
        image(M1, 500, 500, 100, 100);
        image(M2, 600, 500, 100, 100);
      }
      if (cropType == 20) {
        image(Par1, 0, 200, 100, 100);
        image(Par2, 100, 200, 100, 100);
        image(Par3, 200, 200, 100, 100);
        image(Par4, 300, 200, 100, 100);
        image(Par5, 400, 200, 100, 100);
        image(Par1, 500, 200, 100, 100);
        image(Par2, 600, 200, 100, 100);
        image(Par3, 0, 300, 100, 100);
        image(Par4, 100, 300, 100, 100);
        image(Par5, 200, 300, 100, 100);
        image(Par1, 300, 300, 100, 100);
        image(Par2, 400, 300, 100, 100);
        image(Par3, 500, 300, 100, 100);
        image(Par4, 600, 300, 100, 100);
        image(Par5, 0, 400, 100, 100);
        image(Par1, 100, 400, 100, 100);
        image(Par2, 200, 400, 100, 100);
        image(Par3, 300, 400, 100, 100);
        image(Par4, 400, 400, 100, 100);
        image(Par5, 500, 400, 100, 100);
        image(Par1, 600, 400, 100, 100);
        image(Par2, 0, 500, 100, 100);
        image(Par3, 100, 500, 100, 100);
        image(Par4, 200, 500, 100, 100);
        image(Par5, 300, 500, 100, 100);
        image(Par1, 400, 500, 100, 100);
        image(Par2, 500, 500, 100, 100);
        image(Par3, 600, 500, 100, 100);
      }
      if (cropType == 21) {
        image(Pop1, 0, 200, 100, 100);
        image(Pop2, 100, 200, 100, 100);
        image(Pop2, 200, 200, 100, 100);
        image(Pop3, 300, 200, 100, 100);
        image(Pop3, 400, 200, 100, 100);
        image(Pop4, 500, 200, 100, 100);
        image(Pop4, 600, 200, 100, 100);
        image(Pop5, 0, 300, 100, 100);
        image(Pop1, 100, 300, 100, 100);
        image(Pop2, 200, 300, 100, 100);
        image(Pop2, 300, 300, 100, 100);
        image(Pop3, 400, 300, 100, 100);
        image(Pop3, 500, 300, 100, 100);
        image(Pop4, 600, 300, 100, 100);
        image(Pop4, 0, 400, 100, 100);
        image(Pop5, 100, 400, 100, 100);
        image(Pop1, 200, 400, 100, 100);
        image(Pop2, 300, 400, 100, 100);
        image(Pop2, 400, 400, 100, 100);
        image(Pop3, 500, 400, 100, 100);
        image(Pop3, 600, 400, 100, 100);
        image(Pop4, 0, 500, 100, 100);
        image(Pop4, 100, 500, 100, 100);
        image(Pop5, 200, 500, 100, 100);
        image(Pop1, 300, 500, 100, 100);
        image(Pop2, 400, 500, 100, 100);
        image(Pop2, 500, 500, 100, 100);
        image(Pop3, 600, 500, 100, 100);
      }
      if (cropType == 22) {
        image(Pot1, 0, 200, 100, 100);
        image(Pot2, 100, 200, 100, 100);
        image(Pot3, 200, 200, 100, 100);
        image(Pot4, 300, 200, 100, 100);
        image(Pot4, 400, 200, 100, 100);
        image(Pot5, 500, 200, 100, 100);
        image(Pot6, 600, 200, 100, 100);
        image(Pot1, 0, 300, 100, 100);
        image(Pot2, 100, 300, 100, 100);
        image(Pot3, 200, 300, 100, 100);
        image(Pot4, 300, 300, 100, 100);
        image(Pot4, 400, 300, 100, 100);
        image(Pot5, 500, 300, 100, 100);
        image(Pot6, 600, 300, 100, 100);
        image(Pot1, 0, 400, 100, 100);
        image(Pot2, 100, 400, 100, 100);
        image(Pot3, 200, 400, 100, 100);
        image(Pot4, 300, 400, 100, 100);
        image(Pot4, 400, 400, 100, 100);
        image(Pot5, 500, 400, 100, 100);
        image(Pot6, 600, 400, 100, 100);
        image(Pot1, 0, 500, 100, 100);
        image(Pot2, 100, 500, 100, 100);
        image(Pot3, 200, 500, 100, 100);
        image(Pot4, 300, 500, 100, 100);
        image(Pot4, 400, 500, 100, 100);
        image(Pot5, 500, 500, 100, 100);
        image(Pot6, 600, 500, 100, 100);
      }
      if (cropType == 23) {
        image(Pum1, 0, 200, 100, 100);
        image(Pum2, 100, 200, 100, 100);
        image(Pum2, 200, 200, 100, 100);
        image(Pum3, 300, 200, 100, 100);
        image(Pum3, 400, 200, 100, 100);
        image(Pum3, 500, 200, 100, 100);
        image(Pum4, 600, 200, 100, 100);
        image(Pum4, 0, 300, 100, 100);
        image(Pum4, 100, 300, 100, 100);
        image(Pum4, 200, 300, 100, 100);
        image(Pum5, 300, 300, 100, 100);
        image(Pum5, 400, 300, 100, 100);
        image(Pum5, 500, 300, 100, 100);
        image(Pum6, 600, 300, 100, 100);
        image(Pum1, 0, 400, 100, 100);
        image(Pum2, 100, 400, 100, 100);
        image(Pum2, 200, 400, 100, 100);
        image(Pum3, 300, 400, 100, 100);
        image(Pum3, 400, 400, 100, 100);
        image(Pum3, 500, 400, 100, 100);
        image(Pum4, 600, 400, 100, 100);
        image(Pum4, 0, 500, 100, 100);
        image(Pum4, 100, 500, 100, 100);
        image(Pum4, 200, 500, 100, 100);
        image(Pum5, 300, 500, 100, 100);
        image(Pum5, 400, 500, 100, 100);
        image(Pum5, 500, 500, 100, 100);
        image(Pum6, 600, 500, 100, 100);
      }
      if (cropType == 24) {
        image(Ra1, 0, 200, 100, 100);
        image(Ra1, 100, 200, 100, 100);
        image(Ra2, 200, 200, 100, 100);
        image(Ra3, 300, 200, 100, 100);
        image(Ra3, 400, 200, 100, 100);
        image(Ra4, 500, 200, 100, 100);
        image(Ra5, 600, 200, 100, 100);
        image(Ra1, 0, 300, 100, 100);
        image(Ra1, 100, 300, 100, 100);
        image(Ra2, 200, 300, 100, 100);
        image(Ra3, 300, 300, 100, 100);
        image(Ra3, 400, 300, 100, 100);
        image(Ra4, 500, 300, 100, 100);
        image(Ra5, 600, 300, 100, 100);
        image(Ra1, 0, 400, 100, 100);
        image(Ra1, 100, 400, 100, 100);
        image(Ra2, 200, 400, 100, 100);
        image(Ra3, 300, 400, 100, 100);
        image(Ra3, 400, 400, 100, 100);
        image(Ra4, 500, 400, 100, 100);
        image(Ra5, 600, 400, 100, 100);
        image(Ra1, 0, 500, 100, 100);
        image(Ra1, 100, 500, 100, 100);
        image(Ra2, 200, 500, 100, 100);
        image(Ra3, 300, 500, 100, 100);
        image(Ra3, 400, 500, 100, 100);
        image(Ra4, 500, 500, 100, 100);
        image(Ra5, 600, 500, 100, 100);
      }
      if (cropType == 25) {
        image(RC1, 0, 200, 100, 100);
        image(RC1, 100, 200, 100, 100);
        image(RC2, 200, 200, 100, 100);
        image(RC3, 300, 200, 100, 100);
        image(RC3, 400, 200, 100, 100);
        image(RC4, 500, 200, 100, 100);
        image(RC4, 600, 200, 100, 100);
        image(RC5, 0, 300, 100, 100);
        image(RC5, 100, 300, 100, 100);
        image(RC6, 200, 300, 100, 100);
        image(RC1, 300, 300, 100, 100);
        image(RC1, 400, 300, 100, 100);
        image(RC2, 500, 300, 100, 100);
        image(RC3, 600, 300, 100, 100);
        image(RC3, 0, 400, 100, 100);
        image(RC4, 100, 400, 100, 100);
        image(RC4, 200, 400, 100, 100);
        image(RC5, 300, 400, 100, 100);
        image(RC5, 400, 400, 100, 100);
        image(RC6, 500, 400, 100, 100);
        image(RC1, 600, 400, 100, 100);
        image(RC1, 0, 500, 100, 100);
        image(RC2, 100, 500, 100, 100);
        image(RC3, 200, 500, 100, 100);
        image(RC3, 300, 500, 100, 100);
        image(RC4, 400, 500, 100, 100);
        image(RC4, 500, 500, 100, 100);
        image(RC5, 600, 500, 100, 100);
      }
      if (cropType == 26) {
        image(Rh1, 0, 200, 100, 100);
        image(Rh1, 100, 200, 100, 100);
        image(Rh2, 200, 200, 100, 100);
        image(Rh2, 300, 200, 100, 100);
        image(Rh3, 400, 200, 100, 100);
        image(Rh3, 500, 200, 100, 100);
        image(Rh4, 600, 200, 100, 100);
        image(Rh4, 0, 300, 100, 100);
        image(Rh4, 100, 300, 100, 100);
        image(Rh5, 200, 300, 100, 100);
        image(Rh5, 300, 300, 100, 100);
        image(Rh5, 400, 300, 100, 100);
        image(Rh5, 500, 300, 100, 100);
        image(Rh6, 600, 300, 100, 100);
        image(Rh1, 0, 400, 100, 100);
        image(Rh1, 100, 400, 100, 100);
        image(Rh2, 200, 400, 100, 100);
        image(Rh2, 300, 400, 100, 100);
        image(Rh3, 400, 400, 100, 100);
        image(Rh3, 500, 400, 100, 100);
        image(Rh4, 600, 400, 100, 100);
        image(Rh4, 0, 500, 100, 100);
        image(Rh4, 100, 500, 100, 100);
        image(Rh5, 200, 500, 100, 100);
        image(Rh5, 300, 500, 100, 100);
        image(Rh5, 400, 500, 100, 100);
        image(Rh5, 500, 500, 100, 100);
        image(Rh6, 600, 500, 100, 100);
      }
      if (cropType == 27) {
        image(Sta1, 0, 200, 100, 100);
        image(Sta1, 100, 200, 100, 100);
        image(Sta2, 200, 200, 100, 100);
        image(Sta2, 300, 200, 100, 100);
        image(Sta2, 400, 200, 100, 100);
        image(Sta3, 500, 200, 100, 100);
        image(Sta3, 600, 200, 100, 100);
        image(Sta4, 0, 300, 100, 100);
        image(Sta4, 100, 300, 100, 100);
        image(Sta4, 200, 300, 100, 100);
        image(Sta5, 300, 300, 100, 100);
        image(Sta5, 400, 300, 100, 100);
        image(Sta5, 500, 300, 100, 100);
        image(Sta6, 600, 300, 100, 100);
        image(Sta1, 0, 400, 100, 100);
        image(Sta1, 100, 400, 100, 100);
        image(Sta2, 200, 400, 100, 100);
        image(Sta2, 300, 400, 100, 100);
        image(Sta2, 400, 400, 100, 100);
        image(Sta3, 500, 400, 100, 100);
        image(Sta3, 600, 400, 100, 100);
        image(Sta4, 0, 500, 100, 100);
        image(Sta4, 100, 500, 100, 100);
        image(Sta4, 200, 500, 100, 100);
        image(Sta5, 300, 500, 100, 100);
        image(Sta5, 400, 500, 100, 100);
        image(Sta5, 500, 500, 100, 100);
        image(Sta6, 600, 500, 100, 100);
      }
      if (cropType == 28) {
        image(Str1, 0, 200, 100, 100);
        image(Str2, 100, 200, 100, 100);
        image(Str3, 200, 200, 100, 100);
        image(Str3, 300, 200, 100, 100);
        image(Str4, 400, 200, 100, 100);
        image(Str4, 500, 200, 100, 100);
        image(Str5, 600, 200, 100, 100);
        image(Str5, 0, 300, 100, 100);
        image(Str6, 100, 300, 100, 100);
        image(Str7, 200, 300, 100, 100);
        image(Str7, 300, 300, 100, 100);
        image(Str7, 400, 300, 100, 100);
        image(Str6, 500, 300, 100, 100);
        image(Str7, 600, 300, 100, 100);
        image(Str7, 0, 400, 100, 100);
        image(Str7, 100, 400, 100, 100);
        image(Str6, 200, 400, 100, 100);
        image(Str7, 300, 400, 100, 100);
        image(Str7, 400, 400, 100, 100);
        image(Str7, 500, 400, 100, 100);
        image(Str6, 600, 400, 100, 100);
        image(Str7, 0, 500, 100, 100);
        image(Str7, 100, 500, 100, 100);
        image(Str7, 200, 500, 100, 100);
        image(Str6, 300, 500, 100, 100);
        image(Str7, 400, 500, 100, 100);
        image(Str7, 500, 500, 100, 100);
        image(Str7, 600, 500, 100, 100);
      }
      if (cropType == 29) {
        image(SS1, 0, 200, 100, 100);
        image(SS2, 100, 200, 100, 100);
        image(SS2, 200, 200, 100, 100);
        image(SS3, 300, 200, 100, 100);
        image(SS3, 400, 200, 100, 100);
        image(SS3, 500, 200, 100, 100);
        image(SS4, 600, 200, 100, 100);
        image(SS4, 0, 300, 100, 100);
        image(SS5, 100, 300, 100, 100);
        image(SS1, 200, 300, 100, 100);
        image(SS2, 300, 300, 100, 100);
        image(SS2, 400, 300, 100, 100);
        image(SS3, 500, 300, 100, 100);
        image(SS3, 600, 300, 100, 100);
        image(SS3, 0, 400, 100, 100);
        image(SS4, 100, 400, 100, 100);
        image(SS4, 200, 400, 100, 100);
        image(SS5, 300, 400, 100, 100);
        image(SS1, 400, 400, 100, 100);
        image(SS2, 500, 400, 100, 100);
        image(SS2, 600, 400, 100, 100);
        image(SS3, 0, 500, 100, 100);
        image(SS3, 100, 500, 100, 100);
        image(SS3, 200, 500, 100, 100);
        image(SS4, 300, 500, 100, 100);
        image(SS4, 400, 500, 100, 100);
        image(SS5, 500, 500, 100, 100);
        image(SS1, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su1, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su2, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su3, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su4, 0, 300, 100, 100);
        image(Su5, 100, 300, 100, 100);
        image(Su1, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su2, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su3, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su4, 200, 400, 100, 100);
        image(Su5, 300, 400, 100, 100);
        image(Su1, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su2, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su3, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su4, 400, 500, 100, 100);
        image(Su5, 500, 500, 100, 100);
        image(Su1, 600, 500, 100, 100);
      }
      if (cropType == 31) {
        image(To1, 0, 200, 100, 100);
        image(To1, 100, 200, 100, 100);
        image(To2, 200, 200, 100, 100);
        image(To2, 300, 200, 100, 100);
        image(To3, 400, 200, 100, 100);
        image(To3, 500, 200, 100, 100);
        image(To4, 600, 200, 100, 100);
        image(To4, 0, 300, 100, 100);
        image(To5, 100, 300, 100, 100);
        image(To5, 200, 300, 100, 100);
        image(To5, 300, 300, 100, 100);
        image(To6, 400, 300, 100, 100);
        image(To7, 500, 300, 100, 100);
        image(To7, 600, 300, 100, 100);
        image(To7, 0, 400, 100, 100);
        image(To6, 100, 400, 100, 100);
        image(To7, 200, 400, 100, 100);
        image(To7, 300, 400, 100, 100);
        image(To7, 400, 400, 100, 100);
        image(To6, 500, 400, 100, 100);
        image(To7, 600, 400, 100, 100);
        image(To7, 0, 500, 100, 100);
        image(To7, 100, 500, 100, 100);
        image(To6, 200, 500, 100, 100);
        image(To7, 300, 500, 100, 100);
        image(To7, 400, 500, 100, 100);
        image(To7, 500, 500, 100, 100);
        image(To6, 600, 500, 100, 100);
      }
      if (cropType == 32) {
        image(Tu1, 0, 200, 100, 100);
        image(Tu2, 100, 200, 100, 100);
        image(Tu3, 200, 200, 100, 100);
        image(Tu3, 300, 200, 100, 100);
        image(Tu4, 400, 200, 100, 100);
        image(Tu4, 500, 200, 100, 100);
        image(Tu5, 600, 200, 100, 100);
        image(Tu1, 0, 300, 100, 100);
        image(Tu2, 100, 300, 100, 100);
        image(Tu3, 200, 300, 100, 100);
        image(Tu3, 300, 300, 100, 100);
        image(Tu4, 400, 300, 100, 100);
        image(Tu4, 500, 300, 100, 100);
        image(Tu5, 600, 300, 100, 100);
        image(Tu1, 0, 400, 100, 100);
        image(Tu2, 100, 400, 100, 100);
        image(Tu3, 200, 400, 100, 100);
        image(Tu3, 300, 400, 100, 100);
        image(Tu4, 400, 400, 100, 100);
        image(Tu4, 500, 400, 100, 100);
        image(Tu5, 600, 400, 100, 100);
        image(Tu1, 0, 500, 100, 100);
        image(Tu2, 100, 500, 100, 100);
        image(Tu3, 200, 500, 100, 100);
        image(Tu3, 300, 500, 100, 100);
        image(Tu4, 400, 500, 100, 100);
        image(Tu4, 500, 500, 100, 100);
        image(Tu5, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR2, 200, 200, 100, 100);
        image(UmR3, 300, 200, 100, 100);
        image(UmR3, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR4, 600, 200, 100, 100);
        image(UmR4, 0, 300, 100, 100);
        image(UmR5, 100, 300, 100, 100);
        image(UmR1, 200, 300, 100, 100);
        image(UmR2, 300, 300, 100, 100);
        image(UmR2, 400, 300, 100, 100);
        image(UmR3, 500, 300, 100, 100);
        image(UmR3, 600, 300, 100, 100);
        image(UmR4, 0, 400, 100, 100);
        image(UmR4, 100, 400, 100, 100);
        image(UmR4, 200, 400, 100, 100);
        image(UmR5, 300, 400, 100, 100);
        image(UmR1, 400, 400, 100, 100);
        image(UmR2, 500, 400, 100, 100);
        image(UmR2, 600, 400, 100, 100);
        image(UmR3, 0, 500, 100, 100);
        image(UmR3, 100, 500, 100, 100);
        image(UmR4, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR5, 500, 500, 100, 100);
        image(UmR1, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W1, 0, 200, 100, 100);
        image(W2, 100, 200, 100, 100);
        image(W3, 200, 200, 100, 100);
        image(W4, 300, 200, 100, 100);
        image(W5, 400, 200, 100, 100);
        image(W1, 500, 200, 100, 100);
        image(W2, 600, 200, 100, 100);
        image(W3, 0, 300, 100, 100);
        image(W4, 100, 300, 100, 100);
        image(W5, 200, 300, 100, 100);
        image(W1, 300, 300, 100, 100);
        image(W2, 400, 300, 100, 100);
        image(W3, 500, 300, 100, 100);
        image(W4, 600, 300, 100, 100);
        image(W5, 0, 400, 100, 100);
        image(W1, 100, 400, 100, 100);
        image(W2, 200, 400, 100, 100);
        image(W3, 300, 400, 100, 100);
        image(W4, 400, 400, 100, 100);
        image(W5, 500, 400, 100, 100);
        image(W1, 600, 400, 100, 100);
        image(W2, 0, 500, 100, 100);
        image(W3, 100, 500, 100, 100);
        image(W4, 200, 500, 100, 100);
        image(W5, 300, 500, 100, 100);
        image(W1, 400, 500, 100, 100);
        image(W2, 500, 500, 100, 100);
        image(W3, 600, 500, 100, 100);
      }
      if (cropType == 35) {
        image(Y1, 0, 200, 100, 100);
        image(Y2, 100, 200, 100, 100);
        image(Y2, 200, 200, 100, 100);
        image(Y2, 300, 200, 100, 100);
        image(Y3, 400, 200, 100, 100);
        image(Y3, 500, 200, 100, 100);
        image(Y3, 600, 200, 100, 100);
        image(Y4, 0, 300, 100, 100);
        image(Y4, 100, 300, 100, 100);
        image(Y4, 200, 300, 100, 100);
        image(Y5, 300, 300, 100, 100);
        image(Y1, 400, 300, 100, 100);
        image(Y2, 500, 300, 100, 100);
        image(Y2, 600, 300, 100, 100);
        image(Y2, 0, 400, 100, 100);
        image(Y3, 100, 400, 100, 100);
        image(Y3, 200, 400, 100, 100);
        image(Y3, 300, 400, 100, 100);
        image(Y4, 400, 400, 100, 100);
        image(Y4, 500, 400, 100, 100);
        image(Y4, 600, 400, 100, 100);
        image(Y5, 0, 500, 100, 100);
        image(Y1, 100, 500, 100, 100);
        image(Y2, 200, 500, 100, 100);
        image(Y2, 300, 500, 100, 100);
        image(Y2, 400, 500, 100, 100);
        image(Y3, 500, 500, 100, 100);
        image(Y3, 600, 500, 100, 100);
      }
    }
    if (cropCalendarNADSGtype2) {
      if (cropType == 8) {
        image(CB6, 0, 200, 100, 100);
        image(CB7, 100, 200, 100, 100);
        image(CB6, 200, 200, 100, 100);
        image(CB7, 300, 200, 100, 100);
        image(CB6, 400, 200, 100, 100);
        image(CB7, 500, 200, 100, 100);
        image(CB6, 600, 200, 100, 100);
        image(CB7, 0, 300, 100, 100);
        image(CB6, 100, 300, 100, 100);
        image(CB7, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co7, 0, 200, 100, 100);
        image(Co7, 100, 200, 100, 100);
        image(Co6, 200, 200, 100, 100);
        image(Co7, 300, 200, 100, 100);
        image(Co7, 400, 200, 100, 100);
        image(Co7, 500, 200, 100, 100);
        image(Co6, 600, 200, 100, 100);
        image(Co7, 0, 300, 100, 100);
        image(Co7, 100, 300, 100, 100);
        image(Co7, 200, 300, 100, 100);
        image(Co6, 300, 300, 100, 100);
        image(Co7, 400, 300, 100, 100);
        image(Co7, 500, 300, 100, 100);
        image(Co7, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su2, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su3, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su4, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su5, 0, 300, 100, 100);
        image(Su1, 100, 300, 100, 100);
        image(Su2, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su3, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su4, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su5, 200, 400, 100, 100);
        image(Su1, 300, 400, 100, 100);
        image(Su2, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su3, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su4, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su5, 400, 500, 100, 100);
        image(Su1, 500, 500, 100, 100);
        image(Su2, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR3, 200, 200, 100, 100);
        image(UmR4, 300, 200, 100, 100);
        image(UmR4, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR5, 600, 200, 100, 100);
        image(UmR1, 0, 300, 100, 100);
        image(UmR2, 100, 300, 100, 100);
        image(UmR3, 200, 300, 100, 100);
        image(UmR4, 300, 300, 100, 100);
        image(UmR4, 400, 300, 100, 100);
        image(UmR4, 500, 300, 100, 100);
        image(UmR5, 600, 300, 100, 100);
        image(UmR1, 0, 400, 100, 100);
        image(UmR2, 100, 400, 100, 100);
        image(UmR3, 200, 400, 100, 100);
        image(UmR4, 300, 400, 100, 100);
        image(UmR4, 400, 400, 100, 100);
        image(UmR4, 500, 400, 100, 100);
        image(UmR5, 600, 400, 100, 100);
        image(UmR1, 0, 500, 100, 100);
        image(UmR2, 100, 500, 100, 100);
        image(UmR3, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR4, 500, 500, 100, 100);
        image(UmR5, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W4, 0, 200, 100, 100);
        image(W5, 100, 200, 100, 100);
        image(W1, 200, 200, 100, 100);
        image(W2, 300, 200, 100, 100);
        image(W3, 400, 200, 100, 100);
        image(W4, 500, 200, 100, 100);
        image(W5, 600, 200, 100, 100);
        image(W1, 0, 300, 100, 100);
        image(W2, 100, 300, 100, 100);
        image(W3, 200, 300, 100, 100);
        image(W4, 300, 300, 100, 100);
        image(W5, 400, 300, 100, 100);
        image(W1, 500, 300, 100, 100);
        image(W2, 600, 300, 100, 100);
        image(W3, 0, 400, 100, 100);
        image(W4, 100, 400, 100, 100);
        image(W5, 200, 400, 100, 100);
        image(W1, 300, 400, 100, 100);
        image(W1, 400, 400, 100, 100);
        image(W2, 500, 400, 100, 100);
        image(W3, 600, 400, 100, 100);
        image(W4, 0, 500, 100, 100);
        image(W5, 100, 500, 100, 100);
        image(W1, 200, 500, 100, 100);
        image(W2, 300, 500, 100, 100);
        image(W3, 400, 500, 100, 100);
        image(W4, 500, 500, 100, 100);
        image(W5, 600, 500, 100, 100);
      }
    }
    if (cropType == 8 || cropType == 9 || cropType == 30 || cropType == 33 || cropType == 34) {
      if (keyPressed) {
        if (key == CODED) {
          if (keyCode == SHIFT) {
            cropCalendarNADSGtype2 = true;
            cropCalendarNADSGtype1 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
          if (keyCode == CONTROL) {
            cropCalendarNADSGtype1 = true;
            cropCalendarNADSGtype2 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
        }
      }
    }
    if (keyPressed) {
      if (key == 'V' || key == 'v') {
        cropSelect = true;
        cropCalendarNADSG = false;
        fill(0);
        rect(0, 0, 700, 600);
      }
      if (key == 'C' || key == 'c') {
        cropCalendarNADSG = false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalculator = true;
        }
        if (key == '2') {
          cropCalendarNADSG = false;
          fill(0);
          rect(0, 0, 700, 600);
          cropCalendarD = true;
      }
    }
  }
}*/
/*void CalendarmodeD() {
  if (cropCalendarD == true) {
//first done
    //build
    stroke(255);
    for (int i = 100; i < 600; i += 100) {
      line(0, i, 700, i);
    }
    for (int i = 100; i < 700; i += 100) {
      line(i, 100, i, 600);
    }
    //text
    fill(255);
    textSize(32);
    text("Mon", 20, 200);
    text("Tue", 120, 200);
    text("Wed", 220, 200);
    text("Thu", 320, 200);
    text("Fri", 420, 200);
    text("Sat", 520, 200);
    text("Sun", 620, 200);
    if (cropCalendarDtype1) {
      if (cropType == 1) {
        image(Am1, 0, 200, 100, 100);
        image(Am2, 100, 200, 100, 100);
        image(Am2, 200, 200, 100, 100);
        image(Am3, 300, 200, 100, 100);
        image(Am3, 400, 200, 100, 100);
        image(Am4, 500, 200, 100, 100);
        image(Am4, 600, 200, 100, 100);
        image(Am5, 0, 300, 100, 100);
        image(Am2, 100, 300, 100, 100);
        image(Am2, 200, 300, 100, 100);
        image(Am3, 300, 300, 100, 100);
        image(Am3, 400, 300, 100, 100);
        image(Am4, 500, 300, 100, 100);
        image(Am4, 600, 300, 100, 100);
        image(Am5, 0, 400, 100, 100);
        image(Am2, 100, 400, 100, 100);
        image(Am2, 200, 400, 100, 100);
        image(Am3, 300, 400, 100, 100);
        image(Am3, 400, 400, 100, 100);
        image(Am4, 500, 400, 100, 100);
        image(Am4, 600, 400, 100, 100);
        image(Am5, 0, 500, 100, 100);
        image(Am2, 100, 500, 100, 100);
        image(Am2, 200, 500, 100, 100);
        image(Am3, 300, 500, 100, 100);
        image(Am3, 400, 500, 100, 100);
        image(Am4, 500, 500, 100, 100);
        image(Am4, 600, 500, 100, 100);
      }
      if (cropType == 2) {
        image(Ar1, 0, 200, 100, 100);
        image(Ar1, 100, 200, 100, 100);
        image(Ar2, 200, 200, 100, 100);
        image(Ar2, 300, 200, 100, 100);
        image(Ar3, 400, 200, 100, 100);
        image(Ar4, 500, 200, 100, 100);
        image(Ar4, 600, 200, 100, 100);
        image(Ar5, 0, 300, 100, 100);
        image(Ar6, 100, 300, 100, 100);
        image(Ar1, 200, 300, 100, 100);
        image(Ar2, 300, 300, 100, 100);
        image(Ar2, 400, 300, 100, 100);
        image(Ar3, 500, 300, 100, 100);
        image(Ar4, 600, 300, 100, 100);
        image(Ar4, 0, 400, 100, 100);
        image(Ar5, 100, 400, 100, 100);
        image(Ar6, 200, 400, 100, 100);
        image(Ar1, 300, 400, 100, 100);
        image(Ar2, 400, 400, 100, 100);
        image(Ar2, 500, 400, 100, 100);
        image(Ar3, 600, 400, 100, 100);
        image(Ar4, 0, 500, 100, 100);
        image(Ar4, 100, 500, 100, 100);
        image(Ar4, 200, 500, 100, 100);
        image(Ar5, 300, 500, 100, 100);
        image(Ar6, 400, 500, 100, 100);
        image(Ar1, 500, 500, 100, 100);
        image(Ar2, 600, 500, 100, 100);
      }
      if (cropType == 3) {
        image(Be1, 0, 200, 100, 100);
        image(Be2, 100, 200, 100, 100);
        image(Be3, 200, 200, 100, 100);
        image(Be3, 300, 200, 100, 100);
        image(Be4, 400, 200, 100, 100);
        image(Be4, 500, 200, 100, 100);
        image(Be5, 600, 200, 100, 100);
        image(Be2, 0, 300, 100, 100);
        image(Be3, 100, 300, 100, 100);
        image(Be3, 200, 300, 100, 100);
        image(Be4, 300, 300, 100, 100);
        image(Be4, 400, 300, 100, 100);
        image(Be5, 500, 300, 100, 100);
        image(Be2, 600, 300, 100, 100);
        image(Be3, 0, 400, 100, 100);
        image(Be3, 100, 400, 100, 100);
        image(Be4, 200, 400, 100, 100);
        image(Be4, 300, 400, 100, 100);
        image(Be5, 400, 400, 100, 100);
        image(Be2, 500, 400, 100, 100);
        image(Be3, 600, 400, 100, 100);
        image(Be3, 0, 500, 100, 100);
        image(Be4, 100, 500, 100, 100);
        image(Be4, 200, 500, 100, 100);
        image(Be5, 300, 500, 100, 100);
        image(Be2, 400, 500, 100, 100);
        image(Be3, 500, 500, 100, 100);
        image(Be3, 600, 500, 100, 100);
      }
      if (cropType == 4) {
        image(Bl1, 0, 200, 100, 100);
        image(Bl2, 100, 200, 100, 100);
        image(Bl2, 200, 200, 100, 100);
        image(Bl2, 300, 200, 100, 100);
        image(Bl3, 400, 200, 100, 100);
        image(Bl3, 500, 200, 100, 100);
        image(Bl3, 600, 200, 100, 100);
        image(Bl4, 0, 300, 100, 100);
        image(Bl4, 100, 300, 100, 100);
        image(Bl4, 200, 300, 100, 100);
        image(Bl4, 300, 300, 100, 100);
        image(Bl5, 400, 300, 100, 100);
        image(Bl5, 500, 300, 100, 100);
        image(Bl6, 600, 300, 100, 100);
        image(Bl7, 0, 400, 100, 100);
        image(Bl7, 100, 400, 100, 100);
        image(Bl7, 200, 400, 100, 100);
        image(Bl6, 300, 400, 100, 100);
        image(Bl7, 400, 400, 100, 100);
        image(Bl7, 500, 400, 100, 100);
        image(Bl7, 600, 400, 100, 100);
        image(Bl6, 0, 500, 100, 100);
        image(Bl7, 100, 500, 100, 100);
        image(Bl7, 200, 500, 100, 100);
        image(Bl7, 300, 500, 100, 100);
        image(Bl6, 400, 500, 100, 100);
        image(Bl7, 500, 500, 100, 100);
        image(Bl7, 600, 500, 100, 100);
      }
      if (cropType == 5) {
        image(BJ1, 0, 200, 100, 100);
        image(BJ2, 100, 200, 100, 100);
        image(BJ2, 200, 200, 100, 100);
        image(BJ3, 300, 200, 100, 100);
        image(BJ3, 400, 200, 100, 100);
        image(BJ4, 500, 200, 100, 100);
        image(BJ4, 600, 200, 100, 100);
        image(BJ5, 0, 300, 100, 100);
        image(BJ2, 100, 300, 100, 100);
        image(BJ2, 200, 300, 100, 100);
        image(BJ3, 300, 300, 100, 100);
        image(BJ3, 400, 300, 100, 100);
        image(BJ4, 500, 300, 100, 100);
        image(BJ4, 600, 300, 100, 100);
        image(BJ5, 0, 400, 100, 100);
        image(BJ2, 100, 400, 100, 100);
        image(BJ2, 200, 400, 100, 100);
        image(BJ3, 300, 400, 100, 100);
        image(BJ3, 400, 400, 100, 100);
        image(BJ4, 500, 400, 100, 100);
        image(BJ4, 600, 400, 100, 100);
        image(BJ5, 0, 500, 100, 100);
        image(BJ2, 100, 500, 100, 100);
        image(BJ2, 200, 500, 100, 100);
        image(BJ3, 300, 500, 100, 100);
        image(BJ3, 400, 500, 100, 100);
        image(BJ4, 500, 500, 100, 100);
        image(BJ4, 600, 500, 100, 100);
      }
      if (cropType == 6) {
        image(BC1, 0, 200, 100, 100);
        image(BC2, 100, 200, 100, 100);
        image(BC3, 200, 200, 100, 100);
        image(BC4, 300, 200, 100, 100);
        image(BC5, 400, 200, 100, 100);
        image(BC2, 500, 200, 100, 100);
        image(BC3, 600, 200, 100, 100);
        image(BC4, 0, 300, 100, 100);
        image(BC5, 100, 300, 100, 100);
        image(BC2, 200, 300, 100, 100);
        image(BC3, 300, 300, 100, 100);
        image(BC4, 400, 300, 100, 100);
        image(BC5, 500, 300, 100, 100);
        image(BC2, 600, 300, 100, 100);
        image(BC3, 0, 400, 100, 100);
        image(BC4, 100, 400, 100, 100);
        image(BC5, 200, 400, 100, 100);
        image(BC2, 300, 400, 100, 100);
        image(BC3, 400, 400, 100, 100);
        image(BC4, 500, 400, 100, 100);
        image(BC5, 600, 400, 100, 100);
        image(BC2, 0, 500, 100, 100);
        image(BC3, 100, 500, 100, 100);
        image(BC4, 200, 500, 100, 100);
        image(BC5, 300, 500, 100, 100);
        image(BC2, 400, 500, 100, 100);
        image(BC3, 500, 500, 100, 100);
        image(BC4, 600, 500, 100, 100);
      }
      if (cropType == 7) {
        image(Ca1, 0, 200, 100, 100);
        image(Ca2, 100, 200, 100, 100);
        image(Ca2, 200, 200, 100, 100);
        image(Ca3, 300, 200, 100, 100);
        image(Ca3, 400, 200, 100, 100);
        image(Ca3, 500, 200, 100, 100);
        image(Ca3, 600, 200, 100, 100);
        image(Ca4, 0, 300, 100, 100);
        image(Ca4, 100, 300, 100, 100);
        image(Ca4, 200, 300, 100, 100);
        image(Ca4, 300, 300, 100, 100);
        image(Ca5, 400, 300, 100, 100);
        image(Ca6, 500, 300, 100, 100);
        image(Ca2, 600, 300, 100, 100);
        image(Ca2, 0, 400, 100, 100);
        image(Ca3, 100, 400, 100, 100);
        image(Ca3, 200, 400, 100, 100);
        image(Ca3, 300, 400, 100, 100);
        image(Ca3, 400, 400, 100, 100);
        image(Ca4, 500, 400, 100, 100);
        image(Ca4, 600, 400, 100, 100);
        image(Ca4, 0, 500, 100, 100);
        image(Ca4, 100, 500, 100, 100);
        image(Ca5, 200, 500, 100, 100);
        image(Ca6, 300, 500, 100, 100);
        image(Ca2, 400, 500, 100, 100);
        image(Ca2, 500, 500, 100, 100);
        image(Ca3, 600, 500, 100, 100);
      }
      if (cropType == 8) {
        image(CB1, 0, 200, 100, 100);
        image(CB2, 100, 200, 100, 100);
        image(CB2, 200, 200, 100, 100);
        image(CB3, 300, 200, 100, 100);
        image(CB3, 400, 200, 100, 100);
        image(CB4, 500, 200, 100, 100);
        image(CB4, 600, 200, 100, 100);
        image(CB4, 0, 300, 100, 100);
        image(CB5, 100, 300, 100, 100);
        image(CB5, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co1, 0, 200, 100, 100);
        image(Co1, 100, 200, 100, 100);
        image(Co2, 200, 200, 100, 100);
        image(Co2, 300, 200, 100, 100);
        image(Co2, 400, 200, 100, 100);
        image(Co3, 500, 200, 100, 100);
        image(Co3, 600, 200, 100, 100);
        image(Co3, 0, 300, 100, 100);
        image(Co4, 100, 300, 100, 100);
        image(Co4, 200, 300, 100, 100);
        image(Co4, 300, 300, 100, 100);
        image(Co5, 400, 300, 100, 100);
        image(Co5, 500, 300, 100, 100);
        image(Co5, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 10) {
        image(Cr1, 0, 200, 100, 100);
        image(Cr2, 100, 200, 100, 100);
        image(Cr2, 200, 200, 100, 100);
        image(Cr3, 300, 200, 100, 100);
        image(Cr4, 400, 200, 100, 100);
        image(Cr5, 500, 200, 100, 100);
        image(Cr5, 600, 200, 100, 100);
        image(Cr6, 0, 300, 100, 100);
        image(Cr7, 100, 300, 100, 100);
        image(Cr7, 200, 300, 100, 100);
        image(Cr7, 300, 300, 100, 100);
        image(Cr7, 400, 300, 100, 100);
        image(Cr6, 500, 300, 100, 100);
        image(Cr7, 600, 300, 100, 100);
        image(Cr7, 0, 400, 100, 100);
        image(Cr7, 100, 400, 100, 100);
        image(Cr7, 200, 400, 100, 100);
        image(Cr6, 300, 400, 100, 100);
        image(Cr7, 400, 400, 100, 100);
        image(Cr7, 500, 400, 100, 100);
        image(Cr7, 600, 400, 100, 100);
        image(Cr7, 0, 500, 100, 100);
        image(Cr6, 100, 500, 100, 100);
        image(Cr7, 200, 500, 100, 100);
        image(Cr7, 300, 500, 100, 100);
        image(Cr7, 400, 500, 100, 100);
        image(Cr7, 500, 500, 100, 100);
        image(Cr6, 600, 500, 100, 100);
      }
      if (cropType == 11) {
        image(E1, 0, 200, 100, 100);
        image(E2, 100, 200, 100, 100);
        image(E3, 200, 200, 100, 100);
        image(E4, 300, 200, 100, 100);
        image(E5, 400, 200, 100, 100);
        image(E6, 500, 200, 100, 100);
        image(E2, 600, 200, 100, 100);
        image(E3, 0, 300, 100, 100);
        image(E4, 100, 300, 100, 100);
        image(E5, 200, 300, 100, 100);
        image(E6, 300, 300, 100, 100);
        image(E2, 400, 300, 100, 100);
        image(E3, 500, 300, 100, 100);
        image(E4, 600, 300, 100, 100);
        image(E5, 0, 400, 100, 100);
        image(E6, 100, 400, 100, 100);
        image(E2, 200, 400, 100, 100);
        image(E3, 300, 400, 100, 100);
        image(E4, 400, 400, 100, 100);
        image(E5, 500, 400, 100, 100);
        image(E6, 600, 400, 100, 100);
        image(E2, 0, 500, 100, 100);
        image(E3, 100, 500, 100, 100);
        image(E4, 200, 500, 100, 100);
        image(E5, 300, 500, 100, 100);
        image(E6, 400, 500, 100, 100);
        image(E2, 500, 500, 100, 100);
        image(E3, 600, 500, 100, 100);
      }
      if (cropType == 12) {
        image(FR1, 0, 200, 100, 100);
        image(FR2, 100, 200, 100, 100);
        image(FR2, 200, 200, 100, 100);
        image(FR2, 300, 200, 100, 100);
        image(FR2, 400, 200, 100, 100);
        image(FR3, 500, 200, 100, 100);
        image(FR3, 600, 200, 100, 100);
        image(FR3, 0, 300, 100, 100);
        image(FR3, 100, 300, 100, 100);
        image(FR4, 200, 300, 100, 100);
        image(FR4, 300, 300, 100, 100);
        image(FR4, 400, 300, 100, 100);
        image(FR5, 500, 300, 100, 100);
        image(FR2, 600, 300, 100, 100);
        image(FR2, 0, 400, 100, 100);
        image(FR2, 100, 400, 100, 100);
        image(FR2, 200, 400, 100, 100);
        image(FR3, 300, 400, 100, 100);
        image(FR3, 400, 400, 100, 100);
        image(FR3, 500, 400, 100, 100);
        image(FR3, 600, 400, 100, 100);
        image(FR4, 0, 500, 100, 100);
        image(FR4, 100, 500, 100, 100);
        image(FR4, 200, 500, 100, 100);
        image(FR5, 300, 500, 100, 100);
        image(FR2, 400, 500, 100, 100);
        image(FR2, 500, 500, 100, 100);
        image(FR2, 600, 500, 100, 100);
      }
      if (cropType == 13) {
        image(Ga1, 0, 200, 100, 100);
        image(Ga2, 100, 200, 100, 100);
        image(Ga3, 200, 200, 100, 100);
        image(Ga4, 300, 200, 100, 100);
        image(Ga5, 400, 200, 100, 100);
        image(Ga2, 500, 200, 100, 100);
        image(Ga3, 600, 200, 100, 100);
        image(Ga4, 0, 300, 100, 100);
        image(Ga5, 100, 300, 100, 100);
        image(Ga2, 200, 300, 100, 100);
        image(Ga3, 300, 300, 100, 100);
        image(Ga4, 400, 300, 100, 100);
        image(Ga5, 500, 300, 100, 100);
        image(Ga2, 600, 300, 100, 100);
        image(Ga3, 0, 400, 100, 100);
        image(Ga4, 100, 400, 100, 100);
        image(Ga5, 200, 400, 100, 100);
        image(Ga2, 300, 400, 100, 100);
        image(Ga3, 400, 400, 100, 100);
        image(Ga4, 500, 400, 100, 100);
        image(Ga5, 600, 400, 100, 100);
        image(Ga2, 0, 500, 100, 100);
        image(Ga3, 100, 500, 100, 100);
        image(Ga4, 200, 500, 100, 100);
        image(Ga5, 300, 500, 100, 100);
        image(Ga2, 400, 500, 100, 100);
        image(Ga3, 500, 500, 100, 100);
        image(Ga4, 600, 500, 100, 100);
      }
      if (cropType == 14) {
        image(GB1, 0, 200, 100, 100);
        image(GB2, 100, 200, 100, 100);
        image(GB3, 200, 200, 100, 100);
        image(GB4, 300, 200, 100, 100);
        image(GB4, 400, 200, 100, 100);
        image(GB4, 500, 200, 100, 100);
        image(GB5, 600, 200, 100, 100);
        image(GB5, 0, 300, 100, 100);
        image(GB5, 100, 300, 100, 100);
        image(GB5, 200, 300, 100, 100);
        image(GB6, 300, 300, 100, 100);
        image(GB7, 400, 300, 100, 100);
        image(GB7, 500, 300, 100, 100);
        image(GB6, 600, 300, 100, 100);
        image(GB7, 0, 400, 100, 100);
        image(GB7, 100, 400, 100, 100);
        image(GB6, 200, 400, 100, 100);
        image(GB7, 300, 400, 100, 100);
        image(GB7, 400, 400, 100, 100);
        image(GB6, 500, 400, 100, 100);
        image(GB7, 600, 400, 100, 100);
        image(GB7, 0, 500, 100, 100);
        image(GB6, 100, 500, 100, 100);
        image(GB7, 200, 500, 100, 100);
        image(GB7, 300, 500, 100, 100);
        image(GB6, 400, 500, 100, 100);
        image(GB7, 500, 500, 100, 100);
        image(GB7, 600, 500, 100, 100);
      }
      if (cropType == 15) {
        image(Gr1, 0, 200, 100, 100);
        image(Gr2, 100, 200, 100, 100);
        image(Gr3, 200, 200, 100, 100);
        image(Gr3, 300, 200, 100, 100);
        image(Gr4, 400, 200, 100, 100);
        image(Gr4, 500, 200, 100, 100);
        image(Gr4, 600, 200, 100, 100);
        image(Gr5, 0, 300, 100, 100);
        image(Gr5, 100, 300, 100, 100);
        image(Gr5, 200, 300, 100, 100);
        image(Gr6, 300, 300, 100, 100);
        image(Gr7, 400, 300, 100, 100);
        image(Gr7, 500, 300, 100, 100);
        image(Gr6, 600, 300, 100, 100);
        image(Gr7, 0, 400, 100, 100);
        image(Gr7, 100, 400, 100, 100);
        image(Gr6, 200, 400, 100, 100);
        image(Gr7, 300, 400, 100, 100);
        image(Gr7, 400, 400, 100, 100);
        image(Gr6, 500, 400, 100, 100);
        image(Gr7, 600, 400, 100, 100);
        image(Gr7, 0, 500, 100, 100);
        image(Gr6, 100, 500, 100, 100);
        image(Gr7, 200, 500, 100, 100);
        image(Gr7, 300, 500, 100, 100);
        image(Gr6, 400, 500, 100, 100);
        image(Gr7, 500, 500, 100, 100);
        image(Gr7, 600, 500, 100, 100);
      }
      if (cropType == 16) {
        image(H1, 0, 200, 100, 100);
        image(H2, 100, 200, 100, 100);
        image(H3, 200, 200, 100, 100);
        image(H3, 300, 200, 100, 100);
        image(H4, 400, 200, 100, 100);
        image(H4, 500, 200, 100, 100);
        image(H4, 600, 200, 100, 100);
        image(H5, 0, 300, 100, 100);
        image(H5, 100, 300, 100, 100);
        image(H5, 200, 300, 100, 100);
        image(H5, 300, 300, 100, 100);
        image(H6, 400, 300, 100, 100);
        image(H6, 500, 300, 100, 100);
        image(H6, 600, 300, 100, 100);
        image(H6, 0, 400, 100, 100);
        image(H6, 100, 400, 100, 100);
        image(H6, 200, 400, 100, 100);
        image(H6, 300, 400, 100, 100);
        image(H6, 400, 400, 100, 100);
        image(H6, 500, 400, 100, 100);
        image(H6, 600, 400, 100, 100);
        image(H6, 0, 500, 100, 100);
        image(H6, 100, 500, 100, 100);
        image(H6, 200, 500, 100, 100);
        image(H6, 300, 500, 100, 100);
        image(H6, 400, 500, 100, 100);
        image(H6, 500, 500, 100, 100);
        image(H6, 600, 500, 100, 100);
      }
      if (cropType == 17) {
        image(HP1, 0, 200, 100, 100);
        image(HP2, 100, 200, 100, 100);
        image(HP3, 200, 200, 100, 100);
        image(HP4, 300, 200, 100, 100);
        image(HP5, 400, 200, 100, 100);
        image(HP6, 500, 200, 100, 100);
        image(HP7, 600, 200, 100, 100);
        image(HP7, 0, 300, 100, 100);
        image(HP6, 100, 300, 100, 100);
        image(HP7, 200, 300, 100, 100);
        image(HP7, 300, 300, 100, 100);
        image(HP6, 400, 300, 100, 100);
        image(HP7, 500, 300, 100, 100);
        image(HP7, 600, 300, 100, 100);
        image(HP6, 0, 400, 100, 100);
        image(HP7, 100, 400, 100, 100);
        image(HP7, 200, 400, 100, 100);
        image(HP6, 300, 400, 100, 100);
        image(HP7, 400, 400, 100, 100);
        image(HP7, 500, 400, 100, 100);
        image(HP6, 600, 400, 100, 100);
        image(HP7, 0, 500, 100, 100);
        image(HP7, 100, 500, 100, 100);
        image(HP6, 200, 500, 100, 100);
        image(HP7, 300, 500, 100, 100);
        image(HP7, 400, 500, 100, 100);
        image(HP6, 500, 500, 100, 100);
        image(HP7, 600, 500, 100, 100);
      }
      if (cropType == 18) {
        image(K1, 0, 200, 100, 100);
        image(K2, 100, 200, 100, 100);
        image(K2, 200, 200, 100, 100);
        image(K3, 300, 200, 100, 100);
        image(K3, 400, 200, 100, 100);
        image(K4, 500, 200, 100, 100);
        image(K5, 600, 200, 100, 100);
        image(K2, 0, 300, 100, 100);
        image(K2, 100, 300, 100, 100);
        image(K3, 200, 300, 100, 100);
        image(K3, 300, 300, 100, 100);
        image(K4, 400, 300, 100, 100);
        image(K5, 500, 300, 100, 100);
        image(K2, 600, 300, 100, 100);
        image(K2, 0, 400, 100, 100);
        image(K3, 100, 400, 100, 100);
        image(K3, 200, 400, 100, 100);
        image(K4, 300, 400, 100, 100);
        image(K5, 400, 400, 100, 100);
        image(K2, 500, 400, 100, 100);
        image(K2, 600, 400, 100, 100);
        image(K3, 0, 500, 100, 100);
        image(K3, 100, 500, 100, 100);
        image(K4, 200, 500, 100, 100);
        image(K5, 300, 500, 100, 100);
        image(K2, 400, 500, 100, 100);
        image(K2, 500, 500, 100, 100);
        image(K3, 600, 500, 100, 100);
      }
      if (cropType == 19) {
        image(M1, 0, 200, 100, 100);
        image(M2, 100, 200, 100, 100);
        image(M2, 200, 200, 100, 100);
        image(M3, 300, 200, 100, 100);
        image(M3, 400, 200, 100, 100);
        image(M3, 500, 200, 100, 100);
        image(M4, 600, 200, 100, 100);
        image(M4, 0, 300, 100, 100);
        image(M4, 100, 300, 100, 100);
        image(M5, 200, 300, 100, 100);
        image(M5, 300, 300, 100, 100);
        image(M5, 400, 300, 100, 100);
        image(M6, 500, 300, 100, 100);
        image(M2, 600, 300, 100, 100);
        image(M2, 0, 400, 100, 100);
        image(M3, 100, 400, 100, 100);
        image(M3, 200, 400, 100, 100);
        image(M3, 300, 400, 100, 100);
        image(M4, 400, 400, 100, 100);
        image(M4, 500, 400, 100, 100);
        image(M4, 600, 400, 100, 100);
        image(M5, 0, 500, 100, 100);
        image(M5, 100, 500, 100, 100);
        image(M5, 200, 500, 100, 100);
        image(M6, 300, 500, 100, 100);
        image(M2, 400, 500, 100, 100);
        image(M2, 500, 500, 100, 100);
        image(M3, 600, 500, 100, 100);
      }
      if (cropType == 20) {
        image(Par1, 0, 200, 100, 100);
        image(Par2, 100, 200, 100, 100);
        image(Par3, 200, 200, 100, 100);
        image(Par4, 300, 200, 100, 100);
        image(Par5, 400, 200, 100, 100);
        image(Par2, 500, 200, 100, 100);
        image(Par3, 600, 200, 100, 100);
        image(Par4, 0, 300, 100, 100);
        image(Par5, 100, 300, 100, 100);
        image(Par2, 200, 300, 100, 100);
        image(Par3, 300, 300, 100, 100);
        image(Par4, 400, 300, 100, 100);
        image(Par5, 500, 300, 100, 100);
        image(Par2, 600, 300, 100, 100);
        image(Par3, 0, 400, 100, 100);
        image(Par4, 100, 400, 100, 100);
        image(Par5, 200, 400, 100, 100);
        image(Par2, 300, 400, 100, 100);
        image(Par3, 400, 400, 100, 100);
        image(Par4, 500, 400, 100, 100);
        image(Par5, 600, 400, 100, 100);
        image(Par2, 0, 500, 100, 100);
        image(Par3, 100, 500, 100, 100);
        image(Par4, 200, 500, 100, 100);
        image(Par5, 300, 500, 100, 100);
        image(Par2, 400, 500, 100, 100);
        image(Par3, 500, 500, 100, 100);
        image(Par4, 600, 500, 100, 100);
      }
      if (cropType == 21) {
        image(Pop1, 0, 200, 100, 100);
        image(Pop2, 100, 200, 100, 100);
        image(Pop2, 200, 200, 100, 100);
        image(Pop3, 300, 200, 100, 100);
        image(Pop3, 400, 200, 100, 100);
        image(Pop4, 500, 200, 100, 100);
        image(Pop4, 600, 200, 100, 100);
        image(Pop5, 0, 300, 100, 100);
        image(Pop2, 100, 300, 100, 100);
        image(Pop2, 200, 300, 100, 100);
        image(Pop3, 300, 300, 100, 100);
        image(Pop3, 400, 300, 100, 100);
        image(Pop4, 500, 300, 100, 100);
        image(Pop4, 600, 300, 100, 100);
        image(Pop5, 0, 400, 100, 100);
        image(Pop2, 100, 400, 100, 100);
        image(Pop2, 200, 400, 100, 100);
        image(Pop3, 300, 400, 100, 100);
        image(Pop3, 400, 400, 100, 100);
        image(Pop4, 500, 400, 100, 100);
        image(Pop4, 600, 400, 100, 100);
        image(Pop5, 0, 500, 100, 100);
        image(Pop2, 100, 500, 100, 100);
        image(Pop2, 200, 500, 100, 100);
        image(Pop3, 300, 500, 100, 100);
        image(Pop3, 400, 500, 100, 100);
        image(Pop4, 500, 500, 100, 100);
        image(Pop4, 600, 500, 100, 100);
      }
      if (cropType == 22) {
        image(Pot1, 0, 200, 100, 100);
        image(Pot2, 100, 200, 100, 100);
        image(Pot3, 200, 200, 100, 100);
        image(Pot4, 300, 200, 100, 100);
        image(Pot4, 400, 200, 100, 100);
        image(Pot5, 500, 200, 100, 100);
        image(Pot6, 600, 200, 100, 100);
        image(Pot2, 0, 300, 100, 100);
        image(Pot3, 100, 300, 100, 100);
        image(Pot4, 200, 300, 100, 100);
        image(Pot4, 300, 300, 100, 100);
        image(Pot5, 400, 300, 100, 100);
        image(Pot6, 500, 300, 100, 100);
        image(Pot2, 600, 300, 100, 100);
        image(Pot3, 0, 400, 100, 100);
        image(Pot4, 100, 400, 100, 100);
        image(Pot4, 200, 400, 100, 100);
        image(Pot5, 300, 400, 100, 100);
        image(Pot6, 400, 400, 100, 100);
        image(Pot2, 500, 400, 100, 100);
        image(Pot3, 600, 400, 100, 100);
        image(Pot4, 0, 500, 100, 100);
        image(Pot4, 100, 500, 100, 100);
        image(Pot5, 200, 500, 100, 100);
        image(Pot6, 300, 500, 100, 100);
        image(Pot2, 400, 500, 100, 100);
        image(Pot3, 500, 500, 100, 100);
        image(Pot3, 600, 500, 100, 100);
      }
      if (cropType == 23) {
        image(Pum1, 0, 200, 100, 100);
        image(Pum2, 100, 200, 100, 100);
        image(Pum2, 200, 200, 100, 100);
        image(Pum3, 300, 200, 100, 100);
        image(Pum3, 400, 200, 100, 100);
        image(Pum3, 500, 200, 100, 100);
        image(Pum4, 600, 200, 100, 100);
        image(Pum4, 0, 300, 100, 100);
        image(Pum4, 100, 300, 100, 100);
        image(Pum4, 200, 300, 100, 100);
        image(Pum5, 300, 300, 100, 100);
        image(Pum5, 400, 300, 100, 100);
        image(Pum5, 500, 300, 100, 100);
        image(Pum6, 600, 300, 100, 100);
        image(Pum1, 0, 400, 100, 100);
        image(Pum2, 100, 400, 100, 100);
        image(Pum2, 200, 400, 100, 100);
        image(Pum3, 300, 400, 100, 100);
        image(Pum3, 400, 400, 100, 100);
        image(Pum3, 500, 400, 100, 100);
        image(Pum4, 600, 400, 100, 100);
        image(Pum4, 0, 500, 100, 100);
        image(Pum4, 100, 500, 100, 100);
        image(Pum4, 200, 500, 100, 100);
        image(Pum5, 300, 500, 100, 100);
        image(Pum5, 400, 500, 100, 100);
        image(Pum5, 500, 500, 100, 100);
        image(Pum6, 600, 500, 100, 100);
      }
      if (cropType == 24) {
        image(Ra1, 0, 200, 100, 100);
        image(Ra1, 100, 200, 100, 100);
        image(Ra2, 200, 200, 100, 100);
        image(Ra3, 300, 200, 100, 100);
        image(Ra3, 400, 200, 100, 100);
        image(Ra4, 500, 200, 100, 100);
        image(Ra5, 600, 200, 100, 100);
        image(Ra1, 0, 300, 100, 100);
        image(Ra1, 100, 300, 100, 100);
        image(Ra2, 200, 300, 100, 100);
        image(Ra3, 300, 300, 100, 100);
        image(Ra3, 400, 300, 100, 100);
        image(Ra4, 500, 300, 100, 100);
        image(Ra5, 600, 300, 100, 100);
        image(Ra1, 0, 400, 100, 100);
        image(Ra1, 100, 400, 100, 100);
        image(Ra2, 200, 400, 100, 100);
        image(Ra3, 300, 400, 100, 100);
        image(Ra3, 400, 400, 100, 100);
        image(Ra4, 500, 400, 100, 100);
        image(Ra5, 600, 400, 100, 100);
        image(Ra1, 0, 500, 100, 100);
        image(Ra1, 100, 500, 100, 100);
        image(Ra2, 200, 500, 100, 100);
        image(Ra3, 300, 500, 100, 100);
        image(Ra3, 400, 500, 100, 100);
        image(Ra4, 500, 500, 100, 100);
        image(Ra5, 600, 500, 100, 100);
      }
      if (cropType == 25) {
        image(RC1, 0, 200, 100, 100);
        image(RC1, 100, 200, 100, 100);
        image(RC2, 200, 200, 100, 100);
        image(RC3, 300, 200, 100, 100);
        image(RC3, 400, 200, 100, 100);
        image(RC4, 500, 200, 100, 100);
        image(RC4, 600, 200, 100, 100);
        image(RC5, 0, 300, 100, 100);
        image(RC5, 100, 300, 100, 100);
        image(RC6, 200, 300, 100, 100);
        image(RC1, 300, 300, 100, 100);
        image(RC1, 400, 300, 100, 100);
        image(RC2, 500, 300, 100, 100);
        image(RC3, 600, 300, 100, 100);
        image(RC3, 0, 400, 100, 100);
        image(RC4, 100, 400, 100, 100);
        image(RC4, 200, 400, 100, 100);
        image(RC5, 300, 400, 100, 100);
        image(RC5, 400, 400, 100, 100);
        image(RC6, 500, 400, 100, 100);
        image(RC1, 600, 400, 100, 100);
        image(RC1, 0, 500, 100, 100);
        image(RC2, 100, 500, 100, 100);
        image(RC3, 200, 500, 100, 100);
        image(RC3, 300, 500, 100, 100);
        image(RC4, 400, 500, 100, 100);
        image(RC4, 500, 500, 100, 100);
        image(RC5, 600, 500, 100, 100);
      }
      if (cropType == 26) {
        image(Rh1, 0, 200, 100, 100);
        image(Rh1, 100, 200, 100, 100);
        image(Rh2, 200, 200, 100, 100);
        image(Rh2, 300, 200, 100, 100);
        image(Rh3, 400, 200, 100, 100);
        image(Rh3, 500, 200, 100, 100);
        image(Rh4, 600, 200, 100, 100);
        image(Rh4, 0, 300, 100, 100);
        image(Rh4, 100, 300, 100, 100);
        image(Rh5, 200, 300, 100, 100);
        image(Rh5, 300, 300, 100, 100);
        image(Rh5, 400, 300, 100, 100);
        image(Rh5, 500, 300, 100, 100);
        image(Rh6, 600, 300, 100, 100);
        image(Rh1, 0, 400, 100, 100);
        image(Rh1, 100, 400, 100, 100);
        image(Rh2, 200, 400, 100, 100);
        image(Rh2, 300, 400, 100, 100);
        image(Rh3, 400, 400, 100, 100);
        image(Rh3, 500, 400, 100, 100);
        image(Rh4, 600, 400, 100, 100);
        image(Rh4, 0, 500, 100, 100);
        image(Rh4, 100, 500, 100, 100);
        image(Rh5, 200, 500, 100, 100);
        image(Rh5, 300, 500, 100, 100);
        image(Rh5, 400, 500, 100, 100);
        image(Rh5, 500, 500, 100, 100);
        image(Rh6, 600, 500, 100, 100);
      }
      if (cropType == 27) {
        image(Sta1, 0, 200, 100, 100);
        image(Sta1, 100, 200, 100, 100);
        image(Sta2, 200, 200, 100, 100);
        image(Sta2, 300, 200, 100, 100);
        image(Sta2, 400, 200, 100, 100);
        image(Sta3, 500, 200, 100, 100);
        image(Sta3, 600, 200, 100, 100);
        image(Sta4, 0, 300, 100, 100);
        image(Sta4, 100, 300, 100, 100);
        image(Sta4, 200, 300, 100, 100);
        image(Sta5, 300, 300, 100, 100);
        image(Sta5, 400, 300, 100, 100);
        image(Sta5, 500, 300, 100, 100);
        image(Sta6, 600, 300, 100, 100);
        image(Sta1, 0, 400, 100, 100);
        image(Sta1, 100, 400, 100, 100);
        image(Sta2, 200, 400, 100, 100);
        image(Sta2, 300, 400, 100, 100);
        image(Sta2, 400, 400, 100, 100);
        image(Sta3, 500, 400, 100, 100);
        image(Sta3, 600, 400, 100, 100);
        image(Sta4, 0, 500, 100, 100);
        image(Sta4, 100, 500, 100, 100);
        image(Sta4, 200, 500, 100, 100);
        image(Sta5, 300, 500, 100, 100);
        image(Sta5, 400, 500, 100, 100);
        image(Sta5, 500, 500, 100, 100);
        image(Sta6, 600, 500, 100, 100);
      }
      if (cropType == 28) {
        image(Str1, 0, 200, 100, 100);
        image(Str2, 100, 200, 100, 100);
        image(Str3, 200, 200, 100, 100);
        image(Str3, 300, 200, 100, 100);
        image(Str4, 400, 200, 100, 100);
        image(Str4, 500, 200, 100, 100);
        image(Str5, 600, 200, 100, 100);
        image(Str5, 0, 300, 100, 100);
        image(Str6, 100, 300, 100, 100);
        image(Str7, 200, 300, 100, 100);
        image(Str7, 300, 300, 100, 100);
        image(Str7, 400, 300, 100, 100);
        image(Str6, 500, 300, 100, 100);
        image(Str7, 600, 300, 100, 100);
        image(Str7, 0, 400, 100, 100);
        image(Str7, 100, 400, 100, 100);
        image(Str6, 200, 400, 100, 100);
        image(Str7, 300, 400, 100, 100);
        image(Str7, 400, 400, 100, 100);
        image(Str7, 500, 400, 100, 100);
        image(Str6, 600, 400, 100, 100);
        image(Str7, 0, 500, 100, 100);
        image(Str7, 100, 500, 100, 100);
        image(Str7, 200, 500, 100, 100);
        image(Str6, 300, 500, 100, 100);
        image(Str7, 400, 500, 100, 100);
        image(Str7, 500, 500, 100, 100);
        image(Str7, 600, 500, 100, 100);
      }
      if (cropType == 29) {
        image(SS1, 0, 200, 100, 100);
        image(SS2, 100, 200, 100, 100);
        image(SS2, 200, 200, 100, 100);
        image(SS3, 300, 200, 100, 100);
        image(SS3, 400, 200, 100, 100);
        image(SS3, 500, 200, 100, 100);
        image(SS4, 600, 200, 100, 100);
        image(SS4, 0, 300, 100, 100);
        image(SS5, 100, 300, 100, 100);
        image(SS1, 200, 300, 100, 100);
        image(SS2, 300, 300, 100, 100);
        image(SS2, 400, 300, 100, 100);
        image(SS3, 500, 300, 100, 100);
        image(SS3, 600, 300, 100, 100);
        image(SS3, 0, 400, 100, 100);
        image(SS4, 100, 400, 100, 100);
        image(SS4, 200, 400, 100, 100);
        image(SS5, 300, 400, 100, 100);
        image(SS1, 400, 400, 100, 100);
        image(SS2, 500, 400, 100, 100);
        image(SS2, 600, 400, 100, 100);
        image(SS3, 0, 500, 100, 100);
        image(SS3, 100, 500, 100, 100);
        image(SS3, 200, 500, 100, 100);
        image(SS4, 300, 500, 100, 100);
        image(SS4, 400, 500, 100, 100);
        image(SS5, 500, 500, 100, 100);
        image(SS1, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su1, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su2, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su3, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su4, 0, 300, 100, 100);
        image(Su5, 100, 300, 100, 100);
        image(Su1, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su2, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su3, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su4, 200, 400, 100, 100);
        image(Su5, 300, 400, 100, 100);
        image(Su1, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su2, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su3, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su4, 400, 500, 100, 100);
        image(Su5, 500, 500, 100, 100);
        image(Su1, 600, 500, 100, 100);
      }
      if (cropType == 31) {
        image(To1, 0, 200, 100, 100);
        image(To1, 100, 200, 100, 100);
        image(To2, 200, 200, 100, 100);
        image(To2, 300, 200, 100, 100);
        image(To3, 400, 200, 100, 100);
        image(To3, 500, 200, 100, 100);
        image(To4, 600, 200, 100, 100);
        image(To4, 0, 300, 100, 100);
        image(To5, 100, 300, 100, 100);
        image(To5, 200, 300, 100, 100);
        image(To5, 300, 300, 100, 100);
        image(To6, 400, 300, 100, 100);
        image(To7, 500, 300, 100, 100);
        image(To7, 600, 300, 100, 100);
        image(To7, 0, 400, 100, 100);
        image(To6, 100, 400, 100, 100);
        image(To7, 200, 400, 100, 100);
        image(To7, 300, 400, 100, 100);
        image(To7, 400, 400, 100, 100);
        image(To6, 500, 400, 100, 100);
        image(To7, 600, 400, 100, 100);
        image(To7, 0, 500, 100, 100);
        image(To7, 100, 500, 100, 100);
        image(To6, 200, 500, 100, 100);
        image(To7, 300, 500, 100, 100);
        image(To7, 400, 500, 100, 100);
        image(To7, 500, 500, 100, 100);
        image(To6, 600, 500, 100, 100);
      }
      if (cropType == 32) {
        image(Tu1, 0, 200, 100, 100);
        image(Tu2, 100, 200, 100, 100);
        image(Tu3, 200, 200, 100, 100);
        image(Tu3, 300, 200, 100, 100);
        image(Tu4, 400, 200, 100, 100);
        image(Tu4, 500, 200, 100, 100);
        image(Tu5, 600, 200, 100, 100);
        image(Tu1, 0, 300, 100, 100);
        image(Tu2, 100, 300, 100, 100);
        image(Tu3, 200, 300, 100, 100);
        image(Tu3, 300, 300, 100, 100);
        image(Tu4, 400, 300, 100, 100);
        image(Tu4, 500, 300, 100, 100);
        image(Tu5, 600, 300, 100, 100);
        image(Tu1, 0, 400, 100, 100);
        image(Tu2, 100, 400, 100, 100);
        image(Tu3, 200, 400, 100, 100);
        image(Tu3, 300, 400, 100, 100);
        image(Tu4, 400, 400, 100, 100);
        image(Tu4, 500, 400, 100, 100);
        image(Tu5, 600, 400, 100, 100);
        image(Tu1, 0, 500, 100, 100);
        image(Tu2, 100, 500, 100, 100);
        image(Tu3, 200, 500, 100, 100);
        image(Tu3, 300, 500, 100, 100);
        image(Tu4, 400, 500, 100, 100);
        image(Tu4, 500, 500, 100, 100);
        image(Tu5, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR2, 200, 200, 100, 100);
        image(UmR3, 300, 200, 100, 100);
        image(UmR3, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR4, 600, 200, 100, 100);
        image(UmR4, 0, 300, 100, 100);
        image(UmR5, 100, 300, 100, 100);
        image(UmR1, 200, 300, 100, 100);
        image(UmR2, 300, 300, 100, 100);
        image(UmR2, 400, 300, 100, 100);
        image(UmR3, 500, 300, 100, 100);
        image(UmR3, 600, 300, 100, 100);
        image(UmR4, 0, 400, 100, 100);
        image(UmR4, 100, 400, 100, 100);
        image(UmR4, 200, 400, 100, 100);
        image(UmR5, 300, 400, 100, 100);
        image(UmR1, 400, 400, 100, 100);
        image(UmR2, 500, 400, 100, 100);
        image(UmR2, 600, 400, 100, 100);
        image(UmR3, 0, 500, 100, 100);
        image(UmR3, 100, 500, 100, 100);
        image(UmR4, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR5, 500, 500, 100, 100);
        image(UmR1, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W1, 0, 200, 100, 100);
        image(W2, 100, 200, 100, 100);
        image(W3, 200, 200, 100, 100);
        image(W4, 300, 200, 100, 100);
        image(W5, 400, 200, 100, 100);
        image(W1, 500, 200, 100, 100);
        image(W2, 600, 200, 100, 100);
        image(W3, 0, 300, 100, 100);
        image(W4, 100, 300, 100, 100);
        image(W5, 200, 300, 100, 100);
        image(W1, 300, 300, 100, 100);
        image(W2, 400, 300, 100, 100);
        image(W3, 500, 300, 100, 100);
        image(W4, 600, 300, 100, 100);
        image(W5, 0, 400, 100, 100);
        image(W1, 100, 400, 100, 100);
        image(W2, 200, 400, 100, 100);
        image(W3, 300, 400, 100, 100);
        image(W4, 400, 400, 100, 100);
        image(W5, 500, 400, 100, 100);
        image(W1, 600, 400, 100, 100);
        image(W2, 0, 500, 100, 100);
        image(W3, 100, 500, 100, 100);
        image(W4, 200, 500, 100, 100);
        image(W5, 300, 500, 100, 100);
        image(W1, 400, 500, 100, 100);
        image(W2, 500, 500, 100, 100);
        image(W3, 600, 500, 100, 100);
      }
      if (cropType == 35) {
        image(Y1, 0, 200, 100, 100);
        image(Y2, 100, 200, 100, 100);
        image(Y2, 200, 200, 100, 100);
        image(Y2, 300, 200, 100, 100);
        image(Y3, 400, 200, 100, 100);
        image(Y3, 500, 200, 100, 100);
        image(Y3, 600, 200, 100, 100);
        image(Y4, 0, 300, 100, 100);
        image(Y4, 100, 300, 100, 100);
        image(Y4, 200, 300, 100, 100);
        image(Y5, 300, 300, 100, 100);
        image(Y1, 400, 300, 100, 100);
        image(Y2, 500, 300, 100, 100);
        image(Y2, 600, 300, 100, 100);
        image(Y2, 0, 400, 100, 100);
        image(Y3, 100, 400, 100, 100);
        image(Y3, 200, 400, 100, 100);
        image(Y3, 300, 400, 100, 100);
        image(Y4, 400, 400, 100, 100);
        image(Y4, 500, 400, 100, 100);
        image(Y4, 600, 400, 100, 100);
        image(Y5, 0, 500, 100, 100);
        image(Y1, 100, 500, 100, 100);
        image(Y2, 200, 500, 100, 100);
        image(Y2, 300, 500, 100, 100);
        image(Y2, 400, 500, 100, 100);
        image(Y3, 500, 500, 100, 100);
        image(Y3, 600, 500, 100, 100);
      }
    }
    if (cropCalendarDtype2) {
      if (cropType == 8) {
        image(CB6, 0, 200, 100, 100);
        image(CB7, 100, 200, 100, 100);
        image(CB6, 200, 200, 100, 100);
        image(CB7, 300, 200, 100, 100);
        image(CB6, 400, 200, 100, 100);
        image(CB7, 500, 200, 100, 100);
        image(CB6, 600, 200, 100, 100);
        image(CB7, 0, 300, 100, 100);
        image(CB6, 100, 300, 100, 100);
        image(CB7, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co7, 0, 200, 100, 100);
        image(Co7, 100, 200, 100, 100);
        image(Co6, 200, 200, 100, 100);
        image(Co7, 300, 200, 100, 100);
        image(Co7, 400, 200, 100, 100);
        image(Co7, 500, 200, 100, 100);
        image(Co6, 600, 200, 100, 100);
        image(Co7, 0, 300, 100, 100);
        image(Co7, 100, 300, 100, 100);
        image(Co7, 200, 300, 100, 100);
        image(Co6, 300, 300, 100, 100);
        image(Co7, 400, 300, 100, 100);
        image(Co7, 500, 300, 100, 100);
        image(Co7, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su2, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su3, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su4, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su5, 0, 300, 100, 100);
        image(Su1, 100, 300, 100, 100);
        image(Su2, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su3, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su4, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su5, 200, 400, 100, 100);
        image(Su1, 300, 400, 100, 100);
        image(Su2, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su3, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su4, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su5, 400, 500, 100, 100);
        image(Su1, 500, 500, 100, 100);
        image(Su2, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR3, 200, 200, 100, 100);
        image(UmR4, 300, 200, 100, 100);
        image(UmR4, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR5, 600, 200, 100, 100);
        image(UmR1, 0, 300, 100, 100);
        image(UmR2, 100, 300, 100, 100);
        image(UmR3, 200, 300, 100, 100);
        image(UmR4, 300, 300, 100, 100);
        image(UmR4, 400, 300, 100, 100);
        image(UmR4, 500, 300, 100, 100);
        image(UmR5, 600, 300, 100, 100);
        image(UmR1, 0, 400, 100, 100);
        image(UmR2, 100, 400, 100, 100);
        image(UmR3, 200, 400, 100, 100);
        image(UmR4, 300, 400, 100, 100);
        image(UmR4, 400, 400, 100, 100);
        image(UmR4, 500, 400, 100, 100);
        image(UmR5, 600, 400, 100, 100);
        image(UmR1, 0, 500, 100, 100);
        image(UmR2, 100, 500, 100, 100);
        image(UmR3, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR4, 500, 500, 100, 100);
        image(UmR5, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W4, 0, 200, 100, 100);
        image(W5, 100, 200, 100, 100);
        image(W1, 200, 200, 100, 100);
        image(W2, 300, 200, 100, 100);
        image(W3, 400, 200, 100, 100);
        image(W4, 500, 200, 100, 100);
        image(W5, 600, 200, 100, 100);
        image(W1, 0, 300, 100, 100);
        image(W2, 100, 300, 100, 100);
        image(W3, 200, 300, 100, 100);
        image(W4, 300, 300, 100, 100);
        image(W5, 400, 300, 100, 100);
        image(W1, 500, 300, 100, 100);
        image(W2, 600, 300, 100, 100);
        image(W3, 0, 400, 100, 100);
        image(W4, 100, 400, 100, 100);
        image(W5, 200, 400, 100, 100);
        image(W1, 300, 400, 100, 100);
        image(W1, 400, 400, 100, 100);
        image(W2, 500, 400, 100, 100);
        image(W3, 600, 400, 100, 100);
        image(W4, 0, 500, 100, 100);
        image(W5, 100, 500, 100, 100);
        image(W1, 200, 500, 100, 100);
        image(W2, 300, 500, 100, 100);
        image(W3, 400, 500, 100, 100);
        image(W4, 500, 500, 100, 100);
        image(W5, 600, 500, 100, 100);
      }
    }
    if (cropType == 8 || cropType == 9 || cropType == 30 || cropType == 33 || cropType == 34) {
      if (keyPressed) {
        if (key == CODED) {
          if (keyCode == SHIFT) {
            cropCalendarDtype2 = true;
            cropCalendarDtype1 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
          if (keyCode == CONTROL) {
            cropCalendarDtype1 = true;
            cropCalendarDtype2 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
        }
      }
    }
    if (keyPressed) {
      if (key == 'V' || key == 'v') {
        cropSelect = true;
        cropCalendarD = false;
        fill(0);
        rect(0, 0, 700, 600);
      }
      if (key == 'C' || key == 'c') {
        cropCalendarD = false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalculator = true;
      }
      if(key == '1') {
        cropCalendarD = false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalendarN = true;
      }
    }
  }
}*/
/*void CalendarmodeDASG() {
  if (cropCalendarDASG == true) {
//first done
    //build
    stroke(255);
    for (int i = 100; i < 600; i += 100) {
      line(0, i, 700, i);
    }
    for (int i = 100; i < 700; i += 100) {
      line(i, 100, i, 600);
    }
    //text
    fill(255);
    textSize(32);
    text("Mon", 20, 200);
    text("Tue", 120, 200);
    text("Wed", 220, 200);
    text("Thu", 320, 200);
    text("Fri", 420, 200);
    text("Sat", 520, 200);
    text("Sun", 620, 200);
    if (cropCalendarDASGtype1) {
      if (cropType == 1) {
        image(Am1, 0, 200, 100, 100);
        image(Am2, 100, 200, 100, 100);
        image(Am2, 200, 200, 100, 100);
        image(Am3, 300, 200, 100, 100);
        image(Am3, 400, 200, 100, 100);
        image(Am4, 500, 200, 100, 100);
        image(Am4, 600, 200, 100, 100);
        image(Am5, 0, 300, 100, 100);
        image(Am2, 100, 300, 100, 100);
        image(Am2, 200, 300, 100, 100);
        image(Am3, 300, 300, 100, 100);
        image(Am3, 400, 300, 100, 100);
        image(Am4, 500, 300, 100, 100);
        image(Am4, 600, 300, 100, 100);
        image(Am5, 0, 400, 100, 100);
        image(Am2, 100, 400, 100, 100);
        image(Am2, 200, 400, 100, 100);
        image(Am3, 300, 400, 100, 100);
        image(Am3, 400, 400, 100, 100);
        image(Am4, 500, 400, 100, 100);
        image(Am4, 600, 400, 100, 100);
        image(Am5, 0, 500, 100, 100);
        image(Am2, 100, 500, 100, 100);
        image(Am2, 200, 500, 100, 100);
        image(Am3, 300, 500, 100, 100);
        image(Am3, 400, 500, 100, 100);
        image(Am4, 500, 500, 100, 100);
        image(Am4, 600, 500, 100, 100);
      }
      if (cropType == 2) {
        image(Ar1, 0, 200, 100, 100);
        image(Ar1, 100, 200, 100, 100);
        image(Ar2, 200, 200, 100, 100);
        image(Ar2, 300, 200, 100, 100);
        image(Ar3, 400, 200, 100, 100);
        image(Ar4, 500, 200, 100, 100);
        image(Ar4, 600, 200, 100, 100);
        image(Ar5, 0, 300, 100, 100);
        image(Ar6, 100, 300, 100, 100);
        image(Ar1, 200, 300, 100, 100);
        image(Ar1, 300, 300, 100, 100);
        image(Ar2, 400, 300, 100, 100);
        image(Ar2, 500, 300, 100, 100);
        image(Ar3, 600, 300, 100, 100);
        image(Ar4, 0, 400, 100, 100);
        image(Ar4, 100, 400, 100, 100);
        image(Ar5, 200, 400, 100, 100);
        image(Ar6, 300, 400, 100, 100);
        image(Ar1, 400, 400, 100, 100);
        image(Ar1, 500, 400, 100, 100);
        image(Ar2, 600, 400, 100, 100);
        image(Ar2, 0, 500, 100, 100);
        image(Ar3, 100, 500, 100, 100);
        image(Ar4, 200, 500, 100, 100);
        image(Ar4, 300, 500, 100, 100);
        image(Ar5, 400, 500, 100, 100);
        image(Ar6, 500, 500, 100, 100);
        image(Ar1, 600, 500, 100, 100);
      }
      if (cropType == 3) {
        image(Be1, 0, 200, 100, 100);
        image(Be2, 100, 200, 100, 100);
        image(Be3, 200, 200, 100, 100);
        image(Be3, 300, 200, 100, 100);
        image(Be4, 400, 200, 100, 100);
        image(Be4, 500, 200, 100, 100);
        image(Be5, 600, 200, 100, 100);
        image(Be1, 0, 300, 100, 100);
        image(Be2, 100, 300, 100, 100);
        image(Be3, 200, 300, 100, 100);
        image(Be3, 300, 300, 100, 100);
        image(Be4, 400, 300, 100, 100);
        image(Be4, 500, 300, 100, 100);
        image(Be5, 600, 300, 100, 100);
        image(Be1, 0, 400, 100, 100);
        image(Be2, 100, 400, 100, 100);
        image(Be3, 200, 400, 100, 100);
        image(Be3, 300, 400, 100, 100);
        image(Be4, 400, 400, 100, 100);
        image(Be4, 500, 400, 100, 100);
        image(Be5, 600, 400, 100, 100);
        image(Be1, 0, 500, 100, 100);
        image(Be2, 100, 500, 100, 100);
        image(Be3, 200, 500, 100, 100);
        image(Be3, 300, 500, 100, 100);
        image(Be4, 400, 500, 100, 100);
        image(Be4, 500, 500, 100, 100);
        image(Be5, 600, 500, 100, 100);
      }
      if (cropType == 4) {
        image(Bl1, 0, 200, 100, 100);
        image(Bl2, 100, 200, 100, 100);
        image(Bl2, 200, 200, 100, 100);
        image(Bl2, 300, 200, 100, 100);
        image(Bl3, 400, 200, 100, 100);
        image(Bl3, 500, 200, 100, 100);
        image(Bl3, 600, 200, 100, 100);
        image(Bl4, 0, 300, 100, 100);
        image(Bl4, 100, 300, 100, 100);
        image(Bl4, 200, 300, 100, 100);
        image(Bl4, 300, 300, 100, 100);
        image(Bl5, 400, 300, 100, 100);
        image(Bl5, 500, 300, 100, 100);
        image(Bl6, 600, 300, 100, 100);
        image(Bl7, 0, 400, 100, 100);
        image(Bl7, 100, 400, 100, 100);
        image(Bl7, 200, 400, 100, 100);
        image(Bl6, 300, 400, 100, 100);
        image(Bl7, 400, 400, 100, 100);
        image(Bl7, 500, 400, 100, 100);
        image(Bl7, 600, 400, 100, 100);
        image(Bl6, 0, 500, 100, 100);
        image(Bl7, 100, 500, 100, 100);
        image(Bl7, 200, 500, 100, 100);
        image(Bl7, 300, 500, 100, 100);
        image(Bl6, 400, 500, 100, 100);
        image(Bl7, 500, 500, 100, 100);
        image(Bl7, 600, 500, 100, 100);
      }
      if (cropType == 5) {
        image(BJ1, 0, 200, 100, 100);
        image(BJ2, 100, 200, 100, 100);
        image(BJ2, 200, 200, 100, 100);
        image(BJ3, 300, 200, 100, 100);
        image(BJ3, 400, 200, 100, 100);
        image(BJ4, 500, 200, 100, 100);
        image(BJ4, 600, 200, 100, 100);
        image(BJ5, 0, 300, 100, 100);
        image(BJ1, 100, 300, 100, 100);
        image(BJ2, 200, 300, 100, 100);
        image(BJ2, 300, 300, 100, 100);
        image(BJ3, 400, 300, 100, 100);
        image(BJ3, 500, 300, 100, 100);
        image(BJ4, 600, 300, 100, 100);
        image(BJ4, 0, 400, 100, 100);
        image(BJ5, 100, 400, 100, 100);
        image(BJ1, 200, 400, 100, 100);
        image(BJ2, 300, 400, 100, 100);
        image(BJ2, 400, 400, 100, 100);
        image(BJ3, 500, 400, 100, 100);
        image(BJ3, 600, 400, 100, 100);
        image(BJ4, 0, 500, 100, 100);
        image(BJ4, 100, 500, 100, 100);
        image(BJ5, 200, 500, 100, 100);
        image(BJ1, 300, 500, 100, 100);
        image(BJ2, 400, 500, 100, 100);
        image(BJ2, 500, 500, 100, 100);
        image(BJ3, 600, 500, 100, 100);
      }
      if (cropType == 6) {
        image(BC1, 0, 200, 100, 100);
        image(BC2, 100, 200, 100, 100);
        image(BC3, 200, 200, 100, 100);
        image(BC4, 300, 200, 100, 100);
        image(BC5, 400, 200, 100, 100);
        image(BC1, 500, 200, 100, 100);
        image(BC2, 600, 200, 100, 100);
        image(BC3, 0, 300, 100, 100);
        image(BC4, 100, 300, 100, 100);
        image(BC5, 200, 300, 100, 100);
        image(BC1, 300, 300, 100, 100);
        image(BC2, 400, 300, 100, 100);
        image(BC3, 500, 300, 100, 100);
        image(BC4, 600, 300, 100, 100);
        image(BC5, 0, 400, 100, 100);
        image(BC1, 100, 400, 100, 100);
        image(BC2, 200, 400, 100, 100);
        image(BC3, 300, 400, 100, 100);
        image(BC4, 400, 400, 100, 100);
        image(BC5, 500, 400, 100, 100);
        image(BC1, 600, 400, 100, 100);
        image(BC2, 0, 500, 100, 100);
        image(BC3, 100, 500, 100, 100);
        image(BC4, 200, 500, 100, 100);
        image(BC5, 300, 500, 100, 100);
        image(BC1, 400, 500, 100, 100);
        image(BC2, 500, 500, 100, 100);
        image(BC3, 600, 500, 100, 100);
      }
      if (cropType == 7) {
        image(Ca1, 0, 200, 100, 100);
        image(Ca2, 100, 200, 100, 100);
        image(Ca2, 200, 200, 100, 100);
        image(Ca3, 300, 200, 100, 100);
        image(Ca3, 400, 200, 100, 100);
        image(Ca3, 500, 200, 100, 100);
        image(Ca3, 600, 200, 100, 100);
        image(Ca4, 0, 300, 100, 100);
        image(Ca4, 100, 300, 100, 100);
        image(Ca4, 200, 300, 100, 100);
        image(Ca4, 300, 300, 100, 100);
        image(Ca5, 400, 300, 100, 100);
        image(Ca6, 500, 300, 100, 100);
        image(Ca1, 600, 300, 100, 100);
        image(Ca2, 0, 400, 100, 100);
        image(Ca2, 100, 400, 100, 100);
        image(Ca3, 200, 400, 100, 100);
        image(Ca3, 300, 400, 100, 100);
        image(Ca3, 400, 400, 100, 100);
        image(Ca3, 500, 400, 100, 100);
        image(Ca4, 600, 400, 100, 100);
        image(Ca4, 0, 500, 100, 100);
        image(Ca4, 100, 500, 100, 100);
        image(Ca4, 200, 500, 100, 100);
        image(Ca5, 300, 500, 100, 100);
        image(Ca6, 400, 500, 100, 100);
        image(Ca1, 500, 500, 100, 100);
        image(Ca2, 600, 500, 100, 100);
      }
      if (cropType == 8) {
        image(CB1, 0, 200, 100, 100);
        image(CB2, 100, 200, 100, 100);
        image(CB2, 200, 200, 100, 100);
        image(CB3, 300, 200, 100, 100);
        image(CB3, 400, 200, 100, 100);
        image(CB4, 500, 200, 100, 100);
        image(CB4, 600, 200, 100, 100);
        image(CB4, 0, 300, 100, 100);
        image(CB5, 100, 300, 100, 100);
        image(CB5, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co1, 0, 200, 100, 100);
        image(Co1, 100, 200, 100, 100);
        image(Co2, 200, 200, 100, 100);
        image(Co2, 300, 200, 100, 100);
        image(Co2, 400, 200, 100, 100);
        image(Co3, 500, 200, 100, 100);
        image(Co3, 600, 200, 100, 100);
        image(Co3, 0, 300, 100, 100);
        image(Co4, 100, 300, 100, 100);
        image(Co4, 200, 300, 100, 100);
        image(Co4, 300, 300, 100, 100);
        image(Co5, 400, 300, 100, 100);
        image(Co5, 500, 300, 100, 100);
        image(Co5, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 10) {
        image(Cr1, 0, 200, 100, 100);
        image(Cr2, 100, 200, 100, 100);
        image(Cr2, 200, 200, 100, 100);
        image(Cr3, 300, 200, 100, 100);
        image(Cr4, 400, 200, 100, 100);
        image(Cr5, 500, 200, 100, 100);
        image(Cr5, 600, 200, 100, 100);
        image(Cr6, 0, 300, 100, 100);
        image(Cr7, 100, 300, 100, 100);
        image(Cr7, 200, 300, 100, 100);
        image(Cr7, 300, 300, 100, 100);
        image(Cr7, 400, 300, 100, 100);
        image(Cr6, 500, 300, 100, 100);
        image(Cr7, 600, 300, 100, 100);
        image(Cr7, 0, 400, 100, 100);
        image(Cr7, 100, 400, 100, 100);
        image(Cr7, 200, 400, 100, 100);
        image(Cr6, 300, 400, 100, 100);
        image(Cr7, 400, 400, 100, 100);
        image(Cr7, 500, 400, 100, 100);
        image(Cr7, 600, 400, 100, 100);
        image(Cr7, 0, 500, 100, 100);
        image(Cr6, 100, 500, 100, 100);
        image(Cr7, 200, 500, 100, 100);
        image(Cr7, 300, 500, 100, 100);
        image(Cr7, 400, 500, 100, 100);
        image(Cr7, 500, 500, 100, 100);
        image(Cr6, 600, 500, 100, 100);
      }
      if (cropType == 11) {
        image(E1, 0, 200, 100, 100);
        image(E2, 100, 200, 100, 100);
        image(E3, 200, 200, 100, 100);
        image(E4, 300, 200, 100, 100);
        image(E5, 400, 200, 100, 100);
        image(E6, 500, 200, 100, 100);
        image(E1, 600, 200, 100, 100);
        image(E2, 0, 300, 100, 100);
        image(E3, 100, 300, 100, 100);
        image(E4, 200, 300, 100, 100);
        image(E5, 300, 300, 100, 100);
        image(E6, 400, 300, 100, 100);
        image(E1, 500, 300, 100, 100);
        image(E2, 600, 300, 100, 100);
        image(E3, 0, 400, 100, 100);
        image(E4, 100, 400, 100, 100);
        image(E5, 200, 400, 100, 100);
        image(E6, 300, 400, 100, 100);
        image(E1, 400, 400, 100, 100);
        image(E2, 500, 400, 100, 100);
        image(E3, 600, 400, 100, 100);
        image(E4, 0, 500, 100, 100);
        image(E5, 100, 500, 100, 100);
        image(E6, 200, 500, 100, 100);
        image(E1, 300, 500, 100, 100);
        image(E2, 400, 500, 100, 100);
        image(E3, 500, 500, 100, 100);
        image(E4, 600, 500, 100, 100);
      }
      if (cropType == 12) {
        image(FR1, 0, 200, 100, 100);
        image(FR2, 100, 200, 100, 100);
        image(FR2, 200, 200, 100, 100);
        image(FR2, 300, 200, 100, 100);
        image(FR2, 400, 200, 100, 100);
        image(FR3, 500, 200, 100, 100);
        image(FR3, 600, 200, 100, 100);
        image(FR3, 0, 300, 100, 100);
        image(FR3, 100, 300, 100, 100);
        image(FR4, 200, 300, 100, 100);
        image(FR4, 300, 300, 100, 100);
        image(FR4, 400, 300, 100, 100);
        image(FR5, 500, 300, 100, 100);
        image(FR1, 600, 300, 100, 100);
        image(FR2, 0, 400, 100, 100);
        image(FR2, 100, 400, 100, 100);
        image(FR2, 200, 400, 100, 100);
        image(FR2, 300, 400, 100, 100);
        image(FR3, 400, 400, 100, 100);
        image(FR3, 500, 400, 100, 100);
        image(FR3, 600, 400, 100, 100);
        image(FR3, 0, 500, 100, 100);
        image(FR4, 100, 500, 100, 100);
        image(FR4, 200, 500, 100, 100);
        image(FR4, 300, 500, 100, 100);
        image(FR5, 400, 500, 100, 100);
        image(FR1, 500, 500, 100, 100);
        image(FR2, 600, 500, 100, 100);
      }
      if (cropType == 13) {
        image(Ga1, 0, 200, 100, 100);
        image(Ga2, 100, 200, 100, 100);
        image(Ga3, 200, 200, 100, 100);
        image(Ga4, 300, 200, 100, 100);
        image(Ga5, 400, 200, 100, 100);
        image(Ga1, 500, 200, 100, 100);
        image(Ga2, 600, 200, 100, 100);
        image(Ga3, 0, 300, 100, 100);
        image(Ga4, 100, 300, 100, 100);
        image(Ga5, 200, 300, 100, 100);
        image(Ga1, 300, 300, 100, 100);
        image(Ga2, 400, 300, 100, 100);
        image(Ga3, 500, 300, 100, 100);
        image(Ga4, 600, 300, 100, 100);
        image(Ga5, 0, 400, 100, 100);
        image(Ga1, 100, 400, 100, 100);
        image(Ga2, 200, 400, 100, 100);
        image(Ga3, 300, 400, 100, 100);
        image(Ga4, 400, 400, 100, 100);
        image(Ga5, 500, 400, 100, 100);
        image(Ga1, 600, 400, 100, 100);
        image(Ga2, 0, 500, 100, 100);
        image(Ga3, 100, 500, 100, 100);
        image(Ga4, 200, 500, 100, 100);
        image(Ga5, 300, 500, 100, 100);
        image(Ga1, 400, 500, 100, 100);
        image(Ga2, 500, 500, 100, 100);
        image(Ga3, 600, 500, 100, 100);
      }
      if (cropType == 14) {
        image(GB1, 0, 200, 100, 100);
        image(GB2, 100, 200, 100, 100);
        image(GB3, 200, 200, 100, 100);
        image(GB4, 300, 200, 100, 100);
        image(GB4, 400, 200, 100, 100);
        image(GB4, 500, 200, 100, 100);
        image(GB5, 600, 200, 100, 100);
        image(GB5, 0, 300, 100, 100);
        image(GB5, 100, 300, 100, 100);
        image(GB5, 200, 300, 100, 100);
        image(GB6, 300, 300, 100, 100);
        image(GB7, 400, 300, 100, 100);
        image(GB7, 500, 300, 100, 100);
        image(GB6, 600, 300, 100, 100);
        image(GB7, 0, 400, 100, 100);
        image(GB7, 100, 400, 100, 100);
        image(GB6, 200, 400, 100, 100);
        image(GB7, 300, 400, 100, 100);
        image(GB7, 400, 400, 100, 100);
        image(GB6, 500, 400, 100, 100);
        image(GB7, 600, 400, 100, 100);
        image(GB7, 0, 500, 100, 100);
        image(GB6, 100, 500, 100, 100);
        image(GB7, 200, 500, 100, 100);
        image(GB7, 300, 500, 100, 100);
        image(GB6, 400, 500, 100, 100);
        image(GB7, 500, 500, 100, 100);
        image(GB7, 600, 500, 100, 100);
      }
      if (cropType == 15) {
        image(Gr1, 0, 200, 100, 100);
        image(Gr2, 100, 200, 100, 100);
        image(Gr3, 200, 200, 100, 100);
        image(Gr3, 300, 200, 100, 100);
        image(Gr4, 400, 200, 100, 100);
        image(Gr4, 500, 200, 100, 100);
        image(Gr4, 600, 200, 100, 100);
        image(Gr5, 0, 300, 100, 100);
        image(Gr5, 100, 300, 100, 100);
        image(Gr5, 200, 300, 100, 100);
        image(Gr6, 300, 300, 100, 100);
        image(Gr7, 400, 300, 100, 100);
        image(Gr7, 500, 300, 100, 100);
        image(Gr6, 600, 300, 100, 100);
        image(Gr7, 0, 400, 100, 100);
        image(Gr7, 100, 400, 100, 100);
        image(Gr6, 200, 400, 100, 100);
        image(Gr7, 300, 400, 100, 100);
        image(Gr7, 400, 400, 100, 100);
        image(Gr6, 500, 400, 100, 100);
        image(Gr7, 600, 400, 100, 100);
        image(Gr7, 0, 500, 100, 100);
        image(Gr6, 100, 500, 100, 100);
        image(Gr7, 200, 500, 100, 100);
        image(Gr7, 300, 500, 100, 100);
        image(Gr6, 400, 500, 100, 100);
        image(Gr7, 500, 500, 100, 100);
        image(Gr7, 600, 500, 100, 100);
      }
      if (cropType == 16) {
        image(H1, 0, 200, 100, 100);
        image(H2, 100, 200, 100, 100);
        image(H3, 200, 200, 100, 100);
        image(H3, 300, 200, 100, 100);
        image(H4, 400, 200, 100, 100);
        image(H4, 500, 200, 100, 100);
        image(H4, 600, 200, 100, 100);
        image(H5, 0, 300, 100, 100);
        image(H5, 100, 300, 100, 100);
        image(H5, 200, 300, 100, 100);
        image(H5, 300, 300, 100, 100);
        image(H6, 400, 300, 100, 100);
        image(H6, 500, 300, 100, 100);
        image(H6, 600, 300, 100, 100);
        image(H6, 0, 400, 100, 100);
        image(H6, 100, 400, 100, 100);
        image(H6, 200, 400, 100, 100);
        image(H6, 300, 400, 100, 100);
        image(H6, 400, 400, 100, 100);
        image(H6, 500, 400, 100, 100);
        image(H6, 600, 400, 100, 100);
        image(H6, 0, 500, 100, 100);
        image(H6, 100, 500, 100, 100);
        image(H6, 200, 500, 100, 100);
        image(H6, 300, 500, 100, 100);
        image(H6, 400, 500, 100, 100);
        image(H6, 500, 500, 100, 100);
        image(H6, 600, 500, 100, 100);
      }
      if (cropType == 17) {
        image(HP1, 0, 200, 100, 100);
        image(HP2, 100, 200, 100, 100);
        image(HP3, 200, 200, 100, 100);
        image(HP4, 300, 200, 100, 100);
        image(HP5, 400, 200, 100, 100);
        image(HP6, 500, 200, 100, 100);
        image(HP7, 600, 200, 100, 100);
        image(HP7, 0, 300, 100, 100);
        image(HP6, 100, 300, 100, 100);
        image(HP7, 200, 300, 100, 100);
        image(HP7, 300, 300, 100, 100);
        image(HP6, 400, 300, 100, 100);
        image(HP7, 500, 300, 100, 100);
        image(HP7, 600, 300, 100, 100);
        image(HP6, 0, 400, 100, 100);
        image(HP7, 100, 400, 100, 100);
        image(HP7, 200, 400, 100, 100);
        image(HP6, 300, 400, 100, 100);
        image(HP7, 400, 400, 100, 100);
        image(HP7, 500, 400, 100, 100);
        image(HP6, 600, 400, 100, 100);
        image(HP7, 0, 500, 100, 100);
        image(HP7, 100, 500, 100, 100);
        image(HP6, 200, 500, 100, 100);
        image(HP7, 300, 500, 100, 100);
        image(HP7, 400, 500, 100, 100);
        image(HP6, 500, 500, 100, 100);
        image(HP7, 600, 500, 100, 100);
      }
      if (cropType == 18) {
        image(K1, 0, 200, 100, 100);
        image(K2, 100, 200, 100, 100);
        image(K2, 200, 200, 100, 100);
        image(K3, 300, 200, 100, 100);
        image(K3, 400, 200, 100, 100);
        image(K4, 500, 200, 100, 100);
        image(K5, 600, 200, 100, 100);
        image(K1, 0, 300, 100, 100);
        image(K2, 100, 300, 100, 100);
        image(K2, 200, 300, 100, 100);
        image(K3, 300, 300, 100, 100);
        image(K3, 400, 300, 100, 100);
        image(K4, 500, 300, 100, 100);
        image(K5, 600, 300, 100, 100);
        image(K1, 0, 400, 100, 100);
        image(K2, 100, 400, 100, 100);
        image(K2, 200, 400, 100, 100);
        image(K3, 300, 400, 100, 100);
        image(K3, 400, 400, 100, 100);
        image(K4, 500, 400, 100, 100);
        image(K5, 600, 400, 100, 100);
        image(K1, 0, 500, 100, 100);
        image(K2, 100, 500, 100, 100);
        image(K2, 200, 500, 100, 100);
        image(K3, 300, 500, 100, 100);
        image(K3, 400, 500, 100, 100);
        image(K4, 500, 500, 100, 100);
        image(K5, 600, 500, 100, 100);
      }
      if (cropType == 19) {
        image(M1, 0, 200, 100, 100);
        image(M2, 100, 200, 100, 100);
        image(M2, 200, 200, 100, 100);
        image(M3, 300, 200, 100, 100);
        image(M3, 400, 200, 100, 100);
        image(M3, 500, 200, 100, 100);
        image(M4, 600, 200, 100, 100);
        image(M4, 0, 300, 100, 100);
        image(M4, 100, 300, 100, 100);
        image(M5, 200, 300, 100, 100);
        image(M5, 300, 300, 100, 100);
        image(M5, 400, 300, 100, 100);
        image(M6, 500, 300, 100, 100);
        image(M1, 600, 300, 100, 100);
        image(M2, 0, 400, 100, 100);
        image(M2, 100, 400, 100, 100);
        image(M3, 200, 400, 100, 100);
        image(M3, 300, 400, 100, 100);
        image(M3, 400, 400, 100, 100);
        image(M4, 500, 400, 100, 100);
        image(M4, 600, 400, 100, 100);
        image(M4, 0, 500, 100, 100);
        image(M5, 100, 500, 100, 100);
        image(M5, 200, 500, 100, 100);
        image(M5, 300, 500, 100, 100);
        image(M6, 400, 500, 100, 100);
        image(M1, 500, 500, 100, 100);
        image(M2, 600, 500, 100, 100);
      }
      if (cropType == 20) {
        image(Par1, 0, 200, 100, 100);
        image(Par2, 100, 200, 100, 100);
        image(Par3, 200, 200, 100, 100);
        image(Par4, 300, 200, 100, 100);
        image(Par5, 400, 200, 100, 100);
        image(Par1, 500, 200, 100, 100);
        image(Par2, 600, 200, 100, 100);
        image(Par3, 0, 300, 100, 100);
        image(Par4, 100, 300, 100, 100);
        image(Par5, 200, 300, 100, 100);
        image(Par1, 300, 300, 100, 100);
        image(Par2, 400, 300, 100, 100);
        image(Par3, 500, 300, 100, 100);
        image(Par4, 600, 300, 100, 100);
        image(Par5, 0, 400, 100, 100);
        image(Par1, 100, 400, 100, 100);
        image(Par2, 200, 400, 100, 100);
        image(Par3, 300, 400, 100, 100);
        image(Par4, 400, 400, 100, 100);
        image(Par5, 500, 400, 100, 100);
        image(Par1, 600, 400, 100, 100);
        image(Par2, 0, 500, 100, 100);
        image(Par3, 100, 500, 100, 100);
        image(Par4, 200, 500, 100, 100);
        image(Par5, 300, 500, 100, 100);
        image(Par1, 400, 500, 100, 100);
        image(Par2, 500, 500, 100, 100);
        image(Par3, 600, 500, 100, 100);
      }
      if (cropType == 21) {
        image(Pop1, 0, 200, 100, 100);
        image(Pop2, 100, 200, 100, 100);
        image(Pop2, 200, 200, 100, 100);
        image(Pop3, 300, 200, 100, 100);
        image(Pop3, 400, 200, 100, 100);
        image(Pop4, 500, 200, 100, 100);
        image(Pop4, 600, 200, 100, 100);
        image(Pop5, 0, 300, 100, 100);
        image(Pop1, 100, 300, 100, 100);
        image(Pop2, 200, 300, 100, 100);
        image(Pop2, 300, 300, 100, 100);
        image(Pop3, 400, 300, 100, 100);
        image(Pop3, 500, 300, 100, 100);
        image(Pop4, 600, 300, 100, 100);
        image(Pop4, 0, 400, 100, 100);
        image(Pop5, 100, 400, 100, 100);
        image(Pop1, 200, 400, 100, 100);
        image(Pop2, 300, 400, 100, 100);
        image(Pop2, 400, 400, 100, 100);
        image(Pop3, 500, 400, 100, 100);
        image(Pop3, 600, 400, 100, 100);
        image(Pop4, 0, 500, 100, 100);
        image(Pop4, 100, 500, 100, 100);
        image(Pop5, 200, 500, 100, 100);
        image(Pop1, 300, 500, 100, 100);
        image(Pop2, 400, 500, 100, 100);
        image(Pop2, 500, 500, 100, 100);
        image(Pop3, 600, 500, 100, 100);
      }
      if (cropType == 22) {
        image(Pot1, 0, 200, 100, 100);
        image(Pot2, 100, 200, 100, 100);
        image(Pot3, 200, 200, 100, 100);
        image(Pot4, 300, 200, 100, 100);
        image(Pot4, 400, 200, 100, 100);
        image(Pot5, 500, 200, 100, 100);
        image(Pot6, 600, 200, 100, 100);
        image(Pot1, 0, 300, 100, 100);
        image(Pot2, 100, 300, 100, 100);
        image(Pot3, 200, 300, 100, 100);
        image(Pot4, 300, 300, 100, 100);
        image(Pot4, 400, 300, 100, 100);
        image(Pot5, 500, 300, 100, 100);
        image(Pot6, 600, 300, 100, 100);
        image(Pot1, 0, 400, 100, 100);
        image(Pot2, 100, 400, 100, 100);
        image(Pot3, 200, 400, 100, 100);
        image(Pot4, 300, 400, 100, 100);
        image(Pot4, 400, 400, 100, 100);
        image(Pot5, 500, 400, 100, 100);
        image(Pot6, 600, 400, 100, 100);
        image(Pot1, 0, 500, 100, 100);
        image(Pot2, 100, 500, 100, 100);
        image(Pot3, 200, 500, 100, 100);
        image(Pot4, 300, 500, 100, 100);
        image(Pot4, 400, 500, 100, 100);
        image(Pot5, 500, 500, 100, 100);
        image(Pot6, 600, 500, 100, 100);
      }
      if (cropType == 23) {
        image(Pum1, 0, 200, 100, 100);
        image(Pum2, 100, 200, 100, 100);
        image(Pum2, 200, 200, 100, 100);
        image(Pum3, 300, 200, 100, 100);
        image(Pum3, 400, 200, 100, 100);
        image(Pum3, 500, 200, 100, 100);
        image(Pum4, 600, 200, 100, 100);
        image(Pum4, 0, 300, 100, 100);
        image(Pum4, 100, 300, 100, 100);
        image(Pum4, 200, 300, 100, 100);
        image(Pum5, 300, 300, 100, 100);
        image(Pum5, 400, 300, 100, 100);
        image(Pum5, 500, 300, 100, 100);
        image(Pum6, 600, 300, 100, 100);
        image(Pum1, 0, 400, 100, 100);
        image(Pum2, 100, 400, 100, 100);
        image(Pum2, 200, 400, 100, 100);
        image(Pum3, 300, 400, 100, 100);
        image(Pum3, 400, 400, 100, 100);
        image(Pum3, 500, 400, 100, 100);
        image(Pum4, 600, 400, 100, 100);
        image(Pum4, 0, 500, 100, 100);
        image(Pum4, 100, 500, 100, 100);
        image(Pum4, 200, 500, 100, 100);
        image(Pum5, 300, 500, 100, 100);
        image(Pum5, 400, 500, 100, 100);
        image(Pum5, 500, 500, 100, 100);
        image(Pum6, 600, 500, 100, 100);
      }
      if (cropType == 24) {
        image(Ra1, 0, 200, 100, 100);
        image(Ra1, 100, 200, 100, 100);
        image(Ra2, 200, 200, 100, 100);
        image(Ra3, 300, 200, 100, 100);
        image(Ra3, 400, 200, 100, 100);
        image(Ra4, 500, 200, 100, 100);
        image(Ra5, 600, 200, 100, 100);
        image(Ra1, 0, 300, 100, 100);
        image(Ra1, 100, 300, 100, 100);
        image(Ra2, 200, 300, 100, 100);
        image(Ra3, 300, 300, 100, 100);
        image(Ra3, 400, 300, 100, 100);
        image(Ra4, 500, 300, 100, 100);
        image(Ra5, 600, 300, 100, 100);
        image(Ra1, 0, 400, 100, 100);
        image(Ra1, 100, 400, 100, 100);
        image(Ra2, 200, 400, 100, 100);
        image(Ra3, 300, 400, 100, 100);
        image(Ra3, 400, 400, 100, 100);
        image(Ra4, 500, 400, 100, 100);
        image(Ra5, 600, 400, 100, 100);
        image(Ra1, 0, 500, 100, 100);
        image(Ra1, 100, 500, 100, 100);
        image(Ra2, 200, 500, 100, 100);
        image(Ra3, 300, 500, 100, 100);
        image(Ra3, 400, 500, 100, 100);
        image(Ra4, 500, 500, 100, 100);
        image(Ra5, 600, 500, 100, 100);
      }
      if (cropType == 25) {
        image(RC1, 0, 200, 100, 100);
        image(RC1, 100, 200, 100, 100);
        image(RC2, 200, 200, 100, 100);
        image(RC3, 300, 200, 100, 100);
        image(RC3, 400, 200, 100, 100);
        image(RC4, 500, 200, 100, 100);
        image(RC4, 600, 200, 100, 100);
        image(RC5, 0, 300, 100, 100);
        image(RC5, 100, 300, 100, 100);
        image(RC6, 200, 300, 100, 100);
        image(RC1, 300, 300, 100, 100);
        image(RC1, 400, 300, 100, 100);
        image(RC2, 500, 300, 100, 100);
        image(RC3, 600, 300, 100, 100);
        image(RC3, 0, 400, 100, 100);
        image(RC4, 100, 400, 100, 100);
        image(RC4, 200, 400, 100, 100);
        image(RC5, 300, 400, 100, 100);
        image(RC5, 400, 400, 100, 100);
        image(RC6, 500, 400, 100, 100);
        image(RC1, 600, 400, 100, 100);
        image(RC1, 0, 500, 100, 100);
        image(RC2, 100, 500, 100, 100);
        image(RC3, 200, 500, 100, 100);
        image(RC3, 300, 500, 100, 100);
        image(RC4, 400, 500, 100, 100);
        image(RC4, 500, 500, 100, 100);
        image(RC5, 600, 500, 100, 100);
      }
      if (cropType == 26) {
        image(Rh1, 0, 200, 100, 100);
        image(Rh1, 100, 200, 100, 100);
        image(Rh2, 200, 200, 100, 100);
        image(Rh2, 300, 200, 100, 100);
        image(Rh3, 400, 200, 100, 100);
        image(Rh3, 500, 200, 100, 100);
        image(Rh4, 600, 200, 100, 100);
        image(Rh4, 0, 300, 100, 100);
        image(Rh4, 100, 300, 100, 100);
        image(Rh5, 200, 300, 100, 100);
        image(Rh5, 300, 300, 100, 100);
        image(Rh5, 400, 300, 100, 100);
        image(Rh5, 500, 300, 100, 100);
        image(Rh6, 600, 300, 100, 100);
        image(Rh1, 0, 400, 100, 100);
        image(Rh1, 100, 400, 100, 100);
        image(Rh2, 200, 400, 100, 100);
        image(Rh2, 300, 400, 100, 100);
        image(Rh3, 400, 400, 100, 100);
        image(Rh3, 500, 400, 100, 100);
        image(Rh4, 600, 400, 100, 100);
        image(Rh4, 0, 500, 100, 100);
        image(Rh4, 100, 500, 100, 100);
        image(Rh5, 200, 500, 100, 100);
        image(Rh5, 300, 500, 100, 100);
        image(Rh5, 400, 500, 100, 100);
        image(Rh5, 500, 500, 100, 100);
        image(Rh6, 600, 500, 100, 100);
      }
      if (cropType == 27) {
        image(Sta1, 0, 200, 100, 100);
        image(Sta1, 100, 200, 100, 100);
        image(Sta2, 200, 200, 100, 100);
        image(Sta2, 300, 200, 100, 100);
        image(Sta2, 400, 200, 100, 100);
        image(Sta3, 500, 200, 100, 100);
        image(Sta3, 600, 200, 100, 100);
        image(Sta4, 0, 300, 100, 100);
        image(Sta4, 100, 300, 100, 100);
        image(Sta4, 200, 300, 100, 100);
        image(Sta5, 300, 300, 100, 100);
        image(Sta5, 400, 300, 100, 100);
        image(Sta5, 500, 300, 100, 100);
        image(Sta6, 600, 300, 100, 100);
        image(Sta1, 0, 400, 100, 100);
        image(Sta1, 100, 400, 100, 100);
        image(Sta2, 200, 400, 100, 100);
        image(Sta2, 300, 400, 100, 100);
        image(Sta2, 400, 400, 100, 100);
        image(Sta3, 500, 400, 100, 100);
        image(Sta3, 600, 400, 100, 100);
        image(Sta4, 0, 500, 100, 100);
        image(Sta4, 100, 500, 100, 100);
        image(Sta4, 200, 500, 100, 100);
        image(Sta5, 300, 500, 100, 100);
        image(Sta5, 400, 500, 100, 100);
        image(Sta5, 500, 500, 100, 100);
        image(Sta6, 600, 500, 100, 100);
      }
      if (cropType == 28) {
        image(Str1, 0, 200, 100, 100);
        image(Str2, 100, 200, 100, 100);
        image(Str3, 200, 200, 100, 100);
        image(Str3, 300, 200, 100, 100);
        image(Str4, 400, 200, 100, 100);
        image(Str4, 500, 200, 100, 100);
        image(Str5, 600, 200, 100, 100);
        image(Str5, 0, 300, 100, 100);
        image(Str6, 100, 300, 100, 100);
        image(Str7, 200, 300, 100, 100);
        image(Str7, 300, 300, 100, 100);
        image(Str7, 400, 300, 100, 100);
        image(Str6, 500, 300, 100, 100);
        image(Str7, 600, 300, 100, 100);
        image(Str7, 0, 400, 100, 100);
        image(Str7, 100, 400, 100, 100);
        image(Str6, 200, 400, 100, 100);
        image(Str7, 300, 400, 100, 100);
        image(Str7, 400, 400, 100, 100);
        image(Str7, 500, 400, 100, 100);
        image(Str6, 600, 400, 100, 100);
        image(Str7, 0, 500, 100, 100);
        image(Str7, 100, 500, 100, 100);
        image(Str7, 200, 500, 100, 100);
        image(Str6, 300, 500, 100, 100);
        image(Str7, 400, 500, 100, 100);
        image(Str7, 500, 500, 100, 100);
        image(Str7, 600, 500, 100, 100);
      }
      if (cropType == 29) {
        image(SS1, 0, 200, 100, 100);
        image(SS2, 100, 200, 100, 100);
        image(SS2, 200, 200, 100, 100);
        image(SS3, 300, 200, 100, 100);
        image(SS3, 400, 200, 100, 100);
        image(SS3, 500, 200, 100, 100);
        image(SS4, 600, 200, 100, 100);
        image(SS4, 0, 300, 100, 100);
        image(SS5, 100, 300, 100, 100);
        image(SS1, 200, 300, 100, 100);
        image(SS2, 300, 300, 100, 100);
        image(SS2, 400, 300, 100, 100);
        image(SS3, 500, 300, 100, 100);
        image(SS3, 600, 300, 100, 100);
        image(SS3, 0, 400, 100, 100);
        image(SS4, 100, 400, 100, 100);
        image(SS4, 200, 400, 100, 100);
        image(SS5, 300, 400, 100, 100);
        image(SS1, 400, 400, 100, 100);
        image(SS2, 500, 400, 100, 100);
        image(SS2, 600, 400, 100, 100);
        image(SS3, 0, 500, 100, 100);
        image(SS3, 100, 500, 100, 100);
        image(SS3, 200, 500, 100, 100);
        image(SS4, 300, 500, 100, 100);
        image(SS4, 400, 500, 100, 100);
        image(SS5, 500, 500, 100, 100);
        image(SS1, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su1, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su2, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su3, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su4, 0, 300, 100, 100);
        image(Su5, 100, 300, 100, 100);
        image(Su1, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su2, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su3, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su4, 200, 400, 100, 100);
        image(Su5, 300, 400, 100, 100);
        image(Su1, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su2, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su3, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su4, 400, 500, 100, 100);
        image(Su5, 500, 500, 100, 100);
        image(Su1, 600, 500, 100, 100);
      }
      if (cropType == 31) {
        image(To1, 0, 200, 100, 100);
        image(To1, 100, 200, 100, 100);
        image(To2, 200, 200, 100, 100);
        image(To2, 300, 200, 100, 100);
        image(To3, 400, 200, 100, 100);
        image(To3, 500, 200, 100, 100);
        image(To4, 600, 200, 100, 100);
        image(To4, 0, 300, 100, 100);
        image(To5, 100, 300, 100, 100);
        image(To5, 200, 300, 100, 100);
        image(To5, 300, 300, 100, 100);
        image(To6, 400, 300, 100, 100);
        image(To7, 500, 300, 100, 100);
        image(To7, 600, 300, 100, 100);
        image(To7, 0, 400, 100, 100);
        image(To6, 100, 400, 100, 100);
        image(To7, 200, 400, 100, 100);
        image(To7, 300, 400, 100, 100);
        image(To7, 400, 400, 100, 100);
        image(To6, 500, 400, 100, 100);
        image(To7, 600, 400, 100, 100);
        image(To7, 0, 500, 100, 100);
        image(To7, 100, 500, 100, 100);
        image(To6, 200, 500, 100, 100);
        image(To7, 300, 500, 100, 100);
        image(To7, 400, 500, 100, 100);
        image(To7, 500, 500, 100, 100);
        image(To6, 600, 500, 100, 100);
      }
      if (cropType == 32) {
        image(Tu1, 0, 200, 100, 100);
        image(Tu2, 100, 200, 100, 100);
        image(Tu3, 200, 200, 100, 100);
        image(Tu3, 300, 200, 100, 100);
        image(Tu4, 400, 200, 100, 100);
        image(Tu4, 500, 200, 100, 100);
        image(Tu5, 600, 200, 100, 100);
        image(Tu1, 0, 300, 100, 100);
        image(Tu2, 100, 300, 100, 100);
        image(Tu3, 200, 300, 100, 100);
        image(Tu3, 300, 300, 100, 100);
        image(Tu4, 400, 300, 100, 100);
        image(Tu4, 500, 300, 100, 100);
        image(Tu5, 600, 300, 100, 100);
        image(Tu1, 0, 400, 100, 100);
        image(Tu2, 100, 400, 100, 100);
        image(Tu3, 200, 400, 100, 100);
        image(Tu3, 300, 400, 100, 100);
        image(Tu4, 400, 400, 100, 100);
        image(Tu4, 500, 400, 100, 100);
        image(Tu5, 600, 400, 100, 100);
        image(Tu1, 0, 500, 100, 100);
        image(Tu2, 100, 500, 100, 100);
        image(Tu3, 200, 500, 100, 100);
        image(Tu3, 300, 500, 100, 100);
        image(Tu4, 400, 500, 100, 100);
        image(Tu4, 500, 500, 100, 100);
        image(Tu5, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR2, 200, 200, 100, 100);
        image(UmR3, 300, 200, 100, 100);
        image(UmR3, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR4, 600, 200, 100, 100);
        image(UmR4, 0, 300, 100, 100);
        image(UmR5, 100, 300, 100, 100);
        image(UmR1, 200, 300, 100, 100);
        image(UmR2, 300, 300, 100, 100);
        image(UmR2, 400, 300, 100, 100);
        image(UmR3, 500, 300, 100, 100);
        image(UmR3, 600, 300, 100, 100);
        image(UmR4, 0, 400, 100, 100);
        image(UmR4, 100, 400, 100, 100);
        image(UmR4, 200, 400, 100, 100);
        image(UmR5, 300, 400, 100, 100);
        image(UmR1, 400, 400, 100, 100);
        image(UmR2, 500, 400, 100, 100);
        image(UmR2, 600, 400, 100, 100);
        image(UmR3, 0, 500, 100, 100);
        image(UmR3, 100, 500, 100, 100);
        image(UmR4, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR5, 500, 500, 100, 100);
        image(UmR1, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W1, 0, 200, 100, 100);
        image(W2, 100, 200, 100, 100);
        image(W3, 200, 200, 100, 100);
        image(W4, 300, 200, 100, 100);
        image(W5, 400, 200, 100, 100);
        image(W1, 500, 200, 100, 100);
        image(W2, 600, 200, 100, 100);
        image(W3, 0, 300, 100, 100);
        image(W4, 100, 300, 100, 100);
        image(W5, 200, 300, 100, 100);
        image(W1, 300, 300, 100, 100);
        image(W2, 400, 300, 100, 100);
        image(W3, 500, 300, 100, 100);
        image(W4, 600, 300, 100, 100);
        image(W5, 0, 400, 100, 100);
        image(W1, 100, 400, 100, 100);
        image(W2, 200, 400, 100, 100);
        image(W3, 300, 400, 100, 100);
        image(W4, 400, 400, 100, 100);
        image(W5, 500, 400, 100, 100);
        image(W1, 600, 400, 100, 100);
        image(W2, 0, 500, 100, 100);
        image(W3, 100, 500, 100, 100);
        image(W4, 200, 500, 100, 100);
        image(W5, 300, 500, 100, 100);
        image(W1, 400, 500, 100, 100);
        image(W2, 500, 500, 100, 100);
        image(W3, 600, 500, 100, 100);
      }
      if (cropType == 35) {
        image(Y1, 0, 200, 100, 100);
        image(Y2, 100, 200, 100, 100);
        image(Y2, 200, 200, 100, 100);
        image(Y2, 300, 200, 100, 100);
        image(Y3, 400, 200, 100, 100);
        image(Y3, 500, 200, 100, 100);
        image(Y3, 600, 200, 100, 100);
        image(Y4, 0, 300, 100, 100);
        image(Y4, 100, 300, 100, 100);
        image(Y4, 200, 300, 100, 100);
        image(Y5, 300, 300, 100, 100);
        image(Y1, 400, 300, 100, 100);
        image(Y2, 500, 300, 100, 100);
        image(Y2, 600, 300, 100, 100);
        image(Y2, 0, 400, 100, 100);
        image(Y3, 100, 400, 100, 100);
        image(Y3, 200, 400, 100, 100);
        image(Y3, 300, 400, 100, 100);
        image(Y4, 400, 400, 100, 100);
        image(Y4, 500, 400, 100, 100);
        image(Y4, 600, 400, 100, 100);
        image(Y5, 0, 500, 100, 100);
        image(Y1, 100, 500, 100, 100);
        image(Y2, 200, 500, 100, 100);
        image(Y2, 300, 500, 100, 100);
        image(Y2, 400, 500, 100, 100);
        image(Y3, 500, 500, 100, 100);
        image(Y3, 600, 500, 100, 100);
      }
    }
    if (cropCalendarDASGtype2) {
      if (cropType == 8) {
        image(CB6, 0, 200, 100, 100);
        image(CB7, 100, 200, 100, 100);
        image(CB6, 200, 200, 100, 100);
        image(CB7, 300, 200, 100, 100);
        image(CB6, 400, 200, 100, 100);
        image(CB7, 500, 200, 100, 100);
        image(CB6, 600, 200, 100, 100);
        image(CB7, 0, 300, 100, 100);
        image(CB6, 100, 300, 100, 100);
        image(CB7, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co7, 0, 200, 100, 100);
        image(Co7, 100, 200, 100, 100);
        image(Co6, 200, 200, 100, 100);
        image(Co7, 300, 200, 100, 100);
        image(Co7, 400, 200, 100, 100);
        image(Co7, 500, 200, 100, 100);
        image(Co6, 600, 200, 100, 100);
        image(Co7, 0, 300, 100, 100);
        image(Co7, 100, 300, 100, 100);
        image(Co7, 200, 300, 100, 100);
        image(Co6, 300, 300, 100, 100);
        image(Co7, 400, 300, 100, 100);
        image(Co7, 500, 300, 100, 100);
        image(Co7, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su2, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su3, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su4, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su5, 0, 300, 100, 100);
        image(Su1, 100, 300, 100, 100);
        image(Su2, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su3, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su4, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su5, 200, 400, 100, 100);
        image(Su1, 300, 400, 100, 100);
        image(Su2, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su3, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su4, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su5, 400, 500, 100, 100);
        image(Su1, 500, 500, 100, 100);
        image(Su2, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR3, 200, 200, 100, 100);
        image(UmR4, 300, 200, 100, 100);
        image(UmR4, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR5, 600, 200, 100, 100);
        image(UmR1, 0, 300, 100, 100);
        image(UmR2, 100, 300, 100, 100);
        image(UmR3, 200, 300, 100, 100);
        image(UmR4, 300, 300, 100, 100);
        image(UmR4, 400, 300, 100, 100);
        image(UmR4, 500, 300, 100, 100);
        image(UmR5, 600, 300, 100, 100);
        image(UmR1, 0, 400, 100, 100);
        image(UmR2, 100, 400, 100, 100);
        image(UmR3, 200, 400, 100, 100);
        image(UmR4, 300, 400, 100, 100);
        image(UmR4, 400, 400, 100, 100);
        image(UmR4, 500, 400, 100, 100);
        image(UmR5, 600, 400, 100, 100);
        image(UmR1, 0, 500, 100, 100);
        image(UmR2, 100, 500, 100, 100);
        image(UmR3, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR4, 500, 500, 100, 100);
        image(UmR5, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W4, 0, 200, 100, 100);
        image(W5, 100, 200, 100, 100);
        image(W1, 200, 200, 100, 100);
        image(W2, 300, 200, 100, 100);
        image(W3, 400, 200, 100, 100);
        image(W4, 500, 200, 100, 100);
        image(W5, 600, 200, 100, 100);
        image(W1, 0, 300, 100, 100);
        image(W2, 100, 300, 100, 100);
        image(W3, 200, 300, 100, 100);
        image(W4, 300, 300, 100, 100);
        image(W5, 400, 300, 100, 100);
        image(W1, 500, 300, 100, 100);
        image(W2, 600, 300, 100, 100);
        image(W3, 0, 400, 100, 100);
        image(W4, 100, 400, 100, 100);
        image(W5, 200, 400, 100, 100);
        image(W1, 300, 400, 100, 100);
        image(W1, 400, 400, 100, 100);
        image(W2, 500, 400, 100, 100);
        image(W3, 600, 400, 100, 100);
        image(W4, 0, 500, 100, 100);
        image(W5, 100, 500, 100, 100);
        image(W1, 200, 500, 100, 100);
        image(W2, 300, 500, 100, 100);
        image(W3, 400, 500, 100, 100);
        image(W4, 500, 500, 100, 100);
        image(W5, 600, 500, 100, 100);
      }
    }
    if (cropType == 8 || cropType == 9 || cropType == 30 || cropType == 33 || cropType == 34) {
      if (keyPressed) {
        if (key == CODED) {
          if (keyCode == SHIFT) {
            cropCalendarDASGtype2 = true;
            cropCalendarDASGtype1 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
          if (keyCode == CONTROL) {
            cropCalendarDASGtype1 = true;
            cropCalendarDASGtype2 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
        }
      }
    }
    if (keyPressed) {
      if (key == 'V' || key == 'v') {
        cropSelect = true;
        cropCalendarDASG = false;
        fill(0);
        rect(0, 0, 700, 600);
      }
      if (key == 'C' || key == 'c') {
        cropCalendarDASG = false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalculator = true;
      }
      if(key == '1') {
        cropCalendarDASG = false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalendarN = true;
      }
    }
  }
}*/
/*void CalendarmodeDDSG() {
  if (cropCalendarDDSG == true) {
    //first done
    //build
    stroke(255);
    for (int i = 100; i < 600; i += 100) {
      line(0, i, 700, i);
    }
    for (int i = 100; i < 700; i += 100) {
      line(i, 100, i, 600);
    }
    //text
    fill(255);
    textSize(32);
    text("Mon", 20, 200);
    text("Tue", 120, 200);
    text("Wed", 220, 200);
    text("Thu", 320, 200);
    text("Fri", 420, 200);
    text("Sat", 520, 200);
    text("Sun", 620, 200);
    if (cropCalendarDDSGtype1) {
      if (cropType == 1) {
        image(Am1, 0, 200, 100, 100);
        image(Am2, 100, 200, 100, 100);
        image(Am2, 200, 200, 100, 100);
        image(Am3, 300, 200, 100, 100);
        image(Am3, 400, 200, 100, 100);
        image(Am4, 500, 200, 100, 100);
        image(Am4, 600, 200, 100, 100);
        image(Am5, 0, 300, 100, 100);
        image(Am2, 100, 300, 100, 100);
        image(Am2, 200, 300, 100, 100);
        image(Am3, 300, 300, 100, 100);
        image(Am3, 400, 300, 100, 100);
        image(Am4, 500, 300, 100, 100);
        image(Am4, 600, 300, 100, 100);
        image(Am5, 0, 400, 100, 100);
        image(Am2, 100, 400, 100, 100);
        image(Am2, 200, 400, 100, 100);
        image(Am3, 300, 400, 100, 100);
        image(Am3, 400, 400, 100, 100);
        image(Am4, 500, 400, 100, 100);
        image(Am4, 600, 400, 100, 100);
        image(Am5, 0, 500, 100, 100);
        image(Am2, 100, 500, 100, 100);
        image(Am2, 200, 500, 100, 100);
        image(Am3, 300, 500, 100, 100);
        image(Am3, 400, 500, 100, 100);
        image(Am4, 500, 500, 100, 100);
        image(Am4, 600, 500, 100, 100);
      }
      if (cropType == 2) {
        image(Ar1, 0, 200, 100, 100);
        image(Ar1, 100, 200, 100, 100);
        image(Ar2, 200, 200, 100, 100);
        image(Ar2, 300, 200, 100, 100);
        image(Ar3, 400, 200, 100, 100);
        image(Ar4, 500, 200, 100, 100);
        image(Ar4, 600, 200, 100, 100);
        image(Ar5, 0, 300, 100, 100);
        image(Ar6, 100, 300, 100, 100);
        image(Ar1, 200, 300, 100, 100);
        image(Ar1, 300, 300, 100, 100);
        image(Ar2, 400, 300, 100, 100);
        image(Ar2, 500, 300, 100, 100);
        image(Ar3, 600, 300, 100, 100);
        image(Ar4, 0, 400, 100, 100);
        image(Ar4, 100, 400, 100, 100);
        image(Ar5, 200, 400, 100, 100);
        image(Ar6, 300, 400, 100, 100);
        image(Ar1, 400, 400, 100, 100);
        image(Ar1, 500, 400, 100, 100);
        image(Ar2, 600, 400, 100, 100);
        image(Ar2, 0, 500, 100, 100);
        image(Ar3, 100, 500, 100, 100);
        image(Ar4, 200, 500, 100, 100);
        image(Ar4, 300, 500, 100, 100);
        image(Ar5, 400, 500, 100, 100);
        image(Ar6, 500, 500, 100, 100);
        image(Ar1, 600, 500, 100, 100);
      }
      if (cropType == 3) {
        image(Be1, 0, 200, 100, 100);
        image(Be2, 100, 200, 100, 100);
        image(Be3, 200, 200, 100, 100);
        image(Be3, 300, 200, 100, 100);
        image(Be4, 400, 200, 100, 100);
        image(Be4, 500, 200, 100, 100);
        image(Be5, 600, 200, 100, 100);
        image(Be1, 0, 300, 100, 100);
        image(Be2, 100, 300, 100, 100);
        image(Be3, 200, 300, 100, 100);
        image(Be3, 300, 300, 100, 100);
        image(Be4, 400, 300, 100, 100);
        image(Be4, 500, 300, 100, 100);
        image(Be5, 600, 300, 100, 100);
        image(Be1, 0, 400, 100, 100);
        image(Be2, 100, 400, 100, 100);
        image(Be3, 200, 400, 100, 100);
        image(Be3, 300, 400, 100, 100);
        image(Be4, 400, 400, 100, 100);
        image(Be4, 500, 400, 100, 100);
        image(Be5, 600, 400, 100, 100);
        image(Be1, 0, 500, 100, 100);
        image(Be2, 100, 500, 100, 100);
        image(Be3, 200, 500, 100, 100);
        image(Be3, 300, 500, 100, 100);
        image(Be4, 400, 500, 100, 100);
        image(Be4, 500, 500, 100, 100);
        image(Be5, 600, 500, 100, 100);
      }
      if (cropType == 4) {
        image(Bl1, 0, 200, 100, 100);
        image(Bl2, 100, 200, 100, 100);
        image(Bl2, 200, 200, 100, 100);
        image(Bl2, 300, 200, 100, 100);
        image(Bl3, 400, 200, 100, 100);
        image(Bl3, 500, 200, 100, 100);
        image(Bl3, 600, 200, 100, 100);
        image(Bl4, 0, 300, 100, 100);
        image(Bl4, 100, 300, 100, 100);
        image(Bl4, 200, 300, 100, 100);
        image(Bl4, 300, 300, 100, 100);
        image(Bl5, 400, 300, 100, 100);
        image(Bl5, 500, 300, 100, 100);
        image(Bl6, 600, 300, 100, 100);
        image(Bl7, 0, 400, 100, 100);
        image(Bl7, 100, 400, 100, 100);
        image(Bl7, 200, 400, 100, 100);
        image(Bl6, 300, 400, 100, 100);
        image(Bl7, 400, 400, 100, 100);
        image(Bl7, 500, 400, 100, 100);
        image(Bl7, 600, 400, 100, 100);
        image(Bl6, 0, 500, 100, 100);
        image(Bl7, 100, 500, 100, 100);
        image(Bl7, 200, 500, 100, 100);
        image(Bl7, 300, 500, 100, 100);
        image(Bl6, 400, 500, 100, 100);
        image(Bl7, 500, 500, 100, 100);
        image(Bl7, 600, 500, 100, 100);
      }
      if (cropType == 5) {
        image(BJ1, 0, 200, 100, 100);
        image(BJ2, 100, 200, 100, 100);
        image(BJ2, 200, 200, 100, 100);
        image(BJ3, 300, 200, 100, 100);
        image(BJ3, 400, 200, 100, 100);
        image(BJ4, 500, 200, 100, 100);
        image(BJ4, 600, 200, 100, 100);
        image(BJ5, 0, 300, 100, 100);
        image(BJ1, 100, 300, 100, 100);
        image(BJ2, 200, 300, 100, 100);
        image(BJ2, 300, 300, 100, 100);
        image(BJ3, 400, 300, 100, 100);
        image(BJ3, 500, 300, 100, 100);
        image(BJ4, 600, 300, 100, 100);
        image(BJ4, 0, 400, 100, 100);
        image(BJ5, 100, 400, 100, 100);
        image(BJ1, 200, 400, 100, 100);
        image(BJ2, 300, 400, 100, 100);
        image(BJ2, 400, 400, 100, 100);
        image(BJ3, 500, 400, 100, 100);
        image(BJ3, 600, 400, 100, 100);
        image(BJ4, 0, 500, 100, 100);
        image(BJ4, 100, 500, 100, 100);
        image(BJ5, 200, 500, 100, 100);
        image(BJ1, 300, 500, 100, 100);
        image(BJ2, 400, 500, 100, 100);
        image(BJ2, 500, 500, 100, 100);
        image(BJ3, 600, 500, 100, 100);
      }
      if (cropType == 6) {
        image(BC1, 0, 200, 100, 100);
        image(BC2, 100, 200, 100, 100);
        image(BC3, 200, 200, 100, 100);
        image(BC4, 300, 200, 100, 100);
        image(BC5, 400, 200, 100, 100);
        image(BC1, 500, 200, 100, 100);
        image(BC2, 600, 200, 100, 100);
        image(BC3, 0, 300, 100, 100);
        image(BC4, 100, 300, 100, 100);
        image(BC5, 200, 300, 100, 100);
        image(BC1, 300, 300, 100, 100);
        image(BC2, 400, 300, 100, 100);
        image(BC3, 500, 300, 100, 100);
        image(BC4, 600, 300, 100, 100);
        image(BC5, 0, 400, 100, 100);
        image(BC1, 100, 400, 100, 100);
        image(BC2, 200, 400, 100, 100);
        image(BC3, 300, 400, 100, 100);
        image(BC4, 400, 400, 100, 100);
        image(BC5, 500, 400, 100, 100);
        image(BC1, 600, 400, 100, 100);
        image(BC2, 0, 500, 100, 100);
        image(BC3, 100, 500, 100, 100);
        image(BC4, 200, 500, 100, 100);
        image(BC5, 300, 500, 100, 100);
        image(BC1, 400, 500, 100, 100);
        image(BC2, 500, 500, 100, 100);
        image(BC3, 600, 500, 100, 100);
      }
      if (cropType == 7) {
        image(Ca1, 0, 200, 100, 100);
        image(Ca2, 100, 200, 100, 100);
        image(Ca2, 200, 200, 100, 100);
        image(Ca3, 300, 200, 100, 100);
        image(Ca3, 400, 200, 100, 100);
        image(Ca3, 500, 200, 100, 100);
        image(Ca3, 600, 200, 100, 100);
        image(Ca4, 0, 300, 100, 100);
        image(Ca4, 100, 300, 100, 100);
        image(Ca4, 200, 300, 100, 100);
        image(Ca4, 300, 300, 100, 100);
        image(Ca5, 400, 300, 100, 100);
        image(Ca6, 500, 300, 100, 100);
        image(Ca1, 600, 300, 100, 100);
        image(Ca2, 0, 400, 100, 100);
        image(Ca2, 100, 400, 100, 100);
        image(Ca3, 200, 400, 100, 100);
        image(Ca3, 300, 400, 100, 100);
        image(Ca3, 400, 400, 100, 100);
        image(Ca3, 500, 400, 100, 100);
        image(Ca4, 600, 400, 100, 100);
        image(Ca4, 0, 500, 100, 100);
        image(Ca4, 100, 500, 100, 100);
        image(Ca4, 200, 500, 100, 100);
        image(Ca5, 300, 500, 100, 100);
        image(Ca6, 400, 500, 100, 100);
        image(Ca1, 500, 500, 100, 100);
        image(Ca2, 600, 500, 100, 100);
      }
      if (cropType == 8) {
        image(CB1, 0, 200, 100, 100);
        image(CB2, 100, 200, 100, 100);
        image(CB2, 200, 200, 100, 100);
        image(CB3, 300, 200, 100, 100);
        image(CB3, 400, 200, 100, 100);
        image(CB4, 500, 200, 100, 100);
        image(CB4, 600, 200, 100, 100);
        image(CB4, 0, 300, 100, 100);
        image(CB5, 100, 300, 100, 100);
        image(CB5, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co1, 0, 200, 100, 100);
        image(Co1, 100, 200, 100, 100);
        image(Co2, 200, 200, 100, 100);
        image(Co2, 300, 200, 100, 100);
        image(Co2, 400, 200, 100, 100);
        image(Co3, 500, 200, 100, 100);
        image(Co3, 600, 200, 100, 100);
        image(Co3, 0, 300, 100, 100);
        image(Co4, 100, 300, 100, 100);
        image(Co4, 200, 300, 100, 100);
        image(Co4, 300, 300, 100, 100);
        image(Co5, 400, 300, 100, 100);
        image(Co5, 500, 300, 100, 100);
        image(Co5, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 10) {
        image(Cr1, 0, 200, 100, 100);
        image(Cr2, 100, 200, 100, 100);
        image(Cr2, 200, 200, 100, 100);
        image(Cr3, 300, 200, 100, 100);
        image(Cr4, 400, 200, 100, 100);
        image(Cr5, 500, 200, 100, 100);
        image(Cr5, 600, 200, 100, 100);
        image(Cr6, 0, 300, 100, 100);
        image(Cr7, 100, 300, 100, 100);
        image(Cr7, 200, 300, 100, 100);
        image(Cr7, 300, 300, 100, 100);
        image(Cr7, 400, 300, 100, 100);
        image(Cr6, 500, 300, 100, 100);
        image(Cr7, 600, 300, 100, 100);
        image(Cr7, 0, 400, 100, 100);
        image(Cr7, 100, 400, 100, 100);
        image(Cr7, 200, 400, 100, 100);
        image(Cr6, 300, 400, 100, 100);
        image(Cr7, 400, 400, 100, 100);
        image(Cr7, 500, 400, 100, 100);
        image(Cr7, 600, 400, 100, 100);
        image(Cr7, 0, 500, 100, 100);
        image(Cr6, 100, 500, 100, 100);
        image(Cr7, 200, 500, 100, 100);
        image(Cr7, 300, 500, 100, 100);
        image(Cr7, 400, 500, 100, 100);
        image(Cr7, 500, 500, 100, 100);
        image(Cr6, 600, 500, 100, 100);
      }
      if (cropType == 11) {
        image(E1, 0, 200, 100, 100);
        image(E2, 100, 200, 100, 100);
        image(E3, 200, 200, 100, 100);
        image(E4, 300, 200, 100, 100);
        image(E5, 400, 200, 100, 100);
        image(E6, 500, 200, 100, 100);
        image(E1, 600, 200, 100, 100);
        image(E2, 0, 300, 100, 100);
        image(E3, 100, 300, 100, 100);
        image(E4, 200, 300, 100, 100);
        image(E5, 300, 300, 100, 100);
        image(E6, 400, 300, 100, 100);
        image(E1, 500, 300, 100, 100);
        image(E2, 600, 300, 100, 100);
        image(E3, 0, 400, 100, 100);
        image(E4, 100, 400, 100, 100);
        image(E5, 200, 400, 100, 100);
        image(E6, 300, 400, 100, 100);
        image(E1, 400, 400, 100, 100);
        image(E2, 500, 400, 100, 100);
        image(E3, 600, 400, 100, 100);
        image(E4, 0, 500, 100, 100);
        image(E5, 100, 500, 100, 100);
        image(E6, 200, 500, 100, 100);
        image(E1, 300, 500, 100, 100);
        image(E2, 400, 500, 100, 100);
        image(E3, 500, 500, 100, 100);
        image(E4, 600, 500, 100, 100);
      }
      if (cropType == 12) {
        image(FR1, 0, 200, 100, 100);
        image(FR2, 100, 200, 100, 100);
        image(FR2, 200, 200, 100, 100);
        image(FR2, 300, 200, 100, 100);
        image(FR2, 400, 200, 100, 100);
        image(FR3, 500, 200, 100, 100);
        image(FR3, 600, 200, 100, 100);
        image(FR3, 0, 300, 100, 100);
        image(FR3, 100, 300, 100, 100);
        image(FR4, 200, 300, 100, 100);
        image(FR4, 300, 300, 100, 100);
        image(FR4, 400, 300, 100, 100);
        image(FR5, 500, 300, 100, 100);
        image(FR1, 600, 300, 100, 100);
        image(FR2, 0, 400, 100, 100);
        image(FR2, 100, 400, 100, 100);
        image(FR2, 200, 400, 100, 100);
        image(FR2, 300, 400, 100, 100);
        image(FR3, 400, 400, 100, 100);
        image(FR3, 500, 400, 100, 100);
        image(FR3, 600, 400, 100, 100);
        image(FR3, 0, 500, 100, 100);
        image(FR4, 100, 500, 100, 100);
        image(FR4, 200, 500, 100, 100);
        image(FR4, 300, 500, 100, 100);
        image(FR5, 400, 500, 100, 100);
        image(FR1, 500, 500, 100, 100);
        image(FR2, 600, 500, 100, 100);
      }
      if (cropType == 13) {
        image(Ga1, 0, 200, 100, 100);
        image(Ga2, 100, 200, 100, 100);
        image(Ga3, 200, 200, 100, 100);
        image(Ga4, 300, 200, 100, 100);
        image(Ga5, 400, 200, 100, 100);
        image(Ga1, 500, 200, 100, 100);
        image(Ga2, 600, 200, 100, 100);
        image(Ga3, 0, 300, 100, 100);
        image(Ga4, 100, 300, 100, 100);
        image(Ga5, 200, 300, 100, 100);
        image(Ga1, 300, 300, 100, 100);
        image(Ga2, 400, 300, 100, 100);
        image(Ga3, 500, 300, 100, 100);
        image(Ga4, 600, 300, 100, 100);
        image(Ga5, 0, 400, 100, 100);
        image(Ga1, 100, 400, 100, 100);
        image(Ga2, 200, 400, 100, 100);
        image(Ga3, 300, 400, 100, 100);
        image(Ga4, 400, 400, 100, 100);
        image(Ga5, 500, 400, 100, 100);
        image(Ga1, 600, 400, 100, 100);
        image(Ga2, 0, 500, 100, 100);
        image(Ga3, 100, 500, 100, 100);
        image(Ga4, 200, 500, 100, 100);
        image(Ga5, 300, 500, 100, 100);
        image(Ga1, 400, 500, 100, 100);
        image(Ga2, 500, 500, 100, 100);
        image(Ga3, 600, 500, 100, 100);
      }
      if (cropType == 14) {
        image(GB1, 0, 200, 100, 100);
        image(GB2, 100, 200, 100, 100);
        image(GB3, 200, 200, 100, 100);
        image(GB4, 300, 200, 100, 100);
        image(GB4, 400, 200, 100, 100);
        image(GB4, 500, 200, 100, 100);
        image(GB5, 600, 200, 100, 100);
        image(GB5, 0, 300, 100, 100);
        image(GB5, 100, 300, 100, 100);
        image(GB5, 200, 300, 100, 100);
        image(GB6, 300, 300, 100, 100);
        image(GB7, 400, 300, 100, 100);
        image(GB7, 500, 300, 100, 100);
        image(GB6, 600, 300, 100, 100);
        image(GB7, 0, 400, 100, 100);
        image(GB7, 100, 400, 100, 100);
        image(GB6, 200, 400, 100, 100);
        image(GB7, 300, 400, 100, 100);
        image(GB7, 400, 400, 100, 100);
        image(GB6, 500, 400, 100, 100);
        image(GB7, 600, 400, 100, 100);
        image(GB7, 0, 500, 100, 100);
        image(GB6, 100, 500, 100, 100);
        image(GB7, 200, 500, 100, 100);
        image(GB7, 300, 500, 100, 100);
        image(GB6, 400, 500, 100, 100);
        image(GB7, 500, 500, 100, 100);
        image(GB7, 600, 500, 100, 100);
      }
      if (cropType == 15) {
        image(Gr1, 0, 200, 100, 100);
        image(Gr2, 100, 200, 100, 100);
        image(Gr3, 200, 200, 100, 100);
        image(Gr3, 300, 200, 100, 100);
        image(Gr4, 400, 200, 100, 100);
        image(Gr4, 500, 200, 100, 100);
        image(Gr4, 600, 200, 100, 100);
        image(Gr5, 0, 300, 100, 100);
        image(Gr5, 100, 300, 100, 100);
        image(Gr5, 200, 300, 100, 100);
        image(Gr6, 300, 300, 100, 100);
        image(Gr7, 400, 300, 100, 100);
        image(Gr7, 500, 300, 100, 100);
        image(Gr6, 600, 300, 100, 100);
        image(Gr7, 0, 400, 100, 100);
        image(Gr7, 100, 400, 100, 100);
        image(Gr6, 200, 400, 100, 100);
        image(Gr7, 300, 400, 100, 100);
        image(Gr7, 400, 400, 100, 100);
        image(Gr6, 500, 400, 100, 100);
        image(Gr7, 600, 400, 100, 100);
        image(Gr7, 0, 500, 100, 100);
        image(Gr6, 100, 500, 100, 100);
        image(Gr7, 200, 500, 100, 100);
        image(Gr7, 300, 500, 100, 100);
        image(Gr6, 400, 500, 100, 100);
        image(Gr7, 500, 500, 100, 100);
        image(Gr7, 600, 500, 100, 100);
      }
      if (cropType == 16) {
        image(H1, 0, 200, 100, 100);
        image(H2, 100, 200, 100, 100);
        image(H3, 200, 200, 100, 100);
        image(H3, 300, 200, 100, 100);
        image(H4, 400, 200, 100, 100);
        image(H4, 500, 200, 100, 100);
        image(H4, 600, 200, 100, 100);
        image(H5, 0, 300, 100, 100);
        image(H5, 100, 300, 100, 100);
        image(H5, 200, 300, 100, 100);
        image(H5, 300, 300, 100, 100);
        image(H6, 400, 300, 100, 100);
        image(H6, 500, 300, 100, 100);
        image(H6, 600, 300, 100, 100);
        image(H6, 0, 400, 100, 100);
        image(H6, 100, 400, 100, 100);
        image(H6, 200, 400, 100, 100);
        image(H6, 300, 400, 100, 100);
        image(H6, 400, 400, 100, 100);
        image(H6, 500, 400, 100, 100);
        image(H6, 600, 400, 100, 100);
        image(H6, 0, 500, 100, 100);
        image(H6, 100, 500, 100, 100);
        image(H6, 200, 500, 100, 100);
        image(H6, 300, 500, 100, 100);
        image(H6, 400, 500, 100, 100);
        image(H6, 500, 500, 100, 100);
        image(H6, 600, 500, 100, 100);
      }
      if (cropType == 17) {
        image(HP1, 0, 200, 100, 100);
        image(HP2, 100, 200, 100, 100);
        image(HP3, 200, 200, 100, 100);
        image(HP4, 300, 200, 100, 100);
        image(HP5, 400, 200, 100, 100);
        image(HP6, 500, 200, 100, 100);
        image(HP7, 600, 200, 100, 100);
        image(HP7, 0, 300, 100, 100);
        image(HP6, 100, 300, 100, 100);
        image(HP7, 200, 300, 100, 100);
        image(HP7, 300, 300, 100, 100);
        image(HP6, 400, 300, 100, 100);
        image(HP7, 500, 300, 100, 100);
        image(HP7, 600, 300, 100, 100);
        image(HP6, 0, 400, 100, 100);
        image(HP7, 100, 400, 100, 100);
        image(HP7, 200, 400, 100, 100);
        image(HP6, 300, 400, 100, 100);
        image(HP7, 400, 400, 100, 100);
        image(HP7, 500, 400, 100, 100);
        image(HP6, 600, 400, 100, 100);
        image(HP7, 0, 500, 100, 100);
        image(HP7, 100, 500, 100, 100);
        image(HP6, 200, 500, 100, 100);
        image(HP7, 300, 500, 100, 100);
        image(HP7, 400, 500, 100, 100);
        image(HP6, 500, 500, 100, 100);
        image(HP7, 600, 500, 100, 100);
      }
      if (cropType == 18) {
        image(K1, 0, 200, 100, 100);
        image(K2, 100, 200, 100, 100);
        image(K2, 200, 200, 100, 100);
        image(K3, 300, 200, 100, 100);
        image(K3, 400, 200, 100, 100);
        image(K4, 500, 200, 100, 100);
        image(K5, 600, 200, 100, 100);
        image(K1, 0, 300, 100, 100);
        image(K2, 100, 300, 100, 100);
        image(K2, 200, 300, 100, 100);
        image(K3, 300, 300, 100, 100);
        image(K3, 400, 300, 100, 100);
        image(K4, 500, 300, 100, 100);
        image(K5, 600, 300, 100, 100);
        image(K1, 0, 400, 100, 100);
        image(K2, 100, 400, 100, 100);
        image(K2, 200, 400, 100, 100);
        image(K3, 300, 400, 100, 100);
        image(K3, 400, 400, 100, 100);
        image(K4, 500, 400, 100, 100);
        image(K5, 600, 400, 100, 100);
        image(K1, 0, 500, 100, 100);
        image(K2, 100, 500, 100, 100);
        image(K2, 200, 500, 100, 100);
        image(K3, 300, 500, 100, 100);
        image(K3, 400, 500, 100, 100);
        image(K4, 500, 500, 100, 100);
        image(K5, 600, 500, 100, 100);
      }
      if (cropType == 19) {
        image(M1, 0, 200, 100, 100);
        image(M2, 100, 200, 100, 100);
        image(M2, 200, 200, 100, 100);
        image(M3, 300, 200, 100, 100);
        image(M3, 400, 200, 100, 100);
        image(M3, 500, 200, 100, 100);
        image(M4, 600, 200, 100, 100);
        image(M4, 0, 300, 100, 100);
        image(M4, 100, 300, 100, 100);
        image(M5, 200, 300, 100, 100);
        image(M5, 300, 300, 100, 100);
        image(M5, 400, 300, 100, 100);
        image(M6, 500, 300, 100, 100);
        image(M1, 600, 300, 100, 100);
        image(M2, 0, 400, 100, 100);
        image(M2, 100, 400, 100, 100);
        image(M3, 200, 400, 100, 100);
        image(M3, 300, 400, 100, 100);
        image(M3, 400, 400, 100, 100);
        image(M4, 500, 400, 100, 100);
        image(M4, 600, 400, 100, 100);
        image(M4, 0, 500, 100, 100);
        image(M5, 100, 500, 100, 100);
        image(M5, 200, 500, 100, 100);
        image(M5, 300, 500, 100, 100);
        image(M6, 400, 500, 100, 100);
        image(M1, 500, 500, 100, 100);
        image(M2, 600, 500, 100, 100);
      }
      if (cropType == 20) {
        image(Par1, 0, 200, 100, 100);
        image(Par2, 100, 200, 100, 100);
        image(Par3, 200, 200, 100, 100);
        image(Par4, 300, 200, 100, 100);
        image(Par5, 400, 200, 100, 100);
        image(Par1, 500, 200, 100, 100);
        image(Par2, 600, 200, 100, 100);
        image(Par3, 0, 300, 100, 100);
        image(Par4, 100, 300, 100, 100);
        image(Par5, 200, 300, 100, 100);
        image(Par1, 300, 300, 100, 100);
        image(Par2, 400, 300, 100, 100);
        image(Par3, 500, 300, 100, 100);
        image(Par4, 600, 300, 100, 100);
        image(Par5, 0, 400, 100, 100);
        image(Par1, 100, 400, 100, 100);
        image(Par2, 200, 400, 100, 100);
        image(Par3, 300, 400, 100, 100);
        image(Par4, 400, 400, 100, 100);
        image(Par5, 500, 400, 100, 100);
        image(Par1, 600, 400, 100, 100);
        image(Par2, 0, 500, 100, 100);
        image(Par3, 100, 500, 100, 100);
        image(Par4, 200, 500, 100, 100);
        image(Par5, 300, 500, 100, 100);
        image(Par1, 400, 500, 100, 100);
        image(Par2, 500, 500, 100, 100);
        image(Par3, 600, 500, 100, 100);
      }
      if (cropType == 21) {
        image(Pop1, 0, 200, 100, 100);
        image(Pop2, 100, 200, 100, 100);
        image(Pop2, 200, 200, 100, 100);
        image(Pop3, 300, 200, 100, 100);
        image(Pop3, 400, 200, 100, 100);
        image(Pop4, 500, 200, 100, 100);
        image(Pop4, 600, 200, 100, 100);
        image(Pop5, 0, 300, 100, 100);
        image(Pop1, 100, 300, 100, 100);
        image(Pop2, 200, 300, 100, 100);
        image(Pop2, 300, 300, 100, 100);
        image(Pop3, 400, 300, 100, 100);
        image(Pop3, 500, 300, 100, 100);
        image(Pop4, 600, 300, 100, 100);
        image(Pop4, 0, 400, 100, 100);
        image(Pop5, 100, 400, 100, 100);
        image(Pop1, 200, 400, 100, 100);
        image(Pop2, 300, 400, 100, 100);
        image(Pop2, 400, 400, 100, 100);
        image(Pop3, 500, 400, 100, 100);
        image(Pop3, 600, 400, 100, 100);
        image(Pop4, 0, 500, 100, 100);
        image(Pop4, 100, 500, 100, 100);
        image(Pop5, 200, 500, 100, 100);
        image(Pop1, 300, 500, 100, 100);
        image(Pop2, 400, 500, 100, 100);
        image(Pop2, 500, 500, 100, 100);
        image(Pop3, 600, 500, 100, 100);
      }
      if (cropType == 22) {
        image(Pot1, 0, 200, 100, 100);
        image(Pot2, 100, 200, 100, 100);
        image(Pot3, 200, 200, 100, 100);
        image(Pot4, 300, 200, 100, 100);
        image(Pot4, 400, 200, 100, 100);
        image(Pot5, 500, 200, 100, 100);
        image(Pot6, 600, 200, 100, 100);
        image(Pot1, 0, 300, 100, 100);
        image(Pot2, 100, 300, 100, 100);
        image(Pot3, 200, 300, 100, 100);
        image(Pot4, 300, 300, 100, 100);
        image(Pot4, 400, 300, 100, 100);
        image(Pot5, 500, 300, 100, 100);
        image(Pot6, 600, 300, 100, 100);
        image(Pot1, 0, 400, 100, 100);
        image(Pot2, 100, 400, 100, 100);
        image(Pot3, 200, 400, 100, 100);
        image(Pot4, 300, 400, 100, 100);
        image(Pot4, 400, 400, 100, 100);
        image(Pot5, 500, 400, 100, 100);
        image(Pot6, 600, 400, 100, 100);
        image(Pot1, 0, 500, 100, 100);
        image(Pot2, 100, 500, 100, 100);
        image(Pot3, 200, 500, 100, 100);
        image(Pot4, 300, 500, 100, 100);
        image(Pot4, 400, 500, 100, 100);
        image(Pot5, 500, 500, 100, 100);
        image(Pot6, 600, 500, 100, 100);
      }
      if (cropType == 23) {
        image(Pum1, 0, 200, 100, 100);
        image(Pum2, 100, 200, 100, 100);
        image(Pum2, 200, 200, 100, 100);
        image(Pum3, 300, 200, 100, 100);
        image(Pum3, 400, 200, 100, 100);
        image(Pum3, 500, 200, 100, 100);
        image(Pum4, 600, 200, 100, 100);
        image(Pum4, 0, 300, 100, 100);
        image(Pum4, 100, 300, 100, 100);
        image(Pum4, 200, 300, 100, 100);
        image(Pum5, 300, 300, 100, 100);
        image(Pum5, 400, 300, 100, 100);
        image(Pum5, 500, 300, 100, 100);
        image(Pum6, 600, 300, 100, 100);
        image(Pum1, 0, 400, 100, 100);
        image(Pum2, 100, 400, 100, 100);
        image(Pum2, 200, 400, 100, 100);
        image(Pum3, 300, 400, 100, 100);
        image(Pum3, 400, 400, 100, 100);
        image(Pum3, 500, 400, 100, 100);
        image(Pum4, 600, 400, 100, 100);
        image(Pum4, 0, 500, 100, 100);
        image(Pum4, 100, 500, 100, 100);
        image(Pum4, 200, 500, 100, 100);
        image(Pum5, 300, 500, 100, 100);
        image(Pum5, 400, 500, 100, 100);
        image(Pum5, 500, 500, 100, 100);
        image(Pum6, 600, 500, 100, 100);
      }
      if (cropType == 24) {
        image(Ra1, 0, 200, 100, 100);
        image(Ra1, 100, 200, 100, 100);
        image(Ra2, 200, 200, 100, 100);
        image(Ra3, 300, 200, 100, 100);
        image(Ra3, 400, 200, 100, 100);
        image(Ra4, 500, 200, 100, 100);
        image(Ra5, 600, 200, 100, 100);
        image(Ra1, 0, 300, 100, 100);
        image(Ra1, 100, 300, 100, 100);
        image(Ra2, 200, 300, 100, 100);
        image(Ra3, 300, 300, 100, 100);
        image(Ra3, 400, 300, 100, 100);
        image(Ra4, 500, 300, 100, 100);
        image(Ra5, 600, 300, 100, 100);
        image(Ra1, 0, 400, 100, 100);
        image(Ra1, 100, 400, 100, 100);
        image(Ra2, 200, 400, 100, 100);
        image(Ra3, 300, 400, 100, 100);
        image(Ra3, 400, 400, 100, 100);
        image(Ra4, 500, 400, 100, 100);
        image(Ra5, 600, 400, 100, 100);
        image(Ra1, 0, 500, 100, 100);
        image(Ra1, 100, 500, 100, 100);
        image(Ra2, 200, 500, 100, 100);
        image(Ra3, 300, 500, 100, 100);
        image(Ra3, 400, 500, 100, 100);
        image(Ra4, 500, 500, 100, 100);
        image(Ra5, 600, 500, 100, 100);
      }
      if (cropType == 25) {
        image(RC1, 0, 200, 100, 100);
        image(RC1, 100, 200, 100, 100);
        image(RC2, 200, 200, 100, 100);
        image(RC3, 300, 200, 100, 100);
        image(RC3, 400, 200, 100, 100);
        image(RC4, 500, 200, 100, 100);
        image(RC4, 600, 200, 100, 100);
        image(RC5, 0, 300, 100, 100);
        image(RC5, 100, 300, 100, 100);
        image(RC6, 200, 300, 100, 100);
        image(RC1, 300, 300, 100, 100);
        image(RC1, 400, 300, 100, 100);
        image(RC2, 500, 300, 100, 100);
        image(RC3, 600, 300, 100, 100);
        image(RC3, 0, 400, 100, 100);
        image(RC4, 100, 400, 100, 100);
        image(RC4, 200, 400, 100, 100);
        image(RC5, 300, 400, 100, 100);
        image(RC5, 400, 400, 100, 100);
        image(RC6, 500, 400, 100, 100);
        image(RC1, 600, 400, 100, 100);
        image(RC1, 0, 500, 100, 100);
        image(RC2, 100, 500, 100, 100);
        image(RC3, 200, 500, 100, 100);
        image(RC3, 300, 500, 100, 100);
        image(RC4, 400, 500, 100, 100);
        image(RC4, 500, 500, 100, 100);
        image(RC5, 600, 500, 100, 100);
      }
      if (cropType == 26) {
        image(Rh1, 0, 200, 100, 100);
        image(Rh1, 100, 200, 100, 100);
        image(Rh2, 200, 200, 100, 100);
        image(Rh2, 300, 200, 100, 100);
        image(Rh3, 400, 200, 100, 100);
        image(Rh3, 500, 200, 100, 100);
        image(Rh4, 600, 200, 100, 100);
        image(Rh4, 0, 300, 100, 100);
        image(Rh4, 100, 300, 100, 100);
        image(Rh5, 200, 300, 100, 100);
        image(Rh5, 300, 300, 100, 100);
        image(Rh5, 400, 300, 100, 100);
        image(Rh5, 500, 300, 100, 100);
        image(Rh6, 600, 300, 100, 100);
        image(Rh1, 0, 400, 100, 100);
        image(Rh1, 100, 400, 100, 100);
        image(Rh2, 200, 400, 100, 100);
        image(Rh2, 300, 400, 100, 100);
        image(Rh3, 400, 400, 100, 100);
        image(Rh3, 500, 400, 100, 100);
        image(Rh4, 600, 400, 100, 100);
        image(Rh4, 0, 500, 100, 100);
        image(Rh4, 100, 500, 100, 100);
        image(Rh5, 200, 500, 100, 100);
        image(Rh5, 300, 500, 100, 100);
        image(Rh5, 400, 500, 100, 100);
        image(Rh5, 500, 500, 100, 100);
        image(Rh6, 600, 500, 100, 100);
      }
      if (cropType == 27) {
        image(Sta1, 0, 200, 100, 100);
        image(Sta1, 100, 200, 100, 100);
        image(Sta2, 200, 200, 100, 100);
        image(Sta2, 300, 200, 100, 100);
        image(Sta2, 400, 200, 100, 100);
        image(Sta3, 500, 200, 100, 100);
        image(Sta3, 600, 200, 100, 100);
        image(Sta4, 0, 300, 100, 100);
        image(Sta4, 100, 300, 100, 100);
        image(Sta4, 200, 300, 100, 100);
        image(Sta5, 300, 300, 100, 100);
        image(Sta5, 400, 300, 100, 100);
        image(Sta5, 500, 300, 100, 100);
        image(Sta6, 600, 300, 100, 100);
        image(Sta1, 0, 400, 100, 100);
        image(Sta1, 100, 400, 100, 100);
        image(Sta2, 200, 400, 100, 100);
        image(Sta2, 300, 400, 100, 100);
        image(Sta2, 400, 400, 100, 100);
        image(Sta3, 500, 400, 100, 100);
        image(Sta3, 600, 400, 100, 100);
        image(Sta4, 0, 500, 100, 100);
        image(Sta4, 100, 500, 100, 100);
        image(Sta4, 200, 500, 100, 100);
        image(Sta5, 300, 500, 100, 100);
        image(Sta5, 400, 500, 100, 100);
        image(Sta5, 500, 500, 100, 100);
        image(Sta6, 600, 500, 100, 100);
      }
      if (cropType == 28) {
        image(Str1, 0, 200, 100, 100);
        image(Str2, 100, 200, 100, 100);
        image(Str3, 200, 200, 100, 100);
        image(Str3, 300, 200, 100, 100);
        image(Str4, 400, 200, 100, 100);
        image(Str4, 500, 200, 100, 100);
        image(Str5, 600, 200, 100, 100);
        image(Str5, 0, 300, 100, 100);
        image(Str6, 100, 300, 100, 100);
        image(Str7, 200, 300, 100, 100);
        image(Str7, 300, 300, 100, 100);
        image(Str7, 400, 300, 100, 100);
        image(Str6, 500, 300, 100, 100);
        image(Str7, 600, 300, 100, 100);
        image(Str7, 0, 400, 100, 100);
        image(Str7, 100, 400, 100, 100);
        image(Str6, 200, 400, 100, 100);
        image(Str7, 300, 400, 100, 100);
        image(Str7, 400, 400, 100, 100);
        image(Str7, 500, 400, 100, 100);
        image(Str6, 600, 400, 100, 100);
        image(Str7, 0, 500, 100, 100);
        image(Str7, 100, 500, 100, 100);
        image(Str7, 200, 500, 100, 100);
        image(Str6, 300, 500, 100, 100);
        image(Str7, 400, 500, 100, 100);
        image(Str7, 500, 500, 100, 100);
        image(Str7, 600, 500, 100, 100);
      }
      if (cropType == 29) {
        image(SS1, 0, 200, 100, 100);
        image(SS2, 100, 200, 100, 100);
        image(SS2, 200, 200, 100, 100);
        image(SS3, 300, 200, 100, 100);
        image(SS3, 400, 200, 100, 100);
        image(SS3, 500, 200, 100, 100);
        image(SS4, 600, 200, 100, 100);
        image(SS4, 0, 300, 100, 100);
        image(SS5, 100, 300, 100, 100);
        image(SS1, 200, 300, 100, 100);
        image(SS2, 300, 300, 100, 100);
        image(SS2, 400, 300, 100, 100);
        image(SS3, 500, 300, 100, 100);
        image(SS3, 600, 300, 100, 100);
        image(SS3, 0, 400, 100, 100);
        image(SS4, 100, 400, 100, 100);
        image(SS4, 200, 400, 100, 100);
        image(SS5, 300, 400, 100, 100);
        image(SS1, 400, 400, 100, 100);
        image(SS2, 500, 400, 100, 100);
        image(SS2, 600, 400, 100, 100);
        image(SS3, 0, 500, 100, 100);
        image(SS3, 100, 500, 100, 100);
        image(SS3, 200, 500, 100, 100);
        image(SS4, 300, 500, 100, 100);
        image(SS4, 400, 500, 100, 100);
        image(SS5, 500, 500, 100, 100);
        image(SS1, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su1, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su2, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su3, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su4, 0, 300, 100, 100);
        image(Su5, 100, 300, 100, 100);
        image(Su1, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su2, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su3, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su4, 200, 400, 100, 100);
        image(Su5, 300, 400, 100, 100);
        image(Su1, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su2, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su3, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su4, 400, 500, 100, 100);
        image(Su5, 500, 500, 100, 100);
        image(Su1, 600, 500, 100, 100);
      }
      if (cropType == 31) {
        image(To1, 0, 200, 100, 100);
        image(To1, 100, 200, 100, 100);
        image(To2, 200, 200, 100, 100);
        image(To2, 300, 200, 100, 100);
        image(To3, 400, 200, 100, 100);
        image(To3, 500, 200, 100, 100);
        image(To4, 600, 200, 100, 100);
        image(To4, 0, 300, 100, 100);
        image(To5, 100, 300, 100, 100);
        image(To5, 200, 300, 100, 100);
        image(To5, 300, 300, 100, 100);
        image(To6, 400, 300, 100, 100);
        image(To7, 500, 300, 100, 100);
        image(To7, 600, 300, 100, 100);
        image(To7, 0, 400, 100, 100);
        image(To6, 100, 400, 100, 100);
        image(To7, 200, 400, 100, 100);
        image(To7, 300, 400, 100, 100);
        image(To7, 400, 400, 100, 100);
        image(To6, 500, 400, 100, 100);
        image(To7, 600, 400, 100, 100);
        image(To7, 0, 500, 100, 100);
        image(To7, 100, 500, 100, 100);
        image(To6, 200, 500, 100, 100);
        image(To7, 300, 500, 100, 100);
        image(To7, 400, 500, 100, 100);
        image(To7, 500, 500, 100, 100);
        image(To6, 600, 500, 100, 100);
      }
      if (cropType == 32) {
        image(Tu1, 0, 200, 100, 100);
        image(Tu2, 100, 200, 100, 100);
        image(Tu3, 200, 200, 100, 100);
        image(Tu3, 300, 200, 100, 100);
        image(Tu4, 400, 200, 100, 100);
        image(Tu4, 500, 200, 100, 100);
        image(Tu5, 600, 200, 100, 100);
        image(Tu1, 0, 300, 100, 100);
        image(Tu2, 100, 300, 100, 100);
        image(Tu3, 200, 300, 100, 100);
        image(Tu3, 300, 300, 100, 100);
        image(Tu4, 400, 300, 100, 100);
        image(Tu4, 500, 300, 100, 100);
        image(Tu5, 600, 300, 100, 100);
        image(Tu1, 0, 400, 100, 100);
        image(Tu2, 100, 400, 100, 100);
        image(Tu3, 200, 400, 100, 100);
        image(Tu3, 300, 400, 100, 100);
        image(Tu4, 400, 400, 100, 100);
        image(Tu4, 500, 400, 100, 100);
        image(Tu5, 600, 400, 100, 100);
        image(Tu1, 0, 500, 100, 100);
        image(Tu2, 100, 500, 100, 100);
        image(Tu3, 200, 500, 100, 100);
        image(Tu3, 300, 500, 100, 100);
        image(Tu4, 400, 500, 100, 100);
        image(Tu4, 500, 500, 100, 100);
        image(Tu5, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR2, 200, 200, 100, 100);
        image(UmR3, 300, 200, 100, 100);
        image(UmR3, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR4, 600, 200, 100, 100);
        image(UmR4, 0, 300, 100, 100);
        image(UmR5, 100, 300, 100, 100);
        image(UmR1, 200, 300, 100, 100);
        image(UmR2, 300, 300, 100, 100);
        image(UmR2, 400, 300, 100, 100);
        image(UmR3, 500, 300, 100, 100);
        image(UmR3, 600, 300, 100, 100);
        image(UmR4, 0, 400, 100, 100);
        image(UmR4, 100, 400, 100, 100);
        image(UmR4, 200, 400, 100, 100);
        image(UmR5, 300, 400, 100, 100);
        image(UmR1, 400, 400, 100, 100);
        image(UmR2, 500, 400, 100, 100);
        image(UmR2, 600, 400, 100, 100);
        image(UmR3, 0, 500, 100, 100);
        image(UmR3, 100, 500, 100, 100);
        image(UmR4, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR5, 500, 500, 100, 100);
        image(UmR1, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W1, 0, 200, 100, 100);
        image(W2, 100, 200, 100, 100);
        image(W3, 200, 200, 100, 100);
        image(W4, 300, 200, 100, 100);
        image(W5, 400, 200, 100, 100);
        image(W1, 500, 200, 100, 100);
        image(W2, 600, 200, 100, 100);
        image(W3, 0, 300, 100, 100);
        image(W4, 100, 300, 100, 100);
        image(W5, 200, 300, 100, 100);
        image(W1, 300, 300, 100, 100);
        image(W2, 400, 300, 100, 100);
        image(W3, 500, 300, 100, 100);
        image(W4, 600, 300, 100, 100);
        image(W5, 0, 400, 100, 100);
        image(W1, 100, 400, 100, 100);
        image(W2, 200, 400, 100, 100);
        image(W3, 300, 400, 100, 100);
        image(W4, 400, 400, 100, 100);
        image(W5, 500, 400, 100, 100);
        image(W1, 600, 400, 100, 100);
        image(W2, 0, 500, 100, 100);
        image(W3, 100, 500, 100, 100);
        image(W4, 200, 500, 100, 100);
        image(W5, 300, 500, 100, 100);
        image(W1, 400, 500, 100, 100);
        image(W2, 500, 500, 100, 100);
        image(W3, 600, 500, 100, 100);
      }
      if (cropType == 35) {
        image(Y1, 0, 200, 100, 100);
        image(Y2, 100, 200, 100, 100);
        image(Y2, 200, 200, 100, 100);
        image(Y2, 300, 200, 100, 100);
        image(Y3, 400, 200, 100, 100);
        image(Y3, 500, 200, 100, 100);
        image(Y3, 600, 200, 100, 100);
        image(Y4, 0, 300, 100, 100);
        image(Y4, 100, 300, 100, 100);
        image(Y4, 200, 300, 100, 100);
        image(Y5, 300, 300, 100, 100);
        image(Y1, 400, 300, 100, 100);
        image(Y2, 500, 300, 100, 100);
        image(Y2, 600, 300, 100, 100);
        image(Y2, 0, 400, 100, 100);
        image(Y3, 100, 400, 100, 100);
        image(Y3, 200, 400, 100, 100);
        image(Y3, 300, 400, 100, 100);
        image(Y4, 400, 400, 100, 100);
        image(Y4, 500, 400, 100, 100);
        image(Y4, 600, 400, 100, 100);
        image(Y5, 0, 500, 100, 100);
        image(Y1, 100, 500, 100, 100);
        image(Y2, 200, 500, 100, 100);
        image(Y2, 300, 500, 100, 100);
        image(Y2, 400, 500, 100, 100);
        image(Y3, 500, 500, 100, 100);
        image(Y3, 600, 500, 100, 100);
      }
    }
    if (cropCalendarDDSGtype2) {
      if (cropType == 8) {
        image(CB6, 0, 200, 100, 100);
        image(CB7, 100, 200, 100, 100);
        image(CB6, 200, 200, 100, 100);
        image(CB7, 300, 200, 100, 100);
        image(CB6, 400, 200, 100, 100);
        image(CB7, 500, 200, 100, 100);
        image(CB6, 600, 200, 100, 100);
        image(CB7, 0, 300, 100, 100);
        image(CB6, 100, 300, 100, 100);
        image(CB7, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co7, 0, 200, 100, 100);
        image(Co7, 100, 200, 100, 100);
        image(Co6, 200, 200, 100, 100);
        image(Co7, 300, 200, 100, 100);
        image(Co7, 400, 200, 100, 100);
        image(Co7, 500, 200, 100, 100);
        image(Co6, 600, 200, 100, 100);
        image(Co7, 0, 300, 100, 100);
        image(Co7, 100, 300, 100, 100);
        image(Co7, 200, 300, 100, 100);
        image(Co6, 300, 300, 100, 100);
        image(Co7, 400, 300, 100, 100);
        image(Co7, 500, 300, 100, 100);
        image(Co7, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su2, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su3, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su4, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su5, 0, 300, 100, 100);
        image(Su1, 100, 300, 100, 100);
        image(Su2, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su3, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su4, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su5, 200, 400, 100, 100);
        image(Su1, 300, 400, 100, 100);
        image(Su2, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su3, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su4, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su5, 400, 500, 100, 100);
        image(Su1, 500, 500, 100, 100);
        image(Su2, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR3, 200, 200, 100, 100);
        image(UmR4, 300, 200, 100, 100);
        image(UmR4, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR5, 600, 200, 100, 100);
        image(UmR1, 0, 300, 100, 100);
        image(UmR2, 100, 300, 100, 100);
        image(UmR3, 200, 300, 100, 100);
        image(UmR4, 300, 300, 100, 100);
        image(UmR4, 400, 300, 100, 100);
        image(UmR4, 500, 300, 100, 100);
        image(UmR5, 600, 300, 100, 100);
        image(UmR1, 0, 400, 100, 100);
        image(UmR2, 100, 400, 100, 100);
        image(UmR3, 200, 400, 100, 100);
        image(UmR4, 300, 400, 100, 100);
        image(UmR4, 400, 400, 100, 100);
        image(UmR4, 500, 400, 100, 100);
        image(UmR5, 600, 400, 100, 100);
        image(UmR1, 0, 500, 100, 100);
        image(UmR2, 100, 500, 100, 100);
        image(UmR3, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR4, 500, 500, 100, 100);
        image(UmR5, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W4, 0, 200, 100, 100);
        image(W5, 100, 200, 100, 100);
        image(W1, 200, 200, 100, 100);
        image(W2, 300, 200, 100, 100);
        image(W3, 400, 200, 100, 100);
        image(W4, 500, 200, 100, 100);
        image(W5, 600, 200, 100, 100);
        image(W1, 0, 300, 100, 100);
        image(W2, 100, 300, 100, 100);
        image(W3, 200, 300, 100, 100);
        image(W4, 300, 300, 100, 100);
        image(W5, 400, 300, 100, 100);
        image(W1, 500, 300, 100, 100);
        image(W2, 600, 300, 100, 100);
        image(W3, 0, 400, 100, 100);
        image(W4, 100, 400, 100, 100);
        image(W5, 200, 400, 100, 100);
        image(W1, 300, 400, 100, 100);
        image(W1, 400, 400, 100, 100);
        image(W2, 500, 400, 100, 100);
        image(W3, 600, 400, 100, 100);
        image(W4, 0, 500, 100, 100);
        image(W5, 100, 500, 100, 100);
        image(W1, 200, 500, 100, 100);
        image(W2, 300, 500, 100, 100);
        image(W3, 400, 500, 100, 100);
        image(W4, 500, 500, 100, 100);
        image(W5, 600, 500, 100, 100);
      }
    }
    if (cropType == 8 || cropType == 9 || cropType == 30 || cropType == 33 || cropType == 34) {
      if (keyPressed) {
        if (key == CODED) {
          if (keyCode == SHIFT) {
            cropCalendarDDSGtype2 = true;
            cropCalendarDDSGtype1 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
          if (keyCode == CONTROL) {
            cropCalendarDDSGtype1 = true;
            cropCalendarDDSGtype2 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
        }
      }
    }
    if (keyPressed) {
      if (key == 'V' || key == 'v') {
        cropSelect = true;
        cropCalendarDDSG = false;
        fill(0);
        rect(0, 0, 700, 600);
      }
      if (key == 'C' || key == 'c') {
        cropCalendarDDSG = false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalculator = true;
      }
      if (key == '1') {
        cropCalendarDDSG = false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalendarN = true;
      }
    }
  }
}*/
/*void CalendarmodeDSG() {
  if (cropCalendarDSG== true) {
    //build
    stroke(255);
    for (int i = 100; i < 600; i += 100) {
      line(0, i, 700, i);
    }
    for (int i = 100; i < 700; i += 100) {
      line(i, 100, i, 600);
    }
    //text
    fill(255);
    textSize(32);
    text("Mon", 20, 200);
    text("Tue", 120, 200);
    text("Wed", 220, 200);
    text("Thu", 320, 200);
    text("Fri", 420, 200);
    text("Sat", 520, 200);
    text("Sun", 620, 200);
    if (cropCalendarDSGtype1) {
      if (cropType == 1) {
        image(Am1, 0, 200, 100, 100);
        image(Am2, 100, 200, 100, 100);
        image(Am2, 200, 200, 100, 100);
        image(Am3, 300, 200, 100, 100);
        image(Am3, 400, 200, 100, 100);
        image(Am4, 500, 200, 100, 100);
        image(Am4, 600, 200, 100, 100);
        image(Am5, 0, 300, 100, 100);
        image(Am2, 100, 300, 100, 100);
        image(Am2, 200, 300, 100, 100);
        image(Am3, 300, 300, 100, 100);
        image(Am3, 400, 300, 100, 100);
        image(Am4, 500, 300, 100, 100);
        image(Am4, 600, 300, 100, 100);
        image(Am5, 0, 400, 100, 100);
        image(Am2, 100, 400, 100, 100);
        image(Am2, 200, 400, 100, 100);
        image(Am3, 300, 400, 100, 100);
        image(Am3, 400, 400, 100, 100);
        image(Am4, 500, 400, 100, 100);
        image(Am4, 600, 400, 100, 100);
        image(Am5, 0, 500, 100, 100);
        image(Am2, 100, 500, 100, 100);
        image(Am2, 200, 500, 100, 100);
        image(Am3, 300, 500, 100, 100);
        image(Am3, 400, 500, 100, 100);
        image(Am4, 500, 500, 100, 100);
        image(Am4, 600, 500, 100, 100);
      }
      if (cropType == 2) {
        image(Ar1, 0, 200, 100, 100);
        image(Ar1, 100, 200, 100, 100);
        image(Ar2, 200, 200, 100, 100);
        image(Ar2, 300, 200, 100, 100);
        image(Ar3, 400, 200, 100, 100);
        image(Ar4, 500, 200, 100, 100);
        image(Ar4, 600, 200, 100, 100);
        image(Ar5, 0, 300, 100, 100);
        image(Ar6, 100, 300, 100, 100);
        image(Ar1, 200, 300, 100, 100);
        image(Ar1, 300, 300, 100, 100);
        image(Ar2, 400, 300, 100, 100);
        image(Ar2, 500, 300, 100, 100);
        image(Ar3, 600, 300, 100, 100);
        image(Ar4, 0, 400, 100, 100);
        image(Ar4, 100, 400, 100, 100);
        image(Ar5, 200, 400, 100, 100);
        image(Ar6, 300, 400, 100, 100);
        image(Ar1, 400, 400, 100, 100);
        image(Ar1, 500, 400, 100, 100);
        image(Ar2, 600, 400, 100, 100);
        image(Ar2, 0, 500, 100, 100);
        image(Ar3, 100, 500, 100, 100);
        image(Ar4, 200, 500, 100, 100);
        image(Ar4, 300, 500, 100, 100);
        image(Ar5, 400, 500, 100, 100);
        image(Ar6, 500, 500, 100, 100);
        image(Ar1, 600, 500, 100, 100);
      }
      if (cropType == 3) {
        image(Be1, 0, 200, 100, 100);
        image(Be2, 100, 200, 100, 100);
        image(Be3, 200, 200, 100, 100);
        image(Be3, 300, 200, 100, 100);
        image(Be4, 400, 200, 100, 100);
        image(Be4, 500, 200, 100, 100);
        image(Be5, 600, 200, 100, 100);
        image(Be1, 0, 300, 100, 100);
        image(Be2, 100, 300, 100, 100);
        image(Be3, 200, 300, 100, 100);
        image(Be3, 300, 300, 100, 100);
        image(Be4, 400, 300, 100, 100);
        image(Be4, 500, 300, 100, 100);
        image(Be5, 600, 300, 100, 100);
        image(Be1, 0, 400, 100, 100);
        image(Be2, 100, 400, 100, 100);
        image(Be3, 200, 400, 100, 100);
        image(Be3, 300, 400, 100, 100);
        image(Be4, 400, 400, 100, 100);
        image(Be4, 500, 400, 100, 100);
        image(Be5, 600, 400, 100, 100);
        image(Be1, 0, 500, 100, 100);
        image(Be2, 100, 500, 100, 100);
        image(Be3, 200, 500, 100, 100);
        image(Be3, 300, 500, 100, 100);
        image(Be4, 400, 500, 100, 100);
        image(Be4, 500, 500, 100, 100);
        image(Be5, 600, 500, 100, 100);
      }
      if (cropType == 4) {
        image(Bl1, 0, 200, 100, 100);
        image(Bl2, 100, 200, 100, 100);
        image(Bl2, 200, 200, 100, 100);
        image(Bl2, 300, 200, 100, 100);
        image(Bl3, 400, 200, 100, 100);
        image(Bl3, 500, 200, 100, 100);
        image(Bl3, 600, 200, 100, 100);
        image(Bl4, 0, 300, 100, 100);
        image(Bl4, 100, 300, 100, 100);
        image(Bl4, 200, 300, 100, 100);
        image(Bl4, 300, 300, 100, 100);
        image(Bl5, 400, 300, 100, 100);
        image(Bl5, 500, 300, 100, 100);
        image(Bl6, 600, 300, 100, 100);
        image(Bl7, 0, 400, 100, 100);
        image(Bl7, 100, 400, 100, 100);
        image(Bl7, 200, 400, 100, 100);
        image(Bl6, 300, 400, 100, 100);
        image(Bl7, 400, 400, 100, 100);
        image(Bl7, 500, 400, 100, 100);
        image(Bl7, 600, 400, 100, 100);
        image(Bl6, 0, 500, 100, 100);
        image(Bl7, 100, 500, 100, 100);
        image(Bl7, 200, 500, 100, 100);
        image(Bl7, 300, 500, 100, 100);
        image(Bl6, 400, 500, 100, 100);
        image(Bl7, 500, 500, 100, 100);
        image(Bl7, 600, 500, 100, 100);
      }
      if (cropType == 5) {
        image(BJ1, 0, 200, 100, 100);
        image(BJ2, 100, 200, 100, 100);
        image(BJ2, 200, 200, 100, 100);
        image(BJ3, 300, 200, 100, 100);
        image(BJ3, 400, 200, 100, 100);
        image(BJ4, 500, 200, 100, 100);
        image(BJ4, 600, 200, 100, 100);
        image(BJ5, 0, 300, 100, 100);
        image(BJ1, 100, 300, 100, 100);
        image(BJ2, 200, 300, 100, 100);
        image(BJ2, 300, 300, 100, 100);
        image(BJ3, 400, 300, 100, 100);
        image(BJ3, 500, 300, 100, 100);
        image(BJ4, 600, 300, 100, 100);
        image(BJ4, 0, 400, 100, 100);
        image(BJ5, 100, 400, 100, 100);
        image(BJ1, 200, 400, 100, 100);
        image(BJ2, 300, 400, 100, 100);
        image(BJ2, 400, 400, 100, 100);
        image(BJ3, 500, 400, 100, 100);
        image(BJ3, 600, 400, 100, 100);
        image(BJ4, 0, 500, 100, 100);
        image(BJ4, 100, 500, 100, 100);
        image(BJ5, 200, 500, 100, 100);
        image(BJ1, 300, 500, 100, 100);
        image(BJ2, 400, 500, 100, 100);
        image(BJ2, 500, 500, 100, 100);
        image(BJ3, 600, 500, 100, 100);
      }
      if (cropType == 6) {
        image(BC1, 0, 200, 100, 100);
        image(BC2, 100, 200, 100, 100);
        image(BC3, 200, 200, 100, 100);
        image(BC4, 300, 200, 100, 100);
        image(BC5, 400, 200, 100, 100);
        image(BC1, 500, 200, 100, 100);
        image(BC2, 600, 200, 100, 100);
        image(BC3, 0, 300, 100, 100);
        image(BC4, 100, 300, 100, 100);
        image(BC5, 200, 300, 100, 100);
        image(BC1, 300, 300, 100, 100);
        image(BC2, 400, 300, 100, 100);
        image(BC3, 500, 300, 100, 100);
        image(BC4, 600, 300, 100, 100);
        image(BC5, 0, 400, 100, 100);
        image(BC1, 100, 400, 100, 100);
        image(BC2, 200, 400, 100, 100);
        image(BC3, 300, 400, 100, 100);
        image(BC4, 400, 400, 100, 100);
        image(BC5, 500, 400, 100, 100);
        image(BC1, 600, 400, 100, 100);
        image(BC2, 0, 500, 100, 100);
        image(BC3, 100, 500, 100, 100);
        image(BC4, 200, 500, 100, 100);
        image(BC5, 300, 500, 100, 100);
        image(BC1, 400, 500, 100, 100);
        image(BC2, 500, 500, 100, 100);
        image(BC3, 600, 500, 100, 100);
      }
      if (cropType == 7) {
        image(Ca1, 0, 200, 100, 100);
        image(Ca2, 100, 200, 100, 100);
        image(Ca2, 200, 200, 100, 100);
        image(Ca3, 300, 200, 100, 100);
        image(Ca3, 400, 200, 100, 100);
        image(Ca3, 500, 200, 100, 100);
        image(Ca3, 600, 200, 100, 100);
        image(Ca4, 0, 300, 100, 100);
        image(Ca4, 100, 300, 100, 100);
        image(Ca4, 200, 300, 100, 100);
        image(Ca4, 300, 300, 100, 100);
        image(Ca5, 400, 300, 100, 100);
        image(Ca6, 500, 300, 100, 100);
        image(Ca1, 600, 300, 100, 100);
        image(Ca2, 0, 400, 100, 100);
        image(Ca2, 100, 400, 100, 100);
        image(Ca3, 200, 400, 100, 100);
        image(Ca3, 300, 400, 100, 100);
        image(Ca3, 400, 400, 100, 100);
        image(Ca3, 500, 400, 100, 100);
        image(Ca4, 600, 400, 100, 100);
        image(Ca4, 0, 500, 100, 100);
        image(Ca4, 100, 500, 100, 100);
        image(Ca4, 200, 500, 100, 100);
        image(Ca5, 300, 500, 100, 100);
        image(Ca6, 400, 500, 100, 100);
        image(Ca1, 500, 500, 100, 100);
        image(Ca2, 600, 500, 100, 100);
      }
      if (cropType == 8) {
        image(CB1, 0, 200, 100, 100);
        image(CB2, 100, 200, 100, 100);
        image(CB2, 200, 200, 100, 100);
        image(CB3, 300, 200, 100, 100);
        image(CB3, 400, 200, 100, 100);
        image(CB4, 500, 200, 100, 100);
        image(CB4, 600, 200, 100, 100);
        image(CB4, 0, 300, 100, 100);
        image(CB5, 100, 300, 100, 100);
        image(CB5, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co1, 0, 200, 100, 100);
        image(Co1, 100, 200, 100, 100);
        image(Co2, 200, 200, 100, 100);
        image(Co2, 300, 200, 100, 100);
        image(Co2, 400, 200, 100, 100);
        image(Co3, 500, 200, 100, 100);
        image(Co3, 600, 200, 100, 100);
        image(Co3, 0, 300, 100, 100);
        image(Co4, 100, 300, 100, 100);
        image(Co4, 200, 300, 100, 100);
        image(Co4, 300, 300, 100, 100);
        image(Co5, 400, 300, 100, 100);
        image(Co5, 500, 300, 100, 100);
        image(Co5, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 10) {
        image(Cr1, 0, 200, 100, 100);
        image(Cr2, 100, 200, 100, 100);
        image(Cr2, 200, 200, 100, 100);
        image(Cr3, 300, 200, 100, 100);
        image(Cr4, 400, 200, 100, 100);
        image(Cr5, 500, 200, 100, 100);
        image(Cr5, 600, 200, 100, 100);
        image(Cr6, 0, 300, 100, 100);
        image(Cr7, 100, 300, 100, 100);
        image(Cr7, 200, 300, 100, 100);
        image(Cr7, 300, 300, 100, 100);
        image(Cr7, 400, 300, 100, 100);
        image(Cr6, 500, 300, 100, 100);
        image(Cr7, 600, 300, 100, 100);
        image(Cr7, 0, 400, 100, 100);
        image(Cr7, 100, 400, 100, 100);
        image(Cr7, 200, 400, 100, 100);
        image(Cr6, 300, 400, 100, 100);
        image(Cr7, 400, 400, 100, 100);
        image(Cr7, 500, 400, 100, 100);
        image(Cr7, 600, 400, 100, 100);
        image(Cr7, 0, 500, 100, 100);
        image(Cr6, 100, 500, 100, 100);
        image(Cr7, 200, 500, 100, 100);
        image(Cr7, 300, 500, 100, 100);
        image(Cr7, 400, 500, 100, 100);
        image(Cr7, 500, 500, 100, 100);
        image(Cr6, 600, 500, 100, 100);
      }
      if (cropType == 11) {
        image(E1, 0, 200, 100, 100);
        image(E2, 100, 200, 100, 100);
        image(E3, 200, 200, 100, 100);
        image(E4, 300, 200, 100, 100);
        image(E5, 400, 200, 100, 100);
        image(E6, 500, 200, 100, 100);
        image(E1, 600, 200, 100, 100);
        image(E2, 0, 300, 100, 100);
        image(E3, 100, 300, 100, 100);
        image(E4, 200, 300, 100, 100);
        image(E5, 300, 300, 100, 100);
        image(E6, 400, 300, 100, 100);
        image(E1, 500, 300, 100, 100);
        image(E2, 600, 300, 100, 100);
        image(E3, 0, 400, 100, 100);
        image(E4, 100, 400, 100, 100);
        image(E5, 200, 400, 100, 100);
        image(E6, 300, 400, 100, 100);
        image(E1, 400, 400, 100, 100);
        image(E2, 500, 400, 100, 100);
        image(E3, 600, 400, 100, 100);
        image(E4, 0, 500, 100, 100);
        image(E5, 100, 500, 100, 100);
        image(E6, 200, 500, 100, 100);
        image(E1, 300, 500, 100, 100);
        image(E2, 400, 500, 100, 100);
        image(E3, 500, 500, 100, 100);
        image(E4, 600, 500, 100, 100);
      }
      if (cropType == 12) {
        image(FR1, 0, 200, 100, 100);
        image(FR2, 100, 200, 100, 100);
        image(FR2, 200, 200, 100, 100);
        image(FR2, 300, 200, 100, 100);
        image(FR2, 400, 200, 100, 100);
        image(FR3, 500, 200, 100, 100);
        image(FR3, 600, 200, 100, 100);
        image(FR3, 0, 300, 100, 100);
        image(FR3, 100, 300, 100, 100);
        image(FR4, 200, 300, 100, 100);
        image(FR4, 300, 300, 100, 100);
        image(FR4, 400, 300, 100, 100);
        image(FR5, 500, 300, 100, 100);
        image(FR1, 600, 300, 100, 100);
        image(FR2, 0, 400, 100, 100);
        image(FR2, 100, 400, 100, 100);
        image(FR2, 200, 400, 100, 100);
        image(FR2, 300, 400, 100, 100);
        image(FR3, 400, 400, 100, 100);
        image(FR3, 500, 400, 100, 100);
        image(FR3, 600, 400, 100, 100);
        image(FR3, 0, 500, 100, 100);
        image(FR4, 100, 500, 100, 100);
        image(FR4, 200, 500, 100, 100);
        image(FR4, 300, 500, 100, 100);
        image(FR5, 400, 500, 100, 100);
        image(FR1, 500, 500, 100, 100);
        image(FR2, 600, 500, 100, 100);
      }
      if (cropType == 13) {
        image(Ga1, 0, 200, 100, 100);
        image(Ga2, 100, 200, 100, 100);
        image(Ga3, 200, 200, 100, 100);
        image(Ga4, 300, 200, 100, 100);
        image(Ga5, 400, 200, 100, 100);
        image(Ga1, 500, 200, 100, 100);
        image(Ga2, 600, 200, 100, 100);
        image(Ga3, 0, 300, 100, 100);
        image(Ga4, 100, 300, 100, 100);
        image(Ga5, 200, 300, 100, 100);
        image(Ga1, 300, 300, 100, 100);
        image(Ga2, 400, 300, 100, 100);
        image(Ga3, 500, 300, 100, 100);
        image(Ga4, 600, 300, 100, 100);
        image(Ga5, 0, 400, 100, 100);
        image(Ga1, 100, 400, 100, 100);
        image(Ga2, 200, 400, 100, 100);
        image(Ga3, 300, 400, 100, 100);
        image(Ga4, 400, 400, 100, 100);
        image(Ga5, 500, 400, 100, 100);
        image(Ga1, 600, 400, 100, 100);
        image(Ga2, 0, 500, 100, 100);
        image(Ga3, 100, 500, 100, 100);
        image(Ga4, 200, 500, 100, 100);
        image(Ga5, 300, 500, 100, 100);
        image(Ga1, 400, 500, 100, 100);
        image(Ga2, 500, 500, 100, 100);
        image(Ga3, 600, 500, 100, 100);
      }
      if (cropType == 14) {
        image(GB1, 0, 200, 100, 100);
        image(GB2, 100, 200, 100, 100);
        image(GB3, 200, 200, 100, 100);
        image(GB4, 300, 200, 100, 100);
        image(GB4, 400, 200, 100, 100);
        image(GB4, 500, 200, 100, 100);
        image(GB5, 600, 200, 100, 100);
        image(GB5, 0, 300, 100, 100);
        image(GB5, 100, 300, 100, 100);
        image(GB5, 200, 300, 100, 100);
        image(GB6, 300, 300, 100, 100);
        image(GB7, 400, 300, 100, 100);
        image(GB7, 500, 300, 100, 100);
        image(GB6, 600, 300, 100, 100);
        image(GB7, 0, 400, 100, 100);
        image(GB7, 100, 400, 100, 100);
        image(GB6, 200, 400, 100, 100);
        image(GB7, 300, 400, 100, 100);
        image(GB7, 400, 400, 100, 100);
        image(GB6, 500, 400, 100, 100);
        image(GB7, 600, 400, 100, 100);
        image(GB7, 0, 500, 100, 100);
        image(GB6, 100, 500, 100, 100);
        image(GB7, 200, 500, 100, 100);
        image(GB7, 300, 500, 100, 100);
        image(GB6, 400, 500, 100, 100);
        image(GB7, 500, 500, 100, 100);
        image(GB7, 600, 500, 100, 100);
      }
      if (cropType == 15) {
        image(Gr1, 0, 200, 100, 100);
        image(Gr2, 100, 200, 100, 100);
        image(Gr3, 200, 200, 100, 100);
        image(Gr3, 300, 200, 100, 100);
        image(Gr4, 400, 200, 100, 100);
        image(Gr4, 500, 200, 100, 100);
        image(Gr4, 600, 200, 100, 100);
        image(Gr5, 0, 300, 100, 100);
        image(Gr5, 100, 300, 100, 100);
        image(Gr5, 200, 300, 100, 100);
        image(Gr6, 300, 300, 100, 100);
        image(Gr7, 400, 300, 100, 100);
        image(Gr7, 500, 300, 100, 100);
        image(Gr6, 600, 300, 100, 100);
        image(Gr7, 0, 400, 100, 100);
        image(Gr7, 100, 400, 100, 100);
        image(Gr6, 200, 400, 100, 100);
        image(Gr7, 300, 400, 100, 100);
        image(Gr7, 400, 400, 100, 100);
        image(Gr6, 500, 400, 100, 100);
        image(Gr7, 600, 400, 100, 100);
        image(Gr7, 0, 500, 100, 100);
        image(Gr6, 100, 500, 100, 100);
        image(Gr7, 200, 500, 100, 100);
        image(Gr7, 300, 500, 100, 100);
        image(Gr6, 400, 500, 100, 100);
        image(Gr7, 500, 500, 100, 100);
        image(Gr7, 600, 500, 100, 100);
      }
      if (cropType == 16) {
        image(H1, 0, 200, 100, 100);
        image(H2, 100, 200, 100, 100);
        image(H3, 200, 200, 100, 100);
        image(H3, 300, 200, 100, 100);
        image(H4, 400, 200, 100, 100);
        image(H4, 500, 200, 100, 100);
        image(H4, 600, 200, 100, 100);
        image(H5, 0, 300, 100, 100);
        image(H5, 100, 300, 100, 100);
        image(H5, 200, 300, 100, 100);
        image(H5, 300, 300, 100, 100);
        image(H6, 400, 300, 100, 100);
        image(H6, 500, 300, 100, 100);
        image(H6, 600, 300, 100, 100);
        image(H6, 0, 400, 100, 100);
        image(H6, 100, 400, 100, 100);
        image(H6, 200, 400, 100, 100);
        image(H6, 300, 400, 100, 100);
        image(H6, 400, 400, 100, 100);
        image(H6, 500, 400, 100, 100);
        image(H6, 600, 400, 100, 100);
        image(H6, 0, 500, 100, 100);
        image(H6, 100, 500, 100, 100);
        image(H6, 200, 500, 100, 100);
        image(H6, 300, 500, 100, 100);
        image(H6, 400, 500, 100, 100);
        image(H6, 500, 500, 100, 100);
        image(H6, 600, 500, 100, 100);
      }
      if (cropType == 17) {
        image(HP1, 0, 200, 100, 100);
        image(HP2, 100, 200, 100, 100);
        image(HP3, 200, 200, 100, 100);
        image(HP4, 300, 200, 100, 100);
        image(HP5, 400, 200, 100, 100);
        image(HP6, 500, 200, 100, 100);
        image(HP7, 600, 200, 100, 100);
        image(HP7, 0, 300, 100, 100);
        image(HP6, 100, 300, 100, 100);
        image(HP7, 200, 300, 100, 100);
        image(HP7, 300, 300, 100, 100);
        image(HP6, 400, 300, 100, 100);
        image(HP7, 500, 300, 100, 100);
        image(HP7, 600, 300, 100, 100);
        image(HP6, 0, 400, 100, 100);
        image(HP7, 100, 400, 100, 100);
        image(HP7, 200, 400, 100, 100);
        image(HP6, 300, 400, 100, 100);
        image(HP7, 400, 400, 100, 100);
        image(HP7, 500, 400, 100, 100);
        image(HP6, 600, 400, 100, 100);
        image(HP7, 0, 500, 100, 100);
        image(HP7, 100, 500, 100, 100);
        image(HP6, 200, 500, 100, 100);
        image(HP7, 300, 500, 100, 100);
        image(HP7, 400, 500, 100, 100);
        image(HP6, 500, 500, 100, 100);
        image(HP7, 600, 500, 100, 100);
      }
      if (cropType == 18) {
        image(K1, 0, 200, 100, 100);
        image(K2, 100, 200, 100, 100);
        image(K2, 200, 200, 100, 100);
        image(K3, 300, 200, 100, 100);
        image(K3, 400, 200, 100, 100);
        image(K4, 500, 200, 100, 100);
        image(K5, 600, 200, 100, 100);
        image(K1, 0, 300, 100, 100);
        image(K2, 100, 300, 100, 100);
        image(K2, 200, 300, 100, 100);
        image(K3, 300, 300, 100, 100);
        image(K3, 400, 300, 100, 100);
        image(K4, 500, 300, 100, 100);
        image(K5, 600, 300, 100, 100);
        image(K1, 0, 400, 100, 100);
        image(K2, 100, 400, 100, 100);
        image(K2, 200, 400, 100, 100);
        image(K3, 300, 400, 100, 100);
        image(K3, 400, 400, 100, 100);
        image(K4, 500, 400, 100, 100);
        image(K5, 600, 400, 100, 100);
        image(K1, 0, 500, 100, 100);
        image(K2, 100, 500, 100, 100);
        image(K2, 200, 500, 100, 100);
        image(K3, 300, 500, 100, 100);
        image(K3, 400, 500, 100, 100);
        image(K4, 500, 500, 100, 100);
        image(K5, 600, 500, 100, 100);
      }
      if (cropType == 19) {
        image(M1, 0, 200, 100, 100);
        image(M2, 100, 200, 100, 100);
        image(M2, 200, 200, 100, 100);
        image(M3, 300, 200, 100, 100);
        image(M3, 400, 200, 100, 100);
        image(M3, 500, 200, 100, 100);
        image(M4, 600, 200, 100, 100);
        image(M4, 0, 300, 100, 100);
        image(M4, 100, 300, 100, 100);
        image(M5, 200, 300, 100, 100);
        image(M5, 300, 300, 100, 100);
        image(M5, 400, 300, 100, 100);
        image(M6, 500, 300, 100, 100);
        image(M1, 600, 300, 100, 100);
        image(M2, 0, 400, 100, 100);
        image(M2, 100, 400, 100, 100);
        image(M3, 200, 400, 100, 100);
        image(M3, 300, 400, 100, 100);
        image(M3, 400, 400, 100, 100);
        image(M4, 500, 400, 100, 100);
        image(M4, 600, 400, 100, 100);
        image(M4, 0, 500, 100, 100);
        image(M5, 100, 500, 100, 100);
        image(M5, 200, 500, 100, 100);
        image(M5, 300, 500, 100, 100);
        image(M6, 400, 500, 100, 100);
        image(M1, 500, 500, 100, 100);
        image(M2, 600, 500, 100, 100);
      }
      if (cropType == 20) {
        image(Par1, 0, 200, 100, 100);
        image(Par2, 100, 200, 100, 100);
        image(Par3, 200, 200, 100, 100);
        image(Par4, 300, 200, 100, 100);
        image(Par5, 400, 200, 100, 100);
        image(Par1, 500, 200, 100, 100);
        image(Par2, 600, 200, 100, 100);
        image(Par3, 0, 300, 100, 100);
        image(Par4, 100, 300, 100, 100);
        image(Par5, 200, 300, 100, 100);
        image(Par1, 300, 300, 100, 100);
        image(Par2, 400, 300, 100, 100);
        image(Par3, 500, 300, 100, 100);
        image(Par4, 600, 300, 100, 100);
        image(Par5, 0, 400, 100, 100);
        image(Par1, 100, 400, 100, 100);
        image(Par2, 200, 400, 100, 100);
        image(Par3, 300, 400, 100, 100);
        image(Par4, 400, 400, 100, 100);
        image(Par5, 500, 400, 100, 100);
        image(Par1, 600, 400, 100, 100);
        image(Par2, 0, 500, 100, 100);
        image(Par3, 100, 500, 100, 100);
        image(Par4, 200, 500, 100, 100);
        image(Par5, 300, 500, 100, 100);
        image(Par1, 400, 500, 100, 100);
        image(Par2, 500, 500, 100, 100);
        image(Par3, 600, 500, 100, 100);
      }
      if (cropType == 21) {
        image(Pop1, 0, 200, 100, 100);
        image(Pop2, 100, 200, 100, 100);
        image(Pop2, 200, 200, 100, 100);
        image(Pop3, 300, 200, 100, 100);
        image(Pop3, 400, 200, 100, 100);
        image(Pop4, 500, 200, 100, 100);
        image(Pop4, 600, 200, 100, 100);
        image(Pop5, 0, 300, 100, 100);
        image(Pop1, 100, 300, 100, 100);
        image(Pop2, 200, 300, 100, 100);
        image(Pop2, 300, 300, 100, 100);
        image(Pop3, 400, 300, 100, 100);
        image(Pop3, 500, 300, 100, 100);
        image(Pop4, 600, 300, 100, 100);
        image(Pop4, 0, 400, 100, 100);
        image(Pop5, 100, 400, 100, 100);
        image(Pop1, 200, 400, 100, 100);
        image(Pop2, 300, 400, 100, 100);
        image(Pop2, 400, 400, 100, 100);
        image(Pop3, 500, 400, 100, 100);
        image(Pop3, 600, 400, 100, 100);
        image(Pop4, 0, 500, 100, 100);
        image(Pop4, 100, 500, 100, 100);
        image(Pop5, 200, 500, 100, 100);
        image(Pop1, 300, 500, 100, 100);
        image(Pop2, 400, 500, 100, 100);
        image(Pop2, 500, 500, 100, 100);
        image(Pop3, 600, 500, 100, 100);
      }
      if (cropType == 22) {
        image(Pot1, 0, 200, 100, 100);
        image(Pot2, 100, 200, 100, 100);
        image(Pot3, 200, 200, 100, 100);
        image(Pot4, 300, 200, 100, 100);
        image(Pot4, 400, 200, 100, 100);
        image(Pot5, 500, 200, 100, 100);
        image(Pot6, 600, 200, 100, 100);
        image(Pot1, 0, 300, 100, 100);
        image(Pot2, 100, 300, 100, 100);
        image(Pot3, 200, 300, 100, 100);
        image(Pot4, 300, 300, 100, 100);
        image(Pot4, 400, 300, 100, 100);
        image(Pot5, 500, 300, 100, 100);
        image(Pot6, 600, 300, 100, 100);
        image(Pot1, 0, 400, 100, 100);
        image(Pot2, 100, 400, 100, 100);
        image(Pot3, 200, 400, 100, 100);
        image(Pot4, 300, 400, 100, 100);
        image(Pot4, 400, 400, 100, 100);
        image(Pot5, 500, 400, 100, 100);
        image(Pot6, 600, 400, 100, 100);
        image(Pot1, 0, 500, 100, 100);
        image(Pot2, 100, 500, 100, 100);
        image(Pot3, 200, 500, 100, 100);
        image(Pot4, 300, 500, 100, 100);
        image(Pot4, 400, 500, 100, 100);
        image(Pot5, 500, 500, 100, 100);
        image(Pot6, 600, 500, 100, 100);
      }
      if (cropType == 23) {
        image(Pum1, 0, 200, 100, 100);
        image(Pum2, 100, 200, 100, 100);
        image(Pum2, 200, 200, 100, 100);
        image(Pum3, 300, 200, 100, 100);
        image(Pum3, 400, 200, 100, 100);
        image(Pum3, 500, 200, 100, 100);
        image(Pum4, 600, 200, 100, 100);
        image(Pum4, 0, 300, 100, 100);
        image(Pum4, 100, 300, 100, 100);
        image(Pum4, 200, 300, 100, 100);
        image(Pum5, 300, 300, 100, 100);
        image(Pum5, 400, 300, 100, 100);
        image(Pum5, 500, 300, 100, 100);
        image(Pum6, 600, 300, 100, 100);
        image(Pum1, 0, 400, 100, 100);
        image(Pum2, 100, 400, 100, 100);
        image(Pum2, 200, 400, 100, 100);
        image(Pum3, 300, 400, 100, 100);
        image(Pum3, 400, 400, 100, 100);
        image(Pum3, 500, 400, 100, 100);
        image(Pum4, 600, 400, 100, 100);
        image(Pum4, 0, 500, 100, 100);
        image(Pum4, 100, 500, 100, 100);
        image(Pum4, 200, 500, 100, 100);
        image(Pum5, 300, 500, 100, 100);
        image(Pum5, 400, 500, 100, 100);
        image(Pum5, 500, 500, 100, 100);
        image(Pum6, 600, 500, 100, 100);
      }
      if (cropType == 24) {
        image(Ra1, 0, 200, 100, 100);
        image(Ra1, 100, 200, 100, 100);
        image(Ra2, 200, 200, 100, 100);
        image(Ra3, 300, 200, 100, 100);
        image(Ra3, 400, 200, 100, 100);
        image(Ra4, 500, 200, 100, 100);
        image(Ra5, 600, 200, 100, 100);
        image(Ra1, 0, 300, 100, 100);
        image(Ra1, 100, 300, 100, 100);
        image(Ra2, 200, 300, 100, 100);
        image(Ra3, 300, 300, 100, 100);
        image(Ra3, 400, 300, 100, 100);
        image(Ra4, 500, 300, 100, 100);
        image(Ra5, 600, 300, 100, 100);
        image(Ra1, 0, 400, 100, 100);
        image(Ra1, 100, 400, 100, 100);
        image(Ra2, 200, 400, 100, 100);
        image(Ra3, 300, 400, 100, 100);
        image(Ra3, 400, 400, 100, 100);
        image(Ra4, 500, 400, 100, 100);
        image(Ra5, 600, 400, 100, 100);
        image(Ra1, 0, 500, 100, 100);
        image(Ra1, 100, 500, 100, 100);
        image(Ra2, 200, 500, 100, 100);
        image(Ra3, 300, 500, 100, 100);
        image(Ra3, 400, 500, 100, 100);
        image(Ra4, 500, 500, 100, 100);
        image(Ra5, 600, 500, 100, 100);
      }
      if (cropType == 25) {
        image(RC1, 0, 200, 100, 100);
        image(RC1, 100, 200, 100, 100);
        image(RC2, 200, 200, 100, 100);
        image(RC3, 300, 200, 100, 100);
        image(RC3, 400, 200, 100, 100);
        image(RC4, 500, 200, 100, 100);
        image(RC4, 600, 200, 100, 100);
        image(RC5, 0, 300, 100, 100);
        image(RC5, 100, 300, 100, 100);
        image(RC6, 200, 300, 100, 100);
        image(RC1, 300, 300, 100, 100);
        image(RC1, 400, 300, 100, 100);
        image(RC2, 500, 300, 100, 100);
        image(RC3, 600, 300, 100, 100);
        image(RC3, 0, 400, 100, 100);
        image(RC4, 100, 400, 100, 100);
        image(RC4, 200, 400, 100, 100);
        image(RC5, 300, 400, 100, 100);
        image(RC5, 400, 400, 100, 100);
        image(RC6, 500, 400, 100, 100);
        image(RC1, 600, 400, 100, 100);
        image(RC1, 0, 500, 100, 100);
        image(RC2, 100, 500, 100, 100);
        image(RC3, 200, 500, 100, 100);
        image(RC3, 300, 500, 100, 100);
        image(RC4, 400, 500, 100, 100);
        image(RC4, 500, 500, 100, 100);
        image(RC5, 600, 500, 100, 100);
      }
      if (cropType == 26) {
        image(Rh1, 0, 200, 100, 100);
        image(Rh1, 100, 200, 100, 100);
        image(Rh2, 200, 200, 100, 100);
        image(Rh2, 300, 200, 100, 100);
        image(Rh3, 400, 200, 100, 100);
        image(Rh3, 500, 200, 100, 100);
        image(Rh4, 600, 200, 100, 100);
        image(Rh4, 0, 300, 100, 100);
        image(Rh4, 100, 300, 100, 100);
        image(Rh5, 200, 300, 100, 100);
        image(Rh5, 300, 300, 100, 100);
        image(Rh5, 400, 300, 100, 100);
        image(Rh5, 500, 300, 100, 100);
        image(Rh6, 600, 300, 100, 100);
        image(Rh1, 0, 400, 100, 100);
        image(Rh1, 100, 400, 100, 100);
        image(Rh2, 200, 400, 100, 100);
        image(Rh2, 300, 400, 100, 100);
        image(Rh3, 400, 400, 100, 100);
        image(Rh3, 500, 400, 100, 100);
        image(Rh4, 600, 400, 100, 100);
        image(Rh4, 0, 500, 100, 100);
        image(Rh4, 100, 500, 100, 100);
        image(Rh5, 200, 500, 100, 100);
        image(Rh5, 300, 500, 100, 100);
        image(Rh5, 400, 500, 100, 100);
        image(Rh5, 500, 500, 100, 100);
        image(Rh6, 600, 500, 100, 100);
      }
      if (cropType == 27) {
        image(Sta1, 0, 200, 100, 100);
        image(Sta1, 100, 200, 100, 100);
        image(Sta2, 200, 200, 100, 100);
        image(Sta2, 300, 200, 100, 100);
        image(Sta2, 400, 200, 100, 100);
        image(Sta3, 500, 200, 100, 100);
        image(Sta3, 600, 200, 100, 100);
        image(Sta4, 0, 300, 100, 100);
        image(Sta4, 100, 300, 100, 100);
        image(Sta4, 200, 300, 100, 100);
        image(Sta5, 300, 300, 100, 100);
        image(Sta5, 400, 300, 100, 100);
        image(Sta5, 500, 300, 100, 100);
        image(Sta6, 600, 300, 100, 100);
        image(Sta1, 0, 400, 100, 100);
        image(Sta1, 100, 400, 100, 100);
        image(Sta2, 200, 400, 100, 100);
        image(Sta2, 300, 400, 100, 100);
        image(Sta2, 400, 400, 100, 100);
        image(Sta3, 500, 400, 100, 100);
        image(Sta3, 600, 400, 100, 100);
        image(Sta4, 0, 500, 100, 100);
        image(Sta4, 100, 500, 100, 100);
        image(Sta4, 200, 500, 100, 100);
        image(Sta5, 300, 500, 100, 100);
        image(Sta5, 400, 500, 100, 100);
        image(Sta5, 500, 500, 100, 100);
        image(Sta6, 600, 500, 100, 100);
      }
      if (cropType == 28) {
        image(Str1, 0, 200, 100, 100);
        image(Str2, 100, 200, 100, 100);
        image(Str3, 200, 200, 100, 100);
        image(Str3, 300, 200, 100, 100);
        image(Str4, 400, 200, 100, 100);
        image(Str4, 500, 200, 100, 100);
        image(Str5, 600, 200, 100, 100);
        image(Str5, 0, 300, 100, 100);
        image(Str6, 100, 300, 100, 100);
        image(Str7, 200, 300, 100, 100);
        image(Str7, 300, 300, 100, 100);
        image(Str7, 400, 300, 100, 100);
        image(Str6, 500, 300, 100, 100);
        image(Str7, 600, 300, 100, 100);
        image(Str7, 0, 400, 100, 100);
        image(Str7, 100, 400, 100, 100);
        image(Str6, 200, 400, 100, 100);
        image(Str7, 300, 400, 100, 100);
        image(Str7, 400, 400, 100, 100);
        image(Str7, 500, 400, 100, 100);
        image(Str6, 600, 400, 100, 100);
        image(Str7, 0, 500, 100, 100);
        image(Str7, 100, 500, 100, 100);
        image(Str7, 200, 500, 100, 100);
        image(Str6, 300, 500, 100, 100);
        image(Str7, 400, 500, 100, 100);
        image(Str7, 500, 500, 100, 100);
        image(Str7, 600, 500, 100, 100);
      }
      if (cropType == 29) {
        image(SS1, 0, 200, 100, 100);
        image(SS2, 100, 200, 100, 100);
        image(SS2, 200, 200, 100, 100);
        image(SS3, 300, 200, 100, 100);
        image(SS3, 400, 200, 100, 100);
        image(SS3, 500, 200, 100, 100);
        image(SS4, 600, 200, 100, 100);
        image(SS4, 0, 300, 100, 100);
        image(SS5, 100, 300, 100, 100);
        image(SS1, 200, 300, 100, 100);
        image(SS2, 300, 300, 100, 100);
        image(SS2, 400, 300, 100, 100);
        image(SS3, 500, 300, 100, 100);
        image(SS3, 600, 300, 100, 100);
        image(SS3, 0, 400, 100, 100);
        image(SS4, 100, 400, 100, 100);
        image(SS4, 200, 400, 100, 100);
        image(SS5, 300, 400, 100, 100);
        image(SS1, 400, 400, 100, 100);
        image(SS2, 500, 400, 100, 100);
        image(SS2, 600, 400, 100, 100);
        image(SS3, 0, 500, 100, 100);
        image(SS3, 100, 500, 100, 100);
        image(SS3, 200, 500, 100, 100);
        image(SS4, 300, 500, 100, 100);
        image(SS4, 400, 500, 100, 100);
        image(SS5, 500, 500, 100, 100);
        image(SS1, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su1, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su2, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su3, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su4, 0, 300, 100, 100);
        image(Su5, 100, 300, 100, 100);
        image(Su1, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su2, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su3, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su4, 200, 400, 100, 100);
        image(Su5, 300, 400, 100, 100);
        image(Su1, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su2, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su3, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su4, 400, 500, 100, 100);
        image(Su5, 500, 500, 100, 100);
        image(Su1, 600, 500, 100, 100);
      }
      if (cropType == 31) {
        image(To1, 0, 200, 100, 100);
        image(To1, 100, 200, 100, 100);
        image(To2, 200, 200, 100, 100);
        image(To2, 300, 200, 100, 100);
        image(To3, 400, 200, 100, 100);
        image(To3, 500, 200, 100, 100);
        image(To4, 600, 200, 100, 100);
        image(To4, 0, 300, 100, 100);
        image(To5, 100, 300, 100, 100);
        image(To5, 200, 300, 100, 100);
        image(To5, 300, 300, 100, 100);
        image(To6, 400, 300, 100, 100);
        image(To7, 500, 300, 100, 100);
        image(To7, 600, 300, 100, 100);
        image(To7, 0, 400, 100, 100);
        image(To6, 100, 400, 100, 100);
        image(To7, 200, 400, 100, 100);
        image(To7, 300, 400, 100, 100);
        image(To7, 400, 400, 100, 100);
        image(To6, 500, 400, 100, 100);
        image(To7, 600, 400, 100, 100);
        image(To7, 0, 500, 100, 100);
        image(To7, 100, 500, 100, 100);
        image(To6, 200, 500, 100, 100);
        image(To7, 300, 500, 100, 100);
        image(To7, 400, 500, 100, 100);
        image(To7, 500, 500, 100, 100);
        image(To6, 600, 500, 100, 100);
      }
      if (cropType == 32) {
        image(Tu1, 0, 200, 100, 100);
        image(Tu2, 100, 200, 100, 100);
        image(Tu3, 200, 200, 100, 100);
        image(Tu3, 300, 200, 100, 100);
        image(Tu4, 400, 200, 100, 100);
        image(Tu4, 500, 200, 100, 100);
        image(Tu5, 600, 200, 100, 100);
        image(Tu1, 0, 300, 100, 100);
        image(Tu2, 100, 300, 100, 100);
        image(Tu3, 200, 300, 100, 100);
        image(Tu3, 300, 300, 100, 100);
        image(Tu4, 400, 300, 100, 100);
        image(Tu4, 500, 300, 100, 100);
        image(Tu5, 600, 300, 100, 100);
        image(Tu1, 0, 400, 100, 100);
        image(Tu2, 100, 400, 100, 100);
        image(Tu3, 200, 400, 100, 100);
        image(Tu3, 300, 400, 100, 100);
        image(Tu4, 400, 400, 100, 100);
        image(Tu4, 500, 400, 100, 100);
        image(Tu5, 600, 400, 100, 100);
        image(Tu1, 0, 500, 100, 100);
        image(Tu2, 100, 500, 100, 100);
        image(Tu3, 200, 500, 100, 100);
        image(Tu3, 300, 500, 100, 100);
        image(Tu4, 400, 500, 100, 100);
        image(Tu4, 500, 500, 100, 100);
        image(Tu5, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR2, 200, 200, 100, 100);
        image(UmR3, 300, 200, 100, 100);
        image(UmR3, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR4, 600, 200, 100, 100);
        image(UmR4, 0, 300, 100, 100);
        image(UmR5, 100, 300, 100, 100);
        image(UmR1, 200, 300, 100, 100);
        image(UmR2, 300, 300, 100, 100);
        image(UmR2, 400, 300, 100, 100);
        image(UmR3, 500, 300, 100, 100);
        image(UmR3, 600, 300, 100, 100);
        image(UmR4, 0, 400, 100, 100);
        image(UmR4, 100, 400, 100, 100);
        image(UmR4, 200, 400, 100, 100);
        image(UmR5, 300, 400, 100, 100);
        image(UmR1, 400, 400, 100, 100);
        image(UmR2, 500, 400, 100, 100);
        image(UmR2, 600, 400, 100, 100);
        image(UmR3, 0, 500, 100, 100);
        image(UmR3, 100, 500, 100, 100);
        image(UmR4, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR5, 500, 500, 100, 100);
        image(UmR1, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W1, 0, 200, 100, 100);
        image(W2, 100, 200, 100, 100);
        image(W3, 200, 200, 100, 100);
        image(W4, 300, 200, 100, 100);
        image(W5, 400, 200, 100, 100);
        image(W1, 500, 200, 100, 100);
        image(W2, 600, 200, 100, 100);
        image(W3, 0, 300, 100, 100);
        image(W4, 100, 300, 100, 100);
        image(W5, 200, 300, 100, 100);
        image(W1, 300, 300, 100, 100);
        image(W2, 400, 300, 100, 100);
        image(W3, 500, 300, 100, 100);
        image(W4, 600, 300, 100, 100);
        image(W5, 0, 400, 100, 100);
        image(W1, 100, 400, 100, 100);
        image(W2, 200, 400, 100, 100);
        image(W3, 300, 400, 100, 100);
        image(W4, 400, 400, 100, 100);
        image(W5, 500, 400, 100, 100);
        image(W1, 600, 400, 100, 100);
        image(W2, 0, 500, 100, 100);
        image(W3, 100, 500, 100, 100);
        image(W4, 200, 500, 100, 100);
        image(W5, 300, 500, 100, 100);
        image(W1, 400, 500, 100, 100);
        image(W2, 500, 500, 100, 100);
        image(W3, 600, 500, 100, 100);
      }
      if (cropType == 35) {
        image(Y1, 0, 200, 100, 100);
        image(Y2, 100, 200, 100, 100);
        image(Y2, 200, 200, 100, 100);
        image(Y2, 300, 200, 100, 100);
        image(Y3, 400, 200, 100, 100);
        image(Y3, 500, 200, 100, 100);
        image(Y3, 600, 200, 100, 100);
        image(Y4, 0, 300, 100, 100);
        image(Y4, 100, 300, 100, 100);
        image(Y4, 200, 300, 100, 100);
        image(Y5, 300, 300, 100, 100);
        image(Y1, 400, 300, 100, 100);
        image(Y2, 500, 300, 100, 100);
        image(Y2, 600, 300, 100, 100);
        image(Y2, 0, 400, 100, 100);
        image(Y3, 100, 400, 100, 100);
        image(Y3, 200, 400, 100, 100);
        image(Y3, 300, 400, 100, 100);
        image(Y4, 400, 400, 100, 100);
        image(Y4, 500, 400, 100, 100);
        image(Y4, 600, 400, 100, 100);
        image(Y5, 0, 500, 100, 100);
        image(Y1, 100, 500, 100, 100);
        image(Y2, 200, 500, 100, 100);
        image(Y2, 300, 500, 100, 100);
        image(Y2, 400, 500, 100, 100);
        image(Y3, 500, 500, 100, 100);
        image(Y3, 600, 500, 100, 100);
      }
    }
    if (cropCalendarDSGtype2) {
      if (cropType == 8) {
        image(CB6, 0, 200, 100, 100);
        image(CB7, 100, 200, 100, 100);
        image(CB6, 200, 200, 100, 100);
        image(CB7, 300, 200, 100, 100);
        image(CB6, 400, 200, 100, 100);
        image(CB7, 500, 200, 100, 100);
        image(CB6, 600, 200, 100, 100);
        image(CB7, 0, 300, 100, 100);
        image(CB6, 100, 300, 100, 100);
        image(CB7, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co7, 0, 200, 100, 100);
        image(Co7, 100, 200, 100, 100);
        image(Co6, 200, 200, 100, 100);
        image(Co7, 300, 200, 100, 100);
        image(Co7, 400, 200, 100, 100);
        image(Co7, 500, 200, 100, 100);
        image(Co6, 600, 200, 100, 100);
        image(Co7, 0, 300, 100, 100);
        image(Co7, 100, 300, 100, 100);
        image(Co7, 200, 300, 100, 100);
        image(Co6, 300, 300, 100, 100);
        image(Co7, 400, 300, 100, 100);
        image(Co7, 500, 300, 100, 100);
        image(Co7, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su2, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su3, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su4, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su5, 0, 300, 100, 100);
        image(Su1, 100, 300, 100, 100);
        image(Su2, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su3, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su4, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su5, 200, 400, 100, 100);
        image(Su1, 300, 400, 100, 100);
        image(Su2, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su3, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su4, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su5, 400, 500, 100, 100);
        image(Su1, 500, 500, 100, 100);
        image(Su2, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR3, 200, 200, 100, 100);
        image(UmR4, 300, 200, 100, 100);
        image(UmR4, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR5, 600, 200, 100, 100);
        image(UmR1, 0, 300, 100, 100);
        image(UmR2, 100, 300, 100, 100);
        image(UmR3, 200, 300, 100, 100);
        image(UmR4, 300, 300, 100, 100);
        image(UmR4, 400, 300, 100, 100);
        image(UmR4, 500, 300, 100, 100);
        image(UmR5, 600, 300, 100, 100);
        image(UmR1, 0, 400, 100, 100);
        image(UmR2, 100, 400, 100, 100);
        image(UmR3, 200, 400, 100, 100);
        image(UmR4, 300, 400, 100, 100);
        image(UmR4, 400, 400, 100, 100);
        image(UmR4, 500, 400, 100, 100);
        image(UmR5, 600, 400, 100, 100);
        image(UmR1, 0, 500, 100, 100);
        image(UmR2, 100, 500, 100, 100);
        image(UmR3, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR4, 500, 500, 100, 100);
        image(UmR5, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W4, 0, 200, 100, 100);
        image(W5, 100, 200, 100, 100);
        image(W1, 200, 200, 100, 100);
        image(W2, 300, 200, 100, 100);
        image(W3, 400, 200, 100, 100);
        image(W4, 500, 200, 100, 100);
        image(W5, 600, 200, 100, 100);
        image(W1, 0, 300, 100, 100);
        image(W2, 100, 300, 100, 100);
        image(W3, 200, 300, 100, 100);
        image(W4, 300, 300, 100, 100);
        image(W5, 400, 300, 100, 100);
        image(W1, 500, 300, 100, 100);
        image(W2, 600, 300, 100, 100);
        image(W3, 0, 400, 100, 100);
        image(W4, 100, 400, 100, 100);
        image(W5, 200, 400, 100, 100);
        image(W1, 300, 400, 100, 100);
        image(W1, 400, 400, 100, 100);
        image(W2, 500, 400, 100, 100);
        image(W3, 600, 400, 100, 100);
        image(W4, 0, 500, 100, 100);
        image(W5, 100, 500, 100, 100);
        image(W1, 200, 500, 100, 100);
        image(W2, 300, 500, 100, 100);
        image(W3, 400, 500, 100, 100);
        image(W4, 500, 500, 100, 100);
        image(W5, 600, 500, 100, 100);
      }
    }
    if (cropType == 8 || cropType == 9 || cropType == 30 || cropType == 33 || cropType == 34) {
      if (keyPressed) {
        if (key == CODED) {
          if (keyCode == SHIFT) {
            cropCalendarDSGtype2 = true;
            cropCalendarDSGtype1 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
          if (keyCode == CONTROL) {
            cropCalendarDSGtype1 = true;
            cropCalendarDSGtype2 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
        }
      }
    }
    if (keyPressed) {
      if (key == 'V' || key == 'v') {
        cropSelect = true;
        cropCalendarDSG= false;
        fill(0);
        rect(0, 0, 700, 600);
      }
      if (key == 'C' || key == 'c') {
        cropCalendarDSG= false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalculator = true;
      }
      if(key == '1') {
        cropCalendarDSG= false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalendarN = true;
      }
    }
  }
}*/
public void CalendarmodeN() {
  if (cropCalendarN == true) {

    //build
    stroke(255);
    for (int i = 100; i < 600; i += 100) {
      line(0, i, 700, i);
    }
    for (int i = 100; i < 700; i += 100) {
      line(i, 100, i, 600);
    }
    //text
    fill(255);
    textSize(32);
    text("Mon", 20, 200);
    text("Tue", 120, 200);
    text("Wed", 220, 200);
    text("Thu", 320, 200);
    text("Fri", 420, 200);
    text("Sat", 520, 200);
    text("Sun", 620, 200);
    if (cropCalendarNtype1) {
      if (cropType == 1) {
        image(Am1, 0, 200, 100, 100);
        image(Am2, 100, 200, 100, 100);
        image(Am2, 200, 200, 100, 100);
        image(Am3, 300, 200, 100, 100);
        image(Am3, 400, 200, 100, 100);
        image(Am4, 500, 200, 100, 100);
        image(Am4, 600, 200, 100, 100);
        image(Am5, 0, 300, 100, 100);
        image(Am1, 100, 300, 100, 100);
        image(Am2, 200, 300, 100, 100);
        image(Am2, 300, 300, 100, 100);
        image(Am3, 400, 300, 100, 100);
        image(Am3, 500, 300, 100, 100);
        image(Am4, 600, 300, 100, 100);
        image(Am4, 0, 400, 100, 100);
        image(Am5, 100, 400, 100, 100);
        image(Am1, 200, 400, 100, 100);
        image(Am2, 300, 400, 100, 100);
        image(Am2, 400, 400, 100, 100);
        image(Am3, 500, 400, 100, 100);
        image(Am3, 600, 400, 100, 100);
        image(Am4, 0, 500, 100, 100);
        image(Am4, 100, 500, 100, 100);
        image(Am5, 200, 500, 100, 100);
        image(Am1, 300, 500, 100, 100);
        image(Am2, 400, 500, 100, 100);
        image(Am2, 500, 500, 100, 100);
        image(Am3, 600, 500, 100, 100);
      }
      if (cropType == 2) {
        image(Ar1, 0, 200, 100, 100);
        image(Ar1, 100, 200, 100, 100);
        image(Ar2, 200, 200, 100, 100);
        image(Ar2, 300, 200, 100, 100);
        image(Ar3, 400, 200, 100, 100);
        image(Ar4, 500, 200, 100, 100);
        image(Ar4, 600, 200, 100, 100);
        image(Ar5, 0, 300, 100, 100);
        image(Ar6, 100, 300, 100, 100);
        image(Ar1, 200, 300, 100, 100);
        image(Ar1, 300, 300, 100, 100);
        image(Ar2, 400, 300, 100, 100);
        image(Ar2, 500, 300, 100, 100);
        image(Ar3, 600, 300, 100, 100);
        image(Ar4, 0, 400, 100, 100);
        image(Ar4, 100, 400, 100, 100);
        image(Ar5, 200, 400, 100, 100);
        image(Ar6, 300, 400, 100, 100);
        image(Ar1, 400, 400, 100, 100);
        image(Ar1, 500, 400, 100, 100);
        image(Ar2, 600, 400, 100, 100);
        image(Ar2, 0, 500, 100, 100);
        image(Ar3, 100, 500, 100, 100);
        image(Ar4, 200, 500, 100, 100);
        image(Ar4, 300, 500, 100, 100);
        image(Ar5, 400, 500, 100, 100);
        image(Ar6, 500, 500, 100, 100);
        image(Ar1, 600, 500, 100, 100);
      }
      if (cropType == 3) {
        image(Be1, 0, 200, 100, 100);
        image(Be2, 100, 200, 100, 100);
        image(Be3, 200, 200, 100, 100);
        image(Be3, 300, 200, 100, 100);
        image(Be4, 400, 200, 100, 100);
        image(Be4, 500, 200, 100, 100);
        image(Be5, 600, 200, 100, 100);
        image(Be1, 0, 300, 100, 100);
        image(Be2, 100, 300, 100, 100);
        image(Be3, 200, 300, 100, 100);
        image(Be3, 300, 300, 100, 100);
        image(Be4, 400, 300, 100, 100);
        image(Be4, 500, 300, 100, 100);
        image(Be5, 600, 300, 100, 100);
        image(Be1, 0, 400, 100, 100);
        image(Be2, 100, 400, 100, 100);
        image(Be3, 200, 400, 100, 100);
        image(Be3, 300, 400, 100, 100);
        image(Be4, 400, 400, 100, 100);
        image(Be4, 500, 400, 100, 100);
        image(Be5, 600, 400, 100, 100);
        image(Be1, 0, 500, 100, 100);
        image(Be2, 100, 500, 100, 100);
        image(Be3, 200, 500, 100, 100);
        image(Be3, 300, 500, 100, 100);
        image(Be4, 400, 500, 100, 100);
        image(Be4, 500, 500, 100, 100);
        image(Be5, 600, 500, 100, 100);
      }
      if (cropType == 4) {
        image(Bl1, 0, 200, 100, 100);
        image(Bl2, 100, 200, 100, 100);
        image(Bl2, 200, 200, 100, 100);
        image(Bl2, 300, 200, 100, 100);
        image(Bl3, 400, 200, 100, 100);
        image(Bl3, 500, 200, 100, 100);
        image(Bl3, 600, 200, 100, 100);
        image(Bl4, 0, 300, 100, 100);
        image(Bl4, 100, 300, 100, 100);
        image(Bl4, 200, 300, 100, 100);
        image(Bl4, 300, 300, 100, 100);
        image(Bl5, 400, 300, 100, 100);
        image(Bl5, 500, 300, 100, 100);
        image(Bl6, 600, 300, 100, 100);
        image(Bl7, 0, 400, 100, 100);
        image(Bl7, 100, 400, 100, 100);
        image(Bl7, 200, 400, 100, 100);
        image(Bl6, 300, 400, 100, 100);
        image(Bl7, 400, 400, 100, 100);
        image(Bl7, 500, 400, 100, 100);
        image(Bl7, 600, 400, 100, 100);
        image(Bl6, 0, 500, 100, 100);
        image(Bl7, 100, 500, 100, 100);
        image(Bl7, 200, 500, 100, 100);
        image(Bl7, 300, 500, 100, 100);
        image(Bl6, 400, 500, 100, 100);
        image(Bl7, 500, 500, 100, 100);
        image(Bl7, 600, 500, 100, 100);
      }
      if (cropType == 5) {
        image(BJ1, 0, 200, 100, 100);
        image(BJ2, 100, 200, 100, 100);
        image(BJ2, 200, 200, 100, 100);
        image(BJ3, 300, 200, 100, 100);
        image(BJ3, 400, 200, 100, 100);
        image(BJ4, 500, 200, 100, 100);
        image(BJ4, 600, 200, 100, 100);
        image(BJ5, 0, 300, 100, 100);
        image(BJ1, 100, 300, 100, 100);
        image(BJ2, 200, 300, 100, 100);
        image(BJ2, 300, 300, 100, 100);
        image(BJ3, 400, 300, 100, 100);
        image(BJ3, 500, 300, 100, 100);
        image(BJ4, 600, 300, 100, 100);
        image(BJ4, 0, 400, 100, 100);
        image(BJ5, 100, 400, 100, 100);
        image(BJ1, 200, 400, 100, 100);
        image(BJ2, 300, 400, 100, 100);
        image(BJ2, 400, 400, 100, 100);
        image(BJ3, 500, 400, 100, 100);
        image(BJ3, 600, 400, 100, 100);
        image(BJ4, 0, 500, 100, 100);
        image(BJ4, 100, 500, 100, 100);
        image(BJ5, 200, 500, 100, 100);
        image(BJ1, 300, 500, 100, 100);
        image(BJ2, 400, 500, 100, 100);
        image(BJ2, 500, 500, 100, 100);
        image(BJ3, 600, 500, 100, 100);
      }
      if (cropType == 6) {
        image(BC1, 0, 200, 100, 100);
        image(BC2, 100, 200, 100, 100);
        image(BC3, 200, 200, 100, 100);
        image(BC4, 300, 200, 100, 100);
        image(BC5, 400, 200, 100, 100);
        image(BC1, 500, 200, 100, 100);
        image(BC2, 600, 200, 100, 100);
        image(BC3, 0, 300, 100, 100);
        image(BC4, 100, 300, 100, 100);
        image(BC5, 200, 300, 100, 100);
        image(BC1, 300, 300, 100, 100);
        image(BC2, 400, 300, 100, 100);
        image(BC3, 500, 300, 100, 100);
        image(BC4, 600, 300, 100, 100);
        image(BC5, 0, 400, 100, 100);
        image(BC1, 100, 400, 100, 100);
        image(BC2, 200, 400, 100, 100);
        image(BC3, 300, 400, 100, 100);
        image(BC4, 400, 400, 100, 100);
        image(BC5, 500, 400, 100, 100);
        image(BC1, 600, 400, 100, 100);
        image(BC2, 0, 500, 100, 100);
        image(BC3, 100, 500, 100, 100);
        image(BC4, 200, 500, 100, 100);
        image(BC5, 300, 500, 100, 100);
        image(BC1, 400, 500, 100, 100);
        image(BC2, 500, 500, 100, 100);
        image(BC3, 600, 500, 100, 100);
      }
      if (cropType == 7) {
        image(Ca1, 0, 200, 100, 100);
        image(Ca2, 100, 200, 100, 100);
        image(Ca2, 200, 200, 100, 100);
        image(Ca3, 300, 200, 100, 100);
        image(Ca3, 400, 200, 100, 100);
        image(Ca3, 500, 200, 100, 100);
        image(Ca3, 600, 200, 100, 100);
        image(Ca4, 0, 300, 100, 100);
        image(Ca4, 100, 300, 100, 100);
        image(Ca4, 200, 300, 100, 100);
        image(Ca4, 300, 300, 100, 100);
        image(Ca5, 400, 300, 100, 100);
        image(Ca6, 500, 300, 100, 100);
        image(Ca1, 600, 300, 100, 100);
        image(Ca2, 0, 400, 100, 100);
        image(Ca2, 100, 400, 100, 100);
        image(Ca3, 200, 400, 100, 100);
        image(Ca3, 300, 400, 100, 100);
        image(Ca3, 400, 400, 100, 100);
        image(Ca3, 500, 400, 100, 100);
        image(Ca4, 600, 400, 100, 100);
        image(Ca4, 0, 500, 100, 100);
        image(Ca4, 100, 500, 100, 100);
        image(Ca4, 200, 500, 100, 100);
        image(Ca5, 300, 500, 100, 100);
        image(Ca6, 400, 500, 100, 100);
        image(Ca1, 500, 500, 100, 100);
        image(Ca2, 600, 500, 100, 100);
      }
      if (cropType == 8) {
        image(CB1, 0, 200, 100, 100);
        image(CB2, 100, 200, 100, 100);
        image(CB2, 200, 200, 100, 100);
        image(CB3, 300, 200, 100, 100);
        image(CB3, 400, 200, 100, 100);
        image(CB4, 500, 200, 100, 100);
        image(CB4, 600, 200, 100, 100);
        image(CB4, 0, 300, 100, 100);
        image(CB5, 100, 300, 100, 100);
        image(CB5, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co1, 0, 200, 100, 100);
        image(Co1, 100, 200, 100, 100);
        image(Co2, 200, 200, 100, 100);
        image(Co2, 300, 200, 100, 100);
        image(Co2, 400, 200, 100, 100);
        image(Co3, 500, 200, 100, 100);
        image(Co3, 600, 200, 100, 100);
        image(Co3, 0, 300, 100, 100);
        image(Co4, 100, 300, 100, 100);
        image(Co4, 200, 300, 100, 100);
        image(Co4, 300, 300, 100, 100);
        image(Co5, 400, 300, 100, 100);
        image(Co5, 500, 300, 100, 100);
        image(Co5, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 10) {
        image(Cr1, 0, 200, 100, 100);
        image(Cr2, 100, 200, 100, 100);
        image(Cr2, 200, 200, 100, 100);
        image(Cr3, 300, 200, 100, 100);
        image(Cr4, 400, 200, 100, 100);
        image(Cr5, 500, 200, 100, 100);
        image(Cr5, 600, 200, 100, 100);
        image(Cr6, 0, 300, 100, 100);
        image(Cr7, 100, 300, 100, 100);
        image(Cr7, 200, 300, 100, 100);
        image(Cr7, 300, 300, 100, 100);
        image(Cr7, 400, 300, 100, 100);
        image(Cr6, 500, 300, 100, 100);
        image(Cr7, 600, 300, 100, 100);
        image(Cr7, 0, 400, 100, 100);
        image(Cr7, 100, 400, 100, 100);
        image(Cr7, 200, 400, 100, 100);
        image(Cr6, 300, 400, 100, 100);
        image(Cr7, 400, 400, 100, 100);
        image(Cr7, 500, 400, 100, 100);
        image(Cr7, 600, 400, 100, 100);
        image(Cr7, 0, 500, 100, 100);
        image(Cr6, 100, 500, 100, 100);
        image(Cr7, 200, 500, 100, 100);
        image(Cr7, 300, 500, 100, 100);
        image(Cr7, 400, 500, 100, 100);
        image(Cr7, 500, 500, 100, 100);
        image(Cr6, 600, 500, 100, 100);
      }
      if (cropType == 11) {
        image(E1, 0, 200, 100, 100);
        image(E2, 100, 200, 100, 100);
        image(E3, 200, 200, 100, 100);
        image(E4, 300, 200, 100, 100);
        image(E5, 400, 200, 100, 100);
        image(E6, 500, 200, 100, 100);
        image(E1, 600, 200, 100, 100);
        image(E2, 0, 300, 100, 100);
        image(E3, 100, 300, 100, 100);
        image(E4, 200, 300, 100, 100);
        image(E5, 300, 300, 100, 100);
        image(E6, 400, 300, 100, 100);
        image(E1, 500, 300, 100, 100);
        image(E2, 600, 300, 100, 100);
        image(E3, 0, 400, 100, 100);
        image(E4, 100, 400, 100, 100);
        image(E5, 200, 400, 100, 100);
        image(E6, 300, 400, 100, 100);
        image(E1, 400, 400, 100, 100);
        image(E2, 500, 400, 100, 100);
        image(E3, 600, 400, 100, 100);
        image(E4, 0, 500, 100, 100);
        image(E5, 100, 500, 100, 100);
        image(E6, 200, 500, 100, 100);
        image(E1, 300, 500, 100, 100);
        image(E2, 400, 500, 100, 100);
        image(E3, 500, 500, 100, 100);
        image(E4, 600, 500, 100, 100);
      }
      if (cropType == 12) {
        image(FR1, 0, 200, 100, 100);
        image(FR2, 100, 200, 100, 100);
        image(FR2, 200, 200, 100, 100);
        image(FR2, 300, 200, 100, 100);
        image(FR2, 400, 200, 100, 100);
        image(FR3, 500, 200, 100, 100);
        image(FR3, 600, 200, 100, 100);
        image(FR3, 0, 300, 100, 100);
        image(FR3, 100, 300, 100, 100);
        image(FR4, 200, 300, 100, 100);
        image(FR4, 300, 300, 100, 100);
        image(FR4, 400, 300, 100, 100);
        image(FR5, 500, 300, 100, 100);
        image(FR1, 600, 300, 100, 100);
        image(FR2, 0, 400, 100, 100);
        image(FR2, 100, 400, 100, 100);
        image(FR2, 200, 400, 100, 100);
        image(FR2, 300, 400, 100, 100);
        image(FR3, 400, 400, 100, 100);
        image(FR3, 500, 400, 100, 100);
        image(FR3, 600, 400, 100, 100);
        image(FR3, 0, 500, 100, 100);
        image(FR4, 100, 500, 100, 100);
        image(FR4, 200, 500, 100, 100);
        image(FR4, 300, 500, 100, 100);
        image(FR5, 400, 500, 100, 100);
        image(FR1, 500, 500, 100, 100);
        image(FR2, 600, 500, 100, 100);
      }
      if (cropType == 13) {
        image(Ga1, 0, 200, 100, 100);
        image(Ga2, 100, 200, 100, 100);
        image(Ga3, 200, 200, 100, 100);
        image(Ga4, 300, 200, 100, 100);
        image(Ga5, 400, 200, 100, 100);
        image(Ga1, 500, 200, 100, 100);
        image(Ga2, 600, 200, 100, 100);
        image(Ga3, 0, 300, 100, 100);
        image(Ga4, 100, 300, 100, 100);
        image(Ga5, 200, 300, 100, 100);
        image(Ga1, 300, 300, 100, 100);
        image(Ga2, 400, 300, 100, 100);
        image(Ga3, 500, 300, 100, 100);
        image(Ga4, 600, 300, 100, 100);
        image(Ga5, 0, 400, 100, 100);
        image(Ga1, 100, 400, 100, 100);
        image(Ga2, 200, 400, 100, 100);
        image(Ga3, 300, 400, 100, 100);
        image(Ga4, 400, 400, 100, 100);
        image(Ga5, 500, 400, 100, 100);
        image(Ga1, 600, 400, 100, 100);
        image(Ga2, 0, 500, 100, 100);
        image(Ga3, 100, 500, 100, 100);
        image(Ga4, 200, 500, 100, 100);
        image(Ga5, 300, 500, 100, 100);
        image(Ga1, 400, 500, 100, 100);
        image(Ga2, 500, 500, 100, 100);
        image(Ga3, 600, 500, 100, 100);
      }
      if (cropType == 14) {
        image(GB1, 0, 200, 100, 100);
        image(GB2, 100, 200, 100, 100);
        image(GB3, 200, 200, 100, 100);
        image(GB4, 300, 200, 100, 100);
        image(GB4, 400, 200, 100, 100);
        image(GB4, 500, 200, 100, 100);
        image(GB5, 600, 200, 100, 100);
        image(GB5, 0, 300, 100, 100);
        image(GB5, 100, 300, 100, 100);
        image(GB5, 200, 300, 100, 100);
        image(GB6, 300, 300, 100, 100);
        image(GB7, 400, 300, 100, 100);
        image(GB7, 500, 300, 100, 100);
        image(GB6, 600, 300, 100, 100);
        image(GB7, 0, 400, 100, 100);
        image(GB7, 100, 400, 100, 100);
        image(GB6, 200, 400, 100, 100);
        image(GB7, 300, 400, 100, 100);
        image(GB7, 400, 400, 100, 100);
        image(GB6, 500, 400, 100, 100);
        image(GB7, 600, 400, 100, 100);
        image(GB7, 0, 500, 100, 100);
        image(GB6, 100, 500, 100, 100);
        image(GB7, 200, 500, 100, 100);
        image(GB7, 300, 500, 100, 100);
        image(GB6, 400, 500, 100, 100);
        image(GB7, 500, 500, 100, 100);
        image(GB7, 600, 500, 100, 100);
      }
      if (cropType == 15) {
        image(Gr1, 0, 200, 100, 100);
        image(Gr2, 100, 200, 100, 100);
        image(Gr3, 200, 200, 100, 100);
        image(Gr3, 300, 200, 100, 100);
        image(Gr4, 400, 200, 100, 100);
        image(Gr4, 500, 200, 100, 100);
        image(Gr4, 600, 200, 100, 100);
        image(Gr5, 0, 300, 100, 100);
        image(Gr5, 100, 300, 100, 100);
        image(Gr5, 200, 300, 100, 100);
        image(Gr6, 300, 300, 100, 100);
        image(Gr7, 400, 300, 100, 100);
        image(Gr7, 500, 300, 100, 100);
        image(Gr6, 600, 300, 100, 100);
        image(Gr7, 0, 400, 100, 100);
        image(Gr7, 100, 400, 100, 100);
        image(Gr6, 200, 400, 100, 100);
        image(Gr7, 300, 400, 100, 100);
        image(Gr7, 400, 400, 100, 100);
        image(Gr6, 500, 400, 100, 100);
        image(Gr7, 600, 400, 100, 100);
        image(Gr7, 0, 500, 100, 100);
        image(Gr6, 100, 500, 100, 100);
        image(Gr7, 200, 500, 100, 100);
        image(Gr7, 300, 500, 100, 100);
        image(Gr6, 400, 500, 100, 100);
        image(Gr7, 500, 500, 100, 100);
        image(Gr7, 600, 500, 100, 100);
      }
      if (cropType == 16) {
        image(H1, 0, 200, 100, 100);
        image(H2, 100, 200, 100, 100);
        image(H3, 200, 200, 100, 100);
        image(H3, 300, 200, 100, 100);
        image(H4, 400, 200, 100, 100);
        image(H4, 500, 200, 100, 100);
        image(H4, 600, 200, 100, 100);
        image(H5, 0, 300, 100, 100);
        image(H5, 100, 300, 100, 100);
        image(H5, 200, 300, 100, 100);
        image(H5, 300, 300, 100, 100);
        image(H6, 400, 300, 100, 100);
        image(H6, 500, 300, 100, 100);
        image(H6, 600, 300, 100, 100);
        image(H6, 0, 400, 100, 100);
        image(H6, 100, 400, 100, 100);
        image(H6, 200, 400, 100, 100);
        image(H6, 300, 400, 100, 100);
        image(H6, 400, 400, 100, 100);
        image(H6, 500, 400, 100, 100);
        image(H6, 600, 400, 100, 100);
        image(H6, 0, 500, 100, 100);
        image(H6, 100, 500, 100, 100);
        image(H6, 200, 500, 100, 100);
        image(H6, 300, 500, 100, 100);
        image(H6, 400, 500, 100, 100);
        image(H6, 500, 500, 100, 100);
        image(H6, 600, 500, 100, 100);
      }
      if (cropType == 17) {
        image(HP1, 0, 200, 100, 100);
        image(HP2, 100, 200, 100, 100);
        image(HP3, 200, 200, 100, 100);
        image(HP4, 300, 200, 100, 100);
        image(HP5, 400, 200, 100, 100);
        image(HP6, 500, 200, 100, 100);
        image(HP7, 600, 200, 100, 100);
        image(HP7, 0, 300, 100, 100);
        image(HP6, 100, 300, 100, 100);
        image(HP7, 200, 300, 100, 100);
        image(HP7, 300, 300, 100, 100);
        image(HP6, 400, 300, 100, 100);
        image(HP7, 500, 300, 100, 100);
        image(HP7, 600, 300, 100, 100);
        image(HP6, 0, 400, 100, 100);
        image(HP7, 100, 400, 100, 100);
        image(HP7, 200, 400, 100, 100);
        image(HP6, 300, 400, 100, 100);
        image(HP7, 400, 400, 100, 100);
        image(HP7, 500, 400, 100, 100);
        image(HP6, 600, 400, 100, 100);
        image(HP7, 0, 500, 100, 100);
        image(HP7, 100, 500, 100, 100);
        image(HP6, 200, 500, 100, 100);
        image(HP7, 300, 500, 100, 100);
        image(HP7, 400, 500, 100, 100);
        image(HP6, 500, 500, 100, 100);
        image(HP7, 600, 500, 100, 100);
      }
      if (cropType == 18) {
        image(K1, 0, 200, 100, 100);
        image(K2, 100, 200, 100, 100);
        image(K2, 200, 200, 100, 100);
        image(K3, 300, 200, 100, 100);
        image(K3, 400, 200, 100, 100);
        image(K4, 500, 200, 100, 100);
        image(K5, 600, 200, 100, 100);
        image(K1, 0, 300, 100, 100);
        image(K2, 100, 300, 100, 100);
        image(K2, 200, 300, 100, 100);
        image(K3, 300, 300, 100, 100);
        image(K3, 400, 300, 100, 100);
        image(K4, 500, 300, 100, 100);
        image(K5, 600, 300, 100, 100);
        image(K1, 0, 400, 100, 100);
        image(K2, 100, 400, 100, 100);
        image(K2, 200, 400, 100, 100);
        image(K3, 300, 400, 100, 100);
        image(K3, 400, 400, 100, 100);
        image(K4, 500, 400, 100, 100);
        image(K5, 600, 400, 100, 100);
        image(K1, 0, 500, 100, 100);
        image(K2, 100, 500, 100, 100);
        image(K2, 200, 500, 100, 100);
        image(K3, 300, 500, 100, 100);
        image(K3, 400, 500, 100, 100);
        image(K4, 500, 500, 100, 100);
        image(K5, 600, 500, 100, 100);
      }
      if (cropType == 19) {
        image(M1, 0, 200, 100, 100);
        image(M2, 100, 200, 100, 100);
        image(M2, 200, 200, 100, 100);
        image(M3, 300, 200, 100, 100);
        image(M3, 400, 200, 100, 100);
        image(M3, 500, 200, 100, 100);
        image(M4, 600, 200, 100, 100);
        image(M4, 0, 300, 100, 100);
        image(M4, 100, 300, 100, 100);
        image(M5, 200, 300, 100, 100);
        image(M5, 300, 300, 100, 100);
        image(M5, 400, 300, 100, 100);
        image(M6, 500, 300, 100, 100);
        image(M1, 600, 300, 100, 100);
        image(M2, 0, 400, 100, 100);
        image(M2, 100, 400, 100, 100);
        image(M3, 200, 400, 100, 100);
        image(M3, 300, 400, 100, 100);
        image(M3, 400, 400, 100, 100);
        image(M4, 500, 400, 100, 100);
        image(M4, 600, 400, 100, 100);
        image(M4, 0, 500, 100, 100);
        image(M5, 100, 500, 100, 100);
        image(M5, 200, 500, 100, 100);
        image(M5, 300, 500, 100, 100);
        image(M6, 400, 500, 100, 100);
        image(M1, 500, 500, 100, 100);
        image(M2, 600, 500, 100, 100);
      }
      if (cropType == 20) {
        image(Par1, 0, 200, 100, 100);
        image(Par2, 100, 200, 100, 100);
        image(Par3, 200, 200, 100, 100);
        image(Par4, 300, 200, 100, 100);
        image(Par5, 400, 200, 100, 100);
        image(Par1, 500, 200, 100, 100);
        image(Par2, 600, 200, 100, 100);
        image(Par3, 0, 300, 100, 100);
        image(Par4, 100, 300, 100, 100);
        image(Par5, 200, 300, 100, 100);
        image(Par1, 300, 300, 100, 100);
        image(Par2, 400, 300, 100, 100);
        image(Par3, 500, 300, 100, 100);
        image(Par4, 600, 300, 100, 100);
        image(Par5, 0, 400, 100, 100);
        image(Par1, 100, 400, 100, 100);
        image(Par2, 200, 400, 100, 100);
        image(Par3, 300, 400, 100, 100);
        image(Par4, 400, 400, 100, 100);
        image(Par5, 500, 400, 100, 100);
        image(Par1, 600, 400, 100, 100);
        image(Par2, 0, 500, 100, 100);
        image(Par3, 100, 500, 100, 100);
        image(Par4, 200, 500, 100, 100);
        image(Par5, 300, 500, 100, 100);
        image(Par1, 400, 500, 100, 100);
        image(Par2, 500, 500, 100, 100);
        image(Par3, 600, 500, 100, 100);
      }
      if (cropType == 21) {
        image(Pop1, 0, 200, 100, 100);
        image(Pop2, 100, 200, 100, 100);
        image(Pop2, 200, 200, 100, 100);
        image(Pop3, 300, 200, 100, 100);
        image(Pop3, 400, 200, 100, 100);
        image(Pop4, 500, 200, 100, 100);
        image(Pop4, 600, 200, 100, 100);
        image(Pop5, 0, 300, 100, 100);
        image(Pop1, 100, 300, 100, 100);
        image(Pop2, 200, 300, 100, 100);
        image(Pop2, 300, 300, 100, 100);
        image(Pop3, 400, 300, 100, 100);
        image(Pop3, 500, 300, 100, 100);
        image(Pop4, 600, 300, 100, 100);
        image(Pop4, 0, 400, 100, 100);
        image(Pop5, 100, 400, 100, 100);
        image(Pop1, 200, 400, 100, 100);
        image(Pop2, 300, 400, 100, 100);
        image(Pop2, 400, 400, 100, 100);
        image(Pop3, 500, 400, 100, 100);
        image(Pop3, 600, 400, 100, 100);
        image(Pop4, 0, 500, 100, 100);
        image(Pop4, 100, 500, 100, 100);
        image(Pop5, 200, 500, 100, 100);
        image(Pop1, 300, 500, 100, 100);
        image(Pop2, 400, 500, 100, 100);
        image(Pop2, 500, 500, 100, 100);
        image(Pop3, 600, 500, 100, 100);
      }
      if (cropType == 22) {
        image(Pot1, 0, 200, 100, 100);
        image(Pot2, 100, 200, 100, 100);
        image(Pot3, 200, 200, 100, 100);
        image(Pot4, 300, 200, 100, 100);
        image(Pot4, 400, 200, 100, 100);
        image(Pot5, 500, 200, 100, 100);
        image(Pot6, 600, 200, 100, 100);
        image(Pot1, 0, 300, 100, 100);
        image(Pot2, 100, 300, 100, 100);
        image(Pot3, 200, 300, 100, 100);
        image(Pot4, 300, 300, 100, 100);
        image(Pot4, 400, 300, 100, 100);
        image(Pot5, 500, 300, 100, 100);
        image(Pot6, 600, 300, 100, 100);
        image(Pot1, 0, 400, 100, 100);
        image(Pot2, 100, 400, 100, 100);
        image(Pot3, 200, 400, 100, 100);
        image(Pot4, 300, 400, 100, 100);
        image(Pot4, 400, 400, 100, 100);
        image(Pot5, 500, 400, 100, 100);
        image(Pot6, 600, 400, 100, 100);
        image(Pot1, 0, 500, 100, 100);
        image(Pot2, 100, 500, 100, 100);
        image(Pot3, 200, 500, 100, 100);
        image(Pot4, 300, 500, 100, 100);
        image(Pot4, 400, 500, 100, 100);
        image(Pot5, 500, 500, 100, 100);
        image(Pot6, 600, 500, 100, 100);
      }
      if (cropType == 23) {
        image(Pum1, 0, 200, 100, 100);
        image(Pum2, 100, 200, 100, 100);
        image(Pum2, 200, 200, 100, 100);
        image(Pum3, 300, 200, 100, 100);
        image(Pum3, 400, 200, 100, 100);
        image(Pum3, 500, 200, 100, 100);
        image(Pum4, 600, 200, 100, 100);
        image(Pum4, 0, 300, 100, 100);
        image(Pum4, 100, 300, 100, 100);
        image(Pum4, 200, 300, 100, 100);
        image(Pum5, 300, 300, 100, 100);
        image(Pum5, 400, 300, 100, 100);
        image(Pum5, 500, 300, 100, 100);
        image(Pum6, 600, 300, 100, 100);
        image(Pum1, 0, 400, 100, 100);
        image(Pum2, 100, 400, 100, 100);
        image(Pum2, 200, 400, 100, 100);
        image(Pum3, 300, 400, 100, 100);
        image(Pum3, 400, 400, 100, 100);
        image(Pum3, 500, 400, 100, 100);
        image(Pum4, 600, 400, 100, 100);
        image(Pum4, 0, 500, 100, 100);
        image(Pum4, 100, 500, 100, 100);
        image(Pum4, 200, 500, 100, 100);
        image(Pum5, 300, 500, 100, 100);
        image(Pum5, 400, 500, 100, 100);
        image(Pum5, 500, 500, 100, 100);
        image(Pum6, 600, 500, 100, 100);
      }
      if (cropType == 24) {
        image(Ra1, 0, 200, 100, 100);
        image(Ra1, 100, 200, 100, 100);
        image(Ra2, 200, 200, 100, 100);
        image(Ra3, 300, 200, 100, 100);
        image(Ra3, 400, 200, 100, 100);
        image(Ra4, 500, 200, 100, 100);
        image(Ra5, 600, 200, 100, 100);
        image(Ra1, 0, 300, 100, 100);
        image(Ra1, 100, 300, 100, 100);
        image(Ra2, 200, 300, 100, 100);
        image(Ra3, 300, 300, 100, 100);
        image(Ra3, 400, 300, 100, 100);
        image(Ra4, 500, 300, 100, 100);
        image(Ra5, 600, 300, 100, 100);
        image(Ra1, 0, 400, 100, 100);
        image(Ra1, 100, 400, 100, 100);
        image(Ra2, 200, 400, 100, 100);
        image(Ra3, 300, 400, 100, 100);
        image(Ra3, 400, 400, 100, 100);
        image(Ra4, 500, 400, 100, 100);
        image(Ra5, 600, 400, 100, 100);
        image(Ra1, 0, 500, 100, 100);
        image(Ra1, 100, 500, 100, 100);
        image(Ra2, 200, 500, 100, 100);
        image(Ra3, 300, 500, 100, 100);
        image(Ra3, 400, 500, 100, 100);
        image(Ra4, 500, 500, 100, 100);
        image(Ra5, 600, 500, 100, 100);
      }
      if (cropType == 25) {
        image(RC1, 0, 200, 100, 100);
        image(RC1, 100, 200, 100, 100);
        image(RC2, 200, 200, 100, 100);
        image(RC3, 300, 200, 100, 100);
        image(RC3, 400, 200, 100, 100);
        image(RC4, 500, 200, 100, 100);
        image(RC4, 600, 200, 100, 100);
        image(RC5, 0, 300, 100, 100);
        image(RC5, 100, 300, 100, 100);
        image(RC6, 200, 300, 100, 100);
        image(RC1, 300, 300, 100, 100);
        image(RC1, 400, 300, 100, 100);
        image(RC2, 500, 300, 100, 100);
        image(RC3, 600, 300, 100, 100);
        image(RC3, 0, 400, 100, 100);
        image(RC4, 100, 400, 100, 100);
        image(RC4, 200, 400, 100, 100);
        image(RC5, 300, 400, 100, 100);
        image(RC5, 400, 400, 100, 100);
        image(RC6, 500, 400, 100, 100);
        image(RC1, 600, 400, 100, 100);
        image(RC1, 0, 500, 100, 100);
        image(RC2, 100, 500, 100, 100);
        image(RC3, 200, 500, 100, 100);
        image(RC3, 300, 500, 100, 100);
        image(RC4, 400, 500, 100, 100);
        image(RC4, 500, 500, 100, 100);
        image(RC5, 600, 500, 100, 100);
      }
      if (cropType == 26) {
        image(Rh1, 0, 200, 100, 100);
        image(Rh1, 100, 200, 100, 100);
        image(Rh2, 200, 200, 100, 100);
        image(Rh2, 300, 200, 100, 100);
        image(Rh3, 400, 200, 100, 100);
        image(Rh3, 500, 200, 100, 100);
        image(Rh4, 600, 200, 100, 100);
        image(Rh4, 0, 300, 100, 100);
        image(Rh4, 100, 300, 100, 100);
        image(Rh5, 200, 300, 100, 100);
        image(Rh5, 300, 300, 100, 100);
        image(Rh5, 400, 300, 100, 100);
        image(Rh5, 500, 300, 100, 100);
        image(Rh6, 600, 300, 100, 100);
        image(Rh1, 0, 400, 100, 100);
        image(Rh1, 100, 400, 100, 100);
        image(Rh2, 200, 400, 100, 100);
        image(Rh2, 300, 400, 100, 100);
        image(Rh3, 400, 400, 100, 100);
        image(Rh3, 500, 400, 100, 100);
        image(Rh4, 600, 400, 100, 100);
        image(Rh4, 0, 500, 100, 100);
        image(Rh4, 100, 500, 100, 100);
        image(Rh5, 200, 500, 100, 100);
        image(Rh5, 300, 500, 100, 100);
        image(Rh5, 400, 500, 100, 100);
        image(Rh5, 500, 500, 100, 100);
        image(Rh6, 600, 500, 100, 100);
      }
      if (cropType == 27) {
        image(Sta1, 0, 200, 100, 100);
        image(Sta1, 100, 200, 100, 100);
        image(Sta2, 200, 200, 100, 100);
        image(Sta2, 300, 200, 100, 100);
        image(Sta2, 400, 200, 100, 100);
        image(Sta3, 500, 200, 100, 100);
        image(Sta3, 600, 200, 100, 100);
        image(Sta4, 0, 300, 100, 100);
        image(Sta4, 100, 300, 100, 100);
        image(Sta4, 200, 300, 100, 100);
        image(Sta5, 300, 300, 100, 100);
        image(Sta5, 400, 300, 100, 100);
        image(Sta5, 500, 300, 100, 100);
        image(Sta6, 600, 300, 100, 100);
        image(Sta1, 0, 400, 100, 100);
        image(Sta1, 100, 400, 100, 100);
        image(Sta2, 200, 400, 100, 100);
        image(Sta2, 300, 400, 100, 100);
        image(Sta2, 400, 400, 100, 100);
        image(Sta3, 500, 400, 100, 100);
        image(Sta3, 600, 400, 100, 100);
        image(Sta4, 0, 500, 100, 100);
        image(Sta4, 100, 500, 100, 100);
        image(Sta4, 200, 500, 100, 100);
        image(Sta5, 300, 500, 100, 100);
        image(Sta5, 400, 500, 100, 100);
        image(Sta5, 500, 500, 100, 100);
        image(Sta6, 600, 500, 100, 100);
      }
      if (cropType == 28) {
        image(Str1, 0, 200, 100, 100);
        image(Str2, 100, 200, 100, 100);
        image(Str3, 200, 200, 100, 100);
        image(Str3, 300, 200, 100, 100);
        image(Str4, 400, 200, 100, 100);
        image(Str4, 500, 200, 100, 100);
        image(Str5, 600, 200, 100, 100);
        image(Str5, 0, 300, 100, 100);
        image(Str6, 100, 300, 100, 100);
        image(Str7, 200, 300, 100, 100);
        image(Str7, 300, 300, 100, 100);
        image(Str7, 400, 300, 100, 100);
        image(Str6, 500, 300, 100, 100);
        image(Str7, 600, 300, 100, 100);
        image(Str7, 0, 400, 100, 100);
        image(Str7, 100, 400, 100, 100);
        image(Str6, 200, 400, 100, 100);
        image(Str7, 300, 400, 100, 100);
        image(Str7, 400, 400, 100, 100);
        image(Str7, 500, 400, 100, 100);
        image(Str6, 600, 400, 100, 100);
        image(Str7, 0, 500, 100, 100);
        image(Str7, 100, 500, 100, 100);
        image(Str7, 200, 500, 100, 100);
        image(Str6, 300, 500, 100, 100);
        image(Str7, 400, 500, 100, 100);
        image(Str7, 500, 500, 100, 100);
        image(Str7, 600, 500, 100, 100);
      }
      if (cropType == 29) {
        image(SS1, 0, 200, 100, 100);
        image(SS2, 100, 200, 100, 100);
        image(SS2, 200, 200, 100, 100);
        image(SS3, 300, 200, 100, 100);
        image(SS3, 400, 200, 100, 100);
        image(SS3, 500, 200, 100, 100);
        image(SS4, 600, 200, 100, 100);
        image(SS4, 0, 300, 100, 100);
        image(SS5, 100, 300, 100, 100);
        image(SS1, 200, 300, 100, 100);
        image(SS2, 300, 300, 100, 100);
        image(SS2, 400, 300, 100, 100);
        image(SS3, 500, 300, 100, 100);
        image(SS3, 600, 300, 100, 100);
        image(SS3, 0, 400, 100, 100);
        image(SS4, 100, 400, 100, 100);
        image(SS4, 200, 400, 100, 100);
        image(SS5, 300, 400, 100, 100);
        image(SS1, 400, 400, 100, 100);
        image(SS2, 500, 400, 100, 100);
        image(SS2, 600, 400, 100, 100);
        image(SS3, 0, 500, 100, 100);
        image(SS3, 100, 500, 100, 100);
        image(SS3, 200, 500, 100, 100);
        image(SS4, 300, 500, 100, 100);
        image(SS4, 400, 500, 100, 100);
        image(SS5, 500, 500, 100, 100);
        image(SS1, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su1, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su2, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su3, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su4, 0, 300, 100, 100);
        image(Su5, 100, 300, 100, 100);
        image(Su1, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su2, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su3, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su4, 200, 400, 100, 100);
        image(Su5, 300, 400, 100, 100);
        image(Su1, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su2, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su3, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su4, 400, 500, 100, 100);
        image(Su5, 500, 500, 100, 100);
        image(Su1, 600, 500, 100, 100);
      }
      if (cropType == 31) {
        image(To1, 0, 200, 100, 100);
        image(To1, 100, 200, 100, 100);
        image(To2, 200, 200, 100, 100);
        image(To2, 300, 200, 100, 100);
        image(To3, 400, 200, 100, 100);
        image(To3, 500, 200, 100, 100);
        image(To4, 600, 200, 100, 100);
        image(To4, 0, 300, 100, 100);
        image(To5, 100, 300, 100, 100);
        image(To5, 200, 300, 100, 100);
        image(To5, 300, 300, 100, 100);
        image(To6, 400, 300, 100, 100);
        image(To7, 500, 300, 100, 100);
        image(To7, 600, 300, 100, 100);
        image(To7, 0, 400, 100, 100);
        image(To6, 100, 400, 100, 100);
        image(To7, 200, 400, 100, 100);
        image(To7, 300, 400, 100, 100);
        image(To7, 400, 400, 100, 100);
        image(To6, 500, 400, 100, 100);
        image(To7, 600, 400, 100, 100);
        image(To7, 0, 500, 100, 100);
        image(To7, 100, 500, 100, 100);
        image(To6, 200, 500, 100, 100);
        image(To7, 300, 500, 100, 100);
        image(To7, 400, 500, 100, 100);
        image(To7, 500, 500, 100, 100);
        image(To6, 600, 500, 100, 100);
      }
      if (cropType == 32) {
        image(Tu1, 0, 200, 100, 100);
        image(Tu2, 100, 200, 100, 100);
        image(Tu3, 200, 200, 100, 100);
        image(Tu3, 300, 200, 100, 100);
        image(Tu4, 400, 200, 100, 100);
        image(Tu4, 500, 200, 100, 100);
        image(Tu5, 600, 200, 100, 100);
        image(Tu1, 0, 300, 100, 100);
        image(Tu2, 100, 300, 100, 100);
        image(Tu3, 200, 300, 100, 100);
        image(Tu3, 300, 300, 100, 100);
        image(Tu4, 400, 300, 100, 100);
        image(Tu4, 500, 300, 100, 100);
        image(Tu5, 600, 300, 100, 100);
        image(Tu1, 0, 400, 100, 100);
        image(Tu2, 100, 400, 100, 100);
        image(Tu3, 200, 400, 100, 100);
        image(Tu3, 300, 400, 100, 100);
        image(Tu4, 400, 400, 100, 100);
        image(Tu4, 500, 400, 100, 100);
        image(Tu5, 600, 400, 100, 100);
        image(Tu1, 0, 500, 100, 100);
        image(Tu2, 100, 500, 100, 100);
        image(Tu3, 200, 500, 100, 100);
        image(Tu3, 300, 500, 100, 100);
        image(Tu4, 400, 500, 100, 100);
        image(Tu4, 500, 500, 100, 100);
        image(Tu5, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR2, 200, 200, 100, 100);
        image(UmR3, 300, 200, 100, 100);
        image(UmR3, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR4, 600, 200, 100, 100);
        image(UmR4, 0, 300, 100, 100);
        image(UmR5, 100, 300, 100, 100);
        image(UmR1, 200, 300, 100, 100);
        image(UmR2, 300, 300, 100, 100);
        image(UmR2, 400, 300, 100, 100);
        image(UmR3, 500, 300, 100, 100);
        image(UmR3, 600, 300, 100, 100);
        image(UmR4, 0, 400, 100, 100);
        image(UmR4, 100, 400, 100, 100);
        image(UmR4, 200, 400, 100, 100);
        image(UmR5, 300, 400, 100, 100);
        image(UmR1, 400, 400, 100, 100);
        image(UmR2, 500, 400, 100, 100);
        image(UmR2, 600, 400, 100, 100);
        image(UmR3, 0, 500, 100, 100);
        image(UmR3, 100, 500, 100, 100);
        image(UmR4, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR5, 500, 500, 100, 100);
        image(UmR1, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W1, 0, 200, 100, 100);
        image(W2, 100, 200, 100, 100);
        image(W3, 200, 200, 100, 100);
        image(W4, 300, 200, 100, 100);
        image(W5, 400, 200, 100, 100);
        image(W1, 500, 200, 100, 100);
        image(W2, 600, 200, 100, 100);
        image(W3, 0, 300, 100, 100);
        image(W4, 100, 300, 100, 100);
        image(W5, 200, 300, 100, 100);
        image(W1, 300, 300, 100, 100);
        image(W2, 400, 300, 100, 100);
        image(W3, 500, 300, 100, 100);
        image(W4, 600, 300, 100, 100);
        image(W5, 0, 400, 100, 100);
        image(W1, 100, 400, 100, 100);
        image(W2, 200, 400, 100, 100);
        image(W3, 300, 400, 100, 100);
        image(W4, 400, 400, 100, 100);
        image(W5, 500, 400, 100, 100);
        image(W1, 600, 400, 100, 100);
        image(W2, 0, 500, 100, 100);
        image(W3, 100, 500, 100, 100);
        image(W4, 200, 500, 100, 100);
        image(W5, 300, 500, 100, 100);
        image(W1, 400, 500, 100, 100);
        image(W2, 500, 500, 100, 100);
        image(W3, 600, 500, 100, 100);
      }
      if (cropType == 35) {
        image(Y1, 0, 200, 100, 100);
        image(Y2, 100, 200, 100, 100);
        image(Y2, 200, 200, 100, 100);
        image(Y2, 300, 200, 100, 100);
        image(Y3, 400, 200, 100, 100);
        image(Y3, 500, 200, 100, 100);
        image(Y3, 600, 200, 100, 100);
        image(Y4, 0, 300, 100, 100);
        image(Y4, 100, 300, 100, 100);
        image(Y4, 200, 300, 100, 100);
        image(Y5, 300, 300, 100, 100);
        image(Y1, 400, 300, 100, 100);
        image(Y2, 500, 300, 100, 100);
        image(Y2, 600, 300, 100, 100);
        image(Y2, 0, 400, 100, 100);
        image(Y3, 100, 400, 100, 100);
        image(Y3, 200, 400, 100, 100);
        image(Y3, 300, 400, 100, 100);
        image(Y4, 400, 400, 100, 100);
        image(Y4, 500, 400, 100, 100);
        image(Y4, 600, 400, 100, 100);
        image(Y5, 0, 500, 100, 100);
        image(Y1, 100, 500, 100, 100);
        image(Y2, 200, 500, 100, 100);
        image(Y2, 300, 500, 100, 100);
        image(Y2, 400, 500, 100, 100);
        image(Y3, 500, 500, 100, 100);
        image(Y3, 600, 500, 100, 100);
      }
    }
    if (cropCalendarNtype2) {
      if (cropType == 8) {
        image(CB6, 0, 200, 100, 100);
        image(CB7, 100, 200, 100, 100);
        image(CB6, 200, 200, 100, 100);
        image(CB7, 300, 200, 100, 100);
        image(CB6, 400, 200, 100, 100);
        image(CB7, 500, 200, 100, 100);
        image(CB6, 600, 200, 100, 100);
        image(CB7, 0, 300, 100, 100);
        image(CB6, 100, 300, 100, 100);
        image(CB7, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co7, 0, 200, 100, 100);
        image(Co7, 100, 200, 100, 100);
        image(Co6, 200, 200, 100, 100);
        image(Co7, 300, 200, 100, 100);
        image(Co7, 400, 200, 100, 100);
        image(Co7, 500, 200, 100, 100);
        image(Co6, 600, 200, 100, 100);
        image(Co7, 0, 300, 100, 100);
        image(Co7, 100, 300, 100, 100);
        image(Co7, 200, 300, 100, 100);
        image(Co6, 300, 300, 100, 100);
        image(Co7, 400, 300, 100, 100);
        image(Co7, 500, 300, 100, 100);
        image(Co7, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su2, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su3, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su4, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su5, 0, 300, 100, 100);
        image(Su1, 100, 300, 100, 100);
        image(Su2, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su3, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su4, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su5, 200, 400, 100, 100);
        image(Su1, 300, 400, 100, 100);
        image(Su2, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su3, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su4, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su5, 400, 500, 100, 100);
        image(Su1, 500, 500, 100, 100);
        image(Su2, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR3, 200, 200, 100, 100);
        image(UmR4, 300, 200, 100, 100);
        image(UmR4, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR5, 600, 200, 100, 100);
        image(UmR1, 0, 300, 100, 100);
        image(UmR2, 100, 300, 100, 100);
        image(UmR3, 200, 300, 100, 100);
        image(UmR4, 300, 300, 100, 100);
        image(UmR4, 400, 300, 100, 100);
        image(UmR4, 500, 300, 100, 100);
        image(UmR5, 600, 300, 100, 100);
        image(UmR1, 0, 400, 100, 100);
        image(UmR2, 100, 400, 100, 100);
        image(UmR3, 200, 400, 100, 100);
        image(UmR4, 300, 400, 100, 100);
        image(UmR4, 400, 400, 100, 100);
        image(UmR4, 500, 400, 100, 100);
        image(UmR5, 600, 400, 100, 100);
        image(UmR1, 0, 500, 100, 100);
        image(UmR2, 100, 500, 100, 100);
        image(UmR3, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR4, 500, 500, 100, 100);
        image(UmR5, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W4, 0, 200, 100, 100);
        image(W5, 100, 200, 100, 100);
        image(W1, 200, 200, 100, 100);
        image(W2, 300, 200, 100, 100);
        image(W3, 400, 200, 100, 100);
        image(W4, 500, 200, 100, 100);
        image(W5, 600, 200, 100, 100);
        image(W1, 0, 300, 100, 100);
        image(W2, 100, 300, 100, 100);
        image(W3, 200, 300, 100, 100);
        image(W4, 300, 300, 100, 100);
        image(W5, 400, 300, 100, 100);
        image(W1, 500, 300, 100, 100);
        image(W2, 600, 300, 100, 100);
        image(W3, 0, 400, 100, 100);
        image(W4, 100, 400, 100, 100);
        image(W5, 200, 400, 100, 100);
        image(W1, 300, 400, 100, 100);
        image(W1, 400, 400, 100, 100);
        image(W2, 500, 400, 100, 100);
        image(W3, 600, 400, 100, 100);
        image(W4, 0, 500, 100, 100);
        image(W5, 100, 500, 100, 100);
        image(W1, 200, 500, 100, 100);
        image(W2, 300, 500, 100, 100);
        image(W3, 400, 500, 100, 100);
        image(W4, 500, 500, 100, 100);
        image(W5, 600, 500, 100, 100);
      }
    }
    if (cropType == 8 || cropType == 9 || cropType == 30 || cropType == 33 || cropType == 34) {
      if (keyPressed) {
        if (key == CODED) {
          if (keyCode == SHIFT) {
            cropCalendarNtype2 = true;
            cropCalendarNtype1 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
          if (keyCode == CONTROL) {
            cropCalendarNtype1 = true;
            cropCalendarNtype2 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
        }
      }
    }
    if (keyPressed) {
      if (key == 'b' || key == 'B') {
        cropSelect = true;
        cropCalendarN = false;
        fill(0);
        rect(0, 0, 700, 600);
      }
      if (key == 'N' || key == 'n') {
        cropCalendarN = false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalculator = true;
        }
        if(key == 'c' || key == 'C') {
         cropCalendarN = false;
         cropCalendarcontrols = true;
         background(0);
        }
        /*if (key == '2') {
          cropCalendarN = false;
          fill(0);
          rect(0, 0, 700, 600);
          cropCalendarD = true;
      }
      if (key == '3') {
          cropCalendarN = false;
          fill(0);
          rect(0, 0, 700, 600);
          cropCalendarNSG = true;
      }
      if (key == '4') {
          cropCalendarN = false;
          fill(0);
          rect(0, 0, 700, 600);
          cropCalendarDSG = true;
      }
      if (key == '5') {
          cropCalendarN = false;
          fill(0);
          rect(0, 0, 700, 600);
          cropCalendarNDSG = true;
      }
      if (key == '6') {
          cropCalendarN = false;
          fill(0);
          rect(0, 0, 700, 600);
          cropCalendarDDSG = true;
      }
      if (key == '7') {
          cropCalendarN = false;
          fill(0);
          rect(0, 0, 700, 600);
          cropCalendarNASG = true;
      }
      if (key == '8') {
          cropCalendarN = false;
          fill(0);
          rect(0, 0, 700, 600);
          cropCalendarDASG = true;
      }
      if (key == '9') {
          cropCalendarN = false;
          fill(0);
          rect(0, 0, 700, 600);
          cropCalendarNADSG = true;
      }
      if (key == '0') {
          cropCalendarN = false;
          fill(0);
          rect(0, 0, 700, 600);
          cropCalendarDADSG = true;
      }*/
    }
  }
}
/*void CalendarmodeNASG() {
  if (cropCalendarN == true) {

    //build
    stroke(255);
    for (int i = 100; i < 600; i += 100) {
      line(0, i, 700, i);
    }
    for (int i = 100; i < 700; i += 100) {
      line(i, 100, i, 600);
    }
    //text
    fill(255);
    textSize(32);
    text("Mon", 20, 200);
    text("Tue", 120, 200);
    text("Wed", 220, 200);
    text("Thu", 320, 200);
    text("Fri", 420, 200);
    text("Sat", 520, 200);
    text("Sun", 620, 200);
    if (cropCalendarNtype1) {
      if (cropType == 1) {
        image(Am1, 0, 200, 100, 100);
        image(Am2, 100, 200, 100, 100);
        image(Am2, 200, 200, 100, 100);
        image(Am3, 300, 200, 100, 100);
        image(Am3, 400, 200, 100, 100);
        image(Am4, 500, 200, 100, 100);
        image(Am4, 600, 200, 100, 100);
        image(Am5, 0, 300, 100, 100);
        image(Am1, 100, 300, 100, 100);
        image(Am2, 200, 300, 100, 100);
        image(Am2, 300, 300, 100, 100);
        image(Am3, 400, 300, 100, 100);
        image(Am3, 500, 300, 100, 100);
        image(Am4, 600, 300, 100, 100);
        image(Am4, 0, 400, 100, 100);
        image(Am5, 100, 400, 100, 100);
        image(Am1, 200, 400, 100, 100);
        image(Am2, 300, 400, 100, 100);
        image(Am2, 400, 400, 100, 100);
        image(Am3, 500, 400, 100, 100);
        image(Am3, 600, 400, 100, 100);
        image(Am4, 0, 500, 100, 100);
        image(Am4, 100, 500, 100, 100);
        image(Am5, 200, 500, 100, 100);
        image(Am1, 300, 500, 100, 100);
        image(Am2, 400, 500, 100, 100);
        image(Am2, 500, 500, 100, 100);
        image(Am3, 600, 500, 100, 100);
      }
      if (cropType == 2) {
        image(Ar1, 0, 200, 100, 100);
        image(Ar1, 100, 200, 100, 100);
        image(Ar2, 200, 200, 100, 100);
        image(Ar2, 300, 200, 100, 100);
        image(Ar3, 400, 200, 100, 100);
        image(Ar4, 500, 200, 100, 100);
        image(Ar4, 600, 200, 100, 100);
        image(Ar5, 0, 300, 100, 100);
        image(Ar6, 100, 300, 100, 100);
        image(Ar1, 200, 300, 100, 100);
        image(Ar1, 300, 300, 100, 100);
        image(Ar2, 400, 300, 100, 100);
        image(Ar2, 500, 300, 100, 100);
        image(Ar3, 600, 300, 100, 100);
        image(Ar4, 0, 400, 100, 100);
        image(Ar4, 100, 400, 100, 100);
        image(Ar5, 200, 400, 100, 100);
        image(Ar6, 300, 400, 100, 100);
        image(Ar1, 400, 400, 100, 100);
        image(Ar1, 500, 400, 100, 100);
        image(Ar2, 600, 400, 100, 100);
        image(Ar2, 0, 500, 100, 100);
        image(Ar3, 100, 500, 100, 100);
        image(Ar4, 200, 500, 100, 100);
        image(Ar4, 300, 500, 100, 100);
        image(Ar5, 400, 500, 100, 100);
        image(Ar6, 500, 500, 100, 100);
        image(Ar1, 600, 500, 100, 100);
      }
      if (cropType == 3) {
        image(Be1, 0, 200, 100, 100);
        image(Be2, 100, 200, 100, 100);
        image(Be3, 200, 200, 100, 100);
        image(Be3, 300, 200, 100, 100);
        image(Be4, 400, 200, 100, 100);
        image(Be4, 500, 200, 100, 100);
        image(Be5, 600, 200, 100, 100);
        image(Be1, 0, 300, 100, 100);
        image(Be2, 100, 300, 100, 100);
        image(Be3, 200, 300, 100, 100);
        image(Be3, 300, 300, 100, 100);
        image(Be4, 400, 300, 100, 100);
        image(Be4, 500, 300, 100, 100);
        image(Be5, 600, 300, 100, 100);
        image(Be1, 0, 400, 100, 100);
        image(Be2, 100, 400, 100, 100);
        image(Be3, 200, 400, 100, 100);
        image(Be3, 300, 400, 100, 100);
        image(Be4, 400, 400, 100, 100);
        image(Be4, 500, 400, 100, 100);
        image(Be5, 600, 400, 100, 100);
        image(Be1, 0, 500, 100, 100);
        image(Be2, 100, 500, 100, 100);
        image(Be3, 200, 500, 100, 100);
        image(Be3, 300, 500, 100, 100);
        image(Be4, 400, 500, 100, 100);
        image(Be4, 500, 500, 100, 100);
        image(Be5, 600, 500, 100, 100);
      }
      if (cropType == 4) {
        image(Bl1, 0, 200, 100, 100);
        image(Bl2, 100, 200, 100, 100);
        image(Bl2, 200, 200, 100, 100);
        image(Bl2, 300, 200, 100, 100);
        image(Bl3, 400, 200, 100, 100);
        image(Bl3, 500, 200, 100, 100);
        image(Bl3, 600, 200, 100, 100);
        image(Bl4, 0, 300, 100, 100);
        image(Bl4, 100, 300, 100, 100);
        image(Bl4, 200, 300, 100, 100);
        image(Bl4, 300, 300, 100, 100);
        image(Bl5, 400, 300, 100, 100);
        image(Bl5, 500, 300, 100, 100);
        image(Bl6, 600, 300, 100, 100);
        image(Bl7, 0, 400, 100, 100);
        image(Bl7, 100, 400, 100, 100);
        image(Bl7, 200, 400, 100, 100);
        image(Bl6, 300, 400, 100, 100);
        image(Bl7, 400, 400, 100, 100);
        image(Bl7, 500, 400, 100, 100);
        image(Bl7, 600, 400, 100, 100);
        image(Bl6, 0, 500, 100, 100);
        image(Bl7, 100, 500, 100, 100);
        image(Bl7, 200, 500, 100, 100);
        image(Bl7, 300, 500, 100, 100);
        image(Bl6, 400, 500, 100, 100);
        image(Bl7, 500, 500, 100, 100);
        image(Bl7, 600, 500, 100, 100);
      }
      if (cropType == 5) {
        image(BJ1, 0, 200, 100, 100);
        image(BJ2, 100, 200, 100, 100);
        image(BJ2, 200, 200, 100, 100);
        image(BJ3, 300, 200, 100, 100);
        image(BJ3, 400, 200, 100, 100);
        image(BJ4, 500, 200, 100, 100);
        image(BJ4, 600, 200, 100, 100);
        image(BJ5, 0, 300, 100, 100);
        image(BJ1, 100, 300, 100, 100);
        image(BJ2, 200, 300, 100, 100);
        image(BJ2, 300, 300, 100, 100);
        image(BJ3, 400, 300, 100, 100);
        image(BJ3, 500, 300, 100, 100);
        image(BJ4, 600, 300, 100, 100);
        image(BJ4, 0, 400, 100, 100);
        image(BJ5, 100, 400, 100, 100);
        image(BJ1, 200, 400, 100, 100);
        image(BJ2, 300, 400, 100, 100);
        image(BJ2, 400, 400, 100, 100);
        image(BJ3, 500, 400, 100, 100);
        image(BJ3, 600, 400, 100, 100);
        image(BJ4, 0, 500, 100, 100);
        image(BJ4, 100, 500, 100, 100);
        image(BJ5, 200, 500, 100, 100);
        image(BJ1, 300, 500, 100, 100);
        image(BJ2, 400, 500, 100, 100);
        image(BJ2, 500, 500, 100, 100);
        image(BJ3, 600, 500, 100, 100);
      }
      if (cropType == 6) {
        image(BC1, 0, 200, 100, 100);
        image(BC2, 100, 200, 100, 100);
        image(BC3, 200, 200, 100, 100);
        image(BC4, 300, 200, 100, 100);
        image(BC5, 400, 200, 100, 100);
        image(BC1, 500, 200, 100, 100);
        image(BC2, 600, 200, 100, 100);
        image(BC3, 0, 300, 100, 100);
        image(BC4, 100, 300, 100, 100);
        image(BC5, 200, 300, 100, 100);
        image(BC1, 300, 300, 100, 100);
        image(BC2, 400, 300, 100, 100);
        image(BC3, 500, 300, 100, 100);
        image(BC4, 600, 300, 100, 100);
        image(BC5, 0, 400, 100, 100);
        image(BC1, 100, 400, 100, 100);
        image(BC2, 200, 400, 100, 100);
        image(BC3, 300, 400, 100, 100);
        image(BC4, 400, 400, 100, 100);
        image(BC5, 500, 400, 100, 100);
        image(BC1, 600, 400, 100, 100);
        image(BC2, 0, 500, 100, 100);
        image(BC3, 100, 500, 100, 100);
        image(BC4, 200, 500, 100, 100);
        image(BC5, 300, 500, 100, 100);
        image(BC1, 400, 500, 100, 100);
        image(BC2, 500, 500, 100, 100);
        image(BC3, 600, 500, 100, 100);
      }
      if (cropType == 7) {
        image(Ca1, 0, 200, 100, 100);
        image(Ca2, 100, 200, 100, 100);
        image(Ca2, 200, 200, 100, 100);
        image(Ca3, 300, 200, 100, 100);
        image(Ca3, 400, 200, 100, 100);
        image(Ca3, 500, 200, 100, 100);
        image(Ca3, 600, 200, 100, 100);
        image(Ca4, 0, 300, 100, 100);
        image(Ca4, 100, 300, 100, 100);
        image(Ca4, 200, 300, 100, 100);
        image(Ca4, 300, 300, 100, 100);
        image(Ca5, 400, 300, 100, 100);
        image(Ca6, 500, 300, 100, 100);
        image(Ca1, 600, 300, 100, 100);
        image(Ca2, 0, 400, 100, 100);
        image(Ca2, 100, 400, 100, 100);
        image(Ca3, 200, 400, 100, 100);
        image(Ca3, 300, 400, 100, 100);
        image(Ca3, 400, 400, 100, 100);
        image(Ca3, 500, 400, 100, 100);
        image(Ca4, 600, 400, 100, 100);
        image(Ca4, 0, 500, 100, 100);
        image(Ca4, 100, 500, 100, 100);
        image(Ca4, 200, 500, 100, 100);
        image(Ca5, 300, 500, 100, 100);
        image(Ca6, 400, 500, 100, 100);
        image(Ca1, 500, 500, 100, 100);
        image(Ca2, 600, 500, 100, 100);
      }
      if (cropType == 8) {
        image(CB1, 0, 200, 100, 100);
        image(CB2, 100, 200, 100, 100);
        image(CB2, 200, 200, 100, 100);
        image(CB3, 300, 200, 100, 100);
        image(CB3, 400, 200, 100, 100);
        image(CB4, 500, 200, 100, 100);
        image(CB4, 600, 200, 100, 100);
        image(CB4, 0, 300, 100, 100);
        image(CB5, 100, 300, 100, 100);
        image(CB5, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co1, 0, 200, 100, 100);
        image(Co1, 100, 200, 100, 100);
        image(Co2, 200, 200, 100, 100);
        image(Co2, 300, 200, 100, 100);
        image(Co2, 400, 200, 100, 100);
        image(Co3, 500, 200, 100, 100);
        image(Co3, 600, 200, 100, 100);
        image(Co3, 0, 300, 100, 100);
        image(Co4, 100, 300, 100, 100);
        image(Co4, 200, 300, 100, 100);
        image(Co4, 300, 300, 100, 100);
        image(Co5, 400, 300, 100, 100);
        image(Co5, 500, 300, 100, 100);
        image(Co5, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 10) {
        image(Cr1, 0, 200, 100, 100);
        image(Cr2, 100, 200, 100, 100);
        image(Cr2, 200, 200, 100, 100);
        image(Cr3, 300, 200, 100, 100);
        image(Cr4, 400, 200, 100, 100);
        image(Cr5, 500, 200, 100, 100);
        image(Cr5, 600, 200, 100, 100);
        image(Cr6, 0, 300, 100, 100);
        image(Cr7, 100, 300, 100, 100);
        image(Cr7, 200, 300, 100, 100);
        image(Cr7, 300, 300, 100, 100);
        image(Cr7, 400, 300, 100, 100);
        image(Cr6, 500, 300, 100, 100);
        image(Cr7, 600, 300, 100, 100);
        image(Cr7, 0, 400, 100, 100);
        image(Cr7, 100, 400, 100, 100);
        image(Cr7, 200, 400, 100, 100);
        image(Cr6, 300, 400, 100, 100);
        image(Cr7, 400, 400, 100, 100);
        image(Cr7, 500, 400, 100, 100);
        image(Cr7, 600, 400, 100, 100);
        image(Cr7, 0, 500, 100, 100);
        image(Cr6, 100, 500, 100, 100);
        image(Cr7, 200, 500, 100, 100);
        image(Cr7, 300, 500, 100, 100);
        image(Cr7, 400, 500, 100, 100);
        image(Cr7, 500, 500, 100, 100);
        image(Cr6, 600, 500, 100, 100);
      }
      if (cropType == 11) {
        image(E1, 0, 200, 100, 100);
        image(E2, 100, 200, 100, 100);
        image(E3, 200, 200, 100, 100);
        image(E4, 300, 200, 100, 100);
        image(E5, 400, 200, 100, 100);
        image(E6, 500, 200, 100, 100);
        image(E1, 600, 200, 100, 100);
        image(E2, 0, 300, 100, 100);
        image(E3, 100, 300, 100, 100);
        image(E4, 200, 300, 100, 100);
        image(E5, 300, 300, 100, 100);
        image(E6, 400, 300, 100, 100);
        image(E1, 500, 300, 100, 100);
        image(E2, 600, 300, 100, 100);
        image(E3, 0, 400, 100, 100);
        image(E4, 100, 400, 100, 100);
        image(E5, 200, 400, 100, 100);
        image(E6, 300, 400, 100, 100);
        image(E1, 400, 400, 100, 100);
        image(E2, 500, 400, 100, 100);
        image(E3, 600, 400, 100, 100);
        image(E4, 0, 500, 100, 100);
        image(E5, 100, 500, 100, 100);
        image(E6, 200, 500, 100, 100);
        image(E1, 300, 500, 100, 100);
        image(E2, 400, 500, 100, 100);
        image(E3, 500, 500, 100, 100);
        image(E4, 600, 500, 100, 100);
      }
      if (cropType == 12) {
        image(FR1, 0, 200, 100, 100);
        image(FR2, 100, 200, 100, 100);
        image(FR2, 200, 200, 100, 100);
        image(FR2, 300, 200, 100, 100);
        image(FR2, 400, 200, 100, 100);
        image(FR3, 500, 200, 100, 100);
        image(FR3, 600, 200, 100, 100);
        image(FR3, 0, 300, 100, 100);
        image(FR3, 100, 300, 100, 100);
        image(FR4, 200, 300, 100, 100);
        image(FR4, 300, 300, 100, 100);
        image(FR4, 400, 300, 100, 100);
        image(FR5, 500, 300, 100, 100);
        image(FR1, 600, 300, 100, 100);
        image(FR2, 0, 400, 100, 100);
        image(FR2, 100, 400, 100, 100);
        image(FR2, 200, 400, 100, 100);
        image(FR2, 300, 400, 100, 100);
        image(FR3, 400, 400, 100, 100);
        image(FR3, 500, 400, 100, 100);
        image(FR3, 600, 400, 100, 100);
        image(FR3, 0, 500, 100, 100);
        image(FR4, 100, 500, 100, 100);
        image(FR4, 200, 500, 100, 100);
        image(FR4, 300, 500, 100, 100);
        image(FR5, 400, 500, 100, 100);
        image(FR1, 500, 500, 100, 100);
        image(FR2, 600, 500, 100, 100);
      }
      if (cropType == 13) {
        image(Ga1, 0, 200, 100, 100);
        image(Ga2, 100, 200, 100, 100);
        image(Ga3, 200, 200, 100, 100);
        image(Ga4, 300, 200, 100, 100);
        image(Ga5, 400, 200, 100, 100);
        image(Ga1, 500, 200, 100, 100);
        image(Ga2, 600, 200, 100, 100);
        image(Ga3, 0, 300, 100, 100);
        image(Ga4, 100, 300, 100, 100);
        image(Ga5, 200, 300, 100, 100);
        image(Ga1, 300, 300, 100, 100);
        image(Ga2, 400, 300, 100, 100);
        image(Ga3, 500, 300, 100, 100);
        image(Ga4, 600, 300, 100, 100);
        image(Ga5, 0, 400, 100, 100);
        image(Ga1, 100, 400, 100, 100);
        image(Ga2, 200, 400, 100, 100);
        image(Ga3, 300, 400, 100, 100);
        image(Ga4, 400, 400, 100, 100);
        image(Ga5, 500, 400, 100, 100);
        image(Ga1, 600, 400, 100, 100);
        image(Ga2, 0, 500, 100, 100);
        image(Ga3, 100, 500, 100, 100);
        image(Ga4, 200, 500, 100, 100);
        image(Ga5, 300, 500, 100, 100);
        image(Ga1, 400, 500, 100, 100);
        image(Ga2, 500, 500, 100, 100);
        image(Ga3, 600, 500, 100, 100);
      }
      if (cropType == 14) {
        image(GB1, 0, 200, 100, 100);
        image(GB2, 100, 200, 100, 100);
        image(GB3, 200, 200, 100, 100);
        image(GB4, 300, 200, 100, 100);
        image(GB4, 400, 200, 100, 100);
        image(GB4, 500, 200, 100, 100);
        image(GB5, 600, 200, 100, 100);
        image(GB5, 0, 300, 100, 100);
        image(GB5, 100, 300, 100, 100);
        image(GB5, 200, 300, 100, 100);
        image(GB6, 300, 300, 100, 100);
        image(GB7, 400, 300, 100, 100);
        image(GB7, 500, 300, 100, 100);
        image(GB6, 600, 300, 100, 100);
        image(GB7, 0, 400, 100, 100);
        image(GB7, 100, 400, 100, 100);
        image(GB6, 200, 400, 100, 100);
        image(GB7, 300, 400, 100, 100);
        image(GB7, 400, 400, 100, 100);
        image(GB6, 500, 400, 100, 100);
        image(GB7, 600, 400, 100, 100);
        image(GB7, 0, 500, 100, 100);
        image(GB6, 100, 500, 100, 100);
        image(GB7, 200, 500, 100, 100);
        image(GB7, 300, 500, 100, 100);
        image(GB6, 400, 500, 100, 100);
        image(GB7, 500, 500, 100, 100);
        image(GB7, 600, 500, 100, 100);
      }
      if (cropType == 15) {
        image(Gr1, 0, 200, 100, 100);
        image(Gr2, 100, 200, 100, 100);
        image(Gr3, 200, 200, 100, 100);
        image(Gr3, 300, 200, 100, 100);
        image(Gr4, 400, 200, 100, 100);
        image(Gr4, 500, 200, 100, 100);
        image(Gr4, 600, 200, 100, 100);
        image(Gr5, 0, 300, 100, 100);
        image(Gr5, 100, 300, 100, 100);
        image(Gr5, 200, 300, 100, 100);
        image(Gr6, 300, 300, 100, 100);
        image(Gr7, 400, 300, 100, 100);
        image(Gr7, 500, 300, 100, 100);
        image(Gr6, 600, 300, 100, 100);
        image(Gr7, 0, 400, 100, 100);
        image(Gr7, 100, 400, 100, 100);
        image(Gr6, 200, 400, 100, 100);
        image(Gr7, 300, 400, 100, 100);
        image(Gr7, 400, 400, 100, 100);
        image(Gr6, 500, 400, 100, 100);
        image(Gr7, 600, 400, 100, 100);
        image(Gr7, 0, 500, 100, 100);
        image(Gr6, 100, 500, 100, 100);
        image(Gr7, 200, 500, 100, 100);
        image(Gr7, 300, 500, 100, 100);
        image(Gr6, 400, 500, 100, 100);
        image(Gr7, 500, 500, 100, 100);
        image(Gr7, 600, 500, 100, 100);
      }
      if (cropType == 16) {
        image(H1, 0, 200, 100, 100);
        image(H2, 100, 200, 100, 100);
        image(H3, 200, 200, 100, 100);
        image(H3, 300, 200, 100, 100);
        image(H4, 400, 200, 100, 100);
        image(H4, 500, 200, 100, 100);
        image(H4, 600, 200, 100, 100);
        image(H5, 0, 300, 100, 100);
        image(H5, 100, 300, 100, 100);
        image(H5, 200, 300, 100, 100);
        image(H5, 300, 300, 100, 100);
        image(H6, 400, 300, 100, 100);
        image(H6, 500, 300, 100, 100);
        image(H6, 600, 300, 100, 100);
        image(H6, 0, 400, 100, 100);
        image(H6, 100, 400, 100, 100);
        image(H6, 200, 400, 100, 100);
        image(H6, 300, 400, 100, 100);
        image(H6, 400, 400, 100, 100);
        image(H6, 500, 400, 100, 100);
        image(H6, 600, 400, 100, 100);
        image(H6, 0, 500, 100, 100);
        image(H6, 100, 500, 100, 100);
        image(H6, 200, 500, 100, 100);
        image(H6, 300, 500, 100, 100);
        image(H6, 400, 500, 100, 100);
        image(H6, 500, 500, 100, 100);
        image(H6, 600, 500, 100, 100);
      }
      if (cropType == 17) {
        image(HP1, 0, 200, 100, 100);
        image(HP2, 100, 200, 100, 100);
        image(HP3, 200, 200, 100, 100);
        image(HP4, 300, 200, 100, 100);
        image(HP5, 400, 200, 100, 100);
        image(HP6, 500, 200, 100, 100);
        image(HP7, 600, 200, 100, 100);
        image(HP7, 0, 300, 100, 100);
        image(HP6, 100, 300, 100, 100);
        image(HP7, 200, 300, 100, 100);
        image(HP7, 300, 300, 100, 100);
        image(HP6, 400, 300, 100, 100);
        image(HP7, 500, 300, 100, 100);
        image(HP7, 600, 300, 100, 100);
        image(HP6, 0, 400, 100, 100);
        image(HP7, 100, 400, 100, 100);
        image(HP7, 200, 400, 100, 100);
        image(HP6, 300, 400, 100, 100);
        image(HP7, 400, 400, 100, 100);
        image(HP7, 500, 400, 100, 100);
        image(HP6, 600, 400, 100, 100);
        image(HP7, 0, 500, 100, 100);
        image(HP7, 100, 500, 100, 100);
        image(HP6, 200, 500, 100, 100);
        image(HP7, 300, 500, 100, 100);
        image(HP7, 400, 500, 100, 100);
        image(HP6, 500, 500, 100, 100);
        image(HP7, 600, 500, 100, 100);
      }
      if (cropType == 18) {
        image(K1, 0, 200, 100, 100);
        image(K2, 100, 200, 100, 100);
        image(K2, 200, 200, 100, 100);
        image(K3, 300, 200, 100, 100);
        image(K3, 400, 200, 100, 100);
        image(K4, 500, 200, 100, 100);
        image(K5, 600, 200, 100, 100);
        image(K1, 0, 300, 100, 100);
        image(K2, 100, 300, 100, 100);
        image(K2, 200, 300, 100, 100);
        image(K3, 300, 300, 100, 100);
        image(K3, 400, 300, 100, 100);
        image(K4, 500, 300, 100, 100);
        image(K5, 600, 300, 100, 100);
        image(K1, 0, 400, 100, 100);
        image(K2, 100, 400, 100, 100);
        image(K2, 200, 400, 100, 100);
        image(K3, 300, 400, 100, 100);
        image(K3, 400, 400, 100, 100);
        image(K4, 500, 400, 100, 100);
        image(K5, 600, 400, 100, 100);
        image(K1, 0, 500, 100, 100);
        image(K2, 100, 500, 100, 100);
        image(K2, 200, 500, 100, 100);
        image(K3, 300, 500, 100, 100);
        image(K3, 400, 500, 100, 100);
        image(K4, 500, 500, 100, 100);
        image(K5, 600, 500, 100, 100);
      }
      if (cropType == 19) {
        image(M1, 0, 200, 100, 100);
        image(M2, 100, 200, 100, 100);
        image(M2, 200, 200, 100, 100);
        image(M3, 300, 200, 100, 100);
        image(M3, 400, 200, 100, 100);
        image(M3, 500, 200, 100, 100);
        image(M4, 600, 200, 100, 100);
        image(M4, 0, 300, 100, 100);
        image(M4, 100, 300, 100, 100);
        image(M5, 200, 300, 100, 100);
        image(M5, 300, 300, 100, 100);
        image(M5, 400, 300, 100, 100);
        image(M6, 500, 300, 100, 100);
        image(M1, 600, 300, 100, 100);
        image(M2, 0, 400, 100, 100);
        image(M2, 100, 400, 100, 100);
        image(M3, 200, 400, 100, 100);
        image(M3, 300, 400, 100, 100);
        image(M3, 400, 400, 100, 100);
        image(M4, 500, 400, 100, 100);
        image(M4, 600, 400, 100, 100);
        image(M4, 0, 500, 100, 100);
        image(M5, 100, 500, 100, 100);
        image(M5, 200, 500, 100, 100);
        image(M5, 300, 500, 100, 100);
        image(M6, 400, 500, 100, 100);
        image(M1, 500, 500, 100, 100);
        image(M2, 600, 500, 100, 100);
      }
      if (cropType == 20) {
        image(Par1, 0, 200, 100, 100);
        image(Par2, 100, 200, 100, 100);
        image(Par3, 200, 200, 100, 100);
        image(Par4, 300, 200, 100, 100);
        image(Par5, 400, 200, 100, 100);
        image(Par1, 500, 200, 100, 100);
        image(Par2, 600, 200, 100, 100);
        image(Par3, 0, 300, 100, 100);
        image(Par4, 100, 300, 100, 100);
        image(Par5, 200, 300, 100, 100);
        image(Par1, 300, 300, 100, 100);
        image(Par2, 400, 300, 100, 100);
        image(Par3, 500, 300, 100, 100);
        image(Par4, 600, 300, 100, 100);
        image(Par5, 0, 400, 100, 100);
        image(Par1, 100, 400, 100, 100);
        image(Par2, 200, 400, 100, 100);
        image(Par3, 300, 400, 100, 100);
        image(Par4, 400, 400, 100, 100);
        image(Par5, 500, 400, 100, 100);
        image(Par1, 600, 400, 100, 100);
        image(Par2, 0, 500, 100, 100);
        image(Par3, 100, 500, 100, 100);
        image(Par4, 200, 500, 100, 100);
        image(Par5, 300, 500, 100, 100);
        image(Par1, 400, 500, 100, 100);
        image(Par2, 500, 500, 100, 100);
        image(Par3, 600, 500, 100, 100);
      }
      if (cropType == 21) {
        image(Pop1, 0, 200, 100, 100);
        image(Pop2, 100, 200, 100, 100);
        image(Pop2, 200, 200, 100, 100);
        image(Pop3, 300, 200, 100, 100);
        image(Pop3, 400, 200, 100, 100);
        image(Pop4, 500, 200, 100, 100);
        image(Pop4, 600, 200, 100, 100);
        image(Pop5, 0, 300, 100, 100);
        image(Pop1, 100, 300, 100, 100);
        image(Pop2, 200, 300, 100, 100);
        image(Pop2, 300, 300, 100, 100);
        image(Pop3, 400, 300, 100, 100);
        image(Pop3, 500, 300, 100, 100);
        image(Pop4, 600, 300, 100, 100);
        image(Pop4, 0, 400, 100, 100);
        image(Pop5, 100, 400, 100, 100);
        image(Pop1, 200, 400, 100, 100);
        image(Pop2, 300, 400, 100, 100);
        image(Pop2, 400, 400, 100, 100);
        image(Pop3, 500, 400, 100, 100);
        image(Pop3, 600, 400, 100, 100);
        image(Pop4, 0, 500, 100, 100);
        image(Pop4, 100, 500, 100, 100);
        image(Pop5, 200, 500, 100, 100);
        image(Pop1, 300, 500, 100, 100);
        image(Pop2, 400, 500, 100, 100);
        image(Pop2, 500, 500, 100, 100);
        image(Pop3, 600, 500, 100, 100);
      }
      if (cropType == 22) {
        image(Pot1, 0, 200, 100, 100);
        image(Pot2, 100, 200, 100, 100);
        image(Pot3, 200, 200, 100, 100);
        image(Pot4, 300, 200, 100, 100);
        image(Pot4, 400, 200, 100, 100);
        image(Pot5, 500, 200, 100, 100);
        image(Pot6, 600, 200, 100, 100);
        image(Pot1, 0, 300, 100, 100);
        image(Pot2, 100, 300, 100, 100);
        image(Pot3, 200, 300, 100, 100);
        image(Pot4, 300, 300, 100, 100);
        image(Pot4, 400, 300, 100, 100);
        image(Pot5, 500, 300, 100, 100);
        image(Pot6, 600, 300, 100, 100);
        image(Pot1, 0, 400, 100, 100);
        image(Pot2, 100, 400, 100, 100);
        image(Pot3, 200, 400, 100, 100);
        image(Pot4, 300, 400, 100, 100);
        image(Pot4, 400, 400, 100, 100);
        image(Pot5, 500, 400, 100, 100);
        image(Pot6, 600, 400, 100, 100);
        image(Pot1, 0, 500, 100, 100);
        image(Pot2, 100, 500, 100, 100);
        image(Pot3, 200, 500, 100, 100);
        image(Pot4, 300, 500, 100, 100);
        image(Pot4, 400, 500, 100, 100);
        image(Pot5, 500, 500, 100, 100);
        image(Pot6, 600, 500, 100, 100);
      }
      if (cropType == 23) {
        image(Pum1, 0, 200, 100, 100);
        image(Pum2, 100, 200, 100, 100);
        image(Pum2, 200, 200, 100, 100);
        image(Pum3, 300, 200, 100, 100);
        image(Pum3, 400, 200, 100, 100);
        image(Pum3, 500, 200, 100, 100);
        image(Pum4, 600, 200, 100, 100);
        image(Pum4, 0, 300, 100, 100);
        image(Pum4, 100, 300, 100, 100);
        image(Pum4, 200, 300, 100, 100);
        image(Pum5, 300, 300, 100, 100);
        image(Pum5, 400, 300, 100, 100);
        image(Pum5, 500, 300, 100, 100);
        image(Pum6, 600, 300, 100, 100);
        image(Pum1, 0, 400, 100, 100);
        image(Pum2, 100, 400, 100, 100);
        image(Pum2, 200, 400, 100, 100);
        image(Pum3, 300, 400, 100, 100);
        image(Pum3, 400, 400, 100, 100);
        image(Pum3, 500, 400, 100, 100);
        image(Pum4, 600, 400, 100, 100);
        image(Pum4, 0, 500, 100, 100);
        image(Pum4, 100, 500, 100, 100);
        image(Pum4, 200, 500, 100, 100);
        image(Pum5, 300, 500, 100, 100);
        image(Pum5, 400, 500, 100, 100);
        image(Pum5, 500, 500, 100, 100);
        image(Pum6, 600, 500, 100, 100);
      }
      if (cropType == 24) {
        image(Ra1, 0, 200, 100, 100);
        image(Ra1, 100, 200, 100, 100);
        image(Ra2, 200, 200, 100, 100);
        image(Ra3, 300, 200, 100, 100);
        image(Ra3, 400, 200, 100, 100);
        image(Ra4, 500, 200, 100, 100);
        image(Ra5, 600, 200, 100, 100);
        image(Ra1, 0, 300, 100, 100);
        image(Ra1, 100, 300, 100, 100);
        image(Ra2, 200, 300, 100, 100);
        image(Ra3, 300, 300, 100, 100);
        image(Ra3, 400, 300, 100, 100);
        image(Ra4, 500, 300, 100, 100);
        image(Ra5, 600, 300, 100, 100);
        image(Ra1, 0, 400, 100, 100);
        image(Ra1, 100, 400, 100, 100);
        image(Ra2, 200, 400, 100, 100);
        image(Ra3, 300, 400, 100, 100);
        image(Ra3, 400, 400, 100, 100);
        image(Ra4, 500, 400, 100, 100);
        image(Ra5, 600, 400, 100, 100);
        image(Ra1, 0, 500, 100, 100);
        image(Ra1, 100, 500, 100, 100);
        image(Ra2, 200, 500, 100, 100);
        image(Ra3, 300, 500, 100, 100);
        image(Ra3, 400, 500, 100, 100);
        image(Ra4, 500, 500, 100, 100);
        image(Ra5, 600, 500, 100, 100);
      }
      if (cropType == 25) {
        image(RC1, 0, 200, 100, 100);
        image(RC1, 100, 200, 100, 100);
        image(RC2, 200, 200, 100, 100);
        image(RC3, 300, 200, 100, 100);
        image(RC3, 400, 200, 100, 100);
        image(RC4, 500, 200, 100, 100);
        image(RC4, 600, 200, 100, 100);
        image(RC5, 0, 300, 100, 100);
        image(RC5, 100, 300, 100, 100);
        image(RC6, 200, 300, 100, 100);
        image(RC1, 300, 300, 100, 100);
        image(RC1, 400, 300, 100, 100);
        image(RC2, 500, 300, 100, 100);
        image(RC3, 600, 300, 100, 100);
        image(RC3, 0, 400, 100, 100);
        image(RC4, 100, 400, 100, 100);
        image(RC4, 200, 400, 100, 100);
        image(RC5, 300, 400, 100, 100);
        image(RC5, 400, 400, 100, 100);
        image(RC6, 500, 400, 100, 100);
        image(RC1, 600, 400, 100, 100);
        image(RC1, 0, 500, 100, 100);
        image(RC2, 100, 500, 100, 100);
        image(RC3, 200, 500, 100, 100);
        image(RC3, 300, 500, 100, 100);
        image(RC4, 400, 500, 100, 100);
        image(RC4, 500, 500, 100, 100);
        image(RC5, 600, 500, 100, 100);
      }
      if (cropType == 26) {
        image(Rh1, 0, 200, 100, 100);
        image(Rh1, 100, 200, 100, 100);
        image(Rh2, 200, 200, 100, 100);
        image(Rh2, 300, 200, 100, 100);
        image(Rh3, 400, 200, 100, 100);
        image(Rh3, 500, 200, 100, 100);
        image(Rh4, 600, 200, 100, 100);
        image(Rh4, 0, 300, 100, 100);
        image(Rh4, 100, 300, 100, 100);
        image(Rh5, 200, 300, 100, 100);
        image(Rh5, 300, 300, 100, 100);
        image(Rh5, 400, 300, 100, 100);
        image(Rh5, 500, 300, 100, 100);
        image(Rh6, 600, 300, 100, 100);
        image(Rh1, 0, 400, 100, 100);
        image(Rh1, 100, 400, 100, 100);
        image(Rh2, 200, 400, 100, 100);
        image(Rh2, 300, 400, 100, 100);
        image(Rh3, 400, 400, 100, 100);
        image(Rh3, 500, 400, 100, 100);
        image(Rh4, 600, 400, 100, 100);
        image(Rh4, 0, 500, 100, 100);
        image(Rh4, 100, 500, 100, 100);
        image(Rh5, 200, 500, 100, 100);
        image(Rh5, 300, 500, 100, 100);
        image(Rh5, 400, 500, 100, 100);
        image(Rh5, 500, 500, 100, 100);
        image(Rh6, 600, 500, 100, 100);
      }
      if (cropType == 27) {
        image(Sta1, 0, 200, 100, 100);
        image(Sta1, 100, 200, 100, 100);
        image(Sta2, 200, 200, 100, 100);
        image(Sta2, 300, 200, 100, 100);
        image(Sta2, 400, 200, 100, 100);
        image(Sta3, 500, 200, 100, 100);
        image(Sta3, 600, 200, 100, 100);
        image(Sta4, 0, 300, 100, 100);
        image(Sta4, 100, 300, 100, 100);
        image(Sta4, 200, 300, 100, 100);
        image(Sta5, 300, 300, 100, 100);
        image(Sta5, 400, 300, 100, 100);
        image(Sta5, 500, 300, 100, 100);
        image(Sta6, 600, 300, 100, 100);
        image(Sta1, 0, 400, 100, 100);
        image(Sta1, 100, 400, 100, 100);
        image(Sta2, 200, 400, 100, 100);
        image(Sta2, 300, 400, 100, 100);
        image(Sta2, 400, 400, 100, 100);
        image(Sta3, 500, 400, 100, 100);
        image(Sta3, 600, 400, 100, 100);
        image(Sta4, 0, 500, 100, 100);
        image(Sta4, 100, 500, 100, 100);
        image(Sta4, 200, 500, 100, 100);
        image(Sta5, 300, 500, 100, 100);
        image(Sta5, 400, 500, 100, 100);
        image(Sta5, 500, 500, 100, 100);
        image(Sta6, 600, 500, 100, 100);
      }
      if (cropType == 28) {
        image(Str1, 0, 200, 100, 100);
        image(Str2, 100, 200, 100, 100);
        image(Str3, 200, 200, 100, 100);
        image(Str3, 300, 200, 100, 100);
        image(Str4, 400, 200, 100, 100);
        image(Str4, 500, 200, 100, 100);
        image(Str5, 600, 200, 100, 100);
        image(Str5, 0, 300, 100, 100);
        image(Str6, 100, 300, 100, 100);
        image(Str7, 200, 300, 100, 100);
        image(Str7, 300, 300, 100, 100);
        image(Str7, 400, 300, 100, 100);
        image(Str6, 500, 300, 100, 100);
        image(Str7, 600, 300, 100, 100);
        image(Str7, 0, 400, 100, 100);
        image(Str7, 100, 400, 100, 100);
        image(Str6, 200, 400, 100, 100);
        image(Str7, 300, 400, 100, 100);
        image(Str7, 400, 400, 100, 100);
        image(Str7, 500, 400, 100, 100);
        image(Str6, 600, 400, 100, 100);
        image(Str7, 0, 500, 100, 100);
        image(Str7, 100, 500, 100, 100);
        image(Str7, 200, 500, 100, 100);
        image(Str6, 300, 500, 100, 100);
        image(Str7, 400, 500, 100, 100);
        image(Str7, 500, 500, 100, 100);
        image(Str7, 600, 500, 100, 100);
      }
      if (cropType == 29) {
        image(SS1, 0, 200, 100, 100);
        image(SS2, 100, 200, 100, 100);
        image(SS2, 200, 200, 100, 100);
        image(SS3, 300, 200, 100, 100);
        image(SS3, 400, 200, 100, 100);
        image(SS3, 500, 200, 100, 100);
        image(SS4, 600, 200, 100, 100);
        image(SS4, 0, 300, 100, 100);
        image(SS5, 100, 300, 100, 100);
        image(SS1, 200, 300, 100, 100);
        image(SS2, 300, 300, 100, 100);
        image(SS2, 400, 300, 100, 100);
        image(SS3, 500, 300, 100, 100);
        image(SS3, 600, 300, 100, 100);
        image(SS3, 0, 400, 100, 100);
        image(SS4, 100, 400, 100, 100);
        image(SS4, 200, 400, 100, 100);
        image(SS5, 300, 400, 100, 100);
        image(SS1, 400, 400, 100, 100);
        image(SS2, 500, 400, 100, 100);
        image(SS2, 600, 400, 100, 100);
        image(SS3, 0, 500, 100, 100);
        image(SS3, 100, 500, 100, 100);
        image(SS3, 200, 500, 100, 100);
        image(SS4, 300, 500, 100, 100);
        image(SS4, 400, 500, 100, 100);
        image(SS5, 500, 500, 100, 100);
        image(SS1, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su1, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su2, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su3, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su4, 0, 300, 100, 100);
        image(Su5, 100, 300, 100, 100);
        image(Su1, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su2, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su3, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su4, 200, 400, 100, 100);
        image(Su5, 300, 400, 100, 100);
        image(Su1, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su2, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su3, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su4, 400, 500, 100, 100);
        image(Su5, 500, 500, 100, 100);
        image(Su1, 600, 500, 100, 100);
      }
      if (cropType == 31) {
        image(To1, 0, 200, 100, 100);
        image(To1, 100, 200, 100, 100);
        image(To2, 200, 200, 100, 100);
        image(To2, 300, 200, 100, 100);
        image(To3, 400, 200, 100, 100);
        image(To3, 500, 200, 100, 100);
        image(To4, 600, 200, 100, 100);
        image(To4, 0, 300, 100, 100);
        image(To5, 100, 300, 100, 100);
        image(To5, 200, 300, 100, 100);
        image(To5, 300, 300, 100, 100);
        image(To6, 400, 300, 100, 100);
        image(To7, 500, 300, 100, 100);
        image(To7, 600, 300, 100, 100);
        image(To7, 0, 400, 100, 100);
        image(To6, 100, 400, 100, 100);
        image(To7, 200, 400, 100, 100);
        image(To7, 300, 400, 100, 100);
        image(To7, 400, 400, 100, 100);
        image(To6, 500, 400, 100, 100);
        image(To7, 600, 400, 100, 100);
        image(To7, 0, 500, 100, 100);
        image(To7, 100, 500, 100, 100);
        image(To6, 200, 500, 100, 100);
        image(To7, 300, 500, 100, 100);
        image(To7, 400, 500, 100, 100);
        image(To7, 500, 500, 100, 100);
        image(To6, 600, 500, 100, 100);
      }
      if (cropType == 32) {
        image(Tu1, 0, 200, 100, 100);
        image(Tu2, 100, 200, 100, 100);
        image(Tu3, 200, 200, 100, 100);
        image(Tu3, 300, 200, 100, 100);
        image(Tu4, 400, 200, 100, 100);
        image(Tu4, 500, 200, 100, 100);
        image(Tu5, 600, 200, 100, 100);
        image(Tu1, 0, 300, 100, 100);
        image(Tu2, 100, 300, 100, 100);
        image(Tu3, 200, 300, 100, 100);
        image(Tu3, 300, 300, 100, 100);
        image(Tu4, 400, 300, 100, 100);
        image(Tu4, 500, 300, 100, 100);
        image(Tu5, 600, 300, 100, 100);
        image(Tu1, 0, 400, 100, 100);
        image(Tu2, 100, 400, 100, 100);
        image(Tu3, 200, 400, 100, 100);
        image(Tu3, 300, 400, 100, 100);
        image(Tu4, 400, 400, 100, 100);
        image(Tu4, 500, 400, 100, 100);
        image(Tu5, 600, 400, 100, 100);
        image(Tu1, 0, 500, 100, 100);
        image(Tu2, 100, 500, 100, 100);
        image(Tu3, 200, 500, 100, 100);
        image(Tu3, 300, 500, 100, 100);
        image(Tu4, 400, 500, 100, 100);
        image(Tu4, 500, 500, 100, 100);
        image(Tu5, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR2, 200, 200, 100, 100);
        image(UmR3, 300, 200, 100, 100);
        image(UmR3, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR4, 600, 200, 100, 100);
        image(UmR4, 0, 300, 100, 100);
        image(UmR5, 100, 300, 100, 100);
        image(UmR1, 200, 300, 100, 100);
        image(UmR2, 300, 300, 100, 100);
        image(UmR2, 400, 300, 100, 100);
        image(UmR3, 500, 300, 100, 100);
        image(UmR3, 600, 300, 100, 100);
        image(UmR4, 0, 400, 100, 100);
        image(UmR4, 100, 400, 100, 100);
        image(UmR4, 200, 400, 100, 100);
        image(UmR5, 300, 400, 100, 100);
        image(UmR1, 400, 400, 100, 100);
        image(UmR2, 500, 400, 100, 100);
        image(UmR2, 600, 400, 100, 100);
        image(UmR3, 0, 500, 100, 100);
        image(UmR3, 100, 500, 100, 100);
        image(UmR4, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR5, 500, 500, 100, 100);
        image(UmR1, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W1, 0, 200, 100, 100);
        image(W2, 100, 200, 100, 100);
        image(W3, 200, 200, 100, 100);
        image(W4, 300, 200, 100, 100);
        image(W5, 400, 200, 100, 100);
        image(W1, 500, 200, 100, 100);
        image(W2, 600, 200, 100, 100);
        image(W3, 0, 300, 100, 100);
        image(W4, 100, 300, 100, 100);
        image(W5, 200, 300, 100, 100);
        image(W1, 300, 300, 100, 100);
        image(W2, 400, 300, 100, 100);
        image(W3, 500, 300, 100, 100);
        image(W4, 600, 300, 100, 100);
        image(W5, 0, 400, 100, 100);
        image(W1, 100, 400, 100, 100);
        image(W2, 200, 400, 100, 100);
        image(W3, 300, 400, 100, 100);
        image(W4, 400, 400, 100, 100);
        image(W5, 500, 400, 100, 100);
        image(W1, 600, 400, 100, 100);
        image(W2, 0, 500, 100, 100);
        image(W3, 100, 500, 100, 100);
        image(W4, 200, 500, 100, 100);
        image(W5, 300, 500, 100, 100);
        image(W1, 400, 500, 100, 100);
        image(W2, 500, 500, 100, 100);
        image(W3, 600, 500, 100, 100);
      }
      if (cropType == 35) {
        image(Y1, 0, 200, 100, 100);
        image(Y2, 100, 200, 100, 100);
        image(Y2, 200, 200, 100, 100);
        image(Y2, 300, 200, 100, 100);
        image(Y3, 400, 200, 100, 100);
        image(Y3, 500, 200, 100, 100);
        image(Y3, 600, 200, 100, 100);
        image(Y4, 0, 300, 100, 100);
        image(Y4, 100, 300, 100, 100);
        image(Y4, 200, 300, 100, 100);
        image(Y5, 300, 300, 100, 100);
        image(Y1, 400, 300, 100, 100);
        image(Y2, 500, 300, 100, 100);
        image(Y2, 600, 300, 100, 100);
        image(Y2, 0, 400, 100, 100);
        image(Y3, 100, 400, 100, 100);
        image(Y3, 200, 400, 100, 100);
        image(Y3, 300, 400, 100, 100);
        image(Y4, 400, 400, 100, 100);
        image(Y4, 500, 400, 100, 100);
        image(Y4, 600, 400, 100, 100);
        image(Y5, 0, 500, 100, 100);
        image(Y1, 100, 500, 100, 100);
        image(Y2, 200, 500, 100, 100);
        image(Y2, 300, 500, 100, 100);
        image(Y2, 400, 500, 100, 100);
        image(Y3, 500, 500, 100, 100);
        image(Y3, 600, 500, 100, 100);
      }
    }
    if (cropCalendarNtype2) {
      if (cropType == 8) {
        image(CB6, 0, 200, 100, 100);
        image(CB7, 100, 200, 100, 100);
        image(CB6, 200, 200, 100, 100);
        image(CB7, 300, 200, 100, 100);
        image(CB6, 400, 200, 100, 100);
        image(CB7, 500, 200, 100, 100);
        image(CB6, 600, 200, 100, 100);
        image(CB7, 0, 300, 100, 100);
        image(CB6, 100, 300, 100, 100);
        image(CB7, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co7, 0, 200, 100, 100);
        image(Co7, 100, 200, 100, 100);
        image(Co6, 200, 200, 100, 100);
        image(Co7, 300, 200, 100, 100);
        image(Co7, 400, 200, 100, 100);
        image(Co7, 500, 200, 100, 100);
        image(Co6, 600, 200, 100, 100);
        image(Co7, 0, 300, 100, 100);
        image(Co7, 100, 300, 100, 100);
        image(Co7, 200, 300, 100, 100);
        image(Co6, 300, 300, 100, 100);
        image(Co7, 400, 300, 100, 100);
        image(Co7, 500, 300, 100, 100);
        image(Co7, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su2, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su3, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su4, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su5, 0, 300, 100, 100);
        image(Su1, 100, 300, 100, 100);
        image(Su2, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su3, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su4, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su5, 200, 400, 100, 100);
        image(Su1, 300, 400, 100, 100);
        image(Su2, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su3, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su4, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su5, 400, 500, 100, 100);
        image(Su1, 500, 500, 100, 100);
        image(Su2, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR3, 200, 200, 100, 100);
        image(UmR4, 300, 200, 100, 100);
        image(UmR4, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR5, 600, 200, 100, 100);
        image(UmR1, 0, 300, 100, 100);
        image(UmR2, 100, 300, 100, 100);
        image(UmR3, 200, 300, 100, 100);
        image(UmR4, 300, 300, 100, 100);
        image(UmR4, 400, 300, 100, 100);
        image(UmR4, 500, 300, 100, 100);
        image(UmR5, 600, 300, 100, 100);
        image(UmR1, 0, 400, 100, 100);
        image(UmR2, 100, 400, 100, 100);
        image(UmR3, 200, 400, 100, 100);
        image(UmR4, 300, 400, 100, 100);
        image(UmR4, 400, 400, 100, 100);
        image(UmR4, 500, 400, 100, 100);
        image(UmR5, 600, 400, 100, 100);
        image(UmR1, 0, 500, 100, 100);
        image(UmR2, 100, 500, 100, 100);
        image(UmR3, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR4, 500, 500, 100, 100);
        image(UmR5, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W4, 0, 200, 100, 100);
        image(W5, 100, 200, 100, 100);
        image(W1, 200, 200, 100, 100);
        image(W2, 300, 200, 100, 100);
        image(W3, 400, 200, 100, 100);
        image(W4, 500, 200, 100, 100);
        image(W5, 600, 200, 100, 100);
        image(W1, 0, 300, 100, 100);
        image(W2, 100, 300, 100, 100);
        image(W3, 200, 300, 100, 100);
        image(W4, 300, 300, 100, 100);
        image(W5, 400, 300, 100, 100);
        image(W1, 500, 300, 100, 100);
        image(W2, 600, 300, 100, 100);
        image(W3, 0, 400, 100, 100);
        image(W4, 100, 400, 100, 100);
        image(W5, 200, 400, 100, 100);
        image(W1, 300, 400, 100, 100);
        image(W1, 400, 400, 100, 100);
        image(W2, 500, 400, 100, 100);
        image(W3, 600, 400, 100, 100);
        image(W4, 0, 500, 100, 100);
        image(W5, 100, 500, 100, 100);
        image(W1, 200, 500, 100, 100);
        image(W2, 300, 500, 100, 100);
        image(W3, 400, 500, 100, 100);
        image(W4, 500, 500, 100, 100);
        image(W5, 600, 500, 100, 100);
      }
    }
    if (cropType == 8 || cropType == 9 || cropType == 30 || cropType == 33 || cropType == 34) {
      if (keyPressed) {
        if (key == CODED) {
          if (keyCode == SHIFT) {
            cropCalendarNtype2 = true;
            cropCalendarNtype1 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
          if (keyCode == CONTROL) {
            cropCalendarNtype1 = true;
            cropCalendarNtype2 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
        }
      }
    }
    if (keyPressed) {
      if (key == 'V' || key == 'v') {
        cropSelect = true;
        cropCalendarN = false;
        fill(0);
        rect(0, 0, 700, 600);
      }
      if (key == 'C' || key == 'c') {
        cropCalendarN = false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalculator = true;
        }
        if (key == '2') {
          cropCalendarN = false;
          fill(0);
          rect(0, 0, 700, 600);
          cropCalendarD = true;
      }
    }
  }
}*/
/*void CalendarmodeNDSG() {
  if (cropCalendarNSG == true) {

    //build
    stroke(255);
    for (int i = 100; i < 600; i += 100) {
      line(0, i, 700, i);
    }
    for (int i = 100; i < 700; i += 100) {
      line(i, 100, i, 600);
    }
    //text
    fill(255);
    textSize(32);
    text("Mon", 20, 200);
    text("Tue", 120, 200);
    text("Wed", 220, 200);
    text("Thu", 320, 200);
    text("Fri", 420, 200);
    text("Sat", 520, 200);
    text("Sun", 620, 200);
    if (cropCalendarNSGtype1) {
      if (cropType == 1) {
        image(Am1, 0, 200, 100, 100);
        image(Am2, 100, 200, 100, 100);
        image(Am2, 200, 200, 100, 100);
        image(Am3, 300, 200, 100, 100);
        image(Am3, 400, 200, 100, 100);
        image(Am4, 500, 200, 100, 100);
        image(Am4, 600, 200, 100, 100);
        image(Am5, 0, 300, 100, 100);
        image(Am1, 100, 300, 100, 100);
        image(Am2, 200, 300, 100, 100);
        image(Am2, 300, 300, 100, 100);
        image(Am3, 400, 300, 100, 100);
        image(Am3, 500, 300, 100, 100);
        image(Am4, 600, 300, 100, 100);
        image(Am4, 0, 400, 100, 100);
        image(Am5, 100, 400, 100, 100);
        image(Am1, 200, 400, 100, 100);
        image(Am2, 300, 400, 100, 100);
        image(Am2, 400, 400, 100, 100);
        image(Am3, 500, 400, 100, 100);
        image(Am3, 600, 400, 100, 100);
        image(Am4, 0, 500, 100, 100);
        image(Am4, 100, 500, 100, 100);
        image(Am5, 200, 500, 100, 100);
        image(Am1, 300, 500, 100, 100);
        image(Am2, 400, 500, 100, 100);
        image(Am2, 500, 500, 100, 100);
        image(Am3, 600, 500, 100, 100);
      }
      if (cropType == 2) {
        image(Ar1, 0, 200, 100, 100);
        image(Ar1, 100, 200, 100, 100);
        image(Ar2, 200, 200, 100, 100);
        image(Ar2, 300, 200, 100, 100);
        image(Ar3, 400, 200, 100, 100);
        image(Ar4, 500, 200, 100, 100);
        image(Ar4, 600, 200, 100, 100);
        image(Ar5, 0, 300, 100, 100);
        image(Ar6, 100, 300, 100, 100);
        image(Ar1, 200, 300, 100, 100);
        image(Ar1, 300, 300, 100, 100);
        image(Ar2, 400, 300, 100, 100);
        image(Ar2, 500, 300, 100, 100);
        image(Ar3, 600, 300, 100, 100);
        image(Ar4, 0, 400, 100, 100);
        image(Ar4, 100, 400, 100, 100);
        image(Ar5, 200, 400, 100, 100);
        image(Ar6, 300, 400, 100, 100);
        image(Ar1, 400, 400, 100, 100);
        image(Ar1, 500, 400, 100, 100);
        image(Ar2, 600, 400, 100, 100);
        image(Ar2, 0, 500, 100, 100);
        image(Ar3, 100, 500, 100, 100);
        image(Ar4, 200, 500, 100, 100);
        image(Ar4, 300, 500, 100, 100);
        image(Ar5, 400, 500, 100, 100);
        image(Ar6, 500, 500, 100, 100);
        image(Ar1, 600, 500, 100, 100);
      }
      if (cropType == 3) {
        image(Be1, 0, 200, 100, 100);
        image(Be2, 100, 200, 100, 100);
        image(Be3, 200, 200, 100, 100);
        image(Be3, 300, 200, 100, 100);
        image(Be4, 400, 200, 100, 100);
        image(Be4, 500, 200, 100, 100);
        image(Be5, 600, 200, 100, 100);
        image(Be1, 0, 300, 100, 100);
        image(Be2, 100, 300, 100, 100);
        image(Be3, 200, 300, 100, 100);
        image(Be3, 300, 300, 100, 100);
        image(Be4, 400, 300, 100, 100);
        image(Be4, 500, 300, 100, 100);
        image(Be5, 600, 300, 100, 100);
        image(Be1, 0, 400, 100, 100);
        image(Be2, 100, 400, 100, 100);
        image(Be3, 200, 400, 100, 100);
        image(Be3, 300, 400, 100, 100);
        image(Be4, 400, 400, 100, 100);
        image(Be4, 500, 400, 100, 100);
        image(Be5, 600, 400, 100, 100);
        image(Be1, 0, 500, 100, 100);
        image(Be2, 100, 500, 100, 100);
        image(Be3, 200, 500, 100, 100);
        image(Be3, 300, 500, 100, 100);
        image(Be4, 400, 500, 100, 100);
        image(Be4, 500, 500, 100, 100);
        image(Be5, 600, 500, 100, 100);
      }
      if (cropType == 4) {
        image(Bl1, 0, 200, 100, 100);
        image(Bl2, 100, 200, 100, 100);
        image(Bl2, 200, 200, 100, 100);
        image(Bl2, 300, 200, 100, 100);
        image(Bl3, 400, 200, 100, 100);
        image(Bl3, 500, 200, 100, 100);
        image(Bl3, 600, 200, 100, 100);
        image(Bl4, 0, 300, 100, 100);
        image(Bl4, 100, 300, 100, 100);
        image(Bl4, 200, 300, 100, 100);
        image(Bl4, 300, 300, 100, 100);
        image(Bl5, 400, 300, 100, 100);
        image(Bl5, 500, 300, 100, 100);
        image(Bl6, 600, 300, 100, 100);
        image(Bl7, 0, 400, 100, 100);
        image(Bl7, 100, 400, 100, 100);
        image(Bl7, 200, 400, 100, 100);
        image(Bl6, 300, 400, 100, 100);
        image(Bl7, 400, 400, 100, 100);
        image(Bl7, 500, 400, 100, 100);
        image(Bl7, 600, 400, 100, 100);
        image(Bl6, 0, 500, 100, 100);
        image(Bl7, 100, 500, 100, 100);
        image(Bl7, 200, 500, 100, 100);
        image(Bl7, 300, 500, 100, 100);
        image(Bl6, 400, 500, 100, 100);
        image(Bl7, 500, 500, 100, 100);
        image(Bl7, 600, 500, 100, 100);
      }
      if (cropType == 5) {
        image(BJ1, 0, 200, 100, 100);
        image(BJ2, 100, 200, 100, 100);
        image(BJ2, 200, 200, 100, 100);
        image(BJ3, 300, 200, 100, 100);
        image(BJ3, 400, 200, 100, 100);
        image(BJ4, 500, 200, 100, 100);
        image(BJ4, 600, 200, 100, 100);
        image(BJ5, 0, 300, 100, 100);
        image(BJ1, 100, 300, 100, 100);
        image(BJ2, 200, 300, 100, 100);
        image(BJ2, 300, 300, 100, 100);
        image(BJ3, 400, 300, 100, 100);
        image(BJ3, 500, 300, 100, 100);
        image(BJ4, 600, 300, 100, 100);
        image(BJ4, 0, 400, 100, 100);
        image(BJ5, 100, 400, 100, 100);
        image(BJ1, 200, 400, 100, 100);
        image(BJ2, 300, 400, 100, 100);
        image(BJ2, 400, 400, 100, 100);
        image(BJ3, 500, 400, 100, 100);
        image(BJ3, 600, 400, 100, 100);
        image(BJ4, 0, 500, 100, 100);
        image(BJ4, 100, 500, 100, 100);
        image(BJ5, 200, 500, 100, 100);
        image(BJ1, 300, 500, 100, 100);
        image(BJ2, 400, 500, 100, 100);
        image(BJ2, 500, 500, 100, 100);
        image(BJ3, 600, 500, 100, 100);
      }
      if (cropType == 6) {
        image(BC1, 0, 200, 100, 100);
        image(BC2, 100, 200, 100, 100);
        image(BC3, 200, 200, 100, 100);
        image(BC4, 300, 200, 100, 100);
        image(BC5, 400, 200, 100, 100);
        image(BC1, 500, 200, 100, 100);
        image(BC2, 600, 200, 100, 100);
        image(BC3, 0, 300, 100, 100);
        image(BC4, 100, 300, 100, 100);
        image(BC5, 200, 300, 100, 100);
        image(BC1, 300, 300, 100, 100);
        image(BC2, 400, 300, 100, 100);
        image(BC3, 500, 300, 100, 100);
        image(BC4, 600, 300, 100, 100);
        image(BC5, 0, 400, 100, 100);
        image(BC1, 100, 400, 100, 100);
        image(BC2, 200, 400, 100, 100);
        image(BC3, 300, 400, 100, 100);
        image(BC4, 400, 400, 100, 100);
        image(BC5, 500, 400, 100, 100);
        image(BC1, 600, 400, 100, 100);
        image(BC2, 0, 500, 100, 100);
        image(BC3, 100, 500, 100, 100);
        image(BC4, 200, 500, 100, 100);
        image(BC5, 300, 500, 100, 100);
        image(BC1, 400, 500, 100, 100);
        image(BC2, 500, 500, 100, 100);
        image(BC3, 600, 500, 100, 100);
      }
      if (cropType == 7) {
        image(Ca1, 0, 200, 100, 100);
        image(Ca2, 100, 200, 100, 100);
        image(Ca2, 200, 200, 100, 100);
        image(Ca3, 300, 200, 100, 100);
        image(Ca3, 400, 200, 100, 100);
        image(Ca3, 500, 200, 100, 100);
        image(Ca3, 600, 200, 100, 100);
        image(Ca4, 0, 300, 100, 100);
        image(Ca4, 100, 300, 100, 100);
        image(Ca4, 200, 300, 100, 100);
        image(Ca4, 300, 300, 100, 100);
        image(Ca5, 400, 300, 100, 100);
        image(Ca6, 500, 300, 100, 100);
        image(Ca1, 600, 300, 100, 100);
        image(Ca2, 0, 400, 100, 100);
        image(Ca2, 100, 400, 100, 100);
        image(Ca3, 200, 400, 100, 100);
        image(Ca3, 300, 400, 100, 100);
        image(Ca3, 400, 400, 100, 100);
        image(Ca3, 500, 400, 100, 100);
        image(Ca4, 600, 400, 100, 100);
        image(Ca4, 0, 500, 100, 100);
        image(Ca4, 100, 500, 100, 100);
        image(Ca4, 200, 500, 100, 100);
        image(Ca5, 300, 500, 100, 100);
        image(Ca6, 400, 500, 100, 100);
        image(Ca1, 500, 500, 100, 100);
        image(Ca2, 600, 500, 100, 100);
      }
      if (cropType == 8) {
        image(CB1, 0, 200, 100, 100);
        image(CB2, 100, 200, 100, 100);
        image(CB2, 200, 200, 100, 100);
        image(CB3, 300, 200, 100, 100);
        image(CB3, 400, 200, 100, 100);
        image(CB4, 500, 200, 100, 100);
        image(CB4, 600, 200, 100, 100);
        image(CB4, 0, 300, 100, 100);
        image(CB5, 100, 300, 100, 100);
        image(CB5, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co1, 0, 200, 100, 100);
        image(Co1, 100, 200, 100, 100);
        image(Co2, 200, 200, 100, 100);
        image(Co2, 300, 200, 100, 100);
        image(Co2, 400, 200, 100, 100);
        image(Co3, 500, 200, 100, 100);
        image(Co3, 600, 200, 100, 100);
        image(Co3, 0, 300, 100, 100);
        image(Co4, 100, 300, 100, 100);
        image(Co4, 200, 300, 100, 100);
        image(Co4, 300, 300, 100, 100);
        image(Co5, 400, 300, 100, 100);
        image(Co5, 500, 300, 100, 100);
        image(Co5, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 10) {
        image(Cr1, 0, 200, 100, 100);
        image(Cr2, 100, 200, 100, 100);
        image(Cr2, 200, 200, 100, 100);
        image(Cr3, 300, 200, 100, 100);
        image(Cr4, 400, 200, 100, 100);
        image(Cr5, 500, 200, 100, 100);
        image(Cr5, 600, 200, 100, 100);
        image(Cr6, 0, 300, 100, 100);
        image(Cr7, 100, 300, 100, 100);
        image(Cr7, 200, 300, 100, 100);
        image(Cr7, 300, 300, 100, 100);
        image(Cr7, 400, 300, 100, 100);
        image(Cr6, 500, 300, 100, 100);
        image(Cr7, 600, 300, 100, 100);
        image(Cr7, 0, 400, 100, 100);
        image(Cr7, 100, 400, 100, 100);
        image(Cr7, 200, 400, 100, 100);
        image(Cr6, 300, 400, 100, 100);
        image(Cr7, 400, 400, 100, 100);
        image(Cr7, 500, 400, 100, 100);
        image(Cr7, 600, 400, 100, 100);
        image(Cr7, 0, 500, 100, 100);
        image(Cr6, 100, 500, 100, 100);
        image(Cr7, 200, 500, 100, 100);
        image(Cr7, 300, 500, 100, 100);
        image(Cr7, 400, 500, 100, 100);
        image(Cr7, 500, 500, 100, 100);
        image(Cr6, 600, 500, 100, 100);
      }
      if (cropType == 11) {
        image(E1, 0, 200, 100, 100);
        image(E2, 100, 200, 100, 100);
        image(E3, 200, 200, 100, 100);
        image(E4, 300, 200, 100, 100);
        image(E5, 400, 200, 100, 100);
        image(E6, 500, 200, 100, 100);
        image(E1, 600, 200, 100, 100);
        image(E2, 0, 300, 100, 100);
        image(E3, 100, 300, 100, 100);
        image(E4, 200, 300, 100, 100);
        image(E5, 300, 300, 100, 100);
        image(E6, 400, 300, 100, 100);
        image(E1, 500, 300, 100, 100);
        image(E2, 600, 300, 100, 100);
        image(E3, 0, 400, 100, 100);
        image(E4, 100, 400, 100, 100);
        image(E5, 200, 400, 100, 100);
        image(E6, 300, 400, 100, 100);
        image(E1, 400, 400, 100, 100);
        image(E2, 500, 400, 100, 100);
        image(E3, 600, 400, 100, 100);
        image(E4, 0, 500, 100, 100);
        image(E5, 100, 500, 100, 100);
        image(E6, 200, 500, 100, 100);
        image(E1, 300, 500, 100, 100);
        image(E2, 400, 500, 100, 100);
        image(E3, 500, 500, 100, 100);
        image(E4, 600, 500, 100, 100);
      }
      if (cropType == 12) {
        image(FR1, 0, 200, 100, 100);
        image(FR2, 100, 200, 100, 100);
        image(FR2, 200, 200, 100, 100);
        image(FR2, 300, 200, 100, 100);
        image(FR2, 400, 200, 100, 100);
        image(FR3, 500, 200, 100, 100);
        image(FR3, 600, 200, 100, 100);
        image(FR3, 0, 300, 100, 100);
        image(FR3, 100, 300, 100, 100);
        image(FR4, 200, 300, 100, 100);
        image(FR4, 300, 300, 100, 100);
        image(FR4, 400, 300, 100, 100);
        image(FR5, 500, 300, 100, 100);
        image(FR1, 600, 300, 100, 100);
        image(FR2, 0, 400, 100, 100);
        image(FR2, 100, 400, 100, 100);
        image(FR2, 200, 400, 100, 100);
        image(FR2, 300, 400, 100, 100);
        image(FR3, 400, 400, 100, 100);
        image(FR3, 500, 400, 100, 100);
        image(FR3, 600, 400, 100, 100);
        image(FR3, 0, 500, 100, 100);
        image(FR4, 100, 500, 100, 100);
        image(FR4, 200, 500, 100, 100);
        image(FR4, 300, 500, 100, 100);
        image(FR5, 400, 500, 100, 100);
        image(FR1, 500, 500, 100, 100);
        image(FR2, 600, 500, 100, 100);
      }
      if (cropType == 13) {
        image(Ga1, 0, 200, 100, 100);
        image(Ga2, 100, 200, 100, 100);
        image(Ga3, 200, 200, 100, 100);
        image(Ga4, 300, 200, 100, 100);
        image(Ga5, 400, 200, 100, 100);
        image(Ga1, 500, 200, 100, 100);
        image(Ga2, 600, 200, 100, 100);
        image(Ga3, 0, 300, 100, 100);
        image(Ga4, 100, 300, 100, 100);
        image(Ga5, 200, 300, 100, 100);
        image(Ga1, 300, 300, 100, 100);
        image(Ga2, 400, 300, 100, 100);
        image(Ga3, 500, 300, 100, 100);
        image(Ga4, 600, 300, 100, 100);
        image(Ga5, 0, 400, 100, 100);
        image(Ga1, 100, 400, 100, 100);
        image(Ga2, 200, 400, 100, 100);
        image(Ga3, 300, 400, 100, 100);
        image(Ga4, 400, 400, 100, 100);
        image(Ga5, 500, 400, 100, 100);
        image(Ga1, 600, 400, 100, 100);
        image(Ga2, 0, 500, 100, 100);
        image(Ga3, 100, 500, 100, 100);
        image(Ga4, 200, 500, 100, 100);
        image(Ga5, 300, 500, 100, 100);
        image(Ga1, 400, 500, 100, 100);
        image(Ga2, 500, 500, 100, 100);
        image(Ga3, 600, 500, 100, 100);
      }
      if (cropType == 14) {
        image(GB1, 0, 200, 100, 100);
        image(GB2, 100, 200, 100, 100);
        image(GB3, 200, 200, 100, 100);
        image(GB4, 300, 200, 100, 100);
        image(GB4, 400, 200, 100, 100);
        image(GB4, 500, 200, 100, 100);
        image(GB5, 600, 200, 100, 100);
        image(GB5, 0, 300, 100, 100);
        image(GB5, 100, 300, 100, 100);
        image(GB5, 200, 300, 100, 100);
        image(GB6, 300, 300, 100, 100);
        image(GB7, 400, 300, 100, 100);
        image(GB7, 500, 300, 100, 100);
        image(GB6, 600, 300, 100, 100);
        image(GB7, 0, 400, 100, 100);
        image(GB7, 100, 400, 100, 100);
        image(GB6, 200, 400, 100, 100);
        image(GB7, 300, 400, 100, 100);
        image(GB7, 400, 400, 100, 100);
        image(GB6, 500, 400, 100, 100);
        image(GB7, 600, 400, 100, 100);
        image(GB7, 0, 500, 100, 100);
        image(GB6, 100, 500, 100, 100);
        image(GB7, 200, 500, 100, 100);
        image(GB7, 300, 500, 100, 100);
        image(GB6, 400, 500, 100, 100);
        image(GB7, 500, 500, 100, 100);
        image(GB7, 600, 500, 100, 100);
      }
      if (cropType == 15) {
        image(Gr1, 0, 200, 100, 100);
        image(Gr2, 100, 200, 100, 100);
        image(Gr3, 200, 200, 100, 100);
        image(Gr3, 300, 200, 100, 100);
        image(Gr4, 400, 200, 100, 100);
        image(Gr4, 500, 200, 100, 100);
        image(Gr4, 600, 200, 100, 100);
        image(Gr5, 0, 300, 100, 100);
        image(Gr5, 100, 300, 100, 100);
        image(Gr5, 200, 300, 100, 100);
        image(Gr6, 300, 300, 100, 100);
        image(Gr7, 400, 300, 100, 100);
        image(Gr7, 500, 300, 100, 100);
        image(Gr6, 600, 300, 100, 100);
        image(Gr7, 0, 400, 100, 100);
        image(Gr7, 100, 400, 100, 100);
        image(Gr6, 200, 400, 100, 100);
        image(Gr7, 300, 400, 100, 100);
        image(Gr7, 400, 400, 100, 100);
        image(Gr6, 500, 400, 100, 100);
        image(Gr7, 600, 400, 100, 100);
        image(Gr7, 0, 500, 100, 100);
        image(Gr6, 100, 500, 100, 100);
        image(Gr7, 200, 500, 100, 100);
        image(Gr7, 300, 500, 100, 100);
        image(Gr6, 400, 500, 100, 100);
        image(Gr7, 500, 500, 100, 100);
        image(Gr7, 600, 500, 100, 100);
      }
      if (cropType == 16) {
        image(H1, 0, 200, 100, 100);
        image(H2, 100, 200, 100, 100);
        image(H3, 200, 200, 100, 100);
        image(H3, 300, 200, 100, 100);
        image(H4, 400, 200, 100, 100);
        image(H4, 500, 200, 100, 100);
        image(H4, 600, 200, 100, 100);
        image(H5, 0, 300, 100, 100);
        image(H5, 100, 300, 100, 100);
        image(H5, 200, 300, 100, 100);
        image(H5, 300, 300, 100, 100);
        image(H6, 400, 300, 100, 100);
        image(H6, 500, 300, 100, 100);
        image(H6, 600, 300, 100, 100);
        image(H6, 0, 400, 100, 100);
        image(H6, 100, 400, 100, 100);
        image(H6, 200, 400, 100, 100);
        image(H6, 300, 400, 100, 100);
        image(H6, 400, 400, 100, 100);
        image(H6, 500, 400, 100, 100);
        image(H6, 600, 400, 100, 100);
        image(H6, 0, 500, 100, 100);
        image(H6, 100, 500, 100, 100);
        image(H6, 200, 500, 100, 100);
        image(H6, 300, 500, 100, 100);
        image(H6, 400, 500, 100, 100);
        image(H6, 500, 500, 100, 100);
        image(H6, 600, 500, 100, 100);
      }
      if (cropType == 17) {
        image(HP1, 0, 200, 100, 100);
        image(HP2, 100, 200, 100, 100);
        image(HP3, 200, 200, 100, 100);
        image(HP4, 300, 200, 100, 100);
        image(HP5, 400, 200, 100, 100);
        image(HP6, 500, 200, 100, 100);
        image(HP7, 600, 200, 100, 100);
        image(HP7, 0, 300, 100, 100);
        image(HP6, 100, 300, 100, 100);
        image(HP7, 200, 300, 100, 100);
        image(HP7, 300, 300, 100, 100);
        image(HP6, 400, 300, 100, 100);
        image(HP7, 500, 300, 100, 100);
        image(HP7, 600, 300, 100, 100);
        image(HP6, 0, 400, 100, 100);
        image(HP7, 100, 400, 100, 100);
        image(HP7, 200, 400, 100, 100);
        image(HP6, 300, 400, 100, 100);
        image(HP7, 400, 400, 100, 100);
        image(HP7, 500, 400, 100, 100);
        image(HP6, 600, 400, 100, 100);
        image(HP7, 0, 500, 100, 100);
        image(HP7, 100, 500, 100, 100);
        image(HP6, 200, 500, 100, 100);
        image(HP7, 300, 500, 100, 100);
        image(HP7, 400, 500, 100, 100);
        image(HP6, 500, 500, 100, 100);
        image(HP7, 600, 500, 100, 100);
      }
      if (cropType == 18) {
        image(K1, 0, 200, 100, 100);
        image(K2, 100, 200, 100, 100);
        image(K2, 200, 200, 100, 100);
        image(K3, 300, 200, 100, 100);
        image(K3, 400, 200, 100, 100);
        image(K4, 500, 200, 100, 100);
        image(K5, 600, 200, 100, 100);
        image(K1, 0, 300, 100, 100);
        image(K2, 100, 300, 100, 100);
        image(K2, 200, 300, 100, 100);
        image(K3, 300, 300, 100, 100);
        image(K3, 400, 300, 100, 100);
        image(K4, 500, 300, 100, 100);
        image(K5, 600, 300, 100, 100);
        image(K1, 0, 400, 100, 100);
        image(K2, 100, 400, 100, 100);
        image(K2, 200, 400, 100, 100);
        image(K3, 300, 400, 100, 100);
        image(K3, 400, 400, 100, 100);
        image(K4, 500, 400, 100, 100);
        image(K5, 600, 400, 100, 100);
        image(K1, 0, 500, 100, 100);
        image(K2, 100, 500, 100, 100);
        image(K2, 200, 500, 100, 100);
        image(K3, 300, 500, 100, 100);
        image(K3, 400, 500, 100, 100);
        image(K4, 500, 500, 100, 100);
        image(K5, 600, 500, 100, 100);
      }
      if (cropType == 19) {
        image(M1, 0, 200, 100, 100);
        image(M2, 100, 200, 100, 100);
        image(M2, 200, 200, 100, 100);
        image(M3, 300, 200, 100, 100);
        image(M3, 400, 200, 100, 100);
        image(M3, 500, 200, 100, 100);
        image(M4, 600, 200, 100, 100);
        image(M4, 0, 300, 100, 100);
        image(M4, 100, 300, 100, 100);
        image(M5, 200, 300, 100, 100);
        image(M5, 300, 300, 100, 100);
        image(M5, 400, 300, 100, 100);
        image(M6, 500, 300, 100, 100);
        image(M1, 600, 300, 100, 100);
        image(M2, 0, 400, 100, 100);
        image(M2, 100, 400, 100, 100);
        image(M3, 200, 400, 100, 100);
        image(M3, 300, 400, 100, 100);
        image(M3, 400, 400, 100, 100);
        image(M4, 500, 400, 100, 100);
        image(M4, 600, 400, 100, 100);
        image(M4, 0, 500, 100, 100);
        image(M5, 100, 500, 100, 100);
        image(M5, 200, 500, 100, 100);
        image(M5, 300, 500, 100, 100);
        image(M6, 400, 500, 100, 100);
        image(M1, 500, 500, 100, 100);
        image(M2, 600, 500, 100, 100);
      }
      if (cropType == 20) {
        image(Par1, 0, 200, 100, 100);
        image(Par2, 100, 200, 100, 100);
        image(Par3, 200, 200, 100, 100);
        image(Par4, 300, 200, 100, 100);
        image(Par5, 400, 200, 100, 100);
        image(Par1, 500, 200, 100, 100);
        image(Par2, 600, 200, 100, 100);
        image(Par3, 0, 300, 100, 100);
        image(Par4, 100, 300, 100, 100);
        image(Par5, 200, 300, 100, 100);
        image(Par1, 300, 300, 100, 100);
        image(Par2, 400, 300, 100, 100);
        image(Par3, 500, 300, 100, 100);
        image(Par4, 600, 300, 100, 100);
        image(Par5, 0, 400, 100, 100);
        image(Par1, 100, 400, 100, 100);
        image(Par2, 200, 400, 100, 100);
        image(Par3, 300, 400, 100, 100);
        image(Par4, 400, 400, 100, 100);
        image(Par5, 500, 400, 100, 100);
        image(Par1, 600, 400, 100, 100);
        image(Par2, 0, 500, 100, 100);
        image(Par3, 100, 500, 100, 100);
        image(Par4, 200, 500, 100, 100);
        image(Par5, 300, 500, 100, 100);
        image(Par1, 400, 500, 100, 100);
        image(Par2, 500, 500, 100, 100);
        image(Par3, 600, 500, 100, 100);
      }
      if (cropType == 21) {
        image(Pop1, 0, 200, 100, 100);
        image(Pop2, 100, 200, 100, 100);
        image(Pop2, 200, 200, 100, 100);
        image(Pop3, 300, 200, 100, 100);
        image(Pop3, 400, 200, 100, 100);
        image(Pop4, 500, 200, 100, 100);
        image(Pop4, 600, 200, 100, 100);
        image(Pop5, 0, 300, 100, 100);
        image(Pop1, 100, 300, 100, 100);
        image(Pop2, 200, 300, 100, 100);
        image(Pop2, 300, 300, 100, 100);
        image(Pop3, 400, 300, 100, 100);
        image(Pop3, 500, 300, 100, 100);
        image(Pop4, 600, 300, 100, 100);
        image(Pop4, 0, 400, 100, 100);
        image(Pop5, 100, 400, 100, 100);
        image(Pop1, 200, 400, 100, 100);
        image(Pop2, 300, 400, 100, 100);
        image(Pop2, 400, 400, 100, 100);
        image(Pop3, 500, 400, 100, 100);
        image(Pop3, 600, 400, 100, 100);
        image(Pop4, 0, 500, 100, 100);
        image(Pop4, 100, 500, 100, 100);
        image(Pop5, 200, 500, 100, 100);
        image(Pop1, 300, 500, 100, 100);
        image(Pop2, 400, 500, 100, 100);
        image(Pop2, 500, 500, 100, 100);
        image(Pop3, 600, 500, 100, 100);
      }
      if (cropType == 22) {
        image(Pot1, 0, 200, 100, 100);
        image(Pot2, 100, 200, 100, 100);
        image(Pot3, 200, 200, 100, 100);
        image(Pot4, 300, 200, 100, 100);
        image(Pot4, 400, 200, 100, 100);
        image(Pot5, 500, 200, 100, 100);
        image(Pot6, 600, 200, 100, 100);
        image(Pot1, 0, 300, 100, 100);
        image(Pot2, 100, 300, 100, 100);
        image(Pot3, 200, 300, 100, 100);
        image(Pot4, 300, 300, 100, 100);
        image(Pot4, 400, 300, 100, 100);
        image(Pot5, 500, 300, 100, 100);
        image(Pot6, 600, 300, 100, 100);
        image(Pot1, 0, 400, 100, 100);
        image(Pot2, 100, 400, 100, 100);
        image(Pot3, 200, 400, 100, 100);
        image(Pot4, 300, 400, 100, 100);
        image(Pot4, 400, 400, 100, 100);
        image(Pot5, 500, 400, 100, 100);
        image(Pot6, 600, 400, 100, 100);
        image(Pot1, 0, 500, 100, 100);
        image(Pot2, 100, 500, 100, 100);
        image(Pot3, 200, 500, 100, 100);
        image(Pot4, 300, 500, 100, 100);
        image(Pot4, 400, 500, 100, 100);
        image(Pot5, 500, 500, 100, 100);
        image(Pot6, 600, 500, 100, 100);
      }
      if (cropType == 23) {
        image(Pum1, 0, 200, 100, 100);
        image(Pum2, 100, 200, 100, 100);
        image(Pum2, 200, 200, 100, 100);
        image(Pum3, 300, 200, 100, 100);
        image(Pum3, 400, 200, 100, 100);
        image(Pum3, 500, 200, 100, 100);
        image(Pum4, 600, 200, 100, 100);
        image(Pum4, 0, 300, 100, 100);
        image(Pum4, 100, 300, 100, 100);
        image(Pum4, 200, 300, 100, 100);
        image(Pum5, 300, 300, 100, 100);
        image(Pum5, 400, 300, 100, 100);
        image(Pum5, 500, 300, 100, 100);
        image(Pum6, 600, 300, 100, 100);
        image(Pum1, 0, 400, 100, 100);
        image(Pum2, 100, 400, 100, 100);
        image(Pum2, 200, 400, 100, 100);
        image(Pum3, 300, 400, 100, 100);
        image(Pum3, 400, 400, 100, 100);
        image(Pum3, 500, 400, 100, 100);
        image(Pum4, 600, 400, 100, 100);
        image(Pum4, 0, 500, 100, 100);
        image(Pum4, 100, 500, 100, 100);
        image(Pum4, 200, 500, 100, 100);
        image(Pum5, 300, 500, 100, 100);
        image(Pum5, 400, 500, 100, 100);
        image(Pum5, 500, 500, 100, 100);
        image(Pum6, 600, 500, 100, 100);
      }
      if (cropType == 24) {
        image(Ra1, 0, 200, 100, 100);
        image(Ra1, 100, 200, 100, 100);
        image(Ra2, 200, 200, 100, 100);
        image(Ra3, 300, 200, 100, 100);
        image(Ra3, 400, 200, 100, 100);
        image(Ra4, 500, 200, 100, 100);
        image(Ra5, 600, 200, 100, 100);
        image(Ra1, 0, 300, 100, 100);
        image(Ra1, 100, 300, 100, 100);
        image(Ra2, 200, 300, 100, 100);
        image(Ra3, 300, 300, 100, 100);
        image(Ra3, 400, 300, 100, 100);
        image(Ra4, 500, 300, 100, 100);
        image(Ra5, 600, 300, 100, 100);
        image(Ra1, 0, 400, 100, 100);
        image(Ra1, 100, 400, 100, 100);
        image(Ra2, 200, 400, 100, 100);
        image(Ra3, 300, 400, 100, 100);
        image(Ra3, 400, 400, 100, 100);
        image(Ra4, 500, 400, 100, 100);
        image(Ra5, 600, 400, 100, 100);
        image(Ra1, 0, 500, 100, 100);
        image(Ra1, 100, 500, 100, 100);
        image(Ra2, 200, 500, 100, 100);
        image(Ra3, 300, 500, 100, 100);
        image(Ra3, 400, 500, 100, 100);
        image(Ra4, 500, 500, 100, 100);
        image(Ra5, 600, 500, 100, 100);
      }
      if (cropType == 25) {
        image(RC1, 0, 200, 100, 100);
        image(RC1, 100, 200, 100, 100);
        image(RC2, 200, 200, 100, 100);
        image(RC3, 300, 200, 100, 100);
        image(RC3, 400, 200, 100, 100);
        image(RC4, 500, 200, 100, 100);
        image(RC4, 600, 200, 100, 100);
        image(RC5, 0, 300, 100, 100);
        image(RC5, 100, 300, 100, 100);
        image(RC6, 200, 300, 100, 100);
        image(RC1, 300, 300, 100, 100);
        image(RC1, 400, 300, 100, 100);
        image(RC2, 500, 300, 100, 100);
        image(RC3, 600, 300, 100, 100);
        image(RC3, 0, 400, 100, 100);
        image(RC4, 100, 400, 100, 100);
        image(RC4, 200, 400, 100, 100);
        image(RC5, 300, 400, 100, 100);
        image(RC5, 400, 400, 100, 100);
        image(RC6, 500, 400, 100, 100);
        image(RC1, 600, 400, 100, 100);
        image(RC1, 0, 500, 100, 100);
        image(RC2, 100, 500, 100, 100);
        image(RC3, 200, 500, 100, 100);
        image(RC3, 300, 500, 100, 100);
        image(RC4, 400, 500, 100, 100);
        image(RC4, 500, 500, 100, 100);
        image(RC5, 600, 500, 100, 100);
      }
      if (cropType == 26) {
        image(Rh1, 0, 200, 100, 100);
        image(Rh1, 100, 200, 100, 100);
        image(Rh2, 200, 200, 100, 100);
        image(Rh2, 300, 200, 100, 100);
        image(Rh3, 400, 200, 100, 100);
        image(Rh3, 500, 200, 100, 100);
        image(Rh4, 600, 200, 100, 100);
        image(Rh4, 0, 300, 100, 100);
        image(Rh4, 100, 300, 100, 100);
        image(Rh5, 200, 300, 100, 100);
        image(Rh5, 300, 300, 100, 100);
        image(Rh5, 400, 300, 100, 100);
        image(Rh5, 500, 300, 100, 100);
        image(Rh6, 600, 300, 100, 100);
        image(Rh1, 0, 400, 100, 100);
        image(Rh1, 100, 400, 100, 100);
        image(Rh2, 200, 400, 100, 100);
        image(Rh2, 300, 400, 100, 100);
        image(Rh3, 400, 400, 100, 100);
        image(Rh3, 500, 400, 100, 100);
        image(Rh4, 600, 400, 100, 100);
        image(Rh4, 0, 500, 100, 100);
        image(Rh4, 100, 500, 100, 100);
        image(Rh5, 200, 500, 100, 100);
        image(Rh5, 300, 500, 100, 100);
        image(Rh5, 400, 500, 100, 100);
        image(Rh5, 500, 500, 100, 100);
        image(Rh6, 600, 500, 100, 100);
      }
      if (cropType == 27) {
        image(Sta1, 0, 200, 100, 100);
        image(Sta1, 100, 200, 100, 100);
        image(Sta2, 200, 200, 100, 100);
        image(Sta2, 300, 200, 100, 100);
        image(Sta2, 400, 200, 100, 100);
        image(Sta3, 500, 200, 100, 100);
        image(Sta3, 600, 200, 100, 100);
        image(Sta4, 0, 300, 100, 100);
        image(Sta4, 100, 300, 100, 100);
        image(Sta4, 200, 300, 100, 100);
        image(Sta5, 300, 300, 100, 100);
        image(Sta5, 400, 300, 100, 100);
        image(Sta5, 500, 300, 100, 100);
        image(Sta6, 600, 300, 100, 100);
        image(Sta1, 0, 400, 100, 100);
        image(Sta1, 100, 400, 100, 100);
        image(Sta2, 200, 400, 100, 100);
        image(Sta2, 300, 400, 100, 100);
        image(Sta2, 400, 400, 100, 100);
        image(Sta3, 500, 400, 100, 100);
        image(Sta3, 600, 400, 100, 100);
        image(Sta4, 0, 500, 100, 100);
        image(Sta4, 100, 500, 100, 100);
        image(Sta4, 200, 500, 100, 100);
        image(Sta5, 300, 500, 100, 100);
        image(Sta5, 400, 500, 100, 100);
        image(Sta5, 500, 500, 100, 100);
        image(Sta6, 600, 500, 100, 100);
      }
      if (cropType == 28) {
        image(Str1, 0, 200, 100, 100);
        image(Str2, 100, 200, 100, 100);
        image(Str3, 200, 200, 100, 100);
        image(Str3, 300, 200, 100, 100);
        image(Str4, 400, 200, 100, 100);
        image(Str4, 500, 200, 100, 100);
        image(Str5, 600, 200, 100, 100);
        image(Str5, 0, 300, 100, 100);
        image(Str6, 100, 300, 100, 100);
        image(Str7, 200, 300, 100, 100);
        image(Str7, 300, 300, 100, 100);
        image(Str7, 400, 300, 100, 100);
        image(Str6, 500, 300, 100, 100);
        image(Str7, 600, 300, 100, 100);
        image(Str7, 0, 400, 100, 100);
        image(Str7, 100, 400, 100, 100);
        image(Str6, 200, 400, 100, 100);
        image(Str7, 300, 400, 100, 100);
        image(Str7, 400, 400, 100, 100);
        image(Str7, 500, 400, 100, 100);
        image(Str6, 600, 400, 100, 100);
        image(Str7, 0, 500, 100, 100);
        image(Str7, 100, 500, 100, 100);
        image(Str7, 200, 500, 100, 100);
        image(Str6, 300, 500, 100, 100);
        image(Str7, 400, 500, 100, 100);
        image(Str7, 500, 500, 100, 100);
        image(Str7, 600, 500, 100, 100);
      }
      if (cropType == 29) {
        image(SS1, 0, 200, 100, 100);
        image(SS2, 100, 200, 100, 100);
        image(SS2, 200, 200, 100, 100);
        image(SS3, 300, 200, 100, 100);
        image(SS3, 400, 200, 100, 100);
        image(SS3, 500, 200, 100, 100);
        image(SS4, 600, 200, 100, 100);
        image(SS4, 0, 300, 100, 100);
        image(SS5, 100, 300, 100, 100);
        image(SS1, 200, 300, 100, 100);
        image(SS2, 300, 300, 100, 100);
        image(SS2, 400, 300, 100, 100);
        image(SS3, 500, 300, 100, 100);
        image(SS3, 600, 300, 100, 100);
        image(SS3, 0, 400, 100, 100);
        image(SS4, 100, 400, 100, 100);
        image(SS4, 200, 400, 100, 100);
        image(SS5, 300, 400, 100, 100);
        image(SS1, 400, 400, 100, 100);
        image(SS2, 500, 400, 100, 100);
        image(SS2, 600, 400, 100, 100);
        image(SS3, 0, 500, 100, 100);
        image(SS3, 100, 500, 100, 100);
        image(SS3, 200, 500, 100, 100);
        image(SS4, 300, 500, 100, 100);
        image(SS4, 400, 500, 100, 100);
        image(SS5, 500, 500, 100, 100);
        image(SS1, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su1, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su2, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su3, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su4, 0, 300, 100, 100);
        image(Su5, 100, 300, 100, 100);
        image(Su1, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su2, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su3, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su4, 200, 400, 100, 100);
        image(Su5, 300, 400, 100, 100);
        image(Su1, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su2, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su3, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su4, 400, 500, 100, 100);
        image(Su5, 500, 500, 100, 100);
        image(Su1, 600, 500, 100, 100);
      }
      if (cropType == 31) {
        image(To1, 0, 200, 100, 100);
        image(To1, 100, 200, 100, 100);
        image(To2, 200, 200, 100, 100);
        image(To2, 300, 200, 100, 100);
        image(To3, 400, 200, 100, 100);
        image(To3, 500, 200, 100, 100);
        image(To4, 600, 200, 100, 100);
        image(To4, 0, 300, 100, 100);
        image(To5, 100, 300, 100, 100);
        image(To5, 200, 300, 100, 100);
        image(To5, 300, 300, 100, 100);
        image(To6, 400, 300, 100, 100);
        image(To7, 500, 300, 100, 100);
        image(To7, 600, 300, 100, 100);
        image(To7, 0, 400, 100, 100);
        image(To6, 100, 400, 100, 100);
        image(To7, 200, 400, 100, 100);
        image(To7, 300, 400, 100, 100);
        image(To7, 400, 400, 100, 100);
        image(To6, 500, 400, 100, 100);
        image(To7, 600, 400, 100, 100);
        image(To7, 0, 500, 100, 100);
        image(To7, 100, 500, 100, 100);
        image(To6, 200, 500, 100, 100);
        image(To7, 300, 500, 100, 100);
        image(To7, 400, 500, 100, 100);
        image(To7, 500, 500, 100, 100);
        image(To6, 600, 500, 100, 100);
      }
      if (cropType == 32) {
        image(Tu1, 0, 200, 100, 100);
        image(Tu2, 100, 200, 100, 100);
        image(Tu3, 200, 200, 100, 100);
        image(Tu3, 300, 200, 100, 100);
        image(Tu4, 400, 200, 100, 100);
        image(Tu4, 500, 200, 100, 100);
        image(Tu5, 600, 200, 100, 100);
        image(Tu1, 0, 300, 100, 100);
        image(Tu2, 100, 300, 100, 100);
        image(Tu3, 200, 300, 100, 100);
        image(Tu3, 300, 300, 100, 100);
        image(Tu4, 400, 300, 100, 100);
        image(Tu4, 500, 300, 100, 100);
        image(Tu5, 600, 300, 100, 100);
        image(Tu1, 0, 400, 100, 100);
        image(Tu2, 100, 400, 100, 100);
        image(Tu3, 200, 400, 100, 100);
        image(Tu3, 300, 400, 100, 100);
        image(Tu4, 400, 400, 100, 100);
        image(Tu4, 500, 400, 100, 100);
        image(Tu5, 600, 400, 100, 100);
        image(Tu1, 0, 500, 100, 100);
        image(Tu2, 100, 500, 100, 100);
        image(Tu3, 200, 500, 100, 100);
        image(Tu3, 300, 500, 100, 100);
        image(Tu4, 400, 500, 100, 100);
        image(Tu4, 500, 500, 100, 100);
        image(Tu5, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR2, 200, 200, 100, 100);
        image(UmR3, 300, 200, 100, 100);
        image(UmR3, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR4, 600, 200, 100, 100);
        image(UmR4, 0, 300, 100, 100);
        image(UmR5, 100, 300, 100, 100);
        image(UmR1, 200, 300, 100, 100);
        image(UmR2, 300, 300, 100, 100);
        image(UmR2, 400, 300, 100, 100);
        image(UmR3, 500, 300, 100, 100);
        image(UmR3, 600, 300, 100, 100);
        image(UmR4, 0, 400, 100, 100);
        image(UmR4, 100, 400, 100, 100);
        image(UmR4, 200, 400, 100, 100);
        image(UmR5, 300, 400, 100, 100);
        image(UmR1, 400, 400, 100, 100);
        image(UmR2, 500, 400, 100, 100);
        image(UmR2, 600, 400, 100, 100);
        image(UmR3, 0, 500, 100, 100);
        image(UmR3, 100, 500, 100, 100);
        image(UmR4, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR5, 500, 500, 100, 100);
        image(UmR1, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W1, 0, 200, 100, 100);
        image(W2, 100, 200, 100, 100);
        image(W3, 200, 200, 100, 100);
        image(W4, 300, 200, 100, 100);
        image(W5, 400, 200, 100, 100);
        image(W1, 500, 200, 100, 100);
        image(W2, 600, 200, 100, 100);
        image(W3, 0, 300, 100, 100);
        image(W4, 100, 300, 100, 100);
        image(W5, 200, 300, 100, 100);
        image(W1, 300, 300, 100, 100);
        image(W2, 400, 300, 100, 100);
        image(W3, 500, 300, 100, 100);
        image(W4, 600, 300, 100, 100);
        image(W5, 0, 400, 100, 100);
        image(W1, 100, 400, 100, 100);
        image(W2, 200, 400, 100, 100);
        image(W3, 300, 400, 100, 100);
        image(W4, 400, 400, 100, 100);
        image(W5, 500, 400, 100, 100);
        image(W1, 600, 400, 100, 100);
        image(W2, 0, 500, 100, 100);
        image(W3, 100, 500, 100, 100);
        image(W4, 200, 500, 100, 100);
        image(W5, 300, 500, 100, 100);
        image(W1, 400, 500, 100, 100);
        image(W2, 500, 500, 100, 100);
        image(W3, 600, 500, 100, 100);
      }
      if (cropType == 35) {
        image(Y1, 0, 200, 100, 100);
        image(Y2, 100, 200, 100, 100);
        image(Y2, 200, 200, 100, 100);
        image(Y2, 300, 200, 100, 100);
        image(Y3, 400, 200, 100, 100);
        image(Y3, 500, 200, 100, 100);
        image(Y3, 600, 200, 100, 100);
        image(Y4, 0, 300, 100, 100);
        image(Y4, 100, 300, 100, 100);
        image(Y4, 200, 300, 100, 100);
        image(Y5, 300, 300, 100, 100);
        image(Y1, 400, 300, 100, 100);
        image(Y2, 500, 300, 100, 100);
        image(Y2, 600, 300, 100, 100);
        image(Y2, 0, 400, 100, 100);
        image(Y3, 100, 400, 100, 100);
        image(Y3, 200, 400, 100, 100);
        image(Y3, 300, 400, 100, 100);
        image(Y4, 400, 400, 100, 100);
        image(Y4, 500, 400, 100, 100);
        image(Y4, 600, 400, 100, 100);
        image(Y5, 0, 500, 100, 100);
        image(Y1, 100, 500, 100, 100);
        image(Y2, 200, 500, 100, 100);
        image(Y2, 300, 500, 100, 100);
        image(Y2, 400, 500, 100, 100);
        image(Y3, 500, 500, 100, 100);
        image(Y3, 600, 500, 100, 100);
      }
    }
    if (cropCalendarNSGtype2) {
      if (cropType == 8) {
        image(CB6, 0, 200, 100, 100);
        image(CB7, 100, 200, 100, 100);
        image(CB6, 200, 200, 100, 100);
        image(CB7, 300, 200, 100, 100);
        image(CB6, 400, 200, 100, 100);
        image(CB7, 500, 200, 100, 100);
        image(CB6, 600, 200, 100, 100);
        image(CB7, 0, 300, 100, 100);
        image(CB6, 100, 300, 100, 100);
        image(CB7, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co7, 0, 200, 100, 100);
        image(Co7, 100, 200, 100, 100);
        image(Co6, 200, 200, 100, 100);
        image(Co7, 300, 200, 100, 100);
        image(Co7, 400, 200, 100, 100);
        image(Co7, 500, 200, 100, 100);
        image(Co6, 600, 200, 100, 100);
        image(Co7, 0, 300, 100, 100);
        image(Co7, 100, 300, 100, 100);
        image(Co7, 200, 300, 100, 100);
        image(Co6, 300, 300, 100, 100);
        image(Co7, 400, 300, 100, 100);
        image(Co7, 500, 300, 100, 100);
        image(Co7, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su2, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su3, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su4, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su5, 0, 300, 100, 100);
        image(Su1, 100, 300, 100, 100);
        image(Su2, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su3, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su4, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su5, 200, 400, 100, 100);
        image(Su1, 300, 400, 100, 100);
        image(Su2, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su3, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su4, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su5, 400, 500, 100, 100);
        image(Su1, 500, 500, 100, 100);
        image(Su2, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR3, 200, 200, 100, 100);
        image(UmR4, 300, 200, 100, 100);
        image(UmR4, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR5, 600, 200, 100, 100);
        image(UmR1, 0, 300, 100, 100);
        image(UmR2, 100, 300, 100, 100);
        image(UmR3, 200, 300, 100, 100);
        image(UmR4, 300, 300, 100, 100);
        image(UmR4, 400, 300, 100, 100);
        image(UmR4, 500, 300, 100, 100);
        image(UmR5, 600, 300, 100, 100);
        image(UmR1, 0, 400, 100, 100);
        image(UmR2, 100, 400, 100, 100);
        image(UmR3, 200, 400, 100, 100);
        image(UmR4, 300, 400, 100, 100);
        image(UmR4, 400, 400, 100, 100);
        image(UmR4, 500, 400, 100, 100);
        image(UmR5, 600, 400, 100, 100);
        image(UmR1, 0, 500, 100, 100);
        image(UmR2, 100, 500, 100, 100);
        image(UmR3, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR4, 500, 500, 100, 100);
        image(UmR5, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W4, 0, 200, 100, 100);
        image(W5, 100, 200, 100, 100);
        image(W1, 200, 200, 100, 100);
        image(W2, 300, 200, 100, 100);
        image(W3, 400, 200, 100, 100);
        image(W4, 500, 200, 100, 100);
        image(W5, 600, 200, 100, 100);
        image(W1, 0, 300, 100, 100);
        image(W2, 100, 300, 100, 100);
        image(W3, 200, 300, 100, 100);
        image(W4, 300, 300, 100, 100);
        image(W5, 400, 300, 100, 100);
        image(W1, 500, 300, 100, 100);
        image(W2, 600, 300, 100, 100);
        image(W3, 0, 400, 100, 100);
        image(W4, 100, 400, 100, 100);
        image(W5, 200, 400, 100, 100);
        image(W1, 300, 400, 100, 100);
        image(W1, 400, 400, 100, 100);
        image(W2, 500, 400, 100, 100);
        image(W3, 600, 400, 100, 100);
        image(W4, 0, 500, 100, 100);
        image(W5, 100, 500, 100, 100);
        image(W1, 200, 500, 100, 100);
        image(W2, 300, 500, 100, 100);
        image(W3, 400, 500, 100, 100);
        image(W4, 500, 500, 100, 100);
        image(W5, 600, 500, 100, 100);
      }
    }
    if (cropType == 8 || cropType == 9 || cropType == 30 || cropType == 33 || cropType == 34) {
      if (keyPressed) {
        if (key == CODED) {
          if (keyCode == SHIFT) {
            cropCalendarNSGtype2 = true;
            cropCalendarNSGtype1 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
          if (keyCode == CONTROL) {
            cropCalendarNSGtype1 = true;
            cropCalendarNSGtype2 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
        }
      }
    }
    if (keyPressed) {
      if (key == 'V' || key == 'v') {
        cropSelect = true;
        cropCalendarNSG = false;
        fill(0);
        rect(0, 0, 700, 600);
      }
      if (key == 'C' || key == 'c') {
        cropCalendarNSG = false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalculator = true;
        }
        if (key == '2') {
          cropCalendarNSG = false;
          fill(0);
          rect(0, 0, 700, 600);
          cropCalendarNSG = true;
      }
    }
  }
}*/
/*void CalendarmodeNSG() {
  if (cropCalendarNSG == true) {

    //build
    stroke(255);
    for (int i = 100; i < 600; i += 100) {
      line(0, i, 700, i);
    }
    for (int i = 100; i < 700; i += 100) {
      line(i, 100, i, 600);
    }
    //text
    fill(255);
    textSize(32);
    text("Mon", 20, 200);
    text("Tue", 120, 200);
    text("Wed", 220, 200);
    text("Thu", 320, 200);
    text("Fri", 420, 200);
    text("Sat", 520, 200);
    text("Sun", 620, 200);
    if (cropCalendarNSGtype1) {
      if (cropType == 1) {
        image(Am1, 0, 200, 100, 100);
        image(Am2, 100, 200, 100, 100);
        image(Am2, 200, 200, 100, 100);
        image(Am3, 300, 200, 100, 100);
        image(Am3, 400, 200, 100, 100);
        image(Am4, 500, 200, 100, 100);
        image(Am4, 600, 200, 100, 100);
        image(Am5, 0, 300, 100, 100);
        image(Am1, 100, 300, 100, 100);
        image(Am2, 200, 300, 100, 100);
        image(Am2, 300, 300, 100, 100);
        image(Am3, 400, 300, 100, 100);
        image(Am3, 500, 300, 100, 100);
        image(Am4, 600, 300, 100, 100);
        image(Am4, 0, 400, 100, 100);
        image(Am5, 100, 400, 100, 100);
        image(Am1, 200, 400, 100, 100);
        image(Am2, 300, 400, 100, 100);
        image(Am2, 400, 400, 100, 100);
        image(Am3, 500, 400, 100, 100);
        image(Am3, 600, 400, 100, 100);
        image(Am4, 0, 500, 100, 100);
        image(Am4, 100, 500, 100, 100);
        image(Am5, 200, 500, 100, 100);
        image(Am1, 300, 500, 100, 100);
        image(Am2, 400, 500, 100, 100);
        image(Am2, 500, 500, 100, 100);
        image(Am3, 600, 500, 100, 100);
      }
      if (cropType == 2) {
        image(Ar1, 0, 200, 100, 100);
        image(Ar1, 100, 200, 100, 100);
        image(Ar2, 200, 200, 100, 100);
        image(Ar2, 300, 200, 100, 100);
        image(Ar3, 400, 200, 100, 100);
        image(Ar4, 500, 200, 100, 100);
        image(Ar4, 600, 200, 100, 100);
        image(Ar5, 0, 300, 100, 100);
        image(Ar6, 100, 300, 100, 100);
        image(Ar1, 200, 300, 100, 100);
        image(Ar1, 300, 300, 100, 100);
        image(Ar2, 400, 300, 100, 100);
        image(Ar2, 500, 300, 100, 100);
        image(Ar3, 600, 300, 100, 100);
        image(Ar4, 0, 400, 100, 100);
        image(Ar4, 100, 400, 100, 100);
        image(Ar5, 200, 400, 100, 100);
        image(Ar6, 300, 400, 100, 100);
        image(Ar1, 400, 400, 100, 100);
        image(Ar1, 500, 400, 100, 100);
        image(Ar2, 600, 400, 100, 100);
        image(Ar2, 0, 500, 100, 100);
        image(Ar3, 100, 500, 100, 100);
        image(Ar4, 200, 500, 100, 100);
        image(Ar4, 300, 500, 100, 100);
        image(Ar5, 400, 500, 100, 100);
        image(Ar6, 500, 500, 100, 100);
        image(Ar1, 600, 500, 100, 100);
      }
      if (cropType == 3) {
        image(Be1, 0, 200, 100, 100);
        image(Be2, 100, 200, 100, 100);
        image(Be3, 200, 200, 100, 100);
        image(Be3, 300, 200, 100, 100);
        image(Be4, 400, 200, 100, 100);
        image(Be4, 500, 200, 100, 100);
        image(Be5, 600, 200, 100, 100);
        image(Be1, 0, 300, 100, 100);
        image(Be2, 100, 300, 100, 100);
        image(Be3, 200, 300, 100, 100);
        image(Be3, 300, 300, 100, 100);
        image(Be4, 400, 300, 100, 100);
        image(Be4, 500, 300, 100, 100);
        image(Be5, 600, 300, 100, 100);
        image(Be1, 0, 400, 100, 100);
        image(Be2, 100, 400, 100, 100);
        image(Be3, 200, 400, 100, 100);
        image(Be3, 300, 400, 100, 100);
        image(Be4, 400, 400, 100, 100);
        image(Be4, 500, 400, 100, 100);
        image(Be5, 600, 400, 100, 100);
        image(Be1, 0, 500, 100, 100);
        image(Be2, 100, 500, 100, 100);
        image(Be3, 200, 500, 100, 100);
        image(Be3, 300, 500, 100, 100);
        image(Be4, 400, 500, 100, 100);
        image(Be4, 500, 500, 100, 100);
        image(Be5, 600, 500, 100, 100);
      }
      if (cropType == 4) {
        image(Bl1, 0, 200, 100, 100);
        image(Bl2, 100, 200, 100, 100);
        image(Bl2, 200, 200, 100, 100);
        image(Bl2, 300, 200, 100, 100);
        image(Bl3, 400, 200, 100, 100);
        image(Bl3, 500, 200, 100, 100);
        image(Bl3, 600, 200, 100, 100);
        image(Bl4, 0, 300, 100, 100);
        image(Bl4, 100, 300, 100, 100);
        image(Bl4, 200, 300, 100, 100);
        image(Bl4, 300, 300, 100, 100);
        image(Bl5, 400, 300, 100, 100);
        image(Bl5, 500, 300, 100, 100);
        image(Bl6, 600, 300, 100, 100);
        image(Bl7, 0, 400, 100, 100);
        image(Bl7, 100, 400, 100, 100);
        image(Bl7, 200, 400, 100, 100);
        image(Bl6, 300, 400, 100, 100);
        image(Bl7, 400, 400, 100, 100);
        image(Bl7, 500, 400, 100, 100);
        image(Bl7, 600, 400, 100, 100);
        image(Bl6, 0, 500, 100, 100);
        image(Bl7, 100, 500, 100, 100);
        image(Bl7, 200, 500, 100, 100);
        image(Bl7, 300, 500, 100, 100);
        image(Bl6, 400, 500, 100, 100);
        image(Bl7, 500, 500, 100, 100);
        image(Bl7, 600, 500, 100, 100);
      }
      if (cropType == 5) {
        image(BJ1, 0, 200, 100, 100);
        image(BJ2, 100, 200, 100, 100);
        image(BJ2, 200, 200, 100, 100);
        image(BJ3, 300, 200, 100, 100);
        image(BJ3, 400, 200, 100, 100);
        image(BJ4, 500, 200, 100, 100);
        image(BJ4, 600, 200, 100, 100);
        image(BJ5, 0, 300, 100, 100);
        image(BJ1, 100, 300, 100, 100);
        image(BJ2, 200, 300, 100, 100);
        image(BJ2, 300, 300, 100, 100);
        image(BJ3, 400, 300, 100, 100);
        image(BJ3, 500, 300, 100, 100);
        image(BJ4, 600, 300, 100, 100);
        image(BJ4, 0, 400, 100, 100);
        image(BJ5, 100, 400, 100, 100);
        image(BJ1, 200, 400, 100, 100);
        image(BJ2, 300, 400, 100, 100);
        image(BJ2, 400, 400, 100, 100);
        image(BJ3, 500, 400, 100, 100);
        image(BJ3, 600, 400, 100, 100);
        image(BJ4, 0, 500, 100, 100);
        image(BJ4, 100, 500, 100, 100);
        image(BJ5, 200, 500, 100, 100);
        image(BJ1, 300, 500, 100, 100);
        image(BJ2, 400, 500, 100, 100);
        image(BJ2, 500, 500, 100, 100);
        image(BJ3, 600, 500, 100, 100);
      }
      if (cropType == 6) {
        image(BC1, 0, 200, 100, 100);
        image(BC2, 100, 200, 100, 100);
        image(BC3, 200, 200, 100, 100);
        image(BC4, 300, 200, 100, 100);
        image(BC5, 400, 200, 100, 100);
        image(BC1, 500, 200, 100, 100);
        image(BC2, 600, 200, 100, 100);
        image(BC3, 0, 300, 100, 100);
        image(BC4, 100, 300, 100, 100);
        image(BC5, 200, 300, 100, 100);
        image(BC1, 300, 300, 100, 100);
        image(BC2, 400, 300, 100, 100);
        image(BC3, 500, 300, 100, 100);
        image(BC4, 600, 300, 100, 100);
        image(BC5, 0, 400, 100, 100);
        image(BC1, 100, 400, 100, 100);
        image(BC2, 200, 400, 100, 100);
        image(BC3, 300, 400, 100, 100);
        image(BC4, 400, 400, 100, 100);
        image(BC5, 500, 400, 100, 100);
        image(BC1, 600, 400, 100, 100);
        image(BC2, 0, 500, 100, 100);
        image(BC3, 100, 500, 100, 100);
        image(BC4, 200, 500, 100, 100);
        image(BC5, 300, 500, 100, 100);
        image(BC1, 400, 500, 100, 100);
        image(BC2, 500, 500, 100, 100);
        image(BC3, 600, 500, 100, 100);
      }
      if (cropType == 7) {
        image(Ca1, 0, 200, 100, 100);
        image(Ca2, 100, 200, 100, 100);
        image(Ca2, 200, 200, 100, 100);
        image(Ca3, 300, 200, 100, 100);
        image(Ca3, 400, 200, 100, 100);
        image(Ca3, 500, 200, 100, 100);
        image(Ca3, 600, 200, 100, 100);
        image(Ca4, 0, 300, 100, 100);
        image(Ca4, 100, 300, 100, 100);
        image(Ca4, 200, 300, 100, 100);
        image(Ca4, 300, 300, 100, 100);
        image(Ca5, 400, 300, 100, 100);
        image(Ca6, 500, 300, 100, 100);
        image(Ca1, 600, 300, 100, 100);
        image(Ca2, 0, 400, 100, 100);
        image(Ca2, 100, 400, 100, 100);
        image(Ca3, 200, 400, 100, 100);
        image(Ca3, 300, 400, 100, 100);
        image(Ca3, 400, 400, 100, 100);
        image(Ca3, 500, 400, 100, 100);
        image(Ca4, 600, 400, 100, 100);
        image(Ca4, 0, 500, 100, 100);
        image(Ca4, 100, 500, 100, 100);
        image(Ca4, 200, 500, 100, 100);
        image(Ca5, 300, 500, 100, 100);
        image(Ca6, 400, 500, 100, 100);
        image(Ca1, 500, 500, 100, 100);
        image(Ca2, 600, 500, 100, 100);
      }
      if (cropType == 8) {
        image(CB1, 0, 200, 100, 100);
        image(CB2, 100, 200, 100, 100);
        image(CB2, 200, 200, 100, 100);
        image(CB3, 300, 200, 100, 100);
        image(CB3, 400, 200, 100, 100);
        image(CB4, 500, 200, 100, 100);
        image(CB4, 600, 200, 100, 100);
        image(CB4, 0, 300, 100, 100);
        image(CB5, 100, 300, 100, 100);
        image(CB5, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co1, 0, 200, 100, 100);
        image(Co1, 100, 200, 100, 100);
        image(Co2, 200, 200, 100, 100);
        image(Co2, 300, 200, 100, 100);
        image(Co2, 400, 200, 100, 100);
        image(Co3, 500, 200, 100, 100);
        image(Co3, 600, 200, 100, 100);
        image(Co3, 0, 300, 100, 100);
        image(Co4, 100, 300, 100, 100);
        image(Co4, 200, 300, 100, 100);
        image(Co4, 300, 300, 100, 100);
        image(Co5, 400, 300, 100, 100);
        image(Co5, 500, 300, 100, 100);
        image(Co5, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 10) {
        image(Cr1, 0, 200, 100, 100);
        image(Cr2, 100, 200, 100, 100);
        image(Cr2, 200, 200, 100, 100);
        image(Cr3, 300, 200, 100, 100);
        image(Cr4, 400, 200, 100, 100);
        image(Cr5, 500, 200, 100, 100);
        image(Cr5, 600, 200, 100, 100);
        image(Cr6, 0, 300, 100, 100);
        image(Cr7, 100, 300, 100, 100);
        image(Cr7, 200, 300, 100, 100);
        image(Cr7, 300, 300, 100, 100);
        image(Cr7, 400, 300, 100, 100);
        image(Cr6, 500, 300, 100, 100);
        image(Cr7, 600, 300, 100, 100);
        image(Cr7, 0, 400, 100, 100);
        image(Cr7, 100, 400, 100, 100);
        image(Cr7, 200, 400, 100, 100);
        image(Cr6, 300, 400, 100, 100);
        image(Cr7, 400, 400, 100, 100);
        image(Cr7, 500, 400, 100, 100);
        image(Cr7, 600, 400, 100, 100);
        image(Cr7, 0, 500, 100, 100);
        image(Cr6, 100, 500, 100, 100);
        image(Cr7, 200, 500, 100, 100);
        image(Cr7, 300, 500, 100, 100);
        image(Cr7, 400, 500, 100, 100);
        image(Cr7, 500, 500, 100, 100);
        image(Cr6, 600, 500, 100, 100);
      }
      if (cropType == 11) {
        image(E1, 0, 200, 100, 100);
        image(E2, 100, 200, 100, 100);
        image(E3, 200, 200, 100, 100);
        image(E4, 300, 200, 100, 100);
        image(E5, 400, 200, 100, 100);
        image(E6, 500, 200, 100, 100);
        image(E1, 600, 200, 100, 100);
        image(E2, 0, 300, 100, 100);
        image(E3, 100, 300, 100, 100);
        image(E4, 200, 300, 100, 100);
        image(E5, 300, 300, 100, 100);
        image(E6, 400, 300, 100, 100);
        image(E1, 500, 300, 100, 100);
        image(E2, 600, 300, 100, 100);
        image(E3, 0, 400, 100, 100);
        image(E4, 100, 400, 100, 100);
        image(E5, 200, 400, 100, 100);
        image(E6, 300, 400, 100, 100);
        image(E1, 400, 400, 100, 100);
        image(E2, 500, 400, 100, 100);
        image(E3, 600, 400, 100, 100);
        image(E4, 0, 500, 100, 100);
        image(E5, 100, 500, 100, 100);
        image(E6, 200, 500, 100, 100);
        image(E1, 300, 500, 100, 100);
        image(E2, 400, 500, 100, 100);
        image(E3, 500, 500, 100, 100);
        image(E4, 600, 500, 100, 100);
      }
      if (cropType == 12) {
        image(FR1, 0, 200, 100, 100);
        image(FR2, 100, 200, 100, 100);
        image(FR2, 200, 200, 100, 100);
        image(FR2, 300, 200, 100, 100);
        image(FR2, 400, 200, 100, 100);
        image(FR3, 500, 200, 100, 100);
        image(FR3, 600, 200, 100, 100);
        image(FR3, 0, 300, 100, 100);
        image(FR3, 100, 300, 100, 100);
        image(FR4, 200, 300, 100, 100);
        image(FR4, 300, 300, 100, 100);
        image(FR4, 400, 300, 100, 100);
        image(FR5, 500, 300, 100, 100);
        image(FR1, 600, 300, 100, 100);
        image(FR2, 0, 400, 100, 100);
        image(FR2, 100, 400, 100, 100);
        image(FR2, 200, 400, 100, 100);
        image(FR2, 300, 400, 100, 100);
        image(FR3, 400, 400, 100, 100);
        image(FR3, 500, 400, 100, 100);
        image(FR3, 600, 400, 100, 100);
        image(FR3, 0, 500, 100, 100);
        image(FR4, 100, 500, 100, 100);
        image(FR4, 200, 500, 100, 100);
        image(FR4, 300, 500, 100, 100);
        image(FR5, 400, 500, 100, 100);
        image(FR1, 500, 500, 100, 100);
        image(FR2, 600, 500, 100, 100);
      }
      if (cropType == 13) {
        image(Ga1, 0, 200, 100, 100);
        image(Ga2, 100, 200, 100, 100);
        image(Ga3, 200, 200, 100, 100);
        image(Ga4, 300, 200, 100, 100);
        image(Ga5, 400, 200, 100, 100);
        image(Ga1, 500, 200, 100, 100);
        image(Ga2, 600, 200, 100, 100);
        image(Ga3, 0, 300, 100, 100);
        image(Ga4, 100, 300, 100, 100);
        image(Ga5, 200, 300, 100, 100);
        image(Ga1, 300, 300, 100, 100);
        image(Ga2, 400, 300, 100, 100);
        image(Ga3, 500, 300, 100, 100);
        image(Ga4, 600, 300, 100, 100);
        image(Ga5, 0, 400, 100, 100);
        image(Ga1, 100, 400, 100, 100);
        image(Ga2, 200, 400, 100, 100);
        image(Ga3, 300, 400, 100, 100);
        image(Ga4, 400, 400, 100, 100);
        image(Ga5, 500, 400, 100, 100);
        image(Ga1, 600, 400, 100, 100);
        image(Ga2, 0, 500, 100, 100);
        image(Ga3, 100, 500, 100, 100);
        image(Ga4, 200, 500, 100, 100);
        image(Ga5, 300, 500, 100, 100);
        image(Ga1, 400, 500, 100, 100);
        image(Ga2, 500, 500, 100, 100);
        image(Ga3, 600, 500, 100, 100);
      }
      if (cropType == 14) {
        image(GB1, 0, 200, 100, 100);
        image(GB2, 100, 200, 100, 100);
        image(GB3, 200, 200, 100, 100);
        image(GB4, 300, 200, 100, 100);
        image(GB4, 400, 200, 100, 100);
        image(GB4, 500, 200, 100, 100);
        image(GB5, 600, 200, 100, 100);
        image(GB5, 0, 300, 100, 100);
        image(GB5, 100, 300, 100, 100);
        image(GB5, 200, 300, 100, 100);
        image(GB6, 300, 300, 100, 100);
        image(GB7, 400, 300, 100, 100);
        image(GB7, 500, 300, 100, 100);
        image(GB6, 600, 300, 100, 100);
        image(GB7, 0, 400, 100, 100);
        image(GB7, 100, 400, 100, 100);
        image(GB6, 200, 400, 100, 100);
        image(GB7, 300, 400, 100, 100);
        image(GB7, 400, 400, 100, 100);
        image(GB6, 500, 400, 100, 100);
        image(GB7, 600, 400, 100, 100);
        image(GB7, 0, 500, 100, 100);
        image(GB6, 100, 500, 100, 100);
        image(GB7, 200, 500, 100, 100);
        image(GB7, 300, 500, 100, 100);
        image(GB6, 400, 500, 100, 100);
        image(GB7, 500, 500, 100, 100);
        image(GB7, 600, 500, 100, 100);
      }
      if (cropType == 15) {
        image(Gr1, 0, 200, 100, 100);
        image(Gr2, 100, 200, 100, 100);
        image(Gr3, 200, 200, 100, 100);
        image(Gr3, 300, 200, 100, 100);
        image(Gr4, 400, 200, 100, 100);
        image(Gr4, 500, 200, 100, 100);
        image(Gr4, 600, 200, 100, 100);
        image(Gr5, 0, 300, 100, 100);
        image(Gr5, 100, 300, 100, 100);
        image(Gr5, 200, 300, 100, 100);
        image(Gr6, 300, 300, 100, 100);
        image(Gr7, 400, 300, 100, 100);
        image(Gr7, 500, 300, 100, 100);
        image(Gr6, 600, 300, 100, 100);
        image(Gr7, 0, 400, 100, 100);
        image(Gr7, 100, 400, 100, 100);
        image(Gr6, 200, 400, 100, 100);
        image(Gr7, 300, 400, 100, 100);
        image(Gr7, 400, 400, 100, 100);
        image(Gr6, 500, 400, 100, 100);
        image(Gr7, 600, 400, 100, 100);
        image(Gr7, 0, 500, 100, 100);
        image(Gr6, 100, 500, 100, 100);
        image(Gr7, 200, 500, 100, 100);
        image(Gr7, 300, 500, 100, 100);
        image(Gr6, 400, 500, 100, 100);
        image(Gr7, 500, 500, 100, 100);
        image(Gr7, 600, 500, 100, 100);
      }
      if (cropType == 16) {
        image(H1, 0, 200, 100, 100);
        image(H2, 100, 200, 100, 100);
        image(H3, 200, 200, 100, 100);
        image(H3, 300, 200, 100, 100);
        image(H4, 400, 200, 100, 100);
        image(H4, 500, 200, 100, 100);
        image(H4, 600, 200, 100, 100);
        image(H5, 0, 300, 100, 100);
        image(H5, 100, 300, 100, 100);
        image(H5, 200, 300, 100, 100);
        image(H5, 300, 300, 100, 100);
        image(H6, 400, 300, 100, 100);
        image(H6, 500, 300, 100, 100);
        image(H6, 600, 300, 100, 100);
        image(H6, 0, 400, 100, 100);
        image(H6, 100, 400, 100, 100);
        image(H6, 200, 400, 100, 100);
        image(H6, 300, 400, 100, 100);
        image(H6, 400, 400, 100, 100);
        image(H6, 500, 400, 100, 100);
        image(H6, 600, 400, 100, 100);
        image(H6, 0, 500, 100, 100);
        image(H6, 100, 500, 100, 100);
        image(H6, 200, 500, 100, 100);
        image(H6, 300, 500, 100, 100);
        image(H6, 400, 500, 100, 100);
        image(H6, 500, 500, 100, 100);
        image(H6, 600, 500, 100, 100);
      }
      if (cropType == 17) {
        image(HP1, 0, 200, 100, 100);
        image(HP2, 100, 200, 100, 100);
        image(HP3, 200, 200, 100, 100);
        image(HP4, 300, 200, 100, 100);
        image(HP5, 400, 200, 100, 100);
        image(HP6, 500, 200, 100, 100);
        image(HP7, 600, 200, 100, 100);
        image(HP7, 0, 300, 100, 100);
        image(HP6, 100, 300, 100, 100);
        image(HP7, 200, 300, 100, 100);
        image(HP7, 300, 300, 100, 100);
        image(HP6, 400, 300, 100, 100);
        image(HP7, 500, 300, 100, 100);
        image(HP7, 600, 300, 100, 100);
        image(HP6, 0, 400, 100, 100);
        image(HP7, 100, 400, 100, 100);
        image(HP7, 200, 400, 100, 100);
        image(HP6, 300, 400, 100, 100);
        image(HP7, 400, 400, 100, 100);
        image(HP7, 500, 400, 100, 100);
        image(HP6, 600, 400, 100, 100);
        image(HP7, 0, 500, 100, 100);
        image(HP7, 100, 500, 100, 100);
        image(HP6, 200, 500, 100, 100);
        image(HP7, 300, 500, 100, 100);
        image(HP7, 400, 500, 100, 100);
        image(HP6, 500, 500, 100, 100);
        image(HP7, 600, 500, 100, 100);
      }
      if (cropType == 18) {
        image(K1, 0, 200, 100, 100);
        image(K2, 100, 200, 100, 100);
        image(K2, 200, 200, 100, 100);
        image(K3, 300, 200, 100, 100);
        image(K3, 400, 200, 100, 100);
        image(K4, 500, 200, 100, 100);
        image(K5, 600, 200, 100, 100);
        image(K1, 0, 300, 100, 100);
        image(K2, 100, 300, 100, 100);
        image(K2, 200, 300, 100, 100);
        image(K3, 300, 300, 100, 100);
        image(K3, 400, 300, 100, 100);
        image(K4, 500, 300, 100, 100);
        image(K5, 600, 300, 100, 100);
        image(K1, 0, 400, 100, 100);
        image(K2, 100, 400, 100, 100);
        image(K2, 200, 400, 100, 100);
        image(K3, 300, 400, 100, 100);
        image(K3, 400, 400, 100, 100);
        image(K4, 500, 400, 100, 100);
        image(K5, 600, 400, 100, 100);
        image(K1, 0, 500, 100, 100);
        image(K2, 100, 500, 100, 100);
        image(K2, 200, 500, 100, 100);
        image(K3, 300, 500, 100, 100);
        image(K3, 400, 500, 100, 100);
        image(K4, 500, 500, 100, 100);
        image(K5, 600, 500, 100, 100);
      }
      if (cropType == 19) {
        image(M1, 0, 200, 100, 100);
        image(M2, 100, 200, 100, 100);
        image(M2, 200, 200, 100, 100);
        image(M3, 300, 200, 100, 100);
        image(M3, 400, 200, 100, 100);
        image(M3, 500, 200, 100, 100);
        image(M4, 600, 200, 100, 100);
        image(M4, 0, 300, 100, 100);
        image(M4, 100, 300, 100, 100);
        image(M5, 200, 300, 100, 100);
        image(M5, 300, 300, 100, 100);
        image(M5, 400, 300, 100, 100);
        image(M6, 500, 300, 100, 100);
        image(M1, 600, 300, 100, 100);
        image(M2, 0, 400, 100, 100);
        image(M2, 100, 400, 100, 100);
        image(M3, 200, 400, 100, 100);
        image(M3, 300, 400, 100, 100);
        image(M3, 400, 400, 100, 100);
        image(M4, 500, 400, 100, 100);
        image(M4, 600, 400, 100, 100);
        image(M4, 0, 500, 100, 100);
        image(M5, 100, 500, 100, 100);
        image(M5, 200, 500, 100, 100);
        image(M5, 300, 500, 100, 100);
        image(M6, 400, 500, 100, 100);
        image(M1, 500, 500, 100, 100);
        image(M2, 600, 500, 100, 100);
      }
      if (cropType == 20) {
        image(Par1, 0, 200, 100, 100);
        image(Par2, 100, 200, 100, 100);
        image(Par3, 200, 200, 100, 100);
        image(Par4, 300, 200, 100, 100);
        image(Par5, 400, 200, 100, 100);
        image(Par1, 500, 200, 100, 100);
        image(Par2, 600, 200, 100, 100);
        image(Par3, 0, 300, 100, 100);
        image(Par4, 100, 300, 100, 100);
        image(Par5, 200, 300, 100, 100);
        image(Par1, 300, 300, 100, 100);
        image(Par2, 400, 300, 100, 100);
        image(Par3, 500, 300, 100, 100);
        image(Par4, 600, 300, 100, 100);
        image(Par5, 0, 400, 100, 100);
        image(Par1, 100, 400, 100, 100);
        image(Par2, 200, 400, 100, 100);
        image(Par3, 300, 400, 100, 100);
        image(Par4, 400, 400, 100, 100);
        image(Par5, 500, 400, 100, 100);
        image(Par1, 600, 400, 100, 100);
        image(Par2, 0, 500, 100, 100);
        image(Par3, 100, 500, 100, 100);
        image(Par4, 200, 500, 100, 100);
        image(Par5, 300, 500, 100, 100);
        image(Par1, 400, 500, 100, 100);
        image(Par2, 500, 500, 100, 100);
        image(Par3, 600, 500, 100, 100);
      }
      if (cropType == 21) {
        image(Pop1, 0, 200, 100, 100);
        image(Pop2, 100, 200, 100, 100);
        image(Pop2, 200, 200, 100, 100);
        image(Pop3, 300, 200, 100, 100);
        image(Pop3, 400, 200, 100, 100);
        image(Pop4, 500, 200, 100, 100);
        image(Pop4, 600, 200, 100, 100);
        image(Pop5, 0, 300, 100, 100);
        image(Pop1, 100, 300, 100, 100);
        image(Pop2, 200, 300, 100, 100);
        image(Pop2, 300, 300, 100, 100);
        image(Pop3, 400, 300, 100, 100);
        image(Pop3, 500, 300, 100, 100);
        image(Pop4, 600, 300, 100, 100);
        image(Pop4, 0, 400, 100, 100);
        image(Pop5, 100, 400, 100, 100);
        image(Pop1, 200, 400, 100, 100);
        image(Pop2, 300, 400, 100, 100);
        image(Pop2, 400, 400, 100, 100);
        image(Pop3, 500, 400, 100, 100);
        image(Pop3, 600, 400, 100, 100);
        image(Pop4, 0, 500, 100, 100);
        image(Pop4, 100, 500, 100, 100);
        image(Pop5, 200, 500, 100, 100);
        image(Pop1, 300, 500, 100, 100);
        image(Pop2, 400, 500, 100, 100);
        image(Pop2, 500, 500, 100, 100);
        image(Pop3, 600, 500, 100, 100);
      }
      if (cropType == 22) {
        image(Pot1, 0, 200, 100, 100);
        image(Pot2, 100, 200, 100, 100);
        image(Pot3, 200, 200, 100, 100);
        image(Pot4, 300, 200, 100, 100);
        image(Pot4, 400, 200, 100, 100);
        image(Pot5, 500, 200, 100, 100);
        image(Pot6, 600, 200, 100, 100);
        image(Pot1, 0, 300, 100, 100);
        image(Pot2, 100, 300, 100, 100);
        image(Pot3, 200, 300, 100, 100);
        image(Pot4, 300, 300, 100, 100);
        image(Pot4, 400, 300, 100, 100);
        image(Pot5, 500, 300, 100, 100);
        image(Pot6, 600, 300, 100, 100);
        image(Pot1, 0, 400, 100, 100);
        image(Pot2, 100, 400, 100, 100);
        image(Pot3, 200, 400, 100, 100);
        image(Pot4, 300, 400, 100, 100);
        image(Pot4, 400, 400, 100, 100);
        image(Pot5, 500, 400, 100, 100);
        image(Pot6, 600, 400, 100, 100);
        image(Pot1, 0, 500, 100, 100);
        image(Pot2, 100, 500, 100, 100);
        image(Pot3, 200, 500, 100, 100);
        image(Pot4, 300, 500, 100, 100);
        image(Pot4, 400, 500, 100, 100);
        image(Pot5, 500, 500, 100, 100);
        image(Pot6, 600, 500, 100, 100);
      }
      if (cropType == 23) {
        image(Pum1, 0, 200, 100, 100);
        image(Pum2, 100, 200, 100, 100);
        image(Pum2, 200, 200, 100, 100);
        image(Pum3, 300, 200, 100, 100);
        image(Pum3, 400, 200, 100, 100);
        image(Pum3, 500, 200, 100, 100);
        image(Pum4, 600, 200, 100, 100);
        image(Pum4, 0, 300, 100, 100);
        image(Pum4, 100, 300, 100, 100);
        image(Pum4, 200, 300, 100, 100);
        image(Pum5, 300, 300, 100, 100);
        image(Pum5, 400, 300, 100, 100);
        image(Pum5, 500, 300, 100, 100);
        image(Pum6, 600, 300, 100, 100);
        image(Pum1, 0, 400, 100, 100);
        image(Pum2, 100, 400, 100, 100);
        image(Pum2, 200, 400, 100, 100);
        image(Pum3, 300, 400, 100, 100);
        image(Pum3, 400, 400, 100, 100);
        image(Pum3, 500, 400, 100, 100);
        image(Pum4, 600, 400, 100, 100);
        image(Pum4, 0, 500, 100, 100);
        image(Pum4, 100, 500, 100, 100);
        image(Pum4, 200, 500, 100, 100);
        image(Pum5, 300, 500, 100, 100);
        image(Pum5, 400, 500, 100, 100);
        image(Pum5, 500, 500, 100, 100);
        image(Pum6, 600, 500, 100, 100);
      }
      if (cropType == 24) {
        image(Ra1, 0, 200, 100, 100);
        image(Ra1, 100, 200, 100, 100);
        image(Ra2, 200, 200, 100, 100);
        image(Ra3, 300, 200, 100, 100);
        image(Ra3, 400, 200, 100, 100);
        image(Ra4, 500, 200, 100, 100);
        image(Ra5, 600, 200, 100, 100);
        image(Ra1, 0, 300, 100, 100);
        image(Ra1, 100, 300, 100, 100);
        image(Ra2, 200, 300, 100, 100);
        image(Ra3, 300, 300, 100, 100);
        image(Ra3, 400, 300, 100, 100);
        image(Ra4, 500, 300, 100, 100);
        image(Ra5, 600, 300, 100, 100);
        image(Ra1, 0, 400, 100, 100);
        image(Ra1, 100, 400, 100, 100);
        image(Ra2, 200, 400, 100, 100);
        image(Ra3, 300, 400, 100, 100);
        image(Ra3, 400, 400, 100, 100);
        image(Ra4, 500, 400, 100, 100);
        image(Ra5, 600, 400, 100, 100);
        image(Ra1, 0, 500, 100, 100);
        image(Ra1, 100, 500, 100, 100);
        image(Ra2, 200, 500, 100, 100);
        image(Ra3, 300, 500, 100, 100);
        image(Ra3, 400, 500, 100, 100);
        image(Ra4, 500, 500, 100, 100);
        image(Ra5, 600, 500, 100, 100);
      }
      if (cropType == 25) {
        image(RC1, 0, 200, 100, 100);
        image(RC1, 100, 200, 100, 100);
        image(RC2, 200, 200, 100, 100);
        image(RC3, 300, 200, 100, 100);
        image(RC3, 400, 200, 100, 100);
        image(RC4, 500, 200, 100, 100);
        image(RC4, 600, 200, 100, 100);
        image(RC5, 0, 300, 100, 100);
        image(RC5, 100, 300, 100, 100);
        image(RC6, 200, 300, 100, 100);
        image(RC1, 300, 300, 100, 100);
        image(RC1, 400, 300, 100, 100);
        image(RC2, 500, 300, 100, 100);
        image(RC3, 600, 300, 100, 100);
        image(RC3, 0, 400, 100, 100);
        image(RC4, 100, 400, 100, 100);
        image(RC4, 200, 400, 100, 100);
        image(RC5, 300, 400, 100, 100);
        image(RC5, 400, 400, 100, 100);
        image(RC6, 500, 400, 100, 100);
        image(RC1, 600, 400, 100, 100);
        image(RC1, 0, 500, 100, 100);
        image(RC2, 100, 500, 100, 100);
        image(RC3, 200, 500, 100, 100);
        image(RC3, 300, 500, 100, 100);
        image(RC4, 400, 500, 100, 100);
        image(RC4, 500, 500, 100, 100);
        image(RC5, 600, 500, 100, 100);
      }
      if (cropType == 26) {
        image(Rh1, 0, 200, 100, 100);
        image(Rh1, 100, 200, 100, 100);
        image(Rh2, 200, 200, 100, 100);
        image(Rh2, 300, 200, 100, 100);
        image(Rh3, 400, 200, 100, 100);
        image(Rh3, 500, 200, 100, 100);
        image(Rh4, 600, 200, 100, 100);
        image(Rh4, 0, 300, 100, 100);
        image(Rh4, 100, 300, 100, 100);
        image(Rh5, 200, 300, 100, 100);
        image(Rh5, 300, 300, 100, 100);
        image(Rh5, 400, 300, 100, 100);
        image(Rh5, 500, 300, 100, 100);
        image(Rh6, 600, 300, 100, 100);
        image(Rh1, 0, 400, 100, 100);
        image(Rh1, 100, 400, 100, 100);
        image(Rh2, 200, 400, 100, 100);
        image(Rh2, 300, 400, 100, 100);
        image(Rh3, 400, 400, 100, 100);
        image(Rh3, 500, 400, 100, 100);
        image(Rh4, 600, 400, 100, 100);
        image(Rh4, 0, 500, 100, 100);
        image(Rh4, 100, 500, 100, 100);
        image(Rh5, 200, 500, 100, 100);
        image(Rh5, 300, 500, 100, 100);
        image(Rh5, 400, 500, 100, 100);
        image(Rh5, 500, 500, 100, 100);
        image(Rh6, 600, 500, 100, 100);
      }
      if (cropType == 27) {
        image(Sta1, 0, 200, 100, 100);
        image(Sta1, 100, 200, 100, 100);
        image(Sta2, 200, 200, 100, 100);
        image(Sta2, 300, 200, 100, 100);
        image(Sta2, 400, 200, 100, 100);
        image(Sta3, 500, 200, 100, 100);
        image(Sta3, 600, 200, 100, 100);
        image(Sta4, 0, 300, 100, 100);
        image(Sta4, 100, 300, 100, 100);
        image(Sta4, 200, 300, 100, 100);
        image(Sta5, 300, 300, 100, 100);
        image(Sta5, 400, 300, 100, 100);
        image(Sta5, 500, 300, 100, 100);
        image(Sta6, 600, 300, 100, 100);
        image(Sta1, 0, 400, 100, 100);
        image(Sta1, 100, 400, 100, 100);
        image(Sta2, 200, 400, 100, 100);
        image(Sta2, 300, 400, 100, 100);
        image(Sta2, 400, 400, 100, 100);
        image(Sta3, 500, 400, 100, 100);
        image(Sta3, 600, 400, 100, 100);
        image(Sta4, 0, 500, 100, 100);
        image(Sta4, 100, 500, 100, 100);
        image(Sta4, 200, 500, 100, 100);
        image(Sta5, 300, 500, 100, 100);
        image(Sta5, 400, 500, 100, 100);
        image(Sta5, 500, 500, 100, 100);
        image(Sta6, 600, 500, 100, 100);
      }
      if (cropType == 28) {
        image(Str1, 0, 200, 100, 100);
        image(Str2, 100, 200, 100, 100);
        image(Str3, 200, 200, 100, 100);
        image(Str3, 300, 200, 100, 100);
        image(Str4, 400, 200, 100, 100);
        image(Str4, 500, 200, 100, 100);
        image(Str5, 600, 200, 100, 100);
        image(Str5, 0, 300, 100, 100);
        image(Str6, 100, 300, 100, 100);
        image(Str7, 200, 300, 100, 100);
        image(Str7, 300, 300, 100, 100);
        image(Str7, 400, 300, 100, 100);
        image(Str6, 500, 300, 100, 100);
        image(Str7, 600, 300, 100, 100);
        image(Str7, 0, 400, 100, 100);
        image(Str7, 100, 400, 100, 100);
        image(Str6, 200, 400, 100, 100);
        image(Str7, 300, 400, 100, 100);
        image(Str7, 400, 400, 100, 100);
        image(Str7, 500, 400, 100, 100);
        image(Str6, 600, 400, 100, 100);
        image(Str7, 0, 500, 100, 100);
        image(Str7, 100, 500, 100, 100);
        image(Str7, 200, 500, 100, 100);
        image(Str6, 300, 500, 100, 100);
        image(Str7, 400, 500, 100, 100);
        image(Str7, 500, 500, 100, 100);
        image(Str7, 600, 500, 100, 100);
      }
      if (cropType == 29) {
        image(SS1, 0, 200, 100, 100);
        image(SS2, 100, 200, 100, 100);
        image(SS2, 200, 200, 100, 100);
        image(SS3, 300, 200, 100, 100);
        image(SS3, 400, 200, 100, 100);
        image(SS3, 500, 200, 100, 100);
        image(SS4, 600, 200, 100, 100);
        image(SS4, 0, 300, 100, 100);
        image(SS5, 100, 300, 100, 100);
        image(SS1, 200, 300, 100, 100);
        image(SS2, 300, 300, 100, 100);
        image(SS2, 400, 300, 100, 100);
        image(SS3, 500, 300, 100, 100);
        image(SS3, 600, 300, 100, 100);
        image(SS3, 0, 400, 100, 100);
        image(SS4, 100, 400, 100, 100);
        image(SS4, 200, 400, 100, 100);
        image(SS5, 300, 400, 100, 100);
        image(SS1, 400, 400, 100, 100);
        image(SS2, 500, 400, 100, 100);
        image(SS2, 600, 400, 100, 100);
        image(SS3, 0, 500, 100, 100);
        image(SS3, 100, 500, 100, 100);
        image(SS3, 200, 500, 100, 100);
        image(SS4, 300, 500, 100, 100);
        image(SS4, 400, 500, 100, 100);
        image(SS5, 500, 500, 100, 100);
        image(SS1, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su1, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su2, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su3, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su4, 0, 300, 100, 100);
        image(Su5, 100, 300, 100, 100);
        image(Su1, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su2, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su3, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su4, 200, 400, 100, 100);
        image(Su5, 300, 400, 100, 100);
        image(Su1, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su2, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su3, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su4, 400, 500, 100, 100);
        image(Su5, 500, 500, 100, 100);
        image(Su1, 600, 500, 100, 100);
      }
      if (cropType == 31) {
        image(To1, 0, 200, 100, 100);
        image(To1, 100, 200, 100, 100);
        image(To2, 200, 200, 100, 100);
        image(To2, 300, 200, 100, 100);
        image(To3, 400, 200, 100, 100);
        image(To3, 500, 200, 100, 100);
        image(To4, 600, 200, 100, 100);
        image(To4, 0, 300, 100, 100);
        image(To5, 100, 300, 100, 100);
        image(To5, 200, 300, 100, 100);
        image(To5, 300, 300, 100, 100);
        image(To6, 400, 300, 100, 100);
        image(To7, 500, 300, 100, 100);
        image(To7, 600, 300, 100, 100);
        image(To7, 0, 400, 100, 100);
        image(To6, 100, 400, 100, 100);
        image(To7, 200, 400, 100, 100);
        image(To7, 300, 400, 100, 100);
        image(To7, 400, 400, 100, 100);
        image(To6, 500, 400, 100, 100);
        image(To7, 600, 400, 100, 100);
        image(To7, 0, 500, 100, 100);
        image(To7, 100, 500, 100, 100);
        image(To6, 200, 500, 100, 100);
        image(To7, 300, 500, 100, 100);
        image(To7, 400, 500, 100, 100);
        image(To7, 500, 500, 100, 100);
        image(To6, 600, 500, 100, 100);
      }
      if (cropType == 32) {
        image(Tu1, 0, 200, 100, 100);
        image(Tu2, 100, 200, 100, 100);
        image(Tu3, 200, 200, 100, 100);
        image(Tu3, 300, 200, 100, 100);
        image(Tu4, 400, 200, 100, 100);
        image(Tu4, 500, 200, 100, 100);
        image(Tu5, 600, 200, 100, 100);
        image(Tu1, 0, 300, 100, 100);
        image(Tu2, 100, 300, 100, 100);
        image(Tu3, 200, 300, 100, 100);
        image(Tu3, 300, 300, 100, 100);
        image(Tu4, 400, 300, 100, 100);
        image(Tu4, 500, 300, 100, 100);
        image(Tu5, 600, 300, 100, 100);
        image(Tu1, 0, 400, 100, 100);
        image(Tu2, 100, 400, 100, 100);
        image(Tu3, 200, 400, 100, 100);
        image(Tu3, 300, 400, 100, 100);
        image(Tu4, 400, 400, 100, 100);
        image(Tu4, 500, 400, 100, 100);
        image(Tu5, 600, 400, 100, 100);
        image(Tu1, 0, 500, 100, 100);
        image(Tu2, 100, 500, 100, 100);
        image(Tu3, 200, 500, 100, 100);
        image(Tu3, 300, 500, 100, 100);
        image(Tu4, 400, 500, 100, 100);
        image(Tu4, 500, 500, 100, 100);
        image(Tu5, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR2, 200, 200, 100, 100);
        image(UmR3, 300, 200, 100, 100);
        image(UmR3, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR4, 600, 200, 100, 100);
        image(UmR4, 0, 300, 100, 100);
        image(UmR5, 100, 300, 100, 100);
        image(UmR1, 200, 300, 100, 100);
        image(UmR2, 300, 300, 100, 100);
        image(UmR2, 400, 300, 100, 100);
        image(UmR3, 500, 300, 100, 100);
        image(UmR3, 600, 300, 100, 100);
        image(UmR4, 0, 400, 100, 100);
        image(UmR4, 100, 400, 100, 100);
        image(UmR4, 200, 400, 100, 100);
        image(UmR5, 300, 400, 100, 100);
        image(UmR1, 400, 400, 100, 100);
        image(UmR2, 500, 400, 100, 100);
        image(UmR2, 600, 400, 100, 100);
        image(UmR3, 0, 500, 100, 100);
        image(UmR3, 100, 500, 100, 100);
        image(UmR4, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR5, 500, 500, 100, 100);
        image(UmR1, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W1, 0, 200, 100, 100);
        image(W2, 100, 200, 100, 100);
        image(W3, 200, 200, 100, 100);
        image(W4, 300, 200, 100, 100);
        image(W5, 400, 200, 100, 100);
        image(W1, 500, 200, 100, 100);
        image(W2, 600, 200, 100, 100);
        image(W3, 0, 300, 100, 100);
        image(W4, 100, 300, 100, 100);
        image(W5, 200, 300, 100, 100);
        image(W1, 300, 300, 100, 100);
        image(W2, 400, 300, 100, 100);
        image(W3, 500, 300, 100, 100);
        image(W4, 600, 300, 100, 100);
        image(W5, 0, 400, 100, 100);
        image(W1, 100, 400, 100, 100);
        image(W2, 200, 400, 100, 100);
        image(W3, 300, 400, 100, 100);
        image(W4, 400, 400, 100, 100);
        image(W5, 500, 400, 100, 100);
        image(W1, 600, 400, 100, 100);
        image(W2, 0, 500, 100, 100);
        image(W3, 100, 500, 100, 100);
        image(W4, 200, 500, 100, 100);
        image(W5, 300, 500, 100, 100);
        image(W1, 400, 500, 100, 100);
        image(W2, 500, 500, 100, 100);
        image(W3, 600, 500, 100, 100);
      }
      if (cropType == 35) {
        image(Y1, 0, 200, 100, 100);
        image(Y2, 100, 200, 100, 100);
        image(Y2, 200, 200, 100, 100);
        image(Y2, 300, 200, 100, 100);
        image(Y3, 400, 200, 100, 100);
        image(Y3, 500, 200, 100, 100);
        image(Y3, 600, 200, 100, 100);
        image(Y4, 0, 300, 100, 100);
        image(Y4, 100, 300, 100, 100);
        image(Y4, 200, 300, 100, 100);
        image(Y5, 300, 300, 100, 100);
        image(Y1, 400, 300, 100, 100);
        image(Y2, 500, 300, 100, 100);
        image(Y2, 600, 300, 100, 100);
        image(Y2, 0, 400, 100, 100);
        image(Y3, 100, 400, 100, 100);
        image(Y3, 200, 400, 100, 100);
        image(Y3, 300, 400, 100, 100);
        image(Y4, 400, 400, 100, 100);
        image(Y4, 500, 400, 100, 100);
        image(Y4, 600, 400, 100, 100);
        image(Y5, 0, 500, 100, 100);
        image(Y1, 100, 500, 100, 100);
        image(Y2, 200, 500, 100, 100);
        image(Y2, 300, 500, 100, 100);
        image(Y2, 400, 500, 100, 100);
        image(Y3, 500, 500, 100, 100);
        image(Y3, 600, 500, 100, 100);
      }
    }
    if (cropCalendarNSGtype2) {
      if (cropType == 8) {
        image(CB6, 0, 200, 100, 100);
        image(CB7, 100, 200, 100, 100);
        image(CB6, 200, 200, 100, 100);
        image(CB7, 300, 200, 100, 100);
        image(CB6, 400, 200, 100, 100);
        image(CB7, 500, 200, 100, 100);
        image(CB6, 600, 200, 100, 100);
        image(CB7, 0, 300, 100, 100);
        image(CB6, 100, 300, 100, 100);
        image(CB7, 200, 300, 100, 100);
        image(CB6, 300, 300, 100, 100);
        image(CB7, 400, 300, 100, 100);
        image(CB6, 500, 300, 100, 100);
        image(CB7, 600, 300, 100, 100);
        image(CB6, 0, 400, 100, 100);
        image(CB7, 100, 400, 100, 100);
        image(CB6, 200, 400, 100, 100);
        image(CB7, 300, 400, 100, 100);
        image(CB6, 400, 400, 100, 100);
        image(CB7, 500, 400, 100, 100);
        image(CB6, 600, 400, 100, 100);
        image(CB7, 0, 500, 100, 100);
        image(CB6, 100, 500, 100, 100);
        image(CB7, 200, 500, 100, 100);
        image(CB6, 300, 500, 100, 100);
        image(CB7, 400, 500, 100, 100);
        image(CB6, 500, 500, 100, 100);
        image(CB7, 600, 500, 100, 100);
      }
      if (cropType == 9) {
        image(Co7, 0, 200, 100, 100);
        image(Co7, 100, 200, 100, 100);
        image(Co6, 200, 200, 100, 100);
        image(Co7, 300, 200, 100, 100);
        image(Co7, 400, 200, 100, 100);
        image(Co7, 500, 200, 100, 100);
        image(Co6, 600, 200, 100, 100);
        image(Co7, 0, 300, 100, 100);
        image(Co7, 100, 300, 100, 100);
        image(Co7, 200, 300, 100, 100);
        image(Co6, 300, 300, 100, 100);
        image(Co7, 400, 300, 100, 100);
        image(Co7, 500, 300, 100, 100);
        image(Co7, 600, 300, 100, 100);
        image(Co6, 0, 400, 100, 100);
        image(Co7, 100, 400, 100, 100);
        image(Co7, 200, 400, 100, 100);
        image(Co7, 300, 400, 100, 100);
        image(Co6, 400, 400, 100, 100);
        image(Co7, 500, 400, 100, 100);
        image(Co7, 600, 400, 100, 100);
        image(Co7, 0, 500, 100, 100);
        image(Co6, 100, 500, 100, 100);
        image(Co7, 200, 500, 100, 100);
        image(Co7, 300, 500, 100, 100);
        image(Co7, 400, 500, 100, 100);
        image(Co6, 500, 500, 100, 100);
        image(Co7, 600, 500, 100, 100);
      }
      if (cropType == 30) {
        image(Su2, 0, 200, 100, 100);
        image(Su2, 100, 200, 100, 100);
        image(Su3, 200, 200, 100, 100);
        image(Su3, 300, 200, 100, 100);
        image(Su3, 400, 200, 100, 100);
        image(Su4, 500, 200, 100, 100);
        image(Su4, 600, 200, 100, 100);
        image(Su5, 0, 300, 100, 100);
        image(Su1, 100, 300, 100, 100);
        image(Su2, 200, 300, 100, 100);
        image(Su2, 300, 300, 100, 100);
        image(Su3, 400, 300, 100, 100);
        image(Su3, 500, 300, 100, 100);
        image(Su3, 600, 300, 100, 100);
        image(Su4, 0, 400, 100, 100);
        image(Su4, 100, 400, 100, 100);
        image(Su5, 200, 400, 100, 100);
        image(Su1, 300, 400, 100, 100);
        image(Su2, 400, 400, 100, 100);
        image(Su2, 500, 400, 100, 100);
        image(Su3, 600, 400, 100, 100);
        image(Su3, 0, 500, 100, 100);
        image(Su3, 100, 500, 100, 100);
        image(Su4, 200, 500, 100, 100);
        image(Su4, 300, 500, 100, 100);
        image(Su5, 400, 500, 100, 100);
        image(Su1, 500, 500, 100, 100);
        image(Su2, 600, 500, 100, 100);
      }
      if (cropType == 33) {
        image(UmR1, 0, 200, 100, 100);
        image(UmR2, 100, 200, 100, 100);
        image(UmR3, 200, 200, 100, 100);
        image(UmR4, 300, 200, 100, 100);
        image(UmR4, 400, 200, 100, 100);
        image(UmR4, 500, 200, 100, 100);
        image(UmR5, 600, 200, 100, 100);
        image(UmR1, 0, 300, 100, 100);
        image(UmR2, 100, 300, 100, 100);
        image(UmR3, 200, 300, 100, 100);
        image(UmR4, 300, 300, 100, 100);
        image(UmR4, 400, 300, 100, 100);
        image(UmR4, 500, 300, 100, 100);
        image(UmR5, 600, 300, 100, 100);
        image(UmR1, 0, 400, 100, 100);
        image(UmR2, 100, 400, 100, 100);
        image(UmR3, 200, 400, 100, 100);
        image(UmR4, 300, 400, 100, 100);
        image(UmR4, 400, 400, 100, 100);
        image(UmR4, 500, 400, 100, 100);
        image(UmR5, 600, 400, 100, 100);
        image(UmR1, 0, 500, 100, 100);
        image(UmR2, 100, 500, 100, 100);
        image(UmR3, 200, 500, 100, 100);
        image(UmR4, 300, 500, 100, 100);
        image(UmR4, 400, 500, 100, 100);
        image(UmR4, 500, 500, 100, 100);
        image(UmR5, 600, 500, 100, 100);
      }
      if (cropType == 34) {
        image(W4, 0, 200, 100, 100);
        image(W5, 100, 200, 100, 100);
        image(W1, 200, 200, 100, 100);
        image(W2, 300, 200, 100, 100);
        image(W3, 400, 200, 100, 100);
        image(W4, 500, 200, 100, 100);
        image(W5, 600, 200, 100, 100);
        image(W1, 0, 300, 100, 100);
        image(W2, 100, 300, 100, 100);
        image(W3, 200, 300, 100, 100);
        image(W4, 300, 300, 100, 100);
        image(W5, 400, 300, 100, 100);
        image(W1, 500, 300, 100, 100);
        image(W2, 600, 300, 100, 100);
        image(W3, 0, 400, 100, 100);
        image(W4, 100, 400, 100, 100);
        image(W5, 200, 400, 100, 100);
        image(W1, 300, 400, 100, 100);
        image(W1, 400, 400, 100, 100);
        image(W2, 500, 400, 100, 100);
        image(W3, 600, 400, 100, 100);
        image(W4, 0, 500, 100, 100);
        image(W5, 100, 500, 100, 100);
        image(W1, 200, 500, 100, 100);
        image(W2, 300, 500, 100, 100);
        image(W3, 400, 500, 100, 100);
        image(W4, 500, 500, 100, 100);
        image(W5, 600, 500, 100, 100);
      }
    }
    if (cropType == 8 || cropType == 9 || cropType == 30 || cropType == 33 || cropType == 34) {
      if (keyPressed) {
        if (key == CODED) {
          if (keyCode == SHIFT) {
            cropCalendarNSGtype2 = true;
            cropCalendarNSGtype1 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
          if (keyCode == CONTROL) {
            cropCalendarNSGtype1 = true;
            cropCalendarNSGtype2 = false;
            fill(0);
            rect(0, 0, 700, 600);
          }
        }
      }
    }
    if (keyPressed) {
      if (key == 'V' || key == 'v') {
        cropSelect = true;
        cropCalendarNSG = false;
        fill(0);
        rect(0, 0, 700, 600);
      }
      if (key == 'C' || key == 'c') {
        cropCalendarNSG = false;
        fill(0);
        rect(0, 0, 700, 600);
        cropCalculator = true;
        }
        if (key == '2') {
          cropCalendarNSG = false;
          fill(0);
          rect(0, 0, 700, 600);
          cropCalendarNSG = true;
      }
    }
  }
}*/
public void Controlmode() {
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
public void Crop_icon_loading()   {
  //1
  Am1 = loadImage("Amaranth_Stage_1.png");
  Am2 = loadImage("Amaranth_Stage_2.png");
  Am3 = loadImage("Amaranth_Stage_3.png");
  Am4 = loadImage("Amaranth_Stage_4.png");
  Am5 = loadImage("Amaranth_Stage_5.png");
  //2
  Ar1 = loadImage("Artichoke_Stage_1.png");
  Ar2 = loadImage("Artichoke_Stage_2.png");
  Ar3 = loadImage("Artichoke_Stage_3.png");
  Ar4 = loadImage("Artichoke_Stage_4.png");
  Ar5 = loadImage("Artichoke_Stage_5.png");
  Ar6 = loadImage("Artichoke_Stage_6.png");
  //3
  Be1 = loadImage("Beet_Stage_1.png");
  Be2 = loadImage("Beet_Stage_2.png");
  Be3 = loadImage("Beet_Stage_3.png");
  Be4 = loadImage("Beet_Stage_4.png");
  Be5 = loadImage("Beet_Stage_5.png");
  //4
  Bl1 = loadImage("Blueberry_Stage_1.png");
  Bl2 = loadImage("Blueberry_Stage_2.png");
  Bl3 = loadImage("Blueberry_Stage_3.png");
  Bl4 = loadImage("Blueberry_Stage_4.png");
  Bl5 = loadImage("Blueberry_Stage_5.png");
  Bl6 = loadImage("Blueberry_Stage_6.png");
  Bl7 = loadImage("Blueberry_Stage_7.png");
  //5
  BJ1 = loadImage("Blue_Jazz_Stage_1.png");
  BJ2 = loadImage("Blue_Jazz_Stage_2.png");
  BJ3 = loadImage("Blue_Jazz_Stage_3.png");
  BJ4 = loadImage("Blue_Jazz_Stage_4.png");
  BJ5 = loadImage("Blue_Jazz_Stage_5.png");
  //6
  BC1 = loadImage("Bok_Choy_Stage_1.png");
  BC2 = loadImage("Bok_Choy_Stage_2.png");
  BC3 = loadImage("Bok_Choy_Stage_3.png");
  BC4 = loadImage("Bok_Choy_Stage_4.png");
  BC5 = loadImage("Bok_Choy_Stage_5.png");
  //7
  Ca1 = loadImage("Cauliflower_Stage_1.png");
  Ca2 = loadImage("Cauliflower_Stage_2.png");
  Ca3 = loadImage("Cauliflower_Stage_3.png");
  Ca4 = loadImage("Cauliflower_Stage_4.png");
  Ca5 = loadImage("Cauliflower_Stage_5.png");
  Ca6 = loadImage("Cauliflower_Stage_6.png");
  //8
  CB1 = loadImage("Coffee_Stage_1.png");
  CB2 = loadImage("Coffee_Stage_2.png");
  CB3 = loadImage("Coffee_Stage_3.png");
  CB4 = loadImage("Coffee_Stage_4.png");
  CB5 = loadImage("Coffee_Stage_5.png"); 
  CB6 = loadImage("Coffee_Stage_6.png");
  CB7 = loadImage("Coffee_Stage_7.png");
  //9
  Co1 = loadImage("Corn_Stage_1.png");
  Co2 = loadImage("Corn_Stage_2.png");
  Co3 = loadImage("Corn_Stage_3.png");
  Co4 = loadImage("Corn_Stage_4.png");
  Co5 = loadImage("Corn_Stage_5.png");
  Co6 = loadImage("Corn_Stage_6.png");
  Co7 = loadImage("Corn_Stage_7.png");
  //10
  Cr1 = loadImage("Cranberry_Stage_1.png");
  Cr2 = loadImage("Cranberry_Stage_2.png");
  Cr3 = loadImage("Cranberry_Stage_3.png");
  Cr4 = loadImage("Cranberry_Stage_4.png");
  Cr5 = loadImage("Cranberry_Stage_5.png");
  Cr6 = loadImage("Cranberry_Stage_6.png");
  Cr7 = loadImage("Cranberry_Stage_7.png");
  //11
  E1 = loadImage("Eggplant_Stage_1.png");
  E2 = loadImage("Eggplant_Stage_2.png");
  E3 = loadImage("Eggplant_Stage_3.png");
  E4 = loadImage("Eggplant_Stage_4.png");
  E5 = loadImage("Eggplant_Stage_5.png");
  E6 = loadImage("Eggplant_Stage_6.png");
  E7 = loadImage("Eggplant_Stage_7.png");
  //12
  FR1 = loadImage("Fairy_Rose_Stage_1.png");
  FR2 = loadImage("Fairy_Rose_Stage_2.png");
  FR3 = loadImage("Fairy_Rose_Stage_3.png");
  FR4 = loadImage("Fairy_Rose_Stage_4.png");
  FR5 = loadImage("Fairy_Rose_Stage_5.png");
  //13
  Ga1 = loadImage("Garlic_Stage_1.png");
  Ga2 = loadImage("Garlic_Stage_2.png");
  Ga3 = loadImage("Garlic_Stage_3.png");
  Ga4 = loadImage("Garlic_Stage_4.png");
  Ga5 = loadImage("Garlic_Stage_5.png");
  //14
  GB1 = loadImage("Green_Bean_Stage_1.png");
  GB2 = loadImage("Green_Bean_Stage_2.png");
  GB3 = loadImage("Green_Bean_Stage_3.png");
  GB4 = loadImage("Green_Bean_Stage_4.png");
  GB5 = loadImage("Green_Bean_Stage_5.png");
  GB6 = loadImage("Green_Bean_Stage_6.png");
  GB7 = loadImage("Green_Bean_Stage_7.png");
  //15
  Gr1 = loadImage("Grape_Stage_1.png");
  Gr2 = loadImage("Grape_Stage_2.png");
  Gr3 = loadImage("Grape_Stage_3.png");
  Gr4 = loadImage("Grape_Stage_4.png");
  Gr5 = loadImage("Grape_Stage_5.png");
  Gr6 = loadImage("Grape_Stage_6.png");
  Gr7 = loadImage("Grape_Stage_7.png");
  //16
  H1 = loadImage("Hops_Stage_1.png");
  H2 = loadImage("Hops_Stage_2.png");
  H3 = loadImage("Hops_Stage_3.png");
  H4 = loadImage("Hops_Stage_4.png");
  H5 = loadImage("Hops_Stage_5.png");
  H6 = loadImage("Hops_Stage_6.png");
  //17
  HP1 = loadImage("Hot_Pepper_Stage_1.png");
  HP2 = loadImage("Hot_Pepper_Stage_2.png");
  HP3 = loadImage("Hot_Pepper_Stage_3.png");
  HP4 = loadImage("Hot_Pepper_Stage_4.png");
  HP5 = loadImage("Hot_Pepper_Stage_4b.png");
  HP6 = loadImage("Hot_Pepper_Stage_5.png");
  HP7 = loadImage("Hot_Pepper_Stage_6.png");
  //18
  K1 = loadImage("Kale_Stage_1.png");
  K2 = loadImage("Kale_Stage_2.png");
  K3 = loadImage("Kale_Stage_3.png");
  K4 = loadImage("Kale_Stage_4.png");
  K5 = loadImage("Kale_Stage_5.png");
  //19
  M1 = loadImage("Melon_Stage_1.png");
  M2 = loadImage("Melon_Stage_2.png");
  M3 = loadImage("Melon_Stage_3.png");
  M4 = loadImage("Melon_Stage_4.png");
  M5 = loadImage("Melon_Stage_5.png");
  M6 = loadImage("Melon_Stage_6.png");
  //20
  Par1 = loadImage("Parsnip_Stage_1.png");
  Par2 = loadImage("Parsnip_Stage_2.png");
  Par3 = loadImage("Parsnip_Stage_3.png");
  Par4 = loadImage("Parsnip_Stage_4.png");
  Par5 = loadImage("Parsnip_Stage_5.png");
  //21
  Pop1 = loadImage("Poppy_Stage_1.png");
  Pop2 = loadImage("Poppy_Stage_2.png");
  Pop3 = loadImage("Poppy_Stage_3.png");
  Pop4 = loadImage("Poppy_Stage_4.png");
  Pop5 = loadImage("Poppy_Stage_5.png");
  //22
  Pot1 = loadImage("Potato_Stage_1.png");
  Pot2 = loadImage("Potato_Stage_2.png");
  Pot3 = loadImage("Potato_Stage_3.png");
  Pot4 = loadImage("Potato_Stage_4.png");
  Pot5 = loadImage("Potato_Stage_5.png");
  Pot6 = loadImage("Potato_Stage_6.png");
  //23
  Pum1 = loadImage("Pumpkin_Stage_1.png");
  Pum2 = loadImage("Pumpkin_Stage_2.png");
  Pum3 = loadImage("Pumpkin_Stage_3.png");
  Pum4 = loadImage("Pumpkin_Stage_4.png");
  Pum5 = loadImage("Pumpkin_Stage_5.png");
  Pum6 = loadImage("Pumpkin_Stage_6.png");
  //24
  Ra1 = loadImage("Radish_Stage_1.png");
  Ra2 = loadImage("Radish_Stage_2.png");
  Ra3 = loadImage("Radish_Stage_3.png");
  Ra4 = loadImage("Radish_Stage_4.png");
  Ra5 = loadImage("Radish_Stage_5.png");
  //25
  RC1 = loadImage("Red_Cabbage_Stage_1.png");
  RC2 = loadImage("Red_Cabbage_Stage_2.png");
  RC3 = loadImage("Red_Cabbage_Stage_3.png");
  RC4 = loadImage("Red_Cabbage_Stage_4.png");
  RC5 = loadImage("Red_Cabbage_Stage_5.png");
  RC6 = loadImage("Red_Cabbage_Stage_6.png");
  //26
  Rh1 = loadImage("Rhubarb_Stage_1.png");
  Rh2 = loadImage("Rhubarb_Stage_2.png");
  Rh3 = loadImage("Rhubarb_Stage_3.png");
  Rh4 = loadImage("Rhubarb_Stage_4.png");
  Rh5 = loadImage("Rhubarb_Stage_5.png");
  Rh6 = loadImage("Rhubarb_Stage_6.png");
  //27
  Sta1 = loadImage("Starfruit_Stage_1.png");
  Sta2 = loadImage("Starfruit_Stage_2.png");
  Sta3 = loadImage("Starfruit_Stage_3.png");
  Sta4 = loadImage("Starfruit_Stage_4.png");
  Sta5 = loadImage("Starfruit_Stage_5.png");
  Sta6 = loadImage("Starfruit_Stage_6.png");
  //28
  Str1 = loadImage("Strawberry_Stage_1.png");
  Str2 = loadImage("Strawberry_Stage_2.png");
  Str3 = loadImage("Strawberry_Stage_3.png");
  Str4 = loadImage("Strawberry_Stage_4.png");
  Str5 = loadImage("Strawberry_Stage_5.png");
  Str6 = loadImage("Strawberry_Stage_6.png");
  Str7 = loadImage("Strawberry_Stage_7.png");
  //29
  SS1 = loadImage("Summer_Spangle_Stage_1.png");
  SS2 = loadImage("Summer_Spangle_Stage_2.png");
  SS3 = loadImage("Summer_Spangle_Stage_3.png");
  SS4 = loadImage("Summer_Spangle_Stage_4.png");
  SS5 = loadImage("Summer_Spangle_Stage_5.png");
  //30
  Su1 = loadImage("Sunflower_Stage_1.png");
  Su2 = loadImage("Sunflower_Stage_2.png");
  Su3 = loadImage("Sunflower_Stage_3.png");
  Su4 = loadImage("Sunflower_Stage_4.png");
  Su5 = loadImage("Sunflower_Stage_5.png");
  //31
  To1 = loadImage("Tomato_Stage_1.png");
  To2 = loadImage("Tomato_Stage_2.png");
  To3 = loadImage("Tomato_Stage_3.png");
  To4 = loadImage("Tomato_Stage_4.png");
  To5 = loadImage("Tomato_Stage_5.png");
  To6 = loadImage("Tomato_Stage_6.png");
  To7 = loadImage("Tomato_Stage_7.png");
  //32
  Tu1 = loadImage("Tulip_Stage_1.png");
  Tu2 = loadImage("Tulip_Stage_2.png");
  Tu3 = loadImage("Tulip_Stage_3.png");
  Tu4 = loadImage("Tulip_Stage_4.png");
  Tu5 = loadImage("Tulip_Stage_5.png");
  //33
  UmR1 = loadImage("Unmilled_Rice_Stage_1.png");
  UmR2 = loadImage("Unmilled_Rice_Stage_2.png");
  UmR3 = loadImage("Unmilled_Rice_Stage_3.png");
  UmR4 = loadImage("Unmilled_Rice_Stage_4.png");
  UmR5 = loadImage("Unmilled_Rice_Stage_5.png");
  //34
  W1 = loadImage("Wheat_Stage_1.png");
  W2 = loadImage("Wheat_Stage_2.png");
  W3 = loadImage("Wheat_Stage_3.png");
  W4 = loadImage("Wheat_Stage_4.png");
  W5 = loadImage("Wheat_Stage_5.png");
  //35
  Y1 = loadImage("Yam_Stage_1.png");
  Y2 = loadImage("Yam_Stage_2.png");
  Y3 = loadImage("Yam_Stage_3.png");
  Y4 = loadImage("Yam_Stage_4.png");
  Y5 = loadImage("Yam_Stage_5.png");
}
public void Menumode()  {
  if(startMenu == true)  {
  //strings
  String titl1 = "Stardew Valley Crop Calendar/Calculator";
  String titl2 = "Created By Pigsmake, Avalible For Everyone";
  String desc1 = "Select the amount of crops of the same type that you are going to use";
  String desc2 = "Choose the crop from the list, then use the calendar to see when you will harvest";
  String desc3 = "Switch to the calculator to see what the profit will be from the crop, for the season";
  String cntl1 = "Press 'c' to bring up the controls for the page";
  String data1 = "BETA, Planned to add fertilizers and quality calculators based on luck. Don't suggest these please.";
  String fnal1 = "Press any key to start, reboot the program to get the menu back";
  String fnal2 = "You may have to click";
  textSize(35);
  text(titl1, 0, 50);
  textSize(25);
  text(titl2, 65, 80);
  text("Description", 265, 120);
  text("Controls", 275, 250);
  textSize(15);
  text(desc1, 0, 150);
  text(desc2, 0, 180);
  text(desc3, 0, 210);
  text(cntl1, 0, 280);
  text(data1, 0, 350);
  textSize(20);
  text(fnal1, 0, 400);
  text(fnal2, 0, 450);
  if(mousePressed)  {
    startMenu = false;
   cropAmountspring = true;
   fill(0);
   rect(0, 0, 700, 600);
  }
  if(keyPressed)  {
   startMenu = false;
   cropAmountspring = true;
   fill(0);
   rect(0, 0, 700, 600);
  }
  }
}
PImage Am1;
PImage Am2;
PImage Am3;
PImage Am4;
PImage Am5;
PImage Ar1;
PImage Ar2;
PImage Ar3;
PImage Ar4;
PImage Ar5;
PImage Ar6;
PImage Be1;
PImage Be2;
PImage Be3;
PImage Be4;
PImage Be5;
PImage Bl1;
PImage Bl2;
PImage Bl3;
PImage Bl4;
PImage Bl5;
PImage Bl6;
PImage Bl7;
PImage BJ1;
PImage BJ2;
PImage BJ3;
PImage BJ4;
PImage BJ5;
PImage BC1;
PImage BC2;
PImage BC3;
PImage BC4;
PImage BC5;
PImage Ca1;
PImage Ca2;
PImage Ca3;
PImage Ca4;
PImage Ca5;
PImage Ca6;
PImage CB1;
PImage CB2;
PImage CB3;
PImage CB4;
PImage CB5;
PImage CB6;
PImage CB7;
PImage Co1;
PImage Co2;
PImage Co3;
PImage Co4;
PImage Co5;
PImage Co6;
PImage Co7;
PImage Cr1;
PImage Cr2;
PImage Cr3;
PImage Cr4;
PImage Cr5;
PImage Cr6;
PImage Cr7;
PImage E1;
PImage E2;
PImage E3;
PImage E4;
PImage E5;
PImage E6;
PImage E7;
PImage FR1;
PImage FR2;
PImage FR3;
PImage FR4;
PImage FR5;
PImage Ga1;
PImage Ga2;
PImage Ga3;
PImage Ga4;
PImage Ga5;
PImage GB1;
PImage GB2;
PImage GB3;
PImage GB4;
PImage GB5;
PImage GB6;
PImage GB7;
PImage Gr1;
PImage Gr2;
PImage Gr3;
PImage Gr4;
PImage Gr5;
PImage Gr6;
PImage Gr7;
PImage H1;
PImage H2;
PImage H3;
PImage H4;
PImage H5;
PImage H6;
PImage HP1;
PImage HP2;
PImage HP3;
PImage HP4;
PImage HP5;
PImage HP6;
PImage HP7;
PImage K1;
PImage K2;
PImage K3;
PImage K4;
PImage K5;
PImage M1;
PImage M2;
PImage M3;
PImage M4;
PImage M5;
PImage M6;
PImage Par1;
PImage Par2;
PImage Par3;
PImage Par4;
PImage Par5;
PImage Pop1;
PImage Pop2;
PImage Pop3;
PImage Pop4;
PImage Pop5;
PImage Pot1;
PImage Pot2;
PImage Pot3;
PImage Pot4;
PImage Pot5;
PImage Pot6;
PImage Pum1;
PImage Pum2;
PImage Pum3;
PImage Pum4;
PImage Pum5;
PImage Pum6;
PImage Ra1;
PImage Ra2;
PImage Ra3;
PImage Ra4;
PImage Ra5;
PImage RC1;
PImage RC2;
PImage RC3;
PImage RC4;
PImage RC5;
PImage RC6;
PImage Rh1;
PImage Rh2;
PImage Rh3;
PImage Rh4;
PImage Rh5;
PImage Rh6;
PImage Sta1;
PImage Sta2;
PImage Sta3;
PImage Sta4;
PImage Sta5;
PImage Sta6;
PImage Str1;
PImage Str2;
PImage Str3;
PImage Str4;
PImage Str5;
PImage Str6;
PImage Str7;
PImage SS1;
PImage SS2;
PImage SS3;
PImage SS4;
PImage SS5;
PImage Su1;
PImage Su2;
PImage Su3;
PImage Su4;
PImage Su5;
PImage To1;
PImage To2;
PImage To3;
PImage To4;
PImage To5;
PImage To6;
PImage To7;
PImage Tu1;
PImage Tu2;
PImage Tu3;
PImage Tu4;
PImage Tu5;
PImage UmR1;
PImage UmR2;
PImage UmR3;
PImage UmR4;
PImage UmR5;
PImage W1;
PImage W2;
PImage W3;
PImage W4;
PImage W5;
PImage Y1;
PImage Y2;
PImage Y3;
PImage Y4;
PImage Y5;
public void Selectmode() {
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
  public void settings() {  size(700, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SV_CCalendar" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
