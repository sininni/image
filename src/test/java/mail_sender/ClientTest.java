package mail_sender;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private Client client1;
    private Client client2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        client1 = new Client("Mary", "mary@qmail.com", Gender.FEMALE, 18);
        client2 = new Client("John", "john@gmail.com", Gender.MALE, 18);
    }

    @org.junit.jupiter.api.Test
    void getId() {
        assertEquals(client1.getId(), 0);
        assertEquals(client2.getId(), 1);
    }
}