package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewGroup;
import com.facebook.redex.IDxTListenerShape166S0100000_1_I0;
import com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0;
import com.obwhatsapp.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.29y  reason: invalid class name and case insensitive filesystem */
public class C456629y extends AnonymousClass01X {
    public boolean A00 = true;
    public final int A01;
    public final Context A02;
    public final C34711kk A03;
    public final AnonymousClass013 A04;
    public final C26051Md A05;
    public final C17250um A06;
    public final C14710pd A07;
    public final AnonymousClass29Q A08;
    public final AnonymousClass2OM A09;
    public final C17960vv A0A;
    public final AnonymousClass29P A0B;
    public final AnonymousClass2S8 A0C;
    public final C456129o A0D;
    public final AnonymousClass1MF A0E;
    public final AnonymousClass1A9 A0F;
    public final HashSet A0G;
    public final Set A0H;
    public final boolean A0I;
    public final boolean A0J;

    public C456629y(Context context, C34711kk r3, AnonymousClass013 r4, C26051Md r5, C17250um r6, C14710pd r7, AnonymousClass29Q r8, AnonymousClass2OM r9, C17960vv r10, AnonymousClass29P r11, AnonymousClass2S8 r12, C456129o r13, AnonymousClass1MF r14, AnonymousClass1A9 r15, HashSet hashSet, int i2, boolean z2, boolean z3) {
        A0B(true);
        this.A02 = context;
        this.A04 = r4;
        this.A06 = r6;
        this.A0E = r14;
        this.A0D = r13;
        this.A0C = r12;
        this.A0F = r15;
        this.A0A = r10;
        this.A09 = r9;
        this.A08 = r8;
        this.A0G = hashSet;
        this.A0H = new HashSet();
        this.A03 = r3;
        this.A0B = r11;
        this.A01 = i2;
        this.A0I = z2;
        this.A05 = r5;
        this.A07 = r7;
        this.A0J = z3;
    }

    public int A0C() {
        return ((List) this.A0B.A03.A01()).size();
    }

    public long A0D(int i2) {
        return (long) ((List) this.A0B.A03.A01()).get(i2).hashCode();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r19, int i2) {
        Context context;
        int i3;
        C64623Ra r6 = (C64623Ra) r19;
        AnonymousClass2OM r1 = this.A09;
        if (r1 != null) {
            AnonymousClass329 r14 = (AnonymousClass329) r6.A0H;
            AnonymousClass29P r8 = this.A0B;
            boolean z2 = false;
            boolean z3 = false;
            int i4 = i2;
            if (((Number) r8.A02.A01()).intValue() == i4) {
                z3 = true;
            }
            r14.setSelected(z3);
            if (z3 && this.A00 && this.A0J) {
                z2 = true;
            }
            Integer num = null;
            r14.setOverlayIcon(z2 ? AnonymousClass00T.A04(this.A02, R.drawable.ic_cam_delete) : null);
            if (z2) {
                num = Integer.valueOf(R.id.delete_thumb);
            }
            r14.setCustomId(num);
            r1.A01((AnonymousClass2OV) r14.getTag());
            Uri uri = (Uri) ((List) r8.A03.A01()).get(i4);
            AnonymousClass20I A002 = this.A08.A00(uri);
            r14.A05 = A002;
            r14.A07 = r6;
            C17960vv r13 = this.A0A;
            byte A012 = r13.A01(A002);
            A002.A0C(Byte.valueOf(A012));
            if (A012 == 3) {
                context = this.A02;
                r14.A03 = AnonymousClass00T.A04(context, R.drawable.mark_video);
                i3 = R.string.str05e9;
            } else if (A012 != 13) {
                r14.A03 = null;
                context = this.A02;
                i3 = R.string.str05e0;
            } else {
                context = this.A02;
                r14.A03 = AnonymousClass00T.A04(context, R.drawable.mark_gif);
                i3 = R.string.str05dc;
            }
            r14.setContentDescription(context.getString(i3));
            r14.setOnClickListener(new ViewOnClickCListenerShape1S0101000_I0(this, i4, 9));
            r14.setOnTouchListener(new IDxTListenerShape166S0100000_1_I0(this, 1));
            C62823Fb r62 = new C62823Fb(uri, this.A04, this.A05, this.A06, this.A07, A002, r13, r14, this.A0E, this.A0F, this.A01);
            this.A0H.add(r62);
            r14.setTag(r62);
            C34711kk r4 = this.A03;
            C62833Fc r2 = new C62833Fc(r4, r62, r14);
            Bitmap bitmap = (Bitmap) r4.A00(r62.AGT());
            if (bitmap == null) {
                r1.A02(r62, r2);
            } else {
                r2.AY3(bitmap, true);
            }
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new C64623Ra(new AnonymousClass329(this.A02, this.A0C, this.A0G, this.A01, this.A0I));
    }
}
