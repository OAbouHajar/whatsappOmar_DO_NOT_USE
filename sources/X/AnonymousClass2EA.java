package X;

import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.obwhatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2EA  reason: invalid class name */
public class AnonymousClass2EA {
    public static final int A00 = 8;
    public static final int A01 = 20;
    public static final int A02 = 72;
    public static final int A03 = 108;
    public static final String A04 = "com.obwhatsapp.sharing.category.SHARE_TARGET_DEFAULT";
    public static final Set A05 = new AnonymousClass5CM();

    public static int A00(Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            return 8;
        }
        return AnonymousClass04T.A00(context);
    }

    public static ShortcutInfo A01(Context context, C17160ud r6, C16000sG r7, C16080sP r8, AnonymousClass152 r9, C16010sH r10, int i2) {
        Log.i("WaShortcutsApiHelper/createShortcutForContact");
        C15830rv r0 = r10.A0E;
        AnonymousClass00B.A06(r0);
        ShortcutInfo.Builder rank = new ShortcutInfo.Builder(context, r0.getRawString()).setShortLabel(r8.A08(r10)).setCategories(A05).setLongLived(true).setRank(i2);
        Intent A0x = new C14750ph().A0x(context, (C15830rv) r10.A08(C15830rv.class));
        AnonymousClass22U.A01(A0x, "WaShortcutsHelper");
        ShortcutInfo.Builder intent = rank.setIntent(A0x.setAction("android.intent.action.VIEW"));
        Bitmap A012 = r9.A01(context, r10, 0.0f, 72);
        if (A012 == null) {
            A012 = C17160ud.A00(r6.A01.A00, 0.0f, r6.A01(r10), 72);
        }
        intent.setIcon(Icon.createWithAdaptiveBitmap(A02(A012)));
        if (C16030sJ.A0O(r10.A0E)) {
            intent.setPerson(new Person.Builder().setName(r8.A08(r10)).setUri(A06(context, r7, r10)).build());
        }
        return intent.build();
    }

    public static Bitmap A02(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(A03, A03, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        RectF rectF = new RectF(0.0f, 0.0f, 108.0f, 108.0f);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setColor(-1);
        canvas.drawRect(rectF, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, ((float) (canvas.getWidth() - bitmap.getWidth())) / 2.0f, ((float) (canvas.getHeight() - bitmap.getHeight())) / 2.0f, paint);
        return createBitmap;
    }

    public static AnonymousClass04K A03(Context context, C16000sG r3, C16080sP r4, C16010sH r5) {
        AnonymousClass04L r1 = new AnonymousClass04L();
        r1.A01 = r4.A08(r5);
        r1.A03 = A06(context, r3, r5);
        return new AnonymousClass04K(r1);
    }

    public static AnonymousClass04S A04(Context context, C17160ud r8, C16000sG r9, C16080sP r10, AnonymousClass152 r11, C16010sH r12, int i2) {
        Log.i("WaShortcutsApiHelper/createShortcutCompatForContact");
        C15830rv r0 = r12.A0E;
        AnonymousClass00B.A06(r0);
        AnonymousClass04R r4 = new AnonymousClass04R(context, r0.getRawString());
        String A08 = r10.A08(r12);
        AnonymousClass04S r3 = r4.A00;
        r3.A0B = A08;
        r3.A0F = A05;
        r3.A0N = true;
        r3.A02 = i2;
        Intent A0x = new C14750ph().A0x(context, (C15830rv) r12.A08(C15830rv.class));
        AnonymousClass22U.A01(A0x, "WaShortcutsHelper");
        r3.A0P = new Intent[]{A0x.setAction("android.intent.action.VIEW")};
        Bitmap A012 = r11.A01(context, r12, 0.0f, 72);
        if (A012 == null) {
            A012 = C17160ud.A00(r8.A01.A00, 0.0f, r8.A01(r12), 72);
        }
        Bitmap A022 = A02(A012);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.A06 = A022;
        r3.A09 = iconCompat;
        if (C16030sJ.A0O(r12.A0E)) {
            r3.A0Q = new AnonymousClass04K[]{A03(context, r9, r10, r12)};
        }
        return r4.A00();
    }

    public static AnonymousClass04S A05(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass04S r1 = (AnonymousClass04S) it.next();
            if (r1.A0D.equals(str)) {
                return r1;
            }
        }
        return null;
    }

    public static String A06(Context context, C16000sG r1, C16010sH r2) {
        Uri A042 = r1.A04(context.getContentResolver(), r2);
        if (A042 != null) {
            return A042.toString();
        }
        return null;
    }

    public static List A07(AnonymousClass01Y r5, C16000sG r6, C15810rt r7, C216114t r8, AnonymousClass151 r9, C16070sO r10) {
        Log.i("WaShortcutsApiHelper/getFrequentContacts");
        ArrayList arrayList = new ArrayList();
        for (C15830rv r3 : r9.A01((C42631y9) null)) {
            C16010sH A08 = r6.A08(r3);
            if (A08 != null && !r5.A0V(UserJid.of(r3)) && !r7.A0I(r3) && !C16030sJ.A0P(r3) && !C16030sJ.A0Q(r3)) {
                if (!A08.A0J() || r10.A09((GroupJid) r3)) {
                    arrayList.add(A08);
                }
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        List list = arrayList;
        if (isEmpty) {
            Log.i("WaShortcutsApiHelper/getFrequentContacts/get N contacts");
            List A032 = r8.A03(20);
            boolean isEmpty2 = A032.isEmpty();
            list = A032;
            if (isEmpty2) {
                Log.i("WaShortcutsApiHelper/getFrequentContacts/get contact picker list");
                r6.A0Y(A032);
                list = A032;
            }
        }
        return list;
    }

    public static void A08(Context context) {
        AnonymousClass04T.A05(context);
    }

    public static void A09(Context context) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        List<ShortcutInfo> shortcuts = shortcutManager.getShortcuts(8);
        ArrayList arrayList = new ArrayList();
        for (ShortcutInfo id : shortcuts) {
            arrayList.add(id.getId());
        }
        shortcutManager.removeLongLivedShortcuts(arrayList);
    }

    public static synchronized void A0D(Context context, C16300so r15, AnonymousClass01Y r16, C17160ud r17, C16000sG r18, C16080sP r19, AnonymousClass152 r20, C16260sj r21, C15810rt r22, C216114t r23, AnonymousClass151 r24, C16070sO r25) {
        synchronized (AnonymousClass2EA.class) {
            C16000sG r10 = r18;
            List A07 = A07(r16, r10, r22, r23, r24, r25);
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            if (r21.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA") == 0) {
                z2 = true;
            }
            Context context2 = context;
            if (z2) {
                AnonymousClass04R r6 = new AnonymousClass04R(context, "open_camera");
                String string = context.getString(R.string.str161d);
                AnonymousClass04S r5 = r6.A00;
                r5.A0B = string;
                r5.A09 = IconCompat.A02(context.getResources(), context.getPackageName(), R.drawable.ic_shortcut_camera_alt);
                Intent intent = new Intent();
                intent.setClassName(context.getPackageName(), "com.obwhatsapp.camera.LauncherCameraActivity");
                r5.A0P = new Intent[]{intent.setAction("android.intent.action.VIEW")};
                arrayList.add(r6.A00());
            }
            int A002 = A00(context);
            int i2 = 0;
            while (i2 < A07.size()) {
                arrayList.add(A04(context2, r17, r10, r19, r20, (C16010sH) A07.get(i2), i2));
                if (A002 != arrayList.size()) {
                    i2++;
                }
            }
            try {
                A0J(context2, arrayList);
            } catch (IllegalArgumentException | IllegalStateException | SecurityException e2) {
                r15.AcB("WaShortcutsHelper/rebuildDynamicShortcuts", (String) null, true);
                Log.w("WaShortcutsHelper/exception happened. ", e2);
            }
        }
        return;
    }

    public static synchronized void A0F(Context context, C17160ud r12, C16000sG r13, C16080sP r14, AnonymousClass152 r15, C16010sH r16) {
        synchronized (AnonymousClass2EA.class) {
            Context context2 = context;
            List A032 = AnonymousClass04T.A03(context);
            C16010sH r10 = r16;
            C15830rv r0 = r10.A0E;
            AnonymousClass00B.A06(r0);
            C16080sP r8 = r14;
            if (A0K(A05(r0.getRawString(), A032), r14, r10)) {
                Log.i("WaShortcutsApiHelper/publishShortcut/shortcut already published");
            } else {
                C17160ud r6 = r12;
                C16000sG r7 = r13;
                AnonymousClass152 r9 = r15;
                ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(A01(context2, r6, r7, r8, r9, r10, Math.min(A032.size(), A00(context))));
            }
        }
    }

    public static void A0G(Context context, C16010sH r3) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        C15830rv r0 = r3.A0E;
        AnonymousClass00B.A06(r0);
        arrayList.add(r0.getRawString());
        if (shortcutManager != null) {
            shortcutManager.disableShortcuts(arrayList);
        }
    }

    public static void A0H(Context context, C15830rv r4) {
        String rawString = r4.getRawString();
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        for (ShortcutInfo shortcutInfo : shortcutManager.getShortcuts(8)) {
            if (shortcutInfo.getId().equals(rawString)) {
                shortcutManager.removeLongLivedShortcuts(Collections.singletonList(shortcutInfo.getId()));
                return;
            }
        }
    }

    public static void A0J(Context context, List list) {
        Log.i("WaShortcutsApiHelper/rebuild shortcut lists");
        AnonymousClass04T.A05(context);
        int A002 = A00(context);
        if (list.size() > A002) {
            list = list.subList(0, A002);
        }
        AnonymousClass04T.A07(context, list);
    }

    public static boolean A0K(AnonymousClass04S r1, C16080sP r2, C16010sH r3) {
        return r1 != null && r1.A0B.toString().equals(r2.A08(r3));
    }
}
