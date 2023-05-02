package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.MediaComposerFragment;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerView;
import com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2Ur  reason: invalid class name */
public class AnonymousClass2Ur {
    public float A00;
    public int A01;
    public C78403xz A02;
    public AnonymousClass2X5 A03;
    public boolean A04;
    public final Activity A05;
    public final HandlerThread A06;
    public final View A07;
    public final View A08;
    public final ViewGroup A09;
    public final C001300o A0A;
    public final AnonymousClass013 A0B;
    public final C17250um A0C;
    public final C14710pd A0D;
    public final MediaComposerFragment A0E;
    public final C26211Mt A0F;
    public final C26221Mu A0G;
    public final AnonymousClass4EX A0H = new AnonymousClass4EX(this);
    public final C456229t A0I;
    public final AnonymousClass2VF A0J;
    public final C63883Lw A0K;
    public final C63893Lx A0L;
    public final AnonymousClass2VB A0M;
    public final AnonymousClass2Ut A0N;
    public final AnonymousClass2X3 A0O;
    public final C57302qs A0P;
    public final ShapePickerRecyclerView A0Q;
    public final ShapePickerView A0R;
    public final AnonymousClass1PJ A0S;
    public final AnonymousClass335 A0T;
    public final AnonymousClass334 A0U;
    public final AnonymousClass1MF A0V;
    public final C41781we A0W = new IDxSObserverShape99S0100000_1_I0(this, 0);
    public final AnonymousClass14W A0X;
    public final C23061Ai A0Y;
    public final AnonymousClass2OJ A0Z = new AnonymousClass2OJ(Boolean.FALSE);
    public final C16320sq A0a;
    public final Map A0b = new HashMap();
    public final Map A0c = new HashMap();
    public final Set A0d = new LinkedHashSet();
    public final ConcurrentHashMap A0e = new ConcurrentHashMap();
    public final ConcurrentHashMap A0f = new ConcurrentHashMap();
    public final ConcurrentHashMap A0g;

    public AnonymousClass2Ur(Activity activity, ViewGroup viewGroup, C001300o r26, C001500q r27, AnonymousClass013 r28, C17250um r29, C14710pd r30, MediaComposerFragment mediaComposerFragment, C26211Mt r32, C26221Mu r33, C456229t r34, ShapePickerView shapePickerView, AnonymousClass1PJ r36, AnonymousClass1MF r37, AnonymousClass14W r38, AnonymousClass1CX r39, C23061Ai r40, C16320sq r41) {
        Activity activity2 = activity;
        this.A05 = activity2;
        this.A0D = r30;
        C23061Ai r10 = r40;
        this.A0Y = r10;
        C16320sq r2 = r41;
        this.A0a = r2;
        this.A0C = r29;
        C26211Mt r13 = r32;
        this.A0F = r13;
        AnonymousClass013 r22 = r28;
        this.A0B = r22;
        AnonymousClass14W r6 = r38;
        this.A0X = r6;
        AnonymousClass1PJ r21 = r36;
        this.A0S = r21;
        this.A0G = r33;
        this.A0V = r37;
        C001300o r9 = r26;
        this.A0A = r9;
        this.A0I = r34;
        this.A09 = viewGroup;
        this.A0E = mediaComposerFragment;
        C001500q r11 = r27;
        this.A0P = (C57302qs) new C006602z((AnonymousClass04o) new C95164mC(), r11).A01(C57302qs.class);
        this.A0O = (AnonymousClass2X3) new C006602z((AnonymousClass04o) new C95164mC(), r11).A01(AnonymousClass2X3.class);
        AnonymousClass2VF r1 = new AnonymousClass2VF(this);
        this.A0J = r1;
        ShapePickerView shapePickerView2 = shapePickerView;
        this.A0R = shapePickerView2;
        this.A08 = C004601z.A0E(shapePickerView2, R.id.shape_picker_gradient);
        this.A07 = C004601z.A0E(shapePickerView2, R.id.shape_picker_header);
        ShapePickerRecyclerView shapePickerRecyclerView = (ShapePickerRecyclerView) C004601z.A0E(shapePickerView2, R.id.shapes);
        this.A0Q = shapePickerRecyclerView;
        shapePickerRecyclerView.setAdapter(r1);
        List<AnonymousClass2V1> A002 = AnonymousClass4Z2.A00();
        this.A0g = new ConcurrentHashMap();
        for (AnonymousClass2V1 r12 : A002) {
            this.A0g.put(r12.AGT(), r12);
        }
        this.A0T = new AnonymousClass335((RecyclerView) shapePickerView2.findViewById(R.id.emoji_shape_subcategories_recyclerview), this.A0H, this.A0Q);
        AnonymousClass1CX r15 = r39;
        AnonymousClass334 r14 = new AnonymousClass334((RecyclerView) shapePickerView2.findViewById(R.id.sticker_shape_subcategories_recyclerview), this.A0H, this.A0Q, r15);
        this.A0U = r14;
        this.A03 = r14;
        r14.A01 = true;
        r14.A01();
        AnonymousClass2VB r16 = new AnonymousClass2VB(this.A05, this);
        this.A0M = r16;
        this.A0Q.A0o(r16);
        this.A0Q.setItemAnimator((C005502j) null);
        this.A0P.A01.A0A(r9, new IDxObserverShape115S0100000_2_I0((Object) this, 195));
        this.A0P.A00.A0A(r9, new IDxObserverShape115S0100000_2_I0((Object) this, 193));
        this.A0P.A02.A0A(r9, new IDxObserverShape113S0100000_1_I0(this, 51));
        C57302qs r0 = this.A0P;
        C78403xz r152 = new C78403xz(r0.A01, r0.A02, r0.A00, r13, r15);
        this.A02 = r152;
        r152.A00 = this.A0P;
        r2.Ack(r152, new Void[0]);
        this.A0O.A03.A0A(r9, new IDxObserverShape113S0100000_1_I0(this, 50));
        this.A0O.A01.A0A(r9, new IDxObserverShape115S0100000_2_I0((Object) this, 194));
        this.A0O.A02.A0A(r9, new IDxObserverShape115S0100000_2_I0((Object) this, 198));
        this.A0O.A00.A0A(r9, new IDxObserverShape115S0100000_2_I0((Object) this, 197));
        this.A0N = new AnonymousClass2Ut(activity2, this.A07, r9, r11, r22, r21, r10, this.A0Z);
        this.A0Z.A0A(r9, new IDxObserverShape115S0100000_2_I0((Object) this, 196));
        shapePickerView2.findViewById(R.id.shape_picker_header_background).setVisibility(0);
        this.A08.setVisibility(8);
        this.A0Q.setClipToPadding(true);
        this.A0Q.A0m(new AnonymousClass3RL(this, this.A05.getResources().getDimensionPixelSize(R.dimen.dimen0730), this.A05.getResources().getDimensionPixelSize(R.dimen.dimen072d), r22.A0T()));
        r6.A02(this.A0W);
        HandlerThread handlerThread = new HandlerThread("Shapes Thread", 1);
        this.A06 = handlerThread;
        handlerThread.start();
        this.A0L = new C63893Lx(activity2, handlerThread.getLooper(), this);
        this.A0K = new C63883Lw(activity2, activity2.getMainLooper(), this);
        int dimensionPixelSize = this.A05.getResources().getDimensionPixelSize(R.dimen.dimen0336);
        for (int min = Math.min(((this.A05.getResources().getDisplayMetrics().widthPixels * this.A05.getResources().getDisplayMetrics().heightPixels) / (dimensionPixelSize * dimensionPixelSize)) + 1, A002.size() - 1); min >= 0; min--) {
            Message obtain = Message.obtain(this.A0L, 0, 0, 0, (Object) null);
            obtain.setData(A00(((AnonymousClass2V1) A002.get(min)).AGT()));
            obtain.sendToTarget();
        }
    }

    public static final Bundle A00(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("tag_bundle_key", str);
        return bundle;
    }

    public static /* synthetic */ AnonymousClass4IG A01(Context context, AnonymousClass2Ur r11, String str) {
        C455829l A7b;
        AnonymousClass4IG r0;
        Reference reference = (Reference) r11.A0e.get(str);
        if (reference != null && (r0 = (AnonymousClass4IG) reference.get()) != null) {
            return r0;
        }
        ConcurrentHashMap concurrentHashMap = r11.A0f;
        Reference reference2 = (Reference) concurrentHashMap.get(str);
        if (reference2 == null || (A7b = (C455829l) reference2.get()) == null) {
            AnonymousClass2V1 r2 = (AnonymousClass2V1) r11.A0g.get(str);
            if (r2 == null) {
                return null;
            }
            A7b = r2.A7b(context, r11.A0B, true);
            concurrentHashMap.put(str, new SoftReference(A7b));
        }
        String A0H2 = A7b.A0H(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen0722);
        if (A7b.A0J()) {
            A7b.A09(r11.A01);
        }
        if (A7b.A0K()) {
            A7b.A0O(r11.A00);
        }
        Drawable A0F2 = A7b.A0F();
        if (A0F2 == null) {
            float f2 = (float) dimensionPixelSize;
            A7b.A0Q(new RectF(), 0.0f, 0.0f, f2, f2);
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            A7b.A0P(new Canvas(createBitmap));
            A0F2 = new BitmapDrawable(context.getResources(), createBitmap);
        }
        return new AnonymousClass4IG(A0F2, A0H2);
    }

    public static final String A02(Bundle bundle) {
        String string = bundle.getString("tag_bundle_key");
        AnonymousClass00B.A06(string);
        return string;
    }

    public final void A03(C37771pi r6) {
        ArrayList arrayList = new ArrayList();
        for (C34151jm r2 : r6.A04) {
            arrayList.add(new C102814zZ(r2, this.A0V));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C102814zZ r22 = (C102814zZ) it.next();
            this.A0g.put(r22.AGT(), r22);
        }
        Map map = this.A0b;
        String str = r6.A0F;
        map.put(str, r6);
        this.A0c.put(str, arrayList);
    }

    public final void A04(Collection collection, boolean z2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C102814zZ r2 = new C102814zZ((C34151jm) it.next(), this.A0V);
            this.A0g.put(r2.AGT(), r2);
            linkedHashSet.add(r2);
        }
        if (z2) {
            Set set = this.A0d;
            linkedHashSet.addAll(set);
            set.clear();
        }
        Set<AnonymousClass2V1> set2 = this.A0d;
        set2.addAll(linkedHashSet);
        C26221Mu r3 = this.A0G;
        synchronized (r3) {
            Map map = r3.A03;
            map.clear();
            for (AnonymousClass2V1 A002 : set2) {
                C26221Mu.A00(A002, map);
            }
        }
    }
}
