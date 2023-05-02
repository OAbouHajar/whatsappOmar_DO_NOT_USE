package X;

import android.app.Activity;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.bloks.ui.BloksDialogFragment;
import java.util.HashMap;
import java.util.Stack;

/* renamed from: X.5zm  reason: invalid class name and case insensitive filesystem */
public class C119885zm implements C1223269d {
    public final C16300so A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C118045ty A03;
    public final C119195wh A04;
    public final AnonymousClass01V A05;
    public final C16440t3 A06;
    public final AnonymousClass013 A07;
    public final C16490t9 A08;

    public C119885zm(C16300so r1, C14870pt r2, C16040sK r3, C118045ty r4, C119195wh r5, AnonymousClass01V r6, C16440t3 r7, AnonymousClass013 r8, C16490t9 r9) {
        this.A06 = r7;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A08 = r9;
        this.A07 = r8;
        this.A05 = r6;
        this.A04 = r5;
        this.A03 = r4;
    }

    public static void A00(Activity activity, C119275wp r8, AnonymousClass1Z6 r9, HashMap hashMap) {
        AnonymousClass68C r6 = (AnonymousClass68C) activity;
        Object remove = hashMap.remove("clear_backstack");
        Object remove2 = hashMap.remove("get_params_from_stack");
        Object remove3 = hashMap.remove("camera_permission");
        Stack stack = r8.A02;
        HashMap hashMap2 = new HashMap((HashMap) stack.peek());
        if (remove2 != null) {
            hashMap2.putAll(hashMap);
            hashMap = hashMap2;
        }
        if (remove != null) {
            AnonymousClass02C AGM = ((C001000l) r6).AGM();
            for (int i2 = 0; i2 < AGM.A04(); i2++) {
                AGM.A0I();
                C119275wp.A00(r8.A01);
                stack.pop();
            }
        }
        C119275wp.A00(r8.A01);
        stack.add(AnonymousClass000.A0x());
        r8.A02(hashMap);
        C14930q1 r2 = r9.A01;
        if (r2 != null) {
            r8.A01(r9.A00, r2, "backpress");
        }
        if (remove3 != null) {
            C112855jo r7 = (C112855jo) ((AnonymousClass69L) activity);
            RequestPermissionActivity.A0T(r7, r7.A03, 30);
        }
    }

    public static void A01(AnonymousClass22A r2, C111675hA r3, String str, HashMap hashMap) {
        r3.A05 = BloksDialogFragment.A01(str, hashMap);
        AnonymousClass050 r22 = new AnonymousClass050((AnonymousClass02C) r2.A07.get());
        r22.A0A(r3.A05, R.id.bloks_fragment_container);
        r22.A0I(str);
        r22.A01();
    }

    public void Aa3(Activity activity, AnonymousClass1Z6 r5, AnonymousClass22A r6, String str, HashMap hashMap) {
        C115085p5.A00 = str;
        C115085p5.A01 = hashMap;
        AnonymousClass68C r2 = (AnonymousClass68C) activity;
        Bundle extras = r2.getIntent().getExtras();
        if (extras != null) {
            extras.putString("screen_name", str);
        }
        C111675hA r22 = (C111675hA) r2;
        A00(activity, r22.A09, r5, hashMap);
        A01(r6, r22, str, hashMap);
    }

    public void Aa4(Activity activity, AnonymousClass1Z6 r5, AnonymousClass22A r6, String str, HashMap hashMap) {
        C115085p5.A00 = str;
        C115085p5.A01 = hashMap;
        AnonymousClass68C r2 = (AnonymousClass68C) activity;
        Bundle extras = r2.getIntent().getExtras();
        if (extras != null) {
            extras.putString("screen_name", str);
        }
        C111675hA r22 = (C111675hA) r2;
        A00(activity, r22.A09, r5, hashMap);
        A01(r6, r22, str, hashMap);
    }
}
