package com.obwhatsapp.gallery;

import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass20I;
import X.AnonymousClass22w;
import X.AnonymousClass29Q;
import X.AnonymousClass2BF;
import X.AnonymousClass2OP;
import X.C003101j;
import X.C005602k;
import X.C011005f;
import X.C11020i4;
import X.C11490ir;
import X.C14710pd;
import X.C16620tM;
import X.C16980tz;
import X.C18450wi;
import X.C20350zu;
import X.C29251aI;
import X.C49172Rk;
import X.C50452Zp;
import X.C54502hd;
import X.C54552hi;
import X.C54562hj;
import X.C54572hk;
import X.C57652rX;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.StickyHeadersRecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDxLambdaShape57S0000000_2_I0;

public final class GalleryRecentsFragment extends Hilt_GalleryRecentsFragment implements AnonymousClass2OP, C50452Zp {
    public int A00;
    public C29251aI A01;
    public GalleryTabHostFragment A02;
    public C57652rX A03;
    public C20350zu A04;
    public boolean A05;
    public final List A06 = new ArrayList();
    public final Map A07 = new LinkedHashMap();

    public void A0q() {
        super.A0q();
        A1N();
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout02b3, viewGroup, false);
        C18450wi.A0B(inflate);
        return inflate;
    }

    public void A13() {
        super.A13();
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A08;
        if (stickyHeadersRecyclerView != null) {
            for (ImageView imageDrawable : C11490ir.A03(new IDxLambdaShape57S0000000_2_I0(2), new AnonymousClass22w(new IDxLambdaShape57S0000000_2_I0(1), new C11020i4(stickyHeadersRecyclerView)))) {
                imageDrawable.setImageDrawable((Drawable) null);
            }
        }
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        super.A18(bundle, view);
        C14710pd r1 = this.A0F;
        C16620tM r3 = C16620tM.A02;
        this.A00 = r1.A03(r3, 2614);
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A08;
        if (stickyHeadersRecyclerView != null) {
            stickyHeadersRecyclerView.setBackgroundColor(AnonymousClass00T.A00(view.getContext(), R.color.color0545));
        }
        AbZ();
        if (this.A0F.A0E(r3, 2576)) {
            C57652rX r12 = new C57652rX(this);
            this.A03 = r12;
            this.A08.A14.add(r12);
        }
    }

    public C54552hi A1C() {
        Bundle bundle = this.A05;
        if (bundle == null || bundle.getInt("include", 7) == 7) {
            return new C54572hk(this.A0K, this.A06);
        }
        C16980tz r4 = this.A0B;
        C49172Rk r5 = this.A0K;
        C20350zu r6 = this.A04;
        if (r6 != null) {
            Bundle bundle2 = this.A05;
            int i2 = 7;
            if (bundle2 != null) {
                i2 = bundle2.getInt("include", 7);
            }
            return new C54562hj((Uri) null, r4, r5, r6, i2, false);
        }
        C18450wi.A0O("perfTimerFactory");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public boolean A1M(AnonymousClass2BF r6, C54502hd r7) {
        GalleryTabHostFragment galleryTabHostFragment;
        C57652rX r3;
        int i2;
        C18450wi.A0H(r6, 0);
        C18450wi.A0H(r7, 1);
        Uri A9L = r6.A9L();
        C18450wi.A0B(A9L);
        Map map = this.A07;
        if (!map.containsKey(A9L) && this.A03 != null && map.size() < this.A00 && (galleryTabHostFragment = this.A02) != null && galleryTabHostFragment.A1L() && (r3 = this.A03) != null) {
            C005602k A012 = RecyclerView.A01(r7);
            if (A012 != null) {
                i2 = A012.A06;
                if (i2 == -1) {
                    i2 = A012.A05;
                }
            } else {
                i2 = -1;
            }
            r3.A04 = true;
            r3.A03 = i2;
            r3.A00 = r7.getHeight() >> 1;
        }
        GalleryTabHostFragment galleryTabHostFragment2 = this.A02;
        if (C18450wi.A0R(galleryTabHostFragment2 == null ? null : Boolean.valueOf(galleryTabHostFragment2.A1L()), Boolean.TRUE)) {
            return A1O(r6);
        }
        return false;
    }

    public final void A1N() {
        GalleryTabHostFragment galleryTabHostFragment = this.A02;
        if (galleryTabHostFragment != null) {
            Collection values = this.A07.values();
            C18450wi.A0H(values, 0);
            ArrayList arrayList = new ArrayList();
            for (Object next : values) {
                if (next != null) {
                    arrayList.add(next);
                }
            }
            galleryTabHostFragment.A1J(C003101j.A0F(arrayList));
        }
        A1G(this.A07.size());
        AnonymousClass01X r0 = this.A06;
        if (r0 != null) {
            r0.A01();
        }
    }

    public final boolean A1O(AnonymousClass2BF r8) {
        C14710pd r1 = this.A0F;
        C16620tM r3 = C16620tM.A02;
        int A032 = r1.A03(r3, 2614);
        Map map = this.A07;
        if (map.size() >= A032) {
            A032 = this.A0F.A03(r3, 2693);
        }
        Uri A9L = r8.A9L();
        C18450wi.A0B(A9L);
        if (map.containsKey(A9L)) {
            map.remove(A9L);
        } else if (map.size() >= A032) {
            this.A07.A0H(A03().getString(R.string.str1616, new Object[]{Integer.valueOf(A032)}), 0);
            return false;
        } else {
            map.put(A9L, r8);
        }
        A1N();
        return true;
    }

    public void AFr(AnonymousClass29Q r5, Collection collection) {
        AnonymousClass29Q r3 = new AnonymousClass29Q();
        collection.clear();
        for (Map.Entry entry : this.A07.entrySet()) {
            collection.add(entry.getKey());
            r3.A03(new AnonymousClass20I((Uri) entry.getKey()));
        }
        Map map = r3.A00;
        map.clear();
        map.putAll(r5.A00);
    }

    public boolean ALP() {
        return this.A07.size() >= this.A00;
    }

    public void AbZ() {
        if (this.A0K.A02.A00(C011005f.CREATED)) {
            A1I(false);
        }
    }

    public void AdI(AnonymousClass2BF r3) {
        C18450wi.A0H(r3, 0);
        Map map = this.A07;
        Uri A9L = r3.A9L();
        C18450wi.A0B(A9L);
        if (!map.containsKey(A9L)) {
            A1O(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r5.containsAll(r12) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Aeb(X.AnonymousClass29Q r11, java.util.Collection r12, java.util.Collection r13) {
        /*
            r10 = this;
            java.util.List r5 = r10.A06
            int r1 = r5.size()
            int r0 = r12.size()
            if (r1 != r0) goto L_0x0013
            boolean r0 = r5.containsAll(r12)
            r9 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r9 = 0
        L_0x0014:
            java.util.Map r4 = r10.A07
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0025
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0025
            if (r9 == 0) goto L_0x0025
            return
        L_0x0025:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0032:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L_0x0032
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r6.put(r1, r0)
            goto L_0x0032
        L_0x0054:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r6)
            java.util.Iterator r8 = r13.iterator()
        L_0x005d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r6 = r8.next()
            boolean r0 = r3.containsKey(r6)
            if (r0 != 0) goto L_0x005d
            X.1aI r0 = r10.A01
            if (r0 == 0) goto L_0x00ba
            X.1aJ r2 = r0.A0D
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0097
            java.util.List r0 = r2.A06
            java.util.Iterator r1 = r0.iterator()
        L_0x007d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r7 = r1.next()
            X.2BF r7 = (X.AnonymousClass2BF) r7
            android.net.Uri r0 = r7.A9L()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x007d
        L_0x0093:
            r3.put(r6, r7)
            goto L_0x005d
        L_0x0097:
            X.2BC r0 = r2.A02
            if (r0 == 0) goto L_0x00ba
            r1 = 0
        L_0x009c:
            X.2BC r0 = r2.A02
            int r0 = r0.getCount()
            if (r1 >= r0) goto L_0x00ba
            X.2BC r0 = r2.A02
            X.2BF r7 = r0.ADR(r1)
            if (r7 == 0) goto L_0x00b7
            android.net.Uri r0 = r7.A9L()
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00b7
            goto L_0x0093
        L_0x00b7:
            int r1 = r1 + 1
            goto L_0x009c
        L_0x00ba:
            r7 = 0
            goto L_0x0093
        L_0x00bc:
            r4.clear()
            r4.putAll(r3)
            if (r9 != 0) goto L_0x00cd
            r5.clear()
            r5.addAll(r12)
            r10.AbZ()
        L_0x00cd:
            r10.A1N()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.gallery.GalleryRecentsFragment.Aeb(X.29Q, java.util.Collection, java.util.Collection):void");
    }

    public void Aff() {
        this.A07.A0H(A03().getString(R.string.str1616, new Object[]{Integer.valueOf(this.A00)}), 0);
    }

    public void AhE(AnonymousClass2BF r3) {
        C18450wi.A0H(r3, 0);
        Map map = this.A07;
        Uri A9L = r3.A9L();
        C18450wi.A0B(A9L);
        if (map.containsKey(A9L)) {
            A1O(r3);
        }
    }
}
