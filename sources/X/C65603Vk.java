package X;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* renamed from: X.3Vk  reason: invalid class name and case insensitive filesystem */
public final class C65603Vk extends AnonymousClass3E3 {
    public int A00;
    public Uri A01;
    public DatagramSocket A02;
    public InetAddress A03;
    public InetSocketAddress A04;
    public MulticastSocket A05;
    public boolean A06;
    public final DatagramPacket A07;
    public final byte[] A08;

    public C65603Vk() {
        super(true);
        byte[] bArr = new byte[2000];
        this.A08 = bArr;
        this.A07 = new DatagramPacket(bArr, 0, 2000);
    }

    public Uri AGo() {
        return this.A01;
    }

    public long AZr(AnonymousClass3AL r4) {
        DatagramSocket datagramSocket;
        Uri uri = r4.A04;
        this.A01 = uri;
        String host = uri.getHost();
        int port = this.A01.getPort();
        A01();
        try {
            InetAddress byName = InetAddress.getByName(host);
            this.A03 = byName;
            this.A04 = new InetSocketAddress(byName, port);
            if (this.A03.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.A04);
                this.A05 = multicastSocket;
                multicastSocket.joinGroup(this.A03);
                datagramSocket = this.A05;
            } else {
                datagramSocket = new DatagramSocket(this.A04);
            }
            this.A02 = datagramSocket;
            try {
                datagramSocket.setSoTimeout(8000);
                this.A06 = true;
                A03(r4);
                return -1;
            } catch (SocketException e2) {
                throw new AnonymousClass409(e2);
            }
        } catch (IOException e3) {
            throw new AnonymousClass409(e3);
        }
    }

    public void close() {
        this.A01 = null;
        MulticastSocket multicastSocket = this.A05;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.A03);
            } catch (IOException unused) {
            }
            this.A05 = null;
        }
        DatagramSocket datagramSocket = this.A02;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.A02 = null;
        }
        this.A03 = null;
        this.A04 = null;
        this.A00 = 0;
        if (this.A06) {
            this.A06 = false;
            A00();
        }
    }

    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            try {
                DatagramSocket datagramSocket = this.A02;
                DatagramPacket datagramPacket = this.A07;
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.A00 = length;
                A02(length);
            } catch (IOException e2) {
                throw new AnonymousClass409(e2);
            }
        }
        int length2 = this.A07.getLength();
        int i4 = this.A00;
        int min = Math.min(i4, i3);
        System.arraycopy(this.A08, length2 - i4, bArr, i2, min);
        this.A00 -= min;
        return min;
    }
}
