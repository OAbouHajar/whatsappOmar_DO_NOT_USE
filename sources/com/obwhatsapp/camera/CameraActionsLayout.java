package com.obwhatsapp.camera;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass01V;
import X.AnonymousClass5CN;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C16150sX;
import X.C16620tM;
import X.C52652eD;
import X.C52662eE;
import X.C87594Xo;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.widget.RelativeLayout;
import com.obwhatsapp.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CameraActionsLayout extends RelativeLayout implements AnonymousClass006 {
    public static final Set A0J = new AnonymousClass5CN();
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public C14710pd A08;
    public C52662eE A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final Display A0G;
    public final Map A0H;
    public final boolean A0I;

    public CameraActionsLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CameraActionsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraActionsLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0A) {
            this.A0A = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A08 = C16150sX.A0k(A002);
            this.A0B = AnonymousClass000.A1X(A002.AJx.get());
        }
        this.A0H = AnonymousClass000.A0x();
        RelativeLayout.inflate(context, R.layout.layout00e3, this);
        this.A0G = AnonymousClass01V.A02(context).getDefaultDisplay();
        int A003 = C87594Xo.A00(context, 2.0f);
        int i3 = A003 << 2;
        this.A0F = i3;
        this.A0C = A003 * 6;
        int i4 = i3 + i3;
        this.A0E = i4;
        this.A0D = i4 * 10;
        this.A0I = !isInEditMode() ? this.A08.A0E(C16620tM.A02, 2182) : false;
    }

    public static final void A00(View view, Map map, int i2, int i3, int i4, int i5) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(view.getLayoutParams());
        for (Object A0D2 : A0J) {
            layoutParams.addRule(AnonymousClass000.A0D(A0D2), 0);
        }
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            layoutParams.addRule(AnonymousClass000.A0D(A0z.getKey()), AnonymousClass000.A0D(A0z.getValue()));
        }
        layoutParams.setMargins(i2, i3, i4, i5);
        view.setLayoutParams(layoutParams);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A09;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        Map map;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int valueOf;
        int i13;
        int i14;
        View view;
        int i15;
        int i16;
        int i17;
        int i18;
        View view2;
        View view3;
        int i19;
        int i20;
        super.onLayout(z2, i2, i3, i4, i5);
        if (this.A06 == null) {
            this.A06 = C004601z.A0E(this, R.id.shutter);
            this.A05 = C004601z.A0E(this, R.id.recording_progress);
            this.A01 = C004601z.A0E(this, R.id.flash_btn);
            this.A07 = C004601z.A0E(this, R.id.switch_camera_btn);
            this.A04 = C004601z.A0E(this, R.id.recording_hint);
            this.A02 = C004601z.A0E(this, R.id.gallery_btn);
            this.A00 = C004601z.A0E(this, R.id.close_camera_btn);
            this.A03 = C004601z.A0E(this, R.id.select_multiple);
        }
        if (z2) {
            int rotation = this.A0G.getRotation();
            if (this.A0B) {
                this.A04.setVisibility(8);
                map = this.A0H;
                map.clear();
                i12 = -1;
                map.put(11, -1);
                i11 = 15;
                map.put(15, -1);
                View view4 = this.A06;
                i7 = this.A0F;
                int i21 = i7;
                A00(view4, map, i7, 0, i21, 0);
                A00(this.A05, map, i7, 0, i21, 0);
                Integer A0V = C13690nt.A0V(-1, 11, map);
                View view5 = this.A01;
                int i22 = this.A0E;
                A00(view5, map, i7, i22, i21, i22);
                map.clear();
                map.put(12, -1);
                map.put(11, -1);
                int i23 = i22;
                int i24 = i22;
                int i25 = i22;
                A00(this.A02, map, i22, i25, i23, i24);
                map.clear();
                map.put(A0V, -1);
                valueOf = 9;
                map.put(9, -1);
                A00(this.A00, map, i7, i22, i7, i22);
                map.clear();
                map.put(12, -1);
                map.put(9, -1);
                A00(this.A07, map, i22, i25, i23, i24);
            } else {
                if (rotation == 1) {
                    this.A04.setVisibility(8);
                    map = this.A0H;
                    map.clear();
                    i12 = -1;
                    map.put(11, -1);
                    i11 = 15;
                    map.put(15, -1);
                    View view6 = this.A06;
                    i7 = this.A0F;
                    int i26 = i7;
                    A00(view6, map, i7, 0, i26, 0);
                    A00(this.A05, map, i7, 0, i26, 0);
                    Integer A0V2 = C13690nt.A0V(-1, 11, map);
                    View view7 = this.A07;
                    i8 = this.A0E;
                    int i27 = i8;
                    int i28 = i8;
                    Map map2 = map;
                    i6 = i8;
                    int i29 = i8;
                    A00(view7, map2, i6, i29, i27, i28);
                    map.clear();
                    i9 = 12;
                    map.put(12, -1);
                    map.put(11, -1);
                    A00(this.A02, map2, i6, i29, i27, i28);
                    map.clear();
                    map.put(A0V2, -1);
                    i10 = 9;
                } else if (rotation != 3) {
                    boolean z3 = this.A0I;
                    if (!z3) {
                        this.A04.setVisibility(0);
                    }
                    map = this.A0H;
                    map.clear();
                    Integer A0Z = C13680ns.A0Z();
                    Integer valueOf2 = Integer.valueOf(R.id.recording_hint);
                    map.put(A0Z, valueOf2);
                    map.put(14, -1);
                    if (z3) {
                        map.put(12, -1);
                        View view8 = this.A06;
                        i13 = 0;
                        i14 = this.A0E;
                        A00(view8, map, 0, 0, 0, i14);
                    } else {
                        i13 = 0;
                        i14 = 0;
                        A00(this.A06, map, 0, 0, 0, 0);
                    }
                    A00(this.A05, map, i13, 0, 0, i14);
                    map.clear();
                    map.put(A0Z, valueOf2);
                    map.put(11, -1);
                    if (z3) {
                        map.put(12, -1);
                        view = this.A07;
                        i15 = this.A0F;
                        i17 = this.A0C;
                        i16 = i17 + i17;
                    } else {
                        view = this.A07;
                        i15 = this.A0F;
                        i16 = this.A0C;
                        i17 = i16;
                    }
                    i18 = i15;
                    A00(view, map, i15, 0, i18, i16);
                    map.clear();
                    map.put(A0Z, valueOf2);
                    map.put(9, -1);
                    if (z3) {
                        map.put(12, -1);
                        view2 = this.A02;
                        i17 += i17;
                    } else {
                        view2 = this.A02;
                    }
                    A00(view2, map, i15, 0, i18, i17);
                    Integer A0V3 = C13690nt.A0V(-1, 11, map);
                    int i30 = i15;
                    int i31 = i15;
                    A00(this.A01, map, i15, i31, i18, i30);
                    map.clear();
                    map.put(A0V3, -1);
                    map.put(9, -1);
                    A00(this.A00, map, i15, i31, i18, i30);
                    map.clear();
                    map.put(11, -1);
                    map.put(12, -1);
                    view3 = this.A03;
                    i19 = this.A0D;
                    i20 = 0;
                    A00(view3, map, i15, i20, i18, i19);
                } else {
                    this.A04.setVisibility(8);
                    map = this.A0H;
                    map.clear();
                    i12 = -1;
                    map.put(9, -1);
                    i11 = 15;
                    map.put(15, -1);
                    View view9 = this.A06;
                    i7 = this.A0F;
                    int i32 = i7;
                    A00(view9, map, i7, 0, i32, 0);
                    A00(this.A05, map, i7, 0, i32, 0);
                    map.clear();
                    map.put(12, -1);
                    map.put(9, -1);
                    View view10 = this.A07;
                    i8 = this.A0E;
                    int i33 = i8;
                    int i34 = i8;
                    Map map3 = map;
                    i6 = i8;
                    int i35 = i8;
                    A00(view10, map3, i6, i35, i33, i34);
                    i9 = C13690nt.A0V(-1, 9, map);
                    A00(this.A02, map3, i6, i35, i33, i34);
                    map.clear();
                    map.put(12, -1);
                    i10 = 11;
                }
                valueOf = Integer.valueOf(i10);
                map.put(valueOf, i12);
                int i36 = i7;
                int i37 = i8;
                A00(this.A01, map, i7, i37, i36, i6);
                map.clear();
                map.put(i9, i12);
                map.put(valueOf, i12);
                A00(this.A00, map, i7, i37, i36, i6);
            }
            map.clear();
            map.put(valueOf, i12);
            map.put(i11, i12);
            view3 = this.A03;
            i20 = 0;
            i18 = i15;
            i19 = 0;
            A00(view3, map, i15, i20, i18, i19);
        }
    }
}
