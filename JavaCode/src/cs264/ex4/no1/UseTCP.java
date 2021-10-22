package cs264.ex4.no1;

public class UseTCP extends TransportLayer{

    public UseTCP(Datagram datagram) {
        super(datagram);
    }

    public void addHeader() {
        System.out.println("add TCP header");
    }

    public void send() {
        addHeader();
        datagram.send();
    }
}
