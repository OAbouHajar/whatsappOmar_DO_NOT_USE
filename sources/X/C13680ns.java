package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.location.Location;
import android.net.Uri;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.msys.mci.DataTask;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NetworkUtils;
import com.facebook.msys.mci.UrlRequest;
import com.facebook.redex.IDxAListenerShape121S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxObserverShape114S0100000_1_I1;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape15S0100000_I1;
import com.facebook.redex.ViewOnClickCListenerShape16S0100000_I1_1;
import com.facebook.redex.ViewOnClickCListenerShape17S0100000_I1_2;
import com.facebook.redex.ViewOnClickCListenerShape18S0100000_I1_3;
import com.facebook.redex.ViewOnClickCListenerShape19S0100000_I1_4;
import com.facebook.redex.ViewOnClickCListenerShape20S0100000_I1_5;
import com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1;
import com.facebook.redex.ViewOnClickCListenerShape6S0200000_I1_1;
import com.google.android.material.tabs.TabLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.obwhatsapp.userban.ui.viewmodel.BanAppealViewModel;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0ns  reason: invalid class name and case insensitive filesystem */
public final class C13680ns {
    public static double A00(AtomicLong atomicLong, AtomicLong atomicLong2) {
        return (((double) atomicLong.get()) * 100.0d) / ((double) atomicLong2.get());
    }

    public static float A01(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int A02(int i2) {
        return i2 != 0 ? 0 : 8;
    }

    public static int A03(View view) {
        return (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
    }

    public static int A04(View view) {
        return (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
    }

    public static int A05(View view, float f2) {
        return (int) TypedValue.applyDimension(1, f2, view.getResources().getDisplayMetrics());
    }

    public static int A06(Object obj) {
        return String.valueOf(obj).length();
    }

    public static int A07(List list) {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public static long A08(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getLong(str, 0);
    }

    public static Intent A09() {
        return new Intent();
    }

    public static Intent A0A(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    public static SharedPreferences A0B(C15860rz r0) {
        return (SharedPreferences) r0.A01.get();
    }

    public static SharedPreferences A0C(AnonymousClass01D r0) {
        return (SharedPreferences) r0.get();
    }

    public static Resources A0D(View view) {
        return view.getContext().getResources();
    }

    public static Paint A0E() {
        return new Paint(1);
    }

    public static Pair A0F(Object obj, int i2) {
        return new Pair(obj, Integer.valueOf(i2));
    }

    public static LayoutInflater A0G(View view) {
        return LayoutInflater.from(view.getContext());
    }

    public static View A0H(LayoutInflater layoutInflater, ViewGroup viewGroup, int i2) {
        return layoutInflater.inflate(i2, viewGroup, false);
    }

    public static TranslateAnimation A0I(int i2) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) i2, 0.0f);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        translateAnimation.setDuration(120);
        return translateAnimation;
    }

    public static ImageView A0J(View view, int i2) {
        return (ImageView) C004601z.A0E(view, i2);
    }

    public static ImageView A0K(View view, int i2) {
        return (ImageView) view.findViewById(i2);
    }

    public static TextView A0L(View view, int i2) {
        return (TextView) C004601z.A0E(view, i2);
    }

    public static TextView A0M(View view, int i2) {
        return (TextView) view.findViewById(i2);
    }

    public static TextView A0N(C000900k r0, int i2) {
        return (TextView) r0.findViewById(i2);
    }

    public static AnonymousClass050 A0O(C001000l r1) {
        return new AnonymousClass050(r1.AGM());
    }

    public static AnonymousClass020 A0P(Location location) {
        return new AnonymousClass020(location.getLatitude(), location.getLongitude());
    }

    public static TextEmojiLabel A0Q(View view, int i2) {
        return (TextEmojiLabel) C004601z.A0E(view, i2);
    }

    public static TextEmojiLabel A0R(View view, int i2) {
        return (TextEmojiLabel) view.findViewById(i2);
    }

    public static WaTextView A0S(View view, int i2) {
        return (WaTextView) C004601z.A0E(view, i2);
    }

    public static EncBackupViewModel A0T(AnonymousClass01A r1) {
        return (EncBackupViewModel) new C006602z(r1.A0D()).A01(EncBackupViewModel.class);
    }

    public static C16010sH A0U(Iterator it) {
        return (C16010sH) it.next();
    }

    public static C16740tZ A0V(Iterator it) {
        return (C16740tZ) it.next();
    }

    public static BanAppealViewModel A0W(AnonymousClass01A r1) {
        return (BanAppealViewModel) new C006602z(r1.A0D()).A01(BanAppealViewModel.class);
    }

    public static Integer A0X() {
        return 0;
    }

    public static Integer A0Y() {
        return 1;
    }

    public static Integer A0Z() {
        return 2;
    }

    public static Integer A0a() {
        return 3;
    }

    public static Integer A0b(AbstractMap abstractMap, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        if (!abstractMap.containsKey(valueOf)) {
            abstractMap.put(valueOf, new AnonymousClass053());
        }
        return valueOf;
    }

    public static String A0c(int i2, String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2);
        return sb.toString();
    }

    public static String A0d(Context context, Object obj, Object[] objArr, int i2, int i3) {
        objArr[i2] = obj;
        return context.getString(i3, objArr);
    }

    public static String A0e(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    public static String A0f(EditText editText) {
        return editText.getText().toString();
    }

    public static String A0g(String str, String str2) {
        return str.length() != 0 ? str2.concat(str) : new String(str2);
    }

    public static String A0h(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String A0i(String str, StringBuilder sb, int i2) {
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static String A0j(StringBuilder sb, long j2) {
        sb.append(j2);
        return sb.toString();
    }

    public static String A0k(StringBuilder sb, AbstractMap abstractMap, AbstractMap abstractMap2) {
        sb.append("/");
        sb.append(Arrays.deepToString(abstractMap.keySet().toArray()));
        sb.append("/");
        return Arrays.deepToString(abstractMap2.keySet().toArray());
    }

    public static StringBuilder A0l(Object obj, int i2) {
        return new StringBuilder(i2 + String.valueOf(obj).length());
    }

    public static UnsupportedOperationException A0m() {
        return new UnsupportedOperationException();
    }

    public static ArrayList A0n(Collection collection) {
        return new ArrayList(collection);
    }

    public static HashSet A0o() {
        return new HashSet();
    }

    public static HashSet A0p(Object obj, Object[] objArr, int i2) {
        objArr[i2] = obj;
        return new HashSet(Arrays.asList(objArr));
    }

    public static Iterator A0q(Map map) {
        return map.values().iterator();
    }

    public static void A0r(Activity activity, Intent intent) {
        activity.setResult(-1, intent);
        activity.finish();
    }

    public static void A0s(Activity activity, Point point) {
        activity.getWindowManager().getDefaultDisplay().getSize(point);
    }

    public static void A0t(Context context, View view, int i2) {
        view.setContentDescription(context.getString(i2));
    }

    public static void A0u(Context context, View view, int i2) {
        view.setBackgroundColor(AnonymousClass00T.A00(context, i2));
    }

    public static void A0v(Context context, TextView textView, int i2) {
        int A00 = AnonymousClass00T.A00(context, i2);
    }

    public static void A0w(SharedPreferences.Editor editor, String str, int i2) {
        editor.putInt(str, i2).apply();
    }

    public static void A0x(SharedPreferences.Editor editor, String str, long j2) {
        editor.putLong(str, j2).apply();
    }

    public static void A0y(SharedPreferences.Editor editor, String str, String str2) {
        editor.putString(str, str2).apply();
    }

    public static void A0z(SharedPreferences.Editor editor, String str, boolean z2) {
        editor.putBoolean(str, z2).apply();
    }

    public static void A10(Rect rect) {
        rect.left >>= 1;
        rect.right >>= 1;
        rect.top >>= 1;
        rect.bottom >>= 1;
    }

    public static void A11(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300);
        view.startAnimation(alphaAnimation);
    }

    public static void A12(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public static void A13(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void A14(View view, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(250);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        view.startAnimation(animationSet);
    }

    public static void A15(View view, Object obj, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape19S0100000_I1_4(obj, i2));
    }

    public static void A16(View view, Object obj, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape18S0100000_I1_3(obj, i2));
    }

    public static void A17(View view, Object obj, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape17S0100000_I1_2(obj, i2));
    }

    public static void A18(View view, Object obj, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape16S0100000_I1_1(obj, i2));
    }

    public static void A19(View view, Object obj, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape20S0100000_I1_5(obj, i2));
    }

    public static void A1A(View view, Object obj, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape15S0100000_I1(obj, i2));
    }

    public static void A1B(View view, Object obj, Object obj2, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape5S0200000_I1(obj, i2, obj2));
    }

    public static void A1C(View view, Object obj, Object obj2, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape6S0200000_I1_1(obj, i2, obj2));
    }

    public static void A1D(ImageView imageView, int i2, boolean z2) {
        imageView.setImageResource(i2);
        C018808t.A00(AnonymousClass00T.A03(imageView.getContext(), R.color.color06da), imageView);
        imageView.setSelected(z2);
    }

    public static void A1E(ImageView imageView, Object obj, Drawable[] drawableArr) {
        drawableArr[1] = obj;
        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(150);
        imageView.setImageDrawable(transitionDrawable);
    }

    public static void A1F(TextView textView, AnonymousClass01A r2, int i2) {
        textView.setText(r2.A0J(i2));
    }

    public static void A1G(C001100m r1, int i2) {
        r1.A0T(new IDxAListenerShape121S0100000_2_I1(r1, i2));
    }

    public static void A1H(C005302h r1, Object obj, int i2, int i3) {
        r1.setPositiveButton(i3, new IDxCListenerShape128S0100000_2_I1(obj, i2));
    }

    public static void A1I(C000900k r0, int i2, int i3) {
        r0.findViewById(i2).setVisibility(i3);
    }

    public static void A1J(DialogFragment dialogFragment, C001000l r3) {
        dialogFragment.A1G(r3.AGM(), (String) null);
    }

    public static void A1K(AnonymousClass01A r3, TabLayout tabLayout) {
        tabLayout.A0A(AnonymousClass00T.A00(r3.A0u(), R.color.color053c), AnonymousClass00T.A00(r3.A0u(), R.color.color053b));
    }

    public static void A1L(C001300o r1, AnonymousClass028 r2, int i2) {
        r2.A0A(r1, new IDxObserverShape116S0100000_2_I1(r1, i2));
    }

    public static void A1M(C001300o r1, AnonymousClass028 r2, int i2) {
        r2.A0A(r1, new IDxObserverShape114S0100000_1_I1(r1, i2));
    }

    public static void A1N(C001300o r1, AnonymousClass028 r2, Object obj, int i2) {
        r2.A0A(r1, new IDxObserverShape116S0100000_2_I1(obj, i2));
    }

    public static void A1O(AnonymousClass028 r1, int i2) {
        r1.A0B(Integer.valueOf(i2));
    }

    public static void A1P(AnonymousClass028 r1, int i2) {
        r1.A09(Integer.valueOf(i2));
    }

    public static void A1Q(DataTask dataTask, NetworkSession networkSession, UrlRequest urlRequest, String str, Throwable th) {
        Log.e(str, th);
        NetworkUtils.markDataTaskCompleted(dataTask, networkSession, NetworkUtils.newErrorURLResponse(urlRequest), "wa-msys/NetworkSession: ", (byte[]) null, (File) null, new IOException(th), false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.1xt} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.1m3] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1R(X.C42481xs r4, X.C38531qw r5, int r6) {
        /*
            if (r6 == 0) goto L_0x0026
            X.0wS r0 = r4.A0K
            r0.A06()
            X.17Q r1 = r0.A0F
            com.whatsapp.jid.UserJid r4 = r5.A0K
            java.lang.String r3 = r5.A0L
            X.1GR r0 = r1.A00
            X.19r r2 = r0.AFy()
            r0 = 0
            if (r2 == 0) goto L_0x0024
            java.util.Map r1 = r1.A01
            if (r1 == 0) goto L_0x0020
            java.lang.Object r0 = r1.get(r4)
            X.1m3 r0 = (X.C35511m3) r0
        L_0x0020:
            X.1xt r0 = r2.AGq(r0, r4, r3)
        L_0x0024:
            r5.A04 = r0
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13680ns.A1R(X.1xs, X.1qw, int):void");
    }

    public static void A1S(C15860rz r0, String str, int i2) {
        r0.A0K().putInt(str, i2).apply();
    }

    public static void A1T(C16690tT r1) {
        if (r1 != null) {
            r1.A06(true);
        }
    }

    public static void A1U(C16690tT r1, C16320sq r2) {
        r2.Ack(r1, new Void[0]);
    }

    public static void A1V(Object obj) {
        Log.i(obj.toString());
    }

    public static void A1W(Object obj, Object obj2, AbstractCollection abstractCollection) {
        abstractCollection.add(new AnonymousClass01Q(obj, obj2));
    }

    public static void A1X(Object obj, AbstractMap abstractMap, int i2) {
        abstractMap.put(obj, Integer.valueOf(i2));
    }

    public static void A1Y(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static boolean A1Z(AnonymousClass013 r0) {
        return !r0.A0T();
    }

    public static boolean A1a(Object obj, Object obj2) {
        return obj != obj2;
    }

    public static Object[] A1b() {
        return new Object[1];
    }
}
