package com.obwhatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass2Wj;
import X.C14710pd;
import X.C15860rz;
import X.C16000sG;
import X.C16080sP;
import X.C30801cy;
import X.C448926b;
import X.C49562Tu;
import X.C49572Tv;
import X.C52142dD;
import X.C78493yA;
import X.C83714Ht;
import android.widget.ImageView;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;

public class InCallBannerViewModel extends C49562Tu {
    public boolean A00 = false;
    public final C448926b A01;
    public final C16000sG A02;
    public final C16080sP A03;
    public final C15860rz A04;
    public final C14710pd A05;
    public final C30801cy A06;
    public final C30801cy A07;
    public final C30801cy A08;
    public final C30801cy A09;
    public final List A0A;

    public InCallBannerViewModel(C448926b r6, C16000sG r7, C16080sP r8, C15860rz r9, C14710pd r10) {
        C30801cy r4 = new C30801cy();
        this.A08 = r4;
        C30801cy r3 = new C30801cy();
        this.A07 = r3;
        C30801cy r2 = new C30801cy();
        this.A09 = r2;
        C30801cy r1 = new C30801cy();
        this.A06 = r1;
        this.A05 = r10;
        this.A02 = r7;
        this.A03 = r8;
        this.A04 = r9;
        r2.A0B(Boolean.FALSE);
        r1.A0B(false);
        r3.A0B(new ArrayList());
        r4.A0B((Object) null);
        this.A0A = new ArrayList();
        this.A01 = r6;
        r6.A02(this);
    }

    public void A04() {
        this.A01.A03(this);
    }

    public final C49572Tv A07(C49572Tv r7, C49572Tv r8) {
        int i2 = r7.A01;
        if (i2 != r8.A01) {
            return null;
        }
        ArrayList arrayList = new ArrayList(r7.A07);
        for (Object next : r8.A07) {
            if (!arrayList.contains(next)) {
                arrayList.add(next);
            }
        }
        if (i2 == 3) {
            return A08(arrayList, r8.A00);
        }
        if (i2 == 2) {
            return A09(arrayList, r8.A00);
        }
        return null;
    }

    public final C49572Tv A08(List list, int i2) {
        AnonymousClass2Wj A022 = C52142dD.A02(this.A02, this.A03, list, 3, true);
        Object[] objArr = {A022};
        C78493yA r7 = new C78493yA(objArr, R.plurals.plurals0191, list.size());
        C78493yA r6 = new C78493yA(new Object[0], R.plurals.plurals0190, list.size());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        return new C49572Tv(scaleType, (C83714Ht) null, A022, r6, r7, arrayList, 3, i2, true, true, true);
    }

    public final C49572Tv A09(List list, int i2) {
        AnonymousClass2Wj A022 = C52142dD.A02(this.A02, this.A03, list, 3, true);
        C78493yA r5 = new C78493yA(new Object[0], R.plurals.plurals018f, list.size());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        return new C49572Tv(scaleType, (C83714Ht) null, A022, r5, (AnonymousClass2Wj) null, arrayList, 2, i2, true, false, true);
    }

    public final void A0A(C49572Tv r6) {
        if (!this.A00) {
            List list = this.A0A;
            if (list.isEmpty()) {
                list.add(r6);
            } else {
                C49572Tv r1 = (C49572Tv) list.get(0);
                C49572Tv A072 = A07(r1, r6);
                if (A072 != null) {
                    list.set(0, A072);
                } else {
                    int i2 = r1.A01;
                    int i3 = r6.A01;
                    if (i2 >= i3) {
                        list.set(0, r6);
                    } else {
                        for (int i4 = 1; i4 < list.size(); i4++) {
                            if (i3 < ((C49572Tv) list.get(i4)).A01) {
                                list.add(i4, r6);
                                return;
                            }
                            C49572Tv A073 = A07((C49572Tv) list.get(i4), r6);
                            if (A073 != null) {
                                list.set(i4, A073);
                                return;
                            }
                        }
                        list.add(r6);
                        return;
                    }
                }
            }
            this.A08.A09(list.get(0));
        }
    }
}
