package androidx.core.graphics.drawable;

import X.C06610Wy;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode A0A = PorterDuff.Mode.SRC_IN;
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = -1;
    public ColorStateList A03 = null;
    public PorterDuff.Mode A04 = A0A;
    public Parcelable A05 = null;
    public Object A06;
    public String A07;
    public String A08 = null;
    public byte[] A09 = null;

    public IconCompat() {
    }

    public IconCompat(int i2) {
        this.A02 = i2;
    }

    public static Resources A00(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e2);
            return null;
        }
    }

    public static Bitmap A01(Bitmap bitmap, boolean z2) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = (float) min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z2) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-(bitmap.getWidth() - min))) / 2.0f, ((float) (-(bitmap.getHeight() - min))) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat A02(Resources resources, String str, int i2) {
        if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.A00 = i2;
            if (resources != null) {
                try {
                    iconCompat.A06 = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.A06 = str;
            }
            iconCompat.A07 = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public static IconCompat A03(Bundle bundle) {
        int i2 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i2);
        iconCompat.A00 = bundle.getInt("int1");
        iconCompat.A01 = bundle.getInt("int2");
        iconCompat.A07 = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.A03 = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.A04 = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i2) {
            case -1:
            case 1:
            case 5:
                iconCompat.A06 = bundle.getParcelable("obj");
                return iconCompat;
            case 2:
            case 4:
            case 6:
                iconCompat.A06 = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.A06 = bundle.getByteArray("obj");
                return iconCompat;
            default:
                StringBuilder sb = new StringBuilder("Unknown type ");
                sb.append(i2);
                Log.w("IconCompat", sb.toString());
                return null;
        }
    }

    public int A04() {
        int i2 = this.A02;
        if (i2 == -1) {
            if (Build.VERSION.SDK_INT >= 23) {
                return C06610Wy.A00(this.A06);
            }
        } else if (i2 == 2) {
            return this.A00;
        }
        StringBuilder sb = new StringBuilder("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public int A05() {
        int i2 = this.A02;
        return (i2 != -1 || Build.VERSION.SDK_INT < 23) ? i2 : C06610Wy.A01(this.A06);
    }

    public Bitmap A06() {
        Object obj;
        int i2 = this.A02;
        if (i2 == -1) {
            if (Build.VERSION.SDK_INT >= 23) {
                obj = this.A06;
                if (!(obj instanceof Bitmap)) {
                    return null;
                }
            }
            StringBuilder sb = new StringBuilder("called getBitmap() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        } else if (i2 == 1) {
            obj = this.A06;
        } else {
            if (i2 == 5) {
                return A01((Bitmap) this.A06, true);
            }
            StringBuilder sb2 = new StringBuilder("called getBitmap() on ");
            sb2.append(this);
            throw new IllegalStateException(sb2.toString());
        }
        return (Bitmap) obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable A07(android.content.Context r7) {
        /*
            r6 = this;
            r6.A0E(r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0012
            android.graphics.drawable.Icon r0 = r6.A09(r7)
            android.graphics.drawable.Drawable r4 = X.C06610Wy.A02(r7, r0)
        L_0x0011:
            return r4
        L_0x0012:
            int r0 = r6.A02
            r4 = 0
            r5 = 0
            switch(r0) {
                case 1: goto L_0x0033;
                case 2: goto L_0x005a;
                case 3: goto L_0x003c;
                case 4: goto L_0x00a7;
                case 5: goto L_0x004d;
                case 6: goto L_0x0094;
                default: goto L_0x0019;
            }
        L_0x0019:
            if (r4 == 0) goto L_0x0011
            android.content.res.ColorStateList r0 = r6.A03
            if (r0 != 0) goto L_0x0025
            android.graphics.PorterDuff$Mode r1 = r6.A04
            android.graphics.PorterDuff$Mode r0 = A0A
            if (r1 == r0) goto L_0x0011
        L_0x0025:
            r4.mutate()
            android.content.res.ColorStateList r0 = r6.A03
            X.C018208n.A04(r0, r4)
            android.graphics.PorterDuff$Mode r0 = r6.A04
            X.C018208n.A07(r0, r4)
            return r4
        L_0x0033:
            android.content.res.Resources r3 = r7.getResources()
            java.lang.Object r0 = r6.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            goto L_0x00b5
        L_0x003c:
            android.content.res.Resources r3 = r7.getResources()
            java.lang.Object r2 = r6.A06
            byte[] r2 = (byte[]) r2
            int r1 = r6.A00
            int r0 = r6.A01
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r2, r1, r0)
            goto L_0x00b5
        L_0x004d:
            android.content.res.Resources r3 = r7.getResources()
            java.lang.Object r0 = r6.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r0 = A01(r0, r5)
            goto L_0x00b5
        L_0x005a:
            java.lang.String r1 = r6.A0D()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x0068
            java.lang.String r1 = r7.getPackageName()
        L_0x0068:
            android.content.res.Resources r2 = A00(r7, r1)
            int r1 = r6.A00     // Catch:{ RuntimeException -> 0x0077 }
            android.content.res.Resources$Theme r0 = r7.getTheme()     // Catch:{ RuntimeException -> 0x0077 }
            android.graphics.drawable.Drawable r4 = X.AnonymousClass00X.A04(r0, r2, r1)     // Catch:{ RuntimeException -> 0x0077 }
            goto L_0x0019
        L_0x0077:
            r3 = move-exception
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            int r0 = r6.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r5] = r0
            r1 = 1
            java.lang.Object r0 = r6.A06
            r2[r1] = r0
            java.lang.String r0 = "Unable to load resource 0x%08x from pkg=%s"
            java.lang.String r1 = java.lang.String.format(r0, r2)
            java.lang.String r0 = "IconCompat"
            android.util.Log.e(r0, r1, r3)
            goto L_0x0019
        L_0x0094:
            java.io.InputStream r0 = r6.A0C(r7)
            if (r0 == 0) goto L_0x0019
            android.content.res.Resources r3 = r7.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)
            android.graphics.Bitmap r0 = A01(r0, r5)
            goto L_0x00b5
        L_0x00a7:
            java.io.InputStream r0 = r6.A0C(r7)
            if (r0 == 0) goto L_0x0019
            android.content.res.Resources r3 = r7.getResources()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)
        L_0x00b5:
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            r4.<init>(r3, r0)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.A07(android.content.Context):android.graphics.drawable.Drawable");
    }

    @Deprecated
    public Icon A08() {
        return A09((Context) null);
    }

    public Icon A09(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C06610Wy.A03(context, this);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public Uri A0A() {
        int i2 = this.A02;
        if (i2 == -1) {
            if (Build.VERSION.SDK_INT >= 23) {
                return C06610Wy.A04(this.A06);
            }
        } else if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.A06);
        }
        StringBuilder sb = new StringBuilder("called getUri() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public Bundle A0B() {
        Parcelable parcelable;
        Bundle bundle = new Bundle();
        switch (this.A02) {
            case -1:
                parcelable = (Parcelable) this.A06;
                break;
            case 1:
            case 5:
                parcelable = (Bitmap) this.A06;
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.A06);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.A06);
                break;
            default:
                throw new IllegalArgumentException("Invalid icon");
        }
        bundle.putParcelable("obj", parcelable);
        bundle.putInt("type", this.A02);
        bundle.putInt("int1", this.A00);
        bundle.putInt("int2", this.A01);
        bundle.putString("string1", this.A07);
        ColorStateList colorStateList = this.A03;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.A04;
        if (mode != A0A) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public InputStream A0C(Context context) {
        StringBuilder sb;
        String str;
        Uri A0A2 = A0A();
        String scheme = A0A2.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(A0A2);
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
                sb.append(str);
                sb.append(A0A2);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.A06));
            } catch (FileNotFoundException e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
                sb.append(str);
                sb.append(A0A2);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        }
    }

    public String A0D() {
        int i2 = this.A02;
        if (i2 == -1) {
            if (Build.VERSION.SDK_INT >= 23) {
                return C06610Wy.A05(this.A06);
            }
        } else if (i2 == 2) {
            String str = this.A07;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.A06).split(":", -1)[0] : this.A07;
        }
        StringBuilder sb = new StringBuilder("called getResPackage() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public void A0E(Context context) {
        Object obj;
        if (this.A02 == 2 && (obj = this.A06) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    return;
                }
                String A0D = A0D();
                int identifier = A00(context, A0D).getIdentifier(str4, str3, str5);
                if (this.A00 != identifier) {
                    StringBuilder sb = new StringBuilder("Id has changed for ");
                    sb.append(A0D);
                    sb.append(" ");
                    sb.append(str);
                    Log.i("IconCompat", sb.toString());
                    this.A00 = identifier;
                }
            }
        }
    }

    public String toString() {
        String str;
        int i2 = this.A02;
        if (i2 == -1) {
            return String.valueOf(this.A06);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (i2) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (i2) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.A06).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.A06).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.A07);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(A04())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.A00);
                int i3 = this.A01;
                if (i3 != 0) {
                    sb.append(" off=");
                    sb.append(i3);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.A06);
                break;
        }
        ColorStateList colorStateList = this.A03;
        if (colorStateList != null) {
            sb.append(" tint=");
            sb.append(colorStateList);
        }
        PorterDuff.Mode mode = this.A04;
        if (mode != A0A) {
            sb.append(" mode=");
            sb.append(mode);
        }
        sb.append(")");
        return sb.toString();
    }
}
