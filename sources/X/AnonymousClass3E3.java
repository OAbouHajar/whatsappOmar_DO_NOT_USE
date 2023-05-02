package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.3E3  reason: invalid class name */
public abstract class AnonymousClass3E3 implements C48612Oe {
    public int A00;
    public AnonymousClass3AL A01;
    public final ArrayList A02 = C13690nt.A0i(1);
    public final boolean A03;

    public AnonymousClass3E3(boolean z2) {
        this.A03 = z2;
    }

    public final void A00() {
        C34231jv r12;
        float f2;
        AnonymousClass3AL r11 = this.A01;
        for (int i2 = 0; i2 < this.A00; i2++) {
            boolean z2 = this.A03;
            AnonymousClass3E2 r14 = (AnonymousClass3E2) ((AnonymousClass5LZ) this.A02.get(i2));
            synchronized (r14) {
                if (z2) {
                    if ((r11.A00 & 8) != 8) {
                        C90524eJ.A04(AnonymousClass000.A1Q(r14.A01));
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (elapsedRealtime - r14.A05);
                        r14.A07 += (long) i3;
                        long j2 = r14.A06;
                        long j3 = r14.A04;
                        r14.A06 = j2 + j3;
                        if (i3 > 0) {
                            float f3 = (((float) j3) * 8000.0f) / ((float) i3);
                            C88324aJ r2 = r14.A0B;
                            int sqrt = (int) Math.sqrt((double) j3);
                            if (r2.A00 != 1) {
                                Collections.sort(r2.A04, C88324aJ.A06);
                                r2.A00 = 1;
                            }
                            int i4 = r2.A02;
                            if (i4 > 0) {
                                C34231jv[] r0 = r2.A05;
                                i4--;
                                r2.A02 = i4;
                                r12 = r0[i4];
                            } else {
                                r12 = new C34231jv();
                            }
                            int i5 = r2.A01;
                            r2.A01 = i5 + 1;
                            r12.A01 = i5;
                            r12.A02 = sqrt;
                            r12.A00 = f3;
                            ArrayList arrayList = r2.A04;
                            arrayList.add(r12);
                            int i6 = r2.A03 + sqrt;
                            while (true) {
                                r2.A03 = i6;
                                while (i6 > 2000) {
                                    int i7 = i6 - 2000;
                                    C34231jv r8 = (C34231jv) arrayList.get(0);
                                    int i8 = r8.A02;
                                    if (i8 <= i7) {
                                        i6 -= i8;
                                        r2.A03 = i6;
                                        arrayList.remove(0);
                                        int i9 = i4;
                                        if (i4 < 5) {
                                            C34231jv[] r02 = r2.A05;
                                            i4++;
                                            r2.A02 = i4;
                                            r02[i9] = r8;
                                        }
                                    } else {
                                        r8.A02 = i8 - i7;
                                        i6 -= i7;
                                    }
                                }
                                break;
                            }
                            if (r14.A07 >= 2000 || r14.A06 >= 524288) {
                                if (r2.A00 != 0) {
                                    Collections.sort(arrayList, C88324aJ.A07);
                                    r2.A00 = 0;
                                }
                                float f4 = 0.5f * ((float) r2.A03);
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i10 < arrayList.size()) {
                                        C34231jv r1 = (C34231jv) arrayList.get(i10);
                                        i11 += r1.A02;
                                        if (((float) i11) >= f4) {
                                            f2 = r1.A00;
                                            break;
                                        }
                                        i10++;
                                    } else {
                                        f2 = arrayList.isEmpty() ? Float.NaN : ((C34231jv) arrayList.get(arrayList.size() - 1)).A00;
                                    }
                                }
                                r14.A02 = (long) f2;
                            }
                            r14.A08(i3, r14.A04, r14.A02);
                            r14.A05 = elapsedRealtime;
                            r14.A04 = 0;
                        }
                        r14.A01--;
                    }
                }
            }
        }
        this.A01 = null;
    }

    public final void A01() {
        for (int i2 = 0; i2 < this.A00; i2++) {
            this.A02.get(i2);
        }
    }

    public final void A02(int i2) {
        AnonymousClass3AL r6 = this.A01;
        for (int i3 = 0; i3 < this.A00; i3++) {
            boolean z2 = this.A03;
            AnonymousClass3E2 r4 = (AnonymousClass3E2) ((AnonymousClass5LZ) this.A02.get(i3));
            synchronized (r4) {
                if (z2) {
                    if ((r6.A00 & 8) != 8) {
                        r4.A04 += (long) i2;
                    }
                }
            }
        }
    }

    public final void A03(AnonymousClass3AL r6) {
        this.A01 = r6;
        for (int i2 = 0; i2 < this.A00; i2++) {
            boolean z2 = this.A03;
            AnonymousClass3E2 r3 = (AnonymousClass3E2) ((AnonymousClass5LZ) this.A02.get(i2));
            synchronized (r3) {
                if (z2) {
                    if ((r6.A00 & 8) != 8) {
                        int i3 = r3.A01;
                        if (i3 == 0) {
                            r3.A05 = SystemClock.elapsedRealtime();
                        }
                        r3.A01 = i3 + 1;
                    }
                }
            }
        }
    }

    public final void A4k(AnonymousClass5LZ r3) {
        ArrayList arrayList = this.A02;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
            this.A00++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((X.C57882s6) r1).A07;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ java.util.Map AFZ() {
        /*
            r1 = this;
            boolean r0 = r1 instanceof X.C57882s6
            if (r0 == 0) goto L_0x0010
            r0 = r1
            X.2s6 r0 = (X.C57882s6) r0
            java.net.HttpURLConnection r0 = r0.A07
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = r0.getHeaderFields()
            return r0
        L_0x0010:
            java.util.Map r0 = java.util.Collections.emptyMap()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3E3.AFZ():java.util.Map");
    }
}
