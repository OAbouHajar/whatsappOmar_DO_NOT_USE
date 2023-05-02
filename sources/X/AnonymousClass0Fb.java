package X;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Fb  reason: invalid class name */
public class AnonymousClass0Fb extends AnonymousClass01X implements C11940ja {
    public Handler A00;
    public PreferenceGroup A01;
    public Runnable A02 = new C09490fb(this);
    public List A03;
    public List A04;
    public List A05;

    public AnonymousClass0Fb(PreferenceGroup preferenceGroup) {
        this.A01 = preferenceGroup;
        this.A00 = new Handler();
        this.A01.A09 = this;
        this.A04 = AnonymousClass000.A0u();
        this.A05 = AnonymousClass000.A0u();
        this.A03 = AnonymousClass000.A0u();
        A0B(true);
        A0G();
    }

    public int A0C() {
        return this.A05.size();
    }

    public long A0D(int i2) {
        if (!this.A00) {
            return -1;
        }
        return A0E(i2).A00();
    }

    public Preference A0E(int i2) {
        if (i2 < 0 || i2 >= this.A05.size()) {
            return null;
        }
        return (Preference) this.A05.get(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0F(androidx.preference.PreferenceGroup r11) {
        /*
            r10 = this;
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            java.util.List r9 = r11.A02
            int r8 = r9.size()
            r7 = 0
            r6 = 0
        L_0x0010:
            if (r7 >= r8) goto L_0x0074
            java.lang.Object r3 = r9.get(r7)
            androidx.preference.Preference r3 = (androidx.preference.Preference) r3
            boolean r0 = r3.A0c
            if (r0 == 0) goto L_0x0030
            int r2 = r11.A01
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            if (r2 == r0) goto L_0x0070
            r1 = 1
            if (r6 < r2) goto L_0x0070
            r5.add(r3)
        L_0x002a:
            boolean r0 = r3 instanceof androidx.preference.PreferenceGroup
            if (r0 != 0) goto L_0x0033
            int r6 = r6 + 1
        L_0x0030:
            int r7 = r7 + 1
            goto L_0x0010
        L_0x0033:
            androidx.preference.PreferenceGroup r3 = (androidx.preference.PreferenceGroup) r3
            boolean r0 = r3.A0W()
            if (r0 == 0) goto L_0x0030
            if (r1 == 0) goto L_0x004b
            int r1 = r3.A01
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x004b
            java.lang.String r0 = "Nesting an expandable group inside of another expandable group is not supported!"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x004b:
            java.util.List r0 = r10.A0F(r3)
            java.util.Iterator r3 = r0.iterator()
        L_0x0053:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r2 = r3.next()
            int r1 = r11.A01
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x006c
            if (r6 < r1) goto L_0x006c
            r5.add(r2)
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x0053
        L_0x006c:
            r4.add(r2)
            goto L_0x0069
        L_0x0070:
            r4.add(r3)
            goto L_0x002a
        L_0x0074:
            int r1 = r11.A01
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x0092
            if (r6 <= r1) goto L_0x0092
            android.content.Context r0 = r11.A05
            long r2 = r11.A00()
            androidx.preference.ExpandButton r1 = new androidx.preference.ExpandButton
            r1.<init>(r0, r5, r2)
            X.0c3 r0 = new X.0c3
            r0.<init>(r11, r10)
            r1.A0B = r0
            r4.add(r1)
        L_0x0092:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Fb.A0F(androidx.preference.PreferenceGroup):java.util.List");
    }

    public void A0G() {
        for (Preference preference : this.A04) {
            preference.A09 = null;
        }
        ArrayList A0w = AnonymousClass000.A0w(this.A04);
        this.A04 = A0w;
        PreferenceGroup preferenceGroup = this.A01;
        A0H(preferenceGroup, A0w);
        this.A05 = A0F(preferenceGroup);
        A01();
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A0H(PreferenceGroup preferenceGroup, List list) {
        List list2;
        synchronized (preferenceGroup) {
            list2 = preferenceGroup.A02;
            Collections.sort(list2);
        }
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Preference preference = (Preference) list2.get(i2);
            list.add(preference);
            AnonymousClass0QO r2 = new AnonymousClass0QO(preference);
            List list3 = this.A03;
            if (!list3.contains(r2)) {
                list3.add(r2);
            }
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                if (preferenceGroup2.A0W()) {
                    A0H(preferenceGroup2, list);
                }
            }
            preference.A09 = this;
        }
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        A0E(i2).A0R((AnonymousClass0Fp) r2);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        AnonymousClass0QO r5 = (AnonymousClass0QO) this.A03.get(i2);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, AnonymousClass0NL.A00);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = AnonymousClass06L.A01(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(r5.A00, viewGroup, false);
        if (inflate.getBackground() == null) {
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i3 = r5.A01;
            if (i3 != 0) {
                from.inflate(i3, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new AnonymousClass0Fp(inflate);
    }

    public int getItemViewType(int i2) {
        AnonymousClass0QO r3 = new AnonymousClass0QO(A0E(i2));
        List list = this.A03;
        int indexOf = list.indexOf(r3);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = list.size();
        list.add(r3);
        return size;
    }
}
