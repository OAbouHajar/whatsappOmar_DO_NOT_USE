package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.List;

/* renamed from: X.3U0  reason: invalid class name */
public class AnonymousClass3U0 extends AnonymousClass3BJ implements C108195Na {
    public static final AnonymousClass5SJ A0I = new C95934nW();
    public static final AnonymousClass5SJ A0J = new C95994nc();
    public static final AnonymousClass5SJ A0K = new C95894nS();
    public static final AnonymousClass5SJ A0L = new C95914nU();
    public static final AnonymousClass5SJ A0M = new C95974na();
    public static final AnonymousClass5SJ A0N = new C95964nZ();
    public static final AnonymousClass5SJ A0O = new C95984nb();
    public static final AnonymousClass5SJ A0P = new C62503Du();
    public static final AnonymousClass5SJ A0Q = new C95924nV();
    public static final AnonymousClass5SJ A0R = new C96004nd();
    public static final AnonymousClass5SJ A0S = new C95904nT();
    public static final AnonymousClass5SJ A0T = new C95944nX();
    public static final AnonymousClass5SJ A0U = new C95954nY();
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03 = 0;
    public int A04;
    public Rect A05;
    public C005502j A06;
    public C02840Fl A07;
    public AnonymousClass41R A08 = AnonymousClass41R.LIST;
    public AnonymousClass4Bp A09;
    public List A0A;
    public List A0B;
    public boolean A0C = true;
    public boolean A0D = true;
    public boolean A0E;
    public final long A0F;
    public final C57522rJ A0G;
    public final AnonymousClass4CJ A0H;

    public AnonymousClass3U0(C57522rJ r6, AnonymousClass4CJ r7, long j2) {
        super(AnonymousClass416.VIEW);
        this.A0F = j2;
        this.A0G = r6;
        this.A0H = r7;
        A06(new C88574aj(A0P, this), new C88574aj(A0I, this), new C88574aj(A0T, this), new C88574aj(A0U, this), new C88574aj(A0N, this), new C88574aj(A0M, this), new C88574aj(A0O, this), new C88574aj(A0J, this), new C88574aj(A0R, this), new C88574aj(A0K, this), new C88574aj(A0S, this), new C88574aj(A0L, this), new C88574aj(A0Q, this));
    }

    public long A03() {
        return this.A0F;
    }

    public void A07(AnonymousClass071 r2) {
        List list = this.A0B;
        if (list == null) {
            list = C13690nt.A0i(4);
            this.A0B = list;
        }
        list.add(r2);
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        return new AnonymousClass3T4(context);
    }
}
