package ru;

public class Main {

    public static void main(String[] args) {

        Worker[] workers = {
                new Worker(
                        "Котеев Котей Котеевич",
                        "Директор",
                        "testtest123@gmail.com",
                        "123456",
                        280000,
                        41),
                new Worker(
                        "Ягода Виктория Викторовна",
                        "Менеджер",
                        "testtest123@gmail.com",
                        "123456",
                        180000,
                        37),
                new Worker(
                        "Петров Константин Иванович",
                        "Разработчик",
                        "testtest123@gmail.com",
                        "123456",
                        200000,
                        30),
                new Worker(
                        "Кошкина Людмила Гермогеновна",
                        "Дизайнер",
                        "testtest123@gmail.com",
                        "123456",
                        189000,
                        29),
                new Worker(
                        "Кошева Коша Кокошевна",
                        "Тестировщик",
                        "testtest123@gmail.com",
                        "12345",
                        100000,
                        31),
            };
        int minimalAge = 40;
        for (Worker worker : workers)
        {
            if (worker.Age >minimalAge)
            {
                worker.Info();
                System.out.println();
            }
        }
    }
}

