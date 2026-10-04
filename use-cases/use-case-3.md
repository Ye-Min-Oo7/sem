# USE CASE: 3 Produce Salary Report (My Department)

## CHARACTERISTIC INFORMATION

### Goal in Context
As a *Department Manager*, I want *to produce a report of employee salaries in my own department* so that *I can review my department's compensation*.

### Scope
Department.

### Level
Primary task.

### Primary Actor
Department Manager.

### Preconditions
Database contains employee salary and department manager assignment records.

### Success End Condition
A report displaying employee salaries for the manager's assigned department is generated.

### Failed End Condition
No report is generated.

### Primary Actor Task
Request the salary report for the managed department.

### Trigger
Department Manager requests the report.

## MAIN SUCCESS SCENARIO

1. Department Manager requests the salary report for their department.
2. System identifies the manager's department.
3. System queries the database for active employees in that department.
4. System outputs a formatted list of employees with their salaries.

## EXTENSIONS

2. **Manager department unassigned**:
    1. System alerts the user that no department is linked to their account.