package CaseStudy.Services;

import CaseStudy.Models.Contract;

public interface ContactService extends Service {
    void createNewContract();
    void displayListContracts();
    void editContracts();
}
