package c.a.a;

import android.content.DialogInterface;
/* loaded from: classes.dex */
class l implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final i f40a;
    private static int[] aG = {54780677, 96655610};
    private static int[] aF = {9355685, 70147602, 55889084, 60091109};

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(i iVar) {
        this.f40a = iVar;
    }

    private static String v(String str) {
        int i;
        while (true) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for (int i2 = 0; i2 < charArray.length; i2++) {
                switch (i2 % 4) {
                    case 0:
                        sb.append((char) (charArray[i2] ^ 41315));
                        int i3 = aF[1];
                        if (i3 >= 0) {
                            do {
                            } while ((i3 & (70607328 ^ i3)) <= 0);
                        }
                    case 1:
                        sb.append((char) (charArray[i2] ^ 28352));
                        int i4 = aF[2];
                        if (i4 >= 0) {
                            do {
                            } while (i4 % (19743931 ^ i4) <= 0);
                        }
                    case 2:
                        sb.append((char) (charArray[i2] ^ 33010));
                        int i5 = aF[3];
                        if (i5 >= 0 && i5 % (78393854 ^ i5) == 0) {
                            break;
                        }
                        break;
                    default:
                        sb.append((char) (charArray[i2] ^ 65535));
                        int i6 = aF[0];
                        if (i6 >= 0) {
                            do {
                                i = i6 % (69143484 ^ i6);
                                i6 = 9355685;
                            } while (i != 9355685);
                        }
                }
            }
            return sb.toString();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        a.d(v("ꄷ溥肁ﾋꄶ溒肾").intern());
        int i2 = aG[0];
        if (i2 < 0 || i2 % (78077122 ^ i2) == 54780677) {
        }
        b.j = g.k;
        i.a(this.f40a).a();
        int i3 = aG[1];
        if (i3 < 0 || i3 % (54307464 ^ i3) == 96655610) {
        }
    }
}
