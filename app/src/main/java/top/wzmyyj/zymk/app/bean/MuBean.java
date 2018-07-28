package top.wzmyyj.zymk.app.bean;

import java.util.List;

/**
 * Created by yyj on 2018/07/15. email: 2209011667@qq.com
 */

public class MuBean {
    private String time_desc;
    private long time;
    private List<HuaBean> huaList;

    private String reading_href;

    public String getReading_href() {
        return reading_href;
    }

    public void setReading_href(String reading_href) {
        this.reading_href = reading_href;
    }

    public MuBean(String time_desc, long time) {
        this.time_desc = time_desc;
        this.time = time;
    }

    public MuBean() {
    }

    public MuBean(String time_desc, long time, List<HuaBean> huaList) {
        this.time_desc = time_desc;
        this.time = time;
        this.huaList = huaList;
    }

    public String getTime_desc() {
        return time_desc;
    }

    public void setTime_desc(String time_desc) {
        this.time_desc = time_desc;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public List<HuaBean> getHuaList() {
        return huaList;
    }

    public void setHuaList(List<HuaBean> huaList) {
        this.huaList = huaList;
    }
}