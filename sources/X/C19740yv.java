package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

/* renamed from: X.0yv  reason: invalid class name and case insensitive filesystem */
public class C19740yv implements C19400yN {
    public final C16300so A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final AnonymousClass01Y A03;
    public final C17160ud A04;
    public final C16000sG A05;
    public final C16080sP A06;
    public final AnonymousClass152 A07;
    public final C16980tz A08;
    public final C16260sj A09;
    public final C15860rz A0A;
    public final C15810rt A0B;
    public final C216114t A0C;
    public final AnonymousClass151 A0D;
    public final C16070sO A0E;
    public final C16900tq A0F;
    public final C16320sq A0G;

    public C19740yv(C16300so r2, C14870pt r3, C16040sK r4, AnonymousClass01Y r5, C17160ud r6, C16000sG r7, C16080sP r8, AnonymousClass152 r9, C16980tz r10, C16260sj r11, C15860rz r12, C15810rt r13, C216114t r14, AnonymousClass151 r15, C16070sO r16, C16900tq r17, C16320sq r18) {
        this.A01 = r3;
        this.A08 = r10;
        this.A00 = r2;
        this.A0G = r18;
        this.A02 = r4;
        this.A0B = r13;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        this.A03 = r5;
        this.A09 = r11;
        this.A0F = r17;
        this.A0A = r12;
        this.A0D = r15;
        this.A0E = r16;
        this.A07 = r9;
        this.A0C = r14;
    }

    public final AnonymousClass04S A00(C16010sH r9, boolean z2, boolean z3) {
        Intent intent;
        Context context = this.A08.A00;
        String A032 = C40651uT.A03(this.A06.A08(r9));
        if (z3) {
            C15830rv r0 = r9.A0E;
            AnonymousClass00B.A06(r0);
            String rawString = r0.getRawString();
            intent = C14750ph.A08(context, 0);
            intent.setAction("android.intent.action.MAIN");
            intent.addFlags(335544320);
            intent.putExtra("jid", rawString);
        } else {
            intent = new Intent();
            intent.setAction("com.obwhatsapp.Conversation");
            intent.addFlags(335544320);
            C15830rv r02 = r9.A0E;
            AnonymousClass00B.A06(r02);
            intent.putExtra("jid", r02.getRawString());
        }
        intent.putExtra("displayname", A032);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen0742);
        Bitmap bitmap = null;
        if (z2 && (bitmap = this.A07.A00(context, r9, yo.setSQPC(context.getResources().getDimension(R.dimen.dimen0748)), dimensionPixelSize)) == null) {
            C17160ud r3 = this.A04;
            bitmap = r3.A03(r3.A01.A00, r3.A01(r9));
            if (!(bitmap.getWidth() == dimensionPixelSize && bitmap.getHeight() == dimensionPixelSize)) {
                bitmap = Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, true);
            }
        }
        AnonymousClass22U.A01(intent, "ShortcutIntentHelper");
        C15830rv r03 = r9.A0E;
        AnonymousClass00B.A06(r03);
        AnonymousClass04R r32 = new AnonymousClass04R(context, r03.getRawString());
        Intent[] intentArr = {intent};
        AnonymousClass04S r2 = r32.A00;
        r2.A0P = intentArr;
        r2.A0B = A032;
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.A06 = bitmap;
            r2.A09 = iconCompat;
        }
        return r32.A00();
    }

    public void A01() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            Log.i("WaShortcutsHelper/deletealldynamicshortcuts");
            Context context = this.A08.A00;
            AnonymousClass04T.A05(context);
            if (i2 >= 30) {
                Log.i("WaShortcutsHelper/deleteallcachedshortcuts");
                AnonymousClass2EA.A09(context);
            }
        }
    }

    public void A02() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.A0G.Acm(new RunnableRunnableShape2S0100000_I0_1(this, 25), "WaShortcutsHelper/updateAppShortcuts");
        }
    }

    public void A03(Context context, C16010sH r8) {
        if (Build.VERSION.SDK_INT >= 30) {
            Log.i("WaShortcutsHelper/publishShortcut");
            AnonymousClass2EA.A0F(context, this.A04, this.A05, this.A06, this.A07, r8);
        }
    }

    public void A04(C16010sH r5) {
        Context context = this.A08.A00;
        AnonymousClass04S A002 = A00(r5, true, false);
        if (AnonymousClass04T.A08(context)) {
            AnonymousClass04T.A06(context, A002);
            if (Build.VERSION.SDK_INT >= 26) {
                return;
            }
        } else {
            Intent A012 = AnonymousClass04T.A01(context, A002);
            A012.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
            context.sendBroadcast(A012);
        }
        this.A01.A09(R.string.str05d4, 1);
    }

    public void A05(C16010sH r4) {
        Context context = this.A08.A00;
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass2EA.A0G(context, r4);
            return;
        }
        Intent A012 = AnonymousClass04T.A01(context, A00(r4, false, false));
        A012.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
        context.sendBroadcast(A012);
    }

    public void A06(C15830rv r3) {
        if (Build.VERSION.SDK_INT >= 30) {
            Log.i("WaShortcutsHelper/removeShortcutFromCache");
            AnonymousClass2EA.A0H(this.A08.A00, r3);
        }
    }

    public String AGT() {
        return "WaShortcutsHelper";
    }

    public void AMc() {
        if (Build.VERSION.SDK_INT >= 23) {
            C16900tq r0 = this.A0F;
            r0.A04();
            if (r0.A01) {
                C16040sK r02 = this.A02;
                r02.A0B();
                if (r02.A05 != null) {
                    C15860rz r03 = this.A0A;
                    if (((SharedPreferences) r03.A01.get()).getInt("sharing_shortcuts_version", 0) != 1) {
                        Context context = this.A08.A00;
                        C16300so r4 = this.A00;
                        C15810rt r11 = this.A0B;
                        C17160ud r6 = this.A04;
                        C16000sG r7 = this.A05;
                        C16080sP r8 = this.A06;
                        AnonymousClass2EA.A0D(context, r4, this.A03, r6, r7, r8, this.A07, this.A09, r11, this.A0C, this.A0D, this.A0E);
                        r03.A0K().putInt("sharing_shortcuts_version", 1).apply();
                    }
                }
            }
        }
    }
}
