package X;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;

/* renamed from: X.04S  reason: invalid class name */
public class AnonymousClass04S {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public ComponentName A04;
    public Context A05;
    public PersistableBundle A06;
    public UserHandle A07;
    public AnonymousClass0V1 A08;
    public IconCompat A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public String A0D;
    public String A0E;
    public Set A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public Intent[] A0P;
    public AnonymousClass04K[] A0Q;

    public static AnonymousClass0V1 A00(ShortcutInfo shortcutInfo) {
        String string;
        if (Build.VERSION.SDK_INT < 29) {
            PersistableBundle extras = shortcutInfo.getExtras();
            if (extras == null || (string = extras.getString("extraLocusId")) == null) {
                return null;
            }
            return new AnonymousClass0V1(string);
        } else if (shortcutInfo.getLocusId() == null) {
            return null;
        } else {
            return AnonymousClass0V1.A00(shortcutInfo.getLocusId());
        }
    }

    public static AnonymousClass04K[] A01(PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey("extraPersonCount")) {
            return null;
        }
        int i2 = persistableBundle.getInt("extraPersonCount");
        AnonymousClass04K[] r3 = new AnonymousClass04K[i2];
        int i3 = 0;
        while (i3 < i2) {
            StringBuilder sb = new StringBuilder("extraPerson_");
            int i4 = i3 + 1;
            sb.append(i4);
            r3[i3] = AnonymousClass04K.A00(persistableBundle.getPersistableBundle(sb.toString()));
            i3 = i4;
        }
        return r3;
    }

    public ShortcutInfo A02() {
        int length;
        int length2;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.A05, this.A0D).setShortLabel(this.A0B).setIntents(this.A0P);
        IconCompat iconCompat = this.A09;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.A09(this.A05));
        }
        if (!TextUtils.isEmpty(this.A0C)) {
            intents.setLongLabel(this.A0C);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            intents.setDisabledMessage(this.A0A);
        }
        ComponentName componentName = this.A04;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set set = this.A0F;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.A02);
        PersistableBundle persistableBundle = this.A06;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            AnonymousClass04K[] r0 = this.A0Q;
            if (r0 != null && (length2 = r0.length) > 0) {
                Person[] personArr = new Person[length2];
                int i2 = 0;
                do {
                    personArr[i2] = this.A0Q[i2].A01();
                    i2++;
                } while (i2 < length2);
                intents.setPersons(personArr);
            }
            AnonymousClass0V1 r02 = this.A08;
            if (r02 != null) {
                intents.setLocusId(r02.A01());
            }
            intents.setLongLived(this.A0N);
        } else {
            PersistableBundle persistableBundle2 = this.A06;
            if (persistableBundle2 == null) {
                persistableBundle2 = new PersistableBundle();
                this.A06 = persistableBundle2;
            }
            AnonymousClass04K[] r03 = this.A0Q;
            if (r03 != null && (length = r03.length) > 0) {
                persistableBundle2.putInt("extraPersonCount", length);
                int i3 = 0;
                while (true) {
                    AnonymousClass04K[] r5 = this.A0Q;
                    if (i3 >= r5.length) {
                        break;
                    }
                    PersistableBundle persistableBundle3 = this.A06;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i4 = i3 + 1;
                    sb.append(i4);
                    persistableBundle3.putPersistableBundle(sb.toString(), r5[i3].A03());
                    i3 = i4;
                }
            }
            AnonymousClass0V1 r04 = this.A08;
            if (r04 != null) {
                this.A06.putString("extraLocusId", r04.A01);
            }
            this.A06.putBoolean("extraLongLived", this.A0N);
            intents.setExtras(this.A06);
        }
        return intents.build();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r4 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r4 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.content.Intent r8) {
        /*
            r7 = this;
            android.content.Intent[] r1 = r7.A0P
            int r0 = r1.length
            int r0 = r0 + -1
            r1 = r1[r0]
            java.lang.String r0 = "android.intent.extra.shortcut.INTENT"
            android.content.Intent r2 = r8.putExtra(r0, r1)
            java.lang.CharSequence r0 = r7.A0B
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "android.intent.extra.shortcut.NAME"
            r2.putExtra(r0, r1)
            androidx.core.graphics.drawable.IconCompat r0 = r7.A09
            if (r0 == 0) goto L_0x0073
            r4 = 0
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x003b
            android.content.Context r0 = r7.A05
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            android.content.ComponentName r0 = r7.A04
            if (r0 == 0) goto L_0x0031
            android.graphics.drawable.Drawable r4 = r1.getActivityIcon(r0)     // Catch:{ NameNotFoundException -> 0x002f }
        L_0x002f:
            if (r4 != 0) goto L_0x003b
        L_0x0031:
            android.content.Context r0 = r7.A05
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            android.graphics.drawable.Drawable r4 = r0.loadIcon(r1)
        L_0x003b:
            androidx.core.graphics.drawable.IconCompat r3 = r7.A09
            android.content.Context r5 = r7.A05
            r3.A0E(r5)
            int r1 = r3.A02
            r2 = 1
            if (r1 == r2) goto L_0x00d2
            r0 = 2
            if (r1 == r0) goto L_0x0074
            r0 = 5
            if (r1 != r0) goto L_0x00e2
            java.lang.Object r0 = r3.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap r1 = androidx.core.graphics.drawable.IconCompat.A01(r0, r2)
            if (r4 == 0) goto L_0x006e
        L_0x0057:
            int r5 = r1.getWidth()
            int r3 = r1.getHeight()
            int r2 = r5 >> 1
            int r0 = r3 >> 1
            r4.setBounds(r2, r0, r5, r3)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            r4.draw(r0)
        L_0x006e:
            java.lang.String r0 = "android.intent.extra.shortcut.ICON"
            r8.putExtra(r0, r1)
        L_0x0073:
            return
        L_0x0074:
            java.lang.String r0 = r3.A0D()     // Catch:{ NameNotFoundException -> 0x00eb }
            r6 = 0
            android.content.Context r2 = r5.createPackageContext(r0, r6)     // Catch:{ NameNotFoundException -> 0x00eb }
            if (r4 != 0) goto L_0x008b
            java.lang.String r1 = "android.intent.extra.shortcut.ICON_RESOURCE"
            int r0 = r3.A00     // Catch:{ NameNotFoundException -> 0x00eb }
            android.content.Intent$ShortcutIconResource r0 = android.content.Intent.ShortcutIconResource.fromContext(r2, r0)     // Catch:{ NameNotFoundException -> 0x00eb }
            r8.putExtra(r1, r0)     // Catch:{ NameNotFoundException -> 0x00eb }
            goto L_0x00ea
        L_0x008b:
            int r0 = r3.A00     // Catch:{ NameNotFoundException -> 0x00eb }
            android.graphics.drawable.Drawable r5 = X.AnonymousClass00T.A04(r2, r0)     // Catch:{ NameNotFoundException -> 0x00eb }
            int r0 = r5.getIntrinsicWidth()     // Catch:{ NameNotFoundException -> 0x00eb }
            if (r0 <= 0) goto L_0x00bf
            int r0 = r5.getIntrinsicHeight()     // Catch:{ NameNotFoundException -> 0x00eb }
            if (r0 <= 0) goto L_0x00bf
            int r2 = r5.getIntrinsicWidth()     // Catch:{ NameNotFoundException -> 0x00eb }
            int r1 = r5.getIntrinsicHeight()     // Catch:{ NameNotFoundException -> 0x00eb }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NameNotFoundException -> 0x00eb }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ NameNotFoundException -> 0x00eb }
        L_0x00ab:
            int r2 = r1.getWidth()     // Catch:{ NameNotFoundException -> 0x00eb }
            int r0 = r1.getHeight()     // Catch:{ NameNotFoundException -> 0x00eb }
            r5.setBounds(r6, r6, r2, r0)     // Catch:{ NameNotFoundException -> 0x00eb }
            android.graphics.Canvas r0 = new android.graphics.Canvas     // Catch:{ NameNotFoundException -> 0x00eb }
            r0.<init>(r1)     // Catch:{ NameNotFoundException -> 0x00eb }
            r5.draw(r0)     // Catch:{ NameNotFoundException -> 0x00eb }
            goto L_0x0057
        L_0x00bf:
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch:{ NameNotFoundException -> 0x00eb }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ NameNotFoundException -> 0x00eb }
            int r1 = r0.getLauncherLargeIconSize()     // Catch:{ NameNotFoundException -> 0x00eb }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NameNotFoundException -> 0x00eb }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r1, r0)     // Catch:{ NameNotFoundException -> 0x00eb }
            goto L_0x00ab
        L_0x00d2:
            java.lang.Object r1 = r3.A06
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r4 == 0) goto L_0x006e
            android.graphics.Bitmap$Config r0 = r1.getConfig()
            android.graphics.Bitmap r1 = r1.copy(r0, r2)
            goto L_0x0057
        L_0x00e2:
            java.lang.String r1 = "Icon type not supported for intent shortcuts"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00ea:
            return
        L_0x00eb:
            r2 = move-exception
            java.lang.String r0 = "Can't find package "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.Object r0 = r3.A06
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass04S.A03(android.content.Intent):void");
    }
}
