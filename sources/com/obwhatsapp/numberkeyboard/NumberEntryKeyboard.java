package com.obwhatsapp.numberkeyboard;

import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass1W7;
import X.AnonymousClass4IK;
import X.C109375Rw;
import X.C16150sX;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C53072ew;
import X.C77533vv;
import X.C77543vw;
import X.C809346e;
import X.C85234Nq;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxTListenerShape166S0100000_1_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;

public class NumberEntryKeyboard extends LinearLayout implements AnonymousClass006 {
    public static final int A0J = ((int) Math.floor(20.399999618530273d));
    public int A00;
    public int A01;
    public long A02;
    public Paint A03;
    public RectF A04;
    public View A05;
    public EditText A06;
    public AnonymousClass01V A07;
    public AnonymousClass013 A08;
    public AnonymousClass1W7 A09;
    public C109375Rw A0A;
    public C52662eE A0B;
    public Map A0C;
    public Map A0D;
    public boolean A0E;
    public boolean A0F;
    public View[][] A0G;
    public AnonymousClass4IK[][] A0H;
    public final View.OnTouchListener A0I;

    public NumberEntryKeyboard(Context context) {
        this(context, (AttributeSet) null);
    }

    public NumberEntryKeyboard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NumberEntryKeyboard(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
        this.A0C = new HashMap();
        this.A02 = -1;
        this.A0I = new IDxTListenerShape166S0100000_1_I0(this, 2);
        A02(context, attributeSet);
    }

    public NumberEntryKeyboard(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A01();
        this.A0C = new HashMap();
        this.A02 = -1;
        this.A0I = new IDxTListenerShape166S0100000_1_I0(this, 2);
        A02(context, attributeSet);
    }

    public static C109375Rw A00(AnonymousClass013 r1) {
        return C809346e.A00(r1).equals(".") ? new C77543vw() : new C77533vv();
    }

    public void A01() {
        if (!this.A0F) {
            this.A0F = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A08 = (AnonymousClass013) r1.AR8.get();
            this.A07 = (AnonymousClass01V) r1.AOi.get();
        }
    }

    public final void A02(Context context, AttributeSet attributeSet) {
        View[] viewArr;
        KeyEvent.Callback callback;
        LinearLayout.inflate(getContext(), R.layout.layout0423, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.custom_key_container);
        boolean z2 = false;
        if (attributeSet != null && context.getTheme().obtainStyledAttributes(attributeSet, C53072ew.A0D, 0, 0).getInteger(0, 0) == 1) {
            C109375Rw A002 = A00(this.A08);
            this.A0A = A002;
            viewGroup.addView(A002.AGw(context));
        }
        View[][] viewArr2 = new View[4][];
        View[] viewArr3 = new View[3];
        if (!this.A08.A0T()) {
            viewArr3[0] = findViewById(R.id.one_key);
            viewArr3[1] = findViewById(R.id.two_key);
            viewArr3[2] = findViewById(R.id.three_key);
            viewArr2[0] = viewArr3;
            viewArr2[1] = new View[]{findViewById(R.id.four_key), findViewById(R.id.five_key), findViewById(R.id.six_key)};
            viewArr2[2] = new View[]{findViewById(R.id.seven_key), findViewById(R.id.eight_key), findViewById(R.id.nine_key)};
            View[] viewArr4 = new View[3];
            viewArr4[0] = viewGroup;
            viewArr4[1] = findViewById(R.id.zero_key);
            viewArr = viewArr4;
            callback = findViewById(R.id.backspace_key);
        } else {
            viewArr3[0] = findViewById(R.id.three_key);
            viewArr3[1] = findViewById(R.id.two_key);
            viewArr3[2] = findViewById(R.id.one_key);
            viewArr2[0] = viewArr3;
            viewArr2[1] = new View[]{findViewById(R.id.six_key), findViewById(R.id.five_key), findViewById(R.id.four_key)};
            viewArr2[2] = new View[]{findViewById(R.id.nine_key), findViewById(R.id.eight_key), findViewById(R.id.seven_key)};
            View[] viewArr5 = new View[3];
            viewArr5[0] = findViewById(R.id.backspace_key);
            viewArr5[1] = findViewById(R.id.zero_key);
            callback = viewGroup;
            viewArr = viewArr5;
        }
        viewArr[2] = callback;
        viewArr2[3] = viewArr;
        this.A0G = viewArr2;
        if (attributeSet != null && context.getTheme().obtainStyledAttributes(attributeSet, C53072ew.A0D, 0, 0).getInteger(0, 0) == 1) {
            setCustomKey(A00(this.A08));
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.dimen0595);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setOrientation(1);
        setBackgroundColor(AnonymousClass00T.A00(getContext(), R.color.color0597));
        for (int i2 = 0; i2 < this.A0G.length; i2++) {
            int i3 = 0;
            while (true) {
                View[][] viewArr6 = this.A0G;
                if (i3 >= viewArr6[i2].length) {
                    break;
                }
                View view = viewArr6[i2][i3];
                if (view != null && (view instanceof TextView)) {
                    TextView textView = (TextView) view;
                    NumberFormat A0K = this.A08.A0K();
                    int id = view.getId();
                    int i4 = 0;
                    if (id != R.id.zero_key) {
                        i4 = 1;
                        if (id != R.id.one_key) {
                            i4 = 2;
                            if (id != R.id.two_key) {
                                i4 = 3;
                                if (id != R.id.three_key) {
                                    i4 = 4;
                                    if (id != R.id.four_key) {
                                        i4 = 5;
                                        if (id != R.id.five_key) {
                                            i4 = 6;
                                            if (id != R.id.six_key) {
                                                i4 = 7;
                                                if (id != R.id.seven_key) {
                                                    i4 = 9;
                                                    if (id == R.id.eight_key) {
                                                        i4 = 8;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    textView.setText(A0K.format((long) i4));
                }
                i3++;
            }
        }
        if (Settings.System.getFloat(context.getContentResolver(), "window_animation_scale", 1.0f) == 1.0f) {
            z2 = true;
        }
        this.A0E = z2;
        if (z2) {
            Paint paint = new Paint(1);
            this.A03 = paint;
            paint.setColor(AnonymousClass00T.A00(context, R.color.color0598));
            this.A03.setStyle(Paint.Style.FILL);
            this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            this.A04 = new RectF();
            this.A0D = new HashMap();
            this.A09 = new AnonymousClass1W7(this);
        }
        setOnTouchListener(this.A0I);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0B;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0E) {
            for (Object obj : this.A0D.keySet()) {
                C85234Nq r6 = (C85234Nq) this.A0D.get(obj);
                PointF pointF = r6.A04;
                float f2 = r6.A00;
                float f3 = pointF.x;
                float f4 = f2 / 2.0f;
                float f5 = pointF.y;
                this.A04.set(f3 - f4, f5 - f4, f3 + f4, f5 + f4);
                this.A03.setAlpha(r6.A01);
                canvas.drawOval(this.A04, this.A03);
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        float f2;
        int i6;
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            View[][] viewArr = this.A0G;
            int length = viewArr[0].length;
            float f3 = width / ((float) length);
            int length2 = viewArr.length;
            float f4 = height / ((float) length2);
            int floor = ((int) Math.floor((double) f3)) + 12;
            this.A00 = floor;
            this.A01 = (int) (((float) floor) / 2.0f);
            int[] iArr = new int[2];
            iArr[1] = length;
            iArr[0] = length2;
            this.A0H = (AnonymousClass4IK[][]) Array.newInstance(AnonymousClass4IK.class, iArr);
            for (int i7 = 0; i7 < this.A0G.length; i7++) {
                int i8 = 0;
                while (true) {
                    View[][] viewArr2 = this.A0G;
                    int length3 = viewArr2[0].length;
                    if (i8 >= length3) {
                        break;
                    }
                    View view = viewArr2[i7][i8];
                    float f5 = ((float) i8) * f3;
                    float f6 = ((float) i7) * f4;
                    float f7 = f5 + f3;
                    float f8 = f6 + f4;
                    if (i8 == 0) {
                        i6 = getPaddingLeft();
                    } else if (i8 == length3 - 1) {
                        i6 = -getPaddingRight();
                    } else {
                        f2 = 0.0f;
                        AnonymousClass4IK r1 = new AnonymousClass4IK(new PointF(((f5 + f7) / 2.0f) + f2, (f6 + f8) / 2.0f), new RectF(f5, f6, f7, f8));
                        this.A0H[i7][i8] = r1;
                        this.A0C.put(view, r1);
                        i8++;
                    }
                    f2 = (float) i6;
                    AnonymousClass4IK r12 = new AnonymousClass4IK(new PointF(((f5 + f7) / 2.0f) + f2, (f6 + f8) / 2.0f), new RectF(f5, f6, f7, f8));
                    this.A0H[i7][i8] = r12;
                    this.A0C.put(view, r12);
                    i8++;
                }
            }
        }
    }

    public void setCustomKey(C109375Rw r4) {
        this.A0A = r4;
        View[] viewArr = this.A0G[3];
        char c2 = 2;
        if (!this.A08.A0T()) {
            c2 = 0;
        }
        ViewGroup viewGroup = (ViewGroup) viewArr[c2];
        viewGroup.removeAllViews();
        if (r4 != null) {
            viewGroup.addView(r4.AGw(getContext()));
        }
        invalidate();
    }

    public void setEditText(WaEditText waEditText) {
        this.A06 = waEditText;
    }
}
