package androidx.preference;

import X.AnonymousClass00O;
import X.AnonymousClass0FK;
import X.AnonymousClass0NL;
import X.C09480fa;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;

public abstract class PreferenceGroup extends Preference {
    public int A00;
    public int A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final AnonymousClass00O A06;
    public final Runnable A07;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.A06 = new AnonymousClass00O();
        this.A05 = new Handler();
        this.A04 = true;
        this.A00 = 0;
        this.A03 = false;
        this.A01 = Integer.MAX_VALUE;
        this.A07 = new C09480fa(this);
        this.A02 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0NL.A08, i2, i3);
        this.A04 = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i4 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i4 != Integer.MAX_VALUE && !(!TextUtils.isEmpty(this.A0L))) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getSimpleName());
                sb.append(" should have a key defined if it contains an expandable preference");
                Log.e("PreferenceGroup", sb.toString());
            }
            this.A01 = i4;
        }
        obtainStyledAttributes.recycle();
    }

    public Parcelable A01() {
        this.A0P = true;
        return new AnonymousClass0FK(AbsSavedState.EMPTY_STATE, this.A01);
    }

    public void A06() {
        super.A06();
        this.A03 = true;
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Preference) list.get(i2)).A06();
        }
    }

    public void A08() {
        A09();
        this.A03 = false;
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Preference) list.get(i2)).A08();
        }
    }

    public void A0B(Bundle bundle) {
        super.A0B(bundle);
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Preference) list.get(i2)).A0B(bundle);
        }
    }

    public void A0C(Bundle bundle) {
        super.A0C(bundle);
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Preference) list.get(i2)).A0C(bundle);
        }
    }

    public void A0D(Parcelable parcelable) {
        if (parcelable != null && parcelable.getClass().equals(AnonymousClass0FK.class)) {
            AnonymousClass0FK r3 = (AnonymousClass0FK) parcelable;
            this.A01 = r3.A00;
            parcelable = r3.getSuperState();
        }
        super.A0D(parcelable);
    }

    public void A0L(boolean z2) {
        super.A0L(z2);
        List list = this.A02;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Preference preference = (Preference) list.get(i2);
            if (preference.A0W == z2) {
                preference.A0W = !z2;
                preference.A0L(preference.A0O());
                preference.A04();
            }
        }
    }

    public Preference A0S(CharSequence charSequence) {
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(this.A0L, charSequence)) {
            return this;
        } else {
            List list = this.A02;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Preference preference = (Preference) list.get(i2);
                if (TextUtils.equals(preference.A0L, charSequence) || ((preference instanceof PreferenceGroup) && (preference = ((PreferenceGroup) preference).A0S(charSequence)) != null)) {
                    return preference;
                }
            }
            return null;
        }
    }

    public void A0T() {
        synchronized (this) {
            List list = this.A02;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    A0V((Preference) list.get(0));
                }
            }
        }
        A05();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(androidx.preference.Preference r8) {
        /*
            r7 = this;
            java.util.List r3 = r7.A02
            boolean r0 = r3.contains(r8)
            r6 = 1
            if (r0 != 0) goto L_0x00cc
            java.lang.String r4 = r8.A0L
            if (r4 == 0) goto L_0x0033
            r1 = r7
        L_0x000e:
            androidx.preference.PreferenceGroup r0 = r1.A0E
            if (r0 == 0) goto L_0x0015
            androidx.preference.PreferenceGroup r1 = r1.A0E
            goto L_0x000e
        L_0x0015:
            androidx.preference.Preference r0 = r1.A0S(r4)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "PreferenceGroup"
            java.lang.String r0 = "Found duplicated key: \""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = "\". This can cause unintended behaviour, please use unique keys for every preference."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r2, r0)
        L_0x0033:
            int r2 = r8.A02
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r0) goto L_0x0056
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x004b
            int r1 = r7.A00
            int r0 = r1 + 1
            r7.A00 = r0
            if (r1 == r2) goto L_0x004b
            r8.A02 = r1
            r8.A05()
        L_0x004b:
            boolean r0 = r8 instanceof androidx.preference.PreferenceGroup
            if (r0 == 0) goto L_0x0056
            r1 = r8
            androidx.preference.PreferenceGroup r1 = (androidx.preference.PreferenceGroup) r1
            boolean r0 = r7.A04
            r1.A04 = r0
        L_0x0056:
            int r2 = java.util.Collections.binarySearch(r3, r8)
            if (r2 >= 0) goto L_0x005e
            int r2 = -r2
            int r2 = r2 - r6
        L_0x005e:
            boolean r1 = r7.A0O()
            boolean r0 = r8.A0W
            if (r0 != r1) goto L_0x0074
            r0 = r1 ^ 1
            r8.A0W = r0
            boolean r0 = r8.A0O()
            r8.A0L(r0)
            r8.A04()
        L_0x0074:
            monitor-enter(r7)
            r3.add(r2, r8)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r7)     // Catch:{ all -> 0x00c9 }
            X.04e r5 = r7.A0F
            java.lang.String r4 = r8.A0L
            if (r4 == 0) goto L_0x009a
            X.00O r1 = r7.A06
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r1.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r1.remove(r4)
        L_0x0094:
            r8.A04 = r2
            r8.A0T = r6
            r1 = 0
            goto L_0x00a4
        L_0x009a:
            monitor-enter(r5)
            long r2 = r5.A00     // Catch:{ all -> 0x00c6 }
            r0 = 1
            long r0 = r0 + r2
            r5.A00 = r0     // Catch:{ all -> 0x00c6 }
            monitor-exit(r5)     // Catch:{ all -> 0x00c6 }
            goto L_0x0094
        L_0x00a4:
            r8.A0H(r5)     // Catch:{ all -> 0x00c2 }
            r8.A0T = r1
            androidx.preference.PreferenceGroup r0 = r8.A0E
            if (r0 != 0) goto L_0x00ba
            r8.A0E = r7
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x00b6
            r8.A06()
        L_0x00b6:
            r7.A05()
            return
        L_0x00ba:
            java.lang.String r0 = "This preference already has a parent. You must remove the existing parent before assigning a new one."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x00c2:
            r0 = move-exception
            r8.A0T = r1
            throw r0
        L_0x00c6:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00c6 }
            throw r1
        L_0x00c9:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00c9 }
            throw r1
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.PreferenceGroup.A0U(androidx.preference.Preference):void");
    }

    public final void A0V(Preference preference) {
        synchronized (this) {
            preference.A09();
            if (preference.A0E == this) {
                preference.A0E = null;
            }
            if (this.A02.remove(preference)) {
                String str = preference.A0L;
                if (str != null) {
                    this.A06.put(str, Long.valueOf(preference.A00()));
                    Handler handler = this.A05;
                    Runnable runnable = this.A07;
                    handler.removeCallbacks(runnable);
                    handler.post(runnable);
                }
                if (this.A03) {
                    preference.A08();
                }
            }
        }
    }

    public boolean A0W() {
        return true;
    }
}
