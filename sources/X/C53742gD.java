package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.redex.IDxCListenerShape177S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape243S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape167S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.obwhatsapp.mediacomposer.doodle.penmode.PenModeView;

/* renamed from: X.2gD  reason: invalid class name and case insensitive filesystem */
public class C53742gD extends Dialog {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public WaButton A05;
    public WaImageView A06;
    public WaImageView A07;
    public ColorPickerComponent A08;
    public AnonymousClass2VI A09;
    public PenModeView A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D = getContext().getResources().getDimensionPixelSize(R.dimen.dimen0332);
    public final View.OnLayoutChangeListener A0E;
    public final AnonymousClass2Yn A0F;
    public final AnonymousClass39Y A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final int[] A0J;

    public C53742gD(Activity activity, AnonymousClass2Yn r10, AnonymousClass4ET r11, C49102Rb r12, C85984Qt r13, int[] iArr, boolean z2, boolean z3) {
        super(activity, R.style.style013e);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.dimen0330);
        this.A0B = dimensionPixelSize;
        this.A0C = getContext().getResources().getDimensionPixelSize(R.dimen.dimen0331);
        this.A00 = -1;
        this.A0E = new IDxCListenerShape243S0100000_2_I0(this, 0);
        this.A0F = r10;
        AnonymousClass4ET r1 = r11;
        C85984Qt r4 = r13;
        this.A0G = new AnonymousClass39Y(r1, r12, new C85974Qs(r12, this), r4, r10.A00, AnonymousClass00T.A00(getContext(), R.color.color0156), dimensionPixelSize);
        this.A0J = iArr;
        this.A0H = z2;
        this.A0I = z3;
    }

    public void onBackPressed() {
        if (!this.A0G.A03) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            setContentView(R.layout.layout023e);
            this.A03 = findViewById(R.id.doodle_pen_root);
            this.A05 = (WaButton) findViewById(R.id.pen_dialog_done);
            this.A06 = (WaImageView) findViewById(R.id.pen_dialog_pen);
            this.A07 = (WaImageView) findViewById(R.id.pen_dialog_undo);
            this.A04 = (ViewGroup) findViewById(R.id.canvas);
            this.A08 = (ColorPickerComponent) findViewById(R.id.pen_dialog_color_picker_component);
            this.A0A = (PenModeView) findViewById(R.id.pen_mode_view);
            this.A02 = findViewById(R.id.doodle_pen_top_bar);
            window.setLayout(-1, -1);
            window.setFlags(1024, 1024);
            if (Build.VERSION.SDK_INT >= 28) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
            }
            this.A03.addOnLayoutChangeListener(this.A0E);
            this.A05.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 45));
            this.A04.setOnTouchListener(new IDxTListenerShape167S0100000_2_I0(this, 8));
            AnonymousClass2VI r1 = new AnonymousClass2VI(getContext(), R.drawable.ic_cam_draw);
            this.A09 = r1;
            this.A06.setImageDrawable(r1);
            this.A08.A00();
            this.A08.A04((AnonymousClass4XG) null, new C102734zR(this), (AnonymousClass29j) null);
            this.A07.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 44));
            this.A07.setOnLongClickListener(new IDxCListenerShape177S0100000_2_I0(this, 3));
            this.A0A.A00 = new C102794zX(this);
            AnonymousClass39Y r2 = this.A0G;
            int i2 = r2.A05;
            r2.A01 = i2;
            r2.A0A.A01.A09.A01(i2);
            r2.A01(2, r2.A06);
            r2.A02(false);
            if (!this.A0H) {
                PenModeView penModeView = this.A0A;
                C004601z.A0E(penModeView, R.id.pen_mode_blur).setVisibility(8);
                C004601z.A0E(penModeView, R.id.pen_mode_blur_space).setVisibility(8);
            }
            int i3 = this.A01;
            if (i3 > 0) {
                this.A08.setMaxHeight(i3);
            }
        }
    }
}
