package androidx.sharetarget;

import X.AnonymousClass000;
import X.AnonymousClass00N;
import X.AnonymousClass04R;
import X.AnonymousClass04S;
import X.AnonymousClass0OO;
import X.C02620Dh;
import X.C05350Qj;
import X.C09910gH;
import X.C10270gr;
import X.C10290gt;
import X.C10300gu;
import X.C10310gv;
import X.C10560hK;
import X.C10600hO;
import X.C29981bY;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.facebook.redex.IDxCallableShape147S0100000_I1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public class ShortcutInfoCompatSaverImpl extends C05350Qj {
    public static final Object A07 = new Object();
    public static volatile ShortcutInfoCompatSaverImpl A08;
    public final Context A00;
    public final File A01;
    public final File A02;
    public final Map A03 = new AnonymousClass00N();
    public final Map A04 = new AnonymousClass00N();
    public final ExecutorService A05;
    public final ExecutorService A06;

    public ShortcutInfoCompatSaverImpl(Context context, ExecutorService executorService, ExecutorService executorService2) {
        this.A00 = context.getApplicationContext();
        this.A05 = executorService;
        this.A06 = executorService2;
        File file = new File(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.A01 = new File(file, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.A02 = new File(file, "targets.xml");
        executorService.submit(new C10560hK(this, file));
    }

    public /* bridge */ /* synthetic */ Object A00() {
        C02620Dh A002 = C02620Dh.A00();
        this.A05.submit(new C09910gH(A002, this));
        return A002;
    }

    public /* bridge */ /* synthetic */ Object A01(List list) {
        ArrayList A0w = AnonymousClass000.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0w.add(new AnonymousClass04R((AnonymousClass04S) it.next()).A00());
        }
        C02620Dh A002 = C02620Dh.A00();
        this.A05.submit(new C10290gt(A002, this, A0w));
        return A002;
    }

    public List A02() {
        return (List) this.A05.submit(new IDxCallableShape147S0100000_I1(this, 1)).get();
    }

    public C29981bY A03(Bitmap bitmap, String str) {
        C10300gu r3 = new C10300gu(bitmap, this, str);
        C02620Dh A002 = C02620Dh.A00();
        this.A06.submit(new C10310gv(A002, this, r3));
        return A002;
    }

    public void A04(C02620Dh r5) {
        C10600hO r3 = new C10600hO(this, new ArrayList(this.A04.values()));
        C02620Dh A002 = C02620Dh.A00();
        this.A06.submit(new C10310gv(A002, this, r3));
        A002.A4b(new C10270gr(r5, this, A002), this.A05);
    }

    public void A05(List list) {
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((AnonymousClass0OO) it.next()).A01;
            if (!TextUtils.isEmpty(str)) {
                A0u.add(str);
            }
        }
        for (File file : this.A01.listFiles()) {
            if (!A0u.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }
}
