package X;

import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.26x  reason: invalid class name and case insensitive filesystem */
public class C450626x {
    public AnonymousClass027 A00;
    public AnonymousClass027 A01 = new AnonymousClass027();
    public final AnonymousClass027 A02 = new AnonymousClass027();
    public final C17210ui A03;
    public final C450726y A04;
    public final C25641Ko A05;
    public final C16000sG A06;
    public final C16440t3 A07;
    public final C16320sq A08;

    public C450626x(C17210ui r4, AnonymousClass1OB r5, C25641Ko r6, C16000sG r7, C16440t3 r8, C16320sq r9) {
        this.A07 = r8;
        this.A08 = r9;
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = new C450726y(r5);
        this.A00 = new AnonymousClass027();
        this.A08.Acl(new RunnableRunnableShape4S0100000_I0_3(this, 33));
    }

    public static /* synthetic */ void A00(C35641mG r8, C450626x r9, int i2) {
        List list = (List) r9.A00.A01();
        if (list == null || list.isEmpty()) {
            Log.e("DirectoryRecentSearchDelegate/logRecentSearchListItemEvent trying to log an action while the list of recent searches is null/empty");
            return;
        }
        C17210ui r7 = r9.A03;
        Long valueOf = Long.valueOf((long) list.size());
        Long valueOf2 = Long.valueOf(((long) list.indexOf(r8)) + 1);
        Integer A022 = r9.A05.A02();
        C29151a7 r1 = new C29151a7();
        r1.A0B = Integer.valueOf(i2);
        r1.A0Q = valueOf;
        r1.A0U = valueOf2;
        r1.A0N = 1L;
        r1.A06 = A022;
        r7.A06(r1);
    }

    public void A01(C35641mG r8) {
        C450726y r5 = this.A04;
        List A002 = r5.A00();
        boolean z2 = false;
        for (int i2 = 0; i2 < A002.size(); i2++) {
            if (A002.get(i2).equals(r8)) {
                A002.set(i2, r8);
                z2 = true;
            }
        }
        if (!z2) {
            A002.add(r8);
        }
        Collections.sort(A002, r5.A01);
        AnonymousClass1OB r4 = r5.A00;
        r4.A05.Acl(new RunnableRunnableShape3S0200000_I0_1(r4, 32, A002.subList(0, Math.min(50, A002.size()))));
        this.A00.A0B(r5.A00());
    }

    public void A02(C35641mG r7) {
        C450726y r5 = this.A04;
        List A002 = r5.A00();
        A002.remove(r7);
        AnonymousClass1OB r3 = r5.A00;
        r3.A05.Acl(new RunnableRunnableShape3S0200000_I0_1(r3, 32, A002));
        this.A00.A0B(r5.A00());
    }
}
