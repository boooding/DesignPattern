package cs264.ex4.no1;

public class UseUDP extends TransportLayer{

    public UseUDP(Datagram datagram) {
        super(datagram);
    }

    public void addHeader() {
        System.out.println("add UDP header");
    }

    public void send() {
        addHeader();
        datagram.send();
    }
}
