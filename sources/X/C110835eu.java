package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.text.ReadMoreTextView;
import java.util.List;

/* renamed from: X.5eu  reason: invalid class name and case insensitive filesystem */
public class C110835eu extends AnonymousClass01X {
    public List A00 = AnonymousClass000.A0u();
    public final /* synthetic */ C112875jr A01;

    public C110835eu(C112875jr r2) {
        this.A01 = r2;
    }

    public int A0C() {
        return this.A00.size();
    }

    public void ANf(C005602k r16, int i2) {
        View view;
        Context context;
        int i3;
        C228919r AEp;
        ImageView imageView;
        CharSequence charSequence;
        C005602k r2 = r16;
        int i4 = i2;
        if (!(r2 instanceof C111035fE)) {
            if (r2 instanceof C111045fF) {
                C111045fF r22 = (C111045fF) r2;
                C116245r4 r4 = (C116245r4) this.A00.get(i4);
                if (r22 instanceof C113465m6) {
                    return;
                }
                if (r22 instanceof C113605mK) {
                    C113605mK r23 = (C113605mK) r22;
                    C113885mm r42 = (C113885mm) r4;
                    TextView textView = r23.A01;
                    textView.setText(r42.A01);
                    if (TextUtils.isEmpty(r42.A01)) {
                        textView.setVisibility(8);
                    }
                    r23.A02.setVisibility(8);
                    r23.A00.setOnClickListener(r42.A00);
                    return;
                } else if (r22 instanceof C113565mG) {
                    C113565mG r24 = (C113565mG) r22;
                    C113975mv r43 = (C113975mv) r4;
                    r24.A01.setText(r43.A04);
                    TextView textView2 = r24.A00;
                    textView2.setText(r43.A03);
                    Drawable drawable = r43.A00;
                    if (drawable != null) {
                        textView2.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    View.OnClickListener onClickListener = r43.A01;
                    if (onClickListener != null) {
                        r24.A0H.setOnClickListener(onClickListener);
                    }
                    View.OnLongClickListener onLongClickListener = r43.A02;
                    if (onLongClickListener != null) {
                        r24.A0H.setOnLongClickListener(onLongClickListener);
                        return;
                    }
                    return;
                } else if (r22 instanceof C113525mC) {
                    C38641rB r3 = (C38641rB) ((C113815mf) r4).A00;
                    C61783Ah r1 = ((C113525mC) r22).A00;
                    r1.A03(r3, false);
                    if (C38621r6.A10(r3)) {
                        r1.A01();
                        return;
                    } else if (C38621r6.A11(r3)) {
                        r1.A02();
                        return;
                    } else {
                        r1.A00();
                        return;
                    }
                } else if (r22 instanceof C113655mP) {
                    C113655mP r25 = (C113655mP) r22;
                    C114015mz r44 = (C114015mz) r4;
                    WaTextView waTextView = r25.A06;
                    Drawable background = waTextView.getBackground();
                    Context context2 = r25.A00;
                    background.setColorFilter(context2.getResources().getColor(r44.A01), PorterDuff.Mode.SRC_IN);
                    waTextView.setText(r44.A03);
                    waTextView.setContentDescription(r44.A04);
                    float f2 = r44.A00;
                    if (f2 != 0.0f) {
                        waTextView.setTextSize(f2);
                    }
                    boolean isEmpty = TextUtils.isEmpty(r44.A05);
                    TextView textView3 = r25.A03;
                    if (!isEmpty) {
                        Typeface A03 = AnonymousClass1UP.A03(context2);
                        textView3.setText(r44.A05);
                        C13690nt.A0w(context2.getResources(), textView3, r44.A01);
                        if (!TextUtils.isEmpty(r44.A07)) {
                            r25.A04.setText(r44.A07);
                        }
                    } else {
                        Typeface create = Typeface.create(Typeface.SANS_SERIF, 0);
                        textView3.setText(r44.A06);
                        C13680ns.A0v(context2, textView3, R.color.color0710);
                        r25.A04.setText("");
                    }
                    boolean isEmpty2 = TextUtils.isEmpty(r44.A0B);
                    TextEmojiLabel textEmojiLabel = r25.A05;
                    if (!isEmpty2) {
                        C30531cW.A02(textEmojiLabel);
                        C30531cW.A03(textEmojiLabel, r25.A07);
                        charSequence = AnonymousClass2JN.A07((TextAppearanceSpan) null, r44.A0B, r44.A0C, context2.getResources().getColor(R.color.color04f8));
                    } else {
                        charSequence = r44.A0A;
                    }
                    textEmojiLabel.setText(charSequence);
                    boolean isEmpty3 = TextUtils.isEmpty(r44.A09);
                    TextView textView4 = r25.A02;
                    if (!isEmpty3) {
                        textView4.setText(r44.A09);
                        textView4.setVisibility(0);
                    } else {
                        textView4.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(r44.A08)) {
                        TextView textView5 = r25.A01;
                        textView5.setText(r44.A08);
                        textView5.setVisibility(0);
                        textView5.setOnClickListener(r44.A02);
                        return;
                    }
                    r25.A01.setVisibility(8);
                    return;
                } else if (r22 instanceof C113635mN) {
                    C113635mN r26 = (C113635mN) r22;
                    C113875ml r45 = (C113875ml) r4;
                    C110345dv r0 = new C110345dv(r26.A03, r45);
                    ListView listView = r26.A01;
                    listView.setAdapter(r0);
                    if (!r45.A01 || r26.A02) {
                        r26.A00.setVisibility(8);
                        listView.setVisibility(0);
                        return;
                    }
                    View view2 = r26.A00;
                    view2.setVisibility(0);
                    listView.setVisibility(8);
                    C110105dW.A0r(view2, r26, 116);
                    return;
                } else if (r22 instanceof C113515mB) {
                    ((C113515mB) r22).A00.setOnClickListener(((C113835mh) r4).A00);
                    return;
                } else if (r22 instanceof C113555mF) {
                    C113555mF r27 = (C113555mF) r22;
                    r27.A01.setOnClickListener(((C113845mi) r4).A00);
                    ImageView imageView2 = r27.A00;
                    AnonymousClass2SR.A07(imageView2.getContext(), imageView2, R.color.color070f);
                    return;
                } else if (r22 instanceof C113665mQ) {
                    C113665mQ r28 = (C113665mQ) r22;
                    C114005my r46 = (C114005my) r4;
                    if (!TextUtils.isEmpty(r46.A09)) {
                        r28.A06.setText(r46.A09);
                        r28.A05.setText(r46.A08);
                        if (!TextUtils.isEmpty(r46.A0A)) {
                            r28.A07.setText(r46.A0A);
                        }
                    } else {
                        r28.A04.setVisibility(8);
                    }
                    if (r46.A05 != null) {
                        AnonymousClass2Ao A04 = r28.A0C.A04(r28.A00, "payment-transaction-payee-payer-detail");
                        C16010sH r02 = r46.A05;
                        imageView = r28.A02;
                        A04.A06(imageView, r02);
                    } else {
                        C17160ud r12 = r28.A0B;
                        imageView = r28.A02;
                        r12.A05(imageView, r46.A00);
                    }
                    View.OnClickListener onClickListener2 = r46.A04;
                    if (onClickListener2 != null) {
                        r28.A04.setOnClickListener(onClickListener2);
                        r28.A09.setVisibility(0);
                    } else {
                        r28.A09.setVisibility(4);
                    }
                    imageView.setVisibility(r46.A01);
                    r28.A03.setVisibility(r46.A02);
                    if (!TextUtils.isEmpty(r46.A07) && !TextUtils.isEmpty(r46.A06)) {
                        String[] strArr = new String[1];
                        C110105dW.A1E(r28.A0A, r46.A06, strArr, 0);
                        C30531cW.A04(r28.A08, r28.A0D, r28.A0E.A05(r46.A07, new Runnable[]{new AnonymousClass63L()}, new String[]{"incentive-blurb-cashback-help"}, strArr));
                    } else if (TextUtils.isEmpty(r46.A07) || r46.A03 == null) {
                        r28.A01.setVisibility(8);
                        return;
                    } else {
                        Spanned fromHtml = Html.fromHtml(r46.A07);
                        String obj = fromHtml.toString();
                        SpannableString spannableString = new SpannableString(obj);
                        for (Object obj2 : fromHtml.getSpans(0, obj.length(), Object.class)) {
                            spannableString.setSpan(new C110265dm(r28, r46), fromHtml.getSpanStart(obj2), fromHtml.getSpanEnd(obj2), 33);
                        }
                        TextEmojiLabel textEmojiLabel2 = r28.A08;
                        textEmojiLabel2.setMovementMethod(LinkMovementMethod.getInstance());
                        textEmojiLabel2.setText(spannableString);
                    }
                    r28.A01.setVisibility(0);
                    return;
                } else if (r22 instanceof C113505mA) {
                    C113505mA r29 = (C113505mA) r22;
                    C113865mk r47 = (C113865mk) r4;
                    if (r47 != null) {
                        TextView textView6 = r29.A00;
                        textView6.setText(r47.A01);
                        textView6.setVisibility(r47.A00);
                        return;
                    }
                    return;
                } else if (r22 instanceof C113495m9) {
                    C113495m9 r210 = (C113495m9) r22;
                    C113825mg r48 = (C113825mg) r4;
                    if (r48 != null) {
                        r210.A00.setText(r48.A00);
                        return;
                    }
                    return;
                } else if (r22 instanceof C113595mJ) {
                    C113595mJ r211 = (C113595mJ) r22;
                    C113895mn r49 = (C113895mn) r4;
                    r211.A01.setOnClickListener(r49.A00);
                    ImageView imageView3 = r211.A00;
                    AnonymousClass2SR.A07(imageView3.getContext(), imageView3, R.color.color070f);
                    boolean z2 = r49.A01;
                    TextView textView7 = r211.A02;
                    int i5 = R.string.str1d95;
                    if (z2) {
                        i5 = R.string.str17ce;
                    }
                    textView7.setText(i5);
                    return;
                } else if (r22 instanceof C113625mM) {
                    C113625mM r212 = (C113625mM) r22;
                    C113925mq r410 = (C113925mq) r4;
                    C117415sx r03 = r410.A02;
                    if (r03 != null) {
                        C228019i r6 = r212.A04;
                        View view3 = r212.A00;
                        AnonymousClass2SE r11 = r410.A01;
                        AnonymousClass1Vt r9 = r03.A01;
                        C16740tZ r122 = r03.A02;
                        Button button = r212.A02;
                        Button button2 = r212.A03;
                        Button button3 = r212.A01;
                        AnonymousClass1yN r10 = r410.A00;
                        view3.setVisibility(8);
                        if (r9.A02 == 110) {
                            View A0E = C004601z.A0E(view3, R.id.request_decline_button);
                            View A0E2 = C004601z.A0E(view3, R.id.request_pay_button);
                            A0E.setVisibility(8);
                            A0E2.setVisibility(8);
                            view3.setVisibility(0);
                            button2.setVisibility(0);
                            C28391Vx A02 = r6.A0B.A02(r9.A0G);
                            if (A02 != null && (AEp = A02.AEp(r9.A0I)) != null) {
                                button2.setOnClickListener(new ViewOnClickCListenerShape2S0300000_I0(AEp, view3.getContext(), r122, 6));
                                return;
                            }
                            return;
                        } else if (r9.A0B()) {
                            r6.A04(view3, button, r9, r11, true);
                            return;
                        } else if (r9.A02 == 102) {
                            r6.A02(view3, button3, r9);
                            return;
                        } else {
                            r6.A03(view3, button, r9, r10, r11, r122, "payment_transaction_details", true);
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (r22 instanceof C113585mI) {
                    C113585mI r213 = (C113585mI) r22;
                    C113915mp r411 = (C113915mp) r4;
                    if (r411 != null) {
                        r213.A02.setText(r411.A01);
                        boolean z3 = r411.A02;
                        ImageView imageView4 = r213.A01;
                        if (z3) {
                            imageView4.setImageResource(R.drawable.vec_ic_action_info_filled);
                            imageView4.setRotation(180.0f);
                            C018808t.A00(AnonymousClass00T.A03(imageView4.getContext(), R.color.color079a), imageView4);
                            view = r213.A00;
                            context = view.getContext();
                            i3 = R.drawable.txn_details_rounded_error_blurb_bg;
                        } else {
                            imageView4.setImageResource(R.drawable.vec_ic_clock_filled);
                            imageView4.setRotation(0.0f);
                            C018808t.A00(AnonymousClass00T.A03(imageView4.getContext(), R.color.color079b), imageView4);
                            view = r213.A00;
                            context = view.getContext();
                            i3 = R.drawable.txn_details_rounded_blurb_bg;
                        }
                        view.setBackground(AnonymousClass00T.A04(context, i3));
                        view.setOnClickListener(r411.A00);
                        return;
                    }
                    return;
                } else if (r22 instanceof C113645mO) {
                    C113645mO r214 = (C113645mO) r22;
                    C113985mw r412 = (C113985mw) r4;
                    Button button4 = r214.A02;
                    button4.setOnClickListener(r412.A01);
                    ImageView imageView5 = r214.A03;
                    imageView5.setImageResource(r412.A00);
                    Context context3 = r214.A00;
                    imageView5.setColorFilter(context3.getResources().getColor(R.color.color088b), PorterDuff.Mode.SRC_IN);
                    r214.A05.setText(r412.A04);
                    TextView textView8 = r214.A04;
                    textView8.setText(r412.A02);
                    r214.A06.setText(r412.A03);
                    if (r412.A06) {
                        C13690nt.A0w(context3.getResources(), button4, R.color.color01d6);
                    }
                    if (r412.A07 && r412.A02 == null) {
                        textView8.setVisibility(8);
                    }
                    if (r412.A05) {
                        imageView5.setVisibility(0);
                    } else {
                        imageView5.setVisibility(8);
                    }
                    if (r412.A07) {
                        button4.setVisibility(8);
                        r214.A01.setVisibility(0);
                        return;
                    }
                    button4.setVisibility(0);
                    r214.A01.setVisibility(8);
                    return;
                } else if (r22 instanceof C113455m5) {
                    return;
                } else {
                    if (r22 instanceof C113615mL) {
                        C113615mL r215 = (C113615mL) r22;
                        C113955mt r413 = (C113955mt) r4;
                        TextView textView9 = r215.A02;
                        textView9.setText(r413.A02);
                        C13690nt.A0w(r215.A0H.getResources(), textView9, R.color.color05f5);
                        textView9.setAlpha(1.0f);
                        textView9.setContentDescription(r413.A01);
                        boolean z4 = r413.A03;
                        if (z4) {
                            AnonymousClass47D.A00(textView9);
                        } else {
                            textView9.setPaintFlags(textView9.getPaintFlags() & -17);
                        }
                        C14710pd r13 = r215.A03;
                        if (r13.A0C(605) || r13.A0C(629)) {
                            C35361lo r414 = r413.A00;
                            View view4 = r215.A00;
                            if (r414 != null) {
                                view4.setVisibility(0);
                                int i6 = r414.A0C;
                                if (z4) {
                                    textView9.setAlpha(0.54f);
                                }
                                ImageView imageView6 = r215.A01;
                                imageView6.setBackgroundColor(r414.A0A);
                                String str = r414.A01;
                                if (!TextUtils.isEmpty(str)) {
                                    imageView6.setContentDescription(str);
                                }
                                float f3 = ((float) r414.A0D) / ((float) r414.A09);
                                int i7 = imageView6.getLayoutParams().width;
                                int i8 = (int) (((float) i7) / f3);
                                imageView6.getLayoutParams().height = i8;
                                imageView6.requestLayout();
                                r215.A04.A01(imageView6, r414, i7, i8, true);
                                return;
                            }
                            view4.setVisibility(8);
                            return;
                        }
                        return;
                    } else if (r22 instanceof C113675mR) {
                        C113675mR r216 = (C113675mR) r22;
                        C16740tZ r62 = ((C113815mf) r4).A00;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AnonymousClass1ZW.A02(r62.A0I()));
                        r216.A04.A02(r216.A0H.getContext(), spannableStringBuilder, r62.A0q);
                        ReadMoreTextView readMoreTextView = r216.A05;
                        r216.A07(spannableStringBuilder, readMoreTextView, true);
                        r216.A02.A00(readMoreTextView, new AnonymousClass603(r216), spannableStringBuilder, r62.A11);
                        return;
                    } else if (r22 instanceof C113545mE) {
                        C113545mE r217 = (C113545mE) r22;
                        r217.A01.setOnClickListener(((C113855mj) r4).A00);
                        ImageView imageView7 = r217.A00;
                        AnonymousClass2SR.A07(imageView7.getContext(), imageView7, R.color.color070f);
                        return;
                    } else if (r22 instanceof C113535mD) {
                        C113535mD r218 = (C113535mD) r22;
                        C113685mS r415 = (C113685mS) r4;
                        r218.A01.setText(r415.A01);
                        String str2 = r415.A00;
                        if (str2 != null) {
                            TextView textView10 = r218.A00;
                            textView10.setText(str2);
                            textView10.setVisibility(0);
                            return;
                        }
                        return;
                    } else if (r22 instanceof C113485m8) {
                        ((C113485m8) r22).A00.setOnClickListener(((C113795md) r4).A00);
                        return;
                    } else if (r22 instanceof C113445m4) {
                        return;
                    } else {
                        if (r22 instanceof C113575mH) {
                            C113575mH r219 = (C113575mH) r22;
                            C113695mT r416 = (C113695mT) r4;
                            String str3 = r416.A00;
                            TextView textView11 = r219.A01;
                            if (str3 != null) {
                                textView11.setText(str3);
                                textView11.setVisibility(0);
                                r219.A00.setVisibility(8);
                            } else {
                                textView11.setVisibility(8);
                                r219.A00.setVisibility(0);
                            }
                            TextView textView12 = r219.A02;
                            textView12.setText(r416.A02);
                            if (r416.A01) {
                                AnonymousClass47D.A00(textView12);
                                return;
                            } else {
                                textView12.setPaintFlags(textView12.getPaintFlags() & -17);
                                return;
                            }
                        } else {
                            ((C113475m7) r22).A00.setOnClickListener(((C113775mb) r4).A00);
                            return;
                        }
                    }
                }
            } else if (!(r2 instanceof C113435m3)) {
                throw AnonymousClass000.A0a(AnonymousClass1Vo.A01("PaymentComponentListActivity", "unsupported holder"));
            }
        }
        ((C111035fE) r2).A07((C116245r4) this.A00.get(i4), i4);
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        return this.A01.A35(viewGroup, i2);
    }

    public int getItemViewType(int i2) {
        return ((C116245r4) this.A00.get(i2)).A00;
    }
}
