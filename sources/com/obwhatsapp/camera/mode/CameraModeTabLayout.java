package com.obwhatsapp.camera.mode;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass3ET;
import X.C004601z;
import X.C16150sX;
import X.C18450wi;
import X.C47812Kr;
import X.C47822Ks;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C54792iF;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import com.obwhatsapp.R;

public final class CameraModeTabLayout extends TabLayout implements AnonymousClass006 {
    public C54792iF A00;
    public AnonymousClass01V A01;
    public AnonymousClass013 A02;
    public C52662eE A03;
    public boolean A04;
    public final C47812Kr A05;
    public final C47812Kr A06;

    public CameraModeTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C47812Kr A032 = A03();
        A032.A02(R.string.str038a);
        A032.A06 = 2;
        this.A06 = A032;
        C47812Kr A033 = A03();
        A033.A02(R.string.str0389);
        A033.A06 = 1;
        this.A05 = A033;
        A0E(A032);
        A0F(A033, this.A0c.size(), true);
        A0D(new AnonymousClass3ET(this));
    }

    public CameraModeTabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A01 = (AnonymousClass01V) r1.AOi.get();
            this.A02 = (AnonymousClass013) r1.AR8.get();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A03;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final C54792iF getCameraModeTabLayoutListener() {
        return this.A00;
    }

    public final C47812Kr getPhotoModeTab() {
        return this.A05;
    }

    public final AnonymousClass01V getSystemServices() {
        AnonymousClass01V r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18450wi.A0O("systemServices");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final C47812Kr getVideoModeTab() {
        return this.A06;
    }

    public final AnonymousClass013 getWhatsAppLocale() {
        AnonymousClass013 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18450wi.A0O("whatsAppLocale");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C47812Kr A042 = A04(0);
        C18450wi.A0F(A042);
        C47822Ks r2 = A042.A02;
        C18450wi.A0A(r2);
        C47812Kr A043 = A04(this.A0c.size() - 1);
        C18450wi.A0F(A043);
        C47822Ks r3 = A043.A02;
        C18450wi.A0A(r3);
        C004601z.A0h(getChildAt(0), (getWidth() - r2.getWidth()) >> 1, 0, (getWidth() - r3.getWidth()) >> 1, 0);
        C47812Kr r1 = this.A05;
        TabLayout tabLayout = r1.A03;
        if (tabLayout != null) {
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            int i6 = r1.A00;
            if (selectedTabPosition == i6) {
                A09(0.0f, i6, false, true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void setCameraModeTabLayoutListener(C54792iF r1) {
        this.A00 = r1;
    }

    public final void setSystemServices(AnonymousClass01V r2) {
        C18450wi.A0H(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(AnonymousClass013 r2) {
        C18450wi.A0H(r2, 0);
        this.A02 = r2;
    }
}
