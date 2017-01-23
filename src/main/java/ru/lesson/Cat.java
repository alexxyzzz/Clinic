package ru.lesson;

/**
 * Класс описывает кота.
 */
final class Cat implements Pet {

    /**
     * Кошачье имя.
     */
    private String name;

    /**
     * Конструктор для кота.
     *
     * @param catName имя кота
     */
    Cat(final String catName) {
        this.name = catName;
    }

    /**
     * Метод возвращает имя.
     *
     * @return имя кошки
     */
    public String getPetName() {
        return this.name;
    }

    /**
     * Метод меняет имя.
     *
     * @param newName новое имя кошки
     */
    public void changePetName(final String newName) {
        this.name = newName;
    }

    /**
     * Метод реализует мяуканье.
     */
    @Override
    public void makeSound() {
        System.out.println("Mjay-mjay");
    }
}
