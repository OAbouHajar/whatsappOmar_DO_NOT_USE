package X;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
/* renamed from: X.21k  reason: invalid class name and case insensitive filesystem */
public final class C437621k {
    public Looper A00;
    public C57892s9 A01 = C57892s9.A00;
    public AnonymousClass3WP A02 = AnonymousClass4BG.A00;
    public String A03;
    public String A04;
    public final Context A05;
    public final ArrayList A06 = new ArrayList();
    public final ArrayList A07 = new ArrayList();
    public final Map A08 = new AnonymousClass00N();
    public final Map A09 = new AnonymousClass00N();
    public final Set A0A = new HashSet();
    public final Set A0B = new HashSet();

    public C437621k(Context context) {
        this.A05 = context;
        this.A00 = context.getMainLooper();
        this.A03 = context.getPackageName();
        this.A04 = context.getClass().getName();
    }

    public C437121f A00() {
        Map map = this.A09;
        C13710nw.A03("must call addApi() to add at least one API", !map.isEmpty());
        C97844qf r3 = C97844qf.A00;
        C437721l r1 = AnonymousClass4BG.A04;
        if (map.containsKey(r1)) {
            r3 = (C97844qf) map.get(r1);
        }
        C437721l r11 = null;
        Set set = this.A0A;
        Map map2 = this.A08;
        AnonymousClass4O1 r17 = new AnonymousClass4O1(r3, this.A03, this.A04, map2, set);
        Map map3 = r17.A04;
        AnonymousClass00N r4 = new AnonymousClass00N();
        AnonymousClass00N r32 = new AnonymousClass00N();
        ArrayList arrayList = new ArrayList();
        for (C437721l r7 : map.keySet()) {
            Object obj = map.get(r7);
            boolean z2 = false;
            if (map3.get(r7) != null) {
                z2 = true;
            }
            r4.put(r7, Boolean.valueOf(z2));
            C97874qj r14 = new C97874qj(r7, z2);
            arrayList.add(r14);
            AnonymousClass3WP r13 = r7.A00;
            C13710nw.A01(r13);
            C15750rn A002 = r13.A00(this.A05, this.A00, r14, r14, r17, obj);
            r32.put(r7.A01, A002);
            if (A002.Aav()) {
                if (r11 == null) {
                    r11 = r7;
                } else {
                    String str = r7.A02;
                    String str2 = r11.A02;
                    int length = String.valueOf(str).length();
                    StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length());
                    sb.append(str);
                    sb.append(" cannot be used with ");
                    sb.append(str2);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        if (r11 != null) {
            String str3 = r11.A02;
            Object[] objArr = {str3};
            if (!set.equals(this.A0B)) {
                throw new IllegalStateException(String.format("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr));
            }
        }
        for (C15750rn AcM : r32.values()) {
            AcM.AcM();
        }
        Context context = this.A05;
        ReentrantLock reentrantLock = new ReentrantLock();
        AnonymousClass4O1 r112 = r17;
        C57912sB r6 = new C57912sB(context, this.A00, this.A01, this.A02, r112, arrayList, this.A06, this.A07, r4, r32, reentrantLock);
        Set set2 = C437121f.A00;
        synchronized (set2) {
            set2.add(r6);
        }
        return r6;
    }

    public void A01(C437721l r3) {
        C13710nw.A02(r3, "Api must not be null");
        this.A09.put(r3, (Object) null);
        C13710nw.A02(r3.A00, "Base client builder must not be null");
        List emptyList = Collections.emptyList();
        this.A0B.addAll(emptyList);
        this.A0A.addAll(emptyList);
    }
}
