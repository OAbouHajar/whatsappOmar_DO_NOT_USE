package X;

import android.content.Context;
import android.content.res.Resources;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import java.io.File;

/* renamed from: X.120  reason: invalid class name */
public class AnonymousClass120 {
    public final C16180sb A00;
    public final C16040sK A01;
    public final C23651Cv A02;
    public final C16980tz A03;

    public AnonymousClass120(C16180sb r1, C16040sK r2, C23651Cv r3, C16980tz r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public File A00(C16010sH r6) {
        StringBuilder sb;
        if (r6 instanceof C34721kl) {
            return A02(r6);
        }
        C15830rv r4 = (C15830rv) r6.A08(C15830rv.class);
        if (r4 == null) {
            return null;
        }
        boolean A0I = this.A01.A0I(r4);
        Context context = this.A03.A00;
        if (A0I) {
            return new File(context.getFilesDir(), "me.jpg");
        }
        File file = new File(context.getCacheDir(), "Profile Pictures");
        if (!file.exists()) {
            file.mkdirs();
        }
        String str = r4.user;
        if (str == null) {
            sb = new StringBuilder();
            str = r4.getRawString();
        }
        sb.append(str);
        sb.append(".jpg");
        return new File(file, sb.toString());
    }

    public File A01(C16010sH r5) {
        if (r5 instanceof C34721kl) {
            return A02(r5);
        }
        C15830rv r3 = (C15830rv) r5.A08(C15830rv.class);
        if (r3 == null) {
            return null;
        }
        File file = new File(this.A03.A00.getFilesDir(), "Avatars");
        if (!file.exists()) {
            file.mkdirs();
        }
        String rawString = this.A01.A0I(r3) ? "me" : r3.getRawString();
        StringBuilder sb = new StringBuilder();
        sb.append(rawString);
        sb.append(".j");
        return new File(file, sb.toString());
    }

    public File A02(C16010sH r5) {
        String str;
        C33841jH A05;
        if (r5 instanceof C34721kl) {
            C16180sb r3 = this.A00;
            StringBuilder sb = new StringBuilder("tmpp");
            sb.append(((C34721kl) r5).A00);
            str = sb.toString();
            A05 = r3.A05();
        } else {
            str = "tmpp";
            A05 = this.A00.A05();
        }
        File file = A05.A09;
        C16180sb.A04(file, false);
        return C16180sb.A00(file, str);
    }

    public void A03(C16010sH r3) {
        File A002 = A00(r3);
        if (A002 != null && A002.exists()) {
            A002.delete();
        }
        File A012 = A01(r3);
        if (A012 != null && A012.exists()) {
            A012.delete();
        }
    }

    public void A04(C16010sH r6) {
        String A0A = r6.A0A();
        C34731km r3 = this.A02.A01().A02;
        for (String str : r3.A04().keySet()) {
            if (str.startsWith(A0A)) {
                r3.A03(str);
            }
        }
        r6.A0Z = true;
    }

    public boolean A05(C16010sH r4) {
        Resources resources = this.A03.A00.getResources();
        return this.A02.A01().A00(r4.A0C(yo.setSQPC(resources.getDimension(R.dimen.dimen0748)), resources.getDimensionPixelSize(R.dimen.dimen074a))) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r1 = A00(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(X.C16010sH r3) {
        /*
            r2 = this;
            java.io.File r1 = r2.A01(r3)
            if (r1 == 0) goto L_0x000c
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0012
        L_0x000c:
            java.io.File r1 = r2.A00(r3)
            if (r1 == 0) goto L_0x0019
        L_0x0012:
            boolean r1 = r1.exists()
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass120.A06(X.0sH):boolean");
    }
}
