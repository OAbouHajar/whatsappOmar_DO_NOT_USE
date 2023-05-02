package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: X.5Ci  reason: invalid class name and case insensitive filesystem */
public class C106055Ci extends SSLSocket {
    public final int A00;
    public final int A01;
    public final C17130ua A02;
    public final SSLSocket A03;

    public C106055Ci(C17130ua r1, SSLSocket sSLSocket, int i2, int i3) {
        this.A00 = i2;
        this.A03 = sSLSocket;
        this.A02 = r1;
        this.A01 = i3;
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A03.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public void bind(SocketAddress socketAddress) {
        this.A03.bind(socketAddress);
    }

    public synchronized void close() {
        this.A03.close();
    }

    public void connect(SocketAddress socketAddress) {
        this.A03.connect(socketAddress);
    }

    public void connect(SocketAddress socketAddress, int i2) {
        this.A03.connect(socketAddress, i2);
    }

    public SocketChannel getChannel() {
        return this.A03.getChannel();
    }

    public boolean getEnableSessionCreation() {
        return this.A03.getEnableSessionCreation();
    }

    public String[] getEnabledCipherSuites() {
        return this.A03.getEnabledCipherSuites();
    }

    public String[] getEnabledProtocols() {
        return this.A03.getEnabledProtocols();
    }

    public InetAddress getInetAddress() {
        return this.A03.getInetAddress();
    }

    public InputStream getInputStream() {
        return new C38271qW(this.A02, this.A03.getInputStream(), Integer.valueOf(this.A00), Integer.valueOf(this.A01));
    }

    public boolean getKeepAlive() {
        return this.A03.getKeepAlive();
    }

    public InetAddress getLocalAddress() {
        return this.A03.getLocalAddress();
    }

    public int getLocalPort() {
        return this.A03.getLocalPort();
    }

    public SocketAddress getLocalSocketAddress() {
        return this.A03.getLocalSocketAddress();
    }

    public boolean getNeedClientAuth() {
        return this.A03.getNeedClientAuth();
    }

    public boolean getOOBInline() {
        return this.A03.getOOBInline();
    }

    public OutputStream getOutputStream() {
        return new C37811pm(this.A02, this.A03.getOutputStream(), Integer.valueOf(this.A00), Integer.valueOf(this.A01));
    }

    public int getPort() {
        return this.A03.getPort();
    }

    public synchronized int getReceiveBufferSize() {
        return this.A03.getReceiveBufferSize();
    }

    public SocketAddress getRemoteSocketAddress() {
        return this.A03.getRemoteSocketAddress();
    }

    public boolean getReuseAddress() {
        return this.A03.getReuseAddress();
    }

    public SSLParameters getSSLParameters() {
        return this.A03.getSSLParameters();
    }

    public synchronized int getSendBufferSize() {
        return this.A03.getSendBufferSize();
    }

    public SSLSession getSession() {
        return this.A03.getSession();
    }

    public int getSoLinger() {
        return this.A03.getSoLinger();
    }

    public synchronized int getSoTimeout() {
        return this.A03.getSoTimeout();
    }

    public String[] getSupportedCipherSuites() {
        return this.A03.getSupportedCipherSuites();
    }

    public String[] getSupportedProtocols() {
        return this.A03.getSupportedProtocols();
    }

    public boolean getTcpNoDelay() {
        return this.A03.getTcpNoDelay();
    }

    public int getTrafficClass() {
        return this.A03.getTrafficClass();
    }

    public boolean getUseClientMode() {
        return this.A03.getUseClientMode();
    }

    public boolean getWantClientAuth() {
        return this.A03.getWantClientAuth();
    }

    public boolean isBound() {
        return this.A03.isBound();
    }

    public boolean isClosed() {
        return this.A03.isClosed();
    }

    public boolean isConnected() {
        return this.A03.isConnected();
    }

    public boolean isInputShutdown() {
        return this.A03.isInputShutdown();
    }

    public boolean isOutputShutdown() {
        return this.A03.isOutputShutdown();
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A03.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public void sendUrgentData(int i2) {
        this.A03.sendUrgentData(i2);
    }

    public void setEnableSessionCreation(boolean z2) {
        this.A03.setEnableSessionCreation(z2);
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.A03.setEnabledCipherSuites(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        String[] strArr2;
        SSLSocket sSLSocket = this.A03;
        int length = strArr.length;
        if (length >= 1) {
            if (length != 1) {
                strArr2 = strArr;
            } else if ("SSLv3".equals(strArr[0])) {
                strArr2 = sSLSocket.getSupportedProtocols();
            }
            ArrayList A0u = AnonymousClass000.A0u();
            for (String str : strArr2) {
                if (!"SSLv3".equals(str)) {
                    A0u.add(str);
                }
            }
            if (length != A0u.size() || length == 1) {
                Log.i(AnonymousClass000.A0h(TextUtils.join(", ", strArr), AnonymousClass000.A0q("accounting-socket/set-enabled-protocols/current-list: ")));
                Log.i(AnonymousClass000.A0h(TextUtils.join(", ", A0u), AnonymousClass000.A0q("accounting-socket/set-enabled-protocols/modified-list: ")));
            } else {
                TextUtils.join(", ", strArr);
                TextUtils.join(", ", A0u);
            }
            if (!A0u.isEmpty()) {
                strArr = (String[]) A0u.toArray(new String[0]);
            }
            sSLSocket.setEnabledProtocols(strArr);
        }
        Log.i(AnonymousClass000.A0h(TextUtils.join(", ", strArr), AnonymousClass000.A0q("accounting-socket/set-enabled-protocols/current-list: ")));
        sSLSocket.setEnabledProtocols(strArr);
    }

    public void setKeepAlive(boolean z2) {
        this.A03.setKeepAlive(z2);
    }

    public void setNeedClientAuth(boolean z2) {
        this.A03.setNeedClientAuth(z2);
    }

    public void setOOBInline(boolean z2) {
        this.A03.setOOBInline(z2);
    }

    public void setPerformancePreferences(int i2, int i3, int i4) {
        this.A03.setPerformancePreferences(i2, i3, i4);
    }

    public synchronized void setReceiveBufferSize(int i2) {
        this.A03.setReceiveBufferSize(i2);
    }

    public void setReuseAddress(boolean z2) {
        this.A03.setReuseAddress(z2);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        this.A03.setSSLParameters(sSLParameters);
    }

    public synchronized void setSendBufferSize(int i2) {
        this.A03.setSendBufferSize(i2);
    }

    public void setSoLinger(boolean z2, int i2) {
        this.A03.setSoLinger(z2, i2);
    }

    public synchronized void setSoTimeout(int i2) {
        this.A03.setSoTimeout(i2);
    }

    public void setTcpNoDelay(boolean z2) {
        this.A03.setTcpNoDelay(z2);
    }

    public void setTrafficClass(int i2) {
        this.A03.setTrafficClass(i2);
    }

    public void setUseClientMode(boolean z2) {
        this.A03.setUseClientMode(z2);
    }

    public void setWantClientAuth(boolean z2) {
        this.A03.setWantClientAuth(z2);
    }

    public void shutdownInput() {
        this.A03.shutdownInput();
    }

    public void shutdownOutput() {
        this.A03.shutdownOutput();
    }

    public void startHandshake() {
        try {
            this.A03.startHandshake();
        } catch (SSLHandshakeException | SSLProtocolException e2) {
            StringBuilder A0r = AnonymousClass000.A0r("accounting-socket-factory/enabled suites ");
            SSLSocket sSLSocket = this.A03;
            A0r.append(Arrays.toString(sSLSocket.getEnabledCipherSuites()));
            A0r.append(" supported suites ");
            Log.e(AnonymousClass000.A0h(Arrays.toString(sSLSocket.getSupportedCipherSuites()), A0r));
            throw e2;
        }
    }

    public String toString() {
        return this.A03.toString();
    }
}
