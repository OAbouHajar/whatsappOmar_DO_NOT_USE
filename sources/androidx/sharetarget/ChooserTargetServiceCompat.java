package androidx.sharetarget;

import X.AnonymousClass000;
import X.AnonymousClass04S;
import X.AnonymousClass0NT;
import X.AnonymousClass0ON;
import X.AnonymousClass0OO;
import X.C06400Vq;
import X.C09160f2;
import X.C10770hf;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.redex.IDxCallableShape6S1100000_I1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ChooserTargetServiceCompat extends ChooserTargetService {
    public List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        IconCompat iconCompat;
        Bitmap bitmap;
        Context applicationContext = getApplicationContext();
        ArrayList A01 = C06400Vq.A01(applicationContext);
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            AnonymousClass0ON r6 = (AnonymousClass0ON) it.next();
            if (r6.A00.equals(componentName.getClassName())) {
                AnonymousClass0NT[] r5 = r6.A01;
                int length = r5.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (intentFilter.hasDataType(r5[i2].A00)) {
                        A0u.add(r6);
                        break;
                    }
                    i2++;
                }
            }
        }
        if (!A0u.isEmpty()) {
            if (ShortcutInfoCompatSaverImpl.A08 == null) {
                synchronized (ShortcutInfoCompatSaverImpl.A07) {
                    if (ShortcutInfoCompatSaverImpl.A08 == null) {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        ShortcutInfoCompatSaverImpl.A08 = new ShortcutInfoCompatSaverImpl(applicationContext, new ThreadPoolExecutor(0, 1, 20, timeUnit, new LinkedBlockingQueue()), new ThreadPoolExecutor(0, 1, 20, timeUnit, new LinkedBlockingQueue()));
                    }
                }
            }
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = ShortcutInfoCompatSaverImpl.A08;
            try {
                List<AnonymousClass04S> A02 = shortcutInfoCompatSaverImpl.A02();
                if (A02 != null && !A02.isEmpty()) {
                    ArrayList A0u2 = AnonymousClass000.A0u();
                    for (AnonymousClass04S r8 : A02) {
                        Iterator it2 = A0u.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            AnonymousClass0ON r7 = (AnonymousClass0ON) it2.next();
                            if (r8.A0F.containsAll(Arrays.asList(r7.A02))) {
                                A0u2.add(new C09160f2(new ComponentName(applicationContext.getPackageName(), r7.A00), r8));
                                break;
                            }
                        }
                    }
                    if (A0u2.isEmpty()) {
                        return AnonymousClass000.A0u();
                    }
                    Collections.sort(A0u2);
                    ArrayList A0u3 = AnonymousClass000.A0u();
                    float f2 = 1.0f;
                    int i3 = ((C09160f2) A0u2.get(0)).A01.A02;
                    Iterator it3 = A0u2.iterator();
                    while (it3.hasNext()) {
                        C09160f2 r62 = (C09160f2) it3.next();
                        AnonymousClass04S r72 = r62.A01;
                        Icon icon = null;
                        try {
                            AnonymousClass0OO r9 = (AnonymousClass0OO) shortcutInfoCompatSaverImpl.A05.submit(new IDxCallableShape6S1100000_I1(0, r72.A0D, shortcutInfoCompatSaverImpl)).get();
                            iconCompat = null;
                            if (r9 != null) {
                                String str = r9.A02;
                                if (!TextUtils.isEmpty(str)) {
                                    int i4 = 0;
                                    try {
                                        i4 = shortcutInfoCompatSaverImpl.A00.getResources().getIdentifier(str, (String) null, (String) null);
                                    } catch (Exception unused) {
                                    }
                                    if (i4 != 0) {
                                        Context context = shortcutInfoCompatSaverImpl.A00;
                                        iconCompat = IconCompat.A02(context.getResources(), context.getPackageName(), i4);
                                    }
                                }
                                if (!TextUtils.isEmpty(r9.A01) && (bitmap = (Bitmap) shortcutInfoCompatSaverImpl.A06.submit(new C10770hf(shortcutInfoCompatSaverImpl, r9)).get()) != null) {
                                    iconCompat = new IconCompat(1);
                                    iconCompat.A06 = bitmap;
                                }
                            }
                        } catch (Exception e2) {
                            Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e2);
                            iconCompat = null;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("android.intent.extra.shortcut.ID", r72.A0D);
                        int i5 = r72.A02;
                        if (i3 != i5) {
                            f2 -= 0.01f;
                            i3 = i5;
                        }
                        CharSequence charSequence = r72.A0B;
                        if (iconCompat != null) {
                            icon = iconCompat.A08();
                        }
                        A0u3.add(new ChooserTarget(charSequence, icon, f2, r62.A00, bundle));
                    }
                    return A0u3;
                }
            } catch (Exception e3) {
                Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e3);
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }
}
