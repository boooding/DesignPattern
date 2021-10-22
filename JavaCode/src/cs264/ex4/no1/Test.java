package cs264.ex4.no1;

public class Test {
    public static void main(String[] args) {
        Datagram datagram = new AppDatagram();
        datagram.send();
        System.out.println("");
        TransportLayer tcpData = new UseTCP(datagram);
        tcpData.send();
        System.out.println("");
        TransportLayer udpData = new UseUDP(datagram);
        udpData.send();
    }
}
