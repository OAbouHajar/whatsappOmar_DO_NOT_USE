package X;

import android.content.pm.PackageManager;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.118  reason: invalid class name */
public class AnonymousClass118 {
    public final AnonymousClass117 A00;
    public final C15970sD A01;
    public final C15940sA A02;
    public final C204510e A03;

    public AnonymousClass118(AnonymousClass117 r1, C15970sD r2, C15940sA r3, C204510e r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final Iterable A00() {
        boolean z2;
        C15970sD r6 = this.A01;
        Set<String> A022 = r6.A02();
        if (A022.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        AnonymousClass117 r2 = this.A00;
        C28031Ub it = r2.A01.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnonymousClass01D) it.next()).get());
        }
        C17930vs r4 = r2.A00;
        for (String str : A022) {
            try {
                z2 = this.A02.A01(str).A03;
            } catch (PackageManager.NameNotFoundException unused) {
                z2 = false;
            }
            if (!z2) {
                StringBuilder sb = new StringBuilder("InstrumentationChangeDispatcher/verification failed, dropping event for package - ");
                sb.append(str);
                Log.w(sb.toString());
                r6.A03(str);
            } else {
                AnonymousClass01D r0 = (AnonymousClass01D) r4.get(str);
                if (r0 != null) {
                    arrayList.add(r0.get());
                }
            }
        }
        return arrayList;
    }

    public void A01() {
        for (AnonymousClass1V3 A002 : A00()) {
            A002.A00();
        }
        C15970sD r2 = this.A01;
        for (String A032 : r2.A02()) {
            r2.A03(A032);
        }
        C204510e r1 = this.A03;
        r1.A00.A00.revokeUriPermission(Uri.parse("content://com.obwhatsapp.provider.instrumentation"), 3);
    }
}
