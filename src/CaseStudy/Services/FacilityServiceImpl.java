package CaseStudy.Services;

import CaseStudy.Models.Facility;
import CaseStudy.repository.FacilityRepository;
import CaseStudy.repository.FacilityRepositoryImpl;

import java.util.Map;

public class FacilityServiceImpl implements FacilityService {
    private FacilityRepository facilityRepository = new FacilityRepositoryImpl();


    @Override
    public Map<Facility, Integer> displayFacility() {
        return facilityRepository.displayFacility();
    }

    @Override
    public void addFacility(Facility facility) {
        facilityRepository.addFacility(facility);
    }

    @Override
    public void displayFacilityMaintenance() {
        facilityRepository.displayFacilityMaintenance();
    }
}
