package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.facebook.redex.IDxEventShape51S0200000_2_I1;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Iterator;

/* renamed from: X.3yM  reason: invalid class name and case insensitive filesystem */
public final class C78603yM extends C30211bx {
    public int A00 = 0;
    public C93604jT A01;
    public C108355Nq A02;
    public C16300so A03;
    public AnonymousClass4E4 A04;
    public boolean A05;
    public final Uri A06;
    public final AnonymousClass2PR A07;
    public final C65593Vj A08;

    public C78603yM(Context context, C14710pd r11, File file, int i2) {
        C108225Nd r2;
        if (r11 == null || !r11.A0C(793)) {
            C96284o5 r22 = new C96284o5(context);
            r22.A00 = 1;
            r2 = r22;
        } else {
            r2 = new C96254o2(new AnonymousClass3UK((Handler) null, (AnonymousClass5TI) null, new C96334oA((C90094dU) null, new C96354oC(new C109765Tm[0])), 0));
        }
        this.A06 = Uri.fromFile(file);
        C65593Vj r1 = new C65593Vj(context);
        this.A08 = r1;
        this.A01 = null;
        this.A05 = false;
        AnonymousClass2PR A002 = C806444x.A00(context, new C96184nv(new C97574qD(AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED), 50000, 50000, 2500, 5000), r2, r1);
        this.A07 = A002;
        C89164bh r6 = new C89164bh(i2 == 0 ? 2 : 1);
        A002.A03();
        if (!A002.A0H) {
            if (!AnonymousClass3C1.A0F(A002.A0A, r6)) {
                A002.A0A = r6;
                A002.A09(r6, 1, 3);
                A002.A0P.A03(2 - r6.A01 != 0 ? 3 : 0);
                C96224nz r3 = A002.A0S;
                AnonymousClass4VC A003 = C96224nz.A00(r3);
                r3.A05(A003, new IDxEventShape51S0200000_2_I1(r6, 5, A003), 1016);
                Iterator it = A002.A0T.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass000.A0W("onAudioAttributesChanged");
                }
            }
            AnonymousClass4WT r0 = A002.A0M;
            boolean AF3 = A002.AF3();
            A002.AF5();
            int i3 = -1;
            r0.A00();
            i3 = AF3 ? 1 : i3;
            int i4 = 1;
            if (AF3 && i3 != 1) {
                i4 = 2;
            }
            A002.A06(i3, i4, AF3);
        }
        A002.A4a(new C96214ny(this));
    }

    public int A02() {
        return (int) this.A07.ABQ();
    }

    public int A03() {
        return this.A00;
    }

    public void A04() {
        this.A07.AeK(false);
    }

    public void A05() {
        AnonymousClass2PR r3 = this.A07;
        C108355Nq r7 = this.A02;
        if (r7 == null) {
            r7 = new C97594qF();
            this.A02 = r7;
        }
        C96664oh r6 = new C96664oh();
        C97654qL r8 = new C97654qL();
        Uri uri = this.A06;
        C86284Rz r0 = new C86284Rz();
        r0.A00 = uri;
        C86804Uf r02 = r0.A00().A02;
        Uri uri2 = r02.A00;
        Object obj = r02.A01;
        if (obj == null) {
            obj = null;
        }
        r3.A08(new AnonymousClass3VL(uri2, r6, r7, r8, obj), true);
    }

    public void A06() {
        this.A04 = null;
        AnonymousClass2PR r1 = this.A07;
        r1.A0A(true);
        r1.A01();
    }

    public void A07() {
        this.A07.AeK(true);
    }

    public void A08() {
        this.A07.AeK(true);
    }

    public void A09() {
        this.A07.A0A(true);
    }

    public void A0A(int i2) {
        this.A07.AdF((long) i2);
    }

    public void A0B(MediaPlayer.OnErrorListener onErrorListener) {
    }

    public void A0C(AnonymousClass4E4 r1) {
        this.A04 = r1;
    }

    public boolean A0D() {
        AnonymousClass2PR r3 = this.A07;
        int AF5 = r3.AF5();
        return (AF5 == 3 || AF5 == 2) && r3.AF3();
    }

    public boolean A0E(C16300so r13, float f2) {
        this.A03 = r13;
        try {
            AnonymousClass2PR r4 = this.A07;
            r4.A03();
            AnonymousClass3UF r5 = r4.A0N;
            if (AnonymousClass3K4.A01(r5.A05.A04.A01, f2) >= 0.1f) {
                C89214bm r2 = new C89214bm(f2, 1.0f);
                r4.A03();
                C90184df r1 = r5.A05;
                if (!r1.A04.equals(r2)) {
                    C90184df A042 = r1.A04(r2);
                    r5.A02++;
                    C97684qO.A00(r5.A0B.A0Y, 4, r2);
                    r5.A06(A042, 4, 0, 1, false, false);
                }
            }
            return true;
        } catch (IllegalArgumentException | IllegalStateException unused) {
            StringBuilder A0r = AnonymousClass000.A0r("currSpeed: ");
            A0r.append(-1.0f);
            A0r.append(" , newSpeed: ");
            A0r.append(f2);
            r13.AcB("exoaudioplayer/setPlaybackSpeed failed", A0r.toString(), true);
            StringBuilder A0r2 = AnonymousClass000.A0r("exoaudioplayer/setPlaybackSpeed failed, currSpeed: ");
            A0r2.append(-1.0f);
            A0r2.append(" , newSpeed: ");
            A0r2.append(f2);
            Log.e(A0r2.toString());
            return false;
        }
    }
}
