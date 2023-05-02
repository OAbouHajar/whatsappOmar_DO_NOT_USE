package rc.whatsapp.conversation;

import a.a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import com.AssemMods.translator.Language;
import com.google.gson.internal.i;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.YTranslate;
import l.b;
import m.m;
import okhttp3.OkHttpClient;
import okhttp3.Request;

@SuppressLint({"AppCompatCustomView"})
public class translateImageButton extends ImageButton {

    /* renamed from: c  reason: collision with root package name */
    public static final int f2478c = 0;

    /* renamed from: a  reason: collision with root package name */
    public OkHttpClient f2479a;

    /* renamed from: b  reason: collision with root package name */
    public String f2480b = "x";

    public translateImageButton(Context context) {
        super(context);
        init(context);
    }

    public translateImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public translateImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(context);
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Cloneable] */
    /* JADX WARNING: type inference failed for: r4v14 */
    public final void a(View view) {
        String[] strArr;
        String str = "ۤۡ۬ۛ۫ۦۢۧ۫ۦۦۥۘۚ۫ۛۙ۬ۡۘۥ۬ۡۤۥۜۘۛۨۡۘ";
        CustomAlertDialogBuilder customAlertDialogBuilder = null;
        ? r4 = 0;
        String[] strArr2 = null;
        Activity activity = null;
        while (true) {
            switch ((str.hashCode() ^ 102) ^ 1063003811) {
                case -2044347616:
                    customAlertDialogBuilder = new CustomAlertDialogBuilder(activity);
                    str = "ۖ۠ۨۛۖۚۛۘۤۗۙۖۘۥۨۡۘۥۚۙ۬ۢۦۥۤۢۢۚۢ";
                    strArr = r4;
                    break;
                case -1871599004:
                    str = "۠ۦ۬ۙۤۡۗۜۖ۟ۛۧۡۤۜۘۦۘۘۛۛۜۘۢۧ۬";
                    strArr2 = yo.getCtx().getResources().getStringArray(yo.getID("translation_to_preference", "array"));
                    strArr = r4;
                    break;
                case -1790686133:
                    str = "ۜۦۚ۫ۤۨ۬ۖۡ۟ۥ۠ۖۘۤ";
                    strArr = r4;
                    break;
                case -294360917:
                    strArr2[0] = yo.getString("Make_your_selection");
                    str = "۠۬ۘۘۨۘۦۜۢۜۗ۫۟۠ۧۚۦۤۗۚۛۤۤۥۘۘۗۡۘ";
                    strArr = r4;
                    break;
                case 593036252:
                    str = "ۤۢ۠ۖۢۖ۬۬۠ۧۘۜۘۢ۫ۥۘۨۥۨۘ";
                    strArr = r4;
                    break;
                case 661814378:
                    r4[0] = Language.ENGLISH;
                    str = "ۙۥۖۥۦۜۘ۬ۥۨۛۖۥۘۘۧ";
                    strArr = r4;
                    break;
                case 971022366:
                    activity.runOnUiThread(new b(customAlertDialogBuilder, 1));
                    str = "ۧۗۨۘۦۨۗۧۡۜۙۤۛۧ۫ۦۡۤۨۜ۠ۦ";
                    strArr = r4;
                    break;
                case 1228564626:
                    customAlertDialogBuilder.setItems((CharSequence[]) strArr2, (DialogInterface.OnClickListener) new m(this, r4, view, 2));
                    str = "۟ۧۚۦۥۢۧ۟ۛۤ۠ۤۙۤۥۜۢۧۨۥۘۤۛۦ۠ۨۖۘ";
                    strArr = r4;
                    break;
                case 1608394341:
                    str = "ۥۜۧۘ۫ۦۘۘۙۖۘۦ۠ۡۘۗ۟ۘۘۦۧۛ۫ۛۨۚۖۘۧ۠ۧ";
                    activity = (Activity) getContext();
                    strArr = r4;
                    break;
                case 1657133738:
                    str = "ۚۨۨۘۨۖۨۘۖ۫ۘۛ۫ۡۘۗ۟ۘ۬۠۫ۢۢۨۘۢۚۦۘ";
                    strArr = yo.getCtx().getResources().getStringArray(yo.getID("translation_to_preferenceVals", "array"));
                    break;
                case 1929177945:
                    return;
                default:
                    strArr = r4;
                    break;
            }
            r4 = strArr;
        }
    }

    public final void b(View view) {
        String str = "ۥ۫ۦۘ۠ۖۘۘ۟ۘۘۜۖۧۧۥۤ";
        Request request = null;
        String str2 = null;
        Conversation conversation = null;
        while (true) {
            switch ((str.hashCode() ^ 10) ^ -2060401670) {
                case -2053021082:
                    str = "ۦۙ۟ۗ۬۬ۥ۟۟۬ۧۙۜۡ۠۬ۢ۬";
                    conversation = (Conversation) getContext();
                    break;
                case -1047122246:
                    str = "ۚۧۚ۠ۖۦ۬۠۬ۦۤۨۘۧۥۘۘ";
                    break;
                case -970711943:
                    a(view);
                    str = "ۗۦ۟۠ۡۡۗۨ۟ۥۨۖۘۧۤ۫ۖۥۤ";
                    break;
                case -772787281:
                    a.i("no_empty_message", yo.getCtx(), 0);
                    str = "ۨۡ۫ۢۗۤۡۨۘۗۤۡۘۖ۬ۡۘۧۤ۬ۧۤۜۘ۬۠۟ۖ۫۠";
                    break;
                case -700957263:
                    str = "ۢۤ۠ۚۡۛۡۢۜ۟۟ۨۡۢۥ۫ۜۦۦۛۨۥۧۘۤۜۥ";
                    break;
                case -503167642:
                    str = "ۢۘۥۘۚۙۡۨۤۡ۟ۚۜۗۧۢۤۘ۠";
                    str2 = conversation.getMentionableEntry().getText().toString();
                    break;
                case -312266615:
                    this.f2479a.newCall(request).enqueue(new i(this, conversation, 6));
                    str = "ۚۚۡۘۚۚۛۡۢۦۘۡ۠ۡۤۤۦ۫ۘ۬ۧ۫ۧۜۛ۬۟ۨۨۘ";
                    break;
                case 60368207:
                    String str3 = "ۤۖۘۘ۬۬۫ۧۨۖ۟ۦۖۘۦۦۖۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 1300250663) {
                            case 64511488:
                                if (!this.f2480b.equals("x")) {
                                    str3 = "ۨ۠۠ۤۜ۬ۖ۟ۜۚۥ۫ۜۨۡۦۖ";
                                    break;
                                } else {
                                    str3 = "ۥۢۖۘ۟۫ۜۘۜ۠ۙۨۡۖ۬ۡۚۧۛۚ";
                                    break;
                                }
                            case 488975947:
                                str = "۟ۛۡۘۘۚۚۥ۠ۗ۟۟۬ۗۤۡۘۦ۬ۡۘ";
                                continue;
                            case 1495554884:
                                str = "ۨۖۜۘۘۙۡ۬ۘۖۙۡۖۧۜۦۘۢ۟ۧ";
                                continue;
                            case 1545151447:
                                str3 = "ۢ۫ۚۢۡۖۧۖۚ۟ۗۨۘ۟ۦۗ";
                                break;
                        }
                    }
                    break;
                case 570958551:
                case 1015722042:
                case 1392311891:
                    return;
                case 683550303:
                    String str4 = "ۨۗۜۖۙۥۘۦۜۥۘۘۨۧۚۚۘۘۜۤ۫ۜۘۧۤۧۧۙۧۚ";
                    while (true) {
                        switch (str4.hashCode() ^ 1340542085) {
                            case -1547055475:
                                str = "۫۟ۧۥۗۨۙ۬ۢۖۖ۬۫ۥ۠ۛۧۘۘ";
                                continue;
                            case -1322545647:
                                str4 = "ۡۗۡۘۢۖۡۘۛ۫ۤۤۢۘۡۧۙۥۘۤۢۚ";
                                break;
                            case -140390351:
                                str = "ۙۦۥۘ۠ۥۡۘۨۧۥۥۗ۫۟ۖۥۘ۫ۨۚۨۜۖۘۨۜۧۘ";
                                continue;
                            case 93685438:
                                if (!str2.isEmpty()) {
                                    str4 = "۬ۧۦۘۛۖۙۦۢۥ۠۬۟ۜۚۦۚۤ۟";
                                    break;
                                } else {
                                    str4 = "ۦ۠۫ۛۧۡ۠ۧۗۖۧۦۘۚ۫ۙ۫ۜ۫ۜۦ۟";
                                    break;
                                }
                        }
                    }
                    break;
                case 1407763426:
                    request = YTranslate.getTranslation_Y_request(str2, this.f2480b);
                    str = "ۘ۫۟۫ۖۙۦۥ۠ۡۖۡۤۛۚۥۘۙۥۚۗۙۤۜۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        r0 = "ۖۛۦۦۘۨۛۧۙۖۜۥۘۖۢۜۘۛۘۖ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void init(android.content.Context r9) {
        /*
            r8 = this;
            r7 = 1
            r2 = 0
            java.lang.String r0 = "ۦۡۦۡۖۥۘۥۡۤ۫ۡۘۖۡ۠ۗۧ"
            r1 = r2
            r3 = r2
        L_0x0006:
            int r4 = r0.hashCode()
            r5 = 87
            r6 = -1264453427(0xffffffffb4a1f8cd, float:-3.0169613E-7)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -1610816598: goto L_0x0048;
                case -1272569624: goto L_0x00cd;
                case -900523433: goto L_0x004d;
                case -669065880: goto L_0x0085;
                case -581711870: goto L_0x0015;
                case -543902901: goto L_0x0043;
                case -446562883: goto L_0x0069;
                case -252958942: goto L_0x008f;
                case 307992488: goto L_0x00cd;
                case 1145553850: goto L_0x00a9;
                case 1236091936: goto L_0x0018;
                case 1467636006: goto L_0x009d;
                case 1591997138: goto L_0x001b;
                case 1861401846: goto L_0x003d;
                case 2018433423: goto L_0x00bc;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r0 = "۟ۦۦۖۙۜۚ۟ۜ۬ۚۦۥۨۗ۠ۧۥۘ۠۬ۙ"
            goto L_0x0006
        L_0x0018:
            java.lang.String r0 = "۫ۤ۬ۢۖۛ۫۟ۜۖۜۖۢۥۤۗۜۘۘۤ۬ۢ۠۫۬ۢ۠ۗ"
            goto L_0x0006
        L_0x001b:
            r4 = -1352202530(0xffffffffaf6706de, float:-2.1011767E-10)
            java.lang.String r0 = "۫ۤۨۘۜۨ۬ۛۚۥۘۙۛۘ۠۟ۚ۟ۦۘ"
        L_0x0020:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1850271427: goto L_0x002f;
                case 651486467: goto L_0x0029;
                case 1147935720: goto L_0x00c9;
                case 1448522036: goto L_0x003a;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0020
        L_0x0029:
            java.lang.String r0 = "۫۠۫۠ۛۡۘۚۙۜۘۙۖۘۙۤۘۘ۟ۖۨۚۘ"
            goto L_0x0006
        L_0x002c:
            java.lang.String r0 = "۫ۤ۬ۚۙۡۜ۠ۙۡ۬۟۬ۦۘۥۥۦ"
            goto L_0x0020
        L_0x002f:
            java.lang.String r0 = "entry_translate"
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0, r7)
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "ۧ۠ۗۙۚۨ۫ۨۡۤۘۤۡۖۘۘ"
            goto L_0x0020
        L_0x003a:
            java.lang.String r0 = "ۨۚۘۥ۟ۢۗۨۜۚۖۜۡ۬ۗۙۜ۫۫ۨ۫ۢۦۘۧۨۗ"
            goto L_0x0020
        L_0x003d:
            r8.setVisibility(r2)
            java.lang.String r0 = "ۦۛۥۘ۠ۢۨۘ۬ۡۡۗۛۦۘۘ۫ۖۤۙۨۚۗۨۘۨۨۜۧ۟۠"
            goto L_0x0006
        L_0x0043:
            boolean r3 = r9 instanceof com.obwhatsapp.Conversation
            java.lang.String r0 = "ۥۜۤۚۦۙۤ۠ۖۖۗۧۛۨۡۘ"
            goto L_0x0006
        L_0x0048:
            boolean r1 = r9 instanceof com.obwhatsapp.youbasha.ui.YoSettings.IPreviewScreen
            java.lang.String r0 = "ۛ۠ۡۗۥۘۢۥۘۤۦۥۘۧۘۘۘ"
            goto L_0x0006
        L_0x004d:
            r4 = -1208339900(0xffffffffb7fa3244, float:-2.982573E-5)
            java.lang.String r0 = "ۤۧ۫ۧۘۙۡ۫ۖۘ۟ۘۥۧۧۙۜۜۧ"
        L_0x0052:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -647987629: goto L_0x00c5;
                case 254261994: goto L_0x0061;
                case 1405365570: goto L_0x005b;
                case 1647861896: goto L_0x0066;
                default: goto L_0x005a;
            }
        L_0x005a:
            goto L_0x0052
        L_0x005b:
            java.lang.String r0 = "ۦۚۡۘ۬ۤ۫ۛۡۗۖۢۥۨۤۖۜ۠ۚ"
            goto L_0x0052
        L_0x005e:
            java.lang.String r0 = "ۗۖۨۘ۠ۙۘۘ۠ۙۚۨۦۙۡۖۘۘ"
            goto L_0x0052
        L_0x0061:
            if (r3 == 0) goto L_0x005e
            java.lang.String r0 = "ۘۦۨ۠۠ۦۘۜۘۘۧ۬ۗۤ۟ۦۡۗ۠ۖۤۡۘۦۙ۟"
            goto L_0x0052
        L_0x0066:
            java.lang.String r0 = "ۗۚۧۡۜۘۘۜۙ۟۠ۙۜۘۜ۟ۢ"
            goto L_0x0006
        L_0x0069:
            r4 = -1184554265(0xffffffffb96522e7, float:-2.1852144E-4)
            java.lang.String r0 = "ۚۧۨۚۜ۫ۖۛۛۘۗۗ۬ۜ۠"
        L_0x006e:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1056413441: goto L_0x00c5;
                case -673296618: goto L_0x0082;
                case -179885817: goto L_0x007d;
                case 950813272: goto L_0x0077;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x006e
        L_0x0077:
            java.lang.String r0 = "ۧۗ۟ۛ۟ۨۧۖۦ۟ۜۨۢۥۨۘۛۢۦۘۦۧۨۘ۬ۥۡۘۨ۬۫"
            goto L_0x006e
        L_0x007a:
            java.lang.String r0 = "۟ۙ۬ۦۗۗۡ۠ۘۘۙۧۛۘۗۥ۫۠۠۬ۛۘۖۨۜۘ"
            goto L_0x006e
        L_0x007d:
            if (r1 != 0) goto L_0x007a
            java.lang.String r0 = "ۛ۬ۘۢۤۗۗۤۜۘ۫ۛۛۢۗۨ"
            goto L_0x006e
        L_0x0082:
            java.lang.String r0 = "۠ۤۛ۬ۗۘۘ۬ۗۘۘۡ۬ۚۦۘۖۤۦ۬ۜۚ۬ۘ۠۠"
            goto L_0x0006
        L_0x0085:
            okhttp3.OkHttpClient r0 = com.obwhatsapp.youbasha.task.YTranslate.getTranslation_Y_client()
            r8.f2479a = r0
            java.lang.String r0 = "ۨ۟۬ۚۢ۟ۖ۠۬ۦۡۨ۟ۢۙۧۖ"
            goto L_0x0006
        L_0x008f:
            c.c r0 = new c.c
            r4 = 16
            r0.<init>(r8, r4)
            r8.setOnClickListener(r0)
            java.lang.String r0 = "ۥ۠ۨۡۥ۬۫ۖۨۘۚۧۘۘ۠ۘۜۢ۬ۧ"
            goto L_0x0006
        L_0x009d:
            com.obwhatsapp.youbasha.ui.views.s r0 = new com.obwhatsapp.youbasha.ui.views.s
            r0.<init>(r8, r7)
            r8.setOnLongClickListener(r0)
            java.lang.String r0 = "ۖۛۦۦۘۨۛۧۙۖۜۥۘۖۢۜۘۛۘۖ"
            goto L_0x0006
        L_0x00a9:
            java.lang.String r0 = "ModChatBtnColor"
            int r4 = com.obwhatsapp.yo.ColorStore.getDefaultConversationEntryIconsColor()
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r4)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r8.setColorFilter(r0, r4)
            java.lang.String r0 = "ۘۦۙۨ۫ۢۢ۬ۧۘۘۖۖۡۛۢۛۧ۫۬ۨۘۡۙ۟ۖۡۨ"
            goto L_0x0006
        L_0x00bc:
            r0 = 8
            r8.setVisibility(r0)
            java.lang.String r0 = "۫۟ۖۘۜۛۖۘۙۙۥۛۧ۫۫ۧۡۘۧۛۖۘۚ۠ۦۘ"
            goto L_0x0006
        L_0x00c5:
            java.lang.String r0 = "ۖۛۦۦۘۨۛۧۙۖۜۥۘۖۢۜۘۛۘۖ"
            goto L_0x0006
        L_0x00c9:
            java.lang.String r0 = "۬ۧۦۙ۟ۚۖ۟ۖۦۜۙ۬ۢۘۘ"
            goto L_0x0006
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.whatsapp.conversation.translateImageButton.init(android.content.Context):void");
    }
}
