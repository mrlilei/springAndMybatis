package com.bean.gsnfc;

import java.io.Serializable;

public class GChargeTran implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private String traceid;

    private Integer state;

    private Integer settleflag;

    private Integer balance;

    private String opdt;

    private String buscode;

    private String cardasn;

    private String merid;

    private String citycode;

    private String mobile;

    private String planid;

    private String electrsaveopcount;

    private String rpid;

    private String retmsg;

    private Integer cardfee;

    private Integer rechargeway;

    private String goodsid;

    private String orderid;

    private String orderdate;

    private String tradeno;

    private String tac;

    private String banktrace;

    private String stldate;

    private String transcode;

    private Short mercheck;

    private Short bankcheck;

    private String modtime;

    private Integer cardtype;

    private String bankmerid;

    private String mbtradenum;

    private String intime;

    private String mac1;

    private String random;

    private String keyver;

    private String computtag;

    private String random2;

    private String mac2;

    public String getTraceid() {
        return traceid;
    }

    public GChargeTran withTraceid(String traceid) {
        this.setTraceid(traceid);
        return this;
    }

    public void setTraceid(String traceid) {
        this.traceid = traceid == null ? null : traceid.trim();
    }

    public Integer getState() {
        return state;
    }

    public GChargeTran withState(Integer state) {
        this.setState(state);
        return this;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSettleflag() {
        return settleflag;
    }

    public GChargeTran withSettleflag(Integer settleflag) {
        this.setSettleflag(settleflag);
        return this;
    }

    public void setSettleflag(Integer settleflag) {
        this.settleflag = settleflag;
    }

    public Integer getBalance() {
        return balance;
    }

    public GChargeTran withBalance(Integer balance) {
        this.setBalance(balance);
        return this;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getOpdt() {
        return opdt;
    }

    public GChargeTran withOpdt(String opdt) {
        this.setOpdt(opdt);
        return this;
    }

    public void setOpdt(String opdt) {
        this.opdt = opdt == null ? null : opdt.trim();
    }

    public String getBuscode() {
        return buscode;
    }

    public GChargeTran withBuscode(String buscode) {
        this.setBuscode(buscode);
        return this;
    }

    public void setBuscode(String buscode) {
        this.buscode = buscode == null ? null : buscode.trim();
    }

    public String getCardasn() {
        return cardasn;
    }

    public GChargeTran withCardasn(String cardasn) {
        this.setCardasn(cardasn);
        return this;
    }

    public void setCardasn(String cardasn) {
        this.cardasn = cardasn == null ? null : cardasn.trim();
    }

    public String getMerid() {
        return merid;
    }

    public GChargeTran withMerid(String merid) {
        this.setMerid(merid);
        return this;
    }

    public void setMerid(String merid) {
        this.merid = merid == null ? null : merid.trim();
    }

    public String getCitycode() {
        return citycode;
    }

    public GChargeTran withCitycode(String citycode) {
        this.setCitycode(citycode);
        return this;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public GChargeTran withMobile(String mobile) {
        this.setMobile(mobile);
        return this;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPlanid() {
        return planid;
    }

    public GChargeTran withPlanid(String planid) {
        this.setPlanid(planid);
        return this;
    }

    public void setPlanid(String planid) {
        this.planid = planid == null ? null : planid.trim();
    }

    public String getElectrsaveopcount() {
        return electrsaveopcount;
    }

    public GChargeTran withElectrsaveopcount(String electrsaveopcount) {
        this.setElectrsaveopcount(electrsaveopcount);
        return this;
    }

    public void setElectrsaveopcount(String electrsaveopcount) {
        this.electrsaveopcount = electrsaveopcount == null ? null : electrsaveopcount.trim();
    }

    public String getRpid() {
        return rpid;
    }

    public GChargeTran withRpid(String rpid) {
        this.setRpid(rpid);
        return this;
    }

    public void setRpid(String rpid) {
        this.rpid = rpid == null ? null : rpid.trim();
    }

    public String getRetmsg() {
        return retmsg;
    }

    public GChargeTran withRetmsg(String retmsg) {
        this.setRetmsg(retmsg);
        return this;
    }

    public void setRetmsg(String retmsg) {
        this.retmsg = retmsg == null ? null : retmsg.trim();
    }

    public Integer getCardfee() {
        return cardfee;
    }

    public GChargeTran withCardfee(Integer cardfee) {
        this.setCardfee(cardfee);
        return this;
    }

    public void setCardfee(Integer cardfee) {
        this.cardfee = cardfee;
    }

    public Integer getRechargeway() {
        return rechargeway;
    }

    public GChargeTran withRechargeway(Integer rechargeway) {
        this.setRechargeway(rechargeway);
        return this;
    }

    public void setRechargeway(Integer rechargeway) {
        this.rechargeway = rechargeway;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public GChargeTran withGoodsid(String goodsid) {
        this.setGoodsid(goodsid);
        return this;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public GChargeTran withOrderid(String orderid) {
        this.setOrderid(orderid);
        return this;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getOrderdate() {
        return orderdate;
    }

    public GChargeTran withOrderdate(String orderdate) {
        this.setOrderdate(orderdate);
        return this;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate == null ? null : orderdate.trim();
    }

    public String getTradeno() {
        return tradeno;
    }

    public GChargeTran withTradeno(String tradeno) {
        this.setTradeno(tradeno);
        return this;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno == null ? null : tradeno.trim();
    }

    public String getTac() {
        return tac;
    }

    public GChargeTran withTac(String tac) {
        this.setTac(tac);
        return this;
    }

    public void setTac(String tac) {
        this.tac = tac == null ? null : tac.trim();
    }

    public String getBanktrace() {
        return banktrace;
    }

    public GChargeTran withBanktrace(String banktrace) {
        this.setBanktrace(banktrace);
        return this;
    }

    public void setBanktrace(String banktrace) {
        this.banktrace = banktrace == null ? null : banktrace.trim();
    }

    public String getStldate() {
        return stldate;
    }

    public GChargeTran withStldate(String stldate) {
        this.setStldate(stldate);
        return this;
    }

    public void setStldate(String stldate) {
        this.stldate = stldate == null ? null : stldate.trim();
    }

    public String getTranscode() {
        return transcode;
    }

    public GChargeTran withTranscode(String transcode) {
        this.setTranscode(transcode);
        return this;
    }

    public void setTranscode(String transcode) {
        this.transcode = transcode == null ? null : transcode.trim();
    }

    public Short getMercheck() {
        return mercheck;
    }

    public GChargeTran withMercheck(Short mercheck) {
        this.setMercheck(mercheck);
        return this;
    }

    public void setMercheck(Short mercheck) {
        this.mercheck = mercheck;
    }

    public Short getBankcheck() {
        return bankcheck;
    }

    public GChargeTran withBankcheck(Short bankcheck) {
        this.setBankcheck(bankcheck);
        return this;
    }

    public void setBankcheck(Short bankcheck) {
        this.bankcheck = bankcheck;
    }

    public String getModtime() {
        return modtime;
    }

    public GChargeTran withModtime(String modtime) {
        this.setModtime(modtime);
        return this;
    }

    public void setModtime(String modtime) {
        this.modtime = modtime == null ? null : modtime.trim();
    }

    public Integer getCardtype() {
        return cardtype;
    }

    public GChargeTran withCardtype(Integer cardtype) {
        this.setCardtype(cardtype);
        return this;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    public String getBankmerid() {
        return bankmerid;
    }

    public GChargeTran withBankmerid(String bankmerid) {
        this.setBankmerid(bankmerid);
        return this;
    }

    public void setBankmerid(String bankmerid) {
        this.bankmerid = bankmerid == null ? null : bankmerid.trim();
    }

    public String getMbtradenum() {
        return mbtradenum;
    }

    public GChargeTran withMbtradenum(String mbtradenum) {
        this.setMbtradenum(mbtradenum);
        return this;
    }

    public void setMbtradenum(String mbtradenum) {
        this.mbtradenum = mbtradenum == null ? null : mbtradenum.trim();
    }

    public String getIntime() {
        return intime;
    }

    public GChargeTran withIntime(String intime) {
        this.setIntime(intime);
        return this;
    }

    public void setIntime(String intime) {
        this.intime = intime == null ? null : intime.trim();
    }

    public String getMac1() {
        return mac1;
    }

    public GChargeTran withMac1(String mac1) {
        this.setMac1(mac1);
        return this;
    }

    public void setMac1(String mac1) {
        this.mac1 = mac1 == null ? null : mac1.trim();
    }

    public String getRandom() {
        return random;
    }

    public GChargeTran withRandom(String random) {
        this.setRandom(random);
        return this;
    }

    public void setRandom(String random) {
        this.random = random == null ? null : random.trim();
    }

    public String getKeyver() {
        return keyver;
    }

    public GChargeTran withKeyver(String keyver) {
        this.setKeyver(keyver);
        return this;
    }

    public void setKeyver(String keyver) {
        this.keyver = keyver == null ? null : keyver.trim();
    }

    public String getComputtag() {
        return computtag;
    }

    public GChargeTran withComputtag(String computtag) {
        this.setComputtag(computtag);
        return this;
    }

    public void setComputtag(String computtag) {
        this.computtag = computtag == null ? null : computtag.trim();
    }

    public String getRandom2() {
        return random2;
    }

    public GChargeTran withRandom2(String random2) {
        this.setRandom2(random2);
        return this;
    }

    public void setRandom2(String random2) {
        this.random2 = random2 == null ? null : random2.trim();
    }

    public String getMac2() {
        return mac2;
    }

    public GChargeTran withMac2(String mac2) {
        this.setMac2(mac2);
        return this;
    }

    public void setMac2(String mac2) {
        this.mac2 = mac2 == null ? null : mac2.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        GChargeTran other = (GChargeTran) that;
        return (this.getTraceid() == null ? other.getTraceid() == null : this.getTraceid().equals(other.getTraceid()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getSettleflag() == null ? other.getSettleflag() == null : this.getSettleflag().equals(other.getSettleflag()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getOpdt() == null ? other.getOpdt() == null : this.getOpdt().equals(other.getOpdt()))
            && (this.getBuscode() == null ? other.getBuscode() == null : this.getBuscode().equals(other.getBuscode()))
            && (this.getCardasn() == null ? other.getCardasn() == null : this.getCardasn().equals(other.getCardasn()))
            && (this.getMerid() == null ? other.getMerid() == null : this.getMerid().equals(other.getMerid()))
            && (this.getCitycode() == null ? other.getCitycode() == null : this.getCitycode().equals(other.getCitycode()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getPlanid() == null ? other.getPlanid() == null : this.getPlanid().equals(other.getPlanid()))
            && (this.getElectrsaveopcount() == null ? other.getElectrsaveopcount() == null : this.getElectrsaveopcount().equals(other.getElectrsaveopcount()))
            && (this.getRpid() == null ? other.getRpid() == null : this.getRpid().equals(other.getRpid()))
            && (this.getRetmsg() == null ? other.getRetmsg() == null : this.getRetmsg().equals(other.getRetmsg()))
            && (this.getCardfee() == null ? other.getCardfee() == null : this.getCardfee().equals(other.getCardfee()))
            && (this.getRechargeway() == null ? other.getRechargeway() == null : this.getRechargeway().equals(other.getRechargeway()))
            && (this.getGoodsid() == null ? other.getGoodsid() == null : this.getGoodsid().equals(other.getGoodsid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getOrderdate() == null ? other.getOrderdate() == null : this.getOrderdate().equals(other.getOrderdate()))
            && (this.getTradeno() == null ? other.getTradeno() == null : this.getTradeno().equals(other.getTradeno()))
            && (this.getTac() == null ? other.getTac() == null : this.getTac().equals(other.getTac()))
            && (this.getBanktrace() == null ? other.getBanktrace() == null : this.getBanktrace().equals(other.getBanktrace()))
            && (this.getStldate() == null ? other.getStldate() == null : this.getStldate().equals(other.getStldate()))
            && (this.getTranscode() == null ? other.getTranscode() == null : this.getTranscode().equals(other.getTranscode()))
            && (this.getMercheck() == null ? other.getMercheck() == null : this.getMercheck().equals(other.getMercheck()))
            && (this.getBankcheck() == null ? other.getBankcheck() == null : this.getBankcheck().equals(other.getBankcheck()))
            && (this.getModtime() == null ? other.getModtime() == null : this.getModtime().equals(other.getModtime()))
            && (this.getCardtype() == null ? other.getCardtype() == null : this.getCardtype().equals(other.getCardtype()))
            && (this.getBankmerid() == null ? other.getBankmerid() == null : this.getBankmerid().equals(other.getBankmerid()))
            && (this.getMbtradenum() == null ? other.getMbtradenum() == null : this.getMbtradenum().equals(other.getMbtradenum()))
            && (this.getIntime() == null ? other.getIntime() == null : this.getIntime().equals(other.getIntime()))
            && (this.getMac1() == null ? other.getMac1() == null : this.getMac1().equals(other.getMac1()))
            && (this.getRandom() == null ? other.getRandom() == null : this.getRandom().equals(other.getRandom()))
            && (this.getKeyver() == null ? other.getKeyver() == null : this.getKeyver().equals(other.getKeyver()))
            && (this.getComputtag() == null ? other.getComputtag() == null : this.getComputtag().equals(other.getComputtag()))
            && (this.getRandom2() == null ? other.getRandom2() == null : this.getRandom2().equals(other.getRandom2()))
            && (this.getMac2() == null ? other.getMac2() == null : this.getMac2().equals(other.getMac2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTraceid() == null) ? 0 : getTraceid().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getSettleflag() == null) ? 0 : getSettleflag().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getOpdt() == null) ? 0 : getOpdt().hashCode());
        result = prime * result + ((getBuscode() == null) ? 0 : getBuscode().hashCode());
        result = prime * result + ((getCardasn() == null) ? 0 : getCardasn().hashCode());
        result = prime * result + ((getMerid() == null) ? 0 : getMerid().hashCode());
        result = prime * result + ((getCitycode() == null) ? 0 : getCitycode().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getPlanid() == null) ? 0 : getPlanid().hashCode());
        result = prime * result + ((getElectrsaveopcount() == null) ? 0 : getElectrsaveopcount().hashCode());
        result = prime * result + ((getRpid() == null) ? 0 : getRpid().hashCode());
        result = prime * result + ((getRetmsg() == null) ? 0 : getRetmsg().hashCode());
        result = prime * result + ((getCardfee() == null) ? 0 : getCardfee().hashCode());
        result = prime * result + ((getRechargeway() == null) ? 0 : getRechargeway().hashCode());
        result = prime * result + ((getGoodsid() == null) ? 0 : getGoodsid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getOrderdate() == null) ? 0 : getOrderdate().hashCode());
        result = prime * result + ((getTradeno() == null) ? 0 : getTradeno().hashCode());
        result = prime * result + ((getTac() == null) ? 0 : getTac().hashCode());
        result = prime * result + ((getBanktrace() == null) ? 0 : getBanktrace().hashCode());
        result = prime * result + ((getStldate() == null) ? 0 : getStldate().hashCode());
        result = prime * result + ((getTranscode() == null) ? 0 : getTranscode().hashCode());
        result = prime * result + ((getMercheck() == null) ? 0 : getMercheck().hashCode());
        result = prime * result + ((getBankcheck() == null) ? 0 : getBankcheck().hashCode());
        result = prime * result + ((getModtime() == null) ? 0 : getModtime().hashCode());
        result = prime * result + ((getCardtype() == null) ? 0 : getCardtype().hashCode());
        result = prime * result + ((getBankmerid() == null) ? 0 : getBankmerid().hashCode());
        result = prime * result + ((getMbtradenum() == null) ? 0 : getMbtradenum().hashCode());
        result = prime * result + ((getIntime() == null) ? 0 : getIntime().hashCode());
        result = prime * result + ((getMac1() == null) ? 0 : getMac1().hashCode());
        result = prime * result + ((getRandom() == null) ? 0 : getRandom().hashCode());
        result = prime * result + ((getKeyver() == null) ? 0 : getKeyver().hashCode());
        result = prime * result + ((getComputtag() == null) ? 0 : getComputtag().hashCode());
        result = prime * result + ((getRandom2() == null) ? 0 : getRandom2().hashCode());
        result = prime * result + ((getMac2() == null) ? 0 : getMac2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", traceid=").append(traceid);
        sb.append(", state=").append(state);
        sb.append(", settleflag=").append(settleflag);
        sb.append(", balance=").append(balance);
        sb.append(", opdt=").append(opdt);
        sb.append(", buscode=").append(buscode);
        sb.append(", cardasn=").append(cardasn);
        sb.append(", merid=").append(merid);
        sb.append(", citycode=").append(citycode);
        sb.append(", mobile=").append(mobile);
        sb.append(", planid=").append(planid);
        sb.append(", electrsaveopcount=").append(electrsaveopcount);
        sb.append(", rpid=").append(rpid);
        sb.append(", retmsg=").append(retmsg);
        sb.append(", cardfee=").append(cardfee);
        sb.append(", rechargeway=").append(rechargeway);
        sb.append(", goodsid=").append(goodsid);
        sb.append(", orderid=").append(orderid);
        sb.append(", orderdate=").append(orderdate);
        sb.append(", tradeno=").append(tradeno);
        sb.append(", tac=").append(tac);
        sb.append(", banktrace=").append(banktrace);
        sb.append(", stldate=").append(stldate);
        sb.append(", transcode=").append(transcode);
        sb.append(", mercheck=").append(mercheck);
        sb.append(", bankcheck=").append(bankcheck);
        sb.append(", modtime=").append(modtime);
        sb.append(", cardtype=").append(cardtype);
        sb.append(", bankmerid=").append(bankmerid);
        sb.append(", mbtradenum=").append(mbtradenum);
        sb.append(", intime=").append(intime);
        sb.append(", mac1=").append(mac1);
        sb.append(", random=").append(random);
        sb.append(", keyver=").append(keyver);
        sb.append(", computtag=").append(computtag);
        sb.append(", random2=").append(random2);
        sb.append(", mac2=").append(mac2);
        sb.append("]");
        return sb.toString();
    }
}