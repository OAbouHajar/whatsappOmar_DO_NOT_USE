package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass107;
import X.AnonymousClass108;
import X.AnonymousClass109;
import X.AnonymousClass174;
import X.AnonymousClass175;
import X.AnonymousClass17O;
import X.AnonymousClass17Y;
import X.AnonymousClass19Y;
import X.AnonymousClass1GO;
import X.AnonymousClass1KO;
import X.AnonymousClass1MA;
import X.AnonymousClass1VQ;
import X.AnonymousClass1Vt;
import X.AnonymousClass22U;
import X.AnonymousClass2SE;
import X.AnonymousClass2SR;
import X.AnonymousClass2T3;
import X.AnonymousClass5o4;
import X.AnonymousClass5xE;
import X.AnonymousClass5xG;
import X.AnonymousClass5xI;
import X.AnonymousClass5xL;
import X.AnonymousClass5xP;
import X.AnonymousClass60S;
import X.AnonymousClass60U;
import X.AnonymousClass61W;
import X.AnonymousClass662;
import X.AnonymousClass69B;
import X.AnonymousClass69D;
import X.C001000l;
import X.C001500q;
import X.C004601z;
import X.C006602z;
import X.C018508q;
import X.C110105dW;
import X.C110115dX;
import X.C110335du;
import X.C110695eg;
import X.C112895jy;
import X.C113295lo;
import X.C113305lp;
import X.C114095n7;
import X.C114105n8;
import X.C114225nN;
import X.C114615o3;
import X.C117105sS;
import X.C117745tU;
import X.C117755tV;
import X.C117765tW;
import X.C118365uZ;
import X.C118915vc;
import X.C119225wk;
import X.C119285wq;
import X.C119345ww;
import X.C119405xi;
import X.C119705yu;
import X.C1220668d;
import X.C1222969a;
import X.C1223669h;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14870pt;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16080sP;
import X.C16320sq;
import X.C16440t3;
import X.C16980tz;
import X.C17110uY;
import X.C17130ua;
import X.C18030w2;
import X.C18080w7;
import X.C18090w8;
import X.C18260wP;
import X.C18290wS;
import X.C18300wT;
import X.C18310wU;
import X.C18340wX;
import X.C19950zG;
import X.C218315p;
import X.C27991Tx;
import X.C28401Vy;
import X.C28411Vz;
import X.C30671cl;
import X.C32291fz;
import X.C35481m0;
import X.C39961tL;
import X.C41411vk;
import X.C42711yJ;
import X.C53322fW;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape196S0100000_3_I1;
import com.facebook.redex.IDxCListenerShape24S0000000_3_I1;
import com.facebook.redex.IDxFactoryShape56S0200000_3_I1;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;
import com.obwhatsapp.payments.ui.widget.TransactionsExpandableView;
import com.whatsapp.jid.UserJid;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class PaymentSettingsFragment extends Hilt_PaymentSettingsFragment implements View.OnClickListener, C1223669h, AnonymousClass69B, AnonymousClass2SE, AnonymousClass69D, C1220668d {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public FrameLayout A09;
    public FrameLayout A0A;
    public FrameLayout A0B;
    public LinearLayout A0C;
    public ListView A0D;
    public TextView A0E;
    public C14870pt A0F;
    public C16040sK A0G;
    public AnonymousClass1KO A0H;
    public C15900s5 A0I;
    public C17130ua A0J;
    public C18260wP A0K;
    public AnonymousClass19Y A0L;
    public C16000sG A0M;
    public C16080sP A0N;
    public AnonymousClass01V A0O;
    public C16440t3 A0P;
    public C16980tz A0Q;
    public C18030w2 A0R;
    public C18080w7 A0S;
    public C19950zG A0T;
    public AnonymousClass107 A0U;
    public AnonymousClass175 A0V;
    public AnonymousClass109 A0W;
    public AnonymousClass1VQ A0X;
    public C27991Tx A0Y;
    public C18340wX A0Z;
    public AnonymousClass17O A0a;
    public AnonymousClass108 A0b;
    public C18300wT A0c;
    public AnonymousClass17Y A0d;
    public C18310wU A0e;
    public AnonymousClass174 A0f;
    public C18090w8 A0g;
    public C18290wS A0h;
    public C118365uZ A0i;
    public AnonymousClass1MA A0j;
    public C119285wq A0k;
    public AnonymousClass5o4 A0l;
    public AnonymousClass1GO A0m;
    public C53322fW A0n;
    public AnonymousClass5xG A0o;
    public C118915vc A0p;
    public C110335du A0q;
    public AnonymousClass60S A0r;
    public C119345ww A0s;
    public PaymentIncentiveViewModel A0t;
    public C110695eg A0u;
    public C117745tU A0v;
    public C119225wk A0w;
    public C114225nN A0x;
    public TransactionsExpandableView A0y;
    public TransactionsExpandableView A0z;
    public C218315p A10;
    public C17110uY A11;
    public C16320sq A12;
    public String A13;
    public List A14 = AnonymousClass000.A0u();
    public List A15 = AnonymousClass000.A0u();
    public List A16 = AnonymousClass000.A0u();

    public static final String A07(Resources resources, AnonymousClass5xL r4) {
        int i2 = r4.A00;
        if (i2 != 0) {
            Object[] objArr = r4.A04;
            return (objArr == null || objArr.length <= 0) ? resources.getString(i2) : resources.getString(i2, objArr);
        }
        String str = r4.A03;
        return str == null ? "" : str;
    }

    public void A0w() {
        super.A0w();
        AnonymousClass1VQ r1 = this.A0X;
        if (r1 != null) {
            this.A0Y.A03(r1);
        }
    }

    public void A0x(int i2, int i3, Intent intent) {
        C119345ww r0;
        int intExtra;
        String quantityString;
        if (i2 != 1) {
            if (i2 != 48) {
                if (i2 != 150) {
                    if (i2 != 501) {
                        super.A0x(i2, i3, intent);
                        return;
                    }
                    View view = this.A0A;
                    if (intent != null && view != null) {
                        if (i3 == -1) {
                            UserJid nullable = UserJid.getNullable(intent.getStringExtra("extra_invitee_jid"));
                            if (nullable != null) {
                                quantityString = C13700nu.A0F(A03(), this.A0N.A0E(this.A0M.A0A(nullable)), new Object[1], 0, R.string.str105c);
                            } else {
                                return;
                            }
                        } else if (i3 == 501 && (intExtra = intent.getIntExtra("extra_inviter_count", 0)) > 0) {
                            Resources A032 = A03();
                            Object[] objArr = new Object[1];
                            AnonymousClass000.A1M(objArr, intExtra, 0);
                            quantityString = A032.getQuantityString(R.plurals.plurals0107, intExtra, objArr);
                        } else {
                            return;
                        }
                        C32291fz.A01(view, quantityString, -1).A03();
                    }
                } else if (i3 == -1) {
                    A1X((String) null);
                }
            } else if (i3 == -1) {
                A0D().finish();
            }
        } else if (i3 == -1 && (r0 = this.A0s) != null) {
            r0.A01();
        }
    }

    public void A0z(Menu menu, MenuInflater menuInflater) {
    }

    public boolean A10(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            C001000l A0D2 = A0D();
            if (A0D2 instanceof C112895jy) {
                A0D2.finish();
                ((C112895jy) A0D2).A36();
            }
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_debug) {
            return false;
        } else {
            String AET = this.A0h.A03().AET();
            if (TextUtils.isEmpty(AET)) {
                return false;
            }
            A0r(C13680ns.A09().setClassName(A0D(), AET));
            return true;
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0464);
    }

    public void A12() {
        super.A12();
        AnonymousClass60S r2 = this.A0r;
        if (r2 != null) {
            C114615o3 r1 = r2.A02;
            if (r1 != null) {
                r1.A06(true);
            }
            r2.A02 = null;
            C41411vk r12 = r2.A00;
            if (r12 != null) {
                r2.A09.A03(r12);
            }
        }
        AnonymousClass5o4 r13 = this.A0l;
        if (r13 != null) {
            r13.A06(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r3.A0V.A0C() == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A14() {
        /*
            r3 = this;
            super.A14()
            X.00l r1 = r3.A0D()
            boolean r0 = r1 instanceof X.C14550pN
            if (r0 == 0) goto L_0x0013
            X.0pN r1 = (X.C14550pN) r1
            r0 = 2131890274(0x7f121062, float:1.9415235E38)
            r1.Afq(r0)
        L_0x0013:
            X.60S r1 = r3.A0r
            r0 = 1
            r1.A00(r0)
            android.view.View r2 = r3.A03
            boolean r0 = r3 instanceof com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsFragment
            if (r0 == 0) goto L_0x0034
            X.0w8 r0 = r3.A0g
            X.0pd r1 = r0.A03
            r0 = 783(0x30f, float:1.097E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0034
            X.175 r0 = r3.A0V
            boolean r1 = r0.A0C()
            r0 = 1
            if (r1 != 0) goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            int r0 = X.C13680ns.A02(r0)
            r2.setVisibility(r0)
            X.1VQ r1 = r3.A0X
            if (r1 == 0) goto L_0x0045
            X.1Tx r0 = r3.A0Y
            r0.A02(r1)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.PaymentSettingsFragment.A14():void");
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        A0a(true);
    }

    public void A18(Bundle bundle, View view) {
        View view2 = view;
        this.A0C = (LinearLayout) view2.findViewById(R.id.nux_container);
        this.A04 = view2.findViewById(R.id.payment_nux_row_separator);
        Bundle bundle2 = this.A05;
        if (bundle2 != null) {
            this.A13 = bundle2.getString("referral_screen");
        }
        C42711yJ A0L2 = C110115dX.A0L(this.A0h);
        PaymentIncentiveViewModel A0R2 = (A0L2 == null || !C110115dX.A18(A0L2.A07)) ? null : C110105dW.A0R(this);
        this.A0t = A0R2;
        int i2 = 0;
        if (A0R2 != null) {
            C110115dX.A0w(A0H(), A0R2.A01, this, 59);
            PaymentIncentiveViewModel paymentIncentiveViewModel = this.A0t;
            paymentIncentiveViewModel.A01.A09(AnonymousClass5xI.A01(paymentIncentiveViewModel.A06.A00()));
            PaymentIncentiveViewModel paymentIncentiveViewModel2 = this.A0t;
            paymentIncentiveViewModel2.A07.Acl(new AnonymousClass662(paymentIncentiveViewModel2, false));
        }
        C110695eg A1N = A1N();
        this.A0u = A1N;
        if (A1N != null) {
            C110115dX.A0w(A0H(), A1N.A01, this, 58);
            C110115dX.A0w(A0H(), this.A0u.A00, this, 57);
            if (bundle2 != null) {
                this.A0u.A0E(bundle2.getString("actual_deep_link"));
            }
        }
        this.A02 = view2.findViewById(R.id.fb_pay_hub_section_desc);
        View findViewById = view2.findViewById(R.id.fb_pay_hub);
        this.A00 = C004601z.A0E(findViewById, R.id.pay_hub_add);
        this.A0E = C13680ns.A0L(findViewById, R.id.pay_hub_desc);
        this.A01 = C004601z.A0E(findViewById, R.id.pay_hub_chevron);
        this.A05 = view2.findViewById(R.id.payment_setting_container);
        this.A07 = view2.findViewById(R.id.requests_separator);
        C18290wS r15 = this.A0h;
        C39961tL r24 = new C39961tL();
        C18300wT r14 = this.A0c;
        AnonymousClass175 r13 = this.A0V;
        C18310wU r7 = this.A0e;
        AnonymousClass1MA r6 = this.A0j;
        AnonymousClass17O r5 = this.A0a;
        AnonymousClass17Y r4 = this.A0d;
        AnonymousClass107 r3 = this.A0U;
        AnonymousClass108 r2 = this.A0b;
        C16320sq r28 = this.A12;
        C18290wS r22 = r15;
        C18300wT r19 = r14;
        AnonymousClass108 r18 = r2;
        AnonymousClass17O r17 = r5;
        AnonymousClass175 r16 = r13;
        AnonymousClass107 r152 = r3;
        C14530pL r142 = (C14530pL) A0D();
        this.A0r = new AnonymousClass60S(r142, r152, r16, r17, r18, r19, r4, r7, r22, r6, r24, this, this, this, r28, A1Q(), true);
        boolean z2 = false;
        if (bundle2 != null) {
            z2 = bundle2.getBoolean("extra_force_get_methods", false);
        }
        this.A0r.A01(A1c(), z2);
        C119345ww A1M = A1M();
        this.A0s = A1M;
        if (A1M != null) {
            A1M.A03 = this.A04.A0C(1724);
        }
        view2.findViewById(R.id.add_new_account).setOnClickListener(this);
        view2.findViewById(R.id.payment_support_container).setOnClickListener(this);
        View A0E2 = C004601z.A0E(view2, R.id.send_payment_fab);
        this.A08 = A0E2;
        A0E2.setVisibility(C13680ns.A02(this instanceof BrazilPaymentSettingsFragment ? 1 : 0));
        this.A08.setOnClickListener(this);
        if (A1a()) {
            C13690nt.A13(view2, R.id.payment_methods_container, 8);
            C13690nt.A13(view2, R.id.payment_history_separator, 8);
        }
        this.A0q = new C110335du(A0D(), this.A02, this.A0h, this);
        ListView listView = (ListView) view2.findViewById(R.id.methods_list);
        this.A0D = listView;
        listView.setAdapter(this.A0q);
        this.A0D.setOnItemClickListener(new IDxCListenerShape196S0100000_3_I1(this, 2));
        TransactionsExpandableView transactionsExpandableView = (TransactionsExpandableView) view2.findViewById(R.id.payment_history_container);
        this.A0z = transactionsExpandableView;
        transactionsExpandableView.setTitle(A0J(R.string.str10e6));
        this.A0z.setSeeMoreView(A0J(R.string.str10ed), A0J(R.string.str106f), C110115dX.A06(this, 95));
        View inflate = A05().inflate(R.layout.layout0483, (ViewGroup) null, false);
        this.A0z.setCustomEmptyView(inflate);
        AnonymousClass2SR.A08(C13680ns.A0K(inflate, R.id.payment_nux_logo), A03().getColor(R.color.color04cd));
        this.A09 = (FrameLayout) C004601z.A0E(view2, R.id.recurring_payment_container);
        this.A0B = (FrameLayout) view2.findViewById(R.id.payment_custom_header_row);
        this.A0A = (FrameLayout) view2.findViewById(R.id.custom_footer_container);
        this.A06 = view2.findViewById(R.id.payment_custom_header_row_separator);
        TransactionsExpandableView transactionsExpandableView2 = (TransactionsExpandableView) view2.findViewById(R.id.requests_container);
        this.A0y = transactionsExpandableView2;
        transactionsExpandableView2.setSeeMoreView(A0J(R.string.str10e9), A0J(R.string.str10e9), C110115dX.A06(this, 94));
        C117105sS r32 = new C117105sS(A0D());
        r32.A00 = 2;
        TransactionsExpandableView transactionsExpandableView3 = this.A0z;
        transactionsExpandableView3.A00 = r32;
        TransactionsExpandableView transactionsExpandableView4 = this.A0y;
        transactionsExpandableView4.A00 = r32;
        transactionsExpandableView3.setPaymentRequestActionCallback(this);
        transactionsExpandableView4.setPaymentRequestActionCallback(this);
        View findViewById2 = view2.findViewById(R.id.invite_container);
        this.A03 = findViewById2;
        findViewById2.setOnClickListener(C110115dX.A06(this, this instanceof IndiaUpiPaymentSettingsFragment ? 58 : 96));
        C218315p r33 = this.A10;
        C001000l A0D2 = A0D();
        int A0A2 = r33.A0A(this.A0f.A01());
        Drawable A042 = A0A2 != 0 ? AnonymousClass00T.A04(A0D2, A0A2) : null;
        TextView A0M2 = C13680ns.A0M(view2, R.id.payments_drawable_text_view);
        ImageView A0K2 = C13680ns.A0K(view2, R.id.payments_drawable_image_view);
        if (A042 != null) {
            A0K2.setImageDrawable(A042);
            A0M2.setVisibility(8);
            A0K2.setVisibility(0);
        } else {
            A0M2.setText(A1O());
            A0M2.setVisibility(0);
            A0K2.setVisibility(8);
        }
        View findViewById3 = view2.findViewById(R.id.payments_settings_scroll_view_layout);
        ViewGroup A0K3 = C13690nt.A0K(view2, R.id.send_payment_fab);
        View findViewById4 = view2.findViewById(R.id.payments_text_view);
        LayoutTransition layoutTransition = A0K3.getLayoutTransition();
        layoutTransition.setInterpolator(0, new C018508q());
        layoutTransition.setInterpolator(1, new C018508q());
        layoutTransition.setDuration(150);
        View A0E3 = C004601z.A0E(view2, R.id.payment_support_section);
        View A0E4 = C004601z.A0E(view2, R.id.payment_support_section_separator);
        boolean A1Z = A1Z();
        A0E3.setVisibility(C13680ns.A02(A1Z ? 1 : 0));
        if (!A1Z) {
            i2 = 8;
        }
        A0E4.setVisibility(i2);
        findViewById3.getViewTreeObserver().addOnScrollChangedListener(new C119705yu(findViewById3, findViewById4, A0K3, this));
        int A002 = AnonymousClass00T.A00(A0D(), R.color.color070f);
        C110105dW.A0q(view2, R.id.change_pin_icon, A002);
        C110105dW.A0q(view2, R.id.add_new_account_icon, A002);
        C110105dW.A0q(view2, R.id.payment_support_icon, A002);
        AnonymousClass2SR.A08(this.A0z.A04, A002);
        AnonymousClass2SR.A08(this.A0y.A04, A002);
        C110105dW.A0q(view2, R.id.fingerprint_setting_icon, A002);
        C110105dW.A0q(view2, R.id.invite_icon, A002);
        C110105dW.A0q(view2, R.id.payment_settings_icon, A002);
    }

    public C119345ww A1M() {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            C16440t3 r21 = indiaUpiPaymentSettingsFragment.A0P;
            C14870pt r19 = indiaUpiPaymentSettingsFragment.A0F;
            C16040sK r18 = indiaUpiPaymentSettingsFragment.A0G;
            C16320sq r17 = indiaUpiPaymentSettingsFragment.A12;
            C18080w7 r15 = indiaUpiPaymentSettingsFragment.A0S;
            C118365uZ r14 = indiaUpiPaymentSettingsFragment.A0i;
            C18290wS r12 = indiaUpiPaymentSettingsFragment.A0h;
            C18300wT r11 = indiaUpiPaymentSettingsFragment.A0c;
            AnonymousClass175 r10 = indiaUpiPaymentSettingsFragment.A0V;
            C118915vc r9 = indiaUpiPaymentSettingsFragment.A0p;
            C18310wU r8 = indiaUpiPaymentSettingsFragment.A0e;
            AnonymousClass61W r7 = indiaUpiPaymentSettingsFragment.A09;
            AnonymousClass5xE r6 = indiaUpiPaymentSettingsFragment.A08;
            C18260wP r5 = indiaUpiPaymentSettingsFragment.A0K;
            C18340wX r4 = indiaUpiPaymentSettingsFragment.A0Z;
            AnonymousClass5xG r3 = indiaUpiPaymentSettingsFragment.A0o;
            C119285wq r2 = indiaUpiPaymentSettingsFragment.A0k;
            C16320sq r36 = r17;
            C18310wU r27 = r8;
            AnonymousClass5xE r28 = r6;
            C18290wS r29 = r12;
            C118365uZ r30 = r14;
            C119285wq r31 = r2;
            C18080w7 r22 = r15;
            AnonymousClass175 r23 = r10;
            AnonymousClass109 r24 = indiaUpiPaymentSettingsFragment.A0W;
            C18340wX r25 = r4;
            C18300wT r26 = r11;
            return new C113295lo(r19, r18, (C14530pL) indiaUpiPaymentSettingsFragment.A0D(), r5, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r7, r3, r9, indiaUpiPaymentSettingsFragment, r36);
        }
        BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
        C16440t3 r212 = brazilPaymentSettingsFragment.A0P;
        C14870pt r38 = brazilPaymentSettingsFragment.A0F;
        C16040sK r192 = brazilPaymentSettingsFragment.A0G;
        C16320sq r182 = brazilPaymentSettingsFragment.A12;
        C18080w7 r172 = brazilPaymentSettingsFragment.A0S;
        C118365uZ r152 = brazilPaymentSettingsFragment.A0i;
        C18290wS r142 = brazilPaymentSettingsFragment.A0h;
        C18300wT r122 = brazilPaymentSettingsFragment.A0c;
        AnonymousClass60U r112 = brazilPaymentSettingsFragment.A02;
        AnonymousClass175 r102 = brazilPaymentSettingsFragment.A0V;
        C118915vc r92 = brazilPaymentSettingsFragment.A0p;
        C18310wU r82 = brazilPaymentSettingsFragment.A0e;
        C1222969a r72 = brazilPaymentSettingsFragment.A06;
        AnonymousClass5xE r62 = brazilPaymentSettingsFragment.A04;
        C18260wP r52 = brazilPaymentSettingsFragment.A0K;
        C18340wX r42 = brazilPaymentSettingsFragment.A0Z;
        AnonymousClass5xG r32 = brazilPaymentSettingsFragment.A0o;
        C119285wq r210 = brazilPaymentSettingsFragment.A0k;
        C16320sq r37 = r182;
        C18340wX r262 = r42;
        C18300wT r272 = r122;
        C18310wU r282 = r82;
        AnonymousClass5xE r292 = r62;
        C18290wS r302 = r142;
        C118365uZ r312 = r152;
        C18260wP r20 = r52;
        C18080w7 r222 = r172;
        AnonymousClass60U r232 = r112;
        AnonymousClass175 r242 = r102;
        AnonymousClass109 r252 = brazilPaymentSettingsFragment.A0W;
        return new C113305lp(r38, r192, (C14530pL) brazilPaymentSettingsFragment.A0D(), r20, r212, r222, r232, r242, r252, r262, r272, r282, r292, r302, r312, r210, r72, r32, r92, brazilPaymentSettingsFragment, r37);
    }

    public C110695eg A1N() {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            C114105n8 r0 = indiaUpiPaymentSettingsFragment.A0B;
            if (r0 != null) {
                return r0;
            }
            C117765tW r4 = indiaUpiPaymentSettingsFragment.A0C;
            C114105n8 r02 = (C114105n8) new C006602z((AnonymousClass04o) new IDxFactoryShape56S0200000_3_I1(indiaUpiPaymentSettingsFragment.A09, 2, r4), (C001500q) indiaUpiPaymentSettingsFragment.A0D()).A01(C114105n8.class);
            indiaUpiPaymentSettingsFragment.A0B = r02;
            return r02;
        } else if (!(this instanceof BrazilPaymentSettingsFragment)) {
            return null;
        } else {
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            C114095n7 r03 = brazilPaymentSettingsFragment.A0A;
            if (r03 != null) {
                return r03;
            }
            C117755tV r42 = brazilPaymentSettingsFragment.A0B;
            C114095n7 r04 = (C114095n7) new C006602z((AnonymousClass04o) new IDxFactoryShape56S0200000_3_I1(brazilPaymentSettingsFragment.A06, 1, r42), (C001500q) brazilPaymentSettingsFragment.A0D()).A01(C114095n7.class);
            brazilPaymentSettingsFragment.A0A = r04;
            return r04;
        }
    }

    public CharSequence A1O() {
        C28411Vz A012;
        Context A022;
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            A012 = C35481m0.A05;
            A022 = A02();
        } else {
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            A012 = brazilPaymentSettingsFragment.A01.A01("BRL");
            A022 = brazilPaymentSettingsFragment.A02();
        }
        return A012.ABE(A022);
    }

    public String A1P() {
        if (!(this instanceof IndiaUpiPaymentSettingsFragment)) {
            return null;
        }
        C114105n8 r0 = ((IndiaUpiPaymentSettingsFragment) this).A0B;
        AnonymousClass00B.A06(r0);
        switch (r0.A0H()) {
            case 1:
                return "finish_setup";
            case 2:
                return "onboarding_banner";
            case 4:
                return "add_upi_number_banner";
            case 5:
                return "notify_verification_banner";
            case 6:
                return "scan_qr_code_banner";
            case 7:
                return "recovery_upin_upsell_banner";
            case 8:
                return "recovery_2fa_upsell_banner";
            default:
                return null;
        }
    }

    public String A1Q() {
        return null;
    }

    public void A1R() {
        C16320sq r2 = this.A12;
        AnonymousClass5o4 r0 = this.A0l;
        if (r0 != null && r0.A03() == 1) {
            this.A0l.A06(false);
        }
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putString("com.obwhatsapp.support.DescribeProblemActivity.from", "payments:settings");
        C17130ua r8 = this.A0J;
        AnonymousClass5o4 r3 = new AnonymousClass5o4(A0D2, (C14550pN) A0D(), this.A0H, this.A0I, r8, this.A02, (C30671cl) null, (AnonymousClass1Vt) null, this.A0T, this.A0f, "payments:settings");
        this.A0l = r3;
        C13680ns.A1U(r3, r2);
    }

    public final void A1S() {
        C110695eg r2 = this.A0u;
        if (r2 != null) {
            r2.A0B(this.A0n, this.A0w);
        }
    }

    public void A1T(int i2) {
        if (i2 == 1) {
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], R.string.str0ca3);
            A012.A01(new IDxCListenerShape24S0000000_3_I1(3), R.string.str0e87);
            A012.A00().A1G(A0G(), (String) null);
        }
    }

    public void A1U(Intent intent) {
        Bundle extras = intent.getExtras();
        boolean z2 = false;
        if (extras != null) {
            z2 = extras.getBoolean("extra_force_get_methods", false);
        }
        this.A0r.A01(A1c(), z2);
    }

    public void A1V(String str) {
        if (this instanceof BrazilPaymentSettingsFragment) {
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            String A022 = brazilPaymentSettingsFragment.A09.A02(true);
            if (A022 == null || brazilPaymentSettingsFragment.A09.A06.A03()) {
                brazilPaymentSettingsFragment.A0r(C110105dW.A04(brazilPaymentSettingsFragment.A0u(), BrazilFbPayHubActivity.class));
                C110695eg r3 = brazilPaymentSettingsFragment.A0u;
                if (r3 != null) {
                    AnonymousClass5xP.A01(AnonymousClass5xP.A00(r3.A05, (C28401Vy) null, brazilPaymentSettingsFragment.A0n, (String) null, false), r3.A0B, 37, "payment_home", (String) null, 1);
                    return;
                }
                return;
            }
            brazilPaymentSettingsFragment.A1d(A022);
            C110695eg r2 = brazilPaymentSettingsFragment.A0u;
            if (r2 != null) {
                r2.A0D(brazilPaymentSettingsFragment.A0n, 36, str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0137, code lost:
        X.AnonymousClass22U.A00(r3, r0);
        r4.A0r(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0185, code lost:
        r4.A0r(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0188, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1W(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsFragment
            if (r0 == 0) goto L_0x0015
            r4 = r7
            com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r4 = (com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r4
            X.5n8 r0 = r4.A0B
            X.AnonymousClass00B.A06(r0)
            int r0 = r0.A0H()
            r6 = 0
            switch(r0) {
                case 1: goto L_0x00aa;
                case 2: goto L_0x0043;
                case 3: goto L_0x0043;
                case 4: goto L_0x0047;
                case 5: goto L_0x00f1;
                case 6: goto L_0x0099;
                case 7: goto L_0x013e;
                case 8: goto L_0x016b;
                default: goto L_0x0014;
            }
        L_0x0014:
            return
        L_0x0015:
            boolean r0 = r7 instanceof com.obwhatsapp.payments.ui.BrazilPaymentSettingsFragment
            if (r0 == 0) goto L_0x0014
            r3 = r7
            com.obwhatsapp.payments.ui.BrazilPaymentSettingsFragment r3 = (com.obwhatsapp.payments.ui.BrazilPaymentSettingsFragment) r3
            X.5n7 r1 = r3.A0A
            X.AnonymousClass00B.A06(r1)
            X.5wk r0 = r3.A0w
            if (r0 == 0) goto L_0x0041
            int r0 = r0.A01
        L_0x0027:
            int r2 = r1.A0H(r0)
            r1 = 1
            if (r2 == r1) goto L_0x0189
            r0 = 2
            if (r2 == r0) goto L_0x003a
            r0 = 3
            if (r2 != r0) goto L_0x0014
            java.lang.String r0 = "brpay_p_account_recovery_eligibility_screen"
        L_0x0036:
            r3.A1d(r0)
            return
        L_0x003a:
            X.5vg r0 = r3.A09
            java.lang.String r0 = r0.A02(r1)
            goto L_0x0036
        L_0x0041:
            r0 = 0
            goto L_0x0027
        L_0x0043:
            r4.A1X(r8)
            return
        L_0x0047:
            X.5eg r1 = r4.A0u
            if (r1 == 0) goto L_0x0054
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0C(r6, r0, r8)
        L_0x0054:
            X.00l r1 = r4.A0D()
            java.lang.Class<com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity> r0 = com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity.class
            android.content.Intent r5 = X.C110105dW.A04(r1, r0)
            java.lang.String r2 = "add_upi_number_banner"
            java.lang.String r0 = "payment_home"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)
            java.lang.String r0 = "."
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            java.lang.String r0 = "extra_referral_screen"
            r5.putExtra(r0, r1)
            X.2gP r3 = X.C110105dW.A0L()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            X.5du r0 = r4.A0q
            java.util.List r1 = r0.A02
            if (r1 == 0) goto L_0x008a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x008a
            java.lang.String r6 = com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A01(r1)
        L_0x008a:
            java.lang.String r0 = "accountHolderName"
            X.1lh r1 = X.C110105dW.A0J(r3, r2, r6, r0)
            java.lang.String r0 = "extra_payment_name"
            r5.putExtra(r0, r1)
            r4.A0r(r5)
            return
        L_0x0099:
            X.5eg r1 = r4.A0u
            if (r1 == 0) goto L_0x00a6
            r0 = 97
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0C(r6, r0, r8)
        L_0x00a6:
            r4.A1d()
            return
        L_0x00aa:
            X.5eg r1 = r4.A0u
            if (r1 == 0) goto L_0x00b7
            r0 = 85
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0D(r6, r0, r8)
        L_0x00b7:
            X.00l r1 = r4.A0D()
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.class
            android.content.Intent r3 = X.C110105dW.A04(r1, r0)
            r1 = 2
            java.lang.String r0 = "extra_setup_mode"
            r3.putExtra(r0, r1)
            r1 = 5
            java.lang.String r0 = "extra_payments_entry_type"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "extra_is_first_payment_method"
            r1 = 1
            r3.putExtra(r0, r1)
            java.lang.String r0 = "extra_skip_value_props_display"
            r3.putExtra(r0, r1)
            java.lang.String r2 = "finish_setup"
            java.lang.String r0 = "payment_home"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)
            java.lang.String r0 = "."
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            java.lang.String r0 = "extra_referral_screen"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "resumeOnboardingBanner"
            goto L_0x0137
        L_0x00f1:
            X.5eg r1 = r4.A0u
            r5 = 1
            if (r1 == 0) goto L_0x00fb
            r0 = 139(0x8b, float:1.95E-43)
            r1.A08(r5, r0)
        L_0x00fb:
            X.00l r1 = r4.A0D()
            java.lang.Class<com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity> r0 = com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.class
            android.content.Intent r3 = X.C110105dW.A04(r1, r0)
            java.lang.String r0 = "extra_payments_entry_type"
            r3.putExtra(r0, r5)
            java.lang.String r2 = "notify_verification_banner"
            java.lang.String r0 = "payment_home"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r0)
            java.lang.String r0 = "."
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            java.lang.String r0 = "extra_referral_screen"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "extra_payment_flow_entry_point"
            r1 = 2
            r3.putExtra(r0, r1)
            java.lang.String r0 = "extra_setup_mode"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "extra_is_first_payment_method"
            r3.putExtra(r0, r5)
            java.lang.String r0 = "extra_skip_value_props_display"
            r3.putExtra(r0, r5)
            java.lang.String r0 = "accountRecoveryBanner"
        L_0x0137:
            X.AnonymousClass22U.A00(r3, r0)
            r4.A0r(r3)
            return
        L_0x013e:
            X.5eg r2 = r4.A0u
            if (r2 == 0) goto L_0x0148
            r1 = 1
            java.lang.String r0 = "recovery_upin_upsell_banner"
            r2.A09(r1, r0)
        L_0x0148:
            X.0wS r0 = r4.A0h
            X.160 r0 = X.C110115dX.A0H(r0)
            X.1cl r0 = r0.A06()
            X.AnonymousClass00B.A06(r0)
            X.00l r2 = r4.A0D()
            X.0wS r0 = r4.A0h
            X.160 r0 = X.C110115dX.A0H(r0)
            X.1cl r1 = r0.A06()
            X.1m4 r1 = (X.C35521m4) r1
            r0 = 0
            android.content.Intent r0 = com.obwhatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A02(r2, r1, r0)
            goto L_0x0185
        L_0x016b:
            X.5eg r2 = r4.A0u
            if (r2 == 0) goto L_0x0175
            r1 = 1
            java.lang.String r0 = "recovery_2fa_upsell_banner"
            r2.A09(r1, r0)
        L_0x0175:
            X.00l r2 = r4.A0D()
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {1, 2} // fill-array
            java.lang.String r0 = "CONTINUE"
            android.content.Intent r0 = X.C14750ph.A0l(r2, r0, r1)
        L_0x0185:
            r4.A0r(r0)
            return
        L_0x0189:
            r3.A1V(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.PaymentSettingsFragment.A1W(java.lang.String):void");
    }

    public void A1X(String str) {
        String str2;
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            boolean A0E2 = this.A0V.A0E();
            C110695eg r2 = this.A0u;
            if (!A0E2) {
                if (r2 != null) {
                    r2.A0D(this.A0n, 36, str);
                }
                Intent A042 = C110105dW.A04(A0u(), IndiaUpiPaymentsAccountSetupActivity.class);
                A042.putExtra("extra_setup_mode", 1);
                A042.putExtra("extra_payments_entry_type", 4);
                A042.putExtra("extra_is_first_payment_method", true);
                A042.putExtra("extra_skip_value_props_display", false);
                AnonymousClass22U.A00(A042, "settingsNewPayment");
                A0r(A042);
                return;
            }
            if (r2 != null) {
                int i2 = 38;
                if (TextUtils.equals("onboarding_banner", str)) {
                    i2 = 85;
                }
                this.A0u.A0C(this.A0n, Integer.valueOf(i2), str);
            }
            Intent A043 = C110105dW.A04(A0u(), IndiaUpiContactPicker.class);
            A043.putExtra("for_payments", true);
            if (TextUtils.equals("onboarding_banner", str)) {
                StringBuilder A0q2 = AnonymousClass000.A0q("payment_home");
                A0q2.append(".");
                str2 = AnonymousClass000.A0h("onboarding_banner", A0q2);
            } else {
                str2 = "new_payment";
            }
            C110115dX.A0r(A043, str2);
            startActivityForResult(A043, 501);
            return;
        }
        C110695eg r22 = this.A0u;
        if (r22 != null) {
            r22.A0C(this.A0n, 38, str);
        }
        Intent A044 = C110105dW.A04(A0D(), PaymentContactPicker.class);
        A044.putExtra("for_payments", true);
        A044.putExtra("referral_screen", "payment_home");
        startActivityForResult(A044, 501);
    }

    public final void A1Y(boolean z2) {
        C110695eg r3 = this.A0u;
        if (r3 != null) {
            C53322fW r2 = this.A0n;
            int i2 = 45;
            if (z2) {
                i2 = 46;
            }
            AnonymousClass5xP.A01(AnonymousClass5xP.A00(r3.A05, (C28401Vy) null, r2, (String) null, false), r3.A0B, Integer.valueOf(i2), "payment_home", (String) null, 1);
        }
        Intent A042 = C110105dW.A04(A0D(), this instanceof IndiaUpiPaymentSettingsFragment ? IndiaPaymentTransactionHistoryActivity.class : PaymentTransactionHistoryActivity.class);
        A042.putExtra("extra_show_requests", z2);
        A042.putExtra("extra_payment_service_name", A1Q());
        A0r(A042);
    }

    public boolean A1Z() {
        return true;
    }

    public boolean A1a() {
        return this instanceof BrazilPaymentSettingsFragment;
    }

    public boolean A1b() {
        return false;
    }

    public boolean A1c() {
        if (this instanceof IndiaUpiPaymentSettingsFragment) {
            return false;
        }
        C18300wT r1 = this.A0c;
        return AnonymousClass000.A1Q(((r1.A01.A00() - C13680ns.A08(r1.A01(), "payments_all_transactions_last_sync_time")) > TimeUnit.DAYS.toMillis(7) ? 1 : ((r1.A01.A00() - C13680ns.A08(r1.A01(), "payments_all_transactions_last_sync_time")) == TimeUnit.DAYS.toMillis(7) ? 0 : -1)));
    }

    public int ADe(C30671cl r2) {
        return 0;
    }

    public String ADh(C30671cl r2) {
        return C119405xi.A03(A0D(), r2) != null ? C119405xi.A03(A0D(), r2) : "";
    }

    public void AUd() {
        this.A0r.A00(false);
    }

    public /* synthetic */ boolean AfB(C30671cl r2) {
        return false;
    }

    public boolean AfL() {
        return false;
    }

    public void AfY(C30671cl r1, PaymentMethodRow paymentMethodRow) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r7.A09.A02(false) != null) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AhT(java.util.List r9) {
        /*
            r8 = this;
            boolean r0 = r8.A0c()
            if (r0 == 0) goto L_0x0099
            X.00l r0 = r8.A0C()
            if (r0 == 0) goto L_0x0099
            r8.A14 = r9
            android.view.View r0 = r8.A05
            r6 = 0
            r0.setVisibility(r6)
            X.5du r0 = r8.A0q
            r0.A02 = r9
            r0.notifyDataSetChanged()
            android.view.View r5 = r8.A0A
            if (r5 == 0) goto L_0x008b
            r4 = 0
            r3 = 8
            boolean r0 = r8.A1a()
            if (r0 == 0) goto L_0x008b
            r0 = 2131365200(0x7f0a0d50, float:1.8350259E38)
            X.C13690nt.A13(r5, r0, r3)
            r0 = 2131365197(0x7f0a0d4d, float:1.8350253E38)
            X.C13690nt.A13(r5, r0, r6)
            r0 = 2131365199(0x7f0a0d4f, float:1.8350257E38)
            X.C13690nt.A13(r5, r0, r6)
            r7 = r8
            boolean r0 = r8 instanceof com.obwhatsapp.payments.ui.BrazilPaymentSettingsFragment
            if (r0 == 0) goto L_0x005a
            com.obwhatsapp.payments.ui.BrazilPaymentSettingsFragment r7 = (com.obwhatsapp.payments.ui.BrazilPaymentSettingsFragment) r7
            X.0w8 r0 = r7.A0g
            boolean r1 = r0.A05()
            r2 = 1
            X.5vg r0 = r7.A09
            if (r1 == 0) goto L_0x00ab
            java.lang.String r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x005a
            X.5vg r0 = r7.A09
            java.lang.String r0 = r0.A02(r6)
            if (r0 != 0) goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            r1 = 2131365196(0x7f0a0d4c, float:1.835025E38)
            if (r2 != 0) goto L_0x009a
            X.C13690nt.A13(r5, r1, r3)
            r3 = 2131365195(0x7f0a0d4b, float:1.8350248E38)
            android.view.View r2 = r5.findViewById(r3)
            boolean r1 = r8.A1b()
            r0 = 0
            if (r1 == 0) goto L_0x0073
            r0 = 8
        L_0x0073:
            r2.setVisibility(r0)
            android.view.View r0 = r5.findViewById(r3)
            r0.setOnClickListener(r8)
            r0 = 2131365198(0x7f0a0d4e, float:1.8350255E38)
            android.view.View r0 = r5.findViewById(r0)
            if (r1 != 0) goto L_0x0088
            r4 = 8
        L_0x0088:
            r0.setVisibility(r4)
        L_0x008b:
            android.widget.ListView r0 = r8.A0D
            X.C115265pT.A00(r0)
            X.5eg r0 = r8.A0u
            if (r0 == 0) goto L_0x0096
            r0.A02 = r9
        L_0x0096:
            r8.A1S()
        L_0x0099:
            return
        L_0x009a:
            X.C13690nt.A13(r5, r1, r6)
            r0 = 2131365195(0x7f0a0d4b, float:1.8350248E38)
            X.C13690nt.A13(r5, r0, r3)
            android.view.View r0 = r5.findViewById(r1)
            r0.setOnClickListener(r8)
            goto L_0x008b
        L_0x00ab:
            X.5vc r0 = r0.A06
            boolean r0 = r0.A03()
            r2 = r0 ^ 1
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.PaymentSettingsFragment.AhT(java.util.List):void");
    }

    public void AhZ(List list) {
        if (A0c() && A0C() != null) {
            this.A15 = list;
            this.A05.setVisibility(0);
            if (this.A15.isEmpty()) {
                this.A07.setVisibility(8);
                this.A0y.setVisibility(8);
                return;
            }
            this.A0y.setVisibility(0);
            this.A07.setVisibility(0);
            this.A0y.A01(this.A15);
            this.A0y.setTitle(this instanceof IndiaUpiPaymentSettingsFragment ? A0J(R.string.str18cb) : A03().getQuantityString(R.plurals.plurals010d, this.A15.size()));
        }
    }

    public void Ahd(List list) {
        if (A0c() && A0C() != null) {
            this.A16 = list;
            this.A05.setVisibility(0);
            this.A0z.A01(this.A16);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.payment_support_container) {
            C110695eg r3 = this.A0u;
            if (r3 != null) {
                AnonymousClass5xP.A01(AnonymousClass5xP.A00(r3.A05, (C28401Vy) null, this.A0n, (String) null, false), r3.A0B, 39, "payment_home", (String) null, 1);
            }
            A1R();
        } else if (view.getId() == R.id.send_payment_fab) {
            if (!this.A0L.A00()) {
                RequestPermissionActivity.A0O(this, R.string.str11bc, R.string.str11bb);
            } else {
                A1X((String) null);
            }
        } else if (view.getId() == R.id.add_new_account || view.getId() == R.id.payment_settings_row_add_method) {
            AMA(AnonymousClass000.A1P(this.A0q.getCount()));
        } else if (view.getId() == R.id.payment_settings_row) {
            A1V((String) null);
        }
    }
}
