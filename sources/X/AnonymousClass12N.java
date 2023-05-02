package X;

import android.os.Bundle;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.12N  reason: invalid class name */
public class AnonymousClass12N {
    public final C19670yo A00;
    public final AnonymousClass12M A01;
    public final C15860rz A02;
    public final AtomicLong A03 = new AtomicLong(0);
    public final AtomicLong A04 = new AtomicLong(0);
    public final AtomicLong A05 = new AtomicLong(0);
    public final AtomicLong A06 = new AtomicLong(0);
    public final AtomicLong A07 = new AtomicLong(0);

    public AnonymousClass12N(C19670yo r4, AnonymousClass12M r5, C15860rz r6) {
        this.A02 = r6;
        this.A00 = r4;
        this.A01 = r5;
    }

    public Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putLong("total_bytes_to_be_downloaded", this.A05.get());
        bundle.putLong("total_bytes_downloaded", this.A04.get());
        bundle.putLong("total_bytes_to_be_uploaded", this.A06.get());
        return bundle;
    }

    public AnonymousClass2GL A01() {
        long j2 = this.A06.get();
        long j3 = this.A07.get();
        long j4 = this.A05.get();
        long j5 = this.A04.get();
        this.A03.get();
        return new AnonymousClass2GL(j2, j3, j4, j5);
    }

    public void A02(AnonymousClass12R r10) {
        AnonymousClass12M r4 = this.A01;
        r4.A02(r10);
        C15860rz r5 = this.A02;
        if (!AnonymousClass2GK.A0G(r5)) {
            C19670yo r2 = this.A00;
            if (!r2.A0c.get()) {
                if (r2.A0e.get() || AnonymousClass2GK.A0H(r5)) {
                    if (!r2.A0i.get()) {
                        int i2 = r2.A02;
                        long j2 = this.A04.get();
                        long j3 = this.A05.get();
                        if (i2 == 0) {
                            r10.ATW(j2, j3);
                        } else {
                            r10.ATS(j2, j3);
                        }
                    } else if (!r2.A07) {
                        r10.ATT(this.A04.get(), this.A05.get());
                    } else if (!r2.A09) {
                        boolean equals = "unmounted".equals(Environment.getExternalStorageState());
                        long j4 = this.A04.get();
                        long j5 = this.A05.get();
                        if (equals) {
                            r10.ATV(j4, j5);
                        } else {
                            r10.ATU(j4, j5);
                        }
                    } else {
                        AtomicLong atomicLong = this.A05;
                        if (atomicLong.get() > 0) {
                            r10.ATZ(this.A04.get(), atomicLong.get());
                        } else {
                            r10.ATY();
                        }
                    }
                    int A08 = r5.A08();
                    Bundle A002 = A00();
                    for (AnonymousClass12R AQi : r4.A01()) {
                        AQi.AQi(A08, A002);
                    }
                    return;
                }
                if (r5.A09() == 3) {
                    StringBuilder sb = new StringBuilder("gdrive-service/observer/registered/error/");
                    sb.append(AnonymousClass2GK.A04(r5.A08()));
                    Log.i(sb.toString());
                    return;
                }
                r4.A06(r5.A08(), A00());
            }
        }
        C19670yo r22 = this.A00;
        if (!r22.A0g.get()) {
            int i3 = r22.A01;
            long j6 = this.A07.get();
            long j7 = this.A06.get();
            if (i3 == 0) {
                r10.ANO(j6, j7);
            } else {
                r10.ANK(j6, j7);
            }
        } else if (!r22.A05) {
            r10.ANL(this.A07.get(), this.A06.get());
        } else if (!r22.A09) {
            boolean equals2 = "unmounted".equals(Environment.getExternalStorageState());
            long j8 = this.A07.get();
            long j9 = this.A06.get();
            if (equals2) {
                r10.ANN(j8, j9);
            } else {
                r10.ANM(j8, j9);
            }
        } else {
            AtomicLong atomicLong2 = this.A06;
            if (atomicLong2.get() > 0) {
                r10.ANR(this.A07.get(), atomicLong2.get());
            } else if (AnonymousClass2GK.A0G(r5)) {
                r10.ANQ();
            } else {
                r10.AWm();
            }
        }
        r4.A06(r5.A08(), A00());
    }

    public void A03(AnonymousClass12R r2) {
        this.A01.A03(r2);
    }
}
