package c.a.a;

import android.view.View;
/* loaded from: classes.dex */
class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final g f43a;
    private static int[] i = {38520523};
    private static int[] h = {45072398, 47294914, 40712724, 22982593};

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(g gVar) {
        this.f43a = gVar;
    }

    private static String c(String str) {
        while (true) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for (int i2 = 0; i2 < charArray.length; i2++) {
                switch (i2 % 4) {
                    case 0:
                        sb.append((char) (charArray[i2] ^ 4743));
                        int i3 = h[1];
                        if (i3 >= 0) {
                            do {
                            } while (i3 % (30377226 ^ i3) <= 0);
                        }
                    case 1:
                        sb.append((char) (charArray[i2] ^ 43397));
                        int i4 = h[2];
                        if (i4 >= 0 && (i4 & (26457665 ^ i4)) == 0) {
                            break;
                        }
                        break;
                    case 2:
                        sb.append((char) (charArray[i2] ^ 33408));
                        int i5 = h[3];
                        if (i5 >= 0 && i5 % (27679030 ^ i5) != 6666442) {
                        }
                        break;
                    default:
                        sb.append((char) (charArray[i2] ^ 65535));
                        int i6 = h[0];
                        if (i6 >= 0) {
                            do {
                            } while (i6 % (57490612 ^ i6) <= 0);
                        }
                }
            }
            return sb.toString();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f43a.a();
        int i2 = i[0];
        if (i2 < 0 || (i2 & (22529869 ^ i2)) == 34078850) {
        }
    }
}
