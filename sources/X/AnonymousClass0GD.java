package X;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxLAdapterShape7S0200000_I1;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0GD  reason: invalid class name */
public class AnonymousClass0GD extends C015707n {
    public int A00 = 0;
    public int A01;
    public ArrayList A02 = AnonymousClass000.A0u();
    public boolean A03 = true;
    public boolean A04 = false;

    public static C015707n A00(AnonymousClass0GD r0, int i2) {
        return (C015707n) r0.A02.get(i2);
    }

    public C015707n A03() {
        AnonymousClass0GD r4 = (AnonymousClass0GD) super.clone();
        r4.A02 = AnonymousClass000.A0u();
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C015707n A032 = A00(this, i2).clone();
            r4.A02.add(A032);
            A032.A07 = r4;
        }
        return r4;
    }

    public /* bridge */ /* synthetic */ C015707n A04(long j2) {
        A0X(j2);
        return this;
    }

    public /* bridge */ /* synthetic */ C015707n A05(TimeInterpolator timeInterpolator) {
        A0Y(timeInterpolator);
        return this;
    }

    public /* bridge */ /* synthetic */ C015707n A06(View view) {
        A0Z(view);
        return this;
    }

    public /* bridge */ /* synthetic */ C015707n A07(View view) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i2 < arrayList.size()) {
                ((C015707n) arrayList.get(i2)).A07(view);
                i2++;
            } else {
                super.A07(view);
                return this;
            }
        }
    }

    public /* bridge */ /* synthetic */ C015707n A08(C019509b r1) {
        super.A08(r1);
        return this;
    }

    public /* bridge */ /* synthetic */ C015707n A09(C019509b r1) {
        super.A09(r1);
        return this;
    }

    public String A0C(String str) {
        String A0C = super.A0C(str);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i2 >= arrayList.size()) {
                return A0C;
            }
            StringBuilder A0q = AnonymousClass000.A0q(A0C);
            A0q.append(IOUtils.LINE_SEPARATOR_UNIX);
            A0C = AnonymousClass000.A0h(((C015707n) arrayList.get(i2)).A0C(AnonymousClass000.A0h("  ", AnonymousClass000.A0q(str))), A0q);
            i2++;
        }
    }

    public void A0D() {
        super.A0D();
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            A00(this, i2).A0D();
        }
    }

    public void A0F() {
        ArrayList arrayList;
        if (this.A02.isEmpty()) {
            A0G();
            A0E();
            return;
        }
        AnonymousClass0GH r2 = new AnonymousClass0GH(this);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C015707n) it.next()).A08(r2);
        }
        this.A01 = this.A02.size();
        if (!this.A03) {
            int i2 = 1;
            while (true) {
                arrayList = this.A02;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((C015707n) arrayList.get(i2 - 1)).A08(new IDxLAdapterShape7S0200000_I1(arrayList.get(i2), 2, this));
                i2++;
            }
            C015707n r0 = (C015707n) arrayList.get(0);
            if (r0 != null) {
                r0.A0F();
                return;
            }
            return;
        }
        Iterator it2 = this.A02.iterator();
        while (it2.hasNext()) {
            ((C015707n) it2.next()).A0F();
        }
    }

    public void A0H(View view) {
        super.A0H(view);
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            A00(this, i2).A0H(view);
        }
    }

    public void A0I(View view) {
        super.A0I(view);
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            A00(this, i2).A0I(view);
        }
    }

    public void A0K(ViewGroup viewGroup) {
        super.A0K(viewGroup);
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            A00(this, i2).A0K(viewGroup);
        }
    }

    public void A0L(ViewGroup viewGroup, C04860Of r17, C04860Of r18, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.A02;
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C015707n A002 = A00(this, i2);
            if (j2 > 0 && (this.A03 || i2 == 0)) {
                long j3 = A002.A02;
                if (j3 > 0) {
                    A002.A02 = j3 + j2;
                } else {
                    A002.A02 = j2;
                }
            }
            A002.A0L(viewGroup, r17, r18, arrayList, arrayList2);
        }
    }

    public void A0N(AnonymousClass0MA r4) {
        super.A0N(r4);
        this.A00 |= 4;
        if (this.A02 != null) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.A02;
                if (i2 < arrayList.size()) {
                    ((C015707n) arrayList.get(i2)).A0N(r4);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void A0O(AnonymousClass0PK r4) {
        this.A05 = r4;
        this.A00 |= 8;
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            A00(this, i2).A0O(r4);
        }
    }

    public void A0P(AnonymousClass0MB r4) {
        this.A06 = r4;
        this.A00 |= 2;
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            A00(this, i2).A0P(r4);
        }
    }

    public void A0Q(C06230Uw r4) {
        super.A0Q(r4);
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            A00(this, i2).A0Q(r4);
        }
    }

    public void A0V(C06230Uw r5) {
        View view = r5.A00;
        if (A0R(view)) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                C015707n r1 = (C015707n) it.next();
                if (r1.A0R(view)) {
                    r1.A0V(r5);
                    r5.A01.add(r1);
                }
            }
        }
    }

    public void A0W(C06230Uw r5) {
        View view = r5.A00;
        if (A0R(view)) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                C015707n r1 = (C015707n) it.next();
                if (r1.A0R(view)) {
                    r1.A0W(r5);
                    r5.A01.add(r1);
                }
            }
        }
    }

    public void A0X(long j2) {
        ArrayList arrayList;
        this.A01 = j2;
        if (j2 >= 0 && (arrayList = this.A02) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                A00(this, i2).A04(j2);
            }
        }
    }

    public void A0Y(TimeInterpolator timeInterpolator) {
        this.A00 |= 1;
        ArrayList arrayList = this.A02;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                A00(this, i2).A05(timeInterpolator);
            }
        }
        this.A03 = timeInterpolator;
    }

    public void A0Z(View view) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i2 < arrayList.size()) {
                ((C015707n) arrayList.get(i2)).A06(view);
                i2++;
            } else {
                super.A06(view);
                return;
            }
        }
    }

    public void A0a(C015707n r6) {
        this.A02.add(r6);
        r6.A07 = this;
        long j2 = this.A01;
        if (j2 >= 0) {
            r6.A04(j2);
        }
        if ((this.A00 & 1) != 0) {
            r6.A05(this.A03);
        }
        if ((this.A00 & 2) != 0) {
            r6.A0P(this.A06);
        }
        if ((this.A00 & 4) != 0) {
            r6.A0N(this.A04);
        }
        if ((this.A00 & 8) != 0) {
            r6.A0O(this.A05);
        }
    }
}
