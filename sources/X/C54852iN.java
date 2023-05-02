package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxBLoaderShape91S0200000_2_I0;
import com.facebook.redex.IDxBRecipientShape30S0300000_1_I0;
import com.obwhatsapp.R;
import java.util.List;
import java.util.Set;

/* renamed from: X.2iN  reason: invalid class name and case insensitive filesystem */
public class C54852iN extends AnonymousClass01X {
    public AnonymousClass2BC A00;
    public final Context A01;
    public final C29251aI A02;
    public final AnonymousClass2OM A03;
    public final AnonymousClass01D A04;
    public final List A05;
    public final Set A06;

    public C54852iN(Context context, C29251aI r3, AnonymousClass2OM r4, AnonymousClass01D r5, List list, Set set) {
        this.A01 = context;
        this.A06 = set;
        this.A05 = list;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        A0B(true);
    }

    public /* bridge */ /* synthetic */ void A07(C005602k r3) {
        C54482hb r1 = ((C57752rh) r3).A04;
        r1.setImageDrawable((Drawable) null);
        r1.A00 = null;
    }

    public int A0C() {
        AnonymousClass2BC r0 = this.A00;
        int i2 = 0;
        int count = r0 == null ? 0 : r0.getCount();
        if (((Boolean) this.A04.get()).booleanValue()) {
            i2 = this.A05.size();
        }
        return count + i2;
    }

    public long A0D(int i2) {
        AnonymousClass2BF A0E = A0E(i2);
        if (A0E == null) {
            return 0;
        }
        return (long) C61883Au.A02(A0E).hashCode();
    }

    public final AnonymousClass2BF A0E(int i2) {
        AnonymousClass2BC r1;
        if (this.A00 == null) {
            return null;
        }
        if (((Boolean) this.A04.get()).booleanValue()) {
            List list = this.A05;
            if (i2 < list.size()) {
                return (AnonymousClass2BF) list.get(i2);
            }
            r1 = this.A00;
            i2 -= list.size();
        } else {
            r1 = this.A00;
        }
        return r1.ADR(i2);
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r7, int i2) {
        boolean z2;
        C57752rh r72 = (C57752rh) r7;
        AnonymousClass2BF A0E = A0E(i2);
        C54482hb r4 = r72.A04;
        r4.setMediaItem(A0E);
        r4.A00 = null;
        r4.setId(R.id.thumb);
        AnonymousClass2OM r3 = r72.A03;
        r3.A01((AnonymousClass2OV) r4.getTag());
        if (A0E != null) {
            r4.setScaleType(ImageView.ScaleType.CENTER_CROP);
            C004601z.A0n(r4, A0E.A9L().toString());
            IDxBLoaderShape91S0200000_2_I0 iDxBLoaderShape91S0200000_2_I0 = new IDxBLoaderShape91S0200000_2_I0(r72, 0, A0E);
            r4.setTag(iDxBLoaderShape91S0200000_2_I0);
            r3.A02(iDxBLoaderShape91S0200000_2_I0, new IDxBRecipientShape30S0300000_1_I0(r72, A0E, iDxBLoaderShape91S0200000_2_I0, 0));
            z2 = r72.A05.contains(r4.getUri());
        } else {
            r4.setScaleType(ImageView.ScaleType.CENTER);
            C004601z.A0n(r4, (String) null);
            r4.setBackgroundColor(r72.A00);
            r4.setImageDrawable((Drawable) null);
            z2 = false;
        }
        r4.setChecked(z2);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        C76073tF r4 = new C76073tF(this.A01, this);
        if (C15450qv.A03()) {
            r4.setSelector((Drawable) null);
        }
        Set set = this.A06;
        return new C57752rh(this.A02, this.A03, r4, set);
    }
}
