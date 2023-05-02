package X;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.R;
import com.obwhatsapp.bloks.ui.BloksDialogFragment;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.5hA  reason: invalid class name and case insensitive filesystem */
public abstract class C111675hA extends C111335g1 implements AnonymousClass69L, AnonymousClass68C {
    public AnonymousClass2ZU A00;
    public C118045ty A01;
    public C119195wh A02;
    public AnonymousClass68D A03;
    public C116565ra A04;
    public BloksDialogFragment A05;
    public AnonymousClass1MQ A06;
    public C16490t9 A07;
    public Map A08;
    public final C119275wp A09 = new C119275wp();

    public static void A03(Intent intent, String str, String str2) {
        Serializable serializableExtra = intent.getSerializableExtra("screen_params");
        HashMap A0x = serializableExtra == null ? AnonymousClass000.A0x() : (HashMap) serializableExtra;
        A0x.put(str, str2);
        intent.putExtra("screen_params", A0x);
    }

    public AnonymousClass68D A35() {
        C116565ra r2 = this.A04;
        C119275wp r1 = this.A09;
        C16440t3 r10 = this.A05;
        C16300so r4 = this.A03;
        C14870pt r5 = this.A05;
        C16040sK r6 = this.A01;
        C16490t9 r12 = this.A07;
        AnonymousClass01V r9 = this.A08;
        AnonymousClass013 r11 = this.A01;
        C119905zo r0 = new C119905zo(r1, new C119885zm(r4, r5, r6, this.A01, this.A02, r9, r10, r11, r12), r2);
        r2.A00 = r0;
        return r0;
    }

    public void A36() {
        String str = C115085p5.A00;
        if (str == null) {
            str = getIntent().getStringExtra("screen_name");
        }
        if (!TextUtils.isEmpty(str)) {
            this.A05 = BloksDialogFragment.A01(str, C115085p5.A01);
            AnonymousClass050 r2 = new AnonymousClass050(AGM());
            r2.A0A(this.A05, R.id.bloks_fragment_container);
            r2.A01();
        }
    }

    public void onBackPressed() {
        C119275wp r5 = this.A09;
        HashMap hashMap = r5.A01;
        AnonymousClass1Z7 r1 = (AnonymousClass1Z7) hashMap.get("backpress");
        if (r1 != null) {
            r1.A00("on_success");
            return;
        }
        AnonymousClass02C AGM = AGM();
        if (AGM.A04() <= 1) {
            setResult(0, C807545j.A00(getIntent()));
            C115085p5.A00 = null;
            C115085p5.A01 = null;
            finish();
            return;
        }
        AGM.A0I();
        AGM.A0m(true);
        AGM.A0K();
        C119275wp.A00(hashMap);
        Stack stack = r5.A02;
        stack.pop();
        AnonymousClass02C AGM2 = AGM();
        this.A05 = BloksDialogFragment.A01(((AnonymousClass050) ((AnonymousClass052) AGM2.A0E.get(AGM2.A04() - 1))).A0A, (HashMap) stack.peek());
        AnonymousClass050 r2 = new AnonymousClass050(AGM);
        r2.A0A(this.A05, R.id.bloks_fragment_container);
        r2.A01();
    }

    public void onCreate(Bundle bundle) {
        Serializable serializableExtra = getIntent().getSerializableExtra("screen_params");
        C119275wp r2 = this.A09;
        C119275wp.A00(r2.A01);
        r2.A02.add(AnonymousClass000.A0x());
        if (serializableExtra != null) {
            r2.A02((Map) serializableExtra);
        }
        super.onCreate(bundle);
        try {
            C31131dW.A00(getApplicationContext());
        } catch (IOException unused) {
        }
        setContentView((int) R.layout.layout0036);
        Toolbar A092 = C110105dW.A09(this);
        A092.A07();
        Aem(A092);
        C005402i x2 = x();
        if (x2 != null) {
            C110115dX.A0u(x2, "");
        }
        C447725m A002 = C447725m.A00(this, this.A01, R.drawable.ic_back);
        A002.setColorFilter(getResources().getColor(R.color.color04ef), PorterDuff.Mode.SRC_ATOP);
        A092.setNavigationIcon((Drawable) A002);
        A092.setNavigationOnClickListener(C110115dX.A06(this, 0));
    }

    public void onDestroy() {
        super.onDestroy();
        C119275wp r2 = this.A09;
        Iterator it = r2.A02.iterator();
        while (it.hasNext()) {
            ((Map) it.next()).clear();
        }
        C119275wp.A00(r2.A01);
        r2.A00.A01.clear();
    }

    public void onPause() {
        super.onPause();
        this.A09.A03(false);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C119275wp r2 = this.A09;
        ArrayList arrayList = (ArrayList) bundle.getSerializable("screen_manager_saved_state");
        if (arrayList != null) {
            Stack stack = r2.A02;
            stack.clear();
            stack.addAll(arrayList);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A03 == null) {
            this.A03 = A35();
        }
        this.A06.A00(getApplicationContext(), this.A03.A9W(), C110115dX.A0A(this, AGM(), this.A00, this.A08));
        this.A09.A03(true);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Stack stack = this.A09.A02;
        if (!stack.isEmpty()) {
            ArrayList A0i = C13690nt.A0i(stack.size());
            Iterator it = stack.iterator();
            while (it.hasNext()) {
                A0i.add(new HashMap((Map) it.next()));
            }
            bundle.putSerializable("screen_manager_saved_state", A0i);
        }
    }
}
