package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.redex.IDxTRendererShape14S0101000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape3S0400000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.webpagepreview.WebPagePreviewView;
import com.whatsapp.util.ViewOnClickCListenerShape0S0500000_I1;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.39f  reason: invalid class name and case insensitive filesystem */
public class C615139f {
    public int A00;
    public int A01;
    public C73853pA A02;
    public final Context A03;
    public final C17090uW A04;
    public final C17230uk A05;
    public final AnonymousClass4NE A06;
    public final C809846j A07;
    public final C26081Mg A08;
    public final C14710pd A09;
    public final C24551Gj A0A;
    public final C25791Ld A0B;
    public final WebPagePreviewView A0C;

    public C615139f(Context context, C17090uW r4, C17230uk r5, AnonymousClass4NE r6, C809846j r7, C26081Mg r8, C14710pd r9, C24551Gj r10, C25791Ld r11) {
        this.A09 = r9;
        this.A03 = context;
        this.A04 = r4;
        this.A08 = r8;
        this.A0B = r11;
        this.A05 = r5;
        this.A0C = new WebPagePreviewView(context);
        this.A06 = r6;
        this.A02 = new C73853pA(C31171dd.A00(context));
        this.A07 = r7;
        this.A0A = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r2 == null) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A00(X.C16740tZ r6, X.C42171xL r7) {
        /*
            r5 = this;
            int r1 = r7.A01
            r4 = 1058013184(0x3f100000, float:0.5625)
            r0 = 4
            if (r1 == r0) goto L_0x001b
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options
            r3.<init>()
            r0 = 1
            r3.inJustDecodeBounds = r0
            X.1uH r0 = r6.A0N
            if (r0 == 0) goto L_0x001c
            byte[] r2 = r0.A00
            if (r2 != 0) goto L_0x002a
            byte[] r2 = r0.A0D
        L_0x0019:
            if (r2 != 0) goto L_0x002a
        L_0x001b:
            return r4
        L_0x001c:
            boolean r0 = r6 instanceof X.C30581cc
            if (r0 == 0) goto L_0x0027
            X.1cc r6 = (X.C30581cc) r6
            byte[] r2 = r6.A17()
            goto L_0x0019
        L_0x0027:
            r0 = 0
            byte[] r2 = new byte[r0]
        L_0x002a:
            r1 = 0
            int r0 = r2.length
            android.graphics.BitmapFactory.decodeByteArray(r2, r1, r0, r3)
            int r0 = r3.outHeight
            float r2 = (float) r0
            int r0 = r3.outWidth
            float r0 = (float) r0
            float r2 = r2 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0041
            float r0 = java.lang.Math.max(r2, r4)
            return r0
        L_0x0041:
            float r0 = java.lang.Math.min(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C615139f.A00(X.0tZ, X.1xL):float");
    }

    public final void A01(C30011bb r12, C16740tZ r13, AnonymousClass1ZQ r14, C42171xL r15, boolean z2, boolean z3, boolean z4) {
        C42171xL r7 = r15;
        C16740tZ r9 = r13;
        Set A002 = this.A08.A00(r13.A0C(), r13, r15.A03);
        if (A002 != null) {
            WebPagePreviewView webPagePreviewView = this.A0C;
            webPagePreviewView.A02();
            C56882ox r2 = r12.A0I;
            if (r2 != null && C798641q.FORWARD == r2.A00) {
                r2.A01.setVisibility(8);
            }
            webPagePreviewView.setOnClickListener(new ViewOnClickCListenerShape3S0400000_I1(this, r7, A002, r9, 2));
        } else {
            boolean z5 = z3;
            if (z2) {
                A03(r13, r14, r15, z5);
            } else {
                C25791Ld r5 = this.A0B;
                if (C61863As.A01(r13, r5, z5)) {
                    WebPagePreviewView webPagePreviewView2 = this.A0C;
                    webPagePreviewView2.A00();
                    webPagePreviewView2.setImageLargeLogo(z4 ? r15.A00 : 0);
                    C40531uH r22 = r13.A0N;
                    ViewGroup.LayoutParams layoutParams = webPagePreviewView2.A08.getLayoutParams();
                    if (r22 == null) {
                        layoutParams.width = -2;
                        webPagePreviewView2.A08.requestLayout();
                        r5.A07(webPagePreviewView2.A0M, r13, new C73653og(this));
                    } else {
                        layoutParams.width = -1;
                        webPagePreviewView2.A08.requestLayout();
                        int A052 = C13690nt.A05(webPagePreviewView2, C31171dd.A01(this.A03, 72));
                        webPagePreviewView2.setImageLargeThumbFrameHeight((int) (((float) A052) * A00(r13, r15)));
                        r5.A0C(webPagePreviewView2.A0M, r13, new IDxTRendererShape14S0101000_2_I1(this, A052, 0), false);
                    }
                    C34331k5.A05(webPagePreviewView2, this, r15, r13, 11);
                } else {
                    WebPagePreviewView webPagePreviewView3 = this.A0C;
                    webPagePreviewView3.A02();
                    C34331k5.A05(webPagePreviewView3, this, r15, r13, 11);
                }
            }
        }
        FrameLayout frameLayout = (FrameLayout) this.A0C.findViewById(R.id.link_preview_frame);
        boolean z6 = r13.A11.A02;
        Context context = this.A03;
        frameLayout.setForeground(z6 ? AnonymousClass4Y4.A01(context) : AnonymousClass4Y4.A00(context));
    }

    public void A02(C30011bb r27, C16740tZ r28, AnonymousClass1ZQ r29, C42171xL r30, boolean z2, boolean z3, boolean z4, boolean z5) {
        int A002 = C31171dd.A00(this.A03);
        this.A02 = z5 ? new C73843p9(A002) : new C73853pA(A002);
        C30011bb r10 = r27;
        C16740tZ r12 = r28;
        AnonymousClass1ZQ r13 = r29;
        C42171xL r14 = r30;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        boolean z9 = z6;
        A01(r10, r12, r13, r14, z9, z7, z8);
        if (r12.A10(1024)) {
            AnonymousClass4NE r6 = this.A06;
            WebPagePreviewView webPagePreviewView = this.A0C;
            AnonymousClass1YG r0 = r10.A0b;
            ArrayList AFm = r0 == null ? null : r0.AFm();
            AnonymousClass4OT r9 = new AnonymousClass4OT(r10, this, r12, r13, r14, z6, z7, z8);
            boolean A0A2 = this.A05.A0A();
            C40531uH r1 = r12.A0N;
            if (r1 != null) {
                C70653hS r7 = new C70653hS(r6.A01, r1);
                r7.A01 = z6;
                webPagePreviewView.setTag(new AnonymousClass4TU(r7, r12));
                webPagePreviewView.A08(r7, AFm, z7, A0A2);
                if (r1.A08 != null && r1.A00 == null) {
                    Set set = r6.A04;
                    String str = r12.A11.A01;
                    if (!set.contains(str)) {
                        set.add(str);
                        r6.A03.Acm(new AnonymousClass3I5(r7, r6, r9, r12, webPagePreviewView, AFm, z7, A0A2), str);
                    }
                }
            }
        } else if (r12 instanceof C30581cc) {
            WebPagePreviewView webPagePreviewView2 = this.A0C;
            C30581cc r02 = (C30581cc) r12;
            AnonymousClass1YG r15 = r10.A0b;
            ArrayList AFm2 = r15 == null ? null : r15.AFm();
            boolean A012 = C61863As.A01(r12, this.A0B, z7);
            boolean A0A3 = this.A05.A0A();
            String str2 = r14.A02;
            String str3 = r14.A03;
            Set A003 = webPagePreviewView2.A0Q.A00(r02.A0C(), r02, str3);
            String str4 = r02.A06;
            String str5 = r02.A04;
            byte[] A17 = r02.A17();
            Integer valueOf = Integer.valueOf(r02.A00);
            boolean A1V = AnonymousClass000.A1V(A003);
            int i2 = r02.A01;
            webPagePreviewView2.A0A(valueOf, str4, str5, str2, str3, AFm2, -1, A1V, false, A0A3);
            webPagePreviewView2.A0B(str3, A17, -1, i2, A1V, A012, z9, false);
        }
    }

    public final void A03(C16740tZ r12, AnonymousClass1ZQ r13, C42171xL r14, boolean z2) {
        AnonymousClass25V r1;
        WebPagePreviewView webPagePreviewView = this.A0C;
        C42171xL r7 = r14;
        C46212Cy.A05(webPagePreviewView, r14);
        C16740tZ r6 = r12;
        C86094Re r8 = new C86094Re(r12, webPagePreviewView, true, false);
        C28381Vw ABL = r13.ABL();
        if (ABL != null && ABL.equals(r12.A11)) {
            r13.Ae0(r8);
            C46212Cy.A04(webPagePreviewView, r13.ABK(), false);
        }
        Bitmap[] bitmapArr = new Bitmap[1];
        webPagePreviewView.setOnClickListener(new ViewOnClickCListenerShape0S0500000_I1(this, r6, r7, r8, bitmapArr, 1));
        C25791Ld r4 = this.A0B;
        if (C61863As.A01(r12, r4, z2)) {
            r1 = new C73663oh(this, bitmapArr);
        } else {
            int A052 = C13690nt.A05(webPagePreviewView, C31171dd.A01(this.A03, 72));
            webPagePreviewView.setVideoLargeThumbFrameHeight((int) (((float) A052) * A00(r12, r14)));
            r1 = new AnonymousClass52W(this, bitmapArr, A052);
        }
        if (r12.A0N != null) {
            r4.A0C(webPagePreviewView.A0D, r12, r1, true);
        } else if (r12 instanceof C30581cc) {
            r4.A07(webPagePreviewView.A0D, r12, r1);
        }
    }
}
