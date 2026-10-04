# USE CASE: 4 Produce Salary Report (Role)

## CHARACTERISTIC INFORMATION

### Goal in Context
As an *HR Advisor*, I want *to produce a report of employee salaries filtered by job title/role* so that *I can analyze pay equality across specific roles*.

### Scope
Organization.

### Level
Primary task.

### Primary Actor
HR Advisor.

### Preconditions
Database contains employee salary and job title records.

### Success End Condition
A report displaying employee salaries for the specified job role is generated.

### Failed End Condition
No report is generated.

### Primary Actor Task
Select a job title and request the salary report.

### Trigger
HR Advisor requests the report for a specific job title.

## MAIN SUCCESS SCENARIO

1. HR Advisor selects a job title and requests the salary report.
2. System queries the database for active employees holding that job title.
3. System outputs a formatted list of matching employees with their salaries.

## EXTENSIONS

2. **Job title not found**:
    1. System informs the user that no records match the specified job title.