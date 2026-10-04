# USE CASE: 1 Produce Salary Report (All)

## CHARACTERISTIC INFORMATION

### Goal in Context
As an *HR Advisor*, I want *to produce a report of all employee salaries* so that *I can review salary distributions across the organization*.

### Scope
Organization.

### Level
Primary task.

### Primary Actor
HR Advisor.

### Preconditions
Database contains employee salary records.

### Success End Condition
A report displaying all employee salaries is generated.

### Failed End Condition
No report is generated.

### Primary Actor Task
Request salary report for all employees.

### Trigger
HR Advisor requests the report.

## MAIN SUCCESS SCENARIO

1. HR Advisor requests a salary report for all employees.
2. System queries the database for all active employee salary details.
3. System outputs a formatted list of employees with their salaries.

## EXTENSIONS

2. **Database unavailable**:
    1. System alerts the user that the database connection failed.