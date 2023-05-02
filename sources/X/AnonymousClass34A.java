package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.redex.IDxNConsumerShape16S0300000_1_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.components.button.ThumbnailButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.34A  reason: invalid class name */
public class AnonymousClass34A extends C78163xL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public FrameLayout A04;
    public WaImageView A05;
    public WaImageView A06;
    public C56952pE A07;
    public C43341zq A08;
    public List A09;
    public boolean A0A;
    public final C14870pt A0B;
    public final C17160ud A0C;
    public final AnonymousClass2Ao A0D;
    public final AnonymousClass013 A0E;
    public final C43331zp A0F;

    public AnonymousClass34A(Context context, C14870pt r2, C17160ud r3, AnonymousClass2Ao r4, AnonymousClass013 r5, C43331zp r6) {
        super(context);
        A00();
        this.A0B = r2;
        this.A0C = r3;
        this.A0E = r5;
        this.A0F = r6;
        this.A0D = r4;
        A03();
    }

    public void A00() {
        if (!this.A0A) {
            this.A0A = true;
            generatedComponent();
        }
    }

    public View A01() {
        this.A07 = new C56952pE(getContext());
        FrameLayout.LayoutParams A0M = C13690nt.A0M();
        int A032 = C13690nt.A03(this);
        C45902Bo.A0A(this.A07, this.A0E, 0, 0, A032, 0);
        this.A07.setLayoutParams(A0M);
        return this.A07;
    }

    public View A02() {
        Context context = getContext();
        this.A04 = new FrameLayout(context);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen06a7);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.dimen01f2);
        this.A02 = getResources().getDimensionPixelSize(R.dimen.dimen01f3);
        this.A04.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.A06 = A04(context, dimensionPixelSize);
        ThumbnailButton A042 = A04(context, dimensionPixelSize);
        this.A05 = A042;
        ArrayList A0u = AnonymousClass000.A0u();
        this.A09 = A0u;
        A0u.add(this.A06);
        A0u.add(A042);
        this.A01 = C13690nt.A03(this);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dimen06a4);
        this.A03 = dimensionPixelSize2;
        C45902Bo.A09(this.A05, this.A0E, dimensionPixelSize2, 0, 0, 0);
        this.A04.addView(this.A05);
        this.A04.addView(this.A06);
        return this.A04;
    }

    public final ThumbnailButton A04(Context context, int i2) {
        ThumbnailButton thumbnailButton = new ThumbnailButton(context);
        thumbnailButton.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        thumbnailButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        thumbnailButton.A03 = AnonymousClass00T.A00(getContext(), R.color.color06b5);
        thumbnailButton.A01 = (float) this.A00;
        thumbnailButton.A02 = (float) this.A02;
        thumbnailButton.A07 = false;
        C004601z.A0d(thumbnailButton, 2);
        return thumbnailButton;
    }

    public void A05(C16740tZ r4, List list) {
        Runnable A012;
        this.A07.setSubText((String) null, (List) null);
        C43341zq r1 = this.A08;
        if (r1 != null) {
            this.A0F.A03(r1);
        }
        C43331zp r12 = this.A0F;
        synchronized (r12) {
            A012 = r12.A01(r4, (Object) null);
        }
        C43341zq r2 = (C43341zq) A012;
        this.A08 = r2;
        r2.A01(new IDxNConsumerShape16S0300000_1_I1(list, r4, this, 1), this.A0B.A06);
    }

    public void setMessage(C38741rL r7, List list) {
        AnonymousClass013 r1 = this.A0E;
        FrameLayout frameLayout = this.A04;
        int i2 = this.A01;
        C45902Bo.A09(frameLayout, r1, i2, i2, i2, i2);
        this.A0C.A05(this.A06, R.drawable.avatar_contact);
        this.A05.setVisibility(8);
        String A012 = AnonymousClass2QA.A01(getContext(), r7);
        if (A012 == null) {
            A012 = "";
        }
        this.A07.setTitleAndDescription(AnonymousClass1ZW.A04(128, A012), (String) null, list);
        A05(r7, list);
    }

    public void setMessage(C38811rS r7, List list) {
        int i2 = this.A01;
        int i3 = ((i2 << 1) - this.A03) >> 1;
        C45902Bo.A09(this.A04, this.A0E, i3, i2, i3, i2);
        C17160ud r2 = this.A0C;
        r2.A05(this.A06, R.drawable.avatar_contact);
        r2.A05(this.A05, R.drawable.avatar_contact);
        this.A05.setVisibility(0);
        this.A06.setVisibility(0);
        A05(r7, list);
    }
}
