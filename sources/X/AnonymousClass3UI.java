package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3UI  reason: invalid class name */
public final class AnonymousClass3UI extends C96244o1 implements Handler.Callback {
    public int A00;
    public int A01;
    public long A02;
    public C108285Nj A03;
    public boolean A04;
    public boolean A05;
    public final Handler A06;
    public final C109745Tk A07;
    public final AnonymousClass3Ub A08;
    public final C108295Nk A09;
    public final long[] A0A;
    public final C93724jf[] A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3UI(Looper looper, C108295Nk r5) {
        super(5);
        C109745Tk r2 = C109745Tk.A00;
        this.A09 = r5;
        this.A06 = looper == null ? null : new Handler(looper, this);
        this.A07 = r2;
        this.A08 = new AnonymousClass3Ub();
        this.A0B = new C93724jf[5];
        this.A0A = new long[5];
    }

    public void A08() {
        Arrays.fill(this.A0B, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
        this.A03 = null;
    }

    public void A09(long j2, boolean z2) {
        Arrays.fill(this.A0B, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = false;
        this.A05 = false;
    }

    public final void A0B(C93724jf r7, List list) {
        int i2 = 0;
        while (true) {
            C35731mP[] r5 = r7.A00;
            if (i2 < r5.length) {
                C32491gT AHB = r5[i2].AHB();
                if (AHB != null) {
                    C109745Tk r1 = this.A07;
                    if (r1.AgY(AHB)) {
                        C108285Nj A7J = r1.A7J(AHB);
                        byte[] AHA = r5[i2].AHA();
                        AnonymousClass3Ub r12 = this.A08;
                        r12.clear();
                        r12.A01(AHA.length);
                        r12.A01.put(AHA);
                        r12.A00();
                        C93724jf A7j = A7J.A7j(r12);
                        if (A7j != null) {
                            A0B(A7j, list);
                        }
                        i2++;
                    }
                }
                list.add(r5[i2]);
                i2++;
            } else {
                return;
            }
        }
    }

    public boolean AIm() {
        return this.A05;
    }

    public boolean AJY() {
        return true;
    }

    public void Ac6(long j2, long j3) {
        if (!this.A04 && this.A00 < 5) {
            AnonymousClass3Ub r7 = this.A08;
            r7.clear();
            AnonymousClass4G5 r2 = this.A0A;
            r2.A01 = null;
            r2.A00 = null;
            int A002 = A00(r2, r7, false);
            if (A002 == -4) {
                if (AnonymousClass4XM.A00(r7)) {
                    this.A04 = true;
                } else {
                    r7.A00 = this.A02;
                    r7.A00();
                    C93724jf A7j = this.A03.A7j(r7);
                    if (A7j != null) {
                        ArrayList A0i = C13690nt.A0i(A7j.A00.length);
                        A0B(A7j, A0i);
                        if (!A0i.isEmpty()) {
                            C93724jf r1 = new C93724jf((List) A0i);
                            int i2 = this.A01;
                            int i3 = this.A00;
                            int i4 = (i2 + i3) % 5;
                            this.A0B[i4] = r1;
                            this.A0A[i4] = r7.A00;
                            this.A00 = i3 + 1;
                        }
                    }
                }
            } else if (A002 == -5) {
                this.A02 = r2.A00.A0J;
            }
        }
        int i5 = this.A00;
        if (i5 > 0) {
            long[] jArr = this.A0A;
            int i6 = this.A01;
            if (jArr[i6] <= j2) {
                C93724jf[] r3 = this.A0B;
                C93724jf r22 = r3[i6];
                Handler handler = this.A06;
                if (handler != null) {
                    handler.obtainMessage(0, r22).sendToTarget();
                } else {
                    this.A09.ATl(r22);
                }
                int i7 = this.A01;
                r3[i7] = null;
                this.A01 = (i7 + 1) % 5;
                i5 = this.A00 - 1;
                this.A00 = i5;
            }
        }
        if (this.A04 && i5 == 0) {
            this.A05 = true;
        }
    }

    public int AgX(C32491gT r3) {
        if (this.A07.AgY(r3)) {
            return r3.A0N == null ? 4 : 2;
        }
        return 0;
    }

    public String getName() {
        return "MetadataRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.A09.ATl((C93724jf) message.obj);
            return true;
        }
        throw AnonymousClass3K4.A0V();
    }
}
