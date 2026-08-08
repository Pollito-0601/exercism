import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        LocalTime appointmentTime = appointmentDate.toLocalTime();
        String[] times = {"12:00", "18:00"};
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        LocalTime targetTime = LocalTime.parse(times[0], formatter);
        LocalTime afterNoonTime = LocalTime.parse(times[1], formatter);

        return (targetTime.isBefore(appointmentTime) || targetTime.equals(appointmentTime)) && afterNoonTime.isAfter(appointmentTime); 
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'You have an appointment on 'EEEE, MMMM d, yyyy, 'at' h:mm a.");
        return appointmentDate.format(formatter);
    }

    public LocalDate getAnniversaryDate() {
        int year = LocalDate.now().getYear();
        return LocalDate.of(year, 9, 15);
    }
}
