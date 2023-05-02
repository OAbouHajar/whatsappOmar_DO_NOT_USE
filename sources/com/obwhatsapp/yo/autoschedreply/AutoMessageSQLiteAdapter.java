package com.obwhatsapp.yo.autoschedreply;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class AutoMessageSQLiteAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final Context f629a;

    /* renamed from: b  reason: collision with root package name */
    public SQLiteDatabase f630b;

    /* renamed from: c  reason: collision with root package name */
    public AutoMessageSQLite f631c;

    public AutoMessageSQLiteAdapter(Context context) {
        this.f629a = context;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x022a, code lost:
        r2 = "۫۫ۥ۫ۥۨۘۛ۟ۦۘۖ۫ۗۤ۫ۚۨۖۘۗۥۙ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long cc(java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, java.lang.String r35, java.lang.String r36, java.util.ArrayList<? extends java.lang.Object> r37, java.util.ArrayList<? extends java.lang.Object> r38) {
        /*
            r28 = this;
            r24 = 0
            r6 = 0
            r8 = 0
            r23 = 0
            r22 = 0
            r21 = 0
            r19 = 0
            r20 = 0
            r15 = 0
            r14 = 0
            r18 = 0
            r17 = 0
            r13 = 0
            r16 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r12 = 0
            r4 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            java.lang.String r2 = "ۗۤۜۛ۬ۡۘۗ۟ۢۜ۫ۦۘۜۗ۬ۢۦۘۘ"
        L_0x0021:
            int r25 = r2.hashCode()
            r26 = 841(0x349, float:1.178E-42)
            r27 = 629657275(0x2587cebb, float:2.3558853E-16)
            r25 = r25 ^ r26
            r25 = r25 ^ r27
            switch(r25) {
                case -2138904994: goto L_0x0081;
                case -2120723718: goto L_0x0098;
                case -2117800457: goto L_0x0127;
                case -1912110246: goto L_0x01bc;
                case -1812052988: goto L_0x005f;
                case -1785705252: goto L_0x0183;
                case -1783832793: goto L_0x003e;
                case -1487396994: goto L_0x01af;
                case -1421420781: goto L_0x0041;
                case -1312284859: goto L_0x00b4;
                case -1301417787: goto L_0x00f2;
                case -1208016423: goto L_0x0147;
                case -1134692069: goto L_0x01c9;
                case -1094025200: goto L_0x01a2;
                case -927317196: goto L_0x0178;
                case -793533564: goto L_0x0047;
                case -765274278: goto L_0x0138;
                case -735160858: goto L_0x00ae;
                case -710033498: goto L_0x020c;
                case -653969988: goto L_0x0090;
                case -646392858: goto L_0x004a;
                case -579550033: goto L_0x01e7;
                case -553385216: goto L_0x00f8;
                case -463540574: goto L_0x01f4;
                case -446987040: goto L_0x016a;
                case -220948559: goto L_0x0109;
                case 99377459: goto L_0x0053;
                case 141607955: goto L_0x0130;
                case 157410595: goto L_0x0032;
                case 164207849: goto L_0x0050;
                case 267728488: goto L_0x0089;
                case 349974423: goto L_0x00a8;
                case 373428512: goto L_0x017e;
                case 461579034: goto L_0x0226;
                case 554437916: goto L_0x00e6;
                case 585482353: goto L_0x004d;
                case 605510403: goto L_0x0104;
                case 713269067: goto L_0x0035;
                case 786049929: goto L_0x00fe;
                case 871700159: goto L_0x013d;
                case 898465033: goto L_0x0195;
                case 1113418093: goto L_0x00a2;
                case 1292424389: goto L_0x0188;
                case 1329755864: goto L_0x0038;
                case 1465092729: goto L_0x014c;
                case 1471548297: goto L_0x021a;
                case 1505748640: goto L_0x01da;
                case 1548793576: goto L_0x00ec;
                case 1572765740: goto L_0x0201;
                case 1759662460: goto L_0x009d;
                case 1760026587: goto L_0x0142;
                case 1769034995: goto L_0x0064;
                case 1782780281: goto L_0x005b;
                case 1868045910: goto L_0x003b;
                case 2012842091: goto L_0x00d6;
                case 2021037506: goto L_0x0044;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0021
        L_0x0032:
            java.lang.String r2 = "ۤۧۨۥۙۘۘۗ۠ۖۢ۬۟ۚۘۡۘ۟ۢۦۘ۟ۛ۠"
            goto L_0x0021
        L_0x0035:
            java.lang.String r2 = "۠ۦۨۜۚۦۘ۫ۗۦۧۧۢ۠ۨ۠ۜ۬ۜۘ"
            goto L_0x0021
        L_0x0038:
            java.lang.String r2 = "ۨۡۡۖۤۖۙۚۙۘۦۙۖۛۥۘۥۤۡۦۗۜۘ"
            goto L_0x0021
        L_0x003b:
            java.lang.String r2 = "ۙ۬ۥۘ۬ۙۙۨۘۘ۬ۘ۟۫۟ۜۙۗۜۥ۫ۥۧۜۖۘۚۚۤ"
            goto L_0x0021
        L_0x003e:
            java.lang.String r2 = "۟ۨۙۥۥ۬ۙۤۗۛۡۖۦ۬۠ۛۥۘۦۖ۬ۧ۠ۘۘ"
            goto L_0x0021
        L_0x0041:
            java.lang.String r2 = "ۡۢۡۘۨ۫ۛۢ۫ۗۖۖۗۙۛۡۡۗۧۧ۬ۘۘۤۖۢ"
            goto L_0x0021
        L_0x0044:
            java.lang.String r2 = "۟ۗۦۖۧۘۘۡۙۦۘۗۚۨۢۥۛۤ۬ۧۜۛۡۘۥۢۘۘ"
            goto L_0x0021
        L_0x0047:
            java.lang.String r2 = "ۨۢ۫ۨۡۡۘ۠۟ۜۧ۠ۡ۠۟ۘ۬ۤۨۘۛۘ۟۫ۢۖۘۨۦۘ"
            goto L_0x0021
        L_0x004a:
            java.lang.String r2 = "۬ۡۧۘۗۤۥۘۚۥۖۨ۫۠ۢ۫ۖۘۢ۟۬ۙ۟ۨۘۘ۟۬"
            goto L_0x0021
        L_0x004d:
            java.lang.String r2 = "ۘۘ۟ۤۢۜۖۨۚۗۗ۫ۥۤۥۘۧۛۡۢۙۖۖۡ۬"
            goto L_0x0021
        L_0x0050:
            java.lang.String r2 = "ۗۥۛۢ۟ۚ۫ۥۛۦۢۦۘ۫ۥۖۜۤ۟ۗ۠ۤ"
            goto L_0x0021
        L_0x0053:
            android.content.ContentValues r24 = new android.content.ContentValues
            r24.<init>()
            java.lang.String r2 = "ۦۥ۟ۖۖۧۦ۬ۡۨۥۚ۠۟۟ۤ۠ۜ۬ۚۢ"
            goto L_0x0021
        L_0x005b:
            r6 = 0
            java.lang.String r2 = "۬ۘۨۛۚۤۨۡۘۜۗ۟۟۫ۜۗۛۨۘ"
            goto L_0x0021
        L_0x005f:
            java.lang.String r8 = "non"
            java.lang.String r2 = "ۧ۠ۥۨۤۥۛۨۧۘۥۧۥۨۘۜۤۡ"
            goto L_0x0021
        L_0x0064:
            r25 = -414649814(0xffffffffe748f22a, float:-9.489404E23)
            java.lang.String r2 = "ۤۥۖۘۛۨۧۘ۬ۗۧ۬ۤۙۖ۫ۥۘۤۜۘ۬ۙۘۘۗ۟ۙۧۗۗ"
        L_0x0069:
            int r26 = r2.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1478351991: goto L_0x007e;
                case 833918527: goto L_0x0079;
                case 1586016299: goto L_0x0073;
                case 1882556205: goto L_0x021e;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x0069
        L_0x0073:
            java.lang.String r2 = "ۖۨۙۢۙ۬ۤ۬ۘۤۛۡۘ۬ۡۨ"
            goto L_0x0069
        L_0x0076:
            java.lang.String r2 = "ۘۜۡۘۛۥۥۙۧۘۛ۫ۘۙۚۜۘ۟۫"
            goto L_0x0069
        L_0x0079:
            if (r37 == 0) goto L_0x0076
            java.lang.String r2 = "۫ۖۙۖۛۗۗۧۙۧۤۥۘۥۧ۫ۜۖۚ۠ۢۗۤۜ"
            goto L_0x0069
        L_0x007e:
            java.lang.String r2 = "۫ۘۜۗۨۥۖۘ۟ۛ۟ۢۙۡۚ"
            goto L_0x0021
        L_0x0081:
            java.lang.StringBuilder r23 = new java.lang.StringBuilder
            r23.<init>()
            java.lang.String r2 = "۫ۧۨۘۥۜۗۧۚۦۘۡۛۢۘۤۨۘۢۗۛ۠ۛۚ۫ۛۜۚ۬"
            goto L_0x0021
        L_0x0089:
            java.lang.Object[] r22 = r37.toArray()
            java.lang.String r2 = "ۢۛ۫ۦۗ۟ۜۤۥۘۛۘ۟ۧ۫ۢۖۖۘۖۤۛۦۘۚ۫ۗۚ"
            goto L_0x0021
        L_0x0090:
            r0 = r22
            int r0 = r0.length
            r21 = r0
            java.lang.String r2 = "ۘۢۗۜۢۨۘ۬ۚۙۧۡۥۘ۫ۦۘ"
            goto L_0x0021
        L_0x0098:
            r19 = 0
            java.lang.String r2 = "ۚۡۦۘ۠ۥۢ۟۬ۦۘۢۤۨۡ۟ۜۖۗۘۘۦۗۥۘۚۧۛ"
            goto L_0x0021
        L_0x009d:
            java.lang.String r20 = "non"
            java.lang.String r2 = "ۜۨۗۙ۠ۧۜۗۢۢۚۜۘۜ۟ۦۘۧ۟ۦۥۙۦ"
            goto L_0x0021
        L_0x00a2:
            java.lang.String r2 = "۬۬۬۟ۥۦۤۦۚۘۦۨۙۢۗۙۦ"
            r17 = r20
            goto L_0x0021
        L_0x00a8:
            java.lang.String r2 = "۫ۧ۟۫ۤ۬۫ۜۘۤۡۛ۬ۘۗۤۤۘ"
            r18 = r19
            goto L_0x0021
        L_0x00ae:
            java.lang.String r2 = "ۤۙۨۘۚۢۡۤ۟ۜۘ۟ۜۥۘۛ۠ۖۘۢۢۙ"
            r16 = r17
            goto L_0x0021
        L_0x00b4:
            r25 = -1642549334(0xffffffff9e18afaa, float:-8.0831395E-21)
            java.lang.String r2 = "ۙۦۥۢۤۡۘۗ۟ۜ۠ۛۖۦۨ۠۟ۡ۠ۜۡۖۖۥ۬ۨۖۡ"
        L_0x00b9:
            int r26 = r2.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -2039065436: goto L_0x0222;
                case -935522857: goto L_0x00c3;
                case -673188084: goto L_0x00d2;
                case 735139013: goto L_0x00c9;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            goto L_0x00b9
        L_0x00c3:
            java.lang.String r2 = "ۚۙ۫ۖۥۡۘۛۧۚۥۥ۟ۚۧ۟۟ۖ"
            goto L_0x00b9
        L_0x00c6:
            java.lang.String r2 = "ۨۖۢۖۡۦ۫ۢۖۤۘۧۖۖۧۥۘۗۢۦۦۘ"
            goto L_0x00b9
        L_0x00c9:
            r0 = r18
            r1 = r21
            if (r0 >= r1) goto L_0x00c6
            java.lang.String r2 = "ۙۦۜۦ۫۫ۘۜۤ۟ۦۚۙۧۥۘۦۘ"
            goto L_0x00b9
        L_0x00d2:
            java.lang.String r2 = "ۖۤۜ۠ۦۘۜۤۙۘۡۜۛۨۚۨۗۘۡ۟ۦۘۢۗ۠"
            goto L_0x0021
        L_0x00d6:
            r2 = r22[r18]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r15 = ","
            r0 = r23
            java.lang.String r15 = a.a.f(r0, r2, r15)
            java.lang.String r2 = "ۖۥۖۘۤ۬۫ۖۧۘۘ۫۟ۜۘۢۤ۬ۦۛۡۜۘۙۧ۫ۚ"
            goto L_0x0021
        L_0x00e6:
            int r14 = r18 + 1
            java.lang.String r2 = "ۡۛۢ۬ۛۨ۫۠ۖۘۘۗۥۘ۬۟ۧ"
            goto L_0x0021
        L_0x00ec:
            java.lang.String r2 = "ۗۡ۬ۖۦۧۡۘۖۡ۠۫۟ۘۙۜۥۜۘ۟ۚ۟ۥۥۘ"
            r18 = r14
            goto L_0x0021
        L_0x00f2:
            java.lang.String r2 = "۠۬ۡۘ۠۬ۢۦۨۨۡۙۢۗۥۜۘ۠ۗۢۚ۬ۗ"
            r17 = r15
            goto L_0x0021
        L_0x00f8:
            java.lang.String r13 = "non"
            java.lang.String r2 = "ۦۦۥۘ۠ۨۤۘۙۦۘۙۖۜۦ۫ۜۨ۟۬ۨۢ"
            goto L_0x0021
        L_0x00fe:
            java.lang.String r2 = "ۥ۟۬ۥ۟ۙۛۦۖۗۘۡۨۗۜۘ۬۠ۨۘ"
            r16 = r13
            goto L_0x0021
        L_0x0104:
            java.lang.String r2 = "ۖۙۖۘۧۡۤ۠ۖۥۘۘۖۜ۠ۤۘۘۜۘ۫۟ۜۛ"
            r12 = r8
            goto L_0x0021
        L_0x0109:
            r25 = -1063865887(0xffffffffc096b1e1, float:-4.7092137)
            java.lang.String r2 = "ۜ۬۠ۛۖۦ۟ۚۦۘ۟ۡ۫ۚ۫ۤۜۥۘۨۦۥ"
        L_0x010e:
            int r26 = r2.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -821394086: goto L_0x0118;
                case -482106810: goto L_0x0123;
                case 530342368: goto L_0x022a;
                case 1971180779: goto L_0x011e;
                default: goto L_0x0117;
            }
        L_0x0117:
            goto L_0x010e
        L_0x0118:
            java.lang.String r2 = "۬ۛۤ۬ۛۤ۠ۨۡۘۢۢۘۘۤۢۚۦۜۛۥۡۤۥۗۡۘۖۡۛ"
            goto L_0x010e
        L_0x011b:
            java.lang.String r2 = "ۦ۫ۛۤ۠ۛ۟ۨۤۘ۠ۗۤۙۧۙۗ۠ۙ۬ۡ"
            goto L_0x010e
        L_0x011e:
            if (r38 == 0) goto L_0x011b
            java.lang.String r2 = "۟ۚۘۥۡۨۘ۟۟ۥۘۜۦ۫ۚۧ۫ۥۧ"
            goto L_0x010e
        L_0x0123:
            java.lang.String r2 = "ۙۧۜ۫ۘۦ۬۫ۨۦۥۘۘۗۘۨۘ۫ۡۨۘۤۢۢۜۦۖۘ۠ۘۧۘ"
            goto L_0x0021
        L_0x0127:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "۠۫ۜۘۥۧۡۘۥۥۖۘۘۨ۬ۜۖ۠۠ۥۧۛۦۨۘۤۢۙ۟ۖ"
            goto L_0x0021
        L_0x0130:
            java.lang.Object[] r10 = r38.toArray()
            java.lang.String r2 = "ۢ۟ۢۡۥۙۛ۟ۖۚۘۖۘۥۧ۬"
            goto L_0x0021
        L_0x0138:
            int r9 = r10.length
            java.lang.String r2 = "ۦ۫۫ۤۜۦۘ۬ۢۙۚۛۙۘۘۜۗۧۖۘۨۗ۟۠ۥۦ۠ۜۡۘ"
            goto L_0x0021
        L_0x013d:
            java.lang.String r2 = "ۛۚۦۘۥ۠۬۠ۢۥ۬۟۠ۘۧۖۘۢۧۦۘ۬ۨۦۗۗۡ"
            r7 = r8
            goto L_0x0021
        L_0x0142:
            java.lang.String r2 = "ۥۖ۟ۢۥ۬ۥۘۘۢ۠ۨۘ۟ۡۢۚۧۦۘۧۥۖ۫ۧۘۘۡۤۛ"
            r5 = r6
            goto L_0x0021
        L_0x0147:
            java.lang.String r2 = "ۧۥۘ۫ۥ۠۬۠۫۟۟ۙ۟۠ۜۘ"
            r12 = r7
            goto L_0x0021
        L_0x014c:
            r25 = -281112029(0xffffffffef3e9223, float:-5.897882E28)
            java.lang.String r2 = "ۦ۬ۦۜۤۘۘۗ۬ۖۚۤۜ۫ۥ۫ۘۖۘۛۥۧۖۖۘۘ"
        L_0x0151:
            int r26 = r2.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1746770664: goto L_0x015b;
                case -463949206: goto L_0x022a;
                case 1190834956: goto L_0x0163;
                case 1547453019: goto L_0x0166;
                default: goto L_0x015a;
            }
        L_0x015a:
            goto L_0x0151
        L_0x015b:
            if (r5 >= r9) goto L_0x0160
            java.lang.String r2 = "ۧۨۜۘ۠۠۬ۥ۫۟ۖۚۜۢۖۥۛ۟ۡۘۧۖۜ"
            goto L_0x0151
        L_0x0160:
            java.lang.String r2 = "۠ۧۚۧ۟ۡۘۤۚ۠ۚۛۢۤۙۚۥۛۖ۫ۥۛۙۥۤۡ۟"
            goto L_0x0151
        L_0x0163:
            java.lang.String r2 = "۟ۗۚۜۦۨۘ۫۫ۦۗۜۘۥ۠ۥۖۛ۠۟ۜ۬ۥۚۗۤ۫۬"
            goto L_0x0151
        L_0x0166:
            java.lang.String r2 = "ۘۡ۫ۡۘ۫ۥۥ۠ۗۛۚۗۙۜ"
            goto L_0x0021
        L_0x016a:
            r2 = r10[r5]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = ","
            java.lang.String r4 = a.a.f(r11, r2, r4)
            java.lang.String r2 = "ۡ۫ۧ۫ۘۘ۠ۦۖ۫ۥۜۢۥۘۤۨۦۤۜۜۘۧ۬ۥ۬ۢۛ"
            goto L_0x0021
        L_0x0178:
            int r3 = r5 + 1
            java.lang.String r2 = "ۦ۬ۘ۟ۚۦۡۖۘۘۤۧۧ۠ۥۥۗۜۘۗۡۚۗۤۦۦۦ"
            goto L_0x0021
        L_0x017e:
            java.lang.String r2 = "ۢۛۘۨۗۡۛۤۨۘۙۘۦۘۗۖۘ۠ۤ۠ۘۙۦ۬۟ۦ"
            r5 = r3
            goto L_0x0021
        L_0x0183:
            java.lang.String r2 = "ۜۗۦۙۦۦۘۗ۠ۢۥ۬ۧۡۖۖۘ"
            r7 = r4
            goto L_0x0021
        L_0x0188:
            java.lang.String r2 = "received_message"
            r0 = r24
            r1 = r29
            r0.put(r2, r1)
            java.lang.String r2 = "ۤۗۢۨۙ۫ۧۦ۠۠ۗ۠ۙۛۜۘۖ۟۬ۚۗۘۘ۫ۚۙ"
            goto L_0x0021
        L_0x0195:
            java.lang.String r2 = "reply_message"
            r0 = r24
            r1 = r30
            r0.put(r2, r1)
            java.lang.String r2 = "ۥ۬ۖۘۡۢۖۚۦۧۢ۬ۡۨۤۛۢۦ۟ۖۖۦ"
            goto L_0x0021
        L_0x01a2:
            java.lang.String r2 = "recipients"
            r0 = r24
            r1 = r31
            r0.put(r2, r1)
            java.lang.String r2 = "ۢۙ۬۟۫ۢۗۥۛۜۨۘۛۨ۟ۜۢۨۧۧۨ۬ۨۤۢ۟ۙ"
            goto L_0x0021
        L_0x01af:
            java.lang.String r2 = "reply_delay"
            r0 = r24
            r1 = r32
            r0.put(r2, r1)
            java.lang.String r2 = "۬ۖ۬ۢۢ۠۠ۧ۠۠ۦۘ۬۫ۧۨۛ۬ۢۡۛۜۥۥ"
            goto L_0x0021
        L_0x01bc:
            java.lang.String r2 = "pattern_matching"
            r0 = r24
            r1 = r33
            r0.put(r2, r1)
            java.lang.String r2 = "ۡ۬۠ۢۜۨۘ۟ۡ۟ۨۛۨۘۧۘۨۘۗۧۛ"
            goto L_0x0021
        L_0x01c9:
            java.lang.String r2 = "disabled"
            java.lang.Integer r25 = java.lang.Integer.valueOf(r34)
            r0 = r24
            r1 = r25
            r0.put(r2, r1)
            java.lang.String r2 = "ۡۦۜۧۘۡۧۥۜۘۛۖۘۘۦ۬ۛۖۜۨ۬ۥۦ"
            goto L_0x0021
        L_0x01da:
            java.lang.String r2 = "start_time"
            r0 = r24
            r1 = r35
            r0.put(r2, r1)
            java.lang.String r2 = "۟۫ۘۘ۟۫ۥۘ۟ۜ۬ۥۛۘۗۢۥۘۨۚ۠۟۫ۛ"
            goto L_0x0021
        L_0x01e7:
            java.lang.String r2 = "end_time"
            r0 = r24
            r1 = r36
            r0.put(r2, r1)
            java.lang.String r2 = "ۤۖۤ۟۟ۘۘۙۤۥۛۖۘۗۡۧۘ"
            goto L_0x0021
        L_0x01f4:
            java.lang.String r2 = "specific"
            r0 = r24
            r1 = r16
            r0.put(r2, r1)
            java.lang.String r2 = "۠ۚۛۧۥۘۡۗۤۢۖۥۘۚۥۜۡۦۥۘۜۚۨ۬۫ۖۘ"
            goto L_0x0021
        L_0x0201:
            java.lang.String r2 = "ignored"
            r0 = r24
            r0.put(r2, r12)
            java.lang.String r2 = "ۨۘ۟ۘۡۦۘۗۗ۠ۘۦۥۘ۟ۛۜۥۢۛۢۥۛ۫۬ۨۘ"
            goto L_0x0021
        L_0x020c:
            r0 = r28
            android.database.sqlite.SQLiteDatabase r2 = r0.f630b
            java.lang.String r3 = "automsg"
            r4 = 0
            r0 = r24
            long r2 = r2.insert(r3, r4, r0)
            return r2
        L_0x021a:
            java.lang.String r2 = "۫ۧ۟۫ۤ۬۫ۜۘۤۡۛ۬ۘۗۤۤۘ"
            goto L_0x0021
        L_0x021e:
            java.lang.String r2 = "ۧۥۡۘۗۨۖ۬۟ۚۥۙۜۛ۫ۨۖۖۙ"
            goto L_0x0021
        L_0x0222:
            java.lang.String r2 = "ۥ۟۬ۥ۟ۙۛۦۖۗۘۡۨۗۜۘ۬۠ۨۘ"
            goto L_0x0021
        L_0x0226:
            java.lang.String r2 = "ۥۖ۟ۢۥ۬ۥۘۘۢ۠ۨۘ۟ۡۢۚۧۦۘۧۥۖ۫ۧۘۘۡۤۛ"
            goto L_0x0021
        L_0x022a:
            java.lang.String r2 = "۫۫ۥ۫ۥۨۘۛ۟ۦۘۖ۫ۗۤ۫ۚۨۖۘۗۥۙ"
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.autoschedreply.AutoMessageSQLiteAdapter.cc(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList):long");
    }

    public void close() {
        String str = "ۨ۬ۜۘۨۤۘ۫ۖۡۘۗۘۧۘ۟۫ۦۖۚ۠ۜۤۛۖۨ۠";
        while (true) {
            switch ((str.hashCode() ^ 39) ^ 2014863917) {
                case -252370949:
                    this.f631c.close();
                    str = "ۤ۟ۡۘۥۨۖۘۨ۬ۥۛ۫ۦۜ۠ۤۢۨۨۡۖ۠";
                    break;
                case 29420135:
                    str = "ۡۚۗۤۛۙۖۨۘ۬ۚۥۘ۟ۥ۫ۡۧۘ۟ۖۘ";
                    break;
                case 668188791:
                    return;
            }
        }
    }

    public long delete(int i2) {
        String str = "۠ۨۗۥۘۗۙۧۜۘۛۘۦ۠ۢ۠ۧۤۥۙ۠ۗ";
        StringBuilder sb = null;
        SQLiteDatabase sQLiteDatabase = null;
        while (true) {
            switch ((str.hashCode() ^ 399) ^ 478316484) {
                case -1427487657:
                    str = "ۨۧۜ۫۠۫ۨۘۨۧۚۙۙۢۘۗ۬ۖۘ";
                    break;
                case -769310288:
                    sQLiteDatabase = this.f630b;
                    str = "ۚۖۧۘۢ۟ۢۚۦۡ۠ۡۦۤۡۘۤۚۨۗ۫ۥ";
                    break;
                case 110589593:
                    sb = new StringBuilder("_id=");
                    str = "ۤ۫ۘۙ۠۠۟ۚۛ۫ۛۜ۫۫ۖۘۗۘۨۘ۟ۢۚ";
                    break;
                case 966543899:
                    sb.append(i2);
                    str = "ۖۥۘۙۡۨۡۡۦۥۖۤۛۡۛ";
                    break;
                case 989366676:
                    str = "ۧۡ۫ۗ۟۠۠ۦ۟ۛۖۜۘۨ۫ۘۘۨۗ";
                    break;
                case 2054576794:
                    return (long) sQLiteDatabase.delete("automsg", sb.toString(), (String[]) null);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0237, code lost:
        r2 = "ۚۗۛۨۤۥۘۢۙۗۦۜۥۘ۠۟ۨۤ۠ۡۘۤۧۖۘۚۡ۟";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long hh(java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, java.lang.String r35, java.lang.String r36, int r37, java.util.ArrayList<? extends java.lang.Object> r38, java.util.ArrayList<? extends java.lang.Object> r39) {
        /*
            r28 = this;
            r24 = 0
            r6 = 0
            r8 = 0
            r23 = 0
            r22 = 0
            r21 = 0
            r19 = 0
            r20 = 0
            r15 = 0
            r14 = 0
            r18 = 0
            r17 = 0
            r13 = 0
            r16 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r12 = 0
            r4 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            java.lang.String r2 = "ۤۙۖۘ۫ۖۤ۫ۛۤۖۛۘۘۥۦ۠۫ۚۗ"
        L_0x0021:
            int r25 = r2.hashCode()
            r26 = 770(0x302, float:1.079E-42)
            r27 = -326538287(0xffffffffec896bd1, float:-1.3290559E27)
            r25 = r25 ^ r26
            r25 = r25 ^ r27
            switch(r25) {
                case -2096351619: goto L_0x01aa;
                case -2061423044: goto L_0x01e2;
                case -1994751624: goto L_0x0041;
                case -1948736243: goto L_0x0106;
                case -1913433470: goto L_0x004a;
                case -1878274327: goto L_0x00bc;
                case -1752973496: goto L_0x018b;
                case -1661461353: goto L_0x0035;
                case -1572201192: goto L_0x00b6;
                case -1520777483: goto L_0x01b7;
                case -1265931346: goto L_0x022b;
                case -1186953961: goto L_0x0056;
                case -1149217627: goto L_0x0087;
                case -1134658660: goto L_0x0209;
                case -938865667: goto L_0x0062;
                case -882700177: goto L_0x0233;
                case -781154542: goto L_0x012f;
                case -685102678: goto L_0x0053;
                case -642375705: goto L_0x0044;
                case -495131120: goto L_0x003b;
                case -455234474: goto L_0x0038;
                case -362904028: goto L_0x0096;
                case -303005399: goto L_0x004d;
                case -240326879: goto L_0x01fc;
                case -135669978: goto L_0x0138;
                case -52677697: goto L_0x0140;
                case -42566272: goto L_0x0190;
                case 82034425: goto L_0x00b0;
                case 108058111: goto L_0x0172;
                case 209374933: goto L_0x0180;
                case 401074105: goto L_0x010c;
                case 411074995: goto L_0x00f4;
                case 436889164: goto L_0x00ee;
                case 488007454: goto L_0x0111;
                case 498642111: goto L_0x014a;
                case 689779362: goto L_0x00a4;
                case 753394463: goto L_0x00de;
                case 757897912: goto L_0x01c4;
                case 839877301: goto L_0x01ef;
                case 918755590: goto L_0x008f;
                case 930753440: goto L_0x0145;
                case 932151336: goto L_0x0047;
                case 990611239: goto L_0x0100;
                case 1022587159: goto L_0x005e;
                case 1085444268: goto L_0x0154;
                case 1126764784: goto L_0x009e;
                case 1280507566: goto L_0x01d1;
                case 1650409908: goto L_0x00fa;
                case 1654001144: goto L_0x00aa;
                case 1756729715: goto L_0x0032;
                case 1777890371: goto L_0x0050;
                case 1794657663: goto L_0x0214;
                case 1819919683: goto L_0x0186;
                case 1965484548: goto L_0x014f;
                case 1973930027: goto L_0x0067;
                case 2062090130: goto L_0x019d;
                case 2116328441: goto L_0x003e;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0021
        L_0x0032:
            java.lang.String r2 = "ۙۜۙ۠ۚۦۘۢۚۤۦ۟ۚۜ۟۬ۡ۬ۡ"
            goto L_0x0021
        L_0x0035:
            java.lang.String r2 = "ۧ۫۠ۜۧۦۘۨۚۘۘۦۢۤۜۨۜۘۦۖۖ۬۠ۨۘ"
            goto L_0x0021
        L_0x0038:
            java.lang.String r2 = "ۤۙ۬ۚۡ۬۫ۨ۬ۡۧۜۖۘۚ"
            goto L_0x0021
        L_0x003b:
            java.lang.String r2 = "ۤۖۙۥۧۘۘ۟ۙۢۡۦۖۢۚۨۚۦۜۨۙۗۖ۬"
            goto L_0x0021
        L_0x003e:
            java.lang.String r2 = "ۜۖۧۘۖۖۘۘۧۚۧۜۖۚۛۚۦۢ۟ۦۧۦۘۤۚۡ"
            goto L_0x0021
        L_0x0041:
            java.lang.String r2 = "۬ۖۦۦۧۦۢۙۜۦۨۨۘۨۨۚۖۚۥۤۥۖۨۜ"
            goto L_0x0021
        L_0x0044:
            java.lang.String r2 = "ۡۥۡۘۤۖۦ۟ۘۧۘۛۥۜۘۨۛۥۖۤ۠ۛۛۤ"
            goto L_0x0021
        L_0x0047:
            java.lang.String r2 = "ۤ۟ۚۨۚۘۘ۫ۡۡۘۡۢۦ۟ۦۘۘۖ۬ۡۘۚۨۚ"
            goto L_0x0021
        L_0x004a:
            java.lang.String r2 = "ۘۗ۠ۘۤۨ۬ۜ۟ۖۖۥ۬ۥۦۦۨۘ"
            goto L_0x0021
        L_0x004d:
            java.lang.String r2 = "ۛۨۥ۫ۜۙۧۛ۫۟ۨۘۥۦۨۘۘۘۖۘ۟ۥ۬ۗۘۜ"
            goto L_0x0021
        L_0x0050:
            java.lang.String r2 = "۟ۥۨۙۦۧۢۙ۟ۙ۫ۛۢ۬ۜ"
            goto L_0x0021
        L_0x0053:
            java.lang.String r2 = "ۥۛ۟ۜۗ۬۫ۙۤ۠ۥۡۧۦۡۘ"
            goto L_0x0021
        L_0x0056:
            android.content.ContentValues r24 = new android.content.ContentValues
            r24.<init>()
            java.lang.String r2 = "ۥۙۖۜۜۜۡۢ۟ۚۗۛ۠۬ۤۛ۟ۦۦۡۖۧۡۥۘ"
            goto L_0x0021
        L_0x005e:
            r6 = 0
            java.lang.String r2 = "ۤ۬ۤۚۜۜ۬ۚۗۧۜۥۜۤۙۡۘۖۘۙۥ۟"
            goto L_0x0021
        L_0x0062:
            java.lang.String r8 = "non"
            java.lang.String r2 = "ۘۥۘۜۦۚۦ۫ۢۖۚ۠ۜۥۤۙۤۨۘ۬ۖۜۘ"
            goto L_0x0021
        L_0x0067:
            r25 = -1831842384(0xffffffff92d04db0, float:-1.3145797E-27)
            java.lang.String r2 = "ۤۛۜ۟۫ۦۨ۬۫ۗ۟ۧ۟ۚۦۘ۬ۧۘۘۧ۬ۤۙۛۡۘ"
        L_0x006c:
            int r26 = r2.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case 70088501: goto L_0x0081;
                case 382469055: goto L_0x0076;
                case 611646483: goto L_0x007c;
                case 976982650: goto L_0x0084;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x006c
        L_0x0076:
            java.lang.String r2 = "ۧ۠ۨۤ۫ۖۜۥۥۘۜۙۜۡۙۙ۫ۛۢ"
            goto L_0x0021
        L_0x0079:
            java.lang.String r2 = "۟ۛ۟ۖۚۡۗۥ۬ۙۜۖۘۨ۬ۨۦۧ۫"
            goto L_0x006c
        L_0x007c:
            if (r38 == 0) goto L_0x0079
            java.lang.String r2 = "ۜۡۡۛۧۡۘۙۚۘۦۗۙۛۦ۠"
            goto L_0x006c
        L_0x0081:
            java.lang.String r2 = "ۛۚۤ۠ۥۘۘ۬ۚۥۘۤۛۨ۠ۚۡۘۛۨۖۘۚ۬ۦۘ"
            goto L_0x006c
        L_0x0084:
            java.lang.String r2 = "ۗۦۖۨۜۢۛۚۧۙ۬ۗۤ۫ۥۧۘۗۙۡ۟ۤۛۙ"
            goto L_0x0021
        L_0x0087:
            java.lang.StringBuilder r23 = new java.lang.StringBuilder
            r23.<init>()
            java.lang.String r2 = "ۘۡۙ۫۟ۖۘۗ۬ۨۘۥ۬۠۠۟ۖۛۖۙ"
            goto L_0x0021
        L_0x008f:
            java.lang.Object[] r22 = r38.toArray()
            java.lang.String r2 = "ۤ۟ۤ۟ۥۙۚۗۦۦۙۧۢۢۖۘ"
            goto L_0x0021
        L_0x0096:
            r0 = r22
            int r0 = r0.length
            r21 = r0
            java.lang.String r2 = "ۦ۬ۦۘۗۗۧۧۢۦۘۢۧۡۖۖۡۘ۫۠ۙۖ۬"
            goto L_0x0021
        L_0x009e:
            r19 = 0
            java.lang.String r2 = "ۙۜۦ۬ۦ۫ۙۧۥۧۜۖۙ۬ۧ۬ۘۘۢۧۖۘۦۨۛ۬ۤۡۘ"
            goto L_0x0021
        L_0x00a4:
            java.lang.String r20 = "non"
            java.lang.String r2 = "ۦۘۜۘۖۗۘۘۛۖۥۘۜۡ۫۫۟ۨۘ۟۠ۧۥ۫ۦۖۚ"
            goto L_0x0021
        L_0x00aa:
            java.lang.String r2 = "۬ۧۜۘۢۥۚۖ۟۬ۤ۠ۖۘۦۜۖۜۢۥۘ۠ۥۧۘۨۙۦۘ۬ۜ۫"
            r17 = r20
            goto L_0x0021
        L_0x00b0:
            java.lang.String r2 = "۠ۤۥۢ۫ۥۘ۬ۡۗۦ۬۬ۜۨۘ"
            r18 = r19
            goto L_0x0021
        L_0x00b6:
            java.lang.String r2 = "۟ۦۡۘۙ۟۬۬ۢۡ۟ۡۜۘۗ۫ۖۘۘ۠ۦۘۘۤۗ"
            r16 = r17
            goto L_0x0021
        L_0x00bc:
            r25 = -740390486(0xffffffffd3de89aa, float:-1.91158472E12)
            java.lang.String r2 = "ۨ۫ۜۦ۠۬ۨۗ۠ۙۦۥۘۙۜۧۙۡ۠"
        L_0x00c1:
            int r26 = r2.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -428475258: goto L_0x00d2;
                case 388882165: goto L_0x00db;
                case 573937793: goto L_0x00cb;
                case 1391704369: goto L_0x022f;
                default: goto L_0x00ca;
            }
        L_0x00ca:
            goto L_0x00c1
        L_0x00cb:
            java.lang.String r2 = "۠ۘۨ۠۟ۦۙۚۖ۫ۧ۟ۦۙۤ"
            goto L_0x0021
        L_0x00cf:
            java.lang.String r2 = "۫ۛۦ۟۬ۥۥ۫ۚۖۘۥ۬ۘۘ"
            goto L_0x00c1
        L_0x00d2:
            r0 = r18
            r1 = r21
            if (r0 >= r1) goto L_0x00cf
            java.lang.String r2 = "ۜ۠۫۬ۢۖۘ۬ۘۗۢۧۙ۟ۦۨۘ"
            goto L_0x00c1
        L_0x00db:
            java.lang.String r2 = "ۛۘۜۥۢۢ۠ۥۙۢۙۜۘۥۥۖۚۜۡۘ۟ۢۤۤۤۡۘۡ۠ۖۘ"
            goto L_0x00c1
        L_0x00de:
            r2 = r22[r18]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r15 = ","
            r0 = r23
            java.lang.String r15 = a.a.f(r0, r2, r15)
            java.lang.String r2 = "ۦۚۚ۬ۜۧۡ۟ۘۚۥۘۙۥۖۚۦۜۘۡۡۨۖ۫ۨۘ"
            goto L_0x0021
        L_0x00ee:
            int r14 = r18 + 1
            java.lang.String r2 = "ۖۗۘۘۡۥ۬ۡۤۘۢۙۜ۟ۧ۟"
            goto L_0x0021
        L_0x00f4:
            java.lang.String r2 = "ۙۡۨۘ۟ۚۘۙۗۦۘۜۛ۟ۧۥۨۘۘۧۨۘۢۙۖۜۚ۬ۜۖۨ"
            r18 = r14
            goto L_0x0021
        L_0x00fa:
            java.lang.String r2 = "ۛۢ۬ۙ۫ۨۘۗۢ۠ۜۥۛ۫ۙۨۛۢ"
            r17 = r15
            goto L_0x0021
        L_0x0100:
            java.lang.String r13 = "non"
            java.lang.String r2 = "ۜ۠ۦۘۜۙۖۨۧۡۘۗۦۢۨۖۜۢ۬ۜ۠ۨۤ"
            goto L_0x0021
        L_0x0106:
            java.lang.String r2 = "ۥۦۜۨۧ۫ۧۗۖۙ۫ۦۘۙ۠۬ۨ۫ۖۤۨ۟ۢۥۡ"
            r16 = r13
            goto L_0x0021
        L_0x010c:
            java.lang.String r2 = "۠۫ۛۗ۫ۧۦۤۜۘۖۘۡۘ۠ۥۦۘ"
            r12 = r8
            goto L_0x0021
        L_0x0111:
            r25 = 1250427443(0x4a880233, float:4456729.5)
            java.lang.String r2 = "۬ۦۧۘۘۧۘ۬ۖۦ۬ۚۖۘۦ۠ۤۡۧۨۘۦۗۢۖۚۜ۠ۙۥۘ"
        L_0x0116:
            int r26 = r2.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1743730548: goto L_0x0237;
                case -1721057354: goto L_0x0127;
                case -579413962: goto L_0x012c;
                case 1659202439: goto L_0x0120;
                default: goto L_0x011f;
            }
        L_0x011f:
            goto L_0x0116
        L_0x0120:
            java.lang.String r2 = "ۛۘ۟ۘ۬ۗ۠ۨۡ۠۠۟۬ۜ۬ۛۚ۫۫۬ۢۡۥۧۢ۬ۤ"
            goto L_0x0021
        L_0x0124:
            java.lang.String r2 = "ۘۛ۫ۙۢۦۘۢۗۡۖ۬ۘۘۛ۟ۨۖۚۦۥۗۜۘۤۢۘۘۦۦۨ"
            goto L_0x0116
        L_0x0127:
            if (r39 == 0) goto L_0x0124
            java.lang.String r2 = "۟ۚۥۡۖۡۘۛۧۚۜ۟ۧۨۗۨ۟ۥۖۚۤۢۜۡ۟"
            goto L_0x0116
        L_0x012c:
            java.lang.String r2 = "۟ۛۨۚۨۦۘۗ۫ۨۘۚۢ۠ۛۚۛ"
            goto L_0x0116
        L_0x012f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "ۦۙۖ۠۬ۛۛۚۥۛۨۘۗۘۡۜۨۙ۟ۙۡۘۚۡ۫"
            goto L_0x0021
        L_0x0138:
            java.lang.Object[] r10 = r39.toArray()
            java.lang.String r2 = "ۜۜ۫ۤۦ۠۠۠ۜۘۜۜۦۘۙ۠ۘۥ۬۫ۥ۫۫ۖ۠ۧ"
            goto L_0x0021
        L_0x0140:
            int r9 = r10.length
            java.lang.String r2 = "۬ۨۘۘ۟ۗۛۨ۫۠ۙ۟ۢ۟ۖۘۘۧۥ۠۠ۨۡۦ۟۫ۢۗ"
            goto L_0x0021
        L_0x0145:
            java.lang.String r2 = "ۖۧۥۘۗۜ۟ۗۥۘۗۛۙۘۢ۬۫ۙۛ۠ۖۜۤۚۜۘ"
            r7 = r8
            goto L_0x0021
        L_0x014a:
            java.lang.String r2 = "ۡۘۜۘ۠ۡۦۘ۫ۡۧۖ۟ۤۤۧۖۙۜۧۘ"
            r5 = r6
            goto L_0x0021
        L_0x014f:
            java.lang.String r2 = "۟۟ۜۘۨۚ۠۫ۡ۠ۛۗۡۜۨۘۘۢۘۨۘ۟ۛۨۜۧۖۘۘۥۦ"
            r12 = r7
            goto L_0x0021
        L_0x0154:
            r25 = 1742572762(0x67dd8cda, float:2.0924825E24)
            java.lang.String r2 = "ۘۜۖۚۧ۠ۖۢۨۘۗۙ۟ۛۙۚۜ۫ۦ۬ۡ۠۠ۡۡۘۢۡۢ"
        L_0x0159:
            int r26 = r2.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -2071369886: goto L_0x016e;
                case -1397427231: goto L_0x0169;
                case 262239748: goto L_0x0163;
                case 542668863: goto L_0x0237;
                default: goto L_0x0162;
            }
        L_0x0162:
            goto L_0x0159
        L_0x0163:
            java.lang.String r2 = "ۨۙ۟ۧۘۛۨ۟۬۫ۘۘۧۚۤۧۜ۬"
            goto L_0x0159
        L_0x0166:
            java.lang.String r2 = "۫ۘۘۘۜ۠ۥۤۜۥۛۖۢۥۘ۟ۘ۠ۖ۫ۥۘۙۥ۟"
            goto L_0x0159
        L_0x0169:
            if (r5 >= r9) goto L_0x0166
            java.lang.String r2 = "ۜۖۢۥۚۘۘۤۗ۟۫۬ۦۨۨۙۢۧۦ"
            goto L_0x0159
        L_0x016e:
            java.lang.String r2 = "ۦ۠ۘۦۢۘۘۦۧۛ۟ۖۘۢۘۤۚۢۛۛۗۜۘۘۦۘ۬۠۬"
            goto L_0x0021
        L_0x0172:
            r2 = r10[r5]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = ","
            java.lang.String r4 = a.a.f(r11, r2, r4)
            java.lang.String r2 = "۫ۗۤۡ۠ۙ۫ۜ۬ۥ۠ۖۛۗۡۤ۫ۥۙۛ۠ۢۥ"
            goto L_0x0021
        L_0x0180:
            int r3 = r5 + 1
            java.lang.String r2 = "ۤۦۥ۟۬۟ۗ۫ۗ۠۠ۘۡۜۧۘ"
            goto L_0x0021
        L_0x0186:
            java.lang.String r2 = "ۡۘۥۘۧۜۜۤ۟ۨۚۖۜۘۡ۟ۡۡ۬ۡ"
            r5 = r3
            goto L_0x0021
        L_0x018b:
            java.lang.String r2 = "۫۬۫ۥ۟۟ۖۨ۟ۗۨۦۢۧۜۘۖۧۢۗۥۚ۫ۖۘۧۨ۫"
            r7 = r4
            goto L_0x0021
        L_0x0190:
            java.lang.String r2 = "received_message"
            r0 = r24
            r1 = r29
            r0.put(r2, r1)
            java.lang.String r2 = "۫ۚۖۗۜۛۤۖۘۥۗ۟ۘۡۖۘ"
            goto L_0x0021
        L_0x019d:
            java.lang.String r2 = "reply_message"
            r0 = r24
            r1 = r30
            r0.put(r2, r1)
            java.lang.String r2 = "ۢۖ۟ۚۧۨۘۚۥۜۘۙۘۤۚۥۧۘ۟ۢۙۧۥۨۜۘ۟ۨۙ"
            goto L_0x0021
        L_0x01aa:
            java.lang.String r2 = "recipients"
            r0 = r24
            r1 = r31
            r0.put(r2, r1)
            java.lang.String r2 = "ۦۚۨۥۡۡۘۖۜۥ۠۫ۨۘۚۤۧۤ۠ۘۘ"
            goto L_0x0021
        L_0x01b7:
            java.lang.String r2 = "reply_delay"
            r0 = r24
            r1 = r32
            r0.put(r2, r1)
            java.lang.String r2 = "ۗۚۡۜ۠ۦۢۨۦۧۥۙۡ۠۠۠ۨۡ۫۠ۙۦۤۖ"
            goto L_0x0021
        L_0x01c4:
            java.lang.String r2 = "pattern_matching"
            r0 = r24
            r1 = r33
            r0.put(r2, r1)
            java.lang.String r2 = "۫ۜ۟۠۬ۜۖۤۘۘۥۘ۟ۤۥۖۜ۠ۘۘ"
            goto L_0x0021
        L_0x01d1:
            java.lang.String r2 = "disabled"
            java.lang.Integer r25 = java.lang.Integer.valueOf(r34)
            r0 = r24
            r1 = r25
            r0.put(r2, r1)
            java.lang.String r2 = "۟۟ۡۢۥۜ۟ۛۖۘۢۘۧۨ۠ۙۚۧۡۘۧۤۖ"
            goto L_0x0021
        L_0x01e2:
            java.lang.String r2 = "start_time"
            r0 = r24
            r1 = r35
            r0.put(r2, r1)
            java.lang.String r2 = "ۨ۟ۘۘۦۡۥۘۗۚۚۗۗۚۡ۫ۖۘ۫ۨۗ"
            goto L_0x0021
        L_0x01ef:
            java.lang.String r2 = "end_time"
            r0 = r24
            r1 = r36
            r0.put(r2, r1)
            java.lang.String r2 = "ۨۚۤۙۨۨۘۚۗۗۗۥۛۡۨۤۡۚ"
            goto L_0x0021
        L_0x01fc:
            java.lang.String r2 = "specific"
            r0 = r24
            r1 = r16
            r0.put(r2, r1)
            java.lang.String r2 = "۟ۢۨ۬ۥۙۘۥۚۤۦۘۘۥۦۤ"
            goto L_0x0021
        L_0x0209:
            java.lang.String r2 = "ignored"
            r0 = r24
            r0.put(r2, r12)
            java.lang.String r2 = "ۜۤۦۘۢ۠ۤۛۨ۫ۡۨۘۘ۠ۗ۬ۨ۫۫"
            goto L_0x0021
        L_0x0214:
            r0 = r28
            android.database.sqlite.SQLiteDatabase r2 = r0.f630b
            java.lang.String r3 = "automsg"
            java.lang.String r4 = "_id="
            r0 = r37
            java.lang.String r4 = a.a.d(r4, r0)
            r5 = 0
            r0 = r24
            int r2 = r2.update(r3, r0, r4, r5)
            long r2 = (long) r2
            return r2
        L_0x022b:
            java.lang.String r2 = "۠ۤۥۢ۫ۥۘ۬ۡۗۦ۬۬ۜۨۘ"
            goto L_0x0021
        L_0x022f:
            java.lang.String r2 = "ۥۦۜۨۧ۫ۧۗۖۙ۫ۦۘۙ۠۬ۨ۫ۖۤۨ۟ۢۥۡ"
            goto L_0x0021
        L_0x0233:
            java.lang.String r2 = "ۡۘۜۘ۠ۡۦۘ۫ۡۧۖ۟ۤۤۧۖۙۜۧۘ"
            goto L_0x0021
        L_0x0237:
            java.lang.String r2 = "ۚۗۛۨۤۥۘۢۙۗۦۜۥۘ۠۟ۨۤ۠ۡۘۤۧۖۘۚۡ۟"
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.autoschedreply.AutoMessageSQLiteAdapter.hh(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, java.util.ArrayList, java.util.ArrayList):long");
    }

    public ArrayList<object_automsg> ii() {
        int i2 = 0;
        String str = "ۥۦۨۘۙ۬ۛۛ۬ۡۛۖۡۜۘۘ۠ۦۢۖۛۚ";
        int i3 = 0;
        int i4 = 0;
        ArrayList<object_automsg> arrayList = null;
        Cursor cursor = null;
        while (true) {
            switch ((str.hashCode() ^ 785) ^ -1047069686) {
                case -1649545453:
                    str = "ۦۢۨۛۙۖۢۥۜۡۚۧ۟ۜۖۢۢۨۜۚ۫";
                    arrayList = new ArrayList<>();
                    break;
                case -1579067167:
                    str = "ۡۜ۟ۥۨ۫ۢۖۢۦۗۗۛۨۨۘۧ۠ۚ";
                    cursor = this.f630b.query("automsg", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                    break;
                case -1454023576:
                    i2 = 0;
                    str = "ۙۖۗۚۚۘ۠ۗۦ۫ۘۥۘۚۛۡ۠ۤۡ";
                    break;
                case -865918421:
                    str = "۫ۥۜۘۚۖۖۘ۬ۨ۫ۨۨۙۡۧۖ۬ۗۤۥۨۘۢۛۘ";
                    i3 = i4 + 1;
                    break;
                case -231627971:
                    cursor.moveToNext();
                    str = "ۨ۟ۙ۫ۚۦۘ۠ۥۙۧۘۜۘۧۡ۬ۥ۫ۦ۟ۥۡۢۦۘۚۜۗ";
                    break;
                case -128865382:
                    arrayList.add(new object_automsg(cursor.getInt(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getInt(6), cursor.getString(7), cursor.getString(8), cursor.getString(9), cursor.getString(10)));
                    str = "ۥ۟ۜۘۧۚۧۨۢۜۘۖۧۨۘۜۢۚۢۘۙۨ۫ۤۢ۫";
                    break;
                case -341227:
                    str = "ۗ۫ۢ۠ۨۖۘ۫۫۫۠ۨۡۘۘۚۡ۠ۚ۬ۡ۟۬ۡ۬ۨ۬ۤۜ";
                    i4 = i2;
                    break;
                case -89718:
                    str = "۬۟ۘۘۧۛۘ۠ۥۧ۬ۚۖۘۢ۠۠ۡۨۥۗۧۘ";
                    i4 = i3;
                    break;
                case 969815475:
                    cursor.close();
                    str = "ۤۥۙۨۨۚۜ۠ۚۡۡۦۘۛۧۜۨۥۘۘ";
                    break;
                case 1143931910:
                    cursor.moveToFirst();
                    str = "ۜۘۧۡۗۤ۬۫ۛۚۢۦۘۗۧۨۘ";
                    break;
                case 1513531891:
                    str = "ۘۜۚۗۧۢۛۢۖۧۚۥۢۛۛۢۜۚ۬ۛ۫ۛۥۥ۟ۛۖۘ";
                    break;
                case 1539760811:
                    String str2 = "۬ۤۘۘۘۧۡ۟ۘۗۚۚۖۤۖۧۨ۠ۖ۠ۘ۫۠ۧۛۙۖۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1345539230) {
                            case -2124982265:
                                str = "ۡۤ۬۫ۜ۫ۚ۬ۗۘ۟ۡۘۖۜ۠ۥۥ";
                                continue;
                            case -1501062047:
                                str = "ۧۜۢۚۨۜۙ۬ۨۘۚۤ۟ۨۢۛۙۛۧۦۥۚ۫ۜۘ";
                                continue;
                            case -1310814734:
                                if (i4 >= cursor.getCount()) {
                                    str2 = "ۦۘۜۜۚۛ۠۠ۥۘۚۙۥۘۘ۫ۨۤ۬ۦۡ۬ۚۡۘ";
                                    break;
                                } else {
                                    str2 = "ۡۚۛۜ۟ۢۖۖۢۘۗۖۙۥۘۗۚ۠ۡۛۜۘ";
                                    break;
                                }
                            case 96634267:
                                str2 = "ۗۥۖۘۥۚۨ۬ۦۦۚۛۗۨۥۦۧۦۘ۬ۡۛ۟ۗۖۘ";
                                break;
                        }
                    }
                    break;
                case 1741778544:
                    str = "ۗ۫ۢ۠ۨۖۘ۫۫۫۠ۨۡۘۘۚۡ۠ۚ۬ۡ۟۬ۡ۬ۨ۬ۤۜ";
                    break;
                case 1872201980:
                    return arrayList;
            }
        }
    }

    public void kk() {
        ArrayList arrayList = null;
        Cursor cursor = null;
        GregorianCalendar gregorianCalendar = null;
        int i2 = 0;
        String str = "ۜ۬ۢۜ۫ۦ۠۠ۖۘۛۧ۠ۗۛۥۘۢۜۤ";
        Iterator it = null;
        int i3 = 0;
        String[] strArr = null;
        String[] strArr2 = null;
        String str2 = null;
        String str3 = null;
        int i4 = 0;
        while (true) {
            switch ((str.hashCode() ^ 162) ^ -927535009) {
                case -1908453490:
                    str = "ۗۡۦۤۗۜۡۤ۫ۥۙۛۥ۫ۡۗۨۦۘۚ۠ۜۨ۟ۦۤ۬ۨ";
                    strArr = str2.split(":");
                    break;
                case -1660222168:
                    String str4 = "ۙۛۥۗ۬۬ۢۛۙۧۚۖۨۛۖۘۦۗۥۘۤ۠ۢ";
                    while (true) {
                        switch (str4.hashCode() ^ 720960887) {
                            case -759092610:
                                str = "۠ۥۥۘۛۥۡۗۨۦۢۡ۟ۚۙ۟ۖۥۜۨۗۚۛ";
                                continue;
                            case -419716255:
                                if (!gregorianCalendar.after(new GregorianCalendar(Integer.parseInt(strArr2[0].trim()), Integer.parseInt(strArr2[1].trim()) - 1, Integer.parseInt(strArr2[2].trim()), Integer.parseInt(strArr[0].trim()), Integer.parseInt(strArr[1].trim())))) {
                                    str4 = "ۖۛۖۖۜ۬ۤۧۡۘ۟۟ۨۘۨ۠ۖۘ";
                                    break;
                                } else {
                                    str4 = "ۦۙۤۜۤۥۘۤۥۦۗۗۙ۬ۚۦۜۦۙۛۥۧ";
                                    break;
                                }
                            case 868622321:
                                str4 = "ۦۛۨۡۢۦۘ۫ۧۢۚۢۨۥۗۨ۬ۡۘ۫ۖۖۘۙۘۨۘ";
                                break;
                            case 1425499662:
                                str = "ۢۗۧۢۖۧۖۧۢۡۚ۬ۙۖۙۨۡۜ";
                                continue;
                        }
                    }
                    break;
                case -1604116352:
                    i2 = 0;
                    str = "ۚ۠۬ۘۧۚۢۦۨۚۤۛۦۖ۫";
                    break;
                case -1572677291:
                    str = "ۖۚۚۥۛۥۘۚۙ۬ۨۧۘ۬ۤۖ";
                    strArr2 = str3.split("-");
                    break;
                case -1546484165:
                    str = "ۤ۟ۨۘۥ۫ۡۘۤۤۥ۫ۙۛۤۦ۫ۘۨۥ";
                    break;
                case -1492145007:
                    cursor.close();
                    str = "ۢۚۥۘۜ۬ۜۘۜۥۘۢۚۡۘۗۦۚۜ۟";
                    break;
                case -1422296430:
                    str = "ۢ۠ۖۜۘۡۡۛۡۡۙۗۚ۟ۚۢ";
                    i3 = i4 + 1;
                    break;
                case -1125486662:
                    arrayList.add(Integer.valueOf(cursor.getInt(0)));
                    str = "ۢۗۧۢۖۧۖۧۢۡۚ۬ۙۖۙۨۡۜ";
                    break;
                case -760386321:
                    cursor.moveToFirst();
                    str = "۬ۘۨۨۤۘۘۛۗ۠۫ۘۧۘۛۖۗ";
                    break;
                case -589974284:
                    str = "ۤۡۡۜۨ۫ۨۥۚ۫ۨۦۜۦ۬ۡۙۖۗۗۗۙۡۙۢ۠";
                    i4 = i2;
                    break;
                case -224351200:
                    delete(((Integer) it.next()).intValue());
                    str = "۟ۙۛۡ۬۟ۜۘۨۙۗ۬ۨۤۜۘۦۚۖ۫ۖۙۚۤۤ";
                    break;
                case -164828636:
                    str = "ۗۖۥۘۡ۫۟۬۬ۗۧۢۖۢۡۙۘ۠۠۠ۗۡۗ";
                    cursor = this.f630b.query("automsg", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                    break;
                case -116100811:
                    str = "ۡۦۡۢۦ۠ۧ۟ۢ۫ۛۗۧۚۡۘۘۙۘۗۙۘۘۤۢۨۘۧۚۛ";
                    str2 = cursor.getString(5);
                    break;
                case -112572388:
                    str = "ۢۦۥۘۥ۟ۜۤۧۜۘۖۗۦۘۥۘۨۘ۟ۗۡۖۙۥۘۖۗ۟ۚۦۡۘ";
                    break;
                case 123796390:
                    String str5 = "ۛ۬ۖ۫ۦۨۘۡۨۘۖۢۖۜۥۚۡۙۜۥ۬ۚۚ۟ۘ۟۫ۥۘ";
                    while (true) {
                        switch (str5.hashCode() ^ -1904213135) {
                            case 115995114:
                                if (i4 >= cursor.getCount()) {
                                    str5 = "ۢۖۖۛۘۖۖۙۥۘ۟ۨۨۢۘۘۜۖۧۘۘ۠ۘۘۖۛۡۘ۠ۘ۟";
                                    break;
                                } else {
                                    str5 = "ۚ۠ۨۛۡ۫ۗۙۗ۟ۤۜ۟ۨۡۘ۫ۙۥۘۜ۠ۨ";
                                    break;
                                }
                            case 1064601433:
                                str = "۠ۧ۠ۡۥ۠ۖۧۤۢۨۥۘۛۜۛ۬ۖۧۘ";
                                continue;
                            case 1830829228:
                                str = "ۖۙۦۘ۠ۡۘۘۦۜۗۜۡۢ۬ۛۗ۬ۡۨۚۨۨ۫ۖۡۦۚ۠";
                                continue;
                            case 1987867183:
                                str5 = "ۧۧۜۘۚۡ۟ۙۛۗ۟ۦۛ۫ۦۘۘۚ۠ۤۢۚۤۗۖ۠";
                                break;
                        }
                    }
                    break;
                case 197330753:
                    str = "ۤۙۗۖ۟ۥۨۖۖۧۨۧۘ۫۬۠۟ۙ";
                    arrayList = new ArrayList();
                    break;
                case 621601562:
                    str = "ۢۦۥۘۥ۟ۜۤۧۜۘۖۗۦۘۥۘۨۘ۟ۗۡۖۙۥۘۖۗ۟ۚۦۡۘ";
                    it = arrayList.iterator();
                    break;
                case 877233431:
                    cursor.moveToNext();
                    str = "ۖۥۖۜۚ۬ۜۨۦۘۚۦۘۡۨۧ۬ۘۘ۟ۜ۟";
                    break;
                case 1185040352:
                    return;
                case 1551422943:
                    String str6 = "ۚ۟ۘۘۥۜۚۚ۠ۧ۟۟ۗۛۗۡۢۜۘ۫ۜ۬ۛۧۢ";
                    while (true) {
                        switch (str6.hashCode() ^ -410905041) {
                            case -1957830681:
                                if (!it.hasNext()) {
                                    str6 = "ۨ۟ۡۥۚۖۘۗۦۧۘ۫۠ۜۘ۫ۦ۟";
                                    break;
                                } else {
                                    str6 = "ۢۢۨۛۗۡۘۧۧۦۘ۠ۖۛ۠ۦۧۘۢۨۖ";
                                    break;
                                }
                            case 518232914:
                                str = "۬ۘۖۘۦۢ۟ۢ۫ۘ۠ۧۗۘ۬ۛۚۛۛۜۧۥۘۥۥۤ";
                                continue;
                            case 1100511517:
                                str = "۠ۜۥ۬۠ۨۘۛۨۧۨۗۡ۟ۧۘۖۦۜۘۢۦۖۘ";
                                continue;
                            case 1258577006:
                                str6 = "ۤۖۦۘ۬ۗۘۗۦۡۘ۫ۨۖۘۗۗ۫";
                                break;
                        }
                    }
                    break;
                case 1575290511:
                    str = "ۤۡۡۜۨ۫ۨۥۚ۫ۨۦۜۦ۬ۡۙۖۗۗۗۙۡۙۢ۠";
                    break;
                case 1643751439:
                    str = "ۜۦ۫ۢ۟ۥ۫۟۟ۗۚۛۢۤ۠ۜ۠۠";
                    i4 = i3;
                    break;
                case 1826288846:
                    str = "ۚ۠ۧۡۗۥۛۘۘۛۨۧۘۖ۬۠۫۟ۥۘۙ۬ۨۘۥۤ";
                    str3 = cursor.getString(4);
                    break;
                case 2145378127:
                    str = "ۥ۫ۜۙۤۗۤ۟ۖۘ۬ۙۢۤ۫ۗۘ۟۟۟ۨۧۢۢۥ۫ۥۨ";
                    gregorianCalendar = new GregorianCalendar();
                    break;
            }
        }
    }

    public AutoMessageSQLiteAdapter open() {
        AutoMessageSQLite autoMessageSQLite = null;
        String str = "ۢۚۤۤۙۜۙۙۗ۟ۙۨۚ۠ۨۘ۬ۦۜۥۘۚ";
        while (true) {
            switch ((str.hashCode() ^ 485) ^ -251033482) {
                case -1915100482:
                    autoMessageSQLite = new AutoMessageSQLite(this.f629a);
                    str = "ۢۥۖۘۢ۟۫ۘۙۦۚۨ۠۬ۤۜۘۨۖۖۨ۫۟ۧ۠ۚ";
                    break;
                case -1374442096:
                    this.f631c = autoMessageSQLite;
                    str = "ۨ۫ۜۘۜ۠ۥۘ۬ۨۨۘ۟ۘۨۘۧۜۘۧۡۘ۠ۧۚۨ۫۬۬ۧ";
                    break;
                case -537018658:
                    str = "ۚۡۥۥ۬ۤۥ۟ۜۦۦۡۘۖ۟ۜ۫۟ۘۘ";
                    break;
                case -440334364:
                    this.f630b = autoMessageSQLite.getWritableDatabase();
                    str = "ۜۚۖۦۥ۠ۧۤۘۘۙۥۨۘۚۛۖۧۨۖۡۧۦۘ";
                    break;
                case 1924642985:
                    return this;
            }
        }
    }

    public void setDisable(int i2, int i3) {
        ContentValues contentValues = null;
        String str = "ۢ۬ۦۘ۬ۛۖۗ۫ۤۗۡۛۥۨ۟ۗۤ";
        while (true) {
            switch ((str.hashCode() ^ 631) ^ 596438050) {
                case -1976257528:
                    str = "ۚۥۦۤ۬۬ۧ۫ۧۙۙۦۧۜۤ۠ۥۧۘ";
                    break;
                case -1840634548:
                    contentValues = new ContentValues();
                    str = "ۡ۠ۗۖۘۨۘ۠ۘۧۨ۬ۤۖ۠ۜۘۘۛۥ";
                    break;
                case -570124184:
                    str = "ۜۦۧۘۖ۠ۜۘ۟۟۫ۢۨۢۙۧ۟";
                    break;
                case -280716121:
                    this.f630b.update("automsg", contentValues, "_id LIKE ?", new String[]{Integer.toString(i3)});
                    str = "۠ۚۨ۬ۦۖۨۥۘ۠ۨ۬ۜۦۥۙۙۘ";
                    break;
                case 612459489:
                    return;
                case 1162113108:
                    contentValues.put("disabled", Integer.valueOf(i2));
                    str = "۫۟ۜۘۧۤۘۘۦۢ۬ۡۘۜ۟ۦۙۥۚۗ";
                    break;
                case 1543567882:
                    str = "ۥۚ۫ۜۡۛۖۡۘۢۢۥ۟ۡۢۜ۟ۦۘ";
                    break;
            }
        }
    }
}
