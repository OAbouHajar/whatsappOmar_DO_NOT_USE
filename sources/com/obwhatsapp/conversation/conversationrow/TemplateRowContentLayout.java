package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass17V;
import X.AnonymousClass1N6;
import X.AnonymousClass1UP;
import X.AnonymousClass2SR;
import X.AnonymousClass4E0;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C16150sX;
import X.C16490t9;
import X.C16740tZ;
import X.C18030w2;
import X.C19980zJ;
import X.C20260zl;
import X.C30011bb;
import X.C30531cW;
import X.C30591cd;
import X.C30611cf;
import X.C39731sy;
import X.C40571uL;
import X.C42351xe;
import X.C52652eD;
import X.C52662eE;
import X.C56522nn;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape3S0400000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

public class TemplateRowContentLayout extends LinearLayout implements AnonymousClass006 {
    public View A00;
    public C19980zJ A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public C30011bb A04;
    public AnonymousClass17V A05;
    public C18030w2 A06;
    public C14710pd A07;
    public C20260zl A08;
    public C16490t9 A09;
    public AnonymousClass1N6 A0A;
    public C52662eE A0B;
    public boolean A0C;
    public final List A0D;

    public TemplateRowContentLayout(Context context) {
        super(context);
        A00();
        this.A0D = AnonymousClass000.A0u();
        A01(context);
    }

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A0D = AnonymousClass000.A0u();
        A01(context);
    }

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A0D = AnonymousClass000.A0u();
        A01(context);
    }

    public TemplateRowContentLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    public static void setupContentView(TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.setLongClickable(C30531cW.A05(textEmojiLabel));
    }

    public void A00() {
        if (!this.A0C) {
            this.A0C = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A07 = C16150sX.A0k(A002);
            this.A05 = (AnonymousClass17V) A002.AFA.get();
            this.A09 = C16150sX.A0m(A002);
            this.A06 = (C18030w2) A002.A6W.get();
            this.A08 = (C20260zl) A002.ACO.get();
            this.A01 = (C19980zJ) A002.A0P.get();
            this.A0A = (AnonymousClass1N6) A002.A8V.get();
        }
    }

    public final void A01(Context context) {
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.layout05a9, this);
        this.A03 = C13680ns.A0R(this, R.id.top_message);
        this.A02 = C13680ns.A0R(this, R.id.bottom_message);
        this.A00 = findViewById(R.id.button_divider);
        List<TextView> list = this.A0D;
        list.add(findViewById(R.id.action_btn_1));
        list.add(findViewById(R.id.action_btn_2));
        list.add(findViewById(R.id.action_btn_3));
        for (TextView A062 : list) {
            AnonymousClass1UP.A06(A062);
        }
    }

    public void A02(C30011bb r24) {
        TextEmojiLabel textEmojiLabel;
        int A002;
        int i2;
        int i3;
        CharSequence A003;
        C30011bb r5 = r24;
        this.A04 = r5;
        C30591cd r6 = (C30591cd) r5.getFMessage();
        C30611cf AGV = r6.AGV();
        String str = AGV.A03;
        String str2 = AGV.A02;
        int i4 = 8;
        if (!TextUtils.isEmpty(str)) {
            r5.setMessageText(str2, this.A03, r5.getFMessage());
            setupContentView(this.A03);
            this.A02.A07 = null;
            this.A03.setVisibility(0);
            r5.A19(this.A02, r5.getFMessage(), str, false, true);
            this.A02.setTextSize(r5.A0g.A02(r5.getResources(), -1));
            textEmojiLabel = this.A02;
            A002 = r5.getSecondaryTextColor();
        } else {
            r5.setMessageText(str2, this.A02, r5.getFMessage());
            setupContentView(this.A02);
            this.A03.setVisibility(8);
            this.A02.setTextSize(r5.getTextFontSize());
            textEmojiLabel = this.A02;
            A002 = AnonymousClass00T.A00(r5.getContext(), R.color.color01b3);
        }
        textEmojiLabel.setTextColor(A002);
        List list = r6.AGV().A05;
        boolean z2 = false;
        int i5 = 0;
        for (TextView textView : this.A0D) {
            if (list == null || i5 >= list.size() || list.get(i5) == null || ((C39731sy) list.get(i5)).A03 == 1) {
                i2 = 8;
            } else {
                C39731sy r8 = (C39731sy) list.get(i5);
                AnonymousClass4E0 r7 = r5.A1q;
                C16740tZ fMessage = r5.getFMessage();
                if (C40571uL.A02(this.A07, r8)) {
                    A003 = r8.A04;
                } else {
                    Context context = getContext();
                    if (r8.A03 == 3) {
                        i3 = R.drawable.ic_action_call;
                    } else {
                        boolean A072 = this.A05.A07(r8);
                        i3 = R.drawable.ic_link_action;
                        if (A072) {
                            i3 = R.drawable.ic_action_copy;
                        }
                    }
                    boolean isEnabled = isEnabled();
                    int i6 = R.color.color019f;
                    if (isEnabled) {
                        i6 = R.color.color04f8;
                    }
                    Drawable A022 = AnonymousClass2SR.A02(context, i3, i6);
                    A022.setAlpha(204);
                    A003 = C56522nn.A00(textView.getPaint(), A022, r8.A04);
                    if (this.A05.A08(r8)) {
                        A003 = Uri.parse(r8.A05).getQueryParameter("cta_display_name");
                    }
                }
                textView.setText(A003);
                if (!this.A05.A08(r8) || r8.A06.get() != 1 || System.currentTimeMillis() - fMessage.A0I <= C42351xe.A00) {
                    C13690nt.A0w(getResources(), textView, R.color.color04f8);
                    textView.setOnClickListener(new ViewOnClickCListenerShape3S0400000_I1(this, r8, r7, fMessage, 3));
                } else {
                    textView.setClickable(false);
                    C13690nt.A0w(getResources(), textView, R.color.color019f);
                }
                z2 = true;
                i2 = 0;
            }
            textView.setVisibility(i2);
            i5++;
        }
        View view = this.A00;
        if (z2) {
            i4 = 0;
        }
        view.setVisibility(i4);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0B;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public TextEmojiLabel getContentTextView() {
        return this.A03.getVisibility() == 0 ? this.A03 : this.A02;
    }

    public TextEmojiLabel getFooterTextView() {
        return this.A02;
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        C30011bb r0 = this.A04;
        if (r0 != null) {
            A02(r0);
        }
    }
}
