package X;

import android.support.v4.view.MotionEventCompat;
import java.io.OutputStream;
import java.util.List;
import javax.net.ssl.SSLException;

/* renamed from: X.40c  reason: invalid class name and case insensitive filesystem */
public class C795140c extends OutputStream {
    public boolean A00 = false;
    public final C108115Ms A01;

    public C795140c(C108115Ms r2) {
        this.A01 = r2;
    }

    public void close() {
        this.A00 = true;
    }

    public void write(int i2) {
        if (!this.A00) {
            write(new byte[]{(byte) (i2 & MotionEventCompat.ACTION_MASK)}, 0, 1);
            return;
        }
        throw AnonymousClass3K3.A0e("Stream is closed.");
    }

    public void write(byte[] bArr) {
        if (!this.A00) {
            write(bArr, 0, bArr.length);
            return;
        }
        throw AnonymousClass3K3.A0e("Stream is closed.");
    }

    public void write(byte[] bArr, int i2, int i3) {
        List list;
        if (!this.A00) {
            C106065Cj r8 = (C106065Cj) this.A01;
            try {
                int i4 = i3;
                AnonymousClass4RH r6 = new AnonymousClass4RH(bArr, i2, i4);
                if (r8.A0E && !r8.A0D) {
                    C103044zw r10 = r8.A04;
                    if (!(!r10.A0Y || r10.A0R == null || (list = r10.A0S) == null)) {
                        r10.A0Z = true;
                        long j2 = (long) i4;
                        long j3 = r10.A0C.A03.maxEarlyDataSize;
                        if (r10.A04 + j2 > j3) {
                            r10.A04 = j3;
                            long j4 = r10.A05 + j2;
                            long j5 = r10.A06;
                            if (j4 <= j5) {
                                r10.A05 = j4;
                                list.add(r6);
                                return;
                            }
                            StringBuilder A0o = AnonymousClass000.A0o();
                            A0o.append("Client request exceeded the max spillover limit ");
                            A0o.append(j4);
                            A0o.append(" > ");
                            throw AnonymousClass3K2.A0S(C13680ns.A0j(A0o, j5), (byte) 80);
                        }
                        r8.A08.A00(new C77353vd(r6));
                        r8.A04.A0R.add(r6);
                        r8.A04.A04 += j2;
                        return;
                    }
                }
                r8.A08.A00(new C77303vY(r6));
            } catch (C29351aU e2) {
                r8.A0A(e2.ex, (byte) 2, e2.description, e2.errorTransient);
            } catch (Exception e3) {
                r8.A0A(new SSLException(AnonymousClass3K3.A0r(e3)), (byte) 2, (byte) 80, false);
            }
        } else {
            throw AnonymousClass3K3.A0e("Stream is closed.");
        }
    }
}
