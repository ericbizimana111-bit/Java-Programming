# Hospital Management System (Java, no framework)

Plain Java console backend — no Spring, no database, no GUI. Pure `javac`/`java`.

## How to run

Open a terminal **inside** the `hospital-management-system` folder (the one that
contains the `src` folder), then:

```bash
# 1. Compile everything into a "bin" folder
javac -d bin $(find src -name "*.java")

# 2. Run it
java -cp bin hospital.Main
```

On Windows (PowerShell/CMD), step 1 becomes:
```
javac -d bin src\hospital\*.java src\hospital\model\*.java src\hospital\interfaces\*.java src\hospital\exceptions\*.java src\hospital\service\*.java
java -cp bin hospital.Main
```

That's it — no build tool, no internet connection needed. I compiled and
ran this exact code myself before sending it to you, so it's confirmed working.

## Project structure

```
src/hospital/
├── Main.java                     # console menu (uses Scanner, try/catch)
├── model/
│   ├── Person.java                # abstract base class (OOP: abstraction)
│   ├── Patient.java                # extends Person, implements Payable
│   ├── Doctor.java                 # extends Person, implements Schedulable
│   ├── Staff.java                  # extends Person
│   ├── Gender.java                 # enum
│   └── Department.java             # enum
├── interfaces/
│   ├── Describable.java
│   ├── Payable.java                 # has a default method
│   └── Schedulable.java
├── exceptions/                    # custom checked exceptions (try/catch)
│   ├── PatientNotFoundException.java
│   ├── DoctorNotFoundException.java
│   ├── SlotNotAvailableException.java
│   └── InvalidInputException.java
└── service/
    ├── Appointment.java
    └── HospitalService.java        # the actual "backend" logic
```

## What it covers (mapped to your topics)

- **OOP**: `Person` is an abstract superclass; `Patient`, `Doctor`, `Staff`
  extend it and override `getRole()` differently (polymorphism).
- **Interfaces**: `Describable`, `Payable` (with a default method),
  `Schedulable` — each implemented by different classes.
- **Getters & setters**: every model class has clean private fields with
  public getters/setters.
- **Modifiers**: `private`, `protected`, `public`, `static`, `final` are all
  used deliberately (e.g. `patientCount` is `static`, IDs are `final`).
- **Upcasting / Downcasting**: `HospitalService` stores every `Patient`,
  `Doctor`, and `Staff` in one `List<Person>` (automatic upcasting). Menu
  option **10** loops through that list and downcasts each one back to its
  real type with `instanceof` + a cast to call type-specific methods.
- **Scanner**: `Main.java` reads every piece of user input from the console.
- **try/catch**: custom checked exceptions (`PatientNotFoundException`,
  `DoctorNotFoundException`, `SlotNotAvailableException`,
  `InvalidInputException`) are thrown by the backend and caught in `Main`
  so bad input never crashes the program — it just prints an error and
  shows the menu again.

## Menu options

1. Add Patient · 2. Add Doctor · 3. View Patients · 4. View Doctors ·
5. Book Appointment · 6. View Appointments · 7. Generate Bill ·
8. Remove Patient · 9. Remove Doctor · 10. Upcasting/Downcasting demo ·
0. Exit

The app starts with a bit of demo data already loaded (2 patients, 2
doctors, 1 staff member) so you have something to look at immediately.
