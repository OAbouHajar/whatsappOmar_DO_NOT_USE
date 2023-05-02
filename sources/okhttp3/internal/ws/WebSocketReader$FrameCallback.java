package okhttp3.internal.ws;

import okio.ByteString;

/* compiled from: XFMFile */
public interface WebSocketReader$FrameCallback {
    void onReadClose(int i2, String str);

    void onReadMessage(String str);

    void onReadMessage(ByteString byteString);

    void onReadPing(ByteString byteString);

    void onReadPong(ByteString byteString);
}
