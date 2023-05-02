package com.obwhatsapp.mediacomposer.bottombar.recipients;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass1w8;
import X.AnonymousClass2JP;
import X.C004601z;
import X.C13680ns;
import X.C16150sX;
import X.C34331k5;
import X.C447725m;
import X.C45902Bo;
import X.C52652eD;
import X.C52662eE;
import X.C53072ew;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1;
import java.util.Iterator;
import java.util.List;

public class RecipientsView extends LinearLayout implements AnonymousClass006 {
    public int A00;
    public AnonymousClass013 A01;
    public AnonymousClass1w8 A02;
    public C52662eE A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final HorizontalScrollView A07;
    public final ImageView A08;
    public final ChipGroup A09;
    public final TextEmojiLabel A0A;
    public final C34331k5 A0B;

    public RecipientsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.A0B = new ViewOnClickCListenerShape5S0100000_I1_1(this, 34);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C53072ew.A0H);
        boolean z2 = obtainStyledAttributes.getBoolean(0, true);
        LinearLayout.inflate(getContext(), z2 ? R.layout.layout0409 : R.layout.layout03cd, this);
        this.A0A = C13680ns.A0Q(this, R.id.recipients_text);
        ImageView A0K = C13680ns.A0K(this, R.id.recipients_prompt_icon);
        this.A08 = A0K;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) C004601z.A0E(this, R.id.recipients_scroller);
        this.A07 = horizontalScrollView;
        this.A09 = z2 ? (ChipGroup) C004601z.A0E(this, R.id.recipient_chips) : null;
        if (A0K != null) {
            C447725m.A01(context, A0K, this.A01, R.drawable.chevron);
        }
        if (z2) {
            AnonymousClass2JP.A03(horizontalScrollView, R.string.str1c80);
        }
        obtainStyledAttributes.recycle();
        this.A04 = true;
        this.A06 = true;
        this.A00 = R.color.color005a;
    }

    public RecipientsView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            this.A01 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }

    public final Chip A00(CharSequence charSequence) {
        Chip chip = new Chip(getContext(), (AttributeSet) null);
        chip.setChipCornerRadiusResource(R.dimen.dimen0769);
        chip.setText(charSequence);
        chip.setTextColor(-1);
        C13680ns.A0v(getContext(), chip, R.color.color005b);
        chip.setChipBackgroundColorResource(this.A00);
        chip.setMinHeight(getResources().getDimensionPixelSize(R.dimen.dimen051e));
        chip.setEnabled(this.A04);
        return chip;
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A03;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public void setRecipientsChips(List list, CharSequence charSequence) {
        ChipGroup chipGroup = this.A09;
        if (chipGroup != null) {
            chipGroup.removeAllViews();
            if (charSequence != null) {
                Chip A002 = A00(charSequence);
                A002.setChipIcon(AnonymousClass00T.A04(getContext(), R.drawable.ic_status_recipient));
                A002.setChipIconSizeResource(R.dimen.dimen051f);
                A002.setIconStartPaddingResource(R.dimen.dimen0520);
                A002.setTextStartPaddingResource(R.dimen.dimen0521);
                A002.setTag("status_chip");
                A002.setOnClickListener(this.A0B);
                chipGroup.addView(A002);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass000.A0m(it);
                Chip A003 = A00(charSequence);
                A003.setText(A0m);
                A003.setOnClickListener(this.A0B);
                chipGroup.addView(A003);
            }
            if (this.A06) {
                C45902Bo.A0D(this.A07, this.A01);
            }
        }
    }

    public void setRecipientsContentDescription(int i2) {
        Resources resources = getResources();
        Object[] A1b = C13680ns.A1b();
        AnonymousClass000.A1K(A1b, i2);
        this.A07.setContentDescription(resources.getQuantityString(R.plurals.plurals0129, i2, A1b));
    }

    public void setRecipientsListener(AnonymousClass1w8 r5) {
        this.A02 = r5;
        ChipGroup chipGroup = this.A09;
        if (chipGroup != null) {
            for (int i2 = 0; i2 < chipGroup.getChildCount(); i2++) {
                chipGroup.getChildAt(i2).setOnClickListener(this.A0B);
            }
        }
    }

    public void setRecipientsText(String str) {
        this.A0A.A0I((List) null, str);
    }
}
