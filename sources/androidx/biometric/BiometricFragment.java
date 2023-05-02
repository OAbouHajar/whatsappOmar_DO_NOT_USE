package androidx.biometric;

import X.AnonymousClass000;
import X.AnonymousClass01A;
import X.AnonymousClass024;
import X.AnonymousClass027;
import X.AnonymousClass02C;
import X.AnonymousClass04m;
import X.AnonymousClass050;
import X.AnonymousClass0DH;
import X.AnonymousClass0EG;
import X.AnonymousClass0F6;
import X.AnonymousClass0L9;
import X.AnonymousClass0LF;
import X.AnonymousClass0OL;
import X.AnonymousClass0PY;
import X.AnonymousClass0SR;
import X.AnonymousClass0ST;
import X.AnonymousClass0V2;
import X.AnonymousClass0Wh;
import X.C001000l;
import X.C006602z;
import X.C009304k;
import X.C009404l;
import X.C04730Nr;
import X.C05030Oy;
import X.C07080Zb;
import X.C09380fP;
import X.C09390fQ;
import X.C09400fR;
import X.C09410fS;
import X.C09730fz;
import X.C10160gg;
import X.C10840hm;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.R;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class BiometricFragment extends AnonymousClass01A {
    public Handler A00 = AnonymousClass000.A0L();
    public AnonymousClass0F6 A01;

    public static boolean A01(Context context, String str) {
        if (Build.VERSION.SDK_INT != 28 || str == null) {
            return false;
        }
        for (String startsWith : context.getResources().getStringArray(R.array.array0013)) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public void A0q() {
        this.A0V = true;
        if (Build.VERSION.SDK_INT == 29) {
            AnonymousClass0F6 r4 = this.A01;
            if ((r4.A05() & 32768) != 0) {
                r4.A0M = true;
                this.A00.postDelayed(new C09410fS(r4), 250);
            }
        }
    }

    public void A0x(int i2, int i3, Intent intent) {
        super.A0x(i2, i3, intent);
        if (i2 == 1) {
            this.A01.A0J = false;
            if (i3 == -1) {
                A1I(new C04730Nr((AnonymousClass0Wh) null, 1));
                return;
            }
            A1H(10, A0J(R.string.str1cdd));
            A19();
        }
    }

    public void A15() {
        this.A0V = true;
        if (Build.VERSION.SDK_INT < 29 && !this.A01.A0J) {
            C001000l A0C = A0C();
            if (A0C == null || !A0C.isChangingConfigurations()) {
                A1F(0);
            }
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        C001000l A0C = A0C();
        if (A0C != null) {
            AnonymousClass0F6 r0 = (AnonymousClass0F6) new C006602z(A0C).A01(AnonymousClass0F6.class);
            this.A01 = r0;
            AnonymousClass027 r1 = r0.A0A;
            if (r1 == null) {
                r1 = new AnonymousClass027();
                r0.A0A = r1;
            }
            AnonymousClass01A.A00(this, r1, 0);
            AnonymousClass0F6 r02 = this.A01;
            AnonymousClass027 r12 = r02.A08;
            if (r12 == null) {
                r12 = new AnonymousClass027();
                r02.A08 = r12;
            }
            AnonymousClass01A.A00(this, r12, 1);
            AnonymousClass0F6 r03 = this.A01;
            AnonymousClass027 r13 = r03.A09;
            if (r13 == null) {
                r13 = new AnonymousClass027();
                r03.A09 = r13;
            }
            AnonymousClass01A.A00(this, r13, 2);
            AnonymousClass0F6 r04 = this.A01;
            AnonymousClass027 r14 = r04.A0D;
            if (r14 == null) {
                r14 = new AnonymousClass027();
                r04.A0D = r14;
            }
            AnonymousClass01A.A00(this, r14, 3);
            AnonymousClass0F6 r05 = this.A01;
            AnonymousClass027 r15 = r05.A0F;
            if (r15 == null) {
                r15 = new AnonymousClass027();
                r05.A0F = r15;
            }
            AnonymousClass01A.A00(this, r15, 4);
            AnonymousClass0F6 r06 = this.A01;
            AnonymousClass027 r16 = r06.A0E;
            if (r16 == null) {
                r16 = new AnonymousClass027();
                r06.A0E = r16;
            }
            AnonymousClass01A.A00(this, r16, 5);
        }
    }

    public void A19() {
        this.A01.A0N = false;
        A1C();
        if (!this.A01.A0J && A0c()) {
            AnonymousClass050 r1 = new AnonymousClass050(A0G());
            r1.A07(this);
            r1.A00(true);
        }
        Context A0u = A0u();
        if (A0u != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String equals : A0u.getResources().getStringArray(R.array.notification_template_lines_media)) {
                    if (str.equals(equals)) {
                        AnonymousClass0F6 r12 = this.A01;
                        r12.A0K = true;
                        this.A00.postDelayed(new C09400fR(r12), 600);
                        return;
                    }
                }
            }
        }
    }

    public void A1A() {
        if (Build.VERSION.SDK_INT < 21) {
            Log.e("BiometricFragment", "Failed to check device credential. Not supported prior to API 21.");
        } else {
            A1D();
        }
    }

    public void A1B() {
        int i2;
        String str;
        int i3;
        if (this.A01.A0N) {
            return;
        }
        if (A0u() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        AnonymousClass0F6 r2 = this.A01;
        r2.A0N = true;
        r2.A0I = true;
        if (A1L()) {
            Context applicationContext = A02().getApplicationContext();
            C009304k r6 = new C009304k(applicationContext);
            if (!r6.A06()) {
                i2 = 12;
            } else if (!r6.A05()) {
                i2 = 11;
            } else if (A0c()) {
                this.A01.A0L = true;
                if (!A01(applicationContext, Build.MODEL)) {
                    this.A00.postDelayed(new C09380fP(this), 500);
                    new FingerprintDialogFragment().A1G(A0G(), "androidx.biometric.FingerprintDialogFragment");
                }
                AnonymousClass0F6 r22 = this.A01;
                r22.A00 = 0;
                AnonymousClass0Wh r3 = r22.A05;
                AnonymousClass04m r5 = null;
                if (r3 != null) {
                    Cipher cipher = r3.A02;
                    if (cipher != null) {
                        r5 = new AnonymousClass04m(cipher);
                    } else {
                        Signature signature = r3.A01;
                        if (signature != null) {
                            r5 = new AnonymousClass04m(signature);
                        } else {
                            Mac mac = r3.A03;
                            if (mac != null) {
                                r5 = new AnonymousClass04m(mac);
                            } else if (Build.VERSION.SDK_INT >= 30 && r3.A00() != null) {
                                Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                            }
                        }
                    }
                }
                AnonymousClass0F6 r7 = this.A01;
                AnonymousClass0OL r1 = r7.A07;
                if (r1 == null) {
                    r1 = new AnonymousClass0OL();
                    r7.A07 = r1;
                }
                AnonymousClass024 r32 = r1.A01;
                if (r32 == null) {
                    r32 = new AnonymousClass024();
                    r1.A01 = r32;
                }
                AnonymousClass0PY r23 = r7.A03;
                if (r23 == null) {
                    r23 = new AnonymousClass0PY(new AnonymousClass0DH(r7));
                    r7.A03 = r23;
                }
                C009404l r12 = r23.A01;
                if (r12 == null) {
                    r12 = new AnonymousClass0EG(r23);
                    r23.A01 = r12;
                }
                try {
                    r6.A04(r12, r5, r32);
                    return;
                } catch (NullPointerException e2) {
                    Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e2);
                    i2 = 1;
                    if (applicationContext != null) {
                        i3 = R.string.str1ccc;
                    }
                }
            } else {
                return;
            }
            if (applicationContext != null) {
                i3 = 11 != i2 ? R.string.str1ccd : R.string.str1ccf;
                str = applicationContext.getString(i3);
                A1H(i2, str);
                A19();
                return;
            }
            str = "";
            A1H(i2, str);
            A19();
            return;
        }
        A1E();
    }

    public final void A1C() {
        this.A01.A0N = false;
        if (A0c()) {
            AnonymousClass02C A0G = A0G();
            DialogFragment dialogFragment = (DialogFragment) A0G.A0B("androidx.biometric.FingerprintDialogFragment");
            if (dialogFragment == null) {
                return;
            }
            if (dialogFragment.A0c()) {
                dialogFragment.A1D();
                return;
            }
            AnonymousClass050 r1 = new AnonymousClass050(A0G);
            r1.A07(dialogFragment);
            r1.A00(true);
        }
    }

    public final void A1D() {
        CharSequence charSequence;
        CharSequence charSequence2;
        int i2;
        int i3;
        C001000l A0C = A0C();
        if (A0C == null) {
            Log.e("BiometricFragment", "Failed to check device credential. Client FragmentActivity not found.");
            return;
        }
        KeyguardManager A002 = AnonymousClass0ST.A00(A0C);
        if (A002 == null) {
            i2 = 12;
            i3 = R.string.str1cdc;
        } else {
            C05030Oy r0 = this.A01.A06;
            if (r0 != null) {
                charSequence = r0.A03;
                charSequence2 = r0.A02;
            } else {
                charSequence = null;
                charSequence2 = null;
            }
            if (charSequence2 == null) {
                charSequence2 = null;
            }
            Intent A003 = AnonymousClass0L9.A00(A002, charSequence, charSequence2);
            if (A003 == null) {
                i2 = 14;
                i3 = R.string.str1cdb;
            } else {
                this.A01.A0J = true;
                if (A1L()) {
                    A1C();
                }
                A003.setFlags(134742016);
                startActivityForResult(A003, 1);
                return;
            }
        }
        A1H(i2, A0J(i3));
        A19();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r1 != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1E() {
        /*
            r8 = this;
            android.content.Context r0 = r8.A02()
            android.content.Context r0 = r0.getApplicationContext()
            android.hardware.biometrics.BiometricPrompt$Builder r4 = X.AnonymousClass0X6.A00(r0)
            X.0F6 r0 = r8.A01
            X.0Oy r0 = r0.A06
            if (r0 == 0) goto L_0x0020
            java.lang.CharSequence r1 = r0.A03
            java.lang.CharSequence r0 = r0.A02
            if (r1 == 0) goto L_0x001b
            X.AnonymousClass0X6.A06(r4, r1)
        L_0x001b:
            if (r0 == 0) goto L_0x0020
            X.AnonymousClass0X6.A05(r4, r0)
        L_0x0020:
            X.0F6 r0 = r8.A01
            java.lang.CharSequence r3 = r0.A0G
            if (r3 != 0) goto L_0x0030
            X.0Oy r0 = r0.A06
            if (r0 == 0) goto L_0x00c7
            java.lang.CharSequence r3 = r0.A01
            if (r3 != 0) goto L_0x0030
            java.lang.String r3 = ""
        L_0x0030:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0051
            X.0F6 r0 = r8.A01
            java.util.concurrent.Executor r2 = r0.A0H
            if (r2 != 0) goto L_0x0041
            X.0hm r2 = new X.0hm
            r2.<init>()
        L_0x0041:
            X.0F6 r1 = r8.A01
            android.content.DialogInterface$OnClickListener r0 = r1.A02
            if (r0 != 0) goto L_0x004e
            X.0Xg r0 = new X.0Xg
            r0.<init>(r1)
            r1.A02 = r0
        L_0x004e:
            X.AnonymousClass0X6.A02(r0, r4, r3, r2)
        L_0x0051:
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r3 < r2) goto L_0x0066
            X.0F6 r0 = r8.A01
            X.0Oy r0 = r0.A06
            if (r0 == 0) goto L_0x0062
            boolean r1 = r0.A04
            r0 = 0
            if (r1 == 0) goto L_0x0063
        L_0x0062:
            r0 = 1
        L_0x0063:
            X.AnonymousClass0SP.A00(r4, r0)
        L_0x0066:
            X.0F6 r0 = r8.A01
            int r1 = r0.A05()
            r0 = 30
            if (r3 < r0) goto L_0x00b9
            X.AnonymousClass0LA.A00(r4, r1)
        L_0x0073:
            android.hardware.biometrics.BiometricPrompt r7 = X.AnonymousClass0X6.A01(r4)
            android.content.Context r6 = r8.A0u()
            X.0F6 r0 = r8.A01
            X.0Wh r0 = r0.A05
            android.hardware.biometrics.BiometricPrompt$CryptoObject r5 = X.AnonymousClass0SR.A00(r0)
            X.0F6 r1 = r8.A01
            X.0OL r0 = r1.A07
            if (r0 != 0) goto L_0x0090
            X.0OL r0 = new X.0OL
            r0.<init>()
            r1.A07 = r0
        L_0x0090:
            android.os.CancellationSignal r4 = r0.A00
            if (r4 != 0) goto L_0x009b
            android.os.CancellationSignal r4 = new android.os.CancellationSignal
            r4.<init>()
            r0.A00 = r4
        L_0x009b:
            X.0hl r3 = new X.0hl
            r3.<init>()
            X.0F6 r2 = r8.A01
            X.0PY r1 = r2.A03
            if (r1 != 0) goto L_0x00b2
            X.0DH r0 = new X.0DH
            r0.<init>(r2)
            X.0PY r1 = new X.0PY
            r1.<init>(r0)
            r2.A03 = r1
        L_0x00b2:
            android.hardware.biometrics.BiometricPrompt$AuthenticationCallback r0 = r1.A00()
            if (r5 != 0) goto L_0x00ce
            goto L_0x00ca
        L_0x00b9:
            if (r3 < r2) goto L_0x0073
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            X.AnonymousClass0SP.A01(r4, r0)
            goto L_0x0073
        L_0x00c7:
            r3 = 0
            goto L_0x0030
        L_0x00ca:
            X.AnonymousClass0X6.A04(r0, r7, r4, r3)     // Catch:{ NullPointerException -> 0x00d2 }
            return
        L_0x00ce:
            X.AnonymousClass0X6.A03(r0, r5, r7, r4, r3)     // Catch:{ NullPointerException -> 0x00d2 }
            goto L_0x00ee
        L_0x00d2:
            r2 = move-exception
            java.lang.String r1 = "BiometricFragment"
            java.lang.String r0 = "Got NPE while authenticating with biometric prompt."
            android.util.Log.e(r1, r0, r2)
            if (r6 == 0) goto L_0x00eb
            r0 = 2131893323(0x7f121c4b, float:1.942142E38)
            java.lang.String r1 = r6.getString(r0)
        L_0x00e3:
            r0 = 1
            r8.A1H(r0, r1)
            r8.A19()
            return
        L_0x00eb:
            java.lang.String r1 = ""
            goto L_0x00e3
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A1E():void");
    }

    public void A1F(int i2) {
        if (i2 == 3 || !this.A01.A0M) {
            if (A1L()) {
                this.A01.A00 = i2;
                if (i2 == 1) {
                    Context A0u = A0u();
                    A1H(10, A0u == null ? "" : A0u.getString(R.string.str1cd0));
                }
            }
            AnonymousClass0F6 r0 = this.A01;
            AnonymousClass0OL r4 = r0.A07;
            if (r4 == null) {
                r4 = new AnonymousClass0OL();
                r0.A07 = r4;
            }
            CancellationSignal cancellationSignal = r4.A00;
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.cancel();
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e2);
                }
                r4.A00 = null;
            }
            AnonymousClass024 r02 = r4.A01;
            if (r02 != null) {
                try {
                    r02.A01();
                } catch (NullPointerException e3) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e3);
                }
                r4.A01 = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        if (r1 != 3) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00db, code lost:
        if (A01(r1, android.os.Build.MODEL) == false) goto L_0x00dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1G(int r5, java.lang.CharSequence r6) {
        /*
            r4 = this;
            switch(r5) {
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0003;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x0005;
                case 15: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r5 = 8
        L_0x0005:
            android.content.Context r2 = r4.A0u()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0032
            r0 = 29
            if (r1 >= r0) goto L_0x0032
            r0 = 7
            if (r5 == r0) goto L_0x001a
            r0 = 9
            if (r5 != r0) goto L_0x0032
        L_0x001a:
            if (r2 == 0) goto L_0x0032
            boolean r0 = X.AnonymousClass0ST.A01(r2)
            if (r0 == 0) goto L_0x0032
            X.0F6 r0 = r4.A01
            int r1 = r0.A05()
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0032
            r4.A1D()
            return
        L_0x0032:
            boolean r0 = r4.A1L()
            if (r0 == 0) goto L_0x0088
            if (r6 != 0) goto L_0x0042
            android.content.Context r2 = r4.A0u()
            if (r2 != 0) goto L_0x0055
            java.lang.String r6 = ""
        L_0x0042:
            r1 = 5
            X.0F6 r0 = r4.A01
            if (r5 != r1) goto L_0x00a2
            int r1 = r0.A00
            if (r1 == 0) goto L_0x004e
            r0 = 3
            if (r1 != r0) goto L_0x0051
        L_0x004e:
            r4.A1H(r5, r6)
        L_0x0051:
            r4.A19()
            return
        L_0x0055:
            r1 = 1
            r0 = 2131893452(0x7f121ccc, float:1.942168E38)
            if (r5 == r1) goto L_0x0073
            r0 = 7
            if (r5 == r0) goto L_0x0084
            switch(r5) {
                case 9: goto L_0x0084;
                case 10: goto L_0x0080;
                case 11: goto L_0x007c;
                case 12: goto L_0x0078;
                default: goto L_0x0061;
            }
        L_0x0061:
            java.lang.String r0 = "Unknown error code: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r1 = X.AnonymousClass000.A0l(r0, r5)
            java.lang.String r0 = "BiometricUtils"
            android.util.Log.e(r0, r1)
            r0 = 2131893323(0x7f121c4b, float:1.942142E38)
        L_0x0073:
            java.lang.String r6 = r2.getString(r0)
            goto L_0x0042
        L_0x0078:
            r0 = 2131893453(0x7f121ccd, float:1.9421683E38)
            goto L_0x0073
        L_0x007c:
            r0 = 2131893455(0x7f121ccf, float:1.9421687E38)
            goto L_0x0073
        L_0x0080:
            r0 = 2131893456(0x7f121cd0, float:1.942169E38)
            goto L_0x0073
        L_0x0084:
            r0 = 2131893454(0x7f121cce, float:1.9421685E38)
            goto L_0x0073
        L_0x0088:
            if (r6 != 0) goto L_0x004e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            r0 = 2131893323(0x7f121c4b, float:1.942142E38)
            java.lang.String r0 = r4.A0J(r0)
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r6 = X.AnonymousClass000.A0l(r1, r5)
            goto L_0x004e
        L_0x00a2:
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x00b2
            r4.A1H(r5, r6)
            r4.A19()
        L_0x00ac:
            X.0F6 r1 = r4.A01
            r0 = 1
            r1.A0L = r0
            return
        L_0x00b2:
            r2 = r6
            if (r6 != 0) goto L_0x00bc
            r0 = 2131893323(0x7f121c4b, float:1.942142E38)
            java.lang.String r2 = r4.A0J(r0)
        L_0x00bc:
            X.0F6 r1 = r4.A01
            r0 = 2
            r1.A06(r0)
            X.0F6 r0 = r4.A01
            r0.A07(r2)
            android.os.Handler r3 = r4.A00
            X.0gh r2 = new X.0gh
            r2.<init>(r4, r6, r5)
            android.content.Context r1 = r4.A0u()
            if (r1 == 0) goto L_0x00dd
            java.lang.String r0 = android.os.Build.MODEL
            boolean r1 = A01(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x00df
        L_0x00dd:
            r0 = 2000(0x7d0, float:2.803E-42)
        L_0x00df:
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricFragment.A1G(int, java.lang.CharSequence):void");
    }

    public final void A1H(int i2, CharSequence charSequence) {
        AnonymousClass0F6 r2 = this.A01;
        if (r2.A0J) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
        } else if (!r2.A0I) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            r2.A0I = false;
            Executor executor = r2.A0H;
            if (executor == null) {
                executor = new C10840hm();
            }
            executor.execute(new C10160gg(this, charSequence, i2));
        }
    }

    public final void A1I(C04730Nr r3) {
        AnonymousClass0F6 r1 = this.A01;
        if (!r1.A0I) {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        } else {
            r1.A0I = false;
            Executor executor = r1.A0H;
            if (executor == null) {
                executor = new C10840hm();
            }
            executor.execute(new C09730fz(this, r3));
        }
        A19();
    }

    public void A1J(C05030Oy r7) {
        AnonymousClass0Wh r5 = null;
        C001000l A0C = A0C();
        if (A0C == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        AnonymousClass0F6 r2 = this.A01;
        r2.A06 = r7;
        int i2 = r7.A00;
        if (i2 == 0) {
            boolean z2 = r7.A05;
            i2 = MotionEventCompat.ACTION_MASK;
            if (z2) {
                i2 = 33023;
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23 && i3 < 30 && i2 == 15) {
            r5 = AnonymousClass0SR.A01();
        }
        r2.A05 = r5;
        boolean A1K = A1K();
        AnonymousClass0F6 r1 = this.A01;
        String str = null;
        if (A1K) {
            str = A0J(R.string.str1c39);
        }
        r1.A0G = str;
        if (i3 >= 21 && A1K() && new AnonymousClass0V2(new C07080Zb(A0C)).A03(MotionEventCompat.ACTION_MASK) != 0) {
            this.A01.A0I = true;
            A1D();
        } else if (this.A01.A0K) {
            this.A00.postDelayed(new C09390fQ(this), 600);
        } else {
            A1B();
        }
    }

    public boolean A1K() {
        return Build.VERSION.SDK_INT <= 28 && (this.A01.A05() & 32768) != 0;
    }

    public final boolean A1L() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            return true;
        }
        C001000l A0C = A0C();
        if (A0C != null && this.A01.A05 != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            if (i2 != 28) {
                return false;
            }
            if (str != null) {
                for (String equalsIgnoreCase : A0C.getResources().getStringArray(R.array.notification_template_custom_big)) {
                    if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                        return true;
                    }
                }
            }
            if (str2 != null) {
                for (String startsWith : A0C.getResources().getStringArray(R.array.notification_template_big_media_narrow_custom)) {
                    if (str2.startsWith(startsWith)) {
                        return true;
                    }
                }
            }
        } else if (i2 != 28) {
            return false;
        }
        return !AnonymousClass0LF.A00(A0u());
    }
}
