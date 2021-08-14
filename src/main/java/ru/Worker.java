package ru;

public class Worker {
    String Fullname;
    String Position;
    String Email;
    String Phonenumber;
    int Salary;
    int Age;

    public Worker(String Fullname, String Position, String Email, String Phonenumber, int Salary, int Age) {

        this.Fullname = Fullname;
        this.Position = Position;
        this.Email = Email;
        this.Phonenumber = Phonenumber;
        this.Salary = Salary;
        this.Age = Age;
    }
    void Info ()
    {
        System.out.println("ФИО: " + Fullname);
        System.out.println("Должность: " + Position);
        System.out.println("E-mail: " + Email);
        System.out.println("Номер телефона: " + Phonenumber);
        System.out.println("Зарплата: " + Salary);
        System.out.println("Возраст: " + Age);
    }
}


