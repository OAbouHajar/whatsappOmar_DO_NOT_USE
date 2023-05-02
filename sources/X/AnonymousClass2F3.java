package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape161S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.RegisterPhone;
import com.obwhatsapp.registration.report.BanReportViewModel;
import com.obwhatsapp.youbasha.ui.YoSettings.HideMedia;
import com.whatsapp.util.Log;

/* renamed from: X.2F3  reason: invalid class name */
public abstract class AnonymousClass2F3 extends AnonymousClass2F4 implements AnonymousClass2F5 {
    public static int A0S = 7;
    public static int A0T;
    public static long A0U;
    public static String A0V;
    public static String A0W;
    public static String A0X;
    public static boolean A0Y;
    public int A00;
    public ProgressDialog A01;
    public AnonymousClass129 A02;
    public AnonymousClass1G1 A03;
    public C18900xR A04;
    public AnonymousClass1KO A05;
    public C18890xQ A06;
    public C16980tz A07;
    public C16260sj A08;
    public AnonymousClass1KQ A09;
    public AnonymousClass10J A0A;
    public C19070xi A0B;
    public C19060xh A0C;
    public AnonymousClass15W A0D;
    public AnonymousClass4OJ A0E;
    public C18990xa A0F;
    public C87424Ws A0G;
    public C31621el A0H;
    public AnonymousClass1KP A0I;
    public C19760yx A0J;
    public AnonymousClass1BN A0K;
    public BanReportViewModel A0L;
    public C18160wF A0M;
    public String A0N;
    public boolean A0O = true;
    public boolean A0P = false;
    public boolean A0Q;
    public boolean A0R;

    public void A35(int i2) {
        if (this instanceof RegisterPhone) {
            A0S = i2;
            SharedPreferences.Editor edit = ((RegisterPhone) this).getPreferences(0).edit();
            edit.putInt("com.obwhatsapp.registration.RegisterPhone.verification_state", A0S);
            if (!edit.commit()) {
                Log.w("registerphone/savestate/commit failed");
            }
        }
    }

    public void A36(String str, String str2, String str3) {
        Log.i("EnterPhoneNumber/registrationHasBeenVerified");
        this.A0J.A0C(str, str2, str3);
        this.A05.Acl(new RunnableRunnableShape13S0100000_I0_12((Object) this, 15));
        this.A0F.A04(false);
    }

    public void Afp() {
        AnonymousClass29T.A01(this, 9);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C434920f.A04(this, R.color.color04f1);
        this.A0G = new C87424Ws(this, this.A09);
        BanReportViewModel banReportViewModel = (BanReportViewModel) new C006602z(this).A01(BanReportViewModel.class);
        this.A0L = banReportViewModel;
        banReportViewModel.A01.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, (int) HideMedia.IMAGES));
        this.A0L.A02.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 221));
    }

    public Dialog onCreateDialog(int i2) {
        ProgressDialog progressDialog;
        int i3;
        int i4 = i2;
        if (i4 == 9) {
            ProgressDialog progressDialog2 = new ProgressDialog(this);
            progressDialog2.setMessage(getString(R.string.str1376));
            progressDialog2.setIndeterminate(true);
            progressDialog2.setCancelable(false);
            this.A01 = progressDialog2;
            return progressDialog2;
        } else if (i4 == 22) {
            Log.w("enterphone/dialog/unrecoverable-error");
            StringBuilder sb = new StringBuilder("register-phone2 +");
            sb.append(A0V);
            sb.append(A0W);
            String obj = sb.toString();
            C32241fu r3 = new C32241fu(this);
            r3.A01(R.string.str13b0);
            r3.setPositiveButton(R.string.str1377, new C91224fZ(this, obj));
            r3.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(this, 93));
            return r3.create();
        } else if (i4 == 109) {
            C16320sq r0 = this.A05;
            return AnonymousClass2JN.A03(this, this.A05, this.A07, this.A08, this.A08, this.A0D, this.A0I, r0);
        } else if (i4 != 114) {
            switch (i2) {
                case 124:
                    return AnonymousClass2JN.A04(this, this.A05, this.A01, this.A0D, (Runnable) null, A0V, A0W);
                case 125:
                    return AnonymousClass2JN.A05(this, this.A05, this.A0D, A0V, A0W);
                case 126:
                    AnonymousClass1KO r11 = this.A05;
                    AnonymousClass013 r12 = this.A01;
                    AnonymousClass15W r13 = this.A0D;
                    String str = A0V;
                    String str2 = A0W;
                    return AnonymousClass2JN.A0A(this.A00, this, this.A05, r11, r12, r13, this.A0H, (Runnable) null, str, str2);
                case 127:
                    progressDialog = new ProgressDialog(this);
                    i3 = R.string.str13b3;
                    break;
                case 128:
                    return AnonymousClass2JN.A06(this, (Runnable) null, new RunnableRunnableShape13S0100000_I0_12((Object) this, 19), new RunnableRunnableShape13S0100000_I0_12((Object) this, 16));
                case 129:
                    progressDialog = new ProgressDialog(this);
                    i3 = R.string.str13c8;
                    break;
                case 130:
                    AnonymousClass013 r4 = this.A01;
                    String str3 = A0V;
                    String str4 = A0W;
                    RunnableRunnableShape13S0100000_I0_12 runnableRunnableShape13S0100000_I0_12 = new RunnableRunnableShape13S0100000_I0_12((Object) this, 17);
                    int A002 = AnonymousClass47M.A00(this.A0H.A02);
                    String A0H2 = r4.A0H(AnonymousClass2JN.A0E(str3, str4));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(A0H2);
                    sb2.append("\n\n");
                    sb2.append(getString(A002));
                    SpannableString spannableString = new SpannableString(sb2.toString());
                    spannableString.setSpan(new StyleSpan(1), 0, A0H2.length() + 2, 33);
                    View inflate = LayoutInflater.from(this).inflate(R.layout.layout03ed, (ViewGroup) null);
                    C32241fu r42 = new C32241fu(this);
                    r42.A06(spannableString);
                    r42.setView(inflate);
                    r42.A07(false);
                    TextView textView = (TextView) C004601z.A0E(inflate, R.id.button3);
                    TextView textView2 = (TextView) C004601z.A0E(inflate, R.id.button1);
                    TextView textView3 = (TextView) C004601z.A0E(inflate, R.id.button2);
                    textView.setVisibility(0);
                    textView.setText(R.string.str0e87);
                    textView2.setVisibility(0);
                    textView2.setText(R.string.str13cb);
                    textView3.setVisibility(0);
                    textView3.setText(R.string.str13c9);
                    textView.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 47, (Object) null));
                    textView2.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 45));
                    textView3.setOnClickListener(new ViewOnClickCListenerShape2S0300000_I0(this, runnableRunnableShape13S0100000_I0_12, (Object) null, 7));
                    return r42.create();
                default:
                    return super.onCreateDialog(i4);
            }
            progressDialog.setMessage(getString(i3));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else {
            C16440t3 r14 = this.A05;
            C18890xQ r122 = this.A06;
            C59162ux r8 = new C59162ux(this, this.A00, this.A04, r122, this.A08, r14, this.A01);
            r8.setOnCancelListener(new IDxCListenerShape161S0100000_2_I0(this, 1));
            return r8;
        }
    }

    public void onPause() {
        super.onPause();
        C87424Ws r1 = this.A0G;
        r1.A02 = true;
        AnonymousClass2JN.A0K(r1.A04, AnonymousClass2JN.A00);
    }

    public void onResume() {
        super.onResume();
        this.A0G.A00();
    }
}
