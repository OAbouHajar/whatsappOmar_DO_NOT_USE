package androidx.preference;

import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02C;
import X.AnonymousClass02v;
import X.AnonymousClass050;
import X.AnonymousClass06B;
import X.AnonymousClass0BK;
import X.AnonymousClass0Fb;
import X.AnonymousClass0Fe;
import X.AnonymousClass0Fq;
import X.AnonymousClass0NL;
import X.C006302t;
import X.C006402u;
import X.C006502w;
import X.C009104e;
import X.C09470fZ;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;

public abstract class PreferenceFragmentCompat extends AnonymousClass01A implements C006302t, C006402u, AnonymousClass02v, C006502w {
    public int A00 = R.layout.layout04b6;
    public Handler A01 = new AnonymousClass0BK(this);
    public C009104e A02;
    public RecyclerView A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass0Fe A06 = new AnonymousClass0Fe(this);
    public final Runnable A07 = new C09470fZ(this);

    public void A0q() {
        this.A0V = true;
        C009104e r0 = this.A02;
        r0.A06 = this;
        r0.A04 = this;
    }

    public void A0s(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.A02.A07;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.A0C(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        TypedArray obtainStyledAttributes = A0u().obtainStyledAttributes((AttributeSet) null, AnonymousClass0NL.A07, R.attr.attr03e1, 0);
        this.A00 = obtainStyledAttributes.getResourceId(0, this.A00);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z2 = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(A0u());
        View inflate = cloneInContext.inflate(this.A00, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            if (!A0u().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
                recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.layout04b9, viewGroup2, false);
                A0u();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.setAccessibilityDelegateCompat(new AnonymousClass0Fq(recyclerView));
            }
            this.A03 = recyclerView;
            AnonymousClass0Fe r7 = this.A06;
            recyclerView.A0m(r7);
            r7.A00 = drawable != null ? drawable.getIntrinsicHeight() : 0;
            r7.A01 = drawable;
            PreferenceFragmentCompat preferenceFragmentCompat = r7.A03;
            preferenceFragmentCompat.A03.A0N();
            if (dimensionPixelSize != -1) {
                r7.A00 = dimensionPixelSize;
                preferenceFragmentCompat.A03.A0N();
            }
            r7.A02 = z2;
            if (this.A03.getParent() == null) {
                viewGroup2.addView(this.A03);
            }
            this.A01.post(this.A07);
            return inflate;
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    public void A13() {
        Handler handler = this.A01;
        handler.removeCallbacks(this.A07);
        handler.removeMessages(1);
        if (this.A04) {
            this.A03.setAdapter((AnonymousClass01X) null);
            PreferenceScreen preferenceScreen = this.A02.A07;
            if (preferenceScreen != null) {
                preferenceScreen.A08();
            }
        }
        this.A03 = null;
        this.A0V = true;
    }

    public void A15() {
        this.A0V = true;
        C009104e r1 = this.A02;
        r1.A06 = null;
        r1.A04 = null;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        TypedValue typedValue = new TypedValue();
        A0C().getTheme().resolveAttribute(R.attr.attr03e7, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = R.style.style0213;
        }
        A0C().getTheme().applyStyle(i2, false);
        C009104e r0 = new C009104e(A0u());
        this.A02 = r0;
        r0.A05 = this;
        Bundle bundle2 = this.A05;
        A19(bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null, bundle);
    }

    public void A18(Bundle bundle, View view) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (preferenceScreen2 = this.A02.A07) == null)) {
            preferenceScreen2.A0B(bundle2);
        }
        if (this.A04 && (preferenceScreen = this.A02.A07) != null) {
            this.A03.setAdapter(new AnonymousClass0Fb(preferenceScreen));
            preferenceScreen.A06();
        }
        this.A05 = true;
    }

    public abstract void A19(String str, Bundle bundle);

    public Preference A92(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        C009104e r0 = this.A02;
        if (r0 == null || (preferenceScreen = r0.A07) == null) {
            return null;
        }
        return preferenceScreen.A0S(charSequence);
    }

    public boolean AV7(Preference preference) {
        String str = preference.A0K;
        if (str == null) {
            return false;
        }
        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
        AnonymousClass02C r4 = A0D().A03.A00.A03;
        Bundle bundle = preference.A08;
        if (bundle == null) {
            bundle = new Bundle();
            preference.A08 = bundle;
        }
        AnonymousClass06B A0C = r4.A0C();
        A0D().getClassLoader();
        AnonymousClass01A A002 = A0C.A00(str);
        A002.A0T(bundle);
        A002.A0W(this, 0);
        AnonymousClass050 r1 = new AnonymousClass050(r4);
        r1.A0A(A002, ((View) this.A0A.getParent()).getId());
        r1.A0I((String) null);
        r1.A00(false);
        return true;
    }
}
