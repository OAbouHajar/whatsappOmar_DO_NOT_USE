package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxGListenerShape15S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.IDxATaskShape108S0100000_2_I0;
import com.whatsapp.util.Log;

/* renamed from: X.1bo  reason: invalid class name and case insensitive filesystem */
public class C30141bo {
    public float A00;
    public int A01;
    public Bitmap A02;
    public Bitmap A03;
    public Bitmap A04;
    public Rect A05;
    public View A06;
    public C54882iQ A07;
    public BottomSheetBehavior A08;
    public AnonymousClass2Ra A09;
    public C30151bp A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final int A0I;
    public final int A0J;
    public final Handler A0K = new Handler(Looper.getMainLooper());
    public final View A0L;
    public final View A0M;
    public final CoordinatorLayout A0N;
    public final AnonymousClass09P A0O;
    public final C001000l A0P;
    public final RecyclerView A0Q;
    public final C34711kk A0R;
    public final C15860rz A0S;
    public final AnonymousClass013 A0T;
    public final C26051Md A0U;
    public final AnonymousClass29E A0V;
    public final AnonymousClass1WA A0W;
    public final Runnable A0X;
    public final String A0Y;

    public C30141bo(Uri uri, View view, C001000l r11, C23651Cv r12, C15860rz r13, AnonymousClass013 r14, C26051Md r15, AnonymousClass29E r16, AnonymousClass2Ra r17, C16320sq r18, int i2) {
        this.A0P = r11;
        this.A0T = r14;
        this.A0S = r13;
        this.A0M = view;
        this.A0V = r16;
        this.A01 = i2;
        this.A0U = r15;
        this.A09 = r17;
        this.A0R = r12.A02();
        this.A0W = new AnonymousClass1WA(r18, false);
        this.A0O = new AnonymousClass09P(view.getContext(), new IDxGListenerShape15S0100000_2_I0(this, 1));
        this.A0N = (CoordinatorLayout) this.A0M.findViewById(R.id.filter_sheet_container);
        this.A0L = this.A0M.findViewById(R.id.filter_bottom_sheet);
        this.A0Q = (RecyclerView) this.A0M.findViewById(R.id.filter_selector);
        this.A06 = this.A0M.findViewById(R.id.media_content);
        this.A00 = 0.28f;
        StringBuilder sb = new StringBuilder();
        sb.append(uri.toString());
        sb.append("-filter");
        this.A0Y = sb.toString();
        this.A0J = r11.getResources().getDimensionPixelSize(R.dimen.dimen03d5);
        this.A0I = r11.getResources().getDimensionPixelSize(R.dimen.dimen03d0);
        this.A0X = new RunnableRunnableShape0S0400000_I0(this, r11, view, r15, 30);
    }

    public static /* synthetic */ void A00(C30141bo r6) {
        RecyclerView recyclerView = r6.A0Q;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) recyclerView.getLayoutParams();
        if (marginLayoutParams != null) {
            Rect rect = r6.A05;
            marginLayoutParams.leftMargin = rect.left;
            marginLayoutParams.rightMargin = rect.right;
            marginLayoutParams.topMargin = rect.top;
            marginLayoutParams.bottomMargin = rect.bottom;
            recyclerView.setLayoutParams(marginLayoutParams);
            recyclerView.A0h = true;
        }
        View view = r6.A0M;
        int width = view.getWidth();
        int height = view.getHeight();
        int dimensionPixelSize = r6.A0P.getResources().getDimensionPixelSize(R.dimen.dimen03ca);
        float f2 = 0.5f;
        if (width < height) {
            f2 = 0.28f;
        }
        r6.A00 = f2;
        r6.A08.A0L((height - dimensionPixelSize) - r6.A05.bottom);
        float f3 = ((float) width) / 2.0f;
        float height2 = ((float) (height - recyclerView.getHeight())) / 2.0f;
        View view2 = r6.A06;
        view2.setPivotX(f3);
        view2.setPivotY(height2);
        DoodleView doodleView = r6.A09.A0H;
        doodleView.setPivotX(f3);
        doodleView.setPivotY(height2);
        if (r6.A08.A0B == 3) {
            float f4 = 1.0f - r6.A00;
            view2.setScaleX(f4);
            view2.setScaleY(f4);
            doodleView.setScaleX(f4);
            doodleView.setScaleY(f4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (A08() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r3 = this;
            android.view.View r2 = r3.A0L
            if (r2 == 0) goto L_0x001e
            boolean r0 = r3.A07()
            if (r0 != 0) goto L_0x0011
            boolean r1 = r3.A08()
            r0 = 0
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            r1 = 0
            if (r0 == 0) goto L_0x001f
            boolean r0 = r3.A08()
            if (r0 != 0) goto L_0x001e
            r2.setVisibility(r1)
        L_0x001e:
            return
        L_0x001f:
            r0 = 1
            r3.A0E = r0
            r3.A0C = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30141bo.A01():void");
    }

    public void A02() {
        if (this.A04 != null) {
            C34711kk r5 = this.A0R;
            String str = this.A0Y;
            Bitmap bitmap = (Bitmap) r5.A00(str);
            this.A03 = bitmap;
            if (bitmap == null) {
                int i2 = this.A01;
                if (i2 == 0) {
                    this.A03 = this.A04;
                    r5.A02.A03(str);
                    return;
                }
                Bitmap A002 = FilterUtils.A00(this.A04, this.A0U, i2, true);
                this.A03 = A002;
                if (A002 == null) {
                    this.A03 = this.A04;
                    this.A01 = 0;
                    Log.w("FilterSelectorController/updateFilteredMediaBitmap/filter failed");
                    return;
                }
                r5.A03(str, A002);
            }
        }
    }

    public final void A03() {
        C30151bp r5 = this.A0A;
        if (r5 != null) {
            int i2 = 0;
            while (true) {
                C30141bo r2 = r5.A09;
                RecyclerView recyclerView = r2.A0Q;
                if (i2 < recyclerView.getChildCount()) {
                    AnonymousClass3T2 r0 = (AnonymousClass3T2) recyclerView.A0F(recyclerView.getChildAt(i2));
                    if (r0 != null) {
                        ImageView imageView = r0.A02;
                        imageView.setBackgroundResource(0);
                        imageView.setImageDrawable((Drawable) null);
                    }
                    i2++;
                } else {
                    new C78693yX(r5.A01).A02.executeOnExecutor(r2.A0W, new Void[0]);
                    return;
                }
            }
        }
    }

    public final void A04() {
        if (this.A04 != null && !this.A0B) {
            C001000l r2 = this.A0P;
            if (r2.A06.A02 != C011005f.DESTROYED) {
                new IDxATaskShape108S0100000_2_I0(r2, this, 0).A02.executeOnExecutor(this.A0W, new Void[0]);
                this.A0B = true;
            }
        }
    }

    public void A05(Runnable runnable, Runnable runnable2, int i2) {
        if (this.A04 != null) {
            C34711kk r2 = this.A0R;
            String str = this.A0Y;
            Bitmap bitmap = (Bitmap) r2.A00(str);
            if (i2 != this.A01 || i2 == 0) {
                r2.A02.A03(str);
            }
            if (i2 != 0) {
                new C78973yz(bitmap, this.A0P, this, runnable, runnable2, i2).A02.executeOnExecutor(this.A0W, new Void[0]);
                return;
            }
            this.A03 = this.A04;
            if (runnable != null) {
                runnable.run();
            }
            this.A01 = 0;
            this.A0V.A00();
            return;
        }
        Log.e("FilterSelectorController/startUpdateFilteredMediaBitmapTask/mediaBitmap is null");
    }

    public void A06(boolean z2) {
        View view = this.A0L;
        if (view == null) {
            return;
        }
        if (A07() || A08()) {
            view.setVisibility(4);
            return;
        }
        this.A0E = false;
        this.A0C = true;
        this.A0D = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r3.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07() {
        /*
            r3 = this;
            android.view.View r0 = r3.A0L
            if (r0 == 0) goto L_0x000e
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A08
            if (r0 == 0) goto L_0x000e
            int r2 = r0.A0B
            r1 = 4
            r0 = 0
            if (r2 != r1) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30141bo.A07():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r3.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08() {
        /*
            r3 = this;
            android.view.View r0 = r3.A0L
            if (r0 == 0) goto L_0x000e
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A08
            if (r0 == 0) goto L_0x000e
            int r2 = r0.A0B
            r1 = 3
            r0 = 1
            if (r2 == r1) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30141bo.A08():boolean");
    }

    public boolean A09() {
        View view = this.A0L;
        if (view == null || A07() || this.A0H) {
            return false;
        }
        this.A07.A02(view, 1);
        this.A08.A0M(4);
        this.A0H = true;
        return true;
    }
}
