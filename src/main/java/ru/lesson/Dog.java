package ru.lesson;

/**
 * Класс описывает собаку.
 */
final class Dog implements Pet {

    /**
     * Собачье имя.
     */
    private String name;

    /**
     * Конструктор для собаки.
     *
     * @param dogName имя собаки
     */
    Dog(final String dogName) {
        this.name = dogName;
    }

    /**
     * Метод возвращает имя.
     *
     * @return имя собаки
     */
    public String getPetName() {
        return this.name;
    }

    /**
     * Метод меняет имя.
     *
     * @param newName новое имя собаки
     */
    public void changePetName(final String newName) {
        this.name = newName;
    }

    /**
     * Метод реализует лай.
     */
    @Override
    public void makeSound() {
        System.out.println("Gav-gav");

    }
}
