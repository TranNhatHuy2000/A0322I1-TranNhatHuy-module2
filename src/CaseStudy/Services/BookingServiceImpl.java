package CaseStudy.Services;

import CaseStudy.Models.Booking;
import CaseStudy.repository.BookingRepository;
import CaseStudy.repository.BookingRepositoryImpl;

public class BookingServiceImpl implements BookingService {
    private BookingRepository bookingRepository = new BookingRepositoryImpl();
    @Override
    public void addNewBooking() {
        bookingRepository.addNewBooking();
    }

    @Override
    public void displayBooking() {
        bookingRepository.displayBooking();
    }
}
