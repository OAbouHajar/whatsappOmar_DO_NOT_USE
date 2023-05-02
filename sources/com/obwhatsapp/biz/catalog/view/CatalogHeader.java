package com.obwhatsapp.biz.catalog.view;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass152;
import X.AnonymousClass16O;
import X.AnonymousClass1U3;
import X.AnonymousClass1ZW;
import X.AnonymousClass2SR;
import X.C004601z;
import X.C13680ns;
import X.C15900s5;
import X.C16000sG;
import X.C16010sH;
import X.C16040sK;
import X.C16080sP;
import X.C16150sX;
import X.C16320sq;
import X.C17030uP;
import X.C17140ub;
import X.C17150uc;
import X.C17190ug;
import X.C19000xb;
import X.C28331Vq;
import X.C34331k5;
import X.C45902Bo;
import X.C52652eD;
import X.C78773yf;
import X.C87594Xo;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxPCallbackShape80S0200000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.jobqueue.job.GetVNameCertificateJob;
import com.whatsapp.jid.UserJid;

public class CatalogHeader extends AspectRatioFrameLayout implements AnonymousClass1U3 {
    public ImageView A00;
    public TextView A01;
    public C16040sK A02;
    public C15900s5 A03;
    public TextEmojiLabel A04;
    public C19000xb A05;
    public C17150uc A06;
    public AnonymousClass16O A07;
    public C16000sG A08;
    public C17140ub A09;
    public C17030uP A0A;
    public C16080sP A0B;
    public AnonymousClass152 A0C;
    public AnonymousClass013 A0D;
    public GetVNameCertificateJob A0E;
    public C17190ug A0F;
    public C16320sq A0G;
    public boolean A0H;
    public boolean A0I;

    public CatalogHeader(Context context) {
        this(context, (AttributeSet) null);
    }

    public CatalogHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CatalogHeader(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
        A02(context, attributeSet);
    }

    public void A01() {
        if (!this.A0H) {
            this.A0H = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A02 = C16150sX.A04(A002);
            this.A0G = C16150sX.A1B(A002);
            this.A03 = (C15900s5) A002.ALm.get();
            this.A05 = (C19000xb) A002.AQX.get();
            this.A0F = C16150sX.A0t(A002);
            this.A08 = C16150sX.A0M(A002);
            this.A0B = C16150sX.A0Q(A002);
            this.A0D = C16150sX.A0Z(A002);
            this.A09 = C16150sX.A0N(A002);
            this.A0A = C16150sX.A0P(A002);
            this.A07 = (AnonymousClass16O) A002.A36.get();
            this.A06 = C16150sX.A09(A002);
            this.A0C = (AnonymousClass152) A002.A51.get();
        }
    }

    public void ARp() {
    }

    public void ARq() {
    }

    public float getAspectRatio() {
        return this.A00;
    }

    public void setOnTextClickListener(C34331k5 r2) {
        TextView textView = this.A01;
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            this.A01.setOnClickListener(r2);
        }
        TextEmojiLabel textEmojiLabel = this.A04;
        if (textEmojiLabel != null && !TextUtils.isEmpty(textEmojiLabel.getText())) {
            this.A04.setOnClickListener(r2);
        }
    }

    public void setUp(UserJid userJid) {
        String str;
        this.A00 = C13680ns.A0K(this, R.id.catalog_list_header_image);
        TextView A0M = C13680ns.A0M(this, R.id.catalog_list_header_business_name);
        this.A01 = A0M;
        C004601z.A0o(A0M, true);
        if (!this.A02.A0I(userJid)) {
            AnonymousClass2SR.A06(AnonymousClass00T.A04(getContext(), R.drawable.chevron_right), -1);
            C45902Bo.A0F(this.A01, this.A0D);
            TextView textView = this.A01;
            if (textView != null) {
                textView.setCompoundDrawablePadding(C87594Xo.A00(getContext(), 8.0f));
            }
        }
        TextEmojiLabel A0R = C13680ns.A0R(this, R.id.catalog_list_header_business_description);
        this.A04 = A0R;
        C004601z.A0o(A0R, true);
        C28331Vq A002 = this.A0A.A00(userJid);
        if (A002 == null) {
            if (this.A0E == null) {
                GetVNameCertificateJob getVNameCertificateJob = new GetVNameCertificateJob(userJid);
                this.A0E = getVNameCertificateJob;
                this.A05.A00(getVNameCertificateJob);
            }
            str = null;
        } else {
            str = A002.A08;
        }
        C16010sH A0A2 = this.A08.A0A(userJid);
        TextView textView2 = this.A01;
        if (textView2 != null) {
            if (AnonymousClass1ZW.A0E(str)) {
                str = this.A0B.A08(A0A2);
            }
            textView2.setText(str);
        }
        this.A06.A03(new IDxPCallbackShape80S0200000_2_I1(userJid, 1, this), userJid);
        C13680ns.A1U(new C78773yf(this, this.A0C, A0A2), this.A0G);
    }
}
