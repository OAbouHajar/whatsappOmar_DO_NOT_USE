package X;

import android.database.ContentObserver;
import android.util.SparseArray;
import com.facebook.redex.IDxCObserverShape9S0100000_2_I0;
import com.obwhatsapp.mediaview.MediaViewFragment;

/* renamed from: X.2Rd  reason: invalid class name and case insensitive filesystem */
public class C49122Rd implements AnonymousClass2B7 {
    public int A00;
    public int A01;
    public C16930tt A02;
    public C16930tt A03;
    public C607636a A04;
    public AnonymousClass36Y A05;
    public AnonymousClass36Y A06;
    public Runnable A07;
    public boolean A08;
    public boolean A09;
    public final ContentObserver A0A = new IDxCObserverShape9S0100000_2_I0(this);
    public final SparseArray A0B;
    public final C16460t6 A0C;
    public final C16480t8 A0D;
    public final C14710pd A0E;
    public final C15830rv A0F;
    public final MediaViewFragment A0G;
    public final C16730tY A0H;
    public final C16320sq A0I;

    public C49122Rd(C16460t6 r3, C16480t8 r4, C14710pd r5, C15830rv r6, MediaViewFragment mediaViewFragment, C16730tY r8, C16320sq r9) {
        SparseArray sparseArray = new SparseArray();
        this.A0B = sparseArray;
        this.A0E = r5;
        this.A0G = mediaViewFragment;
        this.A0H = r8;
        this.A0I = r9;
        this.A0F = r6;
        this.A0C = r3;
        this.A0D = r4;
        sparseArray.put(0, r8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16730tY ADV(int r21) {
        /*
            r20 = this;
            r9 = r20
            int r1 = r9.A00
            int r0 = r21 - r1
            android.util.SparseArray r2 = r9.A0B
            java.lang.Object r6 = r2.get(r0)
            X.0tY r6 = (X.C16730tY) r6
            if (r6 != 0) goto L_0x0028
            r1 = 0
            java.lang.String r5 = " pos:"
            r6 = 0
            if (r0 >= 0) goto L_0x0029
            X.0tt r7 = r9.A02
            if (r7 == 0) goto L_0x0028
            int r3 = -r0
            int r4 = r3 + -1
            int r3 = r7.getCount()
            if (r4 < r3) goto L_0x00a9
            X.0tt r0 = r9.A02
        L_0x0025:
            r0.getCount()
        L_0x0028:
            return r6
        L_0x0029:
            if (r0 != 0) goto L_0x002f
            X.0tY r6 = r9.A0H
            goto L_0x0113
        L_0x002f:
            X.0tt r3 = r9.A03
            if (r3 == 0) goto L_0x0028
            int r4 = r0 + -1
            int r3 = r3.getCount()
            if (r4 < r3) goto L_0x003e
            X.0tt r0 = r9.A03
            goto L_0x0025
        L_0x003e:
            X.0tt r3 = r9.A03
            boolean r3 = r3.moveToPosition(r4)
            if (r3 == 0) goto L_0x0028
            boolean r3 = r9.A09
            if (r3 != 0) goto L_0x00a6
            X.36Y r3 = r9.A06
            if (r3 != 0) goto L_0x00a6
            X.0tt r3 = r9.A03
            int r4 = r3.getPosition()
            X.0tt r3 = r9.A03
            int r3 = r3.getCount()
            int r3 = r3 >> 1
            if (r4 <= r3) goto L_0x00a6
            java.lang.String r3 = "MediaMessagesNavigator/navigator/ start upgrade tail cursor count:"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            X.0tt r3 = r9.A03
            int r3 = r3.getCount()
            r4.append(r3)
            r4.append(r5)
            X.0tt r3 = r9.A03
            int r3 = r3.getPosition()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.0pd r13 = r9.A0E
            X.0t6 r11 = r9.A0C
            X.0t8 r12 = r9.A0D
            X.0rv r14 = r9.A0F
            X.0tY r3 = r9.A0H
            long r3 = r3.A13
            X.0tt r5 = r9.A03
            int r16 = r5.getPosition()
            X.36Y r10 = new X.36Y
            r15 = r9
            r17 = r3
            r19 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r19)
            r9.A06 = r10
            X.0sq r3 = r9.A0I
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r3.Ack(r10, r1)
        L_0x00a6:
            X.0tt r1 = r9.A03
            goto L_0x010f
        L_0x00a9:
            X.0tt r3 = r9.A02
            boolean r3 = r3.moveToPosition(r4)
            if (r3 == 0) goto L_0x0028
            boolean r3 = r9.A08
            if (r3 != 0) goto L_0x010d
            X.36Y r3 = r9.A05
            if (r3 != 0) goto L_0x010d
            X.0tt r3 = r9.A02
            int r4 = r3.getPosition()
            X.0tt r3 = r9.A02
            int r3 = r3.getCount()
            int r3 = r3 >> 1
            if (r4 <= r3) goto L_0x010d
            java.lang.String r3 = "MediaMessagesNavigator/navigator/ start upgrade head cursor count:"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            X.0tt r3 = r9.A02
            int r3 = r3.getCount()
            r4.append(r3)
            r4.append(r5)
            X.0tt r3 = r9.A02
            int r3 = r3.getPosition()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.0pd r7 = r9.A0E
            X.0t6 r5 = r9.A0C
            X.0t8 r6 = r9.A0D
            X.0rv r8 = r9.A0F
            X.0tY r3 = r9.A0H
            long r11 = r3.A13
            r13 = 1
            X.0tt r3 = r9.A02
            int r10 = r3.getPosition()
            X.36Y r4 = new X.36Y
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13)
            r9.A05 = r4
            X.0sq r3 = r9.A0I
            java.lang.Void[] r1 = new java.lang.Void[r1]
            r3.Ack(r4, r1)
        L_0x010d:
            X.0tt r1 = r9.A02
        L_0x010f:
            X.0tY r6 = r1.A00()
        L_0x0113:
            if (r6 == 0) goto L_0x0028
            r2.put(r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49122Rd.ADV(int):X.0tY");
    }

    public int AF9(C28381Vw r5) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.A0B;
            if (i2 >= sparseArray.size()) {
                return -2;
            }
            int keyAt = sparseArray.keyAt(i2);
            if (r5.equals(((C16740tZ) sparseArray.get(keyAt)).A11)) {
                return this.A00 + keyAt;
            }
            i2++;
        }
    }

    public void ATs() {
    }

    public void Adq(Runnable runnable) {
        this.A07 = runnable;
    }

    public void Ag5() {
        C14710pd r5 = this.A0E;
        C15830rv r6 = this.A0F;
        C16730tY r8 = this.A0H;
        C607636a r2 = new C607636a(this.A0C, this.A0D, r5, r6, this, r8);
        this.A04 = r2;
        this.A0I.Ack(r2, new Void[0]);
    }

    public void AgL() {
        C607636a r0 = this.A04;
        if (r0 != null && !r0.A02.isCancelled()) {
            this.A04.A06(true);
        }
    }

    public void AhQ(int i2) {
    }

    public void close() {
        AgL();
        C16930tt r0 = this.A02;
        if (r0 != null) {
            r0.close();
        }
        this.A02 = null;
        C16930tt r02 = this.A03;
        if (r02 != null) {
            r02.close();
        }
        this.A03 = null;
        AnonymousClass36Y r03 = this.A05;
        if (r03 != null) {
            r03.A06(true);
        }
        this.A05 = null;
        AnonymousClass36Y r04 = this.A06;
        if (r04 != null) {
            r04.A06(true);
        }
        this.A06 = null;
        this.A08 = false;
        this.A09 = false;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B.clear();
    }

    public int getCount() {
        return this.A00 + 1 + this.A01;
    }
}
