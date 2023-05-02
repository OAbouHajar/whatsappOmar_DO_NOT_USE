package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape0S0210000_I0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2TH  reason: invalid class name */
public class AnonymousClass2TH extends C16690tT {
    public int A00;
    public int A01;
    public final int A02;
    public final Context A03;
    public final C14870pt A04;
    public final AnonymousClass013 A05;
    public final AnonymousClass2TI A06;
    public final C54552hi A07;
    public final C56122l0 A08;
    public final List A09;
    public final boolean A0A;

    public AnonymousClass2TH(Context context, C001300o r3, C14870pt r4, AnonymousClass013 r5, AnonymousClass2TI r6, C54552hi r7, C56122l0 r8, List list, int i2, boolean z2) {
        super(r3, true);
        this.A06 = r6;
        this.A03 = context;
        this.A04 = r4;
        this.A0A = z2;
        this.A09 = list;
        this.A05 = r5;
        this.A07 = r7;
        this.A08 = r8;
        this.A02 = i2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass2BF ADR;
        AnonymousClass2BC A7S = this.A07.A7S(!this.A0A);
        this.A01 = A7S.getCount();
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList arrayList = new ArrayList();
        C56112kz r5 = null;
        int i2 = 0;
        while (i2 < this.A01 && !this.A02.isCancelled() && (ADR = A7S.ADR(i2)) != null) {
            if (i2 == this.A02 - 1 && r5 != null) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                C56112kz r1 = new C56112kz(this.A03, this.A05, r5);
                r1.count = this.A01;
                arrayList2.add(r1);
                uptimeMillis = SystemClock.uptimeMillis();
                this.A04.A0K(new RunnableRunnableShape0S0210000_I0(this, arrayList2, 14, true));
            }
            C56112kz A002 = this.A08.A00(ADR.ABe());
            if (r5 != null) {
                if (!r5.equals(A002)) {
                    arrayList.add(r5);
                }
                r5.count++;
                if (!arrayList.isEmpty() && 1000 + uptimeMillis < SystemClock.uptimeMillis()) {
                    uptimeMillis = SystemClock.uptimeMillis();
                    ArrayList arrayList3 = new ArrayList(arrayList);
                    arrayList.clear();
                    this.A04.A0K(new RunnableRunnableShape0S0210000_I0(this, arrayList3, 14, false));
                }
                i2++;
            }
            A002.count = 0;
            r5 = A002;
            r5.count++;
            uptimeMillis = SystemClock.uptimeMillis();
            ArrayList arrayList32 = new ArrayList(arrayList);
            arrayList.clear();
            this.A04.A0K(new RunnableRunnableShape0S0210000_I0(this, arrayList32, 14, false));
            i2++;
        }
        if (r5 != null && !this.A02.isCancelled()) {
            arrayList.add(r5);
        }
        if (!arrayList.isEmpty()) {
            this.A04.A0K(new RunnableRunnableShape0S0210000_I0(this, arrayList, 14, false));
        }
        this.A01 = A7S.getCount();
        A7S.close();
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        this.A06.A00.A1J(false);
    }
}
