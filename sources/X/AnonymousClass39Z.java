package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxACallbackShape8S0200000_2_I1;
import com.facebook.redex.IDxCListenerShape53S0200000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.stickers.StickerView;
import java.util.Collections;

/* renamed from: X.39Z  reason: invalid class name */
public class AnonymousClass39Z {
    public float A00;
    public int A01 = -1;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public C56942pD A05;
    public C16730tY A06;
    public final ImageView A07;
    public final LinearLayout A08;
    public final TextView A09;
    public final C61783Ah A0A;
    public final StickerView A0B;
    public final /* synthetic */ AnonymousClass31J A0C;

    public AnonymousClass39Z(LinearLayout linearLayout, AnonymousClass31J r19) {
        AnonymousClass31J r1 = r19;
        this.A0C = r1;
        LinearLayout linearLayout2 = linearLayout;
        this.A0B = (StickerView) linearLayout2.findViewById(R.id.sticker_image);
        this.A09 = C13680ns.A0M(linearLayout2, R.id.date);
        this.A07 = C13680ns.A0K(linearLayout2, R.id.status);
        C14710pd r11 = r1.A0M;
        AnonymousClass10X r7 = r1.A0M;
        C16760tb r8 = r1.A0R;
        AnonymousClass013 r10 = r1.A0K;
        C25791Ld r0 = r1.A1d;
        this.A0A = new C61783Ah(linearLayout2, r7, r8, r1.A02, r10, r11, r1.A03, r1.A04, r1.A05, r1.A1X, r0);
        this.A08 = (LinearLayout) linearLayout2.findViewById(R.id.date_wrapper);
        linearLayout2.setClipChildren(false);
        linearLayout2.setClipToPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = GravityCompat.END;
        AnonymousClass31J r4 = this.A0C;
        layoutParams.topMargin = -r4.getReactionsViewVerticalOverlap();
        boolean A1Z = C13680ns.A1Z(r4.A0K);
        int dimensionPixelOffset = r4.getResources().getDimensionPixelOffset(R.dimen.dimen0762);
        if (A1Z) {
            layoutParams.rightMargin = dimensionPixelOffset;
        } else {
            layoutParams.leftMargin = dimensionPixelOffset;
        }
        C56942pD r12 = new C56942pD(r4.getContext());
        this.A05 = r12;
        C34331k5.A03(r12, this, 15);
        linearLayout2.addView(this.A05, layoutParams);
    }

    public final void A00() {
        View view = this.A02;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        C56552nq r1 = new C56552nq(this.A0C.getContext(), this);
        this.A02 = r1;
        r1.setClickable(true);
        C13680ns.A17(this.A02, this, 22);
        ((ViewGroup) this.A0B.getParent()).addView(this.A02, C13690nt.A0M());
    }

    public void A01(C16730tY r14, boolean z2) {
        C56942pD r6;
        AnonymousClass23T r3;
        ImageView imageView;
        int AAs;
        this.A06 = r14;
        AnonymousClass31J r5 = this.A0C;
        AnonymousClass1YG r62 = r5.A0b;
        if (r62 == null || !r62.AHi()) {
            C13680ns.A13(this.A02);
        } else {
            A00();
            this.A02.setSelected(r62.AJI(r14));
        }
        ColorStateList colorStateList = null;
        if (r14 != null) {
            if (z2) {
                boolean z3 = false;
                if (r62 != null) {
                    z3 = r62.AJn(r14);
                    StickerView stickerView = this.A0A.A0F;
                    if (z3) {
                        stickerView.A01 = new IDxACallbackShape8S0200000_2_I1(this, 1, r14);
                    } else {
                        stickerView.A01 = null;
                    }
                }
                this.A0A.A02 = z3;
            }
            C61783Ah r2 = this.A0A;
            r2.A03((C38641rB) r14, z2);
            C16730tY r32 = this.A06;
            boolean z4 = false;
            if (r32 == null || (!(r62 == null || (AAs = r62.AAs()) == 0 || AAs == 2) || !r5.A0o(r32))) {
                r6 = this.A05;
                r3 = new AnonymousClass23T(r5.A0L, Collections.emptyList());
            } else {
                r5.A1S.A02(this.A06, (Runnable) null, (byte) 56);
                r6 = this.A05;
                r3 = this.A06.A0W;
                int i2 = this.A01;
                if (i2 == 28 || i2 == -1) {
                    z4 = true;
                }
            }
            r6.A00(r3, z4);
            C16750ta A002 = C16730tY.A00(r14);
            this.A09.setText(C47672Jx.A00(r5.A0K, r5.A0r.A02(r14.A0I)));
            LinearLayout linearLayout = this.A08;
            if (linearLayout != null) {
                boolean z5 = r14.A0x;
                ImageView imageView2 = this.A04;
                if (z5) {
                    if (imageView2 == null) {
                        this.A04 = new ImageView(r5.getContext());
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 16;
                        this.A04.setLayoutParams(layoutParams);
                        C45902Bo.A08(this.A04, r5.A0K, 0, r5.getResources().getDimensionPixelSize(R.dimen.dimen076f));
                        linearLayout.addView(this.A04, 0);
                        linearLayout.setClipChildren(false);
                    }
                    this.A04.setImageDrawable(r5.getStarDrawable());
                    this.A04.setVisibility(0);
                } else if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                if (!C34321k4.A03(r5.A0M) || 1 != r14.A06()) {
                    ImageView imageView3 = this.A03;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                    }
                } else {
                    if (this.A03 == null) {
                        this.A03 = new ImageView(r5.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 16;
                        this.A03.setLayoutParams(layoutParams2);
                        C45902Bo.A08(this.A03, r5.A0K, 0, r5.getResources().getDimensionPixelSize(R.dimen.dimen076f));
                        linearLayout.addView(this.A03, 0);
                        linearLayout.setClipChildren(false);
                    }
                    this.A03.setImageDrawable(r5.getKeepDrawable());
                    this.A03.setVisibility(0);
                }
            }
            C28381Vw r7 = r14.A11;
            boolean z6 = r7.A02;
            if (z6 && (imageView = this.A07) != null) {
                int A0p = r5.A0p(r14.A0C);
                int A0q = r5.A0q(r14.A0C);
                if (A0q != 0) {
                    colorStateList = AnonymousClass00T.A03(r5.getContext(), A0q);
                }
                C018808t.A00(colorStateList, imageView);
                imageView.setImageResource(A0p);
            }
            if (A002.A0Z && !A002.A0X) {
                r2.A01();
            } else if ((!A002.A0P || (A002.A0W && !z6)) && (!r14.A0t || !z6 || C16030sJ.A0G(r7.A00))) {
                r2.A00();
            } else {
                r2.A02();
            }
            this.A0B.setOnLongClickListener(new IDxCListenerShape53S0200000_2_I1(this, 3, r14));
            return;
        }
        StickerView stickerView2 = this.A0B;
        stickerView2.setImageDrawable((Drawable) null);
        stickerView2.setOnLongClickListener((View.OnLongClickListener) null);
    }
}
