package X;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Set;

/* renamed from: X.4PC  reason: invalid class name */
public class AnonymousClass4PC {
    public final Context A00;
    public final AnonymousClass0P2 A01;
    public final AnonymousClass0P2 A02;
    public final C12860l5 A03;
    public final C12860l5 A04;
    public final C12190jz A05;
    public final AnonymousClass44f A06 = new AnonymousClass44f();
    public final C814048a A07;
    public final C814148b A08;
    public final C82084Bd A09;
    public final AnonymousClass5NW A0A;
    public final C82094Be A0B;
    public final C805444h A0C;
    public final AnonymousClass4V9 A0D;
    public final AnonymousClass4ZU A0E;
    public final Set A0F;
    public final Set A0G;

    /* JADX INFO: finally extract failed */
    public AnonymousClass4PC(AnonymousClass4LK r4) {
        C814048a r0;
        C814148b r02;
        C08800eM r03;
        AnonymousClass4YG.A00();
        this.A0B = new C82094Be(r4.A03);
        Context context = r4.A02;
        this.A03 = new C95594mt((ActivityManager) context.getSystemService("activity"));
        synchronized (C814048a.class) {
            r0 = C814048a.A00;
            if (r0 == null) {
                r0 = new C814048a();
                C814048a.A00 = r0;
            }
        }
        this.A07 = r0;
        this.A00 = context;
        this.A09 = new C82084Bd(new C805344g());
        synchronized (C814148b.class) {
            r02 = C814148b.A00;
            if (r02 == null) {
                r02 = new C814148b();
                C814148b.A00 = r02;
            }
        }
        this.A08 = r02;
        this.A04 = new C95584ms(this);
        try {
            AnonymousClass4YG.A00();
            AnonymousClass0P2 r2 = new AnonymousClass0P2(new AnonymousClass0OW(context));
            AnonymousClass4YG.A00();
            this.A01 = r2;
            synchronized (C08800eM.class) {
                r03 = C08800eM.A00;
                if (r03 == null) {
                    r03 = new C08800eM();
                    C08800eM.A00 = r03;
                }
            }
            this.A05 = r03;
            AnonymousClass4YG.A00();
            this.A0E = new AnonymousClass4ZU(30000);
            AnonymousClass4YG.A00();
            new C805744k();
            AnonymousClass4V9 r1 = new AnonymousClass4V9(new AnonymousClass4OO());
            this.A0D = r1;
            new C805544i();
            this.A0G = C13680ns.A0o();
            this.A0F = C13680ns.A0o();
            this.A02 = r2;
            this.A0A = new C95714n8(r1.A08.A02.A00);
            this.A0C = r4.A00;
            AnonymousClass4YG.A00();
        } catch (Throwable th) {
            AnonymousClass4YG.A00();
            throw th;
        }
    }
}
