package X;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.3Vh  reason: invalid class name and case insensitive filesystem */
public final class C65573Vh extends AnonymousClass4UE {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public C34641kb A08;
    public C34641kb A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final SparseArray A0G;
    public final SparseBooleanArray A0H;

    @Deprecated
    public C65573Vh() {
        A02();
        this.A0G = new SparseArray();
        this.A0H = new SparseBooleanArray();
    }

    public C65573Vh(Context context) {
        Point point;
        UiModeManager uiModeManager;
        String str;
        int i2 = AnonymousClass3C1.A01;
        if (i2 >= 19) {
            A00(context);
        }
        A02();
        this.A0G = new SparseArray();
        this.A0H = new SparseBooleanArray();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (i2 <= 29 && defaultDisplay.getDisplayId() == 0 && (uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode")) != null && uiModeManager.getCurrentModeType() == 4) {
            if (!"Sony".equals(AnonymousClass3C1.A04) || !AnonymousClass3C1.A05.startsWith("BRAVIA") || !context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                String str2 = i2 < 28 ? "sys.display-size" : "vendor.display-size";
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    str = (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str2});
                } catch (Exception e2) {
                    C89504cL.A01("Util", AnonymousClass000.A0h(str2, AnonymousClass000.A0r("Failed to read system property ")), e2);
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    try {
                        String[] split = str.trim().split("x", -1);
                        if (split.length == 2) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            if (parseInt > 0 && parseInt2 > 0) {
                                point = new Point(parseInt, parseInt2);
                                int i3 = point.x;
                                int i4 = point.y;
                                this.A07 = i3;
                                this.A06 = i4;
                                this.A0F = true;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                    Log.e("Util", AnonymousClass000.A0h(str, AnonymousClass000.A0r("Invalid display size: ")));
                }
            } else {
                point = new Point(3840, 2160);
                int i32 = point.x;
                int i42 = point.y;
                this.A07 = i32;
                this.A06 = i42;
                this.A0F = true;
            }
        }
        point = new Point();
        if (i2 >= 23) {
            AnonymousClass3C1.A0B(point, defaultDisplay);
        } else if (i2 >= 17) {
            AnonymousClass3C1.A0A(point, defaultDisplay);
        } else {
            defaultDisplay.getSize(point);
        }
        int i322 = point.x;
        int i422 = point.y;
        this.A07 = i322;
        this.A06 = i422;
        this.A0F = true;
    }

    public C65583Vi A01() {
        int i2 = this.A05;
        int i3 = this.A04;
        int i4 = this.A03;
        int i5 = this.A02;
        boolean z2 = this.A0E;
        boolean z3 = this.A0B;
        int i6 = this.A07;
        int i7 = this.A06;
        boolean z4 = this.A0F;
        C34641kb r11 = this.A09;
        C34641kb r10 = this.A01;
        int i8 = this.A01;
        int i9 = this.A00;
        boolean z5 = this.A0C;
        C34641kb r6 = this.A08;
        C34641kb r5 = this.A02;
        int i10 = this.A00;
        boolean z6 = this.A0D;
        boolean z7 = this.A0A;
        SparseArray sparseArray = this.A0G;
        int i11 = i4;
        int i12 = i5;
        int i13 = i6;
        int i14 = i7;
        int i15 = i8;
        int i16 = i9;
        int i17 = i10;
        return new C65583Vi(sparseArray, this.A0H, r11, r10, r6, r5, i2, i3, i11, i12, i13, i14, i15, i16, i17, z2, z3, z4, z5, z6, z7);
    }

    public final void A02() {
        this.A05 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A03 = Integer.MAX_VALUE;
        this.A02 = Integer.MAX_VALUE;
        this.A0E = true;
        this.A0B = true;
        this.A07 = Integer.MAX_VALUE;
        this.A06 = Integer.MAX_VALUE;
        this.A0F = true;
        this.A09 = C34641kb.of();
        this.A01 = Integer.MAX_VALUE;
        this.A00 = Integer.MAX_VALUE;
        this.A0C = true;
        this.A08 = C34641kb.of();
        this.A0D = true;
        this.A0A = true;
    }
}
