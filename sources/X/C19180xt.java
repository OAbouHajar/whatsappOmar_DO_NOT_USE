package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import java.lang.reflect.Array;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0xt  reason: invalid class name and case insensitive filesystem */
public class C19180xt extends BroadcastReceiver {
    public final Context A00;
    public final C210812s A01;
    public final AnonymousClass1HW A02;
    public final AnonymousClass01V A03;
    public final C14710pd A04;
    public final C16490t9 A05;

    public C19180xt(Context context, C210812s r2, AnonymousClass1HW r3, AnonymousClass01V r4, C14710pd r5, C16490t9 r6) {
        this.A00 = context;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static Object A00(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.isPrimitive() || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof CharSequence) || (obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character)) {
            return obj;
        }
        if (cls.isArray()) {
            JSONArray jSONArray = new JSONArray();
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray.put(A00(Array.get(obj, i2)));
            }
            return jSONArray;
        } else if (obj instanceof List) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object A002 : (List) obj) {
                jSONArray2.put(A00(A002));
            }
            return jSONArray2;
        } else if (obj instanceof Bundle) {
            return A01((Bundle) obj);
        } else {
            if (obj instanceof SparseArray) {
                SparseArray sparseArray = (SparseArray) obj;
                JSONObject jSONObject = new JSONObject();
                int size = sparseArray.size();
                for (int i3 = 0; i3 < size; i3++) {
                    jSONObject.put(Integer.toString(sparseArray.keyAt(i3)), A00(sparseArray.valueAt(i3)));
                }
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", cls.getCanonicalName());
            jSONObject2.put("string", obj.toString());
            return jSONObject2;
        }
    }

    public static JSONObject A01(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, A00(obj));
        }
        return jSONObject;
    }

    public static /* synthetic */ void A02(C19180xt r6) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        }
        if ("samsung".equalsIgnoreCase(Build.MANUFACTURER) && r6.A04.A0E(C16620tM.A02, 580)) {
            intentFilter.addAction("com.samsung.android.action.WARNING_NOTIFICATION");
        }
        r6.A00.registerReceiver(r6, intentFilter);
        if (i2 >= 21) {
            r6.A03();
        } else {
            r6.A02.A04(false);
        }
    }

    public final void A03() {
        boolean isPowerSaveMode;
        AnonymousClass01V r1 = this.A03;
        AnonymousClass01V.A0P = true;
        PowerManager A0I = r1.A0I();
        AnonymousClass01V.A0P = false;
        if (A0I == null) {
            Log.w("battery-receiver/on-action-power-save-mode-changed pm=null");
            isPowerSaveMode = true;
        } else {
            isPowerSaveMode = A0I.isPowerSaveMode();
        }
        this.A02.A04(isPowerSaveMode);
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -1538406691:
                if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                    C46192Cv r2 = new C46192Cv(intent);
                    C210812s r1 = this.A01;
                    if (!r1.A00.equals(r2)) {
                        r1.A00 = r2;
                        for (C33461ic ANW : r1.A01()) {
                            ANW.ANW(r2);
                        }
                        StringBuilder sb = new StringBuilder("battery changed; newEvent=");
                        sb.append(r2);
                        Log.i(sb.toString());
                        return;
                    }
                    return;
                }
                break;
            case -1209048666:
                if (action.equals("com.samsung.android.action.WARNING_NOTIFICATION")) {
                    String str = intent.getPackage();
                    if (str == null || str.equals(context.getPackageName())) {
                        AnonymousClass2IA r22 = new AnonymousClass2IA();
                        if (intent.getDataString() != null) {
                            r22.A00 = intent.getDataString();
                        }
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            extras.keySet();
                            try {
                                r22.A01 = extras.toString();
                                r22.A02 = A01(extras).toString();
                            } catch (BadParcelableException | JSONException e2) {
                                Log.e("battery-receiver/samsung-warning/unable-to-serialize-extras", e2);
                            }
                        }
                        this.A05.A06(r22);
                        return;
                    }
                    return;
                }
                break;
            case 1779291251:
                if (action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                    A03();
                    return;
                }
                break;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected action: ");
        sb2.append(intent.getAction());
        throw new IllegalArgumentException(sb2.toString());
    }
}
