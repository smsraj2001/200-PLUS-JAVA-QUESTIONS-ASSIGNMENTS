/**Hospital Management Program.*/

import java.util.*;
public class EXAMPLE_128
{
static int option,in=0,x,l,bId,a=101,fact,flag,ind,noP=0;
static int costTogether=0;
static String  name;
static String address; 
static int dOpt,price=0;
static int amt[]=new int[15];
static char  ch;
static int i=0;
static int urineTest=500;
static int lipidTest= 1000; 
static int bloodTest=500;
static int ECG = 1000;
static int UScan=2000; 
static int boneDen=1500;
static int xray=200;
static int tyroid=1000;
static int diabetisTest=500;
static int heamoTest=700;
static  int MRIscan=5000;
static int CTscan=3000;
static int testOpt;
static int Id []= new int[15];
static int cost[]=new int[12];
static int mainMenu;
static String  Name[]=new String[15];
static String  Address[] = new String[15];
static String doc[]=new String[15];
static char BillOpt,next;
static String test[] = new String [12];
public static void main (String args[])
{
Scanner sc= new Scanner (System.in);
char next;
int j;
do
{
System.out.println("                                            St.John's Hospital");
System.out.println("                                     We are ready to solve your problem");
System.out.println();
System.out.println();
System.out.println("                                     ***********//----------\\***********");
System.out.println();
System.out.println();
System.out.println("                                       -----Press 1 for registration---");
System.out.println("                                       ------Press 2 for Appoinment---");
System.out.println("                                       ---Press 3 for Test & Billing---");
while(!sc.hasNextInt()) 
{
sc.next();
System.out.println("Please enter an integer: ");
}
mainMenu=sc.nextInt();
switch(mainMenu)
{
case 1:
patientInfo();    
if(ch=='n'||ch=='N')
break;
case 2:
doctorOptions();
break;
case 3:
Billing();
break;
default:
System.out.println("Choose correct option");
}
System.out.println();
System.out.println("                                           Enter 'Continue' to go for next patient");
next=sc.next().charAt(0);
}while(next=='c'||next=='C');
if(next!='c'||next!='C')
{
System.out.println("__________________________________________________________________________________________________________________________");
System.out.println(); 
System.out.println("   ---------------------------------Today's Billing Session Ends With This-------------------------");
System.out.println();
System.out.println("                           THE ACCOUNT FOR THIS BILLING SESSION WILL BE DISPLAYED ");
for(j=0;j<noP;j++)
{
System.out.println();
System.out.println("_____________________________________________________");
System.out.println(" Patient No:"+((j*1)+1));
System.out.println(" Name                : " +Name[j]);
System.out.println(" Address             : " +Address[j]);
System.out.println(" The ID No           : " +Id[j]);
System.out.println(" Doctor consulted    : " +doc[j]);
System.out.println(" Amount he/she paid  : " +amt[j]);
System.out.println("_____________________________________________________");
System.out.println(); 
}
System.out.println(); 
System.out.println("  !!!!!!!!!!!!!!!!!THE GRAND AMOUNT RECIEVED BY THE HOSPITAL FROM THIS BILLING SESSION IS!!!!!!!!!!!!!!!");
System.out.println("          *************************************** "+costTogether+" ******************************** ");
System.out.println(); 
System.out.println("   **********************************************THANK YOU*****************************************");
System.out.println();
System.out.println("__________________________________________________________________________________________________________________________");
System.out.println("                                             ENTER '0' TO EXIT ");
x=sc.nextInt();
if(x==0)
{
System.exit(0);
}
}
}
public static void  patientInfo()
{
Scanner sc= new Scanner (System.in);
System.out.println("Enter Your personal information");
System.out.println("Enter your name");
name=sc.nextLine();
System.out.println();
Name[i]= name;
System.out.println("Enter your address");
address=sc.nextLine();
System.out.println();
Address[i]=address;
Id[i]=a;
System.out.println("Your Id is " +Id[i]);
++i;
++a;
++noP;
System.out.println("                           Would you like to continue ;Press Yes or no");
ch=sc.next().charAt(0);   
}
public static void doctorOptions()
{
Scanner sc= new Scanner (System.in);
System.out.println("Enter ID");
while(!sc.hasNextInt()) 
{
sc.next();
System.out.println("Please enter an integer: ");
}
bId=sc.nextInt();
int j; 
for(j=0;j<15;j++)
{
if(bId==Id[j])
{
fact=1;
ind=j;
break;
}
}
if(fact==1)
{
System.out.println("Enter the field of in which u have problem");
System.out.println("Press '1' for Ortho;     press '2' Cardio;       press '3' for genral problem");
while(!sc.hasNextInt()) 
{
sc.next();
System.out.println("Please enter an integer: ");
}
option=sc.nextInt();
switch(option)
{
case 1:
System.out.println(" Doctors available");
System.out.println();
System.out.println(" Dr.Keshav ");
System.out.println("Contact number: 9842563909");
System.out.println(" Available on monday and wednesday @ 4pm-6pm");
System.out.println(" Press 1 if u want to contact him");
System.out.println();
System.out.println("Dr.Vinod ");
System.out.println("Contact No.9786534250");
System.out.println(" Available on tuesday and thursday @ 11am-12pm");
System.out.println(" Press 2 if u want to contact him");
System.out.println();
dOpt=sc.nextInt();
break;
case 2:
System.out.println(" Doctors available");
System.out.println();
System.out.println(" Dr.Neetha ");
System.out.println("Contact number: 9834563909");
System.out.println(" Available on tuesday and thursday @ 4pm-6pm");
System.out.println(" Press 1 if u want to contact him");
System.out.println();
System.out.println("Sahana ");
System.out.println("Contact No.9786532350");
System.out.println(" Available on wednsday and thursday @ 11am-12pm");
System.out.println(" Press 2 if u want to contact him");
System.out.println();
dOpt=sc.nextInt();
break;
case 3:
System.out.println(" Doctors available");
System.out.println();
System.out.println(" Dr.Ashwaq");
System.out.println(" Available on monday and wednesday @ 4pm-6pm");
System.out.println(" Press 1 if u want to contact him");
System.out.println();
System.out.println("Dr.Sandeep ");
System.out.println(" Available on Tuesday and Thursday @ 11am-12pm");
System.out.println(" Press 2 if u want to contact him");
System.out.println();
dOpt=sc.nextInt();
                 
}
if(option==1)
{
if(dOpt==1)
{
doc[ind]= "Dr.Keshav";
System.out.println(" Your appoinment is fixed with Dr.Keshav");
}
else
if(dOpt==2)
{
doc[ind]= "Dr.Vinod";
System.out.println(" Your appoinment is fixed with Dr.vinod");
}
else
{
System.out.println("Wrong option");   
}
}
else
if(option==2)
{
if(dOpt==1)
{
doc[ind]="Dr.Neetha";
System.out.println(" Your appoinment is fixed with Dr.Neetha");
}
else
if(dOpt==2)
{
doc[ind]="Dr.Sahana";
System.out.println(" Your appoinment is fixed with Dr.Sahana");
}
else
{
System.out.println("Wrong option");   
}
}
else
if(option==3)
{
if(dOpt==1)
{
doc[ind]= "Dr.Ashwaq";
System.out.println(" Your appoinment is fixed with Dr.Ashwaq");
}
else
if(dOpt==2)
{
doc[ind]= "Dr. Sandeep";
System.out.println(" Your appoinment is fixed with Dr.Sandeep");
}
else
{
System.out.println("Wrong option");   
}
++i;
}
}
else
{
System.out.println("Not registered");
}
}
public static void test()
{
Scanner sc=new Scanner(System.in); 
System.out.println();
System.out.println(" Press 1 'Urine test");
System.out.println();
System.out.println(" Press 2 'Lipid Test");
System.out.println();
System.out.println(" Press 3 'Blood Test'");
System.out.println();
System.out.println(" Press 4 'ECG test'");
System.out.println();
System.out.println(" Press 5 'Ultra-Violet Scan'");
System.out.println();
System.out.println(" Press 6 'Bone-DensityTest'");
System.out.println();
System.out.println(" Press 7 'X-Ray'");
System.out.println();
System.out.println(" Press 8 'Thyroid Test'");
System.out.println();
System.out.println(" Press 9 'Diabetes'");
System.out.println();
System.out.println("Press 10 'Heamoglobin Test'");
System.out.println();
System.out.println("Press 11 'MRI Scan '");
System.out.println();
System.out.println("Press 12 'CT Scan'");
System.out.println();
while(!sc.hasNextInt()) 
{
sc.next();
System.out.println("Please enter an integer: ");
}
testOpt=sc.nextInt();
System.out.println();
System.out.println();
testopt();
}
public static void Billing()
{  
Scanner sc= new Scanner(System.in);
System.out.println("Enter ID");
while(!sc.hasNextInt()) 
{
sc.next();
System.out.println("Please enter an integer: ");
}
bId=sc.nextInt();
in=0;
l=0;
int j;
for(j=0;j<15;j++)
{
if(bId==Id[j])
{
fact=1;
break;
}
}       
if(fact==1)
{
test();
}
else
{
System.out.println("Not registered");
}
}
public static void testopt()
{        
switch(testOpt)
{
case 1:
System.out.println("Urine test ="+ urineTest);
test[in]="Urine test";
cost[in]=urineTest;
++in;
break;
case 2:
System.out.println("Lipid test= "+lipidTest);
test[in]="LipidTest";
cost[in]=lipidTest;
++in;
break;
case 3:
System.out.println("Blood test="+bloodTest);
cost[in]=bloodTest;
test[in]="Blood test";
++in;
break;
case 4:
System.out.println("ECG Test="+ECG);
cost[in]=ECG;
test[in]="ECG Test";
++in;
break;
case 5:
System.out.println("Ultra-Violet Scan="+UScan);
cost[in]=UScan;
test[in]="Ultra-Violet Scan";
++in;
break;
case 6:
System.out.println("Bone-DensityTest="+boneDen);
cost[in]=boneDen;
test[in]="Bone-DensityTest";
++in;
break;
case 7:
System.out.println("X-Ray="+xray);
cost[in]=xray;
test[in]="X-Ray";
++in;
break;
case 8:
System.out.println("Thyroid Test="+tyroid);
cost[in]=tyroid;
test[in]="Thyroid Test";
++in;
break;
case 9:
System.out.println("Diabetes="+diabetisTest);
cost[in]=diabetisTest;
test[in]="Diabetes";
++in;
break;
case 10:
System.out.println("Heamoglobin Test="+heamoTest);
cost[in]=heamoTest;
test[in]="Heamoglobin Test";
++in;
break;
case 11:
System.out.println("MRI Scan="+MRIscan);
cost[in]=MRIscan;   
test[in]="MRI Scan";
++in;
break;
case 12:
System.out.println("CT Scan="+CTscan);
cost[in]=CTscan;
test[in]="CT Scan";
++in;
break;
default:
System.out.println("Wrong option");
}
Scanner sc= new Scanner(System.in);
System.out.println();
System.out.println("                               Do You Continue With another test then  Press 1; else 2");
x=sc.nextInt();
if(x==1)
{
l=in;
test();   
}
else
{
printbill();
price=price*0;
}
}
public static void printbill()
{
int j,index=0;
for(j=0;j<15;j++)
{
if(bId==Id[j])
{
flag=1;               
break;
}
}
if(flag==1)
{
for(j=0;j<15;j++)
{
if(bId==Id[j])
{
fact=1;
index=j;
break;
}
}
if(fact==1)
{
System.out.println();
System.out.println();
System.out.println("___________________________________________________________________________________________________________________________");
System.out.println("|                                                        St.John's Hospital                                               |");
System.out.println("|                                                          Bilekahalli                                                    |");
System.out.println("|                                                       -----##***##-----                                                 |");
System.out.println("|                                                             BILL                                                        |");
System.out.println("|-------------------------------------------------------------------------------------------------------------------------|");
System.out.println();
System.out.println();
System.out.println("Name::      "+Name[index]+"  .....................................................\t\tDoctor Conculted="+doc[index]);
System.out.println("Address::   "+Address[index]);
System.out.println("Your personal ID is:" +Id[index]);
System.out.println();
System.out.println("Test taken are");
for(j=0;j<in;j++)
{
System.out.println();
price=price+cost[j];
System.out.println(j+1+":" +test[j]+"\tCost:: " +cost[j]);
}
System.out.println();
System.out.println("                                                                                       Total cost::"+price);
System.out.println("__________________________________________________________________________________________________________________________");
amt[index]=price;
costTogether=costTogether+price;
System.out.println();
System.out.println();
System.out.println();
}
else
{
System.out.println("Not a valid member");
}
}
else
{
System.out.println("It is not registered");
}        
}
}