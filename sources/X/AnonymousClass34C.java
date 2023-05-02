package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.whatsapp.util.ViewOnClickCListenerShape1S1100000_I1;
import java.util.List;
import java.util.Set;

/* renamed from: X.34C  reason: invalid class name */
public class AnonymousClass34C extends C78183xN {
    public View A00;
    public C17090uW A01;
    public WaImageView A02;
    public C17230uk A03;
    public AnonymousClass013 A04;
    public C26081Mg A05;
    public C56952pE A06;
    public boolean A07;

    public AnonymousClass34C(Context context) {
        super(context);
        A00();
        A03();
    }

    public void A00() {
        if (!this.A07) {
            this.A07 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A01 = C16150sX.A03(A002);
            this.A04 = C16150sX.A0Z(A002);
            this.A05 = (C26081Mg) A002.AIY.get();
            this.A03 = (C17230uk) A002.A4I.get();
        }
    }

    public View A01() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout.setLayoutParams(layoutParams);
        int A032 = C13690nt.A03(this);
        C45902Bo.A0A(linearLayout, this.A04, A032, 0, A032, 0);
        this.A00 = C13680ns.A0G(this).inflate(R.layout.layout05a6, linearLayout, false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C87594Xo.A00(getContext(), 4.0f);
        layoutParams2.bottomMargin = C87594Xo.A00(getContext(), 4.0f);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.setVisibility(8);
        this.A06 = new C56952pE(getContext());
        this.A06.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(this.A06);
        linearLayout.addView(this.A00);
        return linearLayout;
    }

    public View A02() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen06a6);
        this.A02 = new WaImageView(getContext());
        this.A02.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        return this.A02;
    }

    public void setMessage(C30581cc r10, List list) {
        Bitmap decodeByteArray;
        int i2 = 0;
        AnonymousClass3AC A002 = AnonymousClass3AC.A00(getContext(), this.A05, r10, 0, this.A03.A0A());
        C84374Kh r5 = A002.A00;
        String str = r5.A01;
        String str2 = A002.A04;
        if (str2 == null) {
            str2 = "";
        }
        Set set = r5.A02;
        setPreviewClickListener(str, set, r10);
        boolean A1V = AnonymousClass000.A1V(set);
        byte[] A17 = r10.A17();
        if (A17 == null || (decodeByteArray = BitmapFactory.decodeByteArray(A17, 0, A17.length)) == null || A1V) {
            this.A02.setImageDrawable(AnonymousClass2SR.A02(getContext(), R.drawable.ic_group_invite_link, R.color.color06bc));
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setScaleX(1.5f);
            this.A02.setScaleY(1.5f);
            C13680ns.A0u(getContext(), this.A02, R.color.color0093);
        } else {
            this.A02.setImageBitmap(decodeByteArray);
            this.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        this.A06.setTitleAndDescription(str2, set != null ? null : A002.A03, list);
        this.A06.setSubText(r5.A00, list);
        View view = this.A00;
        if (set == null) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void setPreviewClickListener(String str, Set set, C30581cc r5) {
        if (set != null) {
            setOnClickListener(new C94014kB(r5, this, str, set));
        } else {
            setOnClickListener(new ViewOnClickCListenerShape1S1100000_I1(2, str, this));
        }
    }
}
