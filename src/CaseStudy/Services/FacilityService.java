package CaseStudy.Services;

import CaseStudy.Models.Facility;

import java.util.Map;

public interface FacilityService extends Service  {
    Map<Facility,Integer> displayFacility();
    void addFacility(Facility facility);
    void displayFacilityMaintenance();
}
