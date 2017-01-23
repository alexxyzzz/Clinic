package ru.lesson;

/**
 * Класс описывает клинику.
 */
class Clinic {

    /**
     * Клиенты клиники.
     */
    private Client[] clients;

    /**
     * Конструктор.
     *
     * @param clinicSize размер клиники
     */
    Clinic(final int clinicSize) {
        this.clients = new Client[clinicSize];
    }

    /**
     * Метод добавления клиента в клинику.
     *
     * @param position  позиция в массиве
     * @param addClient клиент
     */
    void addClient(final int position, final Client addClient) {
        this.clients[position] = addClient;
    }

    /**
     * Метод ищет клиентов по имени питомца.
     *
     * @param petName имя для поиска
     * @return клиенты
     */
    Client[] findClientByPetName(final String petName) {
        int arraySize = 0;
        for (int i = 0; i < this.clients.length; i++) {
            if (clients[i] != null
                    && clients[i].getPet().getPetName().equals(petName)) {
                arraySize++;
            }
        }
        Client[] foundNames = new Client[arraySize];
        int j = 0;
        for (int i = 0; i < this.clients.length; i++) {
            if (clients[i] != null
                    && clients[i].getPet().getPetName().equals(petName)) {
                foundNames[j] = clients[i];
                j++;
            }
        }
        return foundNames;
    }

    /**
     * Метод ищет клиентов по имени клиентов.
     *
     * @param findName имя
     * @return клиенты
     */
    Client[] findClientByName(final String findName) {
        int arraySize = 0;
        for (int i = 0; i < this.clients.length; i++) {
            if (clients[i] != null
                    && clients[i].getClientName().equals(findName)) {
                arraySize++;
            }
        }
        Client[] foundNames = new Client[arraySize];
        int j = 0;
        for (int i = 0; i < this.clients.length; i++) {
            if (clients[i] != null
                    && clients[i].getClientName().equals(findName)) {
                foundNames[j] = clients[i];
                j++;
            }
        }
        return foundNames;
    }

    /**
     * .
     * Метод меняет имя клиента.
     *
     * @param position      номер в списке
     * @param newClientName на это имя
     */
    void changeClientName(final int position, final String newClientName) {
        clients[position].changeClientName(newClientName);
    }

    /**
     * Методменяет имя питомца.
     *
     * @param clientPosition позиция клиента
     * @param newPetName     имя питомца
     */
    void changePetName(final int clientPosition, final String newPetName) {
        clients[clientPosition].getPet().changePetName(newPetName);
    }

    /**
     * Удаляет кдиента.
     * @param clientPosition позиция в списке
     */
    void deleteClient(final int clientPosition) {
        clients[clientPosition] = null;
    }

}


