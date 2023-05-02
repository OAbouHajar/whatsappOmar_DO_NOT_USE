package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import java.util.List;

/* renamed from: X.349  reason: invalid class name */
public class AnonymousClass349 extends C78163xL {
    public WaImageView A00;
    public C56952pE A01;
    public boolean A02;
    public final AnonymousClass013 A03;

    public AnonymousClass349(Context context, AnonymousClass013 r2) {
        super(context);
        A00();
        this.A03 = r2;
        A03();
    }

    public void A00() {
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public View A01() {
        this.A01 = new C56952pE(getContext());
        FrameLayout.LayoutParams A0M = C13690nt.A0M();
        int A032 = C13690nt.A03(this);
        C45902Bo.A0A(this.A01, this.A03, 0, 0, A032, 0);
        this.A01.setLayoutParams(A0M);
        return this.A01;
    }

    public View A02() {
        this.A00 = new WaImageView(getContext());
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen06a7);
        int A032 = C13690nt.A03(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.setMargins(A032, A032, A032, A032);
        this.A00.setLayoutParams(layoutParams);
        this.A00.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return this.A00;
    }

    public void setMessage(C38631rA r11, List list) {
        String A14 = !TextUtils.isEmpty(r11.A14()) ? r11.A14() : getContext().getString(R.string.str18a7);
        AnonymousClass013 r2 = this.A03;
        String A032 = AnonymousClass2GQ.A03(r2, r11.A01);
        String A012 = C16730tY.A01(r11);
        this.A01.setTitleAndDescription(A14, (String) null, list);
        boolean A1Z = C13680ns.A1Z(r2);
        C56952pE r3 = this.A01;
        Context context = getContext();
        Object[] objArr = new Object[2];
        if (A1Z) {
            objArr[0] = A032;
            objArr[1] = A012;
        } else {
            objArr[0] = A012;
            objArr[1] = A032;
        }
        r3.setSubText(context.getString(R.string.str1cca, objArr), (List) null);
        this.A00.setImageDrawable(AnonymousClass4Y6.A00(getContext(), r11));
    }
}
