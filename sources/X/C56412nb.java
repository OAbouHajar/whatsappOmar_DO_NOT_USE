package X;

import android.content.res.Resources;
import android.os.CountDownTimer;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.VerifyPhoneNumber;

/* renamed from: X.2nb  reason: invalid class name and case insensitive filesystem */
public class C56412nb extends CountDownTimer {
    public final /* synthetic */ int A00;
    public final /* synthetic */ VerifyPhoneNumber A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56412nb(VerifyPhoneNumber verifyPhoneNumber, int i2, long j2, boolean z2) {
        super(j2, 1000);
        this.A01 = verifyPhoneNumber;
        this.A00 = i2;
        this.A02 = z2;
    }

    public void onFinish() {
        int i2 = this.A00;
        VerifyPhoneNumber verifyPhoneNumber = this.A01;
        if (i2 == 0) {
            verifyPhoneNumber.A0B = 0;
            verifyPhoneNumber.A0s.A00(true);
            verifyPhoneNumber.A0H = null;
            if (AnonymousClass3AS.A00(verifyPhoneNumber.A35())) {
                verifyPhoneNumber.A3R(1);
            }
        } else if (i2 != 1) {
            verifyPhoneNumber.A0D = 0;
            verifyPhoneNumber.A0t.A00(true);
            verifyPhoneNumber.A0J = null;
        } else {
            verifyPhoneNumber.A0C = 0;
            verifyPhoneNumber.A0r.A00(true);
            verifyPhoneNumber.A0I = null;
        }
    }

    public void onTick(long j2) {
        VerifyPhoneNumber verifyPhoneNumber;
        C86194Rq r4;
        String string;
        int i2;
        TextView textView;
        String A04;
        int i3 = this.A00;
        if (i3 != 1) {
            verifyPhoneNumber = this.A01;
            if (i3 != 2) {
                verifyPhoneNumber.A0B = j2;
                r4 = verifyPhoneNumber.A0s;
                string = verifyPhoneNumber.A39();
                boolean A48 = verifyPhoneNumber.A48();
                i2 = R.plurals.plurals017b;
                if (A48) {
                    i2 = R.plurals.plurals017d;
                }
            } else {
                verifyPhoneNumber.A0D = j2;
                r4 = verifyPhoneNumber.A0t;
                string = verifyPhoneNumber.getString(R.string.str199f);
                i2 = R.plurals.plurals017c;
            }
        } else {
            verifyPhoneNumber = this.A01;
            verifyPhoneNumber.A0C = j2;
            r4 = verifyPhoneNumber.A0r;
            string = verifyPhoneNumber.getString(R.string.str19a9);
            i2 = R.plurals.plurals017e;
        }
        if (!this.A02) {
            r4.A02.setText(string);
            r4.A03.setVisibility(8);
            return;
        }
        if (j2 > 3600000) {
            int ceil = (int) Math.ceil(((double) j2) / 3600000.0d);
            Resources A002 = C16980tz.A00(verifyPhoneNumber.A0h);
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, ceil, 0);
            A04 = A002.getQuantityString(i2, ceil, objArr);
            textView = r4.A02;
        } else {
            r4.A02.setText(string);
            textView = r4.A03;
            textView.setVisibility(0);
            A04 = C28961Zl.A04(verifyPhoneNumber.A01, C13690nt.A09(j2));
        }
        textView.setText(A04);
    }
}
