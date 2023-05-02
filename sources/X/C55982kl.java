package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxFCallbackShape339S0100000_1_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1;
import java.io.File;

/* renamed from: X.2kl  reason: invalid class name and case insensitive filesystem */
public abstract class C55982kl extends C005602k {
    public C55982kl(View view) {
        super(view);
    }

    public void A07() {
        C27371Rm r13;
        AnonymousClass32J r5;
        if (this instanceof AnonymousClass32I) {
            AnonymousClass32I r3 = (AnonymousClass32I) this;
            if (r3.A00 == null) {
                ImageView imageView = r3.A04;
                imageView.setOnClickListener((View.OnClickListener) null);
                r3.A03.setOnClickListener((View.OnClickListener) null);
                imageView.setVisibility(8);
                return;
            }
            ViewOnClickCListenerShape5S0100000_I1_1 viewOnClickCListenerShape5S0100000_I1_1 = new ViewOnClickCListenerShape5S0100000_I1_1(r3, 28);
            ImageView imageView2 = r3.A04;
            imageView2.setOnClickListener(viewOnClickCListenerShape5S0100000_I1_1);
            ViewGroup viewGroup = r3.A03;
            viewGroup.setOnClickListener(viewOnClickCListenerShape5S0100000_I1_1);
            viewGroup.setContentDescription(viewGroup.getContext().getString(R.string.str09b8));
            WaImageView waImageView = r3.A05;
            if (waImageView != null) {
                C93544jN r6 = r3.A00;
                C93534jM r1 = r6.A01;
                int i2 = r1.A01;
                if (i2 <= 0) {
                    i2 = r6.A02.A01;
                }
                int i3 = r1.A00;
                if (i3 <= 0) {
                    i3 = r6.A02.A00;
                }
                if (i2 == 0 || i3 == 0) {
                    i3 = 1;
                    i2 = 1;
                }
                StringBuilder sb = new StringBuilder("h,");
                sb.append(i2);
                sb.append(":");
                sb.append(i3);
                String obj = sb.toString();
                AnonymousClass06X r0 = (AnonymousClass06X) waImageView.getLayoutParams();
                r0.A0t = obj;
                waImageView.setLayoutParams(r0);
            }
            imageView2.setVisibility(0);
            imageView2.setImageDrawable(new ColorDrawable(13421772));
            if (r3.A09 == null) {
                r3.A07.A02(imageView2, r3.A00.A03.A02);
                return;
            }
            String str = r3.A00.A02.A02;
            r3.A02 = str;
            C25841Li r4 = r3.A07;
            IDxFCallbackShape339S0100000_1_I1 iDxFCallbackShape339S0100000_1_I1 = new IDxFCallbackShape339S0100000_1_I1(r3, 1);
            AnonymousClass00B.A01();
            AnonymousClass00B.A01();
            if (r4.A0F) {
                r13 = (C27371Rm) r4.A0E.get();
            } else {
                C27371Rm r132 = r4.A00;
                r13 = r132;
                if (r132 == null) {
                    C37661pW A00 = r4.A04.A00("gif_preview_obj_store", 256);
                    r4.A00 = A00;
                    r13 = A00;
                }
            }
            AnonymousClass20S A9Y = r13.A9Y(str);
            if (A9Y != null) {
                String str2 = A9Y.A00;
                if (new File(str2).exists() && A9Y.A02 != null) {
                    iDxFCallbackShape339S0100000_1_I1.ARL(new File(str2), str, A9Y.A02);
                    r5 = null;
                    r3.A01 = r5;
                }
            }
            Mp4Ops mp4Ops = r4.A07;
            r5 = new AnonymousClass32J(r4.A03, mp4Ops, r4.A08, r4.A09, r4.A0A, r4.A0B, iDxFCallbackShape339S0100000_1_I1, r13, str);
            r5.A02.executeOnExecutor(r4.A01(), new Void[0]);
            r3.A01 = r5;
        }
    }

    public void A08() {
        if (this instanceof AnonymousClass32I) {
            AnonymousClass32I r3 = (AnonymousClass32I) this;
            C16690tT r1 = r3.A01;
            if (r1 != null) {
                r1.A06(false);
                r3.A01 = null;
            }
            AnonymousClass4MI r12 = r3.A09;
            if (r12 != null) {
                AnonymousClass0Aj r0 = r12.A00;
                if (r0 != null) {
                    r0.stop();
                    r12.A00 = null;
                }
                C41911wr r02 = r12.A01;
                if (r02 != null) {
                    r02.close();
                    r12.A01 = null;
                }
                r12.A03.setImageDrawable((Drawable) null);
            }
            r3.A02 = null;
        }
    }

    public void A09() {
    }

    public void A0A(boolean z2) {
    }

    public void A0B(boolean z2) {
    }

    public boolean A0C() {
        return this instanceof AnonymousClass32I;
    }
}
