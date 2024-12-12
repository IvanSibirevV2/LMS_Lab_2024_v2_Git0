import java.util.*;

class Client {
    String fullName;
    String address;
    double discount;

    public Client(String fullName, String address, double discount) {
        this.fullName = fullName;
        this.address = address;
        this.discount = discount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Client)) return false;
        Client client = (Client) obj;
        return fullName.equals(client.fullName) && address.equals(client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, address);
    }

    @Override
    public String toString() {
        return fullName + ", " + address + ", Скидка: " + discount;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        
        // Пример добавления клиентов
        clients.add(new Client("Иванов Иван Иванович", "г. Москва, ул. Ленина, д. 1", 10));
        clients.add(new Client("Петров Петр Петрович", "г. Москва, ул. Пушкина, д. 2", 15));
        clients.add(new Client("Иванов Иван Иванович", "г. Москва, ул. Ленина, д. 1", 10)); // Дубликат
        clients.add(new Client("Сидоров Сидор Сидорович", "г. Москва, ул. Чехова, д. 3", 20));
        clients.add(new Client("Петров Петр Петрович", "г. Москва, ул. Пушкина, д. 2", 15)); // Дубликат

        // Удаление дубликатов
        Set<Client> uniqueClients = new HashSet<>(clients);

        // Вывод уникальных клиентов
        System.out.println("Уникальные клиенты:");
        for (Client client : uniqueClients) {
            System.out.println(client);
        }
    }
}
