package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.C13680ns;
import X.C16740tZ;
import X.C30011bb;
import X.C30531cW;
import X.C39261sB;
import X.C42551xz;
import X.C52662eE;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

public class DynamicButtonsRowContentLayout extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;

    public DynamicButtonsRowContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public DynamicButtonsRowContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DynamicButtonsRowContentLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.layout0245, this);
        TextEmojiLabel A0R = C13680ns.A0R(this, R.id.top_message);
        this.A03 = A0R;
        TextEmojiLabel A0R2 = C13680ns.A0R(this, R.id.bottom_message);
        this.A02 = A0R2;
        setupContentView(A0R);
        setupContentView(A0R2);
    }

    private void setupContentView(TextEmojiLabel textEmojiLabel) {
        C30531cW.A02(textEmojiLabel);
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
    }

    public void A00(C30011bb r16) {
        int i2;
        C30011bb r9 = r16;
        C16740tZ fMessage = r9.getFMessage();
        C39261sB r0 = fMessage.A0E().A00;
        if (r0 != null) {
            String str = r0.A00;
            String str2 = r0.A01;
            if (!TextUtils.isEmpty(str)) {
                Context context = getContext();
                Object[] objArr = new Object[1];
                Context context2 = getContext();
                byte b2 = fMessage.A10;
                if (b2 != 0) {
                    i2 = R.string.str0035;
                    if (b2 != 1) {
                        i2 = R.string.str0038;
                        if (b2 != 3) {
                            i2 = R.string.str0036;
                            if (b2 != 5) {
                                i2 = R.string.str0033;
                                if (b2 != 9) {
                                    i2 = 0;
                                }
                            }
                        }
                    }
                } else {
                    i2 = R.string.str0037;
                }
                StringBuilder A0r = AnonymousClass000.A0r(C13680ns.A0d(context, context2.getString(i2), objArr, 0, R.string.str0034));
                String A0I = fMessage.A0I();
                if (!TextUtils.isEmpty(A0I) && b2 == 0) {
                    A0r.append(A0I);
                }
                r9.setContentDescription(AnonymousClass000.A0h(C42551xz.A00(fMessage), A0r));
                if (!TextUtils.isEmpty(str2)) {
                    TextEmojiLabel textEmojiLabel = this.A03;
                    r9.setMessageText(str, textEmojiLabel, fMessage);
                    textEmojiLabel.setVisibility(0);
                    TextEmojiLabel textEmojiLabel2 = this.A02;
                    r9.A19(textEmojiLabel2, fMessage, str2, true, false);
                    textEmojiLabel2.setTextSize(r9.A0g.A02(r9.getResources(), -1));
                    textEmojiLabel2.setTextColor(r9.getSecondaryTextColor());
                    return;
                }
                TextEmojiLabel textEmojiLabel3 = this.A02;
                r9.A19(textEmojiLabel3, fMessage, str, true, true);
                this.A03.setVisibility(8);
                C13680ns.A0v(r9.getContext(), textEmojiLabel3, R.color.color01b3);
            }
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
