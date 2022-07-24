package CaseStudy.repository;

import CaseStudy.Models.Facility;
import java.util.Map;

public interface FacilityRepository {
    Map<Facility,Integer> displayFacility();
    void addFacility(Facility facility);
}
