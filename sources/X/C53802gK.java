package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.facebook.redex.IDxLAdapterShape0S0200000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.reactions.ReactionEmojiTextView;
import com.obwhatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;
import java.util.List;

/* renamed from: X.2gK  reason: invalid class name and case insensitive filesystem */
public class C53802gK extends LinearLayout implements AnonymousClass006 {
    public static final Interpolator A0B = C04240Lt.A00(0.65f, 0.0f, 0.35f, 1.0f);
    public static final Interpolator A0C = C04240Lt.A00(0.87f, 0.0f, 0.13f, 1.0f);
    public static final Interpolator A0D = C04240Lt.A00(0.45f, 0.0f, 0.55f, 1.0f);
    public AnimatorSet A00;
    public C16040sK A01;
    public AnonymousClass013 A02;
    public C14710pd A03;
    public C17020u3 A04;
    public C27641So A05;
    public C52662eE A06;
    public boolean A07;
    public final AnimatorSet A08;
    public final ReactionsTrayViewModel A09;
    public final int[] A0A;

    public C53802gK(Context context, ReactionsTrayViewModel reactionsTrayViewModel) {
        super(context);
        if (!this.A07) {
            this.A07 = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A03 = (C14710pd) r1.A05.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A02 = (AnonymousClass013) r1.AR8.get();
            this.A05 = (C27641So) r1.AKf.get();
            this.A04 = (C17020u3) r1.AMG.get();
        }
        int i2 = ReactionsTrayViewModel.A0B;
        this.A0A = new int[(i2 + 1)];
        this.A08 = new AnimatorSet();
        this.A09 = reactionsTrayViewModel;
        setId(R.id.reactions_tray_layout);
        setClipChildren(false);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(0);
        float dimension = getContext().getResources().getDimension(R.dimen.dimen0674);
        int dimension2 = (int) getContext().getResources().getDimension(R.dimen.dimen0675);
        int A002 = AnonymousClass00T.A00(getContext(), R.color.color0096);
        int A003 = AnonymousClass00T.A00(getContext(), R.color.color068c);
        float[] fArr = {dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension};
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(new Rect(dimension2, dimension2, dimension2, dimension2));
        shapeDrawable.getPaint().setColor(A003);
        shapeDrawable.getPaint().setShadowLayer((float) dimension2, 0.0f, (float) (dimension2 >> 2), A002);
        if (Build.VERSION.SDK_INT < 28) {
            setLayerType(1, shapeDrawable.getPaint());
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, dimension2, dimension2, dimension2, dimension2);
        setBackground(layerDrawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen067a) + getResources().getDimensionPixelSize(R.dimen.dimen0675);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        ReactionsTrayViewModel reactionsTrayViewModel2 = this.A09;
        String str = ((C56082kw) reactionsTrayViewModel2.A0A.A01()).A00;
        int i3 = 0;
        while (i3 < reactionsTrayViewModel2.A03.size()) {
            String str2 = (String) reactionsTrayViewModel2.A03.get(i3);
            boolean z2 = i3 > 0;
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) LinearLayout.inflate(getContext(), R.layout.layout04eb, (ViewGroup) null);
            textEmojiLabel.A0I((List) null, str2);
            if (str2.equals(str)) {
                textEmojiLabel.setSelected(true);
            }
            AnonymousClass2JP.A03(textEmojiLabel, textEmojiLabel.isSelected() ? R.string.str0022 : R.string.str0021);
            addView(textEmojiLabel);
            if (z2) {
                ViewGroup.LayoutParams layoutParams = textEmojiLabel.getLayoutParams();
                C45902Bo.A07(textEmojiLabel, this.A02, getResources().getDimensionPixelSize(R.dimen.dimen0676), 0);
                textEmojiLabel.setLayoutParams(layoutParams);
            }
            textEmojiLabel.setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 30));
            i3++;
        }
        if (reactionsTrayViewModel2.A06.A0E(C16620tM.A02, 1524) && reactionsTrayViewModel2.A03.size() == i2) {
            LinearLayout.inflate(getContext(), R.layout.layout04e9, this);
            View findViewById = findViewById(R.id.reactions_plus_button);
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            C45902Bo.A07(findViewById, this.A02, getResources().getDimensionPixelSize(R.dimen.dimen0676), 0);
            findViewById.setLayoutParams(layoutParams2);
            findViewById.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 39));
        }
    }

    public static /* synthetic */ Animator A00(C53802gK r6, ReactionEmojiTextView reactionEmojiTextView) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(reactionEmojiTextView, "backgroundScale", new float[]{1.0f, 0.0f}).setDuration(100);
        duration.addListener(new AnonymousClass3KA(r6, reactionEmojiTextView, 0.0f));
        duration.setInterpolator(C56092kx.A00);
        duration.addListener(new IDxLAdapterShape0S0200000_2_I0(reactionEmojiTextView, 0, r6));
        return duration;
    }

    /* access modifiers changed from: private */
    public void setChildrenVisibility(int i2) {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).setVisibility(i2);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A06;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }
}
