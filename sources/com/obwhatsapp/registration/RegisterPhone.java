package com.obwhatsapp.registration;

import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass10J;
import X.AnonymousClass129;
import X.AnonymousClass12L;
import X.AnonymousClass130;
import X.AnonymousClass15P;
import X.AnonymousClass15W;
import X.AnonymousClass1BN;
import X.AnonymousClass1G1;
import X.AnonymousClass1KO;
import X.AnonymousClass1KP;
import X.AnonymousClass1KQ;
import X.AnonymousClass1NE;
import X.AnonymousClass1RE;
import X.AnonymousClass1SS;
import X.AnonymousClass1ZW;
import X.AnonymousClass293;
import X.AnonymousClass29T;
import X.AnonymousClass2F1;
import X.AnonymousClass2F3;
import X.AnonymousClass2F6;
import X.AnonymousClass2JN;
import X.AnonymousClass2JO;
import X.AnonymousClass2Rf;
import X.AnonymousClass37K;
import X.AnonymousClass39H;
import X.AnonymousClass3MF;
import X.AnonymousClass4OJ;
import X.AnonymousClass5S5;
import X.C004101u;
import X.C005702l;
import X.C05780Sz;
import X.C06240Uy;
import X.C06710Xj;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14770pj;
import X.C14870pt;
import X.C15450qv;
import X.C15800rs;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16620tM;
import X.C16980tz;
import X.C17020u3;
import X.C17130ua;
import X.C17220uj;
import X.C17250um;
import X.C18160wF;
import X.C18260wP;
import X.C18890xQ;
import X.C18900xR;
import X.C18990xa;
import X.C19060xh;
import X.C19070xi;
import X.C19090xk;
import X.C19380yL;
import X.C19490yW;
import X.C19590yg;
import X.C19640yl;
import X.C19760yx;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C26071Mf;
import X.C27851Tj;
import X.C32241fu;
import X.C39851tA;
import X.C41041v8;
import X.C447725m;
import X.C45902Bo;
import X.C46052Cd;
import X.C46592Fb;
import X.C47132Hs;
import X.C49132Rg;
import X.C56392nZ;
import X.C57102q8;
import X.C60022zp;
import X.C82714Dw;
import X.C87424Ws;
import X.C95484mi;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Point;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxDListenerShape158S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape59S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0;
import com.obwhatsapp.IDxTSpanShape14S0200000_1_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.components.PhoneNumberEntry;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RegisterPhone extends AnonymousClass2F3 implements AnonymousClass5S5, AnonymousClass2F6 {
    public static boolean A0d;
    public static boolean A0e;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public Dialog A05;
    public ScrollView A06;
    public TextView A07;
    public C17130ua A08;
    public TextEmojiLabel A09;
    public C19590yg A0A;
    public AnonymousClass1RE A0B;
    public AnonymousClass1SS A0C;
    public C82714Dw A0D;
    public C15800rs A0E;
    public C19380yL A0F;
    public C19090xk A0G;
    public C14770pj A0H;
    public C17020u3 A0I;
    public AnonymousClass39H A0J;
    public AnonymousClass12L A0K;
    public C27851Tj A0L;
    public C19640yl A0M;
    public AnonymousClass37K A0N;
    public AnonymousClass130 A0O;
    public C17220uj A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final C26071Mf A0a;
    public final AnonymousClass2F1 A0b;
    public final C46592Fb A0c;

    public RegisterPhone() {
        this(0);
        this.A00 = 30;
        this.A02 = 0;
        this.A03 = 0;
        this.A04 = 0;
        this.A0c = new C46592Fb();
        this.A0b = new AnonymousClass2F1(this);
        this.A0a = C26071Mf.A00();
    }

    public RegisterPhone(int i2) {
        this.A0U = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 79));
    }

    public void A1q() {
        if (!this.A0U) {
            this.A0U = true;
            C49132Rg r1 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r2 = r1.A1s;
            this.A05 = (C16320sq) r2.ARB.get();
            this.A0C = (C14710pd) r2.A05.get();
            this.A05 = (C14870pt) r2.AB3.get();
            this.A03 = (C16300so) r2.A5p.get();
            this.A04 = (C16180sb) r2.A8b.get();
            this.A0B = (C17250um) r2.A7e.get();
            this.A06 = (C15900s5) r2.ALm.get();
            this.A08 = (AnonymousClass01V) r2.AOi.get();
            this.A0D = (C19950zG) r2.AQV.get();
            this.A09 = (C15860rz) r2.AQh.get();
            this.A07 = (C18260wP) r2.A4p.get();
            this.A0A = (C16290sm) r2.AQk.get();
            this.A05 = (C16440t3) r2.AP2.get();
            this.A0B = (C23061Ai) r2.AC0.get();
            this.A01 = (C16040sK) r2.ADr.get();
            this.A04 = (C16190sc) r2.A8R.get();
            this.A08 = r1.A0K();
            this.A06 = (C14730pf) r2.ANy.get();
            this.A00 = (C19980zJ) r2.A0P.get();
            this.A02 = (C23071Aj) r2.AQb.get();
            this.A03 = (AnonymousClass15P) r2.A0b.get();
            this.A0A = (C19490yW) r2.ALQ.get();
            this.A09 = (C15960sC) r2.AKz.get();
            this.A07 = C16150sX.A0d(r2);
            this.A06 = (C18890xQ) r2.APS.get();
            this.A07 = (C16980tz) r2.AQB.get();
            this.A04 = (C18900xR) r2.ALD.get();
            this.A0K = (AnonymousClass1BN) r2.AAp.get();
            this.A0F = (C18990xa) r2.ADh.get();
            this.A05 = (AnonymousClass1KO) r2.ALY.get();
            this.A03 = (AnonymousClass1G1) r2.AJl.get();
            this.A0M = (C18160wF) r2.A5o.get();
            this.A0D = (AnonymousClass15W) r2.AOC.get();
            this.A0B = (C19070xi) r2.A03.get();
            this.A0C = (C19060xh) r2.A01.get();
            this.A0A = (AnonymousClass10J) r2.A02.get();
            this.A09 = (AnonymousClass1KQ) r2.AAL.get();
            this.A02 = (AnonymousClass129) r2.A3k.get();
            this.A0J = (C19760yx) r2.AKx.get();
            this.A08 = (C16260sj) r2.AQe.get();
            this.A0I = (AnonymousClass1KP) r2.AKw.get();
            this.A08 = (C17130ua) r2.AN9.get();
            this.A0P = (C17220uj) r2.A9x.get();
            this.A0G = (C19090xk) r2.AF1.get();
            this.A0H = (C14770pj) r2.AF9.get();
            this.A0B = (AnonymousClass1RE) r2.A4h.get();
            this.A0E = (C15800rs) r2.A5c.get();
            this.A0K = (AnonymousClass12L) r2.APo.get();
            this.A0F = (C19380yL) r2.AQd.get();
            this.A0D = new C82714Dw((AnonymousClass1NE) r2.A0y.get());
            this.A0L = (C27851Tj) r2.A6u.get();
            this.A0O = (AnonymousClass130) r2.AMn.get();
            this.A0I = (C17020u3) r2.AMG.get();
            this.A0A = (C19590yg) r2.A4Y.get();
            this.A0M = (C19640yl) r2.ACo.get();
            this.A0C = (AnonymousClass1SS) r2.A4S.get();
        }
    }

    public void A36(String str, String str2, String str3) {
        super.A36(str, str2, str3);
        A35(7);
        this.A0K.A04("enter_number", "successful");
        boolean z2 = this.A0G.A02;
        C19760yx r2 = this.A0J;
        if (z2) {
            AnonymousClass2JN.A0G(this, this.A0F, r2, false);
        } else {
            r2.A0A(2);
            startActivity(C14750ph.A05(this));
        }
        finish();
    }

    public void A37() {
        this.A0V = false;
        this.A00 = 30;
        if (this.A07.getVisibility() == 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(150);
            this.A07.startAnimation(alphaAnimation);
            alphaAnimation.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 17));
            return;
        }
        this.A07.setVisibility(8);
    }

    public void A38() {
        A0d = false;
        Editable text = this.A0E.A02.getText();
        String obj = text == null ? null : text.toString();
        Editable text2 = this.A0E.A03.getText();
        String obj2 = text2 == null ? null : text2.toString();
        if (obj == null || obj2 == null || obj.equals("") || AnonymousClass2JN.A0C(this.A03, obj2, obj, this.A0Q) == null) {
            A37();
        } else {
            new C56392nZ(this).start();
        }
    }

    public final void A39() {
        Log.i("register/phone/reset-state");
        this.A0Y = false;
        A35(7);
        AnonymousClass2JN.A0K(this.A09, "");
        AnonymousClass2F3.A0U = 0;
        this.A09.A0u((String) null);
        this.A0J.A0C((String) null, (String) null, (String) null);
        this.A0J.A0A(0);
    }

    public final void A3A() {
        C14870pt r1;
        int i2;
        Log.i("register/phone/whats-my-number/permission-granted");
        C46592Fb r5 = this.A0c;
        r5.A01 = 1;
        TelephonyManager A0N2 = this.A08.A0N();
        boolean z2 = false;
        if (A0N2 != null && A0N2.getSimState() == 1) {
            z2 = true;
        }
        if (z2) {
            Log.i("register/phone/whats-my-number/no-sim");
            r5.A04 = -1;
            r1 = this.A05;
            i2 = R.string.str0e0d;
        } else {
            List A032 = C39851tA.A03(this.A0a, this.A08, this.A08);
            int size = A032.size();
            List A033 = AnonymousClass2JO.A03(this.A03, A032);
            int size2 = A033.size();
            int i3 = 0;
            if (size != size2) {
                i3 = 1;
            }
            r5.A03 = Integer.valueOf(i3);
            r5.A04 = Integer.valueOf(size2);
            if (size2 == 0) {
                Log.i("register/phone/whats-my-number/unable-to-get-phone-number-from-sim");
                r1 = this.A05;
                i2 = R.string.str0e03;
            } else {
                Log.i("register/phone/whats-my-number/show-select-phone-number-dialog");
                this.A0B.A01(this.A0E.A03);
                ArrayList arrayList = new ArrayList(A033);
                SelectPhoneNumberDialog selectPhoneNumberDialog = new SelectPhoneNumberDialog();
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("deviceSimInfoList", arrayList);
                selectPhoneNumberDialog.A0T(bundle);
                Afb(selectPhoneNumberDialog, (String) null);
                return;
            }
        }
        r1.A09(i2, 1);
    }

    public final void A3B(boolean z2) {
        String str;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        int i2;
        Intent A0E2;
        boolean z3 = false;
        A35(0);
        StringBuilder sb = new StringBuilder("registerPhone/startVerifySms useSmsRetriever ");
        boolean z4 = z2;
        sb.append(z4);
        sb.append(", shouldStartBanAppealFlowForBlockedUser ");
        sb.append(this.A0Y);
        sb.append(", flashType ");
        sb.append(AnonymousClass2F3.A0T);
        sb.append(", waOldEligible ");
        sb.append(AnonymousClass2F3.A0Y);
        Log.i(sb.toString());
        if (AnonymousClass2F3.A0X != null) {
            this.A0J.A0A(12);
            j2 = this.A02;
            j3 = this.A03;
            j4 = this.A04;
            str = AnonymousClass2F3.A0X;
        } else {
            if (this.A0Y) {
                this.A0J.A0A(9);
                j5 = this.A02;
                j6 = this.A03;
                j7 = 0;
                i2 = 3;
            } else if (this.A0R) {
                int i3 = this.A00;
                C19760yx r1 = this.A0J;
                if (i3 == 1) {
                    r1.A0A(14);
                    A0E2 = C14750ph.A0E(this, this.A02, this.A03, false, z4);
                    startActivity(A0E2);
                    finish();
                }
                r1.A0A(13);
                j5 = this.A02;
                j6 = this.A03;
                j7 = 0;
                i2 = 1;
            } else {
                C19760yx r2 = this.A0J;
                int i4 = 4;
                if (AnonymousClass2F3.A0Y) {
                    i4 = 15;
                }
                r2.A0A(i4);
                float A012 = this.A0A.A01(C16620tM.A02, 2638);
                str = null;
                j2 = this.A02;
                j3 = this.A03;
                j4 = this.A04;
                if (A012 != 0.0f) {
                    z3 = true;
                }
            }
            A0E2 = C14750ph.A0A(this, i2, j5, j6, j7, false, z4, false);
            startActivity(A0E2);
            finish();
        }
        A0E2 = C14750ph.A0h(this, str, AnonymousClass2F3.A0T, j2, j3, j4, z4, z3, false, false, AnonymousClass2F3.A0Y);
        startActivity(A0E2);
        finish();
    }

    public void AQn() {
    }

    public void ATy(String str, String str2, String str3, byte[] bArr) {
        this.A02 = (AnonymousClass2JN.A02(str, 0) * 1000) + System.currentTimeMillis();
        this.A03 = (AnonymousClass2JN.A02(str2, 0) * 1000) + System.currentTimeMillis();
        this.A04 = (AnonymousClass2JN.A02(str3, 0) * 1000) + System.currentTimeMillis();
        if (!this.A0G.A02) {
            AnonymousClass29T.A01(this, 21);
        }
    }

    public void Aao() {
        if (AnonymousClass2F3.A0Y || this.A08.A03("android.permission.RECEIVE_SMS") == 0) {
            Log.i("registerphone/proceedWithoutSmsRetriever/NOT requesting RECEIVE_SMS permission");
            A3B(false);
            return;
        }
        Log.i("registerphone/proceedWithoutSmsRetriever/requesting RECEIVE_SMS permission");
        AnonymousClass2JN.A0J(this, 1);
    }

    public void Ag9() {
        A3B(true);
    }

    public SharedPreferences getPreferences(int i2) {
        return this.A0I.A00(getLocalClassName());
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 0) {
            if (i3 == -1) {
                AnonymousClass2F3.A0V = intent.getStringExtra("cc");
                String stringExtra = intent.getStringExtra("iso");
                String stringExtra2 = intent.getStringExtra("country_name");
                this.A0E.A02.setText(AnonymousClass2F3.A0V);
                this.A0E.A04.setText(stringExtra2);
                this.A0E.A05.A02(stringExtra);
                SharedPreferences preferences = getPreferences(0);
                SharedPreferences.Editor edit = preferences.edit();
                edit.putString("com.obwhatsapp.registration.RegisterPhone.input_country_code", AnonymousClass2F3.A0V);
                edit.putString("com.obwhatsapp.registration.RegisterPhone.country_code", AnonymousClass2F3.A0V);
                if (preferences.getInt("com.obwhatsapp.registration.RegisterPhone.phone_number_position", -1) == -1) {
                    edit.putInt("com.obwhatsapp.registration.RegisterPhone.phone_number_position", Integer.MAX_VALUE);
                }
                edit.putInt("com.obwhatsapp.registration.RegisterPhone.country_code_position", -1);
                if (!edit.commit()) {
                    Log.w("registerphone/actresult/commit failed");
                }
            }
            this.A0X = false;
        } else if (i2 == 1) {
            StringBuilder sb = new StringBuilder("register/phone/sms permission ");
            sb.append(i3 == -1 ? "granted" : "denied");
            Log.i(sb.toString());
            A3B(false);
        } else if (i2 != 155) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            this.A0Q = C39851tA.A01(this.A08, this.A07, this.A08);
            A3A();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        String str3;
        String str4;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        setContentView((int) R.layout.layout04f9);
        if (C16260sj.A01(this.A07.A00)) {
            String[] strArr = {"android.permission.POST_NOTIFICATIONS"};
            RequestPermissionActivity.A0Q(this.A09, strArr);
            AnonymousClass00T.A0F(this, strArr, 2);
        } else if (C15450qv.A0B()) {
            C41041v8.A00(getApplicationContext(), this.A08);
        }
        if (this.A0C.A00() == C47132Hs.TABLET) {
            ((ViewStub) findViewById(R.id.tablet_beta_label_stub)).inflate();
        }
        this.A09.A0t((String) null);
        this.A09.A0w((String) null);
        this.A09.A0y((String) null);
        this.A09.A1G(false);
        this.A09.A1Q(false);
        Context applicationContext = getApplicationContext();
        C15860rz r0 = this.A09;
        if (applicationContext != null) {
            C06240Uy r6 = new C06240Uy(applicationContext);
            C95484mi r8 = new C95484mi(r6, r0);
            if (r6.A03()) {
                C05780Sz.A00("Service connection is valid. No need to re-initialize.");
                r8.ASH(0);
            } else {
                int i2 = r6.A00;
                if (i2 == 1) {
                    str3 = "Client is already in the process of connecting to the service.";
                } else if (i2 == 3) {
                    str3 = "Client was already closed and can't be reused. Please create another instance.";
                } else {
                    C05780Sz.A00("Starting install referrer service setup.");
                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                    Context context = r6.A03;
                    List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                        r6.A00 = 0;
                        str = "Install Referrer service unavailable on device.";
                    } else {
                        String str5 = serviceInfo.packageName;
                        String str6 = serviceInfo.name;
                        if ("com.android.vending".equals(str5) && str6 != null) {
                            try {
                                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                                    Intent intent2 = new Intent(intent);
                                    C06710Xj r02 = new C06710Xj(r6, r8);
                                    r6.A01 = r02;
                                    try {
                                        if (context.bindService(intent2, r02, 1)) {
                                            str = "Service was bonded successfully.";
                                        } else {
                                            str2 = "Connection to service is blocked.";
                                            C05780Sz.A01(str2);
                                            r6.A00 = 0;
                                        }
                                    } catch (SecurityException unused) {
                                        str2 = "No permission to connect to service.";
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                        str2 = "Play Store missing or incompatible. Version 8.3.73 or later required.";
                        C05780Sz.A01(str2);
                        r6.A00 = 0;
                    }
                    C05780Sz.A00(str);
                }
                C05780Sz.A01(str3);
            }
            this.A0J = new AnonymousClass39H(this.A08, this.A01, this.A09, this.A0D, this.A0P, this.A05);
            this.A0Q = C39851tA.A01(this.A08, this.A07, this.A08);
            if (bundle != null) {
                this.A0Y = bundle2.getBoolean("shouldStartBanAppealForBlockedUser");
            }
            if (this.A09.A00() != 1) {
                Log.e("register/phone/create/wrong-state bounce to main");
                startActivity(C14750ph.A04(this));
                finish();
                return;
            }
            AnonymousClass2JN.A0H(this.A00, this, this.A01, false, false);
            ((TextView) findViewById(R.id.register_phone_toolbar_title)).setText(R.string.str138b);
            Intent intent3 = getIntent();
            if (intent3.getExtras() != null) {
                if (intent3.getBooleanExtra("com.obwhatsapp.registration.RegisterPhone.show_underage_account_ban_dialog", false)) {
                    AnonymousClass29T.A01(this, 125);
                }
                if (intent3.getBooleanExtra("com.obwhatsapp.registration.RegisterPhone.resetstate", false)) {
                    A39();
                }
                this.A0T = intent3.getBooleanExtra("com.obwhatsapp.registration.RegisterPhone.clear_phone_number", false);
                if (!(intent3.getStringExtra("com.obwhatsapp.registration.RegisterPhone.country_code") == null || intent3.getStringExtra("com.obwhatsapp.registration.RegisterPhone.phone_number") == null)) {
                    getPreferences(0).edit().putString("com.obwhatsapp.registration.RegisterPhone.input_phone_number", intent3.getStringExtra("com.obwhatsapp.registration.RegisterPhone.phone_number")).putString("com.obwhatsapp.registration.RegisterPhone.input_country_code", intent3.getStringExtra("com.obwhatsapp.registration.RegisterPhone.country_code")).apply();
                }
                if (intent3.getBooleanExtra("com.obwhatsapp.registration.RegisterPhone.tapped_sms_link", false)) {
                    Log.i("register/phone/link/instructions/dialog");
                    Afh(getString(R.string.str13aa, new Object[]{getString(R.string.str0e87)}));
                }
            } else {
                this.A0T = false;
            }
            AnonymousClass4OJ r4 = new AnonymousClass4OJ();
            this.A0E = r4;
            r4.A05 = (PhoneNumberEntry) findViewById(R.id.registration_fields);
            AnonymousClass4OJ r5 = this.A0E;
            PhoneNumberEntry phoneNumberEntry = r5.A05;
            phoneNumberEntry.A04 = new C60022zp(this);
            r5.A02 = phoneNumberEntry.A02;
            r5.A04 = (TextView) findViewById(R.id.registration_country);
            this.A0E.A04.setBackground(new C447725m(AnonymousClass00T.A04(this, R.drawable.abc_spinner_textfield_background_material), this.A01));
            AnonymousClass4OJ r42 = this.A0E;
            WaEditText waEditText = r42.A05.A03;
            r42.A03 = waEditText;
            C45902Bo.A03(waEditText);
            if (this.A01.A0T()) {
                this.A0E.A05.setPadding(getResources().getDimensionPixelSize(R.dimen.dimen0154), this.A0E.A05.getPaddingTop(), this.A0E.A05.getPaddingRight(), this.A0E.A05.getPaddingBottom());
            }
            this.A06 = (ScrollView) findViewById(R.id.scroll_view);
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.registration_info);
            this.A09 = textEmojiLabel;
            textEmojiLabel.A07 = new AnonymousClass3MF();
            TextEmojiLabel textEmojiLabel2 = this.A09;
            textEmojiLabel2.setAccessibilityHelper(new C57102q8(textEmojiLabel2, this.A08));
            TextEmojiLabel textEmojiLabel3 = this.A09;
            C23071Aj r82 = this.A02;
            String string = getString(R.string.str17bd);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(string));
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, string.length(), URLSpan.class);
            if (uRLSpanArr != null) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    spannableStringBuilder.setSpan(new IDxTSpanShape14S0200000_1_I0(this, r82.A00, r82.A01, r82.A02, this, r82, uRLSpan.getURL(), 0), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
                }
                for (URLSpan removeSpan : uRLSpanArr) {
                    spannableStringBuilder.removeSpan(removeSpan);
                }
            }
            textEmojiLabel3.setText(spannableStringBuilder);
            this.A09.setVisibility(8);
            TextView textView = (TextView) findViewById(R.id.mistyped_undercard_text);
            this.A07 = textView;
            textView.setVisibility(8);
            if (getPreferences(0).getString("com.obwhatsapp.registration.RegisterPhone.input_country_code", (String) null) == null) {
                TelephonyManager A0N2 = this.A08.A0N();
                if (A0N2 == null) {
                    str4 = "register/phone tm=null";
                } else {
                    String simCountryIso = A0N2.getSimCountryIso();
                    if (simCountryIso != null) {
                        try {
                            String A042 = this.A03.A04(simCountryIso);
                            if (A042 != null) {
                                SharedPreferences.Editor edit = getPreferences(0).edit();
                                edit.putString("com.obwhatsapp.registration.RegisterPhone.input_country_code", A042);
                                if (!edit.commit()) {
                                    str4 = "register/phone/input_cc/commit failed";
                                }
                            }
                        } catch (IOException e2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("register/phone/iso: ");
                            sb.append(simCountryIso);
                            sb.append(" failed to lookupCallingCode from CountryPhoneInfo");
                            Log.e(sb.toString(), e2);
                        }
                    }
                }
                Log.w(str4);
            }
            this.A0E.A04.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 29));
            this.A0E.A03.requestFocus();
            this.A0E.A03.setCursorVisible(true);
            String str7 = AnonymousClass2F3.A0V;
            if (str7 != null) {
                this.A0E.A02.setText(str7);
            }
            String charSequence = this.A0E.A04.getText().toString();
            if (charSequence.length() > 0) {
                this.A0E.A05.A02(charSequence);
            }
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getSize(point);
            if (point.y <= 480) {
                getWindow().setSoftInputMode(3);
            }
            if (this.A04.A03()) {
                Log.w("register/phone/clock-wrong");
                C46052Cd.A02(this, this.A0G, this.A0H);
            } else if (this.A04.A02()) {
                Log.w("register/phone/sw-expired");
                C46052Cd.A03(this, this.A0G, this.A0H);
            }
            View A052 = AnonymousClass00T.A05(this, R.id.registration_submit);
            A052.setOnClickListener(new ViewOnClickCListenerShape2S0100000_I0_2(this, 30));
            this.A06.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape59S0200000_2_I0(this, 1, A052));
            Log.i("register/phone/whats-my-number/enabled");
            TextEmojiLabel textEmojiLabel4 = (TextEmojiLabel) findViewById(R.id.description);
            textEmojiLabel4.A07 = new AnonymousClass3MF();
            textEmojiLabel4.setAccessibilityHelper(new C57102q8(textEmojiLabel4, this.A08));
            textEmojiLabel4.setText(AnonymousClass2JN.A08(new RunnableRunnableShape13S0100000_I0_12((Object) this, 26), getString(R.string.str138f), "whats-my-number"));
            textEmojiLabel4.setLinkTextColor(AnonymousClass00T.A00(this, R.color.color04f8));
            findViewById(R.id.carrier_charge_warning).setVisibility(0);
            this.A0A.A02(this.A0b);
            this.A0K.A02("enter_number");
            return;
        }
        throw new IllegalArgumentException("Please provide a valid Context.");
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 != 21) {
            return super.onCreateDialog(i2);
        }
        Log.i("register/phone/dialog/num_confirm");
        boolean z2 = this.A0Q;
        int i3 = R.string.str1390;
        if (z2) {
            i3 = R.string.str1637;
        }
        String string = getString(i3, new Object[]{this.A01.A0H(AnonymousClass2JN.A0E(AnonymousClass2F3.A0V, AnonymousClass2F3.A0W))});
        C32241fu r3 = new C32241fu(this);
        r3.A06(AnonymousClass1ZW.A01(string, new Object[0]));
        r3.A07(false);
        boolean z3 = this.A0Q;
        int i4 = R.string.str0e87;
        if (z3) {
            i4 = R.string.str1638;
        }
        r3.setPositiveButton(i4, new IDxCListenerShape127S0100000_2_I0(this, 96));
        r3.A0B(new IDxCListenerShape127S0100000_2_I0(this, 95), R.string.str1378);
        C005702l create = r3.create();
        create.setOnDismissListener(new IDxDListenerShape158S0100000_2_I0(this, 2));
        this.A05 = create;
        return create;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A0A.A06()) {
            C47132Hs A002 = this.A0C.A00();
            C47132Hs r1 = C47132Hs.PHONE;
            int i2 = R.string.str0c2a;
            if (A002 == r1) {
                i2 = R.string.str0c2b;
            }
            menu.add(0, 7, 0, i2);
        }
        menu.add(0, 5, 0, R.string.str13df);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        if (this.A0N != null) {
            Log.i("register/phone/destroy canceling task");
            this.A0N.A06(true);
            this.A0N = null;
        }
        this.A0J.A00();
        this.A0A.A03(this.A0b);
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("com.obwhatsapp.registration.RegisterPhone.tapped_sms_link", false)) {
            Log.i("register/phone/newintent/link/instructions/dialog");
            Afh(getString(R.string.str13aa, new Object[]{getString(R.string.str0e87)}));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String obj;
        switch (menuItem.getItemId()) {
            case 0:
                this.A0J.A08();
                startActivity(C14750ph.A01(this));
                finishAffinity();
                return true;
            case 1:
                String replaceAll = this.A0E.A02.getText().toString().replaceAll("\\D", "");
                String replaceAll2 = this.A0E.A03.getText().toString().replaceAll("\\D", "");
                byte[] A0D2 = C004101u.A0D();
                StringBuilder sb = new StringBuilder();
                sb.append(replaceAll);
                sb.append(replaceAll2);
                C004101u.A0B(this, AnonymousClass293.A00(sb.toString()), A0D2);
                return true;
            case 2:
                C004101u.A08(this);
                return true;
            case 3:
                this.A05.Acl(new RunnableRunnableShape13S0100000_I0_12((Object) this, 27));
                return true;
            case 4:
                String replaceAll3 = this.A0E.A02.getText().toString().replaceAll("\\D", "");
                String replaceAll4 = this.A0E.A03.getText().toString().replaceAll("\\D", "");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(replaceAll3);
                sb2.append(replaceAll4);
                byte[] A0G2 = C004101u.A0G(this, AnonymousClass293.A00(sb2.toString()));
                StringBuilder sb3 = new StringBuilder("register-phone rc=");
                if (A0G2 == null) {
                    obj = "(null)";
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    int length = A0G2.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        sb4.append(String.format("%02X", new Object[]{Byte.valueOf(A0G2[i2])}));
                    }
                    obj = sb4.toString();
                }
                sb3.append(obj);
                Log.i(sb3.toString());
                return true;
            case 5:
                this.A0K.A03(this.A0P ? "validNumber" : "notValidNumber");
                this.A0K.A03(this.A0O ? "emptyNumber" : "notEmptyNumber");
                this.A0K.A02("register-phone");
                this.A0J.A01(this, this.A0K, "register-phone");
                return true;
            case 6:
                startActivity(new Intent().setClassName(this, "com.obwhatsapp.DebugToolsActivity"));
                return true;
            case 7:
                this.A0B.A00(2);
                this.A0K.A04("enter_number", "tapped");
                Context context = this.A07.A00;
                Intent intent = new Intent();
                intent.setClassName(context.getPackageName(), "com.obwhatsapp.companionmode.registration.RegisterAsCompanionActivity");
                intent.putExtra("entry_point", "entry_phone_reg");
                startActivity(intent);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public void onPause() {
        super.onPause();
        C87424Ws r1 = this.A0G;
        r1.A02 = true;
        AnonymousClass2JN.A0K(r1.A04, AnonymousClass2JN.A00);
        StringBuilder sb = new StringBuilder("register/phone/pause ");
        sb.append(AnonymousClass2F3.A0S);
        Log.i(sb.toString());
        SharedPreferences.Editor edit = getPreferences(0).edit();
        edit.putString("com.obwhatsapp.registration.RegisterPhone.country_code", AnonymousClass2F3.A0V);
        edit.putString("com.obwhatsapp.registration.RegisterPhone.phone_number", AnonymousClass2F3.A0W);
        edit.putInt("com.obwhatsapp.registration.RegisterPhone.verification_state", AnonymousClass2F3.A0S);
        edit.putString("com.obwhatsapp.registration.RegisterPhone.input_phone_number", this.A0E.A03.getText().toString());
        edit.putString("com.obwhatsapp.registration.RegisterPhone.input_country_code", this.A0E.A02.getText().toString());
        edit.putInt("com.obwhatsapp.registration.RegisterPhone.country_code_position", AnonymousClass2JN.A00(this.A0E.A02));
        edit.putInt("com.obwhatsapp.registration.RegisterPhone.phone_number_position", AnonymousClass2JN.A00(this.A0E.A03));
        if (!edit.commit()) {
            Log.w("register/phone/pause/commit failed");
        }
    }

    public void onResume() {
        super.onResume();
        this.A0G.A00();
        SharedPreferences preferences = getPreferences(0);
        AnonymousClass2F3.A0V = preferences.getString("com.obwhatsapp.registration.RegisterPhone.country_code", (String) null);
        AnonymousClass2F3.A0W = preferences.getString("com.obwhatsapp.registration.RegisterPhone.phone_number", (String) null);
        AnonymousClass2F3.A0S = preferences.getInt("com.obwhatsapp.registration.RegisterPhone.verification_state", 7);
        if (this.A0T) {
            this.A0T = false;
            this.A0E.A03.setText("");
        } else {
            String string = preferences.getString("com.obwhatsapp.registration.RegisterPhone.input_phone_number", (String) null);
            this.A0E.A03.setText(string);
            if (!TextUtils.isEmpty(string)) {
                this.A0O = false;
                this.A0P = true;
            }
        }
        this.A0E.A02.setText(preferences.getString("com.obwhatsapp.registration.RegisterPhone.input_country_code", (String) null));
        if (TextUtils.isEmpty(this.A0E.A02.getText())) {
            this.A0E.A02.requestFocus();
        }
        AnonymousClass2JN.A0I(this.A0E.A03, preferences.getInt("com.obwhatsapp.registration.RegisterPhone.phone_number_position", -1));
        AnonymousClass2JN.A0I(this.A0E.A02, preferences.getInt("com.obwhatsapp.registration.RegisterPhone.country_code_position", -1));
        StringBuilder sb = new StringBuilder("register/phone/resume ");
        sb.append(AnonymousClass2F3.A0S);
        Log.i(sb.toString());
        if (AnonymousClass2F3.A0S == 15) {
            if (AnonymousClass2F3.A0V == null || AnonymousClass2F3.A0W == null) {
                Log.i("register/phone/reset-state");
                A35(7);
            } else {
                AnonymousClass29T.A01(this, 21);
            }
        }
        this.A0F.A03(1, (String) null);
        this.A0J.A0A(1);
        C15800rs r1 = this.A0E;
        r1.A00.A0C();
        ArrayList arrayList = r1.A01;
        synchronized (arrayList) {
            arrayList.clear();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldStartBanAppealForBlockedUser", this.A0Y);
    }
}
