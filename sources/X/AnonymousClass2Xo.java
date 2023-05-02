package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxICallbackShape3S0000000_2_I0;
import com.obwhatsapp.R;

/* renamed from: X.2Xo  reason: invalid class name */
public class AnonymousClass2Xo extends AnonymousClass01W {
    public final C82334Ck A00;
    public final C82344Cl A01;
    public final C82354Cm A02;

    public AnonymousClass2Xo(C82334Ck r3, C82344Cl r4, C82354Cm r5) {
        super(new AnonymousClass0US(new IDxICallbackShape3S0000000_2_I0(0)).A00());
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public /* bridge */ /* synthetic */ void A07(C005602k r1) {
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        ((C65023So) r2).A07(A0E(i2));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        switch (i2) {
            case 1:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout050f, viewGroup, false);
                ImageView imageView = (ImageView) C004601z.A0E(inflate, R.id.education_icon);
                Drawable A03 = C018208n.A03(imageView.getBackground());
                C018208n.A0A(A03, AnonymousClass00T.A00(inflate.getContext(), R.color.color0891));
                imageView.setBackground(A03);
                AnonymousClass2SR.A08(imageView, AnonymousClass00T.A00(inflate.getContext(), R.color.color04d2));
                return new C71663kq(inflate);
            case 2:
                return new C71693kt(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout039a, viewGroup, false), viewGroup);
            case 3:
            case 11:
                return new C71703ku(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0510, viewGroup, false));
            case 4:
                C82354Cm r3 = this.A02;
                C18450wi.A0H(viewGroup, 0);
                return new C71723kw(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout050a, viewGroup, false), (AnonymousClass013) r3.A00.A04.AR8.get());
            case 5:
                C18450wi.A0H(viewGroup, 0);
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00a2, viewGroup, false);
                C18450wi.A0B(inflate2);
                return new C71643ko(inflate2);
            case 6:
                return new C59682yl(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout050b, viewGroup, false), (AnonymousClass1PZ) this.A01.A00.A04.ABy.get());
            case 7:
                C82334Ck r32 = this.A00;
                C18450wi.A0H(viewGroup, 0);
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout050e, viewGroup, false);
                C18450wi.A0B(inflate3);
                C16150sX r33 = r32.A00.A04;
                return new C71713kv(inflate3, (C19980zJ) r33.A0P.get(), (C14870pt) r33.AB3.get(), (AnonymousClass01V) r33.AOi.get());
            case 8:
                C18450wi.A0H(viewGroup, 0);
                View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0532, viewGroup, false);
                C18450wi.A0B(inflate4);
                return new C71653kp(inflate4);
            case 9:
                C18450wi.A0H(viewGroup, 0);
                View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0533, viewGroup, false);
                C18450wi.A0B(inflate5);
                return new C71673kr(inflate5);
            case 10:
                return new C65023So(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout03a5, viewGroup, false));
            case 12:
                Context context = viewGroup.getContext();
                C18450wi.A0H(context, 0);
                AnonymousClass3OY r4 = new AnonymousClass3OY(context);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen0652);
                r4.setPadding(dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.dimen02fe), dimensionPixelSize, dimensionPixelSize);
                C004601z.A0X(r4, context.getResources().getDimension(R.dimen.dimen005d));
                return new C71683ks(r4);
            default:
                StringBuilder sb = new StringBuilder("BusinessApiSearchListAdapter/onCreateViewHolder type not handled: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public int getItemViewType(int i2) {
        return ((C86344Sg) A0E(i2)).A00.intValue();
    }
}
