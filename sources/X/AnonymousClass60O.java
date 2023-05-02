package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.60O  reason: invalid class name */
public class AnonymousClass60O implements C227519d {
    public long A00 = -1;
    public final AnonymousClass15J A01;
    public final C14870pt A02;
    public final C18260wP A03;
    public final C16440t3 A04;
    public final C16980tz A05;
    public final C17190ug A06;
    public final C119365wy A07;
    public final AnonymousClass60V A08;
    public final C18340wX A09;
    public final C18300wT A0A;
    public final Set A0B = C13680ns.A0o();

    public AnonymousClass60O(AnonymousClass15J r7, C14870pt r8, C18260wP r9, C16440t3 r10, C16980tz r11, C17190ug r12, C119365wy r13, AnonymousClass60V r14, C18340wX r15, C18300wT r16) {
        this.A05 = r11;
        this.A04 = r10;
        this.A01 = r7;
        this.A02 = r8;
        this.A06 = r12;
        C18300wT r4 = r16;
        this.A0A = r4;
        this.A07 = r13;
        this.A03 = r9;
        this.A09 = r15;
        this.A08 = r14;
        this.A00 = r4.A01().getLong("payments_block_list_last_sync_time", -1);
        String string = r4.A01().getString("payments_block_list", "");
        if (!TextUtils.isEmpty(string)) {
            for (String A0K : string.split(";")) {
                this.A0B.add(new C118685v5(C110105dW.A0K(A0K), this));
            }
        }
    }

    public synchronized void A00(C35301lh r5, boolean z2) {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append("PAY: IndiaUpiBlockListManager before block vpa: ");
        A0o.append(r5);
        A0o.append(" blocked: ");
        A0o.append(z2);
        C13680ns.A1V(A0o);
        if (z2) {
            C118685v5 r2 = new C118685v5(r5, this);
            Set<C118685v5> set = this.A0B;
            if (!set.contains(r2)) {
                set.add(r2);
                Log.i(AnonymousClass000.A0g("PAY: IndiaUpiBlockListManager add vpa: ", r2));
                C18300wT r3 = this.A0A;
                HashSet A0o2 = C13680ns.A0o();
                for (C118685v5 r0 : set) {
                    A0o2.add(r0.A00.A00);
                }
                r3.A0I(TextUtils.join(";", A0o2));
            }
        } else {
            C118685v5 r22 = new C118685v5(r5, this);
            Set<C118685v5> set2 = this.A0B;
            if (set2.contains(r22)) {
                set2.remove(r22);
                Log.i(AnonymousClass000.A0g("PAY: IndiaUpiBlockListManager remove vpa: ", r22));
                C18300wT r32 = this.A0A;
                HashSet A0o3 = C13680ns.A0o();
                for (C118685v5 r02 : set2) {
                    A0o3.add(r02.A00.A00);
                }
                r32.A0I(TextUtils.join(";", A0o3));
            }
        }
    }

    public void A8v(AnonymousClass5Q2 r21, C18310wU r22) {
        Context context = this.A05.A00;
        C14870pt r13 = this.A02;
        C17190ug r15 = this.A06;
        C119365wy r1 = this.A07;
        C112205i7 r11 = new C112205i7(context, r13, this.A03, r15, this, r1, this.A09, r22);
        C116605re r152 = new C116605re(this, r21);
        Log.i("PAY: getBlockedVpas called");
        ArrayList A0n = C13680ns.A0n(r11.A04.AA6());
        for (int i2 = 0; i2 < A0n.size(); i2++) {
            A0n.set(i2, C004101u.A03(((String) A0n.get(i2)).toLowerCase(Locale.US)));
        }
        Collections.sort(A0n);
        StringBuilder A0o = AnonymousClass000.A0o();
        Iterator it = A0n.iterator();
        while (it.hasNext()) {
            A0o.append(AnonymousClass000.A0m(it));
        }
        String A032 = C004101u.A03(A0o.toString());
        AnonymousClass4XO r4 = r11.A00;
        if (r4 != null) {
            r4.A04("upi-get-blocked-vpas");
        }
        C17190ug r3 = r11.A03;
        String A022 = r3.A02();
        AnonymousClass2BJ r9 = new AnonymousClass2BJ(A022);
        C32461gQ A0X = C110105dW.A0X();
        C32461gQ A0Y = C110105dW.A0Y(A0X);
        C32461gQ.A00(A0Y, "action", "upi-get-blocked-vpas");
        if (A032 != null && C110105dW.A1W(A032, 0, true)) {
            C32461gQ.A00(A0Y, "hash", A032);
        }
        A0Y.A09("2", "version", C115585pz.A00);
        r3.A0A(new C112385iP(r11.A00, r11.A01, r152, r11.A05, r4, r11), C110105dW.A0S(A0Y, A0X, r9), A022, 204, 0);
    }

    public synchronized Set AA6() {
        HashSet A0o;
        A0o = C13680ns.A0o();
        for (C118685v5 r0 : this.A0B) {
            A0o.add((String) r0.A00.A00);
        }
        return A0o;
    }

    public synchronized boolean AId(C35301lh r3) {
        return this.A0B.contains(new C118685v5(r3, this));
    }

    public synchronized boolean AIp() {
        return AnonymousClass000.A1O((this.A00 > -1 ? 1 : (this.A00 == -1 ? 0 : -1)));
    }

    public synchronized void Aee() {
        Log.i("PAY: IndiaUpiBlockListManager setShouldFetch called");
        this.A00 = -1;
        C13680ns.A0x(C110105dW.A06(this.A0A), "payments_block_list_last_sync_time", -1);
    }

    public synchronized boolean AfE() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append("PAY: IndiaUpiBlockListManager shouldFetch lastFetched: ");
        A0o.append(this.A00);
        C13680ns.A1V(A0o);
        return !this.A08.A05().A00() && (this.A00 == -1 || this.A04.A00() - this.A00 >= 86400000);
    }

    public void Ahg(Activity activity, AnonymousClass5Q2 r10, C18310wU r11, String str, boolean z2) {
        this.A01.A00(activity, new AnonymousClass5zV(activity, this, r10, r11, str, z2), z2);
    }

    public synchronized void clear() {
        Log.i("PAY: IndiaUpiBlockListManager clear");
        this.A0B.clear();
        this.A0A.A0I("");
    }

    public synchronized int size() {
        return this.A0B.size();
    }
}
