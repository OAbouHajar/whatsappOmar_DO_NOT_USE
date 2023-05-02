package X;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape15S0200000_I1_3;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.2RO  reason: invalid class name */
public class AnonymousClass2RO {
    public long A00;
    public C54702i2 A01;
    public AnonymousClass2RN A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final AnonymousClass1G1 A06;
    public final C208811y A07;
    public final C14870pt A08;
    public final C18260wP A09;
    public final C16000sG A0A;
    public final C17030uP A0B;
    public final C23181Au A0C;
    public final C16440t3 A0D;
    public final C17120uZ A0E;
    public final C19820z3 A0F;
    public final C226818w A0G;
    public final C14710pd A0H;
    public final C16490t9 A0I;
    public final C17190ug A0J;
    public final C16320sq A0K;
    public final C23201Aw A0L;
    public final String A0M;
    public final WeakReference A0N;
    public final boolean A0O;
    public final boolean A0P;

    public AnonymousClass2RO(AnonymousClass1G1 r3, C208811y r4, C14870pt r5, C18260wP r6, C16000sG r7, C17030uP r8, C23181Au r9, C16440t3 r10, C17120uZ r11, C19820z3 r12, C226818w r13, C14710pd r14, C16490t9 r15, C17190ug r16, C51202bB r17, C16320sq r18, C23201Aw r19, String str, int i2, int i3, boolean z2) {
        this.A0D = r10;
        this.A0H = r14;
        this.A08 = r5;
        this.A0K = r18;
        this.A0I = r15;
        this.A0J = r16;
        this.A0A = r7;
        this.A07 = r4;
        this.A0C = r9;
        this.A06 = r3;
        this.A0G = r13;
        this.A05 = i2;
        this.A0L = r19;
        this.A0E = r11;
        this.A0F = r12;
        this.A0M = str;
        this.A0O = z2;
        this.A0B = r8;
        this.A09 = r6;
        C51202bB r1 = r17;
        this.A0N = new WeakReference(r1);
        this.A04 = i3;
        this.A0P = r1.A02;
    }

    public void A00() {
        this.A03 = true;
        C54702i2 r1 = this.A01;
        if (r1 != null) {
            r1.A06(false);
            this.A01 = null;
        }
        C51202bB r12 = (C51202bB) this.A0N.get();
        if (r12 != null) {
            r12.A0a = false;
        }
    }

    public void A01(AnonymousClass284 r8, C450927a r9) {
        if (r9 != null && this.A02 == null) {
            this.A02 = new AnonymousClass2RN(r9.A0C, (String) null, (String) null, 3, 0);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        this.A08.A0L(new RunnableRunnableShape15S0200000_I1_3(this, 7, r8), elapsedRealtime < 500 ? 500 - elapsedRealtime : 0);
    }

    public void A02(AnonymousClass2RN r22) {
        boolean z2;
        int i2;
        C31081dR r1;
        if (!this.A03) {
            C14710pd r9 = this.A0H;
            String str = this.A0M;
            boolean A052 = C18030w2.A05(r9, str);
            if (A052 && (r1 = (C31081dR) this.A0G.A02.get("fetch_biz_info")) != null) {
                r1.A07("datasource");
            }
            AnonymousClass2RN r6 = r22;
            this.A02 = r6;
            UserJid userJid = r6.A02;
            int i3 = r6.A01;
            if (i3 == -1 || (i2 = this.A05) != i3 || userJid == null) {
                z2 = true;
                A01((AnonymousClass284) null, (C450927a) null);
            } else {
                z2 = false;
                C16620tM r8 = C16620tM.A02;
                if (r9.A0E(r8, 508)) {
                    String str2 = i2 == 2 ? "message_short_link" : "qr_code";
                    if (r9.A0E(r8, 1669) && i2 == 2) {
                        if (C18030w2.A06(r9, str)) {
                            str2 = "custom_qr_code_link";
                        } else if (C18030w2.A05(r9, str)) {
                            str2 = "custom_link";
                        }
                    }
                    this.A0F.A00(new C41261vV(new C41271vW(userJid, str2, this.A0O ? "whatsapp" : null, System.currentTimeMillis(), System.currentTimeMillis())));
                }
                this.A0L.A00(Uri.parse(str), userJid);
                C54702i2 r13 = new C54702i2(this.A07, this.A0A, this.A0C, userJid, this, r6.A04, (String) null);
                this.A01 = r13;
                this.A0K.Ack(r13, new Void[0]);
            }
            if (A052) {
                boolean z3 = !z2;
                Map map = this.A0G.A02;
                C31081dR r12 = (C31081dR) map.get("fetch_biz_info");
                if (r12 != null) {
                    short s2 = 3;
                    if (z3) {
                        s2 = 2;
                    }
                    r12.A0C(s2);
                    map.remove("fetch_biz_info");
                }
            }
        }
    }
}
