package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.604  reason: invalid class name */
public class AnonymousClass604 implements C23541Cj {
    public final AnonymousClass1N0 A00;
    public final C221116r A01;
    public final C14710pd A02;
    public final C18090w8 A03;
    public final C18290wS A04;
    public final C209712h A05;
    public final AnonymousClass1Nx A06;
    public final C26481Nw A07;
    public final AnonymousClass1MB A08;
    public final C16320sq A09;

    public AnonymousClass604(AnonymousClass1N0 r1, C221116r r2, C14710pd r3, C18090w8 r4, C18290wS r5, C209712h r6, AnonymousClass1Nx r7, C26481Nw r8, AnonymousClass1MB r9, C16320sq r10) {
        this.A01 = r2;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A03 = r4;
        this.A04 = r5;
        this.A08 = r9;
        this.A00 = r1;
        this.A02 = r3;
        this.A09 = r10;
    }

    public void APJ() {
        C47382Is A002;
        C18090w8 r6 = this.A03;
        if (r6.A09()) {
            C221116r r7 = this.A01;
            Integer[] numArr = new Integer[4];
            boolean A1W = C13690nt.A1W(numArr, 20);
            numArr[1] = 401;
            AnonymousClass000.A1M(numArr, 417, 2);
            AnonymousClass000.A1M(numArr, 418, 3);
            Integer[] numArr2 = new Integer[1];
            AnonymousClass000.A1M(numArr2, 40, A1W ? 1 : 0);
            List A0c = r7.A0c(numArr, numArr2, -1);
            if (A0c.size() > 0) {
                AnonymousClass1Nx r2 = this.A06;
                C47382Is A003 = r2.A00();
                this.A04.A03().Aag(A003, A0c);
                r2.A01(A003);
            }
        }
        C26481Nw r5 = this.A07;
        synchronized (r5) {
            AnonymousClass1Nx r3 = r5.A01;
            long A004 = r3.A01.A00();
            long j2 = A004 - (A004 % 86400000);
            ArrayList A0u = AnonymousClass000.A0u();
            SharedPreferences sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A02.A00("payment_daily_usage_preferences");
                r3.A00 = sharedPreferences;
            }
            Map<String, ?> all = sharedPreferences.getAll();
            SharedPreferences sharedPreferences2 = r3.A00;
            if (sharedPreferences2 == null) {
                sharedPreferences2 = r3.A02.A00("payment_daily_usage_preferences");
                r3.A00 = sharedPreferences2;
            }
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            Iterator A0y = AnonymousClass000.A0y(all);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                String obj = A0z.getValue().toString();
                if (!obj.isEmpty() && (A002 = C47382Is.A00(obj)) != null && A002.A0F < j2) {
                    A0u.add(A002);
                    edit.remove(C13690nt.A0f(A0z));
                }
            }
            edit.apply();
            A0u.size();
            Iterator it = A0u.iterator();
            while (it.hasNext()) {
                C47382Is r4 = (C47382Is) it.next();
                C16490t9 r32 = r5.A00;
                C111945hg r22 = new C111945hg();
                r22.A05 = Long.valueOf(r4.A0G);
                r22.A06 = Long.valueOf(r4.A02);
                r22.A09 = Long.valueOf(r4.A05);
                r22.A07 = Long.valueOf(r4.A03);
                r22.A08 = Long.valueOf(r4.A04);
                r22.A0F = Long.valueOf(r4.A0B);
                r22.A0E = Long.valueOf(r4.A0A);
                r22.A0C = Long.valueOf(r4.A08);
                r22.A0B = Long.valueOf(r4.A07);
                r22.A0D = Long.valueOf(r4.A09);
                r22.A0A = Long.valueOf(r4.A06);
                r22.A04 = Long.valueOf(r4.A01);
                r22.A00 = Long.valueOf((long) r4.A0C.size());
                r22.A01 = Long.valueOf((long) r4.A0E.size());
                r22.A03 = Long.valueOf(r4.A00);
                r22.A02 = Long.valueOf((long) r4.A0D.size());
                r32.A06(r22);
            }
        }
        if (r6.A09() && this.A02.A0C(991)) {
            AnonymousClass1N0 r62 = this.A00;
            int nextInt = new Random().nextInt(AnonymousClass1N0.A0E);
            Locale locale = Locale.US;
            Object[] A1b = C13680ns.A1b();
            A1b[0] = Integer.valueOf(nextInt);
            String.format(locale, "BloksAssetManager/triggerBackgroundFetchWithJitter triggering bloks fetch in %d ms", A1b);
            r62.A06.Ad4(new RunnableRunnableShape0S1100000_I0(r62), "BloksAssetmanager/trigger-bg-fetch", (long) nextInt);
        }
        C14710pd r1 = this.A02;
        if (r1.A0C(629) || r1.A0C(605)) {
            C209712h r42 = this.A05;
            C15860rz r33 = r42.A02;
            if (C110115dX.A17((SharedPreferences) r33.A01.get(), "payment_background_batch_require_fetch") && r33.A1n("payment_backgrounds_batch_last_fetch_timestamp", TimeUnit.DAYS.toMillis(7))) {
                r42.A01.A0K(new RunnableRunnableShape9S0200000_I0_7(r42, 23, r42.A07.A00()));
            }
        }
    }

    public void APK() {
        this.A09.Acl(new C1208463f(this));
    }
}
