package X;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2hV  reason: invalid class name and case insensitive filesystem */
public final class C54432hV extends C16690tT {
    public final C16980tz A00;
    public final C15220qW A01;
    public final C15220qW A02 = new AnonymousClass1DV(new AnonymousClass5EP(this));
    public final C15220qW A03 = new AnonymousClass1DV(new AnonymousClass5EQ(this));
    public final AnonymousClass22J A04;

    public C54432hV(C001300o r3, C16980tz r4, AnonymousClass22J r5, int i2) {
        super(r3, true);
        this.A00 = r4;
        this.A04 = r5;
        this.A01 = new AnonymousClass1DV(new AnonymousClass5EO(i2));
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C15220qW r8 = this.A02;
        Object value = r8.getValue();
        C18450wi.A0B(value);
        C15220qW r7 = this.A01;
        List<ResolveInfo> queryIntentActivities = ((PackageManager) value).queryIntentActivities((Intent) r7.getValue(), 0);
        C18450wi.A0B(queryIntentActivities);
        ArrayList arrayList = new ArrayList();
        for (T next : queryIntentActivities) {
            if (((ResolveInfo) next).activityInfo.exported) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return C440222l.A00;
        }
        Drawable A042 = AnonymousClass00T.A04(this.A00.A00, R.mipmap.icon);
        if (A042 == null) {
            throw new NullPointerException("Icon is NULL");
        }
        int intrinsicHeight = A042.getIntrinsicHeight();
        ArrayList arrayList2 = new ArrayList(AnonymousClass1J9.A0M(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            Object value2 = r8.getValue();
            C18450wi.A0B(value2);
            arrayList2.add(new C25401Jq(resolveInfo, resolveInfo.loadIcon((PackageManager) value2)));
        }
        ArrayList arrayList3 = new ArrayList(AnonymousClass1J9.A0M(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(((Drawable) ((C25401Jq) it2.next()).second).getIntrinsicHeight()));
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            intrinsicHeight = Math.min(intrinsicHeight, ((Number) it3.next()).intValue());
        }
        ArrayList arrayList4 = new ArrayList(AnonymousClass1J9.A0M(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            C25401Jq r10 = (C25401Jq) it4.next();
            Intent intent = (Intent) r7.getValue();
            ActivityInfo activityInfo = ((ResolveInfo) r10.first).activityInfo;
            C18450wi.A0A(activityInfo);
            Object value3 = this.A03.getValue();
            C18450wi.A0B(value3);
            Resources resources = (Resources) value3;
            Drawable drawable = (Drawable) r10.second;
            if (drawable instanceof BitmapDrawable) {
                drawable = new BitmapDrawable(resources, Bitmap.createScaledBitmap(((BitmapDrawable) drawable).getBitmap(), intrinsicHeight, intrinsicHeight, false));
            }
            C18450wi.A0B(drawable);
            Object value4 = r8.getValue();
            C18450wi.A0B(value4);
            CharSequence loadLabel = ((ResolveInfo) r10.first).loadLabel((PackageManager) value4);
            C18450wi.A0B(loadLabel);
            arrayList4.add(new C84364Kg(intent, activityInfo, drawable, loadLabel));
        }
        return arrayList4;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C18450wi.A0H(obj, 0);
        this.A04.AIU(obj);
    }
}
