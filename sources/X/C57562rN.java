package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;

/* renamed from: X.2rN  reason: invalid class name and case insensitive filesystem */
public class C57562rN extends AnonymousClass07D {
    public float A00;
    public C57632rU A01;
    public boolean A02 = false;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Paint A09 = C13700nu.A05();
    public final Rect A0A;
    public final RectF A0B = AnonymousClass000.A0K();
    public final RectF A0C = AnonymousClass000.A0K();
    public final C85084Nb A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C57562rN(Rect rect, C85084Nb r3, int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        this.A03 = i3;
        this.A05 = i2;
        this.A08 = Color.alpha(i2);
        this.A04 = Color.alpha(i3);
        this.A07 = i4;
        this.A06 = i5;
        this.A0E = z2;
        if (z2) {
            this.A00 = 1.0f;
        }
        this.A0A = rect;
        this.A0F = z3;
        this.A0D = r3;
    }

    public void A02(Canvas canvas, AnonymousClass0Ri r13, RecyclerView recyclerView) {
        RectF rectF;
        RectF rectF2;
        float f2;
        int i2;
        Rect rect;
        float width;
        C57632rU r1 = this.A01;
        if (r1 != null && !this.A02 && !r1.A04 && r1.A02) {
            RunnableRunnableShape12S0200000_I1 runnableRunnableShape12S0200000_I1 = new RunnableRunnableShape12S0200000_I1(r1, 27, recyclerView);
            r1.A01 = runnableRunnableShape12S0200000_I1;
            recyclerView.postDelayed(runnableRunnableShape12S0200000_I1, 1500);
        }
        boolean z2 = true;
        this.A02 = true;
        if (this.A00 != 0.0f) {
            AnonymousClass02W layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                boolean A1R = AnonymousClass000.A1R(C004601z.A06(linearLayoutManager.A07), 1);
                if (linearLayoutManager.A01 == 1) {
                    int A1F = linearLayoutManager.A1F(r13);
                    int A1H = linearLayoutManager.A1H(r13);
                    int height = recyclerView.getHeight();
                    boolean z3 = this.A0F;
                    if (z3) {
                        Rect rect2 = this.A0A;
                        height = (height - rect2.top) - rect2.bottom;
                    }
                    int A1G = linearLayoutManager.A1G(r13);
                    if (A1H != A1F) {
                        int round = Math.round((((float) height) * ((float) A1F)) / ((float) A1H));
                        int i3 = height >> 1;
                        if (round > i3) {
                            round = i3;
                        }
                        int round2 = Math.round((((float) (height - round)) * ((float) A1G)) / ((float) (A1H - A1F)));
                        rectF = this.A0C;
                        if (A1R) {
                            rect = this.A0A;
                            int i4 = rect.right;
                            rectF.left = (float) i4;
                            width = (float) (this.A07 + i4);
                        } else {
                            rect = this.A0A;
                            rectF.left = (float) ((recyclerView.getWidth() - this.A07) - rect.right);
                            width = (float) (recyclerView.getWidth() - rect.right);
                        }
                        rectF.right = width;
                        rectF.top = (float) round2;
                        rectF.bottom = (float) (round2 + round);
                        rectF2 = this.A0B;
                        rectF2.left = rectF.left;
                        rectF2.right = width;
                        rectF2.top = 0.0f;
                        rectF2.bottom = (float) recyclerView.getHeight();
                        if (z3) {
                            float f3 = rectF.top;
                            float f4 = (float) rect.top;
                            rectF.top = f3 + f4;
                            rectF.bottom += f4;
                            rectF2.top += f4;
                            rectF2.bottom -= (float) rect.bottom;
                        }
                    } else {
                        return;
                    }
                } else {
                    int A1F2 = linearLayoutManager.A1F(r13);
                    int A1H2 = linearLayoutManager.A1H(r13);
                    int width2 = recyclerView.getWidth();
                    boolean z4 = this.A0F;
                    if (z4) {
                        Rect rect3 = this.A0A;
                        width2 = (width2 - rect3.left) - rect3.right;
                    }
                    int A1G2 = linearLayoutManager.A1G(r13);
                    if (A1H2 != A1F2) {
                        int round3 = Math.round((((float) width2) * ((float) A1F2)) / ((float) A1H2));
                        int i5 = width2 >> 1;
                        if (round3 > i5) {
                            round3 = i5;
                        }
                        int round4 = Math.round((((float) (width2 - round3)) * ((float) A1G2)) / ((float) (A1H2 - A1F2)));
                        rectF = this.A0C;
                        rectF.left = (float) round4;
                        rectF.right = (float) (round4 + round3);
                        Rect rect4 = this.A0A;
                        rectF.top = (float) ((recyclerView.getHeight() - this.A07) - rect4.bottom);
                        rectF.bottom = (float) (recyclerView.getHeight() - rect4.bottom);
                        rectF2 = this.A0B;
                        rectF2.left = 0.0f;
                        rectF2.top = rectF.top;
                        rectF2.right = (float) recyclerView.getWidth();
                        rectF2.bottom = rectF.bottom;
                        if (z4) {
                            float f5 = rectF.left;
                            if (A1R) {
                                float f6 = (float) rect4.right;
                                rectF.left = f5 + f6;
                                rectF.right += f6;
                                rectF2.left += f6;
                                f2 = rectF2.right;
                                i2 = rect4.left;
                            } else {
                                float f7 = (float) rect4.left;
                                rectF.left = f5 + f7;
                                rectF.right += f7;
                                rectF2.left += f7;
                                f2 = rectF2.right;
                                i2 = rect4.right;
                            }
                            rectF2.right = f2 - ((float) i2);
                        }
                    } else {
                        return;
                    }
                }
                int i6 = this.A03;
                if (i6 != 0) {
                    C85084Nb r8 = this.A0D;
                    float f8 = r8.A03;
                    if (f8 == 0.0f || !canvas.isHardwareAccelerated()) {
                        z2 = false;
                    } else {
                        this.A09.setShadowLayer(f8, r8.A01, r8.A00, r8.A05);
                    }
                    Paint paint = this.A09;
                    paint.setColor(i6);
                    paint.setAlpha((int) (this.A00 * ((float) this.A04)));
                    float f9 = (float) this.A06;
                    canvas.drawRoundRect(rectF2, f9, f9, paint);
                    if (z2) {
                        paint.clearShadowLayer();
                    }
                }
                Paint paint2 = this.A09;
                paint2.setColor(this.A05);
                paint2.setAlpha((int) (this.A00 * ((float) this.A08)));
                float f10 = (float) this.A06;
                canvas.drawRoundRect(rectF, f10, f10, paint2);
            }
        }
    }
}
