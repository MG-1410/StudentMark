package com.marks;

public class Marks {
    private String tamil;
    private String english;
    private String maths;
    private String science;
    private String social;

    public Marks(String tamil, String english, String maths, String science, String social) {
        this.tamil = tamil;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.social = social;
    }

    public String toString()
    {
        return "Tamil :" + tamil + "  English :" + english + "  Maths :" + maths + "  Science :" + science + "  Social :" + social ;
    }
}
