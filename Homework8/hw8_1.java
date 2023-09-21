package Homework8;

public class hw8_1 {
    abstract static class Doctor {
        abstract void treat();
    }

    static class Surgeon extends Doctor {
        @Override
        void treat() {
            System.out.println("Хирург лечит пациента");
        }
    }

    static class Therapist extends Doctor {
        @Override
        void treat() {
            System.out.println("Терапевт лечит пациента");
        }
    }

    static class Dentist extends Doctor {
        @Override
        void treat() {
            System.out.println("Дантист лечит пациента");
        }
    }

    static class Patient {
        public int treatmentPlan;
        public Doctor doctor;

        public Patient(int treatmentPlan) {
            this.treatmentPlan = treatmentPlan;
        }

        public void setDoctor(Doctor doctor) {
            this.doctor = doctor;
        }

        public void treatPatient() {
            doctor.treat();
        }

        public int treatmentPlan() {
            return this.treatmentPlan;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Patient patient = new Patient(1);
            Doctor doctor;

            if (patient.treatmentPlan() == 1) {
                doctor = new Surgeon();
            } else if (patient.treatmentPlan() == 2) {
                doctor = new Dentist();
            } else {
                doctor = new Therapist();
            }
            patient.setDoctor(doctor);
            patient.treatPatient();
        }
    }
}
