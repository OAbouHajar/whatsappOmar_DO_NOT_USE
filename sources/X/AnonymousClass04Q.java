package X;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.04Q  reason: invalid class name */
public class AnonymousClass04Q {
    public static final String A09 = C06530Wm.A01("WorkContinuationImpl");
    public C13470m5 A00;
    public boolean A01;
    public final AnonymousClass03z A02;
    public final AnonymousClass022 A03;
    public final String A04;
    public final List A05 = new ArrayList();
    public final List A06;
    public final List A07;
    public final List A08;

    public AnonymousClass04Q(AnonymousClass03z r4, AnonymousClass022 r5, String str, List list, List list2) {
        this.A03 = r5;
        this.A04 = str;
        this.A02 = r4;
        this.A08 = list;
        this.A07 = list2;
        this.A06 = new ArrayList(list.size());
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.A05.addAll(((AnonymousClass04Q) it.next()).A05);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            String A002 = ((AnonymousClass03k) list.get(i2)).A00();
            this.A06.add(A002);
            this.A05.add(A002);
        }
    }

    public static Set A00(AnonymousClass04Q r3) {
        HashSet hashSet = new HashSet();
        List<AnonymousClass04Q> list = r3.A07;
        if (list != null && !list.isEmpty()) {
            for (AnonymousClass04Q r0 : list) {
                hashSet.addAll(r0.A06);
            }
        }
        return hashSet;
    }

    public static boolean A01(AnonymousClass04Q r5, Set set) {
        List list = r5.A06;
        set.addAll(list);
        Set A002 = A00(r5);
        for (Object contains : set) {
            if (A002.contains(contains)) {
                return true;
            }
        }
        List<AnonymousClass04Q> list2 = r5.A07;
        if (list2 != null && !list2.isEmpty()) {
            for (AnonymousClass04Q A012 : list2) {
                if (A01(A012, set)) {
                    return true;
                }
            }
        }
        set.removeAll(list);
        return false;
    }

    public final AnonymousClass04Q A02(AnonymousClass043 r7) {
        List singletonList = Collections.singletonList(r7);
        if (singletonList.isEmpty()) {
            return this;
        }
        return new AnonymousClass04Q(AnonymousClass03z.KEEP, this.A03, this.A04, singletonList, Collections.singletonList(this));
    }

    public void A03() {
        if (!this.A01) {
            C10660hU r1 = new C10660hU(this);
            this.A03.A06.A8p(r1);
            this.A00 = r1.A00;
            return;
        }
        C06530Wm.A00();
        String str = A09;
        StringBuilder sb = new StringBuilder("Already enqueued work ids (");
        sb.append(TextUtils.join(", ", this.A06));
        sb.append(")");
        Log.w(str, sb.toString());
    }
}
