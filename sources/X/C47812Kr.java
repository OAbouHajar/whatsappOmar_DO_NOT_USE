package X;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.obwhatsapp.R;

/* renamed from: X.2Kr  reason: invalid class name and case insensitive filesystem */
public class C47812Kr {
    public int A00 = -1;
    public View A01;
    public C47822Ks A02;
    public TabLayout A03;
    public CharSequence A04;
    public CharSequence A05;
    public Object A06;

    public static C47812Kr A00(AnonymousClass01A r5, TabLayout tabLayout, int i2, int i3) {
        C47812Kr A032 = tabLayout.A03();
        A032.A02(i2);
        A032.A06 = Integer.valueOf(i3);
        A032.A04 = r5.A0K(R.string.str16c8, r5.A0J(i2));
        C47822Ks r0 = A032.A02;
        if (r0 != null) {
            r0.A00();
        }
        return A032;
    }

    public void A01() {
        TabLayout tabLayout = this.A03;
        if (tabLayout != null) {
            tabLayout.A0G(this, true);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public void A02(int i2) {
        TabLayout tabLayout = this.A03;
        if (tabLayout != null) {
            A03(tabLayout.getResources().getText(i2));
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public void A03(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.A04) && !TextUtils.isEmpty(charSequence)) {
            this.A02.setContentDescription(charSequence);
        }
        this.A05 = charSequence;
        C47822Ks r0 = this.A02;
        if (r0 != null) {
            r0.A00();
        }
    }
}
