package X;

import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: X.1MV  reason: invalid class name */
public class AnonymousClass1MV {
    public final C16180sb A00;
    public final C15900s5 A01;
    public final C16760tb A02;
    public final AnonymousClass01Y A03;
    public final C17650vQ A04;
    public final AnonymousClass12W A05;
    public final AnonymousClass01V A06;
    public final C16440t3 A07;
    public final C16260sj A08;
    public final C14730pf A09;
    public final C14710pd A0A;
    public final C16490t9 A0B;
    public final C16320sq A0C;
    public final C25961Lu A0D;

    public AnonymousClass1MV(C16180sb r1, C15900s5 r2, C16760tb r3, AnonymousClass01Y r4, C17650vQ r5, AnonymousClass12W r6, AnonymousClass01V r7, C16440t3 r8, C16260sj r9, C14730pf r10, C14710pd r11, C16490t9 r12, C16320sq r13, C25961Lu r14) {
        this.A07 = r8;
        this.A0A = r11;
        this.A0C = r13;
        this.A00 = r1;
        this.A0B = r12;
        this.A02 = r3;
        this.A01 = r2;
        this.A09 = r10;
        this.A0D = r14;
        this.A04 = r5;
        this.A06 = r7;
        this.A03 = r4;
        this.A05 = r6;
        this.A08 = r9;
    }

    public static void A00(C30811cz r4, long j2, boolean z2) {
        try {
            FileOutputStream fileOutputStream = r4.A02;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (Exception e2) {
            if (!z2 || j2 < 1000) {
                StringBuilder sb = new StringBuilder();
                sb.append("pttutils/closevisualization/closevisualization ");
                sb.append(e2.toString());
                Log.i(sb.toString());
                return;
            }
            Log.e("pttutils/closevisualization/closevisualization ", e2);
        }
    }

    public void A01(AnonymousClass1XP r4, C38701rH r5, File file) {
        if (file == null || !this.A0A.A0E(C16620tM.A02, 746)) {
            this.A02.A0L(r4, r5);
            if (file != null) {
                this.A0C.Acl(new RunnableRunnableShape12S0100000_I0_11((Object) file, 43));
                return;
            }
            return;
        }
        this.A0C.Acn(new C78943yw(this.A02, r4, r5, file), new Void[0]);
    }

    public void A02(C30811cz r6, long j2, boolean z2) {
        try {
            r6.A01();
        } catch (Exception e2) {
            if (!z2 || j2 < 1000) {
                StringBuilder sb = new StringBuilder();
                sb.append("pttutils/stopaudiorecordandvisualization/stopaudiorecord ");
                sb.append(e2.toString());
                Log.i(sb.toString());
            } else {
                Log.e("pttutils/stopaudiorecordandvisualization/stopaudiorecord ", e2);
            }
        } catch (Throwable th) {
            A00(r6, j2, z2);
            throw th;
        }
        A00(r6, j2, z2);
    }

    public boolean A03(C001000l r7, C14600pS r8, C15830rv r9) {
        if (A04(r8)) {
            Log.i("voicenote/startvoicenote");
            if (this.A05.A04(new C101684xi(r7, this))) {
                int i2 = (this.A09.A01() > ((long) ((this.A01.A02(C15910s6.A1f) << 10) << 10)) ? 1 : (this.A09.A01() == ((long) ((this.A01.A02(C15910s6.A1f) << 10) << 10)) ? 0 : -1));
                if (!this.A03.A0V(UserJid.of(r9))) {
                    return true;
                }
                AnonymousClass29T.A01(r7, 106);
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r3.getCallState() == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C14600pS r5) {
        /*
            r4 = this;
            X.01V r0 = r4.A06
            android.telephony.TelephonyManager r3 = r0.A0N()
            r2 = 0
            if (r3 == 0) goto L_0x0015
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 >= r0) goto L_0x0022
            int r0 = r3.getCallState()
            if (r0 != 0) goto L_0x0031
        L_0x0015:
            X.0vQ r0 = r4.A04
            boolean r1 = r0.A00()
            r0 = 2131888233(0x7f120869, float:1.9411096E38)
            if (r1 != 0) goto L_0x0034
            r0 = 1
            return r0
        L_0x0022:
            X.0sj r0 = r4.A08     // Catch:{ SecurityException -> 0x0015 }
            boolean r0 = r0.A0C()     // Catch:{ SecurityException -> 0x0015 }
            if (r0 == 0) goto L_0x0015
            int r0 = r3.getCallStateForSubscription()     // Catch:{ SecurityException -> 0x0015 }
            if (r0 != 0) goto L_0x0031
            goto L_0x0015
        L_0x0031:
            r0 = 2131888234(0x7f12086a, float:1.9411098E38)
        L_0x0034:
            r5.Afg(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MV.A04(X.0pS):boolean");
    }
}
