package X;

import com.mod.bomfab.R$styleable;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.net.ssl.SSLException;

/* renamed from: X.4Wo  reason: invalid class name and case insensitive filesystem */
public abstract class C87384Wo {
    public final AnonymousClass40Z A00;
    public final AnonymousClass40Z A01;
    public final InputStream A02;

    public C87384Wo(AnonymousClass40Z r3, InputStream inputStream) {
        if (inputStream == null || r3 == null) {
            throw AnonymousClass3K2.A0S("transportIn or recordStream is null", (byte) 80);
        }
        this.A02 = inputStream;
        this.A00 = new AnonymousClass40Z();
        this.A01 = r3;
    }

    public C82814Eg A00() {
        try {
            AnonymousClass40Z r6 = this.A00;
            if (r6.available() <= 0) {
                return null;
            }
            r6.A00();
            byte[] bArr = new byte[4];
            if (r6.read(bArr) < 4) {
                r6.reset();
                return new C77403vi();
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b2 = wrap.get();
            byte[] bArr2 = new byte[3];
            wrap.get(bArr2);
            int A002 = C32311g7.A00(bArr2);
            if (r6.available() < A002) {
                r6.reset();
                return new C77403vi();
            }
            r6.reset();
            int i2 = A002 + 4;
            byte[] bArr3 = new byte[i2];
            if (r6.read(bArr3) == i2) {
                byte b3 = (byte) b2;
                if (b3 == 1) {
                    return new C77333vb(bArr3);
                }
                if (b3 == 2) {
                    return (i2 < 38 || !C32311g7.A04(Arrays.copyOfRange(bArr3, 6, 38), AnonymousClass4ZF.A05)) ? new C77453vn(bArr3) : new C77383vg(bArr3);
                }
                if (b3 == 4) {
                    return new C77393vh(bArr3);
                }
                if (b3 == 8) {
                    return new C77373vf(bArr3);
                }
                if (b3 == 11) {
                    return new C77423vk(bArr3);
                }
                if (b3 == 13) {
                    return new C77313vZ(bArr3);
                }
                if (b3 == 15) {
                    return new C77433vl(bArr3);
                }
                if (b3 == 20) {
                    return new C77443vm(bArr3);
                }
                if (b3 == 24) {
                    return new C77413vj(bArr3);
                }
                throw new SSLException(C13680ns.A0c(b3, "Invalid handshake message type "));
            }
            throw AnonymousClass3K2.A0S(C13680ns.A0i("Could not read handshake message of length ", AnonymousClass000.A0o(), i2), (byte) 80);
        } catch (IOException e2) {
            throw AnonymousClass3K2.A0T(e2);
        }
    }

    public C82814Eg A01() {
        C29351aU r1;
        byte b2;
        C29351aU r12;
        if (this instanceof C77483vq) {
            try {
                C82814Eg A002 = A00();
                if (A002 != null && !(A002 instanceof C77403vi)) {
                    return A002;
                }
                if (A02()) {
                    byte[] bArr = new byte[5];
                    AnonymousClass40Z r11 = this.A01;
                    int read = r11.read(bArr);
                    if (read == 5) {
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        byte b3 = wrap.get();
                        wrap.getShort();
                        byte[] bArr2 = new byte[2];
                        wrap.get(bArr2);
                        int A012 = C32311g7.A01(bArr2);
                        byte[] bArr3 = new byte[A012];
                        int read2 = r11.read(bArr3);
                        if (read2 == A012) {
                            if (b3 != 20) {
                                switch (b3) {
                                    case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                                        return new C77283vW(bArr3);
                                    case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                                        this.A00.A4z(bArr3, 0, A012);
                                        return A00();
                                    case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                                        if (this.A00.available() > 0) {
                                            r12 = AnonymousClass3K2.A0S("App data and handshake messages cannot interleave", (byte) 10);
                                            break;
                                        } else {
                                            return new C77293vX(bArr3);
                                        }
                                    default:
                                        r12 = AnonymousClass3K2.A0S(C13680ns.A0i("Received Message with invalid type ", AnonymousClass000.A0o(), b3), (byte) 10);
                                        break;
                                }
                            } else {
                                return new C77403vi();
                            }
                        } else {
                            StringBuilder A0q = AnonymousClass000.A0q("read returned fewer than expected bytes ");
                            A0q.append(read2);
                            r12 = AnonymousClass3K2.A0S(C13680ns.A0i(" != ", A0q, A012), (byte) 80);
                        }
                    } else {
                        StringBuilder A0q2 = AnonymousClass000.A0q("read returned fewer than expected bytes ");
                        A0q2.append(read);
                        r12 = AnonymousClass3K2.A0S(C13680ns.A0i(" != ", A0q2, 5), (byte) 80);
                    }
                } else {
                    byte[] bArr4 = new byte[16645];
                    int read3 = this.A02.read(bArr4);
                    if (read3 != -1) {
                        this.A01.A4z(bArr4, 0, read3);
                        return new C77403vi();
                    }
                    r12 = new C29351aU(new SSLException("Transport layer is reached end of file."), (byte) 80, true);
                }
                throw r12;
            } catch (SocketException | SocketTimeoutException e2) {
                throw new C29351aU(new SSLException(e2), (byte) 80, true);
            } catch (IOException e3) {
                throw AnonymousClass3K2.A0T(e3);
            }
        } else {
            C77493vr r5 = (C77493vr) this;
            try {
                C82814Eg A003 = r5.A00();
                if (A003 != null && !(A003 instanceof C77403vi)) {
                    return A003;
                }
                if (r5.A02()) {
                    byte[] bArr5 = new byte[5];
                    AnonymousClass40Z r9 = r5.A01;
                    int read4 = r9.read(bArr5);
                    if (read4 == 5) {
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr5);
                        byte b4 = wrap2.get();
                        wrap2.getShort();
                        byte[] bArr6 = new byte[2];
                        wrap2.get(bArr6);
                        int A013 = C32311g7.A01(bArr6);
                        if (b4 == 23 || b4 == 20) {
                            byte[] bArr7 = new byte[A013];
                            int read5 = r9.read(bArr7);
                            if (read5 == A013) {
                                if (b4 != 20) {
                                    byte[] A7k = r5.A01.A7k(bArr5, bArr7, 0, A013, r5.A00);
                                    r5.A00++;
                                    int length = A7k.length;
                                    do {
                                        length--;
                                        b2 = A7k[length];
                                    } while (b2 == 0);
                                    byte[] copyOfRange = Arrays.copyOfRange(A7k, 0, length);
                                    if (b2 != 20) {
                                        switch (b2) {
                                            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                                                return new C77283vW(copyOfRange);
                                            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                                                r5.A00.A4z(copyOfRange, 0, copyOfRange.length);
                                                return r5.A00();
                                            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                                                if (r5.A00.available() > 0) {
                                                    r1 = AnonymousClass3K2.A0S("App data and handshake messages cannot interleave", (byte) 10);
                                                    break;
                                                } else {
                                                    return new C77293vX(copyOfRange);
                                                }
                                            default:
                                                r1 = AnonymousClass3K2.A0S(C13680ns.A0i("Invalid content type ", AnonymousClass000.A0o(), b2), (byte) 10);
                                                break;
                                        }
                                    } else {
                                        return new C77403vi();
                                    }
                                } else {
                                    return new C77403vi();
                                }
                            } else {
                                StringBuilder A0q3 = AnonymousClass000.A0q("read returned fewer than expected bytes ");
                                A0q3.append(read5);
                                r1 = AnonymousClass3K2.A0S(C13680ns.A0i(" != ", A0q3, A013), (byte) 80);
                            }
                        } else {
                            r1 = AnonymousClass3K2.A0S(C13680ns.A0i("Invalid content type ", AnonymousClass000.A0o(), b4), (byte) 47);
                        }
                    } else {
                        StringBuilder A0q4 = AnonymousClass000.A0q("read returned fewer than expected bytes ");
                        A0q4.append(read4);
                        r1 = AnonymousClass3K2.A0S(C13680ns.A0i(" != ", A0q4, 5), (byte) 80);
                    }
                } else {
                    byte[] bArr8 = new byte[16645];
                    int read6 = r5.A02.read(bArr8);
                    if (read6 != -1) {
                        r5.A01.A4z(bArr8, 0, read6);
                        return new C77403vi();
                    }
                    r1 = new C29351aU(new SSLException("Transport layer is reached end of file."), (byte) 80, true);
                }
                throw r1;
            } catch (SocketException | SocketTimeoutException e4) {
                throw new C29351aU(new SSLException(e4), (byte) 80, true);
            } catch (IOException e5) {
                throw AnonymousClass3K2.A0T(e5);
            }
        }
    }

    public boolean A02() {
        C29351aU r1;
        try {
            AnonymousClass40Z r6 = this.A01;
            if (r6.available() < 5) {
                return false;
            }
            byte[] bArr = new byte[5];
            r6.A00();
            int read = r6.read(bArr);
            if (read == 5) {
                r6.reset();
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b2 = wrap.get();
                short s2 = wrap.getShort();
                byte[] bArr2 = new byte[2];
                wrap.get(bArr2);
                int A012 = C32311g7.A01(bArr2);
                if (!C817049k.A00.contains(Byte.valueOf(b2)) || s2 != 771) {
                    r1 = new C29351aU(new SSLException(AnonymousClass000.A0h(C32311g7.A03(bArr), AnonymousClass000.A0q("Invalid record header "))), (byte) 10, true);
                } else if (A012 >= 0 && A012 <= 16640) {
                    return r6.available() >= A012 + 5;
                } else {
                    r1 = new C29351aU(new SSLException(AnonymousClass000.A0h(C32311g7.A03(bArr), AnonymousClass000.A0q("Invalid record header "))), (byte) 22, true);
                }
                throw r1;
            }
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append("read returned fewer than expected bytes ");
            A0o.append(read);
            throw AnonymousClass3K2.A0S(C13680ns.A0i(" != ", A0o, 5), (byte) 80);
        } catch (IOException e2) {
            throw AnonymousClass3K2.A0T(e2);
        }
    }
}
