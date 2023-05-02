package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.components.Button;

/* renamed from: X.2ja  reason: invalid class name and case insensitive filesystem */
public class C55422ja extends C55432jb implements AnonymousClass2VS {
    public View A00;
    public LinearLayout A01 = ((LinearLayout) C004601z.A0E(this.A00, R.id.action_view_container));
    public TextEmojiLabel A02;
    public Button A03 = ((Button) C004601z.A0E(this.A00, R.id.action_view_1));
    public Button A04 = ((Button) C004601z.A0E(this.A00, R.id.action_view_2));
    public C55442jc A05;
    public AnonymousClass01V A06;
    public AnonymousClass013 A07;

    public C55422ja(Context context) {
        super(context);
        RelativeLayout.inflate(context, R.layout.layout015b, this);
        View findViewById = findViewById(R.id.block_add_footer_floating_content);
        this.A00 = findViewById;
        this.A02 = (TextEmojiLabel) C004601z.A0E(findViewById, R.id.header);
    }

    public final void A00(Button button, int i2, int i3, int i4, int i5) {
        button.setVisibility(0);
        if (i2 != 0) {
            button.setText(getContext().getString(i2));
        }
        if (i3 != 0) {
            button.setContentDescription(getContext().getString(i3));
        }
        if (i4 != 0) {
            AnonymousClass2JP.A03(button, i4);
        }
        Drawable A022 = AnonymousClass2SR.A02(getContext(), i5, R.color.color057f);
        if (!this.A07.A0T()) {
            button.setCompoundDrawablesWithIntrinsicBounds(A022, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A022, (Drawable) null);
        }
    }

    public void AHp() {
        this.A00.setVisibility(8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Ac8(X.AnonymousClass4P5 r14) {
        /*
            r13 = this;
            r7 = r13
            android.view.View r0 = r13.A00
            r3 = 0
            r0.setVisibility(r3)
            int r0 = r14.A0B
            r2 = -1
            if (r0 != 0) goto L_0x0104
            r9 = 2131891232(0x7f121420, float:1.9417178E38)
            r10 = 2131891234(0x7f121422, float:1.9417182E38)
            r12 = 2131231912(0x7f0804a8, float:1.8079918E38)
            r5 = 0
        L_0x0016:
            com.obwhatsapp.components.Button r8 = r13.A03
            r4 = 8
            r11 = r9
            r7.A00(r8, r9, r10, r11, r12)
            r1 = 7
            com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0
            r0.<init>(r13, r5, r1)
            r8.setOnClickListener(r0)
        L_0x0027:
            int r0 = r14.A00
            if (r0 != 0) goto L_0x00e2
            r11 = 2131886246(0x7f1200a6, float:1.9407065E38)
            r10 = 2131886249(0x7f1200a9, float:1.9407072E38)
            r12 = 2131231909(0x7f0804a5, float:1.8079912E38)
            r4 = 0
            r9 = 2131886246(0x7f1200a6, float:1.9407065E38)
        L_0x0038:
            com.obwhatsapp.components.Button r8 = r13.A04
            r7.A00(r8, r9, r10, r11, r12)
            r1 = 6
            com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0
            r0.<init>(r13, r4, r1)
            r8.setOnClickListener(r0)
        L_0x0046:
            int r4 = r14.A07
            if (r4 == r2) goto L_0x00d4
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>()
            android.content.Context r0 = r13.getContext()
            java.lang.String r5 = r0.getString(r4)
            r2.append(r5)
            android.content.Context r0 = r13.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131099985(0x7f060151, float:1.7812339E38)
            int r1 = r1.getColor(r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            int r6 = r5.length()
            r5 = 33
            r2.setSpan(r0, r3, r6, r5)
            android.content.Context r1 = r13.getContext()
            X.3MR r0 = new X.3MR
            r0.<init>(r1)
            r2.setSpan(r0, r3, r6, r5)
            int r0 = r14.A06
            if (r0 != 0) goto L_0x00b3
            com.obwhatsapp.TextEmojiLabel r3 = r13.A02
            X.3MF r0 = new X.3MF
            r0.<init>()
            r3.A07 = r0
            X.01V r1 = r13.A06
            X.2q8 r0 = new X.2q8
            r0.<init>(r3, r1)
            r3.setAccessibilityHelper(r0)
            android.content.Context r1 = r13.getContext()
            int r0 = r14.A05
            java.lang.String r1 = r1.getString(r0)
            X.2jc r0 = r13.A05
            android.text.SpannableStringBuilder r1 = r0.A00(r1)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r2.append(r0)
            r0.append(r1)
        L_0x00b3:
            com.obwhatsapp.TextEmojiLabel r1 = r13.A02
            r1.setText(r2)
            android.content.Context r0 = r13.getContext()
            java.lang.String r0 = r0.getString(r4)
            r1.setContentDescription(r0)
        L_0x00c3:
            android.widget.LinearLayout r0 = r13.A01
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 13
            com.facebook.redex.IDxLListenerShape144S0100000_2_I0 r0 = new com.facebook.redex.IDxLListenerShape144S0100000_2_I0
            r0.<init>(r13, r1)
            r2.addOnGlobalLayoutListener(r0)
            return
        L_0x00d4:
            java.lang.String r1 = r14.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00c3
            com.obwhatsapp.TextEmojiLabel r0 = r13.A02
            r0.setText(r1)
            goto L_0x00c3
        L_0x00e2:
            int r0 = r14.A0A
            if (r0 != 0) goto L_0x00fd
            int r9 = r14.A09
            if (r9 != r2) goto L_0x00f9
            r9 = 2131889696(0x7f120e20, float:1.9414063E38)
            r10 = 2131889698(0x7f120e22, float:1.9414067E38)
            r11 = 2131886764(0x7f1202ac, float:1.9408116E38)
        L_0x00f3:
            r12 = 2131231911(0x7f0804a7, float:1.8079916E38)
            r4 = 1
            goto L_0x0038
        L_0x00f9:
            int r10 = r14.A08
            r11 = r9
            goto L_0x00f3
        L_0x00fd:
            com.obwhatsapp.components.Button r0 = r13.A04
            r0.setVisibility(r4)
            goto L_0x0046
        L_0x0104:
            int r0 = r14.A02
            if (r0 != 0) goto L_0x0118
            int r9 = r14.A01
            if (r9 != r2) goto L_0x010f
            r9 = 2131886630(0x7f120226, float:1.9407844E38)
        L_0x010f:
            r10 = 2131886637(0x7f12022d, float:1.9407858E38)
            r12 = 2131231910(0x7f0804a6, float:1.8079914E38)
            r5 = 1
            goto L_0x0016
        L_0x0118:
            int r0 = r14.A04
            if (r0 != 0) goto L_0x0128
            r9 = 2131888268(0x7f12088c, float:1.9411167E38)
            r10 = 2131888271(0x7f12088f, float:1.9411173E38)
            r12 = 2131231638(0x7f080396, float:1.8079363E38)
            r5 = 2
            goto L_0x0016
        L_0x0128:
            int r0 = r14.A03
            if (r0 != 0) goto L_0x0138
            r9 = 2131887873(0x7f120701, float:1.9410365E38)
            r10 = 2131887876(0x7f120704, float:1.9410371E38)
            r12 = 2131231589(0x7f080365, float:1.8079263E38)
            r5 = 3
            goto L_0x0016
        L_0x0138:
            r1 = 8
            com.obwhatsapp.components.Button r0 = r13.A03
            r0.setVisibility(r1)
            r4 = 8
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55422ja.Ac8(X.4P5):void");
    }

    public int getType() {
        return 1;
    }

    public boolean isVisible() {
        return this.A00.getVisibility() == 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A01.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 13));
    }

    public void setup(C55442jc r1) {
        this.A05 = r1;
    }
}
