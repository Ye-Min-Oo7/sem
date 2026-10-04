# USE CASE: 7 Update Employee Record

## CHARACTERISTIC INFORMATION

### Goal in Context
As an *HR Advisor*, I want *to update an existing employee's details* so that *the system records current information*.

### Scope
HR System.

### Level
Primary task.

### Primary Actor
HR Advisor.

### Preconditions
The target employee record exists in the database.

### Success End Condition
The employee record is updated in the database.

### Failed End Condition
Employee record remains unchanged.

### Primary Actor Task
Modify employee details and save changes.

### Trigger
HR Advisor submits updated employee details.

## MAIN SUCCESS SCENARIO

1. HR Advisor selects an employee record and edits details (e.g., salary, title, department).
2. System validates updated inputs.
3. System updates the employee entry in the database.
4. System confirms update success.

## EXTENSIONS

2. **Validation failure**:
    1. System displays error messages and highlights invalid fields.