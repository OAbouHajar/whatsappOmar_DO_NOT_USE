package com.mod.bomfab.colorpicker;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.mod.bomfab.colorpicker.palette.ColorPickerPalette;
import com.mod.bomfab.colorpicker.palette.ColorPickerSwatch;
import com.mod.bomfab.colorpicker.palette.Palette;
import com.mod.bomfab.utils.Tools;

public class AmbilWarnaDialog {
    int alpha;
    final float[] currentColorHsv;
    final AlertDialog dialog;
    final OnAmbilWarnaListener listener;
    final ColorPickerPalette mPallete;
    /* access modifiers changed from: private */
    public final boolean supportsAlpha;
    final ImageView viewAlphaCheckered;
    final ImageView viewAlphaCursor;
    final View viewAlphaOverlay;
    final ViewGroup viewContainer;
    final ImageView viewCursor;
    final View viewHue;
    final EditText viewInput;
    final View viewNewColor;
    final View viewOldColor;
    final AmbilWarnaSquare viewSatVal;
    final ImageView viewTarget;
    int warnaTerpilih;

    public interface OnAmbilWarnaListener {
        void onCancel(AmbilWarnaDialog ambilWarnaDialog);

        void onOk(AmbilWarnaDialog ambilWarnaDialog, int i2);
    }

    public AmbilWarnaDialog(Context context, int i2, OnAmbilWarnaListener onAmbilWarnaListener) {
        this(context, i2, true, onAmbilWarnaListener);
    }

    public AmbilWarnaDialog(Context context, int i2, boolean z2, OnAmbilWarnaListener onAmbilWarnaListener) {
        this.currentColorHsv = new float[3];
        this.supportsAlpha = z2;
        this.listener = onAmbilWarnaListener;
        i2 = !z2 ? i2 | -16777216 : i2;
        Color.colorToHSV(i2, this.currentColorHsv);
        this.alpha = Color.alpha(i2);
        View inflate = LayoutInflater.from(context).inflate(Tools.intLayout("delta_aw_dialog"), (ViewGroup) null);
        this.viewHue = inflate.findViewById(Tools.intId("ambilwarna_viewHue"));
        this.viewSatVal = (AmbilWarnaSquare) inflate.findViewById(Tools.intId("ambilwarna_viewSatBri"));
        this.viewCursor = (ImageView) inflate.findViewById(Tools.intId("ambilwarna_cursor"));
        this.viewOldColor = inflate.findViewById(Tools.intId("ambilwarna_oldColor"));
        this.viewNewColor = inflate.findViewById(Tools.intId("ambilwarna_newColor"));
        this.viewTarget = (ImageView) inflate.findViewById(Tools.intId("ambilwarna_target"));
        this.viewContainer = (ViewGroup) inflate.findViewById(Tools.intId("ambilwarna_viewContainer"));
        this.viewAlphaOverlay = inflate.findViewById(Tools.intId("ambilwarna_overlay"));
        this.viewAlphaCursor = (ImageView) inflate.findViewById(Tools.intId("ambilwarna_alphaCursor"));
        this.viewAlphaCheckered = (ImageView) inflate.findViewById(Tools.intId("ambilwarna_alphaCheckered"));
        this.viewInput = (EditText) inflate.findViewById(Tools.intId("input_warna"));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(Tools.intId("mTabView"));
        View findViewById = inflate.findViewById(Tools.intId("argbView"));
        View findViewById2 = inflate.findViewById(Tools.intId("palleteView"));
        TextView textView = (TextView) inflate.findViewById(Tools.intId("tPalette"));
        TextView textView2 = (TextView) inflate.findViewById(Tools.intId("tArgb"));
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(Tools.intId("mPalleteView"));
        LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(Tools.intId("mArgbView"));
        ((FrameLayout) inflate.findViewById(Tools.intId("mBtnPallete"))).setOnClickListener(new View.OnClickListener(this, linearLayout2, linearLayout3, findViewById, findViewById2) {
            private final AmbilWarnaDialog this$0;
            private final View val$argbView;
            private final LinearLayout val$mArgbView;
            private final LinearLayout val$mPalleteView;
            private final View val$palleteView;

            {
                this.this$0 = r1;
                this.val$mPalleteView = r2;
                this.val$mArgbView = r3;
                this.val$argbView = r4;
                this.val$palleteView = r5;
            }

            static AmbilWarnaDialog access$0(AnonymousClass100000000 r1) {
                return r1.this$0;
            }

            @Override
            public void onClick(View view) {
                this.val$mPalleteView.setVisibility(0);
                this.val$mArgbView.setVisibility(8);
                this.val$argbView.setVisibility(8);
                this.val$palleteView.setVisibility(0);
            }
        });
        ((FrameLayout) inflate.findViewById(Tools.intId("mBtnArgb"))).setOnClickListener(new View.OnClickListener(this, linearLayout2, linearLayout3, findViewById2, findViewById) {
            private final AmbilWarnaDialog this$0;
            private final View val$argbView;
            private final LinearLayout val$mArgbView;
            private final LinearLayout val$mPalleteView;
            private final View val$palleteView;

            {
                this.this$0 = r1;
                this.val$mPalleteView = r2;
                this.val$mArgbView = r3;
                this.val$palleteView = r4;
                this.val$argbView = r5;
            }

            static AmbilWarnaDialog access$0(AnonymousClass100000001 r1) {
                return r1.this$0;
            }

            @Override
            public void onClick(View view) {
                this.val$mPalleteView.setVisibility(8);
                this.val$mArgbView.setVisibility(0);
                this.val$palleteView.setVisibility(8);
                this.val$argbView.setVisibility(0);
            }
        });
        this.viewAlphaOverlay.setVisibility(z2 ? 0 : 8);
        this.viewAlphaCursor.setVisibility(z2 ? 0 : 8);
        this.viewAlphaCheckered.setVisibility(z2 ? 0 : 8);
        this.viewInput.addTextChangedListener(new TextWatcher(this, linearLayout, findViewById2, findViewById, textView2, textView) {
            private final AmbilWarnaDialog this$0;
            private final View val$argbView;
            private final LinearLayout val$mTabView;
            private final View val$palleteView;
            private final TextView val$tArgb;
            private final TextView val$tPalette;

            {
                this.this$0 = r1;
                this.val$mTabView = r2;
                this.val$palleteView = r3;
                this.val$argbView = r4;
                this.val$tArgb = r5;
                this.val$tPalette = r6;
            }

            static AmbilWarnaDialog access$0(AnonymousClass100000002 r1) {
                return r1.this$0;
            }

            private void updateColor() {
                if (AmbilWarnaDialog.isValidColor(this.this$0.viewInput.getText().toString())) {
                    int access$1000016 = AmbilWarnaDialog.getColorFromString(this.this$0.viewInput.getText().toString());
                    this.this$0.viewNewColor.setBackgroundDrawable(new CircleColorDrawable(access$1000016));
                    this.this$0.warnaTerpilih = access$1000016;
                    this.val$mTabView.setBackgroundColor(access$1000016);
                    if (Tools.isDarken(access$1000016)) {
                        this.val$palleteView.setBackgroundColor(-2130706433);
                        this.val$argbView.setBackgroundColor(-2130706433);
                        this.val$tArgb.setTextColor(-1);
                        this.val$tPalette.setTextColor(-1);
                        return;
                    }
                    this.val$palleteView.setBackgroundColor(1073741824);
                    this.val$argbView.setBackgroundColor(1073741824);
                    this.val$tArgb.setTextColor(-16777216);
                    this.val$tPalette.setTextColor(-16777216);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                updateColor();
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }
        });
        this.viewInput.setText(String.format("#%08x", new Object[]{new Integer(i2)}));
        this.viewSatVal.setHue(getHue());
        this.viewOldColor.setBackgroundDrawable(new CircleColorDrawable(i2));
        this.viewNewColor.setBackgroundDrawable(new CircleColorDrawable(i2));
        linearLayout.setBackgroundColor(i2);
        this.mPallete = (ColorPickerPalette) inflate.findViewById(Tools.intId("mPallete"));
        int swatchColor = Palette.getSwatchColor(getColor());
        this.mPallete.init(19, 4, new ColorPickerSwatch.OnColorSelectedListener(this, linearLayout) {
            private final AmbilWarnaDialog this$0;
            private final LinearLayout val$mTabView;

            {
                this.this$0 = r1;
                this.val$mTabView = r2;
            }

            static AmbilWarnaDialog access$0(AnonymousClass100000004 r1) {
                return r1.this$0;
            }

            @Override
            public void onColorSelected(int i2) {
                this.this$0.mPallete.init(Palette.getSwatch(i2).length, 4, new ColorPickerSwatch.OnColorSelectedListener(this, this.val$mTabView) {
                    private final AnonymousClass100000004 this$0;
                    private final LinearLayout val$mTabView;

                    {
                        this.this$0 = r1;
                        this.val$mTabView = r2;
                    }

                    static AnonymousClass100000004 access$0(AnonymousClass100000003 r1) {
                        return r1.this$0;
                    }

                    @Override
                    public void onColorSelected(int i2) {
                        AnonymousClass100000004.access$0(this.this$0).warnaTerpilih = i2;
                        AnonymousClass100000004.access$0(this.this$0).viewNewColor.setBackgroundDrawable(new CircleColorDrawable(i2));
                        AnonymousClass100000004.access$0(this.this$0).viewInput.setText(String.format("#%08x", new Object[]{new Integer(i2)}));
                        this.val$mTabView.setBackgroundColor(i2);
                        if (i2 != AnonymousClass100000004.access$0(this.this$0).warnaTerpilih) {
                            AnonymousClass100000004.access$0(this.this$0).warnaTerpilih = i2;
                            AnonymousClass100000004.access$0(this.this$0).mPallete.drawPalette(Palette.PALETTE, AnonymousClass100000004.access$0(this.this$0).warnaTerpilih);
                        }
                    }
                });
                this.this$0.mPallete.drawPalette(Palette.getSwatch(i2), this.this$0.warnaTerpilih);
                this.this$0.warnaTerpilih = i2;
                this.this$0.viewNewColor.setBackgroundDrawable(new CircleColorDrawable(i2));
            }
        });
        this.mPallete.drawPalette(Palette.PALETTE, swatchColor);
        this.viewHue.setOnTouchListener(new View.OnTouchListener(this, linearLayout) {
            private final AmbilWarnaDialog this$0;
            private final LinearLayout val$mTabView;

            {
                this.this$0 = r1;
                this.val$mTabView = r2;
            }

            static AmbilWarnaDialog access$0(AnonymousClass100000005 r1) {
                return r1.this$0;
            }

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float f2 = 0.0f;
                if (motionEvent.getAction() != 2 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1) {
                    return false;
                }
                float y2 = motionEvent.getY();
                if (y2 < 0.0f) {
                    y2 = 0.0f;
                }
                if (y2 > ((float) this.this$0.viewHue.getMeasuredHeight())) {
                    y2 = ((float) this.this$0.viewHue.getMeasuredHeight()) - 0.001f;
                }
                float measuredHeight = 360.0f - (y2 * (360.0f / ((float) this.this$0.viewHue.getMeasuredHeight())));
                if (measuredHeight != 360.0f) {
                    f2 = measuredHeight;
                }
                this.this$0.setHue(f2);
                this.this$0.viewSatVal.setHue(this.this$0.getHue());
                this.this$0.moveCursor();
                this.this$0.viewNewColor.setBackgroundDrawable(new CircleColorDrawable(this.this$0.getColor()));
                this.val$mTabView.setBackgroundColor(this.this$0.getColor());
                this.this$0.viewInput.setText(String.format("#%08x", new Object[]{new Integer(this.this$0.getColor())}));
                this.this$0.updateAlphaView();
                return true;
            }
        });
        if (z2) {
            this.viewAlphaCheckered.setOnTouchListener(new View.OnTouchListener(this, linearLayout) {
                private final AmbilWarnaDialog this$0;
                private final LinearLayout val$mTabView;

                {
                    this.this$0 = r1;
                    this.val$mTabView = r2;
                }

                static AmbilWarnaDialog access$0(AnonymousClass100000006 r1) {
                    return r1.this$0;
                }

                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    float f2 = 0.0f;
                    if (motionEvent.getAction() != 2 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    float y2 = motionEvent.getY();
                    if (y2 >= 0.0f) {
                        f2 = y2;
                    }
                    if (f2 > ((float) this.this$0.viewAlphaCheckered.getMeasuredHeight())) {
                        f2 = ((float) this.this$0.viewAlphaCheckered.getMeasuredHeight()) - 0.001f;
                    }
                    int round = Math.round(255.0f - (f2 * (255.0f / ((float) this.this$0.viewAlphaCheckered.getMeasuredHeight()))));
                    this.this$0.setAlpha(round);
                    this.this$0.moveAlphaCursor();
                    int access$1000018 = (round << 24) | (this.this$0.getColor() & ViewCompat.MEASURED_SIZE_MASK);
                    this.this$0.viewNewColor.setBackgroundDrawable(new CircleColorDrawable(access$1000018));
                    this.val$mTabView.setBackgroundColor(access$1000018);
                    this.this$0.viewInput.setText(String.format("#%08x", new Object[]{new Integer(access$1000018)}));
                    return true;
                }
            });
        }
        this.viewSatVal.setOnTouchListener(new View.OnTouchListener(this, linearLayout) {
            private final AmbilWarnaDialog this$0;
            private final LinearLayout val$mTabView;

            {
                this.this$0 = r1;
                this.val$mTabView = r2;
            }

            static AmbilWarnaDialog access$0(AnonymousClass100000007 r1) {
                return r1.this$0;
            }

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float f2 = 0.0f;
                if (motionEvent.getAction() != 2 && motionEvent.getAction() != 0 && motionEvent.getAction() != 1) {
                    return false;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (x2 < 0.0f) {
                    x2 = 0.0f;
                }
                if (x2 > ((float) this.this$0.viewSatVal.getMeasuredWidth())) {
                    x2 = (float) this.this$0.viewSatVal.getMeasuredWidth();
                }
                if (y2 >= 0.0f) {
                    f2 = y2;
                }
                if (f2 > ((float) this.this$0.viewSatVal.getMeasuredHeight())) {
                    f2 = (float) this.this$0.viewSatVal.getMeasuredHeight();
                }
                this.this$0.setSat(x2 * (1.0f / ((float) this.this$0.viewSatVal.getMeasuredWidth())));
                this.this$0.setVal(1.0f - (f2 * (1.0f / ((float) this.this$0.viewSatVal.getMeasuredHeight()))));
                this.this$0.moveTarget();
                this.this$0.viewNewColor.setBackgroundDrawable(new CircleColorDrawable(this.this$0.getColor()));
                this.val$mTabView.setBackgroundColor(this.this$0.getColor());
                this.this$0.viewInput.setText(String.format("#%08x", new Object[]{new Integer(this.this$0.getColor())}));
                return true;
            }
        });
        this.dialog = new AlertDialog.Builder(context).setPositiveButton(17039370, new DialogInterface.OnClickListener(this) {
            private final AmbilWarnaDialog this$0;

            {
                this.this$0 = r1;
            }

            static AmbilWarnaDialog access$0(AnonymousClass100000008 r1) {
                return r1.this$0;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i2) {
                if (this.this$0.listener != null) {
                    this.this$0.listener.onOk(this.this$0, this.this$0.warnaTerpilih);
                }
            }
        }).setNegativeButton(17039360, new DialogInterface.OnClickListener(this) {
            private final AmbilWarnaDialog this$0;

            {
                this.this$0 = r1;
            }

            static AmbilWarnaDialog access$0(AnonymousClass100000009 r1) {
                return r1.this$0;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i2) {
                if (this.this$0.listener != null) {
                    this.this$0.listener.onCancel(this.this$0);
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener(this) {
            private final AmbilWarnaDialog this$0;

            {
                this.this$0 = r1;
            }

            static AmbilWarnaDialog access$0(AnonymousClass100000010 r1) {
                return r1.this$0;
            }

            @Override
            public void onCancel(DialogInterface dialogInterface) {
                if (this.this$0.listener != null) {
                    this.this$0.listener.onCancel(this.this$0);
                }
            }
        }).create();
        this.dialog.setView(inflate, 0, 0, 0, 0);
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this, inflate) {
            private final AmbilWarnaDialog this$0;
            private final View val$view;

            {
                this.this$0 = r1;
                this.val$view = r2;
            }

            static AmbilWarnaDialog access$0(AnonymousClass100000011 r1) {
                return r1.this$0;
            }

            @Override
            public void onGlobalLayout() {
                this.this$0.moveCursor();
                if (this.this$0.supportsAlpha) {
                    this.this$0.moveAlphaCursor();
                }
                this.this$0.moveTarget();
                if (this.this$0.supportsAlpha) {
                    this.this$0.updateAlphaView();
                }
                this.val$view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });
    }

    private float getAlpha() {
        return (float) this.alpha;
    }

    /* access modifiers changed from: private */
    public int getColor() {
        this.warnaTerpilih = (Color.HSVToColor(this.currentColorHsv) & ViewCompat.MEASURED_SIZE_MASK) | (this.alpha << 24);
        return this.warnaTerpilih;
    }

    private int getColor2() {
        this.warnaTerpilih = (getColorFromString(this.viewInput.getText().toString()) & ViewCompat.MEASURED_SIZE_MASK) | (this.alpha << 24);
        return this.warnaTerpilih;
    }

    /* access modifiers changed from: private */
    public static int getColorFromString(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception e2) {
            try {
                return Color.parseColor(new StringBuffer().append("#").append(str).toString());
            } catch (Exception e3) {
                return 0;
            }
        }
    }

    /* access modifiers changed from: private */
    public float getHue() {
        return this.currentColorHsv[0];
    }

    private float getSat() {
        return this.currentColorHsv[1];
    }

    private float getVal() {
        return this.currentColorHsv[2];
    }

    /* access modifiers changed from: private */
    public static boolean isValidColor(String str) {
        try {
            Color.parseColor(str);
            return true;
        } catch (Exception e2) {
            try {
                Color.parseColor(new StringBuffer().append("#").append(str).toString());
                return true;
            } catch (Exception e3) {
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    public void setAlpha(int i2) {
        this.alpha = i2;
    }

    /* access modifiers changed from: private */
    public void setHue(float f2) {
        this.currentColorHsv[0] = f2;
    }

    /* access modifiers changed from: private */
    public void setSat(float f2) {
        this.currentColorHsv[1] = f2;
    }

    /* access modifiers changed from: private */
    public void setVal(float f2) {
        this.currentColorHsv[2] = f2;
    }

    /* access modifiers changed from: private */
    public void updateAlphaView() {
        this.viewAlphaOverlay.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.HSVToColor(this.currentColorHsv), 0}));
    }

    public AlertDialog getDialog() {
        return this.dialog;
    }

    /* access modifiers changed from: protected */
    public void moveAlphaCursor() {
        int measuredHeight = this.viewAlphaCheckered.getMeasuredHeight();
        float alpha2 = ((float) measuredHeight) - ((((float) measuredHeight) * getAlpha()) / 255.0f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.viewAlphaCursor.getLayoutParams();
        layoutParams.leftMargin = (int) ((((double) this.viewAlphaCheckered.getLeft()) - Math.floor((double) (this.viewAlphaCursor.getMeasuredWidth() / 2))) - ((double) this.viewContainer.getPaddingLeft()));
        layoutParams.topMargin = (int) ((((double) (alpha2 + ((float) this.viewAlphaCheckered.getTop()))) - Math.floor((double) (this.viewAlphaCursor.getMeasuredHeight() / 2))) - ((double) this.viewContainer.getPaddingTop()));
        this.viewAlphaCursor.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void moveCursor() {
        float measuredHeight = ((float) this.viewHue.getMeasuredHeight()) - ((getHue() * ((float) this.viewHue.getMeasuredHeight())) / 360.0f);
        float f2 = measuredHeight == ((float) this.viewHue.getMeasuredHeight()) ? 0.0f : measuredHeight;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.viewCursor.getLayoutParams();
        layoutParams.leftMargin = (int) ((((double) this.viewHue.getLeft()) - Math.floor((double) (this.viewCursor.getMeasuredWidth() / 2))) - ((double) this.viewContainer.getPaddingLeft()));
        layoutParams.topMargin = (int) ((((double) (f2 + ((float) this.viewHue.getTop()))) - Math.floor((double) (this.viewCursor.getMeasuredHeight() / 2))) - ((double) this.viewContainer.getPaddingTop()));
        this.viewCursor.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void moveTarget() {
        float measuredWidth = ((float) this.viewSatVal.getMeasuredWidth()) * getSat();
        float measuredHeight = ((float) this.viewSatVal.getMeasuredHeight()) * (1.0f - getVal());
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.viewTarget.getLayoutParams();
        layoutParams.leftMargin = (int) ((((double) (measuredWidth + ((float) this.viewSatVal.getLeft()))) - Math.floor((double) (this.viewTarget.getMeasuredWidth() / 2))) - ((double) this.viewContainer.getPaddingLeft()));
        layoutParams.topMargin = (int) ((((double) (((float) this.viewSatVal.getTop()) + measuredHeight)) - Math.floor((double) (this.viewTarget.getMeasuredHeight() / 2))) - ((double) this.viewContainer.getPaddingTop()));
        this.viewTarget.setLayoutParams(layoutParams);
    }

    public void show() {
        this.dialog.show();
    }
}
