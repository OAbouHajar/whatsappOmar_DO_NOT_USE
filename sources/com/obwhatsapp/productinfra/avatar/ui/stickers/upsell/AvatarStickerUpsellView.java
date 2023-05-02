package com.obwhatsapp.productinfra.avatar.ui.stickers.upsell;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass06X;
import X.AnonymousClass1ML;
import X.AnonymousClass47K;
import X.AnonymousClass518;
import X.C106505Ec;
import X.C106515Ed;
import X.C106525Ee;
import X.C106535Ef;
import X.C106675Et;
import X.C106785Fe;
import X.C13680ns;
import X.C13690nt;
import X.C15220qW;
import X.C16150sX;
import X.C18450wi;
import X.C211613a;
import X.C211913d;
import X.C212013e;
import X.C26141Mm;
import X.C27121Qn;
import X.C32521gW;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C54392hN;
import X.C78073x3;
import X.C78083x4;
import X.C817349n;
import X.C86254Rw;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.redex.ViewOnClickCListenerShape19S0100000_I1_4;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

public final class AvatarStickerUpsellView extends ConstraintLayout implements AnonymousClass006 {
    public C26141Mm A00;
    public C27121Qn A01;
    public C212013e A02;
    public AnonymousClass1ML A03;
    public C211913d A04;
    public C211613a A05;
    public AnonymousClass47K A06;
    public C52662eE A07;
    public boolean A08;
    public final WaImageView A09;
    public final AnonymousClass518 A0A;
    public final C15220qW A0B;
    public final C15220qW A0C;
    public final C15220qW A0D;
    public final C15220qW A0E;
    public final C15220qW A0F;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18450wi.A0H(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerUpsellView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AnonymousClass47K r0;
        C18450wi.A0H(context, 1);
        if (!this.A08) {
            this.A08 = true;
            C52652eD r1 = (C52652eD) ((C52642eC) generatedComponent());
            this.A03 = r1.A05.A0c();
            C16150sX r12 = r1.A07;
            this.A02 = (C212013e) r12.A1I.get();
            this.A00 = (C26141Mm) r12.A10.get();
            this.A01 = (C27121Qn) r12.A1H.get();
            this.A04 = (C211913d) r12.A12.get();
            this.A05 = (C211613a) r12.A1E.get();
        }
        this.A0E = C32521gW.A01(new C106535Ef(context));
        this.A0C = C32521gW.A01(new C106515Ed(context));
        this.A0D = C32521gW.A01(new C106525Ee(context));
        this.A0B = C32521gW.A01(new C106505Ec(context));
        this.A0F = C32521gW.A01(new C106675Et(context, this));
        this.A0A = new AnonymousClass518(this);
        LayoutInflater.from(context).inflate(R.layout.layout05de, this, true);
        this.A09 = (WaImageView) C18450wi.A00(this, R.id.stickers_upsell_image);
        setBackgroundResource(R.drawable.stickers_upsell_background);
        C13680ns.A0t(context, this, R.string.str1dbc);
        View A002 = C18450wi.A00(this, R.id.stickers_upsell_close);
        if (attributeSet != null) {
            int i3 = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C817349n.A00, 0, 0);
            C18450wi.A0B(obtainStyledAttributes);
            A002.setVisibility(obtainStyledAttributes.getBoolean(0, true) ? 0 : 4);
            boolean z2 = obtainStyledAttributes.getBoolean(2, true);
            TextView A0L = C13680ns.A0L(this, R.id.stickers_upsell_publisher);
            A0L.setVisibility(!z2 ? 8 : i3);
            A0L.setText("Meta");
            int i4 = obtainStyledAttributes.getInt(1, -1);
            if (i4 == 0) {
                r0 = C78073x3.A00;
            } else if (i4 == 1) {
                r0 = C78083x4.A00;
            } else {
                throw AnonymousClass000.A0T("Avatar sticker upsell entry point must be set");
            }
            this.A06 = r0;
            obtainStyledAttributes.recycle();
        }
        setOnClickListener(new ViewOnClickCListenerShape19S0100000_I1_4(this, 11));
        C13680ns.A15(A002, this, 10);
        C86254Rw viewController = getViewController();
        AnonymousClass47K r3 = this.A06;
        if (r3 == null) {
            throw C18450wi.A03("entryPoint");
        } else if (!((SharedPreferences) viewController.A03.A01.getValue()).getBoolean("pref_has_dismissed_sticker_upsell", false) || !(r3 instanceof C78083x4)) {
            viewController.A02.A00(new C106785Fe(r3, viewController));
        } else {
            viewController.A01.setVisibility(8);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarStickerUpsellView(Context context, AttributeSet attributeSet, int i2, int i3, C54392hN r6) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    public static final void A01(AvatarStickerUpsellView avatarStickerUpsellView) {
        avatarStickerUpsellView.getAvatarLogger().A02(10);
        C86254Rw viewController = avatarStickerUpsellView.getViewController();
        AnonymousClass1ML.A01(viewController.A04, "avatar_sticker_upsell", C13690nt.A0h(viewController.A00));
    }

    public static final void A02(AvatarStickerUpsellView avatarStickerUpsellView) {
        avatarStickerUpsellView.getAvatarLogger().A02(11);
        C86254Rw viewController = avatarStickerUpsellView.getViewController();
        C13680ns.A0z(((SharedPreferences) viewController.A03.A01.getValue()).edit(), "pref_has_dismissed_sticker_upsell", true);
        viewController.A01.setVisibility(8);
    }

    private final int getImageHeightLandscape() {
        return AnonymousClass000.A0D(this.A0B.getValue());
    }

    private final int getImageHeightPortrait() {
        return AnonymousClass000.A0D(this.A0C.getValue());
    }

    private final int getImageWidthLandscape() {
        return AnonymousClass000.A0D(this.A0D.getValue());
    }

    private final int getImageWidthPortrait() {
        return AnonymousClass000.A0D(this.A0E.getValue());
    }

    /* access modifiers changed from: private */
    public final C86254Rw getViewController() {
        return (C86254Rw) this.A0F.getValue();
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A07;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public final C26141Mm getAvatarConfigRepository() {
        C26141Mm r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C18450wi.A03("avatarConfigRepository");
    }

    public final C211913d getAvatarEditorEventObservers() {
        C211913d r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C18450wi.A03("avatarEditorEventObservers");
    }

    public final AnonymousClass1ML getAvatarEditorLauncher() {
        AnonymousClass1ML r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18450wi.A03("avatarEditorLauncher");
    }

    public final C211613a getAvatarLogger() {
        C211613a r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C18450wi.A03("avatarLogger");
    }

    public final C27121Qn getAvatarRepository() {
        C27121Qn r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C18450wi.A03("avatarRepository");
    }

    public final C212013e getAvatarSharedPreferences() {
        C212013e r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18450wi.A03("avatarSharedPreferences");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAvatarEditorEventObservers().A02(this.A0A);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            this.A09.setLayoutParams(new AnonymousClass06X(configuration.orientation == 2 ? getImageWidthLandscape() : getImageWidthPortrait(), configuration.orientation == 2 ? getImageHeightLandscape() : getImageHeightPortrait()));
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getAvatarEditorEventObservers().A03(this.A0A);
    }

    public final void setAvatarConfigRepository(C26141Mm r2) {
        C18450wi.A0H(r2, 0);
        this.A00 = r2;
    }

    public final void setAvatarEditorEventObservers(C211913d r2) {
        C18450wi.A0H(r2, 0);
        this.A04 = r2;
    }

    public final void setAvatarEditorLauncher(AnonymousClass1ML r2) {
        C18450wi.A0H(r2, 0);
        this.A03 = r2;
    }

    public final void setAvatarLogger(C211613a r2) {
        C18450wi.A0H(r2, 0);
        this.A05 = r2;
    }

    public final void setAvatarRepository(C27121Qn r2) {
        C18450wi.A0H(r2, 0);
        this.A01 = r2;
    }

    public final void setAvatarSharedPreferences(C212013e r2) {
        C18450wi.A0H(r2, 0);
        this.A02 = r2;
    }
}
