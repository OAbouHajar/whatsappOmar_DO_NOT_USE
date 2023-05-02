package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxDObserverShape32S0100000_2_I1;

/* renamed from: X.2rQ  reason: invalid class name and case insensitive filesystem */
public class C57592rQ extends AnonymousClass07D {
    public int A00;
    public Rect A01 = AnonymousClass000.A0J();
    public LruCache A02 = new LruCache(50);
    public View A03;
    public boolean A04;
    public final C32181fm A05;

    public C57592rQ(Context context, RecyclerView recyclerView, C32181fm r5, AnonymousClass4D6 r6) {
        this.A05 = r5;
        recyclerView.A14.add(new C95404ma(new AnonymousClass09P(context, new AnonymousClass3Ma(this, r6)), r5, this, r6));
        ((AnonymousClass01X) r5).A01.registerObserver(new IDxDObserverShape32S0100000_2_I1(this, 0));
    }

    public static /* synthetic */ void A00(C57592rQ r2, int i2, int i3) {
        LruCache lruCache = r2.A02;
        if (lruCache.size() != 0) {
            for (int i4 = i2; i4 <= i2 + i3; i4++) {
                lruCache.remove(Integer.valueOf(i4));
            }
        }
    }

    public void A02(Canvas canvas, AnonymousClass0Ri r11, RecyclerView recyclerView) {
        AnonymousClass02W layoutManager;
        View A0C;
        C32181fm r8 = this.A05;
        if (r8.AfG() && (layoutManager = recyclerView.getLayoutManager()) != null && (A0C = layoutManager.A0C(0)) != null) {
            int A002 = RecyclerView.A00(A0C);
            if (A002 == -1) {
                View view = this.A03;
                canvas.save();
                canvas.translate((float) this.A01.left, 0.0f);
                view.draw(canvas);
            } else {
                int ACa = r8.ACa(A002);
                if (ACa == -1) {
                    this.A04 = true;
                    return;
                }
                this.A04 = false;
                if (A002 == ACa) {
                    layoutManager.A0I(A0C, this.A01);
                }
                LruCache lruCache = this.A02;
                Integer valueOf = Integer.valueOf(ACa);
                View view2 = (View) lruCache.get(valueOf);
                if (view2 == null) {
                    C005602k APF = r8.APF(recyclerView, r8.getItemViewType(ACa));
                    r8.ANf(APF, ACa);
                    view2 = APF.A0H;
                    lruCache.put(valueOf, view2);
                }
                Rect rect = this.A01;
                int i2 = 0;
                view2.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), recyclerView.getPaddingLeft() + recyclerView.getPaddingRight(), view2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), view2.getLayoutParams().height));
                this.A00 = view2.getMeasuredHeight() + rect.bottom + rect.top;
                view2.layout(0, 0, view2.getMeasuredWidth() + rect.left + rect.right, this.A00);
                this.A03 = view2;
                int bottom = view2.getBottom() - rect.top;
                while (i2 < recyclerView.getChildCount()) {
                    View childAt = recyclerView.getChildAt(i2);
                    Rect A0J = AnonymousClass000.A0J();
                    RecyclerView.A03(childAt, A0J);
                    if (A0J.bottom <= bottom || A0J.top > bottom) {
                        i2++;
                    } else if (childAt != null) {
                        int A003 = RecyclerView.A00(childAt);
                        if (A003 == -1 || !r8.AIu(A003)) {
                            canvas.save();
                            canvas.translate((float) rect.left, 0.0f);
                        } else {
                            canvas.save();
                            canvas.translate((float) rect.left, (float) (childAt.getTop() - view2.getHeight()));
                        }
                        view2.draw(canvas);
                    } else {
                        return;
                    }
                }
                return;
            }
            canvas.restore();
        }
    }
}
