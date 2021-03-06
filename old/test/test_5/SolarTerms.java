package test_5;
/***
 * 24θζ°ζδΈΎη±?
 * @author Administrator
 *
 */
public enum SolarTerms {

    XIAO_HAN(20, "ε°ε―", 1, 5),
    DA_HAN(21, "ε€§ε―", 1, 22),
    LI_CHUN(22, "η«ζ₯", 2, 5),
    YU_SHUI(23, "ι¨ζ°΄", 2, 22),
    JING_ZHE(24, "ζθ°", 3, 5),
    CHUN_FEN(1, "ζ₯ε", 3, 22),
    QING_MING(2, "ζΈζ", 4, 5),
    GU_YU(3, "θ°·ι¨", 4, 22),
    LI_XIA(4, "η«ε€", 5, 5),
    XIAO_MAN(5, "ε°ζ»‘", 5, 22),
    MANG_ZHONG(6, "θη§", 6, 5),
    XIA_ZHI(7, "ε€θ³", 6, 22),
    XIAO_SHU(8, "ε°ζ", 7, 5),
    DA_SHU(9, "ε€§ζ", 7, 22),
    LI_QIU(10, "η«η§", 8, 5),
    CHU_SHU(11, "ε€ζ", 8, 22),
    BAI_LU(12, "η½ι²", 9, 5),
    QIU_FEN(13, "η§ε", 9, 22),
    HAN_LU(14, "ε―ι²", 10, 5),
    SHUANG_JIANG(15, "ιι", 10, 22),
    LI_DONG(16, "η«ε¬", 11, 5),
    XIAO_XUE(17, "ε°ιͺ", 11, 22),
    DA_XUE(18, "ε€§ιͺ", 12, 5),
    DONG_ZHI(19, "ε¬θ³", 12, 22);

    private int    order;
    private String name;
    private int    month;
    private int    estimateDate;

    SolarTerms(int order, String name, int month, int estimateDate) {
        this.order = order;
        this.name = name;
        this.month = month;
        this.estimateDate = estimateDate;
    }

    public int getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public int getEstimateDate() {
        return estimateDate;
    }

}
