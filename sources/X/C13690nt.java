package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape133S0100000_2_I1;
import com.facebook.redex.IDxComparatorShape20S0000000_2_I1;
import com.facebook.redex.IDxLAdapterShape4S0100000_2_I1;
import com.facebook.redex.IDxObserverShape114S0100000_1_I1;
import com.facebook.redex.IDxUListenerShape141S0100000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape3S0300000_I1;
import com.facebook.redex.ViewOnClickCListenerShape7S0200000_I1_2;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzfb;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0nt  reason: invalid class name and case insensitive filesystem */
public final class C13690nt {
    public static int A00(int i2) {
        return i2 != 0 ? 2 : 1;
    }

    public static int A01(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getInt(str, 0);
    }

    public static int A02(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    public static int A03(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.dimen06a8);
    }

    public static int A04(View view) {
        return view.getWidth() - view.getPaddingRight();
    }

    public static int A05(View view, int i2) {
        return (i2 - view.getPaddingLeft()) - view.getPaddingRight();
    }

    public static int A06(View view, int i2, int i3) {
        return Math.max((i2 - view.getMeasuredWidth()) >> 1, i3);
    }

    public static int A07(boolean z2) {
        return z2 ? 0 : 8;
    }

    public static long A08(int i2) {
        return ((long) i2) * 1000;
    }

    public static long A09(long j2) {
        return j2 / 1000;
    }

    public static long A0A(List list, int i2) {
        return ((Number) list.get(i2)).longValue();
    }

    public static Intent A0B(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri);
    }

    public static Drawable A0C(Context context, int i2) {
        Drawable A04 = AnonymousClass00T.A04(context, i2);
        AnonymousClass00B.A06(A04);
        return A04;
    }

    public static Bundle A0D() {
        return new Bundle();
    }

    public static Bundle A0E(Activity activity) {
        return activity.getIntent().getExtras();
    }

    public static SpannableStringBuilder A0F(CharSequence charSequence) {
        return new SpannableStringBuilder(charSequence);
    }

    public static ForegroundColorSpan A0G(Context context, int i2) {
        return new ForegroundColorSpan(AnonymousClass00T.A00(context, i2));
    }

    public static DisplayMetrics A0H(View view) {
        return view.getResources().getDisplayMetrics();
    }

    public static Pair A0I(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public static View A0J(Activity activity) {
        return activity.getWindow().getDecorView();
    }

    public static ViewGroup A0K(View view, int i2) {
        return (ViewGroup) view.findViewById(i2);
    }

    public static ViewPropertyAnimator A0L(ViewPropertyAnimator viewPropertyAnimator) {
        return viewPropertyAnimator.scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f);
    }

    public static FrameLayout.LayoutParams A0M() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    public static C005402i A0N(C000900k r0) {
        C005402i x2 = r0.x();
        AnonymousClass00B.A06(x2);
        return x2;
    }

    public static AnonymousClass027 A0O() {
        return new AnonymousClass027();
    }

    public static zzfb A0P(zzbr zzbr) {
        zzbv zzbv = zzbr.zza;
        zzbv.zzs(zzbv.zzf);
        return zzbv.zzf;
    }

    public static C31201dg A0Q(List list, int i2) {
        return (C31201dg) list.get(i2);
    }

    public static WaImageView A0R(View view, int i2) {
        return (WaImageView) C004601z.A0E(view, i2);
    }

    public static C28371Vv A0S(Iterator it) {
        return (C28371Vv) it.next();
    }

    public static Integer A0T() {
        return 4;
    }

    public static Integer A0U() {
        return 5;
    }

    public static Integer A0V(Object obj, Object obj2, Map map) {
        map.clear();
        map.put(10, obj);
        map.put(obj2, obj);
        return 10;
    }

    public static Long A0W(int i2) {
        return Long.valueOf((long) i2);
    }

    public static Long A0X(Number number) {
        return Long.valueOf(number.longValue() + 1);
    }

    public static Object A0Y() {
        return new Object();
    }

    public static Object A0Z(List list) {
        return list.get(0);
    }

    public static Object A0a(List list, int i2) {
        return ((Pair) list.get(i2)).first;
    }

    public static String A0b(TextView textView) {
        return textView.getText().toString();
    }

    public static String A0c(AnonymousClass01A r0, Object obj, Object[] objArr, int i2, int i3) {
        objArr[i2] = obj;
        return r0.A0K(i3, objArr);
    }

    public static String A0d(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static String A0e(Object obj, Map map) {
        return (String) map.get(obj);
    }

    public static String A0f(Map.Entry entry) {
        return (String) entry.getKey();
    }

    public static StringBuilder A0g(int i2) {
        return new StringBuilder(i2);
    }

    public static WeakReference A0h(Object obj) {
        return new WeakReference(obj);
    }

    public static ArrayList A0i(int i2) {
        return new ArrayList(i2);
    }

    public static Iterator A0j(AbstractMap abstractMap) {
        return abstractMap.entrySet().iterator();
    }

    public static List A0k(AnonymousClass028 r0) {
        return (List) r0.A01();
    }

    public static List A0l(List list, int i2) {
        return (List) list.get(i2);
    }

    public static Locale A0m(AnonymousClass013 r0) {
        return AnonymousClass013.A00(r0.A00);
    }

    public static void A0n(int i2, Paint paint) {
        paint.setColor(i2);
        paint.setStyle(Paint.Style.FILL);
    }

    public static void A0o(Animator animator, Object obj, int i2) {
        animator.addListener(new IDxLAdapterShape4S0100000_2_I1(obj, i2));
    }

    public static void A0p(ValueAnimator valueAnimator, Object obj, int i2) {
        valueAnimator.addUpdateListener(new IDxUListenerShape141S0100000_2_I1(obj, i2));
    }

    public static void A0q(Activity activity) {
        activity.setResult(-1);
        activity.finish();
    }

    public static void A0r(Context context, Paint paint, int i2) {
        paint.setColor(AnonymousClass00T.A00(context, i2));
    }

    public static void A0s(Context context, TextView textView, int i2) {
        textView.setText(context.getString(i2));
    }

    public static void A0t(Context context, String str, StringBuilder sb, int i2) {
        sb.append(context.getString(i2));
        sb.append(str);
    }

    public static void A0u(Intent intent, View view) {
        view.getContext().startActivity(intent);
    }

    public static void A0v(SharedPreferences.Editor editor, String str) {
        editor.remove(str).apply();
    }

    public static void A0w(Resources resources, TextView textView, int i2) {
        int color = resources.getColor(i2);
    }

    public static void A0x(Canvas canvas, RectF rectF, float f2) {
        canvas.rotate(f2, rectF.centerX(), rectF.centerY());
    }

    public static void A0y(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void A0z(Path path, View view, int i2) {
        path.lineTo((float) i2, (float) ((view.getHeight() * 9) / 10));
    }

    public static void A10(PowerManager.WakeLock wakeLock) {
        if (wakeLock != null && wakeLock.isHeld()) {
            Log.i("ExportFlowManager/onStartCommand/wakelock released");
            wakeLock.release();
        }
    }

    public static void A11(View view, int i2) {
        view.findViewById(i2).setVisibility(8);
    }

    public static void A12(View view, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public static void A13(View view, int i2, int i3) {
        view.findViewById(i2).setVisibility(i3);
    }

    public static void A14(View view, View view2, View view3, int i2) {
        view.setVisibility(i2);
        view2.setVisibility(i2);
        view3.setVisibility(i2);
    }

    public static void A15(View view, ViewGroup viewGroup) {
        viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    public static void A16(View view, AnonymousClass01A r3) {
        view.setBackground(new ColorDrawable(AnonymousClass00T.A00(r3.A02(), R.color.color0547)));
    }

    public static void A17(View view, C005502j r2, C005602k r3) {
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        r2.A03(r3);
    }

    public static void A18(View view, C005502j r2, C005602k r3) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        r2.A03(r3);
    }

    public static void A19(View view, Object obj, int i2) {
        view.setOnClickListener(new IDxCListenerShape133S0100000_2_I1(obj, i2));
    }

    public static void A1A(View view, Object obj, Object obj2, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape7S0200000_I1_2(obj, i2, obj2));
    }

    public static void A1B(View view, Object obj, Object obj2, Object obj3, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape3S0300000_I1(obj, obj2, obj3, i2));
    }

    public static void A1C(TextView textView) {
        textView.setAutoLinkMask(0);
        textView.setLinksClickable(false);
        textView.setFocusable(false);
        textView.setClickable(false);
        textView.setLongClickable(false);
    }

    public static void A1D(TextView textView, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public static void A1E(C005302h r2) {
        r2.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
    }

    public static void A1F(C005302h r2) {
        r2.setPositiveButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
    }

    public static void A1G(C005302h r0) {
        r0.create().show();
    }

    public static void A1H(C005302h r1, Object obj, int i2, int i3) {
        r1.setNegativeButton(i3, new IDxCListenerShape128S0100000_2_I1(obj, i2));
    }

    public static void A1I(C000900k r0, int i2) {
        r0.findViewById(i2).setVisibility(8);
    }

    public static void A1J(C001300o r1, AnonymousClass028 r2, Object obj, int i2) {
        r2.A0A(r1, new IDxObserverShape114S0100000_1_I1(obj, i2));
    }

    public static void A1K(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public static void A1L(Object obj, Object obj2, Object[] objArr) {
        objArr[0] = obj;
        objArr[1] = obj2;
    }

    public static void A1M(Object obj, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(obj);
    }

    public static void A1N(String str, StringBuilder sb, int i2, int i3) {
        sb.append(i2);
        sb.append(str);
        sb.append(i3);
    }

    public static void A1O(AbstractCollection abstractCollection, int i2) {
        abstractCollection.add(Integer.valueOf(i2));
    }

    public static void A1P(List list, int i2) {
        Collections.sort(list, new IDxComparatorShape20S0000000_2_I1(i2));
    }

    public static void A1Q(Object[] objArr, int i2, long j2) {
        objArr[i2] = Long.valueOf(j2);
    }

    public static boolean A1R(int i2) {
        return i2 == 1;
    }

    public static boolean A1S(Object obj, boolean z2) {
        return obj.equals(Boolean.valueOf(z2));
    }

    public static boolean A1T(Throwable th) {
        return th.getMessage().contains("No space");
    }

    public static boolean A1U(Calendar calendar) {
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        return false;
    }

    public static boolean A1V(Set set, int i2) {
        return set.contains(Integer.valueOf(i2));
    }

    public static boolean A1W(Object[] objArr, int i2) {
        objArr[0] = Integer.valueOf(i2);
        return false;
    }

    public static byte[] A1X(Bitmap bitmap, ByteArrayOutputStream byteArrayOutputStream) {
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static float[] A1Y(C005902n r1) {
        C005902n.A00(r1, 2);
        return r1.A01;
    }

    public static Object[] A1Z() {
        return new Object[2];
    }

    public static Object[] A1a(AbstractList abstractList, int i2) {
        Object[] objArr = new Object[i2];
        objArr[0] = abstractList.get(0);
        objArr[1] = abstractList.get(1);
        return objArr;
    }

    public static String[] A1b(Object obj, Object obj2, int i2) {
        String[] strArr = new String[i2];
        strArr[0] = obj;
        strArr[1] = obj2;
        return strArr;
    }
}
