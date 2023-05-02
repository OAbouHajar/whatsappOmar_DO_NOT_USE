package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.04R  reason: invalid class name */
public class AnonymousClass04R {
    public final AnonymousClass04S A00;

    public AnonymousClass04R(AnonymousClass04S r4) {
        AnonymousClass04S r2 = new AnonymousClass04S();
        this.A00 = r2;
        r2.A05 = r4.A05;
        r2.A0D = r4.A0D;
        r2.A0E = r4.A0E;
        Intent[] intentArr = r4.A0P;
        r2.A0P = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
        r2.A04 = r4.A04;
        r2.A0B = r4.A0B;
        r2.A0C = r4.A0C;
        r2.A0A = r4.A0A;
        r2.A00 = r4.A00;
        r2.A09 = r4.A09;
        r2.A0H = r4.A0H;
        r2.A07 = r4.A07;
        r2.A03 = r4.A03;
        r2.A0I = r4.A0I;
        r2.A0K = r4.A0K;
        r2.A0O = r4.A0O;
        r2.A0J = r4.A0J;
        r2.A0M = r4.A0M;
        r2.A0L = r4.A0L;
        r2.A08 = r4.A08;
        r2.A0N = r4.A0N;
        r2.A0G = r4.A0G;
        r2.A02 = r4.A02;
        AnonymousClass04K[] r1 = r4.A0Q;
        if (r1 != null) {
            r2.A0Q = (AnonymousClass04K[]) Arrays.copyOf(r1, r1.length);
        }
        Set set = r4.A0F;
        if (set != null) {
            r2.A0F = new HashSet(set);
        }
        PersistableBundle persistableBundle = r4.A06;
        if (persistableBundle != null) {
            r2.A06 = persistableBundle;
        }
        r2.A01 = r4.A01;
    }

    public AnonymousClass04R(Context context, ShortcutInfo shortcutInfo) {
        int i2;
        AnonymousClass04S r1 = new AnonymousClass04S();
        this.A00 = r1;
        r1.A05 = context;
        r1.A0D = shortcutInfo.getId();
        r1.A0E = shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        r1.A0P = (Intent[]) Arrays.copyOf(intents, intents.length);
        r1.A04 = shortcutInfo.getActivity();
        r1.A0B = shortcutInfo.getShortLabel();
        r1.A0C = shortcutInfo.getLongLabel();
        r1.A0A = shortcutInfo.getDisabledMessage();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            i2 = shortcutInfo.getDisabledReason();
        } else {
            i2 = 3;
            if (shortcutInfo.isEnabled()) {
                i2 = 0;
            }
        }
        r1.A00 = i2;
        r1.A0F = shortcutInfo.getCategories();
        r1.A0Q = AnonymousClass04S.A01(shortcutInfo.getExtras());
        r1.A07 = shortcutInfo.getUserHandle();
        r1.A03 = shortcutInfo.getLastChangedTimestamp();
        if (i3 >= 30) {
            r1.A0I = shortcutInfo.isCached();
        }
        r1.A0K = shortcutInfo.isDynamic();
        r1.A0O = shortcutInfo.isPinned();
        r1.A0J = shortcutInfo.isDeclaredInManifest();
        r1.A0M = shortcutInfo.isImmutable();
        r1.A0L = shortcutInfo.isEnabled();
        r1.A0G = shortcutInfo.hasKeyFieldsOnly();
        r1.A08 = AnonymousClass04S.A00(shortcutInfo);
        r1.A02 = shortcutInfo.getRank();
        r1.A06 = shortcutInfo.getExtras();
    }

    public AnonymousClass04R(Context context, String str) {
        AnonymousClass04S r0 = new AnonymousClass04S();
        this.A00 = r0;
        r0.A05 = context;
        r0.A0D = str;
    }

    public AnonymousClass04S A00() {
        AnonymousClass04S r1 = this.A00;
        if (!TextUtils.isEmpty(r1.A0B)) {
            Intent[] intentArr = r1.A0P;
            if (intentArr != null && intentArr.length != 0) {
                return r1;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }
}
