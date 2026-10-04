# USE CASE: 6 View Employee Record

## CHARACTERISTIC INFORMATION

### Goal in Context
As an *HR Advisor*, I want *to view a specific employee's complete record* so that *I can review individual details*.

### Scope
HR System.

### Level
Primary task.

### Primary Actor
HR Advisor.

### Preconditions
Database contains employee records.

### Success End Condition
The full details of the specified employee are displayed.

### Failed End Condition
No employee record is displayed.

### Primary Actor Task
Enter or select an employee ID to view details.

### Trigger
HR Advisor requests to view an employee record.

## MAIN SUCCESS SCENARIO

1. HR Advisor inputs an employee ID.
2. System queries the database for matching employee details (personal data, title, salary, department).
3. System displays the complete employee record.

## EXTENSIONS

2. **Employee ID not found**:
    1. System informs the user that no employee exists with the provided ID.