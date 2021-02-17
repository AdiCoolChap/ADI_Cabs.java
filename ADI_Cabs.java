import java.io.*;
class ADI_Cabs 
{
    public static void main(String args[])throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i , cab , micc , micd , autd , minc , mind , pric , prid , renc , outc , outd , outt , outd1 , outd2 , outd3 , outd4 , luxc , luxd ;
        System.out.println( " Welcome to ADI Cabs " );
        System.out.println( " This world is speedy so to cope up with the world we give you the fastest cab service in the town " );
        System.out.println( " From speedy to luxururious to humble to precise , we have all what you need for travelling " );
        System.out.println( " So you can just just rely on us..... " );
        System.out.println( " The availabe types of cabs available are : " );
        String CABS[]={ " ADI Auto " , " ADI Micro " , " ADI Mini " , " ADI Prime Sedan " , " ADI Lux " , " ADI Rentals " , " ADI Outstation " }; 
        for(i=0;i<7;i++)
        System.out.println( (i+1) + "." + CABS[i] );
        System.out.println( " Enter your choice by their sr. no.s " );
        cab=Integer.parseInt(br.readLine());
        System.out.println( " This is " + CABS[cab-1] );
        if(cab==1)
        {
            System.out.println( " The cheapest of all " );
            System.out.println( " Ideal for : Short Rides " );
            System.out.println( "             Budget Travel " );
            System.out.println( "             Metro/Bus Stops " );
            System.out.println( "             Solo Trips " );
            System.out.println( "             Narrow Roads " );
            System.out.println( " Fixed Meter.....Free Wi-Fi.....Pocket Friendly.....Hassle Free.....Onboard GPS " );
            System.out.println( " And these all are very important....cause we are in India ;-) " );
            System.out.println( " Rate - Rs.15/km " );
            System.out.println( " Only Autos available here " );
            System.out.println( " Maximum 50km for ADI Auto " );
            System.out.println( " Enter distance in kilometers " );
            autd=Integer.parseInt(br.readLine());
            if(autd>50)
            System.out.println( " Inappropriate for ADI Auto " );
            else
            {                 
                System.out.println( " Booking confirmed for ADI Auto for " + autd + "km" );
                System.out.println( " Driver Details : Shiv Sharan " );
                System.out.println( " Vehicle Details : MP20R6184 " );
                System.out.println( " Total Bill : Rs." + (autd*15) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 2mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " );
            }
        }
        if(cab==2)
        {
            System.out.println( " Pay small fares for your short city rides " );
            System.out.println( " Ideal for : Budget Travel " );
            System.out.println( "             Solo Trips " );
            System.out.println( "             Daily Commute " );
            System.out.println( " Compact Hatch.....Luggage Space.....Pocket Friendly.....Personal AC Cab " );
            System.out.println( " And also they are the cheapest AC Cabs in the town ;-) " );           
            System.out.println( " Rate - Rs.25/km " );
            System.out.println( " Vehicles available are : " );
            String MIC[]={ " Maruti Alto " , " Chevrolet Beat " }; 
            for(i=0;i<2;i++)
            System.out.println( (i+1) + "." + MIC[i] );
            System.out.println( " Enter your choice by their sr. no.s " );
            micc=Integer.parseInt(br.readLine());
            System.out.println( " Maximum 100km for ADI Micro " );
            System.out.println( " Enter distance in kilometers " );
            micd=Integer.parseInt(br.readLine());
            if(micd>100)
            System.out.println( " Inappropriate for ADI Micro " );
            else
            {
            switch(micc)
            {
                case 1:
                System.out.println( " Booking confirmed for " + MIC[micc-1] + " for " + micd + "km" );
                System.out.println( " Driver Details : Rahul Pathak " );
                System.out.println( " Vehicle Details : MP20T9921 " );
                System.out.println( " Total Bill : Rs." + (micd*25) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 3mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " );
                break;
                case 2:
                System.out.println( " Booking confirmed for " + MIC[micc-1] + " for " + micd + "km" );
                System.out.println( " Driver Details : Madan Mohan " );
                System.out.println( " Vehicle Details : MP20TA1056 " );
                System.out.println( " Total Bill : Rs." + (micd*25) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 3mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " );
                break;
                default :
                System.out.println( " Wrong Choice !! " );
                break;
            }
            }
        }
        if(cab==3)
        { 
            System.out.println( " Comfy AC hatchbacks at pocket-friendly fares " );
            System.out.println( " Ideal for : Family Outings " );
            System.out.println( "             Railway/Bus Station Ride " );
            System.out.println( "             Airport Rides " );
            System.out.println( "             Daily Commute " );
            System.out.println( " Comfy Hatch.....Luggage Space.....Pocket Friendly.....Personal AC Cab " );
            System.out.println( " And also this comfy buddy becomes your everyday ride ;-) " );
            System.out.println( " Rate - Rs.30/km " );
            System.out.println( " Vehicles available are : " );
            String MIN[]={ " Tata Indica " , " Hyundai i10 " , " Nissan Micra " , " Maruti Ritz " };
            for(i=0;i<4;i++)
            System.out.println( (i+1) + "." + MIN[i] );
            System.out.println( " Enter your choice by their sr. no.s " );
            minc=Integer.parseInt(br.readLine());
            System.out.println( " Maximum 125km for ADI Mini " );
            System.out.println( " Enter distance in kilometers " );
            mind=Integer.parseInt(br.readLine());
            if(mind>125)
            System.out.println( " Inappropriate for ADI Mini " );
            else
            {
            switch(minc)
            {
                case 1:
                System.out.println( " Booking confirmed for " + MIN[minc-1] + " for " + mind + "km" );
                System.out.println( " Driver Details : Siddhart Gohar " );
                System.out.println( " Vehicle Details : MP20CG1210 " );
                System.out.println( " Total Bill : Rs." + (mind*30) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 3mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                break;
                case 2:
                System.out.println( " Booking confirmed for " + MIN[minc-1] + " for " + mind + "km" );
                System.out.println( " Driver Details : Manoj Mishra " );
                System.out.println( " Vehicle Details : MP20TA0618 " );
                System.out.println( " Total Bill : Rs." + (mind*30) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 3mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                break;
                case 3:
                System.out.println( " Booking confirmed for " + MIN[minc-1] + " for " + mind + "km" );
                System.out.println( " Driver Details : Imrat Lal " );
                System.out.println( " Vehicle Details : MP20TA1078 " );
                System.out.println( " Total Bill : Rs." + (mind*30) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 3mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                break;
                case 4:
                System.out.println( " Booking confirmed for " + MIN[minc-1] + " for " + mind + "km" );
                System.out.println( " Driver Details : Mukesh Tiwari " );
                System.out.println( " Vehicle Details : MP20TA1002 " );
                System.out.println( " Total Bill : Rs." + (mind*30) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 3mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                break;
                default :
                System.out.println( " Wrong Choice !! " );
                break;
            }
            }
        }
        if(cab==4)
        { 
            System.out.println( " These are classy sedans with free Wi-Fi and top rated drivers " );
            System.out.println( " Ideal For : Family Outings " );
            System.out.println( "             Railway/Bus Station Rides " );
            System.out.println( "             Airport Rides " );
            System.out.println( "             Office Commute " );
            System.out.println( "             Business Travel " );
            System.out.println( " Spaceous Sedans.....Top Partners.....Free Wi-Fi.....Extra Luggage " );
            System.out.println( " Add the comfort of a high-rated sedan to your daily commute " );
            System.out.println( " Enjoy extra legroom , ample boost space , and free Wi-Fi ;-) " );
            System.out.println( " Rate - Rs.35/km " );
            System.out.println( " Vehicles available are : " );
            String PRI[]={ " Tata Zest " , " Maruti Swift Dzire " , " Toyota Etios " , " Tata Indigo " , " Nissan Sunny " };
            for(i=0;i<5;i++)
            System.out.println( (i+1) + "." + PRI[i] );
            System.out.println( " Enter your choice by their sr. no.s " );
            pric=Integer.parseInt(br.readLine());
            System.out.println( " Maximum 140km for ADI Prime Sedan " );
            System.out.println( " Enter distance in kilometers " );
            prid=Integer.parseInt(br.readLine());
            if(prid>140)
            System.out.println( " Inappropriate for ADI Prime Sedan " );
            else
            {
            switch(pric)
            {
                case 1:
                System.out.println( " Booking confirmed for " + PRI[pric-1] + " for " + prid + "km" );
                System.out.println( " Driver Details : Mukesh Tiwari " );
                System.out.println( " Vehicle Details : MP20TA1002 " );
                System.out.println( " Total Bill : Rs." + (prid*35) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 4mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " );
                break;
                case 2 :
                System.out.println( " Booking confirmed for " + PRI[pric-1] + " for " + prid + "km" );
                System.out.println( " Driver Details : Jitendra Singh " );
                System.out.println( " Vehicle Details : MP20TA1040 " );
                System.out.println( " Total Bill : Rs." + (prid*35) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 4mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " );
                break;
                case 3:
                System.out.println( " Booking confirmed for " + PRI[pric-1] + " for " + prid + "km" );
                System.out.println( " Driver Details : Krishna Kant Bairagi " );
                System.out.println( " Vehicle Details : MP20TA0704 " );
                System.out.println( " Total Bill : Rs." + (prid*35) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 4mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " );
                break;
                case 4:
                System.out.println( " Booking confirmed for " + PRI[pric-1] + " for " + prid + "km" );
                System.out.println( " Driver Details : Gurvinder Singh " );
                System.out.println( " Vehicle Details : MP20VB8413 " );
                System.out.println( " Total Bill : Rs." + (prid*35) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 4mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " );
                break;
                case 5:
                System.out.println( " Booking confirmed for " + PRI[pric-1] + " for " + prid + "km" );
                System.out.println( " Driver Details : Shankar Lal Patel " );
                System.out.println( " Vehicle Details : MP20TA0818 " );
                System.out.println( " Total Bill : Rs." + (prid*35) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 4mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " );
                break;
                default :
                System.out.println( " Wrong Choice !! " );
                break;
            }
            }
        }
        if(cab==5)
        {
            System.out.println( " Luxurious gateways for unforgettable moments " );
            System.out.println( " Ideal for : Weddings and Occassions " );
            System.out.println( "             Airport Pickup " );
            System.out.println( "             Business Travel " );
            System.out.println( " Luxury Cars.....Feature Packed.....Trained Partners.....Free Wi-Fi " );
            System.out.println( " Top-of-the-line luxury cars which are perfect for any special occassion ;-) " );
            System.out.println( " Rate - Rs.110/km " );
            System.out.println( " Vehicles available are : " );
            String LUX[]={ " Toyota Camry " , " Honda Accord " , " Audi A6 " , " BMW 3 Series " , " Mercedes Benz E-Class " };
            for(i=0;i<5;i++)
            System.out.println( (i+1) + "." + LUX[i] );
            System.out.println( " Enter your choice by their sr. no.s " );
            luxc=Integer.parseInt(br.readLine()); 
            System.out.println( " Maximum 75km for ADI Lux " );
            System.out.println( " Enter distance in kilometers " );
            luxd=Integer.parseInt(br.readLine());
            if(luxd>75)
            System.out.println( " Inappropriate for ADI Lux " );
            else
            {
            switch(luxc)
            {
                case 1:
                System.out.println( " Booking confirmed for " + LUX[luxc-1] + " for " + luxd + "km" );
                System.out.println( " Driver Details : Shankar Lal Patel " );
                System.out.println( " Vehicle Details : MP20TA0818 " );
                System.out.println( " Total Bill : Rs." + (luxd*110) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 3mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " );
                break;
                case 2:
                System.out.println( " Booking confirmed for " + LUX[luxc-1] + " for " + luxd + "km" );
                System.out.println( " Driver Details : Krishna Kant Bairagi " );
                System.out.println( " Vehicle Details : MP20TA0704 " );
                System.out.println( " Total Bill : Rs." + (luxd*110) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 3mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " );
                break;
                case 3:
                System.out.println( " Booking confirmed for " + LUX[luxc-1] + " for " + luxd + "km" );
                System.out.println( " Driver Details : Gurvinder Singh " );
                System.out.println( " Vehicle Details : MP20VB8413 " );
                System.out.println( " Total Bill : Rs." + (luxd*110) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 3mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " );
                break;
                case 4:
                System.out.println( " Booking confirmed for " + LUX[luxc-1] + " for " + luxd + "km" );
                System.out.println( " Driver Details : Jitendra Singh " );
                System.out.println( " Vehicle Details : MP20TA1040 " );
                System.out.println( " Total Bill : Rs." + (luxd*110) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 3mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " );
                break;
                case 5:
                System.out.println( " Booking confirmed for " + LUX[luxc-1] + " for " + luxd + "km" );
                System.out.println( " Driver Details : Mukesh Tiwari " );
                System.out.println( " Vehicle Details : MP20TA1002 " );
                System.out.println( " Total Bill : Rs." + (luxd*110) + " to be paid in cash " );
                System.out.println( " Pickup arriving in 3mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " );
                break;
                default :
                System.out.println( " Wrong Choice !! " );
                break;
            }
            }
        }
        if(cab==6)
        {
            System.out.println( " Rent cabs at flexible hourly packages " );
            System.out.println( " Ideal for : Weddings and Occassions " );
            System.out.println( "             Business Travel " );
            System.out.println( "             City Tours " );
            System.out.println( "             Long Rides " );
            System.out.println( "             Multiple Stops " );
            System.out.println( " Hourly Packages.....Multiple Stops.....Always Available.....Top Partners.....Onboard GPS.....Safe Journey " );
            System.out.println( " Our driver-partner will wait while you make your visit " );
            System.out.println( " Book one cab to travel to different places in the city ;-) " );         
            System.out.println( " Packages available are : " );
            String REN[]={ " 1 hour and 15km with ADI Mini : Rs.349 " , " 2 hours and 30km with ADI Mini : Rs.649 " , " 4 hours and 40km with ADI Mini : Rs.799 " , " 8 hours and 80km with ADI Mini : Rs.1449 " , " 1 hour and 15km with ADI Prime Sedan : Rs.369 " , " 2 hours and 30km with ADI Prime Sedan : Rs.699 " , " 4 hours and 40km with ADI Prime Sedan : Rs.849 " , " 8 hours and 80km with ADI Prime Sedan : Rs.1549 " }; 
            for(i=0;i<8;i++)
            System.out.println( (i+1) + "." + REN[i] );
            System.out.println( " Enter your choice by their sr. no.s " );
            renc=Integer.parseInt(br.readLine());
            switch(renc)
            {
                case 1:
                System.out.println( " Booking confirmed for " + REN[renc-1] );
                System.out.println( " Driver Details : Shankar Lal Patel " );
                System.out.println( " Vehicle Details : MP20TA0818 " );
                System.out.println( " Bill to be paid in cash " );
                System.out.println( " Pickup arriving in 4mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                break;
                case 2:
                System.out.println( " Booking confirmed for " + REN[renc-1] );
                System.out.println( " Driver Details : Krishna Kant Bairagi " );
                System.out.println( " Vehicle Details : MP20TA0704 " );
                System.out.println( " Bill to be paid in cash " );
                System.out.println( " Pickup arriving in 4mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                break;
                case 3:
                System.out.println( " Booking confirmed for " + REN[renc-1] );
                System.out.println( " Driver Details : Gurvinder Singh " );
                System.out.println( " Vehicle Details : MP20VB8413 " );
                System.out.println( " Bill to be paid in cash " );
                System.out.println( " Pickup arriving in 4mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                break;
                case 4:
                System.out.println( " Booking confirmed for " + REN[renc-1] );
                System.out.println( " Driver Details : Jitendra Singh " );
                System.out.println( " Vehicle Details : MP20TA1040 " );
                System.out.println( " Bill to be paid in cash " );
                System.out.println( " Pickup arriving in 4mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                break;
                case 5:
                System.out.println( " Booking confirmed for " + REN[renc-1] );
                System.out.println( " Driver Details : Mukesh Tiwari " );
                System.out.println( " Vehicle Details : MP20TA1002 " );
                System.out.println( " Bill to be paid in cash " );
                System.out.println( " Pickup arriving in 4mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                break;
                case 6:
                System.out.println( " Booking confirmed for " + REN[renc-1] );
                System.out.println( " Driver Details : Imrat Lal " );
                System.out.println( " Vehicle Details : MP20TA1078 " );
                System.out.println( " Bill to be paid in cash " );
                System.out.println( " Pickup arriving in 4mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                break;
                case 7:
                System.out.println( " Booking confirmed for " + REN[renc-1] );
                System.out.println( " Driver Details : Siddhart Gohar " );
                System.out.println( " Vehicle Details : MP20CG1210 " );
                System.out.println( " Bill to be paid in cash " );
                System.out.println( " Pickup arriving in 4mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                break;
                case 8:
                System.out.println( " Booking confirmed for " + REN[renc-1] );
                System.out.println( " Driver Details : Rahul Pathak " );
                System.out.println( " Vehicle Details : MP20T9921 " );
                System.out.println( " Bill to be paid in cash " );
                System.out.println( " Pickup arriving in 4mins " );
                System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                break;
                default :
                System.out.println( " Wrong Choice !! " );
                break;
            }
        }
        if(cab==7)
        { 
            System.out.println( " Ride out of town at affordable fares " );
            System.out.println( " Ideal for : Weekend Getaways " );
            System.out.println( "             Family Outings " );
            System.out.println( "             Inter-City Rides " );
            System.out.println( "             Tours " );
            System.out.println( " Safe Journey.....One Way Trips.....Round Trips.....Vehicle Options.....Trained Partners " );
            System.out.println( " Choose from a wide range of AC cabs driven by our top partners " );
            System.out.println( " Leave within an hour ;-) " );
            System.out.println( " Rate for ADI Mini - Rs.17/km and additional charge Rs.2/km for above 1000km " );
            System.out.println( " Rate for ADI Prime Sedan - Rs.20/km and additional charge Rs.3/km for above 1000km " );
            System.out.println( " Minimum travel of 50km in Outstation " );
            System.out.println( " Vehicles available are : " );
            String OUT[]={ " ADI Mini Tata Indica " , " ADI Mini Hyundai i10 " , " ADI Mini Nissan Micra " , " ADI Mini Maruti Ritz " , " ADI Prime Sedan Tata Zest " , " ADI Prime Sedan Maruti Swift Dzire " , " ADI Prime Sedan Toyota Etios " , "  ADI Prime Sedan Tata Indigo " , "  ADI Prime Sedan Nissan Sunny " }; 
            for(i=0;i<9;i++)
            System.out.println( (i+1) + "." + OUT[i] );
            System.out.println( " Enter your choice by their sr. no.s " );
            outc=Integer.parseInt(br.readLine());
            System.out.println( " Enter distance in kilometers " );
            outd=Integer.parseInt(br.readLine());
            if(outd<50)
            System.out.println( " Inapplicable for outstation " );
            else
            { 
                System.out.println( " Enter 1 for one way and enter 2 for round trip " );
                outt=Integer.parseInt(br.readLine());
                if(outt>2)
                 System.out.println( " Not applicable " );
                    else
                    { 
                        if((outc>=1)&&(outc<=4))
                        { 
                            if(outt==1)
                            { 
                                if(outd>1000)
                                {
                                    outd1=outd-1000;
                                    System.out.println( " Booking confirmed for " + OUT[outc-1] + " for " + outd + "km one way " );
                                    System.out.println( " Driver Details : Rahul Pathak " );
                                    System.out.println( " Vehicle Details : MP20T9921 " );
                                    System.out.println( " Total Bill : Rs. " + ((outd*17)+(outd1*2)) + " to be paid in cash " );    
                                    System.out.println( " Pickup arriving in 30mins " );
                                    System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                                }
                                if(outd<1000)
                                {
                                    System.out.println( " Booking confirmed for " + OUT[outc-1] + " for " + outd + "km one way " );
                                    System.out.println( " Driver Details : Siddhart Gohar " );
                                    System.out.println( " Vehicle Details : MP20CG1210 " );
                                    System.out.println( " Total Bill : Rs. " + (outd*17)+ " to be paid in cash " );    
                                    System.out.println( " Pickup arriving in 30mins " );
                                    System.out.println( " Other details like drop location to be given to the driver after pickup " );
                                }
                            }
                            if(outt==2)
                            { 
                                if(outd>1000)
                                {
                                    outd3=outd-1000;
                                    System.out.println( " Booking confirmed for " + OUT[outc-1] + " for " + outd + "km round trip " );
                                    System.out.println( " Driver Details : Imrat Lal " );
                                    System.out.println( " Vehicle Details : MP20TA1078 " );
                                    System.out.println( " Total Bill : Rs. " + (((outd*17)+(outd3*2))*2) + " to be paid in cash " );    
                                    System.out.println( " Pickup arriving in 30mins " );
                                    System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                                }
                                if(outd<1000)
                                {
                                    System.out.println( " Booking confirmed for " + OUT[outc-1] + " for " + outd + "km round trip " );
                                    System.out.println( " Driver Details : Mukesh Tiwari " );
                                    System.out.println( " Vehicle Details : MP20TA1002 " );
                                    System.out.println( " Total Bill : Rs. " + ((outd*17)*2)+ " to be paid in cash " );    
                                    System.out.println( " Pickup arriving in 30mins " );
                                    System.out.println( " Other details like drop location to be given to the driver after pickup " );
                                }
                            }
                        }
                        if((outc>4)&&(outc<=9))
                        {
                            if(outt==1)
                            {
                                if(outd>1000)
                                {
                                    outd2=outd-1000;
                                    System.out.println( " Booking confirmed for " + OUT[outc-1] + " for " + outd + "km one way " );
                                    System.out.println( " Driver Details : Jitendra Singh " );
                                    System.out.println( " Vehicle Details : MP20TA1040 " );
                                    System.out.println( " Total Bill : Rs. " + ((outd*20)+(outd2*2)) + " to be paid in cash " );    
                                    System.out.println( " Pickup arriving in 30mins " );
                                    System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                                }
                                if(outd<1000)
                                {
                                    System.out.println( " Booking confirmed for " + OUT[outc-1] + " for " + outd + "km one way " );
                                    System.out.println( " Driver Details : Gurvinder Singh " );
                                    System.out.println( " Vehicle Details : MP20VB8413 " );
                                    System.out.println( " Total Bill : Rs. " + (outd*20)+ " to be paid in cash " );    
                                    System.out.println( " Pickup arriving in 30mins " );
                                    System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                                }
                            }
                            if(outt==2)
                            {
                                if(outd>1000)
                                {
                                    outd4=outd-1000;
                                    System.out.println( " Booking confirmed for " + OUT[outc-1] + " for " + outd + "km round trip " );
                                    System.out.println( " Driver Details : Krishna Kant Bairagi " );
                                    System.out.println( " Vehicle Details : MP20TA0704 " );
                                    System.out.println( " Total Bill : Rs. " + ((outd*20)+(outd4*2)*2) + " to be paid in cash " );    
                                    System.out.println( " Pickup arriving in 30mins " );
                                    System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                                }
                                if(outd<1000)
                                {
                                    System.out.println( " Booking confirmed for " + OUT[outc-1] + " for " + outd + "km round trip " );
                                    System.out.println( " Driver Details : Shankar Lal Patel " );
                                    System.out.println( " Vehicle Details : MP20TA0818 " );
                                    System.out.println( " Total Bill : Rs. " + ((outd*20)*2)+ " to be paid in cash " );    
                                    System.out.println( " Pickup arriving in 30mins " );
                                    System.out.println( " Other details like drop location to be given to the driver after pickup " ); 
                                }
                            }
                        }
                    }
                }
            }
        }
    }