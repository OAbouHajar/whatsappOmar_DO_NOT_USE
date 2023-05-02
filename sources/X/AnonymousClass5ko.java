package X;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape24S0000000_3_I1;
import com.facebook.redex.IDxCListenerShape3S1100000_3_I1;
import com.facebook.redex.IDxCListenerShape42S0300000_3_I1;
import com.facebook.redex.IDxSDetectorShape311S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity;
import com.obwhatsapp.payments.ui.IndiaUpiDeviceBindStepActivity;
import com.obwhatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5ko  reason: invalid class name */
public abstract class AnonymousClass5ko extends C112725iz {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public C35521m4 A04;
    public C16490t9 A05;
    public C35301lh A06;
    public C35301lh A07;
    public C35301lh A08;
    public C35301lh A09;
    public C111865hX A0A;
    public C119365wy A0B;
    public AnonymousClass60V A0C;
    public C18300wT A0D;
    public AnonymousClass61W A0E;
    public C112715ix A0F;
    public AnonymousClass5x9 A0G;
    public AnonymousClass5xN A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public boolean A0R;
    public boolean A0S = true;
    public boolean A0T = false;
    public boolean A0U = true;
    public final AnonymousClass1Vo A0V = AnonymousClass1Vo.A00("IndiaUpiBasePaymentsActivity", "payment", "IN");

    public void A2S(int i2) {
        A3H();
        finish();
    }

    public String A3F(String str) {
        try {
            String rawString = this.A01.A05().getRawString();
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                long A002 = this.A05.A00();
                byte[] bArr = new byte[8];
                for (int i2 = 7; i2 >= 0; i2--) {
                    bArr[i2] = (byte) ((int) A002);
                    A002 >>= 8;
                }
                instance.update(bArr);
                instance.update(rawString.getBytes());
                byte[] bArr2 = new byte[16];
                new SecureRandom().nextBytes(bArr2);
                instance.update(bArr2);
                byte[] bArr3 = new byte[15];
                System.arraycopy(instance.digest(), 0, bArr3, 0, 15);
                return A3G(str, C004101u.A04(bArr3));
            } catch (NoSuchAlgorithmException e2) {
                this.A0V.A08("payment", "generateUuid unable to hash due to missing sha256 algorithm", e2);
                return null;
            }
        } catch (Exception e3) {
            this.A0V.A08("payment", "generateUuid unable to hash due to missing phone user jid", e3);
            return null;
        }
    }

    public String A3G(String str, String str2) {
        int length = str.length();
        if (length <= 8) {
            String A0h = AnonymousClass000.A0h(str2, AnonymousClass000.A0q(str));
            return A0h.length() > 35 ? A0h.substring(0, 35) : A0h;
        }
        throw AnonymousClass000.A0T(this.A0V.A02(C13680ns.A0c(length, "prefixAndTruncate called with too long a prefix: ")));
    }

    public void A3H() {
        if (this instanceof C112935km) {
            C112935km r3 = (C112935km) this;
            r3.A0B.A04.A01();
            AnonymousClass1Vo r2 = r3.A0I;
            StringBuilder A0r = AnonymousClass000.A0r("clearStates: ");
            A0r.append(r3.A0B.A04);
            C110105dW.A1L(r2, A0r);
            r3.A0B.A0B();
        } else if (this instanceof IndiaUpiOnboardingErrorEducationActivity) {
            this.A0B.A0B();
        } else if (this instanceof IndiaUpiDeviceBindStepActivity) {
            IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = (IndiaUpiDeviceBindStepActivity) this;
            AnonymousClass4XO r0 = indiaUpiDeviceBindStepActivity.A0D;
            if (r0 != null) {
                r0.A01();
                AnonymousClass1Vo r22 = indiaUpiDeviceBindStepActivity.A0e;
                StringBuilder A0r2 = AnonymousClass000.A0r("clearStates: ");
                A0r2.append(indiaUpiDeviceBindStepActivity.A0D);
                C110105dW.A1L(r22, A0r2);
            }
            indiaUpiDeviceBindStepActivity.A0B.A0B();
        } else if (this instanceof IndiaUpiBankPickerActivity) {
            IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = (IndiaUpiBankPickerActivity) this;
            AnonymousClass4XO r02 = indiaUpiBankPickerActivity.A08;
            if (r02 != null) {
                r02.A01();
                indiaUpiBankPickerActivity.A0L.A06(AnonymousClass000.A0h(indiaUpiBankPickerActivity.A08.toString(), AnonymousClass000.A0r("clearStates: ")));
            }
            indiaUpiBankPickerActivity.A0B.A0B();
        } else if (this instanceof IndiaUpiBankAccountPickerActivity) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) this;
            indiaUpiBankAccountPickerActivity.A0H.A01();
            indiaUpiBankAccountPickerActivity.A0Y.A06(AnonymousClass000.A0h(indiaUpiBankAccountPickerActivity.A0H.toString(), AnonymousClass000.A0r("clearStates: ")));
            indiaUpiBankAccountPickerActivity.A0B.A0B();
        }
    }

    public void A3I() {
        if (this instanceof IndiaUpiBankAccountPickerActivity) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) this;
            indiaUpiBankAccountPickerActivity.A0W = false;
            AnonymousClass01X r0 = indiaUpiBankAccountPickerActivity.A0B.A0N;
            if (r0 != null) {
                r0.A01();
                return;
            }
            return;
        }
        C13680ns.A13(findViewById(R.id.progress));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r3.A0S != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r0 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3J() {
        /*
            r3 = this;
            r0 = 1
            r3.A0T = r0
            X.1fu r2 = X.C32241fu.A00(r3)
            r0 = 2131890175(0x7f120fff, float:1.9415034E38)
            r2.A02(r0)
            boolean r0 = r3 instanceof com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity
            if (r0 == 0) goto L_0x0038
            boolean r1 = r3.A0S
            r0 = 0
            if (r1 == 0) goto L_0x001d
        L_0x0016:
            r1 = 2131890178(0x7f121002, float:1.941504E38)
        L_0x0019:
            java.lang.String r0 = r3.getString(r1)
        L_0x001d:
            r2.A06(r0)
            r1 = 2131890174(0x7f120ffe, float:1.9415032E38)
            r0 = 16
            X.C110105dW.A0w(r2, r3, r0, r1)
            r1 = 2131890173(0x7f120ffd, float:1.941503E38)
            r0 = 17
            X.C110105dW.A0v(r2, r3, r0, r1)
            r0 = 0
            r2.A07(r0)
            r2.A00()
            return
        L_0x0038:
            boolean r0 = r3.A0S
            r1 = 2131890172(0x7f120ffc, float:1.9415028E38)
            if (r0 == 0) goto L_0x0019
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5ko.A3J():void");
    }

    public void A3K(int i2, int i3) {
        Toolbar A092 = C110105dW.A09(this);
        Aem(A092);
        C005402i x2 = x();
        if (x2 != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().addFlags(Integer.MIN_VALUE);
                Window window = getWindow();
                int A002 = AnonymousClass00T.A00(this, R.color.color059c);
            }
            A092.setBackgroundColor(AnonymousClass00T.A00(this, R.color.color065f));
            x2.A0E(AnonymousClass00T.A04(this, i2));
            x2.A0Q(false);
            A092.setOverflowIcon(AnonymousClass00T.A04(this, R.drawable.onboarding_actionbar_overflow_button));
            View findViewById = findViewById(i3);
            if (findViewById != null) {
                findViewById.getViewTreeObserver().addOnScrollChangedListener(new IDxCListenerShape42S0300000_3_I1(this, findViewById, x2, 1));
            }
        }
    }

    public void A3L(int i2, int i3, int i4) {
        A3K(R.drawable.onboarding_actionbar_home_close, i4);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.toolbar);
        TextView textView = (TextView) C13680ns.A0H(LayoutInflater.from(this), viewGroup, R.layout.layout0425);
        C13680ns.A0v(this, textView, i3);
        textView.setText(i2);
        viewGroup.addView(textView);
    }

    public void A3M(Intent intent) {
        intent.putExtra("extra_conversation_message_type", this.A00);
        intent.putExtra("extra_jid", C16030sJ.A03(this.A0E));
        intent.putExtra("extra_receiver_jid", C16030sJ.A03(this.A0G));
        intent.putExtra("extra_quoted_msg_row_id", this.A02);
        intent.putExtra("extra_payment_preset_amount", this.A0i);
        intent.putExtra("extra_transaction_id", this.A0m);
        intent.putExtra("extra_payment_preset_min_amount", this.A0k);
        intent.putExtra("extra_payment_preset_max_amount", this.A0j);
        intent.putExtra("extra_request_message_key", this.A0l);
        intent.putExtra("extra_is_pay_money_only", this.A0r);
        intent.putExtra("extra_payment_note", this.A0h);
        intent.putExtra("extra_payment_background", this.A0C);
        intent.putExtra("extra_payment_sticker", this.A0c);
        intent.putExtra("extra_payment_sticker_send_origin", this.A0e);
        List list = this.A0p;
        if (list != null) {
            intent.putStringArrayListExtra("extra_mentioned_jids", C13680ns.A0n(C16030sJ.A06(list)));
        }
        intent.putExtra("extra_inviter_jid", C16030sJ.A03(this.A0F));
        intent.putExtra("extra_receiver_jid", C16030sJ.A03(this.A0G));
        intent.putExtra("extra_in_setup", this.A0R);
        intent.putExtra("extra_setup_mode", this.A03);
        intent.putExtra("extra_payment_handle", this.A09);
        intent.putExtra("extra_payment_handle_id", this.A0Q);
        intent.putExtra("extra_merchant_code", this.A0K);
        intent.putExtra("extra_transaction_ref", this.A0P);
        intent.putExtra("extra_payee_name", this.A07);
        intent.putExtra("extra_transaction_ref_url", this.A0N);
        intent.putExtra("extra_purpose_code", this.A0M);
        intent.putExtra("extra_initiation_mode", this.A0J);
        intent.putExtra("extra_incoming_pay_request_id", this.A0I);
        intent.putExtra("extra_payment_bank_account_added_in_onboarding", this.A04);
        intent.putExtra("extra_payments_entry_type", this.A02);
        intent.putExtra("extra_is_first_payment_method", this.A0S);
        intent.putExtra("extra_skip_value_props_display", this.A0U);
        intent.putExtra("extra_transaction_type", this.A0n);
        intent.putExtra("extra_transaction_token", this.A0o);
        intent.putExtra("extra_transaction_is_merchant", this.A0q);
        intent.putExtra("extra_transaction_is_valid_merchant", this.A0s);
        intent.putExtra("extra_banner_type", this.A00);
        intent.putExtra("extra_payment_flow_entry_point", this.A01);
        intent.putExtra("extra_referral_screen", this.A0O);
        intent.putExtra("extra_order_type", this.A0g);
        intent.putExtra("extra_payment_config_id", this.A0f);
        intent.putExtra("extra_order_formatted_discount_amount", this.A06);
    }

    public void A3N(Menu menu) {
        if (this.A0C.A0C(732)) {
            MenuItem add = menu.add(0, R.id.menuitem_help, 0, this.A01.A00.getResources().getString(R.string.str1d95));
            add.setIcon(R.drawable.ic_settings_help).setShowAsAction(9);
            C016207s.A00(ColorStateList.valueOf(AnonymousClass00T.A00(this, R.color.color059b)), add);
        }
    }

    public final void A3O(C005302h r6, String str) {
        r6.setPositiveButton(R.string.str05ad, new IDxCListenerShape3S1100000_3_I1(0, str, this));
        r6.setNegativeButton(R.string.str0e87, new IDxCListenerShape24S0000000_3_I1(1));
        r6.A07(true);
        r6.A00();
        this.A0E.AKS(0, 39, str, (String) null);
    }

    public final void A3P(C111805hR r5, AnonymousClass2HJ r6, C119265wo r7, String str) {
        this.A0E.AKS(C13680ns.A0X(), (Integer) null, str, (String) null);
        this.A0C.A7n(this.A0B.A06(r5), true);
        if (this instanceof IndiaUpiDeviceBindStepActivity) {
            IndiaUpiDeviceBindStepActivity indiaUpiDeviceBindStepActivity = (IndiaUpiDeviceBindStepActivity) this;
            if (r6.A00 == 11473) {
                indiaUpiDeviceBindStepActivity.A01 = 1;
                indiaUpiDeviceBindStepActivity.A3b(new C119265wo(R.string.str09b1), true);
            } else {
                indiaUpiDeviceBindStepActivity.A01 = 7;
                indiaUpiDeviceBindStepActivity.A3b(r7, true);
            }
        } else if (this instanceof IndiaUpiBankAccountPickerActivity) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = (IndiaUpiBankAccountPickerActivity) this;
            if (r6.A00 == 11473) {
                indiaUpiBankAccountPickerActivity.A00 = 1;
                indiaUpiBankAccountPickerActivity.A3V(new C119265wo(R.string.str09b1), true);
            } else {
                indiaUpiBankAccountPickerActivity.A00 = 7;
                indiaUpiBankAccountPickerActivity.A3V(r7, true);
            }
        }
        C119365wy r3 = this.A0B;
        ArrayList arrayList = r3.A07;
        if (arrayList != null && arrayList.size() > 1) {
            r3.A01++;
        }
        ArrayList A092 = r3.A09(r5);
        if (A092 != null) {
            int size = A092.size();
            r3.A00 = size;
            int i2 = r3.A02 + 1;
            if (i2 != size) {
                r3.A02 = i2;
                return;
            }
        }
        r3.A02 = 0;
    }

    public void A3Q(String str) {
        Intent intent;
        String str2;
        int i2 = this.A02;
        switch (i2) {
            case 0:
                Log.e("Entry point not provided while onboarding");
            case 6:
            case 11:
                if (!this.A0S) {
                    C35521m4 r1 = this.A04;
                    if (r1 != null) {
                        C111805hR r0 = (C111805hR) r1.A08;
                        if (r0 != null) {
                            if (!AnonymousClass000.A1X(C110105dW.A0d(r0.A05))) {
                                intent = IndiaUpiPinPrimerFullSheetActivity.A02(this, r1, false);
                                C110115dX.A0o(intent, this.A04);
                                break;
                            }
                        } else {
                            str2 = "Invalid bank's country data";
                        }
                    } else {
                        str2 = "Invalid Bank Account added is null";
                    }
                    Log.e(str2);
                    finish();
                    return;
                }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
                A3H();
                intent = C110105dW.A04(this, IndiaUpiPaymentsAccountSetupActivity.class);
                break;
            default:
                Log.i(C13680ns.A0c(i2, "No implementation for payments entry point "));
                return;
        }
        A3H();
        intent = C110105dW.A04(this, IndiaUpiPaymentsAccountSetupActivity.class);
        A3M(intent);
        C110115dX.A0p(intent, this, "extra_previous_screen", str);
    }

    public boolean A3R(C111805hR r7, AnonymousClass2HJ r8, String str) {
        C119265wo r1;
        int i2;
        int i3 = r8.A00;
        if (i3 != 11473) {
            if (i3 == 11474) {
                i2 = R.string.str18cc;
            } else if (i3 != 11484) {
                if (i3 != 11498) {
                    if (i3 != 11500) {
                        if (i3 != 11534) {
                            if (i3 != 20686) {
                                switch (i3) {
                                    case 21143:
                                        break;
                                    case 21144:
                                    case 21145:
                                        break;
                                    default:
                                        switch (i3) {
                                            case 21147:
                                            case 21148:
                                            case 21149:
                                            case 21150:
                                                break;
                                        }
                                }
                            }
                        }
                    }
                    r1 = new C119265wo(i3, str);
                    A3P(r7, r8, r1, "retry_device_binding_on_error");
                    return true;
                }
                this.A0E.AKS(0, (Integer) null, "updated_onboarding_error_strings", (String) null);
                return false;
            } else {
                i2 = R.string.str18cd;
            }
            r1 = new C119265wo(i2);
            A3P(r7, r8, r1, "retry_device_binding_on_error");
            return true;
        } else if (this.A0C.A0C(1685)) {
            A3P(r7, r8, new C119265wo(r8.A00, str), "retry_device_binding_xh_error");
            return true;
        }
        return false;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1000) {
            A3H();
            finish();
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onBackPressed() {
        AnonymousClass1Vo r2 = this.A0V;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this);
        r2.A06(AnonymousClass000.A0h(" onBackPressed", A0o));
        A3H();
        finish();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0V.A06(AnonymousClass000.A0g("onCreate", this));
        this.A0G.A02(new IDxSDetectorShape311S0100000_3_I1(this, 1));
        if (getIntent() != null) {
            boolean z2 = false;
            this.A0R = getIntent().getBooleanExtra("extra_in_setup", false);
            this.A03 = getIntent().getIntExtra("extra_setup_mode", 1);
            this.A09 = (C35301lh) getIntent().getParcelableExtra("extra_payment_handle");
            this.A0Q = getIntent().getStringExtra("extra_payment_handle_id");
            this.A0K = getIntent().getStringExtra("extra_merchant_code");
            this.A0P = getIntent().getStringExtra("extra_transaction_ref");
            this.A07 = (C35301lh) getIntent().getParcelableExtra("extra_payee_name");
            this.A08 = (C35301lh) getIntent().getParcelableExtra("extra_payment_upi_number");
            this.A0N = getIntent().getStringExtra("extra_transaction_ref_url");
            this.A0M = getIntent().getStringExtra("extra_purpose_code");
            this.A0J = getIntent().getStringExtra("extra_initiation_mode");
            this.A0I = getIntent().getStringExtra("extra_incoming_pay_request_id");
            this.A04 = (C35521m4) getIntent().getParcelableExtra("extra_payment_bank_account_added_in_onboarding");
            this.A02 = getIntent().getIntExtra("extra_payments_entry_type", 0);
            this.A0S = getIntent().getBooleanExtra("extra_is_first_payment_method", true);
            this.A0U = getIntent().getBooleanExtra("extra_skip_value_props_display", true);
            this.A00 = getIntent().getIntExtra("extra_banner_type", 0);
            this.A01 = getIntent().getIntExtra("extra_payment_flow_entry_point", 0);
            boolean booleanExtra = getIntent().getBooleanExtra("extra_should_open_transaction_detail_after_send_override", false);
            int i2 = this.A01;
            if (i2 == 2 || i2 == 3 || booleanExtra) {
                z2 = true;
            }
            this.A0t = z2;
            this.A0O = C110115dX.A0b(this);
            this.A0L = getIntent().getStringExtra("extra_previous_screen");
            this.A06 = (C35301lh) getIntent().getParcelableExtra("extra_order_formatted_discount_amount");
        }
        if (this.A0O.A03.A0C(698)) {
            this.A0A.A0A();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        AnonymousClass1Vo r2 = this.A0V;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this);
        r2.A06(AnonymousClass000.A0h(" action bar home", A0o));
        A3H();
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        if (this.A0G.A03()) {
            AnonymousClass5x9.A01(this);
        }
    }
}
