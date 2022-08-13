package CaseStudy.Services;

import CaseStudy.Models.Contract;
import CaseStudy.repository.BookingRepository;
import CaseStudy.repository.BookingRepositoryImpl;
import CaseStudy.repository.ContractRepository;
import CaseStudy.repository.ContractRepositoryImpl;

public class ContactServiceImpl implements ContactService {
    private ContractRepository contractRepository = new ContractRepositoryImpl();
    @Override
    public void createNewContract() {
        contractRepository.createNewContract();
    }

    @Override
    public void displayListContracts() {
        contractRepository.displayListContracts();
    }

    @Override
    public void editContracts() {
        contractRepository.editContracts();
    }
}
