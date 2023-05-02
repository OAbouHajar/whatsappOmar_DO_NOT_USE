package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.facebook.redex.IDxCallableShape147S0100000_I1;
import com.facebook.redex.IDxLListenerShape2S1000000_I1;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: X.0XN  reason: invalid class name */
public class AnonymousClass0XN {
    public static final Map A00 = AnonymousClass000.A0x();
    public static final byte[] A01 = {80, 75, 3, 4};

    public static C06150Um A00(Context context, String str, int i2) {
        try {
            C13670mq A08 = A08(A09(context.getResources().openRawResource(i2)));
            return A07(A08).booleanValue() ? A04(str, new ZipInputStream(A08.AIN())) : A03(A08.AIN(), str);
        } catch (Resources.NotFoundException e2) {
            return new C06150Um((Throwable) e2);
        }
    }

    public static C06150Um A01(Context context, String str, String str2) {
        try {
            return (str.endsWith(".zip") || str.endsWith(".lottie")) ? A04(str2, new ZipInputStream(context.getAssets().open(str))) : A03(context.getAssets().open(str), str2);
        } catch (IOException e2) {
            return new C06150Um((Throwable) e2);
        }
    }

    public static C06150Um A02(C09090et r23, String str, boolean z2) {
        C06150Um r1;
        C09090et r5 = r23;
        try {
            float A002 = AnonymousClass0XD.A00();
            AnonymousClass03G r22 = new AnonymousClass03G();
            ArrayList A0u = AnonymousClass000.A0u();
            HashMap A0x = AnonymousClass000.A0x();
            HashMap A0x2 = AnonymousClass000.A0x();
            HashMap A0x3 = AnonymousClass000.A0x();
            ArrayList A0u2 = AnonymousClass000.A0u();
            AnonymousClass07U r16 = new AnonymousClass07U();
            AnonymousClass0Rs r4 = new AnonymousClass0Rs();
            r5.A0F();
            int i2 = 0;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            int i3 = 0;
            while (r5.A0M()) {
                switch (r5.A09(C05880Tj.A03)) {
                    case 0:
                        i2 = r5.A08();
                        continue;
                    case 1:
                        i3 = r5.A08();
                        continue;
                    case 2:
                        f2 = C09090et.A05(r5);
                        continue;
                    case 3:
                        f3 = C09090et.A05(r5) - 0.01f;
                        continue;
                    case 4:
                        f4 = C09090et.A05(r5);
                        continue;
                    case 5:
                        String[] split = r5.A0D().split("\\.");
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        if (parseInt >= 4) {
                            if (parseInt <= 4) {
                                if (parseInt2 >= 4) {
                                    if (parseInt2 <= 4) {
                                        if (parseInt3 >= 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        AnonymousClass0Rs.A01(r4, "Lottie only supports bodymovin >= 4.4.0");
                        break;
                    case 6:
                        r5.A0E();
                        int i4 = 0;
                        while (r5.A0M()) {
                            C05320Qf A003 = C06440Vu.A00(r4, r5);
                            if (A003.A0E == C03680Jl.IMAGE) {
                                i4++;
                            }
                            A0u.add(A003);
                            r22.A09(A003.A07, A003);
                            if (i4 > 4) {
                                StringBuilder A0r = AnonymousClass000.A0r("You have ");
                                A0r.append(i4);
                                C05770Sy.A00(AnonymousClass000.A0h(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.", A0r));
                            }
                        }
                        break;
                    case 7:
                        r5.A0E();
                        while (r5.A0M()) {
                            ArrayList A0u3 = AnonymousClass000.A0u();
                            AnonymousClass03G r13 = new AnonymousClass03G();
                            r5.A0F();
                            String str2 = null;
                            String str3 = null;
                            int i5 = 0;
                            int i6 = 0;
                            while (r5.A0M()) {
                                int A09 = r5.A09(C05880Tj.A00);
                                if (A09 == 0) {
                                    str2 = r5.A0D();
                                } else if (A09 == 1) {
                                    r5.A0E();
                                    while (r5.A0M()) {
                                        C05320Qf A004 = C06440Vu.A00(r4, r5);
                                        r13.A09(A004.A07, A004);
                                        A0u3.add(A004);
                                    }
                                    r5.A0G();
                                } else if (A09 == 2) {
                                    i5 = r5.A08();
                                } else if (A09 == 3) {
                                    i6 = r5.A08();
                                } else if (A09 == 4) {
                                    str3 = r5.A0D();
                                } else if (A09 != 5) {
                                    r5.A0I();
                                    r5.A0J();
                                } else {
                                    r5.A0D();
                                }
                            }
                            r5.A0H();
                            if (str3 != null) {
                                C05000Ov r8 = new C05000Ov(str2, str3, i5, i6);
                                A0x2.put(r8.A04, r8);
                            } else {
                                A0x.put(str2, A0u3);
                            }
                        }
                        break;
                    case 8:
                        r5.A0F();
                        while (r5.A0M()) {
                            if (r5.A09(C05880Tj.A01) != 0) {
                                r5.A0I();
                                r5.A0J();
                            } else {
                                r5.A0E();
                                while (r5.A0M()) {
                                    r5.A0F();
                                    String str4 = null;
                                    String str5 = null;
                                    String str6 = null;
                                    while (r5.A0M()) {
                                        int A092 = r5.A09(AnonymousClass0TF.A00);
                                        if (A092 == 0) {
                                            str4 = r5.A0D();
                                        } else if (A092 == 1) {
                                            str5 = r5.A0D();
                                        } else if (A092 == 2) {
                                            str6 = r5.A0D();
                                        } else if (A092 != 3) {
                                            r5.A0I();
                                            r5.A0J();
                                        } else {
                                            r5.A07();
                                        }
                                    }
                                    r5.A0H();
                                    AnonymousClass0OR r82 = new AnonymousClass0OR(str4, str5, str6);
                                    A0x3.put(r82.A01, r82);
                                }
                                r5.A0G();
                            }
                        }
                        r5.A0H();
                        continue;
                    case 9:
                        r5.A0E();
                        while (r5.A0M()) {
                            ArrayList A0u4 = AnonymousClass000.A0u();
                            r5.A0F();
                            String str7 = null;
                            String str8 = null;
                            double d2 = 0.0d;
                            char c2 = 0;
                            while (r5.A0M()) {
                                int A093 = r5.A09(AnonymousClass0TZ.A01);
                                if (A093 == 0) {
                                    c2 = r5.A0D().charAt(0);
                                } else if (A093 == 1) {
                                    r5.A07();
                                } else if (A093 == 2) {
                                    d2 = r5.A07();
                                } else if (A093 == 3) {
                                    str7 = r5.A0D();
                                } else if (A093 == 4) {
                                    str8 = r5.A0D();
                                } else if (A093 != 5) {
                                    r5.A0I();
                                    r5.A0J();
                                } else {
                                    r5.A0F();
                                    while (r5.A0M()) {
                                        if (r5.A09(AnonymousClass0TZ.A00) != 0) {
                                            r5.A0I();
                                            r5.A0J();
                                        } else {
                                            r5.A0E();
                                            while (r5.A0M()) {
                                                A0u4.add(C06360Vk.A02(r4, r5));
                                            }
                                            r5.A0G();
                                        }
                                    }
                                    r5.A0H();
                                }
                            }
                            r5.A0H();
                            C05200Pr r83 = new C05200Pr(str7, str8, A0u4, c2, d2);
                            r16.A03(r83.hashCode(), r83);
                        }
                        break;
                    case 10:
                        r5.A0E();
                        while (r5.A0M()) {
                            String str9 = null;
                            r5.A0F();
                            float f5 = 0.0f;
                            float f6 = 0.0f;
                            while (r5.A0M()) {
                                int A094 = r5.A09(C05880Tj.A02);
                                if (A094 == 0) {
                                    str9 = r5.A0D();
                                } else if (A094 == 1) {
                                    f5 = C09090et.A05(r5);
                                } else if (A094 != 2) {
                                    r5.A0I();
                                    r5.A0J();
                                } else {
                                    f6 = C09090et.A05(r5);
                                }
                            }
                            r5.A0H();
                            A0u2.add(new AnonymousClass0OS(str9, f5, f6));
                        }
                        break;
                    default:
                        r5.A0I();
                        r5.A0J();
                        continue;
                }
                r5.A0G();
            }
            r4.A04 = new Rect(0, 0, (int) (((float) i2) * A002), (int) (((float) i3) * A002));
            r4.A02 = f2;
            r4.A00 = f3;
            r4.A01 = f4;
            r4.A07 = A0u;
            r4.A05 = r22;
            r4.A0B = A0x;
            r4.A0A = A0x2;
            r4.A06 = r16;
            r4.A09 = A0x3;
            r4.A08 = A0u2;
            String str10 = str;
            if (str != null) {
                C05950Tq.A01.A00.A06(str10, r4);
            }
            r1 = new C06150Um((Object) r4);
        } catch (Exception e2) {
            r1 = new C06150Um((Throwable) e2);
        } catch (Throwable th) {
            if (z2) {
                AnonymousClass0XD.A05(r5);
            }
            throw th;
        }
        if (z2) {
            AnonymousClass0XD.A05(r5);
        }
        return r1;
    }

    public static C06150Um A03(InputStream inputStream, String str) {
        try {
            return A02(C09090et.A06(A08(A09(inputStream))), str, true);
        } finally {
            AnonymousClass0XD.A05(inputStream);
        }
    }

    public static C06150Um A04(String str, ZipInputStream zipInputStream) {
        try {
            return A05(str, zipInputStream);
        } finally {
            AnonymousClass0XD.A05(zipInputStream);
        }
    }

    public static C06150Um A05(String str, ZipInputStream zipInputStream) {
        HashMap A0x = AnonymousClass000.A0x();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            AnonymousClass0Rs r3 = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("__MACOSX") && !nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    if (nextEntry.getName().contains(".json")) {
                        r3 = (AnonymousClass0Rs) A02(C09090et.A06(A08(A09(zipInputStream))), (String) null, false).A00;
                    } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                        String[] split = name.split("/");
                        A0x.put(split[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (r3 == null) {
                return new C06150Um((Throwable) AnonymousClass000.A0T("Unable to parse composition"));
            }
            Iterator it = A0x.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(it);
                Object key = A0z.getKey();
                Iterator it2 = r3.A0A.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C05000Ov r5 = (C05000Ov) it2.next();
                    if (r5.A03.equals(key)) {
                        Bitmap bitmap = (Bitmap) A0z.getValue();
                        int i2 = r5.A02;
                        int i3 = r5.A01;
                        if (!(bitmap.getWidth() == i2 && bitmap.getHeight() == i3)) {
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
                            bitmap.recycle();
                            bitmap = createScaledBitmap;
                        }
                        r5.A00 = bitmap;
                    }
                }
            }
            Iterator A0y = AnonymousClass000.A0y(r3.A0A);
            while (A0y.hasNext()) {
                Map.Entry A0z2 = AnonymousClass000.A0z(A0y);
                if (((C05000Ov) A0z2.getValue()).A00 == null) {
                    return new C06150Um((Throwable) AnonymousClass000.A0V(AnonymousClass000.A0h(((C05000Ov) A0z2.getValue()).A03, AnonymousClass000.A0r("There is no image for "))));
                }
            }
            if (str != null) {
                C05950Tq.A01.A00.A06(str, r3);
            }
            return new C06150Um((Object) r3);
        } catch (IOException e2) {
            return new C06150Um((Throwable) e2);
        }
    }

    public static C06250Uz A06(String str, Callable callable) {
        if (str != null) {
            Object A02 = C05950Tq.A01.A00.A02(str);
            if (A02 != null) {
                return new C06250Uz(new IDxCallableShape147S0100000_I1(A02, 3), false);
            }
            Map map = A00;
            if (map.containsKey(str)) {
                return (C06250Uz) map.get(str);
            }
        }
        C06250Uz r2 = new C06250Uz(callable, false);
        if (str != null) {
            r2.A01(new IDxLListenerShape2S1000000_I1(str, 0));
            r2.A00(new IDxLListenerShape2S1000000_I1(str, 1));
            A00.put(str, r2);
        }
        return r2;
    }

    public static Boolean A07(C13670mq r5) {
        try {
            C13670mq AaI = r5.AaI();
            for (byte b2 : A01) {
                if (AaI.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            AaI.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public static final C13670mq A08(C109945Uk r1) {
        return new AnonymousClass59F(r1);
    }

    public static final C109945Uk A09(InputStream inputStream) {
        C18450wi.A0G(inputStream, 0);
        return new AnonymousClass59H(inputStream, new C85634Pf());
    }
}
