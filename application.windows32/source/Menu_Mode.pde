void Menumode()  {
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
