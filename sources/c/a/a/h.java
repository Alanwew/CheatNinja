package c.a.a;

import android.view.View;
/* loaded from: classes.dex */
class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final g f35a;
    private static int[] aJ = {10014885};
    private static int[] aI = {72428220, 68707471, 533478, 37382520};

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(g gVar) {
        this.f35a = gVar;
    }

    private static String w(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            switch (i2 % 4) {
                case 0:
                    sb.append((char) (charArray[i2] ^ 52950));
                    int i3 = aI[1];
                    if (i3 >= 0 && i3 % (67091917 ^ i3) != 68707471) {
                    }
                    break;
                case 1:
                    sb.append((char) (charArray[i2] ^ 52225));
                    int i4 = aI[2];
                    if (i4 >= 0) {
                        do {
                        } while ((i4 & (74498350 ^ i4)) <= 0);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    sb.append((char) (charArray[i2] ^ 25978));
                    int i5 = aI[3];
                    if (i5 >= 0) {
                        do {
                            i = i5 % (5586098 ^ i5);
                            i5 = 37382520;
                        } while (i != 37382520);
                        break;
                    } else {
                        break;
                    }
                default:
                    sb.append((char) (charArray[i2] ^ 65535));
                    int i6 = aI[0];
                    if (i6 >= 0) {
                        do {
                        } while ((i6 & (63520066 ^ i6)) <= 0);
                        break;
                    } else {
                        break;
                    }
            }
        }
        return sb.toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        do {
            this.f35a.a();
            i = aJ[0];
            if (i < 0) {
                return;
            }
        } while (i % (29265602 ^ i) == 0);
    }
}
