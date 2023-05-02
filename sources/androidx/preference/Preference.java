package androidx.preference;

import X.AnonymousClass031;
import X.AnonymousClass0Fb;
import X.AnonymousClass0YZ;
import X.C006402u;
import X.C009104e;
import X.C014907d;
import X.C11940ja;
import X.C12440kP;
import X.C12450kQ;
import X.C12460kR;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;

public class Preference implements Comparable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Context A05;
    public Intent A06;
    public Drawable A07;
    public Bundle A08;
    public C11940ja A09;
    public C12440kP A0A;
    public C12450kQ A0B;
    public AnonymousClass0YZ A0C;
    public C12460kR A0D;
    public PreferenceGroup A0E;
    public C009104e A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public Object A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final View.OnClickListener A0d;

    public Preference(Context context) {
        this(context, (AttributeSet) null);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C014907d.A00(context, R.attr.attr03e6, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0105, code lost:
        if (r3.hasValue(11) != false) goto L_0x0107;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Preference(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11) {
        /*
            r7 = this;
            r7.<init>()
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7.A02 = r6
            r4 = 1
            r7.A0S = r4
            r7.A0Z = r4
            r7.A0X = r4
            r7.A0R = r4
            r7.A0W = r4
            r7.A0c = r4
            r7.A0N = r4
            r7.A0O = r4
            r7.A0b = r4
            r7.A0a = r4
            r2 = 2131559597(0x7f0d04ad, float:1.8744543E38)
            r7.A01 = r2
            r5 = 2
            com.facebook.redex.IDxCListenerShape131S0100000_I0 r0 = new com.facebook.redex.IDxCListenerShape131S0100000_I0
            r0.<init>(r7, r5)
            r7.A0d = r0
            r7.A05 = r8
            int[] r0 = X.AnonymousClass0NL.A06
            android.content.res.TypedArray r3 = r8.obtainStyledAttributes(r9, r0, r10, r11)
            r1 = 23
            r0 = 0
            int r0 = r3.getResourceId(r0, r0)
            int r0 = r3.getResourceId(r1, r0)
            r7.A00 = r0
            r0 = 26
            r1 = 6
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = r3.getString(r1)
        L_0x004c:
            r7.A0L = r0
            r0 = 34
            r1 = 4
            java.lang.CharSequence r0 = r3.getText(r0)
            if (r0 != 0) goto L_0x005b
            java.lang.CharSequence r0 = r3.getText(r1)
        L_0x005b:
            r7.A0H = r0
            r0 = 33
            r1 = 7
            java.lang.CharSequence r0 = r3.getText(r0)
            if (r0 != 0) goto L_0x006a
            java.lang.CharSequence r0 = r3.getText(r1)
        L_0x006a:
            r7.A0G = r0
            r1 = 28
            r0 = 8
            int r0 = r3.getInt(r0, r6)
            int r0 = r3.getInt(r1, r0)
            r7.A02 = r0
            r0 = 22
            r1 = 13
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = r3.getString(r1)
        L_0x0088:
            r7.A0K = r0
            r1 = 27
            r0 = 3
            int r0 = r3.getResourceId(r0, r2)
            int r0 = r3.getResourceId(r1, r0)
            r7.A01 = r0
            r2 = 35
            r1 = 9
            r0 = 0
            int r0 = r3.getResourceId(r1, r0)
            int r0 = r3.getResourceId(r2, r0)
            r7.A03 = r0
            r1 = 21
            boolean r0 = r3.getBoolean(r5, r4)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0S = r0
            r1 = 30
            r0 = 5
            boolean r0 = r3.getBoolean(r0, r4)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0Z = r0
            r1 = 29
            boolean r0 = r3.getBoolean(r4, r4)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0X = r0
            r0 = 19
            r1 = 10
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = r3.getString(r1)
        L_0x00d9:
            r7.A0J = r0
            boolean r0 = r7.A0Z
            r1 = 16
            boolean r0 = r3.getBoolean(r1, r0)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0N = r0
            boolean r0 = r7.A0Z
            r1 = 17
            boolean r0 = r3.getBoolean(r1, r0)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0O = r0
            r1 = 18
            boolean r0 = r3.hasValue(r1)
            if (r0 != 0) goto L_0x0107
            r1 = 11
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x010d
        L_0x0107:
            java.lang.Object r0 = r7.A03(r3, r1)
            r7.A0I = r0
        L_0x010d:
            r1 = 31
            r0 = 12
            boolean r0 = r3.getBoolean(r0, r4)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0a = r0
            r1 = 32
            boolean r0 = r3.hasValue(r1)
            r7.A0U = r0
            if (r0 == 0) goto L_0x0131
            r0 = 14
            boolean r0 = r3.getBoolean(r0, r4)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0b = r0
        L_0x0131:
            r2 = 24
            r1 = 15
            r0 = 0
            boolean r0 = r3.getBoolean(r1, r0)
            boolean r0 = r3.getBoolean(r2, r0)
            r7.A0V = r0
            r1 = 25
            boolean r0 = r3.getBoolean(r1, r4)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0c = r0
            r1 = 20
            r0 = 0
            boolean r0 = r3.getBoolean(r1, r0)
            boolean r0 = r3.getBoolean(r1, r0)
            r7.A0Q = r0
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public long A00() {
        return this.A04;
    }

    public Parcelable A01() {
        this.A0P = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public CharSequence A02() {
        C12460kR r0 = this.A0D;
        return r0 != null ? r0.Aau(this) : this.A0G;
    }

    public Object A03(TypedArray typedArray, int i2) {
        return null;
    }

    public void A04() {
        C11940ja r1 = this.A09;
        if (r1 != null) {
            AnonymousClass0Fb r12 = (AnonymousClass0Fb) r1;
            int indexOf = r12.A05.indexOf(this);
            if (indexOf != -1) {
                r12.A01.A04(this, indexOf, 1);
            }
        }
    }

    public void A05() {
        C11940ja r0 = this.A09;
        if (r0 != null) {
            AnonymousClass0Fb r02 = (AnonymousClass0Fb) r0;
            Handler handler = r02.A00;
            Runnable runnable = r02.A02;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public void A06() {
        PreferenceScreen preferenceScreen;
        Preference A0S2;
        String str = this.A0J;
        if (!TextUtils.isEmpty(str)) {
            C009104e r0 = this.A0F;
            if (r0 == null || (preferenceScreen = r0.A07) == null || (A0S2 = preferenceScreen.A0S(str)) == null) {
                StringBuilder sb = new StringBuilder("Dependency \"");
                sb.append(str);
                sb.append("\" not found for preference \"");
                sb.append(this.A0L);
                sb.append("\" (title: \"");
                sb.append(this.A0H);
                sb.append("\"");
                throw new IllegalStateException(sb.toString());
            }
            List list = A0S2.A0M;
            if (list == null) {
                list = new ArrayList();
                A0S2.A0M = list;
            }
            list.add(this);
            boolean A0O2 = A0S2.A0O();
            if (this.A0R == A0O2) {
                this.A0R = !A0O2;
                A0L(A0O());
                A04();
            }
        }
    }

    public void A07() {
    }

    public void A08() {
        A09();
    }

    public final void A09() {
        C009104e r0;
        PreferenceScreen preferenceScreen;
        Preference A0S2;
        List list;
        String str = this.A0J;
        if (str != null && (r0 = this.A0F) != null && (preferenceScreen = r0.A07) != null && (A0S2 = preferenceScreen.A0S(str)) != null && (list = A0S2.A0M) != null) {
            list.remove(this);
        }
    }

    public void A0A(int i2) {
        String string = this.A05.getString(i2);
        CharSequence charSequence = this.A0H;
        if (string == null) {
            if (charSequence == null) {
                return;
            }
        } else if (string.equals(charSequence)) {
            return;
        }
        this.A0H = string;
        A04();
    }

    public void A0B(Bundle bundle) {
        Parcelable parcelable;
        if ((!TextUtils.isEmpty(this.A0L)) && (parcelable = bundle.getParcelable(this.A0L)) != null) {
            this.A0P = false;
            A0D(parcelable);
            if (!this.A0P) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public void A0C(Bundle bundle) {
        if (!TextUtils.isEmpty(this.A0L)) {
            this.A0P = false;
            Parcelable A012 = A01();
            if (!this.A0P) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (A012 != null) {
                bundle.putParcelable(this.A0L, A012);
            }
        }
    }

    public void A0D(Parcelable parcelable) {
        this.A0P = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public void A0E(View view) {
        Intent intent;
        C006402u r0;
        if (A0N() && this.A0Z) {
            A07();
            C12450kQ r02 = this.A0B;
            if (r02 != null) {
                r02.AV6(this);
                return;
            }
            C009104e r03 = this.A0F;
            if ((r03 == null || (r0 = r03.A06) == null || !r0.AV7(this)) && (intent = this.A06) != null) {
                this.A05.startActivity(intent);
            }
        }
    }

    public final void A0F(View view, boolean z2) {
        view.setEnabled(z2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    A0F(viewGroup.getChildAt(childCount), z2);
                } else {
                    return;
                }
            }
        }
    }

    @Deprecated
    public void A0G(AnonymousClass031 r1) {
    }

    public void A0H(C009104e r5) {
        Object obj;
        long j2;
        this.A0F = r5;
        if (!this.A0T) {
            synchronized (r5) {
                j2 = r5.A00;
                r5.A00 = 1 + j2;
            }
            this.A04 = j2;
        }
        if (A0P()) {
            C009104e r0 = this.A0F;
            if ((r0 != null ? r0.A01() : null).contains(this.A0L)) {
                obj = null;
                A0J(obj);
            }
        }
        obj = this.A0I;
        if (obj == null) {
            return;
        }
        A0J(obj);
    }

    public void A0I(CharSequence charSequence) {
        if (this.A0D != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.A0G, charSequence)) {
            this.A0G = charSequence;
            A04();
        }
    }

    public void A0J(Object obj) {
    }

    public void A0K(String str) {
        if (A0P()) {
            String str2 = null;
            if (A0P()) {
                str2 = this.A0F.A01().getString(this.A0L, (String) null);
            }
            if (!TextUtils.equals(str, str2)) {
                SharedPreferences.Editor A002 = this.A0F.A00();
                A002.putString(this.A0L, str);
                if (!this.A0F.A09) {
                    A002.apply();
                }
            }
        }
    }

    public void A0L(boolean z2) {
        List list = this.A0M;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Preference preference = (Preference) list.get(i2);
                if (preference.A0R == z2) {
                    preference.A0R = !z2;
                    preference.A0L(preference.A0O());
                    preference.A04();
                }
            }
        }
    }

    public void A0M(boolean z2) {
        if (this.A0S != z2) {
            this.A0S = z2;
            A0L(A0O());
            A04();
        }
    }

    public boolean A0N() {
        return this.A0S && this.A0R && this.A0W;
    }

    public boolean A0O() {
        return !A0N();
    }

    public boolean A0P() {
        return this.A0F != null && this.A0X && (TextUtils.isEmpty(this.A0L) ^ true);
    }

    public boolean A0Q(Object obj) {
        C12440kP r0 = this.A0A;
        if (r0 == null) {
            return true;
        }
        r0.AV5(this, obj);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008a, code lost:
        if (r0 != null) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0R(X.AnonymousClass0Fp r9) {
        /*
            r8 = this;
            android.view.View r4 = r9.A0H
            android.view.View$OnClickListener r0 = r8.A0d
            r4.setOnClickListener(r0)
            r0 = 0
            r4.setId(r0)
            r0 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r6 = r9.A07(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3 = 0
            r5 = 0
            r2 = 8
            if (r6 == 0) goto L_0x0107
            java.lang.CharSequence r1 = r8.A02()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0104
            r6.setText(r1)
            r6.setVisibility(r5)
            int r0 = r6.getCurrentTextColor()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x0032:
            r0 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r6 = r9.A07(r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L_0x0067
            java.lang.CharSequence r1 = r8.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00ff
            r6.setText(r1)
            r6.setVisibility(r5)
            boolean r0 = r8.A0U
            if (r0 == 0) goto L_0x0054
            boolean r0 = r8.A0b
            r6.setSingleLine(r0)
        L_0x0054:
            boolean r0 = r8.A0Z
            if (r0 != 0) goto L_0x0067
            boolean r0 = r8.A0N()
            if (r0 == 0) goto L_0x0067
            if (r7 == 0) goto L_0x0067
            int r0 = r7.intValue()
            r6.setTextColor(r0)
        L_0x0067:
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r7 = r9.A07(r0)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            if (r7 == 0) goto L_0x0096
            int r6 = r8.A00
            if (r6 != 0) goto L_0x007a
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 == 0) goto L_0x008f
        L_0x007a:
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 != 0) goto L_0x008c
            android.content.Context r1 = r8.A05
            X.06L r0 = X.AnonymousClass06L.A02()
            android.graphics.drawable.Drawable r0 = r0.A05(r1, r6)
            r8.A07 = r0
            if (r0 == 0) goto L_0x008f
        L_0x008c:
            r7.setImageDrawable(r0)
        L_0x008f:
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 == 0) goto L_0x00f4
            r7.setVisibility(r5)
        L_0x0096:
            r0 = 2131364068(0x7f0a08e4, float:1.8347963E38)
            android.view.View r1 = r9.A07(r0)
            if (r1 != 0) goto L_0x00a8
            r0 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r1 = r9.A07(r0)
            if (r1 == 0) goto L_0x00af
        L_0x00a8:
            android.graphics.drawable.Drawable r0 = r8.A07
            if (r0 == 0) goto L_0x00eb
            r1.setVisibility(r5)
        L_0x00af:
            boolean r0 = r8.A0a
            if (r0 == 0) goto L_0x00e9
            boolean r0 = r8.A0N()
        L_0x00b7:
            r8.A0F(r4, r0)
            boolean r2 = r8.A0Z
            r4.setFocusable(r2)
            r4.setClickable(r2)
            boolean r0 = r8.A0N
            r9.A00 = r0
            boolean r0 = r8.A0O
            r9.A01 = r0
            boolean r1 = r8.A0Q
            if (r1 == 0) goto L_0x00e7
            X.0YZ r0 = r8.A0C
            if (r0 != 0) goto L_0x00d9
            X.0YZ r0 = new X.0YZ
            r0.<init>(r8)
            r8.A0C = r0
        L_0x00d9:
            r4.setOnCreateContextMenuListener(r0)
            r4.setLongClickable(r1)
            if (r1 == 0) goto L_0x00e6
            if (r2 != 0) goto L_0x00e6
            r4.setBackground(r3)
        L_0x00e6:
            return
        L_0x00e7:
            r0 = r3
            goto L_0x00d9
        L_0x00e9:
            r0 = 1
            goto L_0x00b7
        L_0x00eb:
            boolean r0 = r8.A0V
            if (r0 == 0) goto L_0x00f0
            r2 = 4
        L_0x00f0:
            r1.setVisibility(r2)
            goto L_0x00af
        L_0x00f4:
            boolean r1 = r8.A0V
            r0 = 8
            if (r1 == 0) goto L_0x00fb
            r0 = 4
        L_0x00fb:
            r7.setVisibility(r0)
            goto L_0x0096
        L_0x00ff:
            r6.setVisibility(r2)
            goto L_0x0067
        L_0x0104:
            r6.setVisibility(r2)
        L_0x0107:
            r7 = r3
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.A0R(X.0Fp):void");
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i2 = this.A02;
        int i3 = preference.A02;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.A0H;
        CharSequence charSequence2 = preference.A0H;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.A0H.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.A0H;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence A022 = A02();
        if (!TextUtils.isEmpty(A022)) {
            sb.append(A022);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
