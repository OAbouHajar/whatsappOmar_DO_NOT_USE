package X;

import android.widget.ImageView;
import com.facebook.redex.IDxBListenerShape101S0200000_2_I0;
import com.facebook.redex.IDxFListenerShape364S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape103S0200000_2_I0;
import com.obwhatsapp.R;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Pd  reason: invalid class name and case insensitive filesystem */
public class C26781Pd {
    public int A00 = Integer.MAX_VALUE;
    public C59472yL A01;
    public boolean A02 = false;
    public final C14870pt A03;
    public final C17130ua A04;
    public final C16980tz A05;
    public final C14710pd A06;
    public final C16490t9 A07;
    public final C20330zs A08;
    public final C19040xf A09;
    public final Set A0A;

    public C26781Pd(C14870pt r2, C17130ua r3, C16980tz r4, C14710pd r5, C16490t9 r6, C20330zs r7, C19040xf r8) {
        this.A05 = r4;
        this.A06 = r5;
        this.A03 = r2;
        this.A04 = r3;
        this.A07 = r6;
        this.A09 = r8;
        this.A08 = r7;
        this.A0A = new HashSet();
        A00();
    }

    public void A00() {
        File file = new File(this.A05.A00.getCacheDir(), "linked_account_images");
        C62713Eq r3 = new C62713Eq(this.A00);
        C14710pd r4 = this.A06;
        C59472yL r0 = new C59472yL(this.A03, this.A04, r3, r4, this.A07, this.A08, this.A09, file, "linked-account-image-loader", 4);
        this.A01 = r0;
        r3.A00 = r0;
    }

    public void A01(ImageView imageView, C35691mL r15, C108515Oh r16, C108535Oj r17, int i2) {
        C35691mL r6 = r15;
        ImageView imageView2 = imageView;
        C62723Er r4 = new C62723Er(imageView2, r6, new IDxBListenerShape101S0200000_2_I0(r16, 1, this), new IDxFListenerShape364S0100000_2_I0(r15, 0), new IDxSListenerShape103S0200000_2_I0(r17, 0, this), i2, Integer.MAX_VALUE, Integer.MAX_VALUE);
        if (this.A01 == null) {
            A00();
        }
        if (this.A01 != null) {
            if (r4.ACj() != null) {
                r4.ACj().setTag(R.id.image_id, r4.A05.A04);
                r4.ACj().setTag(R.id.image_quality, Integer.valueOf(r4.A04));
                if (!r4.AGp().equals(r4.ACj().getTag(R.id.loaded_image_url))) {
                    r4.ACj().setTag(R.id.loaded_image_url, (Object) null);
                }
            }
            this.A01.A01(r4, true);
        }
    }

    public void A02(C62723Er r3) {
        r3.A03 = true;
        C59472yL r0 = this.A01;
        if (r0 != null) {
            r0.A00(r3);
        }
        List list = r3.A02;
        if (list != null && list.size() > 0) {
            for (C62723Er A022 : r3.A02) {
                A02(A022);
            }
        }
    }

    public void finalize() {
        super.finalize();
    }
}
