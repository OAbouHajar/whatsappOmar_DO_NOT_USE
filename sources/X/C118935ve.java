package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5ve  reason: invalid class name and case insensitive filesystem */
public class C118935ve {
    public final C14710pd A00;
    public final C17420v3 A01;
    public final C115325pZ A02;
    public volatile ConcurrentHashMap A03;
    public volatile ConcurrentHashMap A04;

    public C118935ve(C14710pd r1, C17420v3 r2, C115325pZ r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final C117335sp A00(int i2) {
        A01();
        ConcurrentHashMap concurrentHashMap = this.A03;
        Integer valueOf = Integer.valueOf(i2);
        C117335sp r4 = (C117335sp) concurrentHashMap.get(valueOf);
        if (r4 == null) {
            r4 = (C117335sp) this.A03.get(Integer.valueOf(i2 >> 16));
            if (r4 == null) {
                r4 = new C117335sp("na", (Map) null, -1, 812974081);
            }
            this.A03.put(valueOf, r4);
        }
        return r4;
    }

    public final void A01() {
        if (this.A03 == null || this.A04 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    this.A03 = new ConcurrentHashMap();
                    try {
                        A02(C13700nu.A0K("{\"action\":[[78315521,1,\"TTRC_LONG_CANCEL\",78315521,[[\"duration\",1]]],[78315522,1,\"TTRC_FAILURE\",78315522,[[\"duration\",1],[\"message\",1]]],[231937006,1,\"TTRC_CHOICE_PREVIEW_IMG\",231937006,[[\"bloks_display_name\",1],[\"category_id\",1],[\"choice_id\",1],[\"session_id\",1]]],[231933580,1,\"TTRC\",231933580,[[\"bloks_display_name\",1],[\"session_id\",1],[\"app_id\",1],[\"end_reason\",1],[\"category_id\",1],[\"ttrc_source\",1],[\"ttrc_source_for_bloks_query\",1],[\"recency_threshold_for_bloks_query\",1],[\"ttrc_tracking_version\",1],[\"cache_and_network_queries\",1],[\"network_only_queries\",1],[\"steps\",1],[\"cds_bottomsheet\",1],[\"ttrc_back_start_on_touch_up\",1],[\"using_backup_start_time\",1],[\"using_capped_backup_start_time\",1],[\"revoked_queries\",1],[\"revoked_steps\",1],[\"ttrc_cache_rendered\",1]]],[914163517,1,\"AVATAR_MARKETPLACE_TABBED_FLOW_OPEN\",914163517,[]]]}"));
                        A02(this.A00.A07(2620));
                    } catch (Exception e2) {
                        this.A03.clear();
                        C17420v3 r2 = this.A01;
                        StringBuilder A0o = AnonymousClass000.A0o();
                        A0o.append("Couldn't parse bloks config (actions): ");
                        r2.A8e(AnonymousClass000.A0h(e2.getMessage(), A0o));
                    }
                }
                if (this.A04 == null) {
                    this.A04 = new ConcurrentHashMap();
                    try {
                        A03(C13700nu.A0K("{\"ttrc\":[[\"com.bloks.www.avatar.editor.cds.launcher\",1,231933580],[\"com.bloks.www.avatar.editor.cds.launcher.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.choice.preview.pagination\",1,231933580],[\"com.bloks.www.avatar.editor.cds.choice.preview.pagination.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.save.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.delete.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.update-main-preview-zoom.async\",1,231933580],[\"com.bloks.www.avatar.editor.exit.log\",1,231933580],[\"com.bloks.www.avatar.editor.exit.log.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.exit.log.setup\",1,231933580],[\"com.bloks.www.avatar.editor.cds.exit.log.setup.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.editor_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.editor_screen.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_nux_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_nux_screen.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.skin_tone\",1,231933580],[\"com.bloks.www.avatar.editor.cds.skin_tone.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.skin_tone_new_nav\",1,231933580],[\"com.bloks.www.avatar.editor.cds.deletion_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.deletion_screen.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_preview_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_preview_screen.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.preview.fetch.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.save_click.log.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.delegation_launcher\",1,231933580],[\"com.bloks.www.avatar.editor.cds.delegation_launcher.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.screen_delegation.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.editor_new_nav_screen\",1,231933580],[\"com.bloks.www.avatar.editor.cds.new-nav-update-zoom.async\",1,231933580],[\"com.bloks.www.avatar.editor.cds.end_preview_screen_new_nav\",1,231933580],[\"com.bloks.www.avatar.editor.cds.presets\",1,231933580],[\"com.bloks.www.avatar.editor.cds.whatsapp.notice\",1,231933580],[\"com.bloks.www.avatar.editor.cds.wa_notice.accept.async\",1,231933580],[\"avatar_editor_new_nav_screen\",1,231933580]]}"));
                        A03(this.A00.A07(2621));
                    } catch (Exception e3) {
                        this.A04.clear();
                        C17420v3 r22 = this.A01;
                        StringBuilder A0o2 = AnonymousClass000.A0o();
                        A0o2.append("Couldn't parse bloks config (ttrc): ");
                        r22.A8e(AnonymousClass000.A0h(e3.getMessage(), A0o2));
                    }
                }
            }
        }
    }

    public final void A02(JSONObject jSONObject) {
        HashMap hashMap;
        if (this.A03 != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("action");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
                int i3 = jSONArray2.getInt(0);
                int i4 = jSONArray2.getInt(1);
                int i5 = 2;
                if (2 != i4) {
                    i5 = 1;
                    if (1 != i4) {
                        i5 = -1;
                    }
                }
                String string = jSONArray2.getString(2);
                int i6 = jSONArray2.getInt(3);
                if (jSONArray2.length() > 4) {
                    HashMap A0x = AnonymousClass000.A0x();
                    JSONArray jSONArray3 = jSONArray2.getJSONArray(4);
                    for (int i7 = 0; i7 < jSONArray3.length(); i7++) {
                        JSONArray jSONArray4 = jSONArray3.getJSONArray(i7);
                        String string2 = jSONArray4.getString(0);
                        int i8 = jSONArray4.getInt(1);
                        int i9 = 2;
                        if (2 != i8) {
                            i9 = 1;
                            if (1 != i8) {
                                i9 = -1;
                            }
                        }
                        C13680ns.A1X(string2, A0x, i9);
                    }
                    hashMap = A0x;
                } else {
                    hashMap = Collections.emptyMap();
                }
                this.A03.put(Integer.valueOf(i3), new C117335sp(string, hashMap, i5, i6));
            }
        }
    }

    public final void A03(JSONObject jSONObject) {
        if (this.A04 != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("ttrc");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i2);
                String string = jSONArray2.getString(0);
                int i3 = jSONArray2.getInt(1);
                int i4 = 2;
                if (2 != i3) {
                    i4 = 1;
                    if (1 != i3) {
                        i4 = -1;
                    }
                }
                this.A04.put(string, new C116905s8(i4, jSONArray2.length() > 2 ? jSONArray2.getInt(2) : 812974081));
            }
        }
    }
}
