package com.obwhatsapp.yo;

import android.app.Activity;
import android.app.ProgressDialog;
import c.d;
import com.obwhatsapp.Conversation;
import java.io.File;
import net.surina.soundtouch.SoundTouch;
import top.oply.opuslib.OpusTool;

public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public final File f898a = new File(yo.getCtx().getFilesDir(), "decodedOpusVoice.wav");

    /* renamed from: b  reason: collision with root package name */
    public final File f899b = new File(yo.getCtx().getFilesDir(), "modifiedVoice.wav");

    /* renamed from: c  reason: collision with root package name */
    public boolean f900c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f901d;

    /* renamed from: e  reason: collision with root package name */
    public final File f902e;

    /* renamed from: f  reason: collision with root package name */
    public final ProgressDialog f903f;

    /* renamed from: g  reason: collision with root package name */
    public final float f904g;

    /* renamed from: h  reason: collision with root package name */
    public final float f905h;

    /* renamed from: i  reason: collision with root package name */
    public final float f906i;

    public w0(Conversation conversation, File file) {
        this.f901d = conversation;
        this.f902e = file;
        this.f900c = false;
        this.f904g = shp.getFloatPriv("voicenotechanger_tempo");
        this.f905h = shp.getFloatPriv("voicenotechanger_pitch");
        this.f906i = shp.getFloatPriv("voicenotechanger_speed");
        ProgressDialog progressDialog = new ProgressDialog(conversation);
        this.f903f = progressDialog;
        progressDialog.setProgressStyle(0);
        progressDialog.setTitle(yo.getString("settings_backup_db_now_message"));
        progressDialog.setCancelable(true);
        progressDialog.setButton(-2, conversation.getString(17039360), new d(this, 4));
    }

    public final void a() {
        synchronized (this) {
            try {
                this.f901d.runOnUiThread(new v0(this, 0));
                OpusTool opusTool = new OpusTool();
                opusTool.decode(this.f902e.getAbsolutePath(), this.f898a.getAbsolutePath(), (String) null);
                SoundTouch soundTouch = new SoundTouch();
                soundTouch.setTempo(this.f904g);
                soundTouch.setSpeed(this.f906i);
                soundTouch.setPitchSemiTones(this.f905h);
                System.currentTimeMillis();
                int processFile = soundTouch.processFile(this.f898a.getAbsolutePath(), this.f899b.getAbsolutePath());
                System.currentTimeMillis();
                String str = "ۙۗۡۘ۬ۘۤ۟ۤۛۨۙۡۘۤۘۧ۠۠ۧ۫ۦ";
                while (true) {
                    switch (str.hashCode() ^ -1014579564) {
                        case -648042969:
                            str = "ۚۜۦۘۛۜ۫ۖۙۦۘۜۛۦ۫ۖۖۘ۫ۢۜۡۥۘۘۡۜۘۦۦۡ";
                            continue;
                        case 632895760:
                            this.f901d.runOnUiThread(new p(this, SoundTouch.getErrorString(), 1));
                            b();
                            break;
                        case 745005534:
                            if (processFile != 0) {
                                str = "۬ۦۧۘۢۙۘۚۨۖۦۖۜۦ۟ۘۨۤۖۘ۫۬ۗ";
                                break;
                            } else {
                                str = "ۧۙۙۤۘۨۙۢ۬ۤ۟ۦ۟۬۟ۘۖ۠ۦۖۨۖ۠ۡۨۦ۫";
                                continue;
                            }
                        case 1726707133:
                            break;
                        default:
                            continue;
                    }
                }
                opusTool.encode(this.f899b.getAbsolutePath(), this.f902e.getAbsolutePath(), (String) null);
                String str2 = "ۚۚۘ۟ۗۦۘ۟ۜۤۖۥۜۘۢۤۘ";
                while (true) {
                    switch (str2.hashCode() ^ -789686301) {
                        case -1498429740:
                            break;
                        case 1028878008:
                            str2 = "ۡۡۖۘ۬۬ۨۘۡۧۨۘۖ۟ۜۘۨۥ۠ۚۛ";
                            continue;
                        case 1486818282:
                            b();
                            break;
                        case 1932819557:
                            if (this.f900c) {
                                str2 = "ۦۡۜۘ۟ۦ۫۬ۦۢۥۢۨۚۥۖ";
                                break;
                            } else {
                                str2 = "۫ۚۜۘۘۥ۫ۙۛ۟ۨ۠۬ۛۘۖۘ";
                                continue;
                            }
                        default:
                            continue;
                    }
                }
                soundTouch.close();
            } catch (SecurityException e2) {
                this.f901d.runOnUiThread(new v0(this, 3));
                b();
            } catch (Exception e3) {
                this.f901d.runOnUiThread(new v0(this, 1));
                b();
            }
        }
        return;
    }

    public final void b() {
        v0 v0Var = null;
        String str = "۠ۖۖۘۨۜۗ۫ۥۦۘۜ۬ۤۖۥ۫ۤۛ۠";
        while (true) {
            switch ((str.hashCode() ^ 261) ^ 58126600) {
                case -2136148408:
                    return;
                case -297450553:
                    str = "ۖۨ۫ۨۡۙ۬۠ۘۤۚۦۘۥۚ۠ۥۗ۬۫ۨۤ۠ۖۛ";
                    break;
                case 1283943709:
                    this.f901d.runOnUiThread(v0Var);
                    str = "ۛۡ۟ۨۜۘۧۜۘۡۢۥۖ۫ۡۢۤۛۖ۟ۧ";
                    break;
                case 1788798943:
                    v0Var = new v0(this, 2);
                    str = "ۨۛۙ۫ۚۤۗۢۧۦۥۛۘ۟ۦ";
                    break;
            }
        }
    }
}
