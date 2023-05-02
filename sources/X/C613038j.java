package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.obwhatsapp.InteractiveAnnotation;
import com.obwhatsapp.R;
import com.obwhatsapp.SerializablePoint;
import com.obwhatsapp.mediaview.PhotoView;
import com.whatsapp.util.ViewOnClickCListenerShape2S0200000_I1_1;

/* renamed from: X.38j  reason: invalid class name and case insensitive filesystem */
public class C613038j {
    public Context A00;
    public View A01;
    public PopupWindow A02;
    public AnonymousClass1P7 A03;

    public C613038j(Context context, ViewGroup viewGroup, AnonymousClass1P7 r5) {
        this.A02 = new PopupWindow(context);
        this.A00 = context;
        this.A03 = r5;
        LayoutInflater A012 = AnonymousClass01V.A01(context);
        AnonymousClass00B.A06(A012);
        this.A01 = C13680ns.A0H(A012, viewGroup, R.layout.layout05b6);
    }

    public boolean A00(PopupWindow.OnDismissListener onDismissListener, InteractiveAnnotation interactiveAnnotation, PhotoView photoView) {
        double d2;
        int i2;
        Bitmap photo = photoView.getPhoto();
        if (photo == null) {
            return false;
        }
        float height = (float) photo.getHeight();
        float[] fArr = {(float) photo.getWidth(), height};
        InteractiveAnnotation interactiveAnnotation2 = interactiveAnnotation;
        SerializablePoint[] serializablePointArr = interactiveAnnotation2.polygonVertices;
        SerializablePoint serializablePoint = serializablePointArr[0];
        double d3 = serializablePoint.f147x;
        double d4 = (double) fArr[0];
        double d5 = d3 * d4;
        double d6 = serializablePoint.f148y;
        double d7 = (double) height;
        double d8 = d7;
        double d9 = d6 * d7;
        SerializablePoint serializablePoint2 = serializablePointArr[1];
        double d10 = serializablePoint2.f147x * d4;
        double d11 = serializablePoint2.f148y * d8;
        SerializablePoint serializablePoint3 = serializablePointArr[2];
        double d12 = serializablePoint3.f147x * d4;
        double d13 = serializablePoint3.f148y * d8;
        SerializablePoint serializablePoint4 = serializablePointArr[3];
        double d14 = serializablePoint4.f147x * d4;
        double d15 = serializablePoint4.f148y * d8;
        double d16 = (d5 + d12) / 2.0d;
        double d17 = (d9 + d13) / 2.0d;
        if (d10 <= d16 && d16 <= d12) {
            double d18 = d10 - d12;
            if (d18 != 0.0d) {
                d2 = d11 - (((d11 - d13) * (d10 - d16)) / d18);
            }
            d2 = d17;
        } else if (d12 > d16 || d16 > d14) {
            i2 = 2;
            if (d14 > d16 || d16 > d5) {
                double d19 = d5 - d10;
                if (d19 != 0.0d) {
                    d2 = d9 - (((d9 - d11) * (d5 - d16)) / d19);
                    float[] fArr2 = new float[i2];
                    fArr2[0] = (float) d16;
                    fArr2[1] = (float) d2;
                    photoView.getImageMatrix().mapPoints(fArr2);
                    fArr2[0] = fArr2[0] + ((float) photoView.getLeft());
                    fArr2[1] = fArr2[1] + ((float) photoView.getTop());
                    View rootView = photoView.getRootView();
                    int i3 = (int) fArr2[0];
                    int i4 = (int) fArr2[1];
                    PopupWindow popupWindow = this.A02;
                    popupWindow.setHeight(-2);
                    popupWindow.setWidth(-2);
                    popupWindow.setOutsideTouchable(true);
                    popupWindow.setTouchable(true);
                    popupWindow.setFocusable(true);
                    popupWindow.setBackgroundDrawable(new BitmapDrawable());
                    View view = this.A01;
                    popupWindow.setContentView(view);
                    C13680ns.A12(view);
                    AnonymousClass1UP.A06(C13680ns.A0M(view, R.id.tooltip_text));
                    view.setOnClickListener(new ViewOnClickCListenerShape2S0200000_I1_1(this, 1, interactiveAnnotation2));
                    popupWindow.setOnDismissListener(onDismissListener);
                    popupWindow.setAnimationStyle(R.style.style0453);
                    popupWindow.showAtLocation(rootView, 0, i3 - (view.getMeasuredWidth() >> 1), (int) (((float) i4) - (((float) view.getMeasuredHeight()) * 0.82f)));
                    return true;
                }
            } else {
                double d20 = d14 - d5;
                if (d20 != 0.0d) {
                    d2 = d15 - (((d15 - d9) * (d14 - d16)) / d20);
                    float[] fArr22 = new float[i2];
                    fArr22[0] = (float) d16;
                    fArr22[1] = (float) d2;
                    photoView.getImageMatrix().mapPoints(fArr22);
                    fArr22[0] = fArr22[0] + ((float) photoView.getLeft());
                    fArr22[1] = fArr22[1] + ((float) photoView.getTop());
                    View rootView2 = photoView.getRootView();
                    int i32 = (int) fArr22[0];
                    int i42 = (int) fArr22[1];
                    PopupWindow popupWindow2 = this.A02;
                    popupWindow2.setHeight(-2);
                    popupWindow2.setWidth(-2);
                    popupWindow2.setOutsideTouchable(true);
                    popupWindow2.setTouchable(true);
                    popupWindow2.setFocusable(true);
                    popupWindow2.setBackgroundDrawable(new BitmapDrawable());
                    View view2 = this.A01;
                    popupWindow2.setContentView(view2);
                    C13680ns.A12(view2);
                    AnonymousClass1UP.A06(C13680ns.A0M(view2, R.id.tooltip_text));
                    view2.setOnClickListener(new ViewOnClickCListenerShape2S0200000_I1_1(this, 1, interactiveAnnotation2));
                    popupWindow2.setOnDismissListener(onDismissListener);
                    popupWindow2.setAnimationStyle(R.style.style0453);
                    popupWindow2.showAtLocation(rootView2, 0, i32 - (view2.getMeasuredWidth() >> 1), (int) (((float) i42) - (((float) view2.getMeasuredHeight()) * 0.82f)));
                    return true;
                }
            }
            d2 = d17;
            float[] fArr222 = new float[i2];
            fArr222[0] = (float) d16;
            fArr222[1] = (float) d2;
            photoView.getImageMatrix().mapPoints(fArr222);
            fArr222[0] = fArr222[0] + ((float) photoView.getLeft());
            fArr222[1] = fArr222[1] + ((float) photoView.getTop());
            View rootView22 = photoView.getRootView();
            int i322 = (int) fArr222[0];
            int i422 = (int) fArr222[1];
            PopupWindow popupWindow22 = this.A02;
            popupWindow22.setHeight(-2);
            popupWindow22.setWidth(-2);
            popupWindow22.setOutsideTouchable(true);
            popupWindow22.setTouchable(true);
            popupWindow22.setFocusable(true);
            popupWindow22.setBackgroundDrawable(new BitmapDrawable());
            View view22 = this.A01;
            popupWindow22.setContentView(view22);
            C13680ns.A12(view22);
            AnonymousClass1UP.A06(C13680ns.A0M(view22, R.id.tooltip_text));
            view22.setOnClickListener(new ViewOnClickCListenerShape2S0200000_I1_1(this, 1, interactiveAnnotation2));
            popupWindow22.setOnDismissListener(onDismissListener);
            popupWindow22.setAnimationStyle(R.style.style0453);
            popupWindow22.showAtLocation(rootView22, 0, i322 - (view22.getMeasuredWidth() >> 1), (int) (((float) i422) - (((float) view22.getMeasuredHeight()) * 0.82f)));
            return true;
        } else {
            double d21 = d12 - d14;
            if (d21 != 0.0d) {
                d2 = d13 - (((d13 - d15) * (d12 - d16)) / d21);
            }
            d2 = d17;
        }
        i2 = 2;
        float[] fArr2222 = new float[i2];
        fArr2222[0] = (float) d16;
        fArr2222[1] = (float) d2;
        photoView.getImageMatrix().mapPoints(fArr2222);
        fArr2222[0] = fArr2222[0] + ((float) photoView.getLeft());
        fArr2222[1] = fArr2222[1] + ((float) photoView.getTop());
        View rootView222 = photoView.getRootView();
        int i3222 = (int) fArr2222[0];
        int i4222 = (int) fArr2222[1];
        PopupWindow popupWindow222 = this.A02;
        popupWindow222.setHeight(-2);
        popupWindow222.setWidth(-2);
        popupWindow222.setOutsideTouchable(true);
        popupWindow222.setTouchable(true);
        popupWindow222.setFocusable(true);
        popupWindow222.setBackgroundDrawable(new BitmapDrawable());
        View view222 = this.A01;
        popupWindow222.setContentView(view222);
        C13680ns.A12(view222);
        AnonymousClass1UP.A06(C13680ns.A0M(view222, R.id.tooltip_text));
        view222.setOnClickListener(new ViewOnClickCListenerShape2S0200000_I1_1(this, 1, interactiveAnnotation2));
        popupWindow222.setOnDismissListener(onDismissListener);
        popupWindow222.setAnimationStyle(R.style.style0453);
        popupWindow222.showAtLocation(rootView222, 0, i3222 - (view222.getMeasuredWidth() >> 1), (int) (((float) i4222) - (((float) view222.getMeasuredHeight()) * 0.82f)));
        return true;
    }
}
