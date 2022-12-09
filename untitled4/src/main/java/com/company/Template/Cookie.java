package com.company.Template;

public class Cookie {

    int time;

    public Cookie() {
    }

    public Cookie(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    int  MakeDetailsOrder(){
        return getTime();
    }
}
