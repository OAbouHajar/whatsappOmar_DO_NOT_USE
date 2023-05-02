package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.3R8  reason: invalid class name */
public final class AnonymousClass3R8 extends AnonymousClass01X {
    public AnonymousClass1PV A00;
    public C29101a2 A01;
    public List A02;

    public AnonymousClass3R8(AnonymousClass1PV r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public static final Chip A00(Context context) {
        Chip chip = new Chip(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen0655);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = dimensionPixelSize;
        marginLayoutParams.rightMargin = dimensionPixelSize;
        chip.setLayoutParams(marginLayoutParams);
        chip.setChipEndPadding(context.getResources().getDimension(R.dimen.dimen02f9));
        chip.setChipStartPadding(context.getResources().getDimension(R.dimen.dimen02f9));
        chip.setCloseIconResource(R.drawable.ic_chevron_down);
        return chip;
    }

    public int A0C() {
        List list = this.A02;
        if (list != null) {
            return list.size();
        }
        throw C18450wi.A03("filterListItems");
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        C65083Su r22 = (C65083Su) r2;
        C18450wi.A0H(r22, 0);
        List list = this.A02;
        if (list == null) {
            throw C18450wi.A03("filterListItems");
        }
        r22.A07((AnonymousClass4PT) list.get(i2));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        C18450wi.A0H(viewGroup, 0);
        if (i2 == 2) {
            Context context = viewGroup.getContext();
            C18450wi.A0B(context);
            Chip A002 = A00(context);
            C29101a2 r0 = this.A01;
            if (r0 != null) {
                return new C72703mZ(A002, r0);
            }
        } else if (i2 == 3) {
            Context context2 = viewGroup.getContext();
            C18450wi.A0B(context2);
            Chip A003 = A00(context2);
            C29101a2 r02 = this.A01;
            if (r02 != null) {
                return new C72723mb(A003, r02);
            }
        } else if (i2 == 4) {
            Context context3 = viewGroup.getContext();
            C18450wi.A0B(context3);
            Chip A004 = A00(context3);
            C29101a2 r03 = this.A01;
            if (r03 != null) {
                return new C72713ma(A004, r03);
            }
        } else if (i2 == 6) {
            Context context4 = viewGroup.getContext();
            C18450wi.A0B(context4);
            View inflate = LayoutInflater.from(context4).inflate(R.layout.layout0090, (ViewGroup) null);
            inflate.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            inflate.getLayoutParams().height = context4.getResources().getDimensionPixelSize(R.dimen.dimen030b);
            C29101a2 r04 = this.A01;
            if (r04 != null) {
                return new C72743md(inflate, r04);
            }
        } else if (i2 == 7) {
            AnonymousClass1PV r2 = this.A00;
            Context context5 = viewGroup.getContext();
            C18450wi.A0B(context5);
            Chip A005 = A00(context5);
            C29101a2 r1 = this.A01;
            if (r1 != null) {
                return new C72733mc(A005, r1, C16150sX.A0Z(r2.A00.A01));
            }
        } else {
            throw AnonymousClass000.A0V(C18450wi.A06("FilterBarAdapter /onCreateViewHolder unhandled view type: ", Integer.valueOf(i2)));
        }
        throw C18450wi.A03("onItemClickListener");
    }

    public int getItemViewType(int i2) {
        List list = this.A02;
        if (list == null) {
            throw C18450wi.A03("filterListItems");
        }
        Object obj = list.get(i2);
        if (obj instanceof C72263lq) {
            return 2;
        }
        if (obj instanceof C72273lr) {
            return 7;
        }
        if (obj instanceof C72293lt) {
            return 3;
        }
        if (obj instanceof C72283ls) {
            return 4;
        }
        if (obj instanceof C72253lp) {
            return 6;
        }
        throw new AnonymousClass2Xe();
    }
}
