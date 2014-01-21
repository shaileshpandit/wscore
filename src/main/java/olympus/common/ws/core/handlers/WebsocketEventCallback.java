package olympus.common.ws.core.handlers;

public interface WebsocketEventCallback {
    public void close(int reasonCode, String reasonDescription);

    public void ping(byte[] msg);

    public void pong(byte[] msg);

    public void message(byte[] msg);

    public void message(String msg);

}
