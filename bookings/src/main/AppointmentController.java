package com.example.bookings;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class AppointmentController {

    this.repository = repository;
}

// route to calendar view from my server pagesfrom url 8080/calendar
@GetMapping("/calendar")
public String showCalendar(Model model) {
    // a. fetch the appointments from the database
    List<Appointment> upcoming = repository.findAll();

    // b. pass the data to the html template
    model.addAttribute("appointments", upcoming);

    // c. return the html file with the full webpage
    return "calendar";
}