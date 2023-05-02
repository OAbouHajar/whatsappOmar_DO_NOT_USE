package rc.whatsapp.conversation;

import a0.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.ui.YoSettings.IPreviewScreen;

@SuppressLint({"AppCompatCustomView"})
public class attachImageButton extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    public static final int f2452b = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f2453a = 0;

    public attachImageButton(Context context) {
        super(context);
        init(context);
    }

    public attachImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public attachImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(context);
    }

    public final void a(View view) {
        View view2 = null;
        String str = "ۦۧۥۨۚۦۧۨۘۖۘۦۦۢ۫";
        while (true) {
            switch ((str.hashCode() ^ 236) ^ 384418658) {
                case -1901059154:
                    return;
                case -1497712196:
                    str = "ۘۘۡۘۥ۠ۧۖۧۛۧۧۖۘۗۧۡ";
                    break;
                case -763183727:
                    String str2 = "ۚۛۘ۟ۡۖۘۛۖۘۘۧۥۨۘۢۤۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -308123169) {
                            case -532267366:
                                str = "ۗۛۘۘۜ۟ۧۨ۟ۘ۫ۢۦۘۖۛۡۘۢۢۦ";
                                continue;
                            case -223016145:
                                str = "ۧۗۜۛ۟ۦۘ۫ۖۖۘۢۗۤۨ۠ۜۖۡۛۚۡ۟ۖۨ۟ۦ";
                                continue;
                            case -210329379:
                                if (view2 == null) {
                                    str2 = "ۤۢۤۖۖۧۘۛ۬ۘۘۦۙۧۢۚۨۡۗۨ۫ۚۡۖۦۧۘ";
                                    break;
                                } else {
                                    str2 = "۟ۛۧۢۙۡۘۖۖۘۙۙۖۚۗۤ";
                                    break;
                                }
                            case -23423057:
                                str2 = "ۡۢۛ۫ۙۚۤۧۧۘۗۦۘۚۙۡۖ۠ۥۛۗۨ";
                                break;
                        }
                    }
                    break;
                case 373809805:
                    this.f2453a = yo.getID("input_attach_button", "id");
                    str = "ۜۛۥۘۚ۫ۨ۟۠ۛ۟ۤۜۡۧ۫۫ۤۖۘ";
                    break;
                case 1269577429:
                    String str3 = "ۚۥۘۖۘۜۘۗ۬۟ۤ۬ۘۛۜ۬";
                    while (true) {
                        switch (str3.hashCode() ^ 302919107) {
                            case -2056208773:
                                str = "۬ۖۘۡۖۨۨۗۜۘ۬ۡۚ۬ۚ۫ۦ۟ۥۧ۟ۘۘۤ۬ۧ";
                                continue;
                            case -915448743:
                                if (this.f2453a != 0) {
                                    str3 = "ۜۘۚۚۜۧۘۡۙۥۖۨۦۘۢ۫ۦۘۘۗ۫";
                                    break;
                                } else {
                                    str3 = "ۘۘۢ۫ۗۤۡۚۘۘۡ۟ۖۜۢ۫ۢۤۘۥۨۢ۟ۥۗ";
                                    break;
                                }
                            case -723873614:
                                str = "ۜۛۥۘۚ۫ۨ۟۠ۛ۟ۤۜۡۧ۫۫ۤۖۘ";
                                continue;
                            case -691621745:
                                str3 = "۬ۗ۬ۛۥۡۘۚۧۥۘۖ۬ۢۙۧۖۧۘۚۜۢۗۤۨۢ";
                                break;
                        }
                    }
                    break;
                case 1300694640:
                    view2 = view.getRootView().findViewById(this.f2453a);
                    str = "ۥۧۜۘۢۗۖۘۜۢۖۘۤۙۖۘ۟ۜۡۘ۫ۢ";
                    break;
                case 1422426667:
                    view2.performClick();
                    str = "ۗۛۘۘۜ۟ۧۨ۟ۘ۫ۢۦۘۖۛۡۘۢۢۦ";
                    break;
                case 1873395988:
                    str = "ۙ۠ۨۘ۟ۖۤ۠ۖۨۘۖ۠ۦۖۢۜۘۖ۬ۢۖۡ۠۬";
                    break;
            }
        }
    }

    public void init(Context context) {
        String str = "ۤۖۦۘۙۡۥۘۚۢۛۥۚۨ۬ۥۘۨۦۡۨ۠ۧ";
        a aVar = null;
        a aVar2 = null;
        a aVar3 = null;
        while (true) {
            switch ((str.hashCode() ^ 416) ^ 1465102254) {
                case -2039850591:
                    return;
                case -1229305581:
                    aVar = new a(this, 0);
                    str = "ۗ۠ۢۘ۫ۦۙ۬ۜۘۙۛۢۥۖۗۨۘۜ۟ۖۨۥ۫ۢ";
                    break;
                case -1133354786:
                    str = "ۦۡ۠ۙ۟ۗۖۤۜۘ۬ۢ۫ۤۜۢۜۘۧۜ۟ۦۘ";
                    aVar2 = aVar3;
                    break;
                case -917799333:
                    str = "ۖۢۦۗۥۘۘۘۗۥۘۙۚۘۘۡۢ۬ۡۙۡۘۙۡۨ";
                    break;
                case -670534031:
                    String str2 = "ۢ۠ۨۚۛۦۤۥۢ۠ۛۨۘۧ۟۠۫ۘۛۚۜۡۧۤۗ";
                    while (true) {
                        switch (str2.hashCode() ^ -774462015) {
                            case -2006816013:
                                if (!(context instanceof IPreviewScreen)) {
                                    str2 = "ۗۜۥۧۦۖۘۧۥۦۘۡۥۚ۟ۨۨۘۜ۟ۨۤۢۙ";
                                    break;
                                } else {
                                    str2 = "ۢۚ۬ۨۚ۠ۧۥ۟۬ۗۗۙ۬ۨۜۚۨۧ۟ۤۥۖۘۘ۠ۜۘ";
                                    break;
                                }
                            case -1093226824:
                                str2 = "۫ۘۦ۟ۜۥۦ۠ۡۜۥۛ۫ۤ۟۬ۥ";
                                break;
                            case 1592779876:
                                str = "۟ۥۜ۠ۤۖۘ۫ۗۙ۠ۥۘۘ۟ۚۚۚۗۛ۟ۧۨ۬ۧۙ";
                                continue;
                            case 2025356437:
                                str = "۟۠ۖۗۖۥۘۥۦۡۙۢۖۘ۬۟ۡ";
                                continue;
                        }
                    }
                    break;
                case -288763422:
                    str = "ۡۚۨۘۨۜۨۘ۫ۙۖۘۧۦۦۘۦۙ۠ۦۡۡۘۘ۬ۦۘ";
                    break;
                case -216219727:
                    setColorFilter(others.getColor("ModChatBtnColor", ColorStore.getDefaultConversationEntryIconsColor()), PorterDuff.Mode.SRC_ATOP);
                    str = "ۚۧ۟ۘۗۢۜ۫ۡۘۦ۬ۘۤۛۙۢۖۖۘ";
                    break;
                case -85085340:
                    aVar3 = new a(this, 1);
                    str = "۬۬ۨ۠ۘۦۘۥۧۨ۫ۧ۠ۤۧۢۧ۬ۤ";
                    break;
                case 397221615:
                    setOnClickListener(aVar2);
                    str = "۠۬ۖۘۚۦۨۘۢۡۢۥۜۤۢۦۡۘ";
                    break;
                case 1356702758:
                    str = "ۖۢۦۗۥۘۘۘۗۥۘۙۚۘۘۡۢ۬ۡۙۡۘۙۡۨ";
                    aVar2 = aVar;
                    break;
                case 1595074632:
                    String str3 = "ۨۜ۬ۚ۟ۚۢۚۗۗۤ۟ۚۛۘۨۚۖ";
                    while (true) {
                        switch (str3.hashCode() ^ 257844379) {
                            case -975542965:
                                str3 = "ۧۨۥۘ۫ۤۖۖ۟ۖۘۡۛۢۧۚۥۨ۠۫ۨۧۥۘۨۦۡۘۘۙۜۘ";
                                break;
                            case -512335187:
                            case -272812766:
                                str = "ۧۚۧۤۦ۟ۚۗۤ۠ۤۨ۠ۘۘۚۧۦ";
                                continue;
                            case 1938328326:
                                if (context instanceof Conversation) {
                                    str3 = "ۦۡۖۘ۬ۧۨۜۦۜۚۥۦۗۚۖ۬ۡۥ";
                                    break;
                                } else {
                                    str3 = "ۚۖۨۦۛۧۛۖ۟۠ۘۛۢۖۧۘۖۢۗۢۡۜۥ۟۬ۚ۠۬";
                                    break;
                                }
                        }
                    }
                    break;
                case 1357703005:
                    str = "ۚۜۦۘۥۥۙۛۡۜۘۘۥۤۖۥ";
                    break;
                case 1928264729:
                    str = "۠۬ۥۘۤ۫ۡۘۢۗۘۘۨۖۘۡۥۥۢ۟ۢۢۧۘۘۚ۬ۥۘ";
                    break;
            }
        }
    }
}
