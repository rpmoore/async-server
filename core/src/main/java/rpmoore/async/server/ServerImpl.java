package rpmoore.async.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rpmoore.async.net.TcpHandler;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.Selector;

public class ServerImpl implements Server {
    private static final Logger LOG = LoggerFactory.getLogger(ServerImpl.class);

    private final InetSocketAddress socketAddress;
    private TcpHandler handler;

    public ServerImpl(final InetSocketAddress socketAddress) {
        this.socketAddress = socketAddress;
        this.handler = null;
    }

    @Override
    public void registerHandler(final TcpHandler handler) {
        this.handler = handler;
    }

    @Override
    public void run() {
        try {
            final Selector selector = Selector.open();
            final AsynchronousServerSocketChannel asyncServerSocChannel =
                    AsynchronousServerSocketChannel.open().bind(socketAddress);

            
        } catch (final IOException e) {
            LOG.error("Encountered an un-recoverable error", e);
        }
    }
}
