package ru.lesson;

/**
 * Класс описывает клиента.
 */
class Client {

    /**
     * Имя клинета.
     */
    private String name;

    /**
     * Персональный номер клиента.
     */
    private String id;

    /**
     * Питомец клиента.
     */
    private Pet pet;

    /**
     * Конструктор для клиента.
     *
     * @param cliName имя
     * @param cliPet  питомцы
     */
    Client(final String cliName, final Pet cliPet) {
        this.name = cliName;
        this.pet = cliPet;
        this.id = String.valueOf(this.hashCode());
    }

    /**
     * Метод возвращает имя клиента.
     *
     * @return имя
     */
    String getClientName() {
        return name;
    }

    /**
     * Метод изменяет имя клиента.
     *
     * @param newName имя
     */
    void changeClientName(final String newName) {
        this.name = newName;
    }

    /**
     * Получить питомца.
     *
     * @return питомец
     */
    Pet getPet() {
        return pet;
    }

    /**
     * Поменять питомца.
     *
     * @param newPet питомец
     */
    public void changePet(final Pet newPet) {
        this.pet = newPet;
    }

    /**
     * Метод toString.
     *
     * @return строка
     */
    @Override
    public String toString() {
        return String.format("Клиент : %s. Питомец : %s. Id : %s",
                this.getClientName(), this.getPet().getPetName(), this.id);

    }
}
