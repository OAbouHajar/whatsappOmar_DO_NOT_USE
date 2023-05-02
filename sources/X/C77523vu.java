package X;

import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;

/* renamed from: X.3vu  reason: invalid class name and case insensitive filesystem */
public class C77523vu extends C106065Cj {
    public final Socket A00;
    public final boolean A01;

    public C77523vu(C106045Ch r3, String str, Socket socket, int i2, boolean z2) {
        if (socket.isConnected()) {
            this.A00 = socket;
            this.A05 = r3;
            this.A01 = z2;
            this.A0B = str;
            this.A00 = i2;
            A07();
            return;
        }
        throw new SocketException("Socket is not connected.");
    }

    public void bind(SocketAddress socketAddress) {
        throw AnonymousClass3K3.A0e("Underlying tls13 is already connected.");
    }

    public void connect(SocketAddress socketAddress) {
        throw AnonymousClass3K3.A0e("Underlying tls13 is already connected.");
    }

    public void connect(SocketAddress socketAddress, int i2) {
        throw AnonymousClass3K3.A0e("Underlying tls13 is already connected.");
    }

    public InetAddress getInetAddress() {
        return this.A00.getInetAddress();
    }

    public boolean getKeepAlive() {
        return this.A00.getKeepAlive();
    }

    public InetAddress getLocalAddress() {
        return this.A00.getLocalAddress();
    }

    public int getLocalPort() {
        return this.A00.getLocalPort();
    }

    public SocketAddress getLocalSocketAddress() {
        return this.A00.getLocalSocketAddress();
    }

    public boolean getOOBInline() {
        return this.A00.getOOBInline();
    }

    public int getPort() {
        return this.A00.getPort();
    }

    public int getReceiveBufferSize() {
        return this.A00.getReceiveBufferSize();
    }

    public SocketAddress getRemoteSocketAddress() {
        return this.A00.getRemoteSocketAddress();
    }

    public boolean getReuseAddress() {
        return this.A00.getReuseAddress();
    }

    public int getSendBufferSize() {
        return this.A00.getSendBufferSize();
    }

    public int getSoLinger() {
        return this.A00.getSoLinger();
    }

    public int getSoTimeout() {
        return this.A00.getSoTimeout();
    }

    public boolean getTcpNoDelay() {
        return this.A00.getTcpNoDelay();
    }

    public int getTrafficClass() {
        return this.A00.getTrafficClass();
    }

    public boolean isBound() {
        return this.A00.isBound();
    }

    public boolean isClosed() {
        return this.A00.isClosed();
    }

    public boolean isConnected() {
        return this.A00.isConnected();
    }

    public boolean isInputShutdown() {
        return this.A00.isInputShutdown();
    }

    public boolean isOutputShutdown() {
        return this.A00.isOutputShutdown();
    }

    public void setKeepAlive(boolean z2) {
        this.A00.setKeepAlive(z2);
    }

    public void setReceiveBufferSize(int i2) {
        this.A00.setReceiveBufferSize(i2);
    }

    public void setReuseAddress(boolean z2) {
        this.A00.setReuseAddress(z2);
    }

    public void setSendBufferSize(int i2) {
        this.A00.setSendBufferSize(i2);
    }

    public void setSoLinger(boolean z2, int i2) {
        this.A00.setSoLinger(z2, i2);
    }

    public void setSoTimeout(int i2) {
        this.A00.setSoTimeout(i2);
    }

    public void setTcpNoDelay(boolean z2) {
        this.A00.setTcpNoDelay(z2);
    }

    public void setTrafficClass(int i2) {
        this.A00.setTrafficClass(i2);
    }
}
