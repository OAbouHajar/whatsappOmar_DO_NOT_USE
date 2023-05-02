package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.obwhatsapp.R;
import com.obwhatsapp.WaDynamicRoundCornerImageView;
import com.obwhatsapp.WaRoundCornerImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;

/* renamed from: X.26F  reason: invalid class name */
public class AnonymousClass26F extends AnonymousClass26E {
    public Drawable A00;
    public WaRoundCornerImageView A01;
    public AnonymousClass4Q9 A02;
    public AnonymousClass3LC A03;
    public AnonymousClass5SU A04;
    public VideoPort A05;
    public String A06;
    public boolean A07 = false;
    public final int A08;
    public final Rect A09 = new Rect();
    public final View A0A;
    public final View A0B;
    public final View A0C;
    public final ViewGroup A0D;
    public final ViewTreeObserver.OnGlobalLayoutListener A0E;
    public final ImageView A0F;
    public final ConstraintLayout A0G;
    public final ConstraintLayout A0H;
    public final WaDynamicRoundCornerImageView A0I;
    public final WaDynamicRoundCornerImageView A0J;
    public final WaTextView A0K;
    public final C26801Pf A0L;
    public final C26811Ph A0M;
    public final C87374Wn A0N;
    public final ThumbnailButton A0O;
    public final C14710pd A0P;
    public final C33741j5 A0Q;
    public final C449426i A0R = new C449326h(this);
    public final boolean A0S;
    public final boolean A0T;

    public AnonymousClass26F(View view, C23651Cv r15, AnonymousClass4DV r16, CallGridViewModel callGridViewModel, C26801Pf r18, C26811Ph r19, C17160ud r20, C16080sP r21, C14710pd r22, boolean z2, boolean z3) {
        super(view, r15, r16, callGridViewModel, r20, r21);
        C87374Wn r0;
        this.A0B = C004601z.A0E(view, R.id.mute_image);
        this.A0Q = new C33741j5(C004601z.A0E(view, R.id.loading_spinner));
        this.A0A = C004601z.A0E(view, R.id.dark_overlay);
        this.A0F = (ImageView) C004601z.A0E(view, R.id.frame_overlay);
        this.A0H = (ConstraintLayout) C004601z.A0E(view, R.id.video_container);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.video_status_container);
        this.A0D = viewGroup;
        this.A0G = (ConstraintLayout) C004601z.A0E(view, R.id.participant_photo_container);
        this.A0I = (WaDynamicRoundCornerImageView) C004601z.A0E(view, R.id.call_grid_blur_background);
        this.A0J = (WaDynamicRoundCornerImageView) C004601z.A0E(view, R.id.tile_background);
        ThumbnailButton thumbnailButton = (ThumbnailButton) C004601z.A0E(view, R.id.participant_photo);
        this.A0O = thumbnailButton;
        this.A01 = (WaRoundCornerImageView) view.findViewById(R.id.gradient_overlay);
        C14710pd r5 = r22;
        this.A0P = r5;
        this.A0L = r18;
        this.A0M = r19;
        this.A0S = z3;
        this.A0T = r5.A0E(C16620tM.A02, 2222);
        this.A0K = viewGroup != null ? (WaTextView) viewGroup.findViewById(R.id.status) : null;
        View A0E2 = C004601z.A0E(view, z2 ? R.id.texture_view : R.id.surface_view);
        this.A0C = A0E2;
        if (A0E2 instanceof SurfaceView) {
            r0 = new C73023n9((SurfaceView) A0E2);
        } else if (A0E2 instanceof TextureView) {
            r0 = new C73033nA((TextureView) A0E2);
        } else {
            throw new IllegalArgumentException("videoView must be one of [SurfaceView, TextureView]");
        }
        this.A0N = r0;
        Resources.Theme theme = view.getContext().getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.attr008b, typedValue, true);
        this.A00 = view.getResources().getDimensionPixelSize(typedValue.data != 0 ? typedValue.resourceId : R.dimen.dimen0109);
        this.A01 = view.getResources().getDimensionPixelSize(R.dimen.dimen010b);
        thumbnailButton.A02 = (((float) view.getResources().getDisplayMetrics().widthPixels) + 1.0f) / 2.0f;
        int color = view.getContext().getResources().getColor(R.color.color0092);
        this.A08 = color;
        AnonymousClass3LC r1 = new AnonymousClass3LC(this.A00, color);
        this.A03 = r1;
        r1.A00 = new Rect(0, 0, 0, 0);
        AnonymousClass3LC r3 = this.A03;
        View view2 = this.A0H;
        AnonymousClass00B.A0B("FrameLayout required as root to support corner rounding via overlay", view2 instanceof FrameLayout);
        ((FrameLayout) view2).setForeground(r3);
        this.A0E = new IDxLListenerShape144S0100000_2_I0(this, 3);
        view.addOnAttachStateChangeListener(new C449026e(view, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02b6, code lost:
        if (r2 != false) goto L_0x02b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.C37921px r12) {
        /*
            r11 = this;
            boolean r0 = r12.A0E
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "preview - "
        L_0x0006:
            r11.A06 = r0
            boolean r0 = r11.A06()
            if (r0 == 0) goto L_0x0033
            X.1px r0 = r11.A06
            com.whatsapp.jid.UserJid r1 = r0.A0U
            com.whatsapp.jid.UserJid r0 = r12.A0U
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0033
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r11.A06
            r1.append(r0)
            java.lang.String r0 = "bind() called with new participant before unbind()"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r11.A08()
        L_0x0033:
            com.whatsapp.voipcalling.VideoPort r0 = r11.A05
            r3 = 0
            if (r0 != 0) goto L_0x00ad
            X.3LC r0 = r11.A03
            r2 = 0
            if (r0 != 0) goto L_0x003e
            r2 = 1
        L_0x003e:
            boolean r0 = r11.A0T
            com.whatsapp.jid.UserJid r8 = r12.A0U
            r11.A07 = r3
            if (r0 == 0) goto L_0x00a3
            X.1Ph r6 = r11.A0M
            java.util.Map r2 = r6.A08
            boolean r0 = r2.containsKey(r8)
            if (r0 == 0) goto L_0x005f
            java.lang.Object r4 = r2.get(r8)
            X.AnonymousClass00B.A06(r4)
            X.2Qx r4 = (X.AnonymousClass2Qx) r4
        L_0x0059:
            r11.A05 = r4
            java.util.Set r0 = r4.A0D
            monitor-enter(r0)
            goto L_0x0094
        L_0x005f:
            java.lang.String r1 = "voip/VideoPortManager/getVideoPort creating port for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Pf r1 = r6.A05
            X.0sK r0 = r1.A00
            boolean r0 = r0.A0I(r8)
            r10 = r0 ^ 1
            X.0pd r7 = r1.A02
            X.46D r5 = new X.46D
            r5.<init>()
            com.whatsapp.voipcalling.GlVideoRenderer r9 = new com.whatsapp.voipcalling.GlVideoRenderer
            r9.<init>()
            X.2Qx r4 = new X.2Qx
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r2.put(r8, r4)
            goto L_0x0059
        L_0x0090:
            java.lang.String r0 = "display - "
            goto L_0x0006
        L_0x0094:
            r0.add(r11)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x00ad
            r11.A0I()
            goto L_0x00ad
        L_0x00a0:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            throw r1
        L_0x00a3:
            X.1Pf r1 = r11.A0L
            android.view.View r0 = r11.A0C
            com.whatsapp.voipcalling.VideoPort r0 = r1.A00(r0, r2)
            r11.A05 = r0
        L_0x00ad:
            boolean r6 = r11.A0T
            if (r6 == 0) goto L_0x00c0
            X.4Wn r2 = r11.A0N
            com.whatsapp.voipcalling.VideoPort r1 = r11.A05
            X.2Qx r1 = (X.AnonymousClass2Qx) r1
            X.2Qx r0 = r2.A01
            if (r0 != 0) goto L_0x02d0
            r2.A01 = r1
            r2.A01()
        L_0x00c0:
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = r11.A05
            if (r1 == 0) goto L_0x0109
            boolean r0 = r11.A06()
            if (r0 != 0) goto L_0x0109
            r0 = 85
            com.facebook.redex.IDxObserverShape115S0100000_2_I0 r5 = new com.facebook.redex.IDxObserverShape115S0100000_2_I0
            r5.<init>((java.lang.Object) r11, (int) r0)
            r11.A04 = r5
            X.4Ql r4 = r1.A0G
            com.whatsapp.jid.UserJid r2 = r12.A0U
            java.util.Map r1 = r4.A01
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x00e3
            r0 = 0
            r1.put(r2, r0)
        L_0x00e3:
            java.util.Map r0 = r4.A00
            r0.put(r2, r5)
            X.0sH r4 = r12.A0T
            com.obwhatsapp.WaDynamicRoundCornerImageView r1 = r11.A0I
            r0 = 1
            r11.A0E(r1, r4, r0, r3)
            com.obwhatsapp.components.button.ThumbnailButton r0 = r11.A0O
            r11.A0E(r0, r4, r3, r3)
            android.view.View r2 = r11.A0C
            boolean r0 = r12.A0E
            if (r0 == 0) goto L_0x02c8
            android.content.Context r1 = r2.getContext()
            r0 = 2131893160(0x7f121ba8, float:1.9421089E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0106:
            r2.setContentDescription(r0)
        L_0x0109:
            boolean r0 = r11.A06()
            r8 = r0 ^ 1
            r11.A06 = r12
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x02bd
            com.obwhatsapp.WaRoundCornerImageView r5 = r11.A01
            if (r5 == 0) goto L_0x0148
            android.content.Context r7 = r5.getContext()
            android.graphics.drawable.Drawable r0 = r11.A00
            if (r0 != 0) goto L_0x0140
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r0 = 2
            int[] r2 = new int[r0]
            r0 = 2131101586(0x7f060792, float:1.7815586E38)
            int r0 = X.AnonymousClass00T.A00(r7, r0)
            r2[r3] = r0
            r1 = 1
            r0 = 2131099807(0x7f06009f, float:1.7811978E38)
            int r0 = X.AnonymousClass00T.A00(r7, r0)
            r2[r1] = r0
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>(r4, r2)
            r11.A00 = r0
        L_0x0140:
            r5.setVisibility(r3)
            android.graphics.drawable.Drawable r0 = r11.A00
            r5.setImageDrawable(r0)
        L_0x0148:
            boolean r4 = r12.A0C
            boolean r2 = r12.A08
            boolean r1 = r12.A0A
            boolean r0 = r11.A0S
            if (r0 != 0) goto L_0x02b8
            if (r1 == 0) goto L_0x02b1
            r1 = 2131165457(0x7f070111, float:1.7945132E38)
        L_0x0157:
            android.view.View r4 = r11.A0H
            android.content.res.Resources r0 = r4.getResources()
            int r5 = r0.getDimensionPixelSize(r1)
            X.3LC r0 = r11.A03
            if (r0 != 0) goto L_0x0177
            if (r6 == 0) goto L_0x0177
            X.4Wn r2 = r11.A0N
            float r1 = (float) r5
            float r0 = r2.A00
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 == 0) goto L_0x0177
            r2.A00 = r1
            r2.A02()
        L_0x0177:
            int r0 = r11.A00
            if (r5 == r0) goto L_0x01a7
            r11.A00 = r5
            X.3LC r0 = r11.A03
            if (r0 == 0) goto L_0x029e
            int r0 = r11.A08
            X.3LC r2 = new X.3LC
            r2.<init>(r5, r0)
            r11.A03 = r2
            boolean r1 = r4 instanceof android.widget.FrameLayout
            java.lang.String r0 = "FrameLayout required as root to support corner rounding via overlay"
            X.AnonymousClass00B.A0B(r0, r1)
            r0 = r4
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setForeground(r2)
        L_0x0197:
            com.obwhatsapp.WaDynamicRoundCornerImageView r1 = r11.A0I
            int r0 = r11.A00
            float r0 = (float) r0
            r1.setRadius(r0)
            com.obwhatsapp.WaDynamicRoundCornerImageView r1 = r11.A0J
            int r0 = r11.A00
            float r0 = (float) r0
            r1.setRadius(r0)
        L_0x01a7:
            if (r8 == 0) goto L_0x01b2
            X.26i r1 = r11.A0R
            com.whatsapp.voipcalling.VideoPort r0 = r11.A05
            if (r0 == 0) goto L_0x01b2
            r0.setListener(r1)
        L_0x01b2:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r11.A0H
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L_0x01c8
            android.graphics.drawable.Drawable r1 = r5.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r11.A00
            float r0 = (float) r0
            r1.setCornerRadius(r0)
        L_0x01c8:
            X.2Wj r7 = r12.A06
            boolean r0 = r12.A0Q
            r6 = 8
            if (r0 != 0) goto L_0x01d8
            boolean r0 = r11.A07
            if (r0 != 0) goto L_0x0299
            boolean r0 = r12.A0S
            if (r0 == 0) goto L_0x0299
        L_0x01d8:
            r11.A0J(r3)
        L_0x01db:
            if (r7 == 0) goto L_0x0283
            boolean r0 = r12.A0Q
            if (r0 != 0) goto L_0x0283
            boolean r0 = r12.A0N
            if (r0 != 0) goto L_0x0283
            android.view.ViewGroup r2 = r11.A0D
            if (r2 == 0) goto L_0x020d
            com.obwhatsapp.WaTextView r1 = r11.A0K
            if (r1 == 0) goto L_0x020d
            r2.setVisibility(r3)
            X.1px r0 = r11.A06
            if (r0 == 0) goto L_0x01fa
            int r0 = r0.A02
            float r0 = (float) r0
            r2.setRotation(r0)
        L_0x01fa:
            android.content.Context r0 = r1.getContext()
            java.lang.String r0 = r7.A00(r0)
            r1.setText(r0)
            r1.setVisibility(r3)
            com.obwhatsapp.components.button.ThumbnailButton r0 = r11.A0O
            r0.setVisibility(r6)
        L_0x020d:
            X.1j5 r2 = r11.A0Q
            boolean r1 = r12.A0N
            r0 = 8
            if (r1 == 0) goto L_0x0216
            r0 = 0
        L_0x0216:
            r2.A03(r0)
            android.view.View r1 = r11.A0B
            boolean r0 = r12.A0O
            if (r0 == 0) goto L_0x0228
            androidx.constraintlayout.widget.ConstraintLayout r0 = r11.A0G
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0228
            r6 = 0
        L_0x0228:
            r1.setVisibility(r6)
            X.1px r0 = r11.A06
            int r0 = r0.A02
            float r0 = (float) r0
            r1.setRotation(r0)
            boolean r0 = r12.A0O
            if (r0 != 0) goto L_0x023b
            boolean r0 = r12.A0H
            if (r0 != 0) goto L_0x0248
        L_0x023b:
            android.graphics.drawable.Drawable r1 = r5.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            int r0 = r11.A01
            if (r1 == 0) goto L_0x0248
            r1.setStroke(r0, r3)
        L_0x0248:
            android.graphics.Bitmap r2 = r12.A04
            android.widget.ImageView r1 = r11.A0F
            r1.setImageBitmap(r2)
            r0 = 0
            if (r2 != 0) goto L_0x0254
            r0 = 8
        L_0x0254:
            r1.setVisibility(r0)
            boolean r0 = r12.A0K
            if (r0 != 0) goto L_0x025f
            boolean r0 = r12.A0L
            if (r0 == 0) goto L_0x0268
        L_0x025f:
            r1 = 1
            com.facebook.redex.IDxTListenerShape167S0100000_2_I0 r0 = new com.facebook.redex.IDxTListenerShape167S0100000_2_I0
            r0.<init>(r11, r1)
            r4.setOnTouchListener(r0)
        L_0x0268:
            boolean r0 = r12.A0K
            if (r0 == 0) goto L_0x0276
            r1 = 9
            com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0
            r0.<init>(r11, r1, r12)
            r4.setOnClickListener(r0)
        L_0x0276:
            boolean r0 = r12.A0L
            if (r0 == 0) goto L_0x0282
            com.facebook.redex.IDxCListenerShape52S0200000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape52S0200000_2_I0
            r0.<init>(r12, r3, r11)
            r4.setOnLongClickListener(r0)
        L_0x0282:
            return
        L_0x0283:
            android.view.ViewGroup r0 = r11.A0D
            if (r0 == 0) goto L_0x020d
            r0.setVisibility(r6)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r11.A0G
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x020d
            com.obwhatsapp.components.button.ThumbnailButton r0 = r11.A0O
            r0.setVisibility(r3)
            goto L_0x020d
        L_0x0299:
            r11.A0J(r6)
            goto L_0x01db
        L_0x029e:
            com.whatsapp.voipcalling.VideoPort r0 = r11.A05
            if (r0 == 0) goto L_0x0197
            float r2 = (float) r5
            r0.setCornerRadius(r2)
            android.view.View r1 = r11.A0C
            boolean r0 = r1 instanceof android.view.SurfaceView
            if (r0 == 0) goto L_0x0197
            X.C55352jN.A01(r1, r2)
            goto L_0x0197
        L_0x02b1:
            if (r4 == 0) goto L_0x02b8
            r1 = 2131165462(0x7f070116, float:1.7945142E38)
            if (r2 == 0) goto L_0x0157
        L_0x02b8:
            r1 = 2131165450(0x7f07010a, float:1.7945117E38)
            goto L_0x0157
        L_0x02bd:
            com.obwhatsapp.WaRoundCornerImageView r1 = r11.A01
            if (r1 == 0) goto L_0x0148
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0148
        L_0x02c8:
            X.0sP r0 = r11.A0B
            java.lang.String r0 = r0.A08(r4)
            goto L_0x0106
        L_0x02d0:
            if (r0 == r1) goto L_0x00c0
            java.lang.String r0 = "Callback must be disconnected before connecting a different callback"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26F.A0G(X.1px):void");
    }

    public void A0H() {
        View view = this.A0C;
        if (view instanceof SurfaceView) {
            ((SurfaceView) view).setZOrderMediaOverlay(true);
            if (!this.A0T) {
                C55352jN.A01(view, (float) this.A00);
            }
        }
        this.A03 = null;
        View view2 = this.A0H;
        AnonymousClass00B.A0B("FrameLayout required as root to support corner rounding via overlay", view2 instanceof FrameLayout);
        ((FrameLayout) view2).setForeground((Drawable) null);
    }

    public void A0I() {
        this.A07 = true;
        VideoPort videoPort = this.A05;
        if (videoPort instanceof AnonymousClass2Qx) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.A06);
            sb.append("onRenderStarted  for ");
            sb.append(((AnonymousClass2Qx) videoPort).A0B);
            Log.i(sb.toString());
            this.A0F.post(new RunnableRunnableShape4S0100000_I0_3(this, 47));
        }
        this.A0G.post(new RunnableRunnableShape4S0100000_I0_3(this, 46));
    }

    public void A0J(int i2) {
        this.A0G.setVisibility(i2);
        WaTextView waTextView = this.A0K;
        int i3 = 8;
        if (waTextView != null && waTextView.getVisibility() == 0) {
            this.A0O.setVisibility(8);
        }
        if (i2 == 0) {
            this.A0B.setVisibility(8);
            return;
        }
        C37921px r0 = this.A06;
        if (r0 != null) {
            View view = this.A0B;
            if (r0.A0O) {
                i3 = 0;
            }
            view.setVisibility(i3);
        }
    }
}
