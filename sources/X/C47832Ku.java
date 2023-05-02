package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.view.MotionEventCompat;
import com.obwhatsapp.status.playback.content.BlurFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;

/* renamed from: X.2Ku  reason: invalid class name and case insensitive filesystem */
public class C47832Ku extends C16690tT {
    public RenderScript A00;
    public ScriptIntrinsicBlur A01;
    public final WeakReference A02;

    public C47832Ku(C16980tz r3, BlurFrameLayout blurFrameLayout) {
        this.A02 = new WeakReference(blurFrameLayout);
        Context context = r3.A00;
        if (C15450qv.A00()) {
            RenderScript create = RenderScript.create(context);
            this.A00 = create;
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            this.A01 = create2;
            create2.setRadius(16.0f);
        }
    }

    /* JADX INFO: finally extract failed */
    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Bitmap bitmap;
        Bitmap bitmap2 = ((Bitmap[]) objArr)[0];
        if (C15450qv.A00()) {
            try {
                bitmap = bitmap2.copy(Bitmap.Config.ARGB_8888, true);
                ScriptIntrinsicBlur scriptIntrinsicBlur = this.A01;
                if (scriptIntrinsicBlur != null) {
                    RenderScript renderScript = this.A00;
                    Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap2, Allocation.MipmapControl.MIPMAP_NONE, 1);
                    Allocation createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
                    createFromBitmap.copyFrom(bitmap2);
                    scriptIntrinsicBlur.setInput(createFromBitmap);
                    scriptIntrinsicBlur.forEach(createTyped);
                    createTyped.copyTo(bitmap);
                }
                RenderScript renderScript2 = this.A00;
                if (renderScript2 != null) {
                    renderScript2.destroy();
                    return bitmap;
                }
            } catch (Throwable th) {
                RenderScript renderScript3 = this.A00;
                if (renderScript3 != null) {
                    renderScript3.destroy();
                }
                throw th;
            }
        } else {
            bitmap = bitmap2.copy(Bitmap.Config.ARGB_8888, true);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i2 = width * height;
            int[] iArr = new int[i2];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i3 = width - 1;
            int i4 = height - 1;
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            int[] iArr4 = new int[i2];
            int[] iArr5 = new int[Math.max(width, height)];
            int i5 = 34 >> 1;
            int i6 = i5 * i5;
            int i7 = i6 << 8;
            int[] iArr6 = new int[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                iArr6[i8] = i8 / i6;
            }
            int[] iArr7 = new int[2];
            iArr7[1] = 3;
            iArr7[0] = 33;
            int[][] iArr8 = (int[][]) Array.newInstance(int.class, iArr7);
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < height; i11++) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                for (int i21 = -16; i21 <= 16; i21++) {
                    int i22 = iArr[i9 + Math.min(i3, Math.max(i21, 0))];
                    int[] iArr9 = iArr8[i21 + 16];
                    iArr9[0] = (i22 & 16711680) >> 16;
                    iArr9[1] = (i22 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                    int i23 = i22 & MotionEventCompat.ACTION_MASK;
                    iArr9[2] = i23;
                    int abs = 17 - Math.abs(i21);
                    int i24 = iArr9[0];
                    i12 += i24 * abs;
                    i13 += iArr9[1] * abs;
                    i14 += i23 * abs;
                    if (i21 > 0) {
                        i18 += i24;
                        i19 += iArr9[1];
                        i20 += iArr9[2];
                    } else {
                        i15 += i24;
                        i16 += iArr9[1];
                        i17 += iArr9[2];
                    }
                }
                int i25 = 16;
                for (int i26 = 0; i26 < width; i26++) {
                    iArr2[i9] = iArr6[i12];
                    iArr3[i9] = iArr6[i13];
                    iArr4[i9] = iArr6[i14];
                    int i27 = i12 - i15;
                    int i28 = i13 - i16;
                    int i29 = i14 - i17;
                    int[] iArr10 = iArr8[((i25 - 16) + 33) % 33];
                    int i30 = i15 - iArr10[0];
                    int i31 = i16 - iArr10[1];
                    int i32 = i17 - iArr10[2];
                    if (i11 == 0) {
                        iArr5[i26] = Math.min(i26 + 16 + 1, i3);
                    }
                    int i33 = iArr[i10 + iArr5[i26]];
                    iArr10[0] = (i33 & 16711680) >> 16;
                    iArr10[1] = (i33 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                    int i34 = i33 & MotionEventCompat.ACTION_MASK;
                    iArr10[2] = i34;
                    int i35 = i18 + iArr10[0];
                    int i36 = i19 + iArr10[1];
                    int i37 = i20 + i34;
                    i12 = i27 + i35;
                    i13 = i28 + i36;
                    i14 = i29 + i37;
                    i25 = (i25 + 1) % 33;
                    int[] iArr11 = iArr8[i25 % 33];
                    int i38 = iArr11[0];
                    i15 = i30 + i38;
                    int i39 = iArr11[1];
                    i16 = i31 + i39;
                    int i40 = iArr11[2];
                    i17 = i32 + i40;
                    i18 = i35 - i38;
                    i19 = i36 - i39;
                    i20 = i37 - i40;
                    i9++;
                }
                i10 += width;
            }
            for (int i41 = 0; i41 < width; i41++) {
                int i42 = -16;
                int i43 = i42 * width;
                int i44 = 0;
                int i45 = 0;
                int i46 = 0;
                int i47 = 0;
                int i48 = 0;
                int i49 = 0;
                int i50 = 0;
                int i51 = 0;
                int i52 = 0;
                while (i42 <= 16) {
                    int max = Math.max(0, i43) + i41;
                    int[] iArr12 = iArr8[i42 + 16];
                    iArr12[0] = iArr2[max];
                    iArr12[1] = iArr3[max];
                    iArr12[2] = iArr4[max];
                    int abs2 = 17 - Math.abs(i42);
                    i44 += iArr2[max] * abs2;
                    i45 += iArr3[max] * abs2;
                    i46 += iArr4[max] * abs2;
                    int i53 = iArr12[0];
                    if (i42 > 0) {
                        i50 += i53;
                        i51 += iArr12[1];
                        i52 += iArr12[2];
                    } else {
                        i47 += i53;
                        i48 += iArr12[1];
                        i49 += iArr12[2];
                    }
                    if (i42 < i4) {
                        i43 += width;
                    }
                    i42++;
                }
                int i54 = 16;
                int i55 = i41;
                for (int i56 = 0; i56 < height; i56++) {
                    iArr[i55] = (iArr[i55] & -16777216) | (iArr6[i44] << 16) | (iArr6[i45] << 8) | iArr6[i46];
                    int i57 = i44 - i47;
                    int i58 = i45 - i48;
                    int i59 = i46 - i49;
                    int[] iArr13 = iArr8[((i54 - 16) + 33) % 33];
                    int i60 = i47 - iArr13[0];
                    int i61 = i48 - iArr13[1];
                    int i62 = i49 - iArr13[2];
                    if (i41 == 0) {
                        iArr5[i56] = Math.min(i56 + 16 + 1, i4) * width;
                    }
                    int i63 = iArr5[i56] + i41;
                    iArr13[0] = iArr2[i63];
                    iArr13[1] = iArr3[i63];
                    int i64 = iArr4[i63];
                    iArr13[2] = i64;
                    int i65 = i50 + iArr13[0];
                    int i66 = i51 + iArr13[1];
                    int i67 = i52 + i64;
                    i44 = i57 + i65;
                    i45 = i58 + i66;
                    i46 = i59 + i67;
                    i54 = (i54 + 1) % 33;
                    int[] iArr14 = iArr8[i54];
                    int i68 = iArr14[0];
                    i47 = i60 + i68;
                    int i69 = iArr14[1];
                    i48 = i61 + i69;
                    int i70 = iArr14[2];
                    i49 = i62 + i70;
                    i50 = i65 - i68;
                    i51 = i66 - i69;
                    i52 = i67 - i70;
                    i55 += width;
                }
            }
            bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        }
        return bitmap;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        BlurFrameLayout blurFrameLayout = (BlurFrameLayout) this.A02.get();
        if (blurFrameLayout != null) {
            Bitmap bitmap2 = blurFrameLayout.A01;
            if (bitmap2 == null) {
                blurFrameLayout.setAlpha(0.0f);
                blurFrameLayout.A02 = blurFrameLayout.animate().alpha(1.0f).setDuration(500);
            } else {
                bitmap2.recycle();
            }
            blurFrameLayout.A01 = bitmap;
            blurFrameLayout.invalidate();
        }
    }
}
