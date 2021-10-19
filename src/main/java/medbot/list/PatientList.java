package medbot.list;

import medbot.exceptions.MedBotException;
import medbot.list.PersonList;
import medbot.person.Patient;

public class PatientList extends PersonList {

    public int addPerson(Patient patient) {
        return super.addPerson(patient);
    }

    public String getPersonInfo(int patientId) throws MedBotException {
        return super.getPersonInfo(patientId);
    }

    public void editPerson(int patientId, Patient newPatientData) throws MedBotException {
        super.editPerson(patientId, newPatientData);
    }

    public void deletePerson(int patientId) throws MedBotException {
        super.deletePerson(patientId);
    }

    public String listPersons() {
        return super.listPersons();
    }

    private String getNoPatientIdErrorMessage(int patientId) {
        return "No Patient with ID " + super.getNoPersonIdErrorMessage(patientId);
    }

    public void addPersonFromStorage(Patient patient) {
        super.addPersonFromStorage(patient);
    }
}