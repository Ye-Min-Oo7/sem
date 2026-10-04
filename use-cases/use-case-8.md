# USE CASE: 8 Delete Employee Record

## CHARACTERISTIC INFORMATION

### Goal in Context
As an *HR Advisor*, I want *to remove or deactivate an employee record* so that *former staff are no longer active in the system*.

### Scope
HR System.

### Level
Primary task.

### Primary Actor
HR Advisor.

### Preconditions
The target employee record exists in the database.

### Success End Condition
The employee record is marked as inactive or removed from the database.

### Failed End Condition
No changes are made to the employee record.

### Primary Actor Task
Select employee record and confirm deletion/deactivation.

### Trigger
HR Advisor requests deletion of an employee record.

## MAIN SUCCESS SCENARIO

1. HR Advisor selects an employee and requests deletion.
2. System prompts for confirmation.
3. HR Advisor confirms the action.
4. System updates the database to mark the record as inactive or removed.
5. System confirms deletion.

## EXTENSIONS

3. **Deletion canceled**:
    1. HR Advisor cancels prompt; system aborts deletion.