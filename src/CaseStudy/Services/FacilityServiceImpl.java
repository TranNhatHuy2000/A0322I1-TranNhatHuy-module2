package CaseStudy.Services;

import CaseStudy.Models.Facility;
import CaseStudy.repository.FacilityRepository;
import CaseStudy.repository.FacilityRepositoryImpl;

import java.util.Map;

public class FacilityServiceImpl implements FacilityService {
    private FacilityRepository facilityRepository = new FacilityRepositoryImpl();


    @Override
    public void displayFacility() {
     facilityRepository.displayFacility();
    }

    @Override
    public void addNewVilla() {
        facilityRepository.addNewVilla();
    }

    @Override
    public void addNewHouse() {
        facilityRepository.addNewRoom();
    }

    @Override
    public void addNewRoom() {
        facilityRepository.addNewRoom();
    }

    @Override
    public void displayFacilityMaintenance() {
        facilityRepository.displayFacilityMaintenance();
    }
}
