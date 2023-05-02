package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: X.135  reason: invalid class name */
public class AnonymousClass135 implements AnonymousClass136 {
    public Runnable A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C18260wP A03;
    public final C16440t3 A04;
    public final C14710pd A05;
    public final C17190ug A06;
    public final AnonymousClass18J A07;
    public final AnonymousClass18I A08;
    public final C40761ue A09;
    public final C40761ue A0A;
    public final C16320sq A0B;
    public final Runnable A0C = new RunnableRunnableShape15S0100000_I0_14(this, 44);
    public final List A0D = Collections.singletonList("20210210");

    public AnonymousClass135(C14870pt r6, C16040sK r7, C18260wP r8, C16440t3 r9, C14710pd r10, C17190ug r11, AnonymousClass18J r12, AnonymousClass18I r13, C16320sq r14) {
        this.A04 = r9;
        this.A05 = r10;
        this.A01 = r6;
        this.A02 = r7;
        this.A0B = r14;
        this.A06 = r11;
        this.A07 = r12;
        this.A08 = r13;
        this.A03 = r8;
        this.A09 = new C40761ue(new Random(), 5, 16000);
        this.A0A = new C40761ue(new Random(), 5, 16000);
    }

    public int A00(String str) {
        SharedPreferences A002 = this.A08.A00();
        StringBuilder sb = new StringBuilder("tos_acceptance_state_");
        sb.append(str);
        return A002.getInt(sb.toString(), 0);
    }

    public void A01() {
        C16320sq r1 = this.A0B;
        r1.Ac3(this.A0C);
        Runnable runnable = this.A00;
        if (runnable != null) {
            r1.Ac3(runnable);
        }
        this.A09.A01();
        this.A0A.A01();
        this.A08.A00().edit().clear().apply();
    }

    public void A02(C41421vl r6) {
        this.A09.A01();
        AnonymousClass18I r4 = this.A08;
        r4.A00().edit().putLong("request_refresh_rate_seconds", r6.A00).apply();
        for (C41431vm r0 : r6.A01) {
            String str = r0.A01;
            r4.A01(str, r0.A00);
            r4.A02(str, System.currentTimeMillis());
        }
        this.A01.A0K(new RunnableRunnableShape15S0100000_I0_14(this.A07, 43));
    }

    public final void A03(List list, long j2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (A00(str) == 1) {
                arrayList.add(str);
            }
        }
        RunnableRunnableShape2S0300000_I0_2 runnableRunnableShape2S0300000_I0_2 = arrayList.isEmpty() ? null : new RunnableRunnableShape2S0300000_I0_2(this, list, arrayList, 20);
        this.A00 = runnableRunnableShape2S0300000_I0_2;
        if (runnableRunnableShape2S0300000_I0_2 == null) {
            this.A0A.A01();
        } else {
            this.A0B.Ad4(runnableRunnableShape2S0300000_I0_2, "ToSGatingRepository/postTosAcceptanceState", j2);
        }
    }
}
