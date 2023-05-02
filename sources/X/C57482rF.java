package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape53S0200000_2_I1;
import com.facebook.redex.IDxLListenerShape394S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.picker.searchexpressions.ExpressionTabFragment;
import com.obwhatsapp.yo.Conversation;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.ViewOnClickCListenerShape0S0201000_I1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2rF  reason: invalid class name and case insensitive filesystem */
public class C57482rF extends AnonymousClass01X {
    public int A00 = 0;
    public long A01 = 0;
    public AnonymousClass5QR A02;
    public List A03;
    public boolean A04 = false;
    public final LayoutInflater A05;
    public final AnonymousClass1MF A06;
    public final AnonymousClass5QT A07;
    public final Integer A08;
    public final HashMap A09 = AnonymousClass000.A0x();

    public C57482rF(Context context, AnonymousClass1MF r4, AnonymousClass5QT r5, Integer num, List list) {
        this.A05 = LayoutInflater.from(context);
        this.A06 = r4;
        this.A07 = r5;
        this.A08 = num;
        A0E(list);
        A0B(true);
    }

    public static void A00(ExpressionTabFragment expressionTabFragment, List list) {
        AnonymousClass027 r1 = expressionTabFragment.A0B.A0A;
        AnonymousClass00B.A06(r1.A01());
        String str = ((AnonymousClass4IS) r1.A01()).A01;
        expressionTabFragment.A0C.A04 = !TextUtils.isEmpty(str);
        expressionTabFragment.A0C.A0E(list);
        expressionTabFragment.A0C.A01();
        C94384kp r0 = expressionTabFragment.A09;
        if (r0 != null) {
            r0.A02 = true;
        }
    }

    public int A0C() {
        return C13680ns.A07(this.A03);
    }

    public long A0D(int i2) {
        List list;
        Number number;
        if (!this.A00 || (list = this.A03) == null || (number = (Number) this.A09.get(((C34151jm) list.get(i2)).A0D)) == null) {
            return -1;
        }
        return number.longValue();
    }

    public void A0E(List list) {
        this.A03 = list;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C34151jm r5 = (C34151jm) it.next();
                HashMap hashMap = this.A09;
                if (hashMap.get(r5.A0D) == null) {
                    long j2 = this.A01;
                    this.A01 = 1 + j2;
                    hashMap.put(r5.A0D, Long.valueOf(j2));
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r13, int i2) {
        View view;
        C34151jm r0;
        C64933Sf r132 = (C64933Sf) r13;
        List list = this.A03;
        if (list != null) {
            C34151jm r5 = (C34151jm) list.get(i2);
            boolean z2 = this.A04;
            if (z2 != r132.A03) {
                r132.A03 = z2;
                if (!z2) {
                    StickerView stickerView = r132.A07;
                    stickerView.A04 = false;
                    stickerView.A05();
                } else if (r132.A02) {
                    StickerView stickerView2 = r132.A07;
                    stickerView2.A04 = true;
                    stickerView2.A04();
                }
            }
            int i3 = this.A00;
            if (r5 == null || (r0 = r132.A01) == null || !r5.A0D.equals(r0.A0D)) {
                r132.A01 = r5;
                if (r5 == null) {
                    View view2 = r132.A0H;
                    view2.setOnClickListener((View.OnClickListener) null);
                    r132.A07.setImageResource(0);
                    view2.setBackgroundResource(0);
                    view2.setClickable(false);
                } else {
                    String str = r5.A0D;
                    if (str == null || !str.equals("loading-hash")) {
                        view = r132.A0H;
                        Conversation.sendStkrShowConfirmation(view, new ViewOnClickCListenerShape0S0201000_I1(r132, i2, r5, 2));
                        view.setOnLongClickListener(r132.A04);
                    } else {
                        view = r132.A0H;
                        view.setOnClickListener((View.OnClickListener) null);
                        view.setClickable(false);
                    }
                    view.setBackgroundResource(R.drawable.selector_orange_gradient);
                    view.setContentDescription(C89674ci.A00(view.getContext(), r5));
                    StickerView stickerView3 = r132.A07;
                    int dimensionPixelSize = C13680ns.A0D(stickerView3).getDimensionPixelSize(R.dimen.dimen07b3);
                    r132.A05.A04(stickerView3, r5, new IDxLListenerShape394S0100000_2_I1(r132, 0), i3, dimensionPixelSize, dimensionPixelSize, true, true);
                }
            }
            r132.A00 = new IDxCListenerShape53S0200000_2_I1(this, 9, r5);
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new C64933Sf(this.A05, viewGroup, this.A06, this.A07, this.A08);
    }
}
