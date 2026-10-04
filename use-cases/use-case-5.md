# USE CASE: 5 Add New Employee

## CHARACTERISTIC INFORMATION

### Goal in Context
As an *HR Advisor*, I want *to add a new employee record* so that *the system maintains accurate employee information*.

### Scope
HR System.

### Level
Primary task.

### Primary Actor
HR Advisor.

### Preconditions
HR Advisor is authenticated and has required data (name, birth date, gender, hire date, role, salary, department).

### Success End Condition
A new employee record is successfully created in the database.

### Failed End Condition
Employee record is not created.

### Primary Actor Task
Enter new employee details and submit.

### Trigger
HR Advisor submits a new employee profile.

## MAIN SUCCESS SCENARIO

1. HR Advisor enters new employee details.
2. System validates the input data.
3. System generates a unique employee ID and inserts the record into the database.
4. System confirms successful creation.

## EXTENSIONS

2. **Invalid input data**:
    1. System displays validation errors and prompts the HR Advisor to correct the details.