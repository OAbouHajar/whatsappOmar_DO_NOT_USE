package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: X.5Cj  reason: invalid class name and case insensitive filesystem */
public class C106065Cj extends SSLSocket implements C108115Ms {
    public int A00;
    public long A01;
    public AnonymousClass40Y A02;
    public C795140c A03;
    public C103044zw A04;
    public C106045Ch A05;
    public C29341aT A06;
    public C29341aT A07;
    public AnonymousClass4QL A08;
    public InputStream A09;
    public OutputStream A0A;
    public String A0B;
    public Set A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public C106065Cj() {
        this.A0E = false;
        this.A0D = false;
        this.A0F = false;
        this.A0C = C13680ns.A0o();
    }

    public C106065Cj(C106045Ch r2) {
        A02(r2, this);
        this.A0B = null;
        this.A00 = -1;
        A07();
    }

    public C106065Cj(C106045Ch r1, String str, int i2) {
        super(str, i2);
        A02(r1, this);
        this.A0B = str;
        this.A00 = i2;
        A07();
    }

    public C106065Cj(C106045Ch r1, String str, InetAddress inetAddress, int i2, int i3) {
        super(str, i2, inetAddress, i3);
        A02(r1, this);
        this.A0B = str;
        this.A00 = i2;
        A07();
    }

    public C106065Cj(C106045Ch r2, InetAddress inetAddress, int i2) {
        super(inetAddress, i2);
        A02(r2, this);
        this.A0B = null;
        this.A00 = i2;
        A07();
    }

    public C106065Cj(C106045Ch r2, InetAddress inetAddress, InetAddress inetAddress2, int i2, int i3) {
        super(inetAddress, i2, inetAddress2, i3);
        A02(r2, this);
        this.A0B = inetAddress.getHostName();
        this.A00 = i2;
        A07();
    }

    public static String A00(byte b2) {
        if (b2 == 0) {
            return "close_notify";
        }
        if (b2 == 10) {
            return "unexpected_message";
        }
        if (b2 == 20) {
            return "bad_record_mac";
        }
        if (b2 == 22) {
            return "record_overflow";
        }
        if (b2 == 40) {
            return "handshake_failure";
        }
        if (b2 == 80) {
            return "internal_error";
        }
        if (b2 == 86) {
            return "inappropriate_fallback";
        }
        if (b2 == 90) {
            return "user_cancelled";
        }
        if (b2 == 120) {
            return "no_application_protocol";
        }
        if (b2 == 70) {
            return "protocol_version";
        }
        if (b2 == 71) {
            return "insufficient_security";
        }
        if (b2 == 109) {
            return "missing_extension";
        }
        if (b2 == 110) {
            return "unsupported_version";
        }
        if (b2 == 112) {
            return "unrecognized_name";
        }
        if (b2 == 113) {
            return "bad_certificate_status_response";
        }
        if (b2 == 115) {
            return "unknown_psk_identity";
        }
        if (b2 == 116) {
            return "certificate_required";
        }
        switch (b2) {
            case 42:
                return "bad_certificate";
            case 43:
                return "unsupported_certificate";
            case 44:
                return "certificate_revoked";
            case 45:
                return "certificate_expired";
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
                return "certificate_unknown";
            case 47:
                return "illegal_parameter";
            case 48:
                return "unknown_ca";
            case 49:
                return "access_denied";
            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS:
                return "decode_error";
            case 51:
                return "decrypt_error";
            default:
                return "invalid description";
        }
    }

    public static void A01(C89254bq r4, ByteBuffer byteBuffer, short s2) {
        C86024Qx r3 = new C86024Qx(byteBuffer.array(), s2);
        ArrayList arrayList = r4.A02;
        int i2 = r4.A00;
        arrayList.add(i2, r3);
        r4.A01 += r3.A01.length + 4;
        r4.A00 = i2 + 1;
    }

    public static void A02(C106045Ch r1, C106065Cj r2) {
        r2.A0E = false;
        r2.A0D = false;
        r2.A0F = false;
        r2.A0C = new HashSet();
        r2.A05 = r1;
    }

    public static void A03(C106065Cj r5, byte[] bArr, byte b2) {
        byte[] A012 = AnonymousClass4Y0.A01(bArr, b2);
        r5.A04.A0B.A01(A012, 0, A012.length, (byte) 22);
        r5.A04.A0D.A00(A012);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A04(X.C103044zw r11) {
        /*
            r5 = 80
            if (r11 == 0) goto L_0x030d
            byte[] r0 = r11.A0j
            if (r0 == 0) goto L_0x030a
            int r0 = r0.length
            r7 = 32
            if (r0 != r7) goto L_0x030a
            byte[] r0 = r11.A0l
            if (r0 == 0) goto L_0x0310
            X.4bq r4 = new X.4bq
            r4.<init>()
            java.lang.String r1 = r11.A0O     // Catch:{ UnsupportedEncodingException -> 0x0304 }
            java.lang.String r8 = "UTF-8"
            r9 = 1
            if (r1 == 0) goto L_0x003f
            boolean r0 = r1.isEmpty()     // Catch:{ UnsupportedEncodingException -> 0x0304 }
            if (r0 != 0) goto L_0x003f
            byte[] r6 = r1.getBytes(r8)     // Catch:{ UnsupportedEncodingException -> 0x0304 }
            r3 = 16
            int r2 = r6.length     // Catch:{ UnsupportedEncodingException -> 0x0304 }
            int r0 = r2 + 3
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ UnsupportedEncodingException -> 0x0304 }
            int r0 = r2 + 1
            X.AnonymousClass3K3.A1O(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x0304 }
            byte r0 = (byte) r2     // Catch:{ UnsupportedEncodingException -> 0x0304 }
            r1.put(r0)     // Catch:{ UnsupportedEncodingException -> 0x0304 }
            r1.put(r6)     // Catch:{ UnsupportedEncodingException -> 0x0304 }
            A01(r4, r1, r3)     // Catch:{ UnsupportedEncodingException -> 0x0304 }
        L_0x003f:
            r2 = 13
            r6 = 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r6)
            r3 = 2
            r1.putShort(r3)
            r0 = 1027(0x403, float:1.439E-42)
            r1.putShort(r0)
            A01(r4, r1, r2)
            r2 = 10
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r6)
            r1.putShort(r3)
            r0 = 29
            r1.putShort(r0)
            A01(r4, r1, r2)
            r2 = 45
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r3)
            r1.put(r9)
            byte r0 = r11.A00
            r1.put(r0)
            A01(r4, r1, r2)
            r2 = 43
            r0 = 5
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            r1.put(r6)
            r0 = 772(0x304, float:1.082E-42)
            r1.putShort(r0)
            r0 = -1254(0xfffffffffffffb1a, float:NaN)
            r1.putShort(r0)
            A01(r4, r1, r2)
            r2 = 50
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r6)
            r1.putShort(r3)
            r0 = 1027(0x403, float:1.439E-42)
            r1.putShort(r0)
            A01(r4, r1, r2)
            boolean r0 = r11.A0a
            r6 = 0
            if (r0 == 0) goto L_0x00c9
            X.1aT r0 = r11.A0C
            com.obwhatsapp.net.tls13.WtCachedPsk r0 = r0.A03
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r11.A0c
            if (r0 != 0) goto L_0x00c9
            r1 = 42
            byte[] r0 = new byte[r6]
            X.4Qx r3 = new X.4Qx
            r3.<init>(r0, r1)
            java.util.ArrayList r0 = r4.A02
            int r2 = r4.A00
            r0.add(r2, r3)
            int r1 = r4.A01
            byte[] r0 = r3.A01
            int r0 = r0.length
            int r0 = r0 + 4
            int r1 = r1 + r0
            r4.A01 = r1
            int r0 = r2 + 1
            r4.A00 = r0
        L_0x00c9:
            java.lang.String r0 = r11.A0Q     // Catch:{ UnsupportedEncodingException -> 0x0304 }
            byte[] r3 = r0.getBytes(r8)     // Catch:{ UnsupportedEncodingException -> 0x0304 }
            int r2 = r3.length
            int r0 = r2 + 5
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            int r0 = r2 + 3
            X.AnonymousClass3K3.A1O(r1, r0)
            byte[] r0 = X.C32311g7.A05(r2)
            r1.put(r0)
            r1.put(r3)
            A01(r4, r1, r6)
            boolean r0 = r11.A0c
            if (r0 == 0) goto L_0x0103
            byte[] r3 = r11.A0k
            if (r3 == 0) goto L_0x0103
            r2 = 44
            int r0 = r3.length
            int r0 = r0 + 2
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            int r0 = r3.length
            X.AnonymousClass3K3.A1O(r1, r0)
            r1.put(r3)
            A01(r4, r1, r2)
        L_0x0103:
            r3 = 29
            boolean r0 = r11.A0c
            if (r0 == 0) goto L_0x011e
            short r2 = r11.A0W
            if (r2 == r3) goto L_0x011e
            java.lang.String r0 = "Must use key group sent by HelloRetryRequest: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = " client key group: "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r3)
            goto L_0x0312
        L_0x011e:
            r0 = 38
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            r0 = 36
            X.AnonymousClass3K3.A1O(r1, r0)
            r1.putShort(r3)
            X.AnonymousClass3K3.A1O(r1, r7)
            byte[] r0 = r11.A0i
            r1.put(r0)
            r0 = 51
            A01(r4, r1, r0)
            int r0 = r4.A01
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r0)
            java.util.ArrayList r0 = r4.A02
            java.util.Iterator r5 = r0.iterator()
        L_0x0145:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x016d
            java.lang.Object r4 = r5.next()
            X.4Qx r4 = (X.C86024Qx) r4
            byte[] r3 = r4.A01
            int r2 = r3.length
            int r0 = r2 + 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            short r0 = r4.A00
            r1.putShort(r0)
            X.AnonymousClass3K3.A1O(r1, r2)
            r1.put(r3)
            byte[] r0 = r1.array()
            r7.put(r0)
            goto L_0x0145
        L_0x016d:
            byte[] r7 = r7.array()
            X.1aT r0 = r11.A0C
            com.obwhatsapp.net.tls13.WtCachedPsk r0 = r0.A03
            if (r0 != 0) goto L_0x01cc
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r6)
        L_0x017b:
            int r0 = r5.capacity()
            int r1 = r7.length
            int r1 = r1 + r0
            byte[] r0 = r11.A0l
            int r0 = r0.length
            int r0 = r0 + 35
            r2 = 2
            int r0 = r0 + 2
            int r0 = r0 + 2
            r6 = 1
            int r0 = r0 + 1
            int r0 = r0 + 1
            int r0 = r0 + 2
            int r0 = r0 + r1
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r0)
            r0 = 771(0x303, float:1.08E-42)
            r4.putShort(r0)
            byte[] r0 = r11.A0j
            r4.put(r0)
            byte[] r0 = r11.A0l
            int r0 = r0.length
            byte r0 = (byte) r0
            r4.put(r0)
            byte[] r0 = r11.A0l
            r4.put(r0)
            r4.putShort(r2)
            r0 = 4865(0x1301, float:6.817E-42)
            r4.putShort(r0)
            r4.put(r6)
            r8 = 0
            r4.put(r8)
            X.AnonymousClass3K3.A1O(r4, r1)
            r4.put(r7)
            X.1aT r0 = r11.A0C
            com.obwhatsapp.net.tls13.WtCachedPsk r0 = r0.A03
            if (r0 == 0) goto L_0x02e9
            X.4Vn r0 = r11.A0D
            goto L_0x025c
        L_0x01cc:
            byte[] r2 = r0.ticket
            int r0 = r11.A02
            int r0 = r0 + 1
            int r1 = r0 + 2
            int r0 = r2.length
            int r0 = r0 + 6
            int r0 = r0 + 6
            int r0 = r0 + r1
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r0)
            X.1aT r0 = r11.A0C
            com.obwhatsapp.net.tls13.WtCachedPsk r0 = r0.A03
            byte[] r2 = r0.ticket
            r0 = 41
            r5.putShort(r0)
            int r0 = r5.capacity()
            int r0 = r0 + -4
            X.AnonymousClass3K3.A1O(r5, r0)
            int r1 = r2.length
            int r0 = r1 + 6
            X.AnonymousClass3K3.A1O(r5, r0)
            X.AnonymousClass3K3.A1O(r5, r1)
            r5.put(r2)
            X.1aT r0 = r11.A0C
            com.obwhatsapp.net.tls13.WtCachedPsk r2 = r0.A03
            boolean r0 = r2.useTestTime
            if (r0 == 0) goto L_0x0257
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
        L_0x0209:
            long r0 = r2.ticketIssuedTime
            long r3 = r3 - r0
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0214
            r3 = 0
        L_0x0214:
            long r0 = r2.ticketAgeAdd
            long r3 = r3 + r0
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            long r3 = r3 % r1
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0222
            long r3 = r3 + r1
        L_0x0222:
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x02ee
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02ee
            r0 = 4
            byte[] r8 = new byte[r0]
            r0 = 24
            long r0 = r3 >> r0
            r9 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r9
            int r2 = (int) r0
            byte r0 = (byte) r2
            r8[r6] = r0
            r6 = 1
            r0 = 16
            long r0 = r3 >> r0
            long r0 = r0 & r9
            int r2 = (int) r0
            byte r0 = (byte) r2
            r8[r6] = r0
            r6 = 2
            r0 = 8
            long r1 = r3 >> r0
            long r1 = r1 & r9
            int r0 = (int) r1
            byte r0 = (byte) r0
            r8[r6] = r0
            r1 = 3
            long r3 = r3 & r9
            int r0 = (int) r3
            byte r0 = (byte) r0
            r8[r1] = r0
            r5.put(r8)
            goto L_0x017b
        L_0x0257:
            long r3 = java.lang.System.currentTimeMillis()
            goto L_0x0209
        L_0x025c:
            java.security.MessageDigest r0 = r0.A00     // Catch:{  }
            java.lang.Object r3 = r0.clone()     // Catch:{  }
            java.security.MessageDigest r3 = (java.security.MessageDigest) r3     // Catch:{  }
            byte[] r1 = r4.array()
            int r0 = r4.position()
            byte[] r2 = java.util.Arrays.copyOfRange(r1, r8, r0)
            byte[] r1 = r5.array()
            int r0 = r5.position()
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r8, r0)
            r3.update(r6)
            int r0 = r4.capacity()
            byte[] r0 = X.C32311g7.A05(r0)
            r3.update(r0)
            r3.update(r2)
            r3.update(r1)
            byte[] r7 = r3.digest()
            int r0 = r11.A02
            int r1 = r0 + 1
            int r0 = r1 + 2
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r0)
            X.AnonymousClass3K3.A1O(r6, r1)
            X.392 r2 = r11.A09     // Catch:{  }
            int r0 = r11.A02     // Catch:{  }
            byte[] r1 = new byte[r0]     // Catch:{  }
            X.1aT r0 = r11.A0C     // Catch:{  }
            com.obwhatsapp.net.tls13.WtCachedPsk r0 = r0.A03     // Catch:{  }
            byte[] r0 = r0.pskVal     // Catch:{  }
            byte[] r3 = r2.A00(r1, r0)     // Catch:{  }
            java.lang.String r0 = r11.A0P     // Catch:{  }
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{  }
            X.392 r2 = r11.A09     // Catch:{  }
            java.lang.String r1 = "res binder"
            byte[] r0 = r0.digest()     // Catch:{  }
            byte[] r3 = X.C103044zw.A00(r2, r11, r1, r0, r3)     // Catch:{  }
            X.392 r2 = r11.A09     // Catch:{  }
            java.lang.String r1 = "finished"
            byte[] r0 = new byte[r8]     // Catch:{  }
            byte[] r1 = X.C103044zw.A00(r2, r11, r1, r0, r3)     // Catch:{  }
            java.lang.String r0 = r11.A0P     // Catch:{  }
            byte[] r1 = X.C32311g7.A09(r0, r1, r7)     // Catch:{  }
            int r0 = r1.length     // Catch:{  }
            byte r0 = (byte) r0     // Catch:{  }
            r6.put(r0)     // Catch:{  }
            r6.put(r1)     // Catch:{  }
            byte[] r0 = r6.array()
            r5.put(r0)
            byte[] r0 = r5.array()
            r4.put(r0)
        L_0x02e9:
            byte[] r0 = r4.array()
            return r0
        L_0x02ee:
            r2 = 80
            java.lang.String r0 = "Invalid argument. The supplied long value = "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r3)
            java.lang.String r0 = " does not  fit in 4 bytes."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            X.1aU r0 = X.AnonymousClass3K2.A0S(r0, r2)
            throw r0
        L_0x0304:
            r1 = move-exception
            X.1aU r0 = X.AnonymousClass3K2.A0T(r1)
            throw r0
        L_0x030a:
            java.lang.String r0 = "Client random is not correctly initialized."
            goto L_0x0312
        L_0x030d:
            java.lang.String r0 = "Illegal argument. Context cannot be null."
            goto L_0x0312
        L_0x0310:
            java.lang.String r0 = "Legacy session id is not correctly initialized."
        L_0x0312:
            X.1aU r0 = X.AnonymousClass3K2.A0S(r0, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106065Cj.A04(X.4zw):byte[]");
    }

    public final String A05() {
        StringBuilder A0r = AnonymousClass000.A0r("host=");
        C103044zw r2 = this.A04;
        A0r.append(r2.A0Q);
        A0r.append(" hrr=");
        A0r.append(r2.A0c);
        A0r.append(" r=");
        A0r.append(r2.A0g);
        A0r.append(" ed=");
        A0r.append(r2.A0Z);
        A0r.append(" eda=");
        A0r.append(r2.A0f);
        A0r.append(" s=");
        return AnonymousClass000.A0h(this.A08.A00.A00.A03, A0r);
    }

    public void A06() {
        C82814Eg A012;
        while (true) {
            boolean equals = this.A08.A00.A00.equals(AnonymousClass4BR.A08);
            C103044zw r0 = this.A04;
            if (!equals) {
                C87384Wo r2 = r0.A0A;
                synchronized (r2) {
                    A012 = r2.A01();
                }
                if (!(A012 instanceof C77403vi)) {
                    if (A012 instanceof C77283vW) {
                        A09(A012);
                        throw AnonymousClass000.A0Z();
                    }
                    this.A08.A00(A012);
                    if (A012 instanceof C77383vg) {
                        A03(this, A04(this.A04), (byte) 1);
                    }
                }
            } else {
                if (!r0.A0b) {
                    A0A(new SSLException("Server must either choose a PSK or send certificates."), (byte) 2, (byte) 116, false);
                }
                if (this.A04.A0f) {
                    A03(this, new byte[0], (byte) 5);
                }
                C103044zw r1 = this.A04;
                if (r1.A0d && !r1.A0e) {
                    r1.A0B.A01(new byte[]{1}, 0, 1, (byte) 20);
                }
                C103044zw r12 = this.A04;
                C29371aW A002 = r12.A0E.A00();
                A002.AI0(AnonymousClass3K4.A1D("client_hs_key", r12.A0U), AnonymousClass3K4.A1D("client_hs_iv", this.A04.A0U));
                C103044zw r22 = this.A04;
                r22.A0B = new C77513vt(A002, r22.A0N);
                if (r22.A0X) {
                    A03(this, new byte[4], (byte) 11);
                }
                C103044zw r6 = this.A04;
                if (r6 != null) {
                    byte[] A013 = r6.A0D.A01();
                    byte[] A014 = AnonymousClass4Y0.A01(C32311g7.A09(r6.A0P, AnonymousClass3K4.A1D("client_finished", r6.A0U), A013), (byte) 20);
                    this.A04.A0B.A01(A014, 0, A014.length, (byte) 22);
                    this.A08.A00(new C77323va(A014));
                    long currentTimeMillis = System.currentTimeMillis();
                    this.A0D = true;
                    AnonymousClass41Y r4 = AnonymousClass41Y.INFO;
                    StringBuilder A0r = AnonymousClass000.A0r("Handshake complete : session_resumed ");
                    C103044zw r13 = this.A04;
                    A0r.append(r13.A0g);
                    A0r.append(" early_data_sent ");
                    A0r.append(r13.A0Z);
                    A0r.append(" early_data_accepted ");
                    A0r.append(r13.A0f);
                    A0r.append(" client_cert_requested ");
                    A0r.append(r13.A0X);
                    A0r.append(" time_ms ");
                    AnonymousClass4Yd.A00(r4, C13680ns.A0j(A0r, currentTimeMillis - this.A01));
                    HandshakeCompletedEvent handshakeCompletedEvent = new HandshakeCompletedEvent(this, this.A07);
                    for (HandshakeCompletedListener handshakeCompleted : this.A0C) {
                        handshakeCompleted.handshakeCompleted(handshakeCompletedEvent);
                    }
                    return;
                }
                throw AnonymousClass3K2.A0S("Illegal argument. Context cannot be null.", (byte) 80);
            }
        }
    }

    public void A07() {
        AnonymousClass4Yd.A00 = new C77063vA((C77473vp) this.A05);
        if (this instanceof C77523vu) {
            C77523vu r2 = (C77523vu) this;
            Socket socket = r2.A00;
            r2.A09 = socket.getInputStream();
            r2.A0A = socket.getOutputStream();
        } else {
            this.A09 = super.getInputStream();
            this.A0A = super.getOutputStream();
        }
        this.A02 = new AnonymousClass40Y(this);
        this.A03 = new C795140c(this);
        C103044zw r1 = new C103044zw();
        this.A04 = r1;
        try {
            this.A08 = new AnonymousClass4QL(r1);
        } catch (C29351aU e2) {
            throw new IOException(e2);
        }
    }

    public final synchronized void A08() {
        this.A0F = true;
        C103044zw r1 = this.A04;
        r1.A0R = null;
        r1.A0S = null;
        if (this.A0E) {
            this.A02.close();
            this.A03.close();
        }
        if (this instanceof C77523vu) {
            C77523vu r12 = (C77523vu) this;
            if (r12.A01) {
                r12.A00.close();
                r12.A09.close();
                r12.A0A.close();
            }
        } else {
            super.close();
            this.A09.close();
            this.A0A.close();
        }
    }

    public final void A09(C82814Eg r7) {
        byte[] bArr = (byte[]) r7.A00;
        AnonymousClass41Y r4 = AnonymousClass41Y.DEBUG;
        StringBuilder A0r = AnonymousClass000.A0r("Received Alert: Level ");
        A0r.append(bArr[0]);
        A0r.append(" Description ");
        byte b2 = bArr[1];
        A0r.append(A00(b2));
        A0r.append("(");
        A0r.append(b2);
        AnonymousClass4Yd.A00(r4, AnonymousClass000.A0h(")", A0r));
        A08();
        byte b3 = bArr[1];
        if (b3 == 0 || b3 == 50) {
            throw new IOException(new SSLException(C13680ns.A0i("Received alert ", AnonymousClass000.A0o(), b3)));
        }
        throw new IOException(AnonymousClass000.A0h(A05(), AnonymousClass000.A0r("WATLS Exception\n")), new SSLException(C13680ns.A0i("Received alert ", AnonymousClass000.A0o(), b3)));
    }

    public final synchronized void A0A(SSLException sSLException, byte b2, byte b3, boolean z2) {
        IOException iOException;
        if (z2) {
            iOException = (IOException) AnonymousClass3K3.A0r(sSLException);
        } else {
            if (!this.A0F) {
                AnonymousClass41Y r6 = AnonymousClass41Y.DEBUG;
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("Sending Alert : type : ");
                A0o.append(b2 == 2 ? "FATAL" : "WARNING");
                A0o.append(" description : ");
                A0o.append(A00(b3));
                A0o.append("(");
                A0o.append(b3);
                A0o.append(") exception : ");
                String A0h = AnonymousClass000.A0h(sSLException == null ? "" : sSLException.toString(), A0o);
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                AnonymousClass4ST r1 = AnonymousClass4Yd.A00;
                String obj = stackTrace[2].toString();
                if (!(r1 instanceof C77063vA)) {
                    PrintStream printStream = System.err;
                    StringBuilder A0o2 = AnonymousClass000.A0o();
                    A0o2.append(r6);
                    A0o2.append(": ");
                    A0o2.append(obj);
                    A0o2.append(" : ");
                    printStream.println(AnonymousClass000.A0h(A0h, A0o2));
                    if (sSLException != null) {
                        sSLException.printStackTrace(printStream);
                    }
                }
                try {
                    this.A04.A0B.A01(new byte[]{b2, b3}, 0, 2, (byte) 21);
                } catch (Exception e2) {
                    AnonymousClass41Y r2 = AnonymousClass41Y.ERROR;
                    StringBuilder A0o3 = AnonymousClass000.A0o();
                    A0o3.append("Encountered exception. Nothing much can be done here. ");
                    AnonymousClass4Yd.A00(r2, AnonymousClass000.A0f(e2, A0o3));
                }
                A08();
            }
            if (b2 == 2) {
                StringBuilder A0o4 = AnonymousClass000.A0o();
                A0o4.append("WATLS Exception\n");
                String A0h2 = AnonymousClass000.A0h(A05(), A0o4);
                Throwable th = sSLException;
                if (sSLException != null) {
                    th = AnonymousClass3K3.A0r(sSLException);
                }
                iOException = new IOException(A0h2, th);
            }
        }
        throw iOException;
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A0C.add(handshakeCompletedListener);
    }

    public synchronized void close() {
        if (!this.A0F) {
            if (this.A0E) {
                A0A((SSLException) null, (byte) 1, (byte) 0, false);
            } else {
                A08();
            }
        }
    }

    public SocketChannel getChannel() {
        throw AnonymousClass3K4.A0T("Channels are not supported by WtSocket.");
    }

    public boolean getEnableSessionCreation() {
        return true;
    }

    public String[] getEnabledCipherSuites() {
        return new String[]{"TLS_AES_128_GCM_SHA256", "use default"};
    }

    public String[] getEnabledProtocols() {
        return new String[]{"TLSv1.3", "TLSv1.2"};
    }

    public SSLSession getHandshakeSession() {
        return this.A06;
    }

    public InputStream getInputStream() {
        AnonymousClass40Y r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass3K3.A0e("Input stream is closed.");
    }

    public boolean getNeedClientAuth() {
        return this.A05.getNeedClientAuth();
    }

    public OutputStream getOutputStream() {
        C795140c r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass3K3.A0e("Output stream is closed.");
    }

    public SSLParameters getSSLParameters() {
        return this.A05;
    }

    public SSLSession getSession() {
        return this.A07;
    }

    public String[] getSupportedCipherSuites() {
        return new String[]{"TLS_AES_128_GCM_SHA256", "use default"};
    }

    public String[] getSupportedProtocols() {
        return new String[]{"TLSv1.3", "TLSv1.2"};
    }

    public boolean getUseClientMode() {
        return true;
    }

    public boolean getWantClientAuth() {
        return this.A05.getWantClientAuth();
    }

    public boolean isClosed() {
        return this.A0F;
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.A0C.remove(handshakeCompletedListener);
    }

    public void setEnableSessionCreation(boolean z2) {
    }

    public void setEnabledCipherSuites(String[] strArr) {
        this.A05.setCipherSuites(strArr);
    }

    public void setEnabledProtocols(String[] strArr) {
        this.A05.setProtocols(strArr);
    }

    public void setNeedClientAuth(boolean z2) {
        this.A05.setNeedClientAuth(z2);
    }

    public void setSSLParameters(SSLParameters sSLParameters) {
        if (sSLParameters instanceof C106045Ch) {
            this.A05 = (C106045Ch) sSLParameters;
        }
    }

    public void setUseClientMode(boolean z2) {
    }

    public void setWantClientAuth(boolean z2) {
        this.A05.setWantClientAuth(z2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|(1:15)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x00aa */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x010c A[Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x013b A[Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x014c A[Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0199 A[Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01b9 A[Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startHandshake() {
        /*
            r10 = this;
            r4 = 2
            r5 = 0
            X.41Y r1 = X.AnonymousClass41Y.INFO     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.lang.String r0 = "Start handshake."
            X.AnonymousClass4Yd.A00(r1, r0)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            boolean r0 = r10.A0E     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            if (r0 != 0) goto L_0x01e5
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r10.A01 = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r6 = 1
            r10.A0E = r6     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.5Ch r3 = r10.A05     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r1 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.40Z r0 = new X.40Z     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.<init>()     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r1.A08 = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r2 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.3vp r3 = (X.C77473vp) r3     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.16i r0 = r3.A01     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0F = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.lang.String r0 = "SHA-256"
            r2.A0P = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0 = 32
            r2.A02 = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r9 = 32
            X.392 r0 = new X.392     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.<init>()     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A09 = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.16a r0 = r3.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.16Z r1 = r0.A00     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4RK r0 = new X.4RK     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0G = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r7 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4RK r0 = r7.A0G     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.16Z r0 = r0.A02     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r7.A0H = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.16g r0 = r3.A03     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r7.A0I = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.16h r0 = r3.A02     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.16g r0 = r0.A00     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4J9 r1 = new X.4J9     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r7.A0J = r1     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            javax.net.ssl.X509TrustManager r0 = r3.A08     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r1.A00 = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.lang.String r0 = "http/1.1"
            r7.A0O = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.16c r0 = r3.A00     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r7.A0E = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.io.InputStream r2 = r10.A09     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.40Z r1 = r7.A08     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.3vq r0 = new X.3vq     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.<init>(r1, r2)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r7.A0A = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r2 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.io.OutputStream r1 = r10.A0A     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.3vs r0 = new X.3vs     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0B = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4Fm r0 = new X.4Fm     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.<init>()     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0K = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r0 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.A00 = r6     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.16Y r1 = r3.A07     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            if (r1 == 0) goto L_0x00be
            java.lang.String r0 = r10.A0B     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.lang.String r7 = r1.A00(r0)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            if (r7 == 0) goto L_0x009b
            int r0 = r7.length()     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            if (r0 != 0) goto L_0x00c5
        L_0x009b:
            java.lang.String r0 = r10.A0B     // Catch:{ UnknownHostException -> 0x00aa }
            java.net.InetAddress r0 = java.net.Inet6Address.getByName(r0)     // Catch:{ UnknownHostException -> 0x00aa }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x00aa }
            java.lang.String r7 = r1.A00(r0)     // Catch:{ UnknownHostException -> 0x00aa }
            goto L_0x00bb
        L_0x00aa:
            X.41Y r2 = X.AnonymousClass41Y.ERROR     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.lang.String r0 = "Failed to normalize the IP address "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.lang.String r0 = r10.A0B     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.AnonymousClass4Yd.A00(r2, r0)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
        L_0x00bb:
            if (r7 == 0) goto L_0x00be
            goto L_0x00c5
        L_0x00be:
            X.4zw r2 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.lang.String r0 = r10.A0B     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0Q = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            goto L_0x00cf
        L_0x00c5:
            int r0 = r7.length()     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            if (r0 <= 0) goto L_0x00be
            X.4zw r2 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0Q = r7     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
        L_0x00cf:
            java.util.HashMap r0 = X.AnonymousClass000.A0x()     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0U = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.io.InputStream r0 = r10.A09     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0M = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.io.OutputStream r0 = r10.A0A     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0N = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.40Y r0 = r10.A02     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.40Z r0 = r0.A00     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A07 = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.16f r0 = r3.A06     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0L = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0b = r5     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0d = r6     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            byte[] r1 = new byte[r9]     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0l = r1     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4Fm r0 = r2.A0K     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.security.SecureRandom r0 = r0.A00     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.nextBytes(r1)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r0 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.16f r2 = r0.A0L     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.lang.String r1 = r0.A0Q     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            int r0 = r10.A00     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.lang.String r8 = "TLS_AES_128_GCM_SHA256"
            byte[] r0 = X.C32311g7.A07(r1, r8, r0)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            javax.net.ssl.SSLSession r7 = r2.getSession(r0)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.1aT r7 = (X.C29341aT) r7     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            if (r7 != 0) goto L_0x0119
            X.4zw r0 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.16f r2 = r0.A0L     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.lang.String r1 = r0.A0Q     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            int r0 = r10.A00     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.1aT r7 = new X.1aT     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r7.<init>(r2, r1, r8, r0)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
        L_0x0119:
            r10.A06 = r7     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r0 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.A0C = r7     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r10.A07 = r7     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            byte[] r1 = new byte[r9]     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.A0j = r1     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4Fm r0 = r0.A0K     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.security.SecureRandom r0 = r0.A00     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.nextBytes(r1)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r0 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4RK r0 = r0.A0G     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.A00()     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r2 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4RK r1 = r2.A0G     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4JH r0 = r1.A01     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            if (r0 != 0) goto L_0x013e
            r1.A00()     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
        L_0x013e:
            X.4JH r0 = r1.A01     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            byte[] r0 = r0.A01     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0i = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r2 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4RK r1 = r2.A0G     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4JH r0 = r1.A01     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            if (r0 != 0) goto L_0x014f
            r1.A00()     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
        L_0x014f:
            X.4JH r0 = r1.A01     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            byte[] r0 = r0.A00     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0h = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r2 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.lang.String r1 = r2.A0P     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4Vn r0 = new X.4Vn     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0D = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r2 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0e = r5     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0Z = r5     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            boolean r0 = r3.A09     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0a = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0R = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A0S = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            r2.A06 = r0     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            byte[] r0 = A04(r2)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            byte[] r3 = X.AnonymousClass4Y0.A01(r0, r6)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r0 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4SU r2 = r0.A0B     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r1 = 22
            int r0 = r3.length     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A01(r3, r5, r0, r1)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r1 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            boolean r0 = r1.A0a     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            if (r0 == 0) goto L_0x01b9
            X.1aT r0 = r1.A0C     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            com.obwhatsapp.net.tls13.WtCachedPsk r0 = r0.A03     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            if (r0 == 0) goto L_0x01b9
            boolean r0 = r1.A0d     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            if (r0 == 0) goto L_0x01ac
            X.4SU r2 = r1.A0B     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r1 = 20
            byte[] r0 = new byte[r6]     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0[r5] = r6     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r2.A01(r0, r5, r6, r1)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4zw r1 = r10.A04     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r1.A0e = r6     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
        L_0x01ac:
            r1.A0Y = r6     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.4QL r1 = r10.A08     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.3vc r0 = new X.3vc     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r1.A00(r0)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            return
        L_0x01b9:
            X.4QL r1 = r10.A08     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            X.3vb r0 = new X.3vb     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r1.A00(r0)     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            r10.A06()     // Catch:{ IOException -> 0x01e6, 1aU -> 0x01db, Exception -> 0x01c7 }
            return
        L_0x01c7:
            r0 = move-exception
            r3 = 80
            java.lang.String r2 = r0.getMessage()
            java.lang.Throwable r1 = X.AnonymousClass3K3.A0r(r0)
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r2, r1)
            r10.A0A(r0, r4, r3, r5)
            return
        L_0x01db:
            r0 = move-exception
            byte r2 = r0.description
            boolean r1 = r0.errorTransient
            javax.net.ssl.SSLException r0 = r0.ex
            r10.A0A(r0, r4, r2, r1)
        L_0x01e5:
            return
        L_0x01e6:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106065Cj.startHandshake():void");
    }
}
