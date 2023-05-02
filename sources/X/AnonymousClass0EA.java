package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0EA  reason: invalid class name */
public class AnonymousClass0EA extends AnonymousClass0WK {
    public static final Font A00(FontFamily fontFamily, int i2) {
        int i3 = 400;
        if ((i2 & 1) != 0) {
            i3 = 700;
        }
        FontStyle fontStyle = new FontStyle(i3, AnonymousClass000.A1O(i2 & 2) ? 1 : 0);
        Font font = fontFamily.getFont(0);
        FontStyle style = font.getStyle();
        int A09 = AnonymousClass000.A09(fontStyle.getWeight(), style.getWeight()) / 100;
        int i4 = 2;
        if (fontStyle.getSlant() == style.getSlant()) {
            i4 = 0;
        }
        int i5 = A09 + i4;
        for (int i6 = 1; i6 < fontFamily.getSize(); i6++) {
            Font font2 = fontFamily.getFont(i6);
            FontStyle style2 = font2.getStyle();
            int A092 = AnonymousClass000.A09(fontStyle.getWeight(), style2.getWeight()) / 100;
            int i7 = 2;
            if (fontStyle.getSlant() == style2.getSlant()) {
                i7 = 0;
            }
            int i8 = A092 + i7;
            if (i8 < i5) {
                font = font2;
                i5 = i8;
            }
        }
        return font;
    }

    public Typeface A03(Context context, Resources resources, AnonymousClass0NO r11, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (AnonymousClass0P0 r6 : r11.A00) {
                try {
                    Font build = new Font.Builder(resources, r6.A00).setWeight(r6.A02).setSlant(AnonymousClass000.A1O(r6.A05 ? 1 : 0) ? 1 : 0).setTtcIndex(r6.A01).setFontVariationSettings(r6.A04).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(A00(build2, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    public Typeface A04(Context context, Resources resources, String str, int i2, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A05(android.content.Context r10, android.os.CancellationSignal r11, X.C04940Op[] r12, int r13) {
        /*
            r9 = this;
            r2 = 0
            android.content.ContentResolver r7 = r10.getContentResolver()
            int r6 = r12.length     // Catch:{ Exception -> 0x006a }
            r5 = r2
            r4 = 0
        L_0x0008:
            if (r4 >= r6) goto L_0x004d
            r8 = r12[r4]     // Catch:{ Exception -> 0x006a }
            android.net.Uri r1 = r8.A03     // Catch:{ IOException -> 0x004a }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r3 = r7.openFileDescriptor(r1, r0, r2)     // Catch:{ IOException -> 0x004a }
            if (r3 == 0) goto L_0x004a
            android.graphics.fonts.Font$Builder r1 = new android.graphics.fonts.Font$Builder     // Catch:{ all -> 0x0045 }
            r1.<init>(r3)     // Catch:{ all -> 0x0045 }
            int r0 = r8.A02     // Catch:{ all -> 0x0045 }
            android.graphics.fonts.Font$Builder r1 = r1.setWeight(r0)     // Catch:{ all -> 0x0045 }
            boolean r0 = r8.A04     // Catch:{ all -> 0x0045 }
            boolean r0 = X.AnonymousClass000.A1O(r0)
            android.graphics.fonts.Font$Builder r1 = r1.setSlant(r0)     // Catch:{ all -> 0x0045 }
            int r0 = r8.A01     // Catch:{ all -> 0x0045 }
            android.graphics.fonts.Font$Builder r0 = r1.setTtcIndex(r0)     // Catch:{ all -> 0x0045 }
            android.graphics.fonts.Font r1 = r0.build()     // Catch:{ all -> 0x0045 }
            if (r5 != 0) goto L_0x003e
            android.graphics.fonts.FontFamily$Builder r0 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ all -> 0x0045 }
            r0.<init>(r1)     // Catch:{ all -> 0x0045 }
            r5 = r0
            goto L_0x0041
        L_0x003e:
            r5.addFont(r1)     // Catch:{ all -> 0x0045 }
        L_0x0041:
            r3.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004a
        L_0x0045:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            int r4 = r4 + 1
            goto L_0x0008
        L_0x004d:
            if (r5 != 0) goto L_0x0050
            return r2
        L_0x0050:
            android.graphics.fonts.FontFamily r0 = r5.build()     // Catch:{ Exception -> 0x006a }
            android.graphics.Typeface$CustomFallbackBuilder r1 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x006a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x006a }
            android.graphics.fonts.Font r0 = A00(r0, r13)     // Catch:{ Exception -> 0x006a }
            android.graphics.fonts.FontStyle r0 = r0.getStyle()     // Catch:{ Exception -> 0x006a }
            android.graphics.Typeface$CustomFallbackBuilder r0 = r1.setStyle(r0)     // Catch:{ Exception -> 0x006a }
            android.graphics.Typeface r0 = r0.build()     // Catch:{ Exception -> 0x006a }
            return r0
        L_0x006a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EA.A05(android.content.Context, android.os.CancellationSignal, X.0Op[], int):android.graphics.Typeface");
    }

    public Typeface A06(Context context, InputStream inputStream) {
        throw AnonymousClass000.A0a("Do not use this function in API 29 or later.");
    }

    public C04940Op A07(C04940Op[] r2, int i2) {
        throw AnonymousClass000.A0a("Do not use this function in API 29 or later.");
    }
}
