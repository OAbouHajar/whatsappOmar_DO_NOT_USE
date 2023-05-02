package X;

import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.2Ex  reason: invalid class name and case insensitive filesystem */
public abstract class C46572Ex extends C16690tT {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final /* synthetic */ C46552Ev A03;

    public C46572Ex(C46552Ev r1, boolean z2, boolean z3, boolean z4) {
        this.A03 = r1;
        this.A00 = z2;
        this.A02 = z3;
        this.A01 = z4;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C34121jj A002;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = this instanceof C46562Ew;
        if (z2) {
            C46562Ew r6 = (C46562Ew) this;
            A002 = r6.A00.A01.A09(new AnonymousClass3FV(r6), false);
        } else {
            C51372bW r62 = (C51372bW) this;
            AnonymousClass2RY r5 = r62.A01;
            r5.A0B.A00();
            boolean z3 = r62.A02;
            StringBuilder sb = new StringBuilder();
            if (z3) {
                sb.append("restore>PrepareMessageStoreTask/");
                sb.append("initialize msgstore from backup");
                Log.i(sb.toString());
                C41011v3 r3 = new C41011v3(r62);
                C16250si r2 = r5.A01;
                A002 = r2.A09(new AnonymousClass3FW(r3, r2), r62.A01);
                if (!r62.A00) {
                    C18930xU r1 = r5.A05;
                    if (r1.A0X()) {
                        r1.A0P(5);
                    }
                }
            } else {
                sb.append("restore>PrepareMessageStoreTask/");
                sb.append("initializeMessageStore/newstore");
                Log.i(sb.toString());
                A002 = r5.A0A.A00();
            }
        }
        A07(100);
        long currentTimeMillis2 = 3000 - (System.currentTimeMillis() - currentTimeMillis);
        if ((z2 || this.A02) && currentTimeMillis2 > 0) {
            SystemClock.sleep(currentTimeMillis2);
        }
        int i2 = A002.A00;
        if (i2 == 2 || i2 == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z2 ? "restore>PrepareMessageStoreTransferTask/" : "restore>PrepareMessageStoreTask/");
            sb2.append("result: ");
            sb2.append(A002);
            Log.i(sb2.toString());
            if (!z2) {
                C51372bW r52 = (C51372bW) this;
                if (r52.A02 && i2 == 2 && r52.A00) {
                    r52.A01.A02.A0K(new RunnableRunnableShape2S0100000_I0_1(r52, 21));
                }
            }
            this.A03.A04.A00();
            A0B();
        }
        return A002;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r8) {
        /*
            r7 = this;
            X.1jj r8 = (X.C34121jj) r8
            r6 = r7
            r4 = r8
            boolean r5 = r7 instanceof X.C46562Ew
            if (r5 != 0) goto L_0x008c
            X.2bW r6 = (X.C51372bW) r6
            X.2SD r0 = X.AnonymousClass2RY.A0G
            if (r0 == 0) goto L_0x001a
            X.2RY r0 = r6.A01
            android.app.Activity r1 = r0.A01
            r0 = 100
            X.AnonymousClass29T.A00(r1, r0)
            r0 = 0
            X.AnonymousClass2RY.A0G = r0
        L_0x001a:
            int r1 = r8.A00
            if (r1 == 0) goto L_0x002a
            r0 = 3
            if (r1 == r0) goto L_0x002a
            r0 = 4
            if (r1 == r0) goto L_0x002a
            r0 = 5
            if (r1 == r0) goto L_0x002a
            r0 = 6
            if (r1 != r0) goto L_0x0080
        L_0x002a:
            java.util.concurrent.atomic.AtomicReference r1 = X.AnonymousClass2RY.A0H
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0080
            java.lang.Object r4 = r1.get()
            X.1jj r4 = (X.C34121jj) r4
        L_0x0038:
            int r1 = r4.A00
            if (r1 == 0) goto L_0x0048
            r0 = 3
            if (r1 == r0) goto L_0x0048
            r0 = 4
            if (r1 == r0) goto L_0x0048
            r0 = 5
            if (r1 == r0) goto L_0x0048
            r0 = 6
            if (r1 != r0) goto L_0x008c
        L_0x0048:
            r3 = 1
            java.lang.String r2 = "restore>PrepareMessageStoreTask/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r0 = "setting onePrepareMsgstoreTaskAlreadyFinished to true"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2RY r0 = r6.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0D
            boolean r0 = r0.getAndSet(r3)
            if (r0 == 0) goto L_0x008c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = "this attempt failed but another attempt in parallel proceeded further than this stage, therefore, aborting this attempt "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x007f:
            return
        L_0x0080:
            java.util.concurrent.atomic.AtomicReference r1 = X.AnonymousClass2RY.A0H
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L_0x0038
            r1.set(r8)
            goto L_0x0038
        L_0x008c:
            int r3 = r8.A00
            r2 = 1
            r0 = 2
            if (r3 == r0) goto L_0x0095
            if (r3 == r2) goto L_0x0095
            r2 = 0
        L_0x0095:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r5 == 0) goto L_0x0135
            java.lang.String r4 = "restore>PrepareMessageStoreTransferTask/"
        L_0x009e:
            if (r2 == 0) goto L_0x0122
            r1.append(r4)
            java.lang.String r0 = "success"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r2 = r7.A00
            if (r2 != 0) goto L_0x00d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "notregname/send-active"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2Ev r0 = r7.A03
            X.0y3 r1 = r0.A03
            r0 = 1
            r1.A03(r0)
        L_0x00d0:
            X.2Ev r1 = r7.A03
            X.11L r0 = r1.A04
            r0.A01()
            if (r2 != 0) goto L_0x00de
            X.0xk r0 = r1.A02
            r0.A04()
        L_0x00de:
            X.2Ev r2 = r7.A03
            boolean r1 = r2 instanceof X.C46542Eu
            if (r1 != 0) goto L_0x00ee
            r0 = r2
            X.2RY r0 = (X.AnonymousClass2RY) r0
            X.2SB r0 = r0.A03
            X.1ZA r0 = r0.A00
            r0.A36()
        L_0x00ee:
            if (r1 == 0) goto L_0x01ae
            X.2Eu r2 = (X.C46542Eu) r2
            X.2Et r6 = r2.A06
            boolean r0 = r8 instanceof X.C74073ph
            if (r0 == 0) goto L_0x01a5
            java.lang.String r0 = "DirectTransferBackgroundTaskViewModel/removeAllListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r1 = r6.A00
            java.lang.Runnable r0 = r6.A0C
            r1.removeCallbacks(r0)
            X.0rz r0 = r6.A05
            int r1 = r0.A0B()
            switch(r3) {
                case 0: goto L_0x0139;
                case 1: goto L_0x013b;
                case 2: goto L_0x010d;
                case 3: goto L_0x013e;
                case 4: goto L_0x0141;
                case 5: goto L_0x0144;
                case 6: goto L_0x0146;
                case 7: goto L_0x0148;
                case 8: goto L_0x014b;
                case 9: goto L_0x014d;
                case 10: goto L_0x014f;
                case 11: goto L_0x0151;
                case 12: goto L_0x0154;
                case 13: goto L_0x0157;
                case 14: goto L_0x015a;
                case 15: goto L_0x015d;
                case 16: goto L_0x0160;
                case 17: goto L_0x0163;
                case 18: goto L_0x0166;
                case 19: goto L_0x010d;
                case 20: goto L_0x0169;
                default: goto L_0x010d;
            }
        L_0x010d:
            java.lang.String r1 = "state is not recognized or not used = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0122:
            r1.append(r4)
            java.lang.String r0 = "failed with status: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00de
        L_0x0135:
            java.lang.String r4 = "restore>PrepareMessageStoreTask/"
            goto L_0x009e
        L_0x0139:
            r0 = 3
            goto L_0x016b
        L_0x013b:
            r0 = 20
            goto L_0x016b
        L_0x013e:
            r0 = 16
            goto L_0x016b
        L_0x0141:
            r0 = 17
            goto L_0x016b
        L_0x0144:
            r0 = 1
            goto L_0x016b
        L_0x0146:
            r0 = 2
            goto L_0x016b
        L_0x0148:
            r0 = 18
            goto L_0x016b
        L_0x014b:
            r0 = 5
            goto L_0x016b
        L_0x014d:
            r0 = 6
            goto L_0x016b
        L_0x014f:
            r0 = 7
            goto L_0x016b
        L_0x0151:
            r0 = 8
            goto L_0x016b
        L_0x0154:
            r0 = 9
            goto L_0x016b
        L_0x0157:
            r0 = 10
            goto L_0x016b
        L_0x015a:
            r0 = 11
            goto L_0x016b
        L_0x015d:
            r0 = 12
            goto L_0x016b
        L_0x0160:
            r0 = 13
            goto L_0x016b
        L_0x0163:
            r0 = 14
            goto L_0x016b
        L_0x0166:
            r0 = 15
            goto L_0x016b
        L_0x0169:
            r0 = 19
        L_0x016b:
            r6.A08(r1, r0)
            r5 = 1
            if (r3 == r5) goto L_0x0172
            r5 = 0
        L_0x0172:
            r4 = 3
            r2 = 2
            if (r5 != 0) goto L_0x0178
            if (r1 != r4) goto L_0x017d
        L_0x0178:
            X.0yl r0 = r6.A0A
            r0.A02()
        L_0x017d:
            java.lang.String r1 = "DirectTransferBackgroundTaskViewModel/afterMessageStoreVerified/success = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r5 == 0) goto L_0x0194
            r6.A07(r2)
            return
        L_0x0194:
            r0 = 5
            if (r3 == r0) goto L_0x01a1
            r0 = 6
            if (r3 == r0) goto L_0x01a1
            r0 = 7
            if (r3 == r0) goto L_0x007f
            r6.A07(r4)
            return
        L_0x01a1:
            r6.A07(r0)
            return
        L_0x01a5:
            java.lang.String r1 = "should only use RestoreFromDirectMigrationStatus class here"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01ae:
            X.2RY r2 = (X.AnonymousClass2RY) r2
            X.2SB r0 = r2.A03
            X.1ZA r0 = r0.A00
            r0.A37(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46572Ex.A0A(java.lang.Object):void");
    }

    public void A0B() {
        C51372bW r1 = (C51372bW) this;
        if (r1.A00 && r1.A02) {
            AnonymousClass2RY r4 = r1.A01;
            for (C16240sh r5 : (Set) r4.A0C.get()) {
                String AA3 = r5.AA3();
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("restore>PrepareMessageStoreTask/");
                    sb.append("restoring ");
                    sb.append(AA3);
                    Log.i(sb.toString());
                    r5.Aca(r4.A01);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("restore>PrepareMessageStoreTask/");
                    sb2.append("restored ");
                    sb2.append(AA3);
                    Log.i(sb2.toString());
                } catch (Exception e2) {
                    StringBuilder sb3 = new StringBuilder("restore>PrepareMessageStoreTask/");
                    sb3.append("failed to restore ");
                    sb3.append(AA3);
                    Log.w(sb3.toString(), e2);
                }
            }
        }
    }
}
