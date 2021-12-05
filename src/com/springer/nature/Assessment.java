package com.springer.nature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assessment {

    public void calculateTicket(String from, String to, int numTravel){
        int fixedExp=750;
        int perFiveKm=5;

        List<TravelInfo> travelInfoList=new ArrayList<TravelInfo>();
        travelInfoList.add(new TravelInfo("PUNE","MUMBAI",120));
        travelInfoList.add(new TravelInfo("PUNE","NASIK",200));


       TravelInfo travelInfo=travelInfoList.stream().filter(x->(x.getFrom().equals(from)&&x.getTo().equals(to))).collect(Collectors.toList()).get(0);
        int extraDist= travelInfo.getDistance()-100;
        System.out.println("Source :"+travelInfo.getFrom());
        System.out.println("Destination :"+travelInfo.getTo());
        System.out.println("KM :"+travelInfo.getDistance());
        System.out.println("No of travelers :"+numTravel);
        System.out.println("Total :"+numTravel*(extraDist>1? fixedExp+extraDist*perFiveKm:fixedExp));



    }


}
