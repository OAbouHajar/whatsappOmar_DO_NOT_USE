package androidx.biometric;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass027;
import X.AnonymousClass0F6;
import X.AnonymousClass0LD;
import X.C001000l;
import X.C005302h;
import X.C005702l;
import X.C006602z;
import X.C05030Oy;
import X.C09420fT;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxCListenerShape124S0100000_I1;
import com.obwhatsapp.R;

public class FingerprintDialogFragment extends DialogFragment {
    public int A00;
    public int A01;
    public ImageView A02;
    public TextView A03;
    public AnonymousClass0F6 A04;
    public final Handler A05 = AnonymousClass000.A0L();
    public final Runnable A06 = new C09420fT(this);

    public void A0w() {
        this.A0V = true;
        this.A05.removeCallbacksAndMessages((Object) null);
    }

    public void A14() {
        this.A0V = true;
        AnonymousClass0F6 r1 = this.A04;
        r1.A01 = 0;
        r1.A06(1);
        this.A04.A07(A0J(R.string.str1ccb));
    }

    public void A17(Bundle bundle) {
        int i2;
        super.A17(bundle);
        C001000l A0C = A0C();
        if (A0C != null) {
            AnonymousClass0F6 r0 = (AnonymousClass0F6) new C006602z(A0C).A01(AnonymousClass0F6.class);
            this.A04 = r0;
            AnonymousClass027 r1 = r0.A0C;
            if (r1 == null) {
                r1 = new AnonymousClass027();
                r0.A0C = r1;
            }
            AnonymousClass01A.A00(this, r1, 6);
            AnonymousClass0F6 r02 = this.A04;
            AnonymousClass027 r12 = r02.A0B;
            if (r12 == null) {
                r12 = new AnonymousClass027();
                r02.A0B = r12;
            }
            AnonymousClass01A.A00(this, r12, 7);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i2 = A1J(AnonymousClass0LD.A00());
        } else {
            Context A0u = A0u();
            i2 = 0;
            if (A0u != null) {
                i2 = AnonymousClass00T.A00(A0u, R.color.color0085);
            }
        }
        this.A00 = i2;
        this.A01 = A1J(16842808);
    }

    public Dialog A1B(Bundle bundle) {
        CharSequence charSequence;
        C005302h r5 = new C005302h(A02());
        C05030Oy r0 = this.A04.A06;
        r5.setTitle(r0 != null ? r0.A03 : null);
        View inflate = LayoutInflater.from(r5.A01.A0O).inflate(R.layout.layout028b, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            C05030Oy r02 = this.A04.A06;
            CharSequence charSequence2 = r02 != null ? r02.A02 : null;
            if (TextUtils.isEmpty(charSequence2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence2);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            if (TextUtils.isEmpty((CharSequence) null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.A02 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.A03 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        AnonymousClass0F6 r2 = this.A04;
        if ((r2.A05() & 32768) != 0) {
            charSequence = A0J(R.string.str1c39);
        } else {
            charSequence = r2.A0G;
            if (charSequence == null) {
                C05030Oy r03 = r2.A06;
                if (r03 != null) {
                    charSequence = r03.A01;
                    if (charSequence == null) {
                        charSequence = "";
                    }
                } else {
                    charSequence = null;
                }
            }
        }
        r5.A08(new IDxCListenerShape124S0100000_I1(this, 0), charSequence);
        r5.setView(inflate);
        C005702l create = r5.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public final int A1J(int i2) {
        Context A0u = A0u();
        C001000l A0C = A0C();
        if (A0u == null || A0C == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        A0u.getTheme().resolveAttribute(i2, typedValue, true);
        TypedArray obtainStyledAttributes = A0C.obtainStyledAttributes(typedValue.data, new int[]{i2});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1K(int r6) {
        /*
            r5 = this;
            android.widget.ImageView r0 = r5.A02
            if (r0 == 0) goto L_0x001b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x001b
            X.0F6 r0 = r5.A04
            int r4 = r0.A01
            android.content.Context r3 = r5.A0u()
            if (r3 != 0) goto L_0x001c
            java.lang.String r1 = "FingerprintFragment"
            java.lang.String r0 = "Unable to get asset. Context is null."
            android.util.Log.w(r1, r0)
        L_0x001b:
            return
        L_0x001c:
            r2 = 1
            if (r4 == 0) goto L_0x004c
            r0 = 2
            if (r4 != r2) goto L_0x004a
            r1 = 2131231315(0x7f080253, float:1.8078708E38)
            if (r6 == r0) goto L_0x002d
            r0 = 3
            if (r6 != r0) goto L_0x001b
        L_0x002a:
            r1 = 2131231316(0x7f080254, float:1.807871E38)
        L_0x002d:
            android.graphics.drawable.Drawable r1 = X.AnonymousClass00T.A04(r3, r1)
            if (r1 == 0) goto L_0x001b
            android.widget.ImageView r0 = r5.A02
            r0.setImageDrawable(r1)
            if (r4 == 0) goto L_0x0042
            r0 = 2
            if (r4 != r2) goto L_0x0047
            if (r6 != r0) goto L_0x0042
        L_0x003f:
            X.AnonymousClass0LC.A00(r1)
        L_0x0042:
            X.0F6 r0 = r5.A04
            r0.A01 = r6
            return
        L_0x0047:
            if (r6 != r2) goto L_0x0042
            goto L_0x003f
        L_0x004a:
            if (r4 != r0) goto L_0x001b
        L_0x004c:
            if (r6 != r2) goto L_0x001b
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.FingerprintDialogFragment.A1K(int):void");
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        AnonymousClass0F6 r2 = this.A04;
        AnonymousClass027 r1 = r2.A0E;
        if (r1 == null) {
            r1 = new AnonymousClass027();
            r2.A0E = r1;
        }
        AnonymousClass0F6.A01(r1, true);
    }
}
