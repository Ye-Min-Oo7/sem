# USE CASE: 2 Produce Salary Report (Department)

## CHARACTERISTIC INFORMATION

### Goal in Context
As an *HR Advisor*, I want *to produce a report of employee salaries in a specific department* so that *I can analyze departmental salary distribution*.

### Scope
Organization / Department.

### Level
Primary task.

### Primary Actor
HR Advisor.

### Preconditions
Database contains employee salary and department assignment records.

### Success End Condition
A report displaying employee salaries for the selected department is generated.

### Failed End Condition
No report is generated.

### Primary Actor Task
Select a department and request the salary report.

### Trigger
HR Advisor requests the report for a specific department.

## MAIN SUCCESS SCENARIO

1. HR Advisor selects a department and requests its salary report.
2. System queries the database for active employees assigned to that department.
3. System outputs a formatted list of department employees with their salaries.

## EXTENSIONS

2. **Department not found or invalid**:
    1. System informs the user that the specified department does not exist.