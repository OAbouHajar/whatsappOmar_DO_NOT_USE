package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.2v3  reason: invalid class name and case insensitive filesystem */
public class C59212v3 extends AnonymousClass3TH {
    public HashMap A00 = AnonymousClass000.A0x();
    public AnonymousClass5S4[] A01;
    public final AnonymousClass013 A02;
    public final HashMap A03 = AnonymousClass000.A0x();
    public final HashMap A04 = AnonymousClass000.A0x();
    public final HashSet A05 = C13680ns.A0o();

    public C59212v3(AnonymousClass013 r2, AnonymousClass5S4[] r3) {
        this.A02 = r2;
        this.A01 = r3;
        A0M(r3);
    }

    public int A01() {
        return this.A01.length;
    }

    public /* bridge */ /* synthetic */ int A0F(Object obj) {
        Object tag = ((View) obj).getTag();
        HashMap hashMap = this.A04;
        if (!hashMap.containsKey(tag)) {
            this.A03.remove(tag);
            return -2;
        }
        Number number = (Number) hashMap.get(tag);
        int intValue = number.intValue();
        HashMap hashMap2 = this.A03;
        if (hashMap2.containsKey(tag) && intValue == AnonymousClass000.A0D(hashMap2.get(tag))) {
            return -1;
        }
        hashMap2.put(tag, number);
        return intValue;
    }

    public /* bridge */ /* synthetic */ Object A0G(ViewGroup viewGroup, int i2) {
        int i3;
        int A0K = A0K(i2);
        AnonymousClass5S4 r6 = this.A01[A0K];
        AnonymousClass00B.A06(r6);
        AnonymousClass3GL r62 = (AnonymousClass3GL) r6;
        LayoutInflater layoutInflater = r62.A0B;
        if (r62 instanceof AnonymousClass35B) {
            i3 = ((AnonymousClass35B) r62) instanceof AnonymousClass358 ? R.layout.layout05b3 : R.layout.layout0581;
        } else {
            if (!(r62 instanceof AnonymousClass35C)) {
                if (r62 instanceof AnonymousClass35D) {
                    ((AnonymousClass35D) r62).A08.A0G();
                } else if (r62 instanceof AnonymousClass35A) {
                    i3 = R.layout.layout04ea;
                }
            }
            i3 = R.layout.layout028e;
        }
        View inflate = layoutInflater.inflate(i3, (ViewGroup) null);
        r62.A04 = (RecyclerView) C004601z.A0E(inflate, R.id.sticker_grid);
        int i4 = r62.A00;
        if (i4 <= 0) {
            i4 = 1;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i4);
        r62.A03 = gridLayoutManager;
        r62.A04.setLayoutManager(gridLayoutManager);
        r62.A04.A0m(new AnonymousClass3RJ(r62.A0D, r62.A02));
        RecyclerView recyclerView = r62.A04;
        C57482rF A002 = r62.A00();
        recyclerView.setLayoutFrozen(false);
        recyclerView.A0k(A002, true, false);
        recyclerView.A0s(true);
        recyclerView.requestLayout();
        RecyclerView recyclerView2 = r62.A04;
        recyclerView2.A0o(new C57622rT(recyclerView2.getResources(), r62.A03, r62.A0C));
        r62.A03(inflate);
        r62.A01();
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            AnonymousClass071 r1 = (AnonymousClass071) it.next();
            RecyclerView recyclerView3 = ((AnonymousClass3GL) this.A01[A0K]).A04;
            if (recyclerView3 != null) {
                recyclerView3.A0o(r1);
            }
        }
        String id = this.A01[A0K].getId();
        inflate.setTag(id);
        this.A00.put(id, this.A01[A0K]);
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    public /* bridge */ /* synthetic */ void A0H(ViewGroup viewGroup, Object obj, int i2) {
        View view = (View) obj;
        int A0K = A0K(i2);
        Object tag = view.getTag();
        viewGroup.removeView(view);
        AnonymousClass5S4 r3 = (AnonymousClass5S4) this.A00.remove(tag);
        if (r3 != null) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                AnonymousClass071 r1 = (AnonymousClass071) it.next();
                RecyclerView recyclerView = ((AnonymousClass3GL) r3).A04;
                if (recyclerView != null) {
                    recyclerView.A0p(r1);
                }
            }
            r3.APc(view, viewGroup, A0K);
        }
    }

    public /* bridge */ /* synthetic */ boolean A0J(View view, Object obj) {
        return AnonymousClass000.A1Y(view, obj);
    }

    public final int A0K(int i2) {
        AnonymousClass013 r6 = this.A02;
        int length = C13680ns.A1Z(r6) ? i2 : (this.A01.length - 1) - i2;
        if (length < 0) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(C13680ns.A1Z(r6));
            AnonymousClass000.A1M(objArr, this.A01.length, 1);
            AnonymousClass000.A1M(objArr, i2, 2);
            C13700nu.A0Z("ContentPagerAdapter/getAbsolutePosition/absolutePosition < 0, isLtr: %s, pages.length: %d, position: %d", locale, objArr);
        }
        return length;
    }

    public void A0L(AnonymousClass071 r3) {
        HashSet hashSet = this.A05;
        if (!hashSet.contains(r3)) {
            hashSet.add(r3);
        }
    }

    public final void A0M(AnonymousClass5S4[] r5) {
        this.A01 = r5;
        HashMap hashMap = this.A04;
        hashMap.clear();
        for (int i2 = 0; i2 < r5.length; i2++) {
            C13680ns.A1X(r5[i2].getId(), hashMap, A0K(i2));
        }
    }
}
