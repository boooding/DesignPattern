package cs264.ex4.no1;

public class TransportLayer implements Datagram{
    protected Datagram datagram;

    @Override
    public void send() {
        datagram.send();
    }

    public TransportLayer(Datagram datagram) {
        this.datagram = datagram;
    }
}
