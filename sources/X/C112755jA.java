package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxCListenerShape24S0000000_3_I1;
import com.facebook.redex.IDxCListenerShape3S1100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.whatsapp.util.IDxCListenerShape107S0100000_3_I1;

/* renamed from: X.5jA  reason: invalid class name and case insensitive filesystem */
public class C112755jA extends C118925vd {
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ImageView A03;
    public ImageView A04;
    public WaTextView A05;
    public WaTextView A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C14870pt A0A;
    public final AnonymousClass013 A0B;
    public final C34331k5 A0C = new IDxCListenerShape107S0100000_3_I1(this, 7);
    public final C34331k5 A0D = new IDxCListenerShape107S0100000_3_I1(this, 6);
    public final C16320sq A0E;

    public C112755jA(C14870pt r3, AnonymousClass013 r4, C112885jv r5, C16320sq r6) {
        super(r5);
        this.A0A = r3;
        this.A0E = r6;
        this.A0B = r4;
        this.A08 = AnonymousClass00T.A00(r5, R.color.color0773);
        this.A09 = AnonymousClass00T.A00(r5, R.color.color0774);
        this.A07 = AnonymousClass00T.A00(r5, R.color.color04cc);
    }

    public static /* synthetic */ void A00(C30671cl r7, C112755jA r8, String str, int i2) {
        C112885jv r6 = r8.A04;
        String A0d = C13680ns.A0d(r6, C119405xi.A05(r6, r6.A08, r6.A0C, true), new Object[1], 0, i2);
        C32241fu A002 = C32241fu.A00(r6);
        A002.setTitle(A0d);
        if (r7 != null) {
            A002.A06(C13680ns.A0d(r6, C119405xi.A05(r6, r7, r6.A0C, true), new Object[1], 0, R.string.str03b2));
        }
        A002.setPositiveButton(R.string.str0e87, new IDxCListenerShape3S1100000_3_I1(1, str, r8));
        A002.setNegativeButton(R.string.str0394, new IDxCListenerShape24S0000000_3_I1(2));
        C13690nt.A1G(A002);
    }
}
