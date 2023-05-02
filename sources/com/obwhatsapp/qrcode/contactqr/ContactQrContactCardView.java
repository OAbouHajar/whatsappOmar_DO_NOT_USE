package com.obwhatsapp.qrcode.contactqr;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass152;
import X.AnonymousClass41U;
import X.AnonymousClass440;
import X.C004601z;
import X.C13680ns;
import X.C16010sH;
import X.C16040sK;
import X.C16050sL;
import X.C16080sP;
import X.C16150sX;
import X.C17030uP;
import X.C17160ud;
import X.C17240ul;
import X.C25781Lc;
import X.C28331Vq;
import X.C30521cU;
import X.C51232bE;
import X.C51242bF;
import X.C51262bH;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.obwhatsapp.QrImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.EnumMap;

public class ContactQrContactCardView extends LinearLayout implements AnonymousClass006 {
    public View A00;
    public View A01;
    public C16040sK A02;
    public QrImageView A03;
    public C30521cU A04;
    public C30521cU A05;
    public C30521cU A06;
    public WaTextView A07;
    public ThumbnailButton A08;
    public C17160ud A09;
    public C17030uP A0A;
    public C16080sP A0B;
    public AnonymousClass152 A0C;
    public AnonymousClass013 A0D;
    public C17240ul A0E;
    public C25781Lc A0F;
    public C52662eE A0G;
    public boolean A0H;

    public ContactQrContactCardView(Context context) {
        super(context);
        A00();
        A01(context);
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        A01(context);
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        A01(context);
    }

    public ContactQrContactCardView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A0H) {
            this.A0H = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A02 = C16150sX.A04(A002);
            this.A09 = C16150sX.A0L(A002);
            this.A0B = C16150sX.A0Q(A002);
            this.A0D = C16150sX.A0Z(A002);
            this.A0E = C16150sX.A0o(A002);
            this.A0F = new C25781Lc();
            this.A0A = C16150sX.A0P(A002);
            this.A0C = (AnonymousClass152) A002.A51.get();
        }
    }

    public final void A01(Context context) {
        LinearLayout.inflate(context, R.layout.layout0149, this);
        this.A08 = (ThumbnailButton) C004601z.A0E(this, R.id.profile_picture);
        this.A06 = new C30521cU((View) this, this.A0B, this.A0D, this.A0F, (int) R.id.title);
        this.A04 = new C30521cU((View) this, this.A0B, this.A0D, this.A0F, (int) R.id.custom_url);
        this.A05 = new C30521cU((View) this, this.A0B, this.A0D, this.A0F, (int) R.id.subtitle);
        this.A00 = C004601z.A0E(this, R.id.qr_code_container);
        this.A03 = (QrImageView) C004601z.A0E(this, R.id.qr_code);
        this.A07 = C13680ns.A0S(this, R.id.prompt);
        this.A01 = C004601z.A0E(this, R.id.qr_shadow);
    }

    public void A02(C16010sH r6, boolean z2) {
        C30521cU r2;
        Context context;
        int i2;
        if (!r6.A0Z || !z2) {
            this.A09.A06(this.A08, r6);
        } else {
            this.A08.setImageBitmap(this.A0C.A00(getContext(), r6, (float) getResources().getDimensionPixelSize(R.dimen.dimen020c), getResources().getDimensionPixelSize(R.dimen.dimen020d)));
        }
        if (r6.A0J()) {
            this.A06.A0E(this.A0B.A08(r6));
            boolean A0m = this.A0E.A0m((C16050sL) r6.A08(C16050sL.class));
            r2 = this.A05;
            context = getContext();
            i2 = R.string.str0af6;
            if (A0m) {
                i2 = R.string.str0f1b;
            }
        } else if (!r6.A0H()) {
            this.A06.A0E(r6.A0W);
            r2 = this.A05;
            context = getContext();
            i2 = R.string.str0589;
        } else {
            C28331Vq A002 = this.A0A.A00((UserJid) C16010sH.A03(r6));
            if (r6.A0K() || (A002 != null && A002.A03 == 3)) {
                this.A06.A0E(r6.A0W);
                this.A06.A07(1);
                r2 = this.A05;
                context = getContext();
                i2 = R.string.str0300;
            } else {
                this.A06.A0E(r6.A0W);
                r2 = this.A05;
                context = getContext();
                i2 = R.string.str0d46;
            }
        }
        r2.A0E(context.getString(i2));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0G;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0G = r0;
        }
        return r0.generatedComponent();
    }

    public void setCustomUrl(String str) {
        this.A04.A0E(str);
    }

    public void setCustomUrlVisible(boolean z2) {
        C30521cU r0 = this.A04;
        r0.A02.setVisibility(C13680ns.A02(z2 ? 1 : 0));
    }

    public void setPrompt(String str) {
        this.A07.setText(str);
    }

    public void setQrCode(String str) {
        try {
            this.A03.setQrCode(C51242bF.A00(C51232bE.A03, str, new EnumMap(AnonymousClass41U.class)), (C51262bH) null);
            this.A03.invalidate();
        } catch (AnonymousClass440 e2) {
            Log.e("ContactQrContactCardView/failed to set QR code", e2);
        }
    }

    public void setStyle(int i2) {
        this.A06.A05();
        if (i2 == 1) {
            C13680ns.A0u(getContext(), this, R.color.color0180);
            setPadding(0, getResources().getDimensionPixelOffset(R.dimen.dimen0216), 0, getPaddingBottom());
            AnonymousClass000.A0O(this.A07).setMargins(0, this.A07.getResources().getDimensionPixelSize(R.dimen.dimen0217), 0, 0);
            WaTextView waTextView = this.A07;
            waTextView.setTextSize(0, (float) waTextView.getResources().getDimensionPixelSize(R.dimen.dimen0218));
            C13680ns.A0v(getContext(), this.A07, R.color.color0927);
            this.A01.setVisibility(0);
            return;
        }
        C13680ns.A0t(getContext(), this.A00, R.string.str0039);
    }
}
