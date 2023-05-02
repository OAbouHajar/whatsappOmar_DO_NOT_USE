package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.3T3  reason: invalid class name */
public class AnonymousClass3T3 extends RecyclerView {
    public int A00 = -1;
    public int A01;
    public int A02 = getResources().getDimensionPixelSize(R.dimen.dimen043f);
    public int A03;
    public int A04 = -1;
    public View A05;
    public ViewGroup A06;
    public TextView A07;
    public C83644Hm A08;
    public C88244aB A09 = new C88244aB(this);
    public C88244aB A0A = new C88244aB(this);
    public C64533Qr A0B;
    public C23061Ai A0C;
    public List A0D;
    public boolean A0E = false;

    public AnonymousClass3T3(Context context, View view, ViewGroup viewGroup, TextView textView, C83644Hm r8, C23061Ai r9) {
        super(context);
        this.A05 = view;
        this.A07 = textView;
        this.A06 = viewGroup;
        this.A0C = r9;
        this.A08 = r8;
        setBackgroundColor(AnonymousClass00T.A00(getContext(), R.color.color04cb));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.A0B = new C64533Qr();
        getContext();
        setLayoutManager(new LinearLayoutManager());
        setAdapter(this.A0B);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r3 = r19
            r9 = r17
            android.view.View r0 = r9.A05
            boolean r0 = X.C23061Ai.A00(r0)
            if (r0 == 0) goto L_0x0124
            X.4aB r8 = r9.A09
        L_0x000e:
            boolean r0 = r8.A03
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L_0x0054
            r8.A03 = r5
            X.3T3 r0 = r8.A04
            android.view.View r0 = r0.A05
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 2
            com.facebook.redex.IDxDListenerShape191S0100000_2_I1 r0 = new com.facebook.redex.IDxDListenerShape191S0100000_2_I1
            r0.<init>(r8, r1)
            r2.addOnPreDrawListener(r0)
        L_0x0029:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
        L_0x002d:
            int r0 = r9.getVisibility()
            if (r0 != 0) goto L_0x004c
            X.4Hm r1 = r9.A08
            int r2 = android.view.View.MeasureSpec.getSize(r3)
            X.39b r0 = r1.A01
            X.4Nk r1 = r1.A00
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x004c
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r1.A05
            android.view.View r1 = r0.A01
            if (r2 <= 0) goto L_0x0052
            r0 = 8
        L_0x0049:
            r1.setVisibility(r0)
        L_0x004c:
            r0 = r18
            super.onMeasure(r0, r3)
            return
        L_0x0052:
            r0 = 0
            goto L_0x0049
        L_0x0054:
            X.3T3 r4 = r8.A04
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x002d
            int r10 = r4.A00
            r1 = -1
            if (r10 != r1) goto L_0x010b
            int r0 = r4.A03
            if (r0 == r1) goto L_0x00fd
            int r0 = r4.A04
            if (r0 == r1) goto L_0x00f5
            int r12 = r0 + 1
        L_0x0069:
            r11 = 0
            r10 = 0
            r3 = 0
        L_0x006c:
            if (r11 >= r12) goto L_0x0100
            X.3Qr r0 = r4.A0B
            int r13 = r0.getItemViewType(r11)
            java.util.Map r2 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r2.get(r0)
            X.3Ss r1 = (X.C65063Ss) r1
            if (r1 != 0) goto L_0x0089
            X.3Ss r1 = X.C64533Qr.A00(r4, r13)
            r2.put(r0, r1)
        L_0x0089:
            java.util.List r0 = r4.A0D
            java.lang.Object r0 = r0.get(r11)
            X.4Sn r0 = (X.C86394Sn) r0
            r1.A07(r0)
            android.view.ViewGroup r0 = r4.A06
            r16 = r0
            android.view.View r13 = r1.A0H
            int r1 = r16.getWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = r16.getHeight()
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            if (r15 != 0) goto L_0x00b9
            r1 = -1
            r0 = -2
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r1, r0)
        L_0x00b9:
            int r1 = r16.getPaddingLeft()
            int r0 = r16.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r15.width
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r2, r1, r0)
            int r1 = r16.getPaddingTop()
            int r0 = r16.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r15.height
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r14, r1, r0)
            r13.measure(r2, r0)
            int r2 = r13.getMeasuredHeight()
            int r1 = r4.A03
            int r0 = r1 + 1
            if (r11 >= r0) goto L_0x00ea
            r0 = r2
            if (r11 != r1) goto L_0x00e9
            int r0 = r2 >> 1
        L_0x00e9:
            int r3 = r3 + r0
        L_0x00ea:
            int r0 = r4.A04
            if (r11 != r0) goto L_0x00f0
            int r2 = r2 >> 1
        L_0x00f0:
            int r10 = r10 + r2
            int r11 = r11 + 1
            goto L_0x006c
        L_0x00f5:
            X.3Qr r0 = r4.A0B
            int r12 = r0.A0C()
            goto L_0x0069
        L_0x00fd:
            int r10 = r4.A02
            goto L_0x010b
        L_0x0100:
            r4.A00 = r10
            r4.A01 = r3
            X.3Qr r0 = r4.A0B
            java.util.Map r0 = r0.A00
            r0.clear()
        L_0x010b:
            int r1 = r8.A01
            int r0 = r1 + r10
            int r2 = r8.A00
            if (r0 <= r2) goto L_0x0122
            int r2 = r2 - r1
            if (r2 < 0) goto L_0x011e
            int r1 = r4.A01
            r0 = -1
            if (r1 == r0) goto L_0x011e
            if (r2 < r1) goto L_0x011e
            r6 = r2
        L_0x011e:
            r8.A02 = r5
            goto L_0x0029
        L_0x0122:
            r6 = r10
            goto L_0x011e
        L_0x0124:
            X.4aB r8 = r9.A0A
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3T3.onMeasure(int, int):void");
    }

    public void setData(String str, List list, C107985Mf r7) {
        this.A0D = AnonymousClass000.A0u();
        if (str != null && !TextUtils.isEmpty(str)) {
            this.A0D.add(new C73993pX(str));
        }
        this.A00 = -1;
        this.A04 = -1;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.A0D.add(new AnonymousClass3pY((AnonymousClass4TW) list.get(i2), r7));
                if (i2 == 0) {
                    this.A03 = this.A0D.size() - 1;
                } else if (i2 == 2) {
                    this.A04 = this.A0D.size() - 1;
                }
                this.A0D.add(new C86394Sn(3));
            }
        }
        this.A0B.A0F(this.A0D);
    }
}
