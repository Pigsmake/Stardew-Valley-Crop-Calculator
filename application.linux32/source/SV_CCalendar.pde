void setup() {
  size(700, 600);
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
void draw()   {
 Selectmode();
 Menumode();
 Amountselect1mode();
 Amountselect2mode();
 Amountselect3mode();
 Calculatormode();
 CalendarmodeN();
 Controlmode();
}