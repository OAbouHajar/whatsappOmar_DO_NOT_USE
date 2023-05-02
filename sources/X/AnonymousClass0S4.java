package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.0S4  reason: invalid class name */
public class AnonymousClass0S4 {
    public final C12860l5 A00;
    public final C12860l5 A01;
    public final C12890l8 A02;
    public final AnonymousClass0PN A03;
    public final AnonymousClass4SM A04;
    public final C95604mu A05;
    public final ExecutorService A06;
    public final ScheduledExecutorService A07;

    public AnonymousClass0S4(C12860l5 r1, C12860l5 r2, C12890l8 r3, AnonymousClass0PN r4, AnonymousClass4SM r5, C95604mu r6, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = r4;
        this.A07 = scheduledExecutorService;
        this.A06 = executorService;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final C13580mc A00(C85654Pj r11) {
        AnonymousClass0UA r6;
        C61803Aj A032 = A03(r11);
        C13340ls A012 = A01(r11);
        C05460Rn r8 = new C05460Rn(A012, A032);
        int A0D = AnonymousClass000.A0D(this.A01.get());
        C05920Tn r7 = null;
        if (A0D > 0) {
            r7 = new C05920Tn(A0D);
            r6 = A02(r8);
        } else {
            r6 = null;
        }
        C08840eS r3 = new C08840eS(new C08850eT(A032), A012, r6, r7, r8, this.A04);
        return new C08830eR(this.A02, r3, r3, this.A07);
    }

    public final C13340ls A01(C85654Pj r4) {
        int A0D = AnonymousClass000.A0D(this.A00.get());
        return A0D != 1 ? A0D != 2 ? A0D != 3 ? new C08860eU() : new C08870eV() : new C08880eW(A04(r4), false) : new C08880eW(A04(r4), true);
    }

    public final AnonymousClass0UA A02(C05460Rn r5) {
        return new AnonymousClass0UA(Bitmap.Config.ARGB_8888, r5, this.A04, this.A06);
    }

    public final C61803Aj A03(C85654Pj r5) {
        C41981x0 A002 = r5.A00();
        return this.A03.A00(new Rect(0, 0, A002.getWidth(), A002.getHeight()), r5);
    }

    public final C87404Wq A04(C85654Pj r4) {
        r4.hashCode();
        return new C87404Wq(new C08770eJ(), this.A05);
    }
}
