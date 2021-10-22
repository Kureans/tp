package medbot.command.appointmentcommand;

import medbot.Appointment;
import medbot.Scheduler;
import medbot.Ui;
import medbot.command.Command;
import medbot.exceptions.MedBotException;

public class EditAppointmentCommand extends Command {
    int appointmentId = 0;
    Appointment appointment = null;

    public EditAppointmentCommand(int appointmentId, Appointment appointment) {
        this.appointmentId = appointmentId;
        this.appointment = appointment;
    }

    @Override
    public void execute(Scheduler scheduler, Ui ui) throws MedBotException {
        Appointment editedAppointment = scheduler.editAppointment(appointmentId, appointment);
        ui.printOutput("Appointment " + appointmentId + " changed to " + editedAppointment);
    }
}