package X;

import android.animation.ValueAnimator;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxSListenerShape35S0000000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: X.2yh  reason: invalid class name and case insensitive filesystem */
public class C59652yh extends C59662yi {
    public final int A00;
    public final C16040sK A01;
    public final C17170ue A02;
    public final C32201fo A03;
    public final QuantitySelector A04;
    public final C108585Oo A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59652yh(android.view.View r13, X.C16040sK r14, X.C17170ue r15, X.AnonymousClass4D4 r16, X.C50262Yq r17, X.C32191fn r18, X.C32201fo r19, X.C108585Oo r20, X.AnonymousClass5RY r21, X.AnonymousClass013 r22, com.whatsapp.jid.UserJid r23) {
        /*
            r12 = this;
            r5 = r12
            r6 = r13
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r22
            r11 = r23
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.A01 = r14
            r12.A02 = r15
            r4 = r19
            r12.A03 = r4
            r0 = r20
            r12.A05 = r0
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131100118(0x7f0601d6, float:1.7812608E38)
            int r0 = r1.getColor(r0)
            r12.A00 = r0
            r0 = 2131365504(0x7f0a0e80, float:1.8350875E38)
            android.view.View r2 = X.C004601z.A0E(r13, r0)
            com.obwhatsapp.biz.catalog.view.widgets.QuantitySelector r2 = (com.obwhatsapp.biz.catalog.view.widgets.QuantitySelector) r2
            r12.A04 = r2
            r0 = 1
            r2.setCollapsible(r0)
            r0 = 0
            r2.setVisibility(r0)
            X.4vw r0 = new X.4vw
            r3 = r21
            r0.<init>(r9, r4, r12, r3)
            r2.A05 = r0
            r1 = 1
            com.facebook.redex.IDxRListenerShape40S0300000_2_I1 r0 = new com.facebook.redex.IDxRListenerShape40S0300000_2_I1
            r0.<init>(r9, r12, r3, r1)
            r2.A04 = r0
            r0 = 21
            X.C34331k5.A01(r13, r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59652yh.<init>(android.view.View, X.0sK, X.0ue, X.4D4, X.2Yq, X.1fn, X.1fo, X.5Oo, X.5RY, X.013, com.whatsapp.jid.UserJid):void");
    }

    public void A09() {
        QuantitySelector quantitySelector = this.A04;
        if (quantitySelector.A0B) {
            quantitySelector.A0D.removeCallbacksAndMessages((Object) null);
            ValueAnimator valueAnimator = quantitySelector.A02;
            if (valueAnimator != null) {
                valueAnimator.end();
                quantitySelector.A02.removeAllUpdateListeners();
                quantitySelector.A0A = false;
            }
            quantitySelector.A06 = AnonymousClass41G.COLLAPSED;
            quantitySelector.A04(quantitySelector.A01, quantitySelector.A00);
        }
    }

    /* renamed from: A0A */
    public void A08(C50072Xv r19) {
        QuantitySelector quantitySelector;
        ImageView imageView;
        float f2;
        int A002 = A00();
        FrameLayout frameLayout = this.A03;
        if (A002 == 0) {
            frameLayout.setPadding(0, (int) this.A0H.getResources().getDimension(R.dimen.dimen063e), 0, 0);
        } else {
            frameLayout.setPadding(0, 0, 0, 0);
        }
        C32191fn r1 = this.A0A;
        C35701mM AFE = r1.AFE(A002);
        this.A07.A0I((List) null, AFE.A04);
        String str = AFE.A0A;
        boolean A0E = AnonymousClass1ZW.A0E(str);
        TextEmojiLabel textEmojiLabel = this.A06;
        if (!A0E) {
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.A0H(str, (List) null, 0, true);
        } else {
            textEmojiLabel.setVisibility(8);
        }
        if (AFE.A05 == null || AFE.A03 == null) {
            this.A05.setVisibility(8);
        } else {
            TextView textView = this.A05;
            textView.setVisibility(0);
            BigDecimal bigDecimal = AFE.A05;
            SpannableStringBuilder A0F = C13690nt.A0F(AnonymousClass2RK.A01(textView.getContext(), AFE.A02, AFE.A03, this.A0B, bigDecimal, this.A0D));
            if (1 == AFE.A00) {
                A0F.append(" • ").append(textView.getContext().getString(R.string.str0ee1));
            }
            textView.setText(A0F);
        }
        UserJid userJid = this.A0C;
        if (AFE.A00 != 0) {
            int i2 = this.A00;
            quantitySelector = this.A04;
            quantitySelector.setVisibility(8);
            imageView = this.A04;
            f2 = 0.5f;
        } else {
            int i3 = this.A02;
            int i4 = this.A00;
            int i5 = this.A01;
            quantitySelector = this.A04;
            quantitySelector.setVisibility(0);
            imageView = this.A04;
            f2 = 1.0f;
        }
        imageView.setAlpha(f2);
        C808345t.A00(imageView);
        List list = AFE.A06;
        if (list.isEmpty()) {
            Log.w("ProductBaseViewHolder/bindViewInSection/no-product-images");
        }
        if (!AFE.A02() && !list.isEmpty()) {
            AnonymousClass4D4 r0 = this.A08;
            this.A09.A01(imageView, (C35691mL) list.get(0), (C108515Oh) null, r0 == null ? null : new AnonymousClass4H5(r0, userJid), (C108525Oi) null, new IDxSListenerShape35S0000000_2_I1(1), 2);
        }
        C50072Xv r2 = r19;
        quantitySelector.A04(r2.A00, r2.A01.A08);
        quantitySelector.setVisibility(C13680ns.A02(r1.AAU() ? 1 : 0));
    }
}
