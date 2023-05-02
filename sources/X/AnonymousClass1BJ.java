package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.google.android.search.verification.client.SearchActionVerificationClientUtil;
import com.obwhatsapp.R;
import com.obwhatsapp.TellAFriendReceiver;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1BJ  reason: invalid class name */
public class AnonymousClass1BJ {
    public final C14870pt A00;
    public final AnonymousClass1BI A01;
    public final AnonymousClass15V A02;

    public AnonymousClass1BJ(C14870pt r1, AnonymousClass1BI r2, AnonymousClass15V r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.content.Context r7, android.net.Uri r8, java.lang.Integer r9, java.lang.String r10) {
        /*
            r6 = this;
            java.lang.String r0 = "android.intent.action.SENDTO"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            r3.setData(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            r5 = 0
            java.util.List r4 = r0.queryIntentActivities(r3, r5)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "app/sms "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r4.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L_0x0059
            java.lang.String r2 = android.provider.Telephony.Sms.getDefaultSmsPackage(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0059
            r3.setPackage(r2)
        L_0x0041:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "sms_body"
            r3.putExtra(r0, r10)
        L_0x004d:
            r7.startActivity(r3)
            if (r9 == 0) goto L_0x0058
            X.1BI r1 = r6.A01
            r0 = 3
            r1.A01(r9, r2, r0)
        L_0x0058:
            return
        L_0x0059:
            java.lang.Object r0 = r4.get(r5)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ActivityInfo r2 = r0.activityInfo
            java.lang.String r1 = r2.packageName
            java.lang.String r0 = r2.name
            r3.setClassName(r1, r0)
            java.lang.String r2 = r2.packageName
            goto L_0x0041
        L_0x006b:
            java.lang.String r0 = "app/sms/no activities"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1BJ.A00(android.content.Context, android.net.Uri, java.lang.Integer, java.lang.String):void");
    }

    public void A01(Context context, Integer num) {
        Integer num2 = num;
        if (num != null) {
            Context context2 = context;
            String string = context2.getString(R.string.str179c);
            String string2 = context2.getString(R.string.str179b, new Object[]{"https://whatsapp.com/dl/"});
            StringBuilder sb = new StringBuilder();
            sb.append(context2.getString(R.string.str179b, new Object[]{"https://whatsapp.com/dl/"}));
            sb.append("\n\n");
            String obj = sb.toString();
            String string3 = context2.getString(R.string.str179a);
            PackageManager packageManager = context2.getPackageManager();
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            Intent[] intentArr = {new Intent("android.intent.action.VIEW").setType("vnd.android-dir/mms-sms").putExtra("sms_body", string2), new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.EMAIL", " ").putExtra("android.intent.extra.TEXT", obj).putExtra("android.intent.extra.SUBJECT", string3)};
            Intent intent = null;
            int i2 = 0;
            do {
                Intent intent2 = intentArr[i2];
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
                if (queryIntentActivities != null) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        String str = activityInfo.name;
                        String str2 = activityInfo.applicationInfo.packageName;
                        Intent intent3 = intent;
                        StringBuilder sb2 = new StringBuilder("app/tell ");
                        sb2.append(i2);
                        sb2.append(" | ");
                        sb2.append(str2);
                        sb2.append(" | ");
                        sb2.append(str);
                        Log.i(sb2.toString());
                        if (!str2.contains("bluetooth") && !str2.equals("com.sec.android.app.FileTransferClient") && !str2.equals("com.sec.android.app.FileShareClient") && !str2.equals("com.sec.android.widgetapp.diotek.smemo") && !str2.equals("com.threebanana.notes") && !str2.equals("com.evernote") && !str2.equals("com.android.apps.tag") && !str2.equals("com.andrewshu.android.reddit") && !str2.equals("com.dataviz.stargate") && !str2.equals("com.dropbox.android") && !str2.equals("com.google.zxing.client.android") && !str2.equals("com.lg.valle.phone2chrome") && !str2.equals("com.motorola.blur.socialshare") && !str2.equals("com.obwhatsapp") && !str2.equals("com.obwhatsapp.w4b") && !str2.equals("la.droid.qr") && !str2.equals("com.google.android.apps.translate") && !str2.equals("com.google.android.apps.docs") && !str2.equals(SearchActionVerificationClientUtil.SEARCH_APP_PACKAGE) && !str2.equals("com.world.newspapers") && !str2.equals("lysesoft.andftp") && !str2.equals("com.klye.ime.latin") && !str2.equals("com.ideashower.readitlater.pro") && !str2.equals("com.springpad") && !str2.equals("ch.teamtasks.tasks.paid") && !str2.equals("flipboard.app") && !str2.equals("jp.naver.cafe") && !str2.equals("org.mozilla.firefox") && !str2.equals("com.linkedin.android") && !str2.equals("com.tenthbit.juliet") && !str2.equals("com.bumptech.bumpga")) {
                            intent = (Intent) intent2.clone();
                            intent.setClassName(str2, str);
                            intent.setPackage(str2);
                            if (str2.equals("mobi.qiss.plurq") || str2.equals("com.htc.socialnetwork.plurk") || str2.equals("com.facebook.orca") || str2.equals("com.google.android.apps.plus") || str2.equals("com.google.android.apps.googlevoice") || str2.equals("com.google.android.apps.messaging") || str2.equals("com.thedeck.android.app") || str2.equals("com.twitter.android") || str2.equals("tw.anddev.aplurk")) {
                                intent.removeExtra("android.intent.extra.EMAIL");
                                intent.putExtra("android.intent.extra.TEXT", string2);
                            } else if (str2.equals("com.facebook.katana")) {
                                intent.putExtra("android.intent.extra.TEXT", "https://www.whatsapp.com/download/");
                            }
                            if (!hashSet.contains(str2)) {
                                arrayList.add(intent);
                                hashSet.add(str2);
                                if (str.equals("com.lge.message.activity.compose.ComposeMessageActivity")) {
                                }
                            }
                        }
                        intent = intent3;
                    }
                }
                i2++;
            } while (i2 < 2);
            int size = arrayList.size();
            if (size != 0) {
                String replace = Build.MANUFACTURER.replace(' ', '_');
                String replace2 = Build.MODEL.replace(' ', '_');
                StringBuilder sb3 = new StringBuilder();
                sb3.append(replace);
                sb3.append("-");
                sb3.append(replace2);
                String obj2 = sb3.toString();
                StringBuilder sb4 = new StringBuilder("app/packagedintents/device ");
                sb4.append(obj2);
                Log.i(sb4.toString());
                if (!obj2.equals("LGE-LU2300")) {
                    if (size > 1) {
                        int i3 = size - 1;
                        Object obj3 = arrayList.get(i3);
                        arrayList.remove(i3);
                        arrayList.add(0, obj3);
                    }
                    context2.startActivity(AnonymousClass1yL.A01(C42341xd.A01(context2, 0, new Intent(context2, TellAFriendReceiver.class).putExtra("extra_invite_source", num2), 134217728).getIntentSender(), string, arrayList));
                } else if (intent != null) {
                    Log.i("app/tell/override");
                    context2.startActivity(intent);
                }
                this.A01.A00(num2);
            }
            Log.w("app/tell/none");
            this.A00.A07(R.string.str0853, 0);
            this.A01.A00(num2);
        }
    }
}
