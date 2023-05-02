package h;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import com.obwhatsapp.yo.massmsger.MassSender;
import com.obwhatsapp.yo.massmsger.SavedCollections;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f1737a;

    /* renamed from: b  reason: collision with root package name */
    public final SavedCollections f1738b;

    public /* synthetic */ b(SavedCollections savedCollections, int i2) {
        this.f1737a = i2;
        this.f1738b = savedCollections;
    }

    public final void onClick(View view) {
        int i2 = 0;
        String str = "۫ۜۧۘۜ۬ۨۘۙۡۤۦۦۗۤۥ۫ۜۦۙۙۙۖۘ";
        Intent intent = null;
        SavedCollections savedCollections = null;
        while (true) {
            switch ((str.hashCode() ^ 794) ^ 1788797643) {
                case -1944499852:
                case -156903726:
                    return;
                case -1603707910:
                    intent = new Intent(savedCollections, MassSender.class);
                    str = "ۨ۬ۦۨۧۦ۠ۛۡۛۤۦۧۗۨ";
                    break;
                case -1499082742:
                    savedCollections.onBackPressed();
                    str = "ۡۜۖۦ۟ۘۦ۫ۢۨۨۘ۠ۥۖۘۘۖۙۗۙۚۢۖ۟ۧۤ";
                    break;
                case -1475678050:
                    str = "ۥۥۙۜ۬ۦۜۦۙۜۖۜۘۖۗۛۛۗۨۚۤۜ";
                    break;
                case -1427569357:
                    str = "۬ۙۦ۠ۨۗۧ۟ۢۥۛۢۛۗۜ۟ۘۙۧۧۚ";
                    break;
                case -1226533811:
                    intent.putExtra("newEntry", true);
                    str = "۫ۨ۠ۡۥۦۘۥۡۨۚۘۛۥۘۢۖ۟ۙۦۥ";
                    break;
                case -961824695:
                    str = "ۖ۠۫۫ۙۖ۫ۖۦۜۤۚ۟ۘ۬ۛ۬ۧۘ۬ۡۘۢۧۘۥۤۡ";
                    i2 = this.f1737a;
                    break;
                case 886511955:
                    SharedPreferences sharedPreferences = SavedCollections.f819a;
                    str = "ۚۥۜ۟ۛۚۖۡۖۤۛ۟ۥ۟۫";
                    break;
                case 992338660:
                    SharedPreferences sharedPreferences2 = SavedCollections.f819a;
                    str = "ۥ۫۠ۛۦۛۨۗۖۘۖۨۤۢ۬ۚۥۧۖۘۜۚۙۥ۠ۨ";
                    break;
                case 1156432630:
                    savedCollections.getClass();
                    str = "ۖۧۡۛۤۡۥۘۦۘۧ۟ۥۘۜ۬ۥۘۤۢۦۘ";
                    break;
                case 1236821738:
                    str = "ۚ۠ۗۦۘۦۘۤۨۚ۬ۨۜۘ۟ۚ۟ۙۛ۟ۦ۟ۦۘ۫۠ۜ";
                    savedCollections = this.f1738b;
                    break;
                case 1423406299:
                    switch (i2) {
                        case 0:
                            str = "ۥۚۜۘۦۛ۠۟ۖۗۜ۬ۛۡۘۘۘ۟ۦۘ";
                            break;
                        default:
                            str = "ۨ۟ۙۚ۫ۤۘۧۧۛۡۘۖ۟ۖ";
                            break;
                    }
                case 1528155509:
                    str = "ۢۜۘۙۗۘۘ۬ۤۘۘ۠ۧۜۖۧۡ";
                    break;
                case 1722786491:
                    savedCollections.startActivity(intent);
                    str = "ۚۧۜۜۦۖۢ۫ۡۘۥۢۖ۟ۤۧۢ۟ۘۘ";
                    break;
            }
        }
    }
}
