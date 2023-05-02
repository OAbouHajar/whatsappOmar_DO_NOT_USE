package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.facebook.redex.IDxICallbackShape3S0000000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape16S0100000_I1_1;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2Xn  reason: invalid class name and case insensitive filesystem */
public final class C50052Xn extends AnonymousClass01W {
    public long A00 = 1;
    public final C50602a7 A01;
    public final Map A02 = new HashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50052Xn(C50602a7 r4) {
        super(new AnonymousClass0US(new IDxICallbackShape3S0000000_2_I0(2)).A00());
        C18450wi.A0H(r4, 1);
        this.A01 = r4;
        A0B(true);
    }

    public long A0D(int i2) {
        Map map = this.A02;
        String str = ((C87234Vy) A0E(i2)).A01.A00;
        C18450wi.A0A(str);
        Number number = (Number) map.get(str);
        if (number == null) {
            long j2 = this.A00;
            this.A00 = 1 + j2;
            number = Long.valueOf(j2);
            map.put(str, number);
        }
        return number.longValue();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r7, int i2) {
        AnonymousClass3SP r72 = (AnonymousClass3SP) r7;
        C18450wi.A0H(r72, 0);
        Object A0E = A0E(i2);
        C18450wi.A0B(A0E);
        C87234Vy r5 = (C87234Vy) A0E;
        C18450wi.A0H(r5, 0);
        Chip chip = r72.A02;
        C73563oM r1 = r5.A01;
        String str = r1.A01;
        C18450wi.A0A(str);
        chip.setText(str);
        C50302Yu r3 = r72.A03;
        String str2 = r1.A01;
        C18450wi.A0A(str2);
        r3.A00(new C100804wE(r5, r72), str2, (int) r72.A00);
        Context context = chip.getContext();
        C18450wi.A0B(context);
        boolean z2 = r5.A02;
        int i3 = R.color.color06c2;
        if (z2) {
            i3 = R.color.color090b;
        }
        int A002 = AnonymousClass00T.A00(context, i3);
        int i4 = R.color.color06b1;
        if (z2) {
            i4 = R.color.color06b8;
        }
        chip.setChipBackgroundColorResource(i4);
        chip.setOnClickListener(new ViewOnClickCListenerShape16S0100000_I1_1(r5, 21));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        C18450wi.A0H(viewGroup, 0);
        C50602a7 r5 = this.A01;
        Resources resources = viewGroup.getContext().getResources();
        Chip chip = new Chip(viewGroup.getContext(), (AttributeSet) null);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dimen0655);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = dimensionPixelSize;
        marginLayoutParams.rightMargin = dimensionPixelSize;
        chip.setTextSize(2, 14.0f);
        chip.setLayoutParams(marginLayoutParams);
        chip.setChipEndPadding(resources.getDimension(R.dimen.dimen02f9));
        chip.setChipStartPadding(resources.getDimension(R.dimen.dimen02f9));
        return new AnonymousClass3SP(chip, r5.A00.A01.A0A());
    }
}
