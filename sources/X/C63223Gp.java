package X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.obwhatsapp.R;
import com.obwhatsapp.identity.IdentityVerificationActivity;
import com.obwhatsapp.qrcode.WaQrScannerView;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: X.3Gp  reason: invalid class name and case insensitive filesystem */
public class C63223Gp implements C109465Sf {
    public final /* synthetic */ IdentityVerificationActivity A00;

    public C63223Gp(IdentityVerificationActivity identityVerificationActivity) {
        this.A00 = identityVerificationActivity;
    }

    public void ANz(int i2) {
        C14870pt r1;
        int i3;
        Log.e("idverification/cameraerror");
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        if (identityVerificationActivity.A0D.A02()) {
            r1 = identityVerificationActivity.A05;
            i3 = R.string.str083d;
        } else {
            if (i2 != 2) {
                r1 = identityVerificationActivity.A05;
                i3 = R.string.str03aa;
            }
            identityVerificationActivity.A3C((Runnable) null);
        }
        r1.A09(i3, 1);
        identityVerificationActivity.A3C((Runnable) null);
    }

    public void AVG() {
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        WaQrScannerView waQrScannerView = identityVerificationActivity.A0R;
        if (waQrScannerView != null && waQrScannerView.getVisibility() == 0) {
            if (identityVerificationActivity.findViewById(R.id.main_layout).getVisibility() != 8) {
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
                identityVerificationActivity.A04 = translateAnimation;
                translateAnimation.setInterpolator(new AccelerateInterpolator());
                identityVerificationActivity.A04.setDuration((long) identityVerificationActivity.getResources().getInteger(17694721));
                identityVerificationActivity.findViewById(R.id.main_layout).startAnimation(identityVerificationActivity.A04);
                C13680ns.A1I(identityVerificationActivity, R.id.scan_code, 8);
                C13680ns.A1I(identityVerificationActivity, R.id.result, 8);
                C30551cZ.A00(identityVerificationActivity.A04, this, 5);
                C13680ns.A1I(identityVerificationActivity, R.id.main_layout, 8);
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) identityVerificationActivity.getResources().getInteger(17694720));
            identityVerificationActivity.findViewById(R.id.verify_identity_qr_tip).startAnimation(alphaAnimation);
            identityVerificationActivity.findViewById(R.id.verify_identity_qr_tip).setVisibility(0);
        }
    }

    public void AVV(C86844Uj r8) {
        TextView textView;
        int i2;
        int i3;
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        Animation animation = identityVerificationActivity.A04;
        if (animation == null || animation.hasEnded()) {
            String str = r8.A02;
            if (str != null) {
                try {
                    byte[] bytes = str.getBytes("ISO-8859-1");
                    int A35 = identityVerificationActivity.A35(bytes);
                    Arrays.toString(bytes);
                    String A0C = identityVerificationActivity.A0F.A0C(identityVerificationActivity.A0K);
                    if (A35 != -4) {
                        if (A35 == -3) {
                            textView = identityVerificationActivity.A07;
                            i2 = R.string.str1996;
                        } else if (A35 != -2) {
                            if (A35 == 1) {
                                i3 = 44;
                            } else if (A35 == 2) {
                                i3 = 48;
                            } else {
                                return;
                            }
                            identityVerificationActivity.A3C(new RunnableRunnableShape9S0100000_I0_8(identityVerificationActivity, i3));
                            return;
                        } else {
                            textView = identityVerificationActivity.A07;
                            i2 = R.string.str1995;
                        }
                        textView.setText(C13680ns.A0d(identityVerificationActivity, A0C, new Object[1], 0, i2));
                        identityVerificationActivity.A07.setVisibility(0);
                    }
                } catch (UnsupportedEncodingException unused) {
                    identityVerificationActivity.A0R.AcJ();
                    return;
                }
            }
            identityVerificationActivity.A0R.AcJ();
        }
    }
}
