package rpmoore.async.server;

import rpmoore.async.net.TcpHandler;

import java.net.InetSocketAddress;

public interface Server extends Runnable {
    public void registerHandler(final TcpHandler handler);
    public void run();
    public static Server getNewInstance(final InetSocketAddress socketAddress) {
        return new ServerImpl(socketAddress);
    }
}