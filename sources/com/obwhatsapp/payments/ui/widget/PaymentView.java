package com.obwhatsapp.payments.ui.widget;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass04h;
import X.AnonymousClass04o;
import X.AnonymousClass05K;
import X.AnonymousClass14W;
import X.AnonymousClass18G;
import X.AnonymousClass1BQ;
import X.AnonymousClass1CX;
import X.AnonymousClass1M7;
import X.AnonymousClass1M9;
import X.AnonymousClass1MF;
import X.AnonymousClass1MG;
import X.AnonymousClass1MJ;
import X.AnonymousClass1Vt;
import X.AnonymousClass1ZW;
import X.AnonymousClass29I;
import X.AnonymousClass2Ao;
import X.AnonymousClass2FZ;
import X.AnonymousClass2JI;
import X.AnonymousClass2SR;
import X.AnonymousClass3H7;
import X.AnonymousClass3K2;
import X.AnonymousClass5QT;
import X.AnonymousClass5y4;
import X.AnonymousClass62M;
import X.AnonymousClass62Q;
import X.AnonymousClass668;
import X.AnonymousClass669;
import X.AnonymousClass685;
import X.AnonymousClass69U;
import X.C000900k;
import X.C004601z;
import X.C005402i;
import X.C006602z;
import X.C011405n;
import X.C04240Lt;
import X.C109375Rw;
import X.C110105dW;
import X.C110115dX;
import X.C111255fc;
import X.C111315fl;
import X.C111325fm;
import X.C111875hY;
import X.C112765jH;
import X.C115525pt;
import X.C116285r8;
import X.C116825s0;
import X.C116835s1;
import X.C116855s3;
import X.C117325so;
import X.C117685tO;
import X.C117715tR;
import X.C118825vJ;
import X.C119595yj;
import X.C119645yo;
import X.C1205762e;
import X.C1213064z;
import X.C1220768e;
import X.C1223969k;
import X.C1224069l;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14710pd;
import X.C14870pt;
import X.C15810rt;
import X.C15830rv;
import X.C15860rz;
import X.C16030sJ;
import X.C16050sL;
import X.C16150sX;
import X.C16300so;
import X.C16320sq;
import X.C16490t9;
import X.C17020u3;
import X.C17160ud;
import X.C17200uh;
import X.C17250um;
import X.C18090w8;
import X.C18300wT;
import X.C19980zJ;
import X.C206711d;
import X.C209512f;
import X.C209712h;
import X.C212613k;
import X.C221116r;
import X.C23061Ai;
import X.C25841Li;
import X.C25861Lk;
import X.C26151Mn;
import X.C26161Mo;
import X.C28401Vy;
import X.C28411Vz;
import X.C32241fu;
import X.C34151jm;
import X.C35361lo;
import X.C35491m1;
import X.C41791wf;
import X.C47562Jm;
import X.C47572Jn;
import X.C47812Kr;
import X.C52642eC;
import X.C52652eD;
import X.C811947f;
import X.C86084Rd;
import X.C95204mG;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.facebook.redex.IDxCListenerShape24S0000000_3_I1;
import com.facebook.redex.IDxCListenerShape95S0200000_3_I1;
import com.facebook.redex.IDxEListenerShape202S0100000_3_I1;
import com.facebook.redex.IDxLListenerShape146S0100000_3_I1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.components.FloatingActionButton;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.gifsearch.GifSearchContainer;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.numberkeyboard.NumberEntryKeyboard;
import com.obwhatsapp.text.IDxWAdapterShape104S0100000_3_I1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PaymentView extends KeyboardPopupLayout implements View.OnClickListener, AnonymousClass5QT, AnonymousClass2FZ {
    public int A00;
    public int A01;
    public AutoTransition A02;
    public View A03;
    public Animation A04;
    public FrameLayout A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public LinearLayout A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public LinearLayout A0C;
    public LinearLayout A0D;
    public LinearLayout A0E;
    public TextSwitcher A0F;
    public TextSwitcher A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public Group A0M;
    public ShimmerFrameLayout A0N;
    public ShimmerFrameLayout A0O;
    public TabLayout A0P;
    public C16300so A0Q;
    public C14870pt A0R;
    public KeyboardPopupLayout A0S;
    public FloatingActionButton A0T;
    public ThumbnailButton A0U;
    public ThumbnailButton A0V;
    public C17160ud A0W;
    public AnonymousClass2Ao A0X;
    public C17200uh A0Y;
    public AnonymousClass01V A0Z;
    public C15860rz A0a;
    public AnonymousClass013 A0b;
    public AnonymousClass1MJ A0c;
    public C15810rt A0d;
    public C221116r A0e;
    public C28411Vz A0f;
    public C206711d A0g;
    public C17250um A0h;
    public AnonymousClass1BQ A0i;
    public C14710pd A0j;
    public C16490t9 A0k;
    public C26151Mn A0l;
    public C25841Li A0m;
    public C25861Lk A0n;
    public C15830rv A0o;
    public C18300wT A0p;
    public C18090w8 A0q;
    public C209512f A0r;
    public C1220768e A0s;
    public PaymentAmountInputField A0t;
    public C1205762e A0u;
    public C1223969k A0v;
    public AnonymousClass69U A0w;
    public C116835s1 A0x;
    public AnonymousClass685 A0y;
    public C118825vJ A0z;
    public C17020u3 A10;
    public C212613k A11;
    public C34151jm A12;
    public AnonymousClass18G A13;
    public AnonymousClass1MF A14;
    public AnonymousClass14W A15;
    public AnonymousClass1CX A16;
    public AnonymousClass1M9 A17;
    public C26161Mo A18;
    public AnonymousClass1MG A19;
    public C86084Rd A1A;
    public AnonymousClass1M7 A1B;
    public C41791wf A1C;
    public C16320sq A1D;
    public Integer A1E;
    public String A1F;
    public String A1G;
    public String A1H;
    public String A1I;
    public String A1J;
    public String A1K;
    public List A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public final Runnable A1P;

    public PaymentView(Context context) {
        super(context);
        A01();
        this.A1P = new C1213064z(this);
        A08();
    }

    public PaymentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A1P = new C1213064z(this);
        A08();
    }

    public PaymentView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
        this.A1P = new C1213064z(this);
        A08();
    }

    public PaymentView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A01();
        this.A1P = new C1213064z(this);
        A08();
    }

    public PaymentView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A01();
    }

    public static /* synthetic */ void A00(C011405n r34, PaymentView paymentView) {
        int i2;
        LinearLayout linearLayout;
        int A012 = C110115dX.A01(r34, C115525pt.A00);
        PaymentView paymentView2 = paymentView;
        if (A012 == 1) {
            C1220768e r0 = paymentView2.A0s;
            if (r0 != null) {
                C117715tR r1 = (C117715tR) r0.Aat();
                AnonymousClass69U r9 = r1.A03;
                paymentView2.A0w = r9;
                paymentView2.A0x = r1.A08;
                C1223969k r7 = r1.A02;
                paymentView2.A0v = r7;
                paymentView2.A0o = r1.A00;
                C117685tO r02 = r1.A04;
                C116285r8 r6 = r02.A03;
                paymentView2.A0f = r6.A00;
                C116825s0 r5 = r1.A06;
                paymentView2.A1L = r5.A01;
                paymentView2.A1H = r1.A0C;
                paymentView2.A12 = r1.A0A;
                paymentView2.A1E = r1.A0B;
                String str = r02.A07;
                String str2 = str;
                paymentView2.A1I = str;
                paymentView2.A1K = r1.A0D;
                paymentView2.A1N = r1.A0E;
                paymentView2.A0u = r1.A01;
                AnonymousClass685 r4 = r02.A04;
                paymentView2.A0y = r4;
                paymentView2.A1O = r1.A07.A00;
                r9.A9l().setRequestedOrientation(1);
                paymentView2.A0A.setOnClickListener(paymentView2);
                AnonymousClass1CX r13 = paymentView2.A16;
                C16320sq r8 = paymentView2.A1D;
                paymentView2.A1C = new C41791wf(paymentView2.A0a, paymentView2.A11, paymentView2.A15, r13, r8);
                paymentView2.A17.A00();
                if (paymentView2.A17.A00) {
                    C26161Mo r10 = (C26161Mo) new C006602z((AnonymousClass04o) new C95204mG(paymentView2.A1B), paymentView2.A0w.A9l().AGy()).A01(C26161Mo.class);
                    paymentView2.A18 = r10;
                    paymentView2.A1C.A01 = r10;
                    paymentView2.A1A = new C86084Rd(paymentView2.A0R, r10);
                    paymentView2.A0i.A01();
                }
                C14710pd r26 = paymentView2.A0j;
                C25841Li r29 = paymentView2.A0m;
                C23061Ai r33 = paymentView2.A05;
                C16300so r342 = paymentView2.A0Q;
                C16490t9 r27 = paymentView2.A0k;
                C17250um r20 = paymentView2.A0h;
                C206711d r18 = paymentView2.A0g;
                AnonymousClass01V r19 = paymentView2.A0Z;
                AnonymousClass013 r21 = paymentView2.A0b;
                C25861Lk r17 = paymentView2.A0n;
                AnonymousClass1BQ r15 = paymentView2.A0i;
                C15860rz r14 = paymentView2.A0a;
                C17020u3 r132 = paymentView2.A10;
                C26151Mn r12 = paymentView2.A0l;
                C26161Mo r11 = paymentView2.A18;
                paymentView2.A0z = new C118825vJ(paymentView2.A0w.A9l(), r342, paymentView2.A0S, r19, r14, r21, paymentView2.A0c, r18, r20, r15, r26, r27, r12, r29, r17, r132, r11, r33);
                boolean z2 = paymentView2.A1N;
                boolean z3 = paymentView2.A1O;
                if (z2) {
                    paymentView2.A07.setOnClickListener(paymentView2);
                    paymentView2.A0C.setOnClickListener(paymentView2);
                    paymentView2.A09.setOnClickListener(paymentView2);
                    i2 = 0;
                    if (!z3) {
                        linearLayout = paymentView2.A0C;
                    }
                    linearLayout = paymentView2.A09;
                } else {
                    i2 = 8;
                    paymentView2.A0C.setVisibility(8);
                    linearLayout = paymentView2.A09;
                }
                linearLayout.setVisibility(i2);
                C1205762e r92 = paymentView2.A0u;
                if (r92 != null) {
                    ViewStub viewStub = (ViewStub) paymentView2.findViewById(R.id.payment_note_entry_stub);
                    if (viewStub != null) {
                        C811947f.A00(viewStub, r92);
                    } else {
                        r92.AZf(paymentView2.findViewById(R.id.payment_note_entry_inflated));
                    }
                    MentionableEntry mentionableEntry = r92.A09;
                    ViewGroup A072 = C13700nu.A07(paymentView2, R.id.mention_attach);
                    C15830rv r102 = paymentView2.A0o;
                    if (C16030sJ.A0L(r102) && !paymentView2.A0d.A0H(r102)) {
                        mentionableEntry.A0D(A072, C16050sL.A03(paymentView2.A0o), false, true, true);
                    }
                    String str3 = paymentView2.A1H;
                    if (str3 != null) {
                        mentionableEntry.setMentionableText(str3, paymentView2.A1L);
                    }
                    C110105dW.A0r(mentionableEntry, paymentView2, 139);
                    C34151jm r103 = paymentView2.A12;
                    if (r103 != null) {
                        r92.A00(r103, paymentView2.A1E);
                    }
                    r92.A00 = new C119645yo(mentionableEntry, paymentView2);
                    r92.A0A.A00 = C110115dX.A06(paymentView2, 138);
                }
                View findViewById = paymentView2.findViewById(R.id.gift_icon);
                if (findViewById != null) {
                    findViewById.setOnClickListener(paymentView2);
                }
                paymentView2.A01 = 6;
                paymentView2.A05.setVisibility(8);
                Context context = paymentView2.getContext();
                TabLayout tabLayout = paymentView2.A0P;
                int i3 = r1.A09.A00;
                if (i3 != 0) {
                    tabLayout.A06();
                    C47812Kr A032 = tabLayout.A03();
                    A032.A02(R.string.str10c8);
                    tabLayout.A0E(A032);
                    C47812Kr A033 = tabLayout.A03();
                    A033.A02(R.string.str10a1);
                    tabLayout.A0E(A033);
                    tabLayout.A0D(paymentView2);
                    C005402i x2 = ((C000900k) C19980zJ.A00(context)).x();
                    if (i3 == 1) {
                        paymentView2.A0S.removeView(tabLayout);
                        if (Build.VERSION.SDK_INT >= 21) {
                            tabLayout.setElevation(0.0f);
                        }
                        if (x2 != null) {
                            x2.A0Q(false);
                            x2.A0O(true);
                            x2.A0N(true);
                            x2.A0H(tabLayout, new AnonymousClass05K(-1, -1));
                        }
                    } else if (x2 != null) {
                        x2.A08(0.0f);
                    }
                    tabLayout.setVisibility(0);
                    C47812Kr A042 = tabLayout.A04(paymentView2.A00);
                    AnonymousClass00B.A06(A042);
                    A042.A01();
                }
                if (paymentView2.A0w.AJO()) {
                    ArrayList A0u2 = AnonymousClass000.A0u();
                    C1205762e r93 = paymentView2.A0u;
                    if (r93 != null) {
                        A0u2.add(r93.A09);
                    }
                    C118825vJ r104 = paymentView2.A0z;
                    C109375Rw r172 = r5.A00;
                    PaymentAmountInputField paymentAmountInputField = paymentView2.A0t;
                    Activity activity = r104.A00;
                    C23061Ai r152 = r104.A0H;
                    C16300so r142 = r104.A01;
                    AnonymousClass01V r133 = r104.A03;
                    AnonymousClass01V r153 = r133;
                    C15860rz r16 = r104.A04;
                    AnonymousClass3K2.A1Q(new C111315fl(activity, r142, r104.A02, r153, r16, r172, paymentAmountInputField, r152, A0u2), r104.A0I, 1);
                } else {
                    paymentView2.A0z.A00();
                    paymentView2.A0t.setFocusable(false);
                }
                paymentView2.A0t.setSelection(0);
                paymentView2.A0t.setLongClickable(false);
                PaymentAmountInputField paymentAmountInputField2 = paymentView2.A0t;
                paymentAmountInputField2.A0F = new AnonymousClass62M(r7, paymentView2);
                paymentAmountInputField2.setAutoScaleTextSize(r02.A09);
                PaymentAmountInputField paymentAmountInputField3 = paymentView2.A0t;
                boolean z4 = r02.A0B;
                paymentAmountInputField3.A0L = z4;
                paymentAmountInputField3.setAllowDecimal(r02.A08);
                paymentView2.A0t.A0G = r4;
                paymentView2.A0D(r02);
                paymentView2.A0t.A08 = paymentView2.A0E;
                paymentView2.setAmountInputData(r6);
                if (TextUtils.isEmpty(paymentView2.A1G)) {
                    if (!TextUtils.isEmpty(paymentView2.A1J)) {
                        paymentView2.A1G = paymentView2.A1J;
                    } else {
                        String str4 = r02.A05;
                        if (TextUtils.isEmpty(str4)) {
                            str4 = r02.A06;
                            if (TextUtils.isEmpty(str4)) {
                                paymentView2.A1G = "0";
                            }
                        }
                        paymentView2.A1G = str4;
                    }
                }
                if (!TextUtils.isEmpty(paymentView2.A1G)) {
                    String str5 = paymentView2.A1G;
                    if (!"0".equals(str5)) {
                        if (r02.A0A) {
                            if (z4) {
                                str5 = str5.replaceAll(PaymentAmountInputField.A00(paymentView2.A0b), "");
                            }
                            C28401Vy A0B2 = C110115dX.A0B(paymentView2.A0f, str5);
                            if (A0B2 != null) {
                                paymentView2.A1G = paymentView2.A0f.A9F(paymentView2.A0b, A0B2);
                            }
                        }
                        String A0f2 = C13680ns.A0f(paymentView2.A0t);
                        String str6 = paymentView2.A1G;
                        if (!A0f2.equals(str6)) {
                            paymentView2.A0t.setText(str6);
                        }
                    }
                }
                if (!paymentView2.A0w.AJO()) {
                    paymentView2.A0z.A00();
                    paymentView2.A0t.setOnClickListener(new C119595yj(paymentView2, TextUtils.isEmpty(str2)));
                    paymentView2.A0t.setHintTextColor(AnonymousClass00T.A00(paymentView2.getContext(), R.color.color0660));
                }
                paymentView2.A0t.setHint(paymentView2.A1G);
                if (r02.A06 != null || r02.A05 == null || !paymentView2.A0w.AJf()) {
                    View view = paymentView2.A03;
                    if (view == null || view.getId() == -1 || paymentView2.findViewById(paymentView2.A03.getId()) == null) {
                        paymentView2.A0t.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape146S0100000_3_I1(paymentView2, 2));
                    } else {
                        paymentView2.A0z.A00();
                        paymentView2.findViewById(paymentView2.A03.getId()).requestFocus();
                        View view2 = paymentView2.A03;
                        if (view2 instanceof WaEditText) {
                            ((WaEditText) view2).A04(true);
                        } else if (view2.onCheckIsTextEditor()) {
                            InputMethodManager A0Q2 = paymentView2.A0Z.A0Q();
                            AnonymousClass00B.A06(A0Q2);
                            A0Q2.showSoftInput(paymentView2.A03, 0);
                        }
                    }
                } else {
                    paymentView2.A0w.A9l().getWindow().setSoftInputMode(3);
                }
                if (!paymentView2.A0t.hasOnClickListeners()) {
                    C110105dW.A0r(paymentView2.A0t, paymentView2, 140);
                }
                paymentView2.setInitialTabConfiguration(r1);
                paymentView2.A06();
                if (!paymentView2.A0w.AJf()) {
                    C117325so r3 = r1.A05;
                    if (r3.A03) {
                        paymentView2.A0M.setVisibility(0);
                        C118825vJ r134 = paymentView2.A0z;
                        C209712h r173 = r3.A02;
                        ImageView imageView = paymentView2.A08;
                        FloatingActionButton floatingActionButton = paymentView2.A0T;
                        PaymentAmountInputField paymentAmountInputField4 = paymentView2.A0t;
                        TextView textView = paymentView2.A0J;
                        TextView textView2 = paymentView2.A0K;
                        TextView A0M2 = C13680ns.A0M(paymentView2, R.id.payments_send_payment_error_text);
                        C1205762e r143 = paymentView2.A0u;
                        C35361lo r82 = r3.A00;
                        Activity activity2 = r134.A00;
                        C23061Ai r62 = r134.A0H;
                        C16300so r52 = r134.A01;
                        AnonymousClass01V r42 = r134.A03;
                        C15860rz r32 = r134.A04;
                        FloatingActionButton floatingActionButton2 = floatingActionButton;
                        AnonymousClass01V r24 = r42;
                        C15860rz r25 = r32;
                        C16300so r212 = r52;
                        KeyboardPopupLayout keyboardPopupLayout = r134.A02;
                        TextView textView3 = textView;
                        TextView textView4 = textView2;
                        Activity activity3 = activity2;
                        ImageView imageView2 = imageView;
                        C111325fm r154 = new C111325fm(activity3, imageView2, textView3, textView4, A0M2, r212, keyboardPopupLayout, floatingActionButton2, r24, r25, r3.A01, r173, paymentAmountInputField4, r143, r02, r62);
                        if (r82 != null) {
                            r154.AYn(r82);
                        }
                        AnonymousClass3K2.A1Q(r154, r134.A0I, 2);
                    }
                }
            }
        } else if (A012 == 2) {
            C1205762e r03 = paymentView2.A0u;
            if (r03 != null && r03.A09.hasFocus()) {
                paymentView2.A0z.A00();
            }
        } else if (A012 == 3) {
            C118825vJ r110 = paymentView2.A0z;
            C109375Rw A002 = NumberEntryKeyboard.A00(paymentView2.A0b);
            HashMap hashMap = r110.A0I;
            if (hashMap.containsKey(1)) {
                AnonymousClass2JI r111 = (AnonymousClass2JI) hashMap.get(1);
                if (r111 instanceof C111315fl) {
                    ((C111315fl) r111).A01.setCustomKey(A002);
                }
            }
            if (paymentView2.A0t != null && !C13690nt.A0m(paymentView2.A0b).equals(C13690nt.A0m(paymentView2.A0t.A0D))) {
                PaymentAmountInputField paymentAmountInputField5 = paymentView2.A0t;
                paymentAmountInputField5.A0D = paymentView2.A0b;
                paymentAmountInputField5.setText((CharSequence) null);
            }
        } else if (A012 == 4) {
            HashMap hashMap2 = paymentView2.A0z.A0I;
            Iterator A0j2 = C13690nt.A0j(hashMap2);
            while (A0j2.hasNext()) {
                PopupWindow popupWindow = (PopupWindow) hashMap2.get(AnonymousClass000.A0z(A0j2).getKey());
                if (popupWindow != null && popupWindow.isShowing()) {
                    popupWindow.dismiss();
                }
                A0j2.remove();
            }
            paymentView2.A1C.A03();
            if (!paymentView2.A0w.AJf() && paymentView2.A0j.A0C(811)) {
                ((C112765jH) paymentView2.A0x.A00).A0a.A01();
            }
        }
    }

    private void setInitialTabConfiguration(C117715tR r3) {
        int i2 = 1;
        if (r3.A09.A01 == 0) {
            i2 = 0;
        }
        this.A00 = i2;
        C47812Kr A042 = this.A0P.A04(i2);
        if (A042 != null) {
            A042.A01();
        }
    }

    public void A01() {
        if (!this.A1M) {
            this.A1M = true;
            C52652eD r2 = (C52652eD) ((C52642eC) generatedComponent());
            C16150sX r1 = r2.A07;
            this.A05 = (C23061Ai) r1.AC0.get();
            this.A0j = C16150sX.A0k(r1);
            this.A0m = (C25841Li) r1.AB1.get();
            this.A0R = C16150sX.A02(r1);
            this.A0Q = (C16300so) r1.A5p.get();
            this.A1D = (C16320sq) r1.ARB.get();
            this.A0k = (C16490t9) r1.AQz.get();
            this.A0h = (C17250um) r1.A7e.get();
            this.A0g = (C206711d) r1.AKp.get();
            this.A0Y = C16150sX.A0R(r1);
            this.A0W = (C17160ud) r1.A4t.get();
            this.A11 = (C212613k) r1.AK2.get();
            this.A0d = (C15810rt) r1.A43.get();
            this.A0Z = C16150sX.A0T(r1);
            this.A15 = (AnonymousClass14W) r1.ANc.get();
            this.A0n = (C25861Lk) r1.AJq.get();
            this.A16 = (AnonymousClass1CX) r1.ANk.get();
            this.A0p = C110115dX.A0O(r1);
            this.A0b = C16150sX.A0Z(r1);
            this.A0i = (AnonymousClass1BQ) r1.A7f.get();
            this.A0a = (C15860rz) r1.AQh.get();
            this.A0q = C16150sX.A10(r1);
            this.A14 = (AnonymousClass1MF) r1.ANa.get();
            this.A0e = (C221116r) r1.AHt.get();
            this.A13 = (AnonymousClass18G) r1.ANS.get();
            this.A19 = (AnonymousClass1MG) r1.ANo.get();
            this.A10 = (C17020u3) r1.AMG.get();
            this.A0r = (C209512f) r1.AHB.get();
            this.A0l = r2.A05.A0L();
            this.A1B = (AnonymousClass1M7) r1.ANp.get();
            this.A17 = (AnonymousClass1M9) r1.ANV.get();
            this.A0c = (AnonymousClass1MJ) r1.A69.get();
        }
    }

    public final SpannableStringBuilder A02(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String string = this.A0w.A9l().getString(i2);
        Object[] A1Z = C13690nt.A1Z();
        C13690nt.A1L(string, str, A1Z);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.format("%s %s", A1Z));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.A0w.A9l().getResources().getColor(R.color.color0506));
        int length = string.length();
        int i3 = length + 1;
        spannableStringBuilder.setSpan(foregroundColorSpan, 0, i3, 0);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.A0w.A9l().getResources().getColor(R.color.color0507)), i3, length + str.length() + 1, 0);
        return spannableStringBuilder;
    }

    public void A03() {
        C116855s3 r5;
        String str;
        Editable text = this.A0t.getText();
        AnonymousClass00B.A06(text);
        String obj = text.toString();
        int i2 = 1;
        if (this.A00 != 1) {
            this.A0q.A06.A01();
            i2 = 0;
        }
        AnonymousClass1Vt A0M2 = this.A0e.A0M(this.A1I, this.A1K);
        if (A0M2 == null || A0M2.A02 != 18) {
            BigDecimal A9K = this.A0f.A9K(this.A0b, obj);
            AnonymousClass62Q r8 = (AnonymousClass62Q) this.A0y;
            if (A9K == null || r8.A05.A00.compareTo(A9K) > 0) {
                r5 = new C116855s3(2, C13680ns.A0d(r8.A01, r8.A03.A9H(r8.A02, r8.A05, 0), C13680ns.A1b(), 0, R.string.str10d0));
            } else {
                r5 = new C116855s3(0, "");
            }
            if (r5.A00 == 0) {
                r5 = r8.A00("", A9K, i2, false);
            }
            int i3 = r5.A00;
            if ((i3 == 2 || i3 == 3) && (str = r5.A01) != null) {
                this.A0t.A09();
                this.A0v.AQb(str);
                A0E(str);
                this.A0z.A01(1);
                return;
            }
            this.A1G = obj;
            C1205762e r0 = this.A0u;
            if (r0 != null) {
                this.A1H = r0.A09.getStringText();
                this.A1L = this.A0u.A09.getMentions();
            }
            C1223969k r1 = this.A0v;
            C28401Vy A0C2 = C110115dX.A0C(this.A0f, A9K);
            if (i2 != 0) {
                r1.AWE(A0C2, obj);
            } else {
                r1.AWz(A0C2);
            }
        } else {
            this.A0v.AX2();
        }
    }

    public void A04() {
        if (this.A0M.getVisibility() == 0) {
            this.A08.setTag(R.id.selected_expressive_background_theme, (Object) null);
            this.A08.setImageResource(R.drawable.payment_default_background);
            C1220768e r0 = this.A0s;
            if (r0 != null) {
                A0D(((C117715tR) r0.Aat()).A04);
            }
        }
    }

    public void A05() {
        C1205762e r2 = this.A0u;
        if (r2 != null) {
            r2.A06.setVisibility(8);
            r2.A0B = null;
            r2.A0D = null;
            r2.A09.setVisibility(0);
            r2.A05.setVisibility(0);
        }
    }

    public void A06() {
        int i2;
        if (this.A00 == 1) {
            this.A0F.setVisibility(0);
            this.A0F.setText(this.A0w.A9l().getString(R.string.str10d3));
            if (this.A1N) {
                this.A0G.setText(this.A1F);
                A0F(this.A1O);
            }
            if (this.A0w.AJf()) {
                this.A0H.setText(this.A0w.AEa());
                this.A0H.setVisibility(0);
                A0A();
            } else {
                A09();
            }
            C1205762e r1 = this.A0u;
            if (r1 != null) {
                r1.A0A.A00(2);
            }
            this.A0t.A03 = 1;
            i2 = 6;
        } else {
            boolean z2 = this.A1N;
            TextSwitcher textSwitcher = this.A0F;
            if (z2) {
                textSwitcher.setVisibility(8);
                this.A0G.setText(A02(this.A1F, R.string.str10d3));
                A09();
                this.A0H.setVisibility(8);
                A0F(this.A1O);
            } else {
                textSwitcher.setVisibility(0);
                this.A0F.setText(this.A0w.A9l().getString(R.string.str10d3));
                this.A0H.setVisibility(8);
                A07();
            }
            C1205762e r0 = this.A0u;
            if (r0 != null) {
                r0.A0A.A00(1);
            }
            this.A0t.A03 = 0;
            i2 = this.A01;
        }
        FrameLayout frameLayout = this.A05;
        if (i2 != 0) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            C13680ns.A0z(C110105dW.A06(this.A0p), "payment_incentive_tooltip_viewed", true);
        }
        if (this.A0u != null) {
            boolean AJf = this.A0w.AJf();
            C1205762e r02 = this.A0u;
            if (AJf) {
                r02.A02.setVisibility(8);
                return;
            }
            r02.A02.setVisibility(0);
            if (this.A0x.A01) {
                MentionableEntry mentionableEntry = this.A0u.A09;
                mentionableEntry.addTextChangedListener(new IDxWAdapterShape104S0100000_3_I1(this, 3));
                this.A1C.A03();
                C118825vJ r5 = this.A0z;
                C1205762e r2 = this.A0u;
                ImageButton imageButton = r2.A04;
                GifSearchContainer gifSearchContainer = r2.A08;
                EmojiSearchContainer emojiSearchContainer = r2.A07;
                C1224069l r11 = this.A0x.A00;
                AnonymousClass00B.A06(r11);
                C41791wf r8 = this.A1C;
                AnonymousClass3H7 r9 = new AnonymousClass3H7(r8);
                ((C112765jH) r11).A0a = r9;
                C26151Mn r7 = r5.A0C;
                Activity activity = r5.A00;
                r7.A00 = activity;
                AnonymousClass1MJ r22 = r5.A06;
                r7.A05 = r22.A00();
                r7.A07 = r22.A01(r5.A0G, r8);
                r7.A02 = r5.A02;
                r7.A01 = imageButton;
                r7.A03 = mentionableEntry;
                C47572Jn A002 = r7.A00();
                IDxCListenerShape95S0200000_3_I1 iDxCListenerShape95S0200000_3_I1 = new IDxCListenerShape95S0200000_3_I1(mentionableEntry, r5, 1);
                C25841Li r20 = r5.A0D;
                C23061Ai r19 = r5.A0H;
                C16490t9 r17 = r5.A0B;
                AnonymousClass01V r18 = r5.A03;
                C25861Lk r16 = r5.A0E;
                C15860rz r15 = r5.A04;
                C17250um r14 = r5.A08;
                C206711d r13 = r5.A07;
                C23061Ai r30 = r19;
                C47562Jm r162 = new C47562Jm(activity, r18, r15, r5.A05, r13, r14, emojiSearchContainer, r17, A002, r20, gifSearchContainer, r16, r5.A0F, r30);
                r9.A02 = r11;
                r9.A00 = A002;
                A002.A03 = r9;
                A002.A0C(iDxCListenerShape95S0200000_3_I1);
                A002.A0E = new AnonymousClass669(r162, r5);
                A002.A0J(this);
                r162.A00 = new IDxEListenerShape202S0100000_3_I1(iDxCListenerShape95S0200000_3_I1, 1);
                r9.A04 = this;
                r8.A0A.A02(r8.A09);
                AnonymousClass3K2.A1Q(A002, r5.A0I, 3);
                return;
            }
            C118825vJ r82 = this.A0z;
            C1205762e r12 = this.A0u;
            MentionableEntry mentionableEntry2 = r12.A09;
            ImageButton imageButton2 = r12.A04;
            EmojiSearchContainer emojiSearchContainer2 = r12.A07;
            Activity activity2 = r82.A00;
            C14710pd r152 = r82.A0A;
            C23061Ai r142 = r82.A0H;
            C16300so r112 = r82.A01;
            C17250um r10 = r82.A08;
            C206711d r92 = r82.A07;
            AnonymousClass01V r72 = r82.A03;
            AnonymousClass013 r6 = r82.A05;
            AnonymousClass1BQ r23 = r82.A09;
            C15860rz r110 = r82.A04;
            C17020u3 r52 = r82.A0F;
            C206711d r232 = r92;
            C17250um r24 = r10;
            C15860rz r21 = r110;
            AnonymousClass013 r222 = r6;
            MentionableEntry mentionableEntry3 = mentionableEntry2;
            AnonymousClass01V r202 = r72;
            C16300so r172 = r112;
            KeyboardPopupLayout keyboardPopupLayout = r82.A02;
            Activity activity3 = activity2;
            C111875hY r143 = new C111875hY(activity3, imageButton2, r172, keyboardPopupLayout, mentionableEntry3, r202, r21, r222, r232, r24, emojiSearchContainer2, r23, r152, r82, r52, r142);
            IDxCListenerShape95S0200000_3_I1 iDxCListenerShape95S0200000_3_I12 = new IDxCListenerShape95S0200000_3_I1(mentionableEntry2, r82, 0);
            AnonymousClass29I r102 = new AnonymousClass29I(activity2, r6, r143, r92, r10, emojiSearchContainer2, r52);
            r102.A00 = new IDxEListenerShape202S0100000_3_I1(iDxCListenerShape95S0200000_3_I12, 0);
            r143.A0C(iDxCListenerShape95S0200000_3_I12);
            r143.A0E = new AnonymousClass668(r102, r82);
            AnonymousClass3K2.A1Q(r143, r82.A0I, 0);
        }
    }

    public void A07() {
        if (this.A1N) {
            this.A0G.setText(A02(this.A1F, R.string.str10d3));
            A0F(this.A1O);
            this.A0F.setVisibility(8);
            return;
        }
        this.A0F.setVisibility(0);
        this.A0C.setVisibility(8);
        this.A09.setVisibility(8);
        if (this.A0w.AJf()) {
            this.A0H.setVisibility(0);
            A0A();
            return;
        }
        A09();
    }

    public final void A08() {
        View inflate = C13680ns.A0G(this).inflate(R.layout.layout0487, this, true);
        this.A0J = C13680ns.A0L(inflate, R.id.payment_currency_symbol_prefix);
        this.A0K = C13680ns.A0L(inflate, R.id.payment_currency_symbol_suffix);
        this.A0G = (TextSwitcher) C004601z.A0E(inflate, R.id.contact_name);
        ImageView A0J2 = C13680ns.A0J(inflate, R.id.expand_contact_details_button);
        this.A06 = A0J2;
        A0J2.setColorFilter(getResources().getColor(R.color.color009f));
        this.A0H = C13680ns.A0L(inflate, R.id.contact_aux_info);
        this.A0V = (ThumbnailButton) C004601z.A0E(inflate, R.id.contact_photo);
        this.A0U = (ThumbnailButton) C004601z.A0E(inflate, R.id.bank_logo);
        ImageView A0J3 = C13680ns.A0J(inflate, R.id.expand_details_button);
        this.A07 = A0J3;
        A0J3.setColorFilter(getResources().getColor(R.color.color009f));
        this.A0F = (TextSwitcher) C004601z.A0E(inflate, R.id.payment_contact_label);
        this.A0C = C110115dX.A05(inflate, R.id.payment_method_container);
        this.A0B = C110115dX.A05(inflate, R.id.payment_contact_container_shimmer);
        this.A0D = C110115dX.A05(inflate, R.id.payment_method_container_shimmer);
        this.A0N = (ShimmerFrameLayout) C004601z.A0E(this.A0B, R.id.payment_method_name_shimmer);
        this.A0O = (ShimmerFrameLayout) C004601z.A0E(this.A0D, R.id.payment_method_name_shimmer);
        this.A09 = C110115dX.A05(inflate, R.id.add_payment_method_container);
        this.A05 = (FrameLayout) C004601z.A0E(inflate, R.id.gift_details);
        this.A0t = (PaymentAmountInputField) C004601z.A0E(inflate, R.id.send_payment_amount);
        this.A0L = C13680ns.A0L(inflate, R.id.bank_account_name);
        this.A0I = C13680ns.A0L(inflate, R.id.payments_send_payment_error_text);
        this.A0S = (KeyboardPopupLayout) C004601z.A0E(inflate, R.id.send_payment_keyboard_popup_layout);
        C004601z.A0E(inflate, R.id.send_payment_amount_error_text_container).setOnClickListener(this);
        this.A0E = C110115dX.A05(inflate, R.id.send_payment_amount_container);
        this.A0A = C110115dX.A05(inflate, R.id.payment_contact_container);
        this.A0P = (TabLayout) C004601z.A0E(inflate, R.id.payment_tabs);
        int A002 = AnonymousClass00T.A00(getContext(), R.color.color070f);
        AnonymousClass2SR.A08(this.A07, A002);
        this.A0X = this.A0Y.A04(getContext(), "payment-view");
        AnonymousClass2SR.A08(C13680ns.A0J(inflate, R.id.add_payment_method_logo), A002);
        this.A0S.setKeyboardPopupBackgroundColor(AnonymousClass00T.A00(getContext(), R.color.color01f5));
        if (Build.VERSION.SDK_INT >= 19) {
            AutoTransition autoTransition = new AutoTransition();
            this.A02 = autoTransition;
            autoTransition.setDuration(100);
        }
        this.A0M = (Group) C004601z.A0E(inflate, R.id.expressive_payment_widget_group);
        this.A08 = C13680ns.A0J(inflate, R.id.expressive_theme_background);
        FloatingActionButton floatingActionButton = (FloatingActionButton) C004601z.A0E(inflate, R.id.expression_theme_selection);
        this.A0T = floatingActionButton;
        C110115dX.A0s(floatingActionButton, this, 10);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.A04 = alphaAnimation;
        alphaAnimation.setDuration(500);
        this.A04.setAnimationListener(new C111255fc(this));
        Interpolator A003 = C04240Lt.A00(0.16f, 1.0f, 0.3f, 1.0f);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), 17432577);
        loadAnimation.setInterpolator(A003);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), 17432576);
        loadAnimation2.setInterpolator(A003);
        loadAnimation2.setDuration((long) getResources().getInteger(17694720));
        this.A0G.setOutAnimation(loadAnimation);
        this.A0G.setInAnimation(loadAnimation2);
    }

    public final void A09() {
        this.A0G.setPadding(0, getResources().getDimensionPixelSize(R.dimen.dimen05ef), 0, 0);
    }

    public final void A0A() {
        this.A0G.setPadding(getResources().getDimensionPixelSize(R.dimen.dimen05df), getResources().getDimensionPixelSize(R.dimen.dimen05ee), 0, 0);
        this.A0H.setPadding(getResources().getDimensionPixelSize(R.dimen.dimen05df), getResources().getDimensionPixelSize(R.dimen.dimen05ee), 0, 0);
    }

    public void A0B(Bundle bundle) {
        this.A1J = bundle.getString("extra_payment_preset_amount");
    }

    public void A0C(Bundle bundle) {
        String A0f2 = C13680ns.A0f(this.A0t);
        this.A1J = A0f2;
        this.A1G = A0f2;
        bundle.putString("extra_payment_preset_amount", A0f2);
    }

    public final void A0D(C117685tO r10) {
        AnonymousClass04h.A08(this.A0t, r10.A00);
        Pair pair = r10.A01;
        AnonymousClass04h.A08(this.A0K, AnonymousClass000.A0D(pair.first));
        TextView textView = this.A0K;
        int[] iArr = (int[]) pair.second;
        textView.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
        Pair pair2 = r10.A02;
        AnonymousClass04h.A08(this.A0J, AnonymousClass000.A0D(pair2.first));
        TextView textView2 = this.A0J;
        int[] iArr2 = (int[]) pair2.second;
        textView2.setPadding(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
    }

    public void A0E(CharSequence charSequence) {
        if (this.A0I != null) {
            boolean z2 = !TextUtils.isEmpty(charSequence);
            this.A0I.setVisibility(C13680ns.A02(z2 ? 1 : 0));
            this.A0I.setText(charSequence);
            this.A04.cancel();
            this.A04.reset();
            Handler handler = getHandler();
            if (handler != null) {
                Runnable runnable = this.A1P;
                handler.removeCallbacks(runnable);
                if (z2) {
                    this.A0I.announceForAccessibility(charSequence);
                    getHandler().postDelayed(runnable, 4000);
                }
            }
        }
    }

    public void A0F(boolean z2) {
        this.A1O = z2;
        LinearLayout linearLayout = this.A0C;
        if (z2) {
            linearLayout.setVisibility(8);
            this.A09.setVisibility(0);
            return;
        }
        linearLayout.setVisibility(0);
        this.A09.setVisibility(8);
    }

    public boolean A0G() {
        HashMap hashMap = this.A0z.A0I;
        Iterator A0j2 = C13690nt.A0j(hashMap);
        while (A0j2.hasNext()) {
            Map.Entry A0z2 = AnonymousClass000.A0z(A0j2);
            PopupWindow popupWindow = (PopupWindow) hashMap.get(A0z2.getKey());
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
                int A0D2 = AnonymousClass000.A0D(A0z2.getKey());
                if (A0D2 != 0) {
                    if (A0D2 != 1) {
                        if (!(A0D2 == 2 || A0D2 == 3)) {
                            return false;
                        }
                    }
                    return true;
                }
                this.A0z.A01(1);
                return true;
            }
        }
        return false;
    }

    public void AXt(C34151jm r5, Integer num, int i2) {
        ((C112765jH) this.A0x.A00).A0a.A04(true);
        C1205762e r1 = this.A0u;
        if (r1 == null) {
            return;
        }
        if (r1.A0B != null || AnonymousClass1ZW.A0E(r1.A09.getStringText())) {
            C1205762e r0 = this.A0u;
            if (r0 != null) {
                r0.A00(r5, num);
                return;
            }
            return;
        }
        C32241fu A002 = C32241fu.A00(getContext());
        A002.A02(R.string.str0fb8);
        A002.A01(R.string.str0fb6);
        A002.setPositiveButton(R.string.str0fb7, new AnonymousClass5y4(this, r5, num));
        A002.setNegativeButton(R.string.str0fb5, new IDxCListenerShape24S0000000_3_I1(5));
        C13690nt.A1G(A002);
    }

    public void AYi(C47812Kr r1) {
    }

    public void AYj(C47812Kr r4) {
        boolean z2 = true;
        if (this.A00 != r4.A00) {
            this.A0z.A01(1);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            TransitionManager.beginDelayedTransition(C13690nt.A0K(this, R.id.send_payment_details), this.A02);
        }
        int i2 = r4.A00;
        this.A00 = i2;
        C1223969k r0 = this.A0v;
        if (i2 != 1) {
            z2 = false;
        }
        r0.AYk(z2);
        A06();
    }

    public List getMentionedJids() {
        C1205762e r0 = this.A0u;
        return r0 != null ? r0.A09.getMentions() : AnonymousClass000.A0u();
    }

    public String getPaymentAmountString() {
        Editable text = this.A0t.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public C35361lo getPaymentBackground() {
        if (this.A0M.getVisibility() != 0) {
            return null;
        }
        return (C35361lo) this.A08.getTag(R.id.selected_expressive_background_theme);
    }

    public String getPaymentNote() {
        C1205762e r0 = this.A0u;
        return r0 != null ? r0.A09.getStringText() : "";
    }

    public View.OnClickListener getSendPaymentClickListener() {
        return C110115dX.A06(this, 138);
    }

    public C34151jm getStickerIfSelected() {
        C1205762e r0 = this.A0u;
        if (r0 != null) {
            return r0.A0B;
        }
        return null;
    }

    public Integer getStickerSendOrigin() {
        C1205762e r0 = this.A0u;
        if (r0 != null) {
            return r0.A0D;
        }
        return null;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.expand_details_button || view.getId() == R.id.payment_method_container) {
            this.A0v.AUV();
        } else if (view.getId() == R.id.payment_contact_container) {
            if (this.A00 == 1 || this.A0C.getVisibility() == 0 || !this.A1N) {
                this.A0v.AUU();
                return;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                TransitionManager.beginDelayedTransition(C13690nt.A0K(this, R.id.send_payment_details), this.A02);
            }
            A07();
        } else if (view.getId() == R.id.send_payment_amount || view.getId() == R.id.send_payment_note) {
            this.A0z.A00();
        } else if (view.getId() == R.id.send_payment_amount_error_text_container) {
            this.A0t.callOnClick();
        } else if (view.getId() == R.id.add_payment_method_container) {
            this.A0v.AM9();
        } else if (view.getId() == R.id.gift_icon) {
            this.A0v.ARu();
            View findViewById = findViewById(R.id.gift_tool_tip);
            this.A0p.A01().getBoolean("payment_incentive_tooltip_viewed", false);
            findViewById.setVisibility(8);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0X.A00();
    }

    public void setAmountInputData(C116285r8 r6) {
        TextView textView;
        C28411Vz r1 = r6.A00;
        this.A0f = r1;
        this.A0t.A0E = r1;
        CharSequence charSequence = "";
        if (((C35491m1) r1).A00 == 0) {
            int AGN = r1.AGN(this.A0b);
            TextView textView2 = this.A0J;
            if (AGN == 2) {
                textView2.setText(charSequence);
                textView = this.A0K;
                charSequence = this.A0f.ABH(this.A0b);
            } else {
                textView2.setText(this.A0f.ABH(this.A0b));
                textView = this.A0K;
            }
        } else {
            this.A0J.setText(charSequence);
            textView = this.A0K;
            charSequence = this.A0f.A9E(getContext(), this.A0f.ABH(this.A0b));
        }
        textView.setText(charSequence);
    }

    public void setBankLogo(Bitmap bitmap) {
        if (bitmap != null) {
            this.A0U.setImageBitmap(bitmap);
        } else {
            this.A0U.setImageResource(R.drawable.bank_logo_placeholder);
        }
    }

    public void setPaymentAmount(String str) {
        this.A1G = str;
    }

    public void setPaymentContactContainerVisibility(int i2) {
        this.A0A.setVisibility(i2);
    }

    public void setPaymentMethodText(String str) {
        this.A0L.setText(A02(str, R.string.str10d5));
    }
}
