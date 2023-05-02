package o;

import android.app.Activity;
import android.content.Context;
import android.text.TextWatcher;
import com.obwhatsapp.youbasha.ui.themeserver.OnThemesActivity;
import java.util.ArrayList;
import java.util.Iterator;
import q.d;

public final class b implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final int f1862a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f1863b;

    public /* synthetic */ b(Activity activity, int i2) {
        this.f1862a = i2;
        this.f1863b = activity;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterTextChanged(android.text.Editable r8) {
        /*
            r7 = this;
            r3 = 0
            java.lang.String r0 = "ۢۚ۫۟۟ۜ۟ۨۢۧ۟۫۟۫ۧۘۙۜۘۜۦۢ"
            r1 = r0
            r2 = r3
            r4 = r3
            r5 = r3
        L_0x0007:
            int r0 = r1.hashCode()
            r3 = 807(0x327, float:1.131E-42)
            r6 = 396248738(0x179e46a2, float:1.0228341E-24)
            r0 = r0 ^ r3
            r0 = r0 ^ r6
            switch(r0) {
                case -1700839978: goto L_0x0091;
                case -1293383487: goto L_0x0027;
                case -1253624308: goto L_0x00ac;
                case -600078714: goto L_0x0045;
                case -567170793: goto L_0x001a;
                case -515467398: goto L_0x006b;
                case 8986385: goto L_0x00e0;
                case 372638477: goto L_0x003e;
                case 488371779: goto L_0x001e;
                case 576589511: goto L_0x00d0;
                case 968585061: goto L_0x0099;
                case 1071519855: goto L_0x00fb;
                case 1173488063: goto L_0x0053;
                case 1311038758: goto L_0x0016;
                case 1482772652: goto L_0x0053;
                case 1524880466: goto L_0x002f;
                case 1629747492: goto L_0x00d8;
                case 1780864832: goto L_0x00fb;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "ۧ۟ۖۧ۟ۦۧۛۜۢۛ۠ۨ۬ۘۘۧۧۨۚۧۨۘ"
            r1 = r0
            goto L_0x0007
        L_0x001a:
            java.lang.String r0 = "ۖۡۤۚ۬ۘ۟ۙۢۥۧۧۘ۫ۚۤ۫ۜۖۖۜۘ۠ۖۘۛۜۡۘ"
            r1 = r0
            goto L_0x0007
        L_0x001e:
            int r0 = r7.f1862a
            switch(r0) {
                case 0: goto L_0x00ec;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.String r0 = "ۡۡۨۛ۬ۥۘۨۜۡۖۦۡۗۚۚۛۦۤۥۨۚۜۙۚۡ۟ۛ"
            r1 = r0
            goto L_0x0007
        L_0x0027:
            android.app.Activity r0 = r7.f1863b
            com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pin r0 = (com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pin) r0
            java.lang.String r1 = "ۦۗۨ۬۠ۡۘۤ۠ۦۙۜۘ۬ۘۘۘۖۧۧۡۙ۬"
            r5 = r0
            goto L_0x0007
        L_0x002f:
            android.widget.EditText r0 = r5.f1291b
            android.text.Editable r0 = r0.getText()
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ۜۘۡۘۥۜ۫ۖۗۜۧۜۘ۟۫ۥۘ"
            r1 = r0
            r4 = r3
            goto L_0x0007
        L_0x003e:
            r5.c()
            java.lang.String r0 = "۠ۥۛۙ۠ۛ۟ۙۜۘ۬ۙ۬ۦۦۨۘۜۙۥۘۘۙۦ۬۟ۡۚۜۙ"
            r1 = r0
            goto L_0x0007
        L_0x0045:
            r1 = 1306189632(0x4ddadf40, float:4.59008E8)
            java.lang.String r0 = "ۛۛۡۘۦۧۜۘۙۗۜۗ۫۟۟ۖ۠۬۠ۥۘ۫۟ۖۘۤۤ۫ۢۜۦۘ"
        L_0x004a:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1905591195: goto L_0x0064;
                case -781006670: goto L_0x005a;
                case 540412177: goto L_0x0067;
                case 1164559802: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x004a
        L_0x0053:
            java.lang.String r0 = "ۥۗۖۤۦۨۡۡۘۖۜۧۘۖۦۦۘۢۨۥ۟ۜ۬ۖۥۘ"
            r1 = r0
            goto L_0x0007
        L_0x0057:
            java.lang.String r0 = "۟ۨۗ۬۟۬۫ۗۨۘۜۢۨۘۗۢۡۘۧۡ۟ۦۢۜ"
            goto L_0x004a
        L_0x005a:
            int r0 = r4.length()
            r3 = 4
            if (r0 != r3) goto L_0x0057
            java.lang.String r0 = "ۥۙۙۡۚۘ۫ۥۖۡۥۥ۠۠۫ۥ۬ۧۨۦۦۘۙۢ۟ۙۚۦۘ"
            goto L_0x004a
        L_0x0064:
            java.lang.String r0 = "ۥۜۨۥۡۖۥۚۢ۟۟ۜۗۚ۬"
            goto L_0x004a
        L_0x0067:
            java.lang.String r0 = "۫ۚۦۙۥۢۡۧۜۥۜۡۘ۟۟ۖۛۤۙ۫ۘۥۘۖۘ۬ۘۦۘ"
            r1 = r0
            goto L_0x0007
        L_0x006b:
            r1 = -581572405(0xffffffffdd55e8cb, float:-9.6336206E17)
            java.lang.String r0 = "۠۠ۚ۠ۜۡۘۜ۟ۨ۠ۨۘۤۡۜۥۗۧۚۙ۫ۧ۟ۚۘۙ"
        L_0x0070:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1627856882: goto L_0x007f;
                case -1382878001: goto L_0x00f1;
                case 366592608: goto L_0x0079;
                case 1610708581: goto L_0x008c;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x0070
        L_0x0079:
            java.lang.String r0 = "ۢۥۙ۬ۗۛۤۗۛۤۢۨۧۧۧۜۦۦۤۜۛۥۡ"
            goto L_0x0070
        L_0x007c:
            java.lang.String r0 = "ۘۜۖۘ۟ۗۖۘۘۦۦۦۨۡۨۛۜۘۜ۬ۧۨ۫ۘۘ"
            goto L_0x0070
        L_0x007f:
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = com.obwhatsapp.youbasha.ui.lockV2.locktypes.Pin.b(r5)
            boolean r0 = r0.getIsChangePass()
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = "ۗۢۙۗۘۧۘۗۛۗ۟ۘۥ۟ۦ۫"
            goto L_0x0070
        L_0x008c:
            java.lang.String r0 = "۟ۙۨ۬۠۠۬ۘۘۘۜۙۙۗۦۦۘ"
            r1 = r0
            goto L_0x0007
        L_0x0091:
            r5.change_pass(r4)
            java.lang.String r0 = "ۨۘۗ۬ۨۘۖۦۨۘۙۖۨۘۥ۫ۛۡۘۤ"
            r1 = r0
            goto L_0x0007
        L_0x0099:
            java.lang.String r2 = new java.lang.String
            byte[] r0 = r4.getBytes()
            r1 = 2
            byte[] r0 = android.util.Base64.encode(r0, r1)
            r2.<init>(r0)
            java.lang.String r0 = "ۙ۟ۦۘۖۖۦۘۖۡۢۧۨ۠ۨۜۥۘ۟ۡۥۘ۬ۘۗ۠ۤۖۢۖ"
            r1 = r0
            goto L_0x0007
        L_0x00ac:
            r1 = 1697926607(0x65344dcf, float:5.321633E22)
            java.lang.String r0 = "ۦ۟۫ۥۙ۠ۧۖۦۘۦۡۖ۟۟ۤۜ۠۠۠۟ۤۗۘۛ"
        L_0x00b1:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1411547504: goto L_0x00c8;
                case -950468215: goto L_0x00f6;
                case -721376798: goto L_0x00ba;
                case 90606812: goto L_0x00cb;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            goto L_0x00b1
        L_0x00ba:
            java.lang.String r0 = r5.f1290a
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "ۧۤۚۦۦۨۘۦۢۡۘۤ۫ۘۜۢۖ"
            goto L_0x00b1
        L_0x00c5:
            java.lang.String r0 = "ۧۙ۟۠ۙۖۘ۬ۜۜۘۛۧۨۘۚۤ۠"
            goto L_0x00b1
        L_0x00c8:
            java.lang.String r0 = "۟ۙۖۘ۫ۘۘۘ۟ۥۖ۟ۚۧۜۥۚۚۜۜ۠ۨۧۘۜۙۚ۫ۚۘ"
            goto L_0x00b1
        L_0x00cb:
            java.lang.String r0 = "ۜ۬ۘۘۨۖۥ۠ۜۚۡۢ۫۬۟ۙۖ۟۫۟۟ۗ۫ۥۘۘ"
            r1 = r0
            goto L_0x0007
        L_0x00d0:
            r5.auth_success()
            java.lang.String r0 = "ۦ۠ۜۦۜۤ۫ۗۜۘۖ۟ۥ۫ۖۨۤۤۥ۟ۨۢ"
            r1 = r0
            goto L_0x0007
        L_0x00d8:
            r5.auth_failed()
            java.lang.String r0 = "ۗۗۜۚ۠ۧۜۨ۠ۧ۫ۗۚۘۨۘۤۖۢ۠ۨۚ"
            r1 = r0
            goto L_0x0007
        L_0x00e0:
            android.widget.EditText r0 = r5.f1291b
            java.lang.String r1 = ""
            r0.setText(r1)
            java.lang.String r0 = "ۥۗۖۤۦۨۡۡۘۖۜۧۘۖۦۦۘۢۨۥ۟ۜ۬ۖۥۘ"
            r1 = r0
            goto L_0x0007
        L_0x00ec:
            java.lang.String r0 = "ۢۤۖۘ۟ۘ۟ۘ۟ۖۘ۠ۥۦۘ۠ۙۨۘۨ۠ۧ"
            r1 = r0
            goto L_0x0007
        L_0x00f1:
            java.lang.String r0 = "ۢۦۥ۬۫ۦۘۤۖۧۤۦۖۘۛ۬ۧۖۧۢ۬۬ۢ"
            r1 = r0
            goto L_0x0007
        L_0x00f6:
            java.lang.String r0 = "ۨۨۦۘ۠ۡۙۢۥۚۡۢۡۘۨۡۘۘۚۨ۠ۦۙۜۘۢ۬ۜۘۧۘۗ"
            r1 = r0
            goto L_0x0007
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b.afterTextChanged(android.text.Editable):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        String str = "ۤۘۖ۬ۜۦۘۡۧۡۖۨۧۚۧۥۦۡۜۘۡۨۗۖۡۤ";
        while (true) {
            switch ((str.hashCode() ^ 103) ^ 2136626301) {
                case -297279088:
                    str = "ۘ۠ۚۚۛۦۘۡۙۨۖۨۖۜۛ";
                    break;
                case -201681448:
                    str = "ۖۗۜۚۤۖۚ۬ۖۘۜۖۧۘ۫ۥۢۡۤۙۛ۫ۢ۠ۦۙ";
                    break;
                case 628777017:
                    str = "ۨۘۨۘۧۥۗۥۦۘۘۙۨۜۙ۫ۚۥۧۢۖۛۜۘۨۧۗ۠ۖ";
                    break;
                case 813493090:
                    return;
                case 1047049893:
                    str = "۟ۦۢۖۢۨۜۜۥۤۙۦۘۚۛ۫ۡۗۖۦۖۛ";
                    break;
                case 1357475840:
                    str = "۟ۤ۟ۚۦۛۙ۬ۖۘ۫۬۠ۤ۬ۜۡۗۖۗۧۗۖۜۨ۟";
                    break;
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        Context context;
        int i5 = 0;
        Context context2 = null;
        OnThemesActivity onThemesActivity = null;
        d dVar = null;
        ArrayList arrayList = null;
        OnThemesActivity onThemesActivity2 = null;
        Iterator it = null;
        OnThemesActivity onThemesActivity3 = null;
        q.b bVar = null;
        d dVar2 = null;
        String str = "ۗۜۘۜۦ۫ۘ۫ۡۚ۟ۨۘۜۜۤۢ۫ۡۚۧ";
        while (true) {
            switch ((str.hashCode() ^ 253) ^ -2045792877) {
                case -2143236979:
                    switch (this.f1862a) {
                        case 0:
                            str = "۫۠ۛۛ۫ۥۘۚ۬ۙ۬۬ۙۨۧۢ۠ۡۧۘ";
                            context = context2;
                            break;
                        default:
                            str = "۠ۧۡۡۘ۬ۧۛۖۧ۫ۨۘ۬ۧ۬۫ۛۖۘ";
                            context = context2;
                            break;
                    }
                case -1820387564:
                    String str2 = "ۙۤۖۘۚ۟ۤۡۛۥۘ۬ۢ۠ۜ۫ۨ";
                    while (true) {
                        switch (str2.hashCode() ^ 1792977290) {
                            case -1687484159:
                                str = "ۙۧۢۧۚۘۤۘۘۘۧ۟ۙۧۡۜۘۨۛۖۦۨۜۘ۬ۛۖ";
                                context = context2;
                                continue;
                            case 1380462584:
                                str2 = "ۧۡۨۘۖۚۛ۠۫۠۫ۡۛۦۜۗۧۡۙۡ۠ۨۦ۫ۖۘۧ۫ۤ";
                                break;
                            case 1493023338:
                            case 1847133476:
                                if (!it.hasNext()) {
                                    str2 = "ۥۤ۟ۢۘۚۧۚۨۘ۫ۡۜۥ۬ۡۗۖۚ";
                                    break;
                                } else {
                                    str2 = "ۘۖۙۥۖۘۘۘۜۤۨۡۘۨۧۛۗ۟ۚۚۡۘۨۗۦۚۘۗ";
                                    break;
                                }
                        }
                    }
                    break;
                case -2092783299:
                    str = "۠ۥ۟ۥۛۨۚ۫ۙۗۨ۫۟ۥۘۘۗۦۜۘۙۦۦۘۗۢۡۘ";
                    context = context2;
                    break;
                case -1782481424:
                    String str3 = "ۤ۫ۥ۠ۘۜۘۖۦۥۘ۠ۡۖۘۗ۟ۤۧۜۤ۠ۤۡۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 780146625) {
                            case -1052063763:
                                str = "۠۟۟ۛۗۜۘۧۛۥ۫ۡۦۘ۠ۖ۫ۦ۬ۥۗۖۨۘۜ۫ۖۘ۬ۧۤ";
                                context = context2;
                                continue;
                            case -21054381:
                                str = "۟۟ۡۢۘۚۖۦۜۚ۟۠۟ۖۡۘۡۥۜۥۜۙۥۛۨۘ";
                                context = context2;
                                continue;
                            case 139969570:
                                str3 = "ۚۥ۫ۖۜ۬ۛۙۧ۠ۙۦۥۧۥۘۥۡۧ";
                                break;
                            case 2105892391:
                                if (i5 >= 1) {
                                    str3 = "ۙۥۧۙ۫ۡۘۗۙۡۤۗۧۥۡ۠۟ۛ۠ۗۨ۠ۥۧۦۤۨ";
                                    break;
                                } else {
                                    str3 = "ۡ۬ۢۛ۬ۥۨۙ۫۫ۦۨۨۥۤ۠ۙۨۙۘۦۥۧۦۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1721787881:
                    arrayList.add(bVar);
                    str = "ۤۚۖۥۖۧۘ۫۠ۦۥۜۛ۠ۤۥۘ";
                    context = context2;
                    break;
                case -1618247614:
                    dVar2 = onThemesActivity2.f1337a;
                    str = "ۢۧۘۤ۠ۘ۠ۦۦۧۘۖۘۛۗ۠ۘۛۖۘ";
                    context = context2;
                    break;
                case -1349662920:
                    str = "۬ۡۥۘ۬ۥۦۤۤۙۦ۫ۡۥۘ۬ۦۨۜۢۗۚۦۘ۬ۨۜ";
                    context = context2;
                    break;
                case -1310313716:
                    i5 = charSequence.length();
                    str = "۫ۖۛۨ۠ۨۙ۬۬ۢ۬ۥۥ۫ۡۘ";
                    context = context2;
                    break;
                case -1308764816:
                    str = "ۢۥ۟ۚۤۤۜۚۥۘۥۛۜۘ۬ۦۧ۠ۦ۟ۛۚۘۚۥۡۖۤ۫";
                    onThemesActivity3 = onThemesActivity;
                    context = context2;
                    break;
                case -1108225128:
                    str = "ۛۚۡۘۦۜۖۘۚۥۗۦ۠۠ۜۢۥۚ۟ۜۘۛ";
                    context = context2;
                    break;
                case -1091962864:
                    str = "ۙۨۖ۟۠ۖ۬ۚۘۛۘۥۘۥۨۘ۫ۨۥ۠ۤۡۢۛۖۘ۟ۨۖ";
                    onThemesActivity = (OnThemesActivity) context2;
                    context = context2;
                    break;
                case -1075649710:
                    onThemesActivity3.b();
                    str = "ۤۨۦۛۜۧۘۖۥۚ۠ۧۡۘۙۚۘۥۙۨۖۧۚ۫ۦۘۡۚۧ";
                    context = context2;
                    break;
                case -894398876:
                    dVar.f2396b = onThemesActivity.f1338b;
                    str = "ۗۚ۬۠ۗۜۘۚۢۗۗۦ۬ۦۢۙ۠ۥۡ";
                    context = context2;
                    break;
                case -592297561:
                    dVar.notifyDataSetChanged();
                    str = "ۤۜۖۢۖۡ۟ۗۙۦۛۨۘۚۧ۠ۜ۬ۦۘ";
                    context = context2;
                    break;
                case -549329090:
                    arrayList = new ArrayList();
                    str = "ۢۦۨۛۙۖۥۚۦۘ۠ۨۙۢۙۨ";
                    context = context2;
                    break;
                case -288998488:
                    it = onThemesActivity2.f1338b.iterator();
                    str = "ۜۥۥۘۗۨۘۤۗ۬ۘۥۜۢ۬ۨۨۙۘ";
                    context = context2;
                    break;
                case -278002566:
                    dVar = onThemesActivity.f1337a;
                    str = "۠ۡۨۤ۫ۜۜ۠ۦۘۘۛ۫۟ۛۡۡۥۢ۟۬";
                    context = context2;
                    break;
                case -63992293:
                    String str4 = "۠ۚۧۜۧۘۨۘ۠ۢۘۦۘۢۛۖۚۦۖ";
                    while (true) {
                        switch (str4.hashCode() ^ 921055697) {
                            case -1665898040:
                                str = "ۙ۬ۤۙۘۖ۫ۜۧۜۡ۟۟ۜۦۨ۬ۜ";
                                context = context2;
                                continue;
                            case 204151598:
                            case 494650868:
                                if (!bVar.f2381a.toLowerCase().contains(charSequence.toString().toLowerCase())) {
                                    str4 = "ۧۥۖۘۧۖ۫ۜۢۜۘ۬ۢۢۛۚ۬ۨۙۨۘ۬ۢۘۘۖ۟";
                                    break;
                                } else {
                                    str4 = "ۨۛ۫۠۟ۜۦ۫ۥۖۜۨۗ۟ۥۘ";
                                    break;
                                }
                            case 529538579:
                                str4 = "۫۟ۘۘۗۡۙ۬۠ۧ۠ۥۦۘۜۖۢ";
                                break;
                        }
                    }
                    break;
                case -223862233:
                    str = "ۜۥۥۘۗۨۘۤۗ۬ۘۥۜۢ۬ۨۨۙۘ";
                    context = context2;
                    break;
                case -215668058:
                    str = "ۘۢ۫ۦ۟ۨۘۥۧۗ۠ۘۛۡۛۨۘ";
                    context = context2;
                    break;
                case 171855254:
                    str = "۬۫ۛۗۛۙۙۥۗ۠ۢۖۘۜ۬ۛ";
                    bVar = (q.b) it.next();
                    context = context2;
                    break;
                case 853246161:
                    dVar2.f2396b = arrayList;
                    str = "۠ۨۦۘۛ۬ۨۘۖۦۦۘۛ۟ۡۦۡ۟ۨۘ";
                    context = context2;
                    break;
                case 977040934:
                case 1077608116:
                    return;
                case 1183784188:
                    str = "ۥۗۜۜۤۙۡۥۘۜۚ۠ۤۜ۟ۨۘۥۥۢ۟ۚۛۗۖۖۦ";
                    context = context2;
                    break;
                case 1215859221:
                    str = "ۡۨۢۖۙۖۖۗۙۧۚ۬ۛۘۨۘ";
                    onThemesActivity2 = (OnThemesActivity) context2;
                    context = context2;
                    break;
                case 1467353692:
                    str = "ۨۘۖۜۤۥۜۡۘۡ۠ۧۙۦۖۜۨۗۡۢۥ";
                    context = context2;
                    break;
                case 1536084762:
                    dVar2.notifyDataSetChanged();
                    str = "ۜۨۛۗۥۛۥ۟ۘۚۤۡۘۤۚۗۛۚ۠۫ۢۨۘۚۛۧ۬۠ۡۘ";
                    context = context2;
                    break;
                case 1768210020:
                    str = "ۜۨۗ۫ۢۨ۫ۦۜۢۧۖۦۖ۠";
                    onThemesActivity3 = onThemesActivity2;
                    context = context2;
                    break;
                case 2032236593:
                    str = "ۦۤۡۘۡ۬ۘۘۜۜ۫۟۠ۜۖ۬ۘۘ۠ۗۛ";
                    context = this.f1863b;
                    break;
                case 2041211937:
                    str = "ۦۨ۫ۤۥ۬ۛۢۨۘۙۤۧۘ۟ۜۗۡۚۥ۫ۢۚۜۦۘ";
                    context = context2;
                    break;
                default:
                    context = context2;
                    break;
            }
            context2 = context;
        }
    }
}
