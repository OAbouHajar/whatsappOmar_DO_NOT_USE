package com.obwhatsapp.yo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Environment;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.YoSettings.HideMedia;
import java.io.File;

@SuppressLint({"AppCompatCustomView"})
public class MoveBtn extends Button implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final String f551a;

    /* renamed from: b  reason: collision with root package name */
    public final File f552b;

    /* renamed from: c  reason: collision with root package name */
    public final File f553c;

    /* renamed from: d  reason: collision with root package name */
    public final File f554d;

    public MoveBtn(Context context) {
        super(context);
        String dbsf = utils.dbsf("V2hhdHNBcHA=", 1);
        this.f551a = dbsf;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        this.f552b = externalStorageDirectory;
        this.f553c = new File(externalStorageDirectory, dbsf);
        this.f554d = new File(externalStorageDirectory, "OBWhatsApp");
        init();
    }

    public MoveBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String dbsf = utils.dbsf("V2hhdHNBcHA=", 1);
        this.f551a = dbsf;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        this.f552b = externalStorageDirectory;
        this.f553c = new File(externalStorageDirectory, dbsf);
        this.f554d = new File(externalStorageDirectory, "OBWhatsApp");
        init();
    }

    public MoveBtn(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        String dbsf = utils.dbsf("V2hhdHNBcHA=", 1);
        this.f551a = dbsf;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        this.f552b = externalStorageDirectory;
        this.f553c = new File(externalStorageDirectory, dbsf);
        this.f554d = new File(externalStorageDirectory, "OBWhatsApp");
        init();
    }

    public void init() {
        String str = "ۨۙۗۡ۫ۡۡۙۘۘ۬ۛۨ۬ۚۡۘۗۧۖۘۙۘ۬ۧ۬ۨۘۤۨ۬";
        while (true) {
            switch ((str.hashCode() ^ HideMedia.VIDEOS) ^ 1016766878) {
                case -351700322:
                    str = "ۙ۫ۡۙۢۖۛۛ۬ۤۦۧۘۛۚۥۘ۠۫۫ۢۥۖۘۘۥ۫ۗۢۗ";
                    break;
                case 656196508:
                    return;
                case 1449398323:
                    setOnClickListener(this);
                    str = "ۤۦۘۘۛۨۤۘۥۗۢۨۡۘۜۧۦۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c9, code lost:
        r2 = "۬ۖۘۘۙ۬ۖۥۢۙۡۖۦۘۚۘۖۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r28) {
        /*
            r27 = this;
            r23 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r15 = 0
            r6 = 0
            r8 = 0
            r4 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            java.lang.String r2 = "ۖۡۡۛ۫ۡۤۥۧۙ۫ۚۖۙ"
        L_0x001f:
            int r24 = r2.hashCode()
            r25 = 362(0x16a, float:5.07E-43)
            r26 = 1394573946(0x531f827a, float:6.8508883E11)
            r24 = r24 ^ r25
            r24 = r24 ^ r26
            switch(r24) {
                case -2095277564: goto L_0x0174;
                case -1789757424: goto L_0x0203;
                case -1702593657: goto L_0x01f8;
                case -1624165922: goto L_0x0218;
                case -1542957871: goto L_0x01cd;
                case -1527231813: goto L_0x00f4;
                case -1375393068: goto L_0x01a9;
                case -1323667445: goto L_0x01b9;
                case -1296083617: goto L_0x0033;
                case -1139463632: goto L_0x0030;
                case -1084146611: goto L_0x00e7;
                case -1065049525: goto L_0x0187;
                case -1059852619: goto L_0x008e;
                case -1046835391: goto L_0x014c;
                case -954390874: goto L_0x0085;
                case -953562049: goto L_0x006d;
                case -791679494: goto L_0x01f0;
                case -770444672: goto L_0x0036;
                case -749562987: goto L_0x0199;
                case -739419045: goto L_0x01e0;
                case -457013730: goto L_0x011a;
                case -400145352: goto L_0x01d8;
                case -339436682: goto L_0x0157;
                case -322207299: goto L_0x0074;
                case -304671012: goto L_0x01fe;
                case -8051076: goto L_0x0192;
                case 28541582: goto L_0x00b0;
                case 223555624: goto L_0x0210;
                case 338600958: goto L_0x01eb;
                case 350711162: goto L_0x0164;
                case 366773645: goto L_0x016d;
                case 521838719: goto L_0x0208;
                case 535189337: goto L_0x01d3;
                case 747860965: goto L_0x01a2;
                case 768910276: goto L_0x015d;
                case 851844524: goto L_0x007d;
                case 855905204: goto L_0x005d;
                case 912410580: goto L_0x00ba;
                case 1340066158: goto L_0x021c;
                case 1557592720: goto L_0x00fa;
                case 1558208895: goto L_0x0063;
                case 1634937868: goto L_0x00ee;
                case 1884288601: goto L_0x0051;
                case 1974413698: goto L_0x01b2;
                case 2017293912: goto L_0x01e6;
                case 2017705052: goto L_0x00e0;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x001f
        L_0x0030:
            java.lang.String r2 = "۬ۤۗۚۢۗۖۡۛۜ۟ۦۚۧۦۜۘ۬ۨۥۦ"
            goto L_0x001f
        L_0x0033:
            java.lang.String r2 = "ۗ۫ۜۘۙۚۧۥۨۥۘۢۚۡۥۦ۫۫ۧۖۥ۟ۗ"
            goto L_0x001f
        L_0x0036:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r23 = "ddMMyyyy_HHmm"
            java.util.Locale r24 = java.util.Locale.ENGLISH
            r0 = r23
            r1 = r24
            r2.<init>(r0, r1)
            java.util.Date r23 = new java.util.Date
            r23.<init>()
            r0 = r23
            java.lang.String r23 = r2.format(r0)
            java.lang.String r2 = "ۨۢۥۗ۬ۖۘۙ۠ۦۗۗۧ۬ۧۧ۫ۚۚ"
            goto L_0x001f
        L_0x0051:
            java.lang.StringBuilder r22 = new java.lang.StringBuilder
            java.lang.String r2 = "OBWhatsApp("
            r0 = r22
            r0.<init>(r2)
            java.lang.String r2 = "۟ۨۜ۠ۛۘ۫ۦ۬ۧۙۢۚۗۖ۠ۡۘۜ۫ۗۚ۬ۖۘ۟ۥ۟"
            goto L_0x001f
        L_0x005d:
            r22.append(r23)
            java.lang.String r2 = "ۧۚۦۤۢ۠ۘۢۡۘۥۜۥۦۗ"
            goto L_0x001f
        L_0x0063:
            java.lang.String r2 = ")"
            r0 = r22
            r0.append(r2)
            java.lang.String r2 = "ۡ۟ۛۗۗۦۚۦۘۘۨۥ۬ۡ۬ۥۘۧۢۢ"
            goto L_0x001f
        L_0x006d:
            java.lang.String r21 = r22.toString()
            java.lang.String r2 = "۠ۖۡۤۡۡۚ۠ۘۘۘ۟ۗۛ۟ۜۘۢ۟ۢ۠ۗۖۘ"
            goto L_0x001f
        L_0x0074:
            r0 = r27
            java.io.File r0 = r0.f552b
            r20 = r0
            java.lang.String r2 = "ۘۦۖۢ۬ۛۦ۠ۗۥۜۙۖۗۗۙۛۦ"
            goto L_0x001f
        L_0x007d:
            java.io.File r19 = new java.io.File
            r19.<init>(r20, r21)
            java.lang.String r2 = "ۜ۫۫ۤۢۥۜۗۜۜۤ۬ۚۤۨ۟۬ۜ۟ۥۛ"
            goto L_0x001f
        L_0x0085:
            r0 = r27
            java.io.File r0 = r0.f554d
            r18 = r0
            java.lang.String r2 = "ۡۚۦۘ۟ۗ۠ۢۜۗۚۜۧۜۙۛ۠۟ۦۘۦۙۚۧۛۖ"
            goto L_0x001f
        L_0x008e:
            r24 = -1918373770(0xffffffff8da7f076, float:-1.03500585E-30)
            java.lang.String r2 = "۟ۡۜۘۦۖۢ۠ۘۚ۬ۡۘۚۥ۟ۙۚۘۘۧۜۤ"
        L_0x0093:
            int r25 = r2.hashCode()
            r25 = r25 ^ r24
            switch(r25) {
                case -2103985438: goto L_0x00ac;
                case -1075678541: goto L_0x00c9;
                case 894401945: goto L_0x009d;
                case 1690355026: goto L_0x00a9;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x0093
        L_0x009d:
            boolean r2 = r18.exists()
            if (r2 == 0) goto L_0x00a6
            java.lang.String r2 = "ۡۥۨۦۤۙۖۦۖ۠۠ۘۜۤۘۘۜۙۜۘۦۡ۫۬ۙۗ"
            goto L_0x0093
        L_0x00a6:
            java.lang.String r2 = "ۛۧۧۖۘۛۡ۟ۨۘۜۤۗۥ۟ۘۜۘۨۚۚۖ"
            goto L_0x0093
        L_0x00a9:
            java.lang.String r2 = "ۦ۬۠۬ۧۘۥۤۗۘۙۘۘۚۖۙۗۡۦۘۛۜۘ"
            goto L_0x0093
        L_0x00ac:
            java.lang.String r2 = "ۦۘۛۜۙۖۘۨۡۤ۬ۦ۫ۙۦۧۘ۫۬ۡۗۡ"
            goto L_0x001f
        L_0x00b0:
            r0 = r27
            java.io.File r0 = r0.f553c
            r17 = r0
            java.lang.String r2 = "ۜۘۢۗۤۧ۫۟ۦۘۥ۫ۜۘۥۗۤۚۛۨۘ۬ۤۘۘۤۥۤ"
            goto L_0x001f
        L_0x00ba:
            r24 = -1121788685(0xffffffffbd22dcf3, float:-0.039761495)
            java.lang.String r2 = "ۛ۬ۚۜۥۖۘۢۛۦۘۧۢۢۙۢۖۧ۬ۨ۠ۚۛۗۜۧۘ"
        L_0x00bf:
            int r25 = r2.hashCode()
            r25 = r25 ^ r24
            switch(r25) {
                case -1872176146: goto L_0x00dc;
                case -275024214: goto L_0x00d0;
                case 105315372: goto L_0x00c9;
                case 893200850: goto L_0x00d9;
                default: goto L_0x00c8;
            }
        L_0x00c8:
            goto L_0x00bf
        L_0x00c9:
            java.lang.String r2 = "۬ۖۘۘۙ۬ۖۥۢۙۡۖۦۘۚۘۖۘ"
            goto L_0x001f
        L_0x00cd:
            java.lang.String r2 = "ۖ۬ۜۘۛۛ۬۠ۧۘۗۥۨۘۚ۟ۘۘ۠ۥ"
            goto L_0x00bf
        L_0x00d0:
            boolean r2 = r17.exists()
            if (r2 == 0) goto L_0x00cd
            java.lang.String r2 = "ۤۧۧۗۤۘۘۛۘۧۙۘۤ۫ۗۘۜۗۗ۬ۘۚۚۧۖۘ"
            goto L_0x00bf
        L_0x00d9:
            java.lang.String r2 = "ۖۙۘۨۜۗ۬ۙۨۘۦ۠ۧ۫۬۬ۥۗۘ"
            goto L_0x00bf
        L_0x00dc:
            java.lang.String r2 = "ۙۖۘۘۖۤۦۘۦ۬۠۟ۤ۫ۢۤۜۘۥۗۥ"
            goto L_0x001f
        L_0x00e0:
            r18.renameTo(r19)
            java.lang.String r2 = "ۢۘ۠ۗۘۨۘۦۤۖۡۗۘۗۜۢۧۚۨ"
            goto L_0x001f
        L_0x00e7:
            r17.renameTo(r18)
            java.lang.String r2 = "ۚۦ۫ۥۙۖۘ۬ۥۘۘۢ۫۠ۛۢۜۘۧۥۨۘ۫ۜۧۘ"
            goto L_0x001f
        L_0x00ee:
            r16 = 0
            java.lang.String r2 = "۟ۢۧۢ۫ۥۘۘۜ۫۠ۧۘۜ۠ۙ"
            goto L_0x001f
        L_0x00f4:
            java.lang.String r2 = "ۘۦۜۘ۟ۥ۬ۘۢ۟ۧۥۜۙۧ۟ۨۦۢۚ۠ۚ۠ۗۥۘۖ۠ۨۘ"
            r15 = r16
            goto L_0x001f
        L_0x00fa:
            r24 = 1313732307(0x4e4df6d3, float:8.6387629E8)
            java.lang.String r2 = "ۢۥۘۖۙ۫۬ۚۥۘۤۛۛۙۢۨۘ"
        L_0x00ff:
            int r25 = r2.hashCode()
            r25 = r25 ^ r24
            switch(r25) {
                case -1877620758: goto L_0x0109;
                case -1163100422: goto L_0x010f;
                case 1174262499: goto L_0x0116;
                case 1278309959: goto L_0x0214;
                default: goto L_0x0108;
            }
        L_0x0108:
            goto L_0x00ff
        L_0x0109:
            java.lang.String r2 = "۟ۨۨۘۢۖۜۘۗۥۨ۬۟۫ۤۜۖ۟ۘ"
            goto L_0x00ff
        L_0x010c:
            java.lang.String r2 = "ۥۘۘۚۨۜۥۜ۠ۡۦۗ۫ۙۗۧۜ۠"
            goto L_0x00ff
        L_0x010f:
            r2 = 8
            if (r15 >= r2) goto L_0x010c
            java.lang.String r2 = "ۜۦۥۦۚۙۙ۟ۜۘۗ۟ۧۙۨۡۘ"
            goto L_0x00ff
        L_0x0116:
            java.lang.String r2 = "۟۬ۚۘۥۜ۠ۚۧ۬ۙۡۢۗۘۘۚ۬ۨۘۥۜۤۗ۠ۤ"
            goto L_0x001f
        L_0x011a:
            r2 = 8
            java.lang.String[] r2 = new java.lang.String[r2]
            r14 = 0
            java.lang.String r24 = " Audio"
            r2[r14] = r24
            r14 = 1
            java.lang.String r24 = " Images"
            r2[r14] = r24
            r14 = 2
            java.lang.String r24 = " Profile Photos"
            r2[r14] = r24
            r14 = 3
            java.lang.String r24 = " Video"
            r2[r14] = r24
            r14 = 4
            java.lang.String r24 = " Voice Notes"
            r2[r14] = r24
            r14 = 5
            java.lang.String r24 = " Animated Gifs"
            r2[r14] = r24
            r14 = 6
            java.lang.String r24 = " Documents"
            r2[r14] = r24
            r14 = 7
            java.lang.String r24 = " Calls"
            r2[r14] = r24
            r14 = r2[r15]
            java.lang.String r2 = "۟ۨۜۘۨۢۤۗۨۘۤۢۖۘۡۨۙۡۚۚ"
            goto L_0x001f
        L_0x014c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r2 = "OBWhatsApp"
            r13.<init>(r2)
            java.lang.String r2 = "ۥۧۖ۫ۦۘۖۘۨۜ۠ۨ۫ۜۘ۬ۖۢۘۧۚۢۢۙ"
            goto L_0x001f
        L_0x0157:
            java.lang.String r12 = java.io.File.separator
            java.lang.String r2 = "ۧۖ۠۬ۤۤۛۘۗۖ۬ۥ۫ۨۘۛۙۛۦ"
            goto L_0x001f
        L_0x015d:
            r13.append(r12)
            java.lang.String r2 = "ۚۖۢۤۧۧ۫۟ۗ۬ۢۘۘۤۦ۟۫۠ۖۧۛۡۘ"
            goto L_0x001f
        L_0x0164:
            java.lang.String r2 = "Media"
            r13.append(r2)
            java.lang.String r2 = "ۢۛۚۗۤۦۘۚ۟ۦ۫ۧۡۘ۫۟ۙۧۖۡۘۥ۫۬ۚۗۘۧۘ"
            goto L_0x001f
        L_0x016d:
            r13.append(r12)
            java.lang.String r2 = "ۥ۠ۡ۠ۨۖۧۤۚۡۖۖ۟۫ۦۥ۫"
            goto L_0x001f
        L_0x0174:
            java.io.File r11 = new java.io.File
            r0 = r27
            java.lang.String r2 = r0.f551a
            java.lang.String r2 = a.a.f(r13, r2, r14)
            r0 = r20
            r11.<init>(r0, r2)
            java.lang.String r2 = "۫ۛۛۗ۬۬ۧۧ۫ۡۨۛۘۛۚۘۛۦ۬ۨ۬ۗۙ۬"
            goto L_0x001f
        L_0x0187:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r2 = "OBWhatsApp"
            r10.<init>(r2)
            java.lang.String r2 = "ۥۖۥۥۖۨۘۥ۠ۙۢۗۤۦۤۘ۠ۢۢ"
            goto L_0x001f
        L_0x0192:
            r10.append(r12)
            java.lang.String r2 = "ۦۛۖۚۡۜۘۦۛۦۦ۬ۗۙۦۥۘۘۚۡ۟ۚۥۘۘ۟۟ۦۨۖ"
            goto L_0x001f
        L_0x0199:
            java.lang.String r2 = "Media"
            r10.append(r2)
            java.lang.String r2 = "ۧۥۤۤۛۖۘۛۢۙۛۙۛ۠ۨۧ"
            goto L_0x001f
        L_0x01a2:
            r10.append(r12)
            java.lang.String r2 = "۫ۛۡۘۥۦۜۖۛۚ۠ۘ۫ۥۧۨۘ"
            goto L_0x001f
        L_0x01a9:
            java.lang.String r2 = "OBWhatsApp"
            r10.append(r2)
            java.lang.String r2 = "۬ۛۚۤۤۜۘۢۙۨۤۤۥۗ۫ۚ۠ۡۗۘ۟ۤ"
            goto L_0x001f
        L_0x01b2:
            r10.append(r14)
            java.lang.String r2 = "ۧ۬ۚۤۛ۟۟ۗ۫ۧ۟ۡ۟ۚۙۥۙۘۦ۟ۨۘ۟ۢ"
            goto L_0x001f
        L_0x01b9:
            java.io.File r2 = new java.io.File
            java.lang.String r24 = r10.toString()
            r0 = r20
            r1 = r24
            r2.<init>(r0, r1)
            r11.renameTo(r2)
            java.lang.String r2 = "ۦۜۗ۟ۢۡۘ۠۬ۘۘۙۘۦۨۤۦۘۖ۠ۙ"
            goto L_0x001f
        L_0x01cd:
            int r9 = r15 + 1
            java.lang.String r2 = "۫ۨۡۖۥۦۘۨۗۥۖۢۛۦۧۛ۠ۛۦۘ"
            goto L_0x001f
        L_0x01d3:
            java.lang.String r2 = "ۗ۟ۜۙۧۨۘۖۥۦۡۙ۬ۦۜۘ۠۟ۜۘۘۘۡۜۙۨ"
            r15 = r9
            goto L_0x001f
        L_0x01d8:
            android.content.Context r6 = r27.getContext()
            java.lang.String r2 = "۠ۡۖۘۧ۟۠ۢۥۙۘۘۘۘۘۦ۫۠ۡۘ۬۬ۖ"
            goto L_0x001f
        L_0x01e0:
            java.lang.String r8 = "wa_moved"
            java.lang.String r2 = "ۡۥۥ۟ۜۤ۫ۘۛۦۥ۟۟ۢۜۘ۫ۢ۟ۛۡۧۘ"
            goto L_0x001f
        L_0x01e6:
            java.lang.String r2 = "ۙۦۖ۟ۢۧۙۘۘۘۡۘ۟ۙ۫۬ۢۢۚ"
            r7 = r8
            goto L_0x001f
        L_0x01eb:
            java.lang.String r2 = "ۦۧۚۥۖۥۜۘ۫ۖۗ۠ۤۚۥۘۡ۫ۖۜۗۦۘۡۖۨ"
            r5 = r6
            goto L_0x001f
        L_0x01f0:
            android.content.Context r4 = r27.getContext()
            java.lang.String r2 = "ۛ۬ۥۘۖ۟ۡ۠۬ۥۘۤۤۦۖۖۦۚ۬ۜ"
            goto L_0x001f
        L_0x01f8:
            java.lang.String r3 = "google_drive_no_backup_found"
            java.lang.String r2 = "۟ۗۚۜۗۗۙۜۡۘۘۖۛۛ۟ۥ۫ۚۖۚۖۥۦۘ"
            goto L_0x001f
        L_0x01fe:
            java.lang.String r2 = "۠ۦۡۘۚۛۜۗۨۨۤۧۡۨۨۥۚۦۢ۠۠ۖ"
            r5 = r4
            goto L_0x001f
        L_0x0203:
            java.lang.String r2 = "ۘۗۖۘۢ۫۬ۦۢۨۘ۫ۤ۟ۚ۟ۢ۟ۤ۠ۢۙۜ"
            r7 = r3
            goto L_0x001f
        L_0x0208:
            r2 = 1
            a.a.i(r7, r5, r2)
            java.lang.String r2 = "۬ۛۜۘ۠ۦ۟ۗۗۡ۠۫ۖۗ۫۠۫ۡۘۧۗۢۖ۠۬"
            goto L_0x001f
        L_0x0210:
            java.lang.String r2 = "ۘۦۜۘ۟ۥ۬ۘۢ۟ۧۥۜۙۧ۟ۨۦۢۚ۠ۚ۠ۗۥۘۖ۠ۨۘ"
            goto L_0x001f
        L_0x0214:
            java.lang.String r2 = "۠ۢۡۙۛۡۙۚۛۧۛۤۖ۠ۘۜۨۘ۠۠ۜۘۨۨۘ"
            goto L_0x001f
        L_0x0218:
            java.lang.String r2 = "ۘۗۖۘۢ۫۬ۦۢۨۘ۫ۤ۟ۚ۟ۢ۟ۤ۠ۢۙۜ"
            goto L_0x001f
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.MoveBtn.onClick(android.view.View):void");
    }
}
