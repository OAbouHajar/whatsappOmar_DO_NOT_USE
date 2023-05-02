package com.obwhatsapp.yo;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.joom.paranoid.Deobfuscator$app$Custom;

public class CustomAlertDialogBuilder extends AlertDialog.Builder {

    /* renamed from: a  reason: collision with root package name */
    public boolean f538a;

    /* renamed from: b  reason: collision with root package name */
    public AlertDialog f539b;

    public CustomAlertDialogBuilder(Context context) {
        this(context, yo.getID(Deobfuscator$app$Custom.getString(-2734239874497L), Deobfuscator$app$Custom.getString(-2807254318529L)));
    }

    public CustomAlertDialogBuilder(Context context, int i2) {
        super(context, i2);
        this.f538a = false;
    }

    public AlertDialog create() {
        String str = "ۡۜۨ۬ۜ۠ۥۡۘۙۧۘۘۧۥۚۨۤۦ";
        while (true) {
            switch ((str.hashCode() ^ 540) ^ 1097630344) {
                case -1601467983:
                    return super.create();
                case 605321025:
                    str = "ۚۤۢۜ۠ۥۘ۠ۧۖ۠ۗۧۜۧۡ۫ۦۢ۠ۡۘۢۨۦۘ۠ۗۘۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r0 = "ۡۦۨۘۛ۟۟۟۫ۨۡۤۖۙۖۢۙۥۖۘۡۡۧۦۚۡۥۚۜ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dismiss() {
        /*
            r5 = this;
            r1 = 0
            java.lang.String r0 = "ۜۘۤ۬۬ۡۘۨۦۗۘۡۦ۫ۢۘۦۢۜ"
        L_0x0003:
            int r2 = r0.hashCode()
            r3 = 210(0xd2, float:2.94E-43)
            r4 = 304080349(0x121fe5dd, float:5.045488E-28)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -1629182012: goto L_0x0061;
                case -1569147770: goto L_0x0015;
                case -1311432951: goto L_0x0059;
                case -1281886344: goto L_0x001a;
                case -918951396: goto L_0x0039;
                case -787814291: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0003
        L_0x0012:
            java.lang.String r0 = "ۨۥ۠ۧۘۚۛ۫۟ۡۥۘ۫ۜۡۘۛۥۦ"
            goto L_0x0003
        L_0x0015:
            android.app.AlertDialog r1 = r5.f539b
            java.lang.String r0 = "ۧ۫ۡۘۘ۫ۨۚ۬ۘۘۗۡ۟ۚۡ۫۬ۜۘۜ۟ۧ"
            goto L_0x0003
        L_0x001a:
            r2 = -631610113(0xffffffffda5a64ff, float:-1.53681478E16)
            java.lang.String r0 = "ۧۛۙۖ۫ۨۘۙۜۚ۫ۧۤۜۜۘۢۙۘ۬۟ۖ"
        L_0x001f:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1157315776: goto L_0x002e;
                case -982302349: goto L_0x0036;
                case -942954039: goto L_0x0033;
                case 1758144443: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x001f
        L_0x0028:
            java.lang.String r0 = "ۡۦۨۘۛ۟۟۟۫ۨۡۤۖۙۖۢۙۥۖۘۡۡۧۦۚۡۥۚۜ"
            goto L_0x0003
        L_0x002b:
            java.lang.String r0 = "ۘۘۜۘۤ۟ۗۢۛۗ۠ۢۜۡۘ۫ۙ۬ۢۘۥۥۤۖۗ۟ۖ۟"
            goto L_0x001f
        L_0x002e:
            if (r1 == 0) goto L_0x002b
            java.lang.String r0 = "۫ۡۡۘۨۚۧۦۨۖ۫ۜۨۤۚۗ"
            goto L_0x001f
        L_0x0033:
            java.lang.String r0 = "ۡۛۛۘۢ۠ۦۖۥۛۨۘ۬ۢۥۤ۟ۖ۫ۡۙ"
            goto L_0x001f
        L_0x0036:
            java.lang.String r0 = "ۡۡۜۛ۬ۡ۫ۡۥۘ۫ۤۨۘ۠ۥۦۦ۫ۥۘ"
            goto L_0x0003
        L_0x0039:
            r2 = 1528713429(0x5b1e50d5, float:4.4561922E16)
            java.lang.String r0 = "۫ۛۜۧۗ۠۠ۜ۫ۥ۠ۢۢۚ۠ۜۖۘ"
        L_0x003e:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1968804601: goto L_0x004d;
                case -1352586238: goto L_0x0028;
                case 145639642: goto L_0x0056;
                case 1206325175: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x003e
        L_0x0047:
            java.lang.String r0 = "ۗ۫ۡۘۡۤۘۨ۠ۡ۫ۜ۫ۛ۫ۥۘ۟ۥۙۘۗۦۘ"
            goto L_0x0003
        L_0x004a:
            java.lang.String r0 = "ۗۤ۫۫ۘۨۘۖۘ۠ۖ۟ۥۘ۠ۦ۠ۖۧۥۧۘ۬ۢۖۘۡۥۧۘ"
            goto L_0x003e
        L_0x004d:
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "۟ۥ۟۟۟ۖۘۛۚۥۘۘۢۜۘۧ۬۠ۥۗۦۘۘۙۜ"
            goto L_0x003e
        L_0x0056:
            java.lang.String r0 = "ۚۖۥۖۛۚ۠ۚۜۘ۟۫ۡۨۦ۬ۖۜۘۘ۬۫ۢ"
            goto L_0x003e
        L_0x0059:
            android.app.AlertDialog r0 = r5.f539b
            r0.dismiss()
            java.lang.String r0 = "ۡۦۨۘۛ۟۟۟۫ۨۡۤۖۙۖۢۙۥۖۘۡۡۧۦۚۡۥۚۜ"
            goto L_0x0003
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.CustomAlertDialogBuilder.dismiss():void");
    }

    public Context getContext() {
        String str = "۠۟ۡۘۜۨۥۗ۟۟ۗۡ۬ۖۘۧۘۚۙۦ";
        while (true) {
            switch ((str.hashCode() ^ 838) ^ 1592305624) {
                case -1682153224:
                    str = "۬ۗۧۧۘۘۖۖۘۘۤۦۚ۫ۚ۬";
                    break;
                case 559706414:
                    return super.getContext();
            }
        }
    }

    public CustomAlertDialogBuilder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        String str = "۫۠ۗۧ۠ۤۛ۠ۛۨۦۦۘ۠ۦۧۜۙۢۗۚۡ۬۫ۤ۟ۚ۟";
        while (true) {
            switch ((str.hashCode() ^ 75) ^ 1027331472) {
                case -1341735579:
                    str = "ۖۨ۫ۤۛۤۜۙۖۢۘۘۡۚ۟ۨۘۢ۠ۦۦۘ";
                    break;
                case -1221901504:
                    return this;
                case -1160407496:
                    super.setAdapter(listAdapter, onClickListener);
                    str = "ۢۦۖۘ۟ۡۘۘۛ۠ۜۜۚۨۦۧۨۘۛ۟ۥۡۖۧۘ";
                    break;
                case -605919302:
                    str = "۠ۖۘ۬۫ۖۜۨۦۘۧۧۜۦۙۜۚۛۖۘ۬ۘ۟ۘۙۦۘ";
                    break;
                case 738104135:
                    str = "ۙۦۘۘۚۗ۟ۤۥۤۧ۬ۜۙۢۤ۬ۢۤۜۘۘۦۤ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setCancelable(boolean z2) {
        String str = "۬ۤ۫۟ۖۖۘ۟ۡ۬ۛۙۗۧ۬ۤۥۨۛ۠ۥۦۘ۟ۛۛۚ۫ۧ";
        while (true) {
            switch ((str.hashCode() ^ 900) ^ -1337360758) {
                case -853886249:
                    str = "۟ۡ۬ۢۜۖۡۨۤۨ۬۟۠ۖۡ";
                    break;
                case -620379701:
                    return this;
                case -34272203:
                    super.setCancelable(z2);
                    str = "۫ۘۡۘ۠۟ۜۘۧۗ۠۠ۦۖۘۙۗۦۘۙۥۡۘۚۡۘ";
                    break;
                case 78614764:
                    str = "ۧۦۦۖۢۜۘ۫ۢ۬۟ۘۛۗۢ۠";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        String str2 = "ۖۢۡۘ۟۬ۢۥۚۢۥ۠ۦۦۜ۬ۨۨ";
        while (true) {
            switch ((str2.hashCode() ^ 428) ^ 1287126964) {
                case -1969136297:
                    str2 = "۬ۧۦۘۚۢ۠ۛۚۨۢۖ۬۠ۤۛ۟ۨ۫ۛۗۙ۟ۘۤ";
                    break;
                case -574267235:
                    return this;
                case -138171093:
                    str2 = "ۨۘۨۡۘۘۗۧ۬۠ۚۘۘۙۗۖ۫۠ۘۧۡۧۜۧۢ";
                    break;
                case 67057146:
                    super.setCursor(cursor, onClickListener, str);
                    str2 = "۬ۙ۠۟ۦۛۖۖ۬ۚۥ۠ۡۧۤۙۥۖۢۤ۟۬";
                    break;
                case 251489950:
                    str2 = "ۖۧۚ۬۟ۧۢۨ۠ۖۚۙۙۨۥۘ۬ۘ۫ۖۨۙ";
                    break;
                case 816556968:
                    str2 = "ۖۧۦۖۤۚ۟ۡۡۘۤۗۜۘۙۘۖۘۥۢۦۘ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setCustomTitle(View view) {
        String str = "ۦۚۜۢۜۨ۫ۖۤ۬ۙۙۛۗۜۘ۟ۗۘۘۤۥۧۛۘ۬";
        while (true) {
            switch ((str.hashCode() ^ 214) ^ 1495919324) {
                case -1142455528:
                    str = "ۤۚۚۘۖۘۘۖ۫ۘۘ۬ۜۗۧۜۜۧۙۤۜۚۦۚۛۘۘۘ۫ۖ";
                    break;
                case -492972570:
                    super.setCustomTitle(view);
                    str = "ۤۧۙۚ۟ۙۦ۬ۡۘۡۖۜۘۨۦۘ۟ۜ۬ۛۛ۟";
                    break;
                case 1382907327:
                    str = "ۧۜۥ۠۬۫ۘۦۚۤۜۦ۠ۗۨۤ۟ۘۤ۠ۥۘ";
                    break;
                case 2059330836:
                    return this;
            }
        }
    }

    public CustomAlertDialogBuilder setIcon(int i2) {
        String str = "۫ۜۧۘۗۡۜۢۙ۫۫۟ۡۘۧۙۧ";
        while (true) {
            switch ((str.hashCode() ^ 160) ^ 223170280) {
                case -1789879929:
                    return this;
                case -375260264:
                    str = "ۙۚۗۡ۬۠ۖۡۖۘۤۙۗۗۧۜۘ۟ۥۧۘۛۛۚ";
                    break;
                case -174039095:
                    super.setIcon(i2);
                    str = "ۙۙۚۤۦۢۤۛۡۘ۠۠۟ۨ۟ۢۜۧۗۖۦۡۤۨۘ";
                    break;
                case 1191391822:
                    str = "۬ۘۡۜۤۖۘۘۢۦ۬۬ۥۤ۬ۘۘ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setIcon(Drawable drawable) {
        String str = "ۘۧۜ۠ۧ۫ۚۘۘۘۛۖۙۙۙۘۘۖۦۥۨۦۦۘۢ۟ۗ";
        while (true) {
            switch ((str.hashCode() ^ 234) ^ 707674578) {
                case -1982637050:
                    str = "ۥ۟۟ۘۛۡۙۗۥۖۜۥۘۢۗۤۜۢۨۘۢۜۜۘۜۥۗۥۦ۬";
                    break;
                case -1586021182:
                    super.setIcon(drawable);
                    str = "ۨۦۧۘۚ۠ۙ۬ۚۖۥۙۖ۠ۛۢۨۧۘۘ";
                    break;
                case -1290586359:
                    str = "ۥۚۜۘۖۜۡۘۛۚۨ۬ۘۥۘۢۤۖۘۧۚۨۧۧۢۥۙۙ";
                    break;
                case 261811504:
                    return this;
            }
        }
    }

    public CustomAlertDialogBuilder setIconAttribute(int i2) {
        String str = "ۡ۫۬ۤۘۡ۟ۗۦ۫۟۫ۢ۠ۢۛۥۚۖ۫۬ۡۡۙۨۛۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 208) ^ -819502115) {
                case -1759614844:
                    str = "ۨۖۖۘۖۢ۠۬ۡ۟ۛۢۙ۫ۧۦۘ";
                    break;
                case 711046027:
                    return this;
                case 1187731041:
                    str = "ۤ۫۟ۗۖۦۡ۫ۖۜۗۛۤۥۘۜۜ۟ۥۖۥ";
                    break;
                case 1207759479:
                    super.setIconAttribute(i2);
                    str = "ۢۡۘۘۤۧۨۘۨۖۙۡۙۜۜۖ۫ۦ۠ۧ۬ۘۦۘ۟۠";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setItems(int i2, DialogInterface.OnClickListener onClickListener) {
        String str = "ۥۤۗۙ۟۬ۧۛۥۘ۬ۘۘ۫ۜۤ۠ۦۙۨۤ";
        while (true) {
            switch ((str.hashCode() ^ 996) ^ 1713612035) {
                case -1139251180:
                    str = "ۛۙۡ۠ۦۧۘۨۨۚۡ۫ۧ۫ۤۖۘۦۛۥ۫ۥۦۘۛ۫ۘۘۚ۫ۨۘ";
                    break;
                case 1296943735:
                    return this;
                case 1352662772:
                    str = "۠ۥۗ۟ۦۙۤۧۗۙۗۡۘ۠ۘۜ";
                    break;
                case 1451287836:
                    super.setItems(i2, onClickListener);
                    str = "۫ۚۦۘۡ۬ۤۜۜۧۥۧۦۘ۟ۡۨۘۢۚۚۙۥۥۘۛ۫۬";
                    break;
                case 1696133138:
                    str = "۫۬ۜۚۨۥۘۚ۫ۧ۟ۡ۫ۜ۟ۥ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        String str = "ۘۗۘۘۡۙۛۦۡۦۘۥۛۢۖۗۦ";
        while (true) {
            switch ((str.hashCode() ^ 405) ^ -1168130492) {
                case -719384655:
                    str = "۫۫۠ۜ۠ۦۘ۠ۜ۬ۗۤۖۘۤۘۦۘۚۢۨۦۜۡۦ۫";
                    break;
                case 322642203:
                    str = "ۗۦۖۘۚۦۦۘۤۤۙۥ۬ۡۘۧۢۚ۠ۛۥۘۚۢۚ۠ۦۡ";
                    break;
                case 433692039:
                    return this;
                case 442353038:
                    super.setItems(charSequenceArr, onClickListener);
                    str = "ۜۨۗۖ۟ۦۡۥۘۘۨۚۥۘۘۤۛۘۘۧۘۜۘۘۚۥۘ";
                    break;
                case 1856584447:
                    str = "ۡۙۗۧۥۥۧۢۨۘۥۢۥۘۦۨۥ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setMessage(int i2) {
        String str = "ۡۖ۫۠ۙۖۦۙۘ۟ۢۖۘۘۧۘۘۧۙۥ";
        while (true) {
            switch ((str.hashCode() ^ 727) ^ 416824618) {
                case -1513520388:
                    str = "ۙۖۡ۟ۤۘۘۖۧۜۘۗۥۘ۟ۦ۬ۜۚۖۨۡۗ۟۠ۧ";
                    break;
                case -240877417:
                    return this;
                case 586912632:
                    super.setMessage(i2);
                    str = "۬۠۫۬۫ۡۦۡۜ۟ۗ۫ۛۘۤ";
                    break;
                case 2112349298:
                    str = "ۛۚۛۨۚ۫ۛۜۚ۠ۢۦۘۜۘۥۨۡۖۢۘ۟ۜۗۥ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setMessage(CharSequence charSequence) {
        String str = "ۢۚۛۡۜۚۡۨۡ۠ۗۤ۫ۥۜۘۚ۠ۚۙۚۘ";
        while (true) {
            switch ((str.hashCode() ^ 8) ^ -1884974952) {
                case -1824083400:
                    str = "ۙۙۘۘۤۡۨۘ۠۫ۥۘ۬۟ۡ۬ۘۨۘ۫ۡۧۘ";
                    break;
                case -1256720734:
                    super.setMessage(charSequence);
                    str = "ۗۡۘ۟ۦۥۘ۬۠ۜۘۜۧۖۘۙۘۜ";
                    break;
                case 156864470:
                    str = "ۨۨۥ۟ۙۙۘۗۢۗۖ۠۟ۗۖ۟ۘۛۚۧ۟ۖۢۖۗۢۥۘ";
                    break;
                case 1600192904:
                    return this;
            }
        }
    }

    public CustomAlertDialogBuilder setMultiChoiceItems(int i2, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        String str = "ۢۛۗۙۥۖۘ۬ۘ۟ۢ۫ۦۘۖ۫۟ۗۡۗ۫ۥۥۘۨ۫۟ۡۧۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 930) ^ 1798950085) {
                case -1838740755:
                    str = "۬ۡۤۘۘۧۘۜۡۖۗ۫ۡۘ۬ۨۦۜۙۗۗۥۙۘۦۘ";
                    break;
                case -756784117:
                    str = "۟ۗ۬ۤ۟ۥۘۤۚۢۤۜۜۢۗ۬۟۬ۨۧۥۘۛۧ۟ۧۨۚ";
                    break;
                case 358928639:
                    super.setMultiChoiceItems(i2, zArr, onMultiChoiceClickListener);
                    str = "ۘۧۦۥۛۗۦ۬ۖۦۨۨۢۘۖۜۦۘۘۢۗۨۘ۫۫ۜۘ";
                    break;
                case 849308876:
                    return this;
                case 1204516133:
                    str = "ۨۧۖۘۦۢ۠۠ۦۖۘۖۜۘ۫ۨ۫ۧۨۦۘۦۧۥ";
                    break;
                case 1877822348:
                    str = "ۡۥۛۤ۟ۤۡۦۨۘۦۨۘۘۦۙۖۘ۬ۥۤۜۦۚ۟ۨۤ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        String str3 = "ۡ۟۫ۤۤ۠۠ۘۗۧۢ۟ۚ۟ۥۘ۟ۥ";
        while (true) {
            switch ((str3.hashCode() ^ 710) ^ -932118841) {
                case -1992130725:
                    super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
                    str3 = "ۡۜۛۘۦۡ۫ۜۗۢۧۦۘۚۙۙۥۙ۟ۙ۬ۤۦۧۗ";
                    break;
                case -1232670752:
                    str3 = "ۧۦۥ۫ۥۤ۬ۧۘ۠ۜۨۘۧۘ۠ۢۜ۫ۜۗۡۚۢ";
                    break;
                case -1142105433:
                    str3 = "ۚ۫ۜۘۗۘۗۥۧۛۜ۟ۖۖۘ۠۬ۜۘۧۖ۟ۗۦۨ۫ۨ";
                    break;
                case -1008073018:
                    str3 = "ۥۙۘۘۚۨۥۗۢۗۥۧۡۧ۬ۡۘۛۗۨ";
                    break;
                case 597970967:
                    str3 = "ۤۛۖ۬ۡۘۘ۠ۧۙۡۢۡۘۧۤۙ";
                    break;
                case 1947589714:
                    str3 = "۬۠ۨۘ۫ۦۧۙۧ۫ۥۜۨۡۦۜۧۧۜ";
                    break;
                case 1990033249:
                    return this;
            }
        }
    }

    public CustomAlertDialogBuilder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        String str = "ۥ۬۟ۗۢۤۦ۫ۡ۬ۡۘۘۗ۟۟۬ۘ";
        while (true) {
            switch ((str.hashCode() ^ 3) ^ 369753122) {
                case -1920435465:
                    str = "ۗۡۖۘۜ۟ۡۗ۟ۦۘۦۙۧ۫ۡۜۦ۬ۗۨۘۘ";
                    break;
                case -1586895566:
                    str = "۠ۗۜۘ۫ۢۜۘۨ۠ۖۘ۫ۡۚۥۙۖۘ";
                    break;
                case -1454188869:
                    str = "ۤۜۨۛۜ۠ۧۡۦ۟ۖۥۘۦۙۨۘۗۜۜۘۥ۬ۨ";
                    break;
                case -1004361329:
                    return this;
                case 5012248:
                    super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
                    str = "ۗۗ۠ۨۚۥۘ۟۬ۦۙۡۢۜۘۨۥۨۙۧ۬ۥۜۚ";
                    break;
                case 1364315380:
                    str = "ۥۗۜ۠۟ۥۧۡۚۛ۫ۚۥ۠ۘ۬ۛۜۘۤۨ۟";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setNegativeButton(int i2, DialogInterface.OnClickListener onClickListener) {
        String str = "۟ۤۥۘۘ۠ۢ۟ۦۚ۫ۗۤۢۙ۫ۖ۠ۘۧۗۗۙۛ";
        while (true) {
            switch ((str.hashCode() ^ 450) ^ -564480225) {
                case -820669770:
                    str = "ۢۧۤۡۘۖۘۙۢۡۙۘۤ۫ۙ۬ۗۚۢۡۚۛ";
                    break;
                case 559213662:
                    super.setNegativeButton(i2, onClickListener);
                    str = "ۢۚ۠۫ۘۘ۬ۧۜ۬ۤۙۢ۫ۦ۠ۧۚۖ";
                    break;
                case 765569569:
                    str = "ۖۖ۠ۨۨۘۘۨ۟ۡۘۤۨۙ۬۟ۛ۠ۖۦۜ۫ۡ";
                    break;
                case 1713691072:
                    return this;
                case 1761981013:
                    str = "۠۠ۧۨ۟ۗۛ۬ۙ۬۬۠ۧۥۧۘۤۙۥۥۧۙۢۦۘۘ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        String str = "ۨۙۨۘ۬ۨۘۜۨۨۨۗۙۦ۟۬ۛ۠۫ۛۦۧۘۤۖ۬";
        while (true) {
            switch ((str.hashCode() ^ 827) ^ -471828738) {
                case -1660025647:
                    super.setNegativeButton(charSequence, onClickListener);
                    str = "ۚ۬ۡۙ۟ۥۡۜ۟۫ۘۢۜۖۘۘ۬ۜۖۘۘۖۖ۬ۗۨۘ۟ۛ۠";
                    break;
                case -1230062713:
                    str = "ۗۚۦۚۢۥۘۨۥۥۘ۟ۧۙۚۦۥۘۡۜ۬ۛۡۦۦۘۙ";
                    break;
                case 239568446:
                    str = "ۦۢۖ۬ۦۘۜۛۜۡ۬ۛۙۤۨۘ۫۬ۧ";
                    break;
                case 1095213819:
                    return this;
                case 1457299091:
                    str = "ۤ۟۫۫۫ۡۘۘۦۚۡۢۡۘۡۗۖۘۗۢۛ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setNeutralButton(int i2, DialogInterface.OnClickListener onClickListener) {
        String str = "ۡۗۙ۫ۢۡۘۙۗ۠ۤۦۢۗ۬ۦۘۤۧۡۘۡۜۤ";
        while (true) {
            switch ((str.hashCode() ^ 90) ^ -1550345536) {
                case -1536510205:
                    str = "ۗۤۢۢۚۙۛۨۘۡۚۦ۟ۧۚۖۡۨۘۡۖۘۘۙ۬ۤ";
                    break;
                case -867108387:
                    str = "ۦۖۤۖۙۚۢ۟ۨۘۘۜۤۡ۫ۙۗ۬ۡۘۨۗ۠ۚ۠ۛ";
                    break;
                case -634275275:
                    super.setNeutralButton(i2, onClickListener);
                    str = "ۛۜ۬ۡۦۢۦۜ۟ۗۨۦۘ۫ۨۨۤۤۖۘۙۨۡۘۢ۟ۥ۫۫۟";
                    break;
                case 720068711:
                    str = "۬ۗۡۡۚۖۘۥ۬ۘۘ۫ۚۜۘۙۤۙۚۤۦۘ";
                    break;
                case 1631958506:
                    return this;
            }
        }
    }

    public CustomAlertDialogBuilder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        String str = "ۥۜۖ۟۬ۡۘۛۛۥۦۚۙۥۘۘۛۦۤ";
        while (true) {
            switch ((str.hashCode() ^ 244) ^ 423358741) {
                case -1572727185:
                    str = "۠ۛۡۘۤۙۤۧ۟ۛۜۛۘۘۛۥۖۘ۠ۗ۫";
                    break;
                case -1201448224:
                    super.setNeutralButton(charSequence, onClickListener);
                    str = "ۛۜۗۜ۫ۧۖۛۤ۬ۨۤۡۢۤۘ۫ۙۘۦۘ";
                    break;
                case -633257059:
                    return this;
                case 657814530:
                    str = "ۜۤۥۘۗ۠ۘۨۨۧۗ۬ۛۤۤ۟ۦۘۘۡۘۨۘ";
                    break;
                case 1473681174:
                    str = "ۙۚۨ۫ۧ۟۬ۙۛۡ۟ۦۘ۫ۘۘۘۗۦۚۢۛۗۡ۬ۡۢ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        String str = "۠ۢۧۜۛۘۘۡۢۘۘۧۡۘۤ۟۟";
        while (true) {
            switch ((str.hashCode() ^ 293) ^ -1347198371) {
                case -576445645:
                    str = "ۘۥۚ۠۫۠ۡۢۜۘۤۤۡۛ۫";
                    break;
                case 592798855:
                    super.setOnCancelListener(onCancelListener);
                    str = "ۤۜۨۘۚۧۥۘۤۚ۬ۧۤۡۘۦۛ";
                    break;
                case 840602324:
                    str = "ۨ۠ۗۤۘ۠ۖۡ۟۫ۖ۬ۜۡ";
                    break;
                case 2041115759:
                    return this;
            }
        }
    }

    public CustomAlertDialogBuilder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        String str = "۬ۘۡۖۗ۠۠ۡۦۘۥۙۤۢۦۛ۠ۦۧ۫ۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 70) ^ -646209414) {
                case -455844366:
                    return this;
                case 35777817:
                    str = "ۜۦۘۘ۬۠ۜۨ۠ۦۗۚۗۗۨۖۘۜۡۚ";
                    break;
                case 975550306:
                    str = "۠۠ۡ۠۠ۡۘ۠ۙۡۛۨۨۙۨۧ۫ۗۡۙۡۤۦۜۘۘ";
                    break;
                case 1844157206:
                    super.setOnDismissListener(onDismissListener);
                    str = "ۗۙۖۘۙۖۦۘۡۘۘ۟ۥۖ۠ۦۜۜۦۨۘۜۤۨۛۥۦۘ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        String str = "۫ۛۡۘۚۢۖ۠ۡ۠ۦۦۗۘۥۢۘۖۖۘۛۥۜۘۦۜۙۜ۠ۘ";
        while (true) {
            switch ((str.hashCode() ^ 34) ^ -1313752996) {
                case -1206570335:
                    str = "ۙۤۙۘ۫ۗۖۚ۠ۚ۬۬ۢۥۦۡۨۨۘ";
                    break;
                case -533184013:
                    str = "۠۬ۢ۠ۚ۬ۨۚ۟ۗۢ۟ۨ۠ۚ";
                    break;
                case 314794111:
                    return this;
                case 592822456:
                    super.setOnItemSelectedListener(onItemSelectedListener);
                    str = "ۨۚۦۨۗۢۗۜۦۘۜ۫ۗ۫۫ۢۥۨۦۤۢۨۢ۬";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        String str = "ۢۖۧۘۧۨۚۦۧۗ۬۫ۤۦ۟ۢ۠ۧۤ۬ۘۙ";
        while (true) {
            switch ((str.hashCode() ^ 372) ^ 1337244690) {
                case -1183451435:
                    str = "ۤۘۜۘ۬ۨۧۘۦ۟۫ۜ۠ۘۘۢ۟ۙ۠ۘۘ";
                    break;
                case -617595589:
                    super.setOnKeyListener(onKeyListener);
                    str = "ۥۥۡۘۗ۠ۢۛۡ۫ۗ۬ۢ۠۬ۘۦۧۖۘ۬۠ۚ";
                    break;
                case 307377872:
                    str = "ۖۗ۠ۗۘ۫۫۠۬ۧۜۨۘۡۛۖۧۨۚۛۜۢ";
                    break;
                case 885855815:
                    return this;
            }
        }
    }

    public CustomAlertDialogBuilder setPositiveButton(int i2, DialogInterface.OnClickListener onClickListener) {
        String str = "ۘۖۡ۟ۚ۬ۘۨۨ۫ۦۘ۟ۘۛۥۤۥۢ۫ۖۘۥ۬ۧ۟ۧۥ";
        while (true) {
            switch ((str.hashCode() ^ 978) ^ -1442320712) {
                case -1916750372:
                    str = "ۧۨۜۧۢۥ۫ۢ۫ۖۦۥۥۦۨ";
                    break;
                case -1371130755:
                    str = "ۡ۠۬۬ۛ۠۠۠ۧۥۚۢۥۦۖۘ۠ۥ۬ۜۘۥۤۙ۠ۨۡۗ";
                    break;
                case 1277790984:
                    super.setPositiveButton(i2, onClickListener);
                    str = "ۡۘ۠۬ۜۢ۠ۗۛۥۧۘۤۚۘۘۨۖۧۙۢۘۘۥۥۥ";
                    break;
                case 1349131998:
                    return this;
                case 1399607797:
                    str = "ۚ۟ۧ۠ۘۤۛ۫۠۬ۤۘۘۘۗۧۗ۠۫۠ۨۖ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        String str = "ۧۢ۫ۜۗۡۘ۫ۢۡ۟۟ۙۘۥۘۥۢۜۘۚۙۤۙۢۡۤۛۨ";
        while (true) {
            switch ((str.hashCode() ^ 180) ^ 233502158) {
                case -1335960014:
                    super.setPositiveButton(charSequence, onClickListener);
                    str = "ۥۡۙۗۢۥۘ۟۬۬ۤۧۥۘۘۡۘۘۡۧۦۘۤ۟ۦۛۧۡ";
                    break;
                case -1086285377:
                    return this;
                case 278342528:
                    str = "ۢۨۢۢۤۥۘۗۦۦۘۛۦ۬ۙ۫۟ۚۨۧۘۘۡۡۥۦۤ";
                    break;
                case 660152284:
                    str = "ۜۥۚ۠ۛۦۘۛۜۦۧۖ۬ۚۡۛۖۢۘ۬ۡۡۘ";
                    break;
                case 1931801457:
                    str = "ۢۥۢ۠ۗۡۘۧۖ۠ۙۘۧ۠ۢۘۘ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setSingleChoiceItems(int i2, int i3, DialogInterface.OnClickListener onClickListener) {
        String str = "ۚۦۛ۫ۖۛۖۥۜۙۨۜۢۦۥۥۦۥ۠ۧۖ";
        while (true) {
            switch ((str.hashCode() ^ MotionEventCompat.ACTION_MASK) ^ 1471893669) {
                case -1578905775:
                    str = "ۢۘۚۤ۠ۡۘۗۨ۠ۚ۬ۧۥ۫۟ۦۡ۫۟ۦۗ۬ۖۨ";
                    break;
                case -1414177654:
                    return this;
                case 607883216:
                    str = "ۧۢۨ۠ۧ۠ۙۗۖۘۨۘۚۥ۠۟";
                    break;
                case 1161244764:
                    super.setSingleChoiceItems(i2, i3, onClickListener);
                    str = "ۦ۬ۨۘ۠ۢۘۘۛ۬ۚۚ۠ۗۖۡۚ۬ۧۥ۬ۤۜۘۚۛۘۘ";
                    break;
                case 1272707352:
                    str = "ۥۡۡۘۜۧۜ۬ۗ۫ۦۢۧۥۖ";
                    break;
                case 1942216928:
                    str = "ۘۧۡۘ۠ۗۢ۠ۡۖۘۡۢۚۡۥۧۘۧۨۚ۟ۨۦ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setSingleChoiceItems(Cursor cursor, int i2, String str, DialogInterface.OnClickListener onClickListener) {
        String str2 = "ۧۘۦۘۗۘۨۙۛۤۢ۫ۥۥۙۨۘۙۛ۟ۗۨۡ";
        while (true) {
            switch ((str2.hashCode() ^ 175) ^ 714347442) {
                case -1852385104:
                    return this;
                case -1626052394:
                    str2 = "ۙ۫ۥۜۛۘۘۥۢۘۨۜۘۤۜۨۘۢۙۤ۬ۡ۬ۛۦ۫";
                    break;
                case -1583318653:
                    super.setSingleChoiceItems(cursor, i2, str, onClickListener);
                    str2 = "ۚۗۨۘۗۨۤ۬۫ۨۘۙۦۨۘۚۤۥۜ۠ۚ";
                    break;
                case 994575182:
                    str2 = "ۥۚۖ۟ۜ۟ۛۤۗۦۨ۠۫ۗۛۥۥۤۗۥ";
                    break;
                case 1080575336:
                    str2 = "ۨۢۡۡ۫۠ۧۗ۬ۨۚۧۘۧۖۘۛۡۨۧۗۦۘ";
                    break;
                case 1555722985:
                    str2 = "ۖۥۜۘۙ۫ۜۢۗۧۙۖ۟ۘۥۧ۟۟۠۬ۜۧۘۙۙۘۢۘ";
                    break;
                case 1671840197:
                    str2 = "ۡۢۙۜۢۘۘۙ۬ۥ۫ۨۘۦۢۤۖۗۜۘ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setSingleChoiceItems(ListAdapter listAdapter, int i2, DialogInterface.OnClickListener onClickListener) {
        String str = "ۘۥۘۘۛۢۦۖۗۢۘۨۖۘۡۚۡۘۙ۫ۛۗۛۤ";
        while (true) {
            switch ((str.hashCode() ^ 690) ^ 1612091224) {
                case -2143041438:
                    str = "ۗۧۦۘۧۥۦۘۛۦ۠ۦۡۤ۬ۤۙ۫۬ۖۘۚ۫ۦۜۨۨۘۘۗۨ";
                    break;
                case -1348985349:
                    return this;
                case -1072836275:
                    str = "ۤ۟ۛۜۜۖ۬ۚۥۘ۠۫ۘۗۗۥۘۚ۫ۗ۠۬۫ۧۜ۟۬ۘۘ";
                    break;
                case -554086642:
                    super.setSingleChoiceItems(listAdapter, i2, onClickListener);
                    str = "ۘ۠ۦۘۥۨۜۤۖ۬ۖ۬ۦۧۘۙۦۗۙۚ۬ۡۦ۠ۥ";
                    break;
                case 578217068:
                    str = "ۢۖ۟ۨۤۤۦۦۜۘۘۛۨ۠ۧۚ";
                    break;
                case 1361478876:
                    str = "۬ۛۨۘۖۜۧۘۦۖۨۧۨ۟ۛ۟ۦۙ۫ۤۙ۬۠ۢ۠ۥ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setSingleChoiceItems(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
        String str = "ۢۤۛۜۗ۫ۚ۬۠ۙۗ۬ۘۡۧۘۖۙۘۜ۬ۗۢۘۘۥۚۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 284) ^ 185847988) {
                case -480148402:
                    str = "۠ۘۨۥۖۜۘ۬۬ۦۗ۠۬ۛۦۨۘ۟ۘۡۗۙۥ۬ۨ";
                    break;
                case -335826748:
                    str = "ۢ۟ۥۘۦۚۙۙۧۚۚۨ۫۟ۛۧ";
                    break;
                case 475015452:
                    super.setSingleChoiceItems(charSequenceArr, i2, onClickListener);
                    str = "۬ۧۧۜ۬ۨۘ۠ۡۙۜ۬ۛۨۗۙۗ۟ۥۘۨۦۨ";
                    break;
                case 648166284:
                    return this;
                case 811727954:
                    str = "ۢ۬۟ۦۨۧۨ۠ۜۘ۟۫ۛ۬ۢۡۘۗۡۦۘ";
                    break;
                case 1421616813:
                    str = "ۜۥۤۘۗۤۨۗۘ۫ۡۦ۫ۥۦۨۚۜ۬ۖۘۢۢۘۗۨۨۘ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setTitle(int i2) {
        String str = "ۡۚۡۘۗۚۧۗۧۚ۠ۥۥۜ۟ۚۦۗۛ";
        while (true) {
            switch ((str.hashCode() ^ 304) ^ 1595067995) {
                case -1759742694:
                    super.setTitle(i2);
                    str = "۬ۜۘۢۤ۟ۜۛ۠۠ۧۘۘۛۥۨۘۦ۬۟ۜۧ۠";
                    break;
                case 1070139042:
                    return this;
                case 1370034966:
                    str = "ۥۙ۫ۛۛۜۘ۟ۖۗ۫۠ۢۚ۠ۨۢۦۥۘۨۦۢۥۜۡ";
                    break;
                case 1743270484:
                    str = "ۤۦۖۙۦ۟ۧۢ۫ۘۧۥۧۘۘۚۦۙۚۗۢۜۨۘ";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setTitle(CharSequence charSequence) {
        String str = "۟۠ۧۢۥۨۘۤۖۗۖۖۜۧۙۦۗ";
        while (true) {
            switch ((str.hashCode() ^ 113) ^ 1033704223) {
                case -1618111180:
                    str = "ۚۜۙۥ۫۬۬۠۬ۤۡۘۘۘۜۧۘۛ۠۬ۘۥۧۖۤ۫ۤۖ";
                    break;
                case -1264538834:
                    return this;
                case -292787793:
                    super.setTitle(charSequence);
                    str = "ۡۜۧ۠ۙۥۧۜۘۘۦ۠ۘۘۜۤۗ";
                    break;
                case 1307662173:
                    str = "ۨ۠۟ۨۢۥۘۧۡۨۚۡۤ۫ۨۖۜۦۘۙۨۦۘ۫ۚۦۘ";
                    break;
            }
        }
    }

    public void setTransparentBackground(boolean z2) {
        String str = "ۖۗۢۛۥۙۖۗ۫۟ۗۤۨۚۜۘۙۢۥۡ۠ۨۘ۟ۙۦ";
        while (true) {
            switch ((str.hashCode() ^ 248) ^ 435877753) {
                case 1342237694:
                    str = "ۖۦۢ۬ۘۗۘۙۘۖۨۛۨۥۘۨ۟۫ۚۘۘۘۚۘ";
                    break;
                case 1740863233:
                    str = "ۦ۫ۖۤۘ۠۫ۚۜۖ۟ۜۥۚۧۛۤۦۗۨۧۘۡۢۨۘ";
                    break;
                case 1871936041:
                    return;
                case 2049133694:
                    this.f538a = z2;
                    str = "۫۟۬ۘ۠ۥۘ۟۠ۘۘ۬ۘ۠۟ۗۨۘ۟۟۫ۗۘ۬";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setView(int i2) {
        String str = "۠ۖۖۘۜۧۢۡۥۖۘۡ۬۫ۢۛۙۨۡۥۚۜۥۛۢۦۖۗۡ";
        while (true) {
            switch ((str.hashCode() ^ 440) ^ -1554839023) {
                case -778931465:
                    str = "۠ۗۘۘۖۨۙۢۛ۫۫ۖۖۛۨۗۗۦۤۢ۬ۘۘۙ۬";
                    break;
                case 188643700:
                    str = "ۤۧۘۡۨۙۡۤ۬۬ۛۡۘ۫ۤۡۘ۠ۤۧ۬ۛۥۨۖۥۢۘۖ";
                    break;
                case 1726316915:
                    return this;
                case 2057203320:
                    super.setView(i2);
                    str = "ۨ۬ۛ۠ۗۙ۬ۚ۬ۚۗ۫ۙ۟ۗۧ۫";
                    break;
            }
        }
    }

    public CustomAlertDialogBuilder setView(View view) {
        String str = "ۜۨۜۘۚ۠ۦۘۗۥ۫ۖۗۜۘۢۛۨۛۘۢۖ۠ۦۘۘۧۨۧ۬";
        while (true) {
            switch ((str.hashCode() ^ 487) ^ 520129081) {
                case -1704716436:
                    str = "ۖۧۨۘۡۨ۠ۖۥۛۤۙۜ۠۬";
                    break;
                case -1542980991:
                    str = "۠ۤ۟۫ۨۖۘۡۖۥۤ۬ۡۘۢۨۖۨ۬ۜۘۖۜۘۘۤۢ۬ۦۛۘ";
                    break;
                case -1208408792:
                    super.setView(view);
                    str = "ۥۢۗۤۥ۫ۘۦۘۘۙۚ۬ۨۗۢۜۜۜۤۗۥ";
                    break;
                case 112654882:
                    return this;
            }
        }
    }

    public AlertDialog show() {
        AlertDialog alertDialog = null;
        String str = "ۡۙ۬۠ۦ۟ۚۤۛۨۙۘۜۖۨ۫۫ۨۡۡۘۘۢۨۧ";
        while (true) {
            switch ((str.hashCode() ^ 111) ^ -1707195007) {
                case -265233624:
                    this.f539b = alertDialog;
                    str = "۫ۘۘۘۢۢۨۚۥۘ۟ۤ۟ۖ۟۫";
                    break;
                case -210049470:
                    str = "ۤ۬۠۬ۚۨۘۗۥۧۘ۟ۦۧۘ۬ۡۚۧ۫ۛۛۡۧۛۙ۟";
                    break;
                case 100950932:
                    String str2 = "ۨۙۦۨۦ۬ۥۨۨۥۘۡۤ۫ۙۘ۬۟ۥ۬۠۠ۤ۫ۙ";
                    while (true) {
                        switch (str2.hashCode() ^ -1421964750) {
                            case -394535518:
                                if (!this.f538a) {
                                    str2 = "ۗۨۗ۬ۘۖۡ۠ۗۙۥۜۘۦۛۡۘ۟ۤ۫ۦ۬ۡۧۥۢ";
                                    break;
                                } else {
                                    str2 = "۟۟ۚۙۥۘۦ۬ۤ۠ۡ۟ۚۡۧۘۘ۠ۜۘۨ۠ۨۘ";
                                    break;
                                }
                            case -111199836:
                                str2 = "ۚۧۡۘ۠ۖۛۨ۬ۥ۠ۡۨۥۨۘۜۘۜۘۛۡۜ";
                                break;
                            case 656591266:
                                str = "ۖۧۡ۫ۨۗۛ۬ۛۧۢۨۖ۟ۨ۫ۘۘ۟ۥۤۖۙ";
                                continue;
                            case 1145287477:
                                str = "ۦۗ۬ۜ۬ۡۘۤ۟ۧۛۗۙ۫ۢۨۢۦۡۦۙۗ";
                                continue;
                        }
                    }
                    break;
                case 550478705:
                    alertDialog = super.show();
                    str = "ۤۚۜۘۚۡۨ۬۟ۥۖۦۡۘۨۡۦۘۡۦ۠";
                    break;
                case 1177452582:
                    alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                    str = "ۦۗ۬ۜ۬ۡۘۤ۟ۧۛۗۙ۫ۢۨۢۦۡۦۙۗ";
                    break;
                case 1708275531:
                    return this.f539b;
            }
        }
    }
}
