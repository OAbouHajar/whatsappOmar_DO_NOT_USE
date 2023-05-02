package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape178S0100000_2_I1;
import com.facebook.redex.IDxObserverShape114S0100000_1_I1;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0nu  reason: invalid class name and case insensitive filesystem */
public final class C13700nu {
    public static int A00(List list, int i2) {
        return list.size() - i2;
    }

    public static long A01(Object obj) {
        return ((Number) obj).longValue();
    }

    public static Intent A02(String str) {
        return new Intent(str);
    }

    public static Configuration A03(Context context) {
        return context.getResources().getConfiguration();
    }

    public static Resources.Theme A04(View view) {
        return view.getContext().getTheme();
    }

    public static Paint A05() {
        return new Paint();
    }

    public static Paint A06(int i2) {
        return new Paint(i2);
    }

    public static ViewGroup A07(View view, int i2) {
        return (ViewGroup) C004601z.A0E(view, i2);
    }

    public static FrameLayout A08(View view, int i2) {
        return (FrameLayout) C004601z.A0E(view, i2);
    }

    public static TextView A09(Activity activity, int i2) {
        return (TextView) AnonymousClass00T.A05(activity, i2);
    }

    public static AnonymousClass01F A0A(Context context) {
        return (AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class);
    }

    public static C15830rv A0B(Iterator it) {
        return (C15830rv) it.next();
    }

    public static File A0C(File file, String str) {
        return new File(file, str);
    }

    public static File A0D(String str) {
        return new File(str);
    }

    public static String A0E(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getString(str, (String) null);
    }

    public static String A0F(Resources resources, Object obj, Object[] objArr, int i2, int i3) {
        objArr[i2] = obj;
        return resources.getString(i3, objArr);
    }

    public static String A0G(Uri.Builder builder) {
        return builder.build().toString();
    }

    public static String A0H(View view, int i2) {
        return view.getContext().getString(i2);
    }

    public static Iterator A0I(Map map) {
        return map.keySet().iterator();
    }

    public static JSONObject A0J() {
        return new JSONObject();
    }

    public static JSONObject A0K(String str) {
        return new JSONObject(str);
    }

    public static void A0L(Context context, ImageView imageView, int i2) {
        imageView.setImageDrawable(AnonymousClass00T.A04(context, i2));
    }

    public static void A0M(Resources resources, TextView textView, Object[] objArr, int i2, int i3) {
        textView.setText(resources.getQuantityString(i2, i3, objArr));
    }

    public static void A0N(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static void A0O(Handler handler, Object obj, Object obj2, int i2) {
        handler.post(new RunnableRunnableShape12S0200000_I1(obj, i2, obj2));
    }

    public static void A0P(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void A0Q(View view, ViewGroup viewGroup) {
        viewGroup.addView(view, -1, -2);
    }

    public static void A0R(View view, AnonymousClass01A r2, int i2) {
        view.setContentDescription(r2.A0J(i2));
    }

    public static void A0S(View view, Object obj, int i2) {
        view.setOnLongClickListener(new IDxCListenerShape178S0100000_2_I1(obj, i2));
    }

    public static void A0T(TextView textView) {
        textView.setText("");
    }

    public static void A0U(AnonymousClass028 r1, AnonymousClass026 r2, Object obj, int i2) {
        r2.A0D(r1, new IDxObserverShape114S0100000_1_I1(obj, i2));
    }

    public static void A0V(AnonymousClass028 r1, boolean z2) {
        r1.A0B(Boolean.valueOf(z2));
    }

    public static void A0W(C16690tT r1, C16320sq r2) {
        r2.Ack(r1, new Void[0]);
    }

    public static void A0X(C16320sq r1, Object obj, Object obj2, Object obj3, int i2) {
        r1.Acl(new RunnableRunnableShape3S0300000_I1(obj, obj2, obj3, i2));
    }

    public static void A0Y(Object obj, Object obj2, Object obj3, AbstractCollection abstractCollection) {
        abstractCollection.add(obj);
        abstractCollection.add(obj2);
        abstractCollection.add(obj3);
    }

    public static void A0Z(String str, Locale locale, Object[] objArr) {
        Log.i(String.format(locale, str, objArr));
    }

    public static void A0a(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(" ");
    }

    public static void A0b(StringBuilder sb, List list) {
        sb.append(list.size());
    }

    public static void A0c(Throwable th) {
        Log.e("AutoconfManagerConsumerImpl/preload/feo2/soft_error", th);
    }

    public static void A0d(AbstractCollection abstractCollection, long j2) {
        abstractCollection.add(Long.valueOf(j2));
    }

    public static void A0e(Object[] objArr, int i2, long j2) {
        objArr[i2] = String.valueOf(j2);
    }

    public static boolean A0f(int i2) {
        return i2 >= 0;
    }

    public static boolean A0g(int i2, int i3) {
        return i2 > i3;
    }

    public static boolean A0h(AbstractCollection abstractCollection, int i2) {
        return abstractCollection.contains(Integer.valueOf(i2));
    }

    public static boolean A0i(List list) {
        return !list.isEmpty();
    }
}
