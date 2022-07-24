package CaseStudy.repository;

import CaseStudy.Models.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepositoryImpl implements  FacilityRepository {
    private static Map<Facility,Integer> facilityList;
    {
        facilityList = new LinkedHashMap<>();
        facilityList.put(new Room("Room",50,50,5,"day","drink"),5);
        facilityList.put(new House("House",50,50,5,"day","5 sao",2),1);
        facilityList.put(new Villa("House",50,50,5,"day","4 sao",50,3),1);
    }

    public static Map<Facility,Integer> getFacilityList() {
        return facilityList;
    }
    @Override
    public Map<Facility,Integer> displayFacility() {
        return facilityList;
    }

    @Override
    public void addFacility(Facility facility) {
        if (facilityList.get(facility)==null){
            facilityList.put(facility,1);
        }else {
            int useCount=facilityList.get(facility);
            facilityList.put(facility,(useCount+1));
        }
    }
}
