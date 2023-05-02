package com.OM7753;

import X.C016607w;
import X.C15010qB;
import X.C16010sH;
import X.C16740tZ;
import X.C42821yj;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.AssemMods.Translate.YTranslate;
import com.OM7753.res.resfirst;
import com.OM7753.res.tra;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.yo.dep;
import com.obwhatsapp.yo.h1;
import com.obwhatsapp.yo.p0;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.store.ColorStore;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

public class GOLD {
    public static String IsMYAU = "MYAU";

    /* renamed from: g  reason: collision with root package name */
    public static boolean f207g = false;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f208h = false;

    public static void A00(Object obj) {
        try {
            String sb = new StringBuilder().append(obj).toString();
            if (sb != null && sb.contains("from=status@broadcast") && sb.contains("type=read")) {
                String replace = A0D(sb, "]", "participant=").replace("participant=", "");
                if (shp.getBoolean("statuses_toast", true) && replace.contains("@s.whatsapp.net")) {
                    OnlineContactsDO(String.valueOf(dep.getContactName(replace.substring(0, replace.lastIndexOf("@")))) + " " + yo.getString("status_toast"));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void A0A(Toast toast) {
        View view = toast.getView();
        TextView textView = (TextView) view.findViewById(16908299);
        textView.setTextColor(others.getColor("yoTostT", ColorStore.getAssemBarColor(textView.getContext())));
        Drawable background = view.getBackground();
        if (background != null) {
            background.setColorFilter(others.getColor("yoTostC", ColorStore.getActionBarColor(view.getContext())), PorterDuff.Mode.SRC_ATOP);
            view.setBackgroundDrawable(background);
        }
    }

    public static void A0C(String str, String str2) {
        if (shp.getBoolean("profile_toast") && !str.contains(str2) && str.toString().contains("@s.whatsapp.net")) {
            OnlineContactsDO(String.valueOf(dep.getContactName(str.substring(0, str.lastIndexOf("@")))) + " " + yo.getString("prot_toast"));
        }
    }

    public static String A0D(String str, String str2, String str3) {
        return str.substring(str.indexOf(str3), str.indexOf(str2));
    }

    public static void A0Y(C016607w r6, Activity activity, int i2) {
        int id = yo.getID("translateAg", "string");
        int id2 = yo.getID("div2", "id");
        if (p0.d() == 1) {
            r6.add(i2, id2, i2, id).setOnMenuItemClickListener(new tra(activity));
        }
    }

    public static void ACI(View view) {
        ImageView imageView = (ImageView) view;
        Drawable background = imageView.getBackground();
        int fabColorNormal = ColorStore.getFabColorNormal(imageView.getContext());
        if (!ColorStore.INM()) {
            fabColorNormal = others.getColor("ModFabNormalColor", fabColorNormal);
        }
        background.setColorFilter(fabColorNormal, PorterDuff.Mode.SRC_ATOP);
        if (Build.VERSION.SDK_INT >= 16) {
            imageView.setBackground(background);
        } else {
            imageView.setBackgroundDrawable(background);
        }
        imageView.setColorFilter(ColorStore.getFABIconsColor(), PorterDuff.Mode.SRC_IN);
    }

    public static void AFM(Conversation conversation) {
        new h1(conversation, yo.getCurr_sJid()).execute(new String[0]);
    }

    public static void AOS(Conversation conversation, C42821yj r5, View view) {
        view.findViewById(yo.getID("scroll_down", "id")).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(r5, 43));
        view.findViewById(yo.getID("scroll_up", "id")).setOnClickListener(new resfirst(conversation));
    }

    public static void APG(View view) {
        if (ColorStore.INM()) {
            view.setBackgroundColor(ColorStore.getMainBkColor(view));
        } else if (shp.getIsGradiet("Modsto_ig")) {
            view.setBackground(shp.getGradientDrawable("Modsto_ig"));
        } else {
            view.setBackgroundColor(others.getColor("Modsto_ig", ColorStore.getMainBkColor(view)));
        }
    }

    public static void ART() {
        Ringtone ringtone;
        String prefString = shp.getPrefString("chats_play_contact_online_tone");
        if (!prefString.equals("") && (ringtone = RingtoneManager.getRingtone(yo.getCtx(), Uri.parse(prefString))) != null && prefString.length() > 1) {
            ringtone.play();
        }
    }

    public static boolean Audio(C16740tZ r1, boolean z2) {
        return Media_Mask(r1, "yoMAudio_", z2);
    }

    public static boolean Documents(C16740tZ r1, boolean z2) {
        return Media_Mask(r1, "yoMDocument_", z2);
    }

    public static int GetPrefsOnlineDO(Context context) {
        return Integer.parseInt(shp.getPrefString("contact_online_tone_do", "0"));
    }

    public static boolean Image(C16740tZ r1, boolean z2) {
        return Media_Mask(r1, "yoMPhoto_", z2);
    }

    public static Jid JidSelect(Object obj) {
        C16010sH r1 = (C16010sH) obj;
        return !f207g ? r1.A08(UserJid.class) : r1.A0E;
    }

    public static Class JidSelect() {
        return !f207g ? UserJid.class : C15010qB.class;
    }

    public static boolean Media_Mask(C16740tZ r4, String str, boolean z2) {
        String stripJID = yo.stripJID(dep.d(r4));
        if (!wantsSpecific(stripJID)) {
            return z2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(stripJID);
        sb.append("_M");
        return !shp.getBooleanPriv(sb.toString(), false);
    }

    public static void OnlineContactsDO(String str) {
        Application application = com.OM7753.Gold.Context.A01.A00;
        int GetPrefsOnlineDO = GetPrefsOnlineDO(application);
        if (GetPrefsOnlineDO == 0) {
            OnlineToast(str, 48, application);
        } else if (GetPrefsOnlineDO == 1) {
            OnlineToast(str, 0, application);
        } else {
            OnlineToast(str, -48, application);
        }
        ART();
    }

    public static void OnlineToast(final String str, final int i2, final Context context) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                long j2;
                int parseInt = Integer.parseInt(shp.getPrefString("time_online_toast_key", "0"));
                Toast makeText = Toast.makeText(context, str, 0);
                GOLD.A0A(makeText);
                makeText.setGravity(i2, 0, 0);
                switch (parseInt) {
                    case 0:
                        j2 = 3000;
                        break;
                    case 1:
                        j2 = 3000;
                        break;
                    case 2:
                        j2 = 4000;
                        break;
                    case 3:
                        j2 = 5000;
                        break;
                    case 4:
                        j2 = 6000;
                        break;
                    case 5:
                        j2 = 7000;
                        break;
                    case 6:
                        j2 = 8000;
                        break;
                    case 7:
                        j2 = 9000;
                        break;
                    default:
                        j2 = 3000;
                        break;
                }
                if (j2 == 3000) {
                    makeText.show();
                    return;
                }
                final Toast toast = makeText;
                new CountDownTimer(Math.max(j2 - 2000, 1000), 1000) {
                    public void onFinish() {
                    }

                    public void onTick(long j2) {
                        toast.show();
                    }
                }.start();
            }
        });
    }

    public static String[] StringToStringArray(String str) {
        try {
            return str.substring(1, str.length() - 1).replaceAll("\\s", "").split(",");
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static boolean Video(C16740tZ r1, boolean z2) {
        return Media_Mask(r1, "yoMVideo_", z2);
    }

    public static GradientDrawable circleBorder(int i2, int i3, boolean z2, int i4, int i5) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(i2, i3);
        gradientDrawable.setCornerRadius((float) dpToPx(100.0f));
        if (z2) {
            gradientDrawable.setColors(new int[]{i4, i5});
        } else {
            gradientDrawable.setColor(i4);
        }
        return gradientDrawable;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean d_tra(Activity activity) {
        f208h = true;
        YTranslate.translte(p0.b().A0I(), activity);
        p0.pause();
        return true;
    }

    public static int dpToPx(float f2) {
        return Math.round(f2 * yo.getCtx().getResources().getDisplayMetrics().density);
    }

    public static int getAnim(String str) {
        return yo.getID(str, "anim");
    }

    public static String getContactName(Context context, String str) {
        try {
            Cursor query = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"display_name"}, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return null;
            }
            String str2 = null;
            if (query.moveToFirst()) {
                str2 = query.getString(query.getColumnIndex("display_name"));
            }
            if (query != null && !query.isClosed()) {
                query.close();
            }
            return str2 != null ? str2 : str;
        } catch (Exception e2) {
            return str;
        }
    }

    public static String getContactName(String str) {
        return getContactName(com.OM7753.Gold.Context.A01.A00, str);
    }

    public static int intDrawable(String str) {
        return yo.getID(str, "drawable");
    }

    public static boolean saveSelectedList(Activity activity, ArrayList arrayList) {
        try {
            Intent intent = activity.getIntent();
            if (!(intent.hasExtra("yo") && intent.getBooleanExtra("yo", false))) {
                return false;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((String) it.next()).replace("@s.whatsapp.net", ""));
            }
            Intent intent2 = activity.getIntent();
            intent2.putExtra("jids", arrayList2.toString());
            activity.setResult(-1, intent2);
            activity.finish();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean wantsSpecific() {
        return shp.getBooleanPriv(yo.getCurr_sJid() + "_M");
    }

    public static boolean wantsSpecific(String str) {
        return shp.getBooleanPriv(str + "_M");
    }
}
