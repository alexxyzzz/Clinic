package ru.lesson;

/**
 * Кдасс реализует КотоПса.
 */
public class CatDog implements Pet {

    /**
     * Это кошка.
     */
    private final Cat cat;

    /**
     * Это собака.
     */
    private final Dog dog;

    /**
     * Это имя КотоПса.
     */
    private String name;

    /**
     * Конструктор.
     *
     * @param newCat кот
     * @param newDog пёс
     */
    CatDog(final Cat newCat, final Dog newDog) {
        this.cat = newCat;
        this.dog = newDog;
        this.name = this.cat.getPetName().concat(this.dog.getPetName());
    }

    /**
     * Получить имя котопса.
     *
     * @return имя котопса
     */
    @Override
    public final String getPetName() {
        return this.name;
    }

    /**
     * Метод меняет имя.
     *
     * @param newName новое имя
     */
    @Override
    public final void changePetName(final String newName) {
        this.name = newName;
    }

    /**
     * Метод делает звуки котопса.
     */
    @Override
    public  final void makeSound() {
        this.cat.makeSound();
        this.dog.makeSound();
    }
}
