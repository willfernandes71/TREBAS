class Employee:
    def __init__(self, name, experience):
        self.name = name
        self.experience = experience

    def calculate_salary(self, hours_worked):
        base_salary = 2000
        tax_rate = 0.13
        salary = base_salary * hours_worked

        if self.experience < 8:
            salary -= salary * tax_rate
            return salary

        elif self.experience > 15:
            bonus = 1000
            salary += bonus
            salary -= salary * tax_rate
            return salary

        else:
            medium_salary = base_salary * 1.5 * hours_worked
            medium_salary -= medium_salary * tax_rate
            return medium_salary


name = input("Enter employee name: ")
experience = int(input("Enter employee experience: "))
hours_worked = int(input("Enter total hours worked: "))

employee = Employee(name, experience)
salary = employee.calculate_salary(hours_worked)

print("Employee Name:", employee.name)
print("Employee Experience:", employee.experience)
print("Total Hours Worked:", hours_worked)
print("Salary:", salary)
