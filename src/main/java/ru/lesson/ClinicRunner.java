package ru.lesson;

import java.util.Arrays;

/**
 * Класс запускает работу клиники.
 */
public final class ClinicRunner {

    /**
     * Конструктор.
     */
    private ClinicRunner() {

    }

    /**
     * Класс main.
     *
     * @param args входящие аргументы
     */
    public static void main(final String[] args) {

        final Clinic clinic = new Clinic(10);

        clinic.addClient(0, new Client("Василиса", new Dog("Палкан")));
        clinic.addClient(1, new Client("Иван", new Cat("Муся")));
        clinic.addClient(2, new Client("Тарас", new CatDog(
                new Cat("Мяуко"), new Dog("Гавыч"))));

        System.out.println(
                Arrays.toString(clinic.findClientByPetName("МяукоГавыч")));

        System.out.println(
                Arrays.toString(clinic.findClientByName("Василиса")));

        clinic.changeClientName(2, "Карабас");

        System.out.println(Arrays.toString(clinic.findClientByName("Карабас")));

        clinic.changePetName(2, "Котопёс");

        System.out.println(
                Arrays.toString(clinic.findClientByPetName("Котопёс")));

        clinic.deleteClient(2);

    }
}
