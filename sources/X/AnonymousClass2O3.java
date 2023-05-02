package X;

import android.os.SystemClock;
import com.facebook.redex.IDxRCallbackShape11S0300000_1_I0;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2O3  reason: invalid class name */
public class AnonymousClass2O3 extends C16690tT {
    public final C14870pt A00;
    public final C16000sG A01;
    public final C16080sP A02;
    public final C16440t3 A03;
    public final C17240ul A04;
    public final C17780vd A05;
    public final C16050sL A06;
    public final WeakReference A07;
    public final List A08;
    public final List A09;

    public AnonymousClass2O3(C14550pN r2, C14870pt r3, C16000sG r4, C16080sP r5, C16440t3 r6, C17240ul r7, C17780vd r8, C16050sL r9, List list, List list2) {
        this.A03 = r6;
        this.A00 = r3;
        this.A05 = r8;
        this.A01 = r4;
        this.A02 = r5;
        this.A04 = r7;
        this.A07 = new WeakReference(r2);
        this.A06 = r9;
        this.A09 = list;
        this.A08 = list2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C17780vd r8 = this.A05;
        C16050sL r11 = this.A06;
        List list = this.A09;
        List list2 = this.A08;
        AnonymousClass2Or r7 = new AnonymousClass2Or(this);
        C17190ug r14 = r8.A02;
        String A022 = r14.A02();
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            arrayList.add(C17780vd.A00("promote", list));
        }
        if (!list2.isEmpty()) {
            arrayList.add(C17780vd.A00("demote", list2));
        }
        C28371Vv r2 = new C28371Vv(new C28371Vv("admin", (C35081lL[]) null, (C28371Vv[]) arrayList.toArray(new C28371Vv[0])), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "w:g2"), new C35081lL("type", "set"), new C35081lL((Jid) r11, "to")});
        C29951bV r5 = new C29951bV();
        r14.A0A(new IDxRCallbackShape11S0300000_1_I0(r5, r8, r7, 1), r2, A022, 166, 32000);
        try {
            r5.get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                try {
                    Thread.sleep(500 - elapsedRealtime2);
                    return null;
                } catch (InterruptedException unused) {
                }
            }
        } catch (Exception e2) {
            Log.w("modify-admins/timeout", e2);
            this.A00.A0K(new RunnableRunnableShape9S0100000_I0_8(this, 33));
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C14550pN r1 = (C14550pN) this.A07.get();
        if (r1 != null && !r1.isFinishing()) {
            r1.Ac1();
        }
    }
}
