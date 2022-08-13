package CaseStudy.Services;

import CaseStudy.Models.Facility;

import java.util.Map;

public interface FacilityService extends Service  {
    void displayFacility();
    void addNewVilla();
    void addNewHouse();
    void addNewRoom();
    void displayFacilityMaintenance();
}
