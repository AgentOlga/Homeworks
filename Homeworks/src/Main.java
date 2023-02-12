import Exemplar.*;
import Exemplar.Exception.InCorrectArgumentException;
import Exemplar.Exception.TaskNotFoundException;
import ServiceTasks.TaskService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final TaskService taskService = new TaskService();
    private static final Pattern DATA_TIME_PATTERN = Pattern.compile("\\d{2}.\\d{2}.\\d{4} \\d{2}\\:\\d{2}");
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    private static final Pattern DATA_PATTERN = Pattern.compile("\\d{2}.\\d{2}.\\d{4}");
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useDelimiter("\\n")) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            try {
                                inputTask(scanner);
                            } catch (InCorrectArgumentException ex) {

                            }

                            break;
                        case 2:
                            removeTask(scanner);
                            break;
                        case 3:
                           printTasksByDay(scanner);
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static String inputTaskTitle(Scanner scanner) {
        System.out.print("Введите название задачи: ");
        String title = scanner.next();
        if (title.isBlank()) {
            System.out.println("Необходимо ввести название задачи!");
            scanner.close();
        }
        return title;
    }

    private static String inputTaskDescription(Scanner scanner) {
        System.out.print("Введите описание задачи: ");
        String description = scanner.next();
        if (description.isBlank()) {
            System.out.println("Необходимо ввести описание задачи!");
            scanner.close();
        }
        return description;
    }

    private static TaskType inputTaskType(Scanner scanner) {
        System.out.println(" Введите тип задачи (1 - личная 2 - рабочая):");
        TaskType type = null;

        int taskTypeChoice = scanner.nextInt();

        switch (taskTypeChoice) {
            case 1:
                type = TaskType.PERSONAL;
                break;
            case 2:
                type = TaskType.WORK;
                break;
            default:
                System.out.println("Некорректный тип задачи");
                scanner.close();
        }
        return type;
    }

    private static LocalDateTime inputTaskTime(Scanner scanner) {
        System.out.println("Введите дату и время выполнения задачи в формате dd.mm.yyyy hh:mm");

        if (scanner.hasNext(DATA_TIME_PATTERN)) {
            String dateTime = scanner.next(DATA_TIME_PATTERN);
            return LocalDateTime.parse(dateTime, DATE_TIME_FORMATTER);
        } else {
            System.out.println("Введите дату и время выполнения задачи в формате dd.mm.yyyy hh:mm");
            scanner.close();
        }
        return null;
    }

    private static int inputRepeatability(Scanner scanner) {
        System.out.println("Введите повторяемость  задачи (1 - однократно,2 - каждый день, 3 - каждую неделю, 4 - каждый месяц, 5 - каждый год");
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Введите количество раз повторяемости задачи");
            scanner.close();
        }
        return -1;
    }

    private static void inputTask(Scanner scanner) throws InCorrectArgumentException {
        scanner.useDelimiter("\n");


        String title = inputTaskTitle(scanner);

        String description = inputTaskDescription(scanner);
        TaskType type = inputTaskType(scanner);
        LocalDateTime taskTime = inputTaskTime(scanner);
        int repeatability = inputRepeatability(scanner);
        createTask(title, description, type, taskTime, repeatability);

    }

        private static void createTask (String title, String description, TaskType type, LocalDateTime taskTime, int repeatability) {
            Task task = null;
            try {
                switch (repeatability) {
                    case 1:
                        task = new OneTimeTask(title, description, type, taskTime);
                        break;
                    case 2:
                        task = new DailyTask(title, description, type, taskTime);
                        break;
                    case 3:
                        task = new WeeklyTask(title, description, type, taskTime);
                        break;
                    case 4:
                        task = new MonthlyTask(title, description, type, taskTime);
                        break;
                    case 5:
                        task = new YearlyTask(title, description, type, taskTime);
                        break;
                    default:
                        System.out.println("Повторяемость задачи введена некорректно.");

                }
            } catch (InCorrectArgumentException e) {
                System.out.println(e.getMessage);
            }
            if (task != null) {
                taskService.add(task);
                System.out.println("Задача добавлена.");
            } else {
                System.out.println("Введены некорректные данные для задачи");
            }
        }

            private static void removeTask (Scanner scanner){
                System.out.println("Введите id задачи для удаления задачи");
                int id = scanner.nextInt();

                try {
                    taskService.remove(id);
                } catch (TaskNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            }
            private static void printTasksByDay (Scanner scanner){
                System.out.println("Введите дату выполнения задачи в формате dd.mm.yyyy");
                if (scanner.hasNext(DATA_PATTERN)) {
                    String dateTime = scanner.next(DATA_PATTERN);
                    LocalDate inputData = LocalDate.parse(dateTime, DATE_FORMATTER);

                    Collection<Task> tasksByDay = taskService.getAllByDate(inputData);
                    for (Task task : tasksByDay) {
                        System.out.println(task);
                    }
                } else {
                    System.out.println("Wrong data format");
                    //System.out.println("Введите дату выполнения задачи в формате dd.mm.yyyy ");
                    //scanner.close();
                }


            }
            private static void printMenu () {
                System.out.println("1. Добавить задачу 2. Удалить задачу 3. Получить задачу на указанный день 0. Выход");
            }

}

