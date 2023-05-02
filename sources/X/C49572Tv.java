package X;

import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Tv  reason: invalid class name and case insensitive filesystem */
public class C49572Tv {
    public final int A00;
    public final int A01;
    public final ImageView.ScaleType A02;
    public final C83714Ht A03;
    public final AnonymousClass2Wj A04;
    public final AnonymousClass2Wj A05;
    public final AnonymousClass2Wj A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C49572Tv(ImageView.ScaleType scaleType, C83714Ht r4, AnonymousClass2Wj r5, AnonymousClass2Wj r6, AnonymousClass2Wj r7, List list, int i2, int i3, boolean z2, boolean z3, boolean z4) {
        this.A01 = i2;
        this.A06 = r5;
        this.A05 = r6;
        this.A00 = i3;
        this.A04 = r7;
        this.A08 = z4;
        this.A02 = scaleType;
        ArrayList arrayList = new ArrayList();
        this.A07 = arrayList;
        if (z2 && !list.isEmpty()) {
            arrayList.addAll(list);
            this.A09 = z2;
        }
        this.A03 = r4;
        this.A0A = z3;
    }
}
