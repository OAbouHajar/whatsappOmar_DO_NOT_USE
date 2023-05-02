package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxIListenerShape29S0000000_2_I1;
import com.facebook.redex.IDxTRendererShape197S0100000_1_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.components.TextAndDateLayout;
import com.obwhatsapp.conversation.conversationrow.ConversationRowImage$RowImageView;
import java.util.Collections;
import java.util.List;

/* renamed from: X.30w  reason: invalid class name and case insensitive filesystem */
public class C603030w extends AnonymousClass2Q7 {
    public AnonymousClass1KX A00;
    public boolean A01;
    public boolean A02;
    public final View A03;
    public final ViewGroup A04;
    public final ViewGroup A05;
    public final FrameLayout A06;
    public final LinearLayout A07;
    public final TextView A08 = C13680ns.A0L(this, R.id.control_btn);
    public final TextView A09;
    public final TextView A0A;
    public final TextEmojiLabel A0B;
    public final TextEmojiLabel A0C;
    public final TextEmojiLabel A0D;
    public final TextEmojiLabel A0E;
    public final TextAndDateLayout A0F;
    public final ConversationRowImage$RowImageView A0G = ((ConversationRowImage$RowImageView) C004601z.A0E(this, R.id.image));
    public final AnonymousClass25V A0H = new IDxTRendererShape197S0100000_1_I1(this, 4);
    public final C33741j5 A0I;
    public final C33741j5 A0J;

    public C603030w(Context context, AnonymousClass1YG r9, C38891ra r10) {
        super(context, r9, r10);
        A0g();
        C33741j5 A002 = C33741j5.A00(this, R.id.progress_bar);
        this.A0J = A002;
        A002.A05(new IDxIListenerShape29S0000000_2_I1(5));
        this.A0I = C33741j5.A00(this, R.id.cancel_download);
        this.A03 = C004601z.A0E(this, R.id.control_frame);
        TextEmojiLabel A0Q = C13680ns.A0Q(this, R.id.caption);
        this.A0B = A0Q;
        this.A0F = (TextAndDateLayout) C004601z.A0E(this, R.id.text_and_date);
        TextEmojiLabel A0Q2 = C13680ns.A0Q(this, R.id.view_product_btn);
        TextEmojiLabel A0Q3 = C13680ns.A0Q(this, R.id.product_title);
        this.A0E = A0Q3;
        this.A0C = C13680ns.A0Q(this, R.id.product_body);
        this.A0D = C13680ns.A0Q(this, R.id.product_footer);
        FrameLayout A082 = C13700nu.A08(this, R.id.product_content_date_layout);
        this.A06 = A082;
        this.A05 = C13700nu.A07(this, R.id.date_wrapper);
        this.A0A = C13680ns.A0L(this, R.id.date);
        this.A04 = C13700nu.A07(A082, R.id.date_wrapper);
        this.A09 = C13680ns.A0L(A082, R.id.date);
        LinearLayout linearLayout = (LinearLayout) C004601z.A0E(this, R.id.product_message_view);
        this.A07 = linearLayout;
        C30531cW.A02(A0Q);
        A0Q.setAutoLinkMask(0);
        A0Q.setLinksClickable(false);
        A0Q.setFocusable(false);
        A0Q.setLongClickable(false);
        A0Q2.A0I((List) null, getContext().getString(R.string.str1a17));
        A0Q3.setAutoLinkMask(0);
        A0Q3.setLinksClickable(false);
        A0Q3.setFocusable(false);
        A0Q3.setLongClickable(false);
        C30011bb.A0K(linearLayout, this);
        C13680ns.A17(linearLayout, this, 21);
        A0e(true);
    }

    private void A0e(boolean z2) {
        C34331k5 A0A2;
        int A002;
        C38891ra r2 = (C38891ra) ((C16730tY) this.A0O);
        C16750ta A003 = C16730tY.A00(r2);
        if (z2) {
            this.A08.setTag(Collections.singletonList(r2));
        }
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A0G;
        conversationRowImage$RowImageView.setImageBitmap((Bitmap) null);
        conversationRowImage$RowImageView.setImageData(new C16750ta(A003));
        conversationRowImage$RowImageView.setFullWidth(false);
        conversationRowImage$RowImageView.setPaddingOnTopOnly(true);
        C16730tY fMessage = getFMessage();
        if (C38621r6.A10(fMessage)) {
            View view = this.A03;
            view.setVisibility(0);
            C33741j5 r8 = this.A0J;
            C33741j5 r6 = this.A0I;
            TextView textView = this.A08;
            TextView textView2 = textView;
            C33741j5 r17 = r8;
            AnonymousClass2Q7.A0c(view, textView2, r17, r6, true, !z2, false);
            C13680ns.A0t(getContext(), conversationRowImage$RowImageView, R.string.str0b3a);
            if (r2.A11.A02) {
                conversationRowImage$RowImageView.setOnClickListener(this.A0B);
            } else {
                conversationRowImage$RowImageView.setOnClickListener((View.OnClickListener) null);
            }
            C34331k5 r62 = this.A08;
            textView.setOnClickListener(r62);
            r8.A04(r62);
        } else {
            boolean A11 = C38621r6.A11(fMessage);
            View view2 = this.A03;
            if (A11) {
                view2.setVisibility(8);
                C33741j5 r82 = this.A0J;
                C33741j5 r63 = this.A0I;
                TextView textView3 = this.A08;
                AnonymousClass2Q7.A0c(view2, textView3, r82, r63, false, false, false);
                C13680ns.A0t(getContext(), conversationRowImage$RowImageView, R.string.str1a17);
                A0A2 = this.A0B;
                textView3.setOnClickListener(A0A2);
            } else {
                view2.setVisibility(0);
                C33741j5 r83 = this.A0J;
                C33741j5 r64 = this.A0I;
                TextView textView4 = this.A08;
                TextView textView5 = textView4;
                C33741j5 r172 = r83;
                AnonymousClass2Q7.A0c(view2, textView5, r172, r64, false, !z2, false);
                conversationRowImage$RowImageView.setContentDescription((CharSequence) null);
                if (!C38621r6.A0z(getFMessage())) {
                    textView4.setText(R.string.str146a);
                    textView4.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload, 0, 0, 0);
                    textView4.setOnClickListener(this.A0A);
                    A0A2 = this.A0B;
                } else {
                    A0A2 = C30011bb.A0A(textView4, this, r2);
                }
            }
            conversationRowImage$RowImageView.setOnClickListener(A0A2);
        }
        A0x();
        C30011bb.A0K(conversationRowImage$RowImageView, this);
        SpannableString A012 = this.A00.A01(r2);
        String str = r2.A09;
        String str2 = r2.A02;
        String str3 = r2.A05;
        Resources A0D2 = C13680ns.A0D(this);
        TextEmojiLabel textEmojiLabel = this.A0E;
        textEmojiLabel.setTextSize(getTextFontSize());
        TextEmojiLabel textEmojiLabel2 = this.A0B;
        textEmojiLabel2.setTextSize(this.A0g.A02(getResources(), -1));
        int secondaryTextColor = getSecondaryTextColor();
        textEmojiLabel2.setVisibility(8);
        TextAndDateLayout textAndDateLayout = this.A0F;
        textAndDateLayout.setMaxTextLineCount(2);
        textAndDateLayout.invalidate();
        if (!TextUtils.isEmpty(str)) {
            setMessageText(str, textEmojiLabel, r2);
            textEmojiLabel.setVisibility(0);
        } else {
            textEmojiLabel.setVisibility(8);
        }
        View A0E2 = C004601z.A0E(this, R.id.product_content_layout);
        boolean z3 = r2.A11.A02;
        if (z3 || C42941yx.A01(r2)) {
            A0E2.setVisibility(8);
            this.A05.setVisibility(0);
        } else if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            boolean isEmpty = TextUtils.isEmpty(str2);
            TextEmojiLabel textEmojiLabel3 = this.A0C;
            if (!isEmpty) {
                setMessageText(str2, textEmojiLabel3, r2);
                textEmojiLabel3.setVisibility(0);
            } else {
                textEmojiLabel3.setVisibility(8);
            }
            boolean isEmpty2 = TextUtils.isEmpty(str3);
            TextEmojiLabel textEmojiLabel4 = this.A0D;
            if (!isEmpty2) {
                A19(textEmojiLabel4, r2, str3, true, false);
                textEmojiLabel4.setVisibility(0);
            } else {
                textEmojiLabel4.setVisibility(8);
            }
            A0E2.setVisibility(0);
            this.A05.setVisibility(8);
        } else {
            A0E2.setVisibility(8);
        }
        A1C(r2);
        if (!TextUtils.isEmpty(A012)) {
            TextEmojiLabel textEmojiLabel5 = textEmojiLabel2;
            textEmojiLabel5.A0F(AnonymousClass2TP.A01, A012, getHighlightTerms(), 300, false);
            textEmojiLabel2.setVisibility(0);
        } else if (!TextUtils.isEmpty(str)) {
            textEmojiLabel.setVisibility(8);
            textAndDateLayout.setMaxTextLineCount(1);
            textEmojiLabel2.setVisibility(0);
            textEmojiLabel2.A0H(str, (List) null, 150, false);
            textEmojiLabel2.setTextSize(getTextFontSize());
            C13690nt.A0w(A0D2, textEmojiLabel2, R.color.color0109);
        }
        conversationRowImage$RowImageView.A07 = false;
        conversationRowImage$RowImageView.setOutgoing(z3);
        int i2 = A003.A08;
        if (i2 == 0 || (A002 = A003.A06) == 0) {
            i2 = 100;
            A002 = C25791Ld.A00(r2, 100);
            if (A002 <= 0) {
                i2 = AnonymousClass1UP.A01(getContext());
                A002 = (i2 * 9) >> 4;
            }
        }
        conversationRowImage$RowImageView.A04(i2, A002);
        conversationRowImage$RowImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (!z2 && this.A02) {
            this.A1d.A0D(r2);
        }
        this.A02 = false;
        this.A1d.A07(conversationRowImage$RowImageView, r2, this.A0H);
    }

    public void A0g() {
        if (!this.A01) {
            this.A01 = true;
            C52652eD A072 = C30011bb.A07(this);
            C16150sX A062 = C30011bb.A06(A072, this);
            C49132Rg A052 = C30011bb.A05(A062, A072, this, C30011bb.A0C(A062, this));
            C30011bb.A0S(A062, this, C30011bb.A0B(A052, A062, this));
            C30011bb.A0Q(A062, this);
            C30011bb.A0O(A052, A062, C30011bb.A08(A062, this), this);
            C30011bb.A0M(A052, A062, A072, this, A062.A4p);
            C30011bb.A0U(A062, this);
            this.A00 = (AnonymousClass1KX) A062.A3h.get();
        }
    }

    public void A0t() {
        A1J(false);
        A0e(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0.exists() == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0z() {
        /*
            r6 = this;
            X.0sj r0 = r6.A01
            if (r0 == 0) goto L_0x000b
            boolean r0 = X.C14570pP.A1W(r6)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            X.0tZ r5 = r6.A0O
            X.0tY r5 = (X.C16730tY) r5
            X.1ra r5 = (X.C38891ra) r5
            X.0ta r4 = X.C16730tY.A00(r5)
            X.1Vw r0 = r5.A11
            boolean r3 = r0.A02
            if (r3 != 0) goto L_0x0020
            boolean r0 = r4.A0P
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            java.io.File r0 = r4.A0F
            r2 = 0
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.exists()
            r1 = 1
            if (r0 != 0) goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            java.lang.String r0 = "viewmessage/ from_me:"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            X.C30011bb.A0V(r4, r5, r0, r3)
            if (r1 != 0) goto L_0x0046
            boolean r0 = r6.A1P()
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "viewmessage/ no file to download from receiver side"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0046:
            com.obwhatsapp.conversation.conversationrow.ConversationRowImage$RowImageView r0 = r6.A0G
            r6.A16(r0, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C603030w.A0z():void");
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A0e(A1a);
        }
    }

    public void dispatchSetPressed(boolean z2) {
        super.dispatchSetPressed(z2);
        ConversationRowImage$RowImageView conversationRowImage$RowImageView = this.A0G;
        boolean isPressed = isPressed();
        if (conversationRowImage$RowImageView.A0A != isPressed) {
            conversationRowImage$RowImageView.A0A = isPressed;
            conversationRowImage$RowImageView.A02();
            conversationRowImage$RowImageView.invalidate();
        }
    }

    public int getBroadcastDrawableId() {
        return C30011bb.A00(this);
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01bf;
    }

    public TextView getDateView() {
        C38891ra r1 = (C38891ra) ((C16730tY) this.A0O);
        return ((!TextUtils.isEmpty(r1.A02) || !TextUtils.isEmpty(r1.A05)) && !r1.A11.A02 && !C42941yx.A01(r1)) ? this.A09 : this.A0A;
    }

    public ViewGroup getDateWrapper() {
        C38891ra r1 = (C38891ra) ((C16730tY) this.A0O);
        return ((!TextUtils.isEmpty(r1.A02) || !TextUtils.isEmpty(r1.A05)) && !r1.A11.A02 && !C42941yx.A01(r1)) ? this.A04 : this.A05;
    }

    public C38891ra getFMessage() {
        return (C38891ra) ((C16730tY) this.A0O);
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01bf;
    }

    public int getMainChildMaxWidth() {
        int i2 = 72;
        if (this.A0S) {
            i2 = 100;
        }
        return C31171dd.A01(getContext(), i2);
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01c0;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C38891ra);
        super.setFMessage(r2);
    }
}
