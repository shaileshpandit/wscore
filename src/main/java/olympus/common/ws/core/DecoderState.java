package olympus.common.ws.core;

public enum DecoderState {
    // waiting for first packet
    HANDSHAKE,
    // waiting for start of new incoming message
    ACCEPTING_MESSAGES,
    // non websocket stream detected, will just proxy rest of data
    PROXY
}
