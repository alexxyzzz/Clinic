package ru.lesson;

/**
 * Интерфейс описывает действия питомца.
 */
interface Pet {

    /**
     * Метод для получения имени питомца.
     *
     * @return имя питомца
     */
    String getPetName();

    /**
     * Метод меняет имя у питомца.
     *
     * @param newName новое имя
     */
    void changePetName(String newName);

    /**
     * Метод реализует звук питомца.
     */
    void makeSound();

}
