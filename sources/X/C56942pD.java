package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.2pD  reason: invalid class name and case insensitive filesystem */
public class C56942pD extends LinearLayout implements AnonymousClass006 {
    public int A00;
    public int A01;
    public int A02;
    public C16040sK A03;
    public AnonymousClass013 A04;
    public C14710pd A05;
    public AnonymousClass23T A06;
    public C52662eE A07;
    public List A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public C56942pD(Context context) {
        super(context);
        if (!this.A0C) {
            this.A0C = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A05 = C16150sX.A0k(A002);
            this.A03 = C16150sX.A04(A002);
            this.A04 = C16150sX.A0Z(A002);
        }
        this.A0B = false;
        this.A0A = true;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.dimen0673));
        setLayoutParams(layoutParams);
        setOrientation(0);
        setBackgroundResource(R.drawable.reaction_bubble_background);
        this.A02 = getResources().getDimensionPixelSize(R.dimen.dimen0767);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen076b);
        int i2 = this.A02;
        setPadding(i2, dimensionPixelSize, i2, dimensionPixelSize);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.dimen0670);
        setVisibility(8);
        setId(R.id.reactions_bubble_layout);
        setClipToPadding(false);
        setClipChildren(false);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.setClipToPadding(false);
            viewGroup.setClipChildren(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r5.A01() == 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass23T r19, boolean r20) {
        /*
            r18 = this;
            r3 = r18
            r0 = r20
            r3.A0E = r0
            X.23T r5 = r3.A06
            if (r5 == 0) goto L_0x0011
            int r1 = r5.A01()
            r0 = 0
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            r3.A0F = r0
            X.0pd r2 = r3.A05
            r1 = 2378(0x94a, float:3.332E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r8 = 3
            if (r0 == 0) goto L_0x0022
            r8 = 4
        L_0x0022:
            r6 = r19
            if (r19 != 0) goto L_0x008c
            r4 = 0
            r2 = 0
        L_0x0028:
            r3.A06 = r2
            java.util.List r9 = r3.A09
            if (r9 == 0) goto L_0x00e0
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00e0
            java.util.ArrayList r8 = X.AnonymousClass000.A0u()
            if (r4 == 0) goto L_0x00e1
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00e1
            r7 = 0
        L_0x0041:
            int r0 = r4.size()
            if (r7 >= r0) goto L_0x00e1
            java.lang.Object r2 = r4.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            r10 = 0
            if (r19 == 0) goto L_0x005e
            monitor-enter(r6)
            java.util.Map r0 = r6.A01     // Catch:{ all -> 0x00da }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x00da }
            X.23U r0 = (X.AnonymousClass23U) r0     // Catch:{ all -> 0x00da }
            monitor-exit(r6)
            if (r0 == 0) goto L_0x005e
            int r10 = r0.A00
        L_0x005e:
            r1 = 0
            if (r5 == 0) goto L_0x006f
            monitor-enter(r5)
            java.util.Map r0 = r5.A01     // Catch:{ all -> 0x00dd }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x00dd }
            X.23U r0 = (X.AnonymousClass23U) r0     // Catch:{ all -> 0x00dd }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x006f
            int r1 = r0.A00
        L_0x006f:
            if (r10 <= r1) goto L_0x007b
            java.lang.Object r2 = r4.get(r7)
        L_0x0075:
            r8.add(r2)
        L_0x0078:
            int r7 = r7 + 1
            goto L_0x0041
        L_0x007b:
            int r1 = X.C56092kx.A00(r6, r2)
            int r0 = X.C56092kx.A00(r5, r2)
            if (r1 <= r0) goto L_0x0078
            boolean r0 = r9.contains(r2)
            if (r0 != 0) goto L_0x0078
            goto L_0x0075
        L_0x008c:
            int r0 = r6.A01()
            int r0 = java.lang.Math.min(r0, r8)
            java.util.ArrayList r4 = X.C13690nt.A0i(r0)
            java.util.Iterator r7 = r6.A03()
        L_0x009c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00c9
            if (r8 <= 0) goto L_0x00c9
            java.lang.Object r2 = r7.next()
            X.23U r2 = (X.AnonymousClass23U) r2
            java.lang.String r1 = "□"
            java.lang.String r0 = r2.A02
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00c3
            java.util.TreeSet r0 = r2.A04
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.Object r0 = r0.next()
            X.2kN r0 = (X.C55792kN) r0
            java.lang.String r1 = r0.A05
        L_0x00c3:
            r4.add(r1)
            int r8 = r8 + -1
            goto L_0x009c
        L_0x00c9:
            X.0sK r1 = r6.A00
            java.util.Collection r0 = r6.A02()
            java.util.ArrayList r0 = X.C13680ns.A0n(r0)
            X.23T r2 = new X.23T
            r2.<init>(r1, r0)
            goto L_0x0028
        L_0x00da:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00e0:
            r8 = r4
        L_0x00e1:
            r3.A08 = r8
            if (r19 == 0) goto L_0x0169
            int r9 = r6.A01()
        L_0x00e9:
            if (r4 != 0) goto L_0x0164
            r8 = 0
        L_0x00ec:
            int r2 = r3.A01
            r0 = 2
            r10 = 0
            r11 = 1
            r1 = 0
            if (r2 < r0) goto L_0x00f5
            r1 = 1
        L_0x00f5:
            r5 = 2
            r0 = 0
            if (r9 < r5) goto L_0x00fa
            r0 = 1
        L_0x00fa:
            if (r1 == 0) goto L_0x011c
            if (r0 != 0) goto L_0x0106
            int r0 = r3.getChildCount()
            int r0 = r0 - r11
            r3.removeViewAt(r0)
        L_0x0106:
            java.util.List r0 = r3.A09
            int r6 = X.C13680ns.A07(r0)
            if (r6 == r8) goto L_0x010f
            r10 = 1
        L_0x010f:
            r3.A0B = r10
            if (r6 <= r8) goto L_0x016c
            int r6 = r6 - r11
        L_0x0114:
            if (r6 < r8) goto L_0x0182
            r3.removeViewAt(r6)
            int r6 = r6 + -1
            goto L_0x0114
        L_0x011c:
            if (r0 == 0) goto L_0x0106
            android.content.Context r0 = r3.getContext()
            X.3gt r2 = new X.3gt
            r2.<init>(r0)
            r1 = -2
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r1, r1)
            r2.setLayoutParams(r0)
            int r0 = r3.A02
            r2.A01 = r0
            r2.A02 = r0
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131101381(0x7f0606c5, float:1.781517E38)
            int r0 = r1.getColor(r0)
            int r1 = r3.A00
            android.graphics.Rect r0 = r2.A0B
            r0.setEmpty()
            com.obwhatsapp.TextEmojiLabel r0 = r2.A07
            float r1 = (float) r1
            r0.setTextSize(r10, r1)
            com.obwhatsapp.TextEmojiLabel r0 = r2.A08
            r0.setTextSize(r10, r1)
            r6 = 200(0xc8, double:9.9E-322)
            r0 = 300(0x12c, double:1.48E-321)
            r2.A04 = r6
            r2.A03 = r0
            android.view.animation.Interpolator r0 = X.C56092kx.A01
            r2.setAnimationInterpolator(r0)
            r3.addView(r2)
            goto L_0x0106
        L_0x0164:
            int r8 = r4.size()
            goto L_0x00ec
        L_0x0169:
            r9 = 0
            goto L_0x00e9
        L_0x016c:
            if (r8 <= r6) goto L_0x0182
        L_0x016e:
            if (r6 >= r8) goto L_0x0182
            android.content.Context r2 = r3.getContext()
            r1 = 2131559656(0x7f0d04e8, float:1.8744662E38)
            r0 = 0
            android.view.View r0 = android.widget.LinearLayout.inflate(r2, r1, r0)
            r3.addView(r0, r6)
            int r6 = r6 + 1
            goto L_0x016e
        L_0x0182:
            r3.A09 = r4
            r3.A01 = r9
            if (r4 == 0) goto L_0x040b
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x040b
            r8 = 0
            r3.setVisibility(r8)
            r7 = 0
        L_0x0193:
            java.util.List r0 = r3.A09
            int r0 = r0.size()
            r4 = 1
            if (r7 >= r0) goto L_0x0355
            int r0 = r3.getChildCount()
            if (r7 >= r0) goto L_0x0355
            android.view.View r6 = r3.getChildAt(r7)
            com.obwhatsapp.TextEmojiLabel r6 = (com.obwhatsapp.TextEmojiLabel) r6
            java.util.List r0 = r3.A09
            java.lang.String r2 = X.AnonymousClass000.A0n(r0, r7)
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x0350
            boolean r0 = r3.A0D
            if (r0 != 0) goto L_0x0350
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x0350
            java.util.List r0 = r3.A08
            if (r0 == 0) goto L_0x0350
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0350
            r3.A0D = r4
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x0231
            android.animation.AnimatorSet r12 = new android.animation.AnimatorSet
            r12.<init>()
            float[] r0 = new float[r5]
            r0 = {0, 1066192077} // fill-array
            java.lang.String r13 = "scaleX"
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r3, r13, r0)
            float[] r0 = new float[r5]
            r0 = {0, 1066192077} // fill-array
            java.lang.String r10 = "scaleY"
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r3, r10, r0)
            r0 = 130(0x82, double:6.4E-322)
            r12.setDuration(r0)
            android.view.animation.Interpolator r14 = X.C56092kx.A01
            r12.setInterpolator(r14)
            android.animation.Animator[] r9 = new android.animation.Animator[r5]
            r9[r8] = r15
            r9[r4] = r11
            r12.playTogether(r9)
            android.animation.AnimatorSet r11 = new android.animation.AnimatorSet
            r11.<init>()
            float[] r9 = new float[r5]
            r9 = {1066192077, 1065353216} // fill-array
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r3, r13, r9)
            float[] r9 = new float[r5]
            r9 = {1066192077, 1065353216} // fill-array
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r3, r10, r9)
            android.animation.Animator[] r9 = new android.animation.Animator[r5]
            r9[r8] = r13
            r9[r4] = r10
            r11.playTogether(r9)
            r12.setDuration(r0)
            r12.setInterpolator(r14)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r5]
            r0[r8] = r12
            r0[r4] = r11
            r1.playSequentially(r0)
            r1.start()
        L_0x0231:
            java.lang.CharSequence r17 = r6.getText()
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            float[] r0 = new float[r5]
            r0 = {0, 1067030938} // fill-array
            java.lang.String r13 = "scaleX"
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r6, r13, r0)
            float[] r0 = new float[r5]
            r0 = {0, 1067030938} // fill-array
            java.lang.String r9 = "scaleY"
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r6, r9, r0)
            r0 = 100
            r15.setDuration(r0)
            android.view.animation.Interpolator r12 = X.C56092kx.A00
            r15.setInterpolator(r12)
            android.animation.Animator[] r10 = new android.animation.Animator[r5]
            r10[r8] = r14
            r10[r4] = r11
            r15.playTogether(r10)
            android.animation.AnimatorSet r14 = new android.animation.AnimatorSet
            r14.<init>()
            float[] r10 = new float[r5]
            r10 = {1067030938, 1064346583} // fill-array
            android.animation.ObjectAnimator r16 = android.animation.ObjectAnimator.ofFloat(r6, r13, r10)
            float[] r10 = new float[r5]
            r10 = {1067030938, 1064346583} // fill-array
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r6, r9, r10)
            r14.setDuration(r0)
            r14.setStartDelay(r0)
            r14.setInterpolator(r12)
            android.animation.Animator[] r10 = new android.animation.Animator[r5]
            r10[r8] = r16
            r10[r4] = r11
            r14.playTogether(r10)
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            float[] r11 = new float[r5]
            r11 = {1064346583, 1065353216} // fill-array
            android.animation.ObjectAnimator r16 = android.animation.ObjectAnimator.ofFloat(r6, r13, r11)
            float[] r11 = new float[r5]
            r11 = {1064346583, 1065353216} // fill-array
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r6, r9, r11)
            r10.setDuration(r0)
            r10.setStartDelay(r0)
            r10.setInterpolator(r12)
            android.animation.Animator[] r0 = new android.animation.Animator[r5]
            r0[r8] = r16
            r0[r4] = r11
            r10.playTogether(r0)
            android.animation.AnimatorSet r11 = new android.animation.AnimatorSet
            r11.<init>()
            r0 = 3
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r8] = r15
            r0[r4] = r14
            r0[r5] = r10
            r11.playSequentially(r0)
            X.3KF r0 = new X.3KF
            r0.<init>(r6, r3, r2)
            r11.addListener(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 != 0) goto L_0x034c
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x034c
            android.animation.AnimatorSet r10 = new android.animation.AnimatorSet
            r10.<init>()
            float[] r0 = new float[r5]
            r0 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofFloat(r6, r13, r0)
            float[] r0 = new float[r5]
            r0 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r6, r9, r0)
            r0 = 100
            r10.setDuration(r0)
            r10.setInterpolator(r12)
            android.animation.Animator[] r0 = new android.animation.Animator[r5]
            r0[r8] = r13
            r0[r4] = r9
            r10.playTogether(r0)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r5]
            r0[r8] = r10
            r0[r4] = r11
            r1.playSequentially(r0)
            r1.start()
        L_0x0313:
            X.AnonymousClass00B.A06(r2)
            X.1pj r0 = new X.1pj
            r0.<init>((java.lang.String) r2)
            int[] r0 = r0.A00
            int[] r0 = X.C62153Bw.A07(r0)
            java.lang.String r1 = X.C37781pj.A00(r0)
            java.lang.String[] r0 = X.C56092kx.A03
            boolean r0 = X.AnonymousClass45B.A00(r1, r0)
            if (r0 == 0) goto L_0x0345
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131166833(0x7f070671, float:1.7947923E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0O(r6)
            r0.bottomMargin = r1
        L_0x033e:
            r6.setLayoutParams(r0)
            int r7 = r7 + 1
            goto L_0x0193
        L_0x0345:
            android.view.ViewGroup$MarginLayoutParams r0 = X.AnonymousClass000.A0O(r6)
            r0.bottomMargin = r8
            goto L_0x033e
        L_0x034c:
            r11.start()
            goto L_0x0313
        L_0x0350:
            r0 = 0
            r6.A0I(r0, r2)
            goto L_0x0313
        L_0x0355:
            int r0 = r3.A01
            if (r0 < r5) goto L_0x038a
            int r0 = r3.getChildCount()
            int r0 = r0 - r4
            android.view.View r2 = r3.getChildAt(r0)
            boolean r0 = r2 instanceof com.obwhatsapp.RollingCounterView
            if (r0 == 0) goto L_0x03ef
            com.obwhatsapp.RollingCounterView r2 = (com.obwhatsapp.RollingCounterView) r2
            int r7 = r3.A01
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x03ea
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x03ea
            long r9 = r2.A04
            long r11 = r2.A03
        L_0x0376:
            X.4Lm r0 = r2.A05
            if (r0 != 0) goto L_0x03da
            int r0 = r2.A00
            if (r7 == r0) goto L_0x038a
            r8 = -1
            if (r0 >= r7) goto L_0x0382
            r8 = 1
        L_0x0382:
            X.4Lm r6 = new X.4Lm
            r6.<init>(r7, r8, r9, r11)
            r2.A03(r6)
        L_0x038a:
            java.util.List r0 = r3.A09
            if (r0 == 0) goto L_0x0415
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0415
            java.util.List r1 = r3.A09
            r8 = 0
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[r8]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            java.lang.String r0 = ", "
            java.lang.String r7 = X.AnonymousClass1ZW.A0B(r0, r1)
            java.util.List r0 = r3.A09
            int r0 = r0.size()
            if (r0 != r4) goto L_0x03c0
            android.content.Context r6 = r3.getContext()
            r2 = 2131891013(0x7f121345, float:1.9416734E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r8] = r7
        L_0x03b8:
            java.lang.String r0 = r6.getString(r2, r1)
            r3.setContentDescription(r0)
            return
        L_0x03c0:
            X.013 r2 = r3.A04
            android.content.Context r1 = r3.getContext()
            int r0 = r3.A01
            java.lang.String r0 = X.C56092kx.A02(r1, r2, r0)
            android.content.Context r6 = r3.getContext()
            r2 = 2131891012(0x7f121344, float:1.9416732E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r8] = r7
            r1[r4] = r0
            goto L_0x03b8
        L_0x03da:
            int r0 = r0.A00
            if (r7 == r0) goto L_0x038a
            r8 = -1
            if (r0 >= r7) goto L_0x03e2
            r8 = 1
        L_0x03e2:
            X.4Lm r6 = new X.4Lm
            r6.<init>(r7, r8, r9, r11)
            r2.A06 = r6
            goto L_0x038a
        L_0x03ea:
            r11 = 0
            r9 = 0
            goto L_0x0376
        L_0x03ef:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            r1.append(r2)
            java.lang.String r0 = " is not of type RollingCounterView! Something has gone wrong inside ensureViews(). childCount="
            r1.append(r0)
            int r0 = r3.getChildCount()
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            X.AnonymousClass00B.A0E(r0)
            goto L_0x038a
        L_0x040b:
            java.util.List r1 = r3.A09
            r0 = 8
            if (r1 != 0) goto L_0x0412
            r0 = 4
        L_0x0412:
            r3.setVisibility(r0)
        L_0x0415:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56942pD.A00(X.23T, boolean):void");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A07;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAreAnimationsEnabled(boolean z2) {
        this.A0A = z2;
    }
}
